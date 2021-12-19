package com.p2082ss.android.socialbase.downloader.downloader;

import android.database.sqlite.SQLiteException;
import android.os.Handler;
import android.text.TextUtils;
import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.socialbase.downloader.depend.AbstractC30369k;
import com.p2082ss.android.socialbase.downloader.depend.AbstractC30389w;
import com.p2082ss.android.socialbase.downloader.depend.IDownloadDepend;
import com.p2082ss.android.socialbase.downloader.depend.IDownloadListener;
import com.p2082ss.android.socialbase.downloader.exception.BaseException;
import com.p2082ss.android.socialbase.downloader.impls.AbstractC30474a;
import com.p2082ss.android.socialbase.downloader.impls.C30506r;
import com.p2082ss.android.socialbase.downloader.model.DownloadInfo;
import com.p2082ss.android.socialbase.downloader.model.DownloadTask;
import com.p2082ss.android.socialbase.downloader.p2179b.C30292f;
import com.p2082ss.android.socialbase.downloader.p2179b.EnumC30287a;
import com.p2082ss.android.socialbase.downloader.p2179b.EnumC30288b;
import com.p2082ss.android.socialbase.downloader.p2179b.EnumC30294h;
import com.p2082ss.android.socialbase.downloader.p2179b.EnumC30295i;
import com.p2082ss.android.socialbase.downloader.p2183f.C30439a;
import com.p2082ss.android.socialbase.downloader.p2187i.C30472a;
import com.p2082ss.android.socialbase.downloader.p2189k.C30531d;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.ss.android.socialbase.downloader.downloader.g */
public class C30411g {

    /* renamed from: a */
    public static final String f72498a = C30411g.class.getSimpleName();

    /* renamed from: b */
    public final boolean f72499b;

    /* renamed from: c */
    public DownloadInfo f72500c;

    /* renamed from: d */
    public final AbstractC30420l f72501d;

    /* renamed from: e */
    public volatile long f72502e;

    /* renamed from: f */
    public final AtomicLong f72503f = new AtomicLong();

    /* renamed from: g */
    public boolean f72504g = false;

    /* renamed from: h */
    public int f72505h;

    /* renamed from: i */
    public long f72506i;

    /* renamed from: j */
    private final Handler f72507j;

    /* renamed from: k */
    private DownloadTask f72508k;

    /* renamed from: l */
    private SparseArray<IDownloadListener> f72509l;

    /* renamed from: m */
    private SparseArray<IDownloadListener> f72510m;

    /* renamed from: n */
    private SparseArray<IDownloadListener> f72511n;

    /* renamed from: o */
    private boolean f72512o;

    /* renamed from: p */
    private IDownloadDepend f72513p;

    /* renamed from: q */
    private AbstractC30389w f72514q;

    /* renamed from: b */
    public final void mo54074b() {
        mo54069a(-4, (BaseException) null, true);
    }

    static {
        Covode.recordClassIndex(36930);
    }

    /* renamed from: a */
    public final void mo54067a() {
        if (!this.f72500c.canSkipStatusHandler()) {
            this.f72500c.setStatus(1);
            ExecutorService g = C30399c.m61721g();
            if (g != null) {
                g.execute(new Runnable() {
                    /* class com.p2082ss.android.socialbase.downloader.downloader.C30411g.RunnableC304121 */

                    static {
                        Covode.recordClassIndex(36931);
                    }

                    public final void run() {
                        C30411g.this.f72501d.mo53798i(C30411g.this.f72500c.getId());
                        C30411g.this.mo54069a(1, (BaseException) null, true);
                    }
                });
            }
        }
    }

    /* renamed from: g */
    private void m61772g() {
        DownloadTask downloadTask = this.f72508k;
        if (downloadTask != null) {
            this.f72500c = downloadTask.getDownloadInfo();
            this.f72509l = this.f72508k.getDownloadListeners(EnumC30294h.MAIN);
            this.f72511n = this.f72508k.getDownloadListeners(EnumC30294h.NOTIFICATION);
            this.f72510m = this.f72508k.getDownloadListeners(EnumC30294h.SUB);
            this.f72513p = this.f72508k.getDepend();
            this.f72514q = this.f72508k.getMonitorDepend();
        }
    }

