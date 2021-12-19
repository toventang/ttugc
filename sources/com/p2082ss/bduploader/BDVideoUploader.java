package com.p2082ss.bduploader;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.bduploader.net.BDUploadDNSParser;
import java.io.File;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.UUID;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.bduploader.BDVideoUploader */
public class BDVideoUploader implements Handler.Callback {
    private static boolean IsErrored = true;
    int headerIndex;
    private BDVideoUploaderAbstractListener mAbstractListener = null;
    private long mEndTime;
    private boolean mFinish = false;
    private long mHandle;
    private Handler mHandler;
    private String[] mHeaders;
    private Lock mHeadersLock = new ReentrantLock();
    private JSONObject mJsonInfo;
    private BDVideoUploaderListener mListener = null;
    private final ReentrantReadWriteLock.ReadLock mReadLock;
    private final ReentrantReadWriteLock mReadWritedLock = new ReentrantReadWriteLock();
    private long mStartTime;
    private int mState = -1;
    private final ReentrantReadWriteLock.WriteLock mWriteLock;

    private static native void _cancelUpload(long j);

    private static native void _close(long j);

    private final native long _create();

    private static native long _getLongValue(long j, int i);

    private static native String _getStringValue(long j, int i);

    private static native void _mergeUpload(long j);

    private static native void _setContext(long j, String str);

    private static native void _setInt64Value(long j, int i, long j2);

    private static native void _setIntValue(long j, int i, int i2);

    private static native void _setObject(long j, int i, Object obj);

    private static native void _setPoster(long j, float f);

    private static native void _setStringValue(long j, int i, String str);

    private static native void _start(long j);

    private static native void _stop(long j);

    /* renamed from: com_ss_bduploader_BDVideoUploader_com_ss_android_ugc_aweme_lancet_LogLancet_e */
    public static int m147846x993aab6e(String str, String str2) {
        return 0;
    }

    /* renamed from: com.ss.bduploader.BDVideoUploader$LogInfo */
    public static class LogInfo {
        private int code;
        private String info;

        static {
            Covode.recordClassIndex(100806);
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
        return IsErrored;
    }

    public String getDNSIP() {
        return BDUploadUtil.getDNSServerIP();
    }

    static {
        Covode.recordClassIndex(100805);
        if (!BDUploadUtil.initInternal()) {
        }
    }

    private void parseLog() {
        MethodCollector.m26663i(11959);
        if (this.mFinish) {
            MethodCollector.m26664o(11959);
            return;
        }
        this.mFinish = true;
        addLogToManager(_getStringValue(this.mHandle, 100));
        MethodCollector.m26664o(11959);
    }

    public void allowMergeUpload() {
        MethodCollector.m26663i(12223);
        long j = this.mHandle;
        if (j == 0) {
            MethodCollector.m26664o(12223);
            return;
        }
        _mergeUpload(j);
        MethodCollector.m26664o(12223);
    }

    public void cancelUpload() {
        MethodCollector.m26663i(12225);
        this.mWriteLock.lock();
        long j = this.mHandle;
        if (j == 0) {
            this.mWriteLock.unlock();
            MethodCollector.m26664o(12225);
            return;
        }
        _cancelUpload(j);
        this.mWriteLock.unlock();
        MethodCollector.m26664o(12225);
    }

    public void close() {
        MethodCollector.m26663i(11958);
        this.mWriteLock.lock();
        try {
            long j = this.mHandle;
            if (j != 0) {
                _stop(j);
                parseLog();
                _close(this.mHandle);
                this.mHandle = 0;
                this.mState = 5;
                this.mHandler.removeCallbacksAndMessages(null);
            }
        } finally {
            this.mWriteLock.unlock();
            MethodCollector.m26664o(11958);
        }
    }

