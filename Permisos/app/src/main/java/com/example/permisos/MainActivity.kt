package com.example.permisos

import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.Manifest
import android.widget.Toast
import android.app.AlertDialog
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat

private val TAG="Permisos Practica 4"
private val  CODIGOSOLICITUDGRABAR=101
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        configurarPermisos()
    }
    private fun configurarPermisos(){
        val permisos=ContextCompat.checkSelfPermission(this, Manifest.permission.RECORD_AUDIO)
        if(permisos!=PackageManager.PERMISSION_GRANTED){
            Log.i(TAG,"Permiso par agrabar denegado")
            if(ActivityCompat.shouldShowRequestPermissionRationale(this,android.Manifest.permission.RECORD_AUDIO)){
                val builder =AlertDialog.Builder(this)
                builder.setMessage("Permisos para acceder el microfono es requerido para grabar audio.").setTitle("Permission Requeried")
                builder.setPositiveButton("Ok"){dialog,id->Log.i(TAG, "Seleccionado")
                    hacerSolicitud()
                }
                val dialog=builder.create()
                dialog.show()
            }else{
                hacerSolicitud()
            }
        }
    }
    private fun hacerSolicitud(){
        ActivityCompat.requestPermissions(this, arrayOf(android.Manifest.permission.RECORD_AUDIO),
            CODIGOSOLICITUDGRABAR)
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        when(requestCode){
            CODIGOSOLICITUDGRABAR->{
                if(grantResults.isEmpty()||grantResults[0]!=PackageManager.PERMISSION_GRANTED){
                    Log.i(TAG,"Permisos a sido denegado por el usuario")
                    Toast.makeText(applicationContext, "Permiso a sido denegado por el usuario", Toast.LENGTH_SHORT).show()
                }else{
                    Log.i(TAG,"Permisos a sido concedido por el usuario")
                    Toast.makeText(applicationContext, "Permiso a sido concedido por el usuario", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}