package com.p2082ss.ttuploader;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.ttuploader.net.TTUploadDNSParser;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.ttuploader.TTImageUploader */
public class TTImageUploader implements Handler.Callback {
    private static boolean IsErrored = true;
    int currentType;
    private TTImageUploaderAbstractListener mAbstractListener = null;
    private long mEndTime;
    private long mHandle;
    private Handler mHandler;
    private int mImageNum;
    private TTImageUploaderListener mListener = null;
    private final ReentrantReadWriteLock.ReadLock mReadLock;
    private final ReentrantReadWriteLock mReadWritedLock = new ReentrantReadWriteLock();
    private long mSartTime;
    private int mState = -1;
    private final ReentrantReadWriteLock.WriteLock mWriteLock;

    private static native void _allowUpload(long j);

    private static native long _getLongValue(long j, int i);

    private static native void _imageUploaderClose(long j);

    private final native long _imageUploaderCreate(int i);

    private static native String _imageUploaderGetImageMetaInfo(long j, int i);

    private static native String _imageUploaderGetImageUri(long j, int i);

    private static native String _imageUploaderGetStringValue(long j, int i);

    private static native void _imageUploaderSetFileData(long j, int i, byte[][] bArr);

    private static native void _imageUploaderSetFileName(long j, int i, String[] strArr);

    private static native void _imageUploaderSetFilePath(long j, int i, String[] strArr);

    private static native void _imageUploaderSetIntValue(long j, int i, int i2);

    private static native void _imageUploaderSetStringValue(long j, int i, String str);

    private static native void _imageUploaderStart(long j);

    private static native String _imageUploaderStop(long j);

    private static native void _setInt64Value(long j, int i, long j2);

    private static native void _setObject(long j, int i, Object obj);

    /* renamed from: com_ss_ttuploader_TTImageUploader_com_ss_android_ugc_aweme_lancet_LogLancet_e */
    public static int m148557xf9f82b0e(String str, String str2) {
        return 0;
    }

    public static boolean isError() {
        return IsErrored;
    }

    public String getDNSIP() {
        return TTUploadUtil.getDNSServerIP();
    }

    static {
        Covode.recordClassIndex(101474);
        if (!TTUploadUtil.initInternal()) {
        }
    }

    public void allowContinueUpload() {
        MethodCollector.m26663i(11886);
        long j = this.mHandle;
        if (j == 0) {
            MethodCollector.m26664o(11886);
            return;
        }
        _allowUpload(j);
        MethodCollector.m26664o(11886);
    }

    public void close() {
        MethodCollector.m26663i(11711);
        this.mWriteLock.lock();
        try {
            long j = this.mHandle;
            if (j != 0) {
                _imageUploaderClose(j);
                this.mHandle = 0;
                this.mState = 5;
                this.mHandler.removeCallbacksAndMessages(null);
            }
        } finally {
            this.mWriteLock.unlock();
            MethodCollector.m26664o(11711);
        }
    }

    public void start() {
        MethodCollector.m26663i(11709);
        this.mReadLock.lock();
        try {
            if (this.mHandle != 0) {
                this.mState = 1;
                this.mSartTime = System.currentTimeMillis();
                _imageUploaderStart(this.mHandle);
            }
        } finally {
            this.mReadLock.unlock();
            MethodCollector.m26664o(11709);
        }
    }

    public void stop() {
        MethodCollector.m26663i(11710);
        this.mWriteLock.lock();
        try {
            long j = this.mHandle;
            if (j != 0) {
                addLogToManager(_imageUploaderStop(j));
                this.mState = 4;
            }
        } finally {
            this.mWriteLock.unlock();
            MethodCollector.m26664o(11710);
        }
    }

    public TTImageUploader() {
        MethodCollector.m26663i(10790);
        if (IsErrored) {
            TTUploadUtil.initInternal();
        }
        try {
            this.mHandle = _imageUploaderCreate(0);
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
            MethodCollector.m26664o(10790);
            return;
        }
        Exception exc = new Exception("create native uploader fail");
        MethodCollector.m26664o(10790);
        throw exc;
    }

    public void setAbstractListener(TTImageUploaderAbstractListener tTImageUploaderAbstractListener) {
        this.mAbstractListener = tTImageUploaderAbstractListener;
    }

    public void setCurrentType(int i) {
        this.currentType = i;
    }

    public void setHandler(Handler handler) {
        this.mHandler = handler;
    }

    public void setListener(TTImageUploaderListener tTImageUploaderListener) {
        this.mListener = tTImageUploaderListener;
    }

    public void setFileUploadDomain(String str) {
        setStringValue(2, str);
    }

    public void setImageUploadDomain(String str) {
        setStringValue(3, str);
    }

    public void setObjectType(String str) {
        setStringValue(54, str);
    }

