package com.p2082ss.android.socialbase.downloader.downloader;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.socialbase.downloader.exception.BaseException;
import com.p2082ss.android.socialbase.downloader.impls.C30483d;
import com.p2082ss.android.socialbase.downloader.impls.C30498k;
import com.p2082ss.android.socialbase.downloader.impls.C30499l;
import com.p2082ss.android.socialbase.downloader.model.C30593c;
import com.p2082ss.android.socialbase.downloader.model.DownloadChunk;
import com.p2082ss.android.socialbase.downloader.model.DownloadInfo;
import com.p2082ss.android.socialbase.downloader.p2178a.C30283a;
import com.p2082ss.android.socialbase.downloader.p2180c.BinderC30305e;
import com.p2082ss.android.socialbase.downloader.p2184g.AbstractC30462i;
import com.p2082ss.android.socialbase.downloader.p2186h.AbstractC30470b;
import com.p2082ss.android.socialbase.downloader.p2186h.C30468a;
import com.p2082ss.android.socialbase.downloader.p2186h.C30471c;
import com.p2082ss.android.socialbase.downloader.p2187i.C30472a;
import com.p2082ss.android.socialbase.downloader.p2188j.AbstractC30522f;
import com.p2082ss.android.socialbase.downloader.p2189k.C30535g;
import java.io.InputStream;
import java.util.concurrent.ExecutorService;

/* renamed from: com.ss.android.socialbase.downloader.downloader.f */
public final class C30409f {

    /* renamed from: h */
    private static String f72466h = "ResponseHandler";

    /* renamed from: A */
    private long f72467A;

    /* renamed from: B */
    private long f72468B;

    /* renamed from: C */
    private long f72469C;

    /* renamed from: D */
    private long f72470D;

    /* renamed from: E */
    private volatile long f72471E;

    /* renamed from: a */
    public final AbstractC30462i f72472a;

    /* renamed from: b */
    public long f72473b;

    /* renamed from: c */
    public long f72474c;

    /* renamed from: d */
    public volatile long f72475d;

    /* renamed from: e */
    public volatile long f72476e;

    /* renamed from: f */
    boolean f72477f;

    /* renamed from: g */
    public volatile long f72478g;

    /* renamed from: i */
    private final DownloadInfo f72479i;

    /* renamed from: j */
    private final String f72480j;

    /* renamed from: k */
    private final DownloadChunk f72481k;

    /* renamed from: l */
    private AbstractC30420l f72482l;

    /* renamed from: m */
    private C30498k f72483m;

    /* renamed from: n */
    private AbstractC30430v f72484n;

    /* renamed from: o */
    private C30593c f72485o;

    /* renamed from: p */
    private BaseException f72486p;

    /* renamed from: q */
    private volatile boolean f72487q;

    /* renamed from: r */
    private volatile boolean f72488r;

    /* renamed from: s */
    private final AbstractC30522f f72489s;

    /* renamed from: t */
    private final C30472a f72490t;

    /* renamed from: u */
    private final C30283a f72491u;

    /* renamed from: v */
    private final boolean f72492v;

    /* renamed from: w */
    private final long f72493w;

    /* renamed from: x */
    private final long f72494x;

    /* renamed from: y */
    private final boolean f72495y;

    /* renamed from: z */
    private boolean f72496z;

    static {
        Covode.recordClassIndex(36928);
    }

