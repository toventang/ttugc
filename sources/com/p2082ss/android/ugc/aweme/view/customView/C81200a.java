package com.p2082ss.android.ugc.aweme.view.customView;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import com.bef.effectsdk.BEFEffectNative;
import com.bef.effectsdk.ResourceFinder;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.ByteArrayOutputStream;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.view.customView.a */
public final class C81200a {

    /* renamed from: V */
    static final float[] f181431V = {-1.0f, 1.0f, 0.0f, 0.0f, 0.0f, -1.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f, -1.0f, 0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f};

    /* renamed from: W */
    static final float[] f181432W = {-1.0f, 1.0f, 0.0f, 0.0f, 1.0f, -1.0f, -1.0f, 0.0f, 1.0f, 1.0f, 1.0f, -1.0f, 0.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f};

    /* renamed from: X */
    static final short[] f181433X = {0, 1, 2, 0, 2, 3};

    /* renamed from: Y */
    public static final C81201a f181434Y = new C81201a((byte) 0);

    /* renamed from: A */
    int f181435A;

    /* renamed from: B */
    int f181436B;

    /* renamed from: C */
    int f181437C;

    /* renamed from: D */
    int f181438D;

    /* renamed from: E */
    int f181439E;

    /* renamed from: F */
    int f181440F;

    /* renamed from: G */
    int[] f181441G;

    /* renamed from: H */
    int[] f181442H;

    /* renamed from: I */
    int[] f181443I;

    /* renamed from: J */
    FloatBuffer f181444J;

    /* renamed from: K */
    FloatBuffer f181445K;

    /* renamed from: L */
    ShortBuffer f181446L;

    /* renamed from: M */
    int[] f181447M;

    /* renamed from: N */
    int[] f181448N;

    /* renamed from: O */
    public int[] f181449O;

    /* renamed from: P */
    int[] f181450P;

    /* renamed from: Q */
    int[] f181451Q;

    /* renamed from: R */
    int[] f181452R;

    /* renamed from: S */
    int[] f181453S;

    /* renamed from: T */
    int[] f181454T;

    /* renamed from: U */
    int[] f181455U;

    /* renamed from: Z */
    private int[] f181456Z;

    /* renamed from: a */
    public final ReentrantLock f181457a = new ReentrantLock();

    /* renamed from: b */
    long f181458b;

    /* renamed from: c */
    ResourceFinder f181459c;

    /* renamed from: d */
    String f181460d;

    /* renamed from: e */
    public int f181461e;

    /* renamed from: f */
    public int f181462f;

    /* renamed from: g */
    int f181463g;

    /* renamed from: h */
    int f181464h;

    /* renamed from: i */
    final int f181465i = 480;

    /* renamed from: j */
    final int f181466j = 270;

    /* renamed from: k */
    public float f181467k;

    /* renamed from: l */
    public float f181468l;

    /* renamed from: m */
    public float f181469m;

    /* renamed from: n */
    public float f181470n;

    /* renamed from: o */
    public boolean f181471o = true;

    /* renamed from: p */
    public boolean f181472p;

    /* renamed from: q */
    public boolean f181473q;

    /* renamed from: r */
    public int f181474r = 30;

    /* renamed from: s */
    public int f181475s = 30;

    /* renamed from: t */
    public boolean f181476t;

    /* renamed from: u */
    public final int f181477u = 256;

    /* renamed from: v */
    public final int f181478v = 256;

    /* renamed from: w */
    public List<ByteArrayOutputStream> f181479w;

    /* renamed from: x */
    int f181480x;

    /* renamed from: y */
    int f181481y;

    /* renamed from: z */
    int f181482z;

    /* renamed from: com.ss.android.ugc.aweme.view.customView.a$a */
    public static final class C81201a {
        static {
            Covode.recordClassIndex(94531);
        }

        private C81201a() {
        }

        public /* synthetic */ C81201a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo124675a() {
        ResourceFinder resourceFinder = this.f181459c;
        if (resourceFinder != null) {
            BEFEffectNative.releaseResourceFinder(this.f181458b, resourceFinder);
            this.f181459c = null;
        }
    }

    /* renamed from: b */
    public final void mo124680b() {
        long j = this.f181458b;
        if (j != 0) {
            BEFEffectNative.destroyHandle(j);
            this.f181458b = 0;
        }
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        mo124675a();
        mo124680b();
        mo124685e();
        mo124682c();
    }

    /* renamed from: c */
    public final void mo124682c() {
        int i = this.f181437C;
        if (i != 0) {
            GLES20.glDeleteProgram(i);
        }
        int i2 = this.f181480x;
        if (i2 != 0) {
            GLES20.glDeleteProgram(i2);
        }
        int[] iArr = this.f181441G;
        if (iArr != null) {
            GLES20.glDeleteBuffers(1, iArr, 0);
        }
        int[] iArr2 = this.f181442H;
        if (iArr2 != null) {
            GLES20.glDeleteBuffers(1, iArr2, 0);
        }
        int[] iArr3 = this.f181443I;
        if (iArr3 != null) {
            GLES20.glDeleteBuffers(1, iArr3, 0);
        }
    }

