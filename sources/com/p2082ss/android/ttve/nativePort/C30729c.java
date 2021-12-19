package com.p2082ss.android.ttve.nativePort;

import android.media.ImageReader;
import android.media.MediaCodec;
import android.os.HandlerThread;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ttve.model.VEFrame;
import com.p2082ss.android.vesdk.AbstractC85304ab;
import com.p2082ss.android.vesdk.C85315al;
import java.nio.ByteBuffer;

/* renamed from: com.ss.android.ttve.nativePort.c */
public class C30729c {

    /* renamed from: a */
    public String f73563a = "HwFrameExtractorRange_";

    /* renamed from: b */
    String f73564b;

    /* renamed from: c */
    int f73565c;

    /* renamed from: d */
    int f73566d;

    /* renamed from: e */
    int f73567e;

    /* renamed from: f */
    int f73568f;

    /* renamed from: g */
    boolean f73569g;

    /* renamed from: h */
    AbstractC85304ab f73570h;

    /* renamed from: i */
    VEFrame f73571i;

    /* renamed from: j */
    MediaCodec f73572j = null;

    /* renamed from: k */
    public final Object f73573k = new Object();

    /* renamed from: l */
    HandlerThread f73574l;

    /* renamed from: m */
    HandlerThread f73575m;

    /* renamed from: n */
    ImageReader f73576n;

    /* renamed from: o */
    int f73577o = 0;

    /* renamed from: p */
    boolean f73578p = false;

    /* renamed from: q */
    private long f73579q = Thread.currentThread().getId();

    static {
        Covode.recordClassIndex(37337);
    }

    /* renamed from: b */
    private void m63112b() {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(this.f73567e * this.f73568f * 4);
        allocateDirect.clear();
        this.f73571i = VEFrame.createByteBufferFrame(allocateDirect, this.f73567e, this.f73568f, 0, 0, VEFrame.EnumC30668a.TEPixFmt_ARGB8);
    }

    /* renamed from: a */
    public final void mo55455a() {
        if (!this.f73578p) {
            C85315al.m146637a(this.f73563a, "processFrameLast begin hasProcessCount:" + this.f73577o);
            if (!this.f73570h.processFrame(null, this.f73567e, this.f73568f, 0)) {
                C85315al.m146637a(this.f73563a, "processFrameLast stop hasProcxessCount:" + this.f73577o);
            }
        }
    }

    public C30729c(String str, int i, int i2, int i3, int i4, int i5, AbstractC85304ab abVar) {
        this.f73563a += i5 + "_" + this.f73579q;
        this.f73564b = str;
        this.f73565c = Math.max(i, 0);
        this.f73566d = i2;
        this.f73567e = i3;
        this.f73568f = i4;
        this.f73569g = false;
        this.f73570h = abVar;
        try {
            m63112b();
        } catch (OutOfMemoryError unused) {
            C85315al.m146641c(this.f73563a, "init alloc oom");
            Runtime.getRuntime().gc();
            try {
                m63112b();
            } catch (Exception unused2) {
                mo55455a();
            }
        }
    }
}