    public void setProcessAction(String str) {
        setStringValue(65, str);
    }

    public void setUploadCookie(String str) {
        setStringValue(4, str);
    }

    public void setUserKey(String str) {
        setStringValue(1, str);
    }

    private void setDeviceID(long j) {
        MethodCollector.m26663i(11712);
        long j2 = this.mHandle;
        if (j2 == 0 || j <= 0) {
            MethodCollector.m26664o(11712);
            return;
        }
        _setInt64Value(j2, 66, j);
        MethodCollector.m26664o(11712);
    }

    public void extraParams(JSONObject jSONObject) {
        String jSONObject2;
        if (this.mHandle != 0 && jSONObject != null && (jSONObject2 = jSONObject.toString()) != null) {
            setStringValue(61, jSONObject2);
        }
    }

    public boolean handleMessage(Message message) {
        long j;
        int i = message.what;
        if (this.mListener == null) {
            return true;
        }
        TTImageInfo tTImageInfo = (TTImageInfo) message.obj;
        if (tTImageInfo != null) {
            j = tTImageInfo.mProgress;
        } else {
            j = 0;
        }
        this.mListener.onNotify(i, j, tTImageInfo);
        return true;
    }

    public void setAuthorization(String str) {
        MethodCollector.m26663i(11236);
        long j = this.mHandle;
        if (j == 0 || str == null) {
            MethodCollector.m26664o(11236);
            return;
        }
        _imageUploaderSetStringValue(j, 15, str);
        MethodCollector.m26664o(11236);
    }

    public void setConfig(TreeMap<String, Object> treeMap) {
        String mapToString;
        if (this.mHandle != 0 && treeMap != null && (mapToString = TTUploadUtil.mapToString(treeMap)) != null) {
            setStringValue(56, mapToString);
        }
    }

    public void setEnableHttps(int i) {
        MethodCollector.m26663i(11387);
        long j = this.mHandle;
        if (j == 0 || !(i == 0 || i == 1)) {
            MethodCollector.m26664o(11387);
            return;
        }
        _imageUploaderSetIntValue(j, 19, i);
        MethodCollector.m26664o(11387);
    }

    public void setFileRetryCount(int i) {
        MethodCollector.m26663i(11386);
        long j = this.mHandle;
        if (j == 0 || i < 0) {
            MethodCollector.m26664o(11386);
            return;
        }
        _imageUploaderSetIntValue(j, 6, i);
        MethodCollector.m26664o(11386);
    }

    public void setMaxFailTime(int i) {
        MethodCollector.m26663i(11552);
        long j = this.mHandle;
        if (j == 0 || i < 0) {
            MethodCollector.m26664o(11552);
            return;
        }
        _imageUploaderSetIntValue(j, 13, i);
        MethodCollector.m26664o(11552);
    }

    public void setPolicyParams(TreeMap<String, Object> treeMap) {
        String mapToString;
        if (this.mHandle != 0 && treeMap != null && (mapToString = TTUploadUtil.mapToString(treeMap)) != null) {
            setStringValue(55, mapToString);
        }
    }

    public void setPreUpload(boolean z) {
        MethodCollector.m26663i(11881);
        long j = this.mHandle;
        if (j == 0) {
            MethodCollector.m26664o(11881);
            return;
        }
        _imageUploaderSetIntValue(j, 80, z ? 1 : 0);
        MethodCollector.m26664o(11881);
    }

    public void setPreheatUploader(boolean z) {
        MethodCollector.m26663i(11885);
        long j = this.mHandle;
        if (j == 0) {
            MethodCollector.m26664o(11885);
            return;
        }
        _imageUploaderSetIntValue(j, 74, z ? 1 : 0);
        MethodCollector.m26664o(11885);
    }

    public void setScenesTag(String str) {
        MethodCollector.m26663i(11884);
        long j = this.mHandle;
        if (j == 0 || str == null) {
            MethodCollector.m26664o(11884);
            return;
        }
        _imageUploaderSetStringValue(j, 85, str);
        MethodCollector.m26664o(11884);
    }

    public void setServerParameter(String str) {
        MethodCollector.m26663i(11235);
        long j = this.mHandle;
        if (j == 0 || str == null) {
            MethodCollector.m26664o(11235);
            return;
        }
        _imageUploaderSetStringValue(j, 16, str);
        MethodCollector.m26664o(11235);
    }

    public void setSliceReTryCount(int i) {
        MethodCollector.m26663i(11383);
        long j = this.mHandle;
        if (j == 0 || i < 0) {
            MethodCollector.m26664o(11383);
            return;
        }
        _imageUploaderSetIntValue(j, 5, i);
        MethodCollector.m26664o(11383);
    }

