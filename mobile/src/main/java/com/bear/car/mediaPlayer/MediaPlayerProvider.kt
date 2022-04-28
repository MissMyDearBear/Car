package com.bear.car.mediaPlayer

import com.bear.car.mediaPlayer.interfaces.MediaPlayer

class MediaPlayerProvider {

    private val DEFAULT_KEY = "com.bear.car.media.player"

    interface PlayerFactory {
        fun <T : MediaPlayer>create(clazz: Class<T>):T
    }



}