package com.example.jurneyandroiddevelopment.Recipe

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.jurneyandroiddevelopment.R
import com.example.jurneyandroiddevelopment.Recipe.adapter.RecipeAdapter
import com.example.jurneyandroiddevelopment.Recipe.adapter.RecipeModel
import com.example.jurneyandroiddevelopment.databinding.FragmentBankBinding

class BankFragment : Fragment() {
    private lateinit var binding:FragmentBankBinding

    private val recipeList:List<RecipeModel> = listOf(
        RecipeModel(
            id = 1,
            label = "Status Transaksi",
            value = "Berhasil!",
        ),
        RecipeModel(
            id = 2,
            label = "ID Transaksi",
            value = "316318793720120",
        ),
        RecipeModel(
            id = 3,
            label = "No Syariah",
            value = "0812918200012",
        ),
        RecipeModel(
            id = 4,
            label = "Nama Penerima",
            value = "St******** So********",
        ),
        RecipeModel(
            id = 5,
            label = "No Penerima",
            value = "0812918200012",
        ),
        RecipeModel(
            id = 6,
            label = "Nama Pengirim",
            value = "Annisa Avrillia",
        ),
        RecipeModel(
            id = 7,
            label = "No Pengirim",
            value = "08119770405",
        ),
        RecipeModel(
            id = 8,
            label = "Waktu Transaksi",
            value = "12 Nov 2022 15:44",
        ),
        RecipeModel(
            id = 9,
            label = "Jumlah",
            value = "Rp 200.000",
        ),
        RecipeModel(
            id = 10,
            label = "Biaya Layanan",
            value = "Rp 0",
        ),
        RecipeModel(
            id = 11,
            label = "TOTAL",
            value = "Rp 200.000",
        ),

        )

    private val adapter by lazy { RecipeAdapter(recipeList) }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentBankBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.rvRecipe.adapter = adapter

        binding.btKembali.setOnClickListener {
            val action = BankFragmentDirections.actionBankFragmentToSyariahFragment()
            view.findNavController().navigate(action)
        }
    }

}