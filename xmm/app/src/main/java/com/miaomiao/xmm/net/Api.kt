package com.miaomiao.xmm.net

import retrofit2.http.GET

/**
 * @Author: xyc
 * @Date: 2020/10/16 8:43 PM
 * @Description:
 * @Last Modified by:
 * @Last Modified time:
 */
interface Api {
    @GET("api/4/news/latest")
    suspend fun getLatestNews2(): String
}