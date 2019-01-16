package com.example.tnguy.quizlit.Common

import com.example.tnguy.quizlit.Model.Category
import com.example.tnguy.quizlit.Model.CurrentQuestion

import com.example.tnguy.quizlit.Model.Question

object Common {
    val TOTAL_TIME = 20 * 60 * 1000
    var answerSheetList:MutableList<CurrentQuestion> = ArrayList()
    var questionList:MutableList<Question> = ArrayList()
    var selectedCategory: Category?= null

    enum class ANSWER_TYPE{
        NO_ANSWER,
        RIGHT_ANSWER,
        WRONG_ANSWER

    }
}