    /* renamed from: c */
    public final void mo54075c() {
        this.f72500c.setStatus(-2);
        try {
            this.f72501d.mo53788d(this.f72500c.getId(), this.f72500c.getCurBytes());
        } catch (SQLiteException e) {
            e.printStackTrace();
        }
        mo54069a(-2, (BaseException) null, true);
    }

    /* renamed from: f */
    public final void mo54078f() {
        this.f72500c.setStatus(8);
        this.f72500c.setAsyncHandleStatus(EnumC30287a.ASYNC_HANDLE_WAITING);
        AbstractC30474a u = C30399c.m61737u();
        if (u != null) {
            u.mo54269a(this.f72500c.getId(), this.f72508k.getHashCodeForSameTask(), 8);
        }
    }

    /* renamed from: e */
    public final void mo54077e() {
        List<AbstractC30369k> downloadCompleteHandlers = this.f72508k.getDownloadCompleteHandlers();
        if (!downloadCompleteHandlers.isEmpty()) {
            DownloadInfo downloadInfo = this.f72500c;
            mo54069a(11, (BaseException) null, true);
            this.f72501d.mo53776a(downloadInfo);
            for (AbstractC30369k kVar : downloadCompleteHandlers) {
                try {
                    if (kVar.mo53923b(downloadInfo)) {
                        kVar.mo53922a(downloadInfo);
                        this.f72501d.mo53776a(downloadInfo);
                    }
                } catch (BaseException e) {
                    throw e;
                } catch (Throwable th) {
                    throw new BaseException(1071, th);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0175, code lost:
        r10 = new com.p2082ss.android.socialbase.downloader.p2181d.C30325a(r6.getTempPath(), r6.getTempName());
        r2 = new com.p2082ss.android.socialbase.downloader.p2181d.C30325a(r6.getSavePath(), r6.getName());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0199, code lost:
        if (r6.isForce() != false) goto L_0x0256;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x019f, code lost:
        if (com.p2082ss.android.socialbase.downloader.p2181d.C30326b.m61486a(r2) == false) goto L_0x0256;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x01a5, code lost:
        if (com.p2082ss.android.socialbase.downloader.p2189k.C30535g.m62565a(r6, r2) == false) goto L_0x0256;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x01a7, code lost:
        com.p2082ss.android.socialbase.downloader.p2182e.C30434a.m62027b(com.p2082ss.android.socialbase.downloader.p2189k.C30535g.f72839a, "targetFile exist");
        r11 = com.p2082ss.android.socialbase.downloader.p2189k.C30535g.m62534a(r2, r6.getMd5());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x01ba, code lost:
        if (com.p2082ss.android.socialbase.downloader.p2189k.C30535g.m62558a(r11) == false) goto L_0x01d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x01bc, code lost:
        com.p2082ss.android.socialbase.downloader.p2182e.C30434a.m62027b(com.p2082ss.android.socialbase.downloader.p2189k.C30535g.f72839a, "tempFile not exist , targetFile exists and md5 check valid");
        r6.setTTMd5CheckStatus(r11);
        r4.mo53871a();
        com.p2082ss.android.socialbase.downloader.p2189k.C30535g.m62548a(r6.getId(), true, (com.p2082ss.android.socialbase.downloader.exception.BaseException) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x01d6, code lost:
        if (r10.mo53840b() != false) goto L_0x0210;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x01d8, code lost:
        r1 = new com.p2082ss.android.socialbase.downloader.exception.BaseException(1005, com.C1764a.m5928a("Can't save the temp downloaded file(%s/%s) to the target file(%s/%s) because tempFile is not exist and target file is exist but md5 verify invalid :%s", new java.lang.Object[]{r6.getTempPath(), r6.getTempName(), r6.getSavePath(), r6.getName(), com.p2082ss.android.socialbase.downloader.p2189k.C30535g.m62574b(r11)}));
        r4.mo53872a(r1);
        com.p2082ss.android.socialbase.downloader.p2189k.C30535g.m62548a(r6.getId(), false, r1);
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0210, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0215, code lost:
        if (r2.mo53842d() != false) goto L_0x0253;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0217, code lost:
        if (r1 != false) goto L_0x022d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0219, code lost:
        if (r12 == null) goto L_0x02ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x021b, code lost:
        com.p2082ss.android.socialbase.downloader.p2183f.C30439a.m62034a(r12, r6, new com.p2082ss.android.socialbase.downloader.exception.BaseException(1038, "tempFile is not exist and target file is exist but md5 verify invalid, delete target file failed"), r6.getStatus());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x022d, code lost:
        r3 = new com.p2082ss.android.socialbase.downloader.exception.BaseException(1037, "delete targetPath file existed with md5 check invalid status:" + com.p2082ss.android.socialbase.downloader.p2189k.C30535g.m62574b(r11));
        r4.mo53872a(r3);
        com.p2082ss.android.socialbase.downloader.p2189k.C30535g.m62548a(r6.getId(), false, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0253, code lost:
        if (r1 == false) goto L_0x02ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x025a, code lost:
        if (r10.mo53840b() != false) goto L_0x028c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x025c, code lost:
        r10 = new com.p2082ss.android.socialbase.downloader.exception.BaseException(1005, com.C1764a.m5928a("Can't save the temp downloaded file(%s/%s) to the target file(%s/%s) because tempFile is not exist", new java.lang.Object[]{r6.getTempPath(), r6.getTempName(), r6.getSavePath(), r6.getName()}));
        r4.mo53872a(r10);
        com.p2082ss.android.socialbase.downloader.p2189k.C30535g.m62548a(r6.getId(), false, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
        r1 = com.p2082ss.android.socialbase.downloader.p2187i.C30472a.m62087a(r6.getId(), (com.p2082ss.android.socialbase.downloader.model.DownloadInfo) null).mo54258a("download_finish_check_ttmd5", 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x029b, code lost:
        if (r1 <= 0) goto L_0x02d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x029d, code lost:
        r3 = com.p2082ss.android.socialbase.downloader.p2189k.C30535g.m62534a(r10, r6.getMd5());
        r6.setTTMd5CheckStatus(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x02a8, code lost:
        if (r1 < 2) goto L_0x02d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x02ae, code lost:
        if (com.p2082ss.android.socialbase.downloader.p2189k.C30535g.m62558a(r3) != false) goto L_0x02d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x02b0, code lost:
        r2 = new com.p2082ss.android.socialbase.downloader.exception.BaseException(1034, com.p2082ss.android.socialbase.downloader.p2189k.C30535g.m62574b(r3));
        r4.mo53872a(r2);
        com.p2082ss.android.socialbase.downloader.p2189k.C30535g.m62548a(r6.getId(), false, r2);
        com.p2082ss.android.socialbase.downloader.p2189k.C30535g.m62552a(r6, com.p2082ss.android.socialbase.downloader.p2189k.C30535g.m62605e(r6.getSavePath()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x02d0, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(6125);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x02d5, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x02d6, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x02dc, code lost:
        if ((!com.p2082ss.android.socialbase.downloader.p2189k.C30535g.m62563a(r10, r2)) == false) goto L_0x02e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x02de, code lost:
        if (0 != 0) goto L_0x031c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x02e1, code lost:
        r4.mo53871a();
        com.p2082ss.android.socialbase.downloader.p2189k.C30535g.m62548a(r6.getId(), true, (com.p2082ss.android.socialbase.downloader.exception.BaseException) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x02f1, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x02f2, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x02f5, code lost:
        r3 = new com.p2082ss.android.socialbase.downloader.exception.BaseException(1038, com.C1764a.m5928a("Can't save the temp downloaded file(%s/%s) to the target file(%s/%s)", new java.lang.Object[]{r6.getTempPath(), r6.getTempName(), r6.getSavePath(), r6.getName()}));
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo54076d() {
        /*
        // Method dump skipped, instructions count: 867
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.socialbase.downloader.downloader.C30411g.mo54076d():void");
    }

    /* renamed from: a */
    public final void mo54068a(int i) {
        mo54069a(i, (BaseException) null, true);
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0041 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo54071a(com.p2082ss.android.socialbase.downloader.exception.BaseException r7) {
        /*
        // Method dump skipped, instructions count: 225
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.socialbase.downloader.downloader.C30411g.mo54071a(com.ss.android.socialbase.downloader.exception.BaseException):void");
    }

    /* renamed from: a */
    public final boolean mo54073a(boolean z) {
        boolean z2 = false;
        if (this.f72500c.getCurBytes() == this.f72500c.getTotalBytes()) {
            try {
                this.f72501d.mo53765a(this.f72500c.getId(), this.f72500c.getCurBytes());
            } catch (Exception e) {
                e.printStackTrace();
            }
            return false;
        }
        if (this.f72512o) {
            this.f72512o = false;
            this.f72500c.setStatus(4);
        }
        if (this.f72500c.isNeedPostProgress() && z) {
            z2 = true;
        }
        mo54069a(4, (BaseException) null, z2);
        return z;
    }

    public C30411g(DownloadTask downloadTask, Handler handler) {
        this.f72508k = downloadTask;
        m61772g();
        this.f72507j = handler;
        this.f72501d = C30399c.m61733q();
        DownloadInfo downloadInfo = downloadTask.getDownloadInfo();
        if (downloadInfo != null) {
            this.f72499b = C30472a.m62087a(downloadInfo.getId(), (DownloadInfo) null).mo54262a("fix_start_with_file_exist_update_error", false);
        } else {
            this.f72499b = false;
        }
    }

    /* renamed from: a */
    public final void mo54072a(BaseException baseException, boolean z) {
        int i;
        this.f72500c.setFirstDownload(false);
        this.f72503f.set(0);
        this.f72501d.mo53797h(this.f72500c.getId());
        if (z) {
            i = 7;
        } else {
            i = 5;
        }
        mo54069a(i, baseException, true);
    }

    /* renamed from: a */
    public final void mo54070a(long j, String str, String str2) {
        this.f72500c.setTotalBytes(j);
        this.f72500c.seteTag(str);
        if (!TextUtils.isEmpty(str2) && TextUtils.isEmpty(this.f72500c.getName())) {
            this.f72500c.setName(str2);
        }
        try {
            this.f72501d.mo53766a(this.f72500c.getId(), j, str, str2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        mo54069a(3, (BaseException) null, true);
        this.f72506i = this.f72500c.getMinByteIntervalForPostToMainThread(j);
        this.f72505h = this.f72500c.getMinProgressTimeMsInterval();
        this.f72512o = true;
        C30506r.m62442c().mo54316a(5, false);
    }

    /* renamed from: a */
    public final void mo54069a(int i, BaseException baseException, boolean z) {
        SparseArray<IDownloadListener> sparseArray;
        SparseArray<IDownloadListener> sparseArray2;
        int status = this.f72500c.getStatus();
        if (status != -3 || i != 4) {
            m61772g();
            if (i != 4 && C30292f.m61288d(i)) {
                this.f72500c.updateRealDownloadTime(false);
                if (C30292f.m61287c(i)) {
                    this.f72500c.updateDownloadTime();
                }
            }
            if (!this.f72500c.isAddListenerToSameTask()) {
                C30439a.m62039a(this.f72508k, baseException, i);
            }
            if (i == 6) {
                this.f72500c.setStatus(2);
            } else if (i == -6) {
                this.f72500c.setStatus(-3);
            } else {
                this.f72500c.setStatus(i);
            }
            if (status == -3 || status == -1) {
                if (this.f72500c.getRetryDelayStatus() == EnumC30295i.DELAY_RETRY_DOWNLOADING) {
                    this.f72500c.setRetryDelayStatus(EnumC30295i.DELAY_RETRY_DOWNLOADED);
                }
                if (this.f72500c.getAsyncHandleStatus() == EnumC30287a.ASYNC_HANDLE_DOWNLOADING) {
                    this.f72500c.setAsyncHandleStatus(EnumC30287a.ASYNC_HANDLE_DOWNLOADED);
                }
                if (this.f72500c.getByteInvalidRetryStatus() == EnumC30288b.BYTE_INVALID_RETRY_STATUS_DOWNLOADING) {
                    this.f72500c.setByteInvalidRetryStatus(EnumC30288b.BYTE_INVALID_RETRY_STATUS_DOWNLOADED);
                }
            }
            C30531d.m62530a(i, this.f72510m, true, this.f72500c, baseException);
            if (i != -4) {
                if (!z || this.f72507j == null || (((sparseArray = this.f72509l) == null || sparseArray.size() <= 0) && ((sparseArray2 = this.f72511n) == null || sparseArray2.size() <= 0 || (!this.f72500c.canShowNotification() && !this.f72500c.isAutoInstallWithoutNotification())))) {
                    AbstractC30474a u = C30399c.m61737u();
                    if (u != null) {
                        u.mo54269a(this.f72500c.getId(), this.f72508k.getHashCodeForSameTask(), i);
                        return;
                    }
                    return;
                }
                this.f72507j.obtainMessage(i, this.f72500c.getId(), this.f72508k.getHashCodeForSameTask(), baseException).sendToTarget();
            }
        }
    }
}
