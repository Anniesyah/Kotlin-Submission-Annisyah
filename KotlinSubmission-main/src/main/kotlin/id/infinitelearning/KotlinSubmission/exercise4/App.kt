package id.infinitelearning.KotlinSubmission.exercise4

fun main() {

    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    fun main() {
        val skzMembers = listOf("Bang Chan", "Lee Know", "Changbin", "Hyunjin", "Han", "Felix", "Seungmin", "I.N")

        try {
            val index = 8 // Replace with the desired index to access an SKZ member from the list
            val selectedMember = skzMembers[index]
            println("The selected SKZ member is: $selectedMember")
        } catch (e: IndexOutOfBoundsException) {
            println("Oops! The SKZ member index is out of bounds.")
            // Handle the exception or provide an alternative action here
        }
    }


}