package com.GymMaster.backendGym.DTOs;

import java.util.List;

public record Response(
        String msg,
        int status,
        List <Object> payload,
        boolean error
) {
}
