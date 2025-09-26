package edu.iesam.studentplayground

import edu.iesam.studentplayground.features.students.domain.SaveStudentUseCase
import edu.iesam.studentplayground.features.students.domain.Student
import edu.iesam.studentplayground.features.students.domain.StudentRepository
import io.mockk.mockk
import io.mockk.verify
import org.junit.Test

class SaveStudentUseCaseTest {

    /*
    * when ...... then .....
    * */

    @Test
    fun `when invoke then save student`() {
        // Given
        val studentRepositoryMock = mockk<StudentRepository>(relaxed = true)
        val SaveStudentUseCase = SaveStudentUseCase(studentRepository = studentRepositoryMock)
        val student = Student("1", "name")

        // When

        SaveStudentUseCase.invoke(student)


        // Then
        verify { studentRepositoryMock.save(student = student) }

    }

}