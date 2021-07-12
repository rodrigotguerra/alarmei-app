package com.rodrigotguerra.alarmei.home

interface HomeContract {

    interface IHomeView {

    }

    interface IHomePresenter {
        fun onViewDestroyed()
    }

}