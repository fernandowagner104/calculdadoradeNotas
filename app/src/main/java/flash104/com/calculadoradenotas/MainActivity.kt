package flash104.com.calculadoradenotas

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnCalculate = findViewById<Button>(R.id.btnCalculate)
        val result = findViewById<TextView>(R.id.txtResult)

        btnCalculate.setOnClickListener {

            val grade1 = Integer.parseInt(findViewById<EditText>(R.id.edtGrade1).text.toString())
            val grade2 = Integer.parseInt(findViewById<EditText>(R.id.edtGrade2).text.toString())
            val average = grade1.plus(grade2).div(2)
            val absent = Integer.parseInt(findViewById<EditText>(R.id.edtAbsent).text.toString())

            if (average >= 6 && absent <= 10 ) {
                result.setText("Aluno foi Aprovado! \n"  + "Nota Final: ${average} \n" + "Faltas: ${absent}" )
                result.setTextColor(Color.GREEN)
            } else {
                result.setText("Aluno foi Reprovado! \n"  + "Nota Final: ${average} \n" + "Faltas: ${absent}" )
                result.setTextColor(Color.RED)
            }

        }
    }
}