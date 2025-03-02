package com.GymMaster.backendGym.dtos;

import java.util.List;

public record Response(
        String msg,
        int status,
        List <Object> payload,
        boolean error
) {
}
