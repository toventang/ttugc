package com.p2082ss.android.ttve.mediacodec;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.text.TextUtils;
import android.view.Surface;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ttve.monitor.C30695h;
import com.p2082ss.android.vesdk.C85315al;
import com.p2082ss.android.vesdk.C85376ax;
import java.nio.ByteBuffer;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.ss.android.ttve.mediacodec.TEAudioHwEncoder */
public class TEAudioHwEncoder {
    private static long INPUT_DEQUEUE_TIMEOUT_US = 10000;
    private static int TRY_AGAIN_LATER_COUNT_LIMIT = 5;
    private MediaCodec audioEncoder;
    private LinkedBlockingQueue<C30655a> audioQueue = new LinkedBlockingQueue<>();
    private int curBitrate = -1;
    private int curChannelCount = -1;
    private int curCodecInfoAACProfile = -1;
    private String curMimeType;
    private int curSampleNumPerChannel = -1;
    private int curSampleRate = -1;
    private volatile boolean encoderStarted;
    private volatile long inputCountDequeued;
    private volatile boolean inputEof;
    private MediaFormat inputFormat;
    private byte[] outputAsc;
    private MediaCodec.BufferInfo outputBufferInfo = new MediaCodec.BufferInfo();
    private volatile long outputCountDequeued;
    private volatile boolean outputEof;
    private MediaFormat outputFormat;
    private int recordInputBufferSize = -1;
    private LinkedBlockingQueue<C30656b> remainingPcmQueue = new LinkedBlockingQueue<>();
    private C30655a theOldestAudioData = null;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ttve.mediacodec.TEAudioHwEncoder$a */
    public static class C30655a {

        /* renamed from: a */
        public byte[] f73297a;

        /* renamed from: b */
        public long f73298b;

        /* renamed from: c */
        public int f73299c;

        static {
            Covode.recordClassIndex(37206);
        }

        private C30655a() {
        }

        /* synthetic */ C30655a(byte b) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ttve.mediacodec.TEAudioHwEncoder$b */
    public static class C30656b {

        /* renamed from: a */
        public byte[] f73300a;

        /* renamed from: b */
        public long f73301b;

        static {
            Covode.recordClassIndex(37207);
        }

        private C30656b() {
        }

        /* synthetic */ C30656b(byte b) {
            this();
        }
    }

    private byte[] getOutputAsc() {
        return this.outputAsc;
    }

    private int restartEncoder() {
        releaseEncoder();
        return startEncoder();
    }

    static {
        Covode.recordClassIndex(37205);
    }

    private byte[] getAudioData() {
        C30655a aVar = this.theOldestAudioData;
        if (aVar != null) {
            return aVar.f73297a;
        }
        return null;
    }

    private long getAudioPts() {
        C30655a aVar = this.theOldestAudioData;
        if (aVar != null) {
            return aVar.f73298b;
        }
        return -1;
    }

    private void resetCodecInfo() {
        this.inputCountDequeued = 0;
        this.outputCountDequeued = 0;
        this.inputEof = false;
        this.outputEof = false;
        this.remainingPcmQueue.clear();
        this.audioQueue.clear();
    }

    private TEAudioHwEncoder() {
    }

    private int closeEncoder() {
        C85315al.m146637a("TEAudioHwEncoder", "closeEncoder, remainingPcmQueue size: " + this.remainingPcmQueue.size() + ", audioQueue size: " + this.audioQueue.size() + ", inputCountDequeued: " + this.inputCountDequeued + ", outputCountDequeued: " + this.outputCountDequeued);
        releaseEncoder();
        this.curMimeType = null;
        this.curSampleRate = -1;
        this.curChannelCount = -1;
        this.curSampleRate = -1;
        this.curCodecInfoAACProfile = -1;
        this.curSampleNumPerChannel = -1;
        this.outputAsc = null;
        return 0;
    }

