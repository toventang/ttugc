package com.p2082ss.android.ugc.aweme.live.alphaplayer.p3404f;

import android.content.res.Resources;
import android.opengl.GLES20;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

/* renamed from: com.ss.android.ugc.aweme.live.alphaplayer.f.d */
public final class C58577d {
    static {
        Covode.recordClassIndex(68872);
    }

    /* renamed from: a */
    public static void m107688a() {
        do {
        } while (GLES20.glGetError() != 0);
    }

    /* renamed from: a */
    private static int m107685a(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        if (glCreateShader == 0) {
            return glCreateShader;
        }
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
    public static int m107686a(String str, String str2) {
        int a;
        int a2 = m107685a(35633, str);
        if (a2 == 0 || (a = m107685a(35632, str2)) == 0) {
            return 0;
        }
        int glCreateProgram = GLES20.glCreateProgram();
        if (glCreateProgram != 0) {
            GLES20.glAttachShader(glCreateProgram, a2);
            do {
            } while (GLES20.glGetError() != 0);
            GLES20.glAttachShader(glCreateProgram, a);
            do {
            } while (GLES20.glGetError() != 0);
            GLES20.glLinkProgram(glCreateProgram);
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
            if (iArr[0] != 1) {
                GLES20.glGetProgramInfoLog(glCreateProgram);
                GLES20.glDeleteProgram(glCreateProgram);
                return 0;
            }
        }
        return glCreateProgram;
    }

    /* renamed from: a */
    public static String m107687a(String str, Resources resources) {
        Exception e;
        MethodCollector.m26663i(1435);
        String str2 = null;
        try {
            InputStream open = resources.getAssets().open(str);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                int read = open.read();
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(read);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            open.close();
            String str3 = new String(byteArray, "UTF-8");
            try {
                str2 = str3.replaceAll("\\r\\n", "\n");
            } catch (Exception e2) {
                e = e2;
                str2 = str3;
            }
        } catch (Exception e3) {
            e = e3;
            e.printStackTrace();
            MethodCollector.m26664o(1435);
            return str2;
        }
        MethodCollector.m26664o(1435);
        return str2;
    }
}
