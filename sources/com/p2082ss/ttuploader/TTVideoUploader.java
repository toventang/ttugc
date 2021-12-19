package com.p2082ss.ttuploader;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.ttuploader.net.TTUploadDNSParser;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.UUID;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.ttuploader.TTVideoUploader */
public class TTVideoUploader implements Handler.Callback {
    private static boolean IsErrored = true;
    int currentType;
    int headerIndex;
    private TTVideoUploaderAbstractListener mAbstractListener = null;
    private long mEndTime;
    private long mHandle;
    private Handler mHandler;
    private String[] mHeaders;
    private Lock mHeadersLock = new ReentrantLock();
    private boolean mIsTestSpeed;
    private JSONObject mJsonInfo;
    private TTVideoUploaderListener mListener = null;
    private final ReentrantReadWriteLock.ReadLock mReadLock;
    private final ReentrantReadWriteLock mReadWritedLock = new ReentrantReadWriteLock();
    private long mSartTime;
    private int mState = -1;
    private final ReentrantReadWriteLock.WriteLock mWriteLock;

    private static native void _cancelUpload(long j);

    private static native String _close(long j, int i);

    private final native long _create(int i);

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

    private static native void _startSpeedTest(long j, int i, int i2, int i3);

    private static native String _stop(long j);

    private static native void _stopSpeedTest(long j);

    /* renamed from: com_ss_ttuploader_TTVideoUploader_com_ss_android_ugc_aweme_lancet_LogLancet_e */
    public static int m148577xa9b4462e(String str, String str2) {
        return 0;
    }

    /* renamed from: com_ss_ttuploader_TTVideoUploader_com_ss_android_ugc_aweme_lancet_LogLancet_v */
    public static int m148578xa9b4463f(String str, String str2) {
        return 0;
    }

    /* renamed from: com.ss.ttuploader.TTVideoUploader$LogInfo */
    public static class LogInfo {
        private int code;
        private String info;

