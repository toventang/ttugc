package com.p2082ss.avframework.livestreamv2.audioeffect;

import com.bytedance.covode.number.Covode;
import com.p2082ss.avframework.engine.AudioProcessor;
import com.p2082ss.avframework.utils.TEBundle;
import java.util.Vector;

/* renamed from: com.ss.avframework.livestreamv2.audioeffect.AudioEffectProcessor */
public abstract class AudioEffectProcessor extends AudioProcessor {

    /* renamed from: com.ss.avframework.livestreamv2.audioeffect.AudioEffectProcessor$Callback */
    public interface Callback {
        static {
            Covode.recordClassIndex(100102);
        }

        void onProgress(long j);

        void start();

        void stop();
    }

    /* renamed from: com.ss.avframework.livestreamv2.audioeffect.AudioEffectProcessor$CallbackV2 */
    public interface CallbackV2 extends Callback {
        static {
            Covode.recordClassIndex(100103);
        }

        void onError(int i, Exception exc);
    }

    static {
        Covode.recordClassIndex(100101);
    }

    public Vector<Vector<Double>> getMidiDrawingData() {
        return null;
    }

    public void getScoreInfo(double[] dArr) {
    }

    public TEBundle getStreamInfo() {
        return null;
    }

    public abstract void initEarMonitor();

    public abstract boolean isSupportHardWareEarMonitor();

    public void pause() {
    }

    public void resume() {
    }

    public void seek(long j) {
    }

    public void seekLyricPos(double d) {
    }

    public abstract void setBGMMusic(String str);

    public abstract void setBGMMusic(String str, long j);

    public abstract void setBGMMusic(String str, String str2);

    public abstract void setBGMMusic(String str, String str2, long j);

    public abstract void setBGMProgressListener(Callback callback);

    public abstract void setBGMVolume(float f);

    public abstract void setDRCEnable(boolean z);

    public abstract void setEchoMode(boolean z);

    public abstract void setLoopEnable(boolean z);

    public abstract void setMixerEnable(boolean z);

    public abstract void setMusicPitch(int i);

    public abstract void setOriginEnable(boolean z);

    public int setScoringSources(String str, String str2, double d) {
        return -1;
    }

    public int setScoringSources(String str, int[] iArr) {
        return -1;
    }

    public void setSongScore(double d) {
    }

    public abstract void setTuningParams(String str);

    public abstract void setTuningParams(String str, String str2);

    public abstract void setVoiceVolume(float f);
}
