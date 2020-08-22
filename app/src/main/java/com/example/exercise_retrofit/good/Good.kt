package com.example.exercise_retrofit.good

class Good(
    var id: String = "",
    var name: String = "",
    var type: String = "")

class ResponseData(
    var status: String = "",
    var message: String = "",
    var result: Any
)
