package com.cn.luhuan.business

import com.sun.javafx.scene.traversal.Direction

interface Movable {

    /**
     * 可移动的物体存在方向
     */
    var currentDirection:Direction

    /**
     * 可移动物体存在速度
     */
    var speed:Int

    /**
     * 判断移动物体是否将与阻塞物体发生碰撞
     */
    fun willCollision(block: Blockable):Direction?
}