package com.p2082ss.android.vesdk.audio;

import android.content.Context;
import android.content.pm.PackageManager;
import android.media.AudioRecord;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ttve.audio.C30635a;
import com.p2082ss.android.ttve.model.EnumC30678f;
import com.p2082ss.android.ttve.monitor.C30695h;
import com.p2082ss.android.vesdk.C85310ah;
import com.p2082ss.android.vesdk.C85315al;
import com.p2082ss.android.vesdk.C85400c;
import com.p2082ss.android.vesdk.C85521l;
import com.p2082ss.android.vesdk.VESensService;
import com.p2082ss.android.vesdk.runtime.VERuntime;
import java.nio.ByteBuffer;

/* renamed from: com.ss.android.vesdk.audio.TEAudioRecord */
public class TEAudioRecord implements AbstractC85332b {
    private static final int[] SUGGEST_CHANNEL_ARRAY = {2, 1, 0};
    private static final int[] SUGGEST_SAMPLERATE_ARRAY = {44100, 8000, 11025, 16000, 22050};
    private static final String TAG = TEAudioRecord.class.getSimpleName();
    private int hasInited = -1;
    public AbstractC85334d mAudioCallback;
    public C85521l mAudioCaptureSettings;
    public AudioRecord mAudioRecord;
    private long mAudioRecordStartTime;
    private long mAudioRecordStopTime;
    private int mAudioSource = 1;
    private int mBitsPerSample = 16;
    public int mBufferSizeInBytes;
    public ByteBuffer mByteBuffer;
    private int mChannels = 2;
    public Handler mHandler;
    public double mSampleNanoTimePerSecond;
    private int mSampleRate = 44100;
    public int mSampleSize;
    public C85338f mTimestampStrategy;

    private int getSysAudioFormat(int i) {
        if (i != 8) {
            return i != 16 ? 1 : 2;
        }
        return 3;
    }

    private int getSysAudioSource(int i) {
        int i2 = 1;
        if (i != 1) {
            i2 = 5;
            if (i != 5) {
                i2 = 6;
                if (i != 6) {
                    return 0;
                }
            }
        }
        return i2;
    }

    private int getSysChannelConfig(int i) {
        if (i != 1) {
            return i != 2 ? 1 : 12;
        }
        return 16;
    }

    public void setAudioDevice(C85341i iVar) {
    }

    public int getBufferSize() {
        return this.mBufferSizeInBytes;
    }

    public int getChannels() {
        return this.mChannels;
    }

    public ByteBuffer getPcmBuffer() {
        return this.mByteBuffer;
    }

    public int getSampleRate() {
        return this.mSampleRate;
    }

    public int getRecordingState() {
        return this.mAudioRecord.getRecordingState();
    }

    public int getState() {
        return this.mAudioRecord.getState();
    }

    public void release() {
        release(null);
    }

    public int start() {
        return start(null);
    }

    public int stop() {
        return stop(null);
    }

    public int init() {
        return init(this.mAudioSource, this.mSampleRate, this.mChannels, this.mBitsPerSample);
    }

    public TEAudioRecord() {
    }

    /* access modifiers changed from: protected */
    public void openPrivacy() {
        VESensService.getInstance().setSensCheckObjStatus(VESensService.getInstance().getIDWithName(VESensService.SENS_SERVICE_TYPE_MIC), VESensService.EnumC85266b.PRIVACY_STATUS_USING);
    }

    /* access modifiers changed from: protected */
    public void releasePrivacy() {
        VESensService.getInstance().setSensCheckObjStatus(VESensService.getInstance().getIDWithName(VESensService.SENS_SERVICE_TYPE_MIC), VESensService.EnumC85266b.PRIVACY_STATUS_RELEASE);
    }

    static {
        Covode.recordClassIndex(99441);
    }

    public int read() {
        AudioRecord audioRecord = this.mAudioRecord;
        if (audioRecord == null) {
            return -108;
        }
        if (audioRecord.getRecordingState() != 3) {
            return -105;
        }
        try {
            int read = this.mAudioRecord.read(this.mByteBuffer, this.mBufferSizeInBytes);
            if (read > 0 && this.mAudioRecordStartTime != 0) {
                C30695h.m63062a(0, "te_record_audio_first_frame", System.currentTimeMillis() - this.mAudioRecordStartTime);
                this.mAudioRecordStartTime = 0;
            }
            return read;
        } catch (Exception unused) {
            return -1;
        }
    }

