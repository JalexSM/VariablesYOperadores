\# Análisis de division de enteros 

la division de enteros muestra un resultado entero no redondea el numero solo quita los decimales y muestra el numero entero 





\# 1) Respuestas Teóricas

\## 1. ¿Para qué se utilizan los operadores lógicos en programación?



Los operadores lógicos se utilizan para evaluar y combinar condiciones booleanas (verdadero o falso). Permiten controlar la ejecución del programa mediante estructuras condicionales y repetitivas.





\## 2. ¿Por qué es importante declarar correctamente el tipo de dato de una variable?



Es importante porque define qué tipo de información puede almacenar la variable y qué operaciones se pueden realizar con ella. Una declaración correcta evita errores y asegura el funcionamiento adecuado del programa





\# 2) Justificación Técnica

\## Clasificación de edad

Para la clasificación de la edad se utilizó la estructura de control if-else.



Se eligió if-else en lugar de switch porque las condiciones requieren evaluar rangos de valores, como de 12 a 17 años o de 18 a 59 años. La estructura switch es más adecuada para comparar valores exactos, pero no permite evaluar intervalos numéricos directamente.



En cambio, if-else permite utilizar operadores relacionales como <, >= y <=, lo que facilita la evaluación de rangos de edad de manera clara y ordenada.





\## Día de la Semana

Para resolver el ejercicio "Día de la Semana" se utilizó la estructura de control switch.



Se eligió switch porque el programa debe evaluar un número específico entre 1 y 7, donde cada valor corresponde exactamente a un día de la semana. Esta estructura es adecuada cuando se comparan valores exactos y definidos.



Si se hubiera utilizado if-else, el código sería más extenso y menos legible, ya que requeriría múltiples comparaciones individuales. Por esta razón, switch es la opción más apropiada para este tipo de problema.





\## Verificación de acceso

En este programa se utilizó la estructura condicional if-else.



Se eligió if-else porque la validación del inicio de sesión requiere evaluar expresiones booleanas, comparando dos variables de tipo String (usuario y contraseña) mediante el método .equals().



La estructura switch no fue utilizada porque evalúa una sola variable frente a valores constantes. En este caso es necesario verificar múltiples condiciones relacionadas (usuario correcto y contraseña correcta), lo cual se maneja de forma más clara y adecuada con if-else.



Por lo tanto, if-else es la estructura más apropiada para este tipo de validación lógica.

