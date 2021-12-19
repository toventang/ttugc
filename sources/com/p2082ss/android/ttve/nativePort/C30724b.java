package com.p2082ss.android.ttve.nativePort;

import android.media.ImageReader;
import android.media.MediaCodec;
import android.os.HandlerThread;
import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ttve.model.VEFrame;
import com.p2082ss.android.vesdk.AbstractC85304ab;
import com.p2082ss.android.vesdk.C85315al;
import java.nio.ByteBuffer;

/* renamed from: com.ss.android.ttve.nativePort.b */
public class C30724b {

    /* renamed from: c */
    static String f73517c;

    /* renamed from: d */
    static String f73518d;

    /* renamed from: A */
    boolean f73519A;

    /* renamed from: B */
    boolean f73520B;

    /* renamed from: C */
    public boolean f73521C;

    /* renamed from: D */
    public boolean f73522D;

    /* renamed from: a */
    long f73523a = Thread.currentThread().getId();

    /* renamed from: b */
    public String f73524b = "HwFrameExtractor2_";

    /* renamed from: e */
    String f73525e;

    /* renamed from: f */
    int[] f73526f;

    /* renamed from: g */
    int f73527g;

    /* renamed from: h */
    int f73528h;

    /* renamed from: i */
    boolean f73529i;

    /* renamed from: j */
    int f73530j;

    /* renamed from: k */
    AbstractC85304ab f73531k;

    /* renamed from: l */
    VEFrame f73532l;

    /* renamed from: m */
    VEFrame f73533m;

    /* renamed from: n */
    VEFrame f73534n;

    /* renamed from: o */
    VEFrame f73535o;

    /* renamed from: p */
    MediaCodec f73536p = null;

    /* renamed from: q */
    long f73537q;

    /* renamed from: r */
    int f73538r;

    /* renamed from: s */
    public final Object f73539s = new Object();

    /* renamed from: t */
    public int f73540t;

    /* renamed from: u */
    public int f73541u;

    /* renamed from: v */
    HandlerThread f73542v;

    /* renamed from: w */
    HandlerThread f73543w;

    /* renamed from: x */
    ImageReader f73544x;

    /* renamed from: y */
    int f73545y;

    /* renamed from: z */
    boolean f73546z;

    static {
        Covode.recordClassIndex(37332);
    }

    /* renamed from: c */
    private void m63109c() {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(this.f73527g * this.f73528h * 4);
        allocateDirect.clear();
        this.f73532l = VEFrame.createByteBufferFrame(allocateDirect, this.f73527g, this.f73528h, 0, 0, VEFrame.EnumC30668a.TEPixFmt_ARGB8);
    }

    /* renamed from: a */
    public final void mo55446a() {
        try {
            C85315al.m146637a(this.f73524b, "stop begin");
            if (!this.f73546z) {
                this.f73546z = true;
                if (this.f73544x != null) {
                    this.f73536p.reset();
                    this.f73536p.release();
                }
                ImageReader imageReader = this.f73544x;
                if (imageReader != null) {
                    imageReader.close();
                }
                HandlerThread handlerThread = this.f73543w;
                if (handlerThread != null) {
                    handlerThread.quitSafely();
                }
                C85315al.m146637a(this.f73524b, "stop end");
            }
        } catch (Exception e) {
            C85315al.m146637a(this.f73524b, "stop crash");
            Log.getStackTraceString(e);
            mo55447b();
        }
    }

    /* renamed from: b */
    public final void mo55447b() {
        if (!this.f73546z) {
            while (this.f73545y < this.f73526f.length * this.f73530j) {
                C85315al.m146637a(this.f73524b, "processFrameLast processing hasProcxessCount:" + this.f73545y + " ptsMsLength: " + this.f73526f.length);
                if (!this.f73531k.processFrame(null, this.f73527g, this.f73528h, 0)) {
                    C85315al.m146637a(this.f73524b, "processFrameLast stop hasProcxessCount:" + this.f73545y + " ptsMsLength: " + this.f73526f.length);
                    return;
                }
                this.f73545y++;
            }
        }
    }

    public C30724b(String str, int[] iArr, int i, int i2, int i3, int i4, AbstractC85304ab abVar) {
        this.f73545y = 0;
        this.f73546z = false;
        this.f73519A = false;
        this.f73520B = false;
        this.f73521C = false;
        this.f73522D = false;
        this.f73524b += i4 + "_" + this.f73523a;
        this.f73525e = str;
        this.f73526f = iArr;
        this.f73527g = i;
        this.f73528h = i2;
        this.f73529i = false;
        this.f73530j = i3;
        this.f73531k = abVar;
        try {
            m63109c();
        } catch (OutOfMemoryError unused) {
            C85315al.m146641c(this.f73524b, "init alloc oom");
            Runtime.getRuntime().gc();
            try {
                m63109c();
            } catch (Exception unused2) {
                mo55447b();
                return;
            }
        }
        this.f73526f = new int[iArr.length];
        for (int i5 = 0; i5 < iArr.length; i5++) {
            this.f73526f[i5] = iArr[i5] * 1000;
            C85315al.m146637a(this.f73524b, "ptsMS: " + this.f73526f[i5]);
        }
    }
}
