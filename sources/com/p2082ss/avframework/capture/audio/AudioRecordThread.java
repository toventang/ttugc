package com.p2082ss.avframework.capture.audio;

import android.media.AudioRecord;
import android.os.Process;
import com.bytedance.covode.number.Covode;
import com.p2082ss.avframework.utils.AVLog;
import com.p2082ss.avframework.utils.SafeHandlerThread;
import com.p2082ss.avframework.utils.SafeHandlerThreadPoolExecutor;
import com.p2082ss.avframework.utils.TimeUtils;
import java.nio.ByteBuffer;

/* renamed from: com.ss.avframework.capture.audio.AudioRecordThread */
public class AudioRecordThread implements Runnable {
    private volatile boolean keepAlive = true;
    private AudioRecord mAudioRecord;
    private IAudioRecordThreadObserver mAudioRecordThreadObserver;
    private final ByteBuffer mByteBuffer;
    private final int mChannel;
    private SafeHandlerThread mDeliverThread;
    private final int mSample;

    /* renamed from: com.ss.avframework.capture.audio.AudioRecordThread$IAudioRecordThreadObserver */
    public interface IAudioRecordThreadObserver {
        static {
            Covode.recordClassIndex(99869);
        }

        void onData(ByteBuffer byteBuffer, int i, int i2, int i3, long j);

        void onError(int i, Exception exc);
    }

    static {
        Covode.recordClassIndex(99868);
    }

    public void start() {
        this.mDeliverThread.post(this);
    }

    public void stop() {
        AVLog.m147805d("AudioRecordThread", "stop");
        this.keepAlive = false;
        SafeHandlerThreadPoolExecutor.unlockThread(this.mDeliverThread);
    }

    public void run() {
        int i;
        String str;
        Process.setThreadPriority(-19);
        long nanoTime = TimeUtils.nanoTime() / 1000;
        while (this.keepAlive) {
            try {
                AudioRecord audioRecord = this.mAudioRecord;
                ByteBuffer byteBuffer = this.mByteBuffer;
                i = audioRecord.read(byteBuffer, byteBuffer.capacity());
            } catch (Throwable unused) {
                i = -3;
            }
            if (i == this.mByteBuffer.capacity()) {
                IAudioRecordThreadObserver iAudioRecordThreadObserver = this.mAudioRecordThreadObserver;
                if (iAudioRecordThreadObserver != null) {
                    ByteBuffer byteBuffer2 = this.mByteBuffer;
                    int i2 = this.mSample;
                    iAudioRecordThreadObserver.onData(byteBuffer2, i2 / 100, i2, this.mChannel, nanoTime);
                }
                nanoTime += 10000;
            } else {
                AVLog.m147806e("AudioRecordThread", "AudioRecord.read failed: ".concat(String.valueOf(i)));
                if (i == -3) {
                    this.keepAlive = false;
                    AVLog.m147806e("AudioRecordThread", "AudioRecord read error, invalid operation");
                    IAudioRecordThreadObserver iAudioRecordThreadObserver2 = this.mAudioRecordThreadObserver;
                    if (iAudioRecordThreadObserver2 != null) {
                        iAudioRecordThreadObserver2.onError(-1, new Exception("AudioRecord read error, invalid operation"));
                    }
                }
                AudioRecord audioRecord2 = this.mAudioRecord;
                if (audioRecord2 != null) {
                    String str2 = "AudioRecord read error (" + i + ") stat ";
                    try {
                        str = str2 + audioRecord2.getState();
                    } catch (Throwable unused2) {
                        str = str2 + "unknown";
                    }
                    AVLog.logToIODevice2(4, "AudioRecordThread", str, null, "AudioCapturerAudioRecord.java:AudioRecordThread", 10000);
                }
            }
        }
    }

    public AudioRecordThread(AudioRecord audioRecord, IAudioRecordThreadObserver iAudioRecordThreadObserver) {
        int channelCount = audioRecord.getChannelCount();
        this.mChannel = channelCount;
        int sampleRate = audioRecord.getSampleRate();
        this.mSample = sampleRate;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(channelCount * 2 * (sampleRate / 100));
        this.mByteBuffer = allocateDirect;
        if (allocateDirect.hasArray()) {
            AVLog.m147805d("AudioRecordThread", "byteBuffer.capacity: " + allocateDirect.capacity());
            this.mAudioRecord = audioRecord;
            this.mAudioRecordThreadObserver = iAudioRecordThreadObserver;
            SafeHandlerThread lockThread = SafeHandlerThreadPoolExecutor.lockThread("AudioRecordJavaThread");
            this.mDeliverThread = lockThread;
            lockThread.start();
            return;
        }
        throw new IllegalStateException("ByteBuffer does not have backing array.");
    }
}
