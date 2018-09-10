package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

public abstract class Contact {
    protected String trimmedValue;
    public String value;
    protected boolean isPrivate;

    protected Contact(String value, boolean isPrivate) throws IllegalValueException {
        this.isPrivate = isPrivate;
        this.value = value;
        this.trimmedValue = value.trim();
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    public boolean isPrivate() {
        return isPrivate;
    }

}
