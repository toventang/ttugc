package com.p2082ss.bduploader;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.bduploader.net.BDUploadDNSParser;
import java.io.File;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.UUID;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.bduploader.BDObjectUploader */
public class BDObjectUploader implements Handler.Callback {
    private static boolean IsErred = true;
    private long mEndTime;
    private long mHandle;
    private Handler mHandler;
    private BDObjectUploaderListener mListener = null;
    private int mObjectNum;
    private final ReentrantReadWriteLock.ReadLock mReadLock;
    private final ReentrantReadWriteLock mReadWritedLock = new ReentrantReadWriteLock();
    private long mStartTime;
    private int mState = -1;
    private final ReentrantReadWriteLock.WriteLock mWriteLock;

    private static native void _close(long j);

    private final native long _create(int i);

    private static native long _getLongValue(long j, int i);

    private static native String _getStrByKeyAndIndex(long j, int i, int i2);

    private static native String _getStringValue(long j, int i);

    private static native void _setFileName(long j, int i, String[] strArr);

    private static native void _setFilePaths(long j, int i, String[] strArr);

    private static native void _setInt64Value(long j, int i, long j2);

    private static native void _setIntValue(long j, int i, int i2);

    private static native void _setObject(long j, int i, Object obj);

    private static native void _setStringValue(long j, int i, String str);

    private static native void _start(long j);

    private static native void _stop(long j);

    /* renamed from: com_ss_bduploader_BDObjectUploader_com_ss_android_ugc_aweme_lancet_LogLancet_e */
    public static int m147831x9806c992(String str, String str2) {
        return 0;
    }

    /* renamed from: com.ss.bduploader.BDObjectUploader$LogInfo */
    public static class LogInfo {
        private int code;
        private String info;

        static {
            Covode.recordClassIndex(100796);
        }

        public int getCode() {
            return this.code;
        }

        public String getInfo() {
            return this.info;
        }

        public LogInfo(int i, String str) {
            this.code = i;
            this.info = str;
        }
    }

    public static boolean isError() {
        return IsErred;
    }

    public String getDNSIP() {
        return BDUploadUtil.getDNSServerIP();
    }

    static {
        Covode.recordClassIndex(100795);
        if (!BDUploadUtil.initInternal()) {
        }
    }

