package com.p2082ss.ttuploader.net;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.ss.ttuploader.net.IPCache */
public class IPCache {
    private static IPCache mInstance;
    private static String mNetExtraInfo;
    private static int mNetType = -1;
    private Lock lock = new ReentrantLock();
    private ConcurrentHashMap<String, TTUploadDNSInfo> mDNSRecord = new ConcurrentHashMap<>();

    public String getCurNetExtraInfo() {
        return mNetExtraInfo;
    }

    public int getCurNetType() {
        return mNetType;
    }

    static {
        Covode.recordClassIndex(101508);
    }

    private IPCache() {
    }

    public void clear() {
        this.lock.lock();
        try {
            ConcurrentHashMap<String, TTUploadDNSInfo> concurrentHashMap = this.mDNSRecord;
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
            ConcurrentHashMap<String, TTUploadDNSInfo> concurrentHashMap = this.mDNSRecord;
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
        MethodCollector.m26663i(12729);
        if (mInstance == null) {
            synchronized (IPCache.class) {
                try {
                    if (mInstance == null) {
                        mInstance = new IPCache();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(12729);
                    throw th;
                }
            }
        }
        IPCache iPCache = mInstance;
        MethodCollector.m26664o(12729);
        return iPCache;
    }

    public void setCurNetExtraInfo(String str) {
        mNetExtraInfo = str;
    }

    public void setCurNetType(int i) {
        mNetType = i;
    }

    public TTUploadDNSInfo get(String str) {
        TTUploadDNSInfo tTUploadDNSInfo;
        this.lock.lock();
        try {
            ConcurrentHashMap<String, TTUploadDNSInfo> concurrentHashMap = this.mDNSRecord;
            if (concurrentHashMap != null) {
                tTUploadDNSInfo = concurrentHashMap.get(str);
            } else {
                tTUploadDNSInfo = null;
            }
            return tTUploadDNSInfo;
        } finally {
            this.lock.unlock();
        }
    }

    public void put(String str, TTUploadDNSInfo tTUploadDNSInfo) {
        this.lock.lock();
        try {
            ConcurrentHashMap<String, TTUploadDNSInfo> concurrentHashMap = this.mDNSRecord;
            if (concurrentHashMap != null) {
                concurrentHashMap.put(str, tTUploadDNSInfo);
            }
        } finally {
            this.lock.unlock();
        }
    }
}
