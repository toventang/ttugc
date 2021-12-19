package com.p2082ss.avframework.livestreamv2.capture;

import android.media.AudioManager;
import android.os.Handler;
import android.util.AndroidRuntimeException;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.avframework.buffer.WrapperNativeAudioBuffer;
import com.p2082ss.avframework.capture.audio.AudioCapturer;
import com.p2082ss.avframework.capture.audio.AudioCapturerAudioRecord;
import com.p2082ss.avframework.capture.audio.AudioCapturerFromADM;
import com.p2082ss.avframework.capture.audio.AudioCapturerOpensles;
import com.p2082ss.avframework.engine.AudioDeviceModule;
import com.p2082ss.avframework.engine.AudioSink;
import com.p2082ss.avframework.engine.AudioTrack;
import com.p2082ss.avframework.engine.MediaEngineFactory;
import com.p2082ss.avframework.utils.AVLog;
import com.p2082ss.avframework.utils.SafeHandlerThread;
import com.p2082ss.avframework.utils.SafeHandlerThreadPoolExecutor;
import com.p2082ss.avframework.utils.ThreadUtils;
import com.p2082ss.avframework.utils.TimeUtils;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;

/* renamed from: com.ss.avframework.livestreamv2.capture.LiveStreamAudioCapture */
public class LiveStreamAudioCapture extends AudioCapturer implements AudioCapturer.AudioCaptureObserver {
    public AudioCapturer mAudioCapturer;
    public AudioSink mAudioSink;
    private AudioTrack mAudioTrack;
    protected final int mBGMMode;
    public long mBGMTimestampDeltaUs;
    public boolean mBackgroundMode;
    protected final int mBitwidth;
    protected final int mChannle;
    protected Handler mHandler;
    private int mLastOnPauseSource;
    private int mLastSourceOnMute;
    public long mLastTimestampUs;
    private MediaEngineFactory mMediaEngineFactory;
    public ByteBuffer mMute10MsAudioFrame;
    protected AudioCapturer.AudioCaptureObserver mObserver;
    public Runnable mPeriodMuteAudioFrameRunable;
    protected final int mSample;
    public int mSource;
    protected int mStatus;
    protected SafeHandlerThread mThread;
    public boolean mTryOpening = false;
    private Object releaseFence = new Object();

