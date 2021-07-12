package com.rodrigotguerra.alarmei.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rodrigotguerra.alarmei.R

class HomeActivity : AppCompatActivity(), HomeContract.IHomeView {

    private lateinit var presenter: HomeContract.IHomePresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        presenter = HomePresenter(this)

    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.onViewDestroyed()
    }
}