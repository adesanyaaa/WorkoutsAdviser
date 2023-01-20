package com.adesoftware.workoutsadviser

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.adesoftware.workoutsadviser.databinding.ActivityFindWorkoutBinding

class FindWorkoutActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFindWorkoutBinding
    private lateinit var expert: WorkoutExpert

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFindWorkoutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnFindWorkout.setOnClickListener {
            binding.apply {
                tvWorkout
                spWorkout
                expert = WorkoutExpert()
                val workout: String = java.lang.String.valueOf(spWorkout.selectedItem)
                val workoutList: List<String> = expert.getWorkouts(workout)

                val workoutFormat = StringBuilder()
                for (work in workoutList) {
                    workoutFormat.append(work).append('\n')
                }
                tvWorkout.text = workoutFormat
            }
        }
    }


}