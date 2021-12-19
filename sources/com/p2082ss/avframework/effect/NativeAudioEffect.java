package com.p2082ss.avframework.effect;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.avframework.engine.NativeObject;
import com.p2082ss.avframework.utils.TEBundle;
import java.nio.ByteBuffer;

/* renamed from: com.ss.avframework.effect.NativeAudioEffect */
public class NativeAudioEffect extends NativeObject {
    static {
        Covode.recordClassIndex(99933);
    }

    private native void nativeCreate(int i, int i2);

    public native TEBundle nativeGetParameter();

    public native int nativeProcessAudioFrame(long j, ByteBuffer byteBuffer, int i, int i2, int i3);

    public native void nativeSetParameter(TEBundle tEBundle);

    public TEBundle getParameter() {
        MethodCollector.m26663i(4306);
        TEBundle nativeGetParameter = nativeGetParameter();
        MethodCollector.m26664o(4306);
        return nativeGetParameter;
    }

    public double getPitch() {
        TEBundle parameter = getParameter();
        double d = parameter.getDouble("pitch_shift");
        parameter.release();
        return d;
    }

    public void enableAutoVolume(boolean z) {
        TEBundle parameter = getParameter();
        parameter.setBool("adm_enable_karaoke_agc", z);
        setParameter(parameter);
        parameter.release();
    }

    public void enablePitchShift(boolean z) {
        TEBundle parameter = getParameter();
        parameter.setBool("adm_enable_shift_pitch", z);
        setParameter(parameter);
        parameter.release();
    }

    public void setParameter(TEBundle tEBundle) {
        MethodCollector.m26663i(4308);
        nativeSetParameter(tEBundle);
        MethodCollector.m26664o(4308);
    }

    public void setPitch(double d) {
        TEBundle parameter = getParameter();
        parameter.setDouble("pitch_shift", d);
        setParameter(parameter);
        parameter.release();
    }

    public void setVoiceAccompanySourceLufs(float f) {
        TEBundle parameter = getParameter();
        parameter.setDouble("source_lufs", (double) f);
        setParameter(parameter);
        parameter.release();
    }

    public void setVoiceAccompanySourcePeak(float f) {
        TEBundle parameter = getParameter();
        parameter.setDouble("source_peak", (double) f);
        setParameter(parameter);
        parameter.release();
    }

    public void setVoiceAccompanyTargetLufs(float f) {
        TEBundle parameter = getParameter();
        parameter.setDouble("target_lufs", (double) f);
        setParameter(parameter);
        parameter.release();
    }

    public NativeAudioEffect(int i, int i2) {
        MethodCollector.m26663i(3303);
        nativeCreate(i, i2);
        MethodCollector.m26664o(3303);
    }

    public int process(ByteBuffer byteBuffer, int i, int i2, int i3) {
        MethodCollector.m26663i(4377);
        int nativeProcessAudioFrame = nativeProcessAudioFrame(this.mNativeObj, byteBuffer, i, i2, i3);
        MethodCollector.m26664o(4377);
        return nativeProcessAudioFrame;
    }
}
