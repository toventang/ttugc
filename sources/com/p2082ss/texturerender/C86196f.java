package com.p2082ss.texturerender;

import android.opengl.GLES20;
import android.opengl.GLUtils;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.texturerender.f */
public final class C86196f {
    static {
        Covode.recordClassIndex(101339);
    }

    /* renamed from: a */
    public static int m148101a(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        if (glCreateShader != 0) {
            GLES20.glShaderSource(glCreateShader, str);
            GLES20.glCompileShader(glCreateShader);
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
            if (iArr[0] != 0) {
                return glCreateShader;
            }
            C86203l.m148116a("ShaderHelper", "Error compiling shader: " + GLES20.glGetShaderInfoLog(glCreateShader));
            GLES20.glDeleteShader(glCreateShader);
        }
        C86203l.m148116a("ShaderHelper", "error = " + GLUtils.getEGLErrorString(GLES20.glGetError()));
        throw new RuntimeException("Error creating shader.");
    }
}
