package com.lcm.regeneration.common.capabilities.timelord.events;

import com.lcm.regeneration.common.capabilities.timelord.capability.IRegenerationCapability;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.player.PlayerEvent;

/**
 * Created by Nictogen on 3/16/18.
 */
public class RegenerationEvent extends PlayerEvent {

    private IRegenerationCapability handler;

    public RegenerationEvent(EntityPlayer player, IRegenerationCapability handler) {
        super(player);
        this.handler = handler;
    }

    public IRegenerationCapability getHandler() {
        return handler;
    }

    public static class RegenerationExplosionEvent extends RegenerationEvent {

        public RegenerationExplosionEvent(EntityPlayer player, IRegenerationCapability handler) {
            super(player, handler);
        }
    }

}
