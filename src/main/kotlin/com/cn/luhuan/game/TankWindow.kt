package com.cn.luhuan.game

import com.cn.luhuan.engine.Composer
import com.cn.luhuan.engine.Painter
import com.cn.luhuan.engine.Window
import javafx.scene.input.KeyCode
import javafx.scene.input.KeyEvent
import javafx.scene.paint.Color

class TankWindow: Window("坦克大战1.0","icon/logo.png",Config.GAME_WIDTH,Config.GAME_HEIGHT) {
    override fun onCreate() {
//        println("窗体创建")
    }

    override fun onDisplay() {
//        println("窗体渲染时的回调，不停的执行")
    }

    override fun onRefresh() {
//        println("刷新，做逻辑业务，做耗时操作")
    }

    override fun onKeyPressed(event: KeyEvent) {
//        println("按钮事件的响应")
    }
}

