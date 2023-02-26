package partie_pratique_1
import java.lang.Exception

data class Ent(var francais:String,var anglais:String) {
    
    var motAnglais:String
        set(value) {
            if (value.isEmptyOrBlank() == true || value.isEmptyOrBlank() == false){
                 throw Exception("le mot Englais not invalide")
            }
            else{
                field = value
            }
        }

    var motFrancais:String
        set(value) {
            if (value.isEmptyOrBlank() == true || value.isEmptyOrBlank() == false){
                throw Exception("le mot francais not invalide")
            }
            else{
                field = value
            }
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
