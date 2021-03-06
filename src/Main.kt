fun main(){

    val inicio = 0
    val fin = 20
    var sumaPares = 0
    var sumaImpares = 0


    println("--------------UTILIZANDO BUCLE FOR---------------")
    for (i in inicio..fin){
        if(i%2==0){
            sumaPares += i
        } else {
            sumaImpares += i
        }
    }
    println("El resultado de sumar los numeros pares es: $sumaPares")
    println("El resultado de sumar los numeros impares es: $sumaImpares")



    println("--------------UTILIZANDO BUCLE FOREACH---------------")
    /*
    Al hacer la suma en el bucle forEach se sumaban otra vez los numeros al valor de de sumaPares y sumaImpares, en este caso 110 y 100 respectivamente, es decir, el resultado del forEach era 220 y 200.
    Se que esto es una cutrada como un templo pero es que no se me ocurría otra forma para devolver el valor de las variables a 0
    */
    sumaPares = 0
    sumaImpares = 0

    (inicio..fin).forEach{
        if (it%2==0){
            sumaPares += it
        } else {
            sumaImpares += it
        }
    }

    println("El resultado de sumar los numeros pares es: $sumaPares")
    println("El resultado de sumar los numeros impares es: $sumaImpares")

    println("--------------UTILIZANDO BUCLE WHILE---------------")
    sumaPares = 0
    sumaImpares = 0

    var i = inicio

    while (i<=fin){
        if (i%2==0){
            sumaPares += i
        } else {
            sumaImpares += i
        }
        i++
    }

    println("El resultado de sumar los numeros pares es: $sumaPares")
    println("El resultado de sumar los numeros impares es: $sumaImpares")


    println("--------------UTILIZANDO BUCLE DO WHILE---------------")
    sumaPares = 0
    sumaImpares = 0
    i = inicio

    do{

        if (i%2==0){
            sumaPares += i
        } else {
            sumaImpares += i
        }
        i++
    }while (i<=fin)

    println("El resultado de sumar los numeros pares es: $sumaPares")
    println("El resultado de sumar los numeros impares es: $sumaImpares")

}