    public void stop() {
        MethodCollector.m26663i(11957);
        this.mWriteLock.lock();
        try {
            long j = this.mHandle;
            if (j != 0) {
                _stop(j);
                String dnsip = getDNSIP();
                if (dnsip != null && !dnsip.isEmpty()) {
                    setStringValue(75, dnsip);
                }
                parseLog();
                this.mState = 4;
            }
        } finally {
            this.mWriteLock.unlock();
            MethodCollector.m26664o(11957);
        }
    }

    public void start() {
        MethodCollector.m26663i(11956);
        this.mReadLock.lock();
        if (BDUploadUtil.sdkConfigDir != null && BDUploadUtil.sdkConfigDir.length() > 0) {
            setContextDir(BDUploadUtil.sdkConfigDir);
            setDiskResumeDir(BDUploadUtil.sdkConfigDir);
        }
        try {
            if (this.mHandle != 0) {
                this.mFinish = false;
                this.mState = 1;
                this.mStartTime = System.currentTimeMillis();
                _start(this.mHandle);
            }
        } finally {
            this.mReadLock.unlock();
            MethodCollector.m26664o(11956);
        }
    }

    public BDVideoUploader() {
        MethodCollector.m26663i(9814);
        if (IsErrored) {
            BDUploadUtil.initInternal();
        }
        try {
            this.mHandle = _create();
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
            this.mHeaders = new String[20];
            int i = 0;
            do {
                this.mHeaders[i] = null;
                i++;
            } while (i < 20);
            this.headerIndex = 0;
            String uuid = UUID.randomUUID().toString();
            if (uuid != null && uuid.length() > 0) {
                _setStringValue(this.mHandle, 86, uuid);
            }
            String uuid2 = UUID.randomUUID().toString();
            if (uuid2 != null && uuid2.length() > 0) {
                _setStringValue(this.mHandle, 87, uuid2);
            }
            setTraceId(UUID.randomUUID().toString());
            MethodCollector.m26664o(9814);
            return;
        }
        Exception exc = new Exception("create native uploader fail");
        MethodCollector.m26664o(9814);
        throw exc;
    }

    public void setAbstractListener(BDVideoUploaderAbstractListener bDVideoUploaderAbstractListener) {
        this.mAbstractListener = bDVideoUploaderAbstractListener;
    }

    public void setHandler(Handler handler) {
        this.mHandler = handler;
    }

    public void setListener(BDVideoUploaderListener bDVideoUploaderListener) {
        this.mListener = bDVideoUploaderListener;
    }