    static {
        Covode.recordClassIndex(100127);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.avframework.livestreamv2.capture.LiveStreamAudioCapture$AudioCaptureMuteSource */
    public class AudioCaptureMuteSource extends AudioCapturer {
        private int mStat;

        static {
            Covode.recordClassIndex(100139);
        }

        @Override // com.p2082ss.avframework.engine.MediaSource
        public int status() {
            return this.mStat;
        }

        @Override // com.p2082ss.avframework.engine.NativeObject, com.p2082ss.avframework.engine.AudioSource, com.p2082ss.avframework.capture.audio.AudioCapturer
        public void release() {
            stop();
            this.mStat = 2;
        }

        @Override // com.p2082ss.avframework.capture.audio.AudioCapturer
        public int updateChannel() {
            return LiveStreamAudioCapture.this.mChannle;
        }

        @Override // com.p2082ss.avframework.capture.audio.AudioCapturer
        public void start() {
            if (this.mStat == 0) {
                LiveStreamAudioCapture.this.mHandler.post(new Runnable() {
                    /* class com.p2082ss.avframework.livestreamv2.capture.LiveStreamAudioCapture.AudioCaptureMuteSource.RunnableC857721 */

                    static {
                        Covode.recordClassIndex(100140);
                    }

                    public void run() {
                        LiveStreamAudioCapture.this.mSource = 6;
                        LiveStreamAudioCapture.this.onTriggerPeriodFrame();
                    }
                });
                this.mStat = 1;
            }
        }

        @Override // com.p2082ss.avframework.capture.audio.AudioCapturer
        public void stop() {
            if (this.mStat == 1) {
                LiveStreamAudioCapture.this.mHandler.removeCallbacks(LiveStreamAudioCapture.this.mPeriodMuteAudioFrameRunable);
                this.mStat = 0;
            }
        }

        public AudioCaptureMuteSource(int i, int i2) {
        }

        /* access modifiers changed from: package-private */
        public void onData(Buffer buffer, int i, int i2, int i3, long j) {
            nativeOnData(buffer, i, i2, i3, j);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.avframework.livestreamv2.capture.LiveStreamAudioCapture$WrapperAudioCaptureExtern */
    public class WrapperAudioCaptureExtern extends AudioCapturerExternal {
        private int mStatus;

        static {
            Covode.recordClassIndex(100141);
        }

        @Override // com.p2082ss.avframework.livestreamv2.capture.AudioCapturerExternal, com.p2082ss.avframework.engine.MediaSource
        public int status() {
            return this.mStatus;
        }

        @Override // com.p2082ss.avframework.livestreamv2.capture.AudioCapturerExternal, com.p2082ss.avframework.capture.audio.AudioCapturer
        public void start() {
            super.start();
            this.mStatus = 1;
        }

        @Override // com.p2082ss.avframework.livestreamv2.capture.AudioCapturerExternal, com.p2082ss.avframework.capture.audio.AudioCapturer
        public synchronized void stop() {
            MethodCollector.m26663i(3115);
            super.stop();
            this.mStatus = 2;
            MethodCollector.m26664o(3115);
        }

        /* access modifiers changed from: protected */
        @Override // com.p2082ss.avframework.livestreamv2.capture.AudioCapturerExternal
        public void onData(Buffer buffer, int i, int i2, int i3, long j) {
            LiveStreamAudioCapture.this.onData(buffer, i, i2, i3, j);
        }

        public WrapperAudioCaptureExtern(int i, int i2, int i3, Handler handler, AudioCapturer.AudioCaptureObserver audioCaptureObserver) {
            super(i, i2, i3, handler, audioCaptureObserver);
        }
    }

    public int getCurrentCaptureDevice() {
        return this.mSource;
    }

    @Override // com.p2082ss.avframework.engine.MediaSource
    public int status() {
        return this.mStatus;
    }

    /* access modifiers changed from: protected */
    public void superRelease() {
        super.release();
    }

    @Override // com.p2082ss.avframework.capture.audio.AudioCapturer
    public int updateChannel() {
        AudioCapturer audioCapturer = this.mAudioCapturer;
        if (audioCapturer != null) {
            return audioCapturer.updateChannel();
        }
        return this.mChannle;
    }

    public boolean needTriggerOnceMore() {
        if (this.mBackgroundMode && this.mBGMMode == 4) {
            return false;
        }
        if (this.mMute || this.mSource == 6 || this.mBackgroundMode) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.avframework.capture.audio.AudioCapturer
    public void start() {
        final Exception[] excArr = new Exception[1];
        ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.capture.LiveStreamAudioCapture.RunnableC857719 */

            static {
                Covode.recordClassIndex(100138);
            }

            public void run() {
                if (LiveStreamAudioCapture.this.status() != 1) {
                    if (LiveStreamAudioCapture.this.mAudioCapturer != null) {
                        LiveStreamAudioCapture.this.mObserver.onAudioCaptureError(-307, new Exception("on live audio capture status exception call."));
                        return;
                    }
                    LiveStreamAudioCapture liveStreamAudioCapture = LiveStreamAudioCapture.this;
                    int onCreateAndStart = liveStreamAudioCapture.onCreateAndStart(liveStreamAudioCapture.mSource);
                    if (onCreateAndStart == -306) {
                        excArr[0] = new Exception("Audio capture status exception");
                        excArr[0].printStackTrace();
                    } else if (onCreateAndStart == -305) {
                        excArr[0] = new Exception("Audio capture create failed");
                        excArr[0].printStackTrace();
                    }
                }
            }
        });
        if (excArr[0] != null) {
            throw new IllegalStateException(excArr[0].getCause());
        }
    }

    @Override // com.p2082ss.avframework.capture.audio.AudioCapturer
    public synchronized void stop() {
        MethodCollector.m26663i(3242);
        ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.capture.LiveStreamAudioCapture.RunnableC8576210 */

            static {
                Covode.recordClassIndex(100129);
            }

            public void run() {
                LiveStreamAudioCapture.this.onReleaseCapture();
                LiveStreamAudioCapture.this.onSetStatus(2);
            }
        });
        MethodCollector.m26664o(3242);
    }