    public void setSliceSize(int i) {
        MethodCollector.m26663i(11238);
        long j = this.mHandle;
        if (j == 0 || i < 0) {
            MethodCollector.m26664o(11238);
            return;
        }
        _imageUploaderSetIntValue(j, 8, i);
        MethodCollector.m26664o(11238);
    }

    public void setSliceTimeout(int i) {
        MethodCollector.m26663i(11237);
        long j = this.mHandle;
        if (j == 0 || i < 0) {
            MethodCollector.m26664o(11237);
            return;
        }
        _imageUploaderSetIntValue(j, 7, i);
        MethodCollector.m26664o(11237);
    }

    public void setSocketNum(int i) {
        MethodCollector.m26663i(11240);
        long j = this.mHandle;
        if (j == 0 || i < 0) {
            MethodCollector.m26664o(11240);
            return;
        }
        _imageUploaderSetIntValue(j, 9, i);
        MethodCollector.m26664o(11240);
    }

    public void setTranTimeOutUnit(int i) {
        MethodCollector.m26663i(11553);
        long j = this.mHandle;
        if (j == 0 || i <= 0) {
            MethodCollector.m26664o(11553);
            return;
        }
        _imageUploaderSetIntValue(j, 64, i);
        MethodCollector.m26664o(11553);
    }

    private void setTraceId(String str) {
        MethodCollector.m26663i(11877);
        if (this.mHandle == 0 || str == null || str.isEmpty()) {
            MethodCollector.m26664o(11877);
            return;
        }
        _imageUploaderSetStringValue(this.mHandle, 69, str);
        MethodCollector.m26664o(11877);
    }

    public void addLogToManager(String str) {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(str);
            jSONObject.put("dns_version", TTUploadResolver.mDNSVersion);
            jSONObject.put("main_dns_type", TTUploadDNSParser.mGlobalMainType);
            jSONObject.put("main_back_type", TTUploadDNSParser.mGlobalBackType);
            jSONObject.put("back_delayed_time", TTUploadDNSParser.mGlobalBackUpDelayedTime);
            jSONObject.put("expired_time", TTUploadDNSParser.mGlobalDefaultExpiredTime);
        } catch (Exception unused) {
            jSONObject = null;
        }
        UploadEventManager.instance.addImageEvent(jSONObject);
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