    public void setPathName(String str) {
        setStringValue(0, str);
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

    public String getStringFromExtern(int i) {
        BDVideoUploaderListener bDVideoUploaderListener = this.mListener;
        if (bDVideoUploaderListener != null) {
            return bDVideoUploaderListener.getStringFromExtern(i);
        }
        return null;
    }

    public void setAliveMaxFailTime(int i) {
        MethodCollector.m26663i(11789);
        long j = this.mHandle;
        if (j == 0 || i < 0) {
            MethodCollector.m26664o(11789);
            return;
        }
        _setIntValue(j, 22, i);
        MethodCollector.m26664o(11789);
    }

    public void setAuthType(int i) {
        MethodCollector.m26663i(12238);
        long j = this.mHandle;
        if (j == 0) {
            MethodCollector.m26664o(12238);
            return;
        }
        _setIntValue(j, 416, i);
        MethodCollector.m26664o(12238);
    }

    public void setConfig(TreeMap<String, Object> treeMap) {
        String mapToString;
        if (this.mHandle != 0 && treeMap != null && (mapToString = BDUploadUtil.mapToString(treeMap)) != null) {
            setStringValue(56, mapToString);
        }
    }

    public void setContext(String str) {
        MethodCollector.m26663i(12226);
        long j = this.mHandle;
        if (j == 0 || str == null) {
            MethodCollector.m26664o(12226);
            return;
        }
        _setContext(j, str);
        MethodCollector.m26664o(12226);
    }

    public void setDataTransportProtocol(int i) {
        MethodCollector.m26663i(12232);
        long j = this.mHandle;
        if (j == 0 || i < 0) {
            MethodCollector.m26664o(12232);
            return;
        }
        _setIntValue(j, 411, i);
        MethodCollector.m26664o(12232);
    }

    public void setDiskResumeOption(int i) {
        MethodCollector.m26663i(12239);
        long j = this.mHandle;
        if (j == 0) {
            MethodCollector.m26664o(12239);
            return;
        }
        _setIntValue(j, 302, i);
        MethodCollector.m26664o(12239);
    }

    public void setEnableBigFile(int i) {
        MethodCollector.m26663i(11317);
        long j = this.mHandle;
        if (j == 0 || i < 0) {
            MethodCollector.m26664o(11317);
            return;
        }
        _setIntValue(j, 83, i);
        MethodCollector.m26664o(11317);
    }

    public void setEnableExternDNS(int i) {
        MethodCollector.m26663i(11638);
        long j = this.mHandle;
        if (j == 0 || !(i == 0 || i == 1)) {
            MethodCollector.m26664o(11638);
            return;
        }
        _setIntValue(j, 21, i);
        MethodCollector.m26664o(11638);
    }

    public void setEnableFiletryHttps(int i) {
        MethodCollector.m26663i(11788);
        long j = this.mHandle;
        if (j == 0 || !(i == 0 || i == 1)) {
            MethodCollector.m26664o(11788);
            return;
        }
        _setIntValue(j, 25, i);
        MethodCollector.m26664o(11788);
    }

    public void setEnableHttps(int i) {
        MethodCollector.m26663i(11316);
        long j = this.mHandle;
        if (j == 0 || i < 0) {
            MethodCollector.m26664o(11316);
            return;
        }
        _setIntValue(j, 19, i);
        MethodCollector.m26664o(11316);
    }

    public void setEnableKeepAlive(int i) {
        MethodCollector.m26663i(11467);
        long j = this.mHandle;
        if (j == 0 || !(i == 0 || i == 1)) {
            MethodCollector.m26664o(11467);
            return;
        }
        _setIntValue(j, 20, i);
        MethodCollector.m26664o(11467);
    }

    public void setExternFileReader(BDExternalFileReader bDExternalFileReader) {
        MethodCollector.m26663i(11798);
        long j = this.mHandle;
        if (j == 0 || bDExternalFileReader == null) {
            MethodCollector.m26664o(11798);
            return;
        }
        _setObject(j, 200, bDExternalFileReader);
        MethodCollector.m26664o(11798);
    }

    public void setExternMinSIze(int i) {
        MethodCollector.m26663i(12231);
        long j = this.mHandle;
        if (j == 0 || i <= 0) {
            MethodCollector.m26664o(12231);
            return;
        }
        _setIntValue(j, 77, i);
        MethodCollector.m26664o(12231);
    }

    public void setExternalReaderMode(int i) {
        MethodCollector.m26663i(12233);
        long j = this.mHandle;
        if (j == 0 || i < 0) {
            MethodCollector.m26664o(12233);
            return;
        }
        _setIntValue(j, 412, i);
        MethodCollector.m26664o(12233);
    }

    public void setFileRetryCount(int i) {
        MethodCollector.m26663i(11796);
        long j = this.mHandle;
        if (j == 0 || i < 0) {
            MethodCollector.m26664o(11796);
            return;
        }
        _setIntValue(j, 6, i);
        MethodCollector.m26664o(11796);
    }

    public void setMaxFailTime(int i) {
        MethodCollector.m26663i(11797);
        long j = this.mHandle;
        if (j == 0 || i < 0) {
            MethodCollector.m26664o(11797);
            return;
        }
        _setIntValue(j, 13, i);
        MethodCollector.m26664o(11797);
    }

    public void setMaxUploadSpeedThresh(int i) {
        MethodCollector.m26663i(12234);
        long j = this.mHandle;
        if (j == 0) {
            MethodCollector.m26664o(12234);
            return;
        }
        _setIntValue(j, 413, i);
        MethodCollector.m26664o(12234);
    }

    public void setObjectType(String str) {
        if (this.mHandle != 0 && str != null && !str.equals("")) {
            setStringValue(54, str);
        }
    }

    public void setPolicyParams(TreeMap<String, Object> treeMap) {
        if (this.mHandle != 0 && treeMap != null) {
            String mapToString = BDUploadUtil.mapToString(treeMap);
            if (!TextUtils.isEmpty(mapToString)) {
                setStringValue(55, mapToString);
            }
        }
    }

    public void setPoster(float f) {
        MethodCollector.m26663i(11791);
        long j = this.mHandle;
        if (j == 0 || f < 0.0f) {
            MethodCollector.m26664o(11791);
            return;
        }
        _setPoster(j, f);
        MethodCollector.m26664o(11791);
    }

    public void setPreUploadEncryptionMode(int i) {
        MethodCollector.m26663i(12224);
        long j = this.mHandle;
        if (j == 0) {
            MethodCollector.m26664o(12224);
            return;
        }
        _setIntValue(j, 74, i);
        MethodCollector.m26664o(12224);
    }

    public void setPrivateVideo(boolean z) {
        MethodCollector.m26663i(12235);
        long j = this.mHandle;
        if (j == 0) {
            MethodCollector.m26664o(12235);
            return;
        }
        _setIntValue(j, 414, z ? 1 : 0);
        MethodCollector.m26664o(12235);
    }

    public void setProcessActionType(int i) {
        MethodCollector.m26663i(11315);
        long j = this.mHandle;
        if (j == 0) {
            MethodCollector.m26664o(11315);
            return;
        }
        _setIntValue(j, 65, i);
        MethodCollector.m26664o(11315);
    }

    public void setQueryAuth(String str) {
        MethodCollector.m26663i(11166);
        long j = this.mHandle;
        if (j == 0 || str == null) {
            MethodCollector.m26664o(11166);
            return;
        }
        _setStringValue(j, 15, str);
        MethodCollector.m26664o(11166);
    }

    public void setRWTimeout(int i) {
        MethodCollector.m26663i(11792);
        long j = this.mHandle;
        if (j == 0 || i < 0) {
            MethodCollector.m26664o(11792);
            return;
        }
        _setIntValue(j, 7, i);
        MethodCollector.m26664o(11792);
    }

    public void setResponseTimeOut(int i) {
        MethodCollector.m26663i(12230);
        long j = this.mHandle;
        if (j == 0 || i < 0) {
            MethodCollector.m26664o(12230);
            return;
        }
        _setIntValue(j, 76, i);
        MethodCollector.m26664o(12230);
    }

    public void setScenesTag(String str) {
        MethodCollector.m26663i(11805);
        long j = this.mHandle;
        if (j == 0 || str == null) {
            MethodCollector.m26664o(11805);
            return;
        }
        _setStringValue(j, 85, str);
        MethodCollector.m26664o(11805);
    }

    public void setServerParameter(String str) {
        MethodCollector.m26663i(11314);
        long j = this.mHandle;
        if (j == 0 || str == null) {
            MethodCollector.m26664o(11314);
            return;
        }
        _setStringValue(j, 16, str);
        MethodCollector.m26664o(11314);
    }

    public void setSliceReTryCount(int i) {
        MethodCollector.m26663i(11795);
        long j = this.mHandle;
        if (j == 0 || i < 0) {
            MethodCollector.m26664o(11795);
            return;
        }
        _setIntValue(j, 5, i);
        MethodCollector.m26664o(11795);
    }

    public void setSliceSize(int i) {
        MethodCollector.m26663i(11793);
        long j = this.mHandle;
        if (j == 0 || i < 0) {
            MethodCollector.m26664o(11793);
            return;
        }
        _setIntValue(j, 8, i);
        MethodCollector.m26664o(11793);
    }

    public void setSocketNum(int i) {
        MethodCollector.m26663i(11794);
        long j = this.mHandle;
        if (j == 0 || i < 0) {
            MethodCollector.m26664o(11794);
            return;
        }
        _setIntValue(j, 9, i);
        MethodCollector.m26664o(11794);
    }

    public void setSpeedTestThresh(int i) {
        MethodCollector.m26663i(12229);
        long j = this.mHandle;
        if (j == 0) {
            MethodCollector.m26664o(12229);
            return;
        }
        _setIntValue(j, 406, i);
        MethodCollector.m26664o(12229);
    }

    public void setSpeedTestValue(int i) {
        MethodCollector.m26663i(12228);
        long j = this.mHandle;
        if (j == 0) {
            MethodCollector.m26664o(12228);
            return;
        }
        _setIntValue(j, 405, i);
        MethodCollector.m26664o(12228);
    }

    public void setTcpOpenTimeOutMilliSec(int i) {
        MethodCollector.m26663i(11790);
        long j = this.mHandle;
        if (j == 0 || i < 0) {
            MethodCollector.m26664o(11790);
            return;
        }
        _setIntValue(j, 24, i);
        MethodCollector.m26664o(11790);
    }

    public void setTranTimeOutUnit(int i) {
        MethodCollector.m26663i(11800);
        long j = this.mHandle;
        if (j == 0 || i <= 0) {
            MethodCollector.m26664o(11800);
            return;
        }
        _setIntValue(j, 64, i);
        MethodCollector.m26664o(11800);
    }

    public void setUploadDomain(String str) {
        if (this.mHandle != 0 && str != null) {
            setStringValue(46, str);
        }
    }

    public void setUserReference(String str) {
        MethodCollector.m26663i(12359);
        long j = this.mHandle;
        if (j == 0 || str == null) {
            MethodCollector.m26664o(12359);
            return;
        }
        _setStringValue(j, 62, str);
        MethodCollector.m26664o(12359);
    }

    private void setContextDir(String str) {
        MethodCollector.m26663i(12482);
        if (this.mHandle == 0 || str == null) {
            MethodCollector.m26664o(12482);
            return;
        }
        String str2 = str + File.separator + BDUploadUtil.SpeedTestcontextDir;
        BDUploadUtil.createDir(str2);
        _setStringValue(this.mHandle, 418, str2);
        MethodCollector.m26664o(12482);
    }

    private void setDiskResumeDir(String str) {
        MethodCollector.m26663i(12236);
        if (this.mHandle == 0 || str == null) {
            MethodCollector.m26664o(12236);
            return;
        }
        String str2 = str + File.separator + BDUploadUtil.DiskResumeConfigDir;
        BDUploadUtil.createDir(str2);
        _setStringValue(this.mHandle, 303, str2);
        MethodCollector.m26664o(12236);
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
            BDVideoInfo bDVideoInfo = (BDVideoInfo) message.obj;
            if (bDVideoInfo != null) {
                j = bDVideoInfo.mProgress;
            } else {
                j = 0;
            }
            this.mListener.onNotify(i, j, bDVideoInfo);
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

    public void setDiskResumeUniqueKey(String str) {
        MethodCollector.m26663i(12237);
        if (this.mHandle == 0 || str == null || str.isEmpty()) {
            MethodCollector.m26664o(12237);
            return;
        }
        _setStringValue(this.mHandle, 301, str);
        MethodCollector.m26664o(12237);
    }

    public void setEnableLogCallBack(boolean z) {
        MethodCollector.m26663i(12222);
        long j = this.mHandle;
        if (j == 0) {
            MethodCollector.m26664o(12222);
        } else if (z) {
            _setIntValue(j, 78, 1);
            MethodCollector.m26664o(12222);
        } else {
            _setIntValue(j, 78, 0);
            MethodCollector.m26664o(12222);
        }
    }

    public void setMediaDataReader(BDMediaDataReader bDMediaDataReader) {
        MethodCollector.m26663i(11799);
        long j = this.mHandle;
        if (j == 0 || bDMediaDataReader == null) {
            MethodCollector.m26664o(11799);
            return;
        }
        _setIntValue(j, 81, 2);
        _setObject(this.mHandle, 201, bDMediaDataReader);
        MethodCollector.m26664o(11799);
    }

    public void setOpenBoe(boolean z) {
        MethodCollector.m26663i(12096);
        long j = this.mHandle;
        if (j == 0) {
            MethodCollector.m26664o(12096);
        } else if (z) {
            _setIntValue(j, 67, 1);
            MethodCollector.m26664o(12096);
        } else {
            _setIntValue(j, 67, 0);
            MethodCollector.m26664o(12096);
        }
    }

    public void setSDKConfigDir(String str) {
        MethodCollector.m26663i(12481);
        if (this.mHandle == 0 || str == null) {
            MethodCollector.m26664o(12481);
            return;
        }
        BDUploadUtil.createDir(str);
        _setStringValue(this.mHandle, 417, str);
        setContextDir(str);
        MethodCollector.m26664o(12481);
    }

    public void setTraceId(String str) {
        MethodCollector.m26663i(12095);
        if (this.mHandle == 0 || str == null || str.isEmpty()) {
            MethodCollector.m26664o(12095);
            return;
        }
        _setStringValue(this.mHandle, 69, str);
        MethodCollector.m26664o(12095);
    }

    /* JADX INFO: finally extract failed */
    public JSONObject addLogToManager(String str) {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(str);
            jSONObject.put("dns_version", BDUploadResolver.mDNSVersion);
            jSONObject.put("main_dns_type", BDUploadDNSParser.mGlobalMainType);
            jSONObject.put("main_back_type", BDUploadDNSParser.mGlobalBackType);
            jSONObject.put("back_delayed_time", BDUploadDNSParser.mGlobalBackUpDelayedTime);
            jSONObject.put("expired_time", BDUploadDNSParser.mGlobalDefaultExpiredTime);
            JSONObject jSONObject2 = this.mJsonInfo;
            if (jSONObject2 != null) {
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    jSONObject.put(next, this.mJsonInfo.get(next));
                }
            }
            String str2 = "";
            try {
                this.mHeadersLock.lock();
                for (int i = 0; i < 20; i++) {
                    if (!TextUtils.isEmpty(this.mHeaders[i])) {
                        str2 = str2 + "#" + this.mHeaders[i];
                    }
                }
                this.mHeadersLock.unlock();
                if (!TextUtils.isEmpty(str2)) {
                    jSONObject.put("cdn_headers", str2);
                }
            } catch (Throwable th) {
                this.mHeadersLock.unlock();
                throw th;
            }
        } catch (Exception unused) {
            jSONObject = null;
        }
        UploadEventManager.instance.addEvent(jSONObject);
        return jSONObject;
    }

