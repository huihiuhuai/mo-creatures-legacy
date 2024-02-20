package com.emoniph.witchery.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelWolfAltar extends ModelBase {
	private final ModelRenderer Head;
	private final ModelRenderer MouthB;
	private final ModelRenderer Nose2;
	private final ModelRenderer Neck;
	private final ModelRenderer Neck2;
	private final ModelRenderer LSide;
	private final ModelRenderer RSide;
	private final ModelRenderer Nose;
	private final ModelRenderer Mouth;
	private final ModelRenderer MouthOpen;
	private final ModelRenderer REar;
	private final ModelRenderer LEar;
	private final ModelRenderer Body;
	private final ModelRenderer Body_r1;
	private final ModelRenderer Tail;
	private final ModelRenderer TailD_r1;
	private final ModelRenderer TailB_r1;
	private final ModelRenderer TailA_r1;
	private final ModelRenderer Leg4A;
	private final ModelRenderer Leg4D;
	private final ModelRenderer Leg4B;
	private final ModelRenderer Leg4C;
	private final ModelRenderer Leg3B;
	private final ModelRenderer Leg3B_r1;
	private final ModelRenderer Leg2A;
	private final ModelRenderer Leg2B;
	private final ModelRenderer Leg2C;
	private final ModelRenderer Leg3D;
	private final ModelRenderer Leg3C;
	private final ModelRenderer Leg3A;
	private final ModelRenderer Leg1A;
	private final ModelRenderer Leg1A_r1;
	private final ModelRenderer Leg1B;
	private final ModelRenderer Leg1C;

	public ModelWolfAltar() {
		textureWidth = 64;
		textureHeight = 128;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 7.0F, -10.0F);
		Head.cubeList.add(new ModelBox(Head, 0, 0, -4.0F, -9.0F, -2.0F, 8, 8, 6, 0.0F));

		MouthB = new ModelRenderer(this);
		MouthB.setRotationPoint(0.0F, 7.0F, -10.0F);
		MouthB.cubeList.add(new ModelBox(MouthB, 16, 33, -2.0F, -2.0F, -3.0F, 4, 1, 2, 0.0F));

		Nose2 = new ModelRenderer(this);
		Nose2.setRotationPoint(0.0F, 7.0F, -10.0F);
		Nose2.cubeList.add(new ModelBox(Nose2, 0, 25, -2.0F, -4.0F, -8.0F, 4, 2, 6, 0.0F));

		Neck = new ModelRenderer(this);
		Neck.setRotationPoint(0.0F, 10.0F, -6.0F);
		setRotationAngle(Neck, -0.4538F, 0.0F, 0.0F);
		Neck.cubeList.add(new ModelBox(Neck, 28, 0, -3.5F, -10.1462F, -6.0351F, 7, 8, 7, 0.0F));

		Neck2 = new ModelRenderer(this);
		Neck2.setRotationPoint(0.0F, 14.0F, -10.0F);
		setRotationAngle(Neck2, -0.4538F, 0.0F, 0.0F);
		Neck2.cubeList.add(new ModelBox(Neck2, 0, 14, -1.5F, -9.1462F, -4.0351F, 3, 4, 7, 0.0F));

		LSide = new ModelRenderer(this);
		LSide.setRotationPoint(0.0F, 7.0F, -10.0F);
		setRotationAngle(LSide, -0.2094F, 0.4189F, -0.0873F);
		LSide.cubeList.add(new ModelBox(LSide, 28, 33, 1.8508F, -7.1505F, 0.5397F, 2, 6, 6, 0.0F));

		RSide = new ModelRenderer(this);
		RSide.setRotationPoint(0.0F, 7.0F, -10.0F);
		setRotationAngle(RSide, -0.2094F, -0.4189F, 0.0873F);
		RSide.cubeList.add(new ModelBox(RSide, 28, 45, -3.8508F, -7.1505F, 0.5397F, 2, 6, 6, 0.0F));

		Nose = new ModelRenderer(this);
		Nose.setRotationPoint(0.0F, 7.0F, -10.0F);
		setRotationAngle(Nose, 0.2793F, 0.0F, 0.0F);
		Nose.cubeList.add(new ModelBox(Nose, 44, 33, -1.5F, -6.465F, -6.9011F, 3, 2, 7, 0.0F));

		Mouth = new ModelRenderer(this);
		Mouth.setRotationPoint(0.0F, 7.0F, -10.0F);
		Mouth.cubeList.add(new ModelBox(Mouth, 1, 34, -2.0F, -2.0F, -7.5F, 4, 1, 5, 0.0F));

		MouthOpen = new ModelRenderer(this);
		MouthOpen.setRotationPoint(0.0F, 7.0F, -10.0F);
		setRotationAngle(MouthOpen, 0.6109F, 0.0F, 0.0F);
		MouthOpen.cubeList.add(new ModelBox(MouthOpen, 1, 34, -2.0F, -2.6206F, -5.7819F, 4, 1, 5, 0.0F));

		REar = new ModelRenderer(this);
		REar.setRotationPoint(0.0F, 7.0F, -10.0F);
		setRotationAngle(REar, 0.0F, 0.0F, -0.1745F);
		REar.cubeList.add(new ModelBox(REar, 22, 0, -2.0689F, -13.7873F, 1.5F, 3, 5, 1, 0.0F));

		LEar = new ModelRenderer(this);
		LEar.setRotationPoint(0.0F, 7.0F, -10.0F);
		setRotationAngle(LEar, 0.0F, 0.0F, 0.1745F);
		LEar.cubeList.add(new ModelBox(LEar, 13, 14, -0.9311F, -13.7873F, 1.5F, 3, 5, 1, 0.0F));

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 6.5F, 2.0F);
		setRotationAngle(Body, 1.5708F, 0.0F, 0.0F);
		Body.cubeList.add(new ModelBox(Body, 20, 15, -4.0F, -8.5F, -6.0F, 8, 8, 10, 0.0F));

		Body_r1 = new ModelRenderer(this);
		Body_r1.setRotationPoint(0.0F, 17.5F, -2.0F);
		Body.addChild(Body_r1);
		setRotationAngle(Body_r1, -0.6906F, 0.0585F, -0.0225F);
		Body_r1.cubeList.add(new ModelBox(Body_r1, 0, 40, -3.4407F, -18.2297F, -16.8395F, 6, 16, 8, 0.0F));

		Tail = new ModelRenderer(this);
		Tail.setRotationPoint(0.0F, 36.5559F, 16.7247F);
		

		TailD_r1 = new ModelRenderer(this);
		TailD_r1.setRotationPoint(0.0F, -6.0F, 4.0F);
		Tail.addChild(TailD_r1);
		setRotationAngle(TailD_r1, 1.0996F, 0.0F, 0.0F);
		TailD_r1.cubeList.add(new ModelBox(TailD_r1, 52, 69, -1.5F, -5.7F, 5.4F, 3, 5, 3, 0.0F));
		TailD_r1.cubeList.add(new ModelBox(TailD_r1, 48, 59, -2.0F, -7.7F, 4.9F, 4, 6, 4, 0.0F));

		TailB_r1 = new ModelRenderer(this);
		TailB_r1.setRotationPoint(0.0F, -3.5819F, -1.7359F);
		Tail.addChild(TailB_r1);
		setRotationAngle(TailB_r1, 0.7505F, 0.0F, 0.0F);
		TailB_r1.cubeList.add(new ModelBox(TailB_r1, 48, 49, -2.0F, -12.5F, 8.0F, 4, 6, 4, 0.0F));

		TailA_r1 = new ModelRenderer(this);
		TailA_r1.setRotationPoint(0.0F, -5.6698F, 3.4686F);
		Tail.addChild(TailA_r1);
		setRotationAngle(TailA_r1, 1.0647F, 0.0F, 0.0F);
		TailA_r1.cubeList.add(new ModelBox(TailA_r1, 52, 42, -1.5F, -15.5F, 7.5F, 3, 4, 3, 0.0F));

		Leg4A = new ModelRenderer(this);
		Leg4A.setRotationPoint(-3.0F, 9.5F, 7.0F);
		setRotationAngle(Leg4A, -0.3665F, 0.0F, 0.0F);
		

		Leg4D = new ModelRenderer(this);
		Leg4D.setRotationPoint(-3.0F, 9.5F, 7.0F);
		

		Leg4B = new ModelRenderer(this);
		Leg4B.setRotationPoint(-3.0F, 9.5F, 7.0F);
		setRotationAngle(Leg4B, -0.733F, 0.0F, 0.0F);
		

		Leg4C = new ModelRenderer(this);
		Leg4C.setRotationPoint(-3.0F, 9.5F, 7.0F);
		setRotationAngle(Leg4C, -0.1745F, 0.0F, 0.0F);
		

		Leg3B = new ModelRenderer(this);
		Leg3B.setRotationPoint(3.0F, 9.5F, 7.0F);
		setRotationAngle(Leg3B, -0.733F, 0.0F, 0.0F);
		

		Leg3B_r1 = new ModelRenderer(this);
		Leg3B_r1.setRotationPoint(-3.0F, 14.5F, -7.0F);
		Leg3B.addChild(Leg3B_r1);
		setRotationAngle(Leg3B_r1, 1.9095F, 0.0228F, -0.0289F);
		Leg3B_r1.cubeList.add(new ModelBox(Leg3B_r1, 0, 76, -6.1201F, 14.2917F, -0.7282F, 2, 2, 5, 0.0F));
		Leg3B_r1.cubeList.add(new ModelBox(Leg3B_r1, 0, 76, 1.8799F, 14.2917F, -0.7282F, 2, 2, 5, 0.0F));

		Leg2A = new ModelRenderer(this);
		Leg2A.setRotationPoint(-4.0F, 9.5F, -5.5F);
		setRotationAngle(Leg2A, 0.2618F, 0.0F, 0.0F);
		

		Leg2B = new ModelRenderer(this);
		Leg2B.setRotationPoint(-4.0F, 9.5F, -5.5F);
		setRotationAngle(Leg2B, -0.1745F, 0.0F, 0.0F);
		

		Leg2C = new ModelRenderer(this);
		Leg2C.setRotationPoint(-4.0F, 9.5F, -5.5F);
		

		Leg3D = new ModelRenderer(this);
		Leg3D.setRotationPoint(3.0F, 9.5F, 7.0F);
		

		Leg3C = new ModelRenderer(this);
		Leg3C.setRotationPoint(3.0F, 9.5F, 7.0F);
		setRotationAngle(Leg3C, -0.1745F, 0.0F, 0.0F);
		

		Leg3A = new ModelRenderer(this);
		Leg3A.setRotationPoint(3.0F, 9.5F, 7.0F);
		setRotationAngle(Leg3A, -0.3665F, 0.0F, 0.0F);
		Leg3A.cubeList.add(new ModelBox(Leg3A, 0, 64, -9.0F, 1.465F, 1.0841F, 2, 7, 5, 0.0F));
		Leg3A.cubeList.add(new ModelBox(Leg3A, 0, 64, -1.0F, 1.465F, 1.0841F, 2, 7, 5, 0.0F));

		Leg1A = new ModelRenderer(this);
		Leg1A.setRotationPoint(4.0F, 9.5F, -5.5F);
		setRotationAngle(Leg1A, 0.2618F, 0.0F, 0.0F);
		

		Leg1A_r1 = new ModelRenderer(this);
		Leg1A_r1.setRotationPoint(-14.0F, 14.5F, 5.5F);
		Leg1A.addChild(Leg1A_r1);
		setRotationAngle(Leg1A_r1, -0.5672F, 0.0F, 0.0F);
		Leg1A_r1.cubeList.add(new ModelBox(Leg1A_r1, 28, 57, 4.0F, -12.9251F, -11.4894F, 2, 8, 4, 0.0F));
		Leg1A_r1.cubeList.add(new ModelBox(Leg1A_r1, 28, 57, 14.0F, -12.9251F, -11.4894F, 2, 8, 4, 0.0F));

		Leg1B = new ModelRenderer(this);
		Leg1B.setRotationPoint(4.0F, 9.5F, -5.5F);
		setRotationAngle(Leg1B, -0.1745F, 0.0F, 0.0F);
		Leg1B.cubeList.add(new ModelBox(Leg1B, 28, 69, 0.0F, 4.1118F, 1.2237F, 2, 8, 2, 0.0F));
		Leg1B.cubeList.add(new ModelBox(Leg1B, 28, 69, -10.0F, 4.1118F, 1.2237F, 2, 8, 2, 0.0F));

		Leg1C = new ModelRenderer(this);
		Leg1C.setRotationPoint(4.0F, 9.5F, -5.5F);
		Leg1C.cubeList.add(new ModelBox(Leg1C, 28, 79, -0.5067F, 12.0F, -2.0F, 3, 2, 3, 0.0F));
		Leg1C.cubeList.add(new ModelBox(Leg1C, 28, 79, -2.0067F, 12.0F, 9.0F, 3, 2, 3, 0.0F));
		Leg1C.cubeList.add(new ModelBox(Leg1C, 28, 79, -10.0067F, 12.0F, 9.0F, 3, 2, 3, 0.0F));
		Leg1C.cubeList.add(new ModelBox(Leg1C, 28, 79, -10.5067F, 12.0F, -2.0F, 3, 2, 3, 0.0F));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Head.render(f5);
		MouthB.render(f5);
		Nose2.render(f5);
		Neck.render(f5);
		Neck2.render(f5);
		LSide.render(f5);
		RSide.render(f5);
		Nose.render(f5);
		Mouth.render(f5);
		MouthOpen.render(f5);
		REar.render(f5);
		LEar.render(f5);
		Body.render(f5);
		Tail.render(f5);
		Leg4A.render(f5);
		Leg4D.render(f5);
		Leg4B.render(f5);
		Leg4C.render(f5);
		Leg3B.render(f5);
		Leg2A.render(f5);
		Leg2B.render(f5);
		Leg2C.render(f5);
		Leg3D.render(f5);
		Leg3C.render(f5);
		Leg3A.render(f5);
		Leg1A.render(f5);
		Leg1B.render(f5);
		Leg1C.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}