    /* renamed from: e */
    public final void mo124685e() {
        int[] iArr = this.f181447M;
        if (iArr != null) {
            GLES20.glDeleteFramebuffers(1, iArr, 0);
        }
        int[] iArr2 = this.f181448N;
        if (iArr2 != null) {
            GLES20.glDeleteTextures(1, iArr2, 0);
        }
        int[] iArr3 = this.f181449O;
        if (iArr3 != null) {
            GLES20.glDeleteFramebuffers(1, iArr3, 0);
        }
        int[] iArr4 = this.f181450P;
        if (iArr4 != null) {
            GLES20.glDeleteTextures(1, iArr4, 0);
        }
        int[] iArr5 = this.f181451Q;
        if (iArr5 != null) {
            GLES20.glDeleteFramebuffers(1, iArr5, 0);
        }
        int[] iArr6 = this.f181452R;
        if (iArr6 != null) {
            GLES20.glDeleteTextures(1, iArr6, 0);
        }
        int[] iArr7 = this.f181454T;
        if (iArr7 != null) {
            GLES20.glDeleteFramebuffers(1, iArr7, 0);
        }
        int[] iArr8 = this.f181455U;
        if (iArr8 != null) {
            GLES20.glDeleteTextures(1, iArr8, 0);
        }
        int[] iArr9 = this.f181453S;
        if (iArr9 != null) {
            GLES20.glDeleteFramebuffers(1, iArr9, 0);
        }
        int[] iArr10 = this.f181456Z;
        if (iArr10 != null) {
            GLES20.glDeleteTextures(1, iArr10, 0);
        }
    }

    static {
        Covode.recordClassIndex(94530);
    }

