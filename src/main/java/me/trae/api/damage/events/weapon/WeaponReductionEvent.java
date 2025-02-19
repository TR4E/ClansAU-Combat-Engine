package me.trae.api.damage.events.weapon;

import me.trae.api.damage.events.weapon.interfaces.IWeaponReductionEvent;
import me.trae.core.event.CustomCancellableEvent;
import me.trae.core.utility.enums.WeaponMaterialType;
import me.trae.core.utility.enums.WeaponSlotType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.inventory.ItemStack;

public class WeaponReductionEvent extends CustomCancellableEvent implements IWeaponReductionEvent {

    private final WeaponSlotType slotType;
    private final WeaponMaterialType materialType;
    private final ItemStack itemStack;
    private final LivingEntity entity;

    private double reduction;

    public WeaponReductionEvent(final WeaponSlotType slotType, final WeaponMaterialType materialType, final ItemStack itemStack, final LivingEntity entity, final double reduction) {
        this.slotType = slotType;
        this.materialType = materialType;
        this.itemStack = itemStack;
        this.entity = entity;
        this.reduction = reduction;
    }

    @Override
    public WeaponSlotType getSlotType() {
        return this.slotType;
    }

    @Override
    public WeaponMaterialType getMaterialType() {
        return this.materialType;
    }

    @Override
    public ItemStack getItemStack() {
        return this.itemStack;
    }

    @Override
    public LivingEntity getEntity() {
        return this.entity;
    }

    @Override
    public double getReduction() {
        return this.reduction;
    }

    @Override
    public void setReduction(final double reduction) {
        this.reduction = reduction;
    }
}