    public int checkNet(int i, int i2) {
        m147846x993aab6e("ttmn", "checketNet");
        BDVideoUploaderListener bDVideoUploaderListener = this.mListener;
        if (bDVideoUploaderListener == null) {
            return 1;
        }
        return bDVideoUploaderListener.videoUploadCheckNetState(i, i2);
    }

    public void setNetworkType(int i, int i2) {
        MethodCollector.m26663i(12227);
        long j = this.mHandle;
        if (j == 0) {
            MethodCollector.m26664o(12227);
            return;
        }
        _setIntValue(j, i, i2);
        MethodCollector.m26664o(12227);
    }

    public void setStringValue(int i, String str) {
        MethodCollector.m26663i(11018);
        long j = this.mHandle;
        if (j == 0 || str == null) {
            MethodCollector.m26664o(11018);
            return;
        }
        _setStringValue(j, i, str);
        MethodCollector.m26664o(11018);
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

    public void onLogInfoSync(int i, int i2, String str) {
        JSONObject jSONObject;
        if (i == 102) {
            if (!TextUtils.isEmpty(str)) {
                try {
                    this.mHeadersLock.lock();
                    if (this.headerIndex >= 20) {
                        this.headerIndex = 0;
                    }
                    String[] strArr = this.mHeaders;
                    int i3 = this.headerIndex;
                    strArr[i3] = str;
                    this.headerIndex = i3 + 1;
                    return;
                } finally {
                    this.mHeadersLock.unlock();
                }
            }
        } else if (i == 104) {
            if (this.mAbstractListener != null) {
                new HashMap(20);
                try {
                    JSONObject jSONObject2 = new JSONObject(str);
                    JSONObject jSONObject3 = this.mJsonInfo;
                    if (jSONObject3 != null) {
                        Iterator<String> keys = jSONObject3.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            jSONObject2.put(next, this.mJsonInfo.get(next));
                        }
                    }
                    BDUploadUtil.jsonToHashMap(jSONObject2);
                    return;
                } catch (JSONException e) {
                    e.printStackTrace();
                    return;
                }
            } else {
                return;
            }
        } else if (i == 103) {
            long time = new Date().getTime() / 1000;
            BDVideoUploaderListener bDVideoUploaderListener = this.mListener;
            if (bDVideoUploaderListener != null) {
                bDVideoUploaderListener.onUploadVideoStage(i2, time);
            }
        } else if (i == 107) {
            try {
                jSONObject = new JSONObject(str);
            } catch (Exception unused) {
                jSONObject = null;
            }
            UploadEventManager.instance.addEvent(jSONObject);
            BDVideoUploaderAbstractListener bDVideoUploaderAbstractListener = this.mAbstractListener;
            if (bDVideoUploaderAbstractListener != null) {
                bDVideoUploaderAbstractListener.onEventLog();
            }
        }
        BDVideoUploaderListener bDVideoUploaderListener2 = this.mListener;
        if (bDVideoUploaderListener2 != null) {
            bDVideoUploaderListener2.onLog(i, i2, str);
        }
    }

