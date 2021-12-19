package com.p2082ss.avframework.engine;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.avframework.utils.TEBundle;

/* renamed from: com.ss.avframework.engine.VsyncModule */
public class VsyncModule extends NativeObject {
    private InternalObserver mInternalObserver;

    /* renamed from: com.ss.avframework.engine.VsyncModule$Observer */
    public interface Observer {
        static {
            Covode.recordClassIndex(99995);
        }

        void onEvent(int i, int i2, long j, String str);
    }

    static {
        Covode.recordClassIndex(99993);
    }

    private native void nativeAdjustLastTimeMills(long j, String str, long j2);

    private native long nativeComputeDiffAtNowMills(long j, String str);

    private native long nativeComputeDiffMs(long j, String str, String str2);

    private native long nativeConvertToNowMills(long j, String str, long j2);

    private native long nativeGetFirstFrameTimestampMs(long j, String str);

    private native long nativeGetMaxIntevalMs(long j, String str);

    private native TEBundle nativeGetOption(long j);

    private native boolean nativeIsEnable(long j);

    private native long nativeLastOriginTimeMills(long j, String str);

    private native long nativeLastTimeMills(long j, String str);

    private static native long nativeNowNanos();

    private native void nativeRegisertObserver(long j, InternalObserver internalObserver);

    private native void nativeRelease(long j);

    private native void nativeReset(long j);

    private native void nativeResetWithTrack(long j, String str);

    private native void nativeSetEnable(long j, boolean z);

    private native void nativeSetOption(long j, TEBundle tEBundle);

    private native void nativeSetupOriginAudioTrackId(long j, String str);

    private native void nativeSetupOriginVideoTrackId(long j, String str);

    private native void nativeUnRegisertObserver(long j, InternalObserver internalObserver);

    private native long nativeUpdateTimeMs(long j, String str, long j2);

    public String toString() {
        return super.toString();
    }

    public static long nowNanos() {
        MethodCollector.m26663i(685);
        long nativeNowNanos = nativeNowNanos();
        MethodCollector.m26664o(685);
        return nativeNowNanos;
    }

    public TEBundle getOption() {
        MethodCollector.m26663i(687);
        TEBundle nativeGetOption = nativeGetOption(this.mNativeObj);
        MethodCollector.m26664o(687);
        return nativeGetOption;
    }

    public boolean isEnable() {
        MethodCollector.m26663i(694);
        boolean nativeIsEnable = nativeIsEnable(this.mNativeObj);
        MethodCollector.m26664o(694);
        return nativeIsEnable;
    }

    public void reset() {
        MethodCollector.m26663i(1029);
        nativeReset(this.mNativeObj);
        MethodCollector.m26664o(1029);
    }

    @Override // com.p2082ss.avframework.engine.NativeObject
    public synchronized void release() {
        MethodCollector.m26663i(1059);
        if (this.mInternalObserver != null) {
            nativeUnRegisertObserver(this.mNativeObj, this.mInternalObserver);
        }
        nativeRelease(this.mNativeObj);
        this.mNativeObj = 0;
        InternalObserver internalObserver = this.mInternalObserver;
        if (internalObserver != null) {
            internalObserver.release();
            this.mInternalObserver = null;
        }
        MethodCollector.m26664o(1059);
    }

    /* renamed from: com.ss.avframework.engine.VsyncModule$InternalObserver */
    class InternalObserver extends NativeObject implements Observer {
        private Observer mObserver;

        static {
            Covode.recordClassIndex(99994);
        }

        public InternalObserver() {
        }

        public synchronized void registerObserver(Observer observer) {
            MethodCollector.m26663i(1187);
            this.mObserver = observer;
            MethodCollector.m26664o(1187);
        }

        @Override // com.p2082ss.avframework.engine.VsyncModule.Observer
        public void onEvent(int i, int i2, long j, String str) {
            Observer observer = this.mObserver;
            if (observer != null) {
                observer.onEvent(i, i2, j, str);
            }
        }
    }

