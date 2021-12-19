package com.p2082ss.bduploader;

import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.bduploader.net.BDUploadDNSInfo;
import com.p2082ss.bduploader.net.BDUploadDNSParser;
import com.p2082ss.bduploader.net.BDUploadDNSParserListener;
import com.p2082ss.bduploader.net.BDUploadThreadPool;
import com.p2082ss.bduploader.net.HTTPDNS;
import com.p2082ss.bduploader.net.IPCache;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.regex.Pattern;

/* renamed from: com.ss.bduploader.BDUploadResolver */
public class BDUploadResolver implements BDUploadDNSParserListener {
    public static int HOST_MAX_CACHE_TIME = 60000;
    private static final Hashtable<String, HostInfo> mCacheHosts = new Hashtable<>();
    public static volatile int mDNSVersion = 1;
    private static int mEnableThreadPool = 0;
    public static volatile int mIsUseTTnetDNS;
    public String mError;
    private Future mFuture;
    private HostInfo mHostInfo;
    private volatile String mHostName;
    public volatile String[] mIPStr;
    public volatile boolean mRet;
    private Thread mThread;
    private int mUseDNSType = mDNSVersion;

    private native void _notifyParserResult(String str, String str2, long j, String str3);

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.bduploader.BDUploadResolver$HostInfo */
    public static class HostInfo {

        /* renamed from: ip */
        public String f192011ip;
        public long time;

        static {
            Covode.recordClassIndex(100800);
        }

        HostInfo() {
        }
    }

    static {
        Covode.recordClassIndex(100799);
    }

    public String getAddress() {
        if (!this.mRet || this.mIPStr == null || this.mIPStr[0] == null) {
            return null;
        }
        return this.mIPStr[0];
    }

    public int isSuccess() {
        if (!this.mRet) {
            return 0;
        }
        if (this.mIPStr == null || this.mIPStr[0] == null) {
            return -1;
        }
        return 1;
    }

