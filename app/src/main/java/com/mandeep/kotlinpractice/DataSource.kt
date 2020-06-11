package com.mandeep.kotlinpractice

class DataSource {

    companion object {
        fun createDataSet() : ArrayList<Student> {
            val list =  ArrayList<Student>()

            list.add(
                Student("Congratulations!",
                    "You made it to the end of the course!\r\n\r\nNext we'll be building the REST API!",
                    "https://raw.githubusercontent.com/mitchtabian/Blog-Images/master/digital_ocean.png")
            )
            list.add(
                Student("Congratulations!",
                    "You made it to the end of the course!\r\n\r\nNext we'll be building the REST API!",
                    "https://raw.githubusercontent.com/mitchtabian/Kotlin-RecyclerView-Example/json-data-source/app/src/main/res/drawable/time_to_build_a_kotlin_app.png")
            )
            list.add(
                Student("Congratulations!",
                    "You made it to the end of the course!\r\n\r\nNext we'll be building the REST API!",
                    "https://raw.githubusercontent.com/mitchtabian/Kotlin-RecyclerView-Example/json-data-source/app/src/main/res/drawable/coding_for_entrepreneurs.png")
            )
            list.add(
                Student("Congratulations!",
                    "You made it to the end of the course!\r\n\r\nNext we'll be building the REST API!",
                    "https://raw.githubusercontent.com/mitchtabian/Blog-Images/master/digital_ocean.png")
            )
            list.add(
                Student("Congratulations!",
                    "You made it to the end of the course!\r\n\r\nNext we'll be building the REST API!",
                    "https://raw.githubusercontent.com/mitchtabian/Blog-Images/master/digital_ocean.png")
            )
            list.add(
                Student("Congratulations!",
                    "You made it to the end of the course!\r\n\r\nNext we'll be building the REST API!",
                    "https://raw.githubusercontent.com/mitchtabian/Blog-Images/master/digital_ocean.png")
            )
            list.add(
                Student("Congratulations!",
                    "You made it to the end of the course!\r\n\r\nNext we'll be building the REST API!",
                    "https://raw.githubusercontent.com/mitchtabian/Blog-Images/master/digital_ocean.png")
            )

            return list
        }
    }

}