package io.github.joshualine;

public interface Artist {
    String getSchool();
    void setSchool(String school);
    default boolean isCreative() {
        return true;
    }
}