    private void releaseEncoder() {
        if (this.audioEncoder != null) {
            try {
                if (this.encoderStarted) {
                    try {
                        this.audioEncoder.stop();
                    } catch (Exception e) {
                        C85315al.m146642d("TEAudioHwEncoder", "MediaCodec stop exception: " + e.getMessage());
                    }
                    this.encoderStarted = false;
                }
                this.audioEncoder.release();
                this.audioEncoder = null;
            } catch (Exception e2) {
                C85315al.m146642d("TEAudioHwEncoder", "releaseEncoder: " + e2.getMessage());
            } finally {
                resetCodecInfo();
            }
        }
    }

    private int startEncoder() {
        try {
            MediaCodec selectMediaCodec = selectMediaCodec();
            this.audioEncoder = selectMediaCodec;
            if (selectMediaCodec == null) {
                C85315al.m146642d("TEAudioHwEncoder", "create encoder failure, mime: " + this.curMimeType);
                return -201;
            }
            selectMediaCodec.configure(this.inputFormat, (Surface) null, (MediaCrypto) null, 1);
            this.audioEncoder.start();
            this.encoderStarted = true;
            return 0;
        } catch (Exception e) {
            C85315al.m146642d("TEAudioHwEncoder", "startEncoder: " + e.getMessage());
            return -203;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0037 A[SYNTHETIC, Splitter:B:11:0x0037] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0059  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.media.MediaCodec selectMediaCodec() {
        /*
        // Method dump skipped, instructions count: 182
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ttve.mediacodec.TEAudioHwEncoder.selectMediaCodec():android.media.MediaCodec");
    }

    private MediaCodecInfo getGoogleEncoderCodecInfo() {
        String[] supportedTypes;
        String[] supportedTypes2;
        if (TextUtils.isEmpty(this.curMimeType)) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            MediaCodecInfo[] codecInfos = new MediaCodecList(1).getCodecInfos();
            for (MediaCodecInfo mediaCodecInfo : codecInfos) {
                if (mediaCodecInfo.isEncoder() && mediaCodecInfo.getName().contains("OMX.google") && (supportedTypes2 = mediaCodecInfo.getSupportedTypes()) != null) {
                    int length = supportedTypes2.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            continue;
                            break;
                        } else if (supportedTypes2[i].equalsIgnoreCase(this.curMimeType)) {
                            MediaCodecInfo.AudioCapabilities audioCapabilities = mediaCodecInfo.getCapabilitiesForType(this.curMimeType).getAudioCapabilities();
                            if (audioCapabilities == null) {
                                C85315al.m146642d("TEAudioHwEncoder", mediaCodecInfo.getName() + " null audio capabilities");
                            } else if (!audioCapabilities.isSampleRateSupported(this.curSampleRate)) {
                                C85315al.m146642d("TEAudioHwEncoder", mediaCodecInfo.getName() + " not support SampleRate: " + this.curSampleRate);
                            } else if (this.curChannelCount <= audioCapabilities.getMaxInputChannelCount()) {
                                return mediaCodecInfo;
                            } else {
                                C85315al.m146642d("TEAudioHwEncoder", mediaCodecInfo.getName() + " not support ChannelCount: " + this.curChannelCount + ", max channel count is " + audioCapabilities.getMaxInputChannelCount());
                            }
                        } else {
                            i++;
                        }
                    }
                }
            }
        } else {
            int codecCount = MediaCodecList.getCodecCount();
            for (int i2 = 0; i2 < codecCount; i2++) {
                MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i2);
                if (codecInfoAt.isEncoder() && codecInfoAt.getName().contains("OMX.google") && (supportedTypes = codecInfoAt.getSupportedTypes()) != null) {
                    for (String str : supportedTypes) {
                        if (str.equalsIgnoreCase(this.curMimeType)) {
                            return codecInfoAt;
                        }
                    }
                    continue;
                }
            }
        }
        return null;
    }

    private void addAudioData(byte[] bArr) {
        C30655a aVar = new C30655a((byte) 0);
        aVar.f73297a = bArr;
        aVar.f73298b = this.outputBufferInfo.presentationTimeUs;
        aVar.f73299c = this.outputBufferInfo.flags;
        this.audioQueue.add(aVar);
    }

    private ByteBuffer geOutputBufferByIndex(int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            return this.audioEncoder.getOutputBuffer(i);
        }
        return this.audioEncoder.getOutputBuffers()[i];
    }

    private ByteBuffer getInputBufferByIndex(int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            return this.audioEncoder.getInputBuffer(i);
        }
        return this.audioEncoder.getInputBuffers()[i];
    }

    private int drainOutputBuffer(boolean z) {
        long j;
        byte[] bArr;
        loop0:
        while (true) {
            int i = 0;
            while (true) {
                try {
                    if (this.outputEof) {
                        break loop0;
                    }
                    MediaCodec mediaCodec = this.audioEncoder;
                    MediaCodec.BufferInfo bufferInfo = this.outputBufferInfo;
                    if (i > 0) {
                        j = 10000;
                    } else {
                        j = 0;
                    }
                    int dequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, j);
                    if (dequeueOutputBuffer < 0) {
                        if (dequeueOutputBuffer != -3) {
                            if (dequeueOutputBuffer != -2) {
                                if (dequeueOutputBuffer != -1) {
                                    C85315al.m146639b("TEAudioHwEncoder", "not available output buffer");
                                    break loop0;
                                }
                                if (z) {
                                    C85315al.m146639b("TEAudioHwEncoder", "dequeue output buffer timeout, try again later");
                                }
                                if (!this.inputEof && (!z || ((bArr = this.outputAsc) != null && bArr.length > 0))) {
                                    break loop0;
                                }
                                i++;
                                C85315al.m146637a("TEAudioHwEncoder", "inputEof, tryAgainLaterCount: ".concat(String.valueOf(i)));
                                if (i > TRY_AGAIN_LATER_COUNT_LIMIT) {
                                    C85315al.m146639b("TEAudioHwEncoder", "dequeue output buffer timeout, tryAgainLaterCount: ".concat(String.valueOf(i)));
                                    break loop0;
                                }
                            } else {
                                this.outputFormat = this.audioEncoder.getOutputFormat();
                                C85315al.m146637a("TEAudioHwEncoder", "output buffer format changed: " + this.outputFormat);
                                int integer = this.outputFormat.getInteger("sample-rate");
                                int integer2 = this.outputFormat.getInteger("channel-count");
                                if (!(this.curSampleRate == integer && this.curChannelCount == integer2)) {
                                    C85315al.m146642d("TEAudioHwEncoder", "audio meta info changed, error error error !!!");
                                }
                                ByteBuffer byteBuffer = this.outputFormat.getByteBuffer("csd-0");
                                if (byteBuffer.remaining() > 0) {
                                    byte[] bArr2 = new byte[byteBuffer.remaining()];
                                    byteBuffer.get(bArr2);
                                    this.outputAsc = bArr2;
                                }
                            }
                        } else {
                            C85315al.m146637a("TEAudioHwEncoder", "output buffer changed, need to getOutputBuffers again");
                            break;
                        }
                    } else {
                        if (this.outputBufferInfo.size > 0) {
                            ByteBuffer geOutputBufferByIndex = geOutputBufferByIndex(dequeueOutputBuffer);
                            geOutputBufferByIndex.position(this.outputBufferInfo.offset);
                            geOutputBufferByIndex.limit(this.outputBufferInfo.offset + this.outputBufferInfo.size);
                            byte[] bArr3 = new byte[this.outputBufferInfo.size];
                            geOutputBufferByIndex.get(bArr3);
                            if ((this.outputBufferInfo.flags & 2) != 0) {
                                this.outputAsc = bArr3;
                                C85315al.m146637a("TEAudioHwEncoder", "output BUFFER_FLAG_CODEC_CONFIG, asc size: " + this.outputBufferInfo.size + ", pts: " + this.outputBufferInfo.presentationTimeUs);
                            } else {
                                if (this.outputCountDequeued > 0 && this.outputBufferInfo.presentationTimeUs <= 0) {
                                    C85315al.m146642d("TEAudioHwEncoder", "outputCountDequeued: " + this.outputCountDequeued + ", size: " + this.outputBufferInfo.size + ", pts: " + this.outputBufferInfo.presentationTimeUs);
                                }
                                addAudioData(bArr3);
                                this.outputCountDequeued++;
                            }
                        }
                        this.audioEncoder.releaseOutputBuffer(dequeueOutputBuffer, false);
                        if ((this.outputBufferInfo.flags & 4) != 0) {
                            C85315al.m146637a("TEAudioHwEncoder", "output buffer eof");
                            this.outputEof = true;
                            break;
                        }
                    }
                } catch (Throwable th) {
                    C85315al.m146642d("TEAudioHwEncoder", "drainOutputBuffer error: " + th.getMessage());
                    return -60010;
                }
            }
        }
        return 0;
    }

    private void addPcmData(byte[] bArr, long j) {
        C30656b bVar = new C30656b((byte) 0);
        bVar.f73300a = bArr;
        bVar.f73301b = j;
        this.remainingPcmQueue.add(bVar);
    }

    /* access modifiers changed from: package-private */
    public int encodeFrame(byte[] bArr, long j) {
        C30656b poll;
        int i = -50010;
        if (C85376ax.f191106g == C85376ax.EnumC85377a.AUDIO_ENC_ENCODING_FALLBACK.getValue()) {
            C85315al.m146642d("TEAudioHwEncoder", "TESTING! HW AUDIO ENC ENCODING FALLBACK");
            return -50010;
        }
        try {
            if (!this.inputEof) {
                addPcmData(bArr, j);
            }
            int i2 = 0;
            while (true) {
                if (this.inputEof || this.remainingPcmQueue.isEmpty() || (poll = this.remainingPcmQueue.poll()) == null) {
                    break;
                }
                int dequeueInputBuffer = this.audioEncoder.dequeueInputBuffer(INPUT_DEQUEUE_TIMEOUT_US);
                if (dequeueInputBuffer < 0) {
                    if (dequeueInputBuffer != -1) {
                        C85315al.m146639b("TEAudioHwEncoder", "not available input buffer");
                        break;
                    }
                    C85315al.m146639b("TEAudioHwEncoder", "dequeue input buffer timeout, try again later");
                    i2++;
                    if (i2 > TRY_AGAIN_LATER_COUNT_LIMIT) {
                        C85315al.m146639b("TEAudioHwEncoder", "dequeue input buffer timeout, tryAgainLaterCount: ".concat(String.valueOf(i2)));
                        break;
                    }
                } else if (poll.f73300a == null || poll.f73300a.length <= 0) {
                    this.audioEncoder.queueInputBuffer(dequeueInputBuffer, 0, 0, poll.f73301b, 4);
                    this.inputEof = true;
                    C85315al.m146637a("TEAudioHwEncoder", "input buffer eof, remainingPcmQueue size: " + this.remainingPcmQueue.size());
                } else {
                    int length = poll.f73300a.length;
                    ByteBuffer inputBufferByIndex = getInputBufferByIndex(dequeueInputBuffer);
                    inputBufferByIndex.clear();
                    int remaining = inputBufferByIndex.remaining();
                    if (length > remaining) {
                        C85315al.m146642d("TEAudioHwEncoder", "input buffer not enough, audio data size: " + length + ", buffer available size: " + remaining);
                    } else if (remaining != this.recordInputBufferSize) {
                        C85315al.m146637a("TEAudioHwEncoder", "recordInputBufferSize changed, old: " + this.recordInputBufferSize + ", new: " + remaining);
                        this.recordInputBufferSize = remaining;
                    }
                    int min = Math.min(length, remaining);
                    inputBufferByIndex.put(poll.f73300a, 0, min);
                    this.audioEncoder.queueInputBuffer(dequeueInputBuffer, 0, min, poll.f73301b, 0);
                    this.inputCountDequeued++;
                }
            }
            i = drainOutputBuffer(false);
            if (i < 0) {
                return i;
            }
            if (!this.audioQueue.isEmpty() || !this.outputEof) {
                C30655a poll2 = this.audioQueue.poll();
                this.theOldestAudioData = poll2;
                if (poll2 != null) {
                    return poll2.f73297a.length;
                }
                return 0;
            }
            C85315al.m146637a("TEAudioHwEncoder", "encoder all EOF");
            return -1024;
        } catch (Throwable th) {
            C85315al.m146642d("TEAudioHwEncoder", "drainOutputBuffer error: " + th.getMessage());
        }
    }

    private int initEncoder(String str, int i, int i2, int i3, int i4, int i5) {
        int i6;
        boolean z;
        int i7;
        int i8;
        int i9;
        if (C85376ax.f191106g == C85376ax.EnumC85377a.AUDIO_ENC_INIT_FALLBACK.getValue()) {
            C85315al.m146642d("TEAudioHwEncoder", "TESTING! HW AUDIO ENC INIT FALLBACK");
            return -203;
        } else if (TextUtils.isEmpty(str) || i <= 0 || i2 <= 0 || i3 <= 0 || i4 <= 0 || i5 <= 0) {
            C85315al.m146642d("TEAudioHwEncoder", "initEncoder invalid param, mimeType: " + str + ", profile: " + i + ", sampleRate: " + i2 + ", channelCount: " + i3 + ", bitrate: " + i4 + ", sampleNumPerChannel: " + i5);
            C30695h.m63062a(1, "te_composition_audio_create_hw_encoder", 2L);
            return -101;
        } else {
            if (i == 2) {
                i6 = 5;
            } else {
                i6 = 2;
            }
            if (str.equals(this.curMimeType) && this.curCodecInfoAACProfile == i6 && this.curSampleRate == i2 && this.curChannelCount == i3 && this.curSampleNumPerChannel == i5) {
                z = false;
            } else {
                z = true;
            }
            this.curMimeType = str;
            this.curCodecInfoAACProfile = i6;
            this.curSampleRate = i2;
            this.curChannelCount = i3;
            this.curBitrate = i4;
            this.curSampleNumPerChannel = i5;
            C85315al.m146637a("TEAudioHwEncoder", "initEncoder, mimeType: " + str + ", codecInfoAACProfile: " + i6 + ", sampleRate: " + i2 + ", channelCount: " + i3 + ", bitrate: " + i4 + ", sampleNumPerChannel: " + i5);
            if (z || !this.encoderStarted) {
                MediaFormat createAudioFormat = MediaFormat.createAudioFormat(str, i2, i3);
                this.inputFormat = createAudioFormat;
                createAudioFormat.setInteger("bitrate", i4);
                this.inputFormat.setInteger("aac-profile", 2);
                int i10 = this.curChannelCount * i5 * 2 * 2;
                this.inputFormat.setInteger("max-input-size", i10);
                C85315al.m146637a("TEAudioHwEncoder", "KEY_MAX_INPUT_SIZE: ".concat(String.valueOf(i10)));
                i7 = restartEncoder();
                if (i7 != 0) {
                    i8 = 1;
                    i9 = 1;
                    C30695h.m63062a(i8, "te_composition_audio_create_hw_encoder", (long) i9);
                    C85315al.m146637a("TEAudioHwEncoder", "initEncoder, result: " + i7 + ", monitor: " + i9);
                    return i7;
                }
            }
            C85315al.m146637a("TEAudioHwEncoder", "initEncoder, try to get asc start");
            i8 = 1;
            i7 = drainOutputBuffer(true);
            C85315al.m146637a("TEAudioHwEncoder", "initEncoder, try to get asc end");
            if (i7 == 0) {
                i9 = 0;
            } else {
                i9 = 3;
            }
            C30695h.m63062a(i8, "te_composition_audio_create_hw_encoder", (long) i9);
            C85315al.m146637a("TEAudioHwEncoder", "initEncoder, result: " + i7 + ", monitor: " + i9);
            return i7;
        }
    }
}
