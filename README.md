# TareaConversiones
![1](https://github.com/user-attachments/assets/e837b85b-70de-4727-8eee-8ebad549fa22)

Para explicar el proceso, primero se declaran las variables principales que se van a utilizar como ejemplo. En este caso los numeros float y double tienen la misma cantidad de cifras decimales, por esta razón, se le pone una f en el 3.14 para indicar que se va a tratar como un dato float y así poder diferenciarlo de los demás

![2](https://github.com/user-attachments/assets/048f46b5-c340-41a4-97c9-b4caa67fe67b)

Para convertir un dato primitivo a entero se puede usar directamente el proceso de auto-boxing para convertirlo a su clase envolvente. es un método sencillo y el código es muy corto. Ahora bien, a pesar de que lo que se imprime el mismo numero, java ahora trata esos valores de forma distinta, al convertirse en objetos el valor que devuelve está en formato de texto, es decir, el valor como cadena.

![3](https://github.com/user-attachments/assets/f00a5fc7-acd9-45ba-bdad-000b8760d640)

Para convertir, por ejemplo, el número de teléfono de alguien en double, se hace un proceso de autocasting ya que es una conversión implícita. Para convertirlo en un string se puede usar el método String.valueof que devuelve la representación del número como una cadena, en este caso se hace de manera distinta ya que String no es compatible con los tipos numéricos

![4](https://github.com/user-attachments/assets/0da0facb-1f61-42a3-97ff-df88a40d5dd1)

En caso de que tengamos un nombre como cadena de texto, se puede hacer que se devuelva el valor en el código ASCII de cada uno de los caracteres, utilizando un ciclo que recorre todos los caracteres y el método charAT para hacer la conversión, de esta forma, se imprime en forma de lista, por ejemplo, los valores correspondientes

![5](https://github.com/user-attachments/assets/9209732a-e44c-4c39-b20d-10605ce2834f)

Para convertir nombres a objetos se usa el mismo método mencionado anteriormente, como sabemos, ahora este dato java lo va a tratar de forma distinta debido a lo amplio que puede llegar a ser y según las utilidades que le demos luego. Para el caso de números de teléfono, se declaró como long y como un número decimal debido a que no se puede tratar inicialmente como un integer debido al tamaño que tiene, debido a esto lo que se imprime es solamente la parte entera, internamente lo que sucede es que las clases envolventes sobreescriben el toString para devolverlo representado en forma de texto.

![6](https://github.com/user-attachments/assets/071524c7-3657-43f8-9956-8ee8b62e0888)

Para el caso de los booleanos, sucede algo en particular: Cuando se imprime un valor booleano como un objeto, java va a tratar ese valor como una instancia de la clase Boolean que es su clase envolvente. Lo que sucede internamente es que java llama al método Boolean.toString lo que hace que se devuelva true o false en forma textual, más no como su valor directo.
