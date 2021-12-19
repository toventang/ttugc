package com.p2082ss.mediakit.net;

import android.os.Handler;
import android.text.TextUtils;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.mediakit.medialoader.AVMDLLog;
import java.lang.ref.WeakReference;
import java.net.InetAddress;
import java.util.concurrent.Future;

/* renamed from: com.ss.mediakit.net.LocalDNSHosts */
public class LocalDNSHosts {
    public InetAddress[] mAddress;
    protected boolean mCancelled;
    private Future mFuture;
    protected Handler mHandler;
    public String[] mHosts;
    public String mId;
    protected AVMDLNetClient mNetClient;
    public boolean mRet;

    static {
        Covode.recordClassIndex(101258);
    }

    public boolean isRunning() {
        return this.mRet;
    }

    public void close() {
        Future future = this.mFuture;
        if (future != null) {
            future.cancel(true);
            this.mFuture = null;
        }
    }

    public void cancel() {
        if (!this.mCancelled) {
            this.mCancelled = true;
            Future future = this.mFuture;
            if (future != null) {
                future.cancel(true);
                this.mFuture = null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.mediakit.net.LocalDNSHosts$MyRunnable */
    public static class MyRunnable implements Runnable {
        private final WeakReference<LocalDNSHosts> mLocalDNSRef;

        static {
            Covode.recordClassIndex(101260);
        }

        public void run() {
            AVMDLLog.m147905d("BatchParseLocalDNSHosts", C1764a.m5928a("----implement delayed check for local dns", new Object[0]));
            LocalDNSHosts localDNSHosts = this.mLocalDNSRef.get();
            if (localDNSHosts == null) {
                AVMDLLog.m147905d("BatchParseLocalDNSHosts", C1764a.m5928a("****end implement delayed check for local dns, dns object null", new Object[0]));
            } else if (!localDNSHosts.mRet) {
                localDNSHosts.cancel();
                AVMDLLog.m147905d("BatchParseLocalDNSHosts", C1764a.m5928a("****end implement delayed check cancel local dns,", new Object[0]));
            }
        }

        public MyRunnable(LocalDNSHosts localDNSHosts) {
            this.mLocalDNSRef = new WeakReference<>(localDNSHosts);
        }
    }

    public void start() {
        try {
            this.mFuture = AVMDLThreadPool.addExecuteTask(new Runnable() {
                /* class com.p2082ss.mediakit.net.LocalDNSHosts.RunnableC861221 */

                static {
                    Covode.recordClassIndex(101259);
                }

                public void run() {
                    int i;
                    AVMDLLog.m147905d("BatchParseLocalDNSHosts", "----call local dns batch parse");
                    for (int i2 = 0; i2 < LocalDNSHosts.this.mHosts.length; i2++) {
                        if (!TextUtils.isEmpty(LocalDNSHosts.this.mHosts[i2])) {
                            try {
                                LocalDNSHosts localDNSHosts = LocalDNSHosts.this;
                                localDNSHosts.mAddress = InetAddress.getAllByName(localDNSHosts.mHosts[i2]);
                                String str = "";
                                for (int i3 = 0; i3 < LocalDNSHosts.this.mAddress.length; i3++) {
                                    String hostAddress = LocalDNSHosts.this.mAddress[i3].getHostAddress();
                                    if (!TextUtils.isEmpty(hostAddress)) {
                                        str = TextUtils.isEmpty(str) ? str + hostAddress : str + "," + hostAddress;
                                    }
                                }
                                AVMDLLog.m147905d("BatchParseLocalDNSHosts", C1764a.m5928a("host:%s pasrse suc result:%s", new Object[]{LocalDNSHosts.this.mHosts[i2], str}));
                                if (!TextUtils.isEmpty(str)) {
                                    AVMDLLog.m147905d("BatchParseLocalDNSHosts", C1764a.m5928a("****default expiredtime:%d force expiredtime:%d ", new Object[]{Integer.valueOf(AVMDLDNSParser.mGlobalDefaultExpiredTime), Integer.valueOf(AVMDLDNSParser.mGlobalForceExpiredTime)}));
                                    if (AVMDLDNSParser.mGlobalForceExpiredTime > 0) {
                                        i = AVMDLDNSParser.mGlobalForceExpiredTime;
                                    } else {
                                        i = AVMDLDNSParser.mGlobalDefaultExpiredTime;
                                    }
                                    IPCache.getInstance().put(LocalDNSHosts.this.mHosts[i2], new AVMDLDNSInfo(0, LocalDNSHosts.this.mHosts[i2], str, ((long) (i * 1000)) + System.currentTimeMillis(), LocalDNSHosts.this.mId));
                                }
                            } catch (Throwable th) {
                                AVMDLLog.m147905d("BatchParseLocalDNSHosts", C1764a.m5928a("host:%s pasrse err:%s", new Object[]{LocalDNSHosts.this.mHosts[i2], th.getMessage()}));
                            }
                        }
                    }
                    LocalDNSHosts.this.mRet = true;
                    AVMDLLog.m147905d("BatchParseLocalDNSHosts", "****end call local dns batch parse");
                }
            });
        } catch (Exception e) {
            AVMDLLog.m147905d("BatchParseLocalDNSHosts", C1764a.m5928a("****end call local dns, exception:%s", new Object[]{e}));
        }
        this.mHandler.postDelayed(new MyRunnable(this), 10000);
    }

    public LocalDNSHosts(String[] strArr, Handler handler) {
        this.mHosts = strArr;
        this.mHandler = handler;
    }
}
