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

/* renamed from: com.ss.android.ttve.nativePort.a */
public final class C30720a {

    /* renamed from: c */
    public static String f73477c;

    /* renamed from: d */
    public static String f73478d;

    /* renamed from: a */
    public long f73479a = Thread.currentThread().getId();

    /* renamed from: b */
    public String f73480b = "HwFrameExtractor_";

    /* renamed from: e */
    public String f73481e;

    /* renamed from: f */
    public int[] f73482f;

    /* renamed from: g */
    public int f73483g;

    /* renamed from: h */
    public int f73484h;

    /* renamed from: i */
    boolean f73485i;

    /* renamed from: j */
    public int f73486j;

    /* renamed from: k */
    AbstractC85304ab f73487k;

    /* renamed from: l */
    VEFrame f73488l;

    /* renamed from: m */
    public VEFrame f73489m;

    /* renamed from: n */
    VEFrame f73490n;

    /* renamed from: o */
    public VEFrame f73491o;

    /* renamed from: p */
    public MediaCodec f73492p = null;

    /* renamed from: q */
    public long f73493q;

    /* renamed from: r */
    public int f73494r;

    /* renamed from: s */
    public int f73495s;

    /* renamed from: t */
    public int f73496t;

    /* renamed from: u */
    public HandlerThread f73497u;

    /* renamed from: v */
    public HandlerThread f73498v;

    /* renamed from: w */
    public ImageReader f73499w;

    /* renamed from: x */
    int f73500x;

    /* renamed from: y */
    boolean f73501y;

    /* renamed from: z */
    public boolean f73502z;

    static {
        Covode.recordClassIndex(37328);
    }

    /* renamed from: c */
    private void m63106c() {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(this.f73483g * this.f73484h * 4);
        allocateDirect.clear();
        this.f73488l = VEFrame.createByteBufferFrame(allocateDirect, this.f73483g, this.f73484h, 0, 0, VEFrame.EnumC30668a.TEPixFmt_ARGB8);
    }

    /* renamed from: a */
    public final void mo55438a() {
        try {
            C85315al.m146637a(this.f73480b, "stop begin");
            if (this.f73499w != null) {
                this.f73492p.reset();
                this.f73492p.release();
            }
            ImageReader imageReader = this.f73499w;
            if (imageReader != null) {
                imageReader.close();
            }
            HandlerThread handlerThread = this.f73498v;
            if (handlerThread != null) {
                handlerThread.quitSafely();
            }
            HandlerThread handlerThread2 = this.f73497u;
            if (handlerThread2 != null) {
                handlerThread2.quitSafely();
            }
        } catch (Exception e) {
            C85315al.m146637a(this.f73480b, "stop crash");
            Log.getStackTraceString(e);
            mo55439b();
        }
    }

    /* renamed from: b */
    public final void mo55439b() {
        this.f73501y = true;
        C85315al.m146637a(this.f73480b, "processFrameLast begin hasProcessCount:" + this.f73500x + " ptsMsLength: " + this.f73482f.length);
        while (this.f73500x < this.f73482f.length * this.f73486j) {
            C85315al.m146637a(this.f73480b, "processFrameLast processing hasProcxessCount:" + this.f73500x + " ptsMsLength: " + this.f73482f.length);
            if (!this.f73487k.processFrame(null, this.f73483g, this.f73484h, 0)) {
                C85315al.m146637a(this.f73480b, "processFrameLast stop hasProcxessCount:" + this.f73500x + " ptsMsLength: " + this.f73482f.length);
                return;
            }
            this.f73500x += this.f73486j;
        }
    }

    public C30720a(String str, int[] iArr, int i, int i2, int i3, int i4, AbstractC85304ab abVar) {
        this.f73500x = 0;
        this.f73501y = false;
        this.f73502z = false;
        this.f73480b += i4 + "_" + this.f73479a;
        this.f73481e = str;
        this.f73482f = iArr;
        this.f73483g = i;
        this.f73484h = i2;
        this.f73485i = false;
        this.f73486j = i3;
        this.f73487k = abVar;
        try {
            m63106c();
        } catch (OutOfMemoryError unused) {
            C85315al.m146641c(this.f73480b, "init alloc oom");
            Runtime.getRuntime().gc();
            try {
                m63106c();
            } catch (Exception unused2) {
                mo55439b();
                return;
            }
        }
        this.f73482f = new int[iArr.length];
        for (int i5 = 0; i5 < iArr.length; i5++) {
            this.f73482f[i5] = iArr[i5] * 1000;
            C85315al.m146637a(this.f73480b, "ptsMS: " + this.f73482f[i5]);
        }
    }
}
