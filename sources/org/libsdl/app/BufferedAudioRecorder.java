package org.libsdl.app;

import android.media.AudioRecord;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.C15346a;
import com.p2082ss.android.medialib.p2154a.RunnableC29977a;
import com.p2082ss.android.medialib.presenter.C30031g;
import com.p2082ss.android.medialib.presenter.C30048h;
import com.p2082ss.android.ttve.monitor.C30683b;
import com.p2082ss.android.ttve.monitor.C30695h;
import com.p2082ss.android.vesdk.C85315al;
import com.p2082ss.android.vesdk.C85568t;
import com.p2082ss.android.vesdk.VESensService;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

public class BufferedAudioRecorder {
    protected static int channelConfigOffset = -1;
    protected static int[] channelConfigSuggested = {12, 16, 1};
    protected static int sampleRateOffset = -1;
    protected static int[] sampleRateSuggested = {44100, 8000, 11025, 16000, 22050};
    AudioRecord audio;
    final int audioFormat;
    private C30048h audioMonitor;
    int audioSource;
    int bufferSizeInBytes;
    int channelConfig;
    private final int encodeBitRate;
    private final int encodeChannels;
    private final int encodeSampleRate;
    boolean isRecording;
    boolean isStopPCMCallback;
    boolean isStopped;
    public long mAudioRecordStartTime;
    public boolean mEnableMicBgmDelayOpt;
    private int mMicRestartCount;
    private ConcurrentHashMap mMicStartInfoMap;
    private int mMicState;
    RunnableC29977a mProcessThread;
    private RecordingState mRecordingState;
    private C30031g.AbstractC30044b mStateCallback;
    AudioRecorderInterfaceExt presenter;
    int sampleRateInHz;

    /* renamed from: org_libsdl_app_BufferedAudioRecorder_android_media_AudioRecord_release */
    private static void m157028x82ee98ee(AudioRecord audioRecord) {
        if (!((Boolean) C15346a.m28238a(audioRecord, new Object[0], 100403, "void", false, null).first).booleanValue()) {
            C15346a.m28240a(null, audioRecord, new Object[0], 100405, "org_libsdl_app_BufferedAudioRecorder_android_media_AudioRecord_release(Landroid/media/AudioRecord;)V");
            audioRecord.release();
            C15346a.m28240a(null, audioRecord, new Object[0], 100403, "org_libsdl_app_BufferedAudioRecorder_android_media_AudioRecord_release(Landroid/media/AudioRecord;)V");
        }
    }

    /* renamed from: org_libsdl_app_BufferedAudioRecorder_android_media_AudioRecord_startRecording */
    private static void m157029x8f5db4e8(AudioRecord audioRecord) {
        if (!((Boolean) C15346a.m28238a(audioRecord, new Object[0], 100400, "void", false, null).first).booleanValue()) {
            audioRecord.startRecording();
            C15346a.m28240a(null, audioRecord, new Object[0], 100400, "org_libsdl_app_BufferedAudioRecorder_android_media_AudioRecord_startRecording(Landroid/media/AudioRecord;)V");
        }
    }

    /* renamed from: org_libsdl_app_BufferedAudioRecorder_android_media_AudioRecord_stop */
    private static void m157030xcf95987b(AudioRecord audioRecord) {
        if (!((Boolean) C15346a.m28238a(audioRecord, new Object[0], 100401, "void", false, null).first).booleanValue()) {
            C15346a.m28240a(null, audioRecord, new Object[0], 100404, "org_libsdl_app_BufferedAudioRecorder_android_media_AudioRecord_stop(Landroid/media/AudioRecord;)V");
            audioRecord.stop();
            C15346a.m28240a(null, audioRecord, new Object[0], 100401, "org_libsdl_app_BufferedAudioRecorder_android_media_AudioRecord_stop(Landroid/media/AudioRecord;)V");
        }
    }

    /* renamed from: org_libsdl_app_BufferedAudioRecorder_com_ss_android_ugc_aweme_lancet_LogLancet_d */
    public static int m157031x9c3279fd(String str, String str2) {
        return 0;
    }

