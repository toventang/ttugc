package com.p2082ss.android.medialib;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.util.Log;
import android.util.Pair;
import android.view.Surface;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.medialib.p2155b.C29990d;
import com.p2082ss.android.ttve.monitor.C30693g;
import com.p2082ss.android.vesdk.C85315al;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.Queue;

/* renamed from: com.ss.android.medialib.a */
public class C29974a {

    /* renamed from: a */
    public static AbstractC29982b f71489a;

    /* renamed from: b */
    static int f71490b = 5000;

    /* renamed from: c */
    static int f71491c;

    /* renamed from: m */
    private static final String[] f71492m = {"BITRATE_MODE_CQ", "BITRATE_MODE_VBR", "BITRATE_MODE_CBR"};

    /* renamed from: d */
    MediaCodec.BufferInfo f71493d;

    /* renamed from: e */
    ByteBuffer[] f71494e;

    /* renamed from: f */
    ByteBuffer[] f71495f;

    /* renamed from: g */
    int f71496g = 0;

    /* renamed from: h */
    public int f71497h = 30;

    /* renamed from: i */
    public int f71498i = 1;

    /* renamed from: j */
    public boolean f71499j = false;

    /* renamed from: k */
    public int f71500k = -1;

    /* renamed from: l */
    BufferedOutputStream f71501l = null;

    /* renamed from: n */
    private MediaCodec f71502n;

    /* renamed from: o */
    private String f71503o = "video/avc";

    /* renamed from: p */
    private MediaCodecInfo f71504p;

    /* renamed from: q */
    private Surface f71505q;

    /* renamed from: r */
    private C29990d f71506r;

    /* renamed from: s */
    private int f71507s;

    /* renamed from: t */
    private int f71508t;

    /* renamed from: u */
    private boolean f71509u;

    /* renamed from: v */
    private Queue<Pair<Integer, Integer>> f71510v = new LinkedList();

    /* renamed from: w */
    private int f71511w;

    /* renamed from: x */
    private EnumC29976a f71512x = EnumC29976a.H264;

    /* renamed from: y */
    private int f71513y = 0;

    /* renamed from: z */
    private int f71514z = 0;

    /* renamed from: a */
    public static int m60495a() {
        try {
            return MediaCodecList.getCodecCount();
        } catch (Exception e) {
            C85315al.m146642d("AVCEncoder", Log.getStackTraceString(e));
            return 0;
        }
    }

    /* renamed from: com.ss.android.medialib.a$a */
    public enum EnumC29976a {
        H264,
        ByteVC1,
        MPEG4;

        static {
            Covode.recordClassIndex(36428);
        }
    }

    static {
        Covode.recordClassIndex(36426);
        new Thread(new Runnable() {
            /* class com.p2082ss.android.medialib.C29974a.RunnableC299751 */

            static {
                Covode.recordClassIndex(36427);
            }

            public final void run() {
                MethodCollector.m26663i(2771);
                synchronized (C29974a.class) {
                    try {
                        C29974a.m60495a();
                    } finally {
                        MethodCollector.m26664o(2771);
                    }
                }
            }
        }).start();
    }

    /* renamed from: d */
    public final synchronized void mo52781d() {
        MethodCollector.m26663i(1657);
        long currentTimeMillis = System.currentTimeMillis();
        try {
            this.f71502n.release();
        } catch (Exception unused) {
        }
        this.f71502n = null;
        this.f71496g = 0;
        C85315al.m146637a("AVCEncoder", "time cost: " + (System.currentTimeMillis() - currentTimeMillis));
        MethodCollector.m26664o(1657);
    }

    /* renamed from: e */
    private MediaCodecInfo m60497e() {
        String[] supportedTypes;
        int a = m60495a();
        for (int i = 0; i < a; i++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
            if (codecInfoAt.isEncoder()) {
                String name = codecInfoAt.getName();
                if (!name.startsWith("OMX.google.") && !name.startsWith("OMX.Nvidia.") && !name.equals("OMX.TI.DUCATI1.VIDEO.H264E")) {
                    for (String str : codecInfoAt.getSupportedTypes()) {
                        if (str.equalsIgnoreCase(this.f71503o)) {
                            return codecInfoAt;
                        }
                    }
                    continue;
                }
            }
        }
        return null;
    }

