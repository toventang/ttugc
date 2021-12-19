package com.p2082ss.texturerender;

import android.opengl.GLES20;
import android.opengl.GLUtils;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.texturerender.g */
public final class C86197g {
    static {
        Covode.recordClassIndex(101340);
    }

    /* renamed from: a */
    public static int m148102a() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        m148104a("glGenTextures");
        if (iArr[0] != 0) {
            GLES20.glBindTexture(3553, iArr[0]);
            GLES20.glTexParameteri(3553, 10242, 33071);
            GLES20.glTexParameteri(3553, 10243, 33071);
            GLES20.glTexParameteri(3553, 10241, 9729);
            GLES20.glTexParameteri(3553, 10240, 9729);
        }
        return iArr[0];
    }

    /* renamed from: a */
    public static void m148103a(int i) {
        if (i > 0) {
            GLES20.glDeleteFramebuffers(1, new int[i], 0);
        }
    }

    /* renamed from: b */
    public static void m148105b(int i) {
        if (i > 0) {
            GLES20.glDeleteTextures(1, new int[i], 0);
        }
    }

    /* renamed from: a */
    public static boolean m148104a(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError == 0) {
            return false;
        }
        C86203l.m148116a("GLUtils", str + ": gl error = " + GLUtils.getEGLErrorString(glGetError));
        return true;
    }
}