    @Override // com.p2082ss.android.vesdk.audio.AbstractC85332b
    public void setAudioCallback(AbstractC85334d dVar) {
        this.mAudioCallback = dVar;
    }

    @Override // com.p2082ss.android.vesdk.audio.AbstractC85332b
    public void setHandler(Handler handler) {
        this.mHandler = handler;
    }

    public int init(int i) {
        this.mAudioSource = i;
        return init(i, this.mSampleRate, this.mChannels, this.mBitsPerSample);
    }

    @Override // com.p2082ss.android.vesdk.audio.AbstractC85331a
    public void release(PrivacyCert privacyCert) {
        if (this.mAudioRecord != null) {
            long currentTimeMillis = System.currentTimeMillis();
            C85400c.m146938c(privacyCert, this.mAudioRecord);
            this.hasInited = -1;
            C30695h.m63062a(0, "te_record_audio_release_record_time", System.currentTimeMillis() - currentTimeMillis);
        }
    }

    public TEAudioRecord(C85338f fVar) {
        this.mTimestampStrategy = fVar;
    }

    public int read(byte[] bArr) {
        AudioRecord audioRecord = this.mAudioRecord;
        if (audioRecord == null) {
            return -108;
        }
        if (audioRecord.getRecordingState() != 3) {
            return -105;
        }
        try {
            int read = this.mAudioRecord.read(bArr, 0, this.mBufferSizeInBytes);
            if (read > 0 && this.mAudioRecordStartTime != 0) {
                C30695h.m63062a(0, "te_record_audio_first_frame", System.currentTimeMillis() - this.mAudioRecordStartTime);
                this.mAudioRecordStartTime = 0;
            }
            return read;
        } catch (Exception unused) {
            return -1;
        }
    }

    @Override // com.p2082ss.android.vesdk.audio.AbstractC85331a
    public int stop(PrivacyCert privacyCert) {
        this.mAudioRecordStartTime = 0;
        this.mAudioRecordStopTime = System.currentTimeMillis();
        AudioRecord audioRecord = this.mAudioRecord;
        if (audioRecord == null) {
            return -108;
        }
        if (audioRecord.getState() != 1) {
            return -105;
        }
        try {
            C85400c.m146936b(privacyCert, this.mAudioRecord);
            C85315al.m146637a(TAG, "stop hashCode:" + this.mAudioRecord.hashCode());
            releasePrivacy();
        } catch (Exception e) {
            C85315al.m146642d(TAG, Log.getStackTraceString(e));
        }
        C30695h.m63062a(0, "te_record_audio_stop_record_time", System.currentTimeMillis() - this.mAudioRecordStopTime);
        return 0;
    }

    @Override // com.p2082ss.android.vesdk.audio.AbstractC85331a
    public int init(C85521l lVar) {
        this.mAudioCaptureSettings = lVar;
        int init = init(lVar.f191578d, lVar.f191576b, lVar.f191575a, lVar.f191577c);
        if (!(this.mAudioCallback == null || this.mAudioCaptureSettings == null)) {
            C85521l.C85522a aVar = new C85521l.C85522a(this.mAudioCaptureSettings);
            aVar.f191584a.f191576b = this.mSampleRate;
            aVar.f191584a.f191575a = this.mChannels;
            aVar.f191584a.f191577c = this.mBitsPerSample;
            this.mAudioCallback.mo130665a(C85310ah.f190925M, 0, 0.0d, this.mAudioCaptureSettings);
        }
        C30695h.m63062a(0, "te_record_audio_mic_type", 1L);
        C30695h.m63062a(0, "te_record_audio_mic_sample_rate", (long) this.mSampleRate);
        int i = this.mBufferSizeInBytes;
        int i2 = this.mChannels;
        if (i2 == 0) {
            i2 = 1;
        }
        C30695h.m63062a(0, "te_record_audio_mic_frame_per_buffer", (long) ((i / i2) / 2));
        return init;
    }

