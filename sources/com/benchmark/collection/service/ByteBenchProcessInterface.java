package com.benchmark.collection.service;

import android.content.Context;
import android.content.res.AssetManager;
import android.os.RemoteException;
import com.benchmark.AbstractC2468d;
import com.benchmark.bytemonitor.C2431a;
import com.benchmark.collection.p120a.C2438a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class ByteBenchProcessInterface {
    private AbstractC2468d mCallback;
    private long mHandler;

    private native long nativeInit(String str, String str2, String str3, String str4, AssetManager assetManager);

    private native void native_destory(long j);

    private native String[] native_getResult(long j);

    private native int native_loadByteBench(long j, String str);

    private native void native_release(long j);

    private native int native_startTest(long j, int i, String str);

    private native int native_stopByteBench(long j);

    static {
        Covode.recordClassIndex(2814);
        C2438a.m7275a();
        if (!C2438a.f7339a) {
            C2438a.m7275a();
        }
    }

    public void destroy() {
        MethodCollector.m26663i(7571);
        long j = this.mHandler;
        if (j == 0) {
            MethodCollector.m26664o(7571);
            return;
        }
        native_destory(j);
        this.mHandler = 0;
        MethodCollector.m26664o(7571);
    }

    public String[] getResult() {
        MethodCollector.m26663i(7570);
        long j = this.mHandler;
        if (j == 0) {
            MethodCollector.m26664o(7570);
            return null;
        }
        String[] native_getResult = native_getResult(j);
        MethodCollector.m26664o(7570);
        return native_getResult;
    }

    public void release() {
        MethodCollector.m26663i(7748);
        long j = this.mHandler;
        if (j == 0) {
            MethodCollector.m26664o(7748);
            return;
        }
        native_release(j);
        MethodCollector.m26664o(7748);
    }

    public int stopByteBench() {
        MethodCollector.m26663i(7569);
        long j = this.mHandler;
        if (j == 0) {
            MethodCollector.m26664o(7569);
            return -108;
        }
        int native_stopByteBench = native_stopByteBench(j);
        MethodCollector.m26664o(7569);
        return native_stopByteBench;
    }

    public void setByteBenchCallback(AbstractC2468d dVar) {
        this.mCallback = dVar;
    }

    private void initByteMonitor(Context context) {
        C2431a.m7268a(context);
        C2431a.m7267a();
    }

    public int loadByteBench(String str) {
        MethodCollector.m26663i(7567);
        long j = this.mHandler;
        if (j == 0) {
            MethodCollector.m26664o(7567);
            return -108;
        }
        int native_loadByteBench = native_loadByteBench(j, str);
        MethodCollector.m26664o(7567);
        return native_loadByteBench;
    }

    public void reportAndQuit(boolean z) {
        AbstractC2468d dVar = this.mCallback;
        if (dVar != null) {
            try {
                dVar.mo6843a(105, "report result");
                if (z) {
                    this.mCallback.mo6843a(104, "quit service");
                }
            } catch (RemoteException e) {
                e.getMessage();
            }
        }
    }

    public int startTest(int i, String str) {
        MethodCollector.m26663i(7568);
        long j = this.mHandler;
        if (j == 0) {
            MethodCollector.m26664o(7568);
            return -108;
        }
        int native_startTest = native_startTest(j, i, str);
        MethodCollector.m26664o(7568);
        return native_startTest;
    }

    public int init(String str, String str2, String str3, String str4, Context context) {
        MethodCollector.m26663i(7408);
        if (!C2438a.f7339a) {
            MethodCollector.m26664o(7408);
            return -3;
        }
        if (C2438a.f7339a) {
            this.mHandler = nativeInit(str, str2, str3, str4, context.getAssets());
        }
        if (this.mHandler == 0) {
            MethodCollector.m26664o(7408);
            return -1;
        }
        initByteMonitor(context);
        MethodCollector.m26664o(7408);
        return 0;
    }
}
