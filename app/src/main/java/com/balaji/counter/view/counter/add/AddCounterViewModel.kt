package com.balaji.counter.view.counter.add

import androidx.navigation.NavController

class AddCounterViewModel(repository: AddCounterRepository) {

    val mRepository: AddCounterRepository

    init {
        mRepository = repository
    }

    fun insert(navController: NavController) {
        mRepository.insert(navController)
    }

}