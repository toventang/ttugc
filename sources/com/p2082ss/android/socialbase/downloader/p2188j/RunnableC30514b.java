package com.p2082ss.android.socialbase.downloader.p2188j;

import android.os.Process;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l;
import com.p2082ss.android.socialbase.downloader.downloader.C30399c;
import com.p2082ss.android.socialbase.downloader.downloader.C30409f;
import com.p2082ss.android.socialbase.downloader.model.DownloadChunk;
import com.p2082ss.android.socialbase.downloader.model.DownloadInfo;
import com.p2082ss.android.socialbase.downloader.model.DownloadTask;
import com.p2082ss.android.socialbase.downloader.p2184g.AbstractC30462i;

/* renamed from: com.ss.android.socialbase.downloader.j.b */
public class RunnableC30514b implements Runnable {

    /* renamed from: b */
    private static final String f72761b = RunnableC30514b.class.getSimpleName();

    /* renamed from: a */
    public C30409f f72762a;

    /* renamed from: c */
    private DownloadChunk f72763c;

    /* renamed from: d */
    private DownloadChunk f72764d;

    /* renamed from: e */
    private final DownloadTask f72765e;

    /* renamed from: f */
    private DownloadInfo f72766f;

    /* renamed from: g */
    private final AbstractC30522f f72767g;

    /* renamed from: h */
    private AbstractC30462i f72768h;

    /* renamed from: i */
    private AbstractC30420l f72769i;

    /* renamed from: j */
    private volatile boolean f72770j;

    /* renamed from: k */
    private volatile boolean f72771k;

    /* renamed from: l */
    private boolean f72772l;

    static {
        Covode.recordClassIndex(37042);
    }

    /* renamed from: c */
    private void m62457c() {
        AbstractC30462i iVar = this.f72768h;
        if (iVar != null) {
            iVar.mo54238d();
            this.f72768h = null;
        }
    }

