package com.p2082ss.bduploader;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.File;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: com.ss.bduploader.BDNetworkRouter */
public class BDNetworkRouter implements Handler.Callback {
    private static boolean IsErrored = true;
    private long mEndTime;
    private long mHandle;
    private Handler mHandler;
    private BDNetworkRouterListener mListener;
    private final ReentrantReadWriteLock.ReadLock mReadLock;
    private final ReentrantReadWriteLock mReadWritedLock;
    private long mStartTime;
    private int mState = -1;
    private final ReentrantReadWriteLock.WriteLock mWriteLock;

    private static native void _close(long j);

    private final native long _create(int i);

    private static native void _setContext(long j, String str);

    private static native void _setIntValue(long j, int i, int i2);

    private static native void _setStringValue(long j, int i, String str);

    private static native void _start(long j);

    private static native void _stop(long j);

    public void onLogInfo(int i, int i2, String str) {
    }

    static {
        Covode.recordClassIndex(100789);
        if (!BDUploadUtil.initInternal()) {
        }
    }

    public void close() {
        MethodCollector.m26663i(8181);
        this.mWriteLock.lock();
        try {
            long j = this.mHandle;
            if (j != 0) {
                _close(j);
                this.mHandle = 0;
                this.mState = 5;
                this.mHandler.removeCallbacksAndMessages(null);
            }
        } finally {
            this.mWriteLock.unlock();
            MethodCollector.m26664o(8181);
        }
    }

    public void stop() {
        MethodCollector.m26663i(8046);
        this.mWriteLock.lock();
        try {
            long j = this.mHandle;
            if (j != 0) {
                _stop(j);
                this.mState = 4;
            }
        } finally {
            this.mWriteLock.unlock();
            MethodCollector.m26664o(8046);
        }
    }

    public void start() {
        MethodCollector.m26663i(7893);
        this.mReadLock.lock();
        if (BDUploadUtil.sdkConfigDir != null && BDUploadUtil.sdkConfigDir.length() > 0) {
            setContextDir(BDUploadUtil.sdkConfigDir);
        }
        try {
            if (this.mHandle != 0) {
                this.mState = 1;
                this.mStartTime = System.currentTimeMillis();
                _start(this.mHandle);
            }
        } finally {
            this.mReadLock.unlock();
            MethodCollector.m26664o(7893);
        }
    }

    public void setHandler(Handler handler) {
        this.mHandler = handler;
    }

    public void setListener(BDNetworkRouterListener bDNetworkRouterListener) {
        this.mListener = bDNetworkRouterListener;
    }

    public void setRegionName(String str) {
        setStringValue(47, str);
    }

    public void setSpaceName(String str) {
        setStringValue(45, str);
    }

    public void setTopAccessKey(String str) {
        setStringValue(42, str);
    }

    public void setTopSecretKey(String str) {
        setStringValue(43, str);
    }

    public void setTopSessionToken(String str) {
        setStringValue(44, str);
    }

    public void setUploadDomain(String str) {
        setStringValue(46, str);
    }

    public boolean handleMessage(Message message) {
        if (this.mListener == null || !(message.obj instanceof BDNetworkRouteInfo)) {
            return true;
        }
        BDNetworkRouteInfo bDNetworkRouteInfo = (BDNetworkRouteInfo) message.obj;
        this.mListener.onRouteContext(bDNetworkRouteInfo.mContextType, bDNetworkRouteInfo.mSpeed, bDNetworkRouteInfo.mContext);
        return true;
    }

    public void setAuthType(int i) {
        MethodCollector.m26663i(8331);
        long j = this.mHandle;
        if (j == 0) {
            MethodCollector.m26664o(8331);
            return;
        }
        _setIntValue(j, 416, i);
        MethodCollector.m26664o(8331);
    }

    public void setDataTransportProtocol(int i) {
        MethodCollector.m26663i(6974);
        long j = this.mHandle;
        if (j == 0 || i < 0) {
            MethodCollector.m26664o(6974);
            return;
        }
        _setIntValue(j, 411, i);
        MethodCollector.m26664o(6974);
    }

    public void setEnableExternDNS(int i) {
        MethodCollector.m26663i(7410);
        long j = this.mHandle;
        if (j == 0 || !(i == 0 || i == 1)) {
            MethodCollector.m26664o(7410);
            return;
        }
        _setIntValue(j, 21, i);
        MethodCollector.m26664o(7410);
    }

    public void setEnableHttps(int i) {
        MethodCollector.m26663i(7269);
        long j = this.mHandle;
        if (j == 0 || i < 0) {
            MethodCollector.m26664o(7269);
            return;
        }
        _setIntValue(j, 19, i);
        MethodCollector.m26664o(7269);
    }

    public void setFileRetryCount(int i) {
        MethodCollector.m26663i(6975);
        long j = this.mHandle;
        if (j == 0 || i < 0) {
            MethodCollector.m26664o(6975);
            return;
        }
        _setIntValue(j, 6, i);
        MethodCollector.m26664o(6975);
    }

    public void setMaxFailTime(int i) {
        MethodCollector.m26663i(6977);
        long j = this.mHandle;
        if (j == 0 || i < 0) {
            MethodCollector.m26664o(6977);
            return;
        }
        _setIntValue(j, 13, i);
        MethodCollector.m26664o(6977);
    }

