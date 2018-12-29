package de.tr7zw.javaorbit.server.connection.packet.out;

import de.tr7zw.javaorbit.server.connection.packet.PacketOut;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class PacketOutShipData extends PacketOut{

	private int id;
	private String name;
	private int shield;
	private int maxShield;
	private int hp;
	private int maxHp;
	
	@Override
	public StringBuilder buildData() {
		return new StringBuilder("0|N|")
				.append(id).append("|")
				.append(name).append("|")
				.append(shield).append("|")
				.append(maxShield).append("|")
				.append(hp).append("|")
				.append(maxHp).append("|");
	}

}
