package ua.edu.lntu.cw3.data
import ua.edu.lntu.cw3.model.Information

class Datasource() {
    fun loadInformation(): List<Information> {
        return listOf<Information>(
            Information("Oleh", "Borbych"),
            Information("Alex", "Xmils"),
            Information("Bohdan", "Vyrymchuk"),
            Information("Anton", "Karpyuk"),
            Information("Nazar", "Nyshchiy"),
            Information("Oleh", "Borbych"),
            Information("Oleh", "Borbych"),
            Information("Oleh", "Borbych"))

    }
}
