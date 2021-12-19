package com.benchmark.mediacodec;

import com.bytedance.covode.number.Covode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* renamed from: com.benchmark.mediacodec.k */
public class C2495k {

    /* renamed from: a */
    public static final float[] f7546a;

    /* renamed from: b */
    public static final int f7547b;

    /* renamed from: p */
    private static final String f7548p = C2495k.class.getSimpleName();

    /* renamed from: q */
    private static final float[] f7549q = {0.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f};

    /* renamed from: c */
    public int f7550c;

    /* renamed from: d */
    public int f7551d;

    /* renamed from: e */
    public int f7552e;

    /* renamed from: f */
    public int[] f7553f;

    /* renamed from: g */
    public int f7554g;

    /* renamed from: h */
    public int f7555h;

    /* renamed from: i */
    public int f7556i;

    /* renamed from: j */
    public int[] f7557j;

    /* renamed from: k */
    public int f7558k;

    /* renamed from: l */
    public int f7559l;

    /* renamed from: m */
    public ByteBuffer f7560m;

    /* renamed from: n */
    public ByteBuffer f7561n;

    /* renamed from: o */
    public ByteBuffer f7562o;

    /* renamed from: r */
    private FloatBuffer f7563r;

    /* renamed from: s */
    private FloatBuffer f7564s;

    static {
        Covode.recordClassIndex(2851);
        float[] fArr = {-1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f};
        f7546a = fArr;
        f7547b = fArr.length / 3;
    }

    public C2495k() {
        float[] fArr = f7546a;
        FloatBuffer put = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr);
        this.f7563r = put;
        put.position(0);
        float[] fArr2 = f7549q;
        FloatBuffer put2 = ByteBuffer.allocateDirect(fArr2.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr2);
        this.f7564s = put2;
        put2.position(0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x0012 A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo6906a() {
        /*
        // Method dump skipped, instructions count: 226
        */
        throw new UnsupportedOperationException("Method not decompiled: com.benchmark.mediacodec.C2495k.mo6906a():int");
    }
}
