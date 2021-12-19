package com.p2082ss.avframework.codec;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.view.Surface;
import com.bytedance.covode.number.Covode;
import com.p2082ss.avframework.engine.AudioEncoder;
import com.p2082ss.avframework.utils.AVLog;
import com.p2082ss.avframework.utils.SafeHandlerThread;
import com.p2082ss.avframework.utils.SafeHandlerThreadPoolExecutor;
import com.p2082ss.avframework.utils.TEBundle;
import com.p2082ss.avframework.utils.ThreadUtils;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.Queue;

/* renamed from: com.ss.avframework.codec.AACHWAudioEncoder */
public class AACHWAudioEncoder extends AudioEncoder {
    public static final String TAG = AACHWAudioEncoder.class.getSimpleName();
    private final int BYTEBUFFER_OPERATION_ERROR = -105;
    private final int FRAME_PARAM_ERROR = -101;
    private final int FRAME_SIZE_ERROR = -102;
    private final int MAX_BUFFER_SIZE = 50;
    private final int NO_AVAILABLE_BUFFER_ERROR = -103;
    private final int POST_RUNNABLE_ERROR = -104;
    public int mBitWidth;
    public int mBitrateBps;
    private final MediaCodec.BufferInfo mBufferInfo = new MediaCodec.BufferInfo();
    public final Queue<AudioFrameBuffer> mBufferQueue = new LinkedList();
    public int mChannelCount;
    public MediaCodec mCodec;
    private final String mCodecMime = "audio/mp4a-latm";
    private Runnable mEncodeRunnable;
    private SafeHandlerThread mEncodeThread;
    private Handler mHandler;
    public int mProfile;
    public int mSampleRateHz;

    public static String GetSupportedFormats() {
        return "audio_type=audio/mp4a-latm";
    }

    public int convertAacProfile(int i) {
        if (i == 1) {
            return 2;
        }
        if (i != 3) {
            return i != 4 ? -1 : 29;
        }
        return 5;
    }

    static {
        Covode.recordClassIndex(99890);
    }

    public AudioFrameBuffer pollFilledFrameBuffer() {
        AudioFrameBuffer audioFrameBuffer = null;
        for (AudioFrameBuffer audioFrameBuffer2 : this.mBufferQueue) {
            if (audioFrameBuffer2.mUsed == 1 && (audioFrameBuffer == null || audioFrameBuffer.mTimestampUs > audioFrameBuffer2.mTimestampUs)) {
                audioFrameBuffer = audioFrameBuffer2;
            }
        }
        return audioFrameBuffer;
    }

    /* access modifiers changed from: package-private */
    public boolean setupCodecName() {
        for (int i = 0; i < MediaCodecList.getCodecCount(); i++) {
            try {
                MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
                if (codecInfoAt != null && codecInfoAt.isEncoder()) {
                    for (String str : codecInfoAt.getSupportedTypes()) {
                        if ("audio/mp4a-latm".equals(str)) {
                            return true;
                        }
                    }
                    continue;
                }
            } catch (IllegalArgumentException e) {
                AVLog.ioe(TAG, "Cannot retrieve encoder codec info ".concat(String.valueOf(e)));
            }
        }
        return false;
    }

    AACHWAudioEncoder() {
        SafeHandlerThread lockThread = SafeHandlerThreadPoolExecutor.lockThread("AACHardwareEncodeThread");
        this.mEncodeThread = lockThread;
        lockThread.start();
        this.mHandler = this.mEncodeThread.getHandler();
    }

