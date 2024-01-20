package com.example.homework_1.view

import android.graphics.Color
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.homework_1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), CounterView {
   private lateinit var binding: ActivityMainBinding
      private var presenter = Presenter(this)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initClickers()
    }

    private fun initClickers() {
        with(binding) {
            incrementBtn.setOnClickListener {
               presenter.increment()
            }

            decrementBtn.setOnClickListener {
                presenter.decrement()
            }
        }
    }

    override fun showNewCount(number: Int) {
        binding.resultTv.text = number.toString()
    }

    override fun showToast() {
        Toast.makeText(this, "Поздравляем!", Toast.LENGTH_SHORT).show()
    }

    override fun changeTextColor() {
        binding.resultTv.setTextColor(Color.GREEN)
    }
}