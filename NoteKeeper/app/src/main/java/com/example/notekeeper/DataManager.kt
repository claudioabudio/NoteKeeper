package com.example.notekeeper

class DataManager {
    val courses = HashMap<String, CourseInfo>()
    val notes = ArrayList<NoteInfo>()

    init {
        initializeCourses()
    }

    private fun initializeCourses() {
        var course = CourseInfo("android_intents", "Android programming with intents")
        courses.set(course.courseId, course)

        course = CourseInfo("android_async", "Android async programming and services")
        courses.set(course.courseId, course)

        course = CourseInfo(title = "Java fundamentals, the Java Language", courseId = "java_lang")
        courses.set(course.courseId, course)

        course = CourseInfo("java_core", "Java fundamentals, the Core Platform")
        courses.set(course.courseId, course)
    }
}