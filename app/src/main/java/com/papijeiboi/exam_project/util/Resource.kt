package com.papijeiboi.exam_project.util

//Class that contains data and status about loading the data
sealed class Resource<T>(val data: T? = null, val error: Throwable? = null) {

    class Success<T>(data: T) : Resource<T>(data)
    class Loading<T>(data: T? = null) : Resource<T>(data)
    class Error<T>(throwable: Throwable, data: T? = null) : Resource<T>(data, throwable)

}