package Information;

import java.util.ArrayList;
import java.util.Arrays;

public enum Course {
    CSCI_12000("CSCI 120",
            new ArrayList<Professor>(Arrays.asList(
                    Professor.SYADU_OOSEPFRIS,
                    Professor.JONATHAN_GALSURKAR,
                    Professor.IRIS_HERSHENSON,
                    Professor.PARADORN_WONGCHANAPAI,
                    Professor.KADRI_BROGI,
                    Professor.HENRY_WONG,
                    Professor.EDMOND_LLESHI,
                    Professor.WENDELL_WILLIAMS,
                    Professor.AUBREY_ETWAROO,
                    Professor.STAFF))),
    CSCI_12700("CSCI 127",
            new ArrayList<Professor>(Arrays.asList(
                    Professor.PAVEL_SHOSTAK,
                    Professor.JULIO_KUPLINSKY,
                    Professor.MUSAB_YASIN,
                    Professor.XIAOKE_SHEN,
                    Professor.BASAK_TAYLAN,
                    Professor.MAHDI_MAKKI,
                    Professor.STAFF))),
    CSCI_13300("CSCI 133",
            new ArrayList<Professor>(Arrays.asList(
                    Professor.JONATHAN_GALSURKAR,
                    Professor.CULLEN_SCHAFFER,
                    Professor.ANNA_WISNIEWSKA,
                    Professor.GENNADIY_MARYASH,
                    Professor.STAFF))),
    CSCI_13500("CSCI 135",
            new ArrayList<Professor>(Arrays.asList(
                    Professor.WILLIAM_SAKAS,
                    Professor.SUBASH_SHANKAR,
                    Professor.STAFF))),
    CSCI_13600("CSCI 136",
            new ArrayList<Professor>(Arrays.asList(
                    Professor.BENJAMIN_GARRETT,
                    Professor.JUSTIN_TOJEIRA,
                    Professor.ILYA_KORSUNSKIY,
                    Professor.ALEXEY_NIKOLAEV,
                    Professor.ALI_ELSAYED,
                    Professor.STAFF))),
    CSCI_15000("CSCI 150",
            new ArrayList<Professor>(Arrays.asList(
                    Professor.ERIC_SCHWEITZER,
                    Professor.SAADEDDINE_MNEIMNEH,
                    Professor.CULLEN_SCHAFFER,
                    Professor.SEVERIN_NGOSSE,
                    Professor.ALEXEY_NIKOLAEV,
                    Professor.STAFF))),
    CSCI_16000("CSCI 160",
            new ArrayList<Professor>(Arrays.asList(
                    Professor.JUSTIN_TOJEIRA,
                    Professor.MUSAB_YASIN,
                    Professor.EDMOND_LLESHI,
                    Professor.CHRISTINA_ZAMFIRESCU,
                    Professor.STAFF))),
    CSCI_23500("CSCI 235",
            new ArrayList<Professor>(Arrays.asList(
                    Professor.JULIO_KUPLINSKY,
                    Professor.SEVERIN_NGOSSE,
                    Professor.SIMON_AYZMAN,
                    Professor.STAFF)));

    private String name;
    private ArrayList<Professor> professors;

    Course(String name, ArrayList<Professor> professors) {
        this.name = name;
        this.professors = professors;
    }

    @Override
    public String toString() {
        return name;
    }

    public ArrayList<Professor> getProfessors() {
        return professors;
    }

    public static Course getCourse(String courseName) {
        for (Course course : Course.values()) {
            if (courseName.equals(course.toString())) {
                return course;
            }
        }

        throw new IllegalArgumentException(courseName + " is not a valid course");
    }
}
