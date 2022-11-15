package com.example.namegenerator.util

enum class Ethnicity(val type: String) {
    ASIAN_AND_PACIFIC_ISLANDER("ASIAN AND PACIFIC ISLANDER"),
    BLACK_NON_HISPANIC("BLACK NON HISPANIC"),
    HISPANIC("HISPANIC"),
    WHITE_NON_HISPANIC("WHITE NON HISPANIC");

    companion object {
        fun from(type: Int) = when(type){
            1-> ASIAN_AND_PACIFIC_ISLANDER
            2-> BLACK_NON_HISPANIC
            3-> HISPANIC
            else -> WHITE_NON_HISPANIC
        }
    }
}