package com.p2082ss.mediakit.net;

import android.text.TextUtils;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.mediakit.medialoader.AVMDLDataLoader;
import com.p2082ss.mediakit.medialoader.AVMDLLog;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.ss.mediakit.net.IPCache */
public class IPCache {
    private static IPCache mInstance;
    private static String mNetExtraInfo;
    private static int mNetType = -1;
    private Lock backUplock = new ReentrantLock();
    private Lock lock = new ReentrantLock();
    private ConcurrentHashMap<String, AVMDLDNSInfo> mBackUps = new ConcurrentHashMap<>();
    private ConcurrentHashMap<String, AVMDLDNSInfo> mDNSRecord = new ConcurrentHashMap<>();

    public String getCurNetExtraInfo() {
        return mNetExtraInfo;
    }

    public int getCurNetType() {
        return mNetType;
    }

    static {
        Covode.recordClassIndex(101254);
    }

    private IPCache() {
    }

    public void clear() {
        this.lock.lock();
        try {
            ConcurrentHashMap<String, AVMDLDNSInfo> concurrentHashMap = this.mDNSRecord;
            if (concurrentHashMap != null) {
                concurrentHashMap.clear();
            }
        } finally {
            this.lock.unlock();
        }
    }

    public int getRecordSize() {
        int i;
        this.lock.lock();
        try {
            ConcurrentHashMap<String, AVMDLDNSInfo> concurrentHashMap = this.mDNSRecord;
            if (concurrentHashMap != null) {
                i = concurrentHashMap.size();
            } else {
                i = -1;
            }
            return i;
        } finally {
            this.lock.unlock();
        }
    }

    public static IPCache getInstance() {
        MethodCollector.m26663i(9073);
        if (mInstance == null) {
            synchronized (IPCache.class) {
                try {
                    if (mInstance == null) {
                        mInstance = new IPCache();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(9073);
                    throw th;
                }
            }
        }
        IPCache iPCache = mInstance;
        MethodCollector.m26664o(9073);
        return iPCache;
    }

    public static void setCurNetExtraInfo(String str) {
        mNetExtraInfo = str;
    }

    public void setCurNetType(int i) {
        mNetType = i;
    }

    public AVMDLDNSInfo getBackUpIp(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        this.backUplock.lock();
        try {
            return this.mBackUps.get(str);
        } finally {
            this.backUplock.unlock();
        }
    }

    public AVMDLDNSInfo get(String str) {
        AVMDLDNSInfo aVMDLDNSInfo = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        this.lock.lock();
        try {
            ConcurrentHashMap<String, AVMDLDNSInfo> concurrentHashMap = this.mDNSRecord;
            if (concurrentHashMap != null && (aVMDLDNSInfo = concurrentHashMap.get(str)) != null && !TextUtils.isEmpty(aVMDLDNSInfo.mIpList) && AVMDLDNSParser.mGlobalEnableBackUpIp > 0) {
                AVMDLLog.m147905d("AVMDLIPCache", C1764a.m5928a("enable backup try get backup ip for:%s", new Object[]{str}));
                AVMDLDNSInfo backUpIp = getBackUpIp(str);
                if (backUpIp != null && !TextUtils.isEmpty(backUpIp.mIpList)) {
                    AVMDLLog.m147905d("AVMDLIPCache", C1764a.m5928a("succ get backup ip:%s", new Object[]{backUpIp.mIpList}));
                    aVMDLDNSInfo.mIpList += "," + backUpIp.mIpList;
                }
            }
            return aVMDLDNSInfo;
        } finally {
            this.lock.unlock();
        }
    }

    public void putBackUpIp(String str, AVMDLDNSInfo aVMDLDNSInfo) {
        if (aVMDLDNSInfo != null && !TextUtils.isEmpty(str)) {
            this.backUplock.lock();
            try {
                AVMDLLog.m147905d("AVMDLIPCache", C1764a.m5928a("put backupip for host:%s type:%d ip:%s", new Object[]{aVMDLDNSInfo.mHost, Integer.valueOf(aVMDLDNSInfo.mType), aVMDLDNSInfo.mIpList}));
                this.mBackUps.put(str, aVMDLDNSInfo);
            } finally {
                this.backUplock.unlock();
            }
        }
    }

    public void put(String str, AVMDLDNSInfo aVMDLDNSInfo) {
        if (aVMDLDNSInfo != null && !TextUtils.isEmpty(str)) {
            this.lock.lock();
            try {
                ConcurrentHashMap<String, AVMDLDNSInfo> concurrentHashMap = this.mDNSRecord;
                if (concurrentHashMap != null) {
                    AVMDLDNSInfo aVMDLDNSInfo2 = concurrentHashMap.get(str);
                    if (AVMDLDNSParser.mGlobalEnableParallel <= 0 || aVMDLDNSInfo2 == null || aVMDLDNSInfo.mType != 0 || aVMDLDNSInfo2.mType <= aVMDLDNSInfo.mType || aVMDLDNSInfo2.mExpiredTime <= System.currentTimeMillis()) {
                        AVMDLLog.m147905d("AVMDLIPCache", C1764a.m5928a("put for host:%s type:%d ip:%s", new Object[]{aVMDLDNSInfo.mHost, Integer.valueOf(aVMDLDNSInfo.mType), aVMDLDNSInfo.mIpList}));
                        this.mDNSRecord.put(str, aVMDLDNSInfo);
                    } else {
                        AVMDLLog.m147905d("AVMDLIPCache", C1764a.m5928a("put for host:%s enable parallel info.type:%d info.expiredT:%d cache.type:%d cache.expiredT:%d curT:%d info can not replace cache", new Object[]{str, Integer.valueOf(aVMDLDNSInfo.mType), Long.valueOf(aVMDLDNSInfo.mExpiredTime), Integer.valueOf(aVMDLDNSInfo2.mType), Long.valueOf(aVMDLDNSInfo2.mExpiredTime), Long.valueOf(System.currentTimeMillis())}));
                        return;
                    }
                }
                this.lock.unlock();
                AVMDLLog.m147905d("AVMDLIPCache", "update dns info to native");
                AVMDLDataLoader.getInstance().updateDNSInfo(str, aVMDLDNSInfo.mIpList, aVMDLDNSInfo.mExpiredTime, null, aVMDLDNSInfo.mType);
            } finally {
                this.lock.unlock();
            }
        }
    }
}
