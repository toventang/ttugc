package com.p2082ss.android.medialib;

import android.opengl.GLES20;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.medialib.p2155b.C29988c;
import com.p2082ss.android.vesdk.C85315al;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* renamed from: com.ss.android.medialib.i */
public final class C30009i {

    /* renamed from: a */
    public static final float[] f71613a = {-1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f, -1.0f, 1.0f};

    /* renamed from: b */
    protected C29988c f71614b;

    /* renamed from: c */
    private int f71615c;

    /* renamed from: d */
    private int f71616d;

    /* renamed from: e */
    private int f71617e;

    /* renamed from: f */
    private int f71618f;

    /* renamed from: g */
    private int f71619g;

    /* renamed from: h */
    private int f71620h;

    /* renamed from: i */
    private int f71621i;

    /* renamed from: j */
    private int f71622j;

    /* renamed from: k */
    private int f71623k;

    /* renamed from: l */
    private int f71624l;

    /* renamed from: m */
    private int f71625m;

    /* renamed from: n */
    private int f71626n;

    protected C30009i() {
    }

    /* renamed from: a */
    public final void mo52835a() {
        this.f71614b.mo52802a();
        GLES20.glDeleteBuffers(1, new int[]{this.f71615c}, 0);
        this.f71614b = null;
        this.f71615c = 0;
    }

    static {
        Covode.recordClassIndex(36462);
    }

    /* renamed from: b */
    public final void mo52839b() {
        float cos = (float) Math.cos(0.0d);
        float sin = (float) Math.sin(0.0d);
        GLES20.glUseProgram(this.f71614b.f71540a);
        GLES20.glUniformMatrix2fv(this.f71616d, 1, false, new float[]{cos, sin, -sin, cos}, 0);
    }

    /* renamed from: b */
    public final void mo52840b(float f) {
        GLES20.glUseProgram(this.f71614b.f71540a);
        GLES20.glUniform1f(this.f71620h, f);
    }

    /* renamed from: a */
    public final void mo52836a(float f) {
        GLES20.glUseProgram(this.f71614b.f71540a);
        GLES20.glUniform2f(this.f71617e, 1.0f, 1.0f / f);
    }

