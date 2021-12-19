package com.lynx.jsbridge;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.react.bridge.WritableArray;
import com.lynx.tasm.base.LLog;

public final class CallbackImpl implements Callback {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private boolean mInvoked = false;
    private long mNativePtr;

    static {
        Covode.recordClassIndex(34309);
    }

    private native void nativeInvoke(long j, WritableArray writableArray);

    private native void nativeReleaseNativePtr(long j);

    public final void resetNativePtr() {
        this.mNativePtr = 0;
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        MethodCollector.m26663i(1726);
        super.finalize();
        nativeReleaseNativePtr(this.mNativePtr);
        MethodCollector.m26664o(1726);
    }

    public CallbackImpl(long j) {
        this.mNativePtr = j;
    }

    @Override // com.lynx.react.bridge.Callback
    public final void invoke(Object... objArr) {
        MethodCollector.m26663i(1600);
        if (this.mInvoked) {
            LLog.m56856a(8, "LynxModule", "Illegal callback invocation from native module. This callback type only permits a single invocation from native code.");
            MethodCollector.m26664o(1600);
            return;
        }
        long j = this.mNativePtr;
        if (j == 0) {
            LLog.m56856a(6, "LynxModule", "callback invoke failed: mNativePtr is NULL");
            MethodCollector.m26664o(1600);
            return;
        }
        nativeInvoke(j, JavaOnlyArray.m56670of(objArr));
        this.mInvoked = true;
        MethodCollector.m26664o(1600);
    }

    public final void invokeCallback(Object... objArr) {
        MethodCollector.m26663i(1721);
        if (this.mInvoked) {
            LLog.m56856a(8, "LynxModule", "Illegal callback invocation from native module. This callback type only permits a single invocation from native code.");
            MethodCollector.m26664o(1721);
            return;
        }
        long j = this.mNativePtr;
        if (j == 0) {
            LLog.m56856a(6, "LynxModule", "callback invoke failed: mNativePtr is NULL");
            MethodCollector.m26664o(1721);
            return;
        }
        nativeInvoke(j, JavaOnlyArray.m56670of(objArr));
        this.mInvoked = true;
        MethodCollector.m26664o(1721);
    }
}