    /* renamed from: d */
    private boolean m61766d() {
        if (this.f72487q || this.f72488r) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo54063a() {
        if (!this.f72487q) {
            this.f72487q = true;
            m61767e();
        }
    }

    /* renamed from: b */
    public final void mo54064b() {
        if (!this.f72488r) {
            this.f72488r = true;
            m61767e();
        }
    }

    /* renamed from: e */
    private void m61767e() {
        ExecutorService g;
        if (this.f72472a != null && (g = C30399c.m61721g()) != null) {
            g.execute(new Runnable() {
                /* class com.p2082ss.android.socialbase.downloader.downloader.C30409f.RunnableC304101 */

                static {
                    Covode.recordClassIndex(36929);
                }

                public final void run() {
                    try {
                        C30409f.this.f72472a.mo54238d();
                    } catch (Throwable unused) {
                    }
                }
            });
        }
    }

    /* renamed from: f */
    private void m61768f() {
        long j;
        if (this.f72495y) {
            j = System.nanoTime();
        } else {
            j = 0;
        }
        boolean z = false;
        try {
            this.f72485o.mo54804a();
            this.f72479i.updateRealDownloadTime(true);
            if (this.f72479i.getChunkCount() > 1) {
                z = true;
            }
            AbstractC30423o a = C30499l.m62246a(C30535g.m62579b());
            if (z) {
                m61765a(this.f72484n);
                if (a != null) {
                    a.mo54178c(this.f72479i);
                } else {
                    this.f72484n.mo53765a(this.f72479i.getId(), this.f72479i.getCurBytes());
                }
            } else if (a != null) {
                a.mo54178c(this.f72479i);
            } else {
                this.f72484n.mo53765a(this.f72481k.f72912a, this.f72473b);
            }
            this.f72478g = this.f72473b;
        } catch (Exception unused) {
        }
        if (this.f72495y) {
            this.f72469C += System.nanoTime() - j;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: com.ss.android.socialbase.downloader.i.a */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v40 */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0242, code lost:
        r3 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0245, code lost:
        r3 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x02a2, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x02db, code lost:
        r3 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x013e, code lost:
        if (r21 <= 500) goto L_0x0145;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x02a2 A[ExcHandler: BaseException (e com.ss.android.socialbase.downloader.exception.BaseException), Splitter:B:22:0x0091] */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x02e0 A[SYNTHETIC, Splitter:B:176:0x02e0] */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x02fc  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x038d  */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x041a  */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x0420  */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x04c2  */
    /* JADX WARNING: Removed duplicated region for block: B:301:0x055f  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo54065c() {
        /*
        // Method dump skipped, instructions count: 1547
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.socialbase.downloader.downloader.C30409f.mo54065c():void");
    }

    /* renamed from: a */
    private AbstractC30470b m61764a(InputStream inputStream) {
        int w = C30399c.m61739w();
        if (this.f72490t.mo54258a("rw_concurrent", 0) == 1 && this.f72479i.getChunkCount() == 1 && this.f72479i.getTotalBytes() > 20971520) {
            try {
                C30468a aVar = new C30468a(inputStream, w, this.f72490t.mo54258a("rw_concurrent_max_buffer_count", 4));
                this.f72496z = true;
                return aVar;
            } catch (Throwable unused) {
            }
        }
        C30471c cVar = new C30471c(inputStream, w);
        this.f72496z = false;
        return cVar;
    }

    /* renamed from: a */
    private void m61765a(AbstractC30420l lVar) {
        DownloadChunk downloadChunk;
        if (lVar != null) {
            AbstractC30423o oVar = null;
            boolean z = lVar instanceof BinderC30305e;
            if (!z || (oVar = C30499l.m62246a(C30535g.m62579b())) != null) {
                if (this.f72481k.mo54403b()) {
                    downloadChunk = this.f72481k.mo54404c();
                } else {
                    downloadChunk = this.f72481k;
                }
                if (downloadChunk != null) {
                    downloadChunk.mo54398a(this.f72473b);
                    if (!z || oVar == null) {
                        lVar.mo53770a(downloadChunk.f72912a, downloadChunk.f72916e, downloadChunk.mo54396a(), this.f72473b);
                    } else {
                        oVar.mo54149a(downloadChunk.f72912a, downloadChunk.f72916e, downloadChunk.mo54396a(), this.f72473b);
                    }
                    if (downloadChunk.mo54407e()) {
                        if (downloadChunk.mo54408f()) {
                            long g = downloadChunk.mo54409g();
                            if (g > this.f72473b) {
                                if (!z || oVar == null) {
                                    lVar.mo53771a(downloadChunk.f72912a, downloadChunk.mo54396a(), g);
                                    return;
                                } else {
                                    oVar.mo54150a(downloadChunk.f72912a, downloadChunk.mo54396a(), g);
                                    return;
                                }
                            }
                        }
                        if (!z || oVar == null) {
                            lVar.mo53771a(downloadChunk.f72912a, downloadChunk.mo54396a(), this.f72473b);
                        } else {
                            oVar.mo54150a(downloadChunk.f72912a, downloadChunk.mo54396a(), this.f72473b);
                        }
                    }
                } else if (!this.f72481k.mo54403b()) {
                } else {
                    if (!z || oVar == null) {
                        lVar.mo53771a(this.f72481k.f72912a, this.f72481k.f72916e, this.f72473b);
                    } else {
                        oVar.mo54150a(this.f72481k.f72912a, this.f72481k.f72916e, this.f72473b);
                    }
                }
            }
        }
    }

    public C30409f(DownloadInfo downloadInfo, String str, AbstractC30462i iVar, DownloadChunk downloadChunk, AbstractC30522f fVar) {
        boolean z;
        this.f72479i = downloadInfo;
        this.f72480j = str;
        AbstractC30420l q = C30399c.m61733q();
        this.f72482l = q;
        if (q instanceof C30483d) {
            C30483d dVar = (C30483d) q;
            this.f72483m = dVar.f72682a;
            this.f72484n = dVar.f72683b;
        }
        this.f72472a = iVar;
        this.f72481k = downloadChunk;
        this.f72489s = fVar;
        long i = downloadChunk.mo54411i();
        this.f72473b = i;
        this.f72474c = i;
        boolean z2 = false;
        if (downloadChunk.mo54403b()) {
            this.f72476e = downloadChunk.f72915d;
        } else {
            this.f72476e = downloadChunk.mo54402b(false);
        }
        this.f72475d = downloadChunk.f72914c;
        this.f72491u = C30283a.C30286b.f72251a;
        C30472a a = C30472a.m62087a(downloadInfo.getId(), (DownloadInfo) null);
        this.f72490t = a;
        if (a.mo54258a("sync_strategy", 0) == 1) {
            z = true;
        } else {
            z = false;
        }
        this.f72492v = z;
        if (z) {
            this.f72493w = Math.max((long) a.mo54258a("sync_interval_ms_fg", 5000), 500L);
            this.f72494x = Math.max((long) a.mo54258a("sync_interval_ms_bg", 1000), 500L);
        } else {
            this.f72493w = 0;
            this.f72494x = 0;
        }
        this.f72495y = a.mo54258a("monitor_rw", 0) == 1 ? true : z2;
    }
}
