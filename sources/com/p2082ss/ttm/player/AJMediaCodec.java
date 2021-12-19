package com.p2082ss.ttm.player;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Surface;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.ttm.p4406a.C86222e;
import com.p2082ss.ttm.player.DummySurface;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.ss.ttm.player.AJMediaCodec */
class AJMediaCodec {

    /* renamed from: h */
    private static ArrayList<MediaCodecInfo> f192460h = new ArrayList<>();

    /* renamed from: i */
    private static Object f192461i = new Object();

    /* renamed from: j */
    private static boolean f192462j = false;

    /* renamed from: k */
    private static boolean f192463k = false;

    /* renamed from: m */
    private static boolean f192464m = false;

    /* renamed from: n */
    private static boolean f192465n = false;

    /* renamed from: p */
    private static boolean f192466p = false;

    /* renamed from: q */
    private static int f192467q = 1;

    /* renamed from: a */
    public MediaCodec f192468a;

    /* renamed from: b */
    public MediaFormat f192469b;

    /* renamed from: c */
    public AJMediaFormat f192470c = new AJMediaFormat();

    /* renamed from: d */
    public long f192471d = 0;

    /* renamed from: e */
    private ByteBuffer[] f192472e;

    /* renamed from: f */
    private ByteBuffer[] f192473f;

    /* renamed from: g */
    private boolean f192474g;

    /* renamed from: l */
    private MediaCodec.BufferInfo f192475l;

    /* renamed from: o */
    private Surface f192476o;

    /* renamed from: r */
    private int f192477r = 0;

    /* renamed from: s */
    private String f192478s;

    public static final native void _onEmptyBuffer(long j, int i);

    public static final native void _onError(long j);

    public static final native void _onFilledBuffer(long j, int i, int i2, int i3, long j2, int i4);

    public static final native void _onFormatChanged(long j, int i, AJMediaFormat aJMediaFormat);

    public String getErrorInfo() {
        return this.f192478s;
    }

    public int getOSVerion() {
        return C86222e.f192440a;
    }

    private boolean supportSetSurface() {
        if (!f192463k) {
            return true;
        }
        return false;
    }

