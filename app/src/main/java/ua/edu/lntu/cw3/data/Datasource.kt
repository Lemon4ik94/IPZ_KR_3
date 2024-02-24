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
            Information("John", "Doe"),
            Information("Alice", "Smith"),
            Information("Bob", "Johnson"),
            Information("Emma", "Brown"),
            Information("Oleh", "Borbych"),
            Information("Borbych", "Oleh"),
            Information("Oleh", "Ivanov"),
            Information("Borbych", "Ivanov"),
            Information("Ivanov", "Oleh"),
            Information("Ivanov", "Borbych"),
            Information("Borbych", "Petrov"),
            Information("Oleh", "Petrov"),
            Information("Petrov", "Oleh"),
            Information("Petrov", "Borbych"),
            Information("Oleh", "Borbych"))

    }
}
