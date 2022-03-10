fun main(){
    giveCohort()
    getModulus(7,9)
    println(getModulus(7,9))
    knowMe("Zipporah",19)
    giveLength("Better")
    println(giveLength("Better"))

}
//of the fifth, sixth, seventh and eighth  characters of the string (2 points)
fun giveCohort(){
    var cohort = "codeHive"
    println(cohort[4].toString()+cohort[5]+cohort[6]+cohort[7])
}
// function that given two numbers returns the
//remainder of their division
fun getModulus(no1:Int,no2:Int):Int{
    var modulus = no1%no2
    return  modulus
}
//takes in two parameters, name and age and returns a
//String with this structure “Hi, my name is p and I am z years old.” Where p
// and  z are your  name and age respectively.
fun knowMe(p:String,z:Int){
    var me ="Hi, my name is $p and I am $z years old"
    println(me)
}
// Write a function that takes in a string and returns its length
fun giveLength(adj:String):Int{
    var lngth = adj.length
    return lngth

}