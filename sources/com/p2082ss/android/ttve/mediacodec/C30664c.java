package com.p2082ss.android.ttve.mediacodec;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.vesdk.C85315al;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ttve.mediacodec.c */
public final class C30664c {

    /* renamed from: a */
    public static volatile boolean f73336a = false;

    /* renamed from: b */
    private static int f73337b;

    /* renamed from: c */
    private static int f73338c;

    /* renamed from: d */
    private static List<Integer> f73339d = new ArrayList();

    /* renamed from: e */
    private static int f73340e = 2304000;

    static {
        Covode.recordClassIndex(37217);
    }

    /* renamed from: a */
    public static synchronized int m63020a() {
        int i;
        synchronized (C30664c.class) {
            MethodCollector.m26663i(12402);
            i = f73338c;
            MethodCollector.m26664o(12402);
        }
        return i;
    }

    /* renamed from: b */
    public static synchronized int m63023b() {
        int i;
        synchronized (C30664c.class) {
            MethodCollector.m26663i(12403);
            i = f73337b;
            MethodCollector.m26664o(12403);
        }
        return i;
    }

    /* renamed from: b */
    public static synchronized void m63024b(int i, int i2) {
        synchronized (C30664c.class) {
            MethodCollector.m26663i(12400);
            if (!f73339d.contains(Integer.valueOf(i2))) {
                MethodCollector.m26664o(12400);
                return;
            }
            f73337b -= i;
            f73339d.remove(Integer.valueOf(i2));
            C85315al.m146639b("TEMediaCodecResourceManager", "freeCodecBlocksSize blocksSize: " + i + ", sUsedCodecBlocksSize: " + f73337b + ", " + i2);
            if (f73337b < 0) {
                C85315al.m146641c("TEMediaCodecResourceManager", "freeCodecBlocksSize sUsedCodecBlocksSize < 0");
                f73337b = 0;
            }
            MethodCollector.m26664o(12400);
        }
    }

    /* renamed from: a */
    public static synchronized boolean m63021a(int i, int i2) {
        synchronized (C30664c.class) {
            MethodCollector.m26663i(12284);
            if (f73338c == 0) {
                f73338c = TEMediaCodecDecoder.getMaxBlocksSizePerSecond();
                C85315al.m146637a("TEMediaCodecResourceManager", "sMaxCodecBlocksSize: " + f73338c);
            }
            if (f73338c == -1) {
                MethodCollector.m26664o(12284);
                return true;
            } else if (f73339d.contains(Integer.valueOf(i2))) {
                MethodCollector.m26664o(12284);
                return true;
            } else {
                int i3 = f73337b;
                if (i3 + i > f73338c) {
                    C85315al.m146641c("TEMediaCodecResourceManager", "sUsedCodecBlocksSize + blocksSize > sMaxCodecBlocksSize, sUsedCodecBlocksSize: " + f73337b + ", blocksSize:" + i);
                    MethodCollector.m26664o(12284);
                    return false;
                }
                f73337b = i3 + i;
                f73339d.add(Integer.valueOf(i2));
                C85315al.m146639b("TEMediaCodecResourceManager", "tryUseCodecBlocksSize success blocksSize: " + i + ", sUsedCodecBlocksSize: " + f73337b + ", " + i2);
                MethodCollector.m26664o(12284);
                return true;
            }
        }
    }

    /* renamed from: a */
    public static synchronized boolean m63022a(int i, int i2, int i3) {
        synchronized (C30664c.class) {
            MethodCollector.m26663i(12401);
            if (f73338c == 0) {
                f73338c = TEMediaCodecDecoder.getMaxBlocksSizePerSecond();
                C85315al.m146637a("TEMediaCodecResourceManager", "sMaxCodecBlocksSize: " + f73338c);
            }
            int i4 = f73338c;
            if (i4 == -1) {
                MethodCollector.m26664o(12401);
                return true;
            }
            int i5 = f73337b;
            int i6 = i * i2 * i3;
            if (i5 + i6 > i4) {
                C85315al.m146639b("TEMediaCodecResourceManager", "checkCanFastImport is false, sUsedCodecBlocksSize: " + f73337b + ", width: " + i + ", height: " + i2 + ", fps: " + i3);
                MethodCollector.m26664o(12401);
                return false;
            }
            if (i5 > 0) {
                int i7 = f73340e;
                if (i4 - i7 > 0 && i5 + i6 > i4 - i7) {
                    C85315al.m146639b("TEMediaCodecResourceManager", "checkCanFastImport is false, sUsedCodecBlocksSize: " + f73337b + ", width: " + i + ", height: " + i2 + ", fps: " + i3);
                    MethodCollector.m26664o(12401);
                    return false;
                }
            }
            C85315al.m146639b("TEMediaCodecResourceManager", "checkCanFastImport is true");
            MethodCollector.m26664o(12401);
            return true;
        }
    }
}
