package redone.net.packets.impl;

import redone.game.players.Client;
import redone.net.packets.PacketType;

/**
 * @author Andrew
 */

public class IdleLogout implements PacketType {

	@Override
	public void processPacket(Client player, int packetType, int packetSize) {
		if (player.underAttackBy > 0 || player.underAttackBy2 > 0 || player.isBot) {
			return;
		} else {
			player.logout();
		}
	}
}
