package com.p2082ss.android.ttve.mediacodec;

import android.graphics.Bitmap;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.os.Build;
import android.os.Bundle;
import android.view.Surface;
import androidx.core.p030b.C0622a;
import com.C1764a;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ttve.common.C30642c;
import com.p2082ss.android.ttve.common.C30643d;
import com.p2082ss.android.ttve.common.C30645e;
import com.p2082ss.android.ttve.common.C30649h;
import com.p2082ss.android.ttve.common.C30650i;
import com.p2082ss.android.ttve.monitor.C30695h;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import com.p2082ss.android.vesdk.C85315al;
import com.p2082ss.android.vesdk.C85376ax;
import com.p2082ss.android.vesdk.C85568t;
import com.p2082ss.android.vesdk.runtime.VERuntime;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/* renamed from: com.ss.android.ttve.mediacodec.TEAvcEncoder */
public class TEAvcEncoder {
    private static int CODEC_TYPE_AVC = 0;
    private static int CODEC_TYPE_BYTEVC1 = 1;
    private static boolean DEBUG = false;
    private static int ENCODE_RESOLUTION_ALIGN = 16;
    private static int MAX_FRAME_RATE = LiveNetAdaptiveHurryTimeSetting.DEFAULT;
    private static long MAX_PRODUCT_OF_SIZE_AND_FPS = -1;
    private static int MIN_FRAME_RATE = 7;
    private static final String TAG = TEAvcEncoder.class.getSimpleName();
    private static int avcqueuesize = 25;
    private static int file_count = 0;
    public ArrayBlockingQueue<C30657a> AVCQueue = new ArrayBlockingQueue<>(avcqueuesize);
    private final int ENCODE_COUNT_DEFAULT = 10;
    private String VIDEO_MIME_TYPE = "video/avc";
    public byte[] configByte = null;
    private int configWaitingFrameCounter = 0;
    private boolean isEnableHwEncoderOpt = false;
    private int mBufferIndex = -1;
    public ByteBuffer mByteBuf = null;
    int mEncodeBufferCount = 10;
    private boolean mEndOfStream = false;
    private boolean mFirstFrame = true;
    private long mFirstFrameTimestamp = Long.MIN_VALUE;
    private TEMediaCodecDecoder m_MediaCodecDecInstance = null;
    private Queue<Long> m_PTSQueue = new LinkedList();
    private double m_TransitionKeyframeRatio = 1.0d;
    private boolean m_bByteVC110BitHWDecoder = false;
    private int m_bColorRangeFull = 0;
    private boolean m_bEncodeOESTexture = false;
    private boolean m_bEncoderBanExtraDataLoop = false;
    private boolean m_bEncoderGLContextReuse = false;
    private boolean m_bNeedSingalEnd = false;
    private boolean m_bSignalEndOfStream = false;
    private boolean m_bSuccessInit = false;
    private int m_bitRate = 0;
    private MediaFormat m_codecFormat = null;
    private int m_codec_type = 0;
    private int m_colorFormat = 0;
    private int m_colorTrc = 0;
    private int m_colorspace = 0;
    private int m_configStatus = 0;
    private double m_dHpBitrateRatio = 0.75d;
    private C30642c m_eglStateSaver;
    private long m_encodeStartTime = -1;
    private int m_frameRate = 0;
    private long m_getnerateIndex = 0;
    private int m_height = 0;
    private int m_height_align = 0;
    private int m_iFrameInternal = 0;
    private boolean m_isNeedReconfigure = false;
    private C30657a m_lastCodecData = null;
    private int m_level = 0;
    private int m_maxBitRate = 0;
    private MediaCodec m_mediaCodec = null;
    private String m_mime_type = this.VIDEO_MIME_TYPE;
    private int m_profile = 0;
    private C30645e m_sharedContext;
    private Surface m_surface = null;
    private C30649h m_textureDrawer;
    private C30650i m_textureOESDrawer = null;
    private boolean m_useInputSurface = true;
    private int m_width = 0;
    private int m_width_align = 0;
    private byte[] pps;
    private byte[] sps;

    /* renamed from: com.ss.android.ttve.mediacodec.TEAvcEncoder$a */
    public static class C30657a {

        /* renamed from: a */
        public byte[] f73302a;

        /* renamed from: b */
        public long f73303b;

        /* renamed from: c */
        public long f73304c;

        /* renamed from: d */
        public int f73305d;

        static {
            Covode.recordClassIndex(37209);
        }
    }

    /* renamed from: com.ss.android.ttve.mediacodec.TEAvcEncoder$b */
    public static class C30658b {

        /* renamed from: a */
        public long f73306a;

        static {
            Covode.recordClassIndex(37210);
        }
    }

    public Surface getInputSurface() {
        return this.m_surface;
    }

    public static TEAvcEncoder createEncoderObject() {
        return new TEAvcEncoder();
    }

    public byte[] getExtraData() {
        byte[] bArr = this.configByte;
        if (bArr != null) {
            return bArr;
        }
        return new byte[0];
    }

    public void setSharedEGLContext() {
        if (this.m_eglStateSaver == null) {
            C30642c cVar = new C30642c();
            this.m_eglStateSaver = cVar;
            cVar.mo54932a();
        }
    }

    public void releaseTextureDrawer() {
        if (this.m_bEncodeOESTexture) {
            C30650i iVar = this.m_textureOESDrawer;
            if (iVar != null) {
                iVar.mo54950a();
                this.m_textureOESDrawer = null;
                return;
            }
            return;
        }
        C30649h hVar = this.m_textureDrawer;
        if (hVar != null) {
            hVar.mo54948b();
            this.m_textureDrawer = null;
        }
    }

    static {
        Covode.recordClassIndex(37208);
    }

    private int forceToPrepareKeyFrame() {
        this.m_mediaCodec.signalEndOfInputStream();
        int i = 30;
        while (!this.mEndOfStream) {
            int drainOutputBuffer = drainOutputBuffer(10000);
            if (drainOutputBuffer == 0) {
                if (this.mBufferIndex < 0) {
                    i--;
                    if (i <= 0) {
                        break;
                    }
                } else {
                    break;
                }
            } else {
                C85315al.m146642d(TAG, "forceToPrepareKeyFrame failed ret: ".concat(String.valueOf(drainOutputBuffer)));
                return drainOutputBuffer;
            }
        }
        restartEncoder();
        return 0;
    }

    public ByteBuffer getFrameCacheBuf() {
        if (this.mByteBuf == null) {
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(this.m_width * this.m_height * 4);
            this.mByteBuf = allocateDirect;
            allocateDirect.order(ByteOrder.nativeOrder());
        }
        this.mByteBuf.position(0);
        return this.mByteBuf;
    }

