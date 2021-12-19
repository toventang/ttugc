package com.bef.effectsdk.view;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.util.AttributeSet;
import com.bef.effectsdk.AssetResourceFinder;
import com.bef.effectsdk.GLTextureView;
import com.bef.effectsdk.ResourceFinder;
import com.bef.effectsdk.message.MessageCenter;
import com.bef.effectsdk.view.ViewControllerInterface;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

public class BEFView extends GLTextureView implements GLSurfaceView.Renderer, MessageCenter.Listener, ViewControllerInterface.NativeMessageListener {
    protected String mAdBundlePath;
    private AssetResourceFinder mAssetResourceFinder;
    private long mAttachedEffect;
    protected Queue<Runnable> mCacheMessages;
    private boolean mDestroyed;
    protected long mHandle;
    private long mLastAttachedEffect;
    private long mLastTickInNanoSeconds;
    protected HashSet<MessageListener> mListeners;
    protected float[] mMatrix;
    private boolean mMultipleTouchEnabled;
    protected boolean mNativeInited;
    private Builder.Params mParams;
    protected int mSourceTexture;
    private int[] mTouch_ids;
    private float[] mTouch_xs;
    private float[] mTouch_ys;

    public interface MessageListener {
        static {
            Covode.recordClassIndex(2757);
        }

        void onMessageReceived(long j, long j2, long j3, String str);
    }

    static {
        Covode.recordClassIndex(2739);
    }

    /* renamed from: com_bef_effectsdk_view_BEFView_com_ss_android_ugc_aweme_lancet_LogLancet_d */
    public static int m7254xa54825d2(String str, String str2) {
        return 0;
    }

    /* renamed from: com_bef_effectsdk_view_BEFView_com_ss_android_ugc_aweme_lancet_LogLancet_e */
    public static int m7255xa54825d3(String str, String str2) {
        return 0;
    }

    public void onSurfaceChanged(GL10 gl10, int i, int i2) {
    }

    public static class Color {

        /* renamed from: a */
        private float f7219a;

        /* renamed from: b */
        private float f7220b;

        /* renamed from: g */
        private float f7221g;

        /* renamed from: r */
        private float f7222r;

        static {
            Covode.recordClassIndex(2755);
        }

        public float alpha() {
            return this.f7219a;
        }

        public float blue() {
            return this.f7220b;
        }

        public float green() {
            return this.f7221g;
        }

        public float red() {
            return this.f7222r;
        }

        public Color() {
            setColor(0.0f, 0.0f, 0.0f, 0.0f);
        }

        public Color(float f, float f2, float f3, float f4) {
            setColor(f, f2, f3, f4);
        }

        public void setColor(float f, float f2, float f3, float f4) {
            this.f7222r = f;
            this.f7221g = f2;
            this.f7220b = f3;
            this.f7219a = f4;
        }
    }

    public static final class Builder {
        private Params mParams = new Params();

        static {
            Covode.recordClassIndex(2753);
        }

        private Builder() {
        }

        public static Builder obtain() {
            Builder builder = new Builder();
            builder.mParams.mRenderWidth = 720;
            builder.mParams.mRenderHeight = 1280;
            builder.mParams.mFPS = 30.0d;
            builder.mParams.mFitMode = FitMode.FILL_SCREEN;
            builder.mParams.mResourceFinder = null;
            builder.mParams.mSceneKey = BEFViewSceneKey.SHOOT;
            return builder;
        }

        /* access modifiers changed from: package-private */
        public class Params {
            public double mFPS;
            public FitMode mFitMode;
            public int mRenderHeight;
            public int mRenderWidth;
            public ResourceFinder mResourceFinder;
            public BEFViewSceneKey mSceneKey;

            static {
                Covode.recordClassIndex(2754);
            }

            private Params() {
            }
        }

        public final Builder setFPS(double d) {
            this.mParams.mFPS = d;
            return this;
        }

        public final Builder setFitMode(FitMode fitMode) {
            this.mParams.mFitMode = fitMode;
            return this;
        }

        public final Builder setResourceFinder(ResourceFinder resourceFinder) {
            this.mParams.mResourceFinder = resourceFinder;
            return this;
        }

