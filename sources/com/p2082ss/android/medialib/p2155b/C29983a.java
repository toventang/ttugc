package com.p2082ss.android.medialib.p2155b;

import android.opengl.GLES20;
import com.C1764a;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.medialib.b.a */
public final class C29983a {

    /* renamed from: a */
    public static final float[] f71538a = {-1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f, -1.0f, 1.0f};

    /* renamed from: com.ss.android.medialib.b.a$a */
    public interface AbstractC29984a {
        static {
            Covode.recordClassIndex(36436);
        }
    }

    /* renamed from: com.ss.android.medialib.b.a$b */
    public interface AbstractC29985b {
        static {
            Covode.recordClassIndex(36437);
        }

        /* renamed from: a */
        void mo52797a();

        /* renamed from: b */
        void mo52798b();

        /* renamed from: c */
        int mo52799c();
    }

    /* renamed from: com.ss.android.medialib.b.a$c */
    public interface AbstractC29986c {
        static {
            Covode.recordClassIndex(36438);
        }

        /* renamed from: a */
        void mo52800a(int i);
    }

    static {
        Covode.recordClassIndex(36435);
    }

    /* renamed from: a */
    public static void m60516a(String str) {
        String str2;
        int glGetError = GLES20.glGetError();
        int i = 0;
        while (glGetError != 0) {
            switch (glGetError) {
                case 1280:
                    str2 = "invalid enum";
                    break;
                case 1281:
                    str2 = "invalid value";
                    break;
                case 1282:
                    str2 = "invalid operation";
                    break;
                case 1283:
                case 1284:
                default:
                    str2 = "unknown error";
                    break;
                case 1285:
                    str2 = "out of memory";
                    break;
                case 1286:
                    str2 = "invalid framebuffer operation";
                    break;
            }
            C1764a.m5928a("After tag \"%s\" glGetError %s(0x%x) ", new Object[]{str, str2, Integer.valueOf(glGetError)});
            glGetError = GLES20.glGetError();
            i++;
            if (i >= 32) {
                return;
            }
        }
    }
}
