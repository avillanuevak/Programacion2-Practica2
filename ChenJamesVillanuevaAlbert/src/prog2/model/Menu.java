/*
 * Universitat de Barcelona
 * Programació 2
 */
package prog2.model;

import java.util.Scanner;

/**
 * Implements a text menu from a list of enumeration options.
 *
 * @author Xavi Baró
 */
public class Menu<TEnum extends Enum<TEnum>> {

    /**
     * List of the options
     */
    private TEnum[] _llistaOpcions;

    /**
     * Title of the menu
     */
    private String _titol;

    /**
     * List with the descriptions associated with the actions
     */
    private String[] _descripcions;

    /**
     * Constructs a menu with a given title and a list of enumeration options.
     *
     * @param titol Title of the menu
     * @param llistaOpcions List of enumeration options
     */
    public Menu(String titol, TEnum... llistaOpcions) {
        _titol = titol;
        _llistaOpcions = llistaOpcions;
    }

    /**
     * Sets a customized description for each option in the menu.
     *
     * @param descripcions List of descriptions
     */
    public void setDescripcions(String[] descripcions) {
        if (descripcions != null && descripcions.length == _llistaOpcions.length) {
            _descripcions = descripcions;
        } else {
            _descripcions = null;
        }
    }

    /**
     * Displays the menu options.
     */
    public void mostrarMenu() {
        // Print the menu header
        String lines = "--------------";
        for (int i = 0; i < getMaxLen(); i++) {
            lines += "-";
        }
        System.out.println(lines);
        System.out.println(_titol.toUpperCase());
        System.out.println(lines);

        // Print each option
        for (int i = 0; i < _llistaOpcions.length; i++) {
            TEnum option = _llistaOpcions[i];
            System.out.printf("\t%d.-%s ", i + 1, option.name());

            // Print the description if it exists
            if (_descripcions != null) {
                System.out.println(": " + _descripcions[i]);
            } else {
                System.out.println();
            }
        }

        System.out.println(lines);
    }

    /**
     * Gets an option from the user using the given scanner.
     *
     * @param sc Scanner to read user input
     * @return Selected option
     */
    public TEnum getOpcio(Scanner sc) {
        TEnum opcio = null;
        int opcioInt = -1;

        // Get a valid option
        do {
            System.out.print("Enter an option >> ");
            opcioInt = sc.nextInt();
            sc.nextLine();

            if (opcioInt > 0 && opcioInt <= _llistaOpcions.length) {
                opcio = _llistaOpcions[opcioInt - 1];
            } else {
                System.err.println("Invalid option. Select an option between 1 and " + _llistaOpcions.length);
            }
        } while (opcio == null);

        return opcio;
    }

    /**
     * Gets the maximum length of the descriptions of the options.
     *
     * @return Maximum length of the descriptions
     */
    private int getMaxLen() {
        int maxLen = 0;

        for (TEnum option : _llistaOpcions) {
            maxLen = Math.max(maxLen, option.name().length());
        }

        if (_descripcions != null) {
            for (String description : _descripcions) {
                maxLen = Math.max(maxLen, description.length());
            }
        }

        return maxLen;
    }
}
