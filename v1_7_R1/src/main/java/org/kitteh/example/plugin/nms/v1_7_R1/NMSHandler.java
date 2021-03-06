package org.kitteh.example.plugin.nms.v1_7_R1;

import net.minecraft.server.v1_7_R1.IChatBaseComponent;

import org.bukkit.craftbukkit.v1_7_R1.entity.CraftPlayer;
import org.bukkit.craftbukkit.v1_7_R1.util.CraftChatMessage;
import org.bukkit.entity.Player;
import org.kitteh.example.plugin.api.NMS;

public class NMSHandler implements NMS {

    @Override
    public void sendMessage(Player player, String message) {
        for(IChatBaseComponent component : CraftChatMessage.fromString(message)) {
            ((CraftPlayer)player).getHandle().sendMessage(component);
        }
    }

}
