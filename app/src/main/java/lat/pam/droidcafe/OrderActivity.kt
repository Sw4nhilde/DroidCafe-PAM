package lat.pam.droidcafe

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.view.View
import android.widget.AdapterView
import android.widget.RadioButton
import android.widget.Toast
// import android.widget.ArrayAdapter // This import is not used, can be removed.

class OrderActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_order)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    // Move the override functions outside of onCreate
    override fun onItemSelected(parent: AdapterView<*>, view: View?, pos: Int, id: Long) {
        val selectedCity = parent.getItemAtPosition(pos).toString()
        // You can add a Toast here if you want
        // displayToast("City selected: $selectedCity")
    }

    override fun onNothingSelected(parent: AdapterView<*>) {
        // Nothing needs to be done here
    }

    fun onRadioButtonClicked(view: View) {
        // Is the button now checked?
        val checked = (view as RadioButton).isChecked
        when (view.getId()) {
            R.id.sameday -> if (checked)  // Same day service
                displayToast(getString(R.string.same_day_messenger_service))

            R.id.nextday -> if (checked)  // Next day delivery
                displayToast(getString(R.string.next_day_ground_delivery))

            R.id.pickup -> if (checked)  // Pick up
                displayToast(getString(R.string.pick_up))

            else -> {}
        }
    }

    private fun displayToast(message: String) {
        Toast.makeText(
            applicationContext, message,
            Toast.LENGTH_SHORT
        ).show()
    }
}
