package com.rodrigotguerra.alarmei.home

class HomePresenter(private var homeView: HomeContract.IHomeView?) : HomeContract.IHomePresenter {

    override fun onViewDestroyed() {
        homeView = null
    }
}