package com.p2082ss.android.ttve.mediacodec;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.media.Image;
import android.media.ImageReader;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Build;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.util.Pair;
import android.util.Range;
import android.view.Surface;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.C15346a;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ttve.common.C30642c;
import com.p2082ss.android.ttve.common.C30645e;
import com.p2082ss.android.ttve.common.TEImageUtils;
import com.p2082ss.android.ttve.model.C30677e;
import com.p2082ss.android.ttve.model.VEFrame;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import com.p2082ss.android.vesdk.C85315al;
import com.p2082ss.android.vesdk.C85317am;
import com.p2082ss.android.vesdk.C85568t;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.reflect.Method;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: com.ss.android.ttve.mediacodec.TEMediaCodecDecoder */
public class TEMediaCodecDecoder implements SurfaceTexture.OnFrameAvailableListener, ImageReader.OnImageAvailableListener {
    private static int file_count;
    private static Object mCodecListLock = new Object();
    private static boolean mIsByteVC1Blocklist = false;
    private static ArrayList<MediaCodecInfo> mVideoHWDecoderCodecs = new ArrayList<>();
    private static boolean m_useCreateDecoderByName = true;
    private static volatile boolean sDequeueHWDecodeInputBufferOpt = true;
    private static int sDequeueOutputTimeoutUs = 10000;
    private static boolean sHWDecodeSupportRtAndOr = false;
    private static int sPendingInputBufferThreshold = 5;
    private final int MAX_DELAY_COUNT = 10;
    private final long MAX_SLEEP_MS = 0;
    private String VIDEO_MIME_TYPE = "video/avc";
    private VEFrame mConvertFrame = null;
    private Image mImage = null;
    private ImageReader mImageReader = null;
    private int mMinCompressionRatio = 1;
    private HandlerThread mReaderHandlerThread = null;
    private VEFrame mScaleFrame = null;
    private Handler m_MediaCodechandler;
    private ConditionVariable m_ReEncodeOptCV = new ConditionVariable(true);
    private volatile boolean m_awaitNewImageSuccess = false;
    private boolean m_bHWOverload = false;
    private boolean m_bNeedConfigure;
    private volatile boolean m_bReEnableOpt = false;
    private boolean m_bUseImageReader;
    private MediaCodec.BufferInfo m_bufferInfo = new MediaCodec.BufferInfo();
    private ByteBuffer m_codecSpecificData;
    private MediaCodec m_decoder = null;
    private volatile boolean m_decoderStarted = false;
    private C30642c m_eglStateSaver = null;
    private ByteBuffer m_extraDataBuf;
    private MediaFormat m_format;
    private boolean m_frameAvailable = false;
    private final Object m_frameSyncObject = new Object();
    private HandlerThread m_handleThread = new HandlerThread("mediacodec_callback");
    private int m_iCodecID = 28;
    private int m_iCurCount = 0;
    private int m_iFps;
    private int m_iHeight;
    private int m_iOutputHeight;
    private int m_iOutputWidth;
    private int m_iRotateDegree;
    private int m_iWidth;
    private int m_indexOfOutputBuffer = -1;
    private volatile boolean m_inputBufferQueued = false;
    private long m_nativeHandler;
    private boolean m_needSendPacketAgain = false;
    private volatile int m_pendingInputFrameCount = 0;
    private C30660b m_renderParam = new C30660b();
    private volatile boolean m_sawInputEOS = false;
    private volatile boolean m_sawOutputEOS = false;
    private C30645e m_sharedContext = null;
    private Surface m_surface;
    private int[] m_surfaceTexID = new int[1];
    private SurfaceTexture m_surfaceTexture;
    private C30659a m_textureRender = null;
    private volatile long m_timestampOfCurTexFrame = Long.MIN_VALUE;
    private volatile long m_timestampOfLastDecodedFrame = Long.MIN_VALUE;

    /* renamed from: com_ss_android_ttve_mediacodec_TEMediaCodecDecoder_com_ss_android_ugc_aweme_lancet_LogLancet_d */
    public static int m63009xfc750847(String str, String str2) {
        return 0;
    }

    /* renamed from: com_ss_android_ttve_mediacodec_TEMediaCodecDecoder_com_ss_android_ugc_aweme_lancet_LogLancet_e */
    public static int m63010xfc750848(String str, String str2) {
        return 0;
    }

    /* renamed from: com_ss_android_ttve_mediacodec_TEMediaCodecDecoder_com_ss_android_ugc_aweme_lancet_LogLancet_i */
    public static int m63011xfc75084c(String str, String str2) {
        return 0;
    }

    /* renamed from: com_ss_android_ttve_mediacodec_TEMediaCodecDecoder_com_ss_android_ugc_aweme_lancet_LogLancet_w */
    public static int m63012xfc75085a(String str, String str2) {
        return 0;
    }

