package com.miaomiao.core.base

import androidx.appcompat.app.AppCompatActivity
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.cancel

/**
 * @Author: xyc
 * @Date: 2020/10/15 9:02 PM
 * @Description:
 * @Last Modified by:
 * @Last Modified time:
 */
class BaseActivity : AppCompatActivity(), CoroutineScope by MainScope() {

    override fun onDestroy() {
        super.onDestroy()
        cancel()
    }
}