        static {
            Covode.recordClassIndex(101496);
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

    public void close() {
        close(0);
    }

    public String getDNSIP() {
        return TTUploadUtil.getDNSServerIP();
    }

    static {
        Covode.recordClassIndex(101495);
        if (!TTUploadUtil.initInternal()) {
        }
    }

    public void allowMergeUpload() {
        MethodCollector.m26663i(11437);
        long j = this.mHandle;
        if (j == 0) {
            MethodCollector.m26664o(11437);
            return;
        }
        _mergeUpload(j);
        MethodCollector.m26664o(11437);
    }

    public void cancelUpload() {
        MethodCollector.m26663i(11924);
        this.mWriteLock.lock();
        long j = this.mHandle;
        if (j == 0) {
            this.mWriteLock.unlock();
            MethodCollector.m26664o(11924);
            return;
        }
        _cancelUpload(j);
        this.mWriteLock.unlock();
        MethodCollector.m26664o(11924);
    }

    public void start() {
        MethodCollector.m26663i(10565);
        this.mReadLock.lock();
        try {
            if (this.mHandle != 0) {
                this.mState = 1;
                this.mSartTime = System.currentTimeMillis();
                _start(this.mHandle);
            }
        } finally {
            this.mReadLock.unlock();
            MethodCollector.m26664o(10565);
        }
    }

    public void stopSpeedTest() {
        MethodCollector.m26663i(12063);
        this.mReadLock.lock();
        long j = this.mHandle;
        if (j == 0) {
            this.mReadLock.unlock();
            MethodCollector.m26664o(12063);
            return;
        }
        _stopSpeedTest(j);
        this.mReadLock.unlock();
        MethodCollector.m26664o(12063);
    }

    public void stop() {
        MethodCollector.m26663i(10705);
        this.mWriteLock.lock();
        try {
            if (this.mHandle != 0) {
                String dnsip = getDNSIP();
                if (dnsip != null && !dnsip.isEmpty()) {
                    setStringValue(75, dnsip);
                }
                addLogToManager(_stop(this.mHandle));
                this.mState = 4;
            }
        } finally {
            this.mWriteLock.unlock();
            MethodCollector.m26664o(10705);
        }
    }

    public TTVideoUploader() {
        MethodCollector.m26663i(10075);
        try {
            this.mHandle = _create(0);
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
            getDNSIP();
            this.mState = 0;
            this.mIsTestSpeed = false;
            this.mHeaders = new String[20];
            int i = 0;
            do {
                this.mHeaders[i] = null;
                i++;
            } while (i < 20);
            this.headerIndex = 0;
            String uuid = UUID.randomUUID().toString();
            if (uuid != null && uuid.length() > 0) {
                _setStringValue(this.mHandle, 90, uuid);
            }
            String uuid2 = UUID.randomUUID().toString();
            if (uuid2 != null && uuid2.length() > 0) {
                _setStringValue(this.mHandle, 91, uuid2);
            }
            MethodCollector.m26664o(10075);
            return;
        }
        Exception exc = new Exception("create native uploader fail");
        MethodCollector.m26664o(10075);
        throw exc;
    }

    public void setAbstractListener(TTVideoUploaderAbstractListener tTVideoUploaderAbstractListener) {
        this.mAbstractListener = tTVideoUploaderAbstractListener;
    }

    public void setCurrentType(int i) {
        this.currentType = i;
    }

    public void setExternLogInfo(JSONObject jSONObject) {
        this.mJsonInfo = jSONObject;
    }

    public void setHandler(Handler handler) {
        this.mHandler = handler;
    }

    public void setListener(TTVideoUploaderListener tTVideoUploaderListener) {
        this.mListener = tTVideoUploaderListener;
    }

    public void setFileUploadDomain(String str) {
        setStringValue(2, str);
    }

    public void setPathName(String str) {
        setStringValue(0, str);
    }

    public void setUploadCookie(String str) {
        setStringValue(4, str);
    }

    public void setUserKey(String str) {
        setStringValue(1, str);
    }

    public void setVideoUploadDomain(String str) {
        setStringValue(3, str);
    }

    public String getStringFromExtern(int i) {
        TTVideoUploaderListener tTVideoUploaderListener = this.mListener;
        if (tTVideoUploaderListener != null) {
            return tTVideoUploaderListener.getStringFromExtern(i);
        }
        return null;
    }

    public void setTestSpeed(boolean z) {
        if (this.mHandle != 0) {
            this.mIsTestSpeed = z;
        }
    }

    public int switchNetType(int i) {
        TTVideoUploaderAbstractListener tTVideoUploaderAbstractListener = this.mAbstractListener;
        if (tTVideoUploaderAbstractListener == null || !tTVideoUploaderAbstractListener.switchNetType(i)) {
            return 0;
        }
        return 1;
    }

    private void setDeviceID(long j) {
        MethodCollector.m26663i(10994);
        long j2 = this.mHandle;
        if (j2 == 0 || j <= 0) {
            MethodCollector.m26664o(10994);
            return;
        }
        _setInt64Value(j2, 66, j);
        MethodCollector.m26664o(10994);
    }

    public void setAliveMaxFailTime(int i) {
        MethodCollector.m26663i(10548);
        long j = this.mHandle;
        if (j == 0 || i < 0) {
            MethodCollector.m26664o(10548);
            return;
        }
        _setIntValue(j, 22, i);
        MethodCollector.m26664o(10548);
    }

    public void setAuthorization(String str) {
        MethodCollector.m26663i(10395);
        long j = this.mHandle;
        if (j == 0 || str == null) {
            MethodCollector.m26664o(10395);
            return;
        }
        _setStringValue(j, 15, str);
        MethodCollector.m26664o(10395);
    }

    public void setConfig(TreeMap<String, Object> treeMap) {
        String mapToString;
        if (this.mHandle != 0 && treeMap != null && (mapToString = TTUploadUtil.mapToString(treeMap)) != null) {
            setStringValue(56, mapToString);
        }
    }

    public void setContext(String str) {
        MethodCollector.m26663i(12194);
        long j = this.mHandle;
        if (j == 0 || str == null) {
            MethodCollector.m26664o(12194);
            return;
        }
        _setContext(j, str);
        MethodCollector.m26664o(12194);
    }

    public void setEnableExternDNS(int i) {
        MethodCollector.m26663i(10544);
        long j = this.mHandle;
        if (j == 0 || !(i == 0 || i == 1)) {
            MethodCollector.m26664o(10544);
            return;
        }
        _setIntValue(j, 21, i);
        MethodCollector.m26664o(10544);
    }

    public void setEnableExternNet(int i) {
        MethodCollector.m26663i(10560);
        long j = this.mHandle;
        if (j == 0 || i < 0) {
            MethodCollector.m26664o(10560);
            return;
        }
        _setIntValue(j, 26, i);
        MethodCollector.m26664o(10560);
    }

    public void setEnableFiletryHttps(int i) {
        MethodCollector.m26663i(10546);
        long j = this.mHandle;
        if (j == 0 || !(i == 0 || i == 1)) {
            MethodCollector.m26664o(10546);
            return;
        }
        _setIntValue(j, 25, i);
        MethodCollector.m26664o(10546);
    }

    public void setEnableHttps(int i) {
        MethodCollector.m26663i(10541);
        long j = this.mHandle;
        if (j == 0 || i < 0) {
            MethodCollector.m26664o(10541);
            return;
        }
        _setIntValue(j, 19, i);
        MethodCollector.m26664o(10541);
    }

    public void setEnableKeepAlive(int i) {
        MethodCollector.m26663i(10543);
        long j = this.mHandle;
        if (j == 0 || !(i == 0 || i == 1)) {
            MethodCollector.m26664o(10543);
            return;
        }
        _setIntValue(j, 20, i);
        MethodCollector.m26664o(10543);
    }

    public void setEnableLinkTurbo(int i) {
        MethodCollector.m26663i(12193);
        long j = this.mHandle;
        if (j == 0) {
            MethodCollector.m26664o(12193);
            return;
        }
        _setIntValue(j, 82, i);
        MethodCollector.m26664o(12193);
    }

    public void setEnableMutiTask(int i) {
        MethodCollector.m26663i(10562);
        long j = this.mHandle;
        if (j == 0 || !(i == 0 || i == 1)) {
            MethodCollector.m26664o(10562);
            return;
        }
        _setIntValue(j, 29, i);
        MethodCollector.m26664o(10562);
    }

    public void setEnablePostMethod(int i) {
        MethodCollector.m26663i(10545);
        long j = this.mHandle;
        if (j == 0 || !(i == 0 || i == 1)) {
            MethodCollector.m26664o(10545);
            return;
        }
        _setIntValue(j, 23, i);
        MethodCollector.m26664o(10545);
    }

    public void setEnableQuic(int i) {
        MethodCollector.m26663i(10561);
        long j = this.mHandle;
        if (j == 0 || !(i == 0 || i == 1)) {
            MethodCollector.m26664o(10561);
            return;
        }
        _setIntValue(j, 28, i);
        MethodCollector.m26664o(10561);
    }

    public void setEnableServerHost(int i) {
        MethodCollector.m26663i(10540);
        long j = this.mHandle;
        if (j == 0 || !(i == 0 || i == 1)) {
            MethodCollector.m26664o(10540);
            return;
        }
        _setIntValue(j, 17, i);
        MethodCollector.m26664o(10540);
    }

    public void setEnableUpHost(int i) {
        MethodCollector.m26663i(10539);
        long j = this.mHandle;
        if (j == 0 || !(i == 0 || i == 1)) {
            MethodCollector.m26664o(10539);
            return;
        }
        _setIntValue(j, 18, i);
        MethodCollector.m26664o(10539);
    }

    public void setEvStateEnable(boolean z) {
        MethodCollector.m26663i(11759);
        long j = this.mHandle;
        if (j == 0) {
            MethodCollector.m26664o(11759);
            return;
        }
        _setIntValue(j, 79, z ? 1 : 0);
        MethodCollector.m26664o(11759);
    }

    public void setExternFileReader(TTExternFileReader tTExternFileReader) {
        MethodCollector.m26663i(10558);
        long j = this.mHandle;
        if (j == 0 || tTExternFileReader == null) {
            MethodCollector.m26664o(10558);
            return;
        }
        _setObject(j, 200, tTExternFileReader);
        MethodCollector.m26664o(10558);
    }

    public void setExternMinSIze(int i) {
        MethodCollector.m26663i(11758);
        long j = this.mHandle;
        if (j == 0 || i <= 0) {
            MethodCollector.m26664o(11758);
            return;
        }
        _setIntValue(j, 77, i);
        MethodCollector.m26664o(11758);
    }

    public void setExternNetInfo(String str) {
        MethodCollector.m26663i(10538);
        long j = this.mHandle;
        if (j == 0 || str == null) {
            MethodCollector.m26664o(10538);
            return;
        }
        _setStringValue(j, 41, str);
        MethodCollector.m26664o(10538);
    }

    public void setFileRetryCount(int i) {
        MethodCollector.m26663i(10555);
        long j = this.mHandle;
        if (j == 0 || i < 0) {
            MethodCollector.m26664o(10555);
            return;
        }
        _setIntValue(j, 6, i);
        MethodCollector.m26664o(10555);
    }

    public void setMaxFailTime(int i) {
        MethodCollector.m26663i(10556);
        long j = this.mHandle;
        if (j == 0 || i < 0) {
            MethodCollector.m26664o(10556);
            return;
        }
        _setIntValue(j, 13, i);
        MethodCollector.m26664o(10556);
    }

    public void setMediaDataReader(TTMediaDataReader tTMediaDataReader) {
        MethodCollector.m26663i(10559);
        long j = this.mHandle;
        if (j == 0 || tTMediaDataReader == null) {
            MethodCollector.m26664o(10559);
            return;
        }
        _setObject(j, 201, tTMediaDataReader);
        MethodCollector.m26664o(10559);
    }

    public void setNewHttpProxyLoader(int i) {
        MethodCollector.m26663i(10537);
        long j = this.mHandle;
        if (j == 0 || !(i == 0 || i == 1)) {
            MethodCollector.m26664o(10537);
            return;
        }
        _setIntValue(j, 40, i);
        MethodCollector.m26664o(10537);
    }

    public void setPolicyParams(TreeMap<String, Object> treeMap) {
        if (this.mHandle != 0 && treeMap != null) {
            String mapToString = TTUploadUtil.mapToString(treeMap);
            if (!TextUtils.isEmpty(mapToString)) {
                setStringValue(55, mapToString);
            }
        }
    }

    public void setPoster(float f) {
        MethodCollector.m26663i(10550);
        long j = this.mHandle;
        if (j == 0 || f < 0.0f) {
            MethodCollector.m26664o(10550);
            return;
        }
        _setPoster(j, f);
        MethodCollector.m26664o(10550);
    }

    public void setPreUploadEncryptionMode(int i) {
        MethodCollector.m26663i(11438);
        long j = this.mHandle;
        if (j == 0) {
            MethodCollector.m26664o(11438);
            return;
        }
        _setIntValue(j, 74, i);
        MethodCollector.m26664o(11438);
    }

    public void setResponeTimeOut(int i) {
        MethodCollector.m26663i(11612);
        long j = this.mHandle;
        if (j == 0 || i < 0) {
            MethodCollector.m26664o(11612);
            return;
        }
        _setIntValue(j, 76, i);
        MethodCollector.m26664o(11612);
    }

    public void setScenesTag(String str) {
        MethodCollector.m26663i(12196);
        long j = this.mHandle;
        if (j == 0 || str == null) {
            MethodCollector.m26664o(12196);
            return;
        }
        _setStringValue(j, 85, str);
        MethodCollector.m26664o(12196);
    }

    public void setServerParameter(String str) {
        MethodCollector.m26663i(10536);
        long j = this.mHandle;
        if (j == 0 || str == null) {
            MethodCollector.m26664o(10536);
            return;
        }
        _setStringValue(j, 16, str);
        MethodCollector.m26664o(10536);
    }

    public void setSingleHostTotalTimeout(int i) {
        MethodCollector.m26663i(12197);
        long j = this.mHandle;
        if (j == 0 || i < 0) {
            MethodCollector.m26664o(12197);
            return;
        }
        _setIntValue(j, 89, i);
        MethodCollector.m26664o(12197);
    }

    public void setSliceReTryCount(int i) {
        MethodCollector.m26663i(10554);
        long j = this.mHandle;
        if (j == 0 || i < 0) {
            MethodCollector.m26664o(10554);
            return;
        }
        _setIntValue(j, 5, i);
        MethodCollector.m26664o(10554);
    }

    public void setSliceSize(int i) {
        MethodCollector.m26663i(10552);
        long j = this.mHandle;
        if (j == 0 || i < 0) {
            MethodCollector.m26664o(10552);
            return;
        }
        _setIntValue(j, 8, i);
        MethodCollector.m26664o(10552);
    }

    public void setSliceTimeout(int i) {
        MethodCollector.m26663i(10551);
        long j = this.mHandle;
        if (j == 0 || i < 0) {
            MethodCollector.m26664o(10551);
            return;
        }
        _setIntValue(j, 7, i);
        MethodCollector.m26664o(10551);
    }

    public void setSocketNum(int i) {
        MethodCollector.m26663i(10553);
        long j = this.mHandle;
        if (j == 0 || i < 0) {
            MethodCollector.m26664o(10553);
            return;
        }
        _setIntValue(j, 9, i);
        MethodCollector.m26664o(10553);
    }

    public void setTTExternLoader(TTExternNetLoader tTExternNetLoader) {
        MethodCollector.m26663i(10557);
        long j = this.mHandle;
        if (j == 0 || tTExternNetLoader == null) {
            MethodCollector.m26664o(10557);
            return;
        }
        _setObject(j, 27, tTExternNetLoader);
        MethodCollector.m26664o(10557);
    }

    public void setTcpOpenTimeOutMilliSec(int i) {
        MethodCollector.m26663i(10549);
        long j = this.mHandle;
        if (j == 0 || i < 0) {
            MethodCollector.m26664o(10549);
            return;
        }
        _setIntValue(j, 24, i);
        MethodCollector.m26664o(10549);
    }

    public void setTranTimeOutUnit(int i) {
        MethodCollector.m26663i(10564);
        long j = this.mHandle;
        if (j == 0 || i <= 0) {
            MethodCollector.m26664o(10564);
            return;
        }
        _setIntValue(j, 64, i);
        MethodCollector.m26664o(10564);
    }

    public void setUserRefrence(String str) {
        MethodCollector.m26663i(10563);
        long j = this.mHandle;
        if (j == 0 || str == null) {
            MethodCollector.m26664o(10563);
            return;
        }
        _setStringValue(j, 62, str);
        MethodCollector.m26664o(10563);
    }

    public void setVideoObjectType(String str) {
        if (this.mHandle != 0 && str != null && !str.equals("")) {
            setStringValue(54, str);
        }
    }

    private void setTraceId(String str) {
        MethodCollector.m26663i(11135);
        if (this.mHandle == 0 || str == null || str.isEmpty()) {
            MethodCollector.m26664o(11135);
            return;
        }
        _setStringValue(this.mHandle, 69, str);
        MethodCollector.m26664o(11135);
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
            TTVideoInfo tTVideoInfo = (TTVideoInfo) message.obj;
            if (tTVideoInfo != null) {
                j = tTVideoInfo.mProgress;
            } else {
                j = 0;
            }
            this.mListener.onNotify(i, j, tTVideoInfo);
            return true;
        }
    }

