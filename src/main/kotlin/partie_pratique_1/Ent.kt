package partie_pratique_1
import java.lang.Exception

data class Ent(var francais:String,var anglais:String) {
    
    init {
        if (français.isEmpty() || français.isBlank()) throw Exception("le mot français peut pas etre empty ou blank")
        if (anglais.isEmpty() || anglais.isBlank()) throw Exception("le mot anglais peut pas etre empty ou blank")
    }

    override fun toString(): String {
        return "$francais : $anglais"
    }
    fun equals(other: Ent): Boolean {
        if (this.francais==other.francais) {
            return true
        }else{ return false}
    }
}