    public void setOpenBoe(boolean z) {
        MethodCollector.m26663i(11878);
        long j = this.mHandle;
        if (j == 0) {
            MethodCollector.m26664o(11878);
        } else if (z) {
            _imageUploaderSetIntValue(j, 67, 1);
            MethodCollector.m26664o(11878);
        } else {
            _imageUploaderSetIntValue(j, 67, 0);
            MethodCollector.m26664o(11878);
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

    public void setUploadToken(String str) {
        m148557xf9f82b0e("ttmn", str);
        if (str != null && !str.isEmpty()) {
            try {
                JSONObject jSONObject = new JSONObject(new String(Base64.decode(str.getBytes(), 2)));
                String string = jSONObject.getString("ApplyUploadToken");
                String string2 = jSONObject.getString("CommitUploadToken");
                if (string != null && !string.isEmpty()) {
                    setStringValue(83, string);
                }
                if (string2 != null && !string2.isEmpty()) {
                    setStringValue(84, string2);
                }
            } catch (JSONException e) {
                m148557xf9f82b0e("ttmn", "uploadToken is encode json error !!!");
                e.printStackTrace();
            }
        }
    }

    public TTImageUploader(int i) {
        MethodCollector.m26663i(10647);
        setCurrentType(i);
        try {
            this.mHandle = _imageUploaderCreate(i);
        } catch (Throwable th) {
            this.mHandle = 0;
            m148557xf9f82b0e("ttmn", th.toString());
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
            MethodCollector.m26664o(10647);
            return;
        }
        Exception exc = new Exception("create native uploader fail");
        MethodCollector.m26664o(10647);
        throw exc;
    }

    public int checkNet(int i, int i2) {
        TTImageUploaderAbstractListener tTImageUploaderAbstractListener = this.mAbstractListener;
        if (tTImageUploaderAbstractListener == null) {
            return -2;
        }
        return tTImageUploaderAbstractListener.imageUploadCheckNetState(i, i2);
    }

    public void setFileName(int i, String[] strArr) {
        MethodCollector.m26663i(11883);
        long j = this.mHandle;
        if (j == 0 || strArr == null || i <= 0) {
            MethodCollector.m26664o(11883);
            return;
        }
        _imageUploaderSetFileName(j, i, strArr);
        MethodCollector.m26664o(11883);
    }

    public void setStringValue(int i, String str) {
        MethodCollector.m26663i(11234);
        long j = this.mHandle;
        if (j == 0 || str == null) {
            MethodCollector.m26664o(11234);
            return;
        }
        _imageUploaderSetStringValue(j, i, str);
        MethodCollector.m26664o(11234);
    }

    public void setFileData(int i, byte[][] bArr) {
        MethodCollector.m26663i(11087);
        long j = this.mHandle;
        if (j == 0 || bArr == null || i <= 0) {
            MethodCollector.m26664o(11087);
            return;
        }
        this.mImageNum = i;
        _imageUploaderSetFileData(j, i, bArr);
        _imageUploaderSetIntValue(this.mHandle, 81, 0);
        MethodCollector.m26664o(11087);
    }

    public void setFilePath(int i, String[] strArr) {
        MethodCollector.m26663i(10941);
        long j = this.mHandle;
        if (j == 0 || strArr == null || i <= 0) {
            MethodCollector.m26664o(10941);
            return;
        }
        this.mImageNum = i;
        _imageUploaderSetFilePath(j, i, strArr);
        _imageUploaderSetIntValue(this.mHandle, 81, 0);
        MethodCollector.m26664o(10941);
    }

    public void setMediaDataReader(TTMediaDataReader tTMediaDataReader, int i) {
        MethodCollector.m26663i(11879);
        long j = this.mHandle;
        if (j == 0 || tTMediaDataReader == null || i <= 0) {
            MethodCollector.m26664o(11879);
            return;
        }
        _imageUploaderSetIntValue(j, 71, i);
        _setObject(this.mHandle, 201, tTMediaDataReader);
        _imageUploaderSetIntValue(this.mHandle, 81, 2);
        MethodCollector.m26664o(11879);
    }

    public void onLogInfo(int i, int i2, String str) {
        TTImageUploaderListener tTImageUploaderListener = this.mListener;
    }

    public void setMediaDataReader(TTMediaDataReader tTMediaDataReader, int i, int i2) {
        MethodCollector.m26663i(11880);
        if (this.mHandle == 0 || tTMediaDataReader == null || i <= 0) {
            MethodCollector.m26664o(11880);
            return;
        }
        setMediaDataReader(tTMediaDataReader, i);
        _imageUploaderSetIntValue(this.mHandle, 81, i2);
        MethodCollector.m26664o(11880);
    }

    public void onNotify(int i, long j, int i2) {
        MethodCollector.m26663i(10939);
        if (this.mState != 1) {
            MethodCollector.m26664o(10939);
            return;
        }
        TTImageInfo tTImageInfo = null;
        int i3 = (int) j;
        if (i == 0) {
            String dnsip = getDNSIP();
            if (dnsip != null && !dnsip.isEmpty()) {
                setStringValue(75, dnsip);
            }
            addLogToManager(_imageUploaderGetStringValue(this.mHandle, 100));
            this.mState = 3;
        } else if (i == 1) {
            tTImageInfo = new TTImageInfo(null, (long) i2, i3, null);
        } else if (i == 2) {
            String dnsip2 = getDNSIP();
            if (dnsip2 != null && !dnsip2.isEmpty()) {
                setStringValue(75, dnsip2);
            }
            addLogToManager(_imageUploaderGetStringValue(this.mHandle, 100));
            this.mState = 2;
        } else if (i == 3) {
            this.mEndTime = System.currentTimeMillis();
            String _imageUploaderGetStringValue = _imageUploaderGetStringValue(this.mHandle, 51);
            String _imageUploaderGetStringValue2 = _imageUploaderGetStringValue(this.mHandle, 50);
            String _imageUploaderGetStringValue3 = _imageUploaderGetStringValue(this.mHandle, 52);
            String _imageUploaderGetStringValue4 = _imageUploaderGetStringValue(this.mHandle, 53);
            String _imageUploaderGetStringValue5 = _imageUploaderGetStringValue(this.mHandle, 57);
            String _imageUploaderGetStringValue6 = _imageUploaderGetStringValue(this.mHandle, 58);
            String _imageUploaderGetImageUri = _imageUploaderGetImageUri(this.mHandle, i3);
            tTImageInfo = this.currentType == 1 ? new TTImageInfo(_imageUploaderGetStringValue, _imageUploaderGetStringValue2, _imageUploaderGetStringValue3, _imageUploaderGetStringValue4, _imageUploaderGetImageUri, _imageUploaderGetStringValue5, _imageUploaderGetStringValue6, _imageUploaderGetStringValue(this.mHandle, 59), 0, i3) : new TTImageInfo(_imageUploaderGetImageUri, 0, i3, _imageUploaderGetImageMetaInfo(this.mHandle, i3));
        } else if (i == 4) {
            tTImageInfo = new TTImageInfo(null, (long) i2, i3, null);
        }
        Message obtainMessage = this.mHandler.obtainMessage();
        obtainMessage.what = i;
        obtainMessage.obj = tTImageInfo;
        obtainMessage.sendToTarget();
        MethodCollector.m26664o(10939);
    }
}
