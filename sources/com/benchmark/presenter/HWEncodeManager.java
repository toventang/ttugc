package com.benchmark.presenter;

import android.os.Build;
import com.benchmark.mediacodec.AbstractC2484d;
import com.benchmark.mediacodec.C2482c;
import com.benchmark.mediacodec.C2490g;
import com.benchmark.mediacodec.C2492i;
import com.benchmark.mediacodec.C2493j;
import com.benchmark.mediacodec.C2495k;
import com.benchmark.mediacodec.TEMediaCodecEncodeSettings;
import com.benchmark.p117a.C2415c;
import com.benchmark.settings.HWEncoderStrategyWrapper;
import com.benchmark.tools.C2526i;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;

public class HWEncodeManager {
    public volatile int encodeRet = 0;
    private Runnable feedTask = new Runnable() {
        /* class com.benchmark.presenter.HWEncodeManager.RunnableC25011 */

        /* renamed from: a */
        int f7583a;

        /* renamed from: b */
        C2526i f7584b;

        static {
            Covode.recordClassIndex(2863);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:108:0x03b3, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:109:0x03b4, code lost:
            com.benchmark.p117a.C2415c.m7261a(r0);
            r28.f7585c.encodeRet = com.benchmark.mediacodec.C2490g.f7530o;
            r28.f7585c.mStart = false;
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(6417);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:110:0x03c7, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:111:0x03c8, code lost:
            r0 = e;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Removed duplicated region for block: B:100:0x039b  */
        /* JADX WARNING: Removed duplicated region for block: B:108:0x03b3 A[ExcHandler: f (r0v2 'e' com.benchmark.mediacodec.f A[CUSTOM_DECLARE]), Splitter:B:1:0x0008] */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x01a8 A[Catch:{ IOException -> 0x03af, f -> 0x03b3 }] */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x01b7  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
            // Method dump skipped, instructions count: 976
            */
            throw new UnsupportedOperationException("Method not decompiled: com.benchmark.presenter.HWEncodeManager.RunnableC25011.run():void");
        }
    };
    public int mChangeFPSIndex = 15;
    public AbstractC2484d mEncode;
    public int mFrameRate;
    public HashMap<Long, C2492i> mInputFrames = new HashMap<>();
    public C2493j mMuxer;
    public int mNewFrameRate = 0;
    public LinkedBlockingQueue<C2492i> mOutputFrames = new LinkedBlockingQueue<>();
    public TEMediaCodecEncodeSettings mSettings;
    public boolean mStart = false;
    public HWEncoderStrategyWrapper mStrategy;
    private String mVideoOutputPath;
    public String mYUVPath;
    private FutureTask<Integer> muxerTask;
    private Callable<Integer> muxerinnerTask = new Callable<Integer>() {
        /* class com.benchmark.presenter.HWEncodeManager.CallableC25032 */

        /* renamed from: a */
        final int f7589a = 30;

        static {
            Covode.recordClassIndex(2865);
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0081, code lost:
            r4.presentationTimeUs = r5.f7535d;
            r4.offset = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0089, code lost:
            if (r5.f7537f == false) goto L_0x0091;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x008b, code lost:
            r4.flags |= 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x0093, code lost:
            if (r5.f7538g == false) goto L_0x00ad;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x0095, code lost:
            r4.flags |= 4;
            r4.size = 0;
            r2.clear();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a0, code lost:
            r6 = r11.f7590b.mMuxer;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a8, code lost:
            if (r6.f7542d == com.benchmark.mediacodec.C2493j.EnumC2494a.STARTED) goto L_0x00c4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x00aa, code lost:
            r9 = com.benchmark.mediacodec.C2490g.f7529n;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ad, code lost:
            r2.clear();
            r2.put(r5.f7533b);
            r2.position(0);
            r2.limit(r5.f7533b.length);
            r4.size = r5.f7533b.length;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x00c4, code lost:
            r6.f7539a.writeSampleData(r6.f7540b, r2, r4);
            r9 = com.benchmark.mediacodec.C2490g.f7516a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x00cd, code lost:
            if (r9 >= 0) goto L_0x00d3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x00cf, code lost:
            java.lang.Thread.sleep(50);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x00d3, code lost:
            r11.f7590b.mOutputFrames.poll();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x00dc, code lost:
            if (r5.f7538g == false) goto L_0x0059;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x00de, code lost:
            r9 = com.benchmark.mediacodec.C2490g.f7516a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:0x00fa, code lost:
            if (r11.f7590b.encodeRet != com.benchmark.mediacodec.C2490g.f7530o) goto L_0x0109;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:0x0107, code lost:
            if (r11.f7590b.encodeRet == com.benchmark.mediacodec.C2490g.f7530o) goto L_0x0117;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:53:0x0109, code lost:
            r11.f7590b.mEncode.mo6882b();
            r11.f7590b.mEncode.mo6894d();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:0x0117, code lost:
            r11.f7590b.mMuxer.mo6904a();
            r11.f7590b.mMuxer.mo6905b();
            r11.f7590b.mStart = false;
            r0 = java.lang.Integer.valueOf(r9);
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(6236);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:55:0x0130, code lost:
            return r0;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Integer call() {
            /*
            // Method dump skipped, instructions count: 350
            */
            throw new UnsupportedOperationException("Method not decompiled: com.benchmark.presenter.HWEncodeManager.CallableC25032.call():java.lang.Integer");
        }
    };
    public C2495k yuvTextureDrawer;

    /* renamed from: com.benchmark.presenter.HWEncodeManager$a */
    public static class C2504a {

        /* renamed from: a */
        public boolean f7591a;

        /* renamed from: b */
        public int f7592b;

        static {
            Covode.recordClassIndex(2866);
        }
    }

    static {
        Covode.recordClassIndex(2862);
    }

    public byte[] getCSData() {
        AbstractC2484d dVar = this.mEncode;
        if (dVar == null) {
            return new byte[1];
        }
        return dVar.f7510s;
    }

    public long getFirstFrameCost() {
        AbstractC2484d dVar = this.mEncode;
        if (dVar == null) {
            return 0;
        }
        return dVar.f7506o;
    }

    public int getHoardFrames() {
        AbstractC2484d dVar = this.mEncode;
        if (dVar == null) {
            return 0;
        }
        return dVar.f7502k - dVar.f7501j;
    }

    public long getMediaCodecInitCost() {
        AbstractC2484d dVar = this.mEncode;
        if (dVar == null) {
            return 0;
        }
        return dVar.f7505n;
    }

    public int getProfile() {
        AbstractC2484d dVar = this.mEncode;
        if (dVar == null) {
            return 0;
        }
        return dVar.f7504m;
    }

    public int getResult() {
        try {
            int intValue = this.muxerTask.get().intValue();
            if (!(intValue == C2490g.f7516a || this.encodeRet == C2490g.f7530o)) {
                this.encodeRet = intValue;
            }
            return this.encodeRet;
        } catch (InterruptedException e) {
            e.getMessage();
            return -1;
        } catch (ExecutionException e2) {
            C2415c.m7261a(e2);
            e2.getMessage();
            return -1;
        }
    }

    public int init() {
        C2482c cVar = new C2482c();
        this.mEncode = cVar;
        int a = cVar.mo6887a(this.mSettings);
        this.mChangeFPSIndex = this.mSettings.getChangeFPSIndex();
        if (a < 0) {
            return a;
        }
        this.mMuxer = new C2493j(this.mVideoOutputPath, this.mEncode);
        return 0;
    }

    public int start() {
        try {
            int c = this.mEncode.mo6893c();
            if (c == 0) {
                this.mStart = true;
                new Thread(this.feedTask).start();
                this.muxerTask = new FutureTask<>(this.muxerinnerTask);
                new Thread(this.muxerTask).start();
            }
            return c;
        } catch (Exception e) {
            C2415c.m7261a(e);
            return -218;
        }
    }

    private void changeFrameRate(int i) {
        this.mNewFrameRate = i;
    }

    public int initStrategyWrapper(long j) {
        HWEncoderStrategyWrapper hWEncoderStrategyWrapper = new HWEncoderStrategyWrapper(j);
        this.mStrategy = hWEncoderStrategyWrapper;
        this.mSettings = hWEncoderStrategyWrapper.getSettings();
        this.mYUVPath = this.mStrategy.getYUVPath();
        String videoOutputPath = this.mStrategy.getVideoOutputPath();
        this.mVideoOutputPath = videoOutputPath;
        if (this.mYUVPath == null || videoOutputPath == null) {
            return -205;
        }
        return 0;
    }

    public void setParams(int i, int i2) {
        if (i != 303 || i2 <= 0) {
            this.mEncode.mo6889a(i, i2);
        } else {
            changeFrameRate(i2);
        }
    }

    public int init(String str, String str2, C2504a aVar) {
        String str3;
        TEMediaCodecEncodeSettings.C2477a aVar2 = new TEMediaCodecEncodeSettings.C2477a();
        if (aVar.f7591a) {
            str3 = "video/hevc";
        } else {
            str3 = "video/avc";
        }
        aVar2.f7433a.mMimeType = str3;
        aVar2.f7433a.mInputColorFormat = aVar.f7592b;
        aVar2.f7433a.mFrameRate = 30;
        aVar2.f7433a.mIFrameInternal = 1;
        aVar2.f7433a.mBitRate = 4000000;
        aVar2.f7433a.mBitRateMode = 1;
        aVar2.f7433a.mWidth = 720;
        aVar2.f7433a.mHeight = 1280;
        if (aVar.f7591a) {
            aVar2.mo6875a(1);
        } else if (Build.VERSION.SDK_INT > 25) {
            aVar2.mo6875a(8);
        } else {
            aVar2.mo6875a(1);
        }
        this.mSettings = aVar2.f7433a;
        this.mYUVPath = str;
        C2482c cVar = new C2482c();
        this.mEncode = cVar;
        int a = cVar.mo6887a(this.mSettings);
        if (a < 0) {
            return a;
        }
        this.mMuxer = new C2493j(str2, this.mEncode);
        return 0;
    }
}
