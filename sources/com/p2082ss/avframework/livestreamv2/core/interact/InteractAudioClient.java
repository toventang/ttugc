package com.p2082ss.avframework.livestreamv2.core.interact;

import android.util.AndroidRuntimeException;
import com.bytedance.covode.number.Covode;
import com.p2082ss.avframework.livestreamv2.ILiveStream;
import com.p2082ss.avframework.livestreamv2.core.interact.audio.AudioCallback;
import com.p2082ss.avframework.livestreamv2.core.interact.audio.AudioClient;
import com.p2082ss.avframework.livestreamv2.core.interact.statistic.Statistics;
import com.p2082ss.avframework.utils.AVLog;
import java.nio.Buffer;

/* renamed from: com.ss.avframework.livestreamv2.core.interact.InteractAudioClient */
class InteractAudioClient implements ILiveStream.IAudioFrameAvailableListener, AudioClient {
    private AudioCallback mAudioCallback;
    private int mChannel;
    private long mLastLogTime;
    private int mSampleHz;
    private boolean mStart;
    private Statistics mStatics;

    static {
        Covode.recordClassIndex(100354);
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.interact.audio.AudioClient
    public void release() {
        this.mAudioCallback = null;
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.interact.audio.AudioClient
    public void stop() {
        this.mStart = false;
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.interact.audio.AudioClient
    public Statistics getStatistics() {
        return this.mStatics;
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.interact.audio.AudioClient
    public void start() {
        AudioCallback audioCallback = this.mAudioCallback;
        if (audioCallback != null) {
            audioCallback.onAudioWarning("");
        }
        this.mStart = true;
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.interact.audio.AudioClient
    public void prepare(AudioCallback audioCallback) {
        this.mAudioCallback = audioCallback;
    }

    public InteractAudioClient(int i, int i2) {
        this.mChannel = i;
        this.mSampleHz = i2;
    }

    public InteractAudioClient(int i, int i2, boolean z) {
        this(i, i2);
        if (z) {
            this.mStatics = new Statistics(1000);
        }
    }

    @Override // com.p2082ss.avframework.livestreamv2.ILiveStream.IAudioFrameAvailableListener
    public void onAudioFrameAvailable(Buffer buffer, int i, int i2, int i3, long j) {
        long j2;
        Statistics statistics = this.mStatics;
        if (statistics != null) {
            j2 = System.currentTimeMillis();
        } else {
            j2 = 0;
        }
        AudioCallback audioCallback = this.mAudioCallback;
        if (this.mStart) {
            if (audioCallback != null) {
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - this.mLastLogTime > 10000) {
                    AVLog.ioi("InteractAudioClient", "Input interact audio frame: sample_rate " + i2 + ", channel " + i3);
                    this.mLastLogTime = currentTimeMillis;
                }
                if (this.mChannel == i3 && this.mSampleHz == i2) {
                    audioCallback.updateAudioFrame(buffer, i, j);
                } else {
                    throw new AndroidRuntimeException("Interact client BUG!");
                }
            }
        } else if (audioCallback != null) {
            audioCallback.onAudioWarning("AudioClient no start.");
        }
        if (statistics != null) {
            statistics.add((double) (System.currentTimeMillis() - j2));
        }
    }
}