        public final Builder setSceneKey(BEFViewSceneKey bEFViewSceneKey) {
            this.mParams.mSceneKey = bEFViewSceneKey;
            return this;
        }

        public final BEFView build(Context context) {
            BEFView bEFView = new BEFView(context);
            bEFView.setParams(this.mParams);
            return bEFView;
        }

        public final Builder setRenderSize(int i, int i2) {
            this.mParams.mRenderWidth = i;
            this.mParams.mRenderHeight = i2;
            return this;
        }

        public final BEFView build(Context context, AttributeSet attributeSet) {
            BEFView bEFView = new BEFView(context, attributeSet);
            bEFView.setParams(this.mParams);
            return bEFView;
        }
    }

    public synchronized boolean getNativeInited() {
        boolean z;
        MethodCollector.m26663i(5034);
        z = this.mNativeInited;
        MethodCollector.m26664o(5034);
        return z;
    }

    @Override // com.bef.effectsdk.GLTextureView
    public void onDestroy() {
        m7254xa54825d2("BEFView", "onDestroy start");
        if (this.mDestroyed) {
            m7255xa54825d3("BEFView", "onDestroy Duplicate!");
            return;
        }
        queueEvent(new Runnable() {
            /* class com.bef.effectsdk.view.BEFView.RunnableC24088 */

            static {
                Covode.recordClassIndex(2750);
            }

            public void run() {
                BEFView.this.destoryRender();
            }
        });
        super.onDestroy();
        this.mDestroyed = true;
    }

    @Override // com.bef.effectsdk.GLTextureView
    public void onPause() {
        m7254xa54825d2("BEFView", "onPause start");
        if (this.mDestroyed) {
            m7255xa54825d3("BEFView", "onPause called after onDestroy!");
            return;
        }
        queueEvent(new Runnable() {
            /* class com.bef.effectsdk.view.BEFView.RunnableC24066 */

            static {
                Covode.recordClassIndex(2748);
            }

            public void run() {
                BEFView.this.destoryRender();
            }
        });
        super.onPause();
    }

