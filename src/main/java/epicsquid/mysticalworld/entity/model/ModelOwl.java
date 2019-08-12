package epicsquid.mysticalworld.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelOwl extends ModelBase {
  private final ModelRenderer body;
  private final ModelRenderer footR;
  private final ModelRenderer footL;
  private final ModelRenderer wingR1;
  private final ModelRenderer wingR2;
  private final ModelRenderer wingL1;
  private final ModelRenderer wingL2;
  private final ModelRenderer tail;
  private final ModelRenderer head;
  private final ModelRenderer tuftR;
  private final ModelRenderer tuftL;

  public ModelOwl() {
    textureWidth = 64;
    textureHeight = 64;

    body = new ModelRenderer(this);
    body.setRotationPoint(0.0F, 24.0F, 0.0F);
    body.cubeList.add(new ModelBox(body, 0, 0, -4.0F, -13.0F, -4.0F, 8, 9, 8, 0.0F, false));

    footR = new ModelRenderer(this);
    footR.setRotationPoint(-1.5F, -4.0F, -0.5F);
    body.addChild(footR);
    footR.cubeList.add(new ModelBox(footR, 0, 43, -1.5F, 0.0F, -1.5F, 3, 2, 3, 0.0F, false));
    footR.cubeList.add(new ModelBox(footR, 26, 48, -1.0F, 2.0F, 0.5F, 2, 2, 0, 0.0F, false));
    footR.cubeList.add(new ModelBox(footR, 0, 48, -1.0F, 4.0F, -1.5F, 2, 0, 2, 0.0F, false));

    footL = new ModelRenderer(this);
    footL.setRotationPoint(1.5F, -4.0F, -0.5F);
    body.addChild(footL);
    footL.cubeList.add(new ModelBox(footL, 12, 43, -1.5F, 0.0F, -1.5F, 3, 2, 3, 0.0F, false));
    footL.cubeList.add(new ModelBox(footL, 22, 48, -1.0F, 2.0F, 0.5F, 2, 2, 0, 0.0F, false));
    footL.cubeList.add(new ModelBox(footL, 8, 48, -1.0F, 4.0F, -1.5F, 2, 0, 2, 0.0F, false));

    wingR1 = new ModelRenderer(this);
    wingR1.setRotationPoint(-4.0F, -13.0F, -1.0F);
    body.addChild(wingR1);
    wingR1.cubeList.add(new ModelBox(wingR1, 16, 17, -1.0F, 0.0F, -2.0F, 1, 7, 7, 0.0F, false));

    wingR2 = new ModelRenderer(this);
    wingR2.setRotationPoint(-1.0F, 7.0F, -2.0F);
    setRotationAngle(wingR2, 0.1745F, 0.0349F, -0.1745F);
    wingR1.addChild(wingR2);
    wingR2.cubeList.add(new ModelBox(wingR2, 14, 31, -0.0F, 0.0F, 0.0F, 1, 6, 6, 0.0F, false));

    wingL1 = new ModelRenderer(this);
    wingL1.setRotationPoint(4.0F, -13.0F, -1.0F);
    body.addChild(wingL1);
    wingL1.cubeList.add(new ModelBox(wingL1, 0, 17, 0.0F, 0.0F, -2.0F, 1, 7, 7, 0.0F, false));

    wingL2 = new ModelRenderer(this);
    wingL2.setRotationPoint(1.0F, 7.0F, -2.0F);
    setRotationAngle(wingL2, 0.1745F, -0.0349F, 0.1745F);
    wingL1.addChild(wingL2);
    wingL2.cubeList.add(new ModelBox(wingL2, 0, 31, -1.0F, 0.0F, 0.0F, 1, 6, 6, 0.0F, false));

    tail = new ModelRenderer(this);
    tail.setRotationPoint(0.0F, -5.0F, 4.0F);
    setRotationAngle(tail, 0.5236F, 0.0F, 0.0F);
    body.addChild(tail);
    tail.cubeList.add(new ModelBox(tail, 28, 31, -3.0F, 0.0F, -2.0F, 6, 4, 2, 0.0F, false));

    head = new ModelRenderer(this);
    head.setRotationPoint(0.0F, -13.0F, 0.0F);
    body.addChild(head);
    head.cubeList.add(new ModelBox(head, 32, 0, -3.5F, -6.0F, -3.5F, 7, 6, 7, 0.0F, false));
    head.cubeList.add(new ModelBox(head, 16, 48, -1.0F, -3.0F, -4.5F, 2, 2, 1, 0.0F, false));

    tuftR = new ModelRenderer(this);
    tuftR.setRotationPoint(-2.0F, -6.0F, -3.0F);
    setRotationAngle(tuftR, 0.4363F, -0.3491F, 0.0F);
    head.addChild(tuftR);
    tuftR.cubeList.add(new ModelBox(tuftR, 24, 43, -2.0F, 0.0F, 0.0F, 2, 0, 4, 0.0F, false));

    tuftL = new ModelRenderer(this);
    tuftL.setRotationPoint(2.0F, -6.0F, -3.0F);
    setRotationAngle(tuftL, 0.4363F, 0.3491F, 0.0F);
    head.addChild(tuftL);
    tuftL.cubeList.add(new ModelBox(tuftL, 36, 43, 0.0F, 0.0F, 0.0F, 2, 0, 4, 0.0F, false));
  }

  @Override
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    body.render(f5);
  }

  public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
    modelRenderer.rotateAngleX = x;
    modelRenderer.rotateAngleY = y;
    modelRenderer.rotateAngleZ = z;
  }
}