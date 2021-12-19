package com.p2082ss.avframework.livestreamv2.filter;

import android.os.Handler;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.avframework.effect.AudioKaraokeWrapper;
import com.p2082ss.avframework.effect.NativeAudioEffect;
import com.p2082ss.avframework.engine.AudioDeviceModule;
import com.p2082ss.avframework.engine.Receiver;
import com.p2082ss.avframework.livestreamv2.LiveStreamBuilder;
import com.p2082ss.avframework.livestreamv2.audioeffect.AudioEffectProcessor;
import com.p2082ss.avframework.livestreamv2.ktv.IKaraokeMovie;
import com.p2082ss.avframework.receiver.NativeReceiver;
import com.p2082ss.avframework.utils.AVLog;
import com.p2082ss.avframework.utils.TEBundle;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.util.Vector;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.ss.avframework.livestreamv2.filter.LiveCoreKaraokFilter */
public class LiveCoreKaraokFilter extends IAudioFilterManager {
    private final String TAG = "LiveCoreKaraokFilter";
    private final boolean asyncReportError;
    private final int enableAutoVolume;
    private final boolean enablePitchShift;
    private boolean mAecStatus = false;
    public AudioDeviceModule mAudioDeviceModule;
    private NativeAudioEffect mAudioEffect;
    private AudioKaraokeWrapper mAudioKaraokeWrapper;
    private ReentrantLock mAudioKaraokeWrapperFence;
    private AudioDeviceModule.AudioRenderSink mAudioRenderSink;
    private IAudioStrangeVoice mAudioStrangeVoice;
    private float mBGMAGC = 0.75f;
    private String mBGMFile;
    private AudioEffectProcessor.Callback mCallback;
    private int mChannel;
    private Object mFence = new Object();
    private final Handler mHandler;
    private IKaraokeMovie mKaraokeMovie;
    private boolean mLoopPlayer = true;
    private final boolean mMixBgmWithQuirk;
    private boolean mNeedMixer = false;
    private boolean mNeedOrigin = true;
    private boolean mNeedReceiver;
    boolean mNeedReportEnd = false;
    private boolean mNeedReportStart = false;
    private String mOriginMusicFile;
    private Receiver mOriginMusicReceiver;
    private boolean mPause = false;
    private double mPitchShift;
    private ByteBuffer mReadAudioBuffer;
    private Receiver mReceiver;
    private final KaraokeRegulator mRegulator;
    private long mRenderCounts = 0;
    private int mSampleHz;
    private long mStartTimeMs;
    private boolean mStatusException = false;
    private TEBundle mStreamInfo;
    private IntBuffer mTimeStampMs = ByteBuffer.allocateDirect(4).order(ByteOrder.nativeOrder()).asIntBuffer();
    private long mTotalDurationMs;
    private boolean mUpdatePitchShift;
    private IFilterManager mVideoEffect;
    private float mVoice = 0.75f;
    private float mVoiceEq = 0.75f;

    static {
        Covode.recordClassIndex(100548);
    }

    private void cleanStatusException() {
        this.mStatusException = false;
    }

    @Override // com.p2082ss.avframework.livestreamv2.audioeffect.AudioEffectProcessor
    public void initEarMonitor() {
    }

    @Override // com.p2082ss.avframework.livestreamv2.filter.IAudioFilterManager
    public boolean isDummy() {
        return false;
    }

    @Override // com.p2082ss.avframework.livestreamv2.audioeffect.AudioEffectProcessor
    public boolean isSupportHardWareEarMonitor() {
        return false;
    }

    @Override // com.p2082ss.avframework.livestreamv2.filter.IAudioFilterManager
    public String name() {
        return "LiveCoreKaraokFilter";
    }

    public void onPause() {
    }

    public void onResume() {
    }

    @Override // com.p2082ss.avframework.livestreamv2.audioeffect.AudioEffectProcessor
    public void pause() {
        this.mPause = true;
    }

    @Override // com.p2082ss.avframework.livestreamv2.audioeffect.AudioEffectProcessor
    public void resume() {
        this.mPause = false;
    }

    @Override // com.p2082ss.avframework.livestreamv2.audioeffect.AudioEffectProcessor
    public void setBGMMusic(String str, long j) {
    }

    @Override // com.p2082ss.avframework.livestreamv2.audioeffect.AudioEffectProcessor
    public void setDRCEnable(boolean z) {
    }

    @Override // com.p2082ss.avframework.livestreamv2.audioeffect.AudioEffectProcessor
    public void setMusicPitch(int i) {
    }