    private AudioFrameBuffer getAvailableFrameBuffer() {
        for (AudioFrameBuffer audioFrameBuffer : this.mBufferQueue) {
            if (audioFrameBuffer.mUsed == 0) {
                return audioFrameBuffer;
            }
        }
        AudioFrameBuffer audioFrameBuffer2 = null;
        if (this.mBufferQueue.size() < 50) {
            AudioFrameBuffer audioFrameBuffer3 = new AudioFrameBuffer();
            this.mBufferQueue.add(audioFrameBuffer3);
            return audioFrameBuffer3;
        }
        int i = 0;
        int i2 = 0;
        for (AudioFrameBuffer audioFrameBuffer4 : this.mBufferQueue) {
            if (audioFrameBuffer4.mUsed == 1) {
                i2++;
                audioFrameBuffer4.mUsed = 0;
                if (audioFrameBuffer2 == null) {
                    audioFrameBuffer2 = audioFrameBuffer4;
                }
            } else {
                i++;
            }
        }
        if (audioFrameBuffer2 != null) {
            AVLog.logToIODevice2(5, TAG, "Buffer queue size " + this.mBufferQueue.size() + ", dropped " + i2 + " audio frames.", null, "AACHWAudioEncoder.getAvailableFrameBuffer1", 10000);
            return audioFrameBuffer2;
        }
        AVLog.logToIODevice2(6, TAG, "Buffer queue size " + this.mBufferQueue.size() + ", " + i + " frames are in use.", null, "AACHWAudioEncoder.getAvailableFrameBuffer2", 10000);
        return audioFrameBuffer2;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0085 */
    @Override // com.p2082ss.avframework.engine.NativeObject, com.p2082ss.avframework.engine.AudioEncoder
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void release() {
        /*
        // Method dump skipped, instructions count: 153
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.avframework.codec.AACHWAudioEncoder.release():void");
    }

    public void releaseInternal() {
        MediaCodec mediaCodec = this.mCodec;
        if (mediaCodec != null) {
            try {
                int dequeueInputBuffer = mediaCodec.dequeueInputBuffer(1000000);
                if (dequeueInputBuffer >= 0) {
                    ByteBuffer byteBuffer = this.mCodec.getInputBuffers()[dequeueInputBuffer];
                    if (byteBuffer != null) {
                        byteBuffer.position(0);
                        byteBuffer.limit(0);
                    }
                    this.mCodec.queueInputBuffer(dequeueInputBuffer, 0, 0, 0, 4);
                } else {
                    AVLog.ioe(TAG, "Failed to get an available input buffer in 1 second.");
                }
                tryFetchEncodedFrame(true);
            } catch (Exception e) {
                AVLog.ioe(TAG, "signalEndOfInputStream failed\n" + e.getMessage());
            }
            try {
                MediaCodec mediaCodec2 = this.mCodec;
                if (mediaCodec2 != null) {
                    mediaCodec2.stop();
                }
            } catch (Exception e2) {
                AVLog.logKibana(6, TAG, "Encoder stop failed. message: " + e2.getMessage() + ", cause: " + e2.getCause() + ", stack: " + Log.getStackTraceString(e2), null);
            }
            try {
                MediaCodec mediaCodec3 = this.mCodec;
                this.mCodec = null;
                if (mediaCodec3 != null) {
                    mediaCodec3.release();
                }
            } catch (Exception e3) {
                AVLog.logKibana(6, TAG, "Encoder release failed. message: " + e3.getMessage() + ", cause: " + e3.getCause() + ", stack: " + Log.getStackTraceString(e3), null);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.avframework.codec.AACHWAudioEncoder$AudioFrameBuffer */
    public class AudioFrameBuffer {
        ByteBuffer mFrame;
        int mSamplesPerChannel;
        long mTimestampUs;
        volatile int mUsed;

        static {
            Covode.recordClassIndex(99894);
        }

        private AudioFrameBuffer() {
        }
    }

    @Override // com.p2082ss.avframework.engine.NativeObject
    public void setNativeObj(long j) {
        if (j == 0) {
            release();
        }
        super.setNativeObj(j);
    }

    @Override // com.p2082ss.avframework.engine.AudioEncoder
    public boolean InitEncoder(final TEBundle tEBundle) {
        final boolean[] zArr = new boolean[1];
        ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, new Runnable() {
            /* class com.p2082ss.avframework.codec.AACHWAudioEncoder.RunnableC856641 */

            static {
                Covode.recordClassIndex(99891);
            }

            public void run() {
                String str;
                AACHWAudioEncoder.this.mSampleRateHz = tEBundle.getInt("audio_sample");
                AACHWAudioEncoder.this.mChannelCount = tEBundle.getInt("audio_channels");
                AACHWAudioEncoder.this.mBitWidth = tEBundle.getInt("audio_bit_width");
                AACHWAudioEncoder.this.mBitrateBps = tEBundle.getInt("audio_bit_rate");
                AACHWAudioEncoder.this.mProfile = tEBundle.getInt("audio_profileLevel");
                if (AACHWAudioEncoder.this.mProfile == 1 || AACHWAudioEncoder.this.mProfile == 3) {
                    try {
                        AACHWAudioEncoder.this.mCodec = MediaCodec.createByCodecName("OMX.google.aac.encoder");
                    } catch (Exception e) {
                        e.printStackTrace();
                        AVLog.ioe(AACHWAudioEncoder.TAG, "MediaCodec.createByCodecName(\"OMX.google.aac.encoder\") failed: " + e.toString());
                        try {
                            AACHWAudioEncoder.this.mCodec = MediaCodec.createEncoderByType("audio/mp4a-latm");
                        } catch (Exception e2) {
                            e2.printStackTrace();
                            AVLog.ioe(AACHWAudioEncoder.TAG, "MediaCodec.createEncoderByType(\"audio/mp4a-latm\") failed: " + e2.toString());
                            zArr[0] = false;
                            return;
                        }
                    }
                    try {
                        MediaCodecInfo.CodecCapabilities capabilitiesForType = AACHWAudioEncoder.this.mCodec.getCodecInfo().getCapabilitiesForType("audio/mp4a-latm");
                        AACHWAudioEncoder aACHWAudioEncoder = AACHWAudioEncoder.this;
                        int convertAacProfile = aACHWAudioEncoder.convertAacProfile(aACHWAudioEncoder.mProfile);
                        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr = capabilitiesForType.profileLevels;
                        int length = codecProfileLevelArr.length;
                        int i = 0;
                        while (true) {
                            if (i < length) {
                                MediaCodecInfo.CodecProfileLevel codecProfileLevel = codecProfileLevelArr[i];
                                AVLog.iod(AACHWAudioEncoder.TAG, "Find profile = " + codecProfileLevel.profile);
                                if (codecProfileLevel.profile == convertAacProfile) {
                                    break;
                                }
                                i++;
                            } else {
                                String str2 = AACHWAudioEncoder.TAG;
                                StringBuilder sb = new StringBuilder("AAC Profile ");
                                AACHWAudioEncoder aACHWAudioEncoder2 = AACHWAudioEncoder.this;
                                AVLog.ioe(str2, sb.append(aACHWAudioEncoder2.getAacProfileName(aACHWAudioEncoder2.mProfile)).append(" not found. Use default LC profile.").toString());
                                if (AACHWAudioEncoder.this.mProfile != 1) {
                                    AACHWAudioEncoder.this.mCodec.release();
                                    AACHWAudioEncoder.this.mCodec = null;
                                    zArr[0] = false;
                                    return;
                                }
                            }
                        }
                        MediaFormat createAudioFormat = MediaFormat.createAudioFormat("audio/mp4a-latm", AACHWAudioEncoder.this.mSampleRateHz, AACHWAudioEncoder.this.mChannelCount);
                        createAudioFormat.setInteger("bitrate", AACHWAudioEncoder.this.mBitrateBps);
                        if (Build.VERSION.SDK_INT >= 29) {
                            str = "profile";
                        } else {
                            str = "aac-profile";
                        }
                        createAudioFormat.setInteger(str, convertAacProfile);
                        if (convertAacProfile == 29) {
                            createAudioFormat.setInteger("aac-sbr-mode", 2);
                        }
                        createAudioFormat.setInteger("max-input-size", ((AACHWAudioEncoder.this.mSampleRateHz * AACHWAudioEncoder.this.mChannelCount) * 2) / 20);
                        AACHWAudioEncoder.this.mCodec.configure(createAudioFormat, (Surface) null, (MediaCrypto) null, 1);
                        AACHWAudioEncoder.this.mCodec.start();
                        zArr[0] = true;
                    } catch (Exception e3) {
                        AVLog.logKibana(6, AACHWAudioEncoder.TAG, "init AAC Encoder failed. message: " + e3.getMessage() + ", cause: " + e3.getCause() + ", stack: " + Log.getStackTraceString(e3), null);
                        zArr[0] = false;
                        AACHWAudioEncoder.this.releaseInternal();
                    }
                } else {
                    AVLog.ioe(AACHWAudioEncoder.TAG, "MediaCodec doesn't support profile " + AACHWAudioEncoder.this.mProfile);
                    zArr[0] = false;
                }
            }
        });
        return zArr[0];
    }

    public String getAacProfileName(int i) {
        if (i == 1) {
            return "AAC-LC";
        }
        if (i == 3) {
            return "AAC-HE";
        }
        if (i != 4) {
            return "Unknown profile ".concat(String.valueOf(i));
        }
        return "AAC-HEv2";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0015, code lost:
        if (r2 >= 0) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void tryFetchEncodedFrame(boolean r13) {
        /*
        // Method dump skipped, instructions count: 114
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.avframework.codec.AACHWAudioEncoder.tryFetchEncodedFrame(boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00da, code lost:
        if (r16.mEncodeRunnable != null) goto L_0x00e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00dc, code lost:
        r16.mEncodeRunnable = new com.p2082ss.avframework.codec.AACHWAudioEncoder.RunnableC856652(r16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00e3, code lost:
        r1 = r16.mHandler;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00e5, code lost:
        if (r1 == null) goto L_0x00f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00ed, code lost:
        if (r1.post(r16.mEncodeRunnable) == false) goto L_0x00f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ef, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(2346);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00f3, code lost:
        return 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00f4, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(2346);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00f9, code lost:
        return -104;
     */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x016d  */
    @Override // com.p2082ss.avframework.engine.AudioEncoder
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int Encode(java.nio.ByteBuffer r17, int r18, int r19, int r20, long r21) {
        /*
        // Method dump skipped, instructions count: 461
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.avframework.codec.AACHWAudioEncoder.Encode(java.nio.ByteBuffer, int, int, int, long):int");
    }
}
