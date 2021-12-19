package com.p2082ss.android.ttve.common;

import android.graphics.RectF;
import android.opengl.GLES20;
import android.opengl.Matrix;
import com.bytedance.covode.number.Covode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* renamed from: com.ss.android.ttve.common.i */
public class C30650i {

    /* renamed from: a */
    public static final float[] f73277a = {-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f};

    /* renamed from: b */
    public static float[] f73278b = {0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f};

    /* renamed from: c */
    public C30643d f73279c;

    /* renamed from: d */
    public int[] f73280d;

    /* renamed from: e */
    public FloatBuffer f73281e;

    /* renamed from: f */
    public FloatBuffer f73282f;

    /* renamed from: g */
    public int f73283g;

    /* renamed from: h */
    private RectF f73284h;

    /* renamed from: i */
    private int f73285i = Integer.MAX_VALUE;

    static {
        Covode.recordClassIndex(37192);
    }

    /* renamed from: a */
    public final void mo54950a() {
        this.f73279c.mo54934a();
        int[] iArr = this.f73280d;
        if (iArr != null) {
            GLES20.glDeleteBuffers(iArr.length, iArr, 0);
            this.f73280d = null;
        }
        this.f73279c = null;
        this.f73281e = null;
        this.f73282f = null;
    }

    /* renamed from: a */
    public static FloatBuffer m62995a(float[] fArr) {
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        asFloatBuffer.put(fArr, 0, fArr.length).position(0);
        return asFloatBuffer;
    }

    /* renamed from: a */
    public final void mo54951a(int i) {
        GLES20.glUseProgram(this.f73279c.f73252a);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i);
        GLES20.glBindBuffer(34962, this.f73280d[0]);
        GLES20.glEnableVertexAttribArray(0);
        GLES20.glVertexAttribPointer(0, 2, 5126, false, 0, 0);
        GLES20.glBindBuffer(34962, this.f73280d[1]);
        GLES20.glEnableVertexAttribArray(1);
        GLES20.glVertexAttribPointer(1, 2, 5126, false, 0, 0);
        GLES20.glDrawArrays(5, 0, 4);
    }

    /* renamed from: a */
    public final void mo54953a(RectF rectF) {
        if (rectF != null) {
            RectF rectF2 = this.f73284h;
            if (rectF2 == null || !rectF.equals(rectF2)) {
                this.f73284h = rectF;
                f73278b[0] = rectF.left;
                f73278b[1] = 1.0f - rectF.top;
                f73278b[2] = rectF.left;
                f73278b[3] = 1.0f - rectF.bottom;
                f73278b[4] = rectF.right;
                f73278b[5] = 1.0f - rectF.top;
                f73278b[6] = rectF.right;
                f73278b[7] = 1.0f - rectF.bottom;
                this.f73282f = m62995a(f73278b);
                GLES20.glUseProgram(this.f73279c.f73252a);
                GLES20.glBindBuffer(34962, this.f73280d[1]);
                this.f73282f.position(0);
                GLES20.glBufferSubData(34962, 0, 32, this.f73282f);
            }
        }
    }

    /* renamed from: a */
    public final void mo54952a(int i, boolean z, int i2, int i3, int i4, int i5) {
        float f;
        float f2;
        GLES20.glUseProgram(this.f73279c.f73252a);
        if (i2 <= 0 || i3 <= 0 || i4 <= 0 || i5 <= 0) {
            float[] fArr = new float[16];
            Matrix.setIdentityM(fArr, 0);
            GLES20.glUniformMatrix4fv(this.f73283g, 1, false, fArr, 0);
        } else if (this.f73285i != i) {
            this.f73285i = i;
            float[] fArr2 = new float[16];
            Matrix.setIdentityM(fArr2, 0);
            Matrix.rotateM(fArr2, 0, (float) i, 0.0f, 0.0f, 1.0f);
            if (z) {
                Matrix.rotateM(fArr2, 0, 180.0f, 1.0f, 0.0f, 0.0f);
            }
            if (Math.abs(i) == 90 || Math.abs(i) == 270) {
                f = (float) i3;
            } else {
                f = (float) i2;
            }
            if (Math.abs(i) == 90 || Math.abs(i) == 270) {
                f2 = (float) i2;
            } else {
                f2 = (float) i3;
            }
            float f3 = (float) i4;
            float f4 = f3 / f;
            float f5 = (float) i5;
            float f6 = f5 / f2;
            if (f4 <= f6) {
                f4 = f6;
            }
            Matrix.scaleM(fArr2, 0, (((float) i2) / 2.0f) * f4, (((float) i3) / 2.0f) * f4, 1.0f);
            float[] fArr3 = new float[16];
            Matrix.setIdentityM(fArr3, 0);
            Matrix.setLookAtM(fArr3, 0, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
            float[] fArr4 = new float[16];
            Matrix.setIdentityM(fArr4, 0);
            Matrix.orthoM(fArr4, 0, ((float) (-i4)) / 2.0f, f3 / 2.0f, ((float) (-i5)) / 2.0f, f5 / 2.0f, -2.0f, 2.0f);
            float[] fArr5 = new float[16];
            Matrix.setIdentityM(fArr5, 0);
            Matrix.multiplyMM(fArr5, 0, fArr3, 0, fArr2, 0);
            float[] fArr6 = new float[16];
            Matrix.setIdentityM(fArr6, 0);
            Matrix.multiplyMM(fArr6, 0, fArr4, 0, fArr5, 0);
            GLES20.glUniformMatrix4fv(this.f73283g, 1, false, fArr6, 0);
        }
    }
}
