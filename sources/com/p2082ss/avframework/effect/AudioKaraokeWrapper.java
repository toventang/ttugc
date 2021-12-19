package com.p2082ss.avframework.effect;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.avframework.engine.NativeObject;
import com.p2082ss.avframework.utils.AVLog;
import java.nio.Buffer;
import java.util.Arrays;

/* renamed from: com.ss.avframework.effect.AudioKaraokeWrapper */
public class AudioKaraokeWrapper extends NativeObject {
    private int mChannels;

    static {
        Covode.recordClassIndex(99920);
    }

    private static native long nativeCreate(int i, int i2, String str, String str2);

    private static native long nativeCreateWithLyricInfo(int i, int i2, String str, int[] iArr);

    private native void nativeGetScoreInfo(double[] dArr, long j);

    private native void nativeProcess(Buffer buffer, int i, int i2, long j);

    public native double[] nativeGetMidiDrawingData(int[] iArr);

    public native void nativeSeekLyricPos(double d);

    public native void nativeSetSongScore(double d);

    public native void nativeSetTranspose(int i);

    private AudioKaraokeWrapper() {
        AVLog.iod("AudioKaraokeWrapper", "Ctor AudioKaraokeWrapper ".concat(String.valueOf(this)));
    }

    public void getScoreInfo(double[] dArr) {
        MethodCollector.m26663i(4253);
        nativeGetScoreInfo(dArr, this.mNativeObj);
        MethodCollector.m26664o(4253);
    }

    public void process(Buffer buffer, int i) {
        MethodCollector.m26663i(4255);
        nativeProcess(buffer, this.mChannels, i, this.mNativeObj);
        MethodCollector.m26664o(4255);
    }

    public static AudioKaraokeWrapper create(int i, int i2, String str, String str2) {
        AudioKaraokeWrapper audioKaraokeWrapper = new AudioKaraokeWrapper();
        if (str == null || str2 == null || !audioKaraokeWrapper.init(i, i2, str, str2)) {
            return null;
        }
        return audioKaraokeWrapper;
    }

    public static AudioKaraokeWrapper create(int i, int i2, String str, int[] iArr) {
        AudioKaraokeWrapper audioKaraokeWrapper = new AudioKaraokeWrapper();
        if (str == null || iArr == null || !audioKaraokeWrapper.init(i, i2, str, iArr)) {
            return null;
        }
        return audioKaraokeWrapper;
    }

    private boolean init(int i, int i2, String str, String str2) {
        MethodCollector.m26663i(4123);
        long nativeCreate = nativeCreate(i, i2, str, str2);
        if (nativeCreate != 0) {
            setNativeObj(nativeCreate);
            this.mChannels = i2;
            MethodCollector.m26664o(4123);
            return true;
        }
        AVLog.ioe("AudioKaraokeWrapper", "Init failed with sample " + i + " channel " + i2 + " midiFile " + str + " lyricFile " + str2);
        MethodCollector.m26664o(4123);
        return false;
    }

    private boolean init(int i, int i2, String str, int[] iArr) {
        MethodCollector.m26663i(4250);
        long nativeCreateWithLyricInfo = nativeCreateWithLyricInfo(i, i2, str, iArr);
        if (nativeCreateWithLyricInfo != 0) {
            setNativeObj(nativeCreateWithLyricInfo);
            this.mChannels = i2;
            MethodCollector.m26664o(4250);
            return true;
        }
        AVLog.ioe("AudioKaraokeWrapper", "Init failed with sample " + i + " channel " + i2 + " midiFile " + str + " lyricInfo " + Arrays.toString(iArr));
        MethodCollector.m26664o(4250);
        return false;
    }
}