    public VsyncModule(long j) {
        setNativeObj(j);
    }

    public long computeDiffAtNowMills(String str) {
        MethodCollector.m26663i(1021);
        long nativeComputeDiffAtNowMills = nativeComputeDiffAtNowMills(this.mNativeObj, str);
        MethodCollector.m26664o(1021);
        return nativeComputeDiffAtNowMills;
    }

    public long getFirstFrameTimestampMs(String str) {
        MethodCollector.m26663i(1043);
        long nativeGetFirstFrameTimestampMs = nativeGetFirstFrameTimestampMs(this.mNativeObj, str);
        MethodCollector.m26664o(1043);
        return nativeGetFirstFrameTimestampMs;
    }

    public long getMaxIntevalMs(String str) {
        MethodCollector.m26663i(1057);
        long nativeGetMaxIntevalMs = nativeGetMaxIntevalMs(this.mNativeObj, str);
        MethodCollector.m26664o(1057);
        return nativeGetMaxIntevalMs;
    }

    public long lastOriginTimeMills(String str) {
        MethodCollector.m26663i(853);
        long nativeLastOriginTimeMills = nativeLastOriginTimeMills(this.mNativeObj, str);
        MethodCollector.m26664o(853);
        return nativeLastOriginTimeMills;
    }

    public long lastTimeMills(String str) {
        MethodCollector.m26663i(748);
        long nativeLastTimeMills = nativeLastTimeMills(this.mNativeObj, str);
        MethodCollector.m26664o(748);
        return nativeLastTimeMills;
    }

    public void setEnable(boolean z) {
        MethodCollector.m26663i(698);
        nativeSetEnable(this.mNativeObj, z);
        MethodCollector.m26664o(698);
    }

    public void setOption(TEBundle tEBundle) {
        MethodCollector.m26663i(690);
        nativeSetOption(this.mNativeObj, tEBundle);
        MethodCollector.m26664o(690);
    }

    public void setupOriginAudioTrackId(String str) {
        MethodCollector.m26663i(739);
        nativeSetupOriginAudioTrackId(this.mNativeObj, str);
        MethodCollector.m26664o(739);
    }

    public void setupOriginVideoTrackId(String str) {
        MethodCollector.m26663i(742);
        nativeSetupOriginVideoTrackId(this.mNativeObj, str);
        MethodCollector.m26664o(742);
    }

    public void reset(String str) {
        MethodCollector.m26663i(1031);
        nativeResetWithTrack(this.mNativeObj, str);
        MethodCollector.m26664o(1031);
    }

    public synchronized void registerObserver(Observer observer) {
        MethodCollector.m26663i(681);
        if (this.mInternalObserver == null) {
            this.mInternalObserver = new InternalObserver();
            nativeRegisertObserver(this.mNativeObj, this.mInternalObserver);
        }
        this.mInternalObserver.registerObserver(observer);
        MethodCollector.m26664o(681);
    }

    public long computeDiffMs(String str, String str2) {
        MethodCollector.m26663i(1000);
        long nativeComputeDiffMs = nativeComputeDiffMs(this.mNativeObj, str, str2);
        MethodCollector.m26664o(1000);
        return nativeComputeDiffMs;
    }

    public void adjustLastTimeMills(String str, long j) {
        MethodCollector.m26663i(1034);
        nativeAdjustLastTimeMills(this.mNativeObj, str, j);
        MethodCollector.m26664o(1034);
    }

    public long convertToNowMills(String str, long j) {
        MethodCollector.m26663i(996);
        long nativeConvertToNowMills = nativeConvertToNowMills(this.mNativeObj, str, j);
        MethodCollector.m26664o(996);
        return nativeConvertToNowMills;
    }

    /* access modifiers changed from: protected */
    public long updateTimeMs(String str, long j) {
        MethodCollector.m26663i(745);
        long nativeUpdateTimeMs = nativeUpdateTimeMs(this.mNativeObj, str, j);
        MethodCollector.m26664o(745);
        return nativeUpdateTimeMs;
    }
}
