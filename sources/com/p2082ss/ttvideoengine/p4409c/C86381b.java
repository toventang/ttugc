package com.p2082ss.ttvideoengine.p4409c;

import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.ttvideoengine.p4430s.C86641i;

/* renamed from: com.ss.ttvideoengine.c.b */
public final class C86381b {

    /* renamed from: a */
    final int f193515a;

    /* renamed from: b */
    final int f193516b;

    /* renamed from: c */
    final int f193517c;

    /* renamed from: d */
    final int f193518d;

    /* renamed from: e */
    final int f193519e;

    /* renamed from: f */
    final int f193520f;

    /* renamed from: g */
    final int f193521g;

    /* renamed from: h */
    final int f193522h;

    /* renamed from: i */
    public int f193523i;

    /* renamed from: j */
    public int f193524j;

    /* renamed from: k */
    public int f193525k;

    /* renamed from: l */
    public int f193526l;

    /* renamed from: m */
    public int f193527m;

    /* renamed from: n */
    public int f193528n;

    /* renamed from: o */
    public int f193529o;

    /* renamed from: p */
    public int f193530p;

    /* renamed from: q */
    private int[] f193531q;

    /* renamed from: r */
    private long f193532r;

    /* renamed from: s */
    private long f193533s;

    /* renamed from: t */
    private long f193534t;

    /* renamed from: u */
    private AbstractC86380a f193535u;

    /* renamed from: v */
    private long f193536v;

    /* renamed from: w */
    private int f193537w;

    /* renamed from: x */
    private int f193538x;

    static {
        Covode.recordClassIndex(101609);
    }

    /* renamed from: a */
    public static C86381b m148946a() {
        return C86382a.f193539a;
    }

    /* renamed from: com.ss.ttvideoengine.c.b$a */
    public static class C86382a {

        /* renamed from: a */
        public static C86381b f193539a = new C86381b((byte) 0);

        static {
            Covode.recordClassIndex(101610);
        }
    }

    /* renamed from: d */
    public final synchronized int[] mo137354d() {
        MethodCollector.m26663i(2436);
        if (this.f193527m == 0) {
            MethodCollector.m26664o(2436);
            return null;
        }
        int[] iArr = {this.f193523i, (int) this.f193536v, this.f193526l, this.f193538x};
        MethodCollector.m26664o(2436);
        return iArr;
    }

    private C86381b() {
        this.f193515a = 10;
        this.f193516b = 1;
        this.f193517c = 2;
        this.f193518d = 3;
        this.f193519e = 4;
        this.f193520f = 5;
        this.f193521g = 6;
        this.f193522h = 7;
        this.f193523i = 5;
        this.f193524j = 600;
        this.f193525k = 500;
        this.f193526l = Integer.MAX_VALUE;
        this.f193528n = 120;
        this.f193529o = Integer.MIN_VALUE;
        this.f193530p = Integer.MIN_VALUE;
        this.f193538x = Integer.MIN_VALUE;
        this.f193531q = new int[10];
        int i = 0;
        do {
            this.f193531q[i] = 0;
            i++;
        } while (i < 10);
    }

    /* renamed from: b */
    public final synchronized void mo137351b() {
        int i;
        AbstractC86380a aVar;
        MethodCollector.m26663i(2410);
        long j = this.f193536v + 1;
        this.f193536v = j;
        Object[] objArr = new Object[4];
        objArr[0] = Long.valueOf(j);
        objArr[1] = Integer.valueOf(this.f193531q[1]);
        if (this.f193535u != null) {
            i = 1;
        } else {
            i = 0;
        }
        objArr[2] = Integer.valueOf(i);
        objArr[3] = Integer.valueOf(this.f193538x);
        C86641i.m150113b("P2PStragetyManager", C1764a.m5928a("playnum:%d speedflag:%d listener:%d mProbeSpeed:%d", objArr));
        if (this.f193536v > ((long) this.f193523i) && this.f193531q[1] == 1 && (aVar = this.f193535u) != null && this.f193538x == Integer.MIN_VALUE) {
            int a = aVar.mo124247a(0);
            this.f193538x = a;
            C86641i.m150113b("P2PStragetyManager", C1764a.m5928a("get probe speed:%d", new Object[]{Integer.valueOf(a)}));
        }
        MethodCollector.m26664o(2410);
    }

