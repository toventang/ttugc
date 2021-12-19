package com.p2082ss.avframework.capture.audio;

import android.media.AudioManager;
import android.media.AudioRecord;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.C15346a;
import com.p2082ss.avframework.capture.audio.AudioCapturer;
import com.p2082ss.avframework.capture.audio.AudioRecordThread;
import com.p2082ss.avframework.utils.AVLog;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: com.ss.avframework.capture.audio.AudioCapturerAudioRecord */
public class AudioCapturerAudioRecord extends AudioCapturer {
    private static String TAG = "AudioCapturerAudioRecord";
    public AudioCapturer.AudioCaptureObserver mAudioCaptureObserver;
    private AudioRecord mAudioRecord;
    private int mAudioSource;
    private AudioRecordThread mAudioThread;
    private final int mBitWidth;
    private int mChannel;
    public boolean mPause;
    private List<AudioManager.AudioRecordingCallback> mRecordCallbackList;
    private final int mSample;
    private int mStat;

    private int channelCountToConfiguration(int i) {
        return i == 1 ? 16 : 12;
    }

    /* renamed from: com_ss_avframework_capture_audio_AudioCapturerAudioRecord_android_media_AudioRecord_release */
    private static void m147756x1f24f63(AudioRecord audioRecord) {
        if (!((Boolean) C15346a.m28238a(audioRecord, new Object[0], 100403, "void", false, null).first).booleanValue()) {
            C15346a.m28240a(null, audioRecord, new Object[0], 100405, "com_ss_avframework_capture_audio_AudioCapturerAudioRecord_android_media_AudioRecord_release(Landroid/media/AudioRecord;)V");
            audioRecord.release();
            C15346a.m28240a(null, audioRecord, new Object[0], 100403, "com_ss_avframework_capture_audio_AudioCapturerAudioRecord_android_media_AudioRecord_release(Landroid/media/AudioRecord;)V");
        }
    }

    /* renamed from: com_ss_avframework_capture_audio_AudioCapturerAudioRecord_android_media_AudioRecord_startRecording */
    private static void m147757x46cac0d3(AudioRecord audioRecord) {
        if (!((Boolean) C15346a.m28238a(audioRecord, new Object[0], 100400, "void", false, null).first).booleanValue()) {
            audioRecord.startRecording();
            C15346a.m28240a(null, audioRecord, new Object[0], 100400, "com_ss_avframework_capture_audio_AudioCapturerAudioRecord_android_media_AudioRecord_startRecording(Landroid/media/AudioRecord;)V");
        }
    }

    /* renamed from: com_ss_avframework_capture_audio_AudioCapturerAudioRecord_android_media_AudioRecord_stop */
    private static void m147758x86197e26(AudioRecord audioRecord) {
        if (!((Boolean) C15346a.m28238a(audioRecord, new Object[0], 100401, "void", false, null).first).booleanValue()) {
            C15346a.m28240a(null, audioRecord, new Object[0], 100404, "com_ss_avframework_capture_audio_AudioCapturerAudioRecord_android_media_AudioRecord_stop(Landroid/media/AudioRecord;)V");
            audioRecord.stop();
            C15346a.m28240a(null, audioRecord, new Object[0], 100401, "com_ss_avframework_capture_audio_AudioCapturerAudioRecord_android_media_AudioRecord_stop(Landroid/media/AudioRecord;)V");
        }
    }

    @Override // com.p2082ss.avframework.capture.audio.AudioCapturer
    public void pause() {
        this.mPause = true;
    }

    @Override // com.p2082ss.avframework.capture.audio.AudioCapturer
    public void resume() {
        this.mPause = false;
    }

    public int getAudioSource() {
        return this.mAudioSource;
    }

    @Override // com.p2082ss.avframework.engine.MediaSource
    public int status() {
        return this.mStat;
    }

    @Override // com.p2082ss.avframework.capture.audio.AudioCapturer
    public int updateChannel() {
        return this.mChannel;
    }

    static {
        Covode.recordClassIndex(99863);
    }