    /* renamed from: com_ss_android_ttve_mediacodec_TEMediaCodecDecoder_java_lang_reflect_Method_invoke */
    private static Object m63014xed123814(Method method, Object obj, Object[] objArr) {
        Pair<Boolean, Object> a = C15346a.m28238a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_ss_android_ttve_mediacodec_TEMediaCodecDecoder_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a.first).booleanValue()) {
            return a.second;
        }
        Object invoke = method.invoke(obj, objArr);
        C15346a.m28242a(invoke, method, new Object[]{obj, objArr}, "com_ss_android_ttve_mediacodec_TEMediaCodecDecoder_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    private native boolean nativeOnFrameAvailable(long j, ByteBuffer byteBuffer, int i);

    private static void setHWDecodeBoolConfigFromNative(String str, boolean z) {
    }

    private static void setHWDecodeIntConfigFromNative(String str, int i) {
    }

    private boolean isNeedSendPacketAgain() {
        return this.m_needSendPacketAgain;
    }

    public C30660b getRenderParam() {
        return this.m_renderParam;
    }

    private boolean IsValid() {
        if (this.m_decoder != null) {
            return true;
        }
        return false;
    }

    private int restartDecoder() {
        stopDecoder();
        return startDecoder();
    }

    public int getOESTexture() {
        return this.m_surfaceTexID[0];
    }

    private void deleteTexture() {
        int[] iArr = this.m_surfaceTexID;
        if (iArr[0] != 0) {
            GLES20.glDeleteTextures(1, iArr, 0);
            this.m_surfaceTexID[0] = 0;
        }
    }

    public static boolean isSupportByteVC10bit() {
        return isSupportFormat("video/hevc", 2, 16384);
    }

    public int closeDecoder() {
        C85315al.m146641c("TEMediaCodecDecoder", "TEMediaCodecDecoder closeDecoder");
        stopDecoder();
        deleteTexture();
        return 0;
    }

    /* renamed from: com.ss.android.ttve.mediacodec.TEMediaCodecDecoder$b */
    public class C30660b {

        /* renamed from: a */
        public RectF f73323a;

        /* renamed from: b */
        public int f73324b;

        /* renamed from: c */
        public int f73325c;

        /* renamed from: d */
        public int f73326d;

        static {
            Covode.recordClassIndex(37213);
        }

        public String toString() {
            return "cropRect: " + this.f73323a + ", rotate: " + this.f73324b;
        }

        public C30660b() {
        }
    }

    public void signalReEncodeOptCV() {
        if (this.m_bReEnableOpt) {
            this.m_ReEncodeOptCV.open();
            C85315al.m146639b("TEMediaCodecDecoder", "signalReEncodeOptCV...");
        }
    }

    static {
        Covode.recordClassIndex(37211);
    }

    private int createTexture() {
        GLES20.glGenTextures(1, this.m_surfaceTexID, 0);
        int[] iArr = this.m_surfaceTexID;
        if (iArr[0] <= 0) {
            C85315al.m146642d("TEMediaCodecDecoder", "createTexture failed");
            return 0;
        }
        GLES20.glBindTexture(36197, iArr[0]);
        GLES20.glTexParameterf(36197, 10241, 9728.0f);
        GLES20.glTexParameterf(36197, 10240, 9729.0f);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        return this.m_surfaceTexID[0];
    }

    public static int getMaxMediaCodecVideoDecoderCount() {
        MediaCodecInfo mediaCodecInfo21 = getMediaCodecInfo21("video/avc");
        if (mediaCodecInfo21 == null) {
            C85315al.m146642d("TEMediaCodecDecoder", "MediaCodecInfo is null!");
            return -2;
        }
        int maxSupportedInstances = mediaCodecInfo21.getCapabilitiesForType("video/avc").getMaxSupportedInstances();
        C85315al.m146637a("TEMediaCodecDecoder", "getMaxMediaCodecVideoDecoderCount ".concat(String.valueOf(maxSupportedInstances)));
        return maxSupportedInstances;
    }

    private boolean isMtkByteVC1BlockList() {
        String lowerCase = Build.HARDWARE.toLowerCase(Locale.US);
        if (lowerCase.startsWith("mt6763") || lowerCase.startsWith("mt6757") || lowerCase.startsWith("mt6739") || lowerCase.startsWith("mt6750")) {
            return true;
        }
        return false;
    }

    private boolean isHisiByteVC1BlockList() {
        String property = getProperty("ro.board.platform", null);
        if (Build.VERSION.SDK_INT == 26 && property != null && (property.startsWith("kirin960") || property.startsWith("hi3660"))) {
            try {
                if (Double.parseDouble(getProperty("ro.config.hw_codec_support", "0.0")) < 0.18041d) {
                    return true;
                }
            } catch (NumberFormatException unused) {
                m63012xfc75085a("TEMediaCodecDecoder", "vendor property abnormal");
                return true;
            }
        }
        return false;
    }

    private int stopDecoder() {
        cleanupDecoder();
        this.m_handleThread.quit();
        HandlerThread handlerThread = this.mReaderHandlerThread;
        if (handlerThread != null) {
            handlerThread.quit();
            this.mReaderHandlerThread = null;
        }
        C30659a aVar = this.m_textureRender;
        if (aVar != null) {
            if (aVar.f73307a != 0) {
                GLES20.glDeleteProgram(aVar.f73307a);
                aVar.f73307a = 0;
            }
            if (aVar.f73312f[0] != 0) {
                GLES20.glDeleteFramebuffers(1, aVar.f73312f, 0);
            }
            this.m_textureRender = null;
        }
        Surface surface = this.m_surface;
        if (surface != null) {
            surface.release();
            this.m_surface = null;
        }
        SurfaceTexture surfaceTexture = this.m_surfaceTexture;
        if (surfaceTexture != null) {
            surfaceTexture.setOnFrameAvailableListener(null);
            this.m_surfaceTexture.release();
            this.m_surfaceTexture = null;
        }
        return 0;
    }

    public void cleanupDecoder() {
        C85315al.m146637a("TEMediaCodecDecoder", "cleanupDecoder");
        if (this.m_decoder != null) {
            if (this.m_decoderStarted) {
                try {
                    if (this.m_inputBufferQueued) {
                        this.m_decoder.flush();
                        this.m_inputBufferQueued = false;
                    }
                    this.m_decoder.stop();
                } catch (Exception e) {
                    C85315al.m146642d("TEMediaCodecDecoder", e.getMessage());
                    e.printStackTrace();
                }
                this.m_decoderStarted = false;
            }
            this.m_decoder.release();
            this.m_decoder = null;
            this.m_iRotateDegree = 0;
        }
        if (((Boolean) C85568t.m147473a().mo131557a("ve_mediacodec_resource_reasonable_distribute", (Object) false)).booleanValue()) {
            C30664c.m63024b(this.m_iWidth * this.m_iHeight * this.m_iFps, hashCode());
        }
        this.m_timestampOfLastDecodedFrame = Long.MIN_VALUE;
        this.m_timestampOfCurTexFrame = Long.MIN_VALUE;
        this.m_pendingInputFrameCount = 0;
        this.m_sawInputEOS = false;
        this.m_sawOutputEOS = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0078, code lost:
        if (r2 == null) goto L_0x007a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int getMaxBlocksSizePerSecond() {
        /*
        // Method dump skipped, instructions count: 217
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ttve.mediacodec.TEMediaCodecDecoder.getMaxBlocksSizePerSecond():int");
    }

    private int configureMediaFormat() {
        MediaCodecInfo mediaCodecInfo;
        try {
            if (Build.VERSION.SDK_INT >= 21) {
                mediaCodecInfo = getMediaCodecInfo21(this.VIDEO_MIME_TYPE);
            } else {
                mediaCodecInfo = getMediaCodecInfo(this.VIDEO_MIME_TYPE);
            }
            if (mediaCodecInfo == null) {
                C85315al.m146642d("TEMediaCodecDecoder", "MediaCodecInfo is null!");
                return -2;
            }
            if (this.m_iCodecID == 28) {
                C85315al.m146637a("TEMediaCodecDecoder", "mediacodec supports adaptive playback: ".concat(String.valueOf(mediaCodecInfo.getCapabilitiesForType(this.VIDEO_MIME_TYPE).isFeatureSupported("adaptive-playback"))));
            }
            C85315al.m146639b("TEMediaCodecDecoder", "configureMediaFormat , size: " + this.m_iWidth + " x " + this.m_iHeight);
            int i = this.m_iCodecID;
            if (i == 28 || i == 174 || mediaCodecInfo.getCapabilitiesForType(this.VIDEO_MIME_TYPE).getVideoCapabilities().isSizeSupported(this.m_iWidth, this.m_iHeight)) {
                this.m_format = MediaFormat.createVideoFormat(this.VIDEO_MIME_TYPE, this.m_iWidth, this.m_iHeight);
                C85315al.m146637a("TEMediaCodecDecoder", "isSupport10bit = ".concat(String.valueOf(isSupportByteVC10bit())));
                ByteBuffer byteBuffer = this.m_codecSpecificData;
                if (byteBuffer != null) {
                    this.m_format.setByteBuffer("csd-0", byteBuffer);
                }
                if (this.m_bUseImageReader) {
                    this.m_format.setInteger("color-format", 2135033992);
                }
                if (Build.VERSION.SDK_INT == 16) {
                    this.m_format.setInteger("max-input-size", 0);
                } else {
                    int i2 = Build.VERSION.SDK_INT;
                    if (174 == this.m_iCodecID) {
                        this.m_format.setInteger("max-input-size", this.m_iWidth * this.m_iHeight);
                    } else {
                        int i3 = Build.VERSION.SDK_INT;
                        if (28 == this.m_iCodecID) {
                            this.m_format.setInteger("max-input-size", C85317am.m146644a(this.m_iWidth) * C85317am.m146644a(this.m_iHeight) * 16 * 16);
                        }
                    }
                }
                boolean booleanValue = ((Boolean) C85568t.m147473a().mo131557a("ve_hwdecode_support_rt_and_or", (Object) false)).booleanValue();
                sHWDecodeSupportRtAndOr = booleanValue;
                if (booleanValue) {
                    this.m_format.setInteger("priority", 0);
                    C85315al.m146637a("TEMediaCodecDecoder", "set real-time and operating-rate");
                }
                if (174 != this.m_iCodecID || isSupportSize(mediaCodecInfo)) {
                    return 0;
                }
                C85315al.m146642d("TEMediaCodecDecoder", "configureMediaFormat, failed, case VIDEO_MIME_TYPE = " + this.VIDEO_MIME_TYPE + ", size = " + this.m_iWidth + " x " + this.m_iHeight + " is not supported.");
                return -5;
            }
            C85315al.m146642d("TEMediaCodecDecoder", "is not size support! width: " + this.m_iWidth + " height: " + this.m_iHeight);
            return -3;
        } catch (Exception e) {
            C85315al.m146642d("TEMediaCodecDecoder", "reconfigureMediaFormat: " + e.getMessage());
            e.printStackTrace();
            return -4;
        }
    }

    private void onImageFrameAvailable() {
        VEFrame createYUVPlanFrame;
        MethodCollector.m26663i(14389);
        if (this.mImage.getFormat() == 35) {
            int width = this.mImage.getWidth();
            int height = this.mImage.getHeight();
            if (this.mImage.getPlanes() == null || this.mImage.getPlanes()[1].getPixelStride() <= 1) {
                createYUVPlanFrame = VEFrame.createYUVPlanFrame(new C30677e(this.mImage.getPlanes()), width, height, 0, 0, VEFrame.EnumC30668a.TEPixFmt_YUV420P);
            } else {
                VEFrame createYUVPlanFrame2 = VEFrame.createYUVPlanFrame(new C30677e(this.mImage.getPlanes()), width, height, 0, 0, VEFrame.EnumC30668a.TEPixFmt_NV12);
                if (this.mConvertFrame == null) {
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(((width * height) * 3) / 2);
                    allocateDirect.clear();
                    this.mConvertFrame = VEFrame.createByteBufferFrame(allocateDirect, width, height, 0, 0, VEFrame.EnumC30668a.TEPixFmt_YUV420P);
                }
                TEImageUtils.m62973a(createYUVPlanFrame2, this.mConvertFrame, VEFrame.EnumC30669b.OP_CONVERT);
                createYUVPlanFrame = this.mConvertFrame;
            }
            if (width == this.m_iOutputWidth && height == this.m_iOutputHeight && (createYUVPlanFrame.getFrame() instanceof VEFrame.ByteBufferFrame)) {
                ByteBuffer byteBuffer = ((VEFrame.ByteBufferFrame) createYUVPlanFrame.getFrame()).getByteBuffer();
                nativeOnFrameAvailable(this.m_nativeHandler, byteBuffer, byteBuffer.remaining());
                MethodCollector.m26664o(14389);
                return;
            }
            if (this.mScaleFrame == null) {
                ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(((this.m_iOutputWidth * this.m_iOutputHeight) * 3) / 2);
                allocateDirect2.clear();
                this.mScaleFrame = VEFrame.createByteBufferFrame(allocateDirect2, this.m_iOutputWidth, this.m_iOutputHeight, 0, 0, VEFrame.EnumC30668a.TEPixFmt_YUV420P);
            }
            if (this.m_iWidth == this.m_iOutputWidth && this.m_iHeight == this.m_iOutputHeight) {
                TEImageUtils.m62973a(createYUVPlanFrame, this.mScaleFrame, VEFrame.EnumC30669b.OP_COPY);
            } else {
                TEImageUtils.m62973a(createYUVPlanFrame, this.mScaleFrame, VEFrame.EnumC30669b.OP_SCALE);
            }
            ByteBuffer byteBuffer2 = ((VEFrame.ByteBufferFrame) this.mScaleFrame.getFrame()).getByteBuffer();
            nativeOnFrameAvailable(this.m_nativeHandler, byteBuffer2, byteBuffer2.remaining());
            MethodCollector.m26664o(14389);
            return;
        }
        C85315al.m146639b("TEMediaCodecDecoder", "image format: " + this.mImage.getFormat());
        MethodCollector.m26664o(14389);
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x019a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int startDecoder() {
        /*
        // Method dump skipped, instructions count: 446
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ttve.mediacodec.TEMediaCodecDecoder.startDecoder():int");
    }

    private void setRenderParam(int i) {
        this.m_renderParam.f73324b = i;
    }

    private void setProcessFlag(int i) {
        boolean z = true;
        if ((i & 1) == 0) {
            z = false;
        }
        this.m_bReEnableOpt = z;
    }

    private ByteBuffer getInputBufferByIdx(int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            return this.m_decoder.getInputBuffer(i);
        }
        return this.m_decoder.getInputBuffers()[i];
    }

    private static boolean codecNeedsFlushWorkaround(String str) {
        int i = Build.VERSION.SDK_INT;
        if (Build.VERSION.SDK_INT == 18 && ("OMX.SEC.avc.dec".equals(str) || "OMX.SEC.avc.dec.secure".equals(str))) {
            return true;
        }
        if (Build.VERSION.SDK_INT != 19 || !Build.MODEL.startsWith("SM-G800")) {
            return false;
        }
        if ("OMX.Exynos.avc.dec".equals(str) || "OMX.Exynos.avc.dec.secure".equals(str)) {
            return true;
        }
        return false;
    }

    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        MethodCollector.m26663i(14385);
        synchronized (this.m_frameSyncObject) {
            try {
                if (this.m_frameAvailable) {
                    C85315al.m146639b("TEMediaCodecDecoder", "m_frameAvailable already set, frame could be dropped!");
                }
                this.m_frameAvailable = true;
                this.m_frameSyncObject.notifyAll();
            } finally {
                MethodCollector.m26664o(14385);
            }
        }
    }

    public void onImageAvailable(ImageReader imageReader) {
        MethodCollector.m26663i(14391);
        synchronized (this.m_frameSyncObject) {
            try {
                if (this.m_frameAvailable) {
                    C85315al.m146639b("TEMediaCodecDecoder", "m_frameAvailable already set, frame could be dropped!");
                }
                Image acquireNextImage = imageReader.acquireNextImage();
                Image image = this.mImage;
                if (image != null) {
                    image.close();
                }
                this.mImage = acquireNextImage;
                this.m_frameAvailable = true;
                this.m_frameSyncObject.notifyAll();
            } finally {
                MethodCollector.m26664o(14391);
            }
        }
    }

    public int releaseOutBuffer(boolean z) {
        try {
            this.m_pendingInputFrameCount--;
            this.m_decoder.releaseOutputBuffer(this.m_indexOfOutputBuffer, z);
        } catch (Exception e) {
            e.printStackTrace();
            C85315al.m146642d("TEMediaCodecDecoder", e.getMessage());
        }
        if (!z) {
            return 0;
        }
        if (!AwaitNewImage(500)) {
            C85315al.m146642d("TEMediaCodecDecoder", "release output buffer to surface texture failed!");
            return -103;
        }
        this.m_awaitNewImageSuccess = true;
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ttve.mediacodec.TEMediaCodecDecoder$a */
    public static class C30659a {

        /* renamed from: a */
        int f73307a;

        /* renamed from: b */
        int f73308b;

        /* renamed from: c */
        int f73309c;

        /* renamed from: d */
        int f73310d;

        /* renamed from: e */
        int f73311e;

        /* renamed from: f */
        int[] f73312f = new int[1];

        /* renamed from: g */
        private final float[] f73313g;

        /* renamed from: h */
        private FloatBuffer f73314h;

        /* renamed from: i */
        private float[] f73315i = new float[16];

        /* renamed from: j */
        private float[] f73316j = new float[16];

        /* renamed from: k */
        private int f73317k;

        /* renamed from: l */
        private boolean f73318l;

        /* renamed from: m */
        private int f73319m;

        /* renamed from: n */
        private int f73320n;

        /* renamed from: o */
        private int f73321o;

        /* renamed from: p */
        private int f73322p;

        static {
            Covode.recordClassIndex(37212);
        }

        public C30659a(SurfaceTexture surfaceTexture) {
            float[] fArr = {-1.0f, -1.0f, 0.0f, 0.0f, 0.0f, 1.0f, -1.0f, 0.0f, 1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};
            this.f73313g = fArr;
            FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
            this.f73314h = asFloatBuffer;
            asFloatBuffer.put(fArr).position(0);
            if (surfaceTexture != null) {
                surfaceTexture.getTransformMatrix(this.f73316j);
            } else {
                Matrix.setIdentityM(this.f73316j, 0);
            }
        }

        /* renamed from: a */
        static int m63015a(int i, String str) {
            int glCreateShader = GLES20.glCreateShader(i);
            GLES20.glShaderSource(glCreateShader, str);
            GLES20.glCompileShader(glCreateShader);
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
            if (iArr[0] != 0) {
                return glCreateShader;
            }
            GLES20.glGetShaderInfoLog(glCreateShader);
            GLES20.glDeleteShader(glCreateShader);
            return 0;
        }

        /* renamed from: a */
        private void m63016a(int i, int i2, int i3, int i4, int i5) {
            float f;
            float f2;
            if (i2 <= 0 || i3 <= 0 || i4 <= 0 || i5 <= 0) {
                Matrix.setIdentityM(this.f73315i, 0);
            } else if (this.f73317k != i || this.f73318l || this.f73319m != i2 || this.f73320n != i3 || this.f73321o != i4 || this.f73322p != i5) {
                this.f73317k = i;
                float[] fArr = new float[16];
                Matrix.setIdentityM(fArr, 0);
                Matrix.rotateM(fArr, 0, (float) i, 0.0f, 0.0f, 1.0f);
                if (Math.abs(i) == 90 || Math.abs(i) == 270) {
                    f = (float) i3;
                } else {
                    f = (float) i2;
                }
                if (Math.abs(i) == 90 || Math.abs(i) == 270) {
                    f2 = (float) i2;
                } else {
                    f2 = (float) i3;
                }
                float f3 = (float) i4;
                float f4 = f3 / f;
                float f5 = (float) i5;
                float f6 = f5 / f2;
                if (f4 <= f6) {
                    f4 = f6;
                }
                Matrix.scaleM(fArr, 0, (((float) i2) / 2.0f) * f4, (((float) i3) / 2.0f) * f4, 1.0f);
                float[] fArr2 = new float[16];
                Matrix.setIdentityM(fArr2, 0);
                Matrix.setLookAtM(fArr2, 0, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
                float[] fArr3 = new float[16];
                Matrix.setIdentityM(fArr3, 0);
                Matrix.orthoM(fArr3, 0, ((float) (-i4)) / 2.0f, f3 / 2.0f, ((float) (-i5)) / 2.0f, f5 / 2.0f, -2.0f, 2.0f);
                float[] fArr4 = new float[16];
                Matrix.setIdentityM(fArr4, 0);
                Matrix.multiplyMM(fArr4, 0, fArr2, 0, fArr, 0);
                Matrix.setIdentityM(this.f73315i, 0);
                Matrix.multiplyMM(this.f73315i, 0, fArr3, 0, fArr4, 0);
            }
        }

        /* renamed from: a */
        public final void mo54990a(int i, int i2, int i3, int i4, int i5, int i6) {
            if (i > 0 && i2 > 0 && i4 >= i3 && i6 >= i5 && i6 <= i && i4 <= i2) {
                float[] fArr = this.f73313g;
                float f = (float) i;
                float f2 = (((float) i5) * 1.0f) / f;
                fArr[3] = f2;
                float f3 = (float) i2;
                float f4 = (((float) i3) * 1.0f) / f3;
                fArr[4] = f4;
                float f5 = (((float) i6) * 1.0f) / f;
                fArr[8] = f5;
                fArr[9] = f4;
                fArr[13] = f2;
                float f6 = (((float) i4) * 1.0f) / f3;
                fArr[14] = f6;
                fArr[18] = f5;
                fArr[19] = f6;
                this.f73314h.clear();
                this.f73314h.put(this.f73313g).position(0);
            }
        }

        /* renamed from: a */
        public final void mo54991a(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
            GLES20.glViewport(0, 0, i3, i4);
            GLES20.glBindFramebuffer(36160, this.f73312f[0]);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, i6, 0);
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
            GLES20.glClear(16640);
            GLES20.glUseProgram(this.f73307a);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(36197, i5);
            this.f73314h.position(0);
            GLES20.glVertexAttribPointer(this.f73310d, 3, 5126, false, 20, (Buffer) this.f73314h);
            GLES20.glEnableVertexAttribArray(this.f73310d);
            this.f73314h.position(3);
            GLES20.glVertexAttribPointer(this.f73311e, 2, 5126, false, 20, (Buffer) this.f73314h);
            GLES20.glEnableVertexAttribArray(this.f73311e);
            if (((Boolean) C85568t.m147473a().mo131557a("ve_enable_hw_decoder_support_rotate", (Object) false)).booleanValue()) {
                m63016a(i7, i, i2, i3, i4);
            } else {
                Matrix.setIdentityM(this.f73315i, 0);
            }
            GLES20.glUniformMatrix4fv(this.f73308b, 1, false, this.f73315i, 0);
            GLES20.glUniformMatrix4fv(this.f73309c, 1, false, this.f73316j, 0);
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glDisableVertexAttribArray(this.f73310d);
            GLES20.glDisableVertexAttribArray(this.f73311e);
            GLES20.glBindTexture(36197, 0);
            GLES20.glBindTexture(3553, 0);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
            GLES20.glBindFramebuffer(36160, 0);
            GLES20.glFinish();
        }
    }

    private boolean AwaitNewImage(int i) {
        MethodCollector.m26663i(11902);
        synchronized (this.m_frameSyncObject) {
            do {
                try {
                    if (!this.m_frameAvailable) {
                        try {
                            this.m_frameSyncObject.wait((long) i);
                        } catch (InterruptedException e) {
                            m63010xfc750848("TEMediaCodecDecoder", e.getMessage());
                            e.printStackTrace();
                            MethodCollector.m26664o(11902);
                            return false;
                        }
                    } else {
                        this.m_frameAvailable = false;
                        MethodCollector.m26664o(11902);
                        return true;
                    }
                } finally {
                    MethodCollector.m26664o(11902);
                }
            } while (this.m_frameAvailable);
            m63010xfc750848("TEMediaCodecDecoder", "Frame wait timed out!");
            return false;
        }
    }

    /* renamed from: com_ss_android_ttve_mediacodec_TEMediaCodecDecoder_com_ss_android_ugc_aweme_storage_FileLancet_delete */
    public static boolean m63013xfa2a26c6(File file) {
        MethodCollector.m26663i(12448);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(12448);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(12448);
        return delete;
    }

    private static MediaCodecInfo getMediaCodecInfo(String str) {
        String[] supportedTypes;
        int codecCount = MediaCodecList.getCodecCount();
        for (int i = 0; i < codecCount; i++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
            if (!codecInfoAt.isEncoder()) {
                String name = codecInfoAt.getName();
                if (!name.startsWith("OMX.google.") && !name.startsWith("OMX.Nvidia.") && !name.equals("OMX.TI.DUCATI1.VIDEO.H264E")) {
                    for (String str2 : codecInfoAt.getSupportedTypes()) {
                        if (str2.equalsIgnoreCase(str)) {
                            return codecInfoAt;
                        }
                    }
                    continue;
                }
            }
        }
        return null;
    }

    private static MediaCodecInfo getMediaCodecInfo21(String str) {
        String[] supportedTypes;
        MediaCodecInfo[] codecInfos = new MediaCodecList(1).getCodecInfos();
        if (!(codecInfos == null || codecInfos.length == 0)) {
            for (MediaCodecInfo mediaCodecInfo : codecInfos) {
                if (mediaCodecInfo != null && !mediaCodecInfo.isEncoder()) {
                    String name = mediaCodecInfo.getName();
                    if (!name.startsWith("OMX.google.") && !name.startsWith("OMX.Nvidia.") && !name.equals("OMX.TI.DUCATI1.VIDEO.H264E")) {
                        for (String str2 : mediaCodecInfo.getSupportedTypes()) {
                            if (str2.equalsIgnoreCase(str)) {
                                return mediaCodecInfo;
                            }
                        }
                        continue;
                    }
                }
            }
        }
        return null;
    }

    public int flushDecoder(boolean z) {
        if (this.m_decoder != null) {
            if (z) {
                try {
                    if (this.m_sawInputEOS || this.m_sawOutputEOS) {
                        cleanupDecoder();
                        if (!setupDecoder(this.VIDEO_MIME_TYPE)) {
                            return -2;
                        }
                        C85315al.m146641c("TEMediaCodecDecoder", "Decoder has been recreated.");
                        return 0;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (this.m_inputBufferQueued) {
                if (!z) {
                    this.m_timestampOfLastDecodedFrame = Long.MIN_VALUE;
                    this.m_timestampOfCurTexFrame = Long.MIN_VALUE;
                    this.m_pendingInputFrameCount = 0;
                    this.m_sawInputEOS = false;
                    this.m_sawOutputEOS = false;
                }
                this.m_decoder.flush();
                this.m_inputBufferQueued = false;
                this.m_pendingInputFrameCount = 0;
                if (((Boolean) C85568t.m147473a().mo131557a("ve_mediacodec_resource_reasonable_distribute", (Object) false)).booleanValue()) {
                    C30664c.m63024b(this.m_iWidth * this.m_iHeight * this.m_iFps, hashCode());
                }
                C85315al.m146639b("TEMediaCodecDecoder", "Video decoder has been flushed.");
                return 0;
            }
        }
        return -3;
    }

    private boolean isSupportSize(MediaCodecInfo mediaCodecInfo) {
        Range<Integer> range;
        Range<Integer> range2;
        int i;
        boolean z = false;
        if (mediaCodecInfo == null) {
            return false;
        }
        Range<Integer> supportedWidths = mediaCodecInfo.getCapabilitiesForType(this.VIDEO_MIME_TYPE).getVideoCapabilities().getSupportedWidths();
        Range<Integer> supportedHeights = mediaCodecInfo.getCapabilitiesForType(this.VIDEO_MIME_TYPE).getVideoCapabilities().getSupportedHeights();
        if (supportedWidths.getUpper().intValue() < supportedHeights.getUpper().intValue()) {
            range = supportedWidths;
        } else {
            range = supportedHeights;
        }
        if (supportedWidths.getUpper().intValue() > supportedHeights.getUpper().intValue()) {
            range2 = supportedWidths;
        } else {
            range2 = supportedHeights;
        }
        int i2 = this.m_iWidth;
        int i3 = this.m_iHeight;
        if (i2 < i3) {
            i = i2;
        } else {
            i = i3;
        }
        if (i2 <= i3) {
            i2 = i3;
        }
        if (range.contains(Integer.valueOf(i)) && range2.contains(Integer.valueOf(i2))) {
            z = true;
        }
        m63011xfc75084c("TEMediaCodecDecoder", "isSupportSize, m_iWidth = " + this.m_iWidth + ", m_iHeight  = " + this.m_iHeight + ", widthRange = [" + supportedWidths.getLower() + ", " + supportedWidths.getUpper() + "], heightRange = [" + supportedHeights.getLower() + ", " + supportedHeights.getUpper() + "], bSupportSize = " + z);
        return z;
    }

    private boolean setupDecoder(String str) {
        boolean z = true;
        if (((Boolean) C85568t.m147473a().mo131557a("ve_mediacodec_resource_reasonable_distribute", (Object) false)).booleanValue() && !C30664c.m63021a(this.m_iWidth * this.m_iHeight * this.m_iFps, hashCode())) {
            C85315al.m146641c("TEMediaCodecDecoder", C85315al.m146634a("TEMediaCodecDecoder", "setupDecoder ERROR_HW_OVERLOAD", new C85315al.C85316a("MaxCodecBlocksSize is", Integer.valueOf(C30664c.m63020a()), ""), new C85315al.C85316a("UsedCodecBlocksSize is", Integer.valueOf(C30664c.m63023b()), "")));
            if (C30664c.f73336a) {
                C85315al.m146637a("TEMediaCodecDecoder", "guarantee HWEncoder strategy");
                return false;
            }
        }
        try {
            if (!m_useCreateDecoderByName) {
                this.m_decoder = MediaCodec.createDecoderByType(str);
            } else {
                String bestCodecName = getBestCodecName(str);
                this.m_decoder = MediaCodec.createByCodecName(bestCodecName);
                C85315al.m146637a("TEMediaCodecDecoder", "setupDecoder, codecName = ".concat(String.valueOf(bestCodecName)));
            }
            C85315al.m146637a("TEMediaCodecDecoder", "setupDecoder, m_useCreateDecoderByName = " + m_useCreateDecoderByName);
            Surface surface = this.m_surface;
            if (surface != null) {
                this.m_decoder.configure(this.m_format, surface, (MediaCrypto) null, 0);
            } else {
                this.m_decoder.configure(this.m_format, this.mImageReader.getSurface(), (MediaCrypto) null, 0);
            }
            this.m_decoder.start();
            this.m_decoderStarted = true;
            return true;
        } catch (Exception e) {
            C85315al.m146642d("TEMediaCodecDecoder", e.getMessage());
            if (e.getMessage() == null || !e.getMessage().contains("0xffffec77")) {
                z = false;
            }
            this.m_bHWOverload = z;
            e.printStackTrace();
            cleanupDecoder();
            return false;
        }
    }

    public String getBestCodecName(String str) {
        int i;
        MediaCodecInfo mediaCodecInfo;
        String[] supportedTypes;
        C30661a a;
        MethodCollector.m26663i(11732);
        int i2 = Build.VERSION.SDK_INT;
        if (TextUtils.isEmpty(str)) {
            MethodCollector.m26664o(11732);
            return null;
        } else if (!str.equals("video/hevc") || !mIsByteVC1Blocklist) {
            m63011xfc75084c("TEMediaCodecDecoder", "detect hardware codec by codecType = ".concat(String.valueOf(str)));
            ArrayList arrayList = new ArrayList();
            synchronized (mCodecListLock) {
                try {
                    boolean z = !mVideoHWDecoderCodecs.isEmpty();
                    if (z) {
                        try {
                            i = mVideoHWDecoderCodecs.size();
                        } catch (Exception unused) {
                            m63012xfc75085a("TEMediaCodecDecoder", "mediaserver died");
                            MethodCollector.m26664o(11732);
                            return null;
                        }
                    } else {
                        i = MediaCodecList.getCodecCount();
                    }
                    for (int i3 = 0; i3 < i && (!z || arrayList.isEmpty()); i3++) {
                        if (z) {
                            mediaCodecInfo = mVideoHWDecoderCodecs.get(i3);
                        } else {
                            mediaCodecInfo = MediaCodecList.getCodecInfoAt(i3);
                        }
                        String name = mediaCodecInfo.getName();
                        m63009xfc750847("TEMediaCodecDecoder", "found codec name : ".concat(String.valueOf(name)));
                        if (!mediaCodecInfo.isEncoder() && !name.startsWith("OMX.google") && !name.startsWith("c2.android") && (supportedTypes = mediaCodecInfo.getSupportedTypes()) != null) {
                            for (String str2 : supportedTypes) {
                                if (!TextUtils.isEmpty(str2)) {
                                    if (!z && str2.startsWith("video/")) {
                                        mVideoHWDecoderCodecs.add(mediaCodecInfo);
                                    }
                                    if (str2.equalsIgnoreCase(str)) {
                                        m63009xfc750847("TEMediaCodecDecoder", "codec types : ".concat(String.valueOf(str2)));
                                        if ((name.startsWith("OMX.") || name.startsWith("c2.")) && !name.startsWith("OMX.pv") && !name.startsWith("OMX.ittiam") && !name.contains("ffmpeg") && !name.contains("avcodec") && !name.contains("secure")) {
                                            if (name.startsWith("OMX.MTK.")) {
                                                int i4 = Build.VERSION.SDK_INT;
                                            }
                                            if (!codecNeedsFlushWorkaround(name) && (a = C30661a.m63019a(mediaCodecInfo, str)) != null) {
                                                m63011xfc75084c("TEMediaCodecDecoder", "codec : " + a.f73329a.getName() + ",  rank : " + a.f73330b);
                                                if (a.f73330b == 40 && Build.VERSION.SDK_INT < 21) {
                                                    m63012xfc75085a("TEMediaCodecDecoder", "skip vendor mediacodec api impl ambiguous");
                                                } else if (a.f73330b == 20) {
                                                    m63012xfc75085a("TEMediaCodecDecoder", "skip vendor software codec");
                                                } else {
                                                    arrayList.add(a);
                                                }
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
                    C30661a aVar = (C30661a) arrayList.get(0);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        C30661a aVar2 = (C30661a) it.next();
                        if (aVar2.f73330b > aVar.f73330b) {
                            aVar = aVar2;
                        }
                    }
                    String name2 = aVar.f73329a.getName();
                    MethodCollector.m26664o(11732);
                    return name2;
                } finally {
                    MethodCollector.m26664o(11732);
                }
            }
        } else {
            m63012xfc75085a("TEMediaCodecDecoder", "the device is hw decoder blocklist," + Build.HARDWARE);
            MethodCollector.m26664o(11732);
            return null;
        }
    }

    public int getInfoByFlag(long[] jArr, int i) {
        if (i == 1) {
            jArr[0] = this.m_timestampOfLastDecodedFrame;
        } else if (i == 2) {
            jArr[0] = this.m_timestampOfCurTexFrame;
        }
        return 0;
    }

    public static String getProperty(String str, String str2) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class, String.class).invoke(cls, str, str2);
        } catch (Exception e) {
            e.printStackTrace();
        } catch (Throwable unused) {
        }
        return str2;
    }

    public static boolean checkHDVideoCanFastImport(int i, int i2, int i3) {
        if (!((Boolean) C85568t.m147473a().mo131557a("ve_mediacodec_resource_reasonable_distribute", (Object) false)).booleanValue()) {
            return false;
        }
        return C30664c.m63022a(i, i2, i3);
    }

    public static Bitmap convertTexToBitmap(int i, int i2, int i3) {
        MethodCollector.m26663i(12442);
        ByteBuffer readTextureToByteBuffer = readTextureToByteBuffer(i, i2, i3);
        Bitmap createBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
        createBitmap.copyPixelsFromBuffer(readTextureToByteBuffer);
        MethodCollector.m26664o(12442);
        return createBitmap;
    }

    private static boolean isSupportFormat(String str, int i, int i2) {
        MediaCodecInfo mediaCodecInfo21 = getMediaCodecInfo21(str);
        if (mediaCodecInfo21 == null) {
            C85315al.m146642d("TEMediaCodecDecoder", "MediaCodecInfo is null!");
            return false;
        }
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr = mediaCodecInfo21.getCapabilitiesForType(str).profileLevels;
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
            if (codecProfileLevel.profile == i && codecProfileLevel.level >= i2) {
                return true;
            }
        }
        return false;
    }

    public static ByteBuffer readTextureToByteBuffer(int i, int i2, int i3) {
        int[] iArr = new int[1];
        int[] iArr2 = new int[1];
        GLES20.glGetIntegerv(36006, iArr2, 0);
        GLES20.glGenFramebuffers(1, iArr, 0);
        GLES20.glBindFramebuffer(36160, iArr[0]);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i, 0);
        ByteBuffer allocate = ByteBuffer.allocate(i2 * i3 * 4);
        GLES20.glReadPixels(0, 0, i2, i3, 6408, 5121, allocate);
        GLES20.glFinish();
        GLES20.glBindFramebuffer(36160, iArr2[0]);
        GLES20.glDeleteFramebuffers(1, iArr, 0);
        return allocate;
    }

    public static boolean saveFrameToFile(int i, int i2, int i3) {
        MethodCollector.m26663i(12446);
        Bitmap convertTexToBitmap = convertTexToBitmap(i, i2, i3);
        file_count++;
        File file = new File("sdcard/dump/" + file_count + ".jpg");
        if (file.exists()) {
            m63013xfa2a26c6(file);
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            convertTexToBitmap.compress(Bitmap.CompressFormat.JPEG, 20, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            if (!convertTexToBitmap.isRecycled()) {
                convertTexToBitmap.recycle();
            }
            MethodCollector.m26664o(12446);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            if (!convertTexToBitmap.isRecycled()) {
                convertTexToBitmap.recycle();
            }
            MethodCollector.m26664o(12446);
            return false;
        } catch (Throwable th) {
            if (!convertTexToBitmap.isRecycled()) {
                convertTexToBitmap.recycle();
            }
            MethodCollector.m26664o(12446);
            throw th;
        }
    }

    public int decodeFrameWithoutDraw(byte[] bArr, int i, long j) {
        int i2 = -2;
        if (this.m_decoder == null) {
            return -2;
        }
        if (((Boolean) C85568t.m147473a().mo131557a("ve_mediacodec_resource_reasonable_distribute", (Object) false)).booleanValue() && !C30664c.m63021a(this.m_iWidth * this.m_iHeight * this.m_iFps, hashCode())) {
            C85315al.m146639b("TEMediaCodecDecoder", C85315al.m146634a("TEMediaCodecDecoder", "decodeFrameWithoutDraw ERROR_HW_OVERLOAD", new C85315al.C85316a("MaxCodecBlocksSize is", Integer.valueOf(C30664c.m63020a()), ""), new C85315al.C85316a("UsedCodecBlocksSize is", Integer.valueOf(C30664c.m63023b()), "")));
        }
        try {
            i2 = decodeFrameWithInputOutput(bArr, i, j);
            return i2;
        } catch (IllegalStateException e) {
            e.printStackTrace();
            return i2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0063, code lost:
        if (r0 >= 0) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0065, code lost:
        r10 = getInputBufferByIdx(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0069, code lost:
        if (r22 != 0) goto L_0x0166;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006b, code lost:
        r20.m_decoder.queueInputBuffer(r0, 0, 0, 0, 4);
        r20.m_sawInputEOS = true;
        com.p2082ss.android.vesdk.C85315al.m146639b("TEMediaCodecDecoder", "RenderInput EOS");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0166, code lost:
        r10.clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x016d, code lost:
        if (r10.capacity() >= r22) goto L_0x01b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x016f, code lost:
        com.p2082ss.android.vesdk.C85315al.m146642d("TEMediaCodecDecoder", "inputBuf.capacity(): " + r10.capacity() + " < inputSize: " + r22 + ", m_pendingInputFrameCount" + r20.m_pendingInputFrameCount + ", width * height: " + r20.m_iWidth + "*" + r20.m_iHeight);
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(12047);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x01b6, code lost:
        return -2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x01b7, code lost:
        r10.put(r21, 0, r22);
        r20.m_decoder.queueInputBuffer(r0, 0, r22, r23, 0);
        r20.m_inputBufferQueued = true;
        r20.m_pendingInputFrameCount++;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int decodeFrame2Surface(byte[] r21, int r22, long r23) {
        /*
        // Method dump skipped, instructions count: 738
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ttve.mediacodec.TEMediaCodecDecoder.decodeFrame2Surface(byte[], int, long):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0063, code lost:
        if (r1 >= 0) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0065, code lost:
        r9 = getInputBufferByIdx(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0069, code lost:
        if (r23 != 0) goto L_0x0166;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006b, code lost:
        r21.m_decoder.queueInputBuffer(r1, 0, 0, 0, 4);
        r21.m_sawInputEOS = true;
        com.p2082ss.android.vesdk.C85315al.m146637a("TEMediaCodecDecoder", "RenderInput EOS");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0166, code lost:
        r9.clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x016f, code lost:
        if (r9.capacity() >= r23) goto L_0x01bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0171, code lost:
        com.p2082ss.android.vesdk.C85315al.m146642d("TEMediaCodecDecoder", "inputBuf.capacity(): " + r9.capacity() + " < inputSize: " + r23 + ", m_pendingInputFrameCount" + r21.m_pendingInputFrameCount + ", width * height: " + r21.m_iWidth + "*" + r21.m_iHeight);
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(12326);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x01ba, code lost:
        return -2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x01bb, code lost:
        r9.put(r22, 0, r23);
        r5 = 1;
        r21.m_decoder.queueInputBuffer(r1, 0, r23, r24, 0);
        r21.m_inputBufferQueued = true;
        r21.m_pendingInputFrameCount++;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01f2  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0207  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0154 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int decodeFrameWithInputOutput(byte[] r22, int r23, long r24) {
        /*
        // Method dump skipped, instructions count: 681
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ttve.mediacodec.TEMediaCodecDecoder.decodeFrameWithInputOutput(byte[], int, long):int");
    }

    public void updateAndRenderOES(int i, int i2, int i3, int i4) {
        this.m_iOutputWidth = i2;
        this.m_iOutputHeight = i3;
        this.m_iRotateDegree = i4;
        if (!this.m_bUseImageReader && this.m_eglStateSaver == null) {
            C30642c cVar = new C30642c();
            this.m_eglStateSaver = cVar;
            cVar.mo54932a();
        }
        if (!this.m_bUseImageReader && !EGL14.eglGetCurrentContext().equals(this.m_eglStateSaver.f73248a)) {
            C85315al.m146641c("TEMediaCodecDecoder", "eglGetCurrentContext = " + EGL14.eglGetCurrentContext() + " getSavedEGLContext = " + this.m_eglStateSaver.f73248a);
        }
        if (!this.m_sawOutputEOS) {
            C85315al.m146639b("TEMediaCodecDecoder", "Rendering decoded frame to surface texture.");
            if (this.m_awaitNewImageSuccess) {
                this.m_timestampOfCurTexFrame = this.m_bufferInfo.presentationTimeUs;
                if (this.m_bReEnableOpt) {
                    this.m_ReEncodeOptCV.block();
                }
                SurfaceTexture surfaceTexture = this.m_surfaceTexture;
                if (surfaceTexture != null) {
                    surfaceTexture.updateTexImage();
                }
                if (this.m_bReEnableOpt) {
                    this.m_ReEncodeOptCV.close();
                    this.m_awaitNewImageSuccess = false;
                    return;
                }
                C30659a aVar = this.m_textureRender;
                if (aVar != null && i > 0) {
                    aVar.mo54991a(this.m_iWidth, this.m_iHeight, this.m_iOutputWidth, this.m_iOutputHeight, this.m_surfaceTexID[0], i, this.m_iRotateDegree);
                }
                if (this.m_bUseImageReader) {
                    onImageFrameAvailable();
                }
                this.m_awaitNewImageSuccess = false;
                return;
            }
            C85315al.m146642d("TEMediaCodecDecoder", "Render OES to 2D texture failed: m_awaitNewImageSuccess is false!");
            return;
        }
        C85315al.m146639b("TEMediaCodecDecoder", "Render OES to 2D texture failed: m_sawOutputEOS");
    }

    public int decodeFrame(byte[] bArr, int i, long j, int i2, int i3, int i4, int i5) {
        this.m_iOutputWidth = i3;
        this.m_iOutputHeight = i4;
        this.m_iRotateDegree = i5;
        if (!this.m_bUseImageReader && this.m_eglStateSaver == null) {
            C30642c cVar = new C30642c();
            this.m_eglStateSaver = cVar;
            cVar.mo54932a();
        }
        if (!this.m_bUseImageReader && !EGL14.eglGetCurrentContext().equals(this.m_eglStateSaver.f73248a)) {
            m63010xfc750848("TEMediaCodecDecoder", "eglGetCurrentContext = " + EGL14.eglGetCurrentContext() + " getSavedEGLContext = " + this.m_eglStateSaver.f73248a);
            this.m_bNeedConfigure = true;
        }
        if (this.m_bNeedConfigure) {
            restartDecoder();
            this.m_bNeedConfigure = false;
            if (!this.m_bUseImageReader) {
                this.m_eglStateSaver.mo54932a();
            }
        }
        int i6 = -2;
        if (this.m_decoder == null) {
            return -2;
        }
        if (((Boolean) C85568t.m147473a().mo131557a("ve_mediacodec_resource_reasonable_distribute", (Object) false)).booleanValue() && !C30664c.m63021a(this.m_iWidth * this.m_iHeight * this.m_iFps, hashCode())) {
            C85315al.m146639b("TEMediaCodecDecoder", C85315al.m146634a("TEMediaCodecDecoder", "decodeFrame ERROR_HW_OVERLOAD", new C85315al.C85316a("MaxCodecBlocksSize is", Integer.valueOf(C30664c.m63020a()), ""), new C85315al.C85316a("UsedCodecBlocksSize is", Integer.valueOf(C30664c.m63023b()), "")));
        }
        try {
            i6 = decodeFrame2Surface(bArr, i, j);
            if (i6 == 0) {
                if (this.m_bReEnableOpt) {
                    this.m_ReEncodeOptCV.block();
                }
                SurfaceTexture surfaceTexture = this.m_surfaceTexture;
                if (surfaceTexture != null) {
                    surfaceTexture.updateTexImage();
                }
                if (this.m_bReEnableOpt) {
                    this.m_ReEncodeOptCV.close();
                    return i6;
                }
                C30659a aVar = this.m_textureRender;
                if (aVar != null && i2 > 0) {
                    aVar.mo54991a(this.m_iWidth, this.m_iHeight, this.m_iOutputWidth, this.m_iOutputHeight, this.m_surfaceTexID[0], i2, this.m_iRotateDegree);
                }
                if (this.m_bUseImageReader) {
                    onImageFrameAvailable();
                }
            }
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
        return i6;
    }

    public int setDecoderParams(int i, int i2, int i3, byte[] bArr, int i4, int i5, int i6, int i7) {
        this.m_iWidth = i;
        this.m_iHeight = i2;
        this.m_iFps = i3;
        this.m_iOutputWidth = i5;
        this.m_iOutputHeight = i6;
        this.m_codecSpecificData = null;
        this.m_iCodecID = i7;
        if (i7 == 2) {
            this.VIDEO_MIME_TYPE = "video/mpeg2";
        } else if (i7 == 13) {
            this.VIDEO_MIME_TYPE = "video/mp4v-es";
        } else if (i7 == 28) {
            this.VIDEO_MIME_TYPE = "video/avc";
            this.mMinCompressionRatio = 2;
        } else if (i7 == 140) {
            this.VIDEO_MIME_TYPE = "video/x-vnd.on2.vp8";
        } else if (i7 == 168) {
            this.VIDEO_MIME_TYPE = "video/x-vnd.on2.vp9";
        } else if (i7 == 174) {
            this.VIDEO_MIME_TYPE = "video/hevc";
            this.mMinCompressionRatio = 4;
        }
        if (i4 > 0) {
            this.m_codecSpecificData = ByteBuffer.wrap(bArr, 0, i4);
        }
        this.m_bNeedConfigure = true;
        return 0;
    }

    public int initDecoder(long j, int i, int i2, int i3, byte[] bArr, int i4, int i5, int i6, int i7, boolean z, boolean z2) {
        this.m_nativeHandler = j;
        this.m_bUseImageReader = z2;
        if (Build.VERSION.SDK_INT < 21) {
            C85315al.m146641c("TEMediaCodecDecoder", "VERSION less then 21, disable HWDecoder");
            return -1;
        }
        m_useCreateDecoderByName = z;
        if (174 == i7 && (isHisiByteVC1BlockList() || isMtkByteVC1BlockList())) {
            mIsByteVC1Blocklist = true;
        }
        int decoderParams = setDecoderParams(i, i2, i3, bArr, i4, i5, i6, i7);
        if (this.m_bNeedConfigure) {
            decoderParams = configureMediaFormat();
        }
        if (decoderParams != 0) {
            return decoderParams;
        }
        if (this.m_eglStateSaver == null && !this.m_bUseImageReader) {
            C30642c cVar = new C30642c();
            this.m_eglStateSaver = cVar;
            cVar.mo54932a();
        }
        if (this.m_bNeedConfigure && (decoderParams = restartDecoder()) == 0) {
            this.m_bNeedConfigure = false;
        }
        C85315al.m146641c("TEMediaCodecDecoder", "TEMediaCodecDecoder initDecoder width =" + i + " height = " + i2 + " ret=" + decoderParams);
        return decoderParams;
    }
}
