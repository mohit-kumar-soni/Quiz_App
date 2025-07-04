package com.java.myquizapp

object Constants {

    const val USER_NAME : String ="user_name"
    const val TOTAL_QUESTION :String ="total_question"
    const val CORRECT_ANSWER :String = "correct_answer"

    fun getQuestion() : ArrayList<Question> {
        val questionList = ArrayList<Question>()

        val que1 = Question(
            1, "What country does this flag belong to?",
            R.drawable.india,
            "America", "Australia",
            "India", "China",
            3
        )
        questionList.add(que1)

        val que2 = Question(
            2, "What country does this flag belong to?",
            R.drawable.america,
            "America", "Australia",
            "India", "China",
            1
        )
        questionList.add(que2)

        val que3 = Question(
            3, "What country does this flag belong to?",
            R.drawable.japan,
            "China", "Australia",
            "India", "Japan",
            4
        )
        questionList.add(que3)

        val que4 = Question(
            4, "What country does this flag belong to?",
            R.drawable.south_africa,
            "South Africa", "Australia",
            "India", "None of these",
            1
        )
        questionList.add(que4)

        val que5 = Question(
            5, "What country does this flag belong to?",
            R.drawable.australia,
            "Brazil", "Australia",
            "India", "Mexico",
            2
        )
        questionList.add(que5)

        val que6 = Question(
            6, "What country does this flag belong to?",
            R.drawable.canada,
            "America", "Mexico",
            "canada", "China",
            3
        )
        questionList.add(que6)

        val que7 = Question(
            7, "What country does this flag belong to?",
            R.drawable.south_korea,
            "Nepal", "South Korea",
            "Russia", "None of these",
            2
        )
        questionList.add(que7)

        val que8 = Question(
            8, "What country does this flag belong to?",
            R.drawable.mexico,
            "Bhutan", "Australia",
            "India", "Mexico",
            4
        )
        questionList.add(que8)

        val que9 = Question(
            9,"What country does this flag belong to?",
            R.drawable.philippines,
            "Philippines", "Australia",
            "Japan", "None of these",
            1
        )
        questionList.add(que9)

        val que10 = Question(
            10,"What country does this flag belong to?",
            R.drawable.maldives,
            "Russia","Nepal",
            "Bhutan","Maldives",
            4
        )
        questionList.add(que10)

        val que11 = Question(
            11,"What country does this flag belong to?",
            R.drawable.israeli,
            "Russia","Israeli",
            "Germany","Italy",
            2
        )
        questionList.add(que11)

        val que12 = Question(
            12,"What country does this flag belong to?",
            R.drawable.kazakhstan,
            "kazakhstan","Israeli",
            "Canada","South Korea",
            1
        )
        questionList.add(que12)

        val que13 = Question(
            13,"What country does this flag belong to?",
            R.drawable.greek,
            "France","Israeli",
            "Greek","Brazil",
            3
        )
        questionList.add(que13)

        val que14 = Question(
            14,"What country does this flag belong to?",
            R.drawable.egypt,
            "France","Greek",
            "Spain","Egypt",
            4
        )
        questionList.add(que14)

        val que15 = Question(
            15,"What country does this flag belong to?",
            R.drawable.england,
            "NewZealand","England",
            "Australia","America",
            2
        )
        questionList.add(que15)

        val que16 = Question(
            16,"What country does this flag belong to?",
            R.drawable.uganda,
            "Denmark"," Venezuela",
            "Uganda","Spain",
            3
        )
        questionList.add(que16)

        val que17 = Question(
            17,"What country does this flag belong to?",
            R.drawable.denmark,
            "Denmark"," Iran",
            "Uganda","Sweden",
            1
        )
        questionList.add(que17)

        val que18 = Question(
            18,"What country does this flag belong to?",
            R.drawable.hong_kong,
            "Qatar","Bahrain",
            "Hong Kong","Sweden",
            3
        )
        questionList.add(que18)

        val que19 = Question(
            19,"What country does this flag belong to?",
            R.drawable.bangladesh,
            "Pakistan","Iran",
            "Uzbekistan","Bangladesh",
            4
        )
        questionList.add(que19)

        val que20 = Question(
            20,"What country does this flag belong to?",
            R.drawable.france,
            "France","italy",
            "Germany","Romania",
            1
        )
        questionList.add(que20)

        val que21 = Question(
            21,"What country does this flag belong to?",
            R.drawable.indonesia,
            "Moldova","indonesia",
            "Portugal","Romania",
            2
        )
        questionList.add(que21)

        val que22 = Question(
            22,"What country does this flag belong to?",
            R.drawable.portugal,
            "Moldova","indonesia",
            "Portugal","None Of These",
            3
        )
        questionList.add(que22)

        val que23 = Question(
            23,"What country does this flag belong to?",
            R.drawable.germany,
            "New Zealand","France",
            "Italy","Germany",
            4
        )
        questionList.add(que23)

        val que24 = Question(
            24,"What country does this flag belong to?",
            R.drawable.netherlands,
            "Netherlands","Denmark",
            "Mexico","Panama",
            1
        )
        questionList.add(que24)

        val que25 = Question(
            25,"What country does this flag belong to?",
            R.drawable.taiwan,
            "Denmark","Taiwan",
            "Brunei","Morocco",
            2
        )
        questionList.add(que25)

        return questionList


    }
    }