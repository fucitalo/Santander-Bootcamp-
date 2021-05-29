package com.project.santanderBootcamp.exceptions;

import com.project.santanderBootcamp.util.MessageUtils;

public class NotFoundException extends RuntimeException{
    public NotFoundException(){
        super(MessageUtils.NO_RECORDS_FOUND);
    }
}
