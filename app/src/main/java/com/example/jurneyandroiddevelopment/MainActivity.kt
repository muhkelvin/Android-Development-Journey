package com.example.jurneyandroiddevelopment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.jurneyandroiddevelopment.Excplicit.ExcplicitActivity
import com.example.jurneyandroiddevelopment.Excplicit.Student
import com.example.jurneyandroiddevelopment.Fragment.FragmentActivity
import com.example.jurneyandroiddevelopment.Implicit.ImplicitActivity
import com.example.jurneyandroiddevelopment.NavComponent.NavActivity
import com.example.jurneyandroiddevelopment.Recipe.BankFragment
import com.example.jurneyandroiddevelopment.Recipe.RecipeActivity
import com.example.jurneyandroiddevelopment.RecycleView.RecycleActivity
import com.example.jurneyandroiddevelopment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btExcplicit.setOnClickListener {
            val pindahExcplicit = Intent(this@MainActivity,ExcplicitActivity::class.java)
//            pindahExcplicit.putExtra("name","Kiriyama")
            pindahExcplicit.putExtra("student",Student("Kiriyama","12345"))
            startActivity(pindahExcplicit)
        }

        binding.btImplicit.setOnClickListener {
            val pindahImplicit = Intent(this@MainActivity,ImplicitActivity::class.java)
            startActivity(pindahImplicit)
        }

        binding.recycle.setOnClickListener {
            val pindahRecycle = Intent(this@MainActivity,RecycleActivity::class.java)
            startActivity(pindahRecycle)
        }

        binding.btFragment.setOnClickListener {
            startActivity(Intent(this@MainActivity,FragmentActivity::class.java))
        }

        binding.btNavcomponent.setOnClickListener {
            startActivity(Intent(this@MainActivity,NavActivity::class.java))
        }

        binding.btRecipe.setOnClickListener {
            startActivity(Intent(this@MainActivity,RecipeActivity::class.java))
        }


    }
}