    public void freeAddress() {
        if (this.mUseDNSType == 1) {
            Future future = this.mFuture;
            if (future != null) {
                try {
                    future.cancel(true);
                    this.mFuture = null;
                    BDUploadLog.m147836d("BDUploadResolver", "----cancel parser thread");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            Thread thread = this.mThread;
            if (thread != null) {
                try {
                    thread.interrupt();
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
        if (this.mUseDNSType == 2) {
            try {
                BDUploadDNSParser.getInstance().removeHost(this.mHostName, this);
            } catch (Exception e3) {
                e3.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.bduploader.BDUploadResolver$ParserHost */
    public static class ParserHost implements Runnable {
        String mHostName;
        BDUploadResolver mResolver;

        static {
            Covode.recordClassIndex(100801);
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x0034  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r5 = this;
                int r0 = com.p2082ss.bduploader.BDUploadResolver.mIsUseTTnetDNS
                r4 = 1
                r2 = 0
                r3 = 0
                if (r0 != r4) goto L_0x001f
                java.lang.String r0 = r5.mHostName     // Catch:{ all -> 0x001e }
                java.util.List r1 = com.bytedance.ttnet.TTNetInit.dnsLookup(r0)     // Catch:{ all -> 0x001e }
                if (r1 == 0) goto L_0x001f
                java.lang.Object r0 = r1.get(r2)     // Catch:{ all -> 0x001e }
                if (r0 == 0) goto L_0x001f
                java.lang.Object r0 = r1.get(r2)     // Catch:{ all -> 0x001e }
                java.net.InetAddress r0 = (java.net.InetAddress) r0     // Catch:{ all -> 0x001e }
                r3 = r0
                r0 = 1
                goto L_0x0032
            L_0x001e:
                r0 = 0
            L_0x001f:
                java.lang.String r0 = r5.mHostName     // Catch:{ UnknownHostException -> 0x0026 }
                java.net.InetAddress r3 = java.net.InetAddress.getByName(r0)     // Catch:{ UnknownHostException -> 0x0026 }
                goto L_0x0032
            L_0x0026:
                r0 = move-exception
                r0.printStackTrace()
                com.ss.bduploader.BDUploadResolver r1 = r5.mResolver
                java.lang.String r0 = r0.getMessage()
                r1.mError = r0
            L_0x0032:
                if (r3 == 0) goto L_0x005c
                java.lang.String r3 = r3.getHostAddress()
                com.ss.bduploader.BDUploadResolver r1 = r5.mResolver
                java.lang.String[] r0 = new java.lang.String[r4]
                r1.mIPStr = r0
                com.ss.bduploader.BDUploadResolver r0 = r5.mResolver
                java.lang.String[] r0 = r0.mIPStr
                r0[r2] = r3
                com.ss.bduploader.BDUploadResolver$HostInfo r2 = new com.ss.bduploader.BDUploadResolver$HostInfo
                r2.<init>()
                long r0 = java.lang.System.currentTimeMillis()
                r2.time = r0
                r2.f192011ip = r3
                java.lang.String r0 = r5.mHostName
                com.p2082ss.bduploader.BDUploadResolver.putHostInfo(r0, r2)
                long r0 = java.lang.System.currentTimeMillis()
                r2.time = r0
            L_0x005c:
                com.ss.bduploader.BDUploadResolver r0 = r5.mResolver
                r0.mRet = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.bduploader.BDUploadResolver.ParserHost.run():void");
        }

        public ParserHost(BDUploadResolver bDUploadResolver, String str) {
            this.mResolver = bDUploadResolver;
            this.mHostName = str;
        }
    }

    public static void setEnableDNSParserThreadPool(int i) {
        mEnableThreadPool = i;
    }

    public static void setEnableTTNetDNS(int i) {
        mIsUseTTnetDNS = i;
    }

    public void getAddressInfo(String str) {
        int i = this.mUseDNSType;
        if (i == 1) {
            getAddressInfoVersion_1(str);
        } else if (i != 2) {
            getAddressInfoVersion_1(str);
        } else {
            getAddressInfoVersion_2(str);
        }
    }

    public static final boolean isIP(String str) {
        if (str.length() >= 7 && str.length() <= 15) {
            return Pattern.compile("([1-9]|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])(\\.(\\d|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])){3}").matcher(str).find();
        }
        if (str.charAt(0) == '[' && str.charAt(str.length() - 1) == ']') {
            return true;
        }
        return false;
    }

    private void getAddressInfoVersion_1(String str) {
        this.mHostName = str;
        if (str == null || str.length() <= 0 || "".equals(str)) {
            this.mRet = true;
        } else if (isIP(this.mHostName)) {
            this.mIPStr = new String[1];
            this.mIPStr[0] = this.mHostName;
            this.mRet = true;
        } else {
            Hashtable<String, HostInfo> hashtable = mCacheHosts;
            HostInfo hostInfo = hashtable.get(str);
            this.mHostInfo = hostInfo;
            if (hostInfo != null) {
                if (hostInfo.f192011ip == null || System.currentTimeMillis() - this.mHostInfo.time >= ((long) HOST_MAX_CACHE_TIME)) {
                    hashtable.remove(str);
                    this.mHostInfo = null;
                } else {
                    this.mIPStr = new String[1];
                    this.mIPStr[0] = this.mHostInfo.f192011ip;
                    this.mRet = true;
                    return;
                }
            }
            try {
                if (mEnableThreadPool > 0) {
                    BDUploadLog.m147836d("BDUploadResolver", "----enable dns parser thread pool");
                    this.mFuture = BDUploadThreadPool.addExecuteTask(new ParserHost(this, this.mHostName));
                    return;
                }
                BDUploadLog.m147836d("BDUploadResolver", "----disable dns parser thread pool");
                Thread thread = new Thread(new ParserHost(this, this.mHostName));
                this.mThread = thread;
                thread.start();
            } catch (Exception e) {
                this.mRet = true;
                this.mError = e.getMessage();
            }
        }
    }

    private void getAddressInfoVersion_2(String str) {
        BDUploadLog.m147836d("BDUploadResolver", "----add host to parser");
        this.mHostName = str;
        BDUploadDNSInfo bDUploadDNSInfo = IPCache.getInstance().get(str);
        if (!(bDUploadDNSInfo == null || bDUploadDNSInfo.mIpList == null)) {
            long currentTimeMillis = System.currentTimeMillis();
            BDUploadLog.m147836d("BDUploadResolver", C1764a.m5928a("get result from cache expiredT:%d curT:%d ", new Object[]{Long.valueOf(bDUploadDNSInfo.mExpiredTime), Long.valueOf(currentTimeMillis)}));
            if (bDUploadDNSInfo.mExpiredTime <= currentTimeMillis) {
                BDUploadLog.m147836d("BDUploadResolver", C1764a.m5928a("has expired try call parse:", new Object[0]));
                BDUploadDNSParser.getInstance().addHost(str, null);
            }
            String[] split = bDUploadDNSInfo.mIpList.split(",");
            if (split != null && split.length > 0) {
                this.mIPStr = new String[1];
                this.mIPStr[0] = split[0];
                this.mRet = true;
                BDUploadLog.m147836d("BDUploadResolver", C1764a.m5928a("get result from cache suc, ip:%s ", new Object[]{split[0]}));
            }
        }
        if (!this.mRet) {
            BDUploadLog.m147836d("BDUploadResolver", "****add host to parser");
            BDUploadDNSParser.getInstance().addHost(str, this);
        }
    }

    public static void setDNSServer(String str, String str2) {
        HTTPDNS.setDNSServerHost(str, str2);
    }

    static synchronized void putHostInfo(String str, HostInfo hostInfo) {
        synchronized (BDUploadResolver.class) {
            MethodCollector.m26663i(7305);
            long currentTimeMillis = System.currentTimeMillis();
            Hashtable<String, HostInfo> hashtable = mCacheHosts;
            String str2 = null;
            if (hashtable.size() > 128) {
                Iterator<Map.Entry<String, HostInfo>> it = hashtable.entrySet().iterator();
                HostInfo hostInfo2 = null;
                while (it.hasNext()) {
                    HostInfo value = it.next().getValue();
                    str2 = it.next().getKey();
                    if (value != null && value.time < currentTimeMillis) {
                        currentTimeMillis = value.time;
                        hostInfo2 = value;
                    }
                }
                if (!(hostInfo2 == null || str2 == null)) {
                    mCacheHosts.remove(str2);
                }
            }
            mCacheHosts.put(str, hostInfo);
            MethodCollector.m26664o(7305);
        }
    }

    public static void setDNSType(int i, int i2, int i3, int i4, int i5) {
        if (i == 1 || i == 2) {
            BDUploadDNSParser.setIntValue(0, i2);
            BDUploadDNSParser.setIntValue(1, i3);
            BDUploadDNSParser.setIntValue(3, i4);
            BDUploadDNSParser.setIntValue(2, i5);
            mDNSVersion = i;
        }
    }

    @Override // com.p2082ss.bduploader.net.BDUploadDNSParserListener
    public void onCompletion(int i, String str, String str2, long j, String str3) {
        String[] split;
        BDUploadLog.m147836d("BDUploadResolver", C1764a.m5928a("notify result host:%s iplist:%s ", new Object[]{str, str2}));
        if (!this.mRet) {
            if (!(str2 == null || str == null || !str.equals(this.mHostName) || (split = str2.split(",")) == null || split.length <= 0)) {
                this.mIPStr = new String[1];
                this.mIPStr[0] = split[0];
            }
            this.mRet = true;
        }
    }
}
