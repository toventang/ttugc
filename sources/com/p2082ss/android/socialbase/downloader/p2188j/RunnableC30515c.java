package com.p2082ss.android.socialbase.downloader.p2188j;

import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.socialbase.downloader.depend.AbstractC30377o;
import com.p2082ss.android.socialbase.downloader.depend.AbstractC30387u;
import com.p2082ss.android.socialbase.downloader.depend.AbstractC30389w;
import com.p2082ss.android.socialbase.downloader.downloader.AbstractC30415i;
import com.p2082ss.android.socialbase.downloader.downloader.AbstractC30416j;
import com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l;
import com.p2082ss.android.socialbase.downloader.downloader.AbstractC30429u;
import com.p2082ss.android.socialbase.downloader.downloader.C30399c;
import com.p2082ss.android.socialbase.downloader.downloader.C30409f;
import com.p2082ss.android.socialbase.downloader.downloader.C30411g;
import com.p2082ss.android.socialbase.downloader.exception.BaseException;
import com.p2082ss.android.socialbase.downloader.exception.C30438b;
import com.p2082ss.android.socialbase.downloader.exception.DownloadFileExistException;
import com.p2082ss.android.socialbase.downloader.exception.DownloadHttpException;
import com.p2082ss.android.socialbase.downloader.exception.DownloadOutOfSpaceException;
import com.p2082ss.android.socialbase.downloader.exception.DownloadRetryNeedlessException;
import com.p2082ss.android.socialbase.downloader.exception.EnumC30437a;
import com.p2082ss.android.socialbase.downloader.impls.AbstractC30474a;
import com.p2082ss.android.socialbase.downloader.impls.C30488e;
import com.p2082ss.android.socialbase.downloader.impls.C30505q;
import com.p2082ss.android.socialbase.downloader.impls.C30506r;
import com.p2082ss.android.socialbase.downloader.model.C30592b;
import com.p2082ss.android.socialbase.downloader.model.DownloadChunk;
import com.p2082ss.android.socialbase.downloader.model.DownloadInfo;
import com.p2082ss.android.socialbase.downloader.model.DownloadTask;
import com.p2082ss.android.socialbase.downloader.model.HttpHeader;
import com.p2082ss.android.socialbase.downloader.p2179b.C30291e;
import com.p2082ss.android.socialbase.downloader.p2179b.EnumC30288b;
import com.p2082ss.android.socialbase.downloader.p2179b.EnumC30296j;
import com.p2082ss.android.socialbase.downloader.p2182e.C30434a;
import com.p2082ss.android.socialbase.downloader.p2183f.C30439a;
import com.p2082ss.android.socialbase.downloader.p2184g.AbstractC30460g;
import com.p2082ss.android.socialbase.downloader.p2184g.AbstractC30462i;
import com.p2082ss.android.socialbase.downloader.p2184g.C30449b;
import com.p2082ss.android.socialbase.downloader.p2184g.p2185a.C30443a;
import com.p2082ss.android.socialbase.downloader.p2184g.p2185a.C30448d;
import com.p2082ss.android.socialbase.downloader.p2187i.C30472a;
import com.p2082ss.android.socialbase.downloader.p2189k.C30528a;
import com.p2082ss.android.socialbase.downloader.p2189k.C30530c;
import com.p2082ss.android.socialbase.downloader.p2189k.C30532e;
import com.p2082ss.android.socialbase.downloader.p2189k.C30535g;
import com.p2082ss.android.socialbase.downloader.segment.C30609j;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.SSLHandshakeException;

/* renamed from: com.ss.android.socialbase.downloader.j.c */
public class RunnableC30515c implements AbstractC30522f, Runnable {

    /* renamed from: k */
    private static final String f72773k = RunnableC30515c.class.getSimpleName();

    /* renamed from: A */
    private AbstractC30460g f72774A;

    /* renamed from: B */
    private AbstractC30387u f72775B;

    /* renamed from: C */
    private AbstractC30377o f72776C;

    /* renamed from: D */
    private volatile int f72777D = 5;

    /* renamed from: E */
    private boolean f72778E = false;

    /* renamed from: F */
    private boolean f72779F = false;

    /* renamed from: G */
    private String f72780G;

    /* renamed from: H */
    private String f72781H;

    /* renamed from: I */
    private boolean f72782I = false;

    /* renamed from: J */
    private long f72783J;

    /* renamed from: K */
    private final C30472a f72784K;

    /* renamed from: L */
    private int f72785L = 0;

    /* renamed from: a */
    public Future f72786a;

    /* renamed from: b */
    public final DownloadTask f72787b;

    /* renamed from: c */
    volatile C30409f f72788c;

    /* renamed from: d */
    final AtomicBoolean f72789d;

    /* renamed from: e */
    volatile EnumC30296j f72790e = EnumC30296j.RUN_STATUS_NONE;

    /* renamed from: f */
    DownloadInfo f72791f;

    /* renamed from: g */
    public final C30411g f72792g;

    /* renamed from: h */
    public AbstractC30462i f72793h;

    /* renamed from: i */
    public long f72794i;

    /* renamed from: j */
    volatile C30609j f72795j = null;

    /* renamed from: l */
    private volatile boolean f72796l;

    /* renamed from: m */
    private AtomicInteger f72797m;

    /* renamed from: n */
    private final ArrayList<RunnableC30514b> f72798n = new ArrayList<>();

    /* renamed from: o */
    private boolean f72799o;

    /* renamed from: p */
    private boolean f72800p;

    /* renamed from: q */
    private boolean f72801q;

    /* renamed from: r */
    private boolean f72802r;

    /* renamed from: s */
    private boolean f72803s;

    /* renamed from: t */
    private final AbstractC30420l f72804t;

    /* renamed from: u */
    private AbstractC30416j f72805u;

    /* renamed from: v */
    private final AbstractC30416j f72806v;

    /* renamed from: w */
    private AbstractC30415i f72807w;

    /* renamed from: x */
    private final AbstractC30415i f72808x;

    /* renamed from: y */
    private AbstractC30429u f72809y;

    /* renamed from: z */
    private volatile BaseException f72810z;

