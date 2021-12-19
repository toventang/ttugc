package com.p2082ss.ttm.player;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.ParcelFileDescriptor;
import android.os.PowerManager;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.ttm.net.AVResolver;
import com.p2082ss.ttm.p4406a.C86218a;
import com.p2082ss.ttm.p4406a.C86219b;
import com.p2082ss.ttm.player.AbstractC86253m;
import java.io.FileDescriptor;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: com.ss.ttm.player.TTPlayerClient */
public class TTPlayerClient extends AbstractC86265n implements Handler.Callback, AbstractC86250j {

    /* renamed from: a */
    public static final String f192574a = TTPlayerClient.class.getSimpleName();

    /* renamed from: A */
    private int f192575A;

    /* renamed from: B */
    private StringBuilder f192576B;

    /* renamed from: C */
    private int f192577C;

    /* renamed from: D */
    private int f192578D;

    /* renamed from: E */
    private AbstractC86253m.AbstractC86259f f192579E;

    /* renamed from: F */
    private AbstractC86253m.AbstractC86258e f192580F;

    /* renamed from: G */
    private AbstractC86253m.AbstractC86256c f192581G;

    /* renamed from: H */
    private AbstractC86253m.AbstractC86260g f192582H;

    /* renamed from: I */
    private AbstractC86253m.AbstractC86255b f192583I;

    /* renamed from: J */
    private AbstractC86253m.AbstractC86257d f192584J;

    /* renamed from: K */
    private AbstractC86253m.AbstractC86262i f192585K;

    /* renamed from: L */
    private AbstractC86253m.AbstractC86254a f192586L;

    /* renamed from: M */
    private AbstractC86253m.AbstractC86263j f192587M;

    /* renamed from: N */
    private AbstractC86253m.AbstractC86264k f192588N;

    /* renamed from: O */
    private HashMap<Integer, Integer> f192589O;

    /* renamed from: P */
    private int f192590P;

    /* renamed from: b */
    LinkedList<String> f192591b = new LinkedList<>();

    /* renamed from: c */
    final Object f192592c = new Object();

    /* renamed from: d */
    public final ReentrantReadWriteLock.ReadLock f192593d;

    /* renamed from: e */
    int f192594e;

    /* renamed from: f */
    public AbstractC86251k f192595f;

    /* renamed from: g */
    String f192596g;

    /* renamed from: h */
    String f192597h;

    /* renamed from: i */
    Handler f192598i;

    /* renamed from: j */
    private AbstractC86253m f192599j;

    /* renamed from: k */
    private SurfaceHolder f192600k;

    /* renamed from: l */
    private Surface f192601l;

    /* renamed from: m */
    private Context f192602m;

    /* renamed from: n */
    private String f192603n;

    /* renamed from: o */
    private boolean f192604o;

    /* renamed from: p */
    private boolean f192605p = true;

    /* renamed from: q */
    private SurfaceHolder$CallbackC86288x f192606q;

    /* renamed from: r */
    private PowerManager.WakeLock f192607r;

    /* renamed from: s */
    private boolean f192608s;

    /* renamed from: t */
    private long f192609t = 0;

    /* renamed from: u */
    private volatile boolean f192610u = false;

    /* renamed from: v */
    private int f192611v = -1;

    /* renamed from: w */
    private final ReentrantLock f192612w = new ReentrantLock();

    /* renamed from: x */
    private final ReentrantLock f192613x = new ReentrantLock();

    /* renamed from: y */
    private final ReentrantReadWriteLock f192614y;

    /* renamed from: z */
    private final ReentrantReadWriteLock.WriteLock f192615z;

    @Override // com.p2082ss.ttm.player.AbstractC86265n
    /* renamed from: a */
    public final void mo136723a(int i, int i2) {
        if (this.f192595f != null) {
            this.f192593d.lock();
            try {
                if (mo136775t()) {
                    this.f192595f.mo136832c(i, i2);
                }
            } finally {
                this.f192593d.unlock();
            }
        }
    }

