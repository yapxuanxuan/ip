package seedu.duke;

import java.util.Scanner;

/**
 * <h1> UI </h1>
 * This UI class deals with interaction with the user, like the introduction of the program
 * and the statements printed when the user ends the program.
 *
 * @author Yap Xuan Xuan
 * @version 0.1
 */
public class UI {

    public UI() {
    }
    private static final String LINE =
                "      _________________________________________________________________________\n";
    private String logo = "     _______       ______     _______    _______    ___  ___\n"
            + "    |   _  \"\\     /    \" \\   |   _  \"\\  |   _  \"\\  |\"  \\/\"  |\n"
            + "    (. |_)  :)   // ____  \\  (. |_)  :) (. |_)  :)  \\   \\  /\n"
            + "    |:     \\/   /  /    ) :) |:     \\/  |:     \\/    \\\\  \\/\n"
            + "    (|  _  \\\\  (: (____/ //  (|  _  \\\\  (|  _  \\\\    /   /\n"
            + "    |: |_)  :)  \\        /   |: |_)  :) |: |_)  :)  /   /\n"
            + "    (_______/    \\\"_____/    (_______/  (_______/  |___/";

    /**
     * Prints out the introduction of the program and the name of the chatbot, Bobby.
     */
    public String intro() {
        return "Hello, I'm Bobby!\n" + "What can I do for you today? :)\n";
    }

    /**
     * Throws a DukeException when the user input did not state the description of the
     * todo task, deadline or event command that is tailored to the different cases.
     *
     * @param tasktype Type of task command that the user tried to call
     * @throws DukeException which is printed out to the user
     */
    public static void emptyDesc(String tasktype) throws DukeException {
        if (tasktype.equals("todo")) {
            throw new DukeException("Oops! Please state the description of your todo task.");
        } else if (tasktype.equals("deadline")) {
            throw new DukeException("Oops! Please state the description of your task and the deadline.");
        } else if (tasktype.equals("event")) {
            throw new DukeException("Oops! Please state the description of your event " +
                    "and provide the start and end timing.");
        }
    }

    /**
     * Prints out a bye message when the user ends the program by running the command bye
     */
    public String bye() {
        return "Bye! Have a great day ahead :>\n";
    }

}
