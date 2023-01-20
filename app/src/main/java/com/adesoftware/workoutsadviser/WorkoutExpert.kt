package com.adesoftware.workoutsadviser

class WorkoutExpert {
    fun getWorkouts(workoutTypes: String): List<String> {
        val workout: MutableList<String> = ArrayList()
        when (workoutTypes) {
            "Chest" -> {
                workout.add("Bench press")
                workout.add("Cable crossover")
                workout.add("Dip")
                workout.add("Cable chest press")
            }
            "Triceps" -> {
                workout.add("Diamond push up")
                workout.add("Triceps dips")
                workout.add("Triceps pull")
                workout.add("Tate press")
            }
            "Biceps" -> {
                workout.add("Biceps Curl")
                workout.add("Hammer Curl")
                workout.add("Drag Curl")
                workout.add("Pull-up")
            }
            "Shoulders" -> {
                workout.add("Shoulder stretch")
                workout.add("Overhead press")
                workout.add("Push-up")
                workout.add("Arnold press")
            }
        }
        return workout
    }
}