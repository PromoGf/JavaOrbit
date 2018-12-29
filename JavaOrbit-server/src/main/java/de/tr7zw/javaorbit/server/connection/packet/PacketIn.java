package de.tr7zw.javaorbit.server.connection.packet;

import de.tr7zw.javaorbit.server.player.Player;

public abstract class PacketIn extends Packet{

	public PacketIn(String data) {
	}

	public abstract void onRecieve(Player player);

	public String clearString(String data) {
		return data.replace("" + (char)0x00, "").replace("\n", "").replace("\r", "");
	}
	
}
