package com.p2082ss.android.ugc.aweme.livewallpaper.p3415c;

import android.opengl.EGL14;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Build;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.livewallpaper.c.i */
public final class C58859i {

    /* renamed from: a */
    static boolean f133973a = m108122b();

    /* renamed from: b */
    public static final float[] f133974b;

    /* renamed from: a */
    public static boolean m108121a() {
        int glGetError = GLES20.glGetError();
        if (glGetError == 0) {
            return true;
        }
        Integer.toHexString(glGetError);
        return false;
    }

    /* renamed from: b */
    private static boolean m108122b() {
        int i = Build.VERSION.SDK_INT;
        try {
            EGL14.eglGetCurrentContext();
            return true;
        } catch (NoClassDefFoundError unused) {
            return false;
        }
    }

    static {
        Covode.recordClassIndex(69173);
        float[] fArr = new float[16];
        f133974b = fArr;
        Matrix.setIdentityM(fArr, 0);
    }

    /* renamed from: a */
    public static int m108120a(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        m108121a();
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        GLES20.glGetShaderInfoLog(glCreateShader);
        GLES20.glDeleteShader(glCreateShader);
        return 0;
    }

    /* renamed from: a */
    public static int m108119a(int i, int i2) {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i3 = iArr[0];
        m108121a();
        GLES20.glBindTexture(3553, i3);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameterf(3553, 10242, 33071.0f);
        GLES20.glTexParameterf(3553, 10243, 33071.0f);
        m108121a();
        GLES20.glTexImage2D(3553, 0, 6408, i, i2, 0, 6408, 5121, null);
        m108121a();
        return i3;
    }
}
