package com.example.c36a.repository

import com.example.c36a.model.ProductModel
import com.google.firebase.database.FirebaseDatabase

class ProductRepositoryImpl : ProductRepository {

    val database = FirebaseDatabase.getInstance()
    val ref = database.reference.child("products")

    override fun addProduct(
        model: ProductModel,
        callback: (Boolean, String) -> Unit
    ) {
        val id = ref.push().key.toString()
        model.productId = id
        ref.child(model.productId).setValue(model).addOnCompleteListener {
            if(it.isSuccessful){
                callback(true,"product added successfully")
            }else{
                callback(false,"${it.exception?.message}")

            }
        }
    }

    //Create - setValue()
    //Update - updateChildren()
    //Delete - removeValue()
    override fun updateProduct(
        productId: String,
        data: MutableMap<String, Any?>,
        callback: (Boolean, String) -> Unit
    ) {
        ref.child(productId).updateChildren(data).addOnCompleteListener {
            if(it.isSuccessful){
                callback(true,"product updated successfully")
            }else{
                callback(false,"${it.exception?.message}")

            }
        }
    }

    override fun deleteProduct(
        productId: String,
        callback: (Boolean, String) -> Unit
    ) {
        ref.child(productId).removeValue().addOnCompleteListener {
            if(it.isSuccessful){
                callback(true,"product deleted successfully")
            }else{
                callback(false,"${it.exception?.message}")

            }
        }
    }

    override fun getProductById(
        productId: String,
        callback: (Boolean, String, ProductModel?) -> Unit
    ) {
        TODO("Not yet implemented")
    }

    override fun getAllProduct(callback: (Boolean, String, List<ProductModel?>) -> Unit) {
        TODO("Not yet implemented")
    }
}