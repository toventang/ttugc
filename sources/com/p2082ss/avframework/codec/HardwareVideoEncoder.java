package com.p2082ss.avframework.codec;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Build;
import android.os.Bundle;
import android.view.Surface;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.avframework.buffer.VideoFrame;
import com.p2082ss.avframework.engine.VideoEncoder;
import com.p2082ss.avframework.opengl.GLSurface;
import com.p2082ss.avframework.opengl.GLThreadManager;
import com.p2082ss.avframework.opengl.GlRenderDrawer;
import com.p2082ss.avframework.opengl.RendererCommon;
import com.p2082ss.avframework.opengl.YuvHelper;
import com.p2082ss.avframework.utils.AVLog;
import com.p2082ss.avframework.utils.SafeHandlerThread;
import com.p2082ss.avframework.utils.SafeHandlerThreadPoolExecutor;
import com.p2082ss.avframework.utils.TEBundle;
import com.p2082ss.avframework.utils.ThreadUtils;
import java.nio.ByteBuffer;
import java.util.LinkedList;

/* renamed from: com.ss.avframework.codec.HardwareVideoEncoder */
public class HardwareVideoEncoder extends VideoEncoder {
    private int adjustedBitrate;
    private float bitateRatio = 1.0f;
    private MediaCodec codec;
    private String codecName;
    private String codecType;
    public byte[] configbyte;
    private boolean constTimePeriod;
    private EGLDisplay currDisplay;
    private EGLSurface currSurface;
    private GlRenderDrawer drawer;
    private GLSurface encoder_surface;
    private boolean fixBFrameDts;
    private long forcedKeyFrameNs;
    public int fps;
    private long frameInCount;
    private long frameOutCount;
    private int height;
    protected MediaCodecInfo info;
    public int keyFrameIntervalSec;
    private long lastKeyFrameNs;
    private boolean lossless;
    private DtsQueue mDtsQueue;
    private HardwareVideoEncodeRoi mRoi;
    private boolean mSwap;
    private ThreadUtils.ThreadChecker mThreadChecker;
    protected boolean noDropFrame;
    private SafeHandlerThread outputThread;
    private byte[] pps;
    private volatile boolean requestIDRFrame;
    private byte[] sps;
    private Integer surfaceColorFormat;
    private Surface textureInputSurface;
    private boolean useSurfaceMode;
    private byte[] vps_sps_pps;
    private int width;
    private Integer yuvColorFormat;
    private YuvFormat yuvFormat;

    static {
        Covode.recordClassIndex(99908);
    }

    /* renamed from: com_ss_avframework_codec_HardwareVideoEncoder_com_ss_android_ugc_aweme_lancet_LogLancet_e */
    public static int m147767xcd9a97fe(String str, String str2) {
        return 0;
    }

    /* renamed from: com_ss_avframework_codec_HardwareVideoEncoder_com_ss_android_ugc_aweme_lancet_LogLancet_i */
    public static int m147768xcd9a9802(String str, String str2) {
        return 0;
    }

    public boolean setupCodecName() {
        return false;
    }

