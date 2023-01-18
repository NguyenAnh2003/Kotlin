package StudentManagement.DAO

interface DaoInterface<T> {
    //djasd
    fun add(s: T)
    fun delete(s: T)
    fun edit(s: T)
    fun find(s: T)
    fun list(l: ArrayList<T>)
}