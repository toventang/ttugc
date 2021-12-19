package com.p2082ss.mediakit.net;

import android.text.TextUtils;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.mediakit.medialoader.AVMDLLog;
import java.util.Locale;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.ss.mediakit.net.AVMDLDNSParserBridge */
public class AVMDLDNSParserBridge implements AVMDLDNSParserListener {
    private static boolean v2Usable = true;
    private long handle = 0;
    public String host;
    String ipList;
    boolean isFinish;
    private Lock lock = new ReentrantLock();

    private static native void _notifyParserResult(long j, String str, String str2, long j2, String str3);

    private static native void _notifyParserResultV2(long j, String str, String str2, long j2, String str3, int i);

    /* access modifiers changed from: package-private */
    public boolean isFinish() {
        return this.isFinish;
    }

    static {
        Covode.recordClassIndex(101224);
    }

    /* JADX INFO: finally extract failed */
    public String getResult() {
        this.lock.lock();
        try {
            String str = this.ipList;
            this.lock.unlock();
            AVMDLLog.m147905d("AVMDLDNSParserBridge", "****get result:".concat(String.valueOf(str)));
            return str;
        } catch (Throwable th) {
            this.lock.unlock();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    public void release() {
        AVMDLLog.m147905d("AVMDLDNSParserBridge", C1764a.m5928a("----start release:%s", new Object[]{this}));
        this.lock.lock();
        try {
            this.handle = 0;
            this.lock.unlock();
            AVMDLLog.m147905d("AVMDLDNSParserBridge", C1764a.m5928a("remove host:%s", new Object[]{this.host}));
            AVMDLDNSParser.getInstance().removeHost(this.host, this);
            AVMDLLog.m147905d("AVMDLDNSParserBridge", C1764a.m5928a("****end call release:%s", new Object[]{this}));
        } catch (Throwable th) {
            this.lock.unlock();
            throw th;
        }
    }

    public String getBackUp(String str) {
        String str2;
        AVMDLDNSInfo backUpIp;
        if (AVMDLDNSParser.getIntValue(5) != 1 || (backUpIp = IPCache.getInstance().getBackUpIp(str)) == null) {
            str2 = null;
        } else {
            str2 = backUpIp.mIpList;
        }
        AVMDLLog.m147905d("AVMDLDNSParserBridge", "****get backup ip result:".concat(String.valueOf(str2)));
        return str2;
    }

    public int start(long j, String str) {
        int parserResult;
        if (!v2Usable || (parserResult = parserResult(j, str, 2)) <= 0) {
            return parserResult(j, str, 1);
        }
        return parserResult;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00f8 A[Catch:{ all -> 0x0136 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0130  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int parserResult(long r23, java.lang.String r25, int r26) {
        /*
        // Method dump skipped, instructions count: 320
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.mediakit.net.AVMDLDNSParserBridge.parserResult(long, java.lang.String, int):int");
    }

    @Override // com.p2082ss.mediakit.net.AVMDLDNSParserListener
    public void onCompletion(int i, String str, String str2, long j, String str3, int i2) {
        if (!this.isFinish && v2Usable) {
            parserResult(i, str, str2, j, str3, i2, 2);
        }
        if (!this.isFinish) {
            parserResult(i, str, str2, j, str3, i2, 1);
        }
    }

    private void parserResult(int i, String str, String str2, long j, String str3, int i2, int i3) {
        String str4;
        String str5 = str2;
        int i4 = i2;
        long j2 = j;
        MethodCollector.m26663i(11901);
        this.lock.lock();
        try {
            if (!this.isFinish) {
                Locale locale = Locale.ENGLISH;
                Object[] objArr = new Object[3];
                objArr[0] = Integer.valueOf(i);
                if (TextUtils.isEmpty(str5)) {
                    str4 = "null";
                } else {
                    str4 = str5;
                }
                objArr[1] = str4;
                objArr[2] = Integer.valueOf(i4);
                AVMDLLog.m147905d("AVMDLDNSParserBridge", C1764a.m5929a(locale, "receive completion code:%d result:%s type:%d", objArr));
                if (TextUtils.isEmpty(str5) && AVMDLDNSParser.getIntValue(5) == 1) {
                    AVMDLLog.m147905d("AVMDLDNSParserBridge", "pare result is null, try get backupip");
                    AVMDLDNSInfo backUpIp = IPCache.getInstance().getBackUpIp(str);
                    if (backUpIp != null) {
                        str5 = backUpIp.mIpList;
                        i4 = backUpIp.mType;
                        AVMDLLog.m147905d("AVMDLDNSParserBridge", C1764a.m5929a(Locale.ENGLISH, "get backup ip, result:%s type:%d", new Object[]{str5, Integer.valueOf(i4)}));
                        j2 = 0;
                    }
                }
                this.ipList = str5;
                this.isFinish = true;
                long j3 = this.handle;
                if (j3 != 0) {
                    if (i3 == 2) {
                        v2Usable = true;
                        _notifyParserResultV2(j3, str, str5, j2, str3, i4);
                    } else {
                        v2Usable = false;
                        _notifyParserResult(j3, str, str5, j2, str3);
                    }
                }
            } else {
                AVMDLLog.m147905d("AVMDLDNSParserBridge", C1764a.m5929a(Locale.ENGLISH, "has finished not nedd cur completion code:%d result:%s expiredTime:%d", new Object[]{Integer.valueOf(i), str5, Long.valueOf(j2)}));
            }
        } catch (UnsatisfiedLinkError e) {
            AVMDLLog.m147905d("AVMDLDNSParserBridge", e.toString());
            if (v2Usable) {
                v2Usable = false;
            }
            this.isFinish = false;
        } catch (Throwable th) {
            this.lock.unlock();
            MethodCollector.m26664o(11901);
            throw th;
        }
        this.lock.unlock();
        MethodCollector.m26664o(11901);
    }
}
