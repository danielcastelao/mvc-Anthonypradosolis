# README SUBIR Y BAJAR VELOCIDAD

Lo primero que hicimos fue modificar el metodo cambiarVelocidad 

Para esto creamos dos nuevos metodos, llamados subirVelocidad y bajarVelocidad

Con este cambio tenemos que modificar el controller, el ObserverLimite y el ObserverVelocidad

Al hacer estos cambios tambien modifico la View

Por ultimo modifico el test de TestsModel debido a que implementamos dos nuevos metodos

Finalmente realizamos el diagrama de clases y el diagrama de secuencia en la aplicacion de mermaid

# Diagrama de clases

<br>classDiagram
<br>class Coche {
<br>String: matricula
<br>String: modelo
<br>Integer: velocidad
<br>}
<br>class Controller{
<br>+main()
<br>}
<br>class View {
<br>+mostrarCambioVelocidad(String, Integer, String)
<br>}
<br>class Model {
<br>ArrayList~Coche~: parking
<br>+crearCoche(String, String)
<br>+getCoche(String)
<br>+subirVelocidad(String, Integer)
<br>+bajarVelocidad(String, Integer)
<br>+getVelocidad(String)
<br>}
<br>Controller "1" *-- "1" Model : association
<br>Controller "1" *-- "1" View : association
<br>Model "1" *-- "1..n" Coche : association

# Diagrama de secuencia

sequenceDiagram
<br>participant App
<br>participant Controller
<br>participant Model
<br>participant View
<br>App->>Controller: new Controller(new Model())
<br>activate Controller
<br>Controller->>Model: crearCoche("LaFerrari", "SBC 1234")
<br>activate Model
<br>Model-->>Controller: Coche
<br>deactivate Model
<br>Controller->>Model: crearCoche("Alpine", "HYU 4567")
<br>activate Model
<br>Model-->>Controller: Coche
<br>deactivate Model
<br>Controller->>Model: crearCoche("Aston Martin", "FGH 3333")
<br>activate Model
<br>Model-->>Controller: Coche
<br>deactivate Model
<br>Controller->>Model: subirVelocidad("SBC 1234", 30)
<br>activate Model
<br>Model-->>Controller: void
<br>deactivate Model
<br>Controller->>View: mostrarCambioVelocidad("SBC 1234", 30, "incrementada")
<br>activate View
<br>View-->>Controller: void
<br>deactivate View
<br>Controller->>Model: bajarVelocidad("HYU 4567", 150)
<br>activate Model
<br>Model-->>Controller: void
<br>deactivate Model
<br>Controller->>View: mostrarCambioVelocidad("HYU 4567", 150, "disminuida")
<br>activate View
<br>View-->>Controller: void
<br>deactivate View
<br>Controller->>Model: subirVelocidad("HYU 4567", 20)
<br>activate Model
<br>Model-->>Controller: void
<br>deactivate Model
<br>Controller->>View: mostrarCambioVelocidad("HYU 4567", 20, "incrementada")
<br>activate View
<br>View-->>Controller: void
<br>deactivate View