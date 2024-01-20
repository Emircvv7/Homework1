package com.example.homework_1.view

import com.example.homework_1.model.CounterModel
class Presenter(private var view: CounterView) {

   private var model = CounterModel ()

    fun increment() {
        model.increment()
        when (model.number) {
            10 -> view.showToast()
            15 -> view.changeTextColor()
            else -> view.showNewCount(model.number)
        }
    }

    fun decrement() {
        model.decrement()
        view.showNewCount(model.number)
    }

}