package com.example.jurneyandroiddevelopment.Implicit

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import com.example.jurneyandroiddevelopment.R
import com.example.jurneyandroiddevelopment.databinding.ActivityImplicitBinding

class ImplicitActivity : AppCompatActivity() {
    private lateinit var binding: ActivityImplicitBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityImplicitBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btUrl.setOnClickListener {
            val url = "https://www.youtube.com/watch?v=OWBmnv8lrPM"
            val openUrl = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(openUrl)
        }

        binding.btEmail.setOnClickListener {
            val penerima = "muhkelvin36@gmail.com"
            val openEmail = Intent(Intent.ACTION_SENDTO)
            openEmail.setData(Uri.parse("mailto:$penerima"))
            startActivity(openEmail)
        }

//        binding.btPoto.setOnClickListener {
//            val ambilPoto = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
//            startActivity(ambilPoto, CAMERA_SERVICE)
//        }

        binding.btSms.setOnClickListener {
            val nomorTujuan = "089509774146"
            val openSms = Intent(Intent.ACTION_SENDTO)
            openSms.setData(Uri.parse("sms:$nomorTujuan"))
            startActivity(openSms)
        }
    }
}