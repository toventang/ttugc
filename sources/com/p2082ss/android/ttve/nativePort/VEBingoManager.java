package com.p2082ss.android.ttve.nativePort;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ttve.common.C30646f;
import com.p2082ss.android.vesdk.AbstractC85304ab;
import com.p2082ss.android.vesdk.C85315al;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.ss.android.ttve.nativePort.VEBingoManager */
public class VEBingoManager {
    public static int Bingo_TransBlack = 2;
    public static int Bingo_TransDissolve = 1;
    public static int Bingo_TransNull = 0;
    public static int Bingo_TransWhite = 3;
    public static int Bingo_TransZoomIn = 5;
    public static int Bingo_TransZoomOut = 4;
    private Handler imageHandler;
    private HandlerThread imageHandlerThread;
    private volatile long mNative = 0;
    private Map<Integer, Handler> workThreadHandlerMap = new HashMap();
    private Map<Integer, HandlerThread> workThreadMap = new HashMap();

    /* renamed from: com.ss.android.ttve.nativePort.VEBingoManager$e */
    interface AbstractC30716e {
        static {
            Covode.recordClassIndex(37323);
        }

        /* renamed from: a */
        void mo55431a();

        /* renamed from: a */
        boolean mo55432a(int i, int i2);
    }

    /* renamed from: com.ss.android.ttve.nativePort.VEBingoManager$g */
    public interface AbstractC30719g {
        static {
            Covode.recordClassIndex(37326);
        }

        /* renamed from: a */
        boolean mo55436a();
    }

    private native int[] addVideoClipsByNative(long j, String[] strArr, int i);

    private native VETransitionResult[] getBingoTransitionResultsByNative(long j);

    private native long init(int i);

    private native int processBingoImageFrameByNative(long j, Bitmap bitmap, float f, String str);

    private native int processBingoVideoFrameByNative(long j, ByteBuffer byteBuffer, int i, int i2, float f, String str);

    public native int destroy(long j);

    /* renamed from: com.ss.android.ttve.nativePort.VEBingoManager$f */
    class C30717f {

        /* renamed from: a */
        public AbstractC30719g f73471a;

        /* renamed from: b */
        public volatile boolean f73472b;

        /* renamed from: d */
        private final int f73474d;

        /* renamed from: e */
        private final AtomicInteger f73475e;

        static {
            Covode.recordClassIndex(37324);
        }

        /* renamed from: b */
        public final synchronized void mo55434b() {
            MethodCollector.m26663i(6937);
            if (!this.f73472b) {
                this.f73472b = true;
            }
            MethodCollector.m26664o(6937);
        }

        /* renamed from: a */
        public final synchronized boolean mo55433a() {
            boolean z;
            MethodCollector.m26663i(6787);
            int incrementAndGet = this.f73475e.incrementAndGet();
            if (!this.f73472b) {
                this.f73472b = this.f73471a.mo55436a();
                if (incrementAndGet == this.f73474d) {
                    new Handler(Looper.myLooper()).post(new Runnable() {
                        /* class com.p2082ss.android.ttve.nativePort.VEBingoManager.C30717f.RunnableC307181 */

                        static {
                            Covode.recordClassIndex(37325);
                        }

                        public final void run() {
                            VEBingoManager.this.getBingoTransitionResults();
                        }
                    });
                }
            }
            z = this.f73472b;
            MethodCollector.m26664o(6787);
            return z;
        }

        private C30717f(int i, AbstractC30719g gVar) {
            this.f73475e = new AtomicInteger(0);
            this.f73472b = false;
            this.f73474d = i;
            this.f73471a = gVar;
        }

        /* synthetic */ C30717f(VEBingoManager vEBingoManager, int i, AbstractC30719g gVar, byte b) {
            this(i, gVar);
        }
    }

    static {
        Covode.recordClassIndex(37317);
        C30731d.m63114a();
    }

    public void destroy() {
        MethodCollector.m26663i(4453);
        reset();
        if (this.mNative > 0) {
            destroy(this.mNative);
            this.mNative = 0;
        }
        MethodCollector.m26664o(4453);
    }

