package com.p2082ss.avframework.livestreamv2.capture;

import android.media.AudioManager;
import android.os.Handler;
import android.util.AndroidRuntimeException;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.avframework.buffer.WrapperNativeAudioBuffer;
import com.p2082ss.avframework.capture.audio.AudioCapturer;
import com.p2082ss.avframework.engine.AudioDeviceModule;
import com.p2082ss.avframework.engine.AudioSink;
import com.p2082ss.avframework.engine.MediaEngineFactory;
import com.p2082ss.avframework.utils.AVLog;
import com.p2082ss.avframework.utils.SafeHandlerThreadPoolExecutor;
import com.p2082ss.avframework.utils.TEBundle;
import com.p2082ss.avframework.utils.ThreadUtils;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;

/* renamed from: com.ss.avframework.livestreamv2.capture.LiveStreamAudioCaptureFromADM */
public class LiveStreamAudioCaptureFromADM extends LiveStreamAudioCapture {
    public static final String TAG = LiveStreamAudioCaptureFromADM.class.getSimpleName();
    public boolean mRecording;
    public boolean mStoped;

    @Override // com.p2082ss.avframework.livestreamv2.capture.LiveStreamAudioCapture
    public int getCurrentCaptureDevice() {
        return 5;
    }

    @Override // com.p2082ss.avframework.capture.audio.AudioCapturer
    public void pause() {
    }

    @Override // com.p2082ss.avframework.livestreamv2.capture.LiveStreamAudioCapture
    public void registerAudioRecordingCallback(Executor executor, AudioManager.AudioRecordingCallback audioRecordingCallback) {
    }

    @Override // com.p2082ss.avframework.capture.audio.AudioCapturer
    public void resume() {
    }

    @Override // com.p2082ss.avframework.livestreamv2.capture.LiveStreamAudioCapture, com.p2082ss.avframework.engine.MediaSource
    public int status() {
        return 1;
    }

    @Override // com.p2082ss.avframework.livestreamv2.capture.LiveStreamAudioCapture
    public void unRegisterAudioRecordingCallback(AudioManager.AudioRecordingCallback audioRecordingCallback) {
    }

    static {
        Covode.recordClassIndex(100142);
    }

    @Override // com.p2082ss.avframework.capture.audio.AudioCapturer
    public int getMode() {
        if (this.mADM.isVoIPMode()) {
            return 7;
        }
        return 1;
    }

