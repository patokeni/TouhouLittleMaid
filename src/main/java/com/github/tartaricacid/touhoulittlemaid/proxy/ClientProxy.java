package com.github.tartaricacid.touhoulittlemaid.proxy;

import com.github.tartaricacid.touhoulittlemaid.client.particle.ParticleEnum;
import com.github.tartaricacid.touhoulittlemaid.client.renderer.entity.EntityDanmakuRender;
import com.github.tartaricacid.touhoulittlemaid.client.renderer.entity.EntityMaidRender;
import com.github.tartaricacid.touhoulittlemaid.client.renderer.entity.EntityMarisaBroomRender;
import com.github.tartaricacid.touhoulittlemaid.entity.item.EntityMarisaBroom;
import com.github.tartaricacid.touhoulittlemaid.entity.passive.EntityMaid;
import com.github.tartaricacid.touhoulittlemaid.entity.projectile.EntityDanmaku;
import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {
    @Override
    public void preInit(FMLPreInitializationEvent event) {
        super.preInit(event);

        RenderingRegistry.registerEntityRenderingHandler(EntityMaid.class, EntityMaidRender.FACTORY);
        RenderingRegistry.registerEntityRenderingHandler(EntityDanmaku.class, EntityDanmakuRender.FACTORY);
        RenderingRegistry.registerEntityRenderingHandler(EntityMarisaBroom.class, EntityMarisaBroomRender.FACTORY);
    }

    @Override
    public void init(FMLInitializationEvent event) {
        super.init(event);
        Minecraft.getMinecraft().effectRenderer.registerParticle(ParticleEnum.FLAG.getId(), ParticleEnum.FLAG.getParticle());
    }

    @Override
    public void postInit(FMLPostInitializationEvent event) {
        super.postInit(event);
    }
}