    private boolean canUseSurface() {
        if (this.surfaceColorFormat != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.avframework.codec.HardwareVideoEncoder$DtsQueueFixed */
    public class DtsQueueFixed extends DtsQueue {
        private long lastDtsOut;
        private long lastPtsIn;
        private final long minStartPts;
        private long ptsInDelta;
        private final LinkedList<Long> ptsInQueue;

        static {
            Covode.recordClassIndex(99911);
        }

        private void reset() {
            this.ptsInQueue.clear();
            this.lastPtsIn = 0;
            this.lastDtsOut = 0;
            this.ptsInDelta = 0;
        }

        private DtsQueueFixed() {
            super();
            this.ptsInQueue = new LinkedList<>();
            this.minStartPts = 200000000;
        }

        /* access modifiers changed from: package-private */
        @Override // com.p2082ss.avframework.codec.HardwareVideoEncoder.DtsQueue
        public synchronized long getDtsOut(long j) {
            long j2;
            MethodCollector.m26663i(161);
            super.getDtsOut(j);
            if (!this.ptsInQueue.isEmpty()) {
                j2 = this.ptsInQueue.poll().longValue() - 200000000;
                long j3 = this.lastDtsOut;
                if ((j3 > j2 || j2 > j) && j3 > j2) {
                    AVLog.logToIODevice2(6, "HardwareVideoEncoder", "last dts out: " + this.lastDtsOut + ", current dts out: " + j2, null, "DtsQueueFixed.getDtsOut2", 30000);
                    j2 = this.lastDtsOut + 1;
                }
                if (j2 > j) {
                    AVLog.logToIODevice2(6, "HardwareVideoEncoder", "pts out: " + j + ", dts out: " + j2, null, "DtsQueueFixed.getDtsOut1", 30000);
                    this.lastDtsOut = j;
                    MethodCollector.m26664o(161);
                }
            } else {
                long j4 = this.lastDtsOut;
                double d = (double) HardwareVideoEncoder.this.fps;
                Double.isNaN(d);
                j2 = j4 + ((long) (1.0E9d / d));
                if (j2 > j) {
                    AVLog.logToIODevice2(6, "HardwareVideoEncoder", "pts out: " + j + ", dts out: " + j2, null, "DtsQueueFixed.getDtsOut1", 30000);
                    this.lastDtsOut = j;
                    MethodCollector.m26664o(161);
                }
            }
            j = j2;
            this.lastDtsOut = j;
            MethodCollector.m26664o(161);
            return j;
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0055, code lost:
            if (r4 > (r2 + (r6 * 1.0E9d))) goto L_0x0068;
         */
        @Override // com.p2082ss.avframework.codec.HardwareVideoEncoder.DtsQueue
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public synchronized long getPtsIn(long r10) {
            /*
            // Method dump skipped, instructions count: 151
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.avframework.codec.HardwareVideoEncoder.DtsQueueFixed.getPtsIn(long):long");
        }
    }

    @Override // com.p2082ss.avframework.engine.VideoEncoder
    public void RequestIDRFrame() {
        AVLog.iow("HardwareVideoEncoder", "RequestIDRFrame");
        this.requestIDRFrame = true;
    }

    public byte[] getExtraData() {
        byte[] bArr = this.configbyte;
        if (bArr != null) {
            return bArr;
        }
        return new byte[0];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.avframework.codec.HardwareVideoEncoder$YuvFormat */
    public enum YuvFormat {
        I420 {
            /* access modifiers changed from: package-private */
            @Override // com.p2082ss.avframework.codec.HardwareVideoEncoder.YuvFormat
            public final void fillBuffer(ByteBuffer byteBuffer, VideoFrame.Buffer buffer) {
                VideoFrame.I420Buffer i420 = buffer.toI420();
                YuvHelper.I420Copy(i420.getDataY(), i420.getStrideY(), i420.getDataU(), i420.getStrideU(), i420.getDataV(), i420.getStrideV(), byteBuffer, i420.getWidth(), i420.getHeight());
                i420.release();
            }
        },
        NV12 {
            /* access modifiers changed from: package-private */
            @Override // com.p2082ss.avframework.codec.HardwareVideoEncoder.YuvFormat
            public final void fillBuffer(ByteBuffer byteBuffer, VideoFrame.Buffer buffer) {
                VideoFrame.I420Buffer i420 = buffer.toI420();
                YuvHelper.I420ToNV12(i420.getDataY(), i420.getStrideY(), i420.getDataU(), i420.getStrideU(), i420.getDataV(), i420.getStrideV(), byteBuffer, i420.getWidth(), i420.getHeight());
                i420.release();
            }
        };

        /* access modifiers changed from: package-private */
        public abstract void fillBuffer(ByteBuffer byteBuffer, VideoFrame.Buffer buffer);

        static {
            Covode.recordClassIndex(99912);
        }

        static YuvFormat valueOf(int i) {
            if (i == 19) {
                return I420;
            }
            if (i == 21 || i == 2141391872 || i == 2141391876) {
                return NV12;
            }
            throw new IllegalArgumentException("Unsupported colorFormat: ".concat(String.valueOf(i)));
        }
    }

    @Override // com.p2082ss.avframework.engine.NativeObject, com.p2082ss.avframework.engine.VideoEncoder
    public void release() {
        ThreadUtils.ThreadChecker threadChecker = this.mThreadChecker;
        if (threadChecker != null) {
            threadChecker.checkIsOnValidThread();
            signalEndOfInputStream();
            SafeHandlerThread safeHandlerThread = this.outputThread;
            if (safeHandlerThread != null) {
                SafeHandlerThreadPoolExecutor.unlockThread(safeHandlerThread);
            }
            this.mDtsQueue = null;
            releaseCodec();
            if (this.noDropFrame) {
                AVLog.ioi("HardwareVideoEncoder", "input frame count " + this.frameInCount + ", output frame count " + this.frameOutCount);
            }
        }
    }

    private void releaseCodec() {
        AVLog.iod("HardwareVideoEncoder", "Releasing MediaCodec on output thread");
        try {
            MediaCodec mediaCodec = this.codec;
            if (mediaCodec != null) {
                mediaCodec.stop();
            }
        } catch (Exception e) {
            AVLog.ioe("HardwareVideoEncoder", "codecTexture stop failed: ".concat(String.valueOf(e)));
        }
        try {
            MediaCodec mediaCodec2 = this.codec;
            if (mediaCodec2 != null) {
                mediaCodec2.release();
                this.codec = null;
            }
        } catch (Exception e2) {
            AVLog.ioe("HardwareVideoEncoder", "codecTexture release failed: ".concat(String.valueOf(e2)));
        }
        GlRenderDrawer glRenderDrawer = this.drawer;
        if (glRenderDrawer != null) {
            glRenderDrawer.release();
            this.drawer = null;
        }
        if (this.encoder_surface != null) {
            GLES20.glFinish();
            this.encoder_surface.release();
            this.encoder_surface = null;
        }
        Surface surface = this.textureInputSurface;
        if (surface != null) {
            surface.release();
            this.textureInputSurface = null;
        }
        AVLog.iod("HardwareVideoEncoder", "Release on output thread done");
    }

    private int signalEndOfInputStream() {
        String str;
        long j;
        MethodCollector.m26663i(3160);
        MediaCodec mediaCodec = this.codec;
        if (mediaCodec == null) {
            MethodCollector.m26664o(3160);
            return 0;
        }
        try {
            if (this.useSurfaceMode) {
                GLSurface gLSurface = this.encoder_surface;
                if (gLSurface != null) {
                    gLSurface.nativeSwapBuffers();
                }
                this.codec.signalEndOfInputStream();
                AVLog.ioi("HardwareVideoEncoder", "Texture codec signalEndOfInputStream ok");
            } else {
                if (this.noDropFrame) {
                    j = -1;
                } else {
                    j = 0;
                }
                int dequeueInputBuffer = mediaCodec.dequeueInputBuffer(j);
                if (dequeueInputBuffer >= 0) {
                    ByteBuffer byteBuffer = this.codec.getInputBuffers()[dequeueInputBuffer];
                    if (byteBuffer != null) {
                        byteBuffer.position(0);
                        byteBuffer.limit(0);
                    }
                    this.codec.queueInputBuffer(dequeueInputBuffer, 0, 0, 0, 4);
                    AVLog.ioi("HardwareVideoEncoder", "Yuv codec signalEndOfInputStream ok");
                }
            }
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            if (this.useSurfaceMode) {
                str = "Texture";
            } else {
                str = "Yuv";
            }
            AVLog.ioe("HardwareVideoEncoder", sb.append(str).append(" codec signalEndOfInputStream failed: ").append(e.getMessage()).toString());
        }
        MethodCollector.m26664o(3160);
        return 0;
    }

    public void deliverEncodedImage() {
        int i;
        long j;
        long j2;
        long j3;
        try {
            if (this.codec != null) {
                MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                try {
                    MediaCodec mediaCodec = this.codec;
                    if (this.noDropFrame) {
                        j3 = -1;
                    } else {
                        j3 = 0;
                    }
                    i = mediaCodec.dequeueOutputBuffer(bufferInfo, j3);
                } catch (Exception e) {
                    e.printStackTrace();
                    i = -1;
                }
                while (i >= 0) {
                    ByteBuffer byteBuffer = this.codec.getOutputBuffers()[i];
                    byteBuffer.position(bufferInfo.offset);
                    byteBuffer.limit(bufferInfo.size);
                    ByteBuffer slice = byteBuffer.slice();
                    if (!slice.isDirect()) {
                        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bufferInfo.size);
                        allocateDirect.position(0);
                        allocateDirect.put(slice);
                        allocateDirect.position(0);
                        slice = allocateDirect;
                    }
                    if ((bufferInfo.flags & 2) != 0) {
                        AVLog.m147805d("HardwareVideoEncoder", "Config frame generated. Offset: " + bufferInfo.offset + ". Size: " + bufferInfo.size);
                        if (this.configbyte == null) {
                            byte[] bArr = new byte[bufferInfo.size];
                            this.configbyte = bArr;
                            slice.get(bArr);
                            slice.position(0);
                        }
                        nativeEncoded(slice, bufferInfo.size, bufferInfo.flags, 0, 0, 0);
                    } else if (bufferInfo.flags != 4) {
                        if (bufferInfo.flags == 1) {
                            if (this.configbyte == null) {
                                m147767xcd9a97fe("HardwareVideoEncoder", "can't find config byte, end extract from I frame");
                            } else if (this.codecType.equals("video/avc")) {
                                if (bufferInfo.size > this.configbyte.length) {
                                    byte b = slice.get(4);
                                    byte[] bArr2 = this.configbyte;
                                    if (b == bArr2[4] && isKeyFrame(slice.get(bArr2.length + 4))) {
                                        slice.position(this.configbyte.length);
                                        slice.limit(slice.limit() - this.configbyte.length);
                                        slice = slice.slice();
                                    }
                                }
                            } else if (this.codecType.equals(MediaCodecUtils.ByteVC1Mime) && bufferInfo.size > this.configbyte.length) {
                                byte b2 = slice.get(4);
                                byte[] bArr3 = this.configbyte;
                                if (b2 == bArr3[4] && isKeyFrame(slice.get(bArr3.length + 4))) {
                                    slice.position(this.configbyte.length);
                                    slice.limit(slice.limit() - this.configbyte.length);
                                    slice = slice.slice();
                                }
                            }
                        }
                        if (this.noDropFrame) {
                            this.frameOutCount++;
                        }
                        DtsQueue dtsQueue = this.mDtsQueue;
                        if (dtsQueue != null) {
                            j = dtsQueue.getDtsOut(bufferInfo.presentationTimeUs * 1000);
                        } else {
                            j = bufferInfo.presentationTimeUs * 1000;
                        }
                        nativeEncoded(slice, slice.limit(), bufferInfo.flags, 0, bufferInfo.presentationTimeUs, j / 1000);
                    } else {
                        return;
                    }
                    this.codec.releaseOutputBuffer(i, false);
                    MediaCodec mediaCodec2 = this.codec;
                    if (this.noDropFrame) {
                        j2 = -1;
                    } else {
                        j2 = 0;
                    }
                    i = mediaCodec2.dequeueOutputBuffer(bufferInfo, j2);
                }
                if (i == -2) {
                    MediaFormat outputFormat = this.codec.getOutputFormat();
                    ByteBuffer byteBuffer2 = outputFormat.getByteBuffer("csd-0");
                    ByteBuffer byteBuffer3 = outputFormat.getByteBuffer("csd-1");
                    if (this.codecType.equals("video/avc") && byteBuffer2 != null && byteBuffer3 != null) {
                        this.sps = (byte[]) byteBuffer2.array().clone();
                        byte[] bArr4 = (byte[]) byteBuffer3.array().clone();
                        this.pps = bArr4;
                        byte[] bArr5 = this.sps;
                        byte[] bArr6 = new byte[(bArr5.length + bArr4.length)];
                        this.configbyte = bArr6;
                        System.arraycopy(bArr5, 0, bArr6, 0, bArr5.length);
                        byte[] bArr7 = this.pps;
                        System.arraycopy(bArr7, 0, this.configbyte, this.sps.length, bArr7.length);
                    } else if (this.codecType.equals(MediaCodecUtils.ByteVC1Mime) && byteBuffer2 != null) {
                        byte[] bArr8 = (byte[]) byteBuffer2.array().clone();
                        this.vps_sps_pps = bArr8;
                        byte[] bArr9 = new byte[bArr8.length];
                        this.configbyte = bArr9;
                        System.arraycopy(bArr8, 0, bArr9, 0, bArr8.length);
                    }
                }
            }
        } catch (IllegalStateException e2) {
            AVLog.m147806e("HardwareVideoEncoder", "deliverOutput failed\n" + e2.getMessage());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.avframework.codec.HardwareVideoEncoder$DtsQueue */
    public class DtsQueue {
        private int hasBFrames;
        private final int maxCheckCount;
        private final LinkedList<Long> ptsOutQueue;

        static {
            Covode.recordClassIndex(99910);
        }

        /* access modifiers changed from: package-private */
        public synchronized long getPtsIn(long j) {
            MethodCollector.m26663i(4379);
            MethodCollector.m26664o(4379);
            return j;
        }

        private DtsQueue() {
            this.ptsOutQueue = new LinkedList<>();
            this.hasBFrames = -1;
            this.maxCheckCount = 5;
        }

        /* access modifiers changed from: package-private */
        public synchronized long getDtsOut(long j) {
            String str;
            MethodCollector.m26663i(4404);
            if (this.hasBFrames == -1) {
                Long peekLast = this.ptsOutQueue.peekLast();
                this.ptsOutQueue.offer(Long.valueOf(j));
                int i = 0;
                if (peekLast != null && j <= peekLast.longValue()) {
                    this.hasBFrames = 1;
                    StringBuilder sb = new StringBuilder("Encoder output pts disorder: ");
                    while (i < this.ptsOutQueue.size()) {
                        StringBuilder append = sb.append(this.ptsOutQueue.get(i).longValue() / 1000000);
                        i++;
                        if (i >= this.ptsOutQueue.size()) {
                            str = "ms.";
                        } else {
                            str = "ms, ";
                        }
                        append.append(str);
                    }
                    AVLog.iow("HardwareVideoEncoder", sb.toString());
                    AVLog.logKibana(5, "HardwareVideoEncoder", sb.toString(), null);
                } else if (this.ptsOutQueue.size() + 1 >= 5) {
                    this.hasBFrames = 0;
                }
            }
            MethodCollector.m26664o(4404);
            return j;
        }
    }

    private synchronized int mapProfileLevel(int i) {
        int i2;
        MethodCollector.m26663i(2787);
        i2 = 2;
        if (i != 2) {
            if (i != 3) {
                i2 = 1;
            } else {
                i2 = 8;
            }
        }
        MethodCollector.m26664o(2787);
        return i2;
    }

    private boolean shouldForceKeyFrame(long j) {
        long j2 = this.forcedKeyFrameNs;
        if (j2 <= 0 || j <= this.lastKeyFrameNs + j2) {
            return false;
        }
        return true;
    }

    private boolean isKeyFrame(byte b) {
        if (this.codecType.equals("video/avc")) {
            if ((b & 31) == 5) {
                return true;
            }
            return false;
        } else if (!this.codecType.equals(MediaCodecUtils.ByteVC1Mime)) {
            return false;
        } else {
            int i = (b & 126) >> 1;
            if (i == 16 || i == 17 || i == 18 || i == 19 || i == 20 || i == 21) {
                return true;
            }
            return false;
        }
    }

    private void requestKeyFrame(long j) {
        try {
            Bundle bundle = new Bundle();
            bundle.putInt("request-sync", 0);
            MediaCodec mediaCodec = this.codec;
            if (mediaCodec != null) {
                mediaCodec.setParameters(bundle);
            }
            this.lastKeyFrameNs = j;
        } catch (IllegalStateException e) {
            AVLog.m147806e("HardwareVideoEncoder", "requestKeyFrame failed\n" + e.getMessage());
        }
    }

    @Override // com.p2082ss.avframework.engine.VideoEncoder
    public int Encode(VideoFrame videoFrame) {
        if (this.codec == null) {
            return -1;
        }
        this.mThreadChecker.checkIsOnValidThread();
        boolean z = videoFrame.getBuffer() instanceof VideoFrame.TextureBuffer;
        if (z != this.useSurfaceMode) {
            return -2;
        }
        SafeHandlerThread safeHandlerThread = this.outputThread;
        if (safeHandlerThread != null) {
            safeHandlerThread.post(new Runnable() {
                /* class com.p2082ss.avframework.codec.HardwareVideoEncoder.RunnableC856731 */

                static {
                    Covode.recordClassIndex(99909);
                }

                public void run() {
                    HardwareVideoEncoder.this.deliverEncodedImage();
                }
            });
        }
        if (z) {
            return encodeTextureBuffer(videoFrame);
        }
        return encodeByteBuffer(videoFrame);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:17|18|19|(1:21)|22|(2:24|25)|26|27|28) */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0073, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0074, code lost:
        com.p2082ss.avframework.utils.AVLog.m147806e("HardwareVideoEncoder", "queueInputBuffer failed\n".concat(java.lang.String.valueOf(r0)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0082, code lost:
        return -4;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x006b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int encodeByteBuffer(com.p2082ss.avframework.buffer.VideoFrame r14) {
        /*
        // Method dump skipped, instructions count: 171
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.avframework.codec.HardwareVideoEncoder.encodeByteBuffer(com.ss.avframework.buffer.VideoFrame):int");
    }

    private int encodeTextureBuffer(VideoFrame videoFrame) {
        long timestampNs;
        MethodCollector.m26663i(3116);
        if (this.noDropFrame) {
            this.frameInCount++;
        }
        try {
            VideoFrame.Buffer buffer = videoFrame.getBuffer();
            DtsQueue dtsQueue = this.mDtsQueue;
            if (dtsQueue != null) {
                timestampNs = dtsQueue.getPtsIn(videoFrame.getTimestampNs());
            } else {
                timestampNs = videoFrame.getTimestampNs();
            }
            if (!(buffer instanceof VideoFrame.TextureBuffer)) {
                MethodCollector.m26664o(3116);
                return -1;
            }
            VideoFrame.TextureBuffer textureBuffer = (VideoFrame.TextureBuffer) buffer;
            HardwareVideoEncodeRoi hardwareVideoEncodeRoi = this.mRoi;
            if (hardwareVideoEncodeRoi != null) {
                try {
                    hardwareVideoEncodeRoi.encodeWithRoi(this.codec, videoFrame, this.adjustedBitrate);
                } catch (Exception unused) {
                }
            }
            if (this.mSwap) {
                this.encoder_surface.nativeSwapBuffers();
            } else {
                this.mSwap = true;
            }
            if (textureBuffer.getType() == VideoFrame.TextureBuffer.Type.OES) {
                this.drawer.drawOes(textureBuffer.getTextureId(), null, RendererCommon.convertMatrixFromAndroidGraphicsMatrix(textureBuffer.getTransformMatrix()), 0, 0, this.width, this.height);
                if (GLThreadManager.isNeedFinish()) {
                    GLES20.glFinish();
                }
                GLES20.glFlush();
            } else {
                if (textureBuffer.getType() == VideoFrame.TextureBuffer.Type.RGB) {
                    this.drawer.drawRgb(textureBuffer.getTextureId(), null, RendererCommon.convertMatrixFromAndroidGraphicsMatrix(textureBuffer.getTransformMatrix()), 0, 0, this.width, this.height);
                }
                GLES20.glFlush();
            }
            int i = Build.VERSION.SDK_INT;
            EGLExt.eglPresentationTimeANDROID(this.currDisplay, this.currSurface, timestampNs);
            if (this.requestIDRFrame) {
                requestKeyFrame(timestampNs);
                this.requestIDRFrame = false;
            }
            MethodCollector.m26664o(3116);
            return 0;
        } catch (RuntimeException e) {
            AVLog.m147806e("HardwareVideoEncoder", "encodeTexture failed\n" + e.getMessage());
            MethodCollector.m26664o(3116);
            return -2;
        }
    }

    @Override // com.p2082ss.avframework.engine.VideoEncoder
    public boolean InitEncoder(TEBundle tEBundle) {
        if (this.mThreadChecker == null) {
            this.mThreadChecker = new ThreadUtils.ThreadChecker();
        }
        this.width = tEBundle.getInt("video_width");
        this.height = tEBundle.getInt("video_height");
        int i = tEBundle.getInt("video_fps");
        this.fps = i;
        if (i <= 0) {
            i = 25;
        }
        this.fps = i;
        this.noDropFrame = tEBundle.getBool("video_no_drop_frame");
        this.fixBFrameDts = tEBundle.getBool("video_fix_hardware_enc_dts");
        if (tEBundle.contains("video_const_time_period_gop")) {
            this.constTimePeriod = tEBundle.getBool("video_const_time_period_gop");
        }
        boolean bool = tEBundle.getBool("video_lossless_encode");
        this.lossless = bool;
        if (bool) {
            this.adjustedBitrate = ((((this.width * this.height) * this.fps) * 3) / 2) * 8;
        } else {
            this.adjustedBitrate = (int) tEBundle.getLong("video_bitrate");
        }
        int i2 = tEBundle.getInt("video_gop");
        int i3 = this.fps;
        this.keyFrameIntervalSec = i2 / i3;
        this.forcedKeyFrameNs = (long) (((i3 * 1000) * 1000) / 1000);
        if (tEBundle.getInt("configuration_type") == 0) {
            AVLog.ioe("HardwareVideoEncoder", "Value of TEBundle.kKeyVideoConfigurationType error, should be 1 (Annex-B)");
            return false;
        }
        boolean z = !tEBundle.getBool("video_is_yuv_frame");
        this.useSurfaceMode = z;
        if (!z ? this.yuvColorFormat != null : this.surfaceColorFormat != null) {
            if (this.mRoi == null) {
                this.mRoi = HardwareVideoEncodeRoi.createRoiProcessor(this.codecName, tEBundle);
            }
            return initEncodeInternal(tEBundle);
        }
        AVLog.ioe("HardwareVideoEncoder", "useSurfaceMode " + this.useSurfaceMode + ", surfaceColorFormat " + this.surfaceColorFormat + ", yuvColorFormat " + this.yuvColorFormat);
        return false;
    }

    @Override // com.p2082ss.avframework.engine.VideoEncoder
    public void SetBitrate(int i) {
        if (!this.lossless && this.codec != null && Build.VERSION.SDK_INT >= 21) {
            try {
                Bundle bundle = new Bundle();
                float f = (float) i;
                bundle.putInt("video-bitrate", (int) (this.bitateRatio * f));
                this.codec.setParameters(bundle);
                this.adjustedBitrate = i;
                AVLog.ioi("HardwareVideoEncoder", "update bitrate: " + i + " * " + this.bitateRatio + " = " + ((int) (f * this.bitateRatio)));
            } catch (IllegalStateException e) {
                Bundle bundle2 = new Bundle();
                bundle2.putInt("video-bitrate", (int) (((float) this.adjustedBitrate) * this.bitateRatio));
                this.codec.setParameters(bundle2);
                AVLog.ioi("HardwareVideoEncoder", "reset bitrate: " + this.adjustedBitrate + " * " + this.bitateRatio + " = " + ((int) (((float) this.adjustedBitrate) * this.bitateRatio)));
            } catch (Throwable unused) {
                AVLog.m147806e("HardwareVideoEncoder", "update bitrate failed".concat(String.valueOf(e)));
                AVLog.ioe("HardwareVideoEncoder", "Update bitrate failed new bitrate " + i + " old bitrate " + this.adjustedBitrate + " cause:" + e.getMessage());
            }
        }
    }

    private boolean initEncodeInternal(TEBundle tEBundle) {
        boolean z;
        int i;
        String str;
        int i2;
        MediaCodecInfo.CodecProfileLevel codecProfileLevel;
        DtsQueue dtsQueue;
        MethodCollector.m26663i(2851);
        this.lastKeyFrameNs = -1;
        try {
            MediaFormat createVideoFormat = MediaFormat.createVideoFormat(this.codecType, this.width, this.height);
            createVideoFormat.setInteger("bitrate", this.adjustedBitrate);
            if (tEBundle.getInt("video_is_cbr") == 1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                i = 2;
            } else {
                i = 1;
            }
            createVideoFormat.setInteger("bitrate-mode", i);
            StringBuilder sb = new StringBuilder("Set bitrate mode: ");
            if (z) {
                str = "CBR";
            } else {
                str = "VBR";
            }
            m147768xcd9a9802("HardwareVideoEncoder", sb.append(str).toString());
            createVideoFormat.setInteger("frame-rate", this.fps);
            if (this.constTimePeriod) {
                i2 = -1;
            } else {
                i2 = this.keyFrameIntervalSec;
            }
            AVLog.iow("HardwareVideoEncoder", "Using constant time period [" + this.constTimePeriod + "] with i frame interval [" + i2 + "s]");
            createVideoFormat.setInteger("i-frame-interval", i2);
            HardwareVideoEncodeRoi hardwareVideoEncodeRoi = this.mRoi;
            if (hardwareVideoEncodeRoi != null) {
                hardwareVideoEncodeRoi.configureRoi(createVideoFormat);
            }
            if (this.codecType.equals("video/avc")) {
                MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr = this.info.getCapabilitiesForType(this.codecType).profileLevels;
                int length = codecProfileLevelArr.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        codecProfileLevel = null;
                        break;
                    }
                    codecProfileLevel = codecProfileLevelArr[i3];
                    AVLog.m147805d("HardwareVideoEncoder", "Profile = " + codecProfileLevel.profile + ", Level = " + codecProfileLevel.level);
                    if (codecProfileLevel.profile == 1) {
                        AVLog.m147805d("HardwareVideoEncoder", "Support Baseline Profile!");
                    } else if (codecProfileLevel.profile == 2) {
                        AVLog.m147805d("HardwareVideoEncoder", "Support Main Profile!");
                    } else if (codecProfileLevel.profile == 8) {
                        AVLog.m147805d("HardwareVideoEncoder", "Support High Profile!");
                    }
                    if (codecProfileLevel.profile == mapProfileLevel(tEBundle.getInt("video_profileLevel"))) {
                        break;
                    }
                    i3++;
                }
                if (Build.VERSION.SDK_INT < 21 || codecProfileLevel == null) {
                    MethodCollector.m26664o(2851);
                    return false;
                }
                AVLog.m147805d("HardwareVideoEncoder", "Set Profile: " + codecProfileLevel.profile + ", Level = " + codecProfileLevel.level);
                createVideoFormat.setInteger("profile", codecProfileLevel.profile);
                createVideoFormat.setInteger("level", codecProfileLevel.level);
                if (this.fixBFrameDts) {
                    dtsQueue = new DtsQueueFixed();
                } else {
                    dtsQueue = new DtsQueue();
                }
                this.mDtsQueue = dtsQueue;
            } else if (this.codecType.equals(MediaCodecUtils.ByteVC1Mime)) {
                if (tEBundle.getInt("video_profileLevel") != 5) {
                    createVideoFormat.setInteger("profile", 1);
                } else {
                    createVideoFormat.setInteger("profile", 2);
                }
                createVideoFormat.setInteger("level", 256);
                this.mDtsQueue = new DtsQueue();
            } else {
                AVLog.ioe("HardwareVideoEncoder", "Unsupported codec type: " + this.codecType);
                MethodCollector.m26664o(2851);
                return false;
            }
            if (this.useSurfaceMode) {
                int i4 = Build.VERSION.SDK_INT;
                createVideoFormat.setInteger("color-format", this.surfaceColorFormat.intValue());
                MediaCodec createByCodecName = MediaCodec.createByCodecName(this.codecName);
                this.codec = createByCodecName;
                createByCodecName.configure(createVideoFormat, (Surface) null, (MediaCrypto) null, 1);
                try {
                    this.textureInputSurface = this.codec.createInputSurface();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                this.drawer = new GlRenderDrawer();
                GLSurface gLSurface = new GLSurface();
                this.encoder_surface = gLSurface;
                gLSurface.nativeSurfaceCreate(this.width, this.height, this.textureInputSurface);
                this.encoder_surface.nativeMakeCurrent();
                this.currDisplay = EGL14.eglGetCurrentDisplay();
                EGLSurface eglGetCurrentSurface = EGL14.eglGetCurrentSurface(12378);
                this.currSurface = eglGetCurrentSurface;
                if (eglGetCurrentSurface == null || this.currDisplay == null) {
                    IllegalStateException illegalStateException = new IllegalStateException("currSurface " + this.currSurface + ", currDisplay " + this.currDisplay);
                    MethodCollector.m26664o(2851);
                    throw illegalStateException;
                }
                this.codec.start();
            } else {
                createVideoFormat.setInteger("color-format", this.yuvColorFormat.intValue());
                MediaCodec createByCodecName2 = MediaCodec.createByCodecName(this.codecName);
                this.codec = createByCodecName2;
                createByCodecName2.configure(createVideoFormat, (Surface) null, (MediaCrypto) null, 1);
                this.codec.start();
            }
            AVLog.m147805d("HardwareVideoEncoder", "Format: ".concat(String.valueOf(createVideoFormat)));
            HardwareVideoEncodeRoi hardwareVideoEncodeRoi2 = this.mRoi;
            if (hardwareVideoEncodeRoi2 != null) {
                hardwareVideoEncodeRoi2.checkSupportRoi(this.codec, tEBundle);
                float roiSettingBitrateRatio = this.mRoi.getRoiSettingBitrateRatio();
                this.bitateRatio = roiSettingBitrateRatio;
                if (((double) Math.abs(roiSettingBitrateRatio - 1.0f)) > 1.0E-6d) {
                    SetBitrate(this.adjustedBitrate);
                }
            }
            SafeHandlerThread lockThread = SafeHandlerThreadPoolExecutor.lockThread("HwEncoderReadThread");
            this.outputThread = lockThread;
            lockThread.start();
            MethodCollector.m26664o(2851);
            return true;
        } catch (Exception e2) {
            AVLog.ioe("HardwareVideoEncoder", "initEncodeInternal failed: " + e2.getMessage());
            releaseCodec();
            MethodCollector.m26664o(2851);
            return false;
        }
    }

    public void setupCodecName(String str, String str2, Integer num, Integer num2) {
        this.codecName = str;
        this.codecType = str2;
        this.surfaceColorFormat = num;
        this.yuvColorFormat = num2;
        this.yuvFormat = YuvFormat.valueOf(num2.intValue());
    }
}
