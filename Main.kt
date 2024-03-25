fun main() {
    //println(mySentence.filterNot('b'))
    myNumbers(arrayOf(11,22,5,6,8,10))
    volumeOfSphere(4/3)
    isPalindrome("noon")
}


fun mySentence(sentence:String){
    var sentence = "Barnie bakes brown bagels and buns"

}
fun myNumbers(nums:Array<Int>){
    var numbers= arrayOf(11,22,5,6,8,10)
    println(numbers.sum())
    println(numbers.count())
    println(numbers.average())
}
fun volumeOfSphere(pi:Int){
    var formula = 3.14159
    var radius = 7
    var volumeOfSphere = formula*(radius*3)*pi
    println(volumeOfSphere)
}

fun isPalindrome(word:String): Boolean{
    if (word.reversed() == "noon") {
        println("That is a palindrome")
    }
    else {
        println("That is not a palindrome")

    }
    return String

}