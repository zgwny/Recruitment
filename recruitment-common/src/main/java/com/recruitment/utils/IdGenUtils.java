package com.recruitment.utils;

import java.util.UUID;

public class IdGenUtils {
    public static String getId() {
        return UUID.randomUUID().toString();
    }

}
