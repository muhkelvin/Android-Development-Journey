package com.example.jurneyandroiddevelopment.Recipe.adapter

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class RecipeModel(
    val id:Int,
    val label:String,
    val value:String,
//    val status:String,
//    val idTransaksi:Int,
//    val noSyariah:String,
//    val namaPenerima:String,
//    val noPenerima:Int,
//    val namaPengirim:String,
//    val noPengirim:Int,
//    val waktuTransaksi:String,
//    val jumlah:String?,
//    val biayaLanggana:String?,
//    val total:String?
):Parcelable