    /* renamed from: d */
    private boolean m62458d() {
        if (this.f72770j || this.f72771k) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo54330a() {
        this.f72770j = true;
        C30409f fVar = this.f72762a;
        if (fVar != null) {
            fVar.mo54063a();
        }
    }

    /* renamed from: b */
    public final void mo54331b() {
        this.f72771k = true;
        C30409f fVar = this.f72762a;
        if (fVar != null) {
            fVar.mo54064b();
        }
    }

    /* JADX INFO: finally extract failed */
    public void run() {
        MethodCollector.m26663i(9081);
        Process.setThreadPriority(10);
        this.f72763c = this.f72764d;
        while (true) {
            try {
                this.f72763c.mo54399a(this);
                if (m62456a(this.f72763c)) {
                    this.f72763c.mo54401a(false);
                    if (m62458d()) {
                        break;
                    }
                    this.f72763c = this.f72767g.mo54334a(this.f72763c.f72916e);
                    if (m62458d() || this.f72763c == null) {
                        break;
                    }
                    try {
                        Thread.sleep(50);
                    } catch (Throwable unused) {
                    }
                } else {
                    this.f72763c.mo54401a(false);
                    break;
                }
            } catch (Throwable th) {
                DownloadChunk downloadChunk = this.f72763c;
                if (downloadChunk != null) {
                    downloadChunk.mo54401a(false);
                }
                m62457c();
                this.f72767g.mo54339a(this);
                MethodCollector.m26664o(9081);
                throw th;
            }
        }
        DownloadChunk downloadChunk2 = this.f72763c;
        if (downloadChunk2 != null) {
            downloadChunk2.mo54401a(false);
        }
        m62457c();
        this.f72767g.mo54339a(this);
        MethodCollector.m26664o(9081);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:117:0x01a5, code lost:
        if (com.p2082ss.android.socialbase.downloader.p2189k.C30535g.m62582b(r4) != false) goto L_0x01a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x01a7, code lost:
        r28.f72767g.mo54337a(r4, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x01b4, code lost:
        if (r28.f72767g.mo54341a(r4) != false) goto L_0x01b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x01ba, code lost:
        if (com.p2082ss.android.socialbase.downloader.p2189k.C30535g.m62564a(r4) != false) goto L_0x01bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x01bc, code lost:
        r28.f72767g.mo54337a(r4, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x01c3, code lost:
        if (r16 != false) goto L_0x01c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x01c8, code lost:
        if (r2 < 0) goto L_0x01ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x01ca, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x01ce, code lost:
        if (r28.f72762a != null) goto L_0x01d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x01d6, code lost:
        if (com.p2082ss.android.socialbase.downloader.p2189k.C30528a.m62524a(32) != false) goto L_0x01d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x01d8, code lost:
        r2 = r28.f72762a.f72473b - r28.f72762a.f72478g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x01e3, code lost:
        if (r2 > 0) goto L_0x01e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x01e5, code lost:
        m62455a(r29, r28.f72762a.f72478g);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x01f2, code lost:
        if (com.p2082ss.android.socialbase.downloader.p2189k.C30528a.m62524a(16) == false) goto L_0x01fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x01f4, code lost:
        r1 = r28.f72767g.mo54333a(r4, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x01fd, code lost:
        r1 = r28.f72767g.mo54342b(r4, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0204, code lost:
        r0 = r28.f72762a.f72473b - r14;
        m62455a(r29, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x020d, code lost:
        if (r1 != com.p2082ss.android.socialbase.downloader.exception.EnumC30437a.RETURN) goto L_0x0213;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x020f, code lost:
        m62457c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0212, code lost:
        return r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x022c, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x022e, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x022f, code lost:
        r9 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0234, code lost:
        if (m62458d() == false) goto L_0x023a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0236, code lost:
        m62457c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0239, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:?, code lost:
        com.p2082ss.android.socialbase.downloader.p2189k.C30535g.m62554a(r1, "downloadChunkInner");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0240, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0241, code lost:
        r28.f72767g.mo54344b(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x024a, code lost:
        m62457c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x024d, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x024e, code lost:
        m62457c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0251, code lost:
        return r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0252, code lost:
        m62457c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0255, code lost:
        return r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0256, code lost:
        r28.f72767g.mo54344b(r4);
        m62457c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x025e, code lost:
        return r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0277, code lost:
        r2 = r28.f72766f;
        r1 = r4.getErrorCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x02bb, code lost:
        r28.f72767g.mo54347c(r4);
        m62457c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x02c3, code lost:
        return r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x02c4, code lost:
        r28.f72767g.mo54344b(r4);
        m62457c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x02cc, code lost:
        return r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0118, code lost:
        r4 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0119, code lost:
        r9 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0160, code lost:
        r4 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0161, code lost:
        r16 = true;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x01a1 A[Catch:{ all -> 0x02cd }] */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x01f4 A[Catch:{ all -> 0x02cd }] */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x01fd A[Catch:{ all -> 0x02cd }] */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0213 A[LOOP:0: B:1:0x0002->B:145:0x0213, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x022c A[ExcHandler: all (th java.lang.Throwable), Splitter:B:75:0x0130] */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x022e A[ExcHandler: all (th java.lang.Throwable), Splitter:B:18:0x0041] */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0236  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x023a  */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x020f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x019f A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m62456a(com.p2082ss.android.socialbase.downloader.model.DownloadChunk r29) {
        /*
        // Method dump skipped, instructions count: 722
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.socialbase.downloader.p2188j.RunnableC30514b.m62456a(com.ss.android.socialbase.downloader.model.DownloadChunk):boolean");
    }

    /* renamed from: a */
    private void m62455a(DownloadChunk downloadChunk, long j) {
        DownloadChunk downloadChunk2;
        if (downloadChunk.mo54403b()) {
            downloadChunk2 = downloadChunk.mo54404c();
            if (downloadChunk2 == null) {
                if (downloadChunk.mo54403b()) {
                    this.f72769i.mo53771a(downloadChunk.f72912a, downloadChunk.f72916e, j);
                    return;
                }
                return;
            }
        } else {
            downloadChunk2 = downloadChunk;
        }
        if (downloadChunk2.mo54407e()) {
            this.f72769i.mo53771a(downloadChunk2.f72912a, downloadChunk2.mo54396a(), j);
        }
        downloadChunk2.mo54398a(j);
        this.f72769i.mo53770a(downloadChunk2.f72912a, downloadChunk2.f72916e, downloadChunk2.mo54396a(), j);
    }

    public RunnableC30514b(DownloadChunk downloadChunk, DownloadTask downloadTask, AbstractC30522f fVar) {
        this.f72764d = downloadChunk;
        this.f72765e = downloadTask;
        if (downloadTask != null) {
            this.f72766f = downloadTask.getDownloadInfo();
        }
        this.f72767g = fVar;
        this.f72769i = C30399c.m61733q();
        this.f72764d.mo54399a(this);
    }

    public RunnableC30514b(DownloadChunk downloadChunk, DownloadTask downloadTask, AbstractC30462i iVar, AbstractC30522f fVar) {
        this(downloadChunk, downloadTask, fVar);
        this.f72768h = iVar;
    }
}
