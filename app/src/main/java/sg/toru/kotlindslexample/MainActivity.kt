package sg.toru.kotlindslexample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import sg.toru.kotlindslexample.model.Person
import sg.toru.kotlindslexample.model.address
import sg.toru.kotlindslexample.model.person
import sg.toru.kotlindslexample.model.person2

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val person = person2 {
            it.firstName = "toru"
            it.lastName = "choi"
            it.city = "Singapore"
            it.nationality = "South Korean"
        }

        val person2 = person {
            firstName = "Toru"
            lastName = "Choi"
            nationality = "South Korea"
            city = "Singapore"
            address {
                street1 = "Central"
                street2 = "Toa Payoh"
                blockName = "Blk 405"
                unitNumber = "#42-130"
                postalCode = "123456"
            }
        }
    }
}