    @Override // com.p2082ss.avframework.livestreamv2.capture.LiveStreamAudioCapture
    public void toBackground() {
        this.mHandler.post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.capture.LiveStreamAudioCaptureFromADM.RunnableC857742 */

            static {
                Covode.recordClassIndex(100144);
            }

            public void run() {
                boolean z;
                if (!LiveStreamAudioCaptureFromADM.this.mStoped) {
                    AudioDeviceModule audioDeviceModule = LiveStreamAudioCaptureFromADM.this.mADM;
                    if (LiveStreamAudioCaptureFromADM.this.mBGMMode == 4) {
                        z = true;
                    } else {
                        z = false;
                    }
                    audioDeviceModule.disableLocalAudioStream(z);
                    LiveStreamAudioCaptureFromADM.this.mADM.pause();
                    AVLog.iod(LiveStreamAudioCaptureFromADM.TAG, "toBackground with stop recording (" + LiveStreamAudioCaptureFromADM.this.mRecording + ") and disable stream (" + LiveStreamAudioCaptureFromADM.this.mADM.isDisableLocalAudioStream() + ")");
                }
            }
        });
    }

    @Override // com.p2082ss.avframework.livestreamv2.capture.LiveStreamAudioCapture
    public void toFront() {
        this.mHandler.post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.capture.LiveStreamAudioCaptureFromADM.RunnableC857753 */

            static {
                Covode.recordClassIndex(100145);
            }

            public void run() {
                String str;
                if (!LiveStreamAudioCaptureFromADM.this.mStoped) {
                    LiveStreamAudioCaptureFromADM.this.mADM.disableLocalAudioStream(false);
                    LiveStreamAudioCaptureFromADM.this.mADM.resume();
                    String str2 = LiveStreamAudioCaptureFromADM.TAG;
                    StringBuilder sb = new StringBuilder("toFront with ");
                    if (LiveStreamAudioCaptureFromADM.this.mRecording) {
                        str = "start recording ";
                    } else {
                        str = "stop recording";
                    }
                    AVLog.iod(str2, sb.append(str).toString());
                }
            }
        });
    }

    @Override // com.p2082ss.avframework.livestreamv2.capture.LiveStreamAudioCapture, com.p2082ss.avframework.capture.audio.AudioCapturer
    public int updateChannel() {
        return this.mADM.getParameter().getInt("audio_channels");
    }

    @Override // com.p2082ss.avframework.capture.audio.AudioCapturer
    public boolean isMute() {
        final boolean[] zArr = {false};
        ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.capture.LiveStreamAudioCaptureFromADM.RunnableC857775 */

            static {
                Covode.recordClassIndex(100147);
            }

            public void run() {
                zArr[0] = LiveStreamAudioCaptureFromADM.this.mADM.isMute();
            }
        });
        return zArr[0];
    }

    @Override // com.p2082ss.avframework.livestreamv2.capture.LiveStreamAudioCapture, com.p2082ss.avframework.capture.audio.AudioCapturer
    public synchronized void start() {
        MethodCollector.m26663i(527);
        this.mHandler.post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.capture.LiveStreamAudioCaptureFromADM.RunnableC857786 */

            static {
                Covode.recordClassIndex(100148);
            }

            public void run() {
                LiveStreamAudioCaptureFromADM.this.mADM.startRecording();
                AVLog.iod(LiveStreamAudioCaptureFromADM.TAG, "start recording.");
                LiveStreamAudioCaptureFromADM.this.mRecording = true;
            }
        });
        MethodCollector.m26664o(527);
    }

    @Override // com.p2082ss.avframework.livestreamv2.capture.LiveStreamAudioCapture, com.p2082ss.avframework.capture.audio.AudioCapturer
    public synchronized void stop() {
        MethodCollector.m26663i(537);
        this.mHandler.post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.capture.LiveStreamAudioCaptureFromADM.RunnableC857797 */

            static {
                Covode.recordClassIndex(100149);
            }

            public void run() {
                if (!LiveStreamAudioCaptureFromADM.this.mStoped) {
                    LiveStreamAudioCaptureFromADM.this.mStoped = true;
                    AudioDeviceModule audioDeviceModule = LiveStreamAudioCaptureFromADM.this.mADM;
                    if (audioDeviceModule != null) {
                        audioDeviceModule.stopRecording();
                    }
                    LiveStreamAudioCaptureFromADM.this.mRecording = false;
                    AVLog.iod(LiveStreamAudioCaptureFromADM.TAG, "stop recording.");
                }
            }
        });
        MethodCollector.m26664o(537);
    }

    @Override // com.p2082ss.avframework.livestreamv2.capture.LiveStreamAudioCapture, com.p2082ss.avframework.engine.NativeObject, com.p2082ss.avframework.engine.AudioSource, com.p2082ss.avframework.capture.audio.AudioCapturer
    public synchronized void release() {
        MethodCollector.m26663i(1368);
        String str = TAG;
        AVLog.iod(str, "release this ".concat(String.valueOf(this)));
        stop();
        this.mObserver = null;
        long[] jArr = {-1};
        jArr[0] = ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.capture.LiveStreamAudioCaptureFromADM.RunnableC857808 */

            static {
                Covode.recordClassIndex(100150);
            }

            public void run() {
            }
        }, 3000);
        SafeHandlerThreadPoolExecutor.unlockThread(this.mThread);
        AVLog.iod(str, "release this " + this + " done, ret " + jArr[0]);
        super.superRelease();
        MethodCollector.m26664o(1368);
    }

    @Override // com.p2082ss.avframework.livestreamv2.capture.LiveStreamAudioCapture, com.p2082ss.avframework.capture.audio.AudioCapturer
    public void mute(final boolean z) {
        this.mHandler.post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.capture.LiveStreamAudioCaptureFromADM.RunnableC857764 */

            static {
                Covode.recordClassIndex(100146);
            }

            public void run() {
                LiveStreamAudioCaptureFromADM.this.mADM.setMicMute(z);
                AVLog.iod(LiveStreamAudioCaptureFromADM.TAG, "set microphone mute " + z);
            }
        });
    }

    @Override // com.p2082ss.avframework.livestreamv2.capture.LiveStreamAudioCapture, com.p2082ss.avframework.capture.audio.AudioCapturer
    public void setVolume(double d) {
        AudioDeviceModule audioDeviceModule = this.mADM;
        if (audioDeviceModule != null) {
            audioDeviceModule.setMicVolume((float) d);
        }
    }

    @Override // com.p2082ss.avframework.livestreamv2.capture.LiveStreamAudioCapture
    public void switchAudioMode(final int i) {
        this.mHandler.post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.capture.LiveStreamAudioCaptureFromADM.RunnableC857731 */

            static {
                Covode.recordClassIndex(100143);
            }

            public void run() {
                boolean z;
                if (!LiveStreamAudioCaptureFromADM.this.mStoped) {
                    if (7 == i) {
                        z = true;
                    } else {
                        z = false;
                    }
                    LiveStreamAudioCaptureFromADM.this.mADM.switchToVoIP(z);
                    AVLog.iod(LiveStreamAudioCaptureFromADM.TAG, "switch to VoIP ".concat(String.valueOf(z)));
                }
            }
        });
    }

    @Override // com.p2082ss.avframework.livestreamv2.capture.LiveStreamAudioCapture
    public void addOriginAudioSink(AudioSink audioSink) {
        if (audioSink != null) {
            if (this.mADM == null || !this.mADM.isSeperateRecordingCallback()) {
                super.addOriginAudioSink(audioSink);
            } else {
                this.mADM.addAudioSink(3, audioSink);
            }
        }
    }

    @Override // com.p2082ss.avframework.livestreamv2.capture.LiveStreamAudioCapture
    public void removeAudioSink(AudioSink audioSink) {
        if (audioSink != null) {
            if (this.mADM == null || !this.mADM.isSeperateRecordingCallback()) {
                super.removeAudioSink(audioSink);
            } else {
                this.mADM.removeAudioSink(3, audioSink);
            }
        }
    }

    @Override // com.p2082ss.avframework.capture.audio.AudioCapturer
    public void setAudioQuantizeGapPeriod(long j) {
        AudioDeviceModule audioDeviceModule = this.mADM;
        if (audioDeviceModule != null) {
            TEBundle parameter = audioDeviceModule.getParameter();
            parameter.setInt("adm_audio_record_power_gap_ms", (int) j);
            audioDeviceModule.setParameter(parameter);
        }
    }

    @Override // com.p2082ss.avframework.capture.audio.AudioCapturer
    public void setMode(int i) {
        AVLog.iow(TAG, "Ignore switch mode(" + i + ") on ADM mode.");
    }

    @Override // com.p2082ss.avframework.livestreamv2.capture.LiveStreamAudioCapture
    public void switchSource(int i) {
        AVLog.iow(TAG, "Ignore switch capture(" + i + ") on ADM mode.");
    }

    @Override // com.p2082ss.avframework.livestreamv2.capture.LiveStreamAudioCapture, com.p2082ss.avframework.capture.audio.AudioCapturer.AudioCaptureObserver
    public void onAudioCaptureError(int i, Exception exc) {
        AudioCapturer.AudioCaptureObserver audioCaptureObserver = this.mObserver;
        if (audioCaptureObserver != null) {
            audioCaptureObserver.onAudioCaptureError(i, exc);
        }
        AVLog.logKibana(5, TAG, "onAudioCaptureError,code:" + i + "," + this, exc);
    }

    @Override // com.p2082ss.avframework.capture.audio.AudioCapturer
    public void setOutputFormat(int i, int i2, int i3) {
        nativeAdaptedOutputFormat(i, i2, i3);
    }

    @Override // com.p2082ss.avframework.livestreamv2.capture.LiveStreamAudioCapture
    public void onData(WrapperNativeAudioBuffer wrapperNativeAudioBuffer, int i, int i2, int i3, long j) {
        throw new AndroidRuntimeException("Not should be here.");
    }

    @Override // com.p2082ss.avframework.livestreamv2.capture.LiveStreamAudioCapture
    public void onData(Buffer buffer, int i, int i2, int i3, long j) {
        throw new AndroidRuntimeException("Not should be here.");
    }

    @Override // com.p2082ss.avframework.livestreamv2.capture.LiveStreamAudioCapture
    public int pushAudioFrame(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, long j) {
        throw new AndroidRuntimeException("No Implement");
    }

    public LiveStreamAudioCaptureFromADM(int i, int i2, int i3, int i4, int i5, Handler handler, AudioCapturer.AudioCaptureObserver audioCaptureObserver, MediaEngineFactory mediaEngineFactory, int i6, AudioDeviceModule audioDeviceModule) {
        super(i, i2, i3, i4, i5, handler, audioCaptureObserver, null, i6);
        this.mADM = audioDeviceModule;
        AVLog.iod(TAG, "Create LiveStreamAudioCaptureFromADM with bgmMode " + i6 + " source " + i2 + " this " + this);
    }
}