    @Override // com.p2082ss.avframework.engine.NativeObject, com.p2082ss.avframework.engine.AudioSource, com.p2082ss.avframework.capture.audio.AudioCapturer
    public synchronized void release() {
        MethodCollector.m26663i(2441);
        AVLog.iod(TAG, "Release audioRecord ".concat(String.valueOf(this)));
        releaseAllAudioRecordingCbs();
        stop();
        super.release();
        MethodCollector.m26664o(2441);
    }

    private synchronized void releaseAllAudioRecordingCbs() {
        MethodCollector.m26663i(2445);
        if (Build.VERSION.SDK_INT >= 29) {
            if (this.mRecordCallbackList.size() == 0 || this.mAudioRecord == null) {
                MethodCollector.m26664o(2445);
                return;
            }
            for (AudioManager.AudioRecordingCallback audioRecordingCallback : this.mRecordCallbackList) {
                this.mAudioRecord.unregisterAudioRecordingCallback(audioRecordingCallback);
            }
            this.mRecordCallbackList.clear();
        }
        MethodCollector.m26664o(2445);
    }

    private void startRecording() {
        AVLog.m147805d(TAG, "startRecording");
        try {
            m147757x46cac0d3(this.mAudioRecord);
            if (this.mAudioRecord.getRecordingState() == 3) {
                AudioRecordThread audioRecordThread = new AudioRecordThread(this.mAudioRecord, new AudioRecordThread.IAudioRecordThreadObserver() {
                    /* class com.p2082ss.avframework.capture.audio.AudioCapturerAudioRecord.C856471 */

                    static {
                        Covode.recordClassIndex(99864);
                    }

                    @Override // com.p2082ss.avframework.capture.audio.AudioRecordThread.IAudioRecordThreadObserver
                    public void onError(int i, Exception exc) {
                        if (AudioCapturerAudioRecord.this.mAudioCaptureObserver != null) {
                            AudioCapturerAudioRecord.this.mAudioCaptureObserver.onAudioCaptureError(i, exc);
                        }
                    }

                    @Override // com.p2082ss.avframework.capture.audio.AudioRecordThread.IAudioRecordThreadObserver
                    public void onData(ByteBuffer byteBuffer, int i, int i2, int i3, long j) {
                        if (!AudioCapturerAudioRecord.this.mPause) {
                            AudioCapturerAudioRecord.this.nativeOnData(byteBuffer, i, i2, i3, j);
                        }
                    }
                });
                this.mAudioThread = audioRecordThread;
                audioRecordThread.start();
                this.mStat = 1;
                AVLog.iow(TAG, "AudioRecord started");
                return;
            }
            IllegalStateException illegalStateException = new IllegalStateException("AudioRecord.startRecording failed - incorrect state :" + this.mAudioRecord.getRecordingState());
            AVLog.m147809w(TAG, illegalStateException.getMessage());
            AVLog.ioe(TAG, illegalStateException.getMessage());
            throw illegalStateException;
        } catch (IllegalStateException e) {
            throw new IllegalStateException("AudioRecord.startRecording failed: " + e.getMessage());
        }
    }

    @Override // com.p2082ss.avframework.capture.audio.AudioCapturer
    public synchronized void stop() {
        MethodCollector.m26663i(2438);
        AudioRecordThread audioRecordThread = this.mAudioThread;
        if (audioRecordThread != null) {
            audioRecordThread.stop();
            this.mAudioThread = null;
        }
        AudioRecord audioRecord = this.mAudioRecord;
        if (audioRecord != null) {
            try {
                m147758x86197e26(audioRecord);
                AVLog.iow(TAG, "AudioRecord stopped");
            } catch (IllegalStateException e) {
                AVLog.ioe(TAG, "AudioRecord.stop() error: " + e.toString());
            }
            m147756x1f24f63(this.mAudioRecord);
            this.mAudioRecord = null;
            AVLog.iow(TAG, "AudioRecord released");
        }
        this.mAudioCaptureObserver = null;
        this.mStat = 2;
        MethodCollector.m26664o(2438);
    }

