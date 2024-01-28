package com.wanted.preonboarding.ticket.presentation.dto.request;

import jakarta.validation.constraints.NotNull;
import lombok.Builder;

@Builder
public record CancelReservationRequest(
        @NotNull(message = "userId는 필수 값 입니다.")
        Long userId
) {
}