    /* renamed from: c */
    public final synchronized void mo137353c() {
        int i;
        MethodCollector.m26663i(2431);
        int i2 = 0;
        while (true) {
            int[] iArr = this.f193531q;
            if (((double) (this.f193527m & (1 << i2))) == Math.pow(2.0d, (double) i2)) {
                i = 1;
            } else {
                i = 0;
            }
            iArr[i2] = i;
            C86641i.m150113b("P2PStragetyManager", C1764a.m5928a("control flag init, index:%d value:%d", new Object[]{Integer.valueOf(i2), Integer.valueOf(this.f193531q[i2])}));
            i2++;
            if (i2 >= 10) {
                MethodCollector.m26664o(2431);
            }
        }
    }

    /* renamed from: e */
    public final synchronized int mo137355e() {
        int i;
        MethodCollector.m26663i(2541);
        if (this.f193527m == 0) {
            C86641i.m150113b("P2PStragetyManager", C1764a.m5928a("control not open, enable p2p", new Object[0]));
            MethodCollector.m26664o(2541);
            return 1;
        }
        if (this.f193531q[0] == 1 && (i = this.f193523i) > 0) {
            long j = this.f193536v;
            if (j < ((long) i)) {
                C86641i.m150113b("P2PStragetyManager", C1764a.m5928a("curplaynum:%d minnum:%d, not allow p2p", new Object[]{Long.valueOf(j), Integer.valueOf(this.f193523i)}));
                MethodCollector.m26664o(2541);
                return 0;
            }
        }
        long currentTimeMillis = System.currentTimeMillis();
        int[] iArr = this.f193531q;
        if (iArr[2] == 1) {
            long j2 = this.f193532r;
            if (j2 > 0 && currentTimeMillis - j2 < ((long) this.f193528n)) {
                C86641i.m150113b("P2PStragetyManager", C1764a.m5928a("curT:%d lastLeaveT:%d,internal:%d not reach expiredT:%d, not allow p2p", new Object[]{Long.valueOf(currentTimeMillis), Long.valueOf(this.f193532r), Long.valueOf(currentTimeMillis - this.f193532r), Integer.valueOf(this.f193528n)}));
                MethodCollector.m26664o(2541);
                return 0;
            }
        }
        if (iArr[3] == 1) {
            long j3 = this.f193534t;
            if (j3 > 0 && currentTimeMillis - j3 < ((long) this.f193528n)) {
                C86641i.m150113b("P2PStragetyManager", C1764a.m5928a("curT:%d lastbufferT:%d,internal:%d not reach expiredT:%d, not allow p2p", new Object[]{Long.valueOf(currentTimeMillis), Long.valueOf(this.f193534t), Long.valueOf(currentTimeMillis - this.f193534t), Integer.valueOf(this.f193528n)}));
                MethodCollector.m26664o(2541);
                return 0;
            }
        }
        if (iArr[5] == 1) {
            long j4 = this.f193533s;
            if (j4 > 0 && currentTimeMillis - j4 < ((long) this.f193528n)) {
                C86641i.m150113b("P2PStragetyManager", C1764a.m5928a("curT:%d lastErrorT:%d,internal:%d not reach expiredT:%d, not allow p2p", new Object[]{Long.valueOf(currentTimeMillis), Long.valueOf(this.f193533s), Long.valueOf(currentTimeMillis - this.f193533s), Integer.valueOf(this.f193528n)}));
                MethodCollector.m26664o(2541);
                return 0;
            }
        }
        if (iArr[6] == 1) {
            int i2 = Integer.MIN_VALUE;
            AbstractC86380a aVar = this.f193535u;
            if (aVar != null) {
                i2 = aVar.mo124247a(1);
            }
            C86641i.m150113b("P2PStragetyManager", C1764a.m5928a("minnetworklevel:%d probelevel:%d", new Object[]{Integer.valueOf(this.f193530p), Integer.valueOf(i2)}));
            if (i2 <= this.f193530p) {
                C86641i.m150113b("P2PStragetyManager", C1764a.m5928a("network level not allow p2p", new Object[0]));
                MethodCollector.m26664o(2541);
                return 0;
            }
        }
        this.f193532r = 0;
        this.f193533s = 0;
        this.f193534t = 0;
        this.f193537w = 0;
        if (this.f193531q[1] == 1) {
            C86641i.m150113b("P2PStragetyManager", C1764a.m5928a("minspeed:%d probespeed:%d", new Object[]{Integer.valueOf(this.f193526l), Integer.valueOf(this.f193538x)}));
            int i3 = this.f193526l;
            if (i3 > 0 && this.f193538x < i3) {
                C86641i.m150113b("P2PStragetyManager", "not allow p2p");
                MethodCollector.m26664o(2541);
                return 0;
            }
        }
        if (this.f193531q[7] == 1) {
            C86641i.m150113b("P2PStragetyManager", C1764a.m5928a("enable min preload play internal,min value:%d", new Object[]{Integer.valueOf(this.f193529o)}));
            AbstractC86380a aVar2 = this.f193535u;
            if (aVar2 != null) {
                int a = aVar2.mo124247a(2);
                C86641i.m150113b("P2PStragetyManager", C1764a.m5928a("enable min preload play internal,min value:%d curinternal:%d", new Object[]{Integer.valueOf(this.f193529o), Integer.valueOf(a)}));
                if (a >= 0 && a < this.f193529o) {
                    C86641i.m150113b("P2PStragetyManager", C1764a.m5928a("cur internal not allow p2p", new Object[0]));
                    MethodCollector.m26664o(2541);
                    return 0;
                }
            }
        }
        C86641i.m150113b("P2PStragetyManager", C1764a.m5928a("allow p2p", new Object[0]));
        MethodCollector.m26664o(2541);
        return 1;
    }