    public VETransitionResult[] getBingoTransitionResults() {
        MethodCollector.m26663i(4564);
        if (this.mNative <= 0) {
            MethodCollector.m26664o(4564);
            return null;
        }
        VETransitionResult[] bingoTransitionResultsByNative = getBingoTransitionResultsByNative(this.mNative);
        MethodCollector.m26664o(4564);
        return bingoTransitionResultsByNative;
    }

    /* renamed from: com.ss.android.ttve.nativePort.VEBingoManager$a */
    enum EnumC30711a {
        BingoModelAfterEffect(0),
        BingoModelVideoTrans(1);
        

        /* renamed from: c */
        public final int f73447c;

        static {
            Covode.recordClassIndex(37318);
        }

        private EnumC30711a(int i) {
            this.f73447c = i;
        }
    }

    private void reset() {
        for (HandlerThread handlerThread : this.workThreadMap.values()) {
            if (handlerThread != null) {
                handlerThread.quit();
            }
        }
        this.workThreadMap.clear();
        this.workThreadHandlerMap.clear();
        HandlerThread handlerThread2 = this.imageHandlerThread;
        if (handlerThread2 != null) {
            handlerThread2.quit();
        }
        this.imageHandlerThread = null;
        this.imageHandler = null;
    }

    public long initBingoWithTransition() {
        MethodCollector.m26663i(4452);
        reset();
        if (this.mNative > 0) {
            long j = this.mNative;
            MethodCollector.m26664o(4452);
            return j;
        }
        this.mNative = init(EnumC30711a.BingoModelVideoTrans.f73447c);
        long j2 = this.mNative;
        MethodCollector.m26664o(4452);
        return j2;
    }

    /* renamed from: com.ss.android.ttve.nativePort.VEBingoManager$b */
    class HandlerC30712b extends Handler {

        /* renamed from: b */
        private String[] f73449b;

        /* renamed from: c */
        private List<Integer> f73450c;

        /* renamed from: d */
        private C30717f f73451d;

        /* renamed from: e */
        private TEVideoUtilsCallback f73452e = new TEVideoUtilsCallback();

        /* renamed from: f */
        private final AtomicInteger f73453f = new AtomicInteger(0);

        static {
            Covode.recordClassIndex(37319);
        }

