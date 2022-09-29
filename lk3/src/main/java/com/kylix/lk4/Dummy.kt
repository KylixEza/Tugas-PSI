package com.kylix.lk4

object Dummy {
    
    //create dummies data of assignment that contains subject of math, science, and english with related description
    fun getAssignments(): List<AssignmentDTO> = listOf(
            AssignmentDTO(
                "Math Assignment",
                "Math",
                "Solve the following equation: 2x + 3 = 5",
                1
            ),
            AssignmentDTO(
                "Science Assignment",
                "Science",
                "Describe the process of photosynthesis",
                2
            ),
            AssignmentDTO(
                "English Assignment",
                "English",
                "Write a short story about your favorite food",
                3
            ),
            AssignmentDTO(
                "Math Assignment",
                "Math",
                "Solve the following equation: 2x + 3 = 5",
                1
            ),
            AssignmentDTO(
                "Science Assignment",
                "Science",
                "Describe the process of photosynthesis",
                2
            ),
            AssignmentDTO(
                "English Assignment",
                "English",
                "Write a short story about your favorite food",
                3
            ),
            AssignmentDTO(
                "Math Assignment",
                "Math",
                "Solve the following equation: 2x + 3 = 5",
                1
            ),
            AssignmentDTO(
                "Science Assignment",
                "Science",
                "Describe the process of photosynthesis",
                2
            ),
            AssignmentDTO(
                "English Assignment",
                "English",
                "Write a short story about your favorite food",
                3
            ),
            AssignmentDTO(
                "Math Assignment",
                "Math",
                "Solve the following equation: 2x + 3 = 5",
                1
            ),
            AssignmentDTO(
                "Science Assignment",
                "Science",
                "Describe the process of photosynthesis",
                2
            ),
            AssignmentDTO(
                "English Assignment",
                "English",
                "Write a short story about your favorite food",
                3
            ),
            AssignmentDTO(
                "Math Assignment",
                "Math",
                "Solve the following equation: 2x + 3 = 5",
                1
            ),
            AssignmentDTO(
                "Science Assignment",
                "Science",
                "Describe the process of photosynthesis",
                2
            ),
            AssignmentDTO(
                "English Assignment",
                "English",
                "Write a short story about your favorite food",
                3
            )
    )
    
    //create dummies data that returns List<ClassDTO>
    fun getClasses() = listOf<ClassDTO>(
        ClassDTO(
            "Math",
            "Square and Rectangle",
            "Mr. John",
            "3 Oct",
            "15:00 PM"
        ),
        ClassDTO(
            "Science",
            "Photosynthesis",
            "Mr. Garry",
            "4 Oct",
            "08:00 AM"
        ),
        ClassDTO(
            "English",
            "Short Story",
            "Mrs. Nays",
            "5 Oct",
            "13:00 PM"
        ),
        ClassDTO(
            "Art",
            "Drawing",
            "Mr. John",
            "6 Oct",
            "12:00 PM"
        ),
    )
    
    
}