    @Override // com.p2082ss.avframework.capture.audio.AudioCapturer
    public void start() {
        int channelCountToConfiguration = channelCountToConfiguration(this.mChannel);
        int minBufferSize = AudioRecord.getMinBufferSize(this.mSample, channelCountToConfiguration, 2);
        if (minBufferSize == -1 || minBufferSize == -2) {
            throw new IllegalStateException("AudioRecord.getMinBufferSize failed: ".concat(String.valueOf(minBufferSize)));
        }
        AVLog.m147805d(TAG, "AudioRecord.getMinBufferSize: ".concat(String.valueOf(minBufferSize)));
        int max = Math.max(minBufferSize * 2, this.mChannel * (this.mBitWidth / 8) * (this.mSample / 100));
        AVLog.m147805d(TAG, "bufferSizeInBytes: ".concat(String.valueOf(max)));
        try {
            AVLog.ioi(TAG, "Using audio mode " + this.mAudioSource + " at AudioRecord " + this);
            AudioRecord audioRecord = new AudioRecord(this.mAudioSource, this.mSample, channelCountToConfiguration, 2, max);
            this.mAudioRecord = audioRecord;
            if (audioRecord.getState() == 1) {
                startRecording();
                return;
            }
            throw new IllegalStateException("Failed to create a new AudioRecord instance");
        } catch (IllegalArgumentException e) {
            if (this.mChannel != 1) {
                AudioRecord audioRecord2 = this.mAudioRecord;
                if (audioRecord2 != null) {
                    m147756x1f24f63(audioRecord2);
                }
                this.mChannel = 1;
                AVLog.m147805d(TAG, "AudioRecord trying mono...");
                start();
                return;
            }
            throw new IllegalStateException("AudioRecord ctor error: " + e.getMessage());
        }
    }

    public synchronized void unRegisterAudioRecordingCallback(AudioManager.AudioRecordingCallback audioRecordingCallback) {
        MethodCollector.m26663i(2449);
        if (!(Build.VERSION.SDK_INT < 29 || audioRecordingCallback == null || this.mAudioRecord == null)) {
            if (!this.mRecordCallbackList.contains(audioRecordingCallback)) {
                MethodCollector.m26664o(2449);
                return;
            } else {
                this.mRecordCallbackList.remove(audioRecordingCallback);
                this.mAudioRecord.unregisterAudioRecordingCallback(audioRecordingCallback);
            }
        }
        MethodCollector.m26664o(2449);
    }

    public synchronized void registerAudioRecordingCallback(Executor executor, AudioManager.AudioRecordingCallback audioRecordingCallback) {
        MethodCollector.m26663i(2442);
        if (!(Build.VERSION.SDK_INT < 29 || audioRecordingCallback == null || this.mAudioRecord == null || executor == null)) {
            if (this.mRecordCallbackList.contains(audioRecordingCallback)) {
                MethodCollector.m26664o(2442);
                return;
            } else {
                this.mRecordCallbackList.add(audioRecordingCallback);
                this.mAudioRecord.registerAudioRecordingCallback(executor, audioRecordingCallback);
            }
        }
        MethodCollector.m26664o(2442);
    }

    public AudioCapturerAudioRecord(int i, int i2, int i3) {
        this(1, i, i2, i3, null);
    }

    public AudioCapturerAudioRecord(int i, int i2, int i3, AudioCapturer.AudioCaptureObserver audioCaptureObserver) {
        this(1, i, i2, i3, audioCaptureObserver);
    }

    public AudioCapturerAudioRecord(int i, int i2, int i3, int i4, AudioCapturer.AudioCaptureObserver audioCaptureObserver) {
        this.mRecordCallbackList = new ArrayList();
        AVLog.iod(TAG, "Construct audioRecord ".concat(String.valueOf(this)));
        this.mStat = 0;
        this.mSample = i2;
        this.mChannel = i3;
        this.mBitWidth = i4;
        this.mAudioSource = i;
        this.mAudioCaptureObserver = audioCaptureObserver;
        setMode(i);
        pause();
    }
}
