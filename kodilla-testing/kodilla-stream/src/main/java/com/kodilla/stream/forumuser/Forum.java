package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser> theUserList = new ArrayList<>();

    public Forum() {

        theUserList.add(new ForumUser(123, "Destroyer", 'M', LocalDate.of(1978, 1, 12), 13));
        theUserList.add(new ForumUser(333, "Cinderella", 'F', LocalDate.of(1984, 1, 14), 146));
        theUserList.add(new ForumUser(654, "Volcano", 'M', LocalDate.of(2000,7,13), 999));
        theUserList.add(new ForumUser(666,"Devil", 'M', LocalDate.of(1966, 6,6), 666));
        theUserList.add(new ForumUser(555, "Angel", 'F', LocalDate.of(2005, 5, 5), 555));
    }

    public List<ForumUser> geUserList() {
        return new ArrayList<>(theUserList);
    }
}
