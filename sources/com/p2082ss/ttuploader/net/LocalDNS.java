package com.p2082ss.ttuploader.net;

import android.os.Handler;
import android.text.TextUtils;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.ttuploader.TTUploadLog;
import java.lang.ref.WeakReference;
import java.net.InetAddress;
import java.util.concurrent.Future;

/* renamed from: com.ss.ttuploader.net.LocalDNS */
public class LocalDNS extends BaseDNS {
    public InetAddress[] mAddress;
    private Future mFuture;
    public boolean mRet;

    static {
        Covode.recordClassIndex(101509);
    }

    @Override // com.p2082ss.ttuploader.net.BaseDNS
    public boolean isRunning() {
        return this.mRet;
    }

    @Override // com.p2082ss.ttuploader.net.BaseDNS
    public void close() {
        super.close();
        Future future = this.mFuture;
        if (future != null) {
            future.cancel(true);
            this.mFuture = null;
        }
    }

    @Override // com.p2082ss.ttuploader.net.BaseDNS
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

    @Override // com.p2082ss.ttuploader.net.BaseDNS
    public void start() {
        try {
            this.mFuture = TTUploadThreadPool.addExecuteTask(new Runnable() {
                /* class com.p2082ss.ttuploader.net.LocalDNS.RunnableC862941 */

                static {
                    Covode.recordClassIndex(101510);
                }

                public void run() {
                    TTUploadLog.m148564d("LocalDNS", C1764a.m5928a("----call local dns, host:%s", new Object[]{LocalDNS.this.mHostname}));
                    try {
                        LocalDNS localDNS = LocalDNS.this;
                        localDNS.mAddress = InetAddress.getAllByName(localDNS.mHostname);
                        LocalDNS.this.mRet = true;
                        if (LocalDNS.this.mAddress == null) {
                            TTUploadLog.m148564d("LocalDNS", C1764a.m5928a("****end call local dns, not get address host:%s", new Object[]{LocalDNS.this.mHostname}));
                            LocalDNS.this.notifyError(new TTUploadDNSInfo(0, LocalDNS.this.mHostname, null, 0, LocalDNS.this.mId));
                            return;
                        }
                        String str = "";
                        for (int i = 0; i < LocalDNS.this.mAddress.length; i++) {
                            String hostAddress = LocalDNS.this.mAddress[i].getHostAddress();
                            if (!TextUtils.isEmpty(hostAddress)) {
                                str = TextUtils.isEmpty(str) ? str + hostAddress : str + "," + hostAddress;
                            }
                        }
                        if (TextUtils.isEmpty(str)) {
                            TTUploadLog.m148564d("LocalDNS", C1764a.m5928a("****end call local dns, iplist null host:%s", new Object[]{LocalDNS.this.mHostname}));
                            LocalDNS.this.notifyError(new TTUploadDNSInfo(0, LocalDNS.this.mHostname, null, 0, LocalDNS.this.mId));
                            return;
                        }
                        TTUploadLog.m148564d("LocalDNS", C1764a.m5928a("****end call local dns, suc iplist:%s host:%s", new Object[]{str, LocalDNS.this.mHostname}));
                        TTUploadDNSInfo tTUploadDNSInfo = new TTUploadDNSInfo(0, LocalDNS.this.mHostname, str, System.currentTimeMillis() + ((long) (TTUploadDNSParser.mGlobalDefaultExpiredTime * 1000)), LocalDNS.this.mId);
                        IPCache.getInstance().put(LocalDNS.this.mHostname, tTUploadDNSInfo);
                        LocalDNS.this.notifySuccess(tTUploadDNSInfo);
                    } catch (Throwable th) {
                        LocalDNS.this.mRet = true;
                        TTUploadLog.m148564d("LocalDNS", C1764a.m5928a("****end call local dns, end exception:%s host:%s", new Object[]{th, LocalDNS.this.mHostname}));
                        LocalDNS.this.notifyError(new TTUploadDNSInfo(0, LocalDNS.this.mHostname, null, 0, LocalDNS.this.mId));
                    }
                }
            });
        } catch (Exception e) {
            TTUploadLog.m148564d("LocalDNS", C1764a.m5928a("****end call local dns, exception:%s host:%s", new Object[]{e, this.mHostname}));
            notifyError(new TTUploadDNSInfo(0, this.mHostname, null, 0, this.mId));
        }
        this.mHandler.postDelayed(new MyRunnable(this), 10000);
    }

    /* renamed from: com.ss.ttuploader.net.LocalDNS$MyRunnable */
    static class MyRunnable implements Runnable {
        private final WeakReference<LocalDNS> mLocalDNSRef;

        static {
            Covode.recordClassIndex(101511);
        }

        public void run() {
            TTUploadLog.m148564d("LocalDNS", C1764a.m5928a("----implement delayed check for local dns", new Object[0]));
            LocalDNS localDNS = this.mLocalDNSRef.get();
            if (localDNS == null) {
                TTUploadLog.m148564d("LocalDNS", C1764a.m5928a("****end implement delayed check for local dns, dns object null", new Object[0]));
            } else if (!localDNS.mRet) {
                localDNS.cancel();
                TTUploadLog.m148564d("LocalDNS", C1764a.m5928a("****end implement delayed check cancel local dns,", new Object[0]));
                localDNS.notifyError(new TTUploadDNSInfo(0, localDNS.mHostname, null, 0, localDNS.mId));
            }
        }

        public MyRunnable(LocalDNS localDNS) {
            this.mLocalDNSRef = new WeakReference<>(localDNS);
        }
    }

    public LocalDNS(String str, Handler handler) {
        super(str, handler);
    }
}
