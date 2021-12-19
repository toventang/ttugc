package com.p2082ss.android.medialib;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.util.Pair;
import android.view.Surface;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.covode.number.Covode;
import java.io.BufferedOutputStream;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.Queue;

/* renamed from: com.ss.android.medialib.c */
public class C29991c {

    /* renamed from: a */
    public static final String f71551a = C29991c.class.getSimpleName();

    /* renamed from: b */
    public static AbstractC30003d f71552b = null;

    /* renamed from: t */
    private static int f71553t = LiveNetAdaptiveHurryTimeSetting.DEFAULT;

    /* renamed from: A */
    private int f71554A = 0;

    /* renamed from: B */
    private int f71555B = 0;

    /* renamed from: c */
    MediaCodec.BufferInfo f71556c;

    /* renamed from: d */
    ByteBuffer[] f71557d;

    /* renamed from: e */
    ByteBuffer[] f71558e;

    /* renamed from: f */
    public MediaCodec f71559f;

    /* renamed from: g */
    public Surface f71560g;

    /* renamed from: h */
    public C30009i f71561h;

    /* renamed from: i */
    public int f71562i = 0;

    /* renamed from: j */
    public int f71563j = 30;

    /* renamed from: k */
    public float f71564k = 1.0f;

    /* renamed from: l */
    public int f71565l = 1;

    /* renamed from: m */
    public float f71566m = 1.0f;

    /* renamed from: n */
    public float f71567n = 1.0f;

    /* renamed from: o */
    public float f71568o = 1.0f;

    /* renamed from: p */
    public float f71569p = 1.0f;

    /* renamed from: q */
    public float f71570q = 1.0f;

    /* renamed from: r */
    public float f71571r = 1.0f;

    /* renamed from: s */
    BufferedOutputStream f71572s = null;

    /* renamed from: u */
    private String f71573u = "video/avc";

    /* renamed from: v */
    private MediaCodecInfo f71574v;

    /* renamed from: w */
    private int f71575w;

    /* renamed from: x */
    private int f71576x;

    /* renamed from: y */
    private boolean f71577y;

    /* renamed from: z */
    private Queue<Pair<Integer, Integer>> f71578z = new LinkedList();

    static {
        Covode.recordClassIndex(36443);
        new Thread(new Runnable() {
            /* class com.p2082ss.android.medialib.C29991c.RunnableC299921 */

            static {
                Covode.recordClassIndex(36444);
            }

            public final void run() {
                MediaCodecList.getCodecCount();
            }
        }).start();
    }

    /* renamed from: a */
    private MediaCodecInfo m60534a() {
        String[] supportedTypes;
        int codecCount = MediaCodecList.getCodecCount();
        for (int i = 0; i < codecCount; i++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
            if (codecInfoAt.isEncoder()) {
                for (String str : codecInfoAt.getSupportedTypes()) {
                    if (str.equalsIgnoreCase(this.f71573u)) {
                        return codecInfoAt;
                    }
                }
                continue;
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x0072 A[Catch:{ Exception -> 0x0141 }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00bc A[SYNTHETIC, Splitter:B:59:0x00bc] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00c1  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.Surface mo52811a(int r17, int r18, int r19, boolean r20) {
        /*
        // Method dump skipped, instructions count: 336
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.medialib.C29991c.mo52811a(int, int, int, boolean):android.view.Surface");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0103, code lost:
        if (r8 >= 0) goto L_0x0107;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0109, code lost:
        if (android.os.Build.VERSION.SDK_INT < 21) goto L_0x019c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x010b, code lost:
        r7 = r13.f71559f.getOutputBuffer(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0111, code lost:
        r5 = r13.f71556c.size - r13.f71556c.offset;
        r7.position(r13.f71556c.offset);
        r10 = new byte[r5];
        r7.get(r10, 0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x012b, code lost:
        if ((r13.f71556c.flags & 2) == 0) goto L_0x013f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x012d, code lost:
        r0 = com.p2082ss.android.medialib.C29991c.f71552b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x012f, code lost:
        if (r0 == null) goto L_0x0134;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0131, code lost:
        r0.onMarkSetCodecConfig(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0134, code lost:
        r13.f71556c.size = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0144, code lost:
        if ((r13.f71556c.flags & 1) == 0) goto L_0x0148;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0146, code lost:
        r9 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0148, code lost:
        r9 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x014b, code lost:
        if (com.p2082ss.android.medialib.C29991c.f71552b == null) goto L_0x0196;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x014d, code lost:
        com.p2082ss.android.vesdk.C85315al.m146639b(r1, "encode: pts queue size = " + r13.f71578z.size());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x016b, code lost:
        if (r13.f71578z.size() <= 0) goto L_0x0190;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x016d, code lost:
        r13.f71555B++;
        r7 = r13.f71578z.poll();
        com.p2082ss.android.medialib.C29991c.f71552b.onMarkWriteFile(r10, ((java.lang.Integer) r7.first).intValue(), ((java.lang.Integer) r7.second).intValue(), r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0190, code lost:
        com.p2082ss.android.vesdk.C85315al.m146639b(r1, "encode: no available pts!!!");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0196, code lost:
        com.p2082ss.android.vesdk.C85315al.m146639b(r1, "encode: no output.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x019c, code lost:
        r7 = r13.f71558e[r8];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01a2, code lost:
        com.p2082ss.android.vesdk.C85315al.m146641c(r1, "encode: error.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01a7, code lost:
        if (r18 == false) goto L_0x01b3;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo52810a(int r14, int r15, int r16, int r17, boolean r18) {
        /*
        // Method dump skipped, instructions count: 486
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.medialib.C29991c.mo52810a(int, int, int, int, boolean):int");
    }
}
