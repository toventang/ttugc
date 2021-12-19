package com.p2082ss.mediakit.net;

import android.net.Network;
import android.os.Handler;
import android.text.TextUtils;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.mediakit.medialoader.AVMDLLog;
import java.lang.ref.WeakReference;
import java.net.InetAddress;
import java.util.concurrent.Future;

/* renamed from: com.ss.mediakit.net.LocalDNS */
public class LocalDNS extends BaseDNS {
    public InetAddress[] mAddress;
    private Future mFuture;
    public boolean mRet;

    static {
        Covode.recordClassIndex(101255);
    }

    @Override // com.p2082ss.mediakit.net.BaseDNS
    public boolean isRunning() {
        return this.mRet;
    }

    @Override // com.p2082ss.mediakit.net.BaseDNS
    public void close() {
        super.close();
        Future future = this.mFuture;
        if (future != null) {
            future.cancel(true);
            this.mFuture = null;
        }
    }

    @Override // com.p2082ss.mediakit.net.BaseDNS
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

    @Override // com.p2082ss.mediakit.net.BaseDNS
    public void start() {
        try {
            this.mFuture = AVMDLThreadPool.addExecuteTask(new Runnable() {
                /* class com.p2082ss.mediakit.net.LocalDNS.RunnableC861211 */

                static {
                    Covode.recordClassIndex(101256);
                }

                public void run() {
                    int i;
                    AVMDLLog.m147905d("LocalDNS", C1764a.m5928a("----call local dns, host:%s", new Object[]{LocalDNS.this.mHostname}));
                    try {
                        Network curNetwork = AVMDLMultiNetwork.getCurNetwork();
                        if (curNetwork != null) {
                            AVMDLLog.m147905d("LocalDNS", C1764a.m5928a("do local by cellular network", new Object[0]));
                            LocalDNS localDNS = LocalDNS.this;
                            localDNS.mAddress = curNetwork.getAllByName(localDNS.mHostname);
                        } else {
                            AVMDLLog.m147905d("LocalDNS", C1764a.m5928a("do local by default network", new Object[0]));
                            LocalDNS localDNS2 = LocalDNS.this;
                            localDNS2.mAddress = InetAddress.getAllByName(localDNS2.mHostname);
                        }
                        LocalDNS.this.mRet = true;
                        if (LocalDNS.this.mAddress == null) {
                            AVMDLLog.m147905d("LocalDNS", C1764a.m5928a("****end call local dns, not get address host:%s", new Object[]{LocalDNS.this.mHostname}));
                            LocalDNS.this.notifyError(new AVMDLDNSInfo(0, LocalDNS.this.mHostname, (String) null, 0, LocalDNS.this.mId));
                            return;
                        }
                        String str = "";
                        for (int i2 = 0; i2 < LocalDNS.this.mAddress.length; i2++) {
                            String hostAddress = LocalDNS.this.mAddress[i2].getHostAddress();
                            if (!TextUtils.isEmpty(hostAddress)) {
                                str = TextUtils.isEmpty(str) ? str + hostAddress : str + "," + hostAddress;
                            }
                        }
                        if (TextUtils.isEmpty(str)) {
                            AVMDLLog.m147905d("LocalDNS", C1764a.m5928a("****end call local dns, iplist null host:%s", new Object[]{LocalDNS.this.mHostname}));
                            LocalDNS.this.notifyError(new AVMDLDNSInfo(0, LocalDNS.this.mHostname, (String) null, 0, LocalDNS.this.mId));
                            return;
                        }
                        AVMDLLog.m147905d("LocalDNS", C1764a.m5928a("****default expiredtime:%d force expiredtime:%d ", new Object[]{Integer.valueOf(AVMDLDNSParser.mGlobalDefaultExpiredTime), Integer.valueOf(AVMDLDNSParser.mGlobalForceExpiredTime)}));
                        if (AVMDLDNSParser.mGlobalForceExpiredTime > 0) {
                            i = AVMDLDNSParser.mGlobalForceExpiredTime;
                        } else {
                            i = AVMDLDNSParser.mGlobalDefaultExpiredTime;
                        }
                        AVMDLDNSInfo aVMDLDNSInfo = new AVMDLDNSInfo(0, LocalDNS.this.mHostname, str, ((long) (i * 1000)) + System.currentTimeMillis(), LocalDNS.this.mId);
                        IPCache.getInstance().put(LocalDNS.this.mHostname, aVMDLDNSInfo);
                        LocalDNS.this.notifySuccess(aVMDLDNSInfo);
                        AVMDLLog.m147905d("LocalDNS", C1764a.m5928a("****end call local dns, suc iplist:%s host:%s", new Object[]{str, LocalDNS.this.mHostname}));
                    } catch (Throwable th) {
                        LocalDNS.this.mRet = true;
                        AVMDLLog.m147905d("LocalDNS", C1764a.m5928a("****end call local dns, end exception:%s host:%s", new Object[]{th, LocalDNS.this.mHostname}));
                        LocalDNS.this.notifyError(new AVMDLDNSInfo(0, LocalDNS.this.mHostname, (String) null, 0, LocalDNS.this.mId));
                    }
                }
            });
        } catch (Exception e) {
            AVMDLLog.m147905d("LocalDNS", C1764a.m5928a("****end call local dns, exception:%s host:%s", new Object[]{e, this.mHostname}));
            notifyError(new AVMDLDNSInfo(0, this.mHostname, (String) null, 0, this.mId));
        }
        this.mHandler.postDelayed(new MyRunnable(this), 10000);
    }

    /* renamed from: com.ss.mediakit.net.LocalDNS$MyRunnable */
    static class MyRunnable implements Runnable {
        private final WeakReference<LocalDNS> mLocalDNSRef;

        static {
            Covode.recordClassIndex(101257);
        }

        public void run() {
            AVMDLLog.m147905d("LocalDNS", C1764a.m5928a("----implement delayed check for local dns", new Object[0]));
            LocalDNS localDNS = this.mLocalDNSRef.get();
            if (localDNS == null) {
                AVMDLLog.m147905d("LocalDNS", C1764a.m5928a("****end implement delayed check for local dns, dns object null", new Object[0]));
            } else if (!localDNS.mRet) {
                localDNS.cancel();
                AVMDLLog.m147905d("LocalDNS", C1764a.m5928a("****end implement delayed check cancel local dns,", new Object[0]));
                localDNS.notifyError(new AVMDLDNSInfo(0, localDNS.mHostname, (String) null, 0, localDNS.mId));
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
