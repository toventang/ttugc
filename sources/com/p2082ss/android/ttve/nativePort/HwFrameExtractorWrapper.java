package com.p2082ss.android.ttve.nativePort;

import android.media.Image;
import android.media.ImageReader;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ttve.common.C30640a;
import com.p2082ss.android.ttve.common.TEImageUtils;
import com.p2082ss.android.ttve.model.C30677e;
import com.p2082ss.android.ttve.model.VEFrame;
import com.p2082ss.android.vesdk.AbstractC85304ab;
import com.p2082ss.android.vesdk.C85315al;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.ttve.nativePort.HwFrameExtractorWrapper */
public class HwFrameExtractorWrapper {
    private static final String TAG = HwFrameExtractorWrapper.class.getSimpleName();
    private C30724b mExtractor;
    private C30729c mExtractorRange;
    private long mNativeAddr;

    public native boolean nativeOnFrameAvailable(long j, ByteBuffer byteBuffer, int i, int i2, int i3);

    static {
        Covode.recordClassIndex(37269);
    }

    public void stop() {
        MethodCollector.m26663i(14038);
        C30724b bVar = this.mExtractor;
        if (bVar != null) {
            bVar.f73519A = true;
            if (bVar.f73542v != null) {
                try {
                    new Handler(bVar.f73542v.getLooper()).post(new Runnable() {
                        /* class com.p2082ss.android.ttve.nativePort.C30724b.RunnableC307283 */

                        static {
                            Covode.recordClassIndex(37336);
                        }

                        public final void run() {
                            MethodCollector.m26663i(13175);
                            synchronized (C30724b.this.f73539s) {
                                try {
                                    C30724b.this.mo55446a();
                                    C30724b.this.f73539s.notify();
                                } finally {
                                    MethodCollector.m26664o(13175);
                                }
                            }
                        }
                    });
                    synchronized (bVar.f73539s) {
                        try {
                            if (!bVar.f73546z) {
                                bVar.f73539s.wait();
                            }
                        } catch (Throwable th) {
                            MethodCollector.m26664o(14038);
                            throw th;
                        }
                    }
                    bVar.f73542v.quitSafely();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            this.mExtractor = null;
        }
        C30729c cVar = this.mExtractorRange;
        if (cVar != null) {
            if (cVar.f73574l != null) {
                try {
                    new Handler(cVar.f73574l.getLooper()).post(new Runnable() {
                        /* class com.p2082ss.android.ttve.nativePort.C30729c.RunnableC307301 */

                        static {
                            Covode.recordClassIndex(37338);
                        }

                        public final void run() {
                            MethodCollector.m26663i(13483);
                            synchronized (C30729c.this.f73573k) {
                                try {
                                    C30729c cVar = C30729c.this;
                                    try {
                                        C85315al.m146637a(cVar.f73563a, "stop begin");
                                        if (!cVar.f73578p) {
                                            cVar.f73578p = true;
                                            if (cVar.f73576n != null) {
                                                cVar.f73572j.reset();
                                                cVar.f73572j.release();
                                            }
                                            if (cVar.f73576n != null) {
                                                cVar.f73576n.close();
                                            }
                                            if (cVar.f73575m != null) {
                                                cVar.f73575m.quitSafely();
                                            }
                                            C85315al.m146637a(cVar.f73563a, "stop end");
                                        }
                                    } catch (Exception e) {
                                        C85315al.m146637a(cVar.f73563a, "stop crash");
                                        Log.getStackTraceString(e);
                                        cVar.mo55455a();
                                    }
                                    C30729c.this.f73573k.notify();
                                } finally {
                                    MethodCollector.m26664o(13483);
                                }
                            }
                        }
                    });
                    synchronized (cVar.f73573k) {
                        try {
                            if (!cVar.f73578p) {
                                cVar.f73573k.wait();
                            }
                        } catch (Throwable th2) {
                            MethodCollector.m26664o(14038);
                            throw th2;
                        }
                    }
                    cVar.f73574l.quitSafely();
                } catch (InterruptedException e2) {
                    e2.printStackTrace();
                }
            }
            this.mExtractorRange = null;
        }
        MethodCollector.m26664o(14038);
    }

    public HwFrameExtractorWrapper(long j) {
        this.mNativeAddr = j;
    }

    public static HwFrameExtractorWrapper create(long j) {
        return new HwFrameExtractorWrapper(j);
    }

    public void startExtractFrameForRangeTime(String str, int i, int i2, int i3, int i4, int i5) {
        final long j = this.mNativeAddr;
        this.mExtractorRange = new C30729c(str, i, i2, i3, i4, i5, new AbstractC85304ab() {
            /* class com.p2082ss.android.ttve.nativePort.HwFrameExtractorWrapper.C307002 */

            static {
                Covode.recordClassIndex(37271);
            }

            @Override // com.p2082ss.android.vesdk.AbstractC85304ab
            public final boolean processFrame(ByteBuffer byteBuffer, int i, int i2, int i3) {
                MethodCollector.m26663i(13308);
                boolean nativeOnFrameAvailable = HwFrameExtractorWrapper.this.nativeOnFrameAvailable(j, byteBuffer, i, i2, i3);
                MethodCollector.m26664o(13308);
                return nativeOnFrameAvailable;
            }
        });
    }

    public void startExtractFrame(String str, int[] iArr, int i, int i2, int i3, int i4) {
        OutOfMemoryError e;
        Exception e2;
        int i5;
        boolean z;
        final long j = this.mNativeAddr;
        C30724b bVar = new C30724b(str, iArr, i, i2, i3, i4, new AbstractC85304ab() {
            /* class com.p2082ss.android.ttve.nativePort.HwFrameExtractorWrapper.C306991 */

            static {
                Covode.recordClassIndex(37270);
            }

            @Override // com.p2082ss.android.vesdk.AbstractC85304ab
            public final boolean processFrame(ByteBuffer byteBuffer, int i, int i2, int i3) {
                MethodCollector.m26663i(13336);
                boolean nativeOnFrameAvailable = HwFrameExtractorWrapper.this.nativeOnFrameAvailable(j, byteBuffer, i, i2, i3);
                MethodCollector.m26664o(13336);
                return nativeOnFrameAvailable;
            }
        });
        this.mExtractor = bVar;
        try {
            C85315al.m146637a(bVar.f73524b, "method start begin");
            if (bVar.f73526f.length <= 0) {
                try {
                    C85315al.m146637a(bVar.f73524b, "ptsMs.length is wrong: " + bVar.f73526f.length);
                } catch (OutOfMemoryError e3) {
                    e = e3;
                    C85315al.m146637a(bVar.f73524b, "start crash oom");
                    Log.getStackTraceString(e);
                    Runtime.getRuntime().gc();
                    bVar.mo55447b();
                    bVar.mo55446a();
                } catch (Exception e4) {
                    e2 = e4;
                    C85315al.m146637a(bVar.f73524b, "start crash");
                    Log.getStackTraceString(e2);
                    bVar.mo55447b();
                    bVar.mo55446a();
                }
            } else {
                bVar.f73519A = false;
                if (C30724b.f73517c == null || C30724b.f73518d == null) {
                    String lowerCase = C30640a.m62975a().toLowerCase();
                    if (lowerCase.contains("qualcomm")) {
                        C30724b.f73517c = "qualcomm";
                        if (lowerCase.contains("sdm660")) {
                            C30724b.f73518d = "sdm660";
                        } else if (lowerCase.contains("msm8994")) {
                            C30724b.f73518d = "msm8994";
                        } else if (lowerCase.contains("sdm845")) {
                            C30724b.f73518d = "sdm845";
                        } else if (lowerCase.contains("sm8150")) {
                            C30724b.f73518d = "sm8150";
                        } else {
                            C30724b.f73518d = "";
                        }
                    }
                }
                bVar.f73537q = System.currentTimeMillis();
                MediaExtractor mediaExtractor = new MediaExtractor();
                mediaExtractor.setDataSource(bVar.f73525e);
                int i6 = bVar.f73527g;
                int i7 = bVar.f73528h;
                MediaFormat mediaFormat = null;
                for (int i8 = 0; i8 < mediaExtractor.getTrackCount(); i8++) {
                    MediaFormat trackFormat = mediaExtractor.getTrackFormat(i8);
                    String string = trackFormat.getString("mime");
                    if (string.startsWith("video")) {
                        bVar.f73521C = string.equals("video/avc");
                        bVar.f73522D = string.equals("video/hevc");
                        bVar.f73540t = trackFormat.getInteger("width");
                        bVar.f73541u = trackFormat.getInteger("height");
                        if (trackFormat.containsKey("rotation-degrees")) {
                            bVar.f73538r = trackFormat.getInteger("rotation-degrees");
                        }
                        if (bVar.f73538r != 0) {
                            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(((bVar.f73527g * bVar.f73528h) * 3) / 2);
                            allocateDirect.clear();
                            bVar.f73535o = VEFrame.createByteBufferFrame(allocateDirect, bVar.f73527g, bVar.f73528h, 0, 0, VEFrame.EnumC30668a.TEPixFmt_YUV420P);
                            if (bVar.f73538r == 90 || bVar.f73538r == 270) {
                                i6 = bVar.f73528h;
                                i7 = bVar.f73527g;
                            }
                        }
                        mediaExtractor.selectTrack(i8);
                        mediaFormat = trackFormat;
                    }
                }
                if (bVar.f73533m == null) {
                    ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(((i6 * i7) * 3) / 2);
                    allocateDirect2.clear();
                    i5 = 2;
                    bVar.f73533m = VEFrame.createByteBufferFrame(allocateDirect2, i6, i7, bVar.f73538r, 0, VEFrame.EnumC30668a.TEPixFmt_YUV420P);
                } else {
                    i5 = 2;
                }
                bVar.f73536p = MediaCodec.createDecoderByType("video/avc");
                ArrayList arrayList = new ArrayList();
                mediaExtractor.seekTo((long) bVar.f73526f[0], i5);
                ArrayList arrayList2 = new ArrayList();
                int i9 = bVar.f73530j;
                while (true) {
                    long sampleTime = mediaExtractor.getSampleTime();
                    if (sampleTime < 0 && mediaExtractor.advance()) {
                        bVar.f73520B = true;
                        break;
                    }
                    arrayList2.add(Long.valueOf(sampleTime));
                    if (mediaExtractor.getSampleFlags() == 1) {
                        z = true;
                        arrayList.add(Long.valueOf(sampleTime));
                    } else {
                        z = false;
                    }
                    if (sampleTime > ((long) bVar.f73526f[bVar.f73526f.length - 1]) && z) {
                        i9--;
                    }
                    try {
                        if (mediaExtractor.advance()) {
                            if (i9 <= 0) {
                                break;
                            }
                        }
                    } catch (OutOfMemoryError e5) {
                        e = e5;
                        C85315al.m146637a(bVar.f73524b, "start crash oom");
                        Log.getStackTraceString(e);
                        Runtime.getRuntime().gc();
                        bVar.mo55447b();
                        bVar.mo55446a();
                    } catch (Exception e6) {
                        e2 = e6;
                        C85315al.m146637a(bVar.f73524b, "start crash");
                        Log.getStackTraceString(e2);
                        bVar.mo55447b();
                        bVar.mo55446a();
                    }
                }
                try {
                    if (bVar.f73520B) {
                        C85315al.m146637a(bVar.f73524b, "start wrong");
                        bVar.mo55447b();
                        return;
                    }
                    Collections.sort(arrayList2);
                    ArrayList arrayList3 = new ArrayList();
                    int length = bVar.f73526f.length;
                    List[] listArr = new List[length];
                    int size = arrayList2.size();
                    int i10 = 0;
                    int i11 = 0;
                    while (i10 < size && i11 < bVar.f73526f.length) {
                        if (((Long) arrayList2.get(i10)).longValue() < ((long) bVar.f73526f[i11])) {
                            i10++;
                        } else {
                            if (listArr[i11] == null) {
                                listArr[i11] = new ArrayList();
                            }
                            for (int i12 = 0; i12 < bVar.f73530j; i12++) {
                                int i13 = i10 + i12;
                                if (i13 < size) {
                                    Long l = (Long) arrayList2.get(i13);
                                    listArr[i11].add(l);
                                    arrayList3.add(l);
                                }
                            }
                            i10++;
                            i11++;
                        }
                    }
                    if (listArr[bVar.f73526f.length - 1] != null && listArr[bVar.f73526f.length - 1].size() == 1) {
                        listArr[bVar.f73526f.length - 1].add(listArr[bVar.f73526f.length - 1].get(0));
                        listArr[bVar.f73526f.length - 1].set(0, arrayList2.get(arrayList2.size() - 2));
                        arrayList3.add(arrayList3.get(arrayList3.size() - 1));
                    }
                    for (int i14 = 0; i14 < length; i14++) {
                        List list = listArr[i14];
                        for (int i15 = 0; i15 < list.size(); i15++) {
                            C85315al.m146637a(bVar.f73524b, "sensArray i: " + i15 + " value: " + list.get(i15).toString());
                        }
                    }
                    mediaExtractor.seekTo((long) bVar.f73526f[0], 0);
                    bVar.f73542v = new HandlerThread("MediaCodec Callback");
                    C85315al.m146637a(bVar.f73524b, "getVideoFramesHW: mCodecHandlerThread = " + bVar.f73542v.getThreadId() + ", curr-threadId = " + bVar.f73523a);
                    bVar.f73542v.start();
                    bVar.f73536p.setCallback(new MediaCodec.Callback(mediaExtractor, arrayList3, listArr, arrayList) {
                        /* class com.p2082ss.android.ttve.nativePort.C30724b.C307251 */

                        /* renamed from: a */
                        int f73547a;

                        /* renamed from: b */
                        int f73548b;

                        /* renamed from: c */
                        List<Long> f73549c = new ArrayList();

                        /* renamed from: d */
                        List<Long> f73550d = new ArrayList();

                        /* renamed from: e */
                        long f73551e = 0;

                        /* renamed from: f */
                        final /* synthetic */ MediaExtractor f73552f;

                        /* renamed from: g */
                        final /* synthetic */ List f73553g;

                        /* renamed from: h */
                        final /* synthetic */ List[] f73554h;

                        /* renamed from: i */
                        final /* synthetic */ List f73555i;

                        static {
                            Covode.recordClassIndex(37333);
                        }

                        public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
                        }

                        public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
                        }

                        public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
                            long j;
                            try {
                                if (this.f73547a >= C30724b.this.f73526f.length) {
                                    C30724b.this.f73536p.queueInputBuffer(i, 0, 0, 0, 4);
                                    C85315al.m146637a(C30724b.this.f73524b, "onInputBufferAvailable end");
                                    return;
                                }
                                ByteBuffer inputBuffer = C30724b.this.f73536p.getInputBuffer(i);
                                int readSampleData = this.f73552f.readSampleData(inputBuffer, 0);
                                long sampleTime = this.f73552f.getSampleTime();
                                int sampleFlags = this.f73552f.getSampleFlags();
                                if (C30724b.this.f73521C || C30724b.this.f73522D) {
                                    System.currentTimeMillis();
                                    while (true) {
                                        if (C30724b.this.f73519A || sampleTime < 0 || sampleFlags == 1 || !TEVideoUtils.isFrameCanDrop(inputBuffer, inputBuffer.remaining(), C30724b.this.f73522D) || this.f73553g.contains(Long.valueOf(sampleTime))) {
                                            break;
                                        }
                                        System.currentTimeMillis();
                                        if (!this.f73552f.advance()) {
                                            C85315al.m146642d(C30724b.this.f73524b, "onInputBufferAvailable end");
                                            break;
                                        }
                                        inputBuffer.clear();
                                        this.f73552f.readSampleData(inputBuffer, 0);
                                        sampleTime = this.f73552f.getSampleTime();
                                        sampleFlags = this.f73552f.getSampleFlags();
                                    }
                                }
                                if (sampleFlags == 1) {
                                    this.f73551e = sampleTime;
                                }
                                this.f73549c.add(Long.valueOf(sampleTime));
                                if (readSampleData <= 0 || sampleTime < 0) {
                                    C85315al.m146637a(C30724b.this.f73524b, "onInputBufferAvailable sampSize<0 or time<0 sampSize" + readSampleData + " time: " + sampleTime);
                                    C30724b.this.mo55447b();
                                    C30724b.this.mo55446a();
                                    return;
                                }
                                C30724b.this.f73536p.queueInputBuffer(i, 0, readSampleData, sampleTime, 0);
                                if (!this.f73549c.containsAll(this.f73554h[this.f73547a])) {
                                    this.f73552f.advance();
                                    return;
                                }
                                this.f73549c.clear();
                                int i2 = this.f73547a + 1;
                                this.f73547a = i2;
                                if (i2 < C30724b.this.f73526f.length) {
                                    int indexOf = this.f73555i.indexOf(Long.valueOf(this.f73551e));
                                    long longValue = ((Long) this.f73554h[this.f73547a].get(0)).longValue();
                                    if (indexOf == -1 || indexOf >= this.f73555i.size() - 1) {
                                        j = Long.MAX_VALUE;
                                    } else {
                                        j = ((Long) this.f73555i.get(indexOf + 1)).longValue();
                                    }
                                    if (longValue <= sampleTime || longValue >= j) {
                                        this.f73552f.seekTo(longValue, 0);
                                    } else {
                                        this.f73552f.advance();
                                    }
                                } else {
                                    C85315al.m146637a(C30724b.this.f73524b, "timer begin");
                                    new Handler().postDelayed(new Runnable() {
                                        /* class com.p2082ss.android.ttve.nativePort.C30724b.C307251.RunnableC307261 */

                                        static {
                                            Covode.recordClassIndex(37334);
                                        }

                                        public final void run() {
                                            C30724b.this.mo55447b();
                                            C30724b.this.mo55446a();
                                        }
                                    }, 1000);
                                }
                            } catch (Exception e) {
                                C85315al.m146637a(C30724b.this.f73524b, "onInputBufferAvailable crash");
                                Log.getStackTraceString(e);
                                C30724b.this.mo55447b();
                                C30724b.this.mo55446a();
                            }
                        }

                        public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
                            int i2;
                            MethodCollector.m26663i(11994);
                            try {
                                if (bufferInfo.flags == 4 || (i2 = this.f73548b) >= this.f73554h.length) {
                                    C30724b.this.mo55447b();
                                    C30724b.this.mo55446a();
                                    MethodCollector.m26664o(11994);
                                    return;
                                }
                                if (i2 >= C30724b.this.f73526f.length || !this.f73554h[this.f73548b].contains(Long.valueOf(bufferInfo.presentationTimeUs))) {
                                    mediaCodec.releaseOutputBuffer(i, false);
                                } else {
                                    this.f73550d.add(Long.valueOf(bufferInfo.presentationTimeUs));
                                    synchronized (C30724b.this) {
                                        try {
                                            if (Build.VERSION.SDK_INT >= 23) {
                                                mediaCodec.releaseOutputBuffer(i, true);
                                            } else {
                                                mediaCodec.releaseOutputBuffer(i, bufferInfo.presentationTimeUs * 1000);
                                            }
                                            long j = bufferInfo.presentationTimeUs;
                                            C30724b.this.wait(0);
                                            long j2 = bufferInfo.presentationTimeUs;
                                        } catch (Throwable th) {
                                            MethodCollector.m26664o(11994);
                                            throw th;
                                        }
                                    }
                                    if (this.f73550d.containsAll(this.f73554h[this.f73548b])) {
                                        this.f73548b++;
                                        this.f73550d.clear();
                                    }
                                    if (this.f73548b >= C30724b.this.f73526f.length) {
                                        C30724b.this.mo55446a();
                                        MethodCollector.m26664o(11994);
                                        return;
                                    }
                                }
                                MethodCollector.m26664o(11994);
                            } catch (Exception e) {
                                Log.getStackTraceString(e);
                                C30724b.this.mo55447b();
                                C30724b.this.mo55446a();
                                MethodCollector.m26664o(11994);
                            }
                        }

                        {
                            this.f73552f = r4;
                            this.f73553g = r5;
                            this.f73554h = r6;
                            this.f73555i = r7;
                        }
                    }, new Handler(bVar.f73542v.getLooper()));
                    bVar.f73543w = new HandlerThread("ImageReader Callback");
                    C85315al.m146637a(bVar.f73524b, "getVideoFramesHW: mReaderHandlerThread = " + bVar.f73543w.getThreadId() + ", curr-threadId = " + bVar.f73523a);
                    bVar.f73543w.start();
                    Handler handler = new Handler(bVar.f73543w.getLooper());
                    bVar.f73544x = ImageReader.newInstance(bVar.f73540t, bVar.f73541u, 35, 2);
                    bVar.f73544x.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener(listArr) {
                        /* class com.p2082ss.android.ttve.nativePort.C30724b.C307272 */

                        /* renamed from: a */
                        int f73558a;

                        /* renamed from: b */
                        List<Long> f73559b = new ArrayList();

                        /* renamed from: c */
                        final /* synthetic */ List[] f73560c;

                        static {
                            Covode.recordClassIndex(37335);
                        }

                        public final void onImageAvailable(ImageReader imageReader) {
                            VEFrame createYUVPlanFrame;
                            VEFrame vEFrame;
                            MethodCollector.m26663i(13718);
                            try {
                                synchronized (C30724b.this) {
                                    try {
                                        Image acquireNextImage = imageReader.acquireNextImage();
                                        long timestamp = acquireNextImage.getTimestamp() / 1000;
                                        if (this.f73560c[this.f73558a].contains(Long.valueOf(timestamp))) {
                                            if (C30724b.this.f73531k != null) {
                                                if (acquireNextImage.getFormat() == 35) {
                                                    if (acquireNextImage.getPlanes() == null || acquireNextImage.getPlanes()[1].getPixelStride() <= 1) {
                                                        createYUVPlanFrame = VEFrame.createYUVPlanFrame(new C30677e(acquireNextImage.getPlanes()), C30724b.this.f73540t, C30724b.this.f73541u, C30724b.this.f73538r, 0, VEFrame.EnumC30668a.TEPixFmt_YUV420P);
                                                    } else {
                                                        VEFrame createYUVPlanFrame2 = VEFrame.createYUVPlanFrame(new C30677e(acquireNextImage.getPlanes()), C30724b.this.f73540t, C30724b.this.f73541u, C30724b.this.f73538r, 0, VEFrame.EnumC30668a.TEPixFmt_NV12);
                                                        if (C30724b.this.f73534n == null) {
                                                            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(((C30724b.this.f73540t * C30724b.this.f73541u) * 3) / 2);
                                                            allocateDirect.clear();
                                                            C30724b bVar = C30724b.this;
                                                            bVar.f73534n = VEFrame.createByteBufferFrame(allocateDirect, bVar.f73540t, C30724b.this.f73541u, C30724b.this.f73538r, 0, VEFrame.EnumC30668a.TEPixFmt_YUV420P);
                                                        }
                                                        TEImageUtils.m62973a(createYUVPlanFrame2, C30724b.this.f73534n, VEFrame.EnumC30669b.OP_CONVERT);
                                                        createYUVPlanFrame = C30724b.this.f73534n;
                                                    }
                                                    if (C30724b.this.f73533m != null) {
                                                        TEImageUtils.m62973a(createYUVPlanFrame, C30724b.this.f73533m, VEFrame.EnumC30669b.OP_SCALE);
                                                    }
                                                    if (C30724b.this.f73538r != 0) {
                                                        vEFrame = C30724b.this.f73535o;
                                                        TEImageUtils.m62973a(C30724b.this.f73533m, vEFrame, VEFrame.EnumC30669b.OP_ROTATION);
                                                    } else {
                                                        vEFrame = C30724b.this.f73533m;
                                                    }
                                                    TEImageUtils.m62973a(vEFrame, C30724b.this.f73532l, VEFrame.EnumC30669b.OP_CONVERT);
                                                    ((VEFrame.ByteBufferFrame) C30724b.this.f73532l.getFrame()).getByteBuffer().clear();
                                                }
                                                C30724b bVar2 = C30724b.this;
                                                ByteBuffer byteBuffer = ((VEFrame.ByteBufferFrame) bVar2.f73532l.getFrame()).getByteBuffer();
                                                int width = C30724b.this.f73532l.getWidth();
                                                int height = C30724b.this.f73532l.getHeight();
                                                double timestamp2 = (double) acquireNextImage.getTimestamp();
                                                Double.isNaN(timestamp2);
                                                int i = (int) (timestamp2 / 1000000.0d);
                                                if (bVar2.f73545y < bVar2.f73526f.length * bVar2.f73530j && !bVar2.f73546z) {
                                                    if (!bVar2.f73531k.processFrame(byteBuffer, width, height, i)) {
                                                        C85315al.m146637a(bVar2.f73524b, "processFrame right stop hasProcxessCount:" + bVar2.f73545y + " ptsMsLength: " + bVar2.f73526f.length);
                                                        bVar2.mo55446a();
                                                    }
                                                    bVar2.f73545y++;
                                                }
                                            }
                                            this.f73559b.add(Long.valueOf(timestamp));
                                            if (this.f73559b.containsAll(this.f73560c[this.f73558a])) {
                                                this.f73559b.clear();
                                                this.f73558a++;
                                            }
                                            C30724b.this.notify();
                                        }
                                        acquireNextImage.close();
                                    } finally {
                                        MethodCollector.m26664o(13718);
                                    }
                                }
                            } catch (OutOfMemoryError e) {
                                Runtime.getRuntime().gc();
                                Log.getStackTraceString(e);
                                C30724b.this.mo55447b();
                                C30724b.this.notify();
                                C30724b.this.mo55446a();
                                MethodCollector.m26664o(13718);
                            } catch (Exception e2) {
                                Log.getStackTraceString(e2);
                                C30724b.this.mo55447b();
                                C30724b.this.notify();
                                C30724b.this.mo55446a();
                                MethodCollector.m26664o(13718);
                            }
                        }

                        {
                            this.f73560c = r3;
                        }
                    }, handler);
                    mediaFormat.setInteger("color-format", 2135033992);
                    int a = (((C30640a.m62974a(C30724b.f73518d) * 1080) * 1920) / bVar.f73540t) / bVar.f73541u;
                    if (a > 0) {
                        C85315al.m146637a(bVar.f73524b, "extract frame targetFps:".concat(String.valueOf(a)));
                        mediaFormat.setInteger("operating-rate", a);
                    }
                    bVar.f73536p.configure(mediaFormat, bVar.f73544x.getSurface(), (MediaCrypto) null, 0);
                    bVar.f73536p.start();
                } catch (OutOfMemoryError e7) {
                    e = e7;
                    C85315al.m146637a(bVar.f73524b, "start crash oom");
                    Log.getStackTraceString(e);
                    Runtime.getRuntime().gc();
                    bVar.mo55447b();
                    bVar.mo55446a();
                } catch (Exception e8) {
                    e2 = e8;
                    C85315al.m146637a(bVar.f73524b, "start crash");
                    Log.getStackTraceString(e2);
                    bVar.mo55447b();
                    bVar.mo55446a();
                }
            }
        } catch (OutOfMemoryError e9) {
            e = e9;
            C85315al.m146637a(bVar.f73524b, "start crash oom");
            Log.getStackTraceString(e);
            Runtime.getRuntime().gc();
            bVar.mo55447b();
            bVar.mo55446a();
        } catch (Exception e10) {
            e2 = e10;
            C85315al.m146637a(bVar.f73524b, "start crash");
            Log.getStackTraceString(e2);
            bVar.mo55447b();
            bVar.mo55446a();
        }
    }
}
