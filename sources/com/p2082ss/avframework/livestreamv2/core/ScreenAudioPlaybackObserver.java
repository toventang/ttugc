package com.p2082ss.avframework.livestreamv2.core;

import com.bytedance.covode.number.Covode;
import com.p2082ss.avframework.capture.audio.AudioRecordThread;
import com.p2082ss.avframework.livestreamv2.IInputAudioStream;
import java.nio.ByteBuffer;

/* renamed from: com.ss.avframework.livestreamv2.core.ScreenAudioPlaybackObserver */
class ScreenAudioPlaybackObserver implements AudioRecordThread.IAudioRecordThreadObserver {
    private final IInputAudioStream mInputAudioStream;
    private final AudioRecordThread.IAudioRecordThreadObserver mOutObserver;

    static {
        Covode.recordClassIndex(100270);
    }

    public void release() {
        this.mInputAudioStream.stop();
        this.mInputAudioStream.release();
    }

    @Override // com.p2082ss.avframework.capture.audio.AudioRecordThread.IAudioRecordThreadObserver
    public void onError(int i, Exception exc) {
        AudioRecordThread.IAudioRecordThreadObserver iAudioRecordThreadObserver = this.mOutObserver;
        if (iAudioRecordThreadObserver != null) {
            iAudioRecordThreadObserver.onError(i, exc);
        }
    }

    ScreenAudioPlaybackObserver(IInputAudioStream iInputAudioStream, AudioRecordThread.IAudioRecordThreadObserver iAudioRecordThreadObserver) {
        this.mOutObserver = iAudioRecordThreadObserver;
        this.mInputAudioStream = iInputAudioStream;
        iInputAudioStream.start();
    }

    @Override // com.p2082ss.avframework.capture.audio.AudioRecordThread.IAudioRecordThreadObserver
    public void onData(ByteBuffer byteBuffer, int i, int i2, int i3, long j) {
        this.mInputAudioStream.pushAudioFrame(byteBuffer, i2, i3, 16, i * i3, j);
        AudioRecordThread.IAudioRecordThreadObserver iAudioRecordThreadObserver = this.mOutObserver;
        if (iAudioRecordThreadObserver != null) {
            iAudioRecordThreadObserver.onData(byteBuffer, i, i2, i3, j);
        }
    }
}