    public void close() {
        MethodCollector.m26663i(10107);
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
            MethodCollector.m26664o(10107);
        }
    }

    public BDObjectUploader() {
        MethodCollector.m26663i(8778);
        if (IsErred) {
            BDUploadUtil.initInternal();
        }
        try {
            this.mHandle = _create(2);
        } catch (Throwable unused) {
            this.mHandle = 0;
        }
        if (this.mHandle != 0) {
            if (Looper.myLooper() != null) {
                this.mHandler = new Handler(this);
            } else {
                this.mHandler = new Handler(Looper.getMainLooper(), this);
            }
            this.mReadLock = this.mReadWritedLock.readLock();
            this.mWriteLock = this.mReadWritedLock.writeLock();
            this.mState = 0;
            getDNSIP();
            MethodCollector.m26664o(8778);
            return;
        }
        Exception exc = new Exception("create native uploader fail");
        MethodCollector.m26664o(8778);
        throw exc;
    }

    public void start() {
        MethodCollector.m26663i(9954);
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
            MethodCollector.m26664o(9954);
        }
    }

    public void stop() {
        MethodCollector.m26663i(9956);
        this.mWriteLock.lock();
        try {
            if (this.mHandle != 0) {
                m147831x9806c992("ttmn", "before java stop");
                _stop(this.mHandle);
                addLogToManager(_getStringValue(this.mHandle, 100));
                this.mState = 4;
                m147831x9806c992("ttmn", "after java stop");
            }
        } finally {
            this.mWriteLock.unlock();
            MethodCollector.m26664o(9956);
        }
    }

    public void setHandler(Handler handler) {
        this.mHandler = handler;
    }

    public void setListener(BDObjectUploaderListener bDObjectUploaderListener) {
        this.mListener = bDObjectUploaderListener;
    }

    public void setObjectType(String str) {
        setStringValue(54, str);
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

    public void SetExtraParams(JSONObject jSONObject) {
        if (this.mHandle != 0 && jSONObject != null) {
            setStringValue(61, jSONObject.toString());
        }
    }

    public void setAuthType(int i) {
        MethodCollector.m26663i(10732);
        long j = this.mHandle;
        if (j == 0) {
            MethodCollector.m26664o(10732);
            return;
        }
        _setIntValue(j, 416, i);
        MethodCollector.m26664o(10732);
    }

    public void setConfig(TreeMap<String, Object> treeMap) {
        String mapToString;
        if (this.mHandle != 0 && treeMap != null && (mapToString = BDUploadUtil.mapToString(treeMap)) != null) {
            setStringValue(56, mapToString);
        }
    }

    public void setDataTransportProtocol(int i) {
        MethodCollector.m26663i(10731);
        long j = this.mHandle;
        if (j == 0 || i < 0) {
            MethodCollector.m26664o(10731);
            return;
        }
        _setIntValue(j, 411, i);
        MethodCollector.m26664o(10731);
    }

    public void setEnableCommitUpload(boolean z) {
        MethodCollector.m26663i(10588);
        long j = this.mHandle;
        if (j == 0) {
            MethodCollector.m26664o(10588);
            return;
        }
        _setIntValue(j, 401, z ? 1 : 0);
        MethodCollector.m26664o(10588);
    }

    public void setEnableHttps(int i) {
        MethodCollector.m26663i(9663);
        long j = this.mHandle;
        if (j == 0 || i < 0) {
            MethodCollector.m26664o(9663);
            return;
        }
        _setIntValue(j, 19, i);
        MethodCollector.m26664o(9663);
    }

    public void setFileRetryCount(int i) {
        MethodCollector.m26663i(9662);
        long j = this.mHandle;
        if (j == 0 || i < 0) {
            MethodCollector.m26664o(9662);
            return;
        }
        _setIntValue(j, 6, i);
        MethodCollector.m26664o(9662);
    }

    public void setMaxConcurrentFileNum(int i) {
        MethodCollector.m26663i(9660);
        long j = this.mHandle;
        if (j == 0 || i < 0) {
            MethodCollector.m26664o(9660);
            return;
        }
        _setIntValue(j, 400, i);
        MethodCollector.m26664o(9660);
    }

    public void setMaxFailTime(int i) {
        MethodCollector.m26663i(9811);
        long j = this.mHandle;
        if (j == 0 || i < 0) {
            MethodCollector.m26664o(9811);
            return;
        }
        _setIntValue(j, 13, i);
        MethodCollector.m26664o(9811);
    }

    public void setPolicyParams(TreeMap<String, Object> treeMap) {
        String mapToString;
        if (this.mHandle != 0 && treeMap != null && (mapToString = BDUploadUtil.mapToString(treeMap)) != null) {
            setStringValue(55, mapToString);
        }
    }

    public void setPreUpload(boolean z) {
        MethodCollector.m26663i(10585);
        long j = this.mHandle;
        if (j == 0) {
            MethodCollector.m26664o(10585);
            return;
        }
        _setIntValue(j, 80, z ? 1 : 0);
        MethodCollector.m26664o(10585);
    }

    public void setProcessActionType(int i) {
        MethodCollector.m26663i(8921);
        long j = this.mHandle;
        if (j == 0) {
            MethodCollector.m26664o(8921);
            return;
        }
        _setIntValue(j, 65, i);
        MethodCollector.m26664o(8921);
    }

    public void setQueryAuth(String str) {
        MethodCollector.m26663i(10733);
        long j = this.mHandle;
        if (j == 0 || str == null) {
            MethodCollector.m26664o(10733);
            return;
        }
        _setStringValue(j, 15, str);
        MethodCollector.m26664o(10733);
    }

    public void setRWTimeout(int i) {
        MethodCollector.m26663i(9219);
        long j = this.mHandle;
        if (j == 0 || i < 0) {
            MethodCollector.m26664o(9219);
            return;
        }
        _setIntValue(j, 7, i);
        MethodCollector.m26664o(9219);
    }

    public void setScenesTag(String str) {
        MethodCollector.m26663i(10587);
        long j = this.mHandle;
        if (j == 0 || str == null) {
            MethodCollector.m26664o(10587);
            return;
        }
        _setStringValue(j, 85, str);
        MethodCollector.m26664o(10587);
    }

    public void setServerParameter(String str) {
        MethodCollector.m26663i(9077);
        long j = this.mHandle;
        if (j == 0 || str == null) {
            MethodCollector.m26664o(9077);
            return;
        }
        _setStringValue(j, 16, str);
        MethodCollector.m26664o(9077);
    }

    public void setSliceRetryCount(int i) {
        MethodCollector.m26663i(9661);
        long j = this.mHandle;
        if (j == 0 || i < 0) {
            MethodCollector.m26664o(9661);
            return;
        }
        _setIntValue(j, 5, i);
        MethodCollector.m26664o(9661);
    }

    public void setSliceSize(int i) {
        MethodCollector.m26663i(9371);
        long j = this.mHandle;
        if (j == 0 || i < 0) {
            MethodCollector.m26664o(9371);
            return;
        }
        _setIntValue(j, 8, i);
        MethodCollector.m26664o(9371);
    }

    public void setSliceThreshold(int i) {
        MethodCollector.m26663i(10729);
        long j = this.mHandle;
        if (j == 0) {
            MethodCollector.m26664o(10729);
            return;
        }
        _setIntValue(j, 402, i);
        MethodCollector.m26664o(10729);
    }

    public void setSocketNum(int i) {
        MethodCollector.m26663i(9508);
        long j = this.mHandle;
        if (j == 0 || i < 0) {
            MethodCollector.m26664o(9508);
            return;
        }
        _setIntValue(j, 9, i);
        MethodCollector.m26664o(9508);
    }

    public void setTranTimeOutUnit(int i) {
        MethodCollector.m26663i(9812);
        long j = this.mHandle;
        if (j == 0 || i <= 0) {
            MethodCollector.m26664o(9812);
            return;
        }
        _setIntValue(j, 64, i);
        MethodCollector.m26664o(9812);
    }

    public void setUploadDomain(String str) {
        if (this.mHandle != 0 && str != null) {
            setStringValue(46, str);
        }
    }

    private void setContextDir(String str) {
        MethodCollector.m26663i(11015);
        if (this.mHandle == 0 || str == null) {
            MethodCollector.m26664o(11015);
            return;
        }
        String str2 = str + File.separator + BDUploadUtil.SpeedTestcontextDir;
        BDUploadUtil.createDir(str2);
        _setStringValue(this.mHandle, 418, str2);
        MethodCollector.m26664o(11015);
    }

    public boolean handleMessage(Message message) {
        long j;
        int i = message.what;
        if (message.obj instanceof LogInfo) {
            LogInfo logInfo = (LogInfo) message.obj;
            onLogInfoSync(i, logInfo.getCode(), logInfo.getInfo());
            return true;
        } else if (this.mListener == null) {
            return true;
        } else {
            BDObjectInfo bDObjectInfo = (BDObjectInfo) message.obj;
            if (bDObjectInfo != null) {
                j = bDObjectInfo.mProgress;
            } else {
                j = 0;
            }
            this.mListener.onNotify(i, j, bDObjectInfo);
            return true;
        }
    }

    public void setCustomConfig(TreeMap<String, Object> treeMap) {
        JSONObject mapToJSON;
        if (this.mHandle != 0 && treeMap != null && (mapToJSON = BDUploadUtil.mapToJSON(treeMap)) != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("custom_config", mapToJSON);
                String jSONObject2 = jSONObject.toString();
                if (!TextUtils.isEmpty(jSONObject2)) {
                    setStringValue(63, jSONObject2);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public void setOpenBoe(boolean z) {
        MethodCollector.m26663i(10272);
        long j = this.mHandle;
        if (j == 0) {
            MethodCollector.m26664o(10272);
        } else if (z) {
            _setIntValue(j, 67, 1);
            MethodCollector.m26664o(10272);
        } else {
            _setIntValue(j, 67, 0);
            MethodCollector.m26664o(10272);
        }
    }

    public void setSDKConfigDir(String str) {
        MethodCollector.m26663i(10878);
        if (this.mHandle == 0 || str == null) {
            MethodCollector.m26664o(10878);
            return;
        }
        BDUploadUtil.createDir(str);
        _setStringValue(this.mHandle, 417, str);
        setContextDir(str);
        MethodCollector.m26664o(10878);
    }

    public void setTraceId(String str) {
        MethodCollector.m26663i(10269);
        if (this.mHandle == 0 || str == null || str.isEmpty()) {
            MethodCollector.m26664o(10269);
            return;
        }
        _setStringValue(this.mHandle, 69, str);
        MethodCollector.m26664o(10269);
    }

    public void addLogToManager(String str) {
        JSONObject jSONObject;
        String uuid = UUID.randomUUID().toString();
        if (uuid == null || uuid.length() <= 0) {
            uuid = "invalid_uuid";
        }
        try {
            jSONObject = new JSONObject(str);
            jSONObject.put("dns_version", BDUploadResolver.mDNSVersion);
            jSONObject.put("main_dns_type", BDUploadDNSParser.mGlobalMainType);
            jSONObject.put("main_back_type", BDUploadDNSParser.mGlobalBackType);
            jSONObject.put("back_delayed_time", BDUploadDNSParser.mGlobalBackUpDelayedTime);
            jSONObject.put("expired_time", BDUploadDNSParser.mGlobalDefaultExpiredTime);
            jSONObject.put("uuid", uuid);
            jSONObject.remove("event");
            jSONObject.put("event", "bd_image_upload_all");
            try {
                JSONArray jSONArray = jSONObject.getJSONArray("image_array");
                if (jSONArray != null) {
                    jSONObject.remove("image_array");
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject jSONObject2 = new JSONObject(jSONObject.toString());
                        jSONObject2.remove("event");
                        jSONObject2.put("event", "bd_image_upload_single");
                        JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                        Iterator<String> keys = jSONObject3.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            jSONObject2.put(next, jSONObject3.get(next));
                        }
                        jSONObject2.put("uuid", uuid);
                        UploadEventManager.instance.addEvent(jSONObject2);
                    }
                }
            } catch (Exception unused) {
                m147831x9806c992("ttmn", "get object_array failed");
            }
        } catch (Exception unused2) {
            jSONObject = null;
        }
        UploadEventManager.instance.addEvent(jSONObject);
    }

    public int checkNet(int i, int i2) {
        BDObjectUploaderListener bDObjectUploaderListener = this.mListener;
        if (bDObjectUploaderListener != null) {
            return bDObjectUploaderListener.objectUploadCheckNetState(i, i2);
        }
        return 1;
    }

    public void setFileName(int i, String[] strArr) {
        MethodCollector.m26663i(10586);
        long j = this.mHandle;
        if (j == 0 || strArr == null || i <= 0) {
            MethodCollector.m26664o(10586);
            return;
        }
        _setFileName(j, i, strArr);
        MethodCollector.m26664o(10586);
    }

    public void setNetworkType(int i, int i2) {
        MethodCollector.m26663i(10730);
        long j = this.mHandle;
        if (j == 0) {
            MethodCollector.m26664o(10730);
            return;
        }
        _setIntValue(j, i, i2);
        MethodCollector.m26664o(10730);
    }

    public void setStringValue(int i, String str) {
        MethodCollector.m26663i(9076);
        long j = this.mHandle;
        if (j == 0 || str == null) {
            MethodCollector.m26664o(9076);
            return;
        }
        _setStringValue(j, i, str);
        MethodCollector.m26664o(9076);
    }

    public void setFilePath(int i, String[] strArr) {
        MethodCollector.m26663i(9074);
        long j = this.mHandle;
        if (j == 0 || strArr == null || i <= 0) {
            MethodCollector.m26664o(9074);
            return;
        }
        this.mObjectNum = i;
        _setFilePaths(j, i, strArr);
        _setIntValue(this.mHandle, 81, 0);
        MethodCollector.m26664o(9074);
    }

    public void setMediaDataReader(BDMediaDataReader bDMediaDataReader, int i) {
        MethodCollector.m26663i(10423);
        long j = this.mHandle;
        if (j == 0 || bDMediaDataReader == null || i <= 0) {
            MethodCollector.m26664o(10423);
            return;
        }
        _setIntValue(j, 71, i);
        _setIntValue(this.mHandle, 81, 2);
        _setObject(this.mHandle, 201, bDMediaDataReader);
        MethodCollector.m26664o(10423);
    }

    public void onLogInfoSync(int i, int i2, String str) {
        BDObjectUploaderListener bDObjectUploaderListener = this.mListener;
        if (bDObjectUploaderListener != null) {
            bDObjectUploaderListener.onLog(i, i2, str);
        }
    }

    public void onLogInfo(int i, int i2, String str) {
        if (this.mState == 1) {
            LogInfo logInfo = new LogInfo(i2, str);
            Message obtainMessage = this.mHandler.obtainMessage();
            obtainMessage.what = i;
            obtainMessage.obj = logInfo;
            obtainMessage.sendToTarget();
        }
    }

    private void setMediaDataReader(BDMediaDataReader bDMediaDataReader, int i, int i2) {
        MethodCollector.m26663i(10584);
        if (this.mHandle == 0 || bDMediaDataReader == null || i <= 0) {
            MethodCollector.m26664o(10584);
            return;
        }
        setMediaDataReader(bDMediaDataReader, i);
        _setIntValue(this.mHandle, 81, i2);
        MethodCollector.m26664o(10584);
    }

    public void onNotify(int i, long j, int i2, String str) {
        MethodCollector.m26663i(8780);
        if (this.mState != 1) {
            MethodCollector.m26664o(8780);
            return;
        }
        BDObjectInfo bDObjectInfo = null;
        int i3 = (int) j;
        if (i == 0) {
            String dnsip = getDNSIP();
            if (dnsip != null && !dnsip.isEmpty()) {
                setStringValue(75, dnsip);
            }
            addLogToManager(_getStringValue(this.mHandle, 100));
            this.mState = 3;
        } else if (i == 1) {
            bDObjectInfo = new BDObjectInfo(null, (long) i2, i3, null, null);
        } else if (i == 2) {
            String dnsip2 = getDNSIP();
            if (dnsip2 != null && !dnsip2.isEmpty()) {
                setStringValue(75, dnsip2);
            }
            addLogToManager(_getStringValue(this.mHandle, 100));
            this.mState = 2;
        } else if (i == 6) {
            this.mEndTime = System.currentTimeMillis();
            bDObjectInfo = new BDObjectInfo(_getStrByKeyAndIndex(this.mHandle, 409, i3), 0, i3, _getStrByKeyAndIndex(this.mHandle, 410, i3), _getStrByKeyAndIndex(this.mHandle, 407, i3));
        } else if (i == 7) {
            bDObjectInfo = new BDObjectInfo(null, (long) i2, i3, null, null);
        }
        Message obtainMessage = this.mHandler.obtainMessage();
        obtainMessage.what = i;
        obtainMessage.obj = bDObjectInfo;
        obtainMessage.sendToTarget();
        MethodCollector.m26664o(8780);
    }
}
