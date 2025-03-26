import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.skipline.shared.Validator

class MainActivity : AppCompatActivity() {

    private val validator = Validator()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val emailEditText = findViewById<EditText>(R.id.emailEditText)
        val passwordEditText = findViewById<EditText>(R.id.passwordEditText)
        val validateButton = findViewById<Button>(R.id.validateButton)

        validateButton.setOnClickListener {
            val email = emailEditText.text.toString()
            val password = passwordEditText.text.toString()

            val isEmailValid = validator.validateEmail(email)
            val isPasswordValid = validator.validatePassword(password)

            Toast.makeText(
                this,
                if (isEmailValid && isPasswordValid) "Valid" else "Invalid",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}