        public final void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 1 && !this.f73451d.f73472b && this.f73453f.get() < this.f73450c.size()) {
                String str = this.f73449b[this.f73450c.get(this.f73453f.getAndIncrement()).intValue()];
                Bitmap decodeBitmap = VEBingoManager.this.decodeBitmap(str);
                if (decodeBitmap == null || decodeBitmap.isRecycled()) {
                    C85315al.m146642d("VEBingoManager", "decodeBitmap fail, path: ".concat(String.valueOf(str)));
                    this.f73451d.mo55434b();
                    return;
                }
                int processBingoImageFrame = VEBingoManager.this.processBingoImageFrame(decodeBitmap, 0.0f, str);
                decodeBitmap.recycle();
                if (processBingoImageFrame < 0) {
                    C85315al.m146642d("VEBingoManager", "processBingoImageFrame fail, path: ".concat(String.valueOf(str)));
                    this.f73451d.mo55434b();
                } else if (!this.f73451d.mo55433a()) {
                    Message.obtain(this, 1).sendToTarget();
                }
            }
        }

        HandlerC30712b(Looper looper, String[] strArr, List<Integer> list, C30717f fVar) {
            super(looper);
            this.f73449b = strArr;
            this.f73450c = list;
            this.f73451d = fVar;
        }
    }

    /* renamed from: com.ss.android.ttve.nativePort.VEBingoManager$c */
    class HandlerC30713c extends Handler {

        /* renamed from: a */
        public C30717f f73454a;

        /* renamed from: c */
        private Map<Integer, int[]> f73456c;

        /* renamed from: d */
        private String[] f73457d;

        /* renamed from: e */
        private Map<Integer, C30646f> f73458e;

        /* renamed from: f */
        private List<Integer> f73459f;

        /* renamed from: g */
        private TEVideoUtilsCallback f73460g = new TEVideoUtilsCallback();

        /* renamed from: h */
        private final AtomicInteger f73461h = new AtomicInteger(0);

        static {
            Covode.recordClassIndex(37320);
        }

        public final void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 1 && !this.f73454a.f73472b && this.f73461h.get() < this.f73459f.size()) {
                final int intValue = this.f73459f.get(this.f73461h.getAndIncrement()).intValue();
                final String str = this.f73457d[intValue];
                int[] iArr = this.f73456c.get(Integer.valueOf(intValue));
                C30646f fVar = this.f73458e.get(Integer.valueOf(intValue));
                this.f73460g.setListener(new C30715d(intValue, str, iArr.length, new AbstractC30716e() {
                    /* class com.p2082ss.android.ttve.nativePort.VEBingoManager.HandlerC30713c.C307141 */

                    static {
                        Covode.recordClassIndex(37321);
                    }

                    @Override // com.p2082ss.android.ttve.nativePort.VEBingoManager.AbstractC30716e
                    /* renamed from: a */
                    public final void mo55431a() {
                        HandlerC30713c.this.f73454a.mo55434b();
                    }

                    @Override // com.p2082ss.android.ttve.nativePort.VEBingoManager.AbstractC30716e
                    /* renamed from: a */
                    public final boolean mo55432a(int i, int i2) {
                        boolean a = HandlerC30713c.this.f73454a.mo55433a();
                        if (i == i2) {
                            C85315al.m146637a("VEBingoManager", "index: " + intValue + ", videoPath: " + str + ", complete " + i2 + " frame, thread: " + Thread.currentThread().getName());
                            if (!a) {
                                Message.obtain(HandlerC30713c.this, 1).sendToTarget();
                            }
                        }
                        return a;
                    }
                }));
                int videoFramesMore = TEVideoUtils.getVideoFramesMore(str, iArr, fVar.f73266a, fVar.f73267b, false, false, 1, true, this.f73460g);
                C85315al.m146637a("VEBingoManager", "getVideoFramesMore result: " + videoFramesMore + " , index: " + intValue + ", videoPath: " + str + ", thread: " + Thread.currentThread().getName());
                if (videoFramesMore != 0) {
                    removeCallbacksAndMessages(null);
                    this.f73454a.mo55434b();
                }
            }
        }

        HandlerC30713c(Looper looper, Map<Integer, int[]> map, String[] strArr, Map<Integer, C30646f> map2, List<Integer> list, C30717f fVar) {
            super(looper);
            this.f73456c = map;
            this.f73457d = strArr;
            this.f73458e = map2;
            this.f73459f = list;
            this.f73454a = fVar;
        }
    }

    public Bitmap decodeBitmap(String str) {
        int i;
        int i2;
        MethodCollector.m26663i(4648);
        if (TextUtils.isEmpty(str)) {
            MethodCollector.m26664o(4648);
            return null;
        }
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            if (options.outWidth <= 0 || options.outHeight <= 0) {
                C85315al.m146642d("VEBingoManager", "inJustDecodeBounds true, invalid out size, outWidth: " + options.outWidth + ", outHeight: " + options.outHeight);
                MethodCollector.m26664o(4648);
                return null;
            }
            int i3 = options.outWidth;
            int i4 = options.outHeight;
            int i5 = 320;
            if (i3 > i4) {
                float f = (((float) i3) * 1.0f) / 320.0f;
                i = (int) f;
                int i6 = (int) (((float) i4) / f);
                int i7 = i6 % 16;
                if (i7 >= 8) {
                    i6 += 16;
                }
                i2 = i6 - i7;
            } else {
                float f2 = (((float) i4) * 1.0f) / 320.0f;
                i = (int) f2;
                int i8 = (int) (((float) i3) / f2);
                int i9 = i8 % 16;
                if (i9 >= 8) {
                    i8 += 16;
                }
                i5 = i8 - i9;
                i2 = 320;
            }
            if (i5 <= 0 || i2 <= 0) {
                C85315al.m146642d("VEBingoManager", "imagePath: " + str + " invalid scale size, scaleWidth: " + i5 + ", scaleHeight: " + i2 + ", bitmap origin width: " + i3 + ", height: " + i4);
                MethodCollector.m26664o(4648);
                return null;
            }
            if (i > 1) {
                options.inSampleSize = i;
            }
            options.inJustDecodeBounds = false;
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            Bitmap decodeFile = BitmapFactory.decodeFile(str, options);
            if (decodeFile == null) {
                C85315al.m146642d("VEBingoManager", "BitmapFactory.decodeFile(inJustDecodeBounds false) failed: ".concat(String.valueOf(str)));
                MethodCollector.m26664o(4648);
                return null;
            }
            C85315al.m146637a("VEBingoManager", "imagePath: " + str + ", origin size: " + i3 + "*" + i4 + ", scale size: " + i5 + "*" + i2 + ", inSampleSize: " + i + ", final size: " + decodeFile.getWidth() + "*" + decodeFile.getHeight() + ", thread: " + Thread.currentThread().getName());
            if (!(decodeFile.getConfig() == Bitmap.Config.ARGB_8888 && decodeFile.getWidth() == i5 && decodeFile.getHeight() == i2)) {
                C85315al.m146637a("VEBingoManager", "switch bitmap, config from " + decodeFile.getConfig().name() + " to " + Bitmap.Config.ARGB_8888.name() + ", size from " + decodeFile.getWidth() + "*" + decodeFile.getHeight() + " to " + i5 + "*" + i2);
                Bitmap createBitmap = Bitmap.createBitmap(i5, i2, Bitmap.Config.ARGB_8888);
                new Canvas(createBitmap).drawBitmap(decodeFile, (Rect) null, new RectF(0.0f, 0.0f, (float) i5, (float) i2), (Paint) null);
                decodeFile.recycle();
                decodeFile = createBitmap;
            }
            MethodCollector.m26664o(4648);
            return decodeFile;
        } catch (Exception e) {
            C85315al.m146642d("VEBingoManager", "decodeBitmap, imagePath: " + str + ", exception: " + e.toString());
            MethodCollector.m26664o(4648);
            return null;
        }
    }

    private int[] addVideoClips(String[] strArr, int i) {
        MethodCollector.m26663i(4551);
        if (this.mNative <= 0) {
            C85315al.m146642d("VEBingoManager", "addVideoClips, invalid mNative: " + this.mNative);
            MethodCollector.m26664o(4551);
            return null;
        }
        int[] addVideoClipsByNative = addVideoClipsByNative(this.mNative, strArr, i);
        MethodCollector.m26664o(4551);
        return addVideoClipsByNative;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x004d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void saveBitmap(java.lang.String r6, android.graphics.Bitmap r7) {
        /*
            r5 = this;
            r4 = 4660(0x1234, float:6.53E-42)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r4)
            java.io.File r3 = new java.io.File
            r3.<init>(r6)
            java.io.File r0 = r3.getParentFile()
            boolean r0 = r0.exists()
            if (r0 != 0) goto L_0x001b
            java.io.File r0 = r3.getParentFile()
            r0.mkdir()
        L_0x001b:
            r1 = 0
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0034, all -> 0x0046 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x0034, all -> 0x0046 }
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ Exception -> 0x0032 }
            r0 = 100
            r7.compress(r1, r0, r2)     // Catch:{ Exception -> 0x0032 }
            r2.flush()     // Catch:{ Exception -> 0x0032 }
            r2.close()     // Catch:{ IOException -> 0x0051 }
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r4)
            return
        L_0x0032:
            r0 = move-exception
            goto L_0x0036
        L_0x0034:
            r0 = move-exception
            r2 = r1
        L_0x0036:
            r0.printStackTrace()     // Catch:{ all -> 0x003a }
            goto L_0x004b
        L_0x003a:
            r0 = move-exception
            if (r2 == 0) goto L_0x0047
            r2.close()     // Catch:{ IOException -> 0x0041 }
            goto L_0x0047
        L_0x0041:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x0047
        L_0x0046:
            r0 = move-exception
        L_0x0047:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r4)
            throw r0
        L_0x004b:
            if (r2 == 0) goto L_0x0059
            r2.close()
            goto L_0x0059
        L_0x0051:
            r0 = move-exception
            r0.printStackTrace()
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r4)
            return
        L_0x0059:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ttve.nativePort.VEBingoManager.saveBitmap(java.lang.String, android.graphics.Bitmap):void");
    }

    public int processBingoImageFrame(Bitmap bitmap, float f, String str) {
        MethodCollector.m26663i(4554);
        if (this.mNative <= 0) {
            MethodCollector.m26664o(4554);
            return -112;
        }
        int processBingoImageFrameByNative = processBingoImageFrameByNative(this.mNative, bitmap, f, str);
        MethodCollector.m26664o(4554);
        return processBingoImageFrameByNative;
    }

    /* renamed from: com.ss.android.ttve.nativePort.VEBingoManager$d */
    class C30715d implements AbstractC85304ab {

        /* renamed from: b */
        private final int f73466b;

        /* renamed from: c */
        private final String f73467c;

        /* renamed from: d */
        private volatile int f73468d;

        /* renamed from: e */
        private final AtomicInteger f73469e = new AtomicInteger(0);

        /* renamed from: f */
        private AbstractC30716e f73470f;

        static {
            Covode.recordClassIndex(37322);
        }

        @Override // com.p2082ss.android.vesdk.AbstractC85304ab
        public final boolean processFrame(ByteBuffer byteBuffer, int i, int i2, int i3) {
            int processBingoVideoFrame = VEBingoManager.this.processBingoVideoFrame(byteBuffer, i, i2, (float) i3, this.f73467c);
            if (processBingoVideoFrame < 0) {
                C85315al.m146642d("VEBingoManager", "index: " + this.f73466b + ", videoPath: " + this.f73467c + ", processBingoVideoFrame fail: " + processBingoVideoFrame + ", thread: " + Thread.currentThread().getName());
                this.f73470f.mo55431a();
                return false;
            }
            this.f73469e.incrementAndGet();
            if (this.f73470f.mo55432a(this.f73469e.get(), this.f73468d) || this.f73469e.get() == this.f73468d) {
                return false;
            }
            return true;
        }

        C30715d(int i, String str, int i2, AbstractC30716e eVar) {
            this.f73466b = i;
            this.f73467c = str;
            this.f73468d = i2;
            this.f73470f = eVar;
        }
    }

    public void detectTransition(String[] strArr, int i, int i2, AbstractC30719g gVar) {
        int i3;
        HashMap hashMap;
        int i4;
        int i5;
        int i6;
        if (strArr != null) {
            int i7 = 2;
            if (strArr.length >= 2 && i > 0 && i2 > 0) {
                reset();
                int[] addVideoClips = addVideoClips(strArr, 1000 / i2);
                if (addVideoClips != null && addVideoClips.length == strArr.length) {
                    HashMap hashMap2 = new HashMap();
                    HashMap hashMap3 = new HashMap();
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    int i8 = 0;
                    int i9 = 0;
                    int i10 = 0;
                    while (i8 < strArr.length) {
                        String str = strArr[i8];
                        int i11 = addVideoClips[i8];
                        if (i7 == i11) {
                            arrayList.add(Integer.valueOf(i8));
                            i10++;
                        } else if (1 == i11) {
                            arrayList2.add(Integer.valueOf(i8));
                            int[] iArr = new int[10];
                            TEVideoUtils.getVideoFileInfo(str, iArr);
                            if (iArr[0] <= 0 || iArr[1] <= 0 || iArr[3] <= 0) {
                                C85315al.m146642d("VEBingoManager", "invalid video info, index: " + i8 + ", videoPath: " + str + ", duration: " + iArr[3] + ", size: " + iArr[0] + "*" + iArr[1]);
                                return;
                            }
                            if (iArr[0] > iArr[1]) {
                                int i12 = (int) (((float) iArr[1]) / ((((float) iArr[0]) * 1.0f) / 320.0f));
                                int i13 = i12 % 16;
                                if (i13 >= 8) {
                                    i12 += 16;
                                }
                                i6 = i12 - i13;
                                i5 = 320;
                            } else {
                                int i14 = (int) (((float) iArr[0]) / ((((float) iArr[1]) * 1.0f) / 320.0f));
                                int i15 = i14 % 16;
                                if (i15 >= 8) {
                                    i14 += 16;
                                }
                                i5 = i14 - i15;
                                i6 = 320;
                                if (i5 <= 0) {
                                    C85315al.m146642d("VEBingoManager", "invalid scale size, index: " + i8 + ", videoPath: " + str + ", size: " + i5 + "*" + i6);
                                    return;
                                }
                            }
                            if (i6 <= 0) {
                                C85315al.m146642d("VEBingoManager", "invalid scale size, index: " + i8 + ", videoPath: " + str + ", size: " + i5 + "*" + i6);
                                return;
                            }
                            hashMap3.put(Integer.valueOf(i8), new C30646f(i5, i6));
                            int i16 = iArr[3];
                            LinkedList linkedList = new LinkedList();
                            if (i8 == 0) {
                                for (int i17 = 0; i17 < i; i17++) {
                                    int i18 = i16 - (i17 * i2);
                                    if (i18 < 0) {
                                        break;
                                    }
                                    linkedList.add(Integer.valueOf(i18));
                                }
                            } else if (i8 != strArr.length - 1) {
                                int i19 = 0;
                                for (int i20 = 0; i20 < i; i20++) {
                                    int i21 = i20 * i2;
                                    if (i21 > i16) {
                                        break;
                                    }
                                    if (i21 > i19) {
                                        i19 = i21;
                                    }
                                    linkedList.add(Integer.valueOf(i21));
                                }
                                for (int i22 = 0; i22 < i; i22++) {
                                    int i23 = i16 - (i22 * i2);
                                    if (i23 < 0 || i23 <= i19) {
                                        break;
                                    }
                                    if (!linkedList.contains(Integer.valueOf(i23))) {
                                        linkedList.add(Integer.valueOf(i23));
                                    }
                                }
                            } else {
                                for (int i24 = 0; i24 < i; i24++) {
                                    int i25 = i24 * i2;
                                    if (i25 > i16) {
                                        break;
                                    }
                                    linkedList.add(Integer.valueOf(i25));
                                }
                            }
                            Collections.sort(linkedList);
                            int size = linkedList.size();
                            int[] iArr2 = new int[size];
                            for (int i26 = 0; i26 < linkedList.size(); i26++) {
                                iArr2[i26] = ((Integer) linkedList.get(i26)).intValue();
                            }
                            hashMap2.put(Integer.valueOf(i8), iArr2);
                            i9 += size;
                            C85315al.m146637a("VEBingoManager", "video clip, index: " + i8 + ", videoPath: " + str + ", duration: " + i16 + ", origin size: " + iArr[0] + "*" + iArr[1] + ", scale size: " + i5 + "*" + i6 + ", ptsList: " + linkedList);
                        } else {
                            return;
                        }
                        i8++;
                        i7 = 2;
                    }
                    C85315al.m146637a("VEBingoManager", "total video frame num: " + i9 + ", total image frame num: " + i10 + ", image clip: " + arrayList);
                    C30717f fVar = new C30717f(this, i9 + i10, gVar, (byte) 0);
                    HashMap hashMap4 = new HashMap();
                    if (arrayList2.size() > 2) {
                        int size2 = arrayList2.size() / 3;
                        int size3 = arrayList2.size() % 3;
                        if (size2 > 0) {
                            int i27 = 0;
                            do {
                                ArrayList arrayList3 = new ArrayList();
                                int i28 = i27 * size2;
                                while (true) {
                                    i4 = i27 + 1;
                                    if (i28 < i4 * size2 && i28 < arrayList2.size()) {
                                        arrayList3.add(arrayList2.get(i28));
                                        i28++;
                                    }
                                }
                                if (arrayList3.size() > 0) {
                                    if (hashMap4.get(Integer.valueOf(i27)) == null) {
                                        hashMap4.put(Integer.valueOf(i27), arrayList3);
                                    } else {
                                        ((List) hashMap4.get(Integer.valueOf(i27))).addAll(arrayList3);
                                    }
                                }
                                i27 = i4;
                            } while (i27 < 3);
                        }
                        if (size3 > 0) {
                            int i29 = 0;
                            for (int size4 = arrayList2.size() - size3; size4 < arrayList2.size(); size4++) {
                                if (hashMap4.get(Integer.valueOf(i29)) == null) {
                                    ArrayList arrayList4 = new ArrayList();
                                    arrayList4.add(arrayList2.get(size4));
                                    hashMap4.put(Integer.valueOf(i29), arrayList4);
                                } else {
                                    ((List) hashMap4.get(Integer.valueOf(i29))).add(arrayList2.get(size4));
                                }
                                i29 = (i29 + 1) % 3;
                            }
                        }
                        int i30 = 0;
                        do {
                            List list = (List) hashMap4.get(Integer.valueOf(i30));
                            if (list == null || list.size() <= 0) {
                                hashMap = hashMap2;
                            } else {
                                HandlerThread handlerThread = new HandlerThread("HandlerThread_Video_".concat(String.valueOf(i30)));
                                handlerThread.start();
                                hashMap = hashMap2;
                                HandlerC30713c cVar = new HandlerC30713c(handlerThread.getLooper(), hashMap2, strArr, hashMap3, list, fVar);
                                this.workThreadMap.put(Integer.valueOf(i30), handlerThread);
                                this.workThreadHandlerMap.put(Integer.valueOf(i30), cVar);
                                Message.obtain(cVar, 1).sendToTarget();
                                C85315al.m146637a("VEBingoManager", "HandlerThread_Video_" + i30 + " is responsible for " + list);
                            }
                            i30++;
                            hashMap2 = hashMap;
                        } while (i30 < 3);
                        i3 = 1;
                    } else {
                        i3 = 1;
                        if (arrayList2.size() > 0) {
                            HandlerThread handlerThread2 = new HandlerThread("HandlerThread_Video_Single");
                            handlerThread2.start();
                            HandlerC30713c cVar2 = new HandlerC30713c(handlerThread2.getLooper(), hashMap2, strArr, hashMap3, arrayList2, fVar);
                            this.workThreadMap.put(0, handlerThread2);
                            this.workThreadHandlerMap.put(0, cVar2);
                            Message.obtain(cVar2, 1).sendToTarget();
                            C85315al.m146637a("VEBingoManager", "HandlerThread_Single  is responsible for ".concat(String.valueOf(arrayList2)));
                        }
                    }
                    if (arrayList.size() > 0) {
                        HandlerThread handlerThread3 = new HandlerThread("HandlerThread_Image");
                        this.imageHandlerThread = handlerThread3;
                        handlerThread3.start();
                        HandlerC30712b bVar = new HandlerC30712b(this.imageHandlerThread.getLooper(), strArr, arrayList, fVar);
                        this.imageHandler = bVar;
                        Message.obtain(bVar, i3).sendToTarget();
                    }
                }
            }
        }
    }

    public int processBingoVideoFrame(ByteBuffer byteBuffer, int i, int i2, float f, String str) {
        MethodCollector.m26663i(4552);
        if (this.mNative <= 0) {
            MethodCollector.m26664o(4552);
            return -112;
        }
        int processBingoVideoFrameByNative = processBingoVideoFrameByNative(this.mNative, byteBuffer, i, i2, f, str);
        MethodCollector.m26664o(4552);
        return processBingoVideoFrameByNative;
    }
}
