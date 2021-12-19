package com.benchmark.tools;

import android.opengl.GLES20;
import com.bytedance.covode.number.Covode;

/* renamed from: com.benchmark.tools.c */
public class C2514c {

    /* renamed from: a */
    public static final float[] f7623a = {-1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f, -1.0f, 1.0f};

    /* renamed from: b */
    private static final String f7624b = C2514c.class.getSimpleName();

    static {
        Covode.recordClassIndex(2885);
    }

    /* renamed from: a */
    public static int m7390a(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        if (glCreateShader == 0) {
            return glCreateShader;
        }
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] == 1) {
            return glCreateShader;
        }
        GLES20.glDeleteShader(glCreateShader);
        return 0;
    }
}
