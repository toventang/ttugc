package com.p2082ss.android.ttve.common;

import android.opengl.GLES20;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.vesdk.C85315al;

/* renamed from: com.ss.android.ttve.common.d */
public final class C30643d {

    /* renamed from: a */
    public int f73252a = GLES20.glCreateProgram();

    /* renamed from: b */
    private C30644a f73253b;

    /* renamed from: c */
    private C30644a f73254c;

    static {
        Covode.recordClassIndex(37185);
    }

    /* renamed from: com.ss.android.ttve.common.d$a */
    public static class C30644a {

        /* renamed from: a */
        public int f73255a;

        /* renamed from: b */
        private int f73256b;

        static {
            Covode.recordClassIndex(37186);
        }

        public C30644a() {
        }

        /* renamed from: a */
        public final void mo54937a() {
            int i = this.f73255a;
            if (i != 0) {
                GLES20.glDeleteShader(i);
                this.f73255a = 0;
            }
        }

        public C30644a(String str, int i) {
            this.f73256b = i;
            int glGetError = GLES20.glGetError();
            if (glGetError != 0) {
                C85315al.m146642d("TEProgramObject", "before glCreateShader, glError: ".concat(String.valueOf(glGetError)));
            }
            int glCreateShader = GLES20.glCreateShader(i);
            int glGetError2 = GLES20.glGetError();
            if (glGetError2 != 0) {
                C85315al.m146642d("TEProgramObject", "after glCreateShader, glError: ".concat(String.valueOf(glGetError2)));
            }
            if (glCreateShader != 0) {
                GLES20.glShaderSource(glCreateShader, str);
                GLES20.glCompileShader(glCreateShader);
                int glGetError3 = GLES20.glGetError();
                if (glGetError3 != 0) {
                    C85315al.m146642d("TEProgramObject", "after glCompileShader, glError: ".concat(String.valueOf(glGetError3)));
                }
                int[] iArr = {0};
                GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
                if (iArr[0] != 1) {
                    C85315al.m146642d("TEProgramObject", GLES20.glGetShaderInfoLog(glCreateShader));
                    GLES20.glDeleteShader(glCreateShader);
                    glCreateShader = 0;
                }
            }
            this.f73255a = glCreateShader;
            if (glCreateShader == 0) {
                throw new AssertionError("Shader Create Failed!");
            }
        }
    }

    /* renamed from: a */
    public final void mo54934a() {
        int i = this.f73252a;
        if (i != 0) {
            GLES20.glDeleteProgram(i);
            this.f73252a = 0;
        }
    }

    /* renamed from: a */
    public final int mo54933a(String str) {
        int glGetUniformLocation = GLES20.glGetUniformLocation(this.f73252a, str);
        if (glGetUniformLocation < 0) {
            C1764a.m5928a("uniform name %s does not exist", new Object[]{str});
        }
        return glGetUniformLocation;
    }

    /* renamed from: a */
    public final void mo54935a(String str, int i) {
        GLES20.glBindAttribLocation(this.f73252a, i, str);
    }

    /* renamed from: a */
    public final boolean mo54936a(String str, String str2) {
        String str3;
        int i = this.f73252a;
        if (i == 0) {
            i = GLES20.glCreateProgram();
        }
        C30644a aVar = this.f73253b;
        if (aVar != null) {
            aVar.mo54937a();
        }
        C30644a aVar2 = this.f73254c;
        if (aVar2 != null) {
            aVar2.mo54937a();
        }
        this.f73253b = new C30644a(str, 35633);
        this.f73254c = new C30644a(str2, 35632);
        GLES20.glAttachShader(i, this.f73253b.f73255a);
        GLES20.glAttachShader(i, this.f73254c.f73255a);
        int glGetError = GLES20.glGetError();
        for (int i2 = 0; i2 < 32 && glGetError != 0; i2++) {
            switch (glGetError) {
                case 1280:
                    str3 = "invalid enum";
                    break;
                case 1281:
                    str3 = "invalid value";
                    break;
                case 1282:
                    str3 = "invalid operation";
                    break;
                case 1283:
                case 1284:
                default:
                    str3 = "unknown error";
                    break;
                case 1285:
                    str3 = "out of memory";
                    break;
                case 1286:
                    str3 = "invalid framebuffer operation";
                    break;
            }
            C1764a.m5928a("After tag \"%s\" glGetError %s(0x%x) ", new Object[]{"AttachShaders...", str3, Integer.valueOf(glGetError)});
            glGetError = GLES20.glGetError();
        }
        GLES20.glLinkProgram(i);
        int[] iArr = {0};
        GLES20.glGetProgramiv(i, 35714, iArr, 0);
        this.f73253b.mo54937a();
        this.f73254c.mo54937a();
        this.f73253b = null;
        this.f73254c = null;
        if (iArr[0] != 1) {
            GLES20.glGetProgramInfoLog(i);
            return false;
        }
        int i3 = this.f73252a;
        if (!(i3 == i || i3 == 0)) {
            GLES20.glDeleteProgram(i3);
        }
        this.f73252a = i;
        return true;
    }
}
