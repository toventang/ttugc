package com.p2082ss.ttuploader.net;

import android.text.TextUtils;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.ttuploader.TTUploadLog;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.ss.ttuploader.net.TTUploadDNSParserBridge */
public class TTUploadDNSParserBridge implements TTUploadDNSParserListener {
    private long handle = 0;
    public String host;
    String ipList;
    boolean isFinish;
    private Lock lock = new ReentrantLock();

    static {
        Covode.recordClassIndex(101519);
    }

    private static native void _notifyParserResult(long j, String str, String str2, long j2, String str3);

    /* access modifiers changed from: package-private */
    public boolean isFinish() {
        return this.isFinish;
    }

    public void release() {
        this.lock.lock();
        try {
            this.handle = 0;
            TTUploadDNSParser.getInstance().removeHost(this.host, this);
        } finally {
            this.lock.unlock();
        }
    }

    /* JADX INFO: finally extract failed */
    public String getResult() {
        this.lock.lock();
        try {
            String str = this.ipList;
            this.lock.unlock();
            TTUploadLog.m148564d("TTUploadDNSParserBridge", "****get result:".concat(String.valueOf(str)));
            return str;
        } catch (Throwable th) {
            this.lock.unlock();
            throw th;
        }
    }

    public int start(long j, String str) {
        MethodCollector.m26663i(12501);
        TTUploadLog.m148564d("TTUploadDNSParserBridge", "----start parse host:".concat(String.valueOf(str)));
        if (TextUtils.isEmpty(str)) {
            TTUploadLog.m148564d("TTUploadDNSParserBridge", "****end parse fail for host:".concat(String.valueOf(str)));
            MethodCollector.m26664o(12501);
            return -1;
        }
        this.lock.lock();
        this.handle = j;
        try {
            this.host = str;
            TTUploadDNSInfo tTUploadDNSInfo = IPCache.getInstance().get(str);
            int i = 1;
            if (tTUploadDNSInfo != null) {
                this.ipList = tTUploadDNSInfo.mIpList;
                long currentTimeMillis = System.currentTimeMillis();
                TTUploadLog.m148564d("TTUploadDNSParserBridge", C1764a.m5928a("get result from cache expiredT:%d curT:%d ", new Object[]{Long.valueOf(tTUploadDNSInfo.mExpiredTime), Long.valueOf(currentTimeMillis)}));
                if (tTUploadDNSInfo.mExpiredTime <= currentTimeMillis) {
                    TTUploadLog.m148564d("TTUploadDNSParserBridge", C1764a.m5928a("has expired try call parse:", new Object[0]));
                    TTUploadDNSParser.getInstance().addHost(str, null);
                }
                long j2 = this.handle;
                if (j2 != 0) {
                    _notifyParserResult(j2, str, this.ipList, tTUploadDNSInfo.mExpiredTime, null);
                }
            } else {
                TTUploadLog.m148564d("TTUploadDNSParserBridge", "****add host to parser");
                TTUploadDNSParser.getInstance().addHost(str, this);
                i = 0;
            }
            return i;
        } finally {
            this.lock.unlock();
            MethodCollector.m26664o(12501);
        }
    }

    @Override // com.p2082ss.ttuploader.net.TTUploadDNSParserListener
    public void onCompletion(int i, String str, String str2, long j, String str3) {
        MethodCollector.m26663i(12608);
        this.lock.lock();
        try {
            if (!this.isFinish) {
                TTUploadLog.m148564d("TTUploadDNSParserBridge", C1764a.m5928a("receive completion code:%d result:%s", new Object[]{Integer.valueOf(i), str2}));
                this.ipList = str2;
                this.isFinish = true;
                long j2 = this.handle;
                if (j2 != 0) {
                    _notifyParserResult(j2, str, str2, j, str3);
                }
            } else {
                TTUploadLog.m148564d("TTUploadDNSParserBridge", C1764a.m5928a("has finished not nedd cur completion code:%d result:%s expiredTime:%d", new Object[]{Integer.valueOf(i), str2, Long.valueOf(j)}));
            }
        } finally {
            this.lock.unlock();
            MethodCollector.m26664o(12608);
        }
    }
}