    /* synthetic */ C86381b(byte b) {
        this();
    }

    /* renamed from: a */
    public final synchronized void mo137347a(int i) {
        MethodCollector.m26663i(2763);
        if (this.f193527m == 0 || this.f193531q[5] == 0) {
            MethodCollector.m26664o(2763);
            return;
        }
        C86641i.m150113b("P2PStragetyManager", C1764a.m5928a("occur error code:%d, play after this not allow p2p!", new Object[]{Integer.valueOf(i)}));
        this.f193533s = System.currentTimeMillis();
        this.f193537w = 1;
        MethodCollector.m26664o(2763);
    }

    /* renamed from: a */
    public final synchronized void mo137349a(long j) {
        MethodCollector.m26663i(2556);
        if (this.f193527m == 0 || this.f193531q[2] == 0) {
            MethodCollector.m26664o(2556);
            return;
        }
        C86641i.m150113b("P2PStragetyManager", C1764a.m5928a("leave wait time:%d ", new Object[]{Long.valueOf(j)}));
        int i = this.f193524j;
        if (i > 0 && j > ((long) i)) {
            C86641i.m150113b("P2PStragetyManager", C1764a.m5928a("leave wait time:%d allow max:%d, play after this not allow p2p!", new Object[]{Long.valueOf(j), Integer.valueOf(this.f193524j)}));
            this.f193532r = System.currentTimeMillis();
            this.f193537w = 1;
        }
        MethodCollector.m26664o(2556);
    }

    /* renamed from: b */
    public final synchronized void mo137352b(long j) {
        MethodCollector.m26663i(2776);
        if (this.f193527m == 0 || this.f193531q[3] == 0) {
            MethodCollector.m26664o(2776);
            return;
        }
        C86641i.m150113b("P2PStragetyManager", C1764a.m5928a("set buffering time:%d ", new Object[]{Long.valueOf(j)}));
        int i = this.f193525k;
        if (j > ((long) i)) {
            C86641i.m150113b("P2PStragetyManager", C1764a.m5928a("reach max buffering time:%d not allow p2p", new Object[]{Integer.valueOf(i)}));
            this.f193534t = System.currentTimeMillis();
            this.f193537w = 1;
        }
        MethodCollector.m26664o(2776);
    }

    /* renamed from: a */
    public final synchronized void mo137350a(AbstractC86380a aVar) {
        MethodCollector.m26663i(2413);
        if (this.f193535u == null) {
            this.f193535u = aVar;
        }
        int i = 1;
        Object[] objArr = new Object[1];
        if (this.f193535u == null) {
            i = 0;
        }
        objArr[0] = Integer.valueOf(i);
        C86641i.m150113b("P2PStragetyManager", C1764a.m5928a("set listener:%d", objArr));
        MethodCollector.m26664o(2413);
    }

    /* renamed from: a */
    public final synchronized void mo137348a(int i, int i2) {
        MethodCollector.m26663i(2420);
        C86641i.m150113b("P2PStragetyManager", C1764a.m5928a("received network change, from:%d to:%d", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}));
        if (this.f193531q[4] == 1) {
            C86641i.m150113b("P2PStragetyManager", C1764a.m5928a("reset playnum:%d and speed:%d", new Object[]{Long.valueOf(this.f193536v), Integer.valueOf(this.f193538x)}));
            this.f193536v = 0;
            this.f193538x = Integer.MIN_VALUE;
        }
        MethodCollector.m26664o(2420);
    }
}
