package com.cricket.stadium_slot.pojo;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class PojoSlotStadium {

	int stadiumSlotId;
	SlotPojo slot;
}
