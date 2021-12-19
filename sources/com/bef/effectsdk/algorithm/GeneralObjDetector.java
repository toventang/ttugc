package com.bef.effectsdk.algorithm;

import android.graphics.Bitmap;
import com.bef.effectsdk.ResourceFinder;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class GeneralObjDetector {
    public final int ModelType_kPureDetect = 1;
    public final int ParamType_kDetectShortSideLen = 1;
    private ResourceFinder mFinder;
    private long mFinderHandle;
    private long mNativeHandle;

    static {
        Covode.recordClassIndex(2700);
    }

    private native long nativeCreate();

    private native int nativeDestroy(long j);

    private native int nativeInit(long j, long j2, int i);

    private native int nativeInitWithPath(long j, String str, int i);

    private native GeneralObjDetectResult nativeProcess(long j, Bitmap bitmap, int i);

    private native int nativeSetParamF(long j, int i, float f);

    private native int nativeSetParamS(long j, int i, String str);

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
        MethodCollector.m26663i(4961);
        this.mNativeHandle = nativeCreate();
        boolean isNativeHandleValid = isNativeHandleValid();
        MethodCollector.m26664o(4961);
        return isNativeHandleValid;
    }

    public void destroy() {
        MethodCollector.m26663i(5222);
        if (isNativeHandleValid()) {
            nativeDestroy(this.mNativeHandle);
            this.mNativeHandle = 0;
        }
        if (this.mFinder != null && isFinderHandleValid()) {
            this.mFinder.release(this.mFinderHandle);
            this.mFinderHandle = 0;
        }
        MethodCollector.m26664o(5222);
    }

    public boolean init(ResourceFinder resourceFinder, int i) {
        MethodCollector.m26663i(4981);
        if (resourceFinder == null || !isNativeHandleValid()) {
            MethodCollector.m26664o(4981);
            return false;
        }
        this.mFinder = resourceFinder;
        this.mFinderHandle = resourceFinder.createNativeResourceFinder(this.mNativeHandle);
        if (!isFinderHandleValid()) {
            destroy();
            MethodCollector.m26664o(4981);
            return false;
        } else if (nativeInit(this.mNativeHandle, this.mFinderHandle, i) == 0) {
            MethodCollector.m26664o(4981);
            return true;
        } else {
            MethodCollector.m26664o(4981);
            return false;
        }
    }

    public boolean initWithPath(String str, int i) {
        MethodCollector.m26663i(5004);
        if (str == null || str.length() == 0 || !isNativeHandleValid()) {
            MethodCollector.m26664o(5004);
            return false;
        } else if (nativeInitWithPath(this.mNativeHandle, str, i) == 0) {
            MethodCollector.m26664o(5004);
            return true;
        } else {
            MethodCollector.m26664o(5004);
            return false;
        }
    }

    public GeneralObjDetectResult process(Bitmap bitmap, int i) {
        MethodCollector.m26663i(5204);
        if (!isNativeHandleValid() || bitmap == null) {
            GeneralObjDetectResult generalObjDetectResult = new GeneralObjDetectResult();
            MethodCollector.m26664o(5204);
            return generalObjDetectResult;
        }
        GeneralObjDetectResult nativeProcess = nativeProcess(this.mNativeHandle, bitmap, i);
        nativeProcess.logData();
        MethodCollector.m26664o(5204);
        return nativeProcess;
    }

    public boolean setParamF(int i, float f) {
        MethodCollector.m26663i(5035);
        if (!isNativeHandleValid()) {
            MethodCollector.m26664o(5035);
            return false;
        } else if (nativeSetParamF(this.mNativeHandle, i, f) == 0) {
            MethodCollector.m26664o(5035);
            return true;
        } else {
            MethodCollector.m26664o(5035);
            return false;
        }
    }

    public boolean setParamS(int i, String str) {
        MethodCollector.m26663i(5198);
        if (!isNativeHandleValid()) {
            MethodCollector.m26664o(5198);
            return false;
        } else if (nativeSetParamS(this.mNativeHandle, i, str) == 0) {
            MethodCollector.m26664o(5198);
            return true;
        } else {
            MethodCollector.m26664o(5198);
            return false;
        }
    }
}
