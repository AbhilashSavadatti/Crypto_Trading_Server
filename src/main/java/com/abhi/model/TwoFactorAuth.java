package com.abhi.model;

import lombok.Data;
import com.abhi.domain.VerificationType;

@Data
public class TwoFactorAuth {

    private boolean isEnabled = false;
    private VerificationType sendTo;
}
