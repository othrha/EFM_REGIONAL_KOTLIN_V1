package partie_pratique_1

class exercice1 {


    fun String.isEmptyOrBlank(){
        if (isEmpty()){ println("is empty") }
        if(isBlank()) { println("is blank") }
    }

    fun String.acronym(): String {
        val mots= this.split(" ").filter { it.isNotBlank() }
        val acronym = StringBuilder()
        for (mo in mots) {
            acronym.append(mo[0].toUpperCase())
        }
        return acronym.toString()
    }

}