    /* renamed from: a */
    public static C30009i m60557a(float f, float f2) {
        C30009i iVar = new C30009i();
        C29988c cVar = new C29988c();
        iVar.f71614b = cVar;
        if (!cVar.mo52803a("attribute highp vec2 vPosition;\nvarying vec2 texCoord;\nuniform mat2 rotation;\nuniform vec2 flipScale;\nvoid main()\n{\n   gl_Position = vec4(vPosition, 0.0, 1.0);\n   texCoord = flipScale * (vPosition / 2.0 * rotation) + 0.5;\n}", "precision mediump float;\nvarying vec2 texCoord;\nuniform sampler2D inputImageTexture;\nuniform sampler2D inputImageTexture2;\nuniform float xPos;\nuniform float yPos;\nuniform float bottomPos;\nuniform float rightPos;\nuniform float markAlpha;\nuniform float xAdjust;\nuniform float yAdjust;\nvec4 normalBlend(vec4 c2, vec4 c1)\n{\n   vec4 outputColor;\n   outputColor.r = c1.r * markAlpha + c2.r * c2.a * (1.0 - c1.a);\n   outputColor.g = c1.g * markAlpha + c2.g * c2.a * (1.0 - c1.a);\n   outputColor.b = c1.b * markAlpha + c2.b * c2.a * (1.0 - c1.a);\n   outputColor.a = c1.a + c2.a * (1.0 - c1.a);\n   return outputColor;\n}\nvoid main()\n{\n   highp vec2 cord;\n   cord.x = texCoord.x * xAdjust- (xAdjust - 1.0) * 0.5;\n   cord.y = texCoord.y * yAdjust- (yAdjust - 1.0) * 0.5;\n   vec4 origin;\n   if(cord.x > 0.0 && cord.x < 1.0 && cord.y > 0.0 && cord.y < 1.0)\n   {\n       origin = texture2D(inputImageTexture, cord);\n   } else {\n       origin = vec4(1.0, 1.0, 1.0, 1.0);\n   }\n   vec4 markOverlay;\n   vec2 tmpCoordinate;\n   tmpCoordinate.x = cord.x;\n   tmpCoordinate.y = 1.0 - cord.y;\n   origin.a = origin.a * markAlpha;\n   if( cord.x > xPos && cord.x < bottomPos && cord.y > yPos && cord.y < rightPos )\n   {\n       tmpCoordinate.x = (cord.x - xPos) / (bottomPos - xPos);\n       tmpCoordinate.y = 1.0 - (cord.y - yPos) / (rightPos - yPos);\n       markOverlay = texture2D(inputImageTexture2, tmpCoordinate);\n       markOverlay.a = markOverlay.a * markAlpha;\n       origin = normalBlend(origin, markOverlay);\n   }\n   gl_FragColor = vec4(origin.r, origin.g, origin.b, origin.a);\n}")) {
            iVar.f71614b.mo52802a();
            iVar.f71614b = null;
            C85315al.m146642d("TextureDrawer", "TextureDrawer create failed!");
            iVar.mo52835a();
            return null;
        }
        GLES20.glUseProgram(iVar.f71614b.f71540a);
        iVar.f71616d = iVar.f71614b.mo52801a("rotation");
        iVar.f71617e = iVar.f71614b.mo52801a("flipScale");
        iVar.f71618f = iVar.f71614b.mo52801a("inputImageTexture");
        iVar.f71619g = iVar.f71614b.mo52801a("inputImageTexture2");
        iVar.f71620h = iVar.f71614b.mo52801a("markAlpha");
        iVar.f71621i = iVar.f71614b.mo52801a("xPos");
        iVar.f71622j = iVar.f71614b.mo52801a("yPos");
        iVar.f71623k = iVar.f71614b.mo52801a("bottomPos");
        iVar.f71624l = iVar.f71614b.mo52801a("rightPos");
        iVar.f71625m = iVar.f71614b.mo52801a("xAdjust");
        iVar.f71626n = iVar.f71614b.mo52801a("yAdjust");
        iVar.f71614b.mo52804b("vPosition");
        int[] iArr = new int[1];
        GLES20.glGenBuffers(1, iArr, 0);
        int i = iArr[0];
        iVar.f71615c = i;
        GLES20.glBindBuffer(34962, i);
        float[] fArr = f71613a;
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        asFloatBuffer.put(fArr).position(0);
        GLES20.glBufferData(34962, 32, asFloatBuffer, 35044);
        iVar.mo52839b();
        iVar.mo52836a(1.0f);
        iVar.mo52840b(1.0f);
        GLES20.glUseProgram(iVar.f71614b.f71540a);
        GLES20.glUniform1f(iVar.f71625m, f);
        GLES20.glUniform1f(iVar.f71626n, f2);
        C85315al.m146639b("TextureDrawer", "init: success.");
        return iVar;
    }

    /* renamed from: a */
    public final void mo52838a(int i, int i2) {
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, i);
        GLES20.glUniform1i(this.f71618f, 0);
        GLES20.glActiveTexture(33986);
        GLES20.glBindTexture(3553, i2);
        GLES20.glUniform1i(this.f71619g, 2);
        GLES20.glBindBuffer(34962, this.f71615c);
        GLES20.glEnableVertexAttribArray(0);
        GLES20.glVertexAttribPointer(0, 2, 5126, false, 0, 0);
        GLES20.glUseProgram(this.f71614b.f71540a);
        GLES20.glDrawArrays(6, 0, 4);
    }

    /* renamed from: a */
    public final void mo52837a(float f, float f2, float f3, float f4) {
        GLES20.glUseProgram(this.f71614b.f71540a);
        GLES20.glUniform1f(this.f71621i, f);
        GLES20.glUniform1f(this.f71622j, f2);
        GLES20.glUniform1f(this.f71623k, f3);
        GLES20.glUniform1f(this.f71624l, f4);
    }
}
