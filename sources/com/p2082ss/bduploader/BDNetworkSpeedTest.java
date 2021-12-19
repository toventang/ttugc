package com.p2082ss.bduploader;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.File;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONObject;

/* renamed from: com.ss.bduploader.BDNetworkSpeedTest */
public class BDNetworkSpeedTest implements Handler.Callback {
    private static boolean IsErrored = true;
    private long mEndTime;
    private long mHandle;
    private Handler mHandler;
    private BDNetworkSpeedTestListener mListener;
    private final ReentrantReadWriteLock.ReadLock mReadLock;
    private final ReentrantReadWriteLock mReadWritedLock;
    private long mStartTime;
    private int mState = -1;
    private final ReentrantReadWriteLock.WriteLock mWriteLock;

    private static native void _close(long j);

    private final native long _create();

    private static native void _setIntValue(long j, int i, int i2);

    private static native void _setStringValue(long j, int i, String str);

    private static native void _start(long j);

    private static native void _stop(long j);

    public void onLogInfo(int i, int i2, String str) {
    }

    static {
        Covode.recordClassIndex(100791);
        if (!BDUploadUtil.initInternal()) {
        }
    }

    public void close() {
        MethodCollector.m26663i(8076);
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
            MethodCollector.m26664o(8076);
        }
    }

    public void stop() {
        MethodCollector.m26663i(7928);
        this.mWriteLock.lock();
        try {
            long j = this.mHandle;
            if (j != 0) {
                _stop(j);
                this.mState = 4;
            }
        } finally {
            this.mWriteLock.unlock();
            MethodCollector.m26664o(7928);
        }
    }

    public BDNetworkSpeedTest() {
        MethodCollector.m26663i(7628);
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
            this.mHandle = _create();
        } catch (Throwable unused) {
            this.mHandle = 0;
        }
        if (this.mHandle != 0) {
            MethodCollector.m26664o(7628);
            return;
        }
        Exception exc = new Exception("create native speed tester fail");
        MethodCollector.m26664o(7628);
        throw exc;
    }

    public void start() {
        MethodCollector.m26663i(7794);
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
            MethodCollector.m26664o(7794);
        }
    }

    public void setHandler(Handler handler) {
        this.mHandler = handler;
    }

    public void setListener(BDNetworkSpeedTestListener bDNetworkSpeedTestListener) {
        this.mListener = bDNetworkSpeedTestListener;
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
        if (this.mListener == null || !(message.obj instanceof BDNetworkSpeedTestInfo)) {
            return true;
        }
        BDNetworkSpeedTestInfo bDNetworkSpeedTestInfo = (BDNetworkSpeedTestInfo) message.obj;
        this.mListener.onSpeedTestContext(bDNetworkSpeedTestInfo.mContextType, bDNetworkSpeedTestInfo.mSpeed, bDNetworkSpeedTestInfo.mContext);
        return true;
    }

    public void setAuthType(int i) {
        MethodCollector.m26663i(9585);
        long j = this.mHandle;
        if (j == 0) {
            MethodCollector.m26664o(9585);
            return;
        }
        _setIntValue(j, 416, i);
        MethodCollector.m26664o(9585);
    }

    public void setDataTransportProtocol(int i) {
        MethodCollector.m26663i(8512);
        long j = this.mHandle;
        if (j == 0 || i < 0) {
            MethodCollector.m26664o(8512);
            return;
        }
        _setIntValue(j, 411, i);
        MethodCollector.m26664o(8512);
    }

    public void setEnableExternDNS(int i) {
        MethodCollector.m26663i(9275);
        long j = this.mHandle;
        if (j == 0 || !(i == 0 || i == 1)) {
            MethodCollector.m26664o(9275);
            return;
        }
        _setIntValue(j, 21, i);
        MethodCollector.m26664o(9275);
    }

    public void setEnableHttps(int i) {
        MethodCollector.m26663i(9118);
        long j = this.mHandle;
        if (j == 0 || i < 0) {
            MethodCollector.m26664o(9118);
            return;
        }
        _setIntValue(j, 19, i);
        MethodCollector.m26664o(9118);
    }

    public void setFileRetryCount(int i) {
        MethodCollector.m26663i(8078);
        long j = this.mHandle;
        if (j == 0 || i < 0) {
            MethodCollector.m26664o(8078);
            return;
        }
        _setIntValue(j, 6, i);
        MethodCollector.m26664o(8078);
    }

    public void setMaxFailTime(int i) {
        MethodCollector.m26663i(8811);
        long j = this.mHandle;
        if (j == 0 || i < 0) {
            MethodCollector.m26664o(8811);
            return;
        }
        _setIntValue(j, 13, i);
        MethodCollector.m26664o(8811);
    }

    public void setQueryAuth(String str) {
        MethodCollector.m26663i(9737);
        long j = this.mHandle;
        if (j == 0 || str == null) {
            MethodCollector.m26664o(9737);
            return;
        }
        _setStringValue(j, 15, str);
        MethodCollector.m26664o(9737);
    }

    public void setRWTimeout(int i) {
        MethodCollector.m26663i(8960);
        long j = this.mHandle;
        if (j == 0 || i < 0) {
            MethodCollector.m26664o(8960);
            return;
        }
        _setIntValue(j, 7, i);
        MethodCollector.m26664o(8960);
    }

    public void setServerParameter(String str) {
        MethodCollector.m26663i(9432);
        long j = this.mHandle;
        if (j == 0 || str == null) {
            MethodCollector.m26664o(9432);
            return;
        }
        _setStringValue(j, 16, str);
        MethodCollector.m26664o(9432);
    }

    public void setTcpOpenTimeOutMilliSec(int i) {
        MethodCollector.m26663i(8812);
        long j = this.mHandle;
        if (j == 0 || i < 0) {
            MethodCollector.m26664o(8812);
            return;
        }
        _setIntValue(j, 24, i);
        MethodCollector.m26664o(8812);
    }

    public void setTranTimeOutUnit(int i) {
        MethodCollector.m26663i(8220);
        long j = this.mHandle;
        if (j == 0 || i <= 0) {
            MethodCollector.m26664o(8220);
            return;
        }
        _setIntValue(j, 64, i);
        MethodCollector.m26664o(8220);
    }

    private void setContextDir(String str) {
        MethodCollector.m26663i(9890);
        if (this.mHandle == 0 || str == null) {
            MethodCollector.m26664o(9890);
            return;
        }
        String str2 = str + File.separator + BDUploadUtil.SpeedTestcontextDir;
        BDUploadUtil.createDir(str2);
        _setStringValue(this.mHandle, 418, str2);
        MethodCollector.m26664o(9890);
    }

    public void setSDKConfigDir(String str) {
        MethodCollector.m26663i(9739);
        if (this.mHandle == 0 || str == null) {
            MethodCollector.m26664o(9739);
            return;
        }
        BDUploadUtil.createDir(str);
        _setStringValue(this.mHandle, 417, str);
        setContextDir(str);
        MethodCollector.m26664o(9739);
    }

    public void setTraceId(String str) {
        MethodCollector.m26663i(7638);
        if (this.mHandle == 0 || str == null || str.isEmpty()) {
            MethodCollector.m26664o(7638);
            return;
        }
        _setStringValue(this.mHandle, 69, str);
        MethodCollector.m26664o(7638);
    }

    public int checkNet(int i, int i2) {
        BDNetworkSpeedTestListener bDNetworkSpeedTestListener = this.mListener;
        if (bDNetworkSpeedTestListener != null) {
            return bDNetworkSpeedTestListener.speedTestCheckNetState(i, i2);
        }
        return 1;
    }

    public void setNetworkType(int i, int i2) {
        MethodCollector.m26663i(9430);
        long j = this.mHandle;
        if (j == 0) {
            MethodCollector.m26664o(9430);
            return;
        }
        _setIntValue(j, i, i2);
        MethodCollector.m26664o(9430);
    }

    public void setStringValue(int i, String str) {
        MethodCollector.m26663i(7792);
        long j = this.mHandle;
        if (j == 0 || str == null) {
            MethodCollector.m26664o(7792);
            return;
        }
        _setStringValue(j, i, str);
        MethodCollector.m26664o(7792);
    }

    public void onNotify(int i, long j, int i2, String str) {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(str).getJSONObject("upload_log");
        } catch (Exception unused) {
            jSONObject = null;
        }
        UploadEventManager.instance.addEvent(jSONObject);
        BDNetworkSpeedTestInfo bDNetworkSpeedTestInfo = new BDNetworkSpeedTestInfo(str, i, (int) j);
        Handler handler = this.mHandler;
        if (handler != null) {
            Message obtainMessage = handler.obtainMessage();
            obtainMessage.what = i;
            obtainMessage.obj = bDNetworkSpeedTestInfo;
            obtainMessage.sendToTarget();
        }
    }
}
