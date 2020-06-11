package com.mandeep.kotlinpractice

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var studentAdapter: StudentAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initRecyclerView()
        setData()

    }

    private fun setData() {
        val studentList = DataSource.createDataSet()
        studentAdapter.submitData(studentList)
    }

    private fun initRecyclerView() {
        recyclerViewMain.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            studentAdapter = StudentAdapter() // init adapter and assign to var for further use
            adapter = studentAdapter // set adapter
        }
    }

}