    @Override // com.p2082ss.avframework.livestreamv2.audioeffect.AudioEffectProcessor
    public void setTuningParams(String str, String str2) {
    }

    private boolean supportPitchShift() {
        return this.enablePitchShift;
    }

    private boolean isAdmByteAudio() {
        AudioDeviceModule audioDeviceModule = this.mAudioDeviceModule;
        if (audioDeviceModule == null || audioDeviceModule.getAdmType() != 1) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.avframework.livestreamv2.audioeffect.AudioEffectProcessor
    public TEBundle getStreamInfo() {
        TEBundle tEBundle = this.mStreamInfo;
        if (tEBundle != null) {
            return tEBundle.copy();
        }
        return null;
    }

    private void releaseScoringModule() {
        this.mAudioKaraokeWrapperFence.lock();
        AudioKaraokeWrapper audioKaraokeWrapper = this.mAudioKaraokeWrapper;
        if (audioKaraokeWrapper != null) {
            audioKaraokeWrapper.release();
            this.mAudioKaraokeWrapper = null;
        }
        this.mAudioKaraokeWrapperFence.unlock();
    }

    @Override // com.p2082ss.avframework.livestreamv2.filter.IAudioFilterManager
    public IAudioStrangeVoice getAudioStrangeVoice() {
        String str;
        IFilterManager iFilterManager;
        AudioDeviceModule audioDeviceModule = this.mAudioDeviceModule;
        if (this.mAudioStrangeVoice == null && (iFilterManager = this.mVideoEffect) != null && iFilterManager.isValid()) {
            this.mAudioStrangeVoice = this.mVideoEffect.createAudioStrangeVoice(this.mAudioRenderSink, this.mSampleHz, this.mChannel);
            if (audioDeviceModule != null && !audioDeviceModule.isPlayer()) {
                audioDeviceModule.startPlayer();
            }
        }
        IAudioStrangeVoice iAudioStrangeVoice = this.mAudioStrangeVoice;
        StringBuilder sb = new StringBuilder("Have audio strange voice ");
        if (iAudioStrangeVoice != null) {
            str = iAudioStrangeVoice.toString();
        } else {
            str = "false";
        }
        AVLog.iod("LiveCoreKaraokFilter", sb.append(str).toString());
        return this.mAudioStrangeVoice;
    }

    @Override // com.p2082ss.avframework.livestreamv2.audioeffect.AudioEffectProcessor
    public Vector<Vector<Double>> getMidiDrawingData() {
        MethodCollector.m26663i(1313);
        if (this.mAudioKaraokeWrapper != null) {
            int[] iArr = new int[1];
            this.mAudioKaraokeWrapperFence.lock();
            AudioKaraokeWrapper audioKaraokeWrapper = this.mAudioKaraokeWrapper;
            double[] nativeGetMidiDrawingData = audioKaraokeWrapper != null ? audioKaraokeWrapper.nativeGetMidiDrawingData(iArr) : null;
            this.mAudioKaraokeWrapperFence.unlock();
            if (nativeGetMidiDrawingData == null) {
                MethodCollector.m26664o(1313);
                return null;
            } else if (iArr[0] > 0) {
                Vector<Vector<Double>> vector = new Vector<>(iArr[0]);
                int i = 0;
                for (int i2 = 0; i2 < iArr[0]; i2++) {
                    Vector<Double> vector2 = new Vector<>(3);
                    int i3 = i + 1;
                    vector2.add(0, Double.valueOf(nativeGetMidiDrawingData[i]));
                    int i4 = i3 + 1;
                    vector2.add(1, Double.valueOf(nativeGetMidiDrawingData[i3]));
                    i = i4 + 1;
                    vector2.add(2, Double.valueOf(nativeGetMidiDrawingData[i4]));
                    vector.add(i2, vector2);
                }
                MethodCollector.m26664o(1313);
                return vector;
            }
        }
        MethodCollector.m26664o(1313);
        return null;
    }

    @Override // com.p2082ss.avframework.engine.NativeObject
    public synchronized void release() {
        MethodCollector.m26663i(1096);
        AVLog.iod("LiveCoreKaraokFilter", "release karaoke.");
        setEnable(false);
        this.mNeedReceiver = false;
        synchronized (this.mFence) {
            try {
                Receiver receiver = this.mReceiver;
                if (receiver != null) {
                    receiver.closeStream();
                    this.mReceiver.release();
                    this.mReceiver = null;
                }
                Receiver receiver2 = this.mOriginMusicReceiver;
                if (receiver2 != null) {
                    receiver2.closeStream();
                    this.mOriginMusicReceiver.release();
                    this.mOriginMusicReceiver = null;
                }
            } catch (Throwable th) {
                MethodCollector.m26664o(1096);
                throw th;
            }
        }
        IAudioStrangeVoice iAudioStrangeVoice = this.mAudioStrangeVoice;
        if (iAudioStrangeVoice != null) {
            iAudioStrangeVoice.release();
            this.mAudioStrangeVoice = null;
        }
        AudioDeviceModule.AudioRenderSink audioRenderSink = this.mAudioRenderSink;
        if (audioRenderSink != null) {
            audioRenderSink.release();
            this.mAudioRenderSink = null;
        }
        this.mAudioDeviceModule = null;
        releaseScoringModule();
        TEBundle tEBundle = this.mStreamInfo;
        if (tEBundle != null) {
            tEBundle.release();
            this.mStreamInfo = null;
        }
        NativeAudioEffect nativeAudioEffect = this.mAudioEffect;
        if (nativeAudioEffect != null) {
            nativeAudioEffect.release();
            this.mAudioEffect = null;
        }
        super.release();
        MethodCollector.m26664o(1096);
    }

    @Override // com.p2082ss.avframework.livestreamv2.audioeffect.AudioEffectProcessor
    public void setBGMProgressListener(AudioEffectProcessor.Callback callback) {
        this.mCallback = callback;
    }

    public void setKaraokeMovieMode(IKaraokeMovie iKaraokeMovie) {
        this.mKaraokeMovie = iKaraokeMovie;
    }

    @Override // com.p2082ss.avframework.livestreamv2.audioeffect.AudioEffectProcessor
    public void setBGMMusic(String str) {
        setBGMMusic(str, (String) null);
    }

    @Override // com.p2082ss.avframework.livestreamv2.audioeffect.AudioEffectProcessor
    public void setBGMVolume(float f) {
        this.mBGMAGC = f;
        AudioDeviceModule.AudioRenderSink audioRenderSink = this.mAudioRenderSink;
        if (audioRenderSink != null) {
            audioRenderSink.setVolume(f);
        }
    }

    @Override // com.p2082ss.avframework.livestreamv2.audioeffect.AudioEffectProcessor
    public void setTuningParams(final String str) {
        final AudioDeviceModule audioDeviceModule = this.mAudioDeviceModule;
        if (audioDeviceModule != null) {
            this.mHandler.post(new Runnable() {
                /* class com.p2082ss.avframework.livestreamv2.filter.LiveCoreKaraokFilter.RunnableC859751 */

                static {
                    Covode.recordClassIndex(100550);
                }

                public void run() {
                    audioDeviceModule.setTuningType(0, str);
                }
            });
        }
    }

    @Override // com.p2082ss.avframework.livestreamv2.audioeffect.AudioEffectProcessor
    public void setVoiceVolume(float f) {
        this.mVoice = f;
        AudioDeviceModule audioDeviceModule = this.mAudioDeviceModule;
        if (audioDeviceModule != null) {
            audioDeviceModule.setMicVolume(f);
        }
    }

    @Override // com.p2082ss.avframework.livestreamv2.audioeffect.AudioEffectProcessor
    public void getScoreInfo(double[] dArr) {
        this.mAudioKaraokeWrapperFence.lock();
        AudioKaraokeWrapper audioKaraokeWrapper = this.mAudioKaraokeWrapper;
        if (audioKaraokeWrapper != null) {
            audioKaraokeWrapper.getScoreInfo(dArr);
        }
        this.mAudioKaraokeWrapperFence.unlock();
    }

    @Override // com.p2082ss.avframework.livestreamv2.audioeffect.AudioEffectProcessor
    public void seekLyricPos(double d) {
        MethodCollector.m26663i(1300);
        this.mAudioKaraokeWrapperFence.lock();
        AudioKaraokeWrapper audioKaraokeWrapper = this.mAudioKaraokeWrapper;
        if (audioKaraokeWrapper != null) {
            audioKaraokeWrapper.nativeSeekLyricPos(d);
        }
        this.mAudioKaraokeWrapperFence.unlock();
        MethodCollector.m26664o(1300);
    }

    @Override // com.p2082ss.avframework.livestreamv2.audioeffect.AudioEffectProcessor
    public void setEchoMode(boolean z) {
        AudioDeviceModule audioDeviceModule = this.mAudioDeviceModule;
        if (audioDeviceModule != null) {
            audioDeviceModule.enableEchoMode(z);
        }
        AVLog.iod("LiveCoreKaraokFilter", "setEchoMode ".concat(String.valueOf(z)));
    }

    @Override // com.p2082ss.avframework.livestreamv2.audioeffect.AudioEffectProcessor
    public void setOriginEnable(boolean z) {
        Receiver receiver = this.mReceiver;
        if (receiver != null && this.mOriginMusicReceiver == null) {
            TEBundle option = receiver.getOption();
            option.setBool("receiver_enable_origin_audio", z);
            receiver.setOption(option);
            option.release();
        }
        this.mNeedOrigin = z;
    }

    @Override // com.p2082ss.avframework.livestreamv2.audioeffect.AudioEffectProcessor
    public void setSongScore(double d) {
        MethodCollector.m26663i(1146);
        if (this.mAudioKaraokeWrapper != null) {
            this.mAudioKaraokeWrapperFence.lock();
            AudioKaraokeWrapper audioKaraokeWrapper = this.mAudioKaraokeWrapper;
            if (audioKaraokeWrapper != null) {
                audioKaraokeWrapper.nativeSetSongScore(d);
            }
            this.mAudioKaraokeWrapperFence.unlock();
        }
        MethodCollector.m26664o(1146);
    }

    @Override // com.p2082ss.avframework.livestreamv2.audioeffect.AudioEffectProcessor
    public void setLoopEnable(boolean z) {
        int i;
        this.mLoopPlayer = z;
        Receiver receiver = this.mReceiver;
        int i2 = -1;
        if (receiver != null) {
            TEBundle option = receiver.getOption();
            if (z) {
                i = -1;
            } else {
                i = 1;
            }
            option.setInt("decode_stream_loop", i);
            receiver.setOption(option);
            option.release();
        }
        Receiver receiver2 = this.mOriginMusicReceiver;
        if (receiver2 != null) {
            TEBundle option2 = receiver2.getOption();
            if (!z) {
                i2 = 1;
            }
            option2.setInt("decode_stream_loop", i2);
            receiver2.setOption(option2);
            option2.release();
        }
    }

    @Override // com.p2082ss.avframework.livestreamv2.audioeffect.AudioEffectProcessor
    public void setMixerEnable(boolean z) {
        long j;
        AVLog.iod("LiveCoreKaraokFilter", " setMixerEnable: " + this.mNeedMixer + " -> " + z);
        this.mNeedMixer = z;
        AudioDeviceModule.AudioRenderSink audioRenderSink = this.mAudioRenderSink;
        if (audioRenderSink != null && this.mMixBgmWithQuirk) {
            if (z) {
                j = 1;
            } else {
                j = 0;
            }
            audioRenderSink.setQuirks(j);
        }
    }

    @Override // com.p2082ss.avframework.livestreamv2.filter.IAudioFilterManager
    public void setEnable(boolean z) {
        super.setEnable(z);
        if (z) {
            setVoiceVolume(this.mVoice);
            AudioDeviceModule audioDeviceModule = this.mAudioDeviceModule;
            if (audioDeviceModule != null && !audioDeviceModule.isPlayer()) {
                this.mHandler.post(new Runnable() {
                    /* class com.p2082ss.avframework.livestreamv2.filter.LiveCoreKaraokFilter.RunnableC859762 */

                    static {
                        Covode.recordClassIndex(100551);
                    }

                    public void run() {
                        AudioDeviceModule audioDeviceModule = LiveCoreKaraokFilter.this.mAudioDeviceModule;
                        if (audioDeviceModule != null && !audioDeviceModule.isPlayer()) {
                            AVLog.iod("LiveCoreKaraokFilter", "startPlayer adm ".concat(String.valueOf(audioDeviceModule)));
                            audioDeviceModule.startPlayer();
                        }
                    }
                });
            }
        } else {
            AudioDeviceModule audioDeviceModule2 = this.mAudioDeviceModule;
            if (audioDeviceModule2 != null) {
                audioDeviceModule2.setMicVolume(1.0f);
            }
        }
        AVLog.iod("LiveCoreKaraokFilter", "setEnable " + z + " adm " + this.mAudioDeviceModule + " voice " + this.mVoice);
    }

    @Override // com.p2082ss.avframework.livestreamv2.audioeffect.AudioEffectProcessor
    public void setBGMMusic(String str, String str2) {
        setBGMMusic(str, str2, 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: reportError */
    public void lambda$processInternal$0$LiveCoreKaraokFilter(Receiver receiver, int i) {
        String str;
        TEBundle option;
        if (receiver != null) {
            if (!this.asyncReportError || (option = receiver.getOption()) == null || !option.contains("receiver_last_error_message")) {
                str = "none";
            } else {
                str = option.getString("receiver_last_error_message");
            }
            AudioEffectProcessor.Callback callback = this.mCallback;
            if (callback != null && (callback instanceof AudioEffectProcessor.CallbackV2) && !this.mStatusException) {
                this.mStatusException = true;
                ((AudioEffectProcessor.CallbackV2) callback).onError(i, new Exception(str));
            }
        }
    }

    @Override // com.p2082ss.avframework.livestreamv2.audioeffect.AudioEffectProcessor
    public int setScoringSources(String str, int[] iArr) {
        AudioKaraokeWrapper create = AudioKaraokeWrapper.create(this.mSampleHz, this.mChannel, str, iArr);
        if (create == null) {
            return -1;
        }
        this.mAudioKaraokeWrapperFence.lock();
        AudioKaraokeWrapper audioKaraokeWrapper = this.mAudioKaraokeWrapper;
        if (audioKaraokeWrapper != null) {
            audioKaraokeWrapper.release();
        }
        this.mAudioKaraokeWrapper = create;
        this.mAudioKaraokeWrapperFence.unlock();
        return 0;
    }

    @Override // com.p2082ss.avframework.livestreamv2.audioeffect.AudioEffectProcessor
    public void setBGMMusic(String str, String str2, long j) {
        this.mNeedReceiver = true;
        this.mBGMFile = str;
        this.mOriginMusicFile = str2;
        AVLog.iod("LiveCoreKaraokFilter", "setBGMFile " + str + " origin " + str2);
        int i = this.mSampleHz;
        createReceiver(i, this.mChannel, i / 100, j);
    }

    @Override // com.p2082ss.avframework.livestreamv2.audioeffect.AudioEffectProcessor
    public int setScoringSources(String str, String str2, double d) {
        MethodCollector.m26663i(1126);
        AudioKaraokeWrapper create = AudioKaraokeWrapper.create(this.mSampleHz, this.mChannel, str, str2);
        if (create != null) {
            create.nativeSetSongScore(d);
            this.mAudioKaraokeWrapperFence.lock();
            AudioKaraokeWrapper audioKaraokeWrapper = this.mAudioKaraokeWrapper;
            if (audioKaraokeWrapper != null) {
                audioKaraokeWrapper.release();
            }
            this.mAudioKaraokeWrapper = create;
            this.mAudioKaraokeWrapperFence.unlock();
            MethodCollector.m26664o(1126);
            return 0;
        }
        MethodCollector.m26664o(1126);
        return -1;
    }

    public LiveCoreKaraokFilter(AudioDeviceModule audioDeviceModule, Handler handler, LiveStreamBuilder liveStreamBuilder, IFilterManager iFilterManager) {
        int i;
        boolean z;
        this.mSampleHz = liveStreamBuilder.getAudioSampleHZ();
        this.mChannel = liveStreamBuilder.getAudioChannel();
        boolean isEnablePitchShift = liveStreamBuilder.isEnablePitchShift();
        this.enablePitchShift = isEnablePitchShift;
        this.asyncReportError = liveStreamBuilder.isAudioFilterAsyncReportError();
        this.mAudioDeviceModule = audioDeviceModule;
        this.mAudioRenderSink = audioDeviceModule.createRenderSink();
        if (!liveStreamBuilder.isEnableAutoVolume()) {
            i = 0;
        } else if (!isAdmByteAudio() || !liveStreamBuilder.isByteAudioInternalAutoVolume()) {
            i = 1;
        } else {
            i = 2;
        }
        this.enableAutoVolume = i;
        this.mNeedReceiver = true;
        this.mHandler = handler;
        this.mVideoEffect = iFilterManager;
        this.mAudioKaraokeWrapperFence = new ReentrantLock();
        if (liveStreamBuilder.isEnableKTV()) {
            this.mAudioEffect = new NativeAudioEffect(this.mSampleHz, this.mChannel);
        }
        NativeAudioEffect nativeAudioEffect = this.mAudioEffect;
        if (nativeAudioEffect != null) {
            if (i == 1) {
                z = true;
            } else {
                z = false;
            }
            nativeAudioEffect.enableAutoVolume(z);
            this.mAudioEffect.enablePitchShift(isEnablePitchShift);
        }
        if (!liveStreamBuilder.enableKaraokeRegulator() || (isAdmByteAudio() && liveStreamBuilder.isByteAudioInternalMixBGM())) {
            this.mRegulator = null;
            this.mMixBgmWithQuirk = true;
        } else {
            this.mRegulator = new KaraokeRegulator();
            this.mMixBgmWithQuirk = false;
        }
        setMixerEnable(this.mNeedMixer);
        AVLog.ioi("LiveCoreKaraokFilter", "enableAutoVolume: " + i + ", enablePitchShift: " + isEnablePitchShift + ", mMixBgmWithQuirk: " + this.mMixBgmWithQuirk);
    }

    private void createReceiver(int i, int i2, int i3, long j) {
        int i4;
        boolean z;
        Receiver receiver;
        MethodCollector.m26663i(977);
        synchronized (this.mFence) {
            try {
                if (this.mNeedReceiver) {
                    this.mStartTimeMs = j;
                    Receiver receiver2 = this.mReceiver;
                    if (receiver2 != null) {
                        receiver2.closeStream();
                        this.mReceiver.release();
                        this.mReceiver = null;
                    }
                    Receiver receiver3 = this.mOriginMusicReceiver;
                    if (receiver3 != null) {
                        receiver3.closeStream();
                        this.mOriginMusicReceiver.release();
                        this.mOriginMusicReceiver = null;
                    }
                    TEBundle tEBundle = this.mStreamInfo;
                    if (tEBundle != null) {
                        tEBundle.clear();
                    } else {
                        this.mStreamInfo = new TEBundle();
                    }
                    cleanStatusException();
                    boolean z2 = false;
                    this.mNeedReceiver = false;
                    if (this.mBGMFile == null) {
                        MethodCollector.m26664o(977);
                        return;
                    }
                    NativeReceiver nativeReceiver = new NativeReceiver(null, null);
                    this.mReceiver = nativeReceiver;
                    TEBundle option = nativeReceiver.getOption();
                    option.setInt("decode_stream_audio_channel", i2);
                    option.setInt("decode_stream_audio_sample", i);
                    if (this.mLoopPlayer) {
                        i4 = -1;
                    } else {
                        i4 = 1;
                    }
                    option.setInt("decode_stream_loop", i4);
                    if (this.mOriginMusicFile == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    option.setBool("receiver_enable_origin_audio", z);
                    if (this.enableAutoVolume == 1) {
                        z2 = true;
                    }
                    option.setBool("receiver_enable_auto_volume", z2);
                    this.mReceiver.setOption(option);
                    int openStream = this.mReceiver.openStream(this.mBGMFile);
                    if (openStream != 0) {
                        this.mStreamInfo.setLong("receiver_total_duration", -1);
                        lambda$processInternal$0$LiveCoreKaraokFilter(this.mReceiver, openStream);
                        this.mReceiver.closeStream();
                        this.mReceiver.release();
                        this.mReceiver = null;
                    } else {
                        if (this.mOriginMusicFile != null) {
                            this.mOriginMusicReceiver = new NativeReceiver(null, null);
                            option.setBool("receiver_enable_origin_audio", true);
                            this.mOriginMusicReceiver.setOption(option);
                        }
                        if (this.mReadAudioBuffer == null) {
                            this.mReadAudioBuffer = ByteBuffer.allocateDirect(i3 * 2 * i2);
                        }
                        this.mReceiver.getStreamInfo(this.mStreamInfo);
                        long j2 = this.mStreamInfo.getLong("receiver_total_duration");
                        this.mTotalDurationMs = j2;
                        long j3 = this.mStartTimeMs;
                        if (j3 > 0) {
                            if (j3 > j2) {
                                this.mStartTimeMs = j2;
                            }
                            this.mReceiver.seek(this.mStartTimeMs, true);
                        }
                        AVLog.iod("LiveCoreKaraokFilter", this.mStreamInfo.toString());
                        this.mNeedReportStart = true;
                    }
                    option.release();
                    if (!(this.mReceiver == null || (receiver = this.mOriginMusicReceiver) == null)) {
                        int openStream2 = receiver.openStream(this.mOriginMusicFile);
                        if (openStream2 != 0) {
                            lambda$processInternal$0$LiveCoreKaraokFilter(this.mOriginMusicReceiver, openStream2);
                            this.mOriginMusicReceiver.closeStream();
                            this.mOriginMusicReceiver.release();
                            this.mOriginMusicReceiver = null;
                            AVLog.ioe("LiveCoreKaraokFilter", "Open OriginMusic file " + this.mOriginMusicFile + " failed " + openStream2);
                        } else {
                            TEBundle tEBundle2 = new TEBundle();
                            this.mOriginMusicReceiver.getStreamInfo(tEBundle2);
                            long j4 = tEBundle2.getLong("receiver_total_duration");
                            tEBundle2.release();
                            long j5 = this.mTotalDurationMs - j4;
                            long j6 = this.mStartTimeMs;
                            if (j6 > 0) {
                                this.mOriginMusicReceiver.seek(j6, true);
                            }
                            if (j5 != 0) {
                                String str = "bgm duration error(" + j5 + ") at file " + this.mBGMFile + " VS " + this.mOriginMusicFile;
                                AVLog.ioe("LiveCoreKaraokFilter", str);
                                AVLog.logKibana(6, "LiveCoreKaraokFilter", str, null);
                            }
                        }
                    }
                    if (this.mPitchShift != 0.0d) {
                        this.mUpdatePitchShift = true;
                    }
                    MethodCollector.m26664o(977);
                }
            } finally {
                MethodCollector.m26664o(977);
            }
        }
    }

    @Override // com.p2082ss.avframework.engine.AudioProcessor
    public synchronized Buffer process(Buffer buffer, int i, int i2, int i3, long j) {
        Buffer processInternal;
        MethodCollector.m26663i(900);
        try {
            processInternal = processInternal(buffer, i, i2, i3, j);
            MethodCollector.m26664o(900);
        } catch (Throwable unused) {
            MethodCollector.m26664o(900);
            return buffer;
        }
        return processInternal;
    }

    /* access modifiers changed from: protected */
    public synchronized Buffer processInternal(Buffer buffer, int i, int i2, int i3, long j) {
        boolean z;
        int i4;
        boolean z2;
        boolean z3;
        MethodCollector.m26663i(934);
        KaraokeRegulator karaokeRegulator = this.mRegulator;
        if (!this.mEnable) {
            if (karaokeRegulator != null) {
                karaokeRegulator.popBackgroundMusicFrame();
            }
            MethodCollector.m26664o(934);
            return buffer;
        }
        IAudioStrangeVoice iAudioStrangeVoice = this.mAudioStrangeVoice;
        if (iAudioStrangeVoice == null || !iAudioStrangeVoice.isEnable()) {
            IKaraokeMovie iKaraokeMovie = this.mKaraokeMovie;
            if (iKaraokeMovie == null) {
                if (!(this.mSampleHz == i2 && i3 == this.mChannel)) {
                    this.mNeedReceiver = true;
                    this.mSampleHz = i2;
                    this.mChannel = i3;
                }
                if (this.mReceiver == null || this.mNeedReceiver) {
                    createReceiver(i2, i3, i, this.mStartTimeMs);
                }
            }
            if (this.mPause) {
                if (karaokeRegulator != null) {
                    karaokeRegulator.popBackgroundMusicFrame();
                }
                MethodCollector.m26664o(934);
                return buffer;
            }
            AudioEffectProcessor.Callback callback = this.mCallback;
            if (iKaraokeMovie == null) {
                synchronized (this.mFence) {
                    try {
                        Receiver receiver = this.mReceiver;
                        Receiver receiver2 = this.mOriginMusicReceiver;
                        if (this.mNeedOrigin && receiver2 != null) {
                            receiver2 = receiver;
                            receiver = receiver2;
                        }
                        if (!(receiver == null || this.mAudioRenderSink == null)) {
                            if (receiver2 != null) {
                                receiver2.readAudioBuffer(this.mReadAudioBuffer, false);
                            }
                            int readAudioBuffer = receiver.readAudioBuffer(this.mReadAudioBuffer, supportPitchShift(), this.mTimeStampMs);
                            if (readAudioBuffer < 0) {
                                if (this.asyncReportError) {
                                    this.mHandler.post(new LiveCoreKaraokFilter$$Lambda$0(this, receiver, readAudioBuffer));
                                } else {
                                    lambda$processInternal$0$LiveCoreKaraokFilter(receiver, readAudioBuffer);
                                }
                            }
                            if (this.mUpdatePitchShift) {
                                this.mUpdatePitchShift = false;
                                setPitchShift(this.mPitchShift);
                            }
                            if (readAudioBuffer == 0) {
                                z = true;
                                i4 = this.mTimeStampMs.get(0);
                                if (callback != null && this.mNeedReportStart) {
                                    callback.start();
                                    this.mNeedReportStart = false;
                                    this.mNeedReportEnd = true;
                                }
                            }
                        }
                        z = false;
                        i4 = this.mTimeStampMs.get(0);
                        callback.start();
                        this.mNeedReportStart = false;
                        this.mNeedReportEnd = true;
                    } catch (Throwable th) {
                        MethodCollector.m26664o(934);
                        throw th;
                    }
                }
            } else {
                z = false;
                i4 = 0;
            }
            if (iKaraokeMovie != null && !z) {
                if (this.mReadAudioBuffer == null) {
                    this.mReadAudioBuffer = ByteBuffer.allocateDirect(i * 2 * i3);
                }
                NativeAudioEffect nativeAudioEffect = this.mAudioEffect;
                if (nativeAudioEffect == null) {
                    z = iKaraokeMovie.readAudioBufferByKaraoke(this.mReadAudioBuffer, i2, i3, i);
                } else if (supportPitchShift() || this.enableAutoVolume == 1) {
                    do {
                        z = iKaraokeMovie.readAudioBufferByKaraoke(this.mReadAudioBuffer, i2, i3, i);
                        if (!z) {
                            break;
                        }
                    } while (nativeAudioEffect.process(this.mReadAudioBuffer, i2, i3, i) == 1);
                } else {
                    z = iKaraokeMovie.readAudioBufferByKaraoke(this.mReadAudioBuffer, i2, i3, i);
                }
                i4 = (int) iKaraokeMovie.getCurrentPlaybackTimeMs();
            }
            if (z) {
                if (callback != null) {
                    callback.onProgress((long) i4);
                }
                if (this.mAudioKaraokeWrapper != null) {
                    try {
                        if (this.mAudioKaraokeWrapperFence.tryLock(10, TimeUnit.MILLISECONDS)) {
                            AudioKaraokeWrapper audioKaraokeWrapper = this.mAudioKaraokeWrapper;
                            if (audioKaraokeWrapper != null) {
                                audioKaraokeWrapper.process(buffer, i);
                            }
                            this.mAudioKaraokeWrapperFence.unlock();
                        }
                    } catch (InterruptedException unused) {
                    }
                }
                AudioDeviceModule audioDeviceModule = this.mAudioDeviceModule;
                if (karaokeRegulator != null && audioDeviceModule != null) {
                    long j2 = this.mRenderCounts + 1;
                    this.mRenderCounts = j2;
                    if (j2 % 50 == 0) {
                        this.mRenderCounts = 0;
                        karaokeRegulator.updateCaptureDelayMs(audioDeviceModule.getCaptureDelayMs());
                        karaokeRegulator.updatePlayerDelayMs(this.mAudioRenderSink.getRenderDelayMs() + audioDeviceModule.getPlayerDelayMs());
                    }
                    ByteBuffer popBackgroundMusicFrame = karaokeRegulator.popBackgroundMusicFrame();
                    if (popBackgroundMusicFrame != null && (z3 = this.mNeedMixer) && !this.mMixBgmWithQuirk) {
                        Receiver.nativeMixer(buffer, popBackgroundMusicFrame, 1.0f, this.mVoiceEq, i, i3, z3);
                    }
                    Receiver.nativeMixer(buffer, this.mReadAudioBuffer, this.mBGMAGC, this.mVoiceEq, i, i3, false);
                    karaokeRegulator.pushBackgroundMusicFrame(this.mReadAudioBuffer);
                } else if (!this.mMixBgmWithQuirk) {
                    Receiver.nativeMixer(buffer, this.mReadAudioBuffer, this.mBGMAGC, this.mVoiceEq, i, i3, this.mNeedMixer);
                }
                this.mAudioRenderSink.onData(this.mReadAudioBuffer, i, i2, i3, j);
            } else if (karaokeRegulator != null && karaokeRegulator.size() > 0) {
                ByteBuffer popBackgroundMusicFrame2 = karaokeRegulator.popBackgroundMusicFrame();
                if (popBackgroundMusicFrame2 != null && (z2 = this.mNeedMixer) && !this.mMixBgmWithQuirk) {
                    Receiver.nativeMixer(buffer, popBackgroundMusicFrame2, 1.0f, this.mVoiceEq, i, i3, z2);
                }
                MethodCollector.m26664o(934);
                return buffer;
            }
            if (!z && this.mNeedReportEnd && callback != null) {
                callback.stop();
                this.mNeedReportEnd = false;
            }
            MethodCollector.m26664o(934);
            return buffer;
        }
        if (karaokeRegulator != null) {
            karaokeRegulator.popBackgroundMusicFrame();
        }
        Buffer process = iAudioStrangeVoice.process(buffer, i, i2, i3, j);
        MethodCollector.m26664o(934);
        return process;
    }
}
