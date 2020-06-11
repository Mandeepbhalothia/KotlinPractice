package com.mandeep.kotlinpractice

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.item_main_recycler.view.*

class StudentAdapter : RecyclerView.Adapter<StudentAdapter.StudentViewHolder>() {


    private var studentList : ArrayList<Student> = ArrayList()

    class StudentViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val titleTv : TextView = itemView.titleTv
        private val descriptionTv : TextView = itemView.descTv
        private val headerIv : ImageView = itemView.headerIv

        fun bind(student: Student){
            titleTv.text = student.title
            descriptionTv.text = student.description

            val requestOption = RequestOptions()
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_background)

            Glide.with(itemView.context)
                .applyDefaultRequestOptions(requestOption)
                .load(student.image)
                .into(headerIv)

        }
    }

    fun submitData(studentList: ArrayList<Student>){
        this.studentList = studentList
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_main_recycler,parent,false)
        return StudentViewHolder(view)
    }

    override fun getItemCount(): Int {
        return studentList.size
    }

    override fun onBindViewHolder(holder: StudentViewHolder, position: Int) {
        val student = studentList[position]
        holder.bind(student)
    }
}

