package com.p2082ss.bduploader.net;

import android.text.TextUtils;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.bduploader.BDUploadLog;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.ss.bduploader.net.BDUploadDNSParserBridge */
public class BDUploadDNSParserBridge implements BDUploadDNSParserListener {
    private long handle = 0;
    public String host;
    String ipList;
    boolean isFinish;
    private Lock lock = new ReentrantLock();

    static {
        Covode.recordClassIndex(100821);
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
            BDUploadDNSParser.getInstance().removeHost(this.host, this);
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
            BDUploadLog.m147836d("BDUploadDNSParserBridge", "****get result:".concat(String.valueOf(str)));
            return str;
        } catch (Throwable th) {
            this.lock.unlock();
            throw th;
        }
    }

    public int start(long j, String str) {
        MethodCollector.m26663i(6043);
        BDUploadLog.m147836d("BDUploadDNSParserBridge", "----start parse host:".concat(String.valueOf(str)));
        if (TextUtils.isEmpty(str)) {
            BDUploadLog.m147836d("BDUploadDNSParserBridge", "****end parse fail for host:".concat(String.valueOf(str)));
            MethodCollector.m26664o(6043);
            return -1;
        }
        this.lock.lock();
        this.handle = j;
        try {
            this.host = str;
            BDUploadDNSInfo bDUploadDNSInfo = IPCache.getInstance().get(str);
            int i = 1;
            if (bDUploadDNSInfo != null) {
                this.ipList = bDUploadDNSInfo.mIpList;
                long currentTimeMillis = System.currentTimeMillis();
                BDUploadLog.m147836d("BDUploadDNSParserBridge", C1764a.m5928a("get result from cache expiredT:%d curT:%d ", new Object[]{Long.valueOf(bDUploadDNSInfo.mExpiredTime), Long.valueOf(currentTimeMillis)}));
                if (bDUploadDNSInfo.mExpiredTime <= currentTimeMillis) {
                    BDUploadLog.m147836d("BDUploadDNSParserBridge", C1764a.m5928a("has expired try call parse:", new Object[0]));
                    BDUploadDNSParser.getInstance().addHost(str, null);
                }
                long j2 = this.handle;
                if (j2 != 0) {
                    _notifyParserResult(j2, str, this.ipList, bDUploadDNSInfo.mExpiredTime, null);
                }
            } else {
                BDUploadLog.m147836d("BDUploadDNSParserBridge", "****add host to parser");
                BDUploadDNSParser.getInstance().addHost(str, this);
                i = 0;
            }
            return i;
        } finally {
            this.lock.unlock();
            MethodCollector.m26664o(6043);
        }
    }

    @Override // com.p2082ss.bduploader.net.BDUploadDNSParserListener
    public void onCompletion(int i, String str, String str2, long j, String str3) {
        MethodCollector.m26663i(6200);
        this.lock.lock();
        try {
            if (!this.isFinish) {
                BDUploadLog.m147836d("BDUploadDNSParserBridge", C1764a.m5928a("receive completion code:%d result:%s", new Object[]{Integer.valueOf(i), str2}));
                this.ipList = str2;
                this.isFinish = true;
                long j2 = this.handle;
                if (j2 != 0) {
                    _notifyParserResult(j2, str, str2, j, str3);
                }
            } else {
                BDUploadLog.m147836d("BDUploadDNSParserBridge", C1764a.m5928a("has finished not nedd cur completion code:%d result:%s expiredTime:%lld", new Object[]{Integer.valueOf(i), str2, Long.valueOf(j)}));
            }
        } finally {
            this.lock.unlock();
            MethodCollector.m26664o(6200);
        }
    }
}