    /* renamed from: c */
    public final void mo52780c() {
        MediaCodec mediaCodec;
        MethodCollector.m26663i(1505);
        C85315al.m146637a("AVCEncoder", "uninitAVCEncoder == enter");
        synchronized (this) {
            try {
                int i = this.f71496g;
                if (i != 0 && (mediaCodec = this.f71502n) != null) {
                    if (i == 2) {
                        try {
                            mediaCodec.stop();
                        } catch (Exception unused) {
                            C85315al.m146642d("AVCEncoder", "MediaCodec Exception");
                        }
                    }
                    this.f71496g = 3;
                    Surface surface = this.f71505q;
                    if (surface != null) {
                        surface.release();
                    }
                    mo52781d();
                    C85315al.m146637a("AVCEncoder", "uninitAVCEncoder == exit");
                    MethodCollector.m26664o(1505);
                }
            } finally {
                MethodCollector.m26664o(1505);
            }
        }
    }

    /* renamed from: f */
    private int m60498f() {
        MediaCodecInfo e;
        String[] supportedTypes;
        C85315al.m146637a("AVCEncoder", "start == ");
        int[] iArr = null;
        if (Build.VERSION.SDK_INT >= 21) {
            MediaCodecInfo[] codecInfos = new MediaCodecList(1).getCodecInfos();
            if (codecInfos != null && codecInfos.length != 0) {
                int length = codecInfos.length;
                int i = 0;
                loop1:
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    e = codecInfos[i];
                    if (e != null && e.isEncoder()) {
                        String name = e.getName();
                        if (!name.startsWith("OMX.google.") && !name.startsWith("OMX.Nvidia.") && !name.equals("OMX.TI.DUCATI1.VIDEO.H264E")) {
                            for (String str : e.getSupportedTypes()) {
                                if (str.equalsIgnoreCase(this.f71503o)) {
                                    break loop1;
                                }
                            }
                            continue;
                        }
                    }
                    i++;
                }
            }
            e = null;
        } else {
            e = m60497e();
        }
        this.f71504p = e;
        C85315al.m146637a("AVCEncoder", "end == ");
        if (this.f71504p == null) {
            C85315al.m146642d("AVCEncoder", "mMediaCodecInfo failed");
        } else {
            C85315al.m146637a("AVCEncoder", "mMediaCodecInfo name = " + this.f71504p.getName());
            MediaCodecInfo.CodecCapabilities capabilitiesForType = this.f71504p.getCapabilitiesForType(this.f71503o);
            int length2 = capabilitiesForType.colorFormats.length;
            iArr = new int[length2];
            for (int i2 = 0; i2 < length2; i2++) {
                iArr[i2] = capabilitiesForType.colorFormats[i2];
            }
        }
        if (iArr == null) {
            return -1;
        }
        for (int i3 = 0; i3 < iArr.length; i3++) {
            if (iArr[i3] == 2130708361) {
                C85315al.m146637a("AVCEncoder", "====== mColorFormat support COLOR_FormatSurface ======");
                return iArr[i3];
            }
        }
        return -1;
    }

    /* renamed from: b */
    public final synchronized int mo52779b() {
        MethodCollector.m26663i(1342);
        if (this.f71496g != 0) {
            C85315al.m146642d("AVCEncoder", "createEncoder is wrong status: " + this.f71496g);
            MethodCollector.m26664o(1342);
            return -302;
        }
        int f = m60498f();
        this.f71511w = f;
        if (f < 0) {
            C85315al.m146642d("AVCEncoder", "get color format failed");
            MethodCollector.m26664o(1342);
            return -100;
        }
        try {
            MediaCodec createEncoderByType = MediaCodec.createEncoderByType(this.f71503o);
            this.f71502n = createEncoderByType;
            MediaCodecInfo codecInfo = createEncoderByType.getCodecInfo();
            if (codecInfo.getName().startsWith("OMX.google.")) {
                C85315al.m146642d("AVCEncoder", "find OMX.google encode...");
                MethodCollector.m26664o(1342);
                return -608;
            }
            for (String str : codecInfo.getSupportedTypes()) {
                C85315al.m146637a("AVCEncoder", "CodecNames: ".concat(String.valueOf(str)));
            }
            this.f71496g = 1;
            MethodCollector.m26664o(1342);
            return 0;
        } catch (IOException e) {
            e.printStackTrace();
            C85315al.m146642d("AVCEncoder", "createEncoderByTyp: " + e.getMessage());
            C30693g.m63057a(e);
            MethodCollector.m26664o(1342);
            return -607;
        }
    }

    /* renamed from: a */
    public final void mo52778a(int i) {
        this.f71512x = EnumC29976a.values()[i];
        EnumC29976a aVar = EnumC29976a.MPEG4;
        EnumC29976a aVar2 = this.f71512x;
        if (aVar == aVar2) {
            this.f71503o = "video/mp4v-es";
        } else if (aVar2 == EnumC29976a.ByteVC1) {
            this.f71503o = "video/hevc";
        } else {
            this.f71503o = "video/avc";
        }
        C85315al.m146637a("AVCEncoder", "setCodecType on AVCEncoder " + this.f71512x);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00be, code lost:
        if (r5.profile < 2) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ce, code lost:
        if (r5.profile < 8) goto L_0x00aa;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00af A[LOOP:2: B:18:0x0081->B:25:0x00af, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0043 A[SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.media.MediaCodecInfo.CodecProfileLevel m60496b(int r12) {
        /*
        // Method dump skipped, instructions count: 209
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.medialib.C29974a.m60496b(int):android.media.MediaCodecInfo$CodecProfileLevel");
    }

    /* renamed from: a */
    public final int mo52776a(byte[] bArr, int i, boolean z) {
        int i2;
        int i3;
        int i4;
        int i5;
        MethodCollector.m26663i(1807);
        synchronized (this) {
            try {
                if (this.f71496g == 2) {
                    if (this.f71502n != null) {
                        C85315al.m146639b("AVCEncoder", "encodeBuffer pts: " + i + "  isEndStream = " + z);
                        if (Build.VERSION.SDK_INT >= 21) {
                            int dequeueInputBuffer = this.f71502n.dequeueInputBuffer(-1);
                            if (dequeueInputBuffer >= 0) {
                                ByteBuffer inputBuffer = this.f71502n.getInputBuffer(dequeueInputBuffer);
                                inputBuffer.clear();
                                inputBuffer.put(bArr, 0, bArr.length);
                                MediaCodec mediaCodec = this.f71502n;
                                int length = bArr.length;
                                long j = (long) i;
                                if (z) {
                                    i5 = 4;
                                } else {
                                    i5 = 0;
                                }
                                mediaCodec.queueInputBuffer(dequeueInputBuffer, 0, length, j, i5);
                            }
                            int dequeueOutputBuffer = this.f71502n.dequeueOutputBuffer(this.f71493d, (long) f71490b);
                            C85315al.m146639b("AVCEncoder", "outputBufferIndex = ".concat(String.valueOf(dequeueOutputBuffer)));
                            C85315al.m146639b("AVCEncoder", "mBufferInfo.flags = " + this.f71493d.flags);
                            while (dequeueOutputBuffer >= 0) {
                                ByteBuffer outputBuffer = this.f71502n.getOutputBuffer(dequeueOutputBuffer);
                                outputBuffer.position(this.f71493d.offset);
                                outputBuffer.limit(this.f71493d.offset + this.f71493d.size);
                                if ((this.f71493d.flags & 2) != 0) {
                                    C85315al.m146639b("AVCEncoder", "mEncoderCaller.onSetCodecConfig");
                                    AbstractC29982b bVar = f71489a;
                                    if (bVar != null) {
                                        bVar.onSetCodecConfig(outputBuffer);
                                    }
                                    this.f71493d.size = 0;
                                } else {
                                    int i6 = (int) this.f71493d.presentationTimeUs;
                                    if ((this.f71493d.flags & 1) != 0) {
                                        i4 = 1;
                                    } else {
                                        i4 = 0;
                                    }
                                    C85315al.m146639b("AVCEncoder", "mEncoderCaller.onWriteFile");
                                    AbstractC29982b bVar2 = f71489a;
                                    if (bVar2 != null) {
                                        bVar2.onWriteFile(outputBuffer, i6, 0, i4);
                                    }
                                }
                                this.f71502n.releaseOutputBuffer(dequeueOutputBuffer, false);
                                dequeueOutputBuffer = this.f71502n.dequeueOutputBuffer(this.f71493d, 0);
                            }
                        } else {
                            int dequeueInputBuffer2 = this.f71502n.dequeueInputBuffer(-1);
                            if (dequeueInputBuffer2 >= 0) {
                                ByteBuffer byteBuffer = this.f71494e[dequeueInputBuffer2];
                                byteBuffer.clear();
                                byteBuffer.put(bArr, 0, bArr.length);
                                MediaCodec mediaCodec2 = this.f71502n;
                                int length2 = bArr.length;
                                long j2 = (long) i;
                                if (z) {
                                    i3 = 4;
                                } else {
                                    i3 = 0;
                                }
                                mediaCodec2.queueInputBuffer(dequeueInputBuffer2, 0, length2, j2, i3);
                            }
                            int dequeueOutputBuffer2 = this.f71502n.dequeueOutputBuffer(this.f71493d, (long) f71490b);
                            while (dequeueOutputBuffer2 >= 0) {
                                ByteBuffer byteBuffer2 = this.f71495f[dequeueOutputBuffer2];
                                byteBuffer2.position(this.f71493d.offset);
                                byteBuffer2.limit(this.f71493d.offset + this.f71493d.size);
                                if ((this.f71493d.flags & 2) != 0) {
                                    C85315al.m146639b("AVCEncoder", "mEncoderCaller.onSetCodecConfig");
                                    AbstractC29982b bVar3 = f71489a;
                                    if (bVar3 != null) {
                                        bVar3.onSetCodecConfig(byteBuffer2);
                                    }
                                    this.f71493d.size = 0;
                                } else {
                                    int i7 = (int) this.f71493d.presentationTimeUs;
                                    if ((this.f71493d.flags & 1) != 0) {
                                        i2 = 1;
                                    } else {
                                        i2 = 0;
                                    }
                                    C85315al.m146639b("AVCEncoder", "mEncoderCaller.onWriteFile");
                                    AbstractC29982b bVar4 = f71489a;
                                    if (bVar4 != null) {
                                        bVar4.onWriteFile(byteBuffer2, i7, 0, i2);
                                    }
                                }
                                this.f71502n.releaseOutputBuffer(dequeueOutputBuffer2, false);
                                dequeueOutputBuffer2 = this.f71502n.dequeueOutputBuffer(this.f71493d, 0);
                            }
                        }
                        MethodCollector.m26664o(1807);
                        return 0;
                    }
                }
                return -1;
            } finally {
                MethodCollector.m26664o(1807);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0250, code lost:
        if (r23 != false) goto L_0x0252;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0252, code lost:
        r0 = r19.f71506r;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0254, code lost:
        if (r0 == null) goto L_0x025c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0256, code lost:
        r0.mo52808b();
        r19.f71506r = null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo52775a(int r20, int r21, int r22, boolean r23) {
        /*
        // Method dump skipped, instructions count: 695
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.medialib.C29974a.mo52775a(int, int, int, boolean):int");
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0171 A[Catch:{ Exception -> 0x033b }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.Surface mo52777a(int r17, int r18, int r19, int r20, int r21, int r22, boolean r23) {
        /*
        // Method dump skipped, instructions count: 877
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.medialib.C29974a.mo52777a(int, int, int, int, int, int, boolean):android.view.Surface");
    }
}