    @Override // com.p2082ss.ttm.player.AbstractC86265n
    /* renamed from: a */
    public final void mo136726a(Context context, Uri uri, Map<String, String> map) {
        if (uri != null) {
            mo136725a(context, uri);
            if (map != null && map.size() != 0) {
                StringBuilder sb = new StringBuilder();
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    sb.append(entry.getKey()).append(":").append(entry.getValue()).append("\r\n");
                }
                this.f192593d.lock();
                try {
                    if (mo136775t()) {
                        this.f192595f.mo136811a(20, sb.toString());
                    }
                } finally {
                    this.f192593d.unlock();
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0056, code lost:
        if (0 == 0) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0059, code lost:
        if (0 == 0) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005b, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005e, code lost:
        m148228b(r6.toString());
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(9067);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0068, code lost:
        return;
     */
    @Override // com.p2082ss.ttm.player.AbstractC86265n
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo136725a(android.content.Context r5, android.net.Uri r6) {
        /*
        // Method dump skipped, instructions count: 116
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.ttm.player.TTPlayerClient.mo136725a(android.content.Context, android.net.Uri):void");
    }

    @Override // com.p2082ss.ttm.player.AbstractC86265n
    /* renamed from: a */
    public final void mo136741a(FileDescriptor fileDescriptor, long j, long j2) {
        m148227a(fileDescriptor);
        this.f192593d.lock();
        try {
            if (mo136775t()) {
                this.f192595f.mo136810a(135, j);
                this.f192595f.mo136810a(136, j2);
            }
        } finally {
            this.f192593d.unlock();
        }
    }

    @Override // com.p2082ss.ttm.player.AbstractC86265n
    /* renamed from: a */
    public final void mo136729a(IMediaDataSource iMediaDataSource) {
        if (iMediaDataSource != null) {
            this.f192593d.lock();
            try {
                if (mo136775t()) {
                    this.f192595f.mo136818a(iMediaDataSource);
                }
            } finally {
                this.f192593d.unlock();
            }
        } else {
            throw new IllegalArgumentException("null mediadatasource pointer.");
        }
    }

    @Override // com.p2082ss.ttm.player.AbstractC86265n
    /* renamed from: a */
    public final void mo136743a(boolean z) {
        this.f192593d.lock();
        try {
            if (mo136775t()) {
                this.f192595f.mo136829b(z ? 1 : 0);
            }
        } finally {
            this.f192593d.unlock();
        }
    }

    @Override // com.p2082ss.ttm.player.AbstractC86265n
    /* renamed from: a */
    public final void mo136727a(Surface surface) {
        this.f192593d.lock();
        try {
            if (mo136775t()) {
                this.f192601l = surface;
                this.f192595f.mo136816a(surface);
            }
        } finally {
            this.f192593d.unlock();
        }
    }

    @Override // com.p2082ss.ttm.player.AbstractC86265n
    /* renamed from: a */
    public final void mo136742a(String str) {
        this.f192593d.lock();
        try {
            if (mo136775t()) {
                this.f192595f.mo136824a(str, 1);
            }
        } finally {
            this.f192593d.unlock();
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0060  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo136724a(int r9, int r10, int r11, java.lang.String r12) {
        /*
        // Method dump skipped, instructions count: 692
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.ttm.player.TTPlayerClient.mo136724a(int, int, int, java.lang.String):void");
    }

    @Override // com.p2082ss.ttm.player.AbstractC86265n
    /* renamed from: a */
    public final void mo136731a(AbstractC86253m.AbstractC86254a aVar) {
        this.f192586L = aVar;
        this.f192609t |= 8;
        this.f192593d.lock();
        try {
            if (mo136775t()) {
                this.f192595f.mo136815a(this.f192609t);
            }
        } finally {
            this.f192593d.unlock();
        }
    }

    @Override // com.p2082ss.ttm.player.AbstractC86265n
    /* renamed from: a */
    public final void mo136732a(AbstractC86253m.AbstractC86255b bVar) {
        this.f192583I = bVar;
        this.f192609t |= 8192;
        this.f192593d.lock();
        try {
            if (mo136775t()) {
                this.f192595f.mo136815a(this.f192609t);
            }
        } finally {
            this.f192593d.unlock();
        }
    }

    @Override // com.p2082ss.ttm.player.AbstractC86265n
    /* renamed from: a */
    public final void mo136733a(AbstractC86253m.AbstractC86256c cVar) {
        this.f192581G = cVar;
        this.f192609t |= 35184372088833L;
        this.f192593d.lock();
        try {
            if (mo136775t()) {
                this.f192595f.mo136815a(this.f192609t);
            }
        } finally {
            this.f192593d.unlock();
        }
    }

    @Override // com.p2082ss.ttm.player.AbstractC86265n
    /* renamed from: a */
    public final void mo136735a(AbstractC86253m.AbstractC86258e eVar) {
        this.f192580F = eVar;
        this.f192609t |= 7385488862257088434L;
        this.f192593d.lock();
        try {
            if (mo136775t()) {
                this.f192595f.mo136815a(this.f192609t);
            }
        } finally {
            this.f192593d.unlock();
        }
    }

    @Override // com.p2082ss.ttm.player.AbstractC86265n
    /* renamed from: a */
    public final void mo136734a(AbstractC86253m.AbstractC86257d dVar) {
        this.f192584J = dVar;
        this.f192609t |= -8646883788170199040L;
        this.f192593d.lock();
        try {
            if (mo136775t()) {
                this.f192595f.mo136815a(this.f192609t);
            }
        } finally {
            this.f192593d.unlock();
        }
    }

    @Override // com.p2082ss.ttm.player.AbstractC86265n
    /* renamed from: a */
    public final void mo136730a(AbstractC86246f fVar) {
        this.f192593d.lock();
        try {
            if (mo136775t()) {
                this.f192595f.mo136822a(fVar);
            }
        } finally {
            this.f192593d.unlock();
        }
    }

    @Override // com.p2082ss.ttm.player.AbstractC86265n
    /* renamed from: a */
    public final void mo136736a(AbstractC86253m.AbstractC86260g gVar) {
        this.f192582H = gVar;
        this.f192609t |= 4;
        this.f192593d.lock();
        try {
            if (mo136775t()) {
                this.f192595f.mo136815a(this.f192609t);
            }
        } finally {
            this.f192593d.unlock();
        }
    }

    @Override // com.p2082ss.ttm.player.AbstractC86265n
    /* renamed from: a */
    public final void mo136737a(AbstractC86253m.AbstractC86262i iVar) {
        this.f192585K = iVar;
        this.f192609t |= 4096;
        this.f192593d.lock();
        try {
            if (mo136775t()) {
                this.f192595f.mo136815a(this.f192609t);
            }
        } finally {
            this.f192593d.unlock();
        }
    }

    @Override // com.p2082ss.ttm.player.AbstractC86265n
    /* renamed from: a */
    public final void mo136738a(AbstractC86253m.AbstractC86263j jVar) {
        this.f192587M = jVar;
        this.f192609t |= 64;
        this.f192593d.lock();
        try {
            if (mo136775t()) {
                this.f192595f.mo136815a(this.f192609t);
            }
        } finally {
            this.f192593d.unlock();
        }
    }

    @Override // com.p2082ss.ttm.player.AbstractC86265n
    /* renamed from: a */
    public final void mo136739a(AbstractC86253m.AbstractC86264k kVar) {
        this.f192588N = kVar;
        this.f192609t |= 8388608;
        this.f192593d.lock();
        try {
            if (mo136775t()) {
                this.f192595f.mo136815a(this.f192609t);
            }
        } finally {
            this.f192593d.unlock();
        }
    }

    @Override // com.p2082ss.ttm.player.AbstractC86250j
    /* renamed from: a */
    public final void mo136728a(SurfaceHolder surfaceHolder) {
        this.f192600k = surfaceHolder;
        if (!this.f192610u) {
            this.f192593d.lock();
            try {
                if (mo136775t()) {
                    SurfaceHolder surfaceHolder2 = this.f192600k;
                    if (surfaceHolder != surfaceHolder2) {
                        if (surfaceHolder2 != null) {
                            surfaceHolder2.removeCallback(this.f192606q);
                        }
                        this.f192600k = surfaceHolder;
                        if (surfaceHolder != null) {
                            surfaceHolder.addCallback(this.f192606q);
                        }
                    }
                    this.f192595f.mo136816a(surfaceHolder.getSurface());
                }
            } finally {
                this.f192593d.unlock();
            }
        }
    }

    @Override // com.p2082ss.ttm.player.AbstractC86265n
    /* renamed from: a */
    public final void mo136740a(C86275p pVar) {
        this.f192593d.lock();
        try {
            if (!(!mo136775t() || pVar == null || pVar.f192718d == -1.0f)) {
                this.f192595f.mo136808a(60, pVar.f192718d);
            }
        } finally {
            this.f192593d.unlock();
        }
    }

    @Override // com.p2082ss.ttm.player.AbstractC86250j
    /* renamed from: b */
    public final void mo136747b() {
        C86219b.m148182a(f192574a, "surface is change");
    }

    @Override // com.p2082ss.ttm.player.AbstractC86265n
    /* renamed from: q */
    public final void mo136768q() {
        if (!this.f192604o) {
            this.f192604o = true;
            m148234v();
        }
    }

    /* renamed from: t */
    public final boolean mo136775t() {
        AbstractC86251k kVar = this.f192595f;
        if (kVar == null || !kVar.mo136840i()) {
            return false;
        }
        return true;
    }

    static {
        Covode.recordClassIndex(101407);
        TTVersion.m148290a();
    }

    /* renamed from: v */
    private void m148234v() {
        boolean z;
        SurfaceHolder surfaceHolder = this.f192600k;
        if (surfaceHolder != null && this.f192578D == 0) {
            if (!this.f192604o || !this.f192608s) {
                z = false;
            } else {
                z = true;
            }
            surfaceHolder.setKeepScreenOn(z);
        }
    }

    @Override // com.p2082ss.ttm.player.AbstractC86265n
    /* renamed from: l */
    public final int mo136763l() {
        this.f192593d.lock();
        try {
            int i = 0;
            if (mo136775t()) {
                i = this.f192595f.mo136809a(2, 0);
            }
            return i;
        } finally {
            this.f192593d.unlock();
        }
    }

    @Override // com.p2082ss.ttm.player.AbstractC86265n
    /* renamed from: m */
    public final int mo136764m() {
        this.f192593d.lock();
        try {
            int i = 0;
            if (mo136775t()) {
                i = this.f192595f.mo136809a(4, 0);
            }
            return i;
        } finally {
            this.f192593d.unlock();
        }
    }

    @Override // com.p2082ss.ttm.player.AbstractC86265n
    /* renamed from: n */
    public final int mo136765n() {
        this.f192593d.lock();
        try {
            int i = 0;
            if (mo136775t()) {
                i = this.f192595f.mo136809a(3, 0);
            }
            return i;
        } finally {
            this.f192593d.unlock();
        }
    }

    @Override // com.p2082ss.ttm.player.AbstractC86265n
    /* renamed from: o */
    public final int mo136766o() {
        this.f192593d.lock();
        try {
            int i = 0;
            if (mo136775t()) {
                i = this.f192595f.mo136809a(1, 0);
            }
            return i;
        } finally {
            this.f192593d.unlock();
        }
    }

    /* renamed from: u */
    private void m148233u() {
        try {
            this.f192612w.lock();
            this.f192611v = this.f192595f.mo136841j();
        } finally {
            if (this.f192612w.isLocked()) {
                this.f192612w.unlock();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    @Override // com.p2082ss.ttm.player.AbstractC86265n
    /* renamed from: f */
    public final void mo136755f() {
        this.f192593d.lock();
        try {
            if (mo136775t()) {
                this.f192595f.mo136834d();
            }
            this.f192593d.unlock();
            m148229c(false);
        } catch (Throwable th) {
            this.f192593d.unlock();
            throw th;
        }
    }

    @Override // com.p2082ss.ttm.player.AbstractC86265n
    /* renamed from: g */
    public final void mo136756g() {
        this.f192615z.lock();
        try {
            if (mo136775t()) {
                this.f192595f.mo136836e();
                SurfaceHolder surfaceHolder = this.f192600k;
                if (surfaceHolder != null) {
                    this.f192595f.mo136816a(surfaceHolder.getSurface());
                }
                this.f192598i.removeCallbacksAndMessages(null);
                this.f192594e = 0;
                this.f192591b.clear();
                m148233u();
            }
        } finally {
            this.f192615z.unlock();
        }
    }

    /* JADX INFO: finally extract failed */
    @Override // com.p2082ss.ttm.player.AbstractC86265n
    /* renamed from: h */
    public final void mo136758h() {
        this.f192593d.lock();
        try {
            if (mo136775t()) {
                this.f192595f.mo136837f();
            }
            this.f192593d.unlock();
            m148229c(false);
        } catch (Throwable th) {
            this.f192593d.unlock();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    @Override // com.p2082ss.ttm.player.AbstractC86265n
    /* renamed from: i */
    public final void mo136760i() {
        this.f192610u = true;
        SurfaceHolder surfaceHolder = this.f192600k;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.f192606q);
        }
        this.f192593d.lock();
        try {
            if (mo136775t()) {
                this.f192595f.mo136812a();
            }
            this.f192593d.unlock();
            this.f192601l = null;
        } catch (Throwable th) {
            this.f192593d.unlock();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    @Override // com.p2082ss.ttm.player.AbstractC86265n
    /* renamed from: j */
    public final void mo136761j() {
        this.f192610u = true;
        SurfaceHolder surfaceHolder = this.f192600k;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.f192606q);
        }
        this.f192593d.lock();
        try {
            if (mo136775t()) {
                this.f192595f.mo136812a();
            }
            this.f192593d.unlock();
            this.f192601l = null;
            new Thread(new Runnable() {
                /* class com.p2082ss.ttm.player.TTPlayerClient.RunnableC862331 */

                static {
                    Covode.recordClassIndex(101408);
                }

                public final void run() {
                    TTPlayerClient.this.mo136753d();
                }
            }).start();
        } catch (Throwable th) {
            this.f192593d.unlock();
            throw th;
        }
    }

    @Override // com.p2082ss.ttm.player.AbstractC86265n
    /* renamed from: k */
    public final void mo136762k() {
        this.f192593d.lock();
        try {
            if (mo136775t()) {
                this.f192594e = 0;
                this.f192591b.clear();
                if (this.f192610u) {
                    this.f192595f.mo136816a(this.f192600k.getSurface());
                    this.f192610u = false;
                }
                this.f192595f.mo136838g();
                m148233u();
            }
        } finally {
            this.f192593d.unlock();
        }
    }

    @Override // com.p2082ss.ttm.player.AbstractC86265n
    /* renamed from: p */
    public final boolean mo136767p() {
        this.f192593d.lock();
        try {
            boolean z = false;
            if (mo136775t() && this.f192595f.mo136809a(6, 0) == 1) {
                z = true;
            }
            return z;
        } finally {
            this.f192593d.unlock();
        }
    }

    @Override // com.p2082ss.ttm.player.AbstractC86265n
    /* renamed from: r */
    public final int mo136769r() {
        this.f192593d.lock();
        try {
            int i = 0;
            if (mo136775t()) {
                i = this.f192595f.mo136809a(11, 0);
            }
            return i;
        } finally {
            this.f192593d.unlock();
        }
    }

    @Override // com.p2082ss.ttm.player.AbstractC86265n
    /* renamed from: s */
    public final boolean mo136770s() {
        this.f192593d.lock();
        try {
            boolean z = false;
            if (mo136775t() && this.f192595f.mo136809a(12, 0) == 1) {
                z = true;
            }
            return z;
        } finally {
            this.f192593d.unlock();
        }
    }

    @Override // com.p2082ss.ttm.player.AbstractC86265n
    /* renamed from: c */
    public final int mo136751c() {
        this.f192593d.lock();
        try {
            return mo136775t() ? 1 : 0;
        } finally {
            this.f192593d.unlock();
        }
    }

    @Override // com.p2082ss.ttm.player.AbstractC86265n
    /* renamed from: d */
    public final void mo136753d() {
        String w;
        MethodCollector.m26663i(9062);
        m148229c(false);
        m148234v();
        this.f192615z.lock();
        try {
            AbstractC86251k kVar = this.f192595f;
            this.f192595f = null;
            this.f192611v = -1;
            if (kVar != null) {
                kVar.mo136828b();
            }
            this.f192615z.unlock();
            SurfaceHolder surfaceHolder = this.f192600k;
            if (surfaceHolder != null) {
                surfaceHolder.removeCallback(this.f192606q);
                this.f192600k = null;
                this.f192610u = true;
            }
            this.f192601l = null;
            synchronized (this.f192592c) {
                try {
                    Handler handler = this.f192598i;
                    if (handler != null) {
                        handler.removeCallbacksAndMessages(null);
                        this.f192598i = null;
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(9062);
                    throw th;
                }
            }
            if (!(this.f192579E == null || (w = m148235w()) == null)) {
                w.length();
            }
            this.f192602m = null;
            MethodCollector.m26664o(9062);
        } catch (Throwable th2) {
            this.f192615z.unlock();
            MethodCollector.m26664o(9062);
            throw th2;
        }
    }

    /* JADX INFO: finally extract failed */
    @Override // com.p2082ss.ttm.player.AbstractC86265n
    /* renamed from: e */
    public final void mo136754e() {
        this.f192593d.lock();
        try {
            if (mo136775t()) {
                this.f192595f.mo136830c();
                m148233u();
                this.f192575A = this.f192595f.mo136809a(800, 0);
            }
            this.f192593d.unlock();
            m148229c(true);
        } catch (Throwable th) {
            this.f192593d.unlock();
            throw th;
        }
    }

    /* renamed from: w */
    private String m148235w() {
        try {
            StringBuilder sb = new StringBuilder();
            LinkedList<String> linkedList = this.f192591b;
            if (!((linkedList == null || linkedList.size() <= 0) && this.f192596g == null && this.f192597h == null)) {
                Context context = this.f192602m;
                if (C86218a.f192434a == null) {
                    C86218a.f192434a = new StringBuilder();
                    C86218a.m148181a(context, C86218a.f192434a);
                }
                sb.append((CharSequence) C86218a.f192434a);
                sb.append("\r\n").append("error").append(":").append("play error");
                Iterator<String> it = this.f192591b.iterator();
                while (it.hasNext()) {
                    sb.append(it.next()).append("\n");
                }
                String str = this.f192596g;
                if (str != null) {
                    sb.append(str).append("\n");
                    this.f192596g = null;
                }
                String str2 = this.f192597h;
                if (str2 != null) {
                    sb.append(str2).append("\n");
                    this.f192597h = null;
                }
            }
            return sb.toString();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.p2082ss.ttm.player.AbstractC86250j
    /* renamed from: a */
    public final void mo136720a() {
        if (!this.f192610u) {
            if (this.f192590P > 0) {
                try {
                    C86239b.m148296a(new Callable<String>() {
                        /* class com.p2082ss.ttm.player.TTPlayerClient.CallableC862342 */

                        static {
                            Covode.recordClassIndex(101409);
                        }

                        /* access modifiers changed from: private */
                        /* renamed from: a */
                        public String call() {
                            try {
                                TTPlayerClient.this.f192593d.lockInterruptibly();
                                try {
                                    if (TTPlayerClient.this.mo136775t()) {
                                        TTPlayerClient.this.f192595f.mo136816a((Surface) null);
                                    }
                                    return "OK";
                                } finally {
                                    TTPlayerClient.this.f192593d.unlock();
                                }
                            } catch (InterruptedException unused) {
                                return "OK";
                            }
                        }
                    }).get((long) this.f192590P, TimeUnit.MILLISECONDS);
                } catch (InterruptedException | ExecutionException | TimeoutException unused) {
                }
            } else {
                this.f192593d.lock();
                try {
                    if (mo136775t()) {
                        this.f192595f.mo136816a((Surface) null);
                    }
                } finally {
                    this.f192593d.unlock();
                }
            }
        }
    }

    /* renamed from: a */
    private void m148227a(FileDescriptor fileDescriptor) {
        ParcelFileDescriptor dup = ParcelFileDescriptor.dup(fileDescriptor);
        try {
            this.f192595f.mo136814a(dup.getFd());
            dup.close();
        } catch (Throwable th) {
            if (dup != null) {
                dup.close();
            }
            throw th;
        }
    }

    /* renamed from: d */
    private void m148230d(int i) {
        AbstractC86253m.AbstractC86262i iVar;
        if (!this.f192605p && (iVar = this.f192585K) != null) {
            this.f192605p = true;
            if (i >= this.f192611v) {
                iVar.mo136844a();
            }
        }
    }

    @Override // com.p2082ss.ttm.player.AbstractC86265n
    /* renamed from: c */
    public final float mo136750c(int i) {
        this.f192593d.lock();
        try {
            float f = 0.0f;
            if (mo136775t()) {
                f = this.f192595f.mo136825b(i, 0.0f);
            }
            return f;
        } finally {
            this.f192593d.unlock();
        }
    }

    public Object getObjectOption(int i) {
        Object obj;
        this.f192593d.lock();
        try {
            if (mo136775t()) {
                obj = this.f192595f.mo136835e(i);
            } else {
                obj = null;
            }
            return obj;
        } finally {
            this.f192593d.unlock();
        }
    }

    public boolean handleMessage(Message message) {
        String str;
        int i = message.arg2;
        int i2 = message.what;
        int i3 = message.arg1;
        if (message.obj instanceof String) {
            str = (String) message.obj;
        } else {
            str = null;
        }
        mo136724a(i, i2, i3, str);
        return true;
    }

    public void setAudioProcessor(AudioProcessor audioProcessor) {
        this.f192593d.lock();
        try {
            if (mo136775t()) {
                this.f192595f.mo136817a(audioProcessor);
            }
        } finally {
            this.f192593d.unlock();
        }
    }

    public void setLoadControl(LoadControl loadControl) {
        this.f192593d.lock();
        try {
            if (mo136775t()) {
                this.f192595f.mo136819a(loadControl);
            }
        } finally {
            this.f192593d.unlock();
        }
    }

    public void setMaskInfo(MaskInfo maskInfo) {
        this.f192593d.lock();
        try {
            if (mo136775t()) {
                this.f192595f.mo136820a(maskInfo);
            }
        } finally {
            this.f192593d.unlock();
        }
    }

    public void setSubInfo(SubInfo subInfo) {
        this.f192593d.lock();
        try {
            if (mo136775t()) {
                this.f192595f.mo136821a(subInfo);
            }
        } finally {
            this.f192593d.unlock();
        }
    }

    /* renamed from: b */
    private void m148228b(String str) {
        if (str.toLowerCase(Locale.US).indexOf("://") <= 0) {
            this.f192603n = "file://".concat(String.valueOf(str));
        } else {
            this.f192603n = str;
        }
        this.f192593d.lock();
        try {
            if (mo136775t()) {
                this.f192595f.mo136823a(this.f192603n);
            }
        } finally {
            this.f192593d.unlock();
        }
    }

    /* renamed from: c */
    private void m148229c(boolean z) {
        PowerManager.WakeLock wakeLock = this.f192607r;
        if (wakeLock != null) {
            if (z) {
                if (!wakeLock.isHeld()) {
                    this.f192607r.acquire();
                }
            } else if (this.f192607r.isHeld()) {
                this.f192607r.release();
            }
        }
        this.f192608s = z;
        m148234v();
    }

    /* renamed from: e */
    private void m148232e(int i) {
        try {
            this.f192612w.lock();
            AbstractC86253m.AbstractC86255b bVar = this.f192583I;
            if (bVar != null && i >= this.f192611v) {
                bVar.mo16759a(this.f192599j);
            }
        } finally {
            if (this.f192612w.isLocked()) {
                this.f192612w.unlock();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    @Override // com.p2082ss.ttm.player.AbstractC86265n
    /* renamed from: b */
    public final void mo136748b(SurfaceHolder surfaceHolder) {
        SurfaceHolder surfaceHolder2 = this.f192600k;
        if (surfaceHolder2 != null) {
            surfaceHolder2.removeCallback(this.f192606q);
        }
        this.f192600k = surfaceHolder;
        Surface surface = null;
        if (surfaceHolder != null) {
            surfaceHolder.addCallback(this.f192606q);
            surface = this.f192600k.getSurface();
        }
        this.f192593d.lock();
        try {
            if (mo136775t()) {
                this.f192595f.mo136816a(surface);
            }
            this.f192593d.unlock();
            m148234v();
        } catch (Throwable th) {
            this.f192593d.unlock();
            throw th;
        }
    }

    @Override // com.p2082ss.ttm.player.AbstractC86265n
    /* renamed from: b */
    public final void mo136749b(boolean z) {
        int i;
        this.f192593d.lock();
        try {
            if (mo136775t()) {
                AbstractC86251k kVar = this.f192595f;
                if (z) {
                    i = 1;
                } else {
                    i = 0;
                }
                kVar.mo136826b(12, i);
            }
        } finally {
            this.f192593d.unlock();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00c8, code lost:
        if (new java.io.File(r2).exists() != false) goto L_0x00ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x017d, code lost:
        if (new java.io.File(r2).exists() != false) goto L_0x00ca;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00bf  */
    @Override // com.p2082ss.ttm.player.AbstractC86265n
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo136746b(int r14) {
        /*
        // Method dump skipped, instructions count: 685
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.ttm.player.TTPlayerClient.mo136746b(int):java.lang.String");
    }

    @Override // com.p2082ss.ttm.player.AbstractC86265n
    /* renamed from: a */
    public final void mo136722a(int i) {
        this.f192593d.lock();
        try {
            if (mo136775t()) {
                this.f192605p = false;
                this.f192595f.mo136831c(i);
            }
        } finally {
            this.f192593d.unlock();
        }
    }

    public static synchronized TTPlayerClient create(AbstractC86253m mVar, Context context) {
        TTPlayerClient create;
        synchronized (TTPlayerClient.class) {
            MethodCollector.m26663i(8764);
            create = create(mVar, context, null);
            MethodCollector.m26664o(8764);
        }
        return create;
    }

    @Override // com.p2082ss.ttm.player.AbstractC86265n
    /* renamed from: b */
    public final long mo136745b(int i, long j) {
        this.f192593d.lock();
        try {
            if (mo136775t()) {
                j = this.f192595f.mo136827b(i, j);
            }
            return j;
        } finally {
            this.f192593d.unlock();
        }
    }

    /* renamed from: d */
    private void m148231d(int i, int i2) {
        try {
            this.f192612w.lock();
            AbstractC86253m.AbstractC86256c cVar = this.f192581G;
            if (cVar != null && i2 >= this.f192611v) {
                int i3 = this.f192594e;
                if (i3 != 0) {
                    i = i3;
                } else if (i == 0) {
                    i = -1048575;
                }
                cVar.mo16758a(this.f192599j, i, 0);
            }
        } finally {
            if (this.f192612w.isLocked()) {
                this.f192612w.unlock();
            }
        }
    }

    @Override // com.p2082ss.ttm.player.AbstractC86265n
    /* renamed from: a */
    public final int mo136717a(int i, float f) {
        int i2;
        this.f192593d.lock();
        try {
            if (mo136775t()) {
                i2 = this.f192595f.mo136808a(i, f);
            } else {
                i2 = -1;
            }
            return i2;
        } finally {
            this.f192593d.unlock();
        }
    }

    private TTPlayerClient(Context context, HashMap<Integer, Integer> hashMap) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f192614y = reentrantReadWriteLock;
        this.f192593d = reentrantReadWriteLock.readLock();
        this.f192615z = reentrantReadWriteLock.writeLock();
        this.f192594e = 0;
        this.f192575A = 0;
        this.f192576B = new StringBuilder(1024);
        this.f192577C = -1;
        this.f192578D = 0;
        this.f192589O = null;
        this.f192590P = -1;
        this.f192589O = hashMap;
        this.f192610u = false;
        this.f192606q = new SurfaceHolder$CallbackC86288x(this);
        this.f192602m = context;
        if (Looper.myLooper() != null) {
            this.f192598i = new Handler(this);
        } else {
            this.f192598i = new Handler(Looper.getMainLooper(), this);
        }
    }

    @Override // com.p2082ss.ttm.player.AbstractC86265n
    /* renamed from: a */
    public final int mo136718a(int i, long j) {
        int i2;
        this.f192593d.lock();
        try {
            if (mo136775t()) {
                i2 = this.f192595f.mo136810a(i, j);
            } else {
                i2 = -1;
            }
            return i2;
        } finally {
            this.f192593d.unlock();
        }
    }

    @Override // com.p2082ss.ttm.player.AbstractC86265n
    /* renamed from: b */
    public final int mo136744b(int i, int i2) {
        int i3;
        if (i == 41) {
            AVResolver.f192448d = i2;
            return 0;
        } else if (i == 5003) {
            this.f192578D = i2;
            return 0;
        } else if (i == 952) {
            this.f192590P = i2;
            return 0;
        } else {
            this.f192593d.lock();
            try {
                if (mo136775t()) {
                    i3 = this.f192595f.mo136826b(i, i2);
                } else {
                    i3 = -1;
                }
                return i3;
            } finally {
                this.f192593d.unlock();
            }
        }
    }

    @Override // com.p2082ss.ttm.player.AbstractC86265n
    /* renamed from: a */
    public final int mo136719a(int i, String str) {
        int i2;
        this.f192593d.lock();
        try {
            if (mo136775t()) {
                i2 = this.f192595f.mo136811a(i, str);
            } else {
                i2 = -1;
            }
            return i2;
        } finally {
            this.f192593d.unlock();
        }
    }

    @Override // com.p2082ss.ttm.player.AbstractC86265n
    /* renamed from: c */
    public final int mo136752c(int i, int i2) {
        if (i == 5000) {
            return this.f192594e;
        }
        if (i == 26) {
            return this.f192577C;
        }
        this.f192593d.lock();
        try {
            if (mo136775t()) {
                i2 = this.f192595f.mo136809a(i, i2);
            }
            return i2;
        } finally {
            this.f192593d.unlock();
        }
    }

    @Override // com.p2082ss.ttm.player.AbstractC86265n
    /* renamed from: a */
    public final void mo136721a(float f, float f2) {
        this.f192593d.lock();
        try {
            if (mo136775t()) {
                this.f192595f.mo136813a(f, f2);
            }
        } finally {
            this.f192593d.unlock();
        }
    }

    public static synchronized TTPlayerClient create(AbstractC86253m mVar, Context context, HashMap<Integer, Integer> hashMap) {
        synchronized (TTPlayerClient.class) {
            MethodCollector.m26663i(8902);
            TTVersion.m148290a();
            TTPlayerClient tTPlayerClient = new TTPlayerClient(context, hashMap);
            AbstractC86251k a = AbstractC86251k.m148322a(context, tTPlayerClient, hashMap);
            if (a == null) {
                MethodCollector.m26664o(8902);
                return null;
            }
            tTPlayerClient.f192595f = a;
            tTPlayerClient.f192599j = mVar;
            MethodCollector.m26664o(8902);
            return tTPlayerClient;
        }
    }
}