    /* renamed from: a */
    public final void mo54335a() {
        this.f72790e = EnumC30296j.RUN_STATUS_PAUSE;
        if (this.f72795j != null) {
            this.f72795j.mo54849b();
        }
        if (this.f72788c != null) {
            this.f72788c.mo54063a();
        }
        if (this.f72795j == null && this.f72788c == null) {
            mo54346c();
            this.f72790e = EnumC30296j.RUN_STATUS_PAUSE;
            mo54343b();
        }
        try {
            Iterator it = ((ArrayList) this.f72798n.clone()).iterator();
            while (it.hasNext()) {
                RunnableC30514b bVar = (RunnableC30514b) it.next();
                if (bVar != null) {
                    bVar.mo54330a();
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:523:0x0231 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:545:0x0311 */
    /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r9v2, resolved type: int */
    /* JADX DEBUG: Multi-variable search result rejected for r5v2, resolved type: int */
    /* JADX DEBUG: Multi-variable search result rejected for r0v344, resolved type: com.ss.android.socialbase.downloader.i.a */
    /* JADX DEBUG: Multi-variable search result rejected for r0v348, resolved type: com.ss.android.socialbase.downloader.i.a */
    /* JADX DEBUG: Multi-variable search result rejected for r0v366, resolved type: com.ss.android.socialbase.downloader.model.DownloadInfo */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x01aa, code lost:
        if (r25.f72784K.mo54262a("fix_file_exist_update_download_info", (boolean) r5) != false) goto L_0x01ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x0456, code lost:
        if (r8 == null) goto L_0x03fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x0484, code lost:
        com.p2082ss.android.socialbase.downloader.p2182e.C30434a.m62028c(com.p2082ss.android.socialbase.downloader.p2188j.RunnableC30515c.f72773k, "downloadSegments return");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x04ce, code lost:
        if (r2 >= 0) goto L_0x04d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:0x067a, code lost:
        r8 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:0x067d, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:0x0680, code lost:
        if (r13 <= 0) goto L_0x0682;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:404:0x07e1, code lost:
        r8 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:408:0x07eb, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:428:0x083d, code lost:
        r8 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:429:0x083f, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:432:0x084a, code lost:
        r8 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:433:0x084b, code lost:
        r18 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:437:0x0871, code lost:
        r0 = r25.f72797m;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:438:0x0874, code lost:
        if (r0 == null) goto L_0x088d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:441:0x087c, code lost:
        r25.f72791f.updateCurRetryTime(r25.f72797m.decrementAndGet());
        r25.f72791f.setStatus(5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:443:0x088f, code lost:
        if (r25.f72797m != null) goto L_0x0891;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:445:0x0897, code lost:
        if (r25.f72791f.trySwitchToNextBackupUrl() != false) goto L_0x0899;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:446:0x0899, code lost:
        r25.f72791f.setStatus(5);
        r25.f72797m.set(r25.f72791f.getRetryCount());
        r25.f72791f.updateCurRetryTime(r25.f72797m.get());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:447:0x08b5, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:452:0x08d9, code lost:
        if (r2.getErrorCode() == 1025) goto L_0x08e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:455:0x08e3, code lost:
        r25.f72790e = com.p2082ss.android.socialbase.downloader.p2179b.EnumC30296j.RUN_STATUS_END_RIGHT_NOW;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:457:0x08ed, code lost:
        if (mo54341a(r2) != false) goto L_0x08ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:459:0x08f3, code lost:
        if (com.p2082ss.android.socialbase.downloader.p2189k.C30535g.m62564a(r2) != false) goto L_0x08f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:460:0x08f5, code lost:
        m62480s();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:462:0x0900, code lost:
        if (mo54342b(r2, 0) == com.p2082ss.android.socialbase.downloader.exception.EnumC30437a.RETURN) goto L_0x09d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:465:0x0916, code lost:
        r3 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:473:0x0925, code lost:
        mo54346c();
        mo54343b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:479:0x093d, code lost:
        mo54346c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:490:0x0950, code lost:
        r3 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:493:0x0955, code lost:
        mo54346c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:495:0x095c, code lost:
        r3 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:498:0x0962, code lost:
        r3 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:502:0x097d, code lost:
        mo54344b(new com.p2082ss.android.socialbase.downloader.exception.BaseException(1045, r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:503:0x0988, code lost:
        r2 = new java.lang.Object[2];
        r2[r18] = java.lang.String.valueOf(r25.f72791f.getRetryCount());
        r2[1] = r8.getErrorMsg();
        mo54344b(new com.p2082ss.android.socialbase.downloader.exception.BaseException(1018, com.C1764a.m5928a("retry for Throwable, but retry Time %s all used, last error is %s", r2)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:504:0x09af, code lost:
        mo54344b(new com.p2082ss.android.socialbase.downloader.exception.BaseException(1043, "retry for Throwable, but retain retry time is NULL, last error is" + r8.getErrorMsg()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:505:0x09cd, code lost:
        mo54344b(r2);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x01e4  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0221  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x02ee  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x03a0  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x03c9  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x03cb  */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x044a A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x0456  */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x0493  */
    /* JADX WARNING: Removed duplicated region for block: B:285:0x05c9 A[SYNTHETIC, Splitter:B:285:0x05c9] */
    /* JADX WARNING: Removed duplicated region for block: B:298:0x05f3 A[Catch:{ DownloadFileExistException -> 0x095e, BaseException -> 0x07eb, b -> 0x07e1, all -> 0x0950 }] */
    /* JADX WARNING: Removed duplicated region for block: B:432:0x084a A[ExcHandler: b (e com.ss.android.socialbase.downloader.exception.b), Splitter:B:164:0x0319] */
    /* JADX WARNING: Removed duplicated region for block: B:437:0x0871 A[Catch:{ all -> 0x09d8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:451:0x08d3  */
    /* JADX WARNING: Removed duplicated region for block: B:497:? A[ExcHandler: DownloadFileExistException (unused com.ss.android.socialbase.downloader.exception.DownloadFileExistException), SYNTHETIC, Splitter:B:294:0x05e0] */
    /* JADX WARNING: Removed duplicated region for block: B:498:0x0962 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:164:0x0319] */
    /* JADX WARNING: Removed duplicated region for block: B:502:0x097d  */
    /* JADX WARNING: Removed duplicated region for block: B:514:0x02e5 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:525:0x09d0 A[EDGE_INSN: B:525:0x09d0->B:506:0x09d0 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:526:0x0472 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:532:0x09d0 A[EDGE_INSN: B:532:0x09d0->B:506:0x09d0 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:541:0x05f1 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0183 A[Catch:{ all -> 0x019f }, DONT_GENERATE] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m62469h() {
        /*
        // Method dump skipped, instructions count: 2530
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.socialbase.downloader.p2188j.RunnableC30515c.m62469h():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x011e, code lost:
        if (r2 > r10) goto L_0x0120;
     */
    @Override // com.p2082ss.android.socialbase.downloader.p2188j.AbstractC30522f
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo54336a(long r25) {
        /*
        // Method dump skipped, instructions count: 529
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.socialbase.downloader.p2188j.RunnableC30515c.mo54336a(long):void");
    }

    @Override // com.p2082ss.android.socialbase.downloader.p2188j.AbstractC30522f
    /* renamed from: a */
    public final void mo54340a(String str, AbstractC30460g gVar, long j) {
        String str2;
        long j2;
        if (gVar != null) {
            try {
                C30592b bVar = new C30592b(str, gVar);
                int i = bVar.f72996c;
                String d = bVar.mo54797d();
                if (TextUtils.isEmpty(this.f72791f.getMimeType()) && !TextUtils.isEmpty(d)) {
                    this.f72791f.setMimeType(d);
                }
                boolean b = bVar.mo54795b();
                this.f72801q = b;
                this.f72791f.setSupportPartial(b);
                this.f72802r = bVar.mo54794a();
                String str3 = this.f72791f.geteTag();
                String c = bVar.mo54796c();
                String f = bVar.mo54799f();
                String g = bVar.mo54800g();
                String str4 = f72773k;
                C30434a.m62027b(str4, "dcache=responseCode=" + i + " last_modified=" + f + " CACHE_CONTROL=" + g + " max-age=" + C30535g.m62606f(bVar.mo54800g()) + " isDeleteCacheIfCheckFailed=" + this.f72791f.isDeleteCacheIfCheckFailed());
                C30434a.m62027b(str4, "dcache=firstOffset=" + j + " cur=" + f + " before=" + this.f72791f.getLastModified() + " cur=" + bVar.mo54803j() + " before=" + this.f72791f.getTotalBytes());
                if (!TextUtils.isEmpty(g)) {
                    this.f72791f.setCacheControl(g);
                    if (C30535g.m62606f(bVar.mo54800g()) > 0) {
                        this.f72791f.setCacheExpiredTime(System.currentTimeMillis() + (C30535g.m62606f(bVar.mo54800g()) * 1000));
                    }
                }
                if (this.f72791f.isExpiredRedownload() && this.f72782I && !TextUtils.isEmpty(this.f72781H)) {
                    if (i != 304) {
                        if ((TextUtils.isEmpty(this.f72791f.getLastModified()) && this.f72791f.isDeleteCacheIfCheckFailed()) || !TextUtils.equals(f, this.f72791f.getLastModified())) {
                            C30535g.m62552a(this.f72791f, true);
                        }
                    }
                    C30434a.m62027b(str4, "dcache=responseCode=" + i + " lastModified not changed, use local file  " + f);
                    throw new DownloadFileExistException(this.f72780G, this.f72781H);
                }
                if (j > 0 && this.f72791f.isExpiredRedownload() && !TextUtils.equals(f, this.f72791f.getLastModified())) {
                    C30434a.m62027b(str4, "dcache cdn file change, so retry");
                    m62462a("", "cdn file changed");
                }
                if (!TextUtils.isEmpty(f)) {
                    this.f72791f.setLastModified(f);
                }
                if (m62465a(i, str3, c)) {
                    if (gVar instanceof AbstractC30462i) {
                        if (!TextUtils.isEmpty(str3) && str3.equals(c)) {
                            c = "";
                        }
                        m62462a(c, "eTag of server file changed");
                    } else {
                        throw new DownloadHttpException(1002, i, "");
                    }
                }
                if (this.f72801q || this.f72802r) {
                    if (this.f72802r && j > 0) {
                        if (gVar instanceof AbstractC30462i) {
                            m62462a("", "http head request not support");
                        } else {
                            throw new BaseException(1004, "isResponseFromBegin but firstOffset > 0");
                        }
                    }
                    long h = bVar.mo54801h();
                    if ((gVar instanceof AbstractC30462i) || h >= 0 || !C30532e.m62531a(this.f72791f)) {
                        if (TextUtils.isEmpty(this.f72791f.getName())) {
                            str2 = C30535g.m62539a(gVar, this.f72791f.getUrl());
                        } else {
                            str2 = "";
                        }
                        boolean i2 = bVar.mo54802i();
                        this.f72803s = i2;
                        if (i2) {
                            j2 = -1;
                        } else if (h != 0 || (gVar instanceof AbstractC30462i)) {
                            String b2 = C30535g.m62575b(gVar, "Content-Range");
                            C30434a.m62028c(str4, "firstConnection: contentRange = ".concat(String.valueOf(b2)));
                            if (TextUtils.isEmpty(b2) || !this.f72784K.mo54262a("fix_get_total_bytes", true)) {
                                j2 = j + h;
                                C30434a.m62030e(str4, "firstConnection: 2 totalLength = " + j2 + ", contentLength = " + h);
                            } else {
                                j2 = C30535g.m62536a(b2);
                                C30434a.m62028c(str4, "firstConnection: 1 totalLength = ".concat(String.valueOf(j2)));
                            }
                        } else {
                            throw new BaseException(1004, "");
                        }
                        if (!TextUtils.isEmpty(this.f72791f.getTaskKey()) && this.f72791f.getTotalBytes() > 0 && j2 != this.f72791f.getTotalBytes()) {
                            if (gVar instanceof AbstractC30462i) {
                                m62462a("", "file totalLength changed");
                            } else {
                                throw new DownloadHttpException(1002, i, "");
                            }
                        }
                        if (!mo54348d()) {
                            if (this.f72791f.getExpectFileLength() <= 0 || C30472a.m62087a(this.f72791f.getId(), (DownloadInfo) null).mo54258a("force_check_file_length", 0) != 1 || this.f72791f.getExpectFileLength() == j2) {
                                this.f72792g.mo54070a(j2, c, str2);
                                return;
                            }
                            throw new BaseException(1070, "expectFileLength = " + this.f72791f.getExpectFileLength() + " , totalLength = " + j2);
                        }
                        return;
                    }
                    throw new BaseException(1004, "");
                } else if (i == 403) {
                    throw new BaseException(1047, "response code error : 403");
                } else {
                    throw new DownloadHttpException(1004, i, "response code error : ".concat(String.valueOf(i)));
                }
            } catch (BaseException e) {
                throw e;
            } catch (C30438b e2) {
                throw e2;
            } catch (Throwable th) {
                C30535g.m62554a(th, "HandleFirstConnection");
            }
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.p2188j.AbstractC30522f
    /* renamed from: a */
    public final void mo54339a(RunnableC30514b bVar) {
        MethodCollector.m26663i(11173);
        if (!this.f72799o) {
            synchronized (this) {
                try {
                    this.f72798n.remove(bVar);
                } finally {
                    MethodCollector.m26664o(11173);
                }
            }
            return;
        }
        MethodCollector.m26664o(11173);
    }

    @Override // com.p2082ss.android.socialbase.downloader.p2188j.AbstractC30522f
    /* renamed from: a */
    public final boolean mo54341a(BaseException baseException) {
        if (this.f72795j != null && C30535g.m62601d(baseException) && this.f72797m.get() < this.f72791f.getRetryCount()) {
            return false;
        }
        if (C30535g.m62582b(baseException)) {
            if (this.f72799o && !this.f72796l) {
                C30535g.m62552a(this.f72791f, true);
                this.f72796l = true;
            }
            return true;
        }
        AtomicInteger atomicInteger = this.f72797m;
        if (((atomicInteger == null || atomicInteger.get() <= 0) && !this.f72791f.hasNextBackupUrl() && ((baseException.getErrorCode() != 1011 && (baseException.getCause() == null || !(baseException.getCause() instanceof SSLHandshakeException))) || !this.f72791f.canReplaceHttpForRetry())) || (baseException instanceof DownloadRetryNeedlessException)) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.socialbase.downloader.p2188j.AbstractC30522f
    /* renamed from: a */
    public final EnumC30437a mo54333a(BaseException baseException, long j) {
        boolean z;
        MethodCollector.m26663i(11322);
        if (m62474m()) {
            EnumC30437a aVar = EnumC30437a.RETURN;
            MethodCollector.m26664o(11322);
            return aVar;
        } else if (baseException.getErrorCode() == 1047 || C30535g.m62596c(baseException)) {
            EnumC30437a b = mo54342b(baseException, j);
            MethodCollector.m26664o(11322);
            return b;
        } else {
            this.f72810z = baseException;
            this.f72791f.increaseCurBytes(-j);
            this.f72804t.mo53776a(this.f72791f);
            if (m62467d(baseException)) {
                EnumC30437a aVar2 = EnumC30437a.RETURN;
                MethodCollector.m26664o(11322);
                return aVar2;
            }
            C30411g gVar = this.f72792g;
            if (this.f72790e == EnumC30296j.RUN_STATUS_RETRY_DELAY) {
                z = true;
            } else {
                z = false;
            }
            gVar.f72500c.setFirstDownload(false);
            gVar.f72503f.set(0);
            gVar.f72501d.mo53797h(gVar.f72500c.getId());
            gVar.mo54069a(z ? 10 : 9, baseException, true);
            if (this.f72790e != EnumC30296j.RUN_STATUS_RETRY_DELAY && this.f72791f.isNeedRetryDelay()) {
                long a = this.f72809y.mo54207a(this.f72791f.getCurRetryTimeInTotal(), this.f72791f.getTotalRetryCount());
                if (a > 0) {
                    C30434a.m62028c(f72773k, "onSingleChunkRetry with delay time ".concat(String.valueOf(a)));
                    try {
                        Thread.sleep(a);
                    } catch (Throwable th) {
                        C30434a.m62029d(f72773k, "onSingleChunkRetry:" + th.getMessage());
                    }
                }
            }
            EnumC30437a aVar3 = EnumC30437a.CONTINUE;
            MethodCollector.m26664o(11322);
            return aVar3;
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.p2188j.AbstractC30522f
    /* renamed from: a */
    public final synchronized DownloadChunk mo54334a(int i) {
        MethodCollector.m26663i(11811);
        if (this.f72791f.getChunkCount() < 2) {
            MethodCollector.m26664o(11811);
            return null;
        }
        List<DownloadChunk> c = this.f72804t.mo53785c(this.f72791f.getId());
        if (c == null || c.isEmpty()) {
            MethodCollector.m26664o(11811);
            return null;
        }
        for (int i2 = 0; i2 < c.size(); i2++) {
            DownloadChunk downloadChunk = c.get(i2);
            if (downloadChunk != null && downloadChunk.mo54403b()) {
                long b = downloadChunk.mo54402b(true);
                C30434a.m62027b(f72773k, "reuseChunk retainLen:" + b + " chunkIndex:" + i);
                if (!downloadChunk.mo54405d() && b > C30291e.f72266f && this.f72791f.isNeedReuseChunkRunnable()) {
                    List<DownloadChunk> a = downloadChunk.mo54397a(this.f72791f.getChunkCount(), this.f72791f.getTotalBytes());
                    if (a != null) {
                        for (DownloadChunk downloadChunk2 : a) {
                            this.f72804t.mo53782b(downloadChunk2);
                        }
                    }
                } else if (!downloadChunk.mo54405d()) {
                    continue;
                }
                if (downloadChunk.mo54405d()) {
                    for (int i3 = 1; i3 < downloadChunk.f72918g.size(); i3++) {
                        DownloadChunk downloadChunk3 = downloadChunk.f72918g.get(i3);
                        if (downloadChunk3 != null) {
                            C30434a.m62027b(f72773k, "check can checkUnCompletedChunk -- chunkIndex:" + downloadChunk3.f72916e + " currentOffset:" + downloadChunk3.mo54411i() + "  startOffset:" + downloadChunk3.f72913b + " contentLen:" + downloadChunk3.f72915d);
                            if (downloadChunk3.f72916e < 0 || (!downloadChunk3.mo54408f() && (downloadChunk3.f72922k == null || !downloadChunk3.f72922k.get()))) {
                                C30434a.m62027b(f72773k, "unComplete chunk " + downloadChunk.f72916e + " curOffset:" + downloadChunk.mo54411i() + " reuseChunk chunkIndex:" + i + " for subChunk:" + downloadChunk3.f72916e);
                                this.f72804t.mo53769a(downloadChunk3.f72912a, downloadChunk3.f72916e, downloadChunk3.mo54396a(), i);
                                downloadChunk3.f72916e = i;
                                downloadChunk3.mo54401a(true);
                                MethodCollector.m26664o(11811);
                                return downloadChunk3;
                            }
                        }
                    }
                    continue;
                } else {
                    continue;
                }
            }
        }
        MethodCollector.m26664o(11811);
        return null;
    }

    @Override // com.p2082ss.android.socialbase.downloader.p2188j.AbstractC30522f
    /* renamed from: a */
    public final void mo54338a(AbstractC30460g gVar) {
        if (gVar != null) {
            try {
                int a = gVar.mo54233a();
                this.f72791f.setHttpStatusCode(a);
                this.f72791f.setHttpStatusMessage(C30530c.m62529a(a));
                return;
            } catch (Throwable unused) {
            }
        }
        this.f72791f.setHttpStatusCode(-1);
        this.f72791f.setHttpStatusMessage("");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo54346c() {
        m62472k();
        m62473l();
    }

    static {
        Covode.recordClassIndex(37043);
    }

    /* renamed from: k */
    private void m62472k() {
        AbstractC30460g gVar = this.f72774A;
        if (gVar != null) {
            gVar.mo54235b();
            this.f72774A = null;
        }
    }

    /* renamed from: l */
    private void m62473l() {
        AbstractC30462i iVar = this.f72793h;
        if (iVar != null) {
            iVar.mo54238d();
            this.f72793h = null;
        }
    }

    /* renamed from: m */
    private boolean m62474m() {
        if (this.f72790e == EnumC30296j.RUN_STATUS_CANCELED || this.f72790e == EnumC30296j.RUN_STATUS_PAUSE) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final int mo54349e() {
        DownloadInfo downloadInfo = this.f72791f;
        if (downloadInfo != null) {
            return downloadInfo.getId();
        }
        return 0;
    }

    /* renamed from: g */
    private void m62468g() {
        DownloadInfo downloadInfo = this.f72791f;
        if (downloadInfo != null) {
            int retryCount = downloadInfo.getRetryCount() - this.f72791f.getCurRetryTime();
            if (retryCount < 0) {
                retryCount = 0;
            }
            AtomicInteger atomicInteger = this.f72797m;
            if (atomicInteger == null) {
                this.f72797m = new AtomicInteger(retryCount);
            } else {
                atomicInteger.set(retryCount);
            }
        }
    }

    /* renamed from: j */
    private void m62471j() {
        int retryCount;
        if (C30472a.m62087a(this.f72791f.getId(), (DownloadInfo) null).mo54258a("reset_retain_retry_times", 0) == 1 && this.f72785L < 3) {
            AtomicInteger atomicInteger = this.f72797m;
            if (this.f72791f.isBackUpUrlUsed()) {
                retryCount = this.f72791f.getBackUpUrlRetryCount();
            } else {
                retryCount = this.f72791f.getRetryCount();
            }
            atomicInteger.set(retryCount);
            this.f72785L++;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo54348d() {
        if (!m62474m() && this.f72791f.getStatus() != -2) {
            return false;
        }
        if (m62474m()) {
            return true;
        }
        if (this.f72791f.getStatus() == -2) {
            this.f72790e = EnumC30296j.RUN_STATUS_PAUSE;
            return true;
        } else if (this.f72791f.getStatus() != -4) {
            return true;
        } else {
            this.f72790e = EnumC30296j.RUN_STATUS_CANCELED;
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo54350f() {
        try {
            Iterator it = ((ArrayList) this.f72798n.clone()).iterator();
            while (it.hasNext()) {
                RunnableC30514b bVar = (RunnableC30514b) it.next();
                if (bVar != null) {
                    bVar.mo54331b();
                }
            }
        } catch (Throwable th) {
            C30434a.m62028c(f72773k, "cancelAllChunkRunnable: " + th.toString());
        }
    }

    /* renamed from: i */
    private void m62470i() {
        C30434a.m62027b(f72773k, "finishWithFileExist");
        if (C30472a.f72639a.mo54262a("fix_end_for_file_exist_error", true)) {
            if (this.f72781H.equals(this.f72791f.getName())) {
                this.f72790e = EnumC30296j.RUN_STATUS_END_RIGHT_NOW;
            } else {
                this.f72790e = EnumC30296j.RUN_STATUS_END_FOR_FILE_EXIST;
            }
        } else if (this.f72781H.equals(this.f72791f.getTargetFilePath())) {
            this.f72790e = EnumC30296j.RUN_STATUS_END_RIGHT_NOW;
        } else {
            this.f72790e = EnumC30296j.RUN_STATUS_END_FOR_FILE_EXIST;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0047  */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m62476o() {
        /*
            r7 = this;
            com.ss.android.socialbase.downloader.model.DownloadInfo r0 = r7.f72791f
            int r0 = r0.getChunkCount()
            r6 = 0
            r3 = 1
            if (r0 > r3) goto L_0x0028
            com.ss.android.socialbase.downloader.model.DownloadInfo r0 = r7.f72791f
            long r4 = r0.getCurBytes()
            r1 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0027
            com.ss.android.socialbase.downloader.model.DownloadInfo r0 = r7.f72791f
            long r4 = r0.getCurBytes()
            com.ss.android.socialbase.downloader.model.DownloadInfo r0 = r7.f72791f
            long r1 = r0.getTotalBytes()
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0027
            return r3
        L_0x0027:
            return r6
        L_0x0028:
            com.ss.android.socialbase.downloader.downloader.l r1 = r7.f72804t
            com.ss.android.socialbase.downloader.model.DownloadInfo r0 = r7.f72791f
            int r0 = r0.getId()
            java.util.List r1 = r1.mo53785c(r0)
            if (r1 == 0) goto L_0x003c
            int r0 = r1.size()
            if (r0 > r3) goto L_0x003d
        L_0x003c:
            return r6
        L_0x003d:
            java.util.Iterator r1 = r1.iterator()
        L_0x0041:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0056
            java.lang.Object r0 = r1.next()
            com.ss.android.socialbase.downloader.model.DownloadChunk r0 = (com.p2082ss.android.socialbase.downloader.model.DownloadChunk) r0
            if (r0 == 0) goto L_0x0055
            boolean r0 = r0.mo54408f()
            if (r0 != 0) goto L_0x0041
        L_0x0055:
            return r6
        L_0x0056:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.socialbase.downloader.p2188j.RunnableC30515c.m62476o():boolean");
    }

    /* renamed from: s */
    private void m62480s() {
        C30434a.m62029d(f72773k, "clearCurrentDownloadData::" + Log.getStackTraceString(new Throwable()));
        try {
            this.f72804t.mo53790d(this.f72791f.getId());
            this.f72804t.mo53812l(this.f72791f.getId());
            C30535g.m62552a(this.f72791f, true);
            this.f72800p = false;
            this.f72791f.resetDataForEtagEndure("");
            this.f72804t.mo53776a(this.f72791f);
        } catch (Throwable unused) {
        }
    }

    public void run() {
        MethodCollector.m26663i(6472);
        synchronized (C30399c.f72435g) {
            try {
                Iterator<Object> it = C30399c.f72435g.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            } catch (Throwable th) {
                MethodCollector.m26664o(6472);
                throw th;
            }
        }
        try {
            C30449b a = C30449b.m62058a();
            try {
                C30434a.m62028c(C30449b.f72582a, "startSampling: mSamplingCounter = " + a.f72586b);
                if (a.f72586b.getAndIncrement() == 0) {
                    a.f72587c.sendEmptyMessage(1);
                    a.f72588e = SystemClock.uptimeMillis();
                }
            } catch (Throwable unused) {
            }
            m62469h();
            C30449b.m62058a().mo54241b();
            C30399c.m61715d();
            MethodCollector.m26664o(6472);
        } catch (Throwable th2) {
            C30449b.m62058a().mo54241b();
            MethodCollector.m26664o(6472);
            throw th2;
        }
    }

    /* renamed from: p */
    private boolean m62477p() {
        if (this.f72791f.isChunked()) {
            DownloadInfo downloadInfo = this.f72791f;
            downloadInfo.setTotalBytes(downloadInfo.getCurBytes());
        }
        C30434a.m62028c(f72773k, "checkCompletedByteValid: downloadInfo.getCurBytes() = " + this.f72791f.getCurBytes() + ",  downloadInfo.getTotalBytes() = " + this.f72791f.getTotalBytes());
        if (this.f72791f.getCurBytes() > 0 && (this.f72791f.isIgnoreDataVerify() || (this.f72791f.getTotalBytes() > 0 && this.f72791f.getCurBytes() == this.f72791f.getTotalBytes()))) {
            return true;
        }
        this.f72791f.setByteInvalidRetryStatus(EnumC30288b.BYTE_INVALID_RETRY_STATUS_RESTART);
        this.f72791f.reset();
        this.f72804t.mo53776a(this.f72791f);
        this.f72804t.mo53790d(this.f72791f.getId());
        this.f72804t.mo53812l(this.f72791f.getId());
        C30535g.m62552a(this.f72791f, true);
        return false;
    }

    /* renamed from: q */
    private void m62478q() {
        AbstractC30474a u;
        int id = this.f72791f.getId();
        int a = C30399c.m61680a(this.f72791f);
        if (!this.f72791f.isDownloaded() || this.f72791f.isExpiredRedownload() || this.f72782I) {
            DownloadInfo b = this.f72804t.mo53777b(a);
            if (!(b == null || (u = C30399c.m61737u()) == null || b.getId() == id || !b.equalsTask(this.f72791f))) {
                if (!u.mo54279a(b.getId())) {
                    List<DownloadChunk> c = this.f72804t.mo53785c(a);
                    C30535g.m62552a(this.f72791f, true);
                    this.f72804t.mo53795f(a);
                    if (b.isBreakpointAvailable()) {
                        this.f72791f.copyFromCacheData(b, false);
                        this.f72804t.mo53776a(this.f72791f);
                        if (c != null) {
                            for (DownloadChunk downloadChunk : c) {
                                downloadChunk.f72912a = id;
                                this.f72804t.mo53774a(downloadChunk);
                            }
                        }
                        throw new C30438b("retry task because id generator changed");
                    }
                    return;
                }
                this.f72804t.mo53795f(id);
                throw new BaseException(1025, "another same task is downloading");
            }
            return;
        }
        throw new BaseException(1009, "file has downloaded");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo54343b() {
        boolean z;
        C30434a.m62027b(f72773k, "endDownloadRunnable::runStatus=" + this.f72790e);
        int i = 0;
        if (this.f72790e == EnumC30296j.RUN_STATUS_PAUSE || this.f72790e == EnumC30296j.RUN_STATUS_CANCELED) {
            z = false;
        } else {
            z = true;
        }
        try {
            if (!m62475n()) {
                if (0 == 0) {
                    this.f72778E = true;
                    C30434a.m62027b(f72773k, "jump to restart");
                    return;
                }
            }
        } catch (Exception e) {
            if (e instanceof BaseException) {
                this.f72792g.mo54071a((BaseException) e);
            } else {
                this.f72792g.mo54071a(new BaseException(1046, e));
            }
        }
        this.f72789d.set(false);
        if (z) {
            try {
                AbstractC30474a u = C30399c.m61737u();
                if (u != null) {
                    u.mo54276a(this);
                }
            } catch (Throwable th) {
                AbstractC30389w monitorDepend = this.f72787b.getMonitorDepend();
                DownloadInfo downloadInfo = this.f72791f;
                BaseException baseException = new BaseException(1014, C30535g.m62576b(th, "removeDownloadRunnable"));
                DownloadInfo downloadInfo2 = this.f72791f;
                if (downloadInfo2 != null) {
                    i = downloadInfo2.getStatus();
                }
                C30439a.m62034a(monitorDepend, downloadInfo, baseException, i);
            }
        }
    }

    /* renamed from: n */
    private boolean m62475n() {
        if (this.f72790e == EnumC30296j.RUN_STATUS_ERROR) {
            this.f72792g.mo54071a(this.f72810z);
        } else if (this.f72790e == EnumC30296j.RUN_STATUS_CANCELED) {
            this.f72792g.mo54074b();
        } else if (this.f72790e == EnumC30296j.RUN_STATUS_PAUSE) {
            this.f72792g.mo54075c();
        } else if (this.f72790e == EnumC30296j.RUN_STATUS_END_RIGHT_NOW) {
            try {
                C30411g gVar = this.f72792g;
                if (gVar.f72499b) {
                    gVar.mo54077e();
                    C30434a.m62027b(C30411g.f72498a, "onCompleteForFileExist");
                    gVar.f72500c.setSuccessByCache(true);
                    gVar.mo54068a(-3);
                    gVar.f72501d.mo53784c(gVar.f72500c.getId(), gVar.f72500c.getTotalBytes());
                    gVar.f72501d.mo53790d(gVar.f72500c.getId());
                    gVar.f72501d.mo53776a(gVar.f72500c);
                    gVar.f72501d.mo53812l(gVar.f72500c.getId());
                } else {
                    gVar.mo54077e();
                    C30434a.m62027b(C30411g.f72498a, "onCompleteForFileExist");
                    gVar.f72500c.setSuccessByCache(true);
                    gVar.mo54068a(-3);
                    gVar.f72501d.mo53784c(gVar.f72500c.getId(), gVar.f72500c.getTotalBytes());
                    gVar.f72501d.mo53790d(gVar.f72500c.getId());
                    gVar.f72501d.mo53812l(gVar.f72500c.getId());
                }
            } catch (BaseException e) {
                this.f72792g.mo54071a(e);
            }
        } else if (this.f72790e == EnumC30296j.RUN_STATUS_END_FOR_FILE_EXIST) {
            try {
                C30411g gVar2 = this.f72792g;
                String str = this.f72780G;
                String str2 = this.f72781H;
                C30434a.m62027b(C30411g.f72498a, "onCompleteForFileExist existTargetFileName is " + str2 + " but curName is " + gVar2.f72500c.getName());
                if (gVar2.f72499b) {
                    C30535g.m62551a(gVar2.f72500c, str, str2);
                    gVar2.mo54077e();
                    gVar2.f72500c.setSuccessByCache(true);
                    gVar2.mo54068a(-3);
                    gVar2.f72501d.mo53776a(gVar2.f72500c);
                } else {
                    gVar2.f72501d.mo53776a(gVar2.f72500c);
                    C30535g.m62551a(gVar2.f72500c, str, str2);
                    gVar2.f72500c.setSuccessByCache(true);
                    gVar2.mo54077e();
                    gVar2.mo54068a(-3);
                }
            } catch (BaseException e2) {
                this.f72792g.mo54071a(e2);
            }
        } else if (this.f72790e == EnumC30296j.RUN_STATUS_ALL_CHUNK_RETRY_WITH_RESET) {
            this.f72792g.mo54072a(this.f72810z, false);
            return false;
        } else if (this.f72790e == EnumC30296j.RUN_STATUS_WAITING_ASYNC_HANDLER) {
            return true;
        } else {
            if (this.f72790e != EnumC30296j.RUN_STATUS_RETRY_DELAY || m62476o()) {
                try {
                    if (!m62477p()) {
                        return false;
                    }
                    this.f72792g.mo54076d();
                    C30506r.m62442c().mo54318d();
                } catch (Throwable th) {
                    mo54344b(new BaseException(1008, C30535g.m62576b(th, "doTaskStatusHandle onComplete")));
                }
            } else {
                C30434a.m62027b(f72773k, "doTaskStatusHandle retryDelay");
                this.f72790e = EnumC30296j.RUN_STATUS_NONE;
                if (this.f72790e == EnumC30296j.RUN_STATUS_RETRY_DELAY) {
                    return true;
                }
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00cd, code lost:
        if (r8 != false) goto L_0x011f;
     */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m62479r() {
        /*
        // Method dump skipped, instructions count: 456
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.socialbase.downloader.p2188j.RunnableC30515c.m62479r():void");
    }

    @Override // com.p2082ss.android.socialbase.downloader.p2188j.AbstractC30522f
    /* renamed from: c */
    public final void mo54347c(BaseException baseException) {
        DownloadInfo downloadInfo = this.f72791f;
        if (downloadInfo != null) {
            downloadInfo.setChunkDowngradeRetryUsed(true);
        }
        mo54337a(baseException, false);
    }

    @Override // com.p2082ss.android.socialbase.downloader.p2188j.AbstractC30522f
    /* renamed from: b */
    public final void mo54344b(BaseException baseException) {
        C30434a.m62027b(f72773k, "onError:" + baseException.getMessage());
        this.f72790e = EnumC30296j.RUN_STATUS_ERROR;
        this.f72810z = baseException;
        mo54350f();
    }

    /* renamed from: d */
    private boolean m62467d(BaseException baseException) {
        AtomicInteger atomicInteger = this.f72797m;
        boolean z = true;
        if (atomicInteger != null) {
            if (atomicInteger.get() <= 0 || (baseException != null && baseException.getErrorCode() == 1070)) {
                if (this.f72791f.trySwitchToNextBackupUrl()) {
                    this.f72797m.set(this.f72791f.getBackUpUrlRetryCount());
                    this.f72791f.updateCurRetryTime(this.f72797m.get());
                } else if (baseException == null || ((baseException.getErrorCode() != 1011 && (baseException.getCause() == null || !(baseException.getCause() instanceof SSLHandshakeException))) || !this.f72791f.canReplaceHttpForRetry())) {
                    mo54344b(new BaseException(baseException.getErrorCode(), C1764a.m5928a("retry for exception, but current retry time : %s , retry Time %s all used, last error is %s", new Object[]{String.valueOf(this.f72797m), String.valueOf(this.f72791f.getRetryCount()), baseException.getErrorMessage()})));
                    return true;
                } else {
                    this.f72797m.set(this.f72791f.getRetryCount());
                    this.f72791f.updateCurRetryTime(this.f72797m.get());
                    this.f72791f.setHttpsToHttpRetryUsed(true);
                }
                z = false;
            }
            if (this.f72790e != EnumC30296j.RUN_STATUS_RETRY_DELAY && z) {
                this.f72791f.updateCurRetryTime(this.f72797m.decrementAndGet());
            }
            return false;
        }
        mo54344b(new BaseException(1043, "retry for exception, but retain retry time is null, last error is :" + baseException.getErrorMessage()));
        return true;
    }

    @Override // com.p2082ss.android.socialbase.downloader.p2188j.AbstractC30522f
    /* renamed from: b */
    public final boolean mo54345b(long j) {
        long j2;
        int a;
        if (this.f72783J > 0 && this.f72791f.getCurBytes() > this.f72783J) {
            try {
                j2 = C30535g.m62571b(this.f72791f.getTempPath());
            } catch (BaseException unused) {
                j2 = 0;
            }
            String str = f72773k;
            StringBuilder sb = new StringBuilder("checkSpaceOverflowInProgress: available = ");
            double d = (double) j2;
            Double.isNaN(d);
            C30434a.m62028c(str, sb.append(d / 1048576.0d).append("MB").toString());
            if (j2 > 0) {
                long totalBytes = this.f72791f.getTotalBytes() - this.f72791f.getCurBytes();
                if (j2 < totalBytes && (a = C30472a.m62087a(this.f72791f.getId(), (DownloadInfo) null).mo54258a("space_fill_min_keep_mb", 100)) > 0) {
                    long j3 = j2 - (((long) a) * 1048576);
                    StringBuilder append = new StringBuilder("checkSpaceOverflowInProgress: minKeep  = ").append(a).append("MB, canDownload = ");
                    double d2 = (double) j3;
                    Double.isNaN(d2);
                    C30434a.m62028c(str, append.append(d2 / 1048576.0d).append("MB").toString());
                    if (j3 > 0) {
                        this.f72783J = this.f72791f.getCurBytes() + j3 + 1048576;
                    } else {
                        this.f72783J = 0;
                        throw new DownloadOutOfSpaceException(j2, totalBytes);
                    }
                }
            }
            this.f72783J = 0;
        }
        C30411g gVar = this.f72792g;
        gVar.f72503f.addAndGet(j);
        gVar.f72500c.increaseCurBytes(j);
        long uptimeMillis = SystemClock.uptimeMillis();
        boolean z = true;
        if (!gVar.f72504g) {
            gVar.f72504g = true;
        } else {
            long j4 = uptimeMillis - gVar.f72502e;
            if (gVar.f72503f.get() >= gVar.f72506i || j4 >= ((long) gVar.f72505h)) {
                gVar.f72502e = uptimeMillis;
                gVar.f72503f.set(0);
            } else {
                z = false;
            }
        }
        return gVar.mo54073a(z);
    }

    /* renamed from: a */
    private static boolean m62466a(File file) {
        MethodCollector.m26663i(11165);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(11165);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(11165);
        return delete;
    }

    @Override // com.p2082ss.android.socialbase.downloader.p2188j.AbstractC30522f
    /* renamed from: a */
    public final void mo54337a(BaseException baseException, boolean z) {
        C30434a.m62027b(f72773k, "onAllChunkRetryWithReset");
        this.f72790e = EnumC30296j.RUN_STATUS_ALL_CHUNK_RETRY_WITH_RESET;
        this.f72810z = baseException;
        mo54350f();
        if (!z || !m62467d(baseException)) {
            m62480s();
        }
    }

    /* renamed from: a */
    private void m62462a(String str, String str2) {
        this.f72804t.mo53790d(this.f72791f.getId());
        this.f72804t.mo53812l(this.f72791f.getId());
        C30535g.m62552a(this.f72791f, true);
        this.f72800p = false;
        this.f72791f.resetDataForEtagEndure(str);
        this.f72804t.mo53776a(this.f72791f);
        throw new C30438b(str2);
    }

    /* renamed from: a */
    private void m62461a(long j, int i) {
        long j2;
        long j3 = j / ((long) i);
        int id = this.f72791f.getId();
        ArrayList arrayList = new ArrayList();
        long j4 = 0;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 == i - 1) {
                j2 = 0;
            } else {
                j2 = (j4 + j3) - 1;
            }
            DownloadChunk.C30583a aVar = new DownloadChunk.C30583a(id);
            aVar.f72931f = i2;
            aVar.f72927b = j4;
            aVar.f72932g = j4;
            aVar.f72928c = j4;
            aVar.f72929d = j2;
            DownloadChunk a = aVar.mo54416a();
            arrayList.add(a);
            this.f72804t.mo53774a(a);
            j4 += j3;
        }
        this.f72791f.setChunkCount(i);
        this.f72804t.mo53764a(id, i);
        m62464a(arrayList, j);
    }

    public RunnableC30515c(DownloadTask downloadTask, Handler handler) {
        this.f72787b = downloadTask;
        if (downloadTask != null) {
            this.f72791f = downloadTask.getDownloadInfo();
            this.f72805u = downloadTask.getChunkStrategy();
            this.f72807w = downloadTask.getChunkAdjustCalculator();
            this.f72775B = downloadTask.getForbiddenHandler();
            this.f72776C = downloadTask.getDiskSpaceHandler();
            AbstractC30429u retryDelayTimeCalculator = downloadTask.getRetryDelayTimeCalculator();
            if (retryDelayTimeCalculator == null) {
                DownloadInfo downloadInfo = downloadTask.getDownloadInfo();
                if (downloadInfo != null) {
                    String retryDelayTimeArray = downloadInfo.getRetryDelayTimeArray();
                    if (!TextUtils.isEmpty(retryDelayTimeArray)) {
                        retryDelayTimeCalculator = new C30505q(retryDelayTimeArray);
                    }
                }
                retryDelayTimeCalculator = C30399c.m61742z();
            }
            this.f72809y = retryDelayTimeCalculator;
            this.f72784K = C30472a.m62087a(this.f72791f.getId(), (DownloadInfo) null);
        } else {
            this.f72784K = C30472a.f72639a;
        }
        m62468g();
        this.f72804t = C30399c.m61733q();
        this.f72806v = C30399c.m61740x();
        this.f72808x = C30399c.m61741y();
        this.f72792g = new C30411g(downloadTask, handler);
        this.f72789d = new AtomicBoolean(true);
    }

    /* renamed from: a */
    private void m62463a(String str, List<HttpHeader> list) {
        AbstractC30462i iVar;
        boolean z;
        C30448d b;
        if (this.f72793h == null) {
            if (this.f72791f.getChunkCount() != 1 || (b = C30443a.C30444a.f72562a.mo54231b(str, list)) == null) {
                try {
                    boolean isNeedDefaultHttpServiceBackUp = this.f72791f.isNeedDefaultHttpServiceBackUp();
                    this.f72791f.getMaxBytes();
                    int a = this.f72784K.mo54258a("net_lib_strategy", 0);
                    if (this.f72784K.mo54258a("monitor_download_connect", 0) > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    iVar = C30399c.m61686a(isNeedDefaultHttpServiceBackUp, str, null, list, a, z, this.f72791f);
                    this.f72793h = iVar;
                } catch (BaseException e) {
                    throw e;
                } catch (Throwable th) {
                    mo54338a(this.f72793h);
                    throw th;
                }
                mo54338a(iVar);
            } else {
                mo54338a(this.f72793h);
                this.f72791f.setPreconnectLevel(2);
                this.f72793h = b;
            }
            if (this.f72793h == null) {
                throw new BaseException(1022, new IOException("download can't continue, firstConnection is null"));
            }
        }
    }

    /* renamed from: a */
    private void m62464a(List<DownloadChunk> list, long j) {
        long i;
        for (DownloadChunk downloadChunk : list) {
            if (downloadChunk != null) {
                if (downloadChunk.f72914c == 0) {
                    i = j - downloadChunk.mo54411i();
                } else {
                    i = (downloadChunk.f72914c - downloadChunk.mo54411i()) + 1;
                }
                if (i > 0) {
                    downloadChunk.f72915d = i;
                    if (!this.f72791f.isNeedReuseFirstConnection() || this.f72793h == null || (this.f72791f.isHeadConnectionAvailable() && !this.f72779F)) {
                        this.f72798n.add(new RunnableC30514b(downloadChunk, this.f72787b, this));
                    } else if (downloadChunk.f72916e == 0) {
                        this.f72798n.add(new RunnableC30514b(downloadChunk, this.f72787b, this.f72793h, this));
                    } else if (downloadChunk.f72916e > 0) {
                        this.f72798n.add(new RunnableC30514b(downloadChunk, this.f72787b, this));
                    }
                }
            }
        }
        if (C30528a.m62524a(64)) {
            ArrayList arrayList = new ArrayList(this.f72798n.size());
            Iterator<RunnableC30514b> it = this.f72798n.iterator();
            while (it.hasNext()) {
                RunnableC30514b next = it.next();
                if (this.f72790e == EnumC30296j.RUN_STATUS_CANCELED) {
                    next.mo54331b();
                } else if (this.f72790e == EnumC30296j.RUN_STATUS_PAUSE) {
                    next.mo54330a();
                } else {
                    arrayList.add(next);
                }
            }
            try {
                List<Future> c = C30488e.m62182c(arrayList);
                for (Runnable runnable = (Runnable) arrayList.remove(0); runnable != null; runnable = C30488e.m62183d(c)) {
                    if (!mo54348d()) {
                        try {
                            runnable.run();
                        } catch (Throwable unused) {
                        }
                    } else {
                        return;
                    }
                }
                if (!c.isEmpty()) {
                    for (Future future : c) {
                        if (future != null && !future.isDone()) {
                            try {
                                future.get();
                            } catch (Throwable unused2) {
                            }
                        }
                    }
                }
            } catch (Throwable unused3) {
            }
        } else {
            ArrayList arrayList2 = new ArrayList(this.f72798n.size());
            Iterator<RunnableC30514b> it2 = this.f72798n.iterator();
            while (it2.hasNext()) {
                RunnableC30514b next2 = it2.next();
                if (this.f72790e == EnumC30296j.RUN_STATUS_CANCELED) {
                    next2.mo54331b();
                } else if (this.f72790e == EnumC30296j.RUN_STATUS_PAUSE) {
                    next2.mo54330a();
                } else {
                    arrayList2.add(Executors.callable(next2));
                }
            }
            if (!mo54348d()) {
                try {
                    ExecutorService k = C30399c.m61727k();
                    if (k != null) {
                        k.invokeAll(arrayList2);
                    }
                } catch (InterruptedException e) {
                    throw new BaseException(1020, e);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00e8, code lost:
        if (m62467d(r12) == false) goto L_0x0119;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00ea, code lost:
        r0 = com.p2082ss.android.socialbase.downloader.exception.EnumC30437a.RETURN;
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(11472);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00ef, code lost:
        return r0;
     */
    @Override // com.p2082ss.android.socialbase.downloader.p2188j.AbstractC30522f
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.p2082ss.android.socialbase.downloader.exception.EnumC30437a mo54342b(com.p2082ss.android.socialbase.downloader.exception.BaseException r12, long r13) {
        /*
        // Method dump skipped, instructions count: 311
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.socialbase.downloader.p2188j.RunnableC30515c.mo54342b(com.ss.android.socialbase.downloader.exception.BaseException, long):com.ss.android.socialbase.downloader.exception.a");
    }

    /* renamed from: a */
    private boolean m62465a(int i, String str, String str2) {
        if (i == 412) {
            return true;
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !str.equals(str2) && (this.f72802r || this.f72801q)) {
            return true;
        }
        if ((i == 201 || i == 416) && this.f72791f.getCurBytes() > 0) {
            return true;
        }
        return false;
    }
}
