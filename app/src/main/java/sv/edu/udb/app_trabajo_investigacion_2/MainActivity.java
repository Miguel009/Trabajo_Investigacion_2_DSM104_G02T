package sv.edu.udb.app_trabajo_investigacion_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import sv.edu.udb.app_trabajo_investigacion_2.Classes.OperationTypes;
import sv.edu.udb.app_trabajo_investigacion_2.Classes.Operations;
import sv.edu.udb.app_trabajo_investigacion_2.Classes.SolidOperationsClasses.SolidAddition;
import sv.edu.udb.app_trabajo_investigacion_2.Classes.SolidOperationsClasses.SolidDivision;
import sv.edu.udb.app_trabajo_investigacion_2.Classes.SolidOperationsClasses.SolidMultiplication;
import sv.edu.udb.app_trabajo_investigacion_2.Classes.SolidOperationsClasses.SolidSubtraction;

public class MainActivity extends AppCompatActivity {

    Operations Operation = new Operations();
    SolidAddition solidAddition = new SolidAddition();
    SolidSubtraction solidSubtraction = new SolidSubtraction();
    SolidMultiplication solidMultiplication = new SolidMultiplication();
    SolidDivision solidDivision = new SolidDivision();
    TextView tvResult;
    EditText txtNumber1, txtNumber2;
    int number1, number2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtNumber1 = findViewById(R.id.editTextNumber);
        txtNumber2 = findViewById(R.id.editTextNumber2);
        tvResult = findViewById(R.id.tvResult);


    }
    /*Hola en este ejemplo vamos a ver como aplica los:*/

    /*-------------------------PRINCIPIOS SOLID--------------------*/
    /*
    * En esencial los primero 3 los cuales son:
    * S: Principio de responsabilidad única: el cual basicamente dice que una funcion o clase solo debe realizar una accion no mas de esa
    * O: Principio de ser abierto y cerrado: esta nos dice que el codigo ya escrito ahi debe de quedar y que solo debe servir para herardar a otras clases
    * L: Principio de substitución de Liskov: y este nos explica que si en algun momento al agregar una subclase mas se deben hacer cambio a la clase padre, tenemos un problema
    *Ahora con esto claro
    * empezemos!!!
    *
    * 1. Ve a la clase que esta en la carpeta Classes y dale click a ////Operations//// ahi se hara una mejor explicacion de todo
    * */

    /*3.Ahora que volvimos al activity vamos a crear los metodos necesario para hacer las operaciones*/

    public void addition(View view)
    {
        setNumbers();
        /*8.*/
        String result = String.valueOf(solidAddition.SolidOperation(number1, number2));
        /*3. */
        /*
        Operation.setOperationType(OperationTypes.Suma);
        String result = String.valueOf(Operation.Operation());
        */
        tvResult.setText(result);
    }
    public void subtraction(View view)
    {
        setNumbers();
        /*8.*/
        String result = String.valueOf(solidSubtraction.SolidOperation(number1, number2));

        /*3. */
        /*
        Operation.setOperationType(OperationTypes.Resta);
        String result = String.valueOf(Operation.Operation());
        */
        tvResult.setText(result);
    }
    public void multiplication(View view)
    {
        setNumbers();
        /*8.*/
        String result = String.valueOf(solidMultiplication.SolidOperation(number1, number2));
        /*3. */
        /*
        Operation.setOperationType(OperationTypes.Multiplicacion);
        String result = String.valueOf(Operation.Operation());
        */
        tvResult.setText(result);
    }
    public void division(View view)
    {
        setNumbers();
        /*8.*/
        String result = String.valueOf(solidDivision.SolidOperation(number1, number2));
        /*3. */
        /*
        Operation.setOperationType(OperationTypes.Division);
        String result = String.valueOf(Operation.Operation());
        */
        tvResult.setText(result);
    }

    public void setNumbers()
    {
        number1 = Integer.parseInt(txtNumber1.getText().toString());
        number2 = Integer.parseInt(txtNumber2.getText().toString());
        /*3. */
        /*Operation.setNumber1(number1);
        Operation.setNumber2(number2);*/
    }

    /*4.Aqui como puede ver ya colocamos lo metodos y funcionan de la manera en la que se espera pero ¿ en la clase estamos inclumpliendo los principos? volvamos
    * a  la clase Operations
    * */

    /*8. ahora que ya tenemos nuestra clases con los SOL de SOLID las implementaremos */

    /*9. y luego de esto como puede ver hemos funciona de la misma manera solo que ahora de manera mas ordenada
    * y hemos aplicado la
    * S:de SOLID ya que hemos creado una clase la cual lo unico que hace es crear el metodo y luego creamos la demas clases las cuales tambien la unica funcion que hacen
    *   es realizar la operacion no como en la clase anterior la cual ademas de obtener los datos de los numeros tambien tenia que hacer las operaciones
    *   y tambien cumplimos este principio ya que todo lo tenemos ordenado por un nombre mas semantico el cual describe que es lo que hace
    * O: de SOLID ya que si se necesita agregar mas funciones o algo mas ya no tendremos que hacer nada en las demas clases sino que crear una nueva y ahi agregar las nuevas funcionalidades
    * y tambien la L: porque hemos hecho clases las cuales pueden ser cambiadas, eliminadas o agregadas y no habria ningun problema por ejemplo si
    *                 deseamos agregar una nuevafuncionalidad que sea poner la raiz de un numero sobre otro numero y eliminar la suma no tendriamos que hacer nada mas que remplzar la clase por otra y no se modificaria la padre para nada
    *                 por lo cual cumplimos este tambien.
    *
    * ESTO ES TODO, MUCHAS GRACIAS !!!
    *
    * */
}