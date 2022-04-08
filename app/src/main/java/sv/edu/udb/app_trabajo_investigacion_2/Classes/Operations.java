package sv.edu.udb.app_trabajo_investigacion_2.Classes;

public class Operations {

    private OperationTypes type;
    private int number1;
    private int number2;

    public void setOperationType(OperationTypes type) {this.type = type; }
    public OperationTypes getOperationType(){return type;};

    public void setNumber1(int number1) {this.number1 = number1; }
    public int getNumber1(){return number1;};

    public void setNumber2(int number2) {this.number2 = number2; }
    public int getNumber2(){return number2;};

    /*2. Supongamos que tenemos una clase llamada Operations y en este queremos poner las operaciones simples a realizar
    * Entonces para hacer eso tendriamos que declarar una funcion
    * */
    public int Operation()
    {
        /*Y dentro de esta funcion tendriamos que encontrar una manera de encontrar como saber el tipo que estamos realizando, una solucion facil
        * es usando el if
        * Cabe recalcar que tambien tenemos un archivo llamado OperationTypes que es donde tenemos ya definidos los tipos que se pueden utilizar
        /*Como puede ver aqui esto es una de las soluciones y podemos ver si esta funciona volviendo al activity */
        if (getOperationType().equals(OperationTypes.Suma))
        {
            return number1+number2;
        }
        else if (getOperationType().equals(OperationTypes.Resta))
        {
            return number1-number2;
        }
        else if (getOperationType().equals(OperationTypes.Multiplicacion))
        {
            return number1*number2;
        }
        else if (getOperationType().equals(OperationTypes.Division))
        {
            return number1/number2;
        }
        return 0;
    }

    /*5. pues la verdad es que si porque segun la S la clase solo deberia tener una funcion y en este caso ya ademas de obtener los datos realizar los calculos,  la O de SOLID nos dice de que un codigo ya tocado no se tiene que volver a tocar y en este caso para poder agregar otra
    * operacion como por ejemplo puede ser raiz cuadrada o la elevacion del numero uno por el numero 2 entonces tendriamos que modificar esta misma clase y esto mismo hace que incumplamos la L ya que si eliminamos un metodo entonces tambien tendriamos que modificar esta clase
    * y ¿como resolvemos esto? pues aplicamos una clase abstracta la cual servira como clase padre para las otras que se utilizan para realizar las Operaciones
    *
    * IR A SolidOperations
    * */
}
