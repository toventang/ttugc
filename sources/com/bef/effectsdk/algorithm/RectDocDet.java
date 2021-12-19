package com.bef.effectsdk.algorithm;

import android.graphics.Bitmap;
import com.bef.effectsdk.ResourceFinder;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class RectDocDet {
    private ResourceFinder mFinder;
    private long mFinderHandle;
    private long mNativeHandle;

    static {
        Covode.recordClassIndex(2702);
    }

    private native long nativeCreate();

    private native int nativeDestroy(long j);

    private native int nativeInit(long j, long j2, int i);

    private native int nativeInitWithPath(long j, String str, int i);

    private native RectDocDetResult nativeProcess(long j, Bitmap bitmap, int i);

    private native int nativeSetParamF(long j, int i, float f);

    private boolean isFinderHandleValid() {
        if (0 != this.mFinderHandle) {
            return true;
        }
        return false;
    }

    private boolean isNativeHandleValid() {
        if (0 != this.mNativeHandle) {
            return true;
        }
        return false;
    }

    public boolean create() {
        MethodCollector.m26663i(5294);
        this.mNativeHandle = nativeCreate();
        boolean isNativeHandleValid = isNativeHandleValid();
        MethodCollector.m26664o(5294);
        return isNativeHandleValid;
    }

    public void destroy() {
        MethodCollector.m26663i(5303);
        if (isNativeHandleValid()) {
            nativeDestroy(this.mNativeHandle);
            this.mNativeHandle = 0;
        }
        if (this.mFinder != null && isFinderHandleValid()) {
            this.mFinder.release(this.mFinderHandle);
            this.mFinderHandle = 0;
        }
        MethodCollector.m26664o(5303);
    }

    public RectDocDetResult process(Bitmap bitmap, int i) {
        MethodCollector.m26663i(5301);
        if (!isNativeHandleValid() || bitmap == null) {
            RectDocDetResult rectDocDetResult = new RectDocDetResult();
            MethodCollector.m26664o(5301);
            return rectDocDetResult;
        }
        RectDocDetResult nativeProcess = nativeProcess(this.mNativeHandle, bitmap, i);
        MethodCollector.m26664o(5301);
        return nativeProcess;
    }

    public boolean init(ResourceFinder resourceFinder, int i) {
        MethodCollector.m26663i(5296);
        if (resourceFinder == null || !isNativeHandleValid()) {
            MethodCollector.m26664o(5296);
            return false;
        }
        this.mFinder = resourceFinder;
        this.mFinderHandle = resourceFinder.createNativeResourceFinder(this.mNativeHandle);
        if (!isFinderHandleValid()) {
            destroy();
            MethodCollector.m26664o(5296);
            return false;
        } else if (nativeInit(this.mNativeHandle, this.mFinderHandle, i) == 0) {
            MethodCollector.m26664o(5296);
            return true;
        } else {
            MethodCollector.m26664o(5296);
            return false;
        }
    }

    public boolean initWithPath(String str, int i) {
        MethodCollector.m26663i(5298);
        if (str == null || str.length() == 0 || !isNativeHandleValid()) {
            MethodCollector.m26664o(5298);
            return false;
        } else if (nativeInitWithPath(this.mNativeHandle, str, i) == 0) {
            MethodCollector.m26664o(5298);
            return true;
        } else {
            MethodCollector.m26664o(5298);
            return false;
        }
    }

    public boolean setParamF(int i, float f) {
        MethodCollector.m26663i(5300);
        if (!isNativeHandleValid()) {
            MethodCollector.m26664o(5300);
            return false;
        } else if (nativeSetParamF(this.mNativeHandle, i, f) == 0) {
            MethodCollector.m26664o(5300);
            return true;
        } else {
            MethodCollector.m26664o(5300);
            return false;
        }
    }
}