    public int getChannelCount(int i) {
        return 16 == i ? 1 : 2;
    }

    public synchronized int getMicState() {
        int i;
        MethodCollector.m26663i(1951);
        i = this.mMicState;
        MethodCollector.m26664o(1951);
        return i;
    }

    public synchronized boolean isProcessing() {
        MethodCollector.m26663i(2587);
        RunnableC29977a aVar = this.mProcessThread;
        if (aVar == null || !aVar.mo52785a()) {
            MethodCollector.m26664o(2587);
            return false;
        }
        MethodCollector.m26664o(2587);
        return true;
    }

    public synchronized boolean isStopTimeout() {
        MethodCollector.m26663i(112);
        RunnableC29977a aVar = this.mProcessThread;
        if (aVar == null || !aVar.mo52786b()) {
            MethodCollector.m26664o(112);
            return false;
        }
        MethodCollector.m26664o(112);
        return true;
    }

    public void markRecordStop() {
        MethodCollector.m26663i(2482);
        synchronized (this) {
            try {
                this.isStopped = true;
            } finally {
                MethodCollector.m26664o(2482);
            }
        }
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
        Covode.recordClassIndex(106543);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001c, code lost:
        r2.f71524i = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void discard() {
        /*
            r4 = this;
            r3 = 2277(0x8e5, float:3.191E-42)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r3)
            com.ss.android.medialib.a.a r2 = r4.mProcessThread
            if (r2 == 0) goto L_0x001f
            java.lang.Object r1 = r2.f71517b
            monitor-enter(r1)
            boolean r0 = r2.f71518c     // Catch:{ all -> 0x0015 }
            if (r0 != 0) goto L_0x001b
            monitor-exit(r1)     // Catch:{ all -> 0x0015 }
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r3)
            return
        L_0x0015:
            r0 = move-exception
            monitor-exit(r1)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r3)
            throw r0
        L_0x001b:
            monitor-exit(r1)
            r0 = 1
            r2.f71524i = r0
        L_0x001f:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.libsdl.app.BufferedAudioRecorder.discard():void");
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        AudioRecord audioRecord = this.audio;
        if (audioRecord != null) {
            try {
                if (audioRecord.getState() != 0) {
                    C30683b.m63032a("vesdk_event_will_stop_mic", buildInfoJSONObject("finalize will stop mic", String.valueOf(System.currentTimeMillis()), ""), "behavior");
                    m157030xcf95987b(this.audio);
                    C30683b.m63032a("vesdk_event_did_stop_mic", buildInfoJSONObject("finalize did stop mic", "", String.valueOf(System.currentTimeMillis())), "behavior");
                    releasePrivacy();
                    this.mMicState = 3;
                }
                m157028x82ee98ee(this.audio);
            } catch (Exception unused) {
            }
            this.audio = null;
            this.mMicState = 0;
        }
        super.finalize();
    }

    public boolean stopFeeding() {
        MethodCollector.m26663i(2582);
        C85315al.m146637a("BufferedAudioRecorder", "stopFeeding() called");
        if (this.isRecording) {
            if (this.audio == null) {
                C85315al.m146642d("BufferedAudioRecorder", "StopFeeding: State anomaly, reset state!");
                this.mRecordingState.setState(false);
                this.isStopped = true;
                RunnableC29977a aVar = this.mProcessThread;
                if (aVar != null) {
                    aVar.mo52787c();
                }
                MethodCollector.m26664o(2582);
                return false;
            }
            RunnableC29977a aVar2 = this.mProcessThread;
            if (aVar2 != null) {
                if (!aVar2.mo52785a()) {
                    C85315al.m146642d("BufferedAudioRecorder", "Stop Feeding failed, please start Feeding and then stop Feeding.");
                    MethodCollector.m26664o(2582);
                    return false;
                }
                RunnableC29977a aVar3 = this.mProcessThread;
                C85315al.m146641c("AudioDataProcessThread", "stopFeeding");
                synchronized (aVar3.f71517b) {
                    try {
                        if (!aVar3.f71518c) {
                            C85315al.m146641c("AudioDataProcessThread", "startFeeding not ready");
                        } else {
                            aVar3.f71516a.sendMessage(aVar3.f71516a.obtainMessage(1));
                        }
                    } finally {
                        MethodCollector.m26664o(2582);
                    }
                }
                return true;
            }
        }
        C85315al.m146642d("BufferedAudioRecorder", "Stop Feeding failed, call startRecording first!");
        MethodCollector.m26664o(2582);
        return false;
    }

    public void unInit() {
        MethodCollector.m26663i(2254);
        if (this.isRecording) {
            stopRecording();
        }
        synchronized (this) {
            try {
                AudioRecord audioRecord = this.audio;
                if (audioRecord != null) {
                    try {
                        if (!(audioRecord.getState() == 0 || this.audio.getRecordingState() == 1)) {
                            C30683b.m63032a("vesdk_event_will_stop_mic", buildInfoJSONObject("uninit will stop mic", String.valueOf(System.currentTimeMillis()), ""), "behavior");
                            m157030xcf95987b(this.audio);
                            C30683b.m63032a("vesdk_event_did_stop_mic", buildInfoJSONObject("uninit did stop mic", "", String.valueOf(System.currentTimeMillis())), "behavior");
                            releasePrivacy();
                            this.mMicState = 3;
                        }
                        m157028x82ee98ee(this.audio);
                    } catch (Exception e) {
                        e.getMessage();
                    }
                    this.audio = null;
                    this.mMicState = 0;
                }
            } catch (Throwable th) {
                MethodCollector.m26664o(2254);
                throw th;
            }
        }
        C85315al.m146637a("BufferedAudioRecorder", "unInit()");
        MethodCollector.m26664o(2254);
    }

    public void waitUtilAudioProcessDone() {
        boolean hasMessages;
        MethodCollector.m26663i(128);
        RunnableC29977a aVar = this.mProcessThread;
        if (aVar != null) {
            long currentTimeMillis = System.currentTimeMillis();
            aVar.f71526k = false;
            synchronized (aVar.f71527l) {
                try {
                    synchronized (aVar.f71517b) {
                        try {
                            hasMessages = aVar.f71516a.hasMessages(1);
                        } finally {
                            MethodCollector.m26664o(128);
                        }
                    }
                    if (hasMessages || !aVar.f71525j) {
                        try {
                            aVar.f71527l.wait(5000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                } finally {
                    MethodCollector.m26664o(128);
                }
            }
            if (System.currentTimeMillis() - currentTimeMillis >= 5000) {
                aVar.f71526k = true;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class AudioRecorderRunnable implements Runnable {
        private double speed;
        boolean startFeeding;

        static {
            Covode.recordClassIndex(106544);
        }

        public void run() {
            MethodCollector.m26663i(213);
            byte[] bArr = new byte[BufferedAudioRecorder.this.bufferSizeInBytes];
            int i = 0;
            boolean z = false;
            while (BufferedAudioRecorder.this.isRecording) {
                if (BufferedAudioRecorder.this.audio != null) {
                    i = BufferedAudioRecorder.this.audio.read(bArr, 0, BufferedAudioRecorder.this.bufferSizeInBytes);
                }
                if (-3 == i) {
                    C85315al.m146642d("BufferedAudioRecorder", "bad audio buffer len ".concat(String.valueOf(i)));
                } else if (i > 0) {
                    if (BufferedAudioRecorder.this.mAudioRecordStartTime != 0) {
                        C30695h.m63062a(0, "te_record_audio_first_frame", System.currentTimeMillis() - BufferedAudioRecorder.this.mAudioRecordStartTime);
                        BufferedAudioRecorder.this.mAudioRecordStartTime = 0;
                    }
                    try {
                        if (BufferedAudioRecorder.this.isRecording && !BufferedAudioRecorder.this.isStopPCMCallback) {
                            BufferedAudioRecorder.this.presenter.addPCMData(bArr, i, 0);
                        }
                        if (BufferedAudioRecorder.this.mProcessThread.mo52785a() && !BufferedAudioRecorder.this.isStopped) {
                            BufferedAudioRecorder.this.mProcessThread.mo52784a(bArr, i);
                        }
                    } catch (Exception unused) {
                    }
                } else {
                    if (!(BufferedAudioRecorder.this.audio == null || BufferedAudioRecorder.this.audio.getRecordingState() == 3 || z)) {
                        z = true;
                        BufferedAudioRecorder.this.presenter.recordStatus(false);
                    }
                    Thread.sleep(50);
                }
            }
            MethodCollector.m26664o(213);
        }

        public AudioRecorderRunnable(double d, boolean z) {
            this.speed = d;
            this.startFeeding = z;
        }
    }

    private synchronized int startMic() {
        MethodCollector.m26663i(2477);
        try {
            AudioRecord audioRecord = this.audio;
            if (audioRecord == null || audioRecord.getState() == 0) {
                MethodCollector.m26664o(2477);
                return -1;
            }
            C30683b.m63032a("vesdk_event_will_start_mic", buildInfoJSONObject("will start mic", String.valueOf(System.currentTimeMillis()), ""), "behavior");
            m157029x8f5db4e8(this.audio);
            C30683b.m63032a("vesdk_event_did_start_mic", buildInfoJSONObject("did start mic", "", String.valueOf(System.currentTimeMillis())), "behavior");
            openPrivacy();
            this.mMicState = 2;
            AudioRecord audioRecord2 = this.audio;
            if (audioRecord2 == null || audioRecord2.getRecordingState() == 3) {
                MethodCollector.m26664o(2477);
                return 0;
            }
            C85315al.m146642d("BufferedAudioRecorder", "audio starRecording failed! Stop immediately! cur status " + this.audio.getRecordingState());
            unInit();
            this.mMicState = 0;
            MethodCollector.m26664o(2477);
            return -2;
        } catch (Exception e) {
            try {
                AudioRecord audioRecord3 = this.audio;
                if (audioRecord3 != null) {
                    m157028x82ee98ee(audioRecord3);
                }
            } catch (Exception unused) {
            }
            this.audio = null;
            this.mMicState = 0;
            C85315al.m146642d("BufferedAudioRecorder", "audio recording failed!".concat(String.valueOf(e)));
            MethodCollector.m26664o(2477);
            return -3;
        }
    }

    public boolean stopRecording() {
        MethodCollector.m26663i(2535);
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (this) {
            try {
                m157031x9c3279fd("BufferedAudioRecorder", "stopRecording() called");
                if (!this.isRecording) {
                    return false;
                }
                this.mRecordingState.setState(false);
                AudioRecord audioRecord = this.audio;
                if (audioRecord == null) {
                    C85315al.m146642d("BufferedAudioRecorder", "The audio module is not activated but stopRecording is called!");
                } else if (!(audioRecord.getState() == 0 || this.audio.getRecordingState() == 1)) {
                    C30683b.m63032a("vesdk_event_will_stop_mic", buildInfoJSONObject("stopRecording will stop mic", String.valueOf(System.currentTimeMillis()), ""), "behavior");
                    m157030xcf95987b(this.audio);
                    C30683b.m63032a("vesdk_event_did_stop_mic", buildInfoJSONObject("stopRecording did stop mic", "", String.valueOf(System.currentTimeMillis())), "behavior");
                    releasePrivacy();
                    this.mMicState = 3;
                }
                RunnableC29977a aVar = this.mProcessThread;
                if (aVar != null) {
                    aVar.mo52787c();
                }
                C30695h.m63062a(0, "te_record_audio_stop_record_time", System.currentTimeMillis() - currentTimeMillis);
                MethodCollector.m26664o(2535);
                return true;
            } finally {
                MethodCollector.m26664o(2535);
            }
        }
    }

    public class RecordingState {
        AbstractC1214u<Boolean> mObserver;

        static {
            Covode.recordClassIndex(106545);
        }

        public void attach(AbstractC1214u<Boolean> uVar) {
            this.mObserver = uVar;
        }

        public RecordingState() {
        }

        public void setState(boolean z) {
            BufferedAudioRecorder.this.isRecording = z;
            AbstractC1214u<Boolean> uVar = this.mObserver;
            if (uVar != null) {
                uVar.onChanged(Boolean.valueOf(BufferedAudioRecorder.this.isRecording));
            }
        }
    }

    public void setAudioRecordStateCallack(C30031g.AbstractC30044b bVar) {
        this.mStateCallback = bVar;
    }

    public void attachRecordingObserver(AbstractC1214u<Boolean> uVar) {
        this.mRecordingState.attach(uVar);
    }

    public void stopPCMCallback(boolean z) {
        MethodCollector.m26663i(2484);
        synchronized (this) {
            try {
                this.isStopPCMCallback = z;
            } finally {
                MethodCollector.m26664o(2484);
            }
        }
    }

    public boolean startFeeding(double d) {
        RunnableC29977a aVar;
        C85315al.m146637a("BufferedAudioRecorder", "startFeeding() called with: speed = [" + d + "]");
        if (!this.isRecording || (aVar = this.mProcessThread) == null) {
            C85315al.m146641c("BufferedAudioRecorder", "Start Feeding recording is not activated, start Recording will be activated first!");
            startRecording(d, true);
            return true;
        } else if (aVar.mo52785a()) {
            C85315al.m146641c("BufferedAudioRecorder", "StartFeeding failed. It's been called once.");
            return false;
        } else {
            this.isStopped = false;
            this.isStopPCMCallback = false;
            this.mProcessThread.mo52783a(this.sampleRateInHz, getChannelCount(this.channelConfig), d);
            return true;
        }
    }

    public synchronized void init(int i) {
        int i2;
        int i3;
        Exception e;
        int i4;
        int i5;
        MethodCollector.m26663i(2118);
        C85315al.m146637a("BufferedAudioRecorder", "init audioSource: ".concat(String.valueOf(i)));
        this.audioSource = i;
        if (this.audio != null) {
            C85315al.m146642d("BufferedAudioRecorder", "second time audio init(), skip");
            MethodCollector.m26664o(2118);
            return;
        }
        int i6 = 2;
        int i7 = -1;
        try {
            int i8 = channelConfigOffset;
            if (!(i8 == -1 || (i5 = sampleRateOffset) == -1)) {
                int i9 = channelConfigSuggested[i8];
                this.channelConfig = i9;
                int i10 = sampleRateSuggested[i5];
                this.sampleRateInHz = i10;
                this.bufferSizeInBytes = AudioRecord.getMinBufferSize(i10, i9, 2);
                this.audio = new AudioRecord(i, this.sampleRateInHz, this.channelConfig, 2, this.bufferSizeInBytes);
            }
        } catch (Exception e2) {
            C85315al.m146642d("BufferedAudioRecorder", "Use default configuration " + channelConfigOffset + "," + sampleRateOffset + "Instantiation audio recorder failed, retest configuration. " + e2);
            this.audio = null;
            this.presenter.lackPermission();
        }
        if (this.audio == null) {
            channelConfigOffset = -1;
            int[] iArr = channelConfigSuggested;
            int length = iArr.length;
            int i11 = 0;
            loop0:
            while (true) {
                if (i11 >= length) {
                    break;
                }
                this.channelConfig = iArr[i11];
                channelConfigOffset++;
                sampleRateOffset = i7;
                int[] iArr2 = sampleRateSuggested;
                int length2 = iArr2.length;
                int i12 = 0;
                while (i12 < length2) {
                    int i13 = iArr2[i12];
                    sampleRateOffset++;
                    try {
                        this.bufferSizeInBytes = AudioRecord.getMinBufferSize(i13, this.channelConfig, i6);
                        C85315al.m146642d("BufferedAudioRecorder", "Try hz  " + i13 + " " + this.channelConfig + " 2");
                        if (this.bufferSizeInBytes > 0) {
                            this.sampleRateInHz = i13;
                            i4 = 0;
                            try {
                                this.audio = new AudioRecord(i, this.sampleRateInHz, this.channelConfig, 2, this.bufferSizeInBytes);
                                break loop0;
                            } catch (Exception e3) {
                                e = e3;
                                this.sampleRateInHz = i4;
                                this.audio = null;
                                C85315al.m146642d("BufferedAudioRecorder", "apply audio record sample rate " + i13 + " failed: " + e.getMessage());
                                sampleRateOffset++;
                                i12++;
                                i6 = 2;
                            }
                        } else {
                            sampleRateOffset++;
                            i12++;
                            i6 = 2;
                        }
                    } catch (Exception e4) {
                        e = e4;
                        i4 = 0;
                        this.sampleRateInHz = i4;
                        this.audio = null;
                        C85315al.m146642d("BufferedAudioRecorder", "apply audio record sample rate " + i13 + " failed: " + e.getMessage());
                        sampleRateOffset++;
                        i12++;
                        i6 = 2;
                    }
                }
                i11++;
                i6 = 2;
                i7 = -1;
            }
        }
        int i14 = this.sampleRateInHz;
        if (i14 <= 0) {
            C85315al.m146642d("BufferedAudioRecorder", "!Init audio recorder failed, hz " + this.sampleRateInHz);
            MethodCollector.m26664o(2118);
            return;
        }
        if (this.channelConfig == 16) {
            i2 = 1;
        } else {
            i2 = 2;
        }
        this.presenter.initAudioConfig(i14, i2, this.encodeSampleRate, this.encodeChannels, this.encodeBitRate);
        StringBuilder append = new StringBuilder("Init audio recorder succeed, apply audio record sample rate ").append(this.sampleRateInHz).append(" channels ").append(i2).append(" buffer ").append(this.bufferSizeInBytes).append(" state ");
        AudioRecord audioRecord = this.audio;
        if (audioRecord == null) {
            i3 = -1;
        } else {
            i3 = audioRecord.getState();
        }
        C85315al.m146637a("BufferedAudioRecorder", append.append(i3).append(" encodeSampleRate ").append(this.encodeSampleRate).append(" encodeChannels ").append(this.encodeChannels).toString());
        this.mMicState = 1;
        AudioRecord audioRecord2 = this.audio;
        if (audioRecord2 != null && audioRecord2.getState() == 0) {
            this.audio = null;
            C85315al.m146642d("BufferedAudioRecorder", "AudioRecord state at STATE_UNINITIALIZED! Will try init when start recording.");
        }
        MethodCollector.m26664o(2118);
    }

    private boolean innerStartRecording(double d, boolean z) {
        MethodCollector.m26663i(2393);
        this.isStopped = false;
        this.isStopPCMCallback = false;
        AudioRecorderInterfaceExt audioRecorderInterfaceExt = this.presenter;
        RunnableC29977a aVar = new RunnableC29977a(audioRecorderInterfaceExt, audioRecorderInterfaceExt);
        this.mProcessThread = aVar;
        C85315al.m146637a("AudioDataProcessThread", C85315al.m146633a() + ": " + C85315al.m146640c());
        synchronized (aVar.f71517b) {
            try {
                if (aVar.f71519d) {
                    C85315al.m146641c("AudioDataProcessThread", "thread already running");
                } else {
                    aVar.f71519d = true;
                    new Thread(aVar, "AudioDataProcessThread").start();
                    while (!aVar.f71518c) {
                        try {
                            aVar.f71517b.wait();
                        } catch (InterruptedException unused) {
                        }
                    }
                }
            } finally {
                MethodCollector.m26664o(2393);
            }
        }
        if (z) {
            this.mProcessThread.mo52783a(this.sampleRateInHz, getChannelCount(this.channelConfig), d);
        }
        long currentTimeMillis = System.currentTimeMillis();
        int startMic = startMic();
        collectStartMicInfo(0, startMic, System.currentTimeMillis() - currentTimeMillis);
        if (startMic != 0) {
            int i = 0;
            while (true) {
                if (i < this.mMicRestartCount) {
                    if (this.audio == null) {
                        init(this.audioSource);
                    }
                    long currentTimeMillis2 = System.currentTimeMillis();
                    startMic = startMic();
                    int i2 = i + 1;
                    collectStartMicInfo(i2, startMic, System.currentTimeMillis() - currentTimeMillis2);
                    if (startMic == 0) {
                        startMic = 0;
                        break;
                    }
                    C85315al.m146642d("BufferedAudioRecorder", "retry start mic times : ".concat(String.valueOf(i)));
                    i = i2;
                } else {
                    break;
                }
            }
        }
        C30695h.m63063a(0, "te_record_audio_mic_start_info", this.mMicStartInfoMap.toString());
        if (startMic != 0) {
            this.mMicStartInfoMap.clear();
            C30031g.AbstractC30044b bVar = this.mStateCallback;
            if (bVar != null) {
                bVar.mo53392a(-603);
            }
            this.presenter.recordStatus(false);
            MethodCollector.m26664o(2393);
            return false;
        }
        C30031g.AbstractC30044b bVar2 = this.mStateCallback;
        if (bVar2 != null) {
            bVar2.mo53392a(3);
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004c, code lost:
        if (innerStartRecording(r8, r10) == false) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004e, code lost:
        com.p2082ss.android.vesdk.C85315al.m146637a("BufferedAudioRecorder", "start mic ok, ready to run AudioRecorderRunnable");
        new java.lang.Thread(new org.libsdl.app.BufferedAudioRecorder.AudioRecorderRunnable(r7, r8, r10)).start();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0063, code lost:
        java.lang.Runtime.getRuntime().gc();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        java.lang.Thread.sleep(100);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x006f, code lost:
        java.lang.System.runFinalization();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0076, code lost:
        if (innerStartRecording(r8, r10) != false) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0078, code lost:
        com.p2082ss.android.vesdk.C85315al.m146637a("BufferedAudioRecorder", "after gc, start mic ok, ready to run AudioRecorderRunnable");
        new java.lang.Thread(new org.libsdl.app.BufferedAudioRecorder.AudioRecorderRunnable(r7, r8, r10)).start();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x008c, code lost:
        com.p2082ss.android.ttve.monitor.C30695h.m63062a(0, "te_record_audio_start_record_time", java.lang.System.currentTimeMillis() - r7.mAudioRecordStartTime);
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(2272);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x009c, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void startRecording(double r8, boolean r10) {
        /*
        // Method dump skipped, instructions count: 163
        */
        throw new UnsupportedOperationException("Method not decompiled: org.libsdl.app.BufferedAudioRecorder.startRecording(double, boolean):void");
    }

    private JSONObject buildInfoJSONObject(String str, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("oldState", "");
            jSONObject.put("newState", "");
            jSONObject.put("error", str);
            jSONObject.put("startTime", str2);
            jSONObject.put("endTime", str3);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    private void collectStartMicInfo(int i, int i2, long j) {
        this.mMicStartInfoMap.put("micStartRet".concat(String.valueOf(i)), Integer.valueOf(i2));
        this.mMicStartInfoMap.put("micStartCost".concat(String.valueOf(i)), Long.valueOf(j));
    }

    public BufferedAudioRecorder(AudioRecorderInterfaceExt audioRecorderInterfaceExt, int i, int i2, int i3) {
        this(audioRecorderInterfaceExt, i, i2, i3, null);
    }

    public BufferedAudioRecorder(AudioRecorderInterfaceExt audioRecorderInterfaceExt, int i, int i2, int i3, C30048h hVar) {
        this.sampleRateInHz = -1;
        this.channelConfig = -1;
        this.audioFormat = 2;
        this.audioSource = 1;
        this.mMicRestartCount = 10;
        this.mMicStartInfoMap = new ConcurrentHashMap();
        this.mRecordingState = new RecordingState();
        this.mEnableMicBgmDelayOpt = false;
        this.presenter = audioRecorderInterfaceExt;
        this.encodeSampleRate = i;
        this.encodeChannels = i2;
        this.encodeBitRate = i3;
        this.audioMonitor = hVar;
        this.mEnableMicBgmDelayOpt = ((Boolean) C85568t.m147473a().mo131557a("ve_enable_bgm_mic_delay_opt", (Object) false)).booleanValue();
        C85315al.m146637a("BufferedAudioRecorder", "enable_bgm_mic_delay_opt: " + this.mEnableMicBgmDelayOpt);
    }
}