    @Override // com.p2082ss.android.vesdk.audio.AbstractC85331a
    public int start(PrivacyCert privacyCert) {
        this.mAudioRecordStartTime = System.currentTimeMillis();
        AudioRecord audioRecord = this.mAudioRecord;
        if (audioRecord == null) {
            return -108;
        }
        if (audioRecord.getState() != 1) {
            return -105;
        }
        if (this.mAudioRecord.getRecordingState() == 3) {
            return -2;
        }
        try {
            C85400c.m146933a(privacyCert, this.mAudioRecord);
            C85315al.m146637a(TAG, "start hashCode:" + this.mAudioRecord.hashCode());
            openPrivacy();
            C85338f fVar = this.mTimestampStrategy;
            if (fVar != null) {
                fVar.f191047b = 0;
                Context context = VERuntime.EnumC85549a.INSTANCE.f191667b.f191642a;
                if (context == null) {
                    C85315al.m146642d(C85338f.f191046a, "context null");
                } else {
                    PackageManager packageManager = context.getPackageManager();
                    if (packageManager == null) {
                        C85315al.m146642d(C85338f.f191046a, "pm null");
                    } else if (packageManager.hasSystemFeature("android.hardware.audio.pro")) {
                        fVar.f191048c = 0;
                    }
                }
            }
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.post(new Runnable() {
                    /* class com.p2082ss.android.vesdk.audio.TEAudioRecord.RunnableC853301 */

                    static {
                        Covode.recordClassIndex(99442);
                    }

                    /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final void run() {
                        /*
                        // Method dump skipped, instructions count: 359
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.vesdk.audio.TEAudioRecord.RunnableC853301.run():void");
                    }
                });
            }
            C30695h.m63062a(0, "te_record_audio_start_record_time", System.currentTimeMillis() - this.mAudioRecordStartTime);
            return 0;
        } catch (Exception e) {
            C85315al.m146642d(TAG, Log.getStackTraceString(e));
            release(null);
            return -603;
        }
    }

    public int init(int i, int i2, int i3) {
        return init(this.mAudioSource, i, i2, i3);
    }

    public int init(int i, int i2, int i3, int i4) {
        String str = TAG;
        C85315al.m146637a(str, "init audioSource: " + i + ", sampleRate: " + i2 + ", channels: " + i3 + ", bitsPerSample: " + i4);
        if (this.hasInited == 0) {
            C85315al.m146637a(str, "has inited");
            return 0;
        }
        int initAudioRecord = initAudioRecord(i, i2, i3, i4);
        if (initAudioRecord == 0) {
            this.hasInited = 0;
            return 0;
        }
        release(null);
        int[] iArr = SUGGEST_SAMPLERATE_ARRAY;
        for (int i5 : iArr) {
            for (int i6 : SUGGEST_CHANNEL_ARRAY) {
                initAudioRecord = initAudioRecord(i, i5, i6, i4);
                if (initAudioRecord == 0) {
                    return 0;
                }
                release(null);
            }
        }
        this.hasInited = initAudioRecord;
        return initAudioRecord;
    }

    private int initAudioRecord(int i, int i2, int i3, int i4) {
        int sysAudioSource = getSysAudioSource(i);
        int sysChannelConfig = getSysChannelConfig(i3);
        int sysAudioFormat = getSysAudioFormat(i4);
        int minBufferSize = AudioRecord.getMinBufferSize(i2, sysChannelConfig, sysAudioFormat);
        try {
            AudioRecord audioRecord = new AudioRecord(sysAudioSource, i2, sysChannelConfig, sysAudioFormat, minBufferSize);
            this.mAudioRecord = audioRecord;
            if (audioRecord.getState() == 1) {
                C85521l lVar = this.mAudioCaptureSettings;
                if (lVar != null && lVar.f191583i && Build.VERSION.SDK_INT >= 23 && C30635a.m62960a() == EnumC30678f.BLUETOOTH) {
                    this.mAudioRecord.setPreferredDevice(C30635a.m62962b());
                }
                this.mSampleRate = i2;
                this.mChannels = i3;
                this.mBitsPerSample = i4;
                C85315al.m146637a(TAG, "Init audio recorder succeed, apply audio record sample rate " + this.mSampleRate + " channels " + this.mChannels + " buffer " + this.mBufferSizeInBytes + " state " + this.mAudioRecord.getState());
                this.mBufferSizeInBytes = minBufferSize;
                this.mByteBuffer = ByteBuffer.allocateDirect(minBufferSize);
                double d = (double) this.mSampleRate;
                Double.isNaN(d);
                this.mSampleNanoTimePerSecond = 1.0E9d / d;
                this.mSampleSize = (this.mChannels * this.mBitsPerSample) / 8;
                return 0;
            }
            throw new Exception("Audio record is not initialized![" + this.mSampleRate + "," + this.mChannels + "," + i4);
        } catch (Exception e) {
            C85315al.m146642d(TAG, Log.getStackTraceString(e));
            release(null);
            this.mSampleRate = 44100;
            this.mChannels = 2;
            this.mBitsPerSample = 16;
            return -100;
        }
    }
}
