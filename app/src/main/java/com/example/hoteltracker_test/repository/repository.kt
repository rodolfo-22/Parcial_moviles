package com.example.hoteltracker_test.repository

import com.example.hoteltracker_test.data.model.HotelModel

class repository (private val hotels: MutableList<HotelModel>){
    fun getHotels() = hotels
}

