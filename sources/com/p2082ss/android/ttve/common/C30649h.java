package com.p2082ss.android.ttve.common;

import android.opengl.GLES20;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.vesdk.C85315al;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* renamed from: com.ss.android.ttve.common.h */
public class C30649h {

    /* renamed from: a */
    public static final float[] f73271a = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};

    /* renamed from: b */
    protected C30643d f73272b;

    /* renamed from: c */
    private int f73273c;

    /* renamed from: d */
    private int f73274d;

    /* renamed from: e */
    private int f73275e;

    /* renamed from: f */
    private int f73276f;

    protected C30649h() {
    }

    /* renamed from: b */
    public final void mo54948b() {
        this.f73272b.mo54934a();
        GLES20.glDeleteBuffers(1, new int[]{this.f73273c}, 0);
        this.f73272b = null;
        this.f73273c = 0;
    }

    static {
        Covode.recordClassIndex(37191);
    }

    /* renamed from: c */
    public final void mo54949c() {
        float cos = (float) Math.cos(0.0d);
        float sin = (float) Math.sin(0.0d);
        GLES20.glUseProgram(this.f73272b.f73252a);
        GLES20.glUniformMatrix2fv(this.f73274d, 1, false, new float[]{cos, sin, -sin, cos}, 0);
    }

    /* renamed from: a */
    public static C30649h m62990a() {
        C30649h hVar = new C30649h();
        C30643d dVar = new C30643d();
        hVar.f73272b = dVar;
        if (!dVar.mo54936a("attribute vec2 vPosition;\nvarying vec2 texCoord;\nuniform mat2 rotation;\nuniform vec2 flipScale;\nvoid main()\n{\n   gl_Position = vec4(vPosition, 0.0, 1.0);\n   texCoord = flipScale * (vPosition / 2.0 * rotation) + 0.5;\n}", "precision mediump float;\nvarying vec2 texCoord;\nuniform sampler2D inputImageTexture;\nuniform int debug;\nvoid main()\n{\n   gl_FragColor = texture2D(inputImageTexture, texCoord);\n   if (debug != 0) gl_FragColor.rg = texCoord;\n}")) {
            hVar.f73272b.mo54934a();
            hVar.f73272b = null;
            C85315al.m146642d("TETextureDrawer", "TETextureDrawer create failed!");
            hVar.mo54948b();
            return null;
        }
        GLES20.glUseProgram(hVar.f73272b.f73252a);
        hVar.f73274d = hVar.f73272b.mo54933a("rotation");
        hVar.f73275e = hVar.f73272b.mo54933a("flipScale");
        hVar.f73276f = hVar.f73272b.mo54933a("debug");
        hVar.f73272b.mo54935a("vPosition", 0);
        int[] iArr = new int[1];
        GLES20.glGenBuffers(1, iArr, 0);
        int i = iArr[0];
        hVar.f73273c = i;
        GLES20.glBindBuffer(34962, i);
        float[] fArr = f73271a;
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        asFloatBuffer.put(fArr).position(0);
        GLES20.glBufferData(34962, 32, asFloatBuffer, 35044);
        hVar.mo54949c();
        hVar.mo54946a(1.0f);
        GLES20.glUseProgram(hVar.f73272b.f73252a);
        GLES20.glUniform1i(hVar.f73276f, 0);
        C85315al.m146637a("TETextureDrawer", "init: success.");
        return hVar;
    }

    /* renamed from: a */
    public final void mo54946a(float f) {
        GLES20.glUseProgram(this.f73272b.f73252a);
        GLES20.glUniform2f(this.f73275e, 1.0f, 1.0f / f);
    }

    /* renamed from: a */
    public final void mo54947a(int i) {
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, i);
        GLES20.glBindBuffer(34962, this.f73273c);
        GLES20.glEnableVertexAttribArray(0);
        GLES20.glVertexAttribPointer(0, 2, 5126, false, 0, 0);
        GLES20.glUseProgram(this.f73272b.f73252a);
        GLES20.glDrawArrays(5, 0, 4);
    }
}
