package com.p2082ss.android.medialib.p2155b;

import android.opengl.GLES20;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.vesdk.C85315al;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* renamed from: com.ss.android.medialib.b.d */
public final class C29990d {

    /* renamed from: a */
    public static final float[] f71546a = {-1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f, -1.0f, 1.0f};

    /* renamed from: b */
    protected C29988c f71547b;

    /* renamed from: c */
    private int f71548c;

    /* renamed from: d */
    private int f71549d;

    /* renamed from: e */
    private int f71550e;

    protected C29990d() {
    }

    /* renamed from: b */
    public final void mo52808b() {
        this.f71547b.mo52802a();
        GLES20.glDeleteBuffers(1, new int[]{this.f71548c}, 0);
        this.f71547b = null;
        this.f71548c = 0;
    }

    static {
        Covode.recordClassIndex(36442);
    }

    /* renamed from: a */
    public static C29990d m60529a() {
        C29990d dVar = new C29990d();
        C29988c cVar = new C29988c();
        dVar.f71547b = cVar;
        if (!cVar.mo52803a("attribute vec2 vPosition;\nvarying vec2 texCoord;\nuniform mat2 rotation;\nuniform vec2 flipScale;\nvoid main()\n{\n   gl_Position = vec4(vPosition, 0.0, 1.0);\n   texCoord = flipScale * (vPosition / 2.0 * rotation) + 0.5;\n}", "precision mediump float;\nvarying vec2 texCoord;\nuniform sampler2D inputImageTexture;\nvoid main()\n{\n   gl_FragColor = texture2D(inputImageTexture, texCoord);\n}")) {
            dVar.f71547b.mo52802a();
            dVar.f71547b = null;
            C85315al.m146642d("TextureDrawer", "TextureDrawer create failed!");
            dVar.mo52808b();
            return null;
        }
        GLES20.glUseProgram(dVar.f71547b.f71540a);
        dVar.f71549d = dVar.f71547b.mo52801a("rotation");
        dVar.f71550e = dVar.f71547b.mo52801a("flipScale");
        dVar.f71547b.mo52804b("vPosition");
        int[] iArr = new int[1];
        GLES20.glGenBuffers(1, iArr, 0);
        int i = iArr[0];
        dVar.f71548c = i;
        GLES20.glBindBuffer(34962, i);
        float[] fArr = f71546a;
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        asFloatBuffer.put(fArr).position(0);
        GLES20.glBufferData(34962, 32, asFloatBuffer, 35044);
        dVar.mo52806a(0.0f);
        dVar.mo52809b(1.0f);
        C85315al.m146639b("TextureDrawer", "init: success.");
        return dVar;
    }

    /* renamed from: a */
    public final void mo52806a(float f) {
        double d = (double) f;
        float cos = (float) Math.cos(d);
        float sin = (float) Math.sin(d);
        GLES20.glUseProgram(this.f71547b.f71540a);
        GLES20.glUniformMatrix2fv(this.f71549d, 1, false, new float[]{cos, sin, -sin, cos}, 0);
    }

    /* renamed from: b */
    public final void mo52809b(float f) {
        GLES20.glUseProgram(this.f71547b.f71540a);
        GLES20.glUniform2f(this.f71550e, 1.0f, 1.0f / f);
    }

    /* renamed from: a */
    public final void mo52807a(int i) {
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, i);
        GLES20.glBindBuffer(34962, this.f71548c);
        GLES20.glEnableVertexAttribArray(0);
        GLES20.glVertexAttribPointer(0, 2, 5126, false, 0, 0);
        GLES20.glUseProgram(this.f71547b.f71540a);
        GLES20.glDrawArrays(6, 0, 4);
    }
}