    public void setCustomConfig(TreeMap<String, Object> treeMap) {
        JSONObject mapToJSON;
        if (this.mHandle != 0 && treeMap != null && (mapToJSON = TTUploadUtil.mapToJSON(treeMap)) != null) {
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

    public void setEnableBigFile(int i) {
        MethodCollector.m26663i(10542);
        if (this.mHandle == 0 || i < 0) {
            MethodCollector.m26664o(10542);
            return;
        }
        m148577xa9b4462e("ttmn", "TTVideoUploader-222222!");
        _setIntValue(this.mHandle, 83, i);
        MethodCollector.m26664o(10542);
    }

    public void setEnableLogCallBack(boolean z) {
        MethodCollector.m26663i(11284);
        long j = this.mHandle;
        if (j == 0) {
            MethodCollector.m26664o(11284);
        } else if (z) {
            _setIntValue(j, 78, 1);
            MethodCollector.m26664o(11284);
        } else {
            _setIntValue(j, 78, 0);
            MethodCollector.m26664o(11284);
        }
    }

    public void setOpenBoe(boolean z) {
        MethodCollector.m26663i(11136);
        long j = this.mHandle;
        if (j == 0) {
            MethodCollector.m26664o(11136);
        } else if (z) {
            _setIntValue(j, 67, 1);
            MethodCollector.m26664o(11136);
        } else {
            _setIntValue(j, 67, 0);
            MethodCollector.m26664o(11136);
        }
    }

    public void setOpenResume(boolean z) {
        MethodCollector.m26663i(10547);
        long j = this.mHandle;
        if (j == 0) {
            MethodCollector.m26664o(10547);
        } else if (z) {
            _setIntValue(j, 70, 1);
            MethodCollector.m26664o(10547);
        } else {
            _setIntValue(j, 70, 0);
            MethodCollector.m26664o(10547);
        }
    }

    public void setPrivateVideo(boolean z) {
        MethodCollector.m26663i(12195);
        long j = this.mHandle;
        if (j == 0) {
            MethodCollector.m26664o(12195);
        } else if (z) {
            _setIntValue(j, 88, 1);
            MethodCollector.m26664o(12195);
        } else {
            _setIntValue(j, 88, 0);
            MethodCollector.m26664o(12195);
        }
    }

    public void close(int i) {
        MethodCollector.m26663i(10849);
        this.mWriteLock.lock();
        try {
            if (this.mHandle != 0) {
                String dnsip = getDNSIP();
                if (dnsip != null && !dnsip.isEmpty()) {
                    setStringValue(75, dnsip);
                }
                String _close = _close(this.mHandle, i);
                if (i != 0) {
                    addLogToManager(_close);
                }
                this.mHandle = 0;
                this.mState = 5;
                this.mHandler.removeCallbacksAndMessages(null);
            }
        } finally {
            this.mWriteLock.unlock();
            MethodCollector.m26664o(10849);
        }
    }

    public void setTraceIDConfig(Map<Object, Object> map) {
        if (map.get(69) != null && (map.get(69) instanceof String)) {
            String str = (String) map.get(69);
            if (str != null && !str.isEmpty()) {
                setTraceId(str);
            }
        } else if (map.get(66) != null && (map.get(66) instanceof Long)) {
            long longValue = ((Long) map.get(66)).longValue();
            if (longValue > 0) {
                setDeviceID(longValue);
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public JSONObject addLogToManager(String str) {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(str);
            jSONObject.put("dns_version", TTUploadResolver.mDNSVersion);
            jSONObject.put("main_dns_type", TTUploadDNSParser.mGlobalMainType);
            jSONObject.put("main_back_type", TTUploadDNSParser.mGlobalBackType);
            jSONObject.put("back_delayed_time", TTUploadDNSParser.mGlobalBackUpDelayedTime);
            jSONObject.put("expired_time", TTUploadDNSParser.mGlobalDefaultExpiredTime);
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
        if (!this.mIsTestSpeed) {
            UploadEventManager.instance.addEvent(jSONObject);
        }
        return jSONObject;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TTVideoUploader(int r9) {
        /*
        // Method dump skipped, instructions count: 193
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.ttuploader.TTVideoUploader.<init>(int):void");
    }

    public int checkNet(int i, int i2) {
        m148577xa9b4462e("ttmn", "checketNet");
        TTVideoUploaderListener tTVideoUploaderListener = this.mListener;
        if (tTVideoUploaderListener == null) {
            return 1;
        }
        return tTVideoUploaderListener.videoUploadCheckNetState(i, i2);
    }

    public void setStringValue(int i, String str) {
        MethodCollector.m26663i(10243);
        long j = this.mHandle;
        if (j == 0 || str == null) {
            MethodCollector.m26664o(10243);
            return;
        }
        _setStringValue(j, i, str);
        MethodCollector.m26664o(10243);
    }

    public void setNetworkRoutMode(int i, int i2) {
        MethodCollector.m26663i(12192);
        long j = this.mHandle;
        if (j == 0) {
            MethodCollector.m26664o(12192);
            return;
        }
        _setIntValue(j, 86, i);
        _setIntValue(this.mHandle, 87, i2);
        m148578xa9b4463f("ttmn", "weight".concat(String.valueOf(i2)));
        MethodCollector.m26664o(12192);
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

    public void startSpeedTest(int i, int i2, int i3) {
        MethodCollector.m26663i(12062);
        this.mReadLock.lock();
        try {
            if (this.mHandle != 0) {
                this.mState = 1;
                this.mSartTime = System.currentTimeMillis();
                _startSpeedTest(this.mHandle, i, i2, i3);
            }
        } finally {
            this.mReadLock.unlock();
            MethodCollector.m26664o(12062);
        }
    }

    public void onLogInfoSync(int i, int i2, String str) {
        JSONObject jSONObject;
        JSONException e;
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
                Map<String, String> hashMap = new HashMap<>(20);
                try {
                    jSONObject = new JSONObject(str);
                    try {
                        JSONObject jSONObject2 = this.mJsonInfo;
                        if (jSONObject2 != null) {
                            Iterator<String> keys = jSONObject2.keys();
                            while (keys.hasNext()) {
                                String next = keys.next();
                                jSONObject.put(next, this.mJsonInfo.get(next));
                            }
                        }
                        hashMap = TTUploadUtil.jsonToHashMap(jSONObject);
                    } catch (JSONException e2) {
                        e = e2;
                        e.printStackTrace();
                        this.mAbstractListener.onEventLog(jSONObject);
                        this.mAbstractListener.onEventLogMap(hashMap);
                        return;
                    }
                } catch (JSONException e3) {
                    e = e3;
                    jSONObject = null;
                    e.printStackTrace();
                    this.mAbstractListener.onEventLog(jSONObject);
                    this.mAbstractListener.onEventLogMap(hashMap);
                    return;
                }
                this.mAbstractListener.onEventLog(jSONObject);
                this.mAbstractListener.onEventLogMap(hashMap);
                return;
            }
            return;
        } else if (i == 105) {
            TTVideoUploaderAbstractListener tTVideoUploaderAbstractListener = this.mAbstractListener;
            if (tTVideoUploaderAbstractListener != null) {
                tTVideoUploaderAbstractListener.onSpeedVidContext(0, i2, str);
                return;
            }
            return;
        } else if (i == 106) {
            TTVideoUploaderAbstractListener tTVideoUploaderAbstractListener2 = this.mAbstractListener;
            if (tTVideoUploaderAbstractListener2 != null) {
                tTVideoUploaderAbstractListener2.onSpeedVidContext(1, i2, str);
                return;
            }
            return;
        } else if (i == 110) {
            TTVideoUploaderAbstractListener tTVideoUploaderAbstractListener3 = this.mAbstractListener;
            if (tTVideoUploaderAbstractListener3 != null) {
                tTVideoUploaderAbstractListener3.onSpeedVidContext(2, i2, str);
                return;
            }
            return;
        } else if (i == 113) {
            TTVideoUploaderAbstractListener tTVideoUploaderAbstractListener4 = this.mAbstractListener;
            if (tTVideoUploaderAbstractListener4 != null) {
                tTVideoUploaderAbstractListener4.onSpeedVidContext(3, i2, str);
                return;
            }
            return;
        } else if (i == 111) {
            TTVideoUploaderAbstractListener tTVideoUploaderAbstractListener5 = this.mAbstractListener;
            if (tTVideoUploaderAbstractListener5 != null) {
                tTVideoUploaderAbstractListener5.onSpeedVidContext(4, i2, str);
                return;
            }
            return;
        } else if (i == 112) {
            TTVideoUploaderAbstractListener tTVideoUploaderAbstractListener6 = this.mAbstractListener;
            if (tTVideoUploaderAbstractListener6 != null) {
                tTVideoUploaderAbstractListener6.onSpeedVidContext(5, i2, str);
                return;
            }
            return;
        } else if (i == 103) {
            long time = new Date().getTime() / 1000;
            TTVideoUploaderListener tTVideoUploaderListener = this.mListener;
            if (tTVideoUploaderListener != null) {
                tTVideoUploaderListener.onUploadVideoStage(i2, time);
            }
        }
        TTVideoUploaderListener tTVideoUploaderListener2 = this.mListener;
        if (tTVideoUploaderListener2 != null) {
            tTVideoUploaderListener2.onLog(i, i2, str);
        }
    }

    public void onNotify(int i, long j, int i2) {
        MethodCollector.m26663i(10077);
        if (this.mState != 1) {
            MethodCollector.m26664o(10077);
            return;
        }
        TTVideoInfo tTVideoInfo = null;
        if (i == 0) {
            this.mEndTime = System.currentTimeMillis();
            String _getStringValue = _getStringValue(this.mHandle, 10);
            String _getStringValue2 = _getStringValue(this.mHandle, 11);
            String _getStringValue3 = _getStringValue(this.mHandle, 12);
            String _getStringValue4 = _getStringValue(this.mHandle, 300);
            String _getStringValue5 = _getStringValue(this.mHandle, 51);
            String _getStringValue6 = _getStringValue(this.mHandle, 50);
            String _getStringValue7 = _getStringValue(this.mHandle, 52);
            String _getStringValue8 = _getStringValue(this.mHandle, 53);
            String _getStringValue9 = _getStringValue(this.mHandle, 57);
            String _getStringValue10 = _getStringValue(this.mHandle, 58);
            String _getStringValue11 = _getStringValue(this.mHandle, 59);
            String _getStringValue12 = _getStringValue(this.mHandle, 68);
            if (this.currentType == 1) {
                tTVideoInfo = new TTVideoInfo(_getStringValue5, _getStringValue6, _getStringValue7, _getStringValue8, j, _getStringValue9, _getStringValue10, _getStringValue11);
            } else {
                tTVideoInfo = new TTVideoInfo(_getStringValue, _getStringValue2, _getStringValue3, j, _getStringValue4, _getStringValue12);
            }
            String dnsip = getDNSIP();
            if (dnsip != null && !dnsip.isEmpty()) {
                setStringValue(75, dnsip);
            }
            tTVideoInfo.mLog = addLogToManager(_getStringValue(this.mHandle, 100));
            this.mState = 3;
        } else if (i == 1) {
            tTVideoInfo = new TTVideoInfo(null, null, null, j, null, null);
        } else if (i == 2) {
            String dnsip2 = getDNSIP();
            if (dnsip2 != null && !dnsip2.isEmpty()) {
                setStringValue(75, dnsip2);
            }
            String _getStringValue13 = _getStringValue(this.mHandle, 100);
            tTVideoInfo = new TTVideoInfo(null, null, null, j, _getStringValue(this.mHandle, 14), null);
            addLogToManager(_getStringValue13);
            this.mState = 2;
        } else if (i == 3) {
            addLogToManager(_getStringValue(this.mHandle, 100));
            tTVideoInfo = new TTVideoInfo(null, null, null, j, _getStringValue(this.mHandle, 14), null);
        } else if (i == 105) {
            tTVideoInfo = new TTVideoInfo(null, null, null, j, _getStringValue(this.mHandle, 14), null);
        } else if (i == 106) {
            tTVideoInfo = new TTVideoInfo(null, null, null, j, _getStringValue(this.mHandle, 14), null);
            this.mState = 2;
        } else if (i == 108) {
            tTVideoInfo = new TTVideoInfo(null, null, null, j, _getStringValue(this.mHandle, 14), null);
        }
        Message obtainMessage = this.mHandler.obtainMessage();
        obtainMessage.what = i;
        obtainMessage.obj = tTVideoInfo;
        obtainMessage.sendToTarget();
        MethodCollector.m26664o(10077);
    }
}