    public void setQueryAuth(String str) {
        MethodCollector.m26663i(8474);
        long j = this.mHandle;
        if (j == 0 || str == null) {
            MethodCollector.m26664o(8474);
            return;
        }
        _setStringValue(j, 15, str);
        MethodCollector.m26664o(8474);
    }

    public void setRWTimeout(int i) {
        MethodCollector.m26663i(7126);
        long j = this.mHandle;
        if (j == 0 || i < 0) {
            MethodCollector.m26664o(7126);
            return;
        }
        _setIntValue(j, 7, i);
        MethodCollector.m26664o(7126);
    }

    public void setRouteWeight(int i) {
        MethodCollector.m26663i(7751);
        long j = this.mHandle;
        if (j == 0 || i <= 0) {
            MethodCollector.m26664o(7751);
            return;
        }
        _setIntValue(j, 408, i);
        MethodCollector.m26664o(7751);
    }

    public void setServerParameter(String str) {
        MethodCollector.m26663i(7413);
        long j = this.mHandle;
        if (j == 0 || str == null) {
            MethodCollector.m26664o(7413);
            return;
        }
        _setStringValue(j, 16, str);
        MethodCollector.m26664o(7413);
    }

    public void setTcpOpenTimeOutMilliSec(int i) {
        MethodCollector.m26663i(7125);
        long j = this.mHandle;
        if (j == 0 || i < 0) {
            MethodCollector.m26664o(7125);
            return;
        }
        _setIntValue(j, 24, i);
        MethodCollector.m26664o(7125);
    }

    public void setTranTimeOutUnit(int i) {
        MethodCollector.m26663i(6976);
        long j = this.mHandle;
        if (j == 0 || i <= 0) {
            MethodCollector.m26664o(6976);
            return;
        }
        _setIntValue(j, 64, i);
        MethodCollector.m26664o(6976);
    }

    private void setContextDir(String str) {
        MethodCollector.m26663i(8776);
        if (this.mHandle == 0 || str == null) {
            MethodCollector.m26664o(8776);
            return;
        }
        String str2 = str + File.separator + BDUploadUtil.SpeedTestcontextDir;
        BDUploadUtil.createDir(str2);
        _setStringValue(this.mHandle, 418, str2);
        MethodCollector.m26664o(8776);
    }

    public void setSDKConfigDir(String str) {
        MethodCollector.m26663i(8624);
        if (this.mHandle == 0 || str == null) {
            MethodCollector.m26664o(8624);
            return;
        }
        BDUploadUtil.createDir(str);
        _setStringValue(this.mHandle, 417, str);
        setContextDir(str);
        MethodCollector.m26664o(8624);
    }

    public void setTraceId(String str) {
        MethodCollector.m26663i(7578);
        if (this.mHandle == 0 || str == null || str.isEmpty()) {
            MethodCollector.m26664o(7578);
            return;
        }
        _setStringValue(this.mHandle, 69, str);
        MethodCollector.m26664o(7578);
    }

    public BDNetworkRouter(int i) {
        MethodCollector.m26663i(6972);
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.mReadWritedLock = reentrantReadWriteLock;
        this.mListener = null;
        if (IsErrored) {
            BDUploadUtil.initInternal();
        }
        if (Looper.myLooper() != null) {
            this.mHandler = new Handler(this);
        } else {
            this.mHandler = new Handler(Looper.getMainLooper(), this);
        }
        this.mReadLock = reentrantReadWriteLock.readLock();
        this.mWriteLock = reentrantReadWriteLock.writeLock();
        try {
            this.mHandle = _create(i);
        } catch (Throwable unused) {
            this.mHandle = 0;
        }
        if (this.mHandle != 0) {
            MethodCollector.m26664o(6972);
            return;
        }
        Exception exc = new Exception("create native network router fail");
        MethodCollector.m26664o(6972);
        throw exc;
    }

    public int checkNet(int i, int i2) {
        BDNetworkRouterListener bDNetworkRouterListener = this.mListener;
        if (bDNetworkRouterListener != null) {
            return bDNetworkRouterListener.networkRouteCheckNetState(i, i2);
        }
        return 1;
    }

    private void setStringValue(int i, String str) {
        MethodCollector.m26663i(7752);
        long j = this.mHandle;
        if (j == 0 || str == null) {
            MethodCollector.m26664o(7752);
            return;
        }
        _setStringValue(j, i, str);
        MethodCollector.m26664o(7752);
    }

    public void setNetworkType(int i, int i2) {
        MethodCollector.m26663i(7411);
        long j = this.mHandle;
        if (j == 0) {
            MethodCollector.m26664o(7411);
            return;
        }
        _setIntValue(j, i, i2);
        MethodCollector.m26664o(7411);
    }

    public void onNotify(int i, long j, int i2, String str) {
        BDNetworkRouteInfo bDNetworkRouteInfo = new BDNetworkRouteInfo(str, i, (int) j);
        Handler handler = this.mHandler;
        if (handler != null) {
            Message obtainMessage = handler.obtainMessage();
            obtainMessage.what = i;
            obtainMessage.obj = bDNetworkRouteInfo;
            obtainMessage.sendToTarget();
        }
    }
}
