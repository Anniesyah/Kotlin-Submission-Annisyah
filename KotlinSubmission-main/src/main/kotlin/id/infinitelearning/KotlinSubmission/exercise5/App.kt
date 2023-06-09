package id.infinitelearning.KotlinSubmission.exercise5

fun main() {

    /**
     * Latihan 1
     * Buat variable dengan nama hero dibawah ini dan isi nilai variable tersebut dengan class Hero
     *
     */
    class Hero(val name: String, val power: String)

    fun main() {
        val myHero: Hero = Hero("Bakugou Katsuki", "Explosion")
        println("My hero is ${myHero.name}. Their power is ${myHero.power}.")
    }



    /**
     * Latihan 2
     * Set data profile dengan memanggil fungsi setProfile() dibawah ini
     * Dan isi argumen-argumen / data dari parameter sesuai data diri Anda (Name, Age, Height)
     *
     */
    data class Profile(val name: String, val age: Int, val height: Double)

    fun setProfile(name: String, age: Int, height: Double) {
        val profile = Profile(name, age, height)
        println("Profile set successfully:\nName: ${profile.name}\nAge: ${profile.age}\nHeight: ${profile.height} cm")
    }

    fun main() {
        val myName = "Annisyah Ariesa Zahra"
        val myAge = 21
        val myHeight = 163

        setProfile(myName, myAge, myHeight)
    }



    /**
     * Latihan 3
     * Tampilkan data profile dibawah ini, sebelum melakukan aktivitas
     *
     */
    data class Profile(val name: String, val age: Int, val height: Double)

    fun showProfile(profile: Profile) {
        println("Profile Data:")
        println("Name: ${profile.name}")
        println("Age: ${profile.age}")
        println("Height: ${profile.height} cm")
    }

    fun main() {
        val myProfile = Profile("Annisyah Ariesa Zahra", 21, 163)

        showProfile(myProfile)

        // Perform the activity here
        println("Doing the activity...")
    }



    /**
    Challenge:
    Group 1: jalan 5x, lari 2x, makan 3x, minum 1x, lompat 3x, duduk 1x
    Group 2: jalan 2x, lari 2x, makan 1x, minum 3x, lompat 1x, duduk 2x
    Group 3: jalan 3x, lari 1x, makan 5x, minum 1x, lompat 5x, duduk 3x
    Group 4: jalan 5x, lari 4x, makan 4x, minum 4x, lompat 3x, duduk 2x
    Group 5: jalan 4x, lari 1x, makan 3x, minum 5x, lompat 5x, duduk 3x
    Group 6: jalan 2x, lari 4x, makan 2x, minum 2x, lompat 7x, duduk 4x
    **/

    /**
     * Latihan 4
     * Jalankan aktivitas-aktivitas dengan memanggil fungsi-fungsi sesuai challenge diatas
     *
     */
    fun jalan() {
        println("Jalan...")
    }

    fun lari() {
        println("Lari...")
    }

    fun makan() {
        println("Makan...")
    }

    fun minum() {
        println("Minum...")
    }

    fun lompat() {
        println("Lompat...")
    }

    fun duduk() {
        println("Duduk...")
    }

    fun main() {
        // Group 1 activities
        repeat(5) {
            jalan()
        }
        repeat(2) {
            lari()
        }
        repeat(3) {
            makan()
        }
        repeat(1) {
            minum()
        }
        repeat(3) {
            lompat()
        }
        repeat(1) {
            duduk()
        }

        // Group 2 activities
        repeat(2) {
            jalan()
        }
        repeat(2) {
            lari()
        }
        repeat(1) {
            makan()
        }
        repeat(3) {
            minum()
        }
        repeat(1) {
            lompat()
        }
        repeat(2) {
            duduk()
        }

        // Group 3 activities
        repeat(3) {
            jalan()
        }
        repeat(1) {
            lari()
        }
        repeat(5) {
            makan()
        }
        repeat(1) {
            minum()
        }
        repeat(5) {
            lompat()
        }
        repeat(3) {
            duduk()
        }

        // Group 4 activities
        repeat(5) {
            jalan()
        }
        repeat(4) {
            lari()
        }
        repeat(4) {
            makan()
        }
        repeat(4) {
            minum()
        }
        repeat(3) {
            lompat()
        }
        repeat(2) {
            duduk()
        }

        // Group 5 activities
        repeat(4) {
            jalan()
        }
        repeat(1) {
            lari()
        }
        repeat(3) {
            makan()
        }
        repeat(5) {
            minum()
        }
        repeat(5) {
            lompat()
        }
        repeat(3) {
            duduk()
        }

        // Group 6 activities
        repeat(2) {
            jalan()
        }
        repeat(4) {
            lari()
        }
        repeat(2) {
            makan()
        }
        repeat(2) {
            minum()
        }
        repeat(7) {
            lompat()
        }
        repeat(4) {
            duduk()
        }
    }



    /**
     * Latihan 5
     * Panggil fungsi profile dibawah ini untuk menampilkan status terkini setelah melakukan aktivitas
     *
     */
    data class Profile(val name: String, var walkCount: Int, var runCount: Int, var eatCount: Int, var drinkCount: Int, var jumpCount: Int, var sitCount: Int)

    fun profile(profile: Profile) {
        println("Current Profile Status:")
        println("Name: ${profile.name}")
        println("Walk Count: ${profile.walkCount}")
        println("Run Count: ${profile.runCount}")
        println("Eat Count: ${profile.eatCount}")
        println("Drink Count: ${profile.drinkCount}")
        println("Jump Count: ${profile.jumpCount}")
        println("Sit Count: ${profile.sitCount}")
    }

    fun walk(profile: Profile) {
        println("Walking...")
        profile.walkCount++
    }

    fun run(profile: Profile) {
        println("Running...")
        profile.runCount++
    }

    fun eat(profile: Profile) {
        println("Eating...")
        profile.eatCount++
    }

    fun drink(profile: Profile) {
        println("Drinking...")
        profile.drinkCount++
    }

    fun jump(profile: Profile) {
        println("Jumping...")
        profile.jumpCount++
    }

    fun sit(profile: Profile) {
        println("Sitting...")
        profile.sitCount++
    }

    fun main() {
        val myProfile = Profile("John Doe", 0, 0, 0, 0, 0, 0)

        walk(myProfile)
        run(myProfile)
        eat(myProfile)
        drink(myProfile)
        jump(myProfile)
        sit(myProfile)

        profile(myProfile)
    }



}