    public void toBackground() {
        AVLog.iod("LiveStreamAudioCapture", "toBack");
        this.mHandler.post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.capture.LiveStreamAudioCapture.RunnableC857642 */

            static {
                Covode.recordClassIndex(100131);
            }

            public void run() {
                LiveStreamAudioCapture.this.onPause();
            }
        });
    }

    public void toFront() {
        AVLog.iod("LiveStreamAudioCapture", "toFront");
        this.mHandler.post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.capture.LiveStreamAudioCapture.RunnableC857664 */

            static {
                Covode.recordClassIndex(100133);
            }

            public void run() {
                LiveStreamAudioCapture.this.onResume();
            }
        });
    }

    public void onPause() {
        AudioCapturer audioCapturer = this.mAudioCapturer;
        if (audioCapturer != null && !(audioCapturer instanceof AudioCapturerExternal)) {
            this.mBackgroundMode = true;
            this.mADM.pause();
            AudioCapturer audioCapturer2 = this.mAudioCapturer;
            if (audioCapturer2 == null || !(audioCapturer2 instanceof AudioCapturerFromADM)) {
                int i = this.mSource;
                this.mLastOnPauseSource = i;
                if (i != 6 || !(audioCapturer2 instanceof AudioCaptureMuteSource)) {
                    onSwitchSource(4);
                    onTriggerPeriodFrame();
                    return;
                }
                AVLog.iod("LiveStreamAudioCapture", "ignore switch audio capture from mute status to extern with pause on mute mode.");
                return;
            }
            this.mADM.stopRecording();
        }
    }

    public void onReleaseCapture() {
        AudioCapturer audioCapturer = this.mAudioCapturer;
        if (audioCapturer != null) {
            audioCapturer.setCalculatePcmPowerEventObserver(null);
            this.mAudioCapturer.pause();
            this.mAudioCapturer.stop();
            this.mAudioCapturer.release();
            this.mAudioCapturer = null;
        }
        AudioTrack audioTrack = this.mAudioTrack;
        if (audioTrack != null) {
            audioTrack.removeAudioSink(this.mAudioSink);
            this.mAudioTrack.release();
            this.mAudioTrack = null;
        }
    }

    @Override // com.p2082ss.avframework.engine.NativeObject, com.p2082ss.avframework.engine.AudioSource, com.p2082ss.avframework.capture.audio.AudioCapturer
    public synchronized void release() {
        MethodCollector.m26663i(3321);
        AVLog.iow("LiveStreamAudioCapture", "Release at LiveStreamAudioCapture ...");
        stop();
        ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.capture.LiveStreamAudioCapture.RunnableC8576311 */

            static {
                Covode.recordClassIndex(100130);
            }

            public void run() {
                if (LiveStreamAudioCapture.this.mAudioSink != null) {
                    LiveStreamAudioCapture.this.mAudioSink.release();
                    LiveStreamAudioCapture.this.mAudioSink = null;
                }
                if (LiveStreamAudioCapture.this.mHandler != null) {
                    LiveStreamAudioCapture.this.mHandler.removeCallbacks(LiveStreamAudioCapture.this.mPeriodMuteAudioFrameRunable);
                }
                if (LiveStreamAudioCapture.this.mThread != null) {
                    SafeHandlerThreadPoolExecutor.unlockThread(LiveStreamAudioCapture.this.mThread);
                    LiveStreamAudioCapture.this.mThread = null;
                }
            }
        });
        synchronized (this.releaseFence) {
            try {
                super.release();
            } catch (Throwable th) {
                MethodCollector.m26664o(3321);
                throw th;
            }
        }
        AVLog.ioi("LiveStreamAudioCapture", "Release at LiveStreamAudioCapture done");
        MethodCollector.m26664o(3321);
    }

    public void onResume() {
        if (!this.mBackgroundMode) {
            new Exception("non background mode, ignore!").printStackTrace();
            return;
        }
        this.mADM.resume();
        this.mBackgroundMode = false;
        AudioCapturer audioCapturer = this.mAudioCapturer;
        if (audioCapturer instanceof AudioCapturerFromADM) {
            this.mADM.startRecording();
        } else if (this.mSource != 6 || !(audioCapturer instanceof AudioCaptureMuteSource)) {
            this.mHandler.removeCallbacks(this.mPeriodMuteAudioFrameRunable);
            onSwitchSource(this.mLastOnPauseSource);
        } else {
            AVLog.iod("LiveStreamAudioCapture", "ignore switch audio capture with resume on mute mode.");
        }
    }

    public void onTriggerPeriodFrame() {
        if (this.mLastOnPauseSource == 5) {
            this.mLastTimestampUs = TimeUtils.nanoTime() / 1000;
        }
        this.mBGMTimestampDeltaUs = (System.nanoTime() / 1000) - this.mLastTimestampUs;
        if (this.mMute10MsAudioFrame == null) {
            int i = (this.mSample / 100) * this.mChannle * (this.mBitwidth / 8);
            this.mMute10MsAudioFrame = ByteBuffer.allocateDirect(i);
            for (int i2 = 0; i2 < i; i2++) {
                this.mMute10MsAudioFrame.put(i2, (byte) 0);
            }
        }
        if (this.mPeriodMuteAudioFrameRunable == null) {
            this.mPeriodMuteAudioFrameRunable = new Runnable() {
                /* class com.p2082ss.avframework.livestreamv2.capture.LiveStreamAudioCapture.RunnableC857653 */

                static {
                    Covode.recordClassIndex(100132);
                }

                public void run() {
                    long nanoTime = ((System.nanoTime() / 1000) - LiveStreamAudioCapture.this.mBGMTimestampDeltaUs) - LiveStreamAudioCapture.this.mLastTimestampUs;
                    if (nanoTime >= 10000) {
                        AudioCapturer audioCapturer = LiveStreamAudioCapture.this.mAudioCapturer;
                        if (audioCapturer instanceof AudioCaptureMuteSource) {
                            ((AudioCaptureMuteSource) audioCapturer).onData(LiveStreamAudioCapture.this.mMute10MsAudioFrame, LiveStreamAudioCapture.this.mSample / 100, LiveStreamAudioCapture.this.mSample, LiveStreamAudioCapture.this.mChannle, LiveStreamAudioCapture.this.mLastTimestampUs + 10000);
                        } else {
                            LiveStreamAudioCapture liveStreamAudioCapture = LiveStreamAudioCapture.this;
                            liveStreamAudioCapture.onData(liveStreamAudioCapture.mMute10MsAudioFrame, LiveStreamAudioCapture.this.mSample / 100, LiveStreamAudioCapture.this.mSample, LiveStreamAudioCapture.this.mChannle, LiveStreamAudioCapture.this.mLastTimestampUs + 10000);
                        }
                        if (nanoTime > 500000) {
                            AVLog.ioe("LiveStreamAudioCapture", "Audio bgm timestamp exception delta(us) ".concat(String.valueOf(nanoTime)));
                        }
                        if (LiveStreamAudioCapture.this.needTriggerOnceMore()) {
                            LiveStreamAudioCapture.this.mHandler.post(LiveStreamAudioCapture.this.mPeriodMuteAudioFrameRunable);
                            return;
                        }
                        return;
                    }
                    long j = 10 - (nanoTime / 1000);
                    if (LiveStreamAudioCapture.this.needTriggerOnceMore()) {
                        LiveStreamAudioCapture.this.mHandler.postDelayed(LiveStreamAudioCapture.this.mPeriodMuteAudioFrameRunable, j);
                    }
                }
            };
        }
        this.mHandler.removeCallbacks(this.mPeriodMuteAudioFrameRunable);
        this.mHandler.postDelayed(this.mPeriodMuteAudioFrameRunable, 10);
    }

    public void onSetStatus(int i) {
        this.mStatus = i;
    }

    public void addOriginAudioSink(AudioSink audioSink) {
        AudioTrack audioTrack = this.mAudioTrack;
        if (audioTrack != null) {
            audioTrack.addAudioSink(audioSink);
        }
    }

    public void removeAudioSink(AudioSink audioSink) {
        AudioTrack audioTrack = this.mAudioTrack;
        if (audioTrack != null) {
            audioTrack.removeAudioSink(audioSink);
        }
    }

    @Override // com.p2082ss.avframework.capture.audio.AudioCapturer
    public void setVolume(double d) {
        AudioCapturer audioCapturer = this.mAudioCapturer;
        if (audioCapturer != null) {
            audioCapturer.setVolume(d);
        }
    }

    @Override // com.p2082ss.avframework.capture.audio.AudioCapturer
    public void mute(final boolean z) {
        this.mHandler.post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.capture.LiveStreamAudioCapture.RunnableC857686 */

            static {
                Covode.recordClassIndex(100135);
            }

            public void run() {
                if (!LiveStreamAudioCapture.this.mBackgroundMode) {
                    LiveStreamAudioCapture.this.onMute(z);
                } else {
                    AVLog.iow("LiveStreamAudioCapture", "Could not mute when in background.");
                }
            }
        });
    }

    public void switchAudioMode(final int i) {
        this.mHandler.post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.capture.LiveStreamAudioCapture.RunnableC857611 */

            static {
                Covode.recordClassIndex(100128);
            }

            public void run() {
                LiveStreamAudioCapture.this.setMode(i);
                LiveStreamAudioCapture liveStreamAudioCapture = LiveStreamAudioCapture.this;
                liveStreamAudioCapture.onSwitchSource(liveStreamAudioCapture.getCurrentCaptureDevice());
            }
        });
    }

    public void switchSource(final int i) {
        this.mHandler.post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.capture.LiveStreamAudioCapture.RunnableC857697 */

            static {
                Covode.recordClassIndex(100136);
            }

            public void run() {
                LiveStreamAudioCapture.this.onSwitchSource(i);
            }
        });
    }

    public void unRegisterAudioRecordingCallback(AudioManager.AudioRecordingCallback audioRecordingCallback) {
        AudioCapturer audioCapturer = this.mAudioCapturer;
        if (audioCapturer != null && (audioCapturer instanceof AudioCapturerAudioRecord)) {
            ((AudioCapturerAudioRecord) audioCapturer).unRegisterAudioRecordingCallback(audioRecordingCallback);
        }
    }

    private void onTryOpenLater(final int i) {
        this.mTryOpening = true;
        AVLog.iod("LiveStreamAudioCapture", "Try open AudioCapture and source " + this.mSource + " VS " + i + " mode " + getMode());
        this.mHandler.postDelayed(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.capture.LiveStreamAudioCapture.RunnableC857708 */

            static {
                Covode.recordClassIndex(100137);
            }

            public void run() {
                LiveStreamAudioCapture.this.onSwitchSource(i);
                AVLog.iod("LiveStreamAudioCapture", "Try open AudioCapture done and source " + LiveStreamAudioCapture.this.mSource + " VS " + i + " mode " + LiveStreamAudioCapture.this.getMode());
                LiveStreamAudioCapture.this.mTryOpening = false;
            }
        }, 200);
    }

    private void onCreateCapture(int i) {
        onReleaseCapture();
        if (i == 2) {
            this.mAudioCapturer = new AudioCapturerOpensles(getMode(), this.mSample, this.mChannle, this.mBitwidth, this);
        } else if (i == 1) {
            this.mAudioCapturer = new AudioCapturerAudioRecord(getMode(), this.mSample, this.mChannle, this.mBitwidth, this);
        } else if (i == 4) {
            WrapperAudioCaptureExtern wrapperAudioCaptureExtern = new WrapperAudioCaptureExtern(this.mSample, this.mChannle, this.mBitwidth, this.mHandler, this);
            this.mAudioCapturer = wrapperAudioCaptureExtern;
            wrapperAudioCaptureExtern.setMode(getMode());
        } else if (i == 5) {
            this.mAudioCapturer = new AudioCapturerFromADM(getMode(), this.mADM, this.mSample, this.mChannle, this);
        } else if (i == 6) {
            this.mAudioCapturer = new AudioCaptureMuteSource(this.mSample, this.mChannle);
        }
    }

    public int onCreateAndStart(int i) {
        onCreateCapture(i);
        AudioCapturer audioCapturer = this.mAudioCapturer;
        if (audioCapturer == null && i != 0) {
            return -305;
        }
        if (this.mAudioTrack == null && !(audioCapturer instanceof AudioCapturerFromADM)) {
            this.mAudioTrack = this.mMediaEngineFactory.createAudioTrack(audioCapturer);
        }
        if (this.mAudioSink == null) {
            this.mAudioSink = new AudioSink() {
                /* class com.p2082ss.avframework.livestreamv2.capture.LiveStreamAudioCapture.C857675 */

                static {
                    Covode.recordClassIndex(100134);
                }

                @Override // com.p2082ss.avframework.engine.AudioSink
                public void onNoData() {
                }

                @Override // com.p2082ss.avframework.engine.AudioSink
                public void onData(WrapperNativeAudioBuffer wrapperNativeAudioBuffer) {
                    LiveStreamAudioCapture.this.onData(wrapperNativeAudioBuffer, wrapperNativeAudioBuffer.mSamplesPerChannel, wrapperNativeAudioBuffer.mSampleRateHz, wrapperNativeAudioBuffer.mChannel, wrapperNativeAudioBuffer.timestampUs);
                }

                @Override // com.p2082ss.avframework.engine.AudioSink
                public void onData(Buffer buffer, int i, int i2, int i3, long j) {
                    LiveStreamAudioCapture.this.onData(buffer, i, i2, i3, j * 1000);
                }
            };
        }
        AudioTrack audioTrack = this.mAudioTrack;
        if (audioTrack != null) {
            audioTrack.addAudioSink(this.mAudioSink);
        }
        this.mAudioCapturer.start();
        this.mAudioCapturer.resume();
        if (this.mAudioCapturer.status() != 1) {
            return -306;
        }
        onSetStatus(this.mAudioCapturer.status());
        this.mSource = i;
        return 0;
    }

    public void onMute(boolean z) {
        if (this.mMute == z) {
            AVLog.iow("LiveStreamAudioCapture", "Ignore to repeat mute operations (" + z + ")");
            return;
        }
        AudioCapturer audioCapturer = this.mAudioCapturer;
        if (audioCapturer != null && !(audioCapturer instanceof AudioCapturerExternal)) {
            String str = "Mute operation (" + this.mMute + " -> " + z + ") last source " + this.mLastSourceOnMute + " current source " + this.mSource;
            AVLog.iod("LiveStreamAudioCapture", str);
            AVLog.logKibana(4, "LiveStreamAudioCapture", str, null);
            this.mMute = z;
            if (audioCapturer instanceof AudioCapturerFromADM) {
                audioCapturer.mute(z);
            } else if (z) {
                this.mLastSourceOnMute = this.mSource;
                onSwitchSource(6);
            } else {
                onSwitchSource(this.mLastSourceOnMute);
            }
        }
    }

    public void onSwitchSource(int i) {
        String str;
        AudioCapturer audioCapturer;
        AudioCapturer audioCapturer2;
        StringBuilder append = new StringBuilder("switch audio source current source ").append(this.mSource).append(" target source ").append(i).append(" audioSourceMode ").append(getMode()).append(" is bgm ").append(this.mBackgroundMode).append(" status ").append(status()).append(" mAudioCapture ");
        if (this.mAudioCapturer != null) {
            str = this.mAudioCapturer + " mode " + this.mAudioCapturer.getMode();
        } else {
            str = "null";
        }
        AVLog.iod("LiveStreamAudioCapture", append.append(str).toString());
        boolean z = true;
        if (status() != 1 && !this.mTryOpening) {
            this.mObserver.onAudioCaptureError(-304, new Exception("on live audio capture status exception call."));
        } else if (this.mTryOpening || this.mSource != i || ((audioCapturer2 = this.mAudioCapturer) != null && audioCapturer2.getMode() != getMode())) {
            if (this.mSource != i || (audioCapturer = this.mAudioCapturer) == null || !(audioCapturer instanceof AudioCapturerFromADM) || audioCapturer.getMode() == getMode()) {
                onReleaseCapture();
                int onCreateAndStart = onCreateAndStart(i);
                if (onCreateAndStart != 0) {
                    if (!this.mTryOpening) {
                        onTryOpenLater(i);
                    } else {
                        Exception exc = null;
                        if (onCreateAndStart == -306) {
                            exc = new Exception("Audio capture status exception");
                        } else if (onCreateAndStart == -305) {
                            exc = new Exception("Audio capture create failed");
                        }
                        this.mObserver.onAudioCaptureError(onCreateAndStart, exc);
                        onSetStatus(2);
                        return;
                    }
                }
                onSetStatus(1);
                return;
            }
            AudioDeviceModule audioDeviceModule = this.mADM;
            if (getMode() != 7) {
                z = false;
            }
            audioDeviceModule.switchToVoIP(z);
            this.mAudioCapturer.setMode(getMode());
        }
    }

    public void registerAudioRecordingCallback(Executor executor, AudioManager.AudioRecordingCallback audioRecordingCallback) {
        AudioCapturer audioCapturer = this.mAudioCapturer;
        if (audioCapturer != null && (audioCapturer instanceof AudioCapturerAudioRecord)) {
            ((AudioCapturerAudioRecord) audioCapturer).registerAudioRecordingCallback(executor, audioRecordingCallback);
        }
    }

    @Override // com.p2082ss.avframework.capture.audio.AudioCapturer.AudioCaptureObserver
    public void onAudioCaptureError(int i, Exception exc) {
        onSetStatus(2);
        AudioCapturer.AudioCaptureObserver audioCaptureObserver = this.mObserver;
        if (audioCaptureObserver != null) {
            audioCaptureObserver.onAudioCaptureError(i, exc);
        }
        AVLog.logKibana(5, "LiveStreamAudioCapture", "onAudioCaptureError,code:" + i + "," + this, exc);
    }

    public void onData(WrapperNativeAudioBuffer wrapperNativeAudioBuffer, int i, int i2, int i3, long j) {
        MethodCollector.m26663i(3462);
        synchronized (this.releaseFence) {
            try {
                nativeOnData(wrapperNativeAudioBuffer, i, i2, i3, j);
                this.mLastTimestampUs = j;
            } finally {
                MethodCollector.m26664o(3462);
            }
        }
    }

    public void onData(Buffer buffer, int i, int i2, int i3, long j) {
        MethodCollector.m26663i(104);
        synchronized (this.releaseFence) {
            try {
                if (buffer.isDirect()) {
                    nativeOnData(buffer, i, i2, i3, j);
                    this.mLastTimestampUs = j;
                } else {
                    AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException("A direct ByteBuffer is needed.");
                    MethodCollector.m26664o(104);
                    throw androidRuntimeException;
                }
            } finally {
                MethodCollector.m26664o(104);
            }
        }
    }

    public int pushAudioFrame(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, long j) {
        AudioCapturer audioCapturer = this.mAudioCapturer;
        if (audioCapturer == null || !(audioCapturer instanceof WrapperAudioCaptureExtern)) {
            return 0;
        }
        ((WrapperAudioCaptureExtern) audioCapturer).onData(byteBuffer, i4, i, i2, j);
        return 0;
    }

    public LiveStreamAudioCapture(int i, int i2, int i3, int i4, int i5, Handler handler, AudioCapturer.AudioCaptureObserver audioCaptureObserver, MediaEngineFactory mediaEngineFactory, int i6) {
        this.mSample = i3;
        this.mChannle = i4;
        this.mBitwidth = i5;
        this.mHandler = handler;
        this.mSource = i2;
        this.mLastOnPauseSource = i2;
        this.mLastSourceOnMute = i2;
        this.mObserver = audioCaptureObserver;
        this.mMediaEngineFactory = mediaEngineFactory;
        setMode(i);
        this.mBGMMode = i6;
        if (this.mHandler == null) {
            SafeHandlerThread lockThread = SafeHandlerThreadPoolExecutor.lockThread("LiveStreamAudioCapture");
            this.mThread = lockThread;
            lockThread.start();
            this.mHandler = this.mThread.getHandler();
        }
    }
}
