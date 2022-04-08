package sv.edu.udb.app_trabajo_investigacion_2.Classes.SolidOperationsClasses;

import sv.edu.udb.app_trabajo_investigacion_2.Classes.SolidOperations;

/*7. Como puede ver ahora lo que hemos hecho es extender a esta clase la clase de SolidOperation que es la que tiene el metodo que necesitamos
* y de este modo si cumplimos la O y L de SOLID ya que si por alguna razon desaeamos añadir mas operaciones solo tendriamos que crear otra clase
* y extenderle la clase padre no tendriamos que ir a la clase Operations y realizar cambios lo cual al tener un codigo mas robusto y grande
* seria un gran problema ya que tambien podriamos arruinar funcionalidades operantes al hacer algun cambio, de esta manera aseguramos la escalabilidad
* y estabilidad de la app agregando nuevas funcionalidades sin perjudicar codigo anteriormente escrito y tambien se pueden quitar funcionalidades y no afectaria al programa
* ya que como la clase padre no depende de esta no habria ningun problema cumpliendo asi la L
*
* Ahora volveremos al Activity
* */
public class SolidAddition extends SolidOperations {
    @Override
    public int SolidOperation(int number1, int number2) {
        return number1+number2;
    }
}
