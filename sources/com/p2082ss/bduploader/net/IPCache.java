package com.p2082ss.bduploader.net;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.ss.bduploader.net.IPCache */
public class IPCache {
    private static IPCache mInstance;
    private static String mNetExtraInfo;
    private static int mNetType = -1;
    private Lock lock = new ReentrantLock();
    private ConcurrentHashMap<String, BDUploadDNSInfo> mDNSRecord = new ConcurrentHashMap<>();

    public String getCurNetExtraInfo() {
        return mNetExtraInfo;
    }

    public int getCurNetType() {
        return mNetType;
    }

    static {
        Covode.recordClassIndex(100835);
    }

    private IPCache() {
    }

    public void clear() {
        this.lock.lock();
        try {
            ConcurrentHashMap<String, BDUploadDNSInfo> concurrentHashMap = this.mDNSRecord;
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
            ConcurrentHashMap<String, BDUploadDNSInfo> concurrentHashMap = this.mDNSRecord;
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
        MethodCollector.m26663i(6368);
        if (mInstance == null) {
            synchronized (IPCache.class) {
                try {
                    if (mInstance == null) {
                        mInstance = new IPCache();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(6368);
                    throw th;
                }
            }
        }
        IPCache iPCache = mInstance;
        MethodCollector.m26664o(6368);
        return iPCache;
    }

    public void setCurNetExtraInfo(String str) {
        mNetExtraInfo = str;
    }

    public void setCurNetType(int i) {
        mNetType = i;
    }

    public BDUploadDNSInfo get(String str) {
        BDUploadDNSInfo bDUploadDNSInfo;
        this.lock.lock();
        try {
            ConcurrentHashMap<String, BDUploadDNSInfo> concurrentHashMap = this.mDNSRecord;
            if (concurrentHashMap != null) {
                bDUploadDNSInfo = concurrentHashMap.get(str);
            } else {
                bDUploadDNSInfo = null;
            }
            return bDUploadDNSInfo;
        } finally {
            this.lock.unlock();
        }
    }

    public void put(String str, BDUploadDNSInfo bDUploadDNSInfo) {
        this.lock.lock();
        try {
            ConcurrentHashMap<String, BDUploadDNSInfo> concurrentHashMap = this.mDNSRecord;
            if (concurrentHashMap != null) {
                concurrentHashMap.put(str, bDUploadDNSInfo);
            }
        } finally {
            this.lock.unlock();
        }
    }
}