    public void onNotify(int i, long j, int i2, String str) {
        MethodCollector.m26663i(10271);
        if (this.mState != 1) {
            MethodCollector.m26664o(10271);
            return;
        }
        BDVideoInfo bDVideoInfo = null;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    String dnsip = getDNSIP();
                    if (dnsip != null && !dnsip.isEmpty()) {
                        setStringValue(75, dnsip);
                    }
                    bDVideoInfo = new BDVideoInfo(null, null, j, _getStringValue(this.mHandle, 415), _getStringValue(this.mHandle, 14), null, null);
                    parseLog();
                    this.mState = 2;
                } else if (i == 3) {
                    parseLog();
                    bDVideoInfo = new BDVideoInfo(null, null, j, null, _getStringValue(this.mHandle, 14), null, null);
                } else if (i == 108) {
                    bDVideoInfo = new BDVideoInfo(null, null, j, null, _getStringValue(this.mHandle, 14), null, null);
                } else if (i != 120) {
                    if (i == 121) {
                        String dnsip2 = getDNSIP();
                        if (dnsip2 != null && !dnsip2.isEmpty()) {
                            setStringValue(75, dnsip2);
                        }
                        bDVideoInfo = new BDVideoInfo(null, null, j, _getStringValue(this.mHandle, 415), _getStringValue(this.mHandle, 14), null, null);
                        parseLog();
                        this.mState = 2;
                    }
                }
            }
            bDVideoInfo = new BDVideoInfo(null, null, j, null, null, null, null);
        } else {
            this.mEndTime = System.currentTimeMillis();
            bDVideoInfo = new BDVideoInfo(_getStringValue(this.mHandle, 10), _getStringValue(this.mHandle, 12), j, null, _getStringValue(this.mHandle, 300), _getStringValue(this.mHandle, 68), _getStringValue(this.mHandle, 407));
            String dnsip3 = getDNSIP();
            if (dnsip3 != null && !dnsip3.isEmpty()) {
                setStringValue(75, dnsip3);
            }
            parseLog();
            this.mState = 3;
        }
        Message obtainMessage = this.mHandler.obtainMessage();
        obtainMessage.what = i;
        obtainMessage.obj = bDVideoInfo;
        obtainMessage.sendToTarget();
        MethodCollector.m26664o(10271);
    }
}
