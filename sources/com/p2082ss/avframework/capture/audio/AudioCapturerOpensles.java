package com.p2082ss.avframework.capture.audio;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.avframework.capture.audio.AudioCapturer;

/* renamed from: com.ss.avframework.capture.audio.AudioCapturerOpensles */
public class AudioCapturerOpensles extends AudioCapturer {
    public AudioCapturer.AudioCaptureObserver mAudioCaptureObserver;
    private int mChannel;
    private Runnable mCheckRecordingRunnable;
    private Handler mHandler;
    private int mStat;

    static {
        Covode.recordClassIndex(99866);
    }

    private native void nativeCreate(int i, int i2, int i3, int i4);

    private native void nativePause();

    private native void nativeResume();

    private native int nativeStart();

    private native void nativeStop();

    public native boolean nativeRecording();

    @Override // com.p2082ss.avframework.engine.MediaSource
    public int status() {
        return this.mStat;
    }

    @Override // com.p2082ss.avframework.capture.audio.AudioCapturer
    public int updateChannel() {
        return this.mChannel;
    }

    @Override // com.p2082ss.avframework.capture.audio.AudioCapturer
    public void pause() {
        MethodCollector.m26663i(3810);
        nativePause();
        MethodCollector.m26664o(3810);
    }

    @Override // com.p2082ss.avframework.capture.audio.AudioCapturer
    public void resume() {
        MethodCollector.m26663i(3807);
        nativeResume();
        MethodCollector.m26664o(3807);
    }

    @Override // com.p2082ss.avframework.engine.NativeObject, com.p2082ss.avframework.engine.AudioSource, com.p2082ss.avframework.capture.audio.AudioCapturer
    public synchronized void release() {
        MethodCollector.m26663i(3720);
        stop();
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mCheckRecordingRunnable);
        }
        super.release();
        MethodCollector.m26664o(3720);
    }

    @Override // com.p2082ss.avframework.capture.audio.AudioCapturer
    public synchronized void stop() {
        MethodCollector.m26663i(3719);
        if (this.mStat != 2) {
            pause();
            nativeStop();
            this.mStat = 2;
        }
        MethodCollector.m26664o(3719);
    }

    @Override // com.p2082ss.avframework.capture.audio.AudioCapturer
    public void start() {
        MethodCollector.m26663i(3718);
        int nativeStart = nativeStart();
        if (nativeStart == 0) {
            this.mStat = 1;
            if (this.mHandler == null) {
                this.mHandler = new Handler(Looper.myLooper());
                this.mCheckRecordingRunnable = new Runnable() {
                    /* class com.p2082ss.avframework.capture.audio.AudioCapturerOpensles.RunnableC856481 */

                    static {
                        Covode.recordClassIndex(99867);
                    }

                    public void run() {
                        MethodCollector.m26663i(1453);
                        if (!AudioCapturerOpensles.this.nativeRecording() && AudioCapturerOpensles.this.mAudioCaptureObserver != null) {
                            AudioCapturerOpensles.this.mAudioCaptureObserver.onAudioCaptureError(-303, new Exception("OpenSL ES is not recording."));
                        }
                        MethodCollector.m26664o(1453);
                    }
                };
            }
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.postDelayed(this.mCheckRecordingRunnable, 3000);
            }
            MethodCollector.m26664o(3718);
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Start failure (" + nativeStart + ")");
        MethodCollector.m26664o(3718);
        throw illegalStateException;
    }

    private void channelChange(int i) {
        this.mChannel = i;
    }

    public AudioCapturerOpensles(int i, int i2, int i3, AudioCapturer.AudioCaptureObserver audioCaptureObserver) {
        this(1, i, i2, i3, audioCaptureObserver);
    }

    public AudioCapturerOpensles(int i, int i2, int i3, int i4, AudioCapturer.AudioCaptureObserver audioCaptureObserver) {
        MethodCollector.m26663i(3710);
        this.mChannel = i3;
        this.mAudioCaptureObserver = audioCaptureObserver;
        nativeCreate(i, i2, i3, i4);
        setMode(i);
        MethodCollector.m26664o(3710);
    }
}