    /* renamed from: d */
    public final void mo124684d() {
        mo124685e();
        int i = this.f181461e;
        int i2 = this.f181462f;
        int[] iArr = new int[1];
        this.f181447M = iArr;
        this.f181448N = new int[1];
        GLES20.glGenFramebuffers(1, iArr, 0);
        int[] iArr2 = this.f181447M;
        if (iArr2 == null) {
            C89219l.m154715b();
        }
        GLES20.glBindFramebuffer(36160, iArr2[0]);
        GLES20.glGenTextures(1, this.f181448N, 0);
        int[] iArr3 = this.f181448N;
        if (iArr3 == null) {
            C89219l.m154715b();
        }
        GLES20.glBindTexture(3553, iArr3[0]);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexImage2D(3553, 0, 6408, i, i2, 0, 6408, 5121, null);
        int[] iArr4 = this.f181448N;
        if (iArr4 == null) {
            C89219l.m154715b();
        }
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr4[0], 0);
        int[] iArr5 = new int[1];
        this.f181449O = iArr5;
        this.f181450P = new int[1];
        GLES20.glGenFramebuffers(1, iArr5, 0);
        int[] iArr6 = this.f181449O;
        if (iArr6 == null) {
            C89219l.m154715b();
        }
        GLES20.glBindFramebuffer(36160, iArr6[0]);
        GLES20.glGenTextures(1, this.f181450P, 0);
        int[] iArr7 = this.f181450P;
        if (iArr7 == null) {
            C89219l.m154715b();
        }
        GLES20.glBindTexture(3553, iArr7[0]);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexImage2D(3553, 0, 6408, i, i2, 0, 6408, 5121, null);
        int[] iArr8 = this.f181450P;
        if (iArr8 == null) {
            C89219l.m154715b();
        }
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr8[0], 0);
        int[] iArr9 = new int[1];
        this.f181451Q = iArr9;
        this.f181452R = new int[1];
        GLES20.glGenFramebuffers(1, iArr9, 0);
        int[] iArr10 = this.f181451Q;
        if (iArr10 == null) {
            C89219l.m154715b();
        }
        GLES20.glBindFramebuffer(36160, iArr10[0]);
        GLES20.glGenTextures(1, this.f181452R, 0);
        int[] iArr11 = this.f181452R;
        if (iArr11 == null) {
            C89219l.m154715b();
        }
        GLES20.glBindTexture(3553, iArr11[0]);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexImage2D(3553, 0, 6408, i, i2, 0, 6408, 5121, null);
        int[] iArr12 = this.f181452R;
        if (iArr12 == null) {
            C89219l.m154715b();
        }
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr12[0], 0);
        int[] iArr13 = new int[1];
        this.f181454T = iArr13;
        this.f181455U = new int[1];
        this.f181463g = (this.f181466j * i2) / this.f181465i;
        this.f181464h = i2;
        GLES20.glGenFramebuffers(1, iArr13, 0);
        int[] iArr14 = this.f181454T;
        if (iArr14 == null) {
            C89219l.m154715b();
        }
        GLES20.glBindFramebuffer(36160, iArr14[0]);
        GLES20.glGenTextures(1, this.f181455U, 0);
        int[] iArr15 = this.f181455U;
        if (iArr15 == null) {
            C89219l.m154715b();
        }
        GLES20.glBindTexture(3553, iArr15[0]);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexImage2D(3553, 0, 6408, this.f181463g, this.f181464h, 0, 6408, 5121, null);
        int[] iArr16 = this.f181455U;
        if (iArr16 == null) {
            C89219l.m154715b();
        }
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr16[0], 0);
        int[] iArr17 = new int[1];
        this.f181453S = iArr17;
        this.f181456Z = new int[1];
        GLES20.glGenFramebuffers(1, iArr17, 0);
        int[] iArr18 = this.f181453S;
        if (iArr18 == null) {
            C89219l.m154715b();
        }
        GLES20.glBindFramebuffer(36160, iArr18[0]);
        GLES20.glGenTextures(1, this.f181456Z, 0);
        int[] iArr19 = this.f181456Z;
        if (iArr19 == null) {
            C89219l.m154715b();
        }
        GLES20.glBindTexture(3553, iArr19[0]);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexImage2D(3553, 0, 6408, this.f181477u, this.f181478v, 0, 6408, 5121, null);
        int[] iArr20 = this.f181456Z;
        if (iArr20 == null) {
            C89219l.m154715b();
        }
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr20[0], 0);
    }

    /* renamed from: a */
    public final void mo124678a(String str) {
        this.f181460d = str;
        BEFEffectNative.setStickerPath(this.f181458b, str);
    }

    /* renamed from: b */
    public final void mo124681b(int[] iArr, float[] fArr, float[] fArr2) {
        BEFEffectNative.touchMoveEvent(this.f181458b, iArr, fArr, fArr2);
    }

    /* renamed from: c */
    public final void mo124683c(int[] iArr, float[] fArr, float[] fArr2) {
        BEFEffectNative.touchEndEvent(this.f181458b, iArr, fArr, fArr2);
    }

    /* renamed from: a */
    public final void mo124679a(int[] iArr, float[] fArr, float[] fArr2) {
        BEFEffectNative.touchBeginEvent(this.f181458b, iArr, fArr, fArr2);
    }

    /* renamed from: a */
    public static Bitmap m140956a(int i, int i2, boolean z) {
        int i3;
        MethodCollector.m26663i(4804);
        int i4 = i * i2;
        int[] iArr = new int[i4];
        int[] iArr2 = new int[i4];
        IntBuffer wrap = IntBuffer.wrap(iArr);
        wrap.position(0);
        GLES20.glReadPixels(0, 0, i, i2, 6408, 5121, wrap);
        for (int i5 = 0; i5 < i2; i5++) {
            int i6 = i5 * i;
            if (z) {
                i3 = ((i2 - i5) - 1) * i;
            } else {
                i3 = i6;
            }
            for (int i7 = 0; i7 < i; i7++) {
                int i8 = iArr[i6 + i7];
                int i9 = i3 + i7;
                iArr2[i9] = (i8 & -16711936) | ((i8 << 16) & 16711680) | ((i8 >> 16) & 255);
            }
        }
        Bitmap createBitmap = Bitmap.createBitmap(iArr2, i, i2, Bitmap.Config.ARGB_8888);
        C89219l.m154716b(createBitmap, "");
        MethodCollector.m26664o(4804);
        return createBitmap;
    }

    /* renamed from: a */
    public final void mo124676a(int i, int i2, float f) {
        boolean z;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        GLES20.glBindFramebuffer(36160, i2);
        if (f > 0.0f) {
            z = true;
            i3 = this.f181480x;
            i4 = 36197;
            i5 = this.f181481y;
            i6 = this.f181435A;
            i7 = this.f181482z;
            int[] iArr = this.f181442H;
            if (iArr == null) {
                C89219l.m154715b();
            }
            i8 = iArr[0];
        } else {
            z = false;
            i3 = this.f181437C;
            i4 = 3553;
            i5 = this.f181440F;
            i6 = this.f181438D;
            i7 = this.f181439E;
            int[] iArr2 = this.f181441G;
            if (iArr2 == null) {
                C89219l.m154715b();
            }
            i8 = iArr2[0];
        }
        GLES20.glUseProgram(i3);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(i4, i);
        GLES20.glUniform1i(i5, 0);
        if (z) {
            GLES20.glUniform1f(this.f181436B, f);
        }
        GLES20.glBindBuffer(34962, i8);
        GLES20.glVertexAttribPointer(i7, 2, 5126, false, 20, 0);
        GLES20.glEnableVertexAttribArray(i7);
        GLES20.glVertexAttribPointer(i6, 2, 5126, false, 20, 12);
        GLES20.glEnableVertexAttribArray(i6);
        int[] iArr3 = this.f181443I;
        if (iArr3 == null) {
            C89219l.m154715b();
        }
        GLES20.glBindBuffer(34963, iArr3[0]);
        GLES20.glDrawElements(4, 6, 5123, 0);
        GLES20.glBindFramebuffer(36160, 0);
    }

    /* renamed from: a */
    public final void mo124677a(int i, int i2, int i3, String str) {
        BEFEffectNative.sendMessage(this.f181458b, (long) i, (long) i2, (long) i3, str);
    }
}