    public int restartEncoder() {
        C85315al.m146637a(TAG, "restartEncoder...");
        this.m_bNeedSingalEnd = false;
        stopEncoder();
        int configEncode = configEncode();
        if (configEncode >= 0) {
            return startEncoder();
        }
        if (((Boolean) C85568t.m147473a().mo131557a("ve_mediacodec_resource_reasonable_distribute", (Object) false)).booleanValue()) {
            C30664c.m63024b(this.m_width_align * this.m_height_align * this.m_frameRate, hashCode());
        }
        return configEncode;
    }

    public void stopEncoder() {
        try {
            this.m_bByteVC110BitHWDecoder = false;
            C30645e eVar = this.m_sharedContext;
            if (eVar != null) {
                eVar.mo54941b();
            }
            C30649h hVar = this.m_textureDrawer;
            if (hVar != null) {
                hVar.mo54948b();
                this.m_textureDrawer = null;
            }
            C30650i iVar = this.m_textureOESDrawer;
            if (iVar != null) {
                iVar.mo54950a();
                this.m_textureOESDrawer = null;
            }
            MediaCodec mediaCodec = this.m_mediaCodec;
            if (mediaCodec != null) {
                mediaCodec.stop();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean initTextureDrawer() {
        C30650i iVar = null;
        if (this.m_bEncodeOESTexture) {
            C30650i iVar2 = new C30650i();
            iVar2.f73281e = C30650i.m62995a(C30650i.f73277a);
            iVar2.f73282f = C30650i.m62995a(C30650i.f73278b);
            iVar2.f73279c = new C30643d();
            if (!iVar2.f73279c.mo54936a("attribute vec4 aPosition;\nattribute vec2 aTextureCoord;\nuniform mat4 uMVPMatrix;\nvarying vec2 vTextureCoord;\nvoid main()\n{\n   gl_Position = uMVPMatrix * aPosition;\n   vTextureCoord = aTextureCoord;\n}", "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nuniform samplerExternalOES uTextureSampler;\nvarying vec2 vTextureCoord;\nvoid main() \n{\n  gl_FragColor = texture2D(uTextureSampler, vTextureCoord);\n}")) {
                iVar2.f73279c.mo54934a();
                iVar2.f73279c = null;
                C85315al.m146642d("TETextureOESDrawer", "TETextureOESDrawer create failed!");
                iVar2.mo54950a();
            } else {
                GLES20.glUseProgram(iVar2.f73279c.f73252a);
                iVar2.f73283g = iVar2.f73279c.mo54933a("uMVPMatrix");
                iVar2.f73280d = new int[2];
                GLES20.glGenBuffers(2, iVar2.f73280d, 0);
                iVar2.f73279c.mo54935a("aPosition", 0);
                GLES20.glBindBuffer(34962, iVar2.f73280d[0]);
                iVar2.f73281e.position(0);
                GLES20.glBufferData(34962, 32, iVar2.f73281e, 35044);
                iVar2.f73279c.mo54935a("aTextureCoord", 1);
                GLES20.glBindBuffer(34962, iVar2.f73280d[1]);
                iVar2.f73282f.position(0);
                GLES20.glBufferData(34962, 32, iVar2.f73282f, 35048);
                iVar2.mo54952a(0, false, 0, 0, 0, 0);
                C85315al.m146637a("TETextureOESDrawer", "init: success.");
                iVar = iVar2;
            }
            this.m_textureOESDrawer = iVar;
            if (iVar == null) {
                return false;
            }
            return true;
        }
        C30649h hVar = this.m_textureDrawer;
        if (hVar != null) {
            hVar.mo54948b();
            this.m_textureDrawer = null;
        }
        C30649h a = C30649h.m62990a();
        this.m_textureDrawer = a;
        if (a == null) {
            return false;
        }
        a.mo54949c();
        this.m_textureDrawer.mo54946a(-1.0f);
        return true;
    }

    public void releaseEncoder() {
        long j;
        boolean z;
        if (this.configByte == null) {
            j = 1;
        } else {
            j = 0;
        }
        C30695h.m63062a(0, "te_record_is_stop_before_extra_data", j);
        String str = TAG;
        StringBuilder sb = new StringBuilder("TE_RECORD_IS_STOP_BEFORE_EXTRA_DATA: ");
        if (this.configByte == null) {
            z = true;
        } else {
            z = false;
        }
        C85315al.m146637a(str, sb.append(z).toString());
        stopEncoder();
        C85315al.m146637a("TEAvcEncoder", "releaseEncoder");
        C30645e eVar = this.m_sharedContext;
        if (eVar != null) {
            if (!this.m_bEncoderGLContextReuse) {
                eVar.mo54938a();
            } else if (!(eVar.f73264g == null || eVar.f73265h == null)) {
                EGL14.eglDestroySurface(eVar.f73264g, eVar.f73265h);
            }
            this.m_sharedContext = null;
        }
        if (this.m_surface != null) {
            C85315al.m146639b("TEAvcEncoder", "release surface");
            this.m_surface.release();
            this.m_surface = null;
        }
        if (this.m_mediaCodec != null) {
            C85315al.m146639b("TEAvcEncoder", "release mediaCodec");
            this.m_mediaCodec.release();
            this.m_mediaCodec = null;
            if (((Boolean) C85568t.m147473a().mo131557a("ve_mediacodec_resource_reasonable_distribute", (Object) false)).booleanValue()) {
                C30664c.m63024b(this.m_width_align * this.m_height_align * this.m_frameRate, hashCode());
            }
        }
    }

    private int configEncode() {
        try {
            Surface surface = this.m_surface;
            if (surface != null) {
                surface.release();
                this.m_surface = null;
            }
            MediaCodec mediaCodec = this.m_mediaCodec;
            if (mediaCodec != null) {
                mediaCodec.release();
            }
            if (((Boolean) C85568t.m147473a().mo131557a("ve_mediacodec_resource_reasonable_distribute", (Object) false)).booleanValue()) {
                C30664c.f73336a = true;
                if (!C30664c.m63021a(this.m_width_align * this.m_height_align * this.m_frameRate, hashCode())) {
                    C85315al.m146641c(TAG, "ERROR_HW_OVERLOAD, MaxCodecBlocksSize is: " + C30664c.m63020a() + ", UsedCodecBlocksSize is: " + C30664c.m63023b());
                    return -1;
                }
            }
            MediaCodec createEncoderByType = MediaCodec.createEncoderByType(this.m_mime_type);
            this.m_mediaCodec = createEncoderByType;
            MediaCodecInfo codecInfo = createEncoderByType.getCodecInfo();
            String[] supportedTypes = codecInfo.getSupportedTypes();
            String str = TAG;
            C85315al.m146639b(str, "configEncode supports " + Arrays.toString(supportedTypes));
            C85315al.m146637a(str, "configEncode caps " + Arrays.toString(codecInfo.getCapabilitiesForType(supportedTypes[0]).colorFormats));
            if (codecInfo.getName().startsWith("OMX.google.")) {
                C85315al.m146641c(str, C85315al.m146634a(str, "TEAvcEncoder mediaCodecInfo Name() startsWith OMX.google.", new C85315al.C85316a[0]));
                return -2;
            } else if (reconfigureMediaFormat(codecInfo) != 0) {
                C85315al.m146641c(str, C85315al.m146634a(str, "TEAvcEncoder reconfigureMediaFormat failed", new C85315al.C85316a[0]));
                return -3;
            } else {
                this.m_mediaCodec.configure(this.m_codecFormat, (Surface) null, (MediaCrypto) null, 1);
                if (this.m_useInputSurface) {
                    C85315al.m146642d(str, "m_mediaCodec.createInputSurface()");
                    this.m_surface = this.m_mediaCodec.createInputSurface();
                }
                return 0;
            }
        } catch (Exception e) {
            e.printStackTrace();
            String str2 = TAG;
            C85315al.m146641c(str2, C85315al.m146634a(str2, "TEAvcEncoder configEncode Exception", new C85315al.C85316a[0]));
            return -4;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x01e9 A[Catch:{ Exception -> 0x0208 }, RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int startEncoder() {
        /*
        // Method dump skipped, instructions count: 526
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ttve.mediacodec.TEAvcEncoder.startEncoder():int");
    }

    private void setByteVC110BitHWDecoderFlag(boolean z) {
        this.m_bByteVC110BitHWDecoder = z;
    }

    public static void setEncodeResolutionAlign(int i) {
        if (Build.VERSION.SDK_INT >= 24) {
            ENCODE_RESOLUTION_ALIGN = i;
        }
    }

    private void setMediaCodecDecInstance(Object obj) {
        TEMediaCodecDecoder tEMediaCodecDecoder = (TEMediaCodecDecoder) obj;
        this.m_MediaCodecDecInstance = tEMediaCodecDecoder;
        if (tEMediaCodecDecoder == null) {
            C85315al.m146642d(TAG, "m_MediaCodecDecInstance is null");
        }
    }

    private void setProcessFlag(int i) {
        boolean z = true;
        if ((i & 1) == 0) {
            z = false;
        }
        this.m_bEncodeOESTexture = z;
    }

    public byte[] getCodecData(int i) {
        C30657a aVar = this.m_lastCodecData;
        if (aVar != null) {
            return aVar.f73302a;
        }
        return null;
    }

    private ByteBuffer getInputBufferByIdx(int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            return this.m_mediaCodec.getInputBuffer(i);
        }
        return this.m_mediaCodec.getInputBuffers()[i];
    }

    private ByteBuffer getOutputBufferByIdx(int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            return this.m_mediaCodec.getOutputBuffer(i);
        }
        return this.m_mediaCodec.getOutputBuffers()[i];
    }

    public static void setEncodeParams(C30658b bVar) {
        C85315al.m146637a(TAG, "setEncodeParams " + bVar.f73306a);
        MAX_PRODUCT_OF_SIZE_AND_FPS = bVar.f73306a;
    }

    /* renamed from: com_ss_android_ttve_mediacodec_TEAvcEncoder_com_ss_android_ugc_aweme_storage_FileLancet_delete */
    public static boolean m63008x855f720c(File file) {
        MethodCollector.m26663i(14370);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(14370);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(14370);
        return delete;
    }

    private void setBitRateMode(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        if (Build.VERSION.SDK_INT >= 21) {
            String[] strArr = {"BITRATE_MODE_CQ", "BITRATE_MODE_VBR", "BITRATE_MODE_CBR"};
            MediaCodecInfo.EncoderCapabilities encoderCapabilities = codecCapabilities.getEncoderCapabilities();
            int i = 0;
            do {
                C85315al.m146639b(TAG, strArr[i] + ": " + encoderCapabilities.isBitrateModeSupported(i));
                i++;
            } while (i < 3);
            this.m_codecFormat.setInteger("bitrate-mode", 1);
        }
    }

    private int drainOutputBuffer(long j) {
        int i;
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        String str = TAG;
        C85315al.m146639b(str, "drainOutputBuffer before dequeueOutputBuffer");
        this.mBufferIndex = -1;
        try {
            int dequeueOutputBuffer = this.m_mediaCodec.dequeueOutputBuffer(bufferInfo, j);
            this.mBufferIndex = dequeueOutputBuffer;
            if (this.configByte == null && dequeueOutputBuffer == -1) {
                C85315al.m146641c(str, "configByte = null and mBufferIndex = MediaCodec.INFO_TRY_AGAIN_LATER, timeoutUs: ".concat(String.valueOf(j)));
            }
            C85315al.m146639b(str, "drainOutputBuffer mBufferIndex " + this.mBufferIndex + " buffer-flag= " + bufferInfo.flags);
            while (true) {
                int i2 = this.mBufferIndex;
                if (i2 < 0) {
                    break;
                }
                ByteBuffer outputBufferByIdx = getOutputBufferByIdx(i2);
                int i3 = bufferInfo.size;
                byte[] bArr = new byte[i3];
                outputBufferByIdx.position(bufferInfo.offset);
                outputBufferByIdx.limit(bufferInfo.offset + bufferInfo.size);
                outputBufferByIdx.get(bArr);
                if (bufferInfo.flags == 2) {
                    this.configByte = bArr;
                } else if (bufferInfo.flags == 1) {
                    byte[] bArr2 = this.configByte;
                    if (bArr2 == null) {
                        C85315al.m146642d(TAG, "I can't find configByte!!!! NEED extract from I frame!!!");
                    } else if (bArr[4] == bArr2[4] && (bArr[bArr2.length + 4] & 31) == 5) {
                        int length = i3 - bArr2.length;
                        byte[] bArr3 = new byte[length];
                        System.arraycopy(bArr, bArr2.length, bArr3, 0, length);
                        bArr = bArr3;
                    }
                    addOutputData(bArr, bufferInfo);
                } else if (bufferInfo.flags == 4) {
                    this.mEndOfStream = true;
                    C85315al.m146637a(TAG, "bufferInfo.flags contain BUFFER_FLAG_END_OF_STREAM");
                    break;
                } else {
                    addOutputData(bArr, bufferInfo);
                }
                try {
                    this.m_mediaCodec.releaseOutputBuffer(this.mBufferIndex, false);
                    this.mBufferIndex = this.m_mediaCodec.dequeueOutputBuffer(bufferInfo, j);
                } catch (Exception e) {
                    StringWriter stringWriter = new StringWriter();
                    e.printStackTrace(new PrintWriter(stringWriter));
                    String str2 = TAG;
                    C85315al.m146642d(str2, C85315al.m146634a(str2, "drainOutputBuffer exception:" + stringWriter.toString(), new C85315al.C85316a[0]));
                    return -214;
                }
            }
            if (this.mBufferIndex == -2) {
                MediaFormat outputFormat = this.m_mediaCodec.getOutputFormat();
                ByteBuffer byteBuffer = outputFormat.getByteBuffer("csd-0");
                ByteBuffer byteBuffer2 = outputFormat.getByteBuffer("csd-1");
                if (byteBuffer != null) {
                    byte[] bArr4 = (byte[]) byteBuffer.array().clone();
                    this.sps = bArr4;
                    i = bArr4.length + 0;
                } else {
                    i = 0;
                }
                if (byteBuffer2 != null) {
                    byte[] bArr5 = (byte[]) byteBuffer2.array().clone();
                    this.pps = bArr5;
                    i += bArr5.length;
                }
                byte[] bArr6 = new byte[i];
                this.configByte = bArr6;
                if (byteBuffer != null) {
                    byte[] bArr7 = this.sps;
                    System.arraycopy(bArr7, 0, bArr6, 0, bArr7.length);
                }
                if (byteBuffer2 != null) {
                    byte[] bArr8 = this.pps;
                    System.arraycopy(bArr8, 0, this.configByte, this.sps.length, bArr8.length);
                }
            }
            return 0;
        } catch (Exception e2) {
            StringWriter stringWriter2 = new StringWriter();
            e2.printStackTrace(new PrintWriter(stringWriter2));
            String str3 = TAG;
            C85315al.m146642d(str3, C85315al.m146634a(str3, "drainOutputBuffer exception:" + stringWriter2.toString(), new C85315al.C85316a[0]));
            return -214;
        }
    }

    private int reconfigureMediaFormat(MediaCodecInfo mediaCodecInfo) {
        String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
        C85315al.m146639b(TAG, "CodecNames:");
        for (String str : supportedTypes) {
            C85315al.m146639b(TAG, "Codec: ".concat(String.valueOf(str)));
        }
        MediaFormat createVideoFormat = MediaFormat.createVideoFormat(this.m_mime_type, this.m_width_align, this.m_height_align);
        this.m_codecFormat = createVideoFormat;
        createVideoFormat.setInteger("color-format", this.m_colorFormat);
        this.m_codecFormat.setInteger("bitrate", this.m_bitRate);
        int i = this.m_frameRate;
        long j = MAX_PRODUCT_OF_SIZE_AND_FPS;
        if (j > 0) {
            long j2 = j / ((long) (this.m_width_align * this.m_height_align));
            if (((long) i) > j2) {
                i = (int) j2;
            }
        }
        this.m_codecFormat.setInteger("frame-rate", i);
        this.m_codecFormat.setInteger("i-frame-interval", this.m_iFrameInternal);
        String str2 = TAG;
        C85315al.m146641c(str2, " m_colorspace " + this.m_colorspace + " m_bColorRangeFull " + this.m_bColorRangeFull + " m_colorTrc " + this.m_colorTrc);
        C85568t.C85573d a = C85568t.m147473a().mo131556a("ve_color_space_for_2020");
        if ((a != null && a.f191742b != null && (a.f191742b instanceof Boolean) && ((Boolean) a.f191742b).booleanValue()) || !this.m_useInputSurface) {
            this.m_codecFormat.setInteger("color-standard", this.m_colorspace);
            this.m_codecFormat.setInteger("color-range", this.m_bColorRangeFull);
            this.m_codecFormat.setInteger("color-transfer", this.m_colorTrc);
        }
        setProfile(mediaCodecInfo.getCapabilitiesForType(this.m_mime_type));
        C85315al.m146641c(str2, C1764a.m5928a("width:[%d] height:[%d] frameRate:[%d] iFrameInternal:[%d] bitRate:[%d] colorFormat:[%d] codec_type:[%d]", new Object[]{Integer.valueOf(this.m_width_align), Integer.valueOf(this.m_height_align), Integer.valueOf(this.m_frameRate), Integer.valueOf(this.m_iFrameInternal), Integer.valueOf(this.m_bitRate), Integer.valueOf(this.m_colorFormat), Integer.valueOf(this.m_codec_type)}));
        return 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x015d A[ADDED_TO_REGION, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void setProfile(android.media.MediaCodecInfo.CodecCapabilities r20) {
        /*
        // Method dump skipped, instructions count: 434
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ttve.mediacodec.TEAvcEncoder.setProfile(android.media.MediaCodecInfo$CodecCapabilities):void");
    }

    public int getInfoByFlag(long[] jArr, int i) {
        if (i != 1) {
            return -1;
        }
        jArr[0] = this.m_lastCodecData.f73303b;
        jArr[1] = this.m_lastCodecData.f73304c;
        return 4;
    }

    private void addOutputData(byte[] bArr, MediaCodec.BufferInfo bufferInfo) {
        long j;
        String str = TAG;
        C85315al.m146639b(str, "encode: pts queue size = " + this.m_PTSQueue.size() + " avc sdata size= " + this.AVCQueue.size());
        if (this.m_PTSQueue.size() <= 0 && this.m_profile >= 8) {
            C85315al.m146641c(str, "encode: no available pts!!! profile " + this.m_profile);
        } else if (this.m_PTSQueue.size() <= 0) {
            C85315al.m146641c(str, "encode: no available pts!!!");
        } else {
            long longValue = this.m_PTSQueue.poll().longValue();
            long j2 = 0;
            if (bufferInfo.presentationTimeUs > 0) {
                j2 = bufferInfo.presentationTimeUs;
            }
            if (this.m_profile >= 8) {
                j = longValue - 200000;
            } else {
                j = j2;
            }
            C85315al.m146639b(str, "dts = " + j + ", pts = " + j2 + " add codecdata-encode AVCQueue-size= " + this.AVCQueue.size());
            C30657a aVar = new C30657a();
            aVar.f73302a = bArr;
            aVar.f73303b = j2;
            aVar.f73304c = j;
            aVar.f73305d = bufferInfo.flags;
            try {
                this.AVCQueue.add(aVar);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static Bitmap convertTexToBitmap(int i, int i2, int i3) {
        MethodCollector.m26663i(14366);
        ByteBuffer readTextureToByteBuffer = readTextureToByteBuffer(i, i2, i3);
        Bitmap createBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
        createBitmap.copyPixelsFromBuffer(readTextureToByteBuffer);
        MethodCollector.m26664o(14366);
        return createBitmap;
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

    public void encoderYUV420(byte[] bArr, int i, long j) {
        int i2 = i;
        this.mEncodeBufferCount = 10;
        while (true) {
            try {
                if (this.mEncodeBufferCount <= 0) {
                    break;
                }
                int dequeueInputBuffer = this.m_mediaCodec.dequeueInputBuffer(-1);
                this.mEncodeBufferCount--;
                if (dequeueInputBuffer >= 0) {
                    ByteBuffer inputBufferByIdx = getInputBufferByIdx(dequeueInputBuffer);
                    inputBufferByIdx.clear();
                    C85315al.m146639b(TAG, "inputBuffer ".concat(String.valueOf(inputBufferByIdx)));
                    if (i2 > inputBufferByIdx.capacity()) {
                        i2 = inputBufferByIdx.capacity();
                    }
                    inputBufferByIdx.put(bArr, 4, i2);
                    this.m_mediaCodec.queueInputBuffer(dequeueInputBuffer, 0, i2, j, 0);
                }
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        }
        drainOutputBuffer(0);
    }

    public static boolean saveFrameToFile(int i, int i2, int i3, long j) {
        MethodCollector.m26663i(14369);
        Bitmap convertTexToBitmap = convertTexToBitmap(i, i2, i3);
        file_count++;
        File file = new File("sdcard/dump/" + file_count + "_" + j + ".jpg");
        if (file.exists()) {
            m63008x855f720c(file);
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            convertTexToBitmap.compress(Bitmap.CompressFormat.JPEG, 20, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            if (!convertTexToBitmap.isRecycled()) {
                convertTexToBitmap.recycle();
            }
            MethodCollector.m26664o(14369);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            if (!convertTexToBitmap.isRecycled()) {
                convertTexToBitmap.recycle();
            }
            MethodCollector.m26664o(14369);
            return false;
        } catch (Throwable th) {
            if (!convertTexToBitmap.isRecycled()) {
                convertTexToBitmap.recycle();
            }
            MethodCollector.m26664o(14369);
            throw th;
        }
    }

    public int encodeVideoFromBuffer(int i, long j, boolean z, boolean z2) {
        if (!this.m_bSuccessInit) {
            return 0;
        }
        this.m_PTSQueue.offer(Long.valueOf(j));
        if (this.m_isNeedReconfigure || (this.m_configStatus & 4) != 0) {
            if (this.m_mediaCodec == null || this.m_configStatus != 1) {
                restartEncoder();
            } else {
                int i2 = Build.VERSION.SDK_INT;
                Bundle bundle = new Bundle();
                bundle.putInt("video-bitrate", this.m_bitRate);
                this.m_mediaCodec.setParameters(bundle);
                this.m_configStatus = 0;
            }
            this.m_isNeedReconfigure = false;
        }
        int i3 = Build.VERSION.SDK_INT;
        if (z2 && VERuntime.EnumC85549a.INSTANCE.f191667b.f191647f) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("request-sync", 0);
            double d = (double) this.m_bitRate;
            double d2 = this.m_TransitionKeyframeRatio;
            Double.isNaN(d);
            bundle2.putInt("video-bitrate", (int) (d * d2));
            this.m_mediaCodec.setParameters(bundle2);
        }
        if (this.m_encodeStartTime == -1) {
            this.m_encodeStartTime = System.nanoTime();
        }
        String str = TAG;
        C85315al.m146639b(str, "drainOutputBuffer 1111 ");
        long j2 = 0;
        int drainOutputBuffer = drainOutputBuffer(0);
        if (drainOutputBuffer != 0) {
            return drainOutputBuffer;
        }
        C85315al.m146639b(str, "drainOutputBuffer 1111 size= ".concat(String.valueOf(i)));
        if (this.mByteBuf.capacity() > 0 && !this.m_bSignalEndOfStream) {
            encoderYUV420(this.mByteBuf.array(), i, j);
        } else if (this.m_mediaCodec != null && !this.m_bSignalEndOfStream && this.m_bNeedSingalEnd) {
            try {
                C85315al.m146637a(str, "m_mediaCodec.flush()");
                this.m_bSignalEndOfStream = true;
                this.mEndOfStream = false;
                this.m_mediaCodec.signalEndOfInputStream();
            } catch (Exception e) {
                e.printStackTrace();
                return -213;
            }
        }
        if (this.m_bSignalEndOfStream) {
            int i4 = 30;
            while (!this.mEndOfStream) {
                C85315al.m146639b(TAG, "drainOutputBuffer 44444 ");
                int drainOutputBuffer2 = drainOutputBuffer(10000);
                if (drainOutputBuffer2 == 0) {
                    if (this.mBufferIndex < 0) {
                        i4--;
                        if (i4 <= 0) {
                            break;
                        }
                    } else {
                        break;
                    }
                } else {
                    return drainOutputBuffer2;
                }
            }
        } else {
            C85315al.m146639b(str, "drainOutputBuffer 55555 ");
            if (this.AVCQueue.size() <= 0) {
                j2 = 10000;
            }
            int drainOutputBuffer3 = drainOutputBuffer(j2);
            if (drainOutputBuffer3 != 0) {
                return drainOutputBuffer3;
            }
        }
        C30657a poll = this.AVCQueue.poll();
        this.m_lastCodecData = poll;
        if (poll != null) {
            return poll.f73302a.length;
        }
        return 0;
    }

    public int encodeVideoFromTexture(int i, long j, boolean z, boolean z2, boolean z3) {
        boolean z4;
        int i2;
        int i3;
        int i4;
        String str;
        boolean z5;
        TEMediaCodecDecoder tEMediaCodecDecoder;
        MethodCollector.m26663i(14375);
        int i5 = 0;
        if (!this.m_bSuccessInit) {
            MethodCollector.m26664o(14375);
            return 0;
        } else if (C85376ax.f191106g == C85376ax.EnumC85377a.VIDEO_ENC_ENCODING_FALLBACK.getValue()) {
            C85315al.m146642d(TAG, "TESTING! HW VIDEO ENC ENCODING FALLBACK");
            MethodCollector.m26664o(14375);
            return -211;
        } else {
            if (Long.MIN_VALUE == this.mFirstFrameTimestamp) {
                this.mFirstFrameTimestamp = System.currentTimeMillis();
            }
            this.m_PTSQueue.offer(Long.valueOf(j));
            if (this.m_eglStateSaver == null) {
                C30642c cVar = new C30642c();
                this.m_eglStateSaver = cVar;
                cVar.mo54932a();
            }
            if (this.m_isNeedReconfigure && this.isEnableHwEncoderOpt) {
                startEncoder();
            }
            if (this.m_isNeedReconfigure || (this.m_configStatus & 4) != 0) {
                if (this.m_mediaCodec != null && this.m_configStatus == 1) {
                    int i6 = Build.VERSION.SDK_INT;
                    Bundle bundle = new Bundle();
                    bundle.putInt("video-bitrate", this.m_bitRate);
                    this.m_mediaCodec.setParameters(bundle);
                    this.m_configStatus = 0;
                } else if (!this.m_bEncoderBanExtraDataLoop) {
                    restartEncoder();
                }
                this.m_isNeedReconfigure = false;
            }
            int drainOutputBuffer = drainOutputBuffer(0);
            if (drainOutputBuffer != 0) {
                MethodCollector.m26664o(14375);
                return drainOutputBuffer;
            }
            C85568t.C85573d a = C85568t.m147473a().mo131556a("ve_smart_trans_detect");
            if (a == null || a.f191742b == null) {
                z4 = false;
            } else {
                z4 = ((Boolean) a.f191742b).booleanValue();
            }
            int i7 = Build.VERSION.SDK_INT;
            if (z2 && (VERuntime.EnumC85549a.INSTANCE.f191667b.f191647f || z4)) {
                C85315al.m146637a(TAG, "encodeVideoFromTexture:: pts = " + j + " keyframe isKeyFrame= " + z2 + " bp_ratio " + this.m_TransitionKeyframeRatio);
                Bundle bundle2 = new Bundle();
                bundle2.putInt("request-sync", 0);
                double d = (double) this.m_bitRate;
                double d2 = this.m_TransitionKeyframeRatio;
                Double.isNaN(d);
                bundle2.putInt("video-bitrate", (int) (d * d2));
                this.m_mediaCodec.setParameters(bundle2);
            }
            if (z3) {
                C85315al.m146637a(TAG, "isForceIFrame pts = " + j + " keyframe isKeyFrame= " + z2 + " bp_ratio " + this.m_TransitionKeyframeRatio);
                forceToPrepareKeyFrame();
            }
            if (this.m_encodeStartTime == -1) {
                this.m_encodeStartTime = System.nanoTime();
            }
            int i8 = i & -1;
            if (i8 != 0) {
                try {
                    if (!(this.m_textureDrawer == null && this.m_textureOESDrawer == null)) {
                        if (!C85376ax.m146866a() || !EGL14.eglGetCurrentContext().equals(this.m_sharedContext.f73262e)) {
                            this.m_sharedContext.mo54941b();
                        }
                        GLES20.glViewport(0, 0, this.m_width, this.m_height);
                        if (this.m_bEncodeOESTexture) {
                            this.m_textureOESDrawer.mo54953a(this.m_MediaCodecDecInstance.getRenderParam().f73323a);
                            this.m_textureOESDrawer.mo54952a(-this.m_MediaCodecDecInstance.getRenderParam().f73324b, true, this.m_MediaCodecDecInstance.getRenderParam().f73325c, this.m_MediaCodecDecInstance.getRenderParam().f73326d, this.m_width_align, this.m_height_align);
                            this.m_textureOESDrawer.mo54951a(i8);
                        } else {
                            this.m_textureDrawer.mo54947a(i8);
                        }
                        if (this.mFirstFrame) {
                            if (DEBUG) {
                                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(3686400);
                                allocateDirect.order(ByteOrder.nativeOrder());
                                allocateDirect.position(0);
                                GLES20.glReadPixels(0, 0, 1280, 720, 6408, 5121, allocateDirect);
                            }
                            this.mFirstFrame = false;
                        }
                        long j2 = j * 1000;
                        this.m_sharedContext.mo54939a(j2);
                        this.m_sharedContext.mo54942c();
                        this.m_bNeedSingalEnd = true;
                        if (!(this.configByte == null || (tEMediaCodecDecoder = this.m_MediaCodecDecInstance) == null)) {
                            tEMediaCodecDecoder.signalReEncodeOptCV();
                        }
                        int drainOutputBuffer2 = drainOutputBuffer(0);
                        if (drainOutputBuffer2 != 0) {
                            return drainOutputBuffer2;
                        }
                        boolean z6 = this.isEnableHwEncoderOpt;
                        if (z6 && this.configByte == null) {
                            int i9 = this.configWaitingFrameCounter + 1;
                            this.configWaitingFrameCounter = i9;
                            if (i9 >= 25) {
                                this.configWaitingFrameCounter = 0;
                                C85315al.m146642d(TAG, "get config fail, back to soft encode");
                                MethodCollector.m26664o(14375);
                                return -211;
                            }
                        }
                        if (this.configByte == null && !this.m_bEncoderBanExtraDataLoop && !z6) {
                            int i10 = 0;
                            while (true) {
                                str = TAG;
                                C85315al.m146639b(str, "Encoder first frame, count = ".concat(String.valueOf(i10)));
                                GLES20.glViewport(i5, i5, this.m_width, this.m_height);
                                if (this.m_bEncodeOESTexture) {
                                    this.m_textureOESDrawer.mo54953a(this.m_MediaCodecDecInstance.getRenderParam().f73323a);
                                    this.m_textureOESDrawer.mo54952a(-this.m_MediaCodecDecInstance.getRenderParam().f73324b, true, this.m_MediaCodecDecInstance.getRenderParam().f73325c, this.m_MediaCodecDecInstance.getRenderParam().f73326d, this.m_width_align, this.m_height_align);
                                    this.m_textureOESDrawer.mo54951a(i8);
                                } else {
                                    this.m_textureDrawer.mo54947a(i8);
                                }
                                this.m_sharedContext.mo54939a(j2);
                                GLES20.glFinish();
                                this.m_sharedContext.mo54942c();
                                int drainOutputBuffer3 = drainOutputBuffer(0);
                                if (drainOutputBuffer3 == 0) {
                                    i10++;
                                    if (i10 > 30) {
                                        break;
                                    }
                                    Thread.sleep(10, 0);
                                    if (this.configByte != null) {
                                        break;
                                    }
                                    i5 = 0;
                                } else {
                                    MethodCollector.m26664o(14375);
                                    return drainOutputBuffer3;
                                }
                            }
                            if (this.configByte == null) {
                                C85315al.C85316a[] aVarArr = new C85315al.C85316a[7];
                                aVarArr[0] = new C85315al.C85316a("AVCQueue count", Integer.valueOf(this.AVCQueue.size()), "");
                                aVarArr[1] = new C85315al.C85316a("textureID", Integer.valueOf(i8), "");
                                aVarArr[2] = new C85315al.C85316a("isTexture", Boolean.valueOf(GLES20.glIsTexture(i)), "");
                                aVarArr[3] = new C85315al.C85316a("timestampUs", Long.valueOf(j), "");
                                aVarArr[4] = new C85315al.C85316a("glCheckError", Integer.valueOf(GLES20.glGetError()), "");
                                aVarArr[5] = new C85315al.C85316a("m_bEncoderGLContextReuse", Boolean.valueOf(this.m_bEncoderGLContextReuse), "");
                                if (this.m_sharedContext.f73262e != null) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                aVarArr[6] = new C85315al.C85316a("currentContext", Boolean.valueOf(z5), "");
                                C85315al.m146642d(str, C85315al.m146634a(str, "TEAvcEncoder Generate configData failed!!!", aVarArr));
                                MethodCollector.m26664o(14375);
                                return -211;
                            }
                            C85315al.m146637a(str, "Generate configData succeed!!!".concat(String.valueOf(i10)));
                            this.AVCQueue.clear();
                            restartEncoder();
                            this.m_getnerateIndex = 0;
                            this.m_sharedContext.mo54941b();
                            GLES20.glViewport(0, 0, this.m_width, this.m_height);
                            if (this.m_bEncodeOESTexture) {
                                this.m_textureOESDrawer.mo54953a(this.m_MediaCodecDecInstance.getRenderParam().f73323a);
                                this.m_textureOESDrawer.mo54952a(-this.m_MediaCodecDecInstance.getRenderParam().f73324b, true, this.m_MediaCodecDecInstance.getRenderParam().f73325c, this.m_MediaCodecDecInstance.getRenderParam().f73326d, this.m_width_align, this.m_height_align);
                                this.m_textureOESDrawer.mo54951a(i8);
                            } else {
                                this.m_textureDrawer.mo54947a(i8);
                            }
                            this.m_sharedContext.mo54939a(j2);
                            GLES20.glFinish();
                            this.m_sharedContext.mo54942c();
                            TEMediaCodecDecoder tEMediaCodecDecoder2 = this.m_MediaCodecDecInstance;
                            if (tEMediaCodecDecoder2 != null) {
                                tEMediaCodecDecoder2.signalReEncodeOptCV();
                            }
                            long j3 = this.mFirstFrameTimestamp;
                            if (j3 > 0 && j3 != Long.MAX_VALUE) {
                                long currentTimeMillis = System.currentTimeMillis() - this.mFirstFrameTimestamp;
                                this.mFirstFrameTimestamp = Long.MAX_VALUE;
                                C30695h.m63062a(0, "te_record_generate_extra_data_cost", currentTimeMillis);
                                C85315al.m146637a(str, "TE_RECORD_GEN_EXTRA_DATA_COST: ".concat(String.valueOf(currentTimeMillis)));
                            }
                        }
                        if (((Boolean) C85568t.m147473a().mo131557a("ve_mediacodec_resource_reasonable_distribute", (Object) true)).booleanValue() && this.m_getnerateIndex == 0) {
                            C30664c.f73336a = false;
                        }
                    }
                    this.m_getnerateIndex++;
                } catch (Exception e) {
                    e.printStackTrace();
                    return -211;
                } finally {
                    MethodCollector.m26664o(14375);
                }
            } else if (this.m_mediaCodec != null && !this.m_bSignalEndOfStream && this.m_bNeedSingalEnd) {
                try {
                    C85315al.m146637a(TAG, "m_mediaCodec.flush()");
                    this.m_bSignalEndOfStream = true;
                    this.mEndOfStream = false;
                    this.m_mediaCodec.signalEndOfInputStream();
                } catch (Exception e2) {
                    e2.printStackTrace();
                    MethodCollector.m26664o(14375);
                    return -213;
                }
            }
            if (!C85376ax.m146866a()) {
                C30642c cVar2 = this.m_eglStateSaver;
                EGL14.eglMakeCurrent(cVar2.f73251d, cVar2.f73249b, cVar2.f73250c, cVar2.f73248a);
            }
            if (this.m_bSignalEndOfStream) {
                int i11 = 30;
                while (!this.mEndOfStream) {
                    int drainOutputBuffer4 = drainOutputBuffer(10000);
                    if (drainOutputBuffer4 == 0) {
                        if (this.mBufferIndex < 0) {
                            i11--;
                            if (i11 <= 0) {
                                break;
                            }
                        } else {
                            break;
                        }
                    } else {
                        MethodCollector.m26664o(14375);
                        return drainOutputBuffer4;
                    }
                }
            } else {
                C85568t.C85573d a2 = C85568t.m147473a().mo131556a("byteVC1_10bit_hardware_encoder_timeout");
                if (a2 == null || a2.f191742b == null || !this.m_bByteVC110BitHWDecoder || (i4 = ((Integer) a2.f191742b).intValue()) <= 0) {
                    i4 = 0;
                }
                int drainOutputBuffer5 = drainOutputBuffer((long) i4);
                if (drainOutputBuffer5 != 0) {
                    MethodCollector.m26664o(14375);
                    return drainOutputBuffer5;
                } else if (this.m_bEncoderBanExtraDataLoop || this.isEnableHwEncoderOpt) {
                    if (this.configByte == null) {
                        C85315al.m146639b(TAG, "Skip extra data looper.");
                        MethodCollector.m26664o(14375);
                        return 0;
                    }
                    long j4 = this.mFirstFrameTimestamp;
                    if (j4 > 0 && j4 != Long.MAX_VALUE) {
                        long currentTimeMillis2 = System.currentTimeMillis() - this.mFirstFrameTimestamp;
                        this.mFirstFrameTimestamp = Long.MAX_VALUE;
                        C30695h.m63062a(0, "te_record_generate_extra_data_cost", currentTimeMillis2);
                        String str2 = TAG;
                        C85315al.m146637a(str2, "TE_RECORD_GEN_EXTRA_DATA_COST: ".concat(String.valueOf(currentTimeMillis2)));
                        int size = this.AVCQueue.size();
                        C30695h.m63062a(0, "te_record_packet_count_before_extra_data", (long) size);
                        C85315al.m146637a(str2, "TE_RECORD_PACKET_COUNT_BEFORE_EXTRA_DATA: ".concat(String.valueOf(size)));
                    }
                }
            }
            C30657a poll = this.AVCQueue.poll();
            this.m_lastCodecData = poll;
            if (poll != null) {
                i3 = poll.f73302a.length;
                i2 = 14375;
            } else {
                i2 = 14375;
                i3 = 0;
            }
            MethodCollector.m26664o(i2);
            return i3;
        }
    }

    private void setEncoder(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, double d, int i9, int i10, int i11) {
        this.m_configStatus = 0;
        this.m_codec_type = i;
        if (i == CODEC_TYPE_BYTEVC1) {
            this.m_mime_type = "video/hevc";
        } else {
            this.m_mime_type = this.VIDEO_MIME_TYPE;
        }
        if (i2 > 0) {
            this.m_width = i2;
            this.m_width_align = i2;
        }
        if (i3 > 0) {
            this.m_height = i3;
            this.m_height_align = i3;
        }
        Math.min(this.m_width_align, this.m_height_align);
        if (this.m_useInputSurface) {
            int i12 = this.m_width_align;
            int i13 = ENCODE_RESOLUTION_ALIGN;
            if (i12 % i13 != 0) {
                this.m_width_align = ((i12 / i13) + 1) * i13;
            }
            int i14 = this.m_height_align;
            if (i14 % i13 != 0) {
                this.m_height_align = ((i14 / i13) + 1) * i13;
            }
            C85315al.m146641c(TAG, "Encoder set OutResolution align: " + ENCODE_RESOLUTION_ALIGN + ", dstResolution: " + this.m_width_align + "*" + this.m_height_align + ", srcResolution: " + this.m_width + "*" + this.m_height);
        }
        if (i4 > 0) {
            if (i4 < MIN_FRAME_RATE) {
                C85315al.m146641c(TAG, C1764a.m5929a(Locale.getDefault(), "_frameRate:[%d] is too small, change to %d", new Object[]{Integer.valueOf(i4), Integer.valueOf(MIN_FRAME_RATE)}));
                i4 = MIN_FRAME_RATE;
            } else if (i4 > MAX_FRAME_RATE) {
                C85315al.m146641c(TAG, C1764a.m5929a(Locale.getDefault(), "_frameRate:[%d] is too large, change to %d", new Object[]{Integer.valueOf(i4), Integer.valueOf(MAX_FRAME_RATE)}));
                i4 = MAX_FRAME_RATE;
            }
            if (this.m_frameRate != i4) {
                this.m_frameRate = i4;
                if (i4 < this.m_iFrameInternal) {
                    this.m_iFrameInternal = i4;
                }
                this.m_isNeedReconfigure = true;
                this.m_configStatus |= 2;
            }
        }
        if (i5 > 0) {
            this.m_maxBitRate = i5;
            if (this.m_bitRate != i5) {
                this.m_bitRate = i5;
                this.m_isNeedReconfigure = true;
                this.m_configStatus |= 1;
            }
        }
        if (i6 >= 0) {
            this.m_iFrameInternal = i6;
        }
        if (i7 > 0) {
            this.m_colorFormat = i7;
        }
        if (this.m_codec_type == CODEC_TYPE_BYTEVC1) {
            this.m_profile = 1;
        } else {
            this.m_profile = C0622a.m2312a(i8, 1, 64);
        }
        this.m_dHpBitrateRatio = d;
        this.m_colorspace = i9;
        this.m_bColorRangeFull = i10;
        this.m_colorTrc = i11;
    }

    public int initEncoder(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, double d, boolean z, int i9, int i10, int i11, double d2, int i12, int i13, boolean z2, boolean z3) {
        TEAvcEncoder tEAvcEncoder;
        if (i13 > 0) {
            setEncodeResolutionAlign(i13);
        }
        String str = TAG;
        C85315al.m146637a(str, "m_mediaCodec initEncoder == enter transitionRatio ".concat(String.valueOf(d2)));
        if (z) {
            int i14 = Build.VERSION.SDK_INT;
        }
        this.isEnableHwEncoderOpt = ((Boolean) C85568t.m147473a().mo131557a("ve_enable_compile_hw_encoder_opt", (Object) false)).booleanValue();
        C85315al.m146637a(str, "isEnableHwEncoderOpt: " + this.isEnableHwEncoderOpt);
        this.m_useInputSurface = z;
        if (z) {
            this.m_colorFormat = 2130708361;
        } else {
            this.m_colorFormat = i5;
        }
        setEncoder(i, i2, i3, i4, i7, i6, this.m_colorFormat, i8, d, i9, i10, i11);
        if (d2 <= 0.0d || d2 >= 5.0d) {
            tEAvcEncoder = this;
        } else {
            tEAvcEncoder = this;
            tEAvcEncoder.m_TransitionKeyframeRatio = d2;
        }
        tEAvcEncoder.m_isNeedReconfigure = true;
        tEAvcEncoder.m_bSuccessInit = true;
        tEAvcEncoder.m_bSignalEndOfStream = false;
        tEAvcEncoder.m_bEncoderGLContextReuse = z2;
        tEAvcEncoder.m_bEncoderBanExtraDataLoop = z3;
        C85315al.m146637a(str, "avcencoder glcontext reuse: " + tEAvcEncoder.m_bEncoderGLContextReuse);
        if (i12 == 2) {
            tEAvcEncoder.VIDEO_MIME_TYPE = "video/mp4v-es";
        } else {
            tEAvcEncoder.VIDEO_MIME_TYPE = "video/avc";
        }
        int configEncode = configEncode();
        if (configEncode < 0 && ((Boolean) C85568t.m147473a().mo131557a("ve_mediacodec_resource_reasonable_distribute", (Object) false)).booleanValue()) {
            C30664c.m63024b(tEAvcEncoder.m_width_align * tEAvcEncoder.m_height_align * tEAvcEncoder.m_frameRate, hashCode());
        }
        if (tEAvcEncoder.m_bEncoderBanExtraDataLoop && (configEncode = startEncoder()) != 0) {
            C85315al.m146642d(str, "Start encoder failed on encodeVideoFromTexture: ".concat(String.valueOf(configEncode)));
        }
        if (C85376ax.f191106g != C85376ax.EnumC85377a.VIDEO_ENC_INIT_FALLBACK.getValue()) {
            return configEncode;
        }
        C85315al.m146642d(str, "TESTING! HW VIDEO ENC INIT FALLBACK");
        return -1;
    }
}
