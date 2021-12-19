package com.p2082ss.android.medialib.p2155b;

import android.opengl.GLES20;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.vesdk.C85315al;

/* renamed from: com.ss.android.medialib.b.c */
public class C29988c {

    /* renamed from: a */
    public int f71540a = GLES20.glCreateProgram();

    /* renamed from: b */
    private C29989a f71541b;

    /* renamed from: c */
    private C29989a f71542c;

    static {
        Covode.recordClassIndex(36440);
    }

    /* renamed from: com.ss.android.medialib.b.c$a */
    public static class C29989a {

        /* renamed from: b */
        static final /* synthetic */ boolean f71543b = true;

        /* renamed from: a */
        public int f71544a;

        /* renamed from: c */
        private int f71545c;

        public C29989a() {
        }

        static {
            Covode.recordClassIndex(36441);
        }

        /* renamed from: a */
        public final void mo52805a() {
            int i = this.f71544a;
            if (i != 0) {
                GLES20.glDeleteShader(i);
                this.f71544a = 0;
            }
        }

        public C29989a(String str, int i) {
            this.f71545c = i;
            int glCreateShader = GLES20.glCreateShader(i);
            if (glCreateShader != 0) {
                GLES20.glShaderSource(glCreateShader, str);
                GLES20.glCompileShader(glCreateShader);
                int[] iArr = {0};
                GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
                if (iArr[0] != 1) {
                    C85315al.m146642d("ProgramObject", GLES20.glGetShaderInfoLog(glCreateShader));
                    GLES20.glDeleteShader(glCreateShader);
                    glCreateShader = 0;
                }
            }
            this.f71544a = glCreateShader;
            if (!f71543b) {
                if (glCreateShader == 0) {
                    throw new AssertionError("Shader Create Failed!");
                }
            } else if (glCreateShader == 0) {
                C85315al.m146642d("ProgramObject", "glCreateShader Failed!...");
            }
        }
    }

    /* renamed from: a */
    public final void mo52802a() {
        int i = this.f71540a;
        if (i != 0) {
            GLES20.glDeleteProgram(i);
            this.f71540a = 0;
        }
    }

    /* renamed from: b */
    public final void mo52804b(String str) {
        GLES20.glBindAttribLocation(this.f71540a, 0, str);
    }

    /* renamed from: a */
    public final int mo52801a(String str) {
        int glGetUniformLocation = GLES20.glGetUniformLocation(this.f71540a, str);
        if (glGetUniformLocation < 0) {
            C85315al.m146642d("ProgramObject", C1764a.m5928a("uniform name %s does not exist", new Object[]{str}));
        }
        return glGetUniformLocation;
    }

    /* renamed from: a */
    public final boolean mo52803a(String str, String str2) {
        return m60523a(str, str2, this.f71540a);
    }

    /* renamed from: a */
    private boolean m60523a(String str, String str2, int i) {
        if (i == 0) {
            i = GLES20.glCreateProgram();
        }
        if (i == 0) {
            C85315al.m146642d("ProgramObject", "Invalid Program ID! Check if the context is binded!");
        }
        C29989a aVar = this.f71541b;
        if (aVar != null) {
            aVar.mo52805a();
        }
        C29989a aVar2 = this.f71542c;
        if (aVar2 != null) {
            aVar2.mo52805a();
        }
        this.f71541b = new C29989a(str, 35633);
        this.f71542c = new C29989a(str2, 35632);
        GLES20.glAttachShader(i, this.f71541b.f71544a);
        GLES20.glAttachShader(i, this.f71542c.f71544a);
        C29983a.m60516a("AttachShaders...");
        GLES20.glLinkProgram(i);
        int[] iArr = {0};
        GLES20.glGetProgramiv(i, 35714, iArr, 0);
        this.f71541b.mo52805a();
        this.f71542c.mo52805a();
        this.f71541b = null;
        this.f71542c = null;
        if (iArr[0] != 1) {
            C85315al.m146642d("ProgramObject", GLES20.glGetProgramInfoLog(i));
            return false;
        }
        int i2 = this.f71540a;
        if (!(i2 == i || i2 == 0)) {
            GLES20.glDeleteProgram(i2);
        }
        this.f71540a = i;
        return true;
    }
}