    public void flush() {
        try {
            this.f192468a.flush();
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    private void m148211b() {
        int i = Build.VERSION.SDK_INT;
        this.f192476o = new DummySurface.HandlerThreadC86230a().mo136687a();
    }

    public int getChannelCount() {
        MediaFormat mediaFormat = this.f192469b;
        if (mediaFormat != null) {
            try {
                return mediaFormat.getInteger("channel-count");
            } catch (Exception unused) {
            }
        }
        return 0;
    }

    public ByteBuffer[] getInputBuffers() {
        if (this.f192474g) {
            return this.f192473f;
        }
        return null;
    }

    public int getSampleRate() {
        MediaFormat mediaFormat = this.f192469b;
        if (mediaFormat != null) {
            try {
                return mediaFormat.getInteger("sample-rate");
            } catch (Exception unused) {
            }
        }
        return 0;
    }

    public int getSliceHeight() {
        MediaFormat mediaFormat = this.f192469b;
        if (mediaFormat != null) {
            try {
                return mediaFormat.getInteger("slice-height");
            } catch (Exception unused) {
            }
        }
        return 0;
    }

    public int getStride() {
        MediaFormat mediaFormat = this.f192469b;
        if (mediaFormat != null) {
            try {
                return mediaFormat.getInteger("stride");
            } catch (Exception unused) {
            }
        }
        return 0;
    }

    public int stop() {
        if (this.f192474g) {
            try {
                this.f192474g = false;
                this.f192468a.stop();
            } catch (Exception unused) {
                return -1;
            }
        }
        return 0;
    }

    public void close() {
        if (this.f192468a != null) {
            stop();
            final MediaCodec mediaCodec = this.f192468a;
            this.f192473f = null;
            this.f192472e = null;
            this.f192468a = null;
            try {
                C86239b.m148297a(new Runnable() {
                    /* class com.p2082ss.ttm.player.AJMediaCodec.RunnableC862272 */

                    static {
                        Covode.recordClassIndex(101375);
                    }

                    public final void run() {
                        AJMediaCodec.this.mo136617a(mediaCodec);
                    }
                });
            } catch (Throwable unused) {
                mo136617a(mediaCodec);
            }
        }
    }

    public int getColorFormat() {
        MediaFormat mediaFormat = this.f192469b;
        if (mediaFormat != null) {
            try {
                int integer = mediaFormat.getInteger("color-format");
                if (integer == 21 || integer == 2130706688 || integer == 2141391872) {
                    return 3;
                }
                return 0;
            } catch (Exception unused) {
            }
        }
        return 0;
    }

    public int getColorTransfer() {
        MediaFormat mediaFormat = this.f192469b;
        if (mediaFormat != null) {
            try {
                int integer = mediaFormat.getInteger("color-transfer");
                if (integer == 6) {
                    return 16;
                }
                if (integer != 7) {
                    return 0;
                }
                return 18;
            } catch (Exception unused) {
            }
        }
        return 0;
    }

    public int vendorOppoHWEnable() {
        if (C86222e.f192445f.equals("OPPO")) {
            try {
                return Integer.parseInt(m148205a("persist.sys.aweme.hdsupport", "1"));
            } catch (NumberFormatException unused) {
            }
        }
        return 1;
    }

    static {
        Covode.recordClassIndex(101373);
    }

    public int start() {
        try {
            this.f192468a.start();
            if (this.f192477r == 0) {
                this.f192473f = this.f192468a.getInputBuffers();
                if (C86222e.f192440a >= 21) {
                    this.f192472e = this.f192468a.getOutputBuffers();
                }
            } else {
                this.f192473f = null;
                this.f192472e = null;
            }
            this.f192474g = true;
            this.f192475l = new MediaCodec.BufferInfo();
            return 0;
        } catch (Exception e) {
            m148210b(e);
            return -1;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005b, code lost:
        if (r1.startsWith("mt6750") == false) goto L_0x005f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AJMediaCodec() {
        /*
        // Method dump skipped, instructions count: 103
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.ttm.player.AJMediaCodec.<init>():void");
    }

    public int getFormatHeight() {
        MediaFormat mediaFormat = this.f192469b;
        if (mediaFormat != null) {
            try {
                if (!mediaFormat.containsKey("crop-right") || !this.f192469b.containsKey("crop-left") || !this.f192469b.containsKey("crop-bottom") || !this.f192469b.containsKey("crop-top")) {
                    return this.f192469b.getInteger("height");
                }
                return (this.f192469b.getInteger("crop-bottom") - this.f192469b.getInteger("crop-top")) + 1;
            } catch (Exception unused) {
            }
        }
        return 0;
    }

    public int getFormatWidth() {
        MediaFormat mediaFormat = this.f192469b;
        if (mediaFormat != null) {
            try {
                if (!mediaFormat.containsKey("crop-right") || !this.f192469b.containsKey("crop-left") || !this.f192469b.containsKey("crop-bottom") || !this.f192469b.containsKey("crop-top")) {
                    return this.f192469b.getInteger("width");
                }
                return (this.f192469b.getInteger("crop-right") - this.f192469b.getInteger("crop-left")) + 1;
            } catch (Exception unused) {
            }
        }
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0052, code lost:
        if (r3.equals("mido") != false) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0076, code lost:
        if (r2.equals("AFTA") != false) goto L_0x0078;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0061 A[Catch:{ all -> 0x0083 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0070 A[Catch:{ all -> 0x0083 }] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m148212c() {
        /*
        // Method dump skipped, instructions count: 137
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.ttm.player.AJMediaCodec.m148212c():boolean");
    }

    /* renamed from: a */
    private static boolean m148208a() {
        String a = m148205a("ro.board.platform", (String) null);
        if (C86222e.f192440a != 26 || a == null) {
            return false;
        }
        if (!a.startsWith("kirin960") && !a.startsWith("hi3660")) {
            return false;
        }
        double d = 0.0d;
        try {
            d = Double.parseDouble(m148205a("ro.config.hw_codec_support", "0.0"));
        } catch (NumberFormatException unused) {
        }
        if (d < 0.18041d) {
            return true;
        }
        return false;
    }

    public void setEnableVC1BlockList(int i) {
        f192467q = i;
    }

    public void setHandler(long j) {
        this.f192471d = j;
    }

    public void setMode(int i) {
        this.f192477r = i;
    }

    /* renamed from: b */
    private static int m148209b(int i) {
        return ((i + 16) - 1) / 16;
    }

    public int createByCodecName(String str) {
        try {
            this.f192468a = MediaCodec.createByCodecName(str);
            return 0;
        } catch (Exception e) {
            m148210b(e);
            return -1;
        }
    }

    public int dequeueInputBuffer(long j) {
        try {
            return this.f192468a.dequeueInputBuffer(j);
        } catch (Exception e) {
            return m148210b(e);
        }
    }

    public ByteBuffer getInputBuffer(int i) {
        if (this.f192474g) {
            try {
                return this.f192468a.getInputBuffer(i);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* renamed from: a */
    private int m148201a(int i) {
        if (i == 0) {
            return 0;
        }
        try {
            this.f192468a.setCallback(new MediaCodec.Callback() {
                /* class com.p2082ss.ttm.player.AJMediaCodec.C862261 */

                static {
                    Covode.recordClassIndex(101374);
                }

                public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
                    MethodCollector.m26663i(4347);
                    AJMediaCodec._onError(AJMediaCodec.this.f192471d);
                    MethodCollector.m26664o(4347);
                }

                public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
                    MethodCollector.m26663i(4279);
                    if (mediaCodec == AJMediaCodec.this.f192468a) {
                        AJMediaCodec._onEmptyBuffer(AJMediaCodec.this.f192471d, i);
                    }
                    MethodCollector.m26664o(4279);
                }

                /* JADX WARNING: Removed duplicated region for block: B:38:0x00b1  */
                /* JADX WARNING: Removed duplicated region for block: B:47:0x00de  */
                /* JADX WARNING: Removed duplicated region for block: B:50:0x00ee  */
                /* JADX WARNING: Removed duplicated region for block: B:63:0x0121  */
                /* JADX WARNING: Removed duplicated region for block: B:64:0x0123  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void onOutputFormatChanged(android.media.MediaCodec r18, android.media.MediaFormat r19) {
                    /*
                    // Method dump skipped, instructions count: 345
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.ttm.player.AJMediaCodec.C862261.onOutputFormatChanged(android.media.MediaCodec, android.media.MediaFormat):void");
                }

                public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
                    MethodCollector.m26663i(4281);
                    if (mediaCodec == AJMediaCodec.this.f192468a) {
                        AJMediaCodec._onFilledBuffer(AJMediaCodec.this.f192471d, i, bufferInfo.offset, bufferInfo.size, bufferInfo.presentationTimeUs, bufferInfo.flags);
                    }
                    MethodCollector.m26664o(4281);
                }
            });
            return 0;
        } catch (Exception unused) {
            return -1;
        }
    }

    /* renamed from: b */
    private int m148210b(Exception exc) {
        this.f192478s = exc.toString();
        if (C86222e.f192440a >= 21) {
            return m148204a(exc);
        }
        if (exc instanceof IllegalStateException) {
            return -10002;
        }
        return -10000;
    }

    public void decodeFRC(int i) {
        if (this.f192468a != null && this.f192474g && C86222e.f192440a >= 23) {
            Bundle bundle = new Bundle();
            bundle.putInt("vivo.video-dec.dynamic-frc", i);
            try {
                this.f192468a.setParameters(bundle);
            } catch (Exception unused) {
            }
        }
    }

    public int setOutputSurface(Surface surface) {
        if (f192463k || !this.f192474g) {
            return -1;
        }
        if (surface == null) {
            if (this.f192476o == null) {
                m148211b();
            }
            surface = this.f192476o;
        }
        return m148203a(this.f192468a, surface);
    }

    public void speedEnhance(float f) {
        if (this.f192468a != null && this.f192474g && C86222e.f192440a >= 23 && f > 30.0f) {
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", f);
            try {
                this.f192468a.setParameters(bundle);
            } catch (Exception unused) {
            }
        }
    }

    public int write(AJMediaCodecFrame aJMediaCodecFrame) {
        if (!(aJMediaCodecFrame == null || aJMediaCodecFrame.data == null)) {
            try {
                int dequeueInputBuffer = this.f192468a.dequeueInputBuffer(30000);
                if (dequeueInputBuffer >= 0) {
                    this.f192473f[dequeueInputBuffer].put(aJMediaCodecFrame.data);
                    this.f192468a.queueInputBuffer(dequeueInputBuffer, 0, aJMediaCodecFrame.size, aJMediaCodecFrame.pts, 0);
                    return 0;
                } else if (dequeueInputBuffer == -1) {
                    return 4;
                }
            } catch (Exception unused) {
            }
        }
        return -1;
    }

    /* renamed from: a */
    private static int m148204a(Exception exc) {
        if (exc instanceof MediaCodec.CodecException) {
            MediaCodec.CodecException codecException = (MediaCodec.CodecException) exc;
            if (C86222e.f192440a >= 23) {
                codecException.isRecoverable();
                codecException.getErrorCode();
                if (!(codecException.isRecoverable() || codecException.getErrorCode() == 1100 || codecException.getErrorCode() == 1101)) {
                    return -10001;
                }
            } else {
                codecException.isRecoverable();
                if (!codecException.isRecoverable()) {
                    return -10001;
                }
            }
        }
        if (exc instanceof IllegalStateException) {
            return -10002;
        }
        return -10000;
    }

    public String getBestCodecName(String str) {
        int i;
        MediaCodecInfo mediaCodecInfo;
        String[] supportedTypes;
        boolean z;
        C86238a a;
        MethodCollector.m26663i(9525);
        if (C86222e.f192440a < 16) {
            MethodCollector.m26664o(9525);
            return null;
        } else if (TextUtils.isEmpty(str)) {
            MethodCollector.m26664o(9525);
            return null;
        } else if (!str.equals("video/hevc") || !f192465n || f192467q <= 0) {
            ArrayList arrayList = new ArrayList();
            synchronized (f192461i) {
                try {
                    boolean z2 = !f192460h.isEmpty();
                    if (z2) {
                        try {
                            i = f192460h.size();
                        } catch (Exception unused) {
                            MethodCollector.m26664o(9525);
                            return null;
                        }
                    } else {
                        i = MediaCodecList.getCodecCount();
                    }
                    for (int i2 = 0; i2 < i && (!z2 || arrayList.isEmpty()); i2++) {
                        if (z2) {
                            mediaCodecInfo = f192460h.get(i2);
                        } else {
                            mediaCodecInfo = MediaCodecList.getCodecInfoAt(i2);
                        }
                        String name = mediaCodecInfo.getName();
                        if (!mediaCodecInfo.isEncoder() && !name.startsWith("OMX.google") && !name.startsWith("c2.android") && (supportedTypes = mediaCodecInfo.getSupportedTypes()) != null) {
                            for (String str2 : supportedTypes) {
                                if (!TextUtils.isEmpty(str2)) {
                                    if (!z2 && str2.startsWith("video/")) {
                                        f192460h.add(mediaCodecInfo);
                                    }
                                    if (str2.equalsIgnoreCase(str) && ((name.startsWith("OMX.") || name.startsWith("c2.")) && !name.startsWith("OMX.pv") && !name.startsWith("OMX.ittiam") && !name.contains("ffmpeg") && !name.contains("avcodec") && !name.contains("secure") && (!name.startsWith("OMX.MTK.") || C86222e.f192440a >= 18))) {
                                        if (C86222e.f192440a < 18 || ((C86222e.f192440a == 18 && ("OMX.SEC.avc.dec".equals(name) || "OMX.SEC.avc.dec.secure".equals(name))) || (C86222e.f192440a == 19 && C86222e.f192443d.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(name) || "OMX.Exynos.avc.dec.secure".equals(name))))) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        if (!z && (a = C86238a.m148294a(mediaCodecInfo, str)) != null) {
                                            a.f192640a.getName();
                                            if ((a.f192641b != 40 || C86222e.f192440a >= 21) && a.f192641b != 20) {
                                                arrayList.add(a);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (arrayList.isEmpty()) {
                        return null;
                    }
                    C86238a aVar = (C86238a) arrayList.get(0);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        C86238a aVar2 = (C86238a) it.next();
                        if (aVar2.f192641b > aVar.f192641b) {
                            aVar = aVar2;
                        }
                    }
                    String name2 = aVar.f192640a.getName();
                    MethodCollector.m26664o(9525);
                    return name2;
                } finally {
                    MethodCollector.m26664o(9525);
                }
            }
        } else {
            MethodCollector.m26664o(9525);
            return null;
        }
    }

    /* renamed from: a */
    public final void mo136617a(MediaCodec mediaCodec) {
        if (mediaCodec != null) {
            try {
                mediaCodec.release();
                Surface surface = this.f192476o;
                if (surface != null) {
                    surface.release();
                    this.f192476o = null;
                }
            } catch (Exception unused) {
                if (this.f192476o != null) {
                    this.f192476o.release();
                    this.f192476o = null;
                }
            } catch (Throwable th) {
                if (this.f192476o != null) {
                    this.f192476o.release();
                    this.f192476o = null;
                }
                throw th;
            }
        }
    }

    /* renamed from: a */
    private int m148202a(int i, long j) {
        try {
            this.f192468a.releaseOutputBuffer(i, j);
            return 0;
        } catch (Exception unused) {
            return -10000;
        }
    }

    /* renamed from: a */
    private int m148203a(MediaCodec mediaCodec, Surface surface) {
        try {
            mediaCodec.setOutputSurface(surface);
            return 0;
        } catch (Exception e) {
            m148210b(e);
            return -1;
        }
    }

    public int read(AJMediaCodecFrame aJMediaCodecFrame, long j) {
        while (true) {
            try {
                int dequeueOutputBuffer = this.f192468a.dequeueOutputBuffer(this.f192475l, j);
                if (dequeueOutputBuffer >= 0) {
                    aJMediaCodecFrame.data = this.f192472e[dequeueOutputBuffer];
                    aJMediaCodecFrame.pts = this.f192475l.presentationTimeUs;
                    aJMediaCodecFrame.index = dequeueOutputBuffer;
                    aJMediaCodecFrame.size = this.f192475l.size;
                    aJMediaCodecFrame.flags = this.f192475l.flags;
                    return 0;
                } else if (dequeueOutputBuffer == -3) {
                    try {
                        this.f192472e = this.f192468a.getOutputBuffers();
                    } catch (Exception e) {
                        return m148210b(e);
                    }
                } else if (dequeueOutputBuffer != -2) {
                    return -1;
                } else {
                    try {
                        this.f192469b = this.f192468a.getOutputFormat();
                        if (this.f192472e == null) {
                            try {
                                this.f192472e = this.f192468a.getOutputBuffers();
                            } catch (Exception e2) {
                                return m148210b(e2);
                            }
                        }
                        return dequeueOutputBuffer;
                    } catch (Exception e3) {
                        return m148210b(e3);
                    }
                }
            } catch (Exception e4) {
                return m148210b(e4);
            }
        }
    }

    /* renamed from: a */
    private static String m148205a(String str, String str2) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class, String.class).invoke(cls, str, str2);
        } catch (Exception e) {
            e.printStackTrace();
        } catch (Throwable unused) {
        }
        return str2;
    }

    /* renamed from: a */
    private static void m148206a(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    public int releaseBuffer(int i, boolean z, long j) {
        if (C86222e.f192440a >= 21 && z) {
            return m148202a(i, j);
        }
        try {
            this.f192468a.releaseOutputBuffer(i, z);
            return 0;
        } catch (Exception e) {
            return m148210b(e);
        }
    }

    /* renamed from: a */
    private static void m148207a(MediaFormat mediaFormat, ByteBuffer byteBuffer, int i) {
        if (byteBuffer != null) {
            mediaFormat.setByteBuffer("csd-".concat(String.valueOf(i)), byteBuffer);
        }
    }

    public int queueInputBuffer(int i, int i2, int i3, long j, int i4) {
        try {
            this.f192468a.queueInputBuffer(i, i2, i3, j, i4);
            return 0;
        } catch (Exception e) {
            return m148210b(e);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01a9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int configure(int r15, int r16, int r17, int r18, int r19, java.lang.String r20, java.nio.ByteBuffer r21, java.nio.ByteBuffer r22, java.nio.ByteBuffer r23, android.view.Surface r24, boolean r25, boolean r26, int r27, int r28, boolean r29, int r30, boolean r31, boolean r32, int r33, int r34) {
        /*
        // Method dump skipped, instructions count: 502
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.ttm.player.AJMediaCodec.configure(int, int, int, int, int, java.lang.String, java.nio.ByteBuffer, java.nio.ByteBuffer, java.nio.ByteBuffer, android.view.Surface, boolean, boolean, int, int, boolean, int, boolean, boolean, int, int):int");
    }
}