    @Override // com.bef.effectsdk.GLTextureView
    public void onResume() {
        m7254xa54825d2("BEFView", "onResume start");
        if (this.mDestroyed) {
            m7255xa54825d3("BEFView", "onResume called after onDestroy!");
            return;
        }
        super.onResume();
        queueEvent(new Runnable() {
            /* class com.bef.effectsdk.view.BEFView.RunnableC24077 */

            static {
                Covode.recordClassIndex(2749);
            }

            public void run() {
                if (!BEFView.this.getNativeInited()) {
                    BEFView.this.initRender();
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bef.effectsdk.view.BEFView$11 */
    public static /* synthetic */ class C240011 {
        static final /* synthetic */ int[] $SwitchMap$com$bef$effectsdk$view$BEFView$FitMode;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002d */
        static {
            /*
                r0 = 2742(0xab6, float:3.842E-42)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.bef.effectsdk.view.BEFView$FitMode[] r0 = com.bef.effectsdk.view.BEFView.FitMode.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.bef.effectsdk.view.BEFView.C240011.$SwitchMap$com$bef$effectsdk$view$BEFView$FitMode = r2
                com.bef.effectsdk.view.BEFView$FitMode r0 = com.bef.effectsdk.view.BEFView.FitMode.FIT_WIDTH     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.bef.effectsdk.view.BEFView.C240011.$SwitchMap$com$bef$effectsdk$view$BEFView$FitMode     // Catch:{ NoSuchFieldError -> 0x0022 }
                com.bef.effectsdk.view.BEFView$FitMode r0 = com.bef.effectsdk.view.BEFView.FitMode.FIT_HEIGHT     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                int[] r2 = com.bef.effectsdk.view.BEFView.C240011.$SwitchMap$com$bef$effectsdk$view$BEFView$FitMode     // Catch:{ NoSuchFieldError -> 0x002d }
                com.bef.effectsdk.view.BEFView$FitMode r0 = com.bef.effectsdk.view.BEFView.FitMode.FILL_SCREEN     // Catch:{ NoSuchFieldError -> 0x002d }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002d }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002d }
            L_0x002d:
                int[] r2 = com.bef.effectsdk.view.BEFView.C240011.$SwitchMap$com$bef$effectsdk$view$BEFView$FitMode     // Catch:{ NoSuchFieldError -> 0x0038 }
                com.bef.effectsdk.view.BEFView$FitMode r0 = com.bef.effectsdk.view.BEFView.FitMode.NO_CLIP     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bef.effectsdk.view.BEFView.C240011.<clinit>():void");
        }
    }

    public enum BEFViewSceneKey {
        SHOOT,
        LIVE;

        static {
            Covode.recordClassIndex(2752);
        }
    }

    public enum FitMode {
        FIT_WIDTH,
        FIT_HEIGHT,
        FILL_SCREEN,
        FIT_WIDTH_BOTTOM,
        NO_CLIP;

        static {
            Covode.recordClassIndex(2756);
        }
    }

    public void destoryRender() {
        m7254xa54825d2("BEFView", "destoryRender start");
        if (getNativeInited()) {
            m7254xa54825d2("BEFView", "destoryRender do destroy");
            setNativeInited(false);
            if (this.mParams.mResourceFinder != null) {
                this.mParams.mResourceFinder.release(this.mHandle);
            }
            AssetResourceFinder assetResourceFinder = this.mAssetResourceFinder;
            if (assetResourceFinder != null) {
                assetResourceFinder.release(0);
            }
            ViewControllerInterface.removeMessageListener(this.mHandle, this);
            ViewControllerInterface.destroy(this.mHandle);
            this.mHandle = 0;
            ViewControllerInterface.deleteTexture(this.mSourceTexture);
            this.mSourceTexture = 0;
            MessageCenter.removeListener(this);
            MessageCenter.destroy();
            this.mLastAttachedEffect = 0;
        }
        m7254xa54825d2("BEFView", "destoryRender end");
    }

    public void initRender() {
        m7254xa54825d2("BEFView", "initRender start");
        setNativeInited(false);
        long j = this.mHandle;
        if (j != 0) {
            try {
                ViewControllerInterface.destroy(j);
                this.mHandle = 0;
            } catch (Exception unused) {
                m7255xa54825d3("BEFView", "Destroy old effect handle failed");
            }
        }
        int i = this.mSourceTexture;
        if (i > 0) {
            ViewControllerInterface.deleteTexture(i);
        }
        if (this.mHandle == 0) {
            long[] jArr = new long[2];
            ViewControllerInterface.createHandle(jArr, this.mParams.mSceneKey.ordinal());
            this.mHandle = jArr[0];
            if (this.mParams.mResourceFinder != null) {
                ViewControllerInterface.setResourceFinder(this.mHandle, this.mParams.mResourceFinder.createNativeResourceFinder(this.mHandle), 0);
            } else {
                ViewControllerInterface.setResourceFinder(this.mHandle, 0, 0);
            }
            ViewControllerInterface.init(this.mHandle, this.mParams.mRenderWidth, this.mParams.mRenderHeight);
        }
        ViewControllerInterface.addMessageListener(this.mHandle, this);
        MessageCenter.init();
        MessageCenter.addListener(this);
        this.mLastTickInNanoSeconds = System.nanoTime();
        int[] iArr = new int[1];
        int[] iArr2 = new int[1];
        int[] iArr3 = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        GLES20.glBindTexture(3553, iArr[0]);
        GLES20.glTexParameterf(3553, 10240, 9729.0f);
        GLES20.glTexParameterf(3553, 10241, 9729.0f);
        GLES20.glTexParameterf(3553, 10242, 33071.0f);
        GLES20.glTexParameterf(3553, 10243, 33071.0f);
        GLES20.glTexImage2D(3553, 0, 6408, this.mParams.mRenderWidth, this.mParams.mRenderHeight, 0, 6408, 5121, null);
        GLES20.glBindTexture(3553, 0);
        GLES20.glGetIntegerv(36006, iArr3, 0);
        GLES20.glGenFramebuffers(1, iArr2, 0);
        GLES20.glBindFramebuffer(36160, iArr2[0]);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr[0], 0);
        GLES20.glViewport(0, 0, this.mParams.mRenderWidth, this.mParams.mRenderHeight);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glClear(16384);
        GLES20.glBindFramebuffer(36160, iArr3[0]);
        GLES20.glDeleteFramebuffers(1, iArr2, 0);
        this.mSourceTexture = iArr[0];
        String str = this.mAdBundlePath;
        if (str != "") {
            ViewControllerInterface.setStickerPath(this.mHandle, str);
        }
        this.mLastAttachedEffect = 0;
        setNativeInited(true);
        m7254xa54825d2("BEFView", "initRender end");
    }

    public void setParams(Builder.Params params) {
        this.mParams = params;
    }

    public synchronized void attachEffect(long j) {
        MethodCollector.m26663i(4837);
        this.mAttachedEffect = j;
        MethodCollector.m26664o(4837);
    }

    /* access modifiers changed from: protected */
    public synchronized void setNativeInited(boolean z) {
        MethodCollector.m26663i(5116);
        this.mNativeInited = z;
        MethodCollector.m26664o(5116);
    }

    public synchronized int addMessageListener(MessageListener messageListener) {
        MethodCollector.m26663i(5151);
        if (messageListener == null) {
            MethodCollector.m26664o(5151);
            return -1;
        }
        this.mListeners.add(messageListener);
        MethodCollector.m26664o(5151);
        return 0;
    }

    public synchronized int removeMessageListener(MessageListener messageListener) {
        MethodCollector.m26663i(5152);
        if (messageListener == null) {
            MethodCollector.m26664o(5152);
            return -1;
        }
        this.mListeners.remove(messageListener);
        MethodCollector.m26664o(5152);
        return 0;
    }

    public synchronized void setStickerPath(final String str) {
        MethodCollector.m26663i(5148);
        queueEvent(new Runnable() {
            /* class com.bef.effectsdk.view.BEFView.RunnableC23981 */

            static {
                Covode.recordClassIndex(2740);
            }

            public void run() {
                if (BEFView.this.getNativeInited()) {
                    BEFView.this.mAdBundlePath = str;
                    ViewControllerInterface.setStickerPath(BEFView.this.mHandle, str);
                }
            }
        });
        MethodCollector.m26664o(5148);
    }

    private BEFView(Context context) {
        super(context);
        this.mAdBundlePath = "";
        this.mMatrix = new float[16];
        this.mTouch_ids = new int[10];
        this.mTouch_xs = new float[10];
        this.mTouch_ys = new float[10];
        this.mMultipleTouchEnabled = true;
        init(context);
    }

    private void init(Context context) {
        setPreserveEGLContextOnPause(true);
        setEGLConfigChooser(8, 8, 8, 8, 16, 0);
        setRenderer(this);
        setRenderMode(1);
        this.mListeners = new HashSet<>();
        this.mCacheMessages = new LinkedList();
        AssetResourceFinder assetResourceFinder = new AssetResourceFinder(context.getAssets(), "");
        this.mAssetResourceFinder = assetResourceFinder;
        assetResourceFinder.createNativeResourceFinder(0);
        this.mDestroyed = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0059, code lost:
        if (r3 != 6) goto L_0x005b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r14) {
        /*
        // Method dump skipped, instructions count: 210
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bef.effectsdk.view.BEFView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void onDrawFrame(GL10 gl10) {
        MethodCollector.m26663i(4999);
        if (!getNativeInited()) {
            MethodCollector.m26664o(4999);
            return;
        }
        if (this.mAttachedEffect != this.mLastAttachedEffect) {
            m7254xa54825d2("BEFView", "attach new effectHandle");
            ViewControllerInterface.attachEffect(this.mHandle, this.mAttachedEffect);
            this.mLastAttachedEffect = this.mAttachedEffect;
        }
        long nanoTime = System.nanoTime() - this.mLastTickInNanoSeconds;
        double d = (1.0d / this.mParams.mFPS) * 1.0E9d;
        double d2 = (double) nanoTime;
        if (d2 < d) {
            Double.isNaN(d2);
            try {
                Thread.sleep((long) (((d - d2) * 1.0d) / 1000000.0d));
            } catch (Exception unused) {
            }
        }
        this.mLastTickInNanoSeconds = System.nanoTime();
        while (!this.mCacheMessages.isEmpty()) {
            this.mCacheMessages.poll().run();
        }
        double nanoTime2 = (double) System.nanoTime();
        Double.isNaN(nanoTime2);
        double d3 = nanoTime2 / 1.0E9d;
        int width = getWidth();
        int height = getHeight();
        Matrix.setIdentityM(this.mMatrix, 0);
        RectF rectF = new RectF(0.0f, 0.0f, (float) this.mParams.mRenderWidth, (float) this.mParams.mRenderHeight);
        float f = (float) width;
        RectF rectF2 = new RectF(0.0f, 0.0f, f, (float) height);
        PointF fitResolution = fitResolution(new PointF(0.0f, 0.0f), rectF, rectF2, this.mParams.mFitMode);
        PointF fitResolution2 = fitResolution(new PointF((float) this.mParams.mRenderWidth, (float) this.mParams.mRenderHeight), rectF, rectF2, this.mParams.mFitMode);
        if (this.mParams.mFitMode == FitMode.FIT_WIDTH_BOTTOM) {
            fitResolution = new PointF(0.0f, 0.0f);
            fitResolution2 = new PointF(f, (float) ((this.mParams.mRenderHeight * width) / this.mParams.mRenderWidth));
        }
        ViewControllerInterface.processFrame(this.mHandle, this.mSourceTexture, this.mParams.mRenderWidth, this.mParams.mRenderHeight, this.mMatrix, new float[]{fitResolution.x, fitResolution.y, fitResolution2.x - fitResolution.x, fitResolution2.y - fitResolution.y}, d3);
        MethodCollector.m26664o(4999);
    }

    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        m7254xa54825d2("BEFView", "onSurfaceCreated start");
        initRender();
    }

    public synchronized void setRenderCacheTexture(final String str, final String str2) {
        MethodCollector.m26663i(5289);
        queueEvent(new Runnable() {
            /* class com.bef.effectsdk.view.BEFView.RunnableC24099 */

            static {
                Covode.recordClassIndex(2751);
            }

            public void run() {
                if (BEFView.this.getNativeInited()) {
                    ViewControllerInterface.setRenderCacheTexture(BEFView.this.mHandle, str, str2);
                }
            }
        });
        MethodCollector.m26664o(5289);
    }

    private BEFView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mAdBundlePath = "";
        this.mMatrix = new float[16];
        this.mTouch_ids = new int[10];
        this.mTouch_xs = new float[10];
        this.mTouch_ys = new float[10];
        this.mMultipleTouchEnabled = true;
        init(context);
    }

    private void convertTouchesToNormalizedPos(float[] fArr, float[] fArr2, int i) {
        PointF fitResolution;
        int width = getWidth();
        int height = getHeight();
        for (int i2 = 0; i2 < i; i2++) {
            float f = fArr[i2];
            float f2 = fArr2[i2];
            PointF pointF = new PointF(f, f2);
            float f3 = (float) width;
            float f4 = (float) height;
            RectF rectF = new RectF(0.0f, 0.0f, f3, f4);
            new PointF();
            if (this.mParams.mFitMode == FitMode.FILL_SCREEN) {
                fitResolution = fitResolution(pointF, rectF, new RectF(0.0f, 0.0f, (float) this.mParams.mRenderWidth, (float) this.mParams.mRenderHeight), FitMode.NO_CLIP);
            } else if (this.mParams.mFitMode == FitMode.NO_CLIP) {
                fitResolution = fitResolution(pointF, rectF, new RectF(0.0f, 0.0f, (float) this.mParams.mRenderWidth, (float) this.mParams.mRenderHeight), FitMode.FILL_SCREEN);
            } else if (this.mParams.mFitMode == FitMode.FIT_WIDTH_BOTTOM) {
                float f5 = ((f3 * 1.0f) / ((float) this.mParams.mRenderWidth)) * ((float) this.mParams.mRenderHeight);
                fArr[i2] = (f * 1.0f) / f3;
                fArr2[i2] = ((f2 - (f4 - f5)) * 1.0f) / f5;
            } else {
                fitResolution = fitResolution(pointF, rectF, new RectF(0.0f, 0.0f, (float) this.mParams.mRenderWidth, (float) this.mParams.mRenderHeight), this.mParams.mFitMode);
            }
            fArr[i2] = fitResolution.x / ((float) this.mParams.mRenderWidth);
            fArr2[i2] = fitResolution.y / ((float) this.mParams.mRenderHeight);
        }
    }

    @Override // com.bef.effectsdk.message.MessageCenter.Listener
    public void onMessageReceived(int i, int i2, int i3, String str) {
        postMessage((long) i, (long) i2, (long) i3, str);
    }

    public synchronized int postMessage(final long j, final long j2, final long j3, final String str) {
        MethodCollector.m26663i(5193);
        queueEvent(new Runnable() {
            /* class com.bef.effectsdk.view.BEFView.RunnableC24012 */

            static {
                Covode.recordClassIndex(2743);
            }

            public void run() {
                BEFView.this.mCacheMessages.add(new Runnable() {
                    /* class com.bef.effectsdk.view.BEFView.RunnableC24012.RunnableC24021 */

                    static {
                        Covode.recordClassIndex(2744);
                    }

                    public void run() {
                        ViewControllerInterface.postMessage(BEFView.this.mHandle, j, j2, j3, str);
                    }
                });
            }
        });
        MethodCollector.m26664o(5193);
        return 0;
    }

    public synchronized void setRenderCacheTextureWithBuffer(final String str, final byte[] bArr, final int i, final int i2) {
        MethodCollector.m26663i(5400);
        queueEvent(new Runnable() {
            /* class com.bef.effectsdk.view.BEFView.RunnableC239910 */

            static {
                Covode.recordClassIndex(2741);
            }

            public void run() {
                if (BEFView.this.getNativeInited()) {
                    ViewControllerInterface.setRenderCacheTextureWithBuffer(BEFView.this.mHandle, str, bArr, i, i2);
                }
            }
        });
        MethodCollector.m26664o(5400);
    }

    @Override // com.bef.effectsdk.view.ViewControllerInterface.NativeMessageListener
    public synchronized int nativeOnMsgReceived(long j, long j2, long j3, String str) {
        MethodCollector.m26663i(5201);
        Iterator<MessageListener> it = this.mListeners.iterator();
        while (it.hasNext()) {
            it.next().onMessageReceived(j, j2, j3, str);
        }
        MethodCollector.m26664o(5201);
        return 0;
    }

    private PointF fitResolution(PointF pointF, RectF rectF, RectF rectF2, FitMode fitMode) {
        PointF pointF2;
        while (true) {
            pointF2 = new PointF();
            float f = rectF2.left;
            float f2 = rectF2.top;
            float width = rectF2.width();
            float height = rectF2.height();
            float width2 = (pointF.x - rectF.left) / rectF.width();
            float height2 = (pointF.y - rectF.top) / rectF.height();
            int i = C240011.$SwitchMap$com$bef$effectsdk$view$BEFView$FitMode[fitMode.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    float height3 = height / rectF.height();
                    pointF2.x = (float) ((int) (f + ((width - (rectF.width() * height3)) / 2.0f) + (width2 * height3 * rectF.width())));
                    pointF2.y = (float) ((int) (f2 + (height2 * height)));
                    break;
                } else if (i != 3) {
                    if (i != 4) {
                        break;
                    } else if (width / rectF.width() > height / rectF.height()) {
                        fitMode = FitMode.FIT_HEIGHT;
                    } else {
                        fitMode = FitMode.FIT_WIDTH;
                    }
                } else if (width / rectF.width() < height / rectF.height()) {
                    fitMode = FitMode.FIT_HEIGHT;
                } else {
                    fitMode = FitMode.FIT_WIDTH;
                }
            } else {
                float width3 = width / rectF.width();
                pointF2.x = (float) ((int) (f + (width2 * width)));
                pointF2.y = (float) ((int) (f2 + ((height - (rectF.height() * width3)) / 2.0f) + (height2 * width3 * rectF.height())));
                break;
            }
        }
        return pointF2;
    }
}
