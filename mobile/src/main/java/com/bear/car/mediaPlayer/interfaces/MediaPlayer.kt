package com.bear.car.mediaPlayer.interfaces

interface MediaPlayer {
    //播放
    fun play(path: String)

    //暂停
    fun pause()

    //恢复
    fun resume()

    //释放资源
    fun release()

    /**
     * 快进
     * @param times 倍数
     */
    fun forward(times: Double)

    /**
     * 快退
     * @param times 倍数
     */
    fun back(times: Double)
}