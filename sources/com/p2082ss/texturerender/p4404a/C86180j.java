package com.p2082ss.texturerender.p4404a;

import android.opengl.GLES20;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.p2082ss.texturerender.C86196f;
import com.p2082ss.texturerender.C86203l;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* renamed from: com.ss.texturerender.a.j */
public class C86180j extends AbstractC86171a {

    /* renamed from: n */
    public static float[] f192209n = {-1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f};

    /* renamed from: o */
    public static float[] f192210o = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};

    /* renamed from: A */
    protected int f192211A;

    /* renamed from: B */
    protected int f192212B;

    /* renamed from: C */
    protected int f192213C;

    /* renamed from: D */
    protected float f192214D;

    /* renamed from: E */
    protected float f192215E;

    /* renamed from: F */
    protected float f192216F;

    /* renamed from: G */
    protected float f192217G;

    /* renamed from: H */
    protected float f192218H;

    /* renamed from: I */
    protected float[] f192219I;

    /* renamed from: J */
    protected int f192220J;

    /* renamed from: K */
    protected boolean f192221K;

    /* renamed from: L */
    protected boolean f192222L;

    /* renamed from: M */
    private final String f192223M;

    /* renamed from: N */
    private final String f192224N;

    /* renamed from: i */
    int f192225i;

    /* renamed from: j */
    int f192226j;

    /* renamed from: k */
    int f192227k;

    /* renamed from: l */
    int f192228l;

    /* renamed from: m */
    int f192229m;

    /* renamed from: p */
    protected int f192230p;

    /* renamed from: q */
    protected int f192231q;

    /* renamed from: r */
    protected int f192232r;

    /* renamed from: s */
    protected FloatBuffer f192233s;

    /* renamed from: t */
    protected FloatBuffer f192234t;

    /* renamed from: u */
    protected int f192235u;

    /* renamed from: v */
    protected int f192236v;

    /* renamed from: w */
    protected int f192237w;

    /* renamed from: x */
    protected int f192238x;

    /* renamed from: y */
    protected boolean f192239y;

    /* renamed from: z */
    protected int f192240z;

    /* renamed from: b */
    public int mo136491b() {
        return 0;
    }

    /* renamed from: c */
    public int mo136492c() {
        return 0;
    }

    @Override // com.p2082ss.texturerender.p4404a.AbstractC86171a
    /* renamed from: a */
    public void mo136473a(int i, int i2) {
        boolean z = false;
        if (i != 26) {
            switch (i) {
                case 29:
                    int i3 = this.f192220J;
                    if (i3 != i2) {
                        m148031a(this.f192234t, i2 - i3);
                        this.f192220J = i2;
                        return;
                    }
                    return;
                case 30:
                    if (this.f192221K != (i2 > 0)) {
                        if (i2 > 0) {
                            z = true;
                        }
                        this.f192221K = z;
                        m148030a(30, this.f192234t);
                        return;
                    }
                    return;
                case 31:
                    if (this.f192222L != (i2 > 0)) {
                        if (i2 > 0) {
                            z = true;
                        }
                        this.f192222L = z;
                        m148030a(31, this.f192234t);
                        return;
                    }
                    return;
                default:
                    switch (i) {
                        case 10006:
                            this.f192235u = i2;
                            return;
                        case 10007:
                            this.f192236v = i2;
                            return;
                        case 10008:
                            this.f192237w = i2;
                            return;
                        case 10009:
                            this.f192238x = i2;
                            return;
                        case 10010:
                            if (i2 == 1) {
                                z = true;
                            }
                            this.f192239y = z;
                            return;
                        default:
                            super.mo136473a(i, i2);
                            return;
                    }
            }
        } else if (this.f192213C != i2) {
            FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(f192210o.length * this.f192229m).order(ByteOrder.nativeOrder()).asFloatBuffer();
            this.f192234t = asFloatBuffer;
            asFloatBuffer.put(f192210o).position(0);
            this.f192213C = i2;
            m148032d();
        }
    }

    public C86180j() {
        this(7);
    }

    @Override // com.p2082ss.texturerender.p4404a.AbstractC86171a
    /* renamed from: a */
    public AbstractC86171a mo136470a() {
        int i = this.f192230p;
        if (i > 0) {
            GLES20.glDeleteProgram(i);
        }
        return super.mo136470a();
    }

    /* renamed from: d */
    private void m148032d() {
        int i = this.f192220J;
        if (i != 0) {
            m148031a(this.f192234t, i);
        }
        if (this.f192221K) {
            m148030a(30, this.f192234t);
        }
        if (this.f192222L) {
            m148030a(31, this.f192234t);
        }
    }

    static {
        Covode.recordClassIndex(101323);
    }

    @Override // com.p2082ss.texturerender.p4404a.AbstractC86171a
    /* renamed from: b */
    public String mo136476b(int i) {
        if (i == 11000) {
            return "attribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position =  aPosition;\n  vTextureCoord = aTextureCoord.xy;\n}\n";
        }
        if (i != 11001) {
            return super.mo136476b(i);
        }
        return "precision mediump float;\nvarying vec2 vTextureCoord;\nuniform sampler2D sTexture;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n";
    }

    public C86180j(int i) {
        super(i);
        this.f192223M = "attribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position =  aPosition;\n  vTextureCoord = aTextureCoord.xy;\n}\n";
        this.f192224N = "precision mediump float;\nvarying vec2 vTextureCoord;\nuniform sampler2D sTexture;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n";
        this.f192225i = 12;
        this.f192226j = 8;
        this.f192229m = 4;
        this.f192235u = -1;
        this.f192236v = -1;
        this.f192239y = true;
        this.f192213C = 1;
        this.f192214D = 0.5f;
        this.f192217G = 1.0f;
        this.f192218H = 1.0f;
        this.f192173b = 3553;
    }

    @Override // com.p2082ss.texturerender.p4404a.AbstractC86171a
    /* renamed from: b */
    public void mo136477b(Bundle bundle) {
        if (bundle != null) {
            int i = bundle.getInt("action", -1);
            if (bundle.getInt("effect_type", -1) != 11) {
                return;
            }
            if (i == 21 || i == 28) {
                float f = bundle.getFloat("width", 1.0f);
                float f2 = bundle.getFloat("height", 1.0f);
                float f3 = 0.0f;
                float f4 = bundle.getFloat("x", 0.0f);
                float f5 = bundle.getFloat("y", 0.0f);
                if (f4 <= 1.0f && f4 >= 0.0f && f5 <= 1.0f && f5 >= 0.0f && f > 0.0f && f2 > 0.0f) {
                    if (f5 != this.f192216F || f4 != this.f192215E || f != this.f192217G || f2 != this.f192218H) {
                        this.f192217G = f;
                        this.f192218H = f2;
                        this.f192215E = f4;
                        this.f192216F = f5;
                        if (f4 < 0.0f) {
                            f4 = 0.0f;
                        }
                        this.f192215E = f4;
                        if (f5 >= 0.0f) {
                            f3 = f5;
                        }
                        this.f192216F = f3;
                        if (f4 + f > 1.0f) {
                            f = 1.0f - f4;
                        }
                        this.f192217G = f;
                        if (f3 + f2 > 1.0f) {
                            f2 = 1.0f - f3;
                        }
                        this.f192218H = f2;
                        this.f192219I = new float[]{f4, f3, f4 + f, f3, f4, f3 + f2, f4 + f, f3 + f2};
                        C86203l.m148116a("TR_GLDefaultFilter", "param set success, bundle:".concat(String.valueOf(bundle)));
                    }
                }
            }
        }
    }

    @Override // com.p2082ss.texturerender.p4404a.AbstractC86171a
    /* renamed from: a */
    public int mo136469a(Bundle bundle) {
        int a = C86196f.m148101a(35633, mo136476b(11000));
        int a2 = C86196f.m148101a(35632, mo136476b(11001));
        int glCreateProgram = GLES20.glCreateProgram();
        if (glCreateProgram != 0) {
            GLES20.glAttachShader(glCreateProgram, a);
            GLES20.glAttachShader(glCreateProgram, a2);
            GLES20.glLinkProgram(glCreateProgram);
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
            if (iArr[0] == 0) {
                C86203l.m148116a("ShaderHelper", "Error compiling program: " + GLES20.glGetProgramInfoLog(glCreateProgram));
                GLES20.glDeleteProgram(glCreateProgram);
            } else {
                this.f192230p = glCreateProgram;
                this.f192240z = GLES20.glGetUniformLocation(glCreateProgram, "sTexture");
                FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(f192210o.length * this.f192229m).order(ByteOrder.nativeOrder()).asFloatBuffer();
                this.f192234t = asFloatBuffer;
                asFloatBuffer.put(f192210o).position(0);
                FloatBuffer asFloatBuffer2 = ByteBuffer.allocateDirect(f192209n.length * this.f192229m).order(ByteOrder.nativeOrder()).asFloatBuffer();
                this.f192233s = asFloatBuffer2;
                asFloatBuffer2.put(f192209n).position(0);
                this.f192231q = GLES20.glGetAttribLocation(this.f192230p, "aPosition");
                this.f192232r = GLES20.glGetAttribLocation(this.f192230p, "aTextureCoord");
                return 0;
            }
        }
        throw new RuntimeException("Error creating program.");
    }

    @Override // com.p2082ss.texturerender.p4404a.AbstractC86171a
    /* renamed from: a */
    public void mo136472a(int i, float f) {
        if (i == 27) {
            this.f192214D = f;
        }
    }

    @Override // com.p2082ss.texturerender.p4404a.AbstractC86171a
    /* renamed from: a */
    public final void mo136474a(int i, float[] fArr) {
        if (i != 13000) {
            super.mo136474a(i, fArr);
        } else if (fArr != null) {
            this.f192234t.position(this.f192228l);
            this.f192234t.put(fArr);
        }
    }

    /* renamed from: a */
    private void m148030a(int i, FloatBuffer floatBuffer) {
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(f192210o.length * this.f192229m).order(ByteOrder.nativeOrder()).asFloatBuffer();
        floatBuffer.rewind();
        asFloatBuffer.put(floatBuffer);
        floatBuffer.rewind();
        asFloatBuffer.flip();
        if (i == 30) {
            this.f192234t.put(0, asFloatBuffer.get(2));
            this.f192234t.put(1, asFloatBuffer.get(3));
            this.f192234t.put(2, asFloatBuffer.get(0));
            this.f192234t.put(3, asFloatBuffer.get(1));
            this.f192234t.put(4, asFloatBuffer.get(6));
            this.f192234t.put(5, asFloatBuffer.get(7));
            this.f192234t.put(6, asFloatBuffer.get(4));
            this.f192234t.put(7, asFloatBuffer.get(5));
        } else if (i == 31) {
            this.f192234t.put(0, asFloatBuffer.get(4));
            this.f192234t.put(1, asFloatBuffer.get(5));
            this.f192234t.put(2, asFloatBuffer.get(6));
            this.f192234t.put(3, asFloatBuffer.get(7));
            this.f192234t.put(4, asFloatBuffer.get(0));
            this.f192234t.put(5, asFloatBuffer.get(1));
            this.f192234t.put(6, asFloatBuffer.get(2));
            this.f192234t.put(7, asFloatBuffer.get(3));
        } else {
            this.f192234t.put(asFloatBuffer).position(this.f192228l);
        }
        asFloatBuffer.clear();
    }

    /* renamed from: a */
    private void m148031a(FloatBuffer floatBuffer, int i) {
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(f192210o.length * this.f192229m).order(ByteOrder.nativeOrder()).asFloatBuffer();
        floatBuffer.rewind();
        asFloatBuffer.put(floatBuffer);
        floatBuffer.rewind();
        asFloatBuffer.flip();
        if (i < 0) {
            i += 360;
        }
        if (i == 90) {
            this.f192234t.put(0, asFloatBuffer.get(2));
            this.f192234t.put(1, asFloatBuffer.get(3));
            this.f192234t.put(2, asFloatBuffer.get(6));
            this.f192234t.put(3, asFloatBuffer.get(7));
            this.f192234t.put(4, asFloatBuffer.get(0));
            this.f192234t.put(5, asFloatBuffer.get(1));
            this.f192234t.put(6, asFloatBuffer.get(4));
            this.f192234t.put(7, asFloatBuffer.get(5));
        } else if (i == 180) {
            this.f192234t.put(0, asFloatBuffer.get(6));
            this.f192234t.put(1, asFloatBuffer.get(7));
            this.f192234t.put(2, asFloatBuffer.get(4));
            this.f192234t.put(3, asFloatBuffer.get(5));
            this.f192234t.put(4, asFloatBuffer.get(2));
            this.f192234t.put(5, asFloatBuffer.get(3));
            this.f192234t.put(6, asFloatBuffer.get(0));
            this.f192234t.put(7, asFloatBuffer.get(1));
        } else if (i == 270) {
            this.f192234t.put(0, asFloatBuffer.get(4));
            this.f192234t.put(1, asFloatBuffer.get(5));
            this.f192234t.put(2, asFloatBuffer.get(0));
            this.f192234t.put(3, asFloatBuffer.get(1));
            this.f192234t.put(4, asFloatBuffer.get(6));
            this.f192234t.put(5, asFloatBuffer.get(7));
            this.f192234t.put(6, asFloatBuffer.get(2));
            this.f192234t.put(7, asFloatBuffer.get(3));
        } else {
            this.f192234t.put(asFloatBuffer).position(this.f192228l);
        }
        asFloatBuffer.clear();
    }

    @Override // com.p2082ss.texturerender.p4404a.AbstractC86171a
    /* renamed from: a */
    public C86176f mo136471a(C86176f fVar, C86179i iVar) {
        C86176f fVar2;
        if (fVar.f192205e != this.f192173b) {
            C86203l.m148116a(getClass().getSimpleName(), "error, texture miss match, accept:" + this.f192173b + ",in:" + fVar.f192205e);
            return fVar;
        }
        int round = Math.round(((float) fVar.f192203c) * this.f192217G);
        int round2 = Math.round(((float) fVar.f192204d) * this.f192218H);
        if (iVar != null) {
            this.f192211A = round;
            this.f192212B = round2;
            this.f192235u = round;
            this.f192236v = round2;
            this.f192238x = 0;
            this.f192237w = 0;
            mo136474a(13000, this.f192219I);
        } else {
            int i = this.f192235u;
            int i2 = this.f192236v;
            float f = (float) round2;
            float f2 = (float) round;
            float f3 = (f * 1.0f) / f2;
            float f4 = ((float) i2) * 1.0f;
            float f5 = (float) i;
            float f6 = f4 / f5;
            int i3 = this.f192213C;
            if (i3 == 0) {
                if (f6 > f3) {
                    int i4 = this.f192220J;
                    if (i4 == 90 || i4 == 270) {
                        int min = Math.min((int) (f4 * f3), i);
                        this.f192235u = min;
                        int i5 = (int) ((((float) min) * 1.0f) / f3);
                        this.f192236v = i5;
                        float f7 = (float) (i - min);
                        float f8 = this.f192214D;
                        this.f192237w = (int) (f7 * f8);
                        this.f192238x = (int) (((float) (i2 - i5)) * f8);
                    } else {
                        this.f192235u = i;
                        int i6 = (int) (f5 * 1.0f * f3);
                        this.f192236v = i6;
                        this.f192237w = 0;
                        this.f192238x = (int) (((float) (i2 - i6)) * this.f192214D);
                    }
                } else {
                    int i7 = this.f192220J;
                    if (i7 == 90 || i7 == 270) {
                        int min2 = Math.min((int) ((f5 * 1.0f) / f3), i2);
                        this.f192236v = min2;
                        int i8 = (int) (((float) min2) * 1.0f * f3);
                        this.f192235u = i8;
                        float f9 = (float) (i - i8);
                        float f10 = this.f192214D;
                        this.f192237w = (int) (f9 * f10);
                        this.f192238x = (int) (((float) (i2 - min2)) * f10);
                    } else {
                        int i9 = (int) (f4 / f3);
                        this.f192235u = i9;
                        this.f192236v = i2;
                        this.f192237w = (int) (((float) (i - i9)) * this.f192214D);
                        this.f192238x = 0;
                    }
                }
                mo136474a(13000, this.f192219I);
            } else if (i3 == 2) {
                this.f192235u = i;
                this.f192236v = i2;
                this.f192238x = 0;
                this.f192237w = 0;
                int i10 = this.f192220J;
                if (i10 == 90 || i10 == 270) {
                    float f11 = (f2 * 1.0f) / f;
                    if (f6 > f11) {
                        float f12 = 1.0f - (f11 / f6);
                        this.f192234t.put(0, this.f192215E);
                        this.f192234t.put(1, this.f192216F + (this.f192218H * f12 * this.f192214D));
                        this.f192234t.put(2, this.f192215E + this.f192217G);
                        this.f192234t.put(5, this.f192216F + (this.f192218H * (1.0f - (f12 * (1.0f - this.f192214D)))));
                    } else {
                        float f13 = 1.0f - (f6 / f11);
                        this.f192234t.put(0, this.f192215E + (this.f192217G * f13 * this.f192214D));
                        this.f192234t.put(1, this.f192216F);
                        this.f192234t.put(2, this.f192215E + (this.f192217G * (1.0f - (f13 * this.f192214D))));
                        this.f192234t.put(5, this.f192216F + this.f192218H);
                    }
                } else if (f6 > f3) {
                    float f14 = 1.0f - (f3 / f6);
                    this.f192234t.put(0, this.f192215E + (this.f192217G * f14 * this.f192214D));
                    this.f192234t.put(1, this.f192216F);
                    this.f192234t.put(2, this.f192215E + (this.f192217G * (1.0f - (f14 * (1.0f - this.f192214D)))));
                    this.f192234t.put(5, this.f192216F + this.f192218H);
                } else {
                    float f15 = 1.0f - (f6 / f3);
                    this.f192234t.put(0, this.f192215E);
                    this.f192234t.put(1, this.f192216F + (this.f192218H * f15 * this.f192214D));
                    this.f192234t.put(2, this.f192215E + this.f192217G);
                    this.f192234t.put(5, this.f192216F + (this.f192218H * (1.0f - (f15 * (1.0f - this.f192214D)))));
                }
                FloatBuffer floatBuffer = this.f192234t;
                floatBuffer.put(3, floatBuffer.get(1));
                FloatBuffer floatBuffer2 = this.f192234t;
                floatBuffer2.put(4, floatBuffer2.get(0));
                FloatBuffer floatBuffer3 = this.f192234t;
                floatBuffer3.put(6, floatBuffer3.get(2));
                FloatBuffer floatBuffer4 = this.f192234t;
                floatBuffer4.put(7, floatBuffer4.get(5));
                m148032d();
            } else {
                this.f192235u = i;
                this.f192236v = i2;
                this.f192238x = 0;
                this.f192237w = 0;
                mo136474a(13000, this.f192219I);
            }
        }
        if (iVar != null) {
            if (this.f192211A == 0 || this.f192212B == 0) {
                C86203l.m148116a("TR_GLDefaultFilter", "error width or height, w:" + this.f192211A + " h:" + this.f192212B);
            }
            fVar2 = this.f192177f.f192344m.mo136488a(this.f192211A, this.f192212B);
            iVar.mo136490a(fVar2.f192201a);
        } else {
            fVar2 = null;
        }
        GLES20.glUseProgram(this.f192230p);
        if (this.f192239y) {
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES20.glClear(16384);
        }
        GLES20.glViewport(this.f192237w, this.f192238x, this.f192235u, this.f192236v);
        this.f192233s.position(this.f192227k);
        GLES20.glVertexAttribPointer(this.f192231q, 3, 5126, false, this.f192225i, (Buffer) this.f192233s);
        GLES20.glEnableVertexAttribArray(this.f192231q);
        this.f192234t.position(this.f192228l);
        GLES20.glVertexAttribPointer(this.f192232r, 2, 5126, false, this.f192226j, (Buffer) this.f192234t);
        GLES20.glEnableVertexAttribArray(this.f192232r);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(this.f192173b, fVar.f192201a);
        GLES20.glUniform1i(this.f192240z, 0);
        mo136491b();
        GLES20.glDrawArrays(5, 0, 4);
        mo136492c();
        GLES20.glBindTexture(this.f192173b, 0);
        GLES20.glDisableVertexAttribArray(this.f192231q);
        GLES20.glDisableVertexAttribArray(this.f192232r);
        this.f192175d.setOption(19, this.f192172a, 1);
        fVar.mo136486a();
        if (iVar == null) {
            return null;
        }
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
        GLES20.glBindFramebuffer(36160, 0);
        return fVar2;
    }
}
