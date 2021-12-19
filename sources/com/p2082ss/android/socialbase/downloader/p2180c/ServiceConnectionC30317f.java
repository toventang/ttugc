package com.p2082ss.android.socialbase.downloader.p2180c;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.SparseArray;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.socialbase.downloader.downloader.AbstractC30430v;
import com.p2082ss.android.socialbase.downloader.downloader.C30399c;
import com.p2082ss.android.socialbase.downloader.downloader.SqlDownloadCacheService;
import com.p2082ss.android.socialbase.downloader.model.DownloadChunk;
import com.p2082ss.android.socialbase.downloader.model.DownloadInfo;
import com.p2082ss.android.socialbase.downloader.p2180c.AbstractC30298b;
import com.p2082ss.android.socialbase.downloader.p2180c.AbstractC30301c;
import com.p2082ss.android.socialbase.downloader.p2182e.C30434a;
import com.p2082ss.android.socialbase.downloader.p2189k.C30535g;
import com.p2082ss.android.socialbase.downloader.segment.C30607i;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ss.android.socialbase.downloader.c.f */
public final class ServiceConnectionC30317f implements ServiceConnection, AbstractC30430v {

    /* renamed from: b */
    public static boolean f72318b;

    /* renamed from: c */
    static int f72319c;

    /* renamed from: d */
    static long f72320d;

    /* renamed from: a */
    public AbstractC30301c f72321a;

    /* renamed from: e */
    public Handler f72322e = new Handler(Looper.getMainLooper());

    /* renamed from: f */
    public AbstractC30298b f72323f = null;

    /* renamed from: g */
    public C30399c.AbstractC30403a.AbstractC30404a f72324g;

    /* renamed from: h */
    public Runnable f72325h = new Runnable() {
        /* class com.p2082ss.android.socialbase.downloader.p2180c.ServiceConnectionC30317f.RunnableC303181 */

        static {
            Covode.recordClassIndex(36830);
        }

        public final void run() {
            if (!ServiceConnectionC30317f.f72318b && ServiceConnectionC30317f.this.f72324g != null) {
                ServiceConnectionC30317f.this.f72324g.mo54048a();
            }
        }
    };

    /* renamed from: i */
    public Future<?> f72326i;

    /* renamed from: j */
    public CountDownLatch f72327j = new CountDownLatch(1);

    static {
        Covode.recordClassIndex(36829);
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l
    /* renamed from: a */
    public final boolean mo53807a(int i, Map<Long, C30607i> map) {
        return false;
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l
    /* renamed from: k */
    public final Map<Long, C30607i> mo53811k(int i) {
        return null;
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l
    /* renamed from: l */
    public final void mo53812l(int i) {
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l
    /* renamed from: m */
    public final /* bridge */ /* synthetic */ List mo53813m(int i) {
        return null;
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30430v
    /* renamed from: a */
    public final void mo53805a(final SparseArray<DownloadInfo> sparseArray, final SparseArray<List<DownloadChunk>> sparseArray2, final AbstractC30304d dVar) {
        C30399c.m61721g().submit(new Runnable() {
            /* class com.p2082ss.android.socialbase.downloader.p2180c.ServiceConnectionC30317f.RunnableC303224 */

            static {
                Covode.recordClassIndex(36834);
            }

            public final void run() {
                boolean z;
                AbstractC30304d dVar;
                Future<?> future;
                ServiceConnectionC30317f.this.mo53825a(new AbstractC30298b.AbstractBinderC30299a() {
                    /* class com.p2082ss.android.socialbase.downloader.p2180c.ServiceConnectionC30317f.RunnableC303224.BinderC303231 */

                    static {
                        Covode.recordClassIndex(36835);
                    }

                    @Override // com.p2082ss.android.socialbase.downloader.p2180c.AbstractC30298b
                    /* renamed from: a */
                    public final void mo53760a(Map map, Map map2) {
                        C30535g.m62549a(sparseArray, map);
                        C30535g.m62549a(sparseArray2, map2);
                        dVar.mo53803a();
                        ServiceConnectionC30317f.this.mo53825a((AbstractC30298b) null);
                    }
                });
                try {
                    z = !ServiceConnectionC30317f.this.f72327j.await(5000, TimeUnit.MILLISECONDS);
                    if (z && (future = ServiceConnectionC30317f.this.f72326i) != null) {
                        future.cancel(true);
                    }
                } catch (Throwable unused) {
                    z = false;
                }
                ServiceConnectionC30317f fVar = ServiceConnectionC30317f.this;
                try {
                    if (fVar.f72321a != null) {
                        fVar.f72321a.mo53768a();
                    }
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
                if (z && (dVar = dVar) != null) {
                    dVar.mo53803a();
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo53825a(AbstractC30298b bVar) {
        MethodCollector.m26663i(11014);
        synchronized (this) {
            try {
                AbstractC30301c cVar = this.f72321a;
                if (cVar != null) {
                    try {
                        cVar.mo53773a(bVar);
                    } catch (RemoteException e) {
                        e.printStackTrace();
                    }
                } else {
                    this.f72323f = bVar;
                }
            } finally {
                MethodCollector.m26664o(11014);
            }
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l
    /* renamed from: a */
    public final void mo53774a(DownloadChunk downloadChunk) {
        try {
            AbstractC30301c cVar = this.f72321a;
            if (cVar != null) {
                cVar.mo53774a(downloadChunk);
            }
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l
    /* renamed from: a */
    public final boolean mo53776a(DownloadInfo downloadInfo) {
        try {
            AbstractC30301c cVar = this.f72321a;
            if (cVar != null) {
                return cVar.mo53776a(downloadInfo);
            }
            return false;
        } catch (RemoteException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l
    /* renamed from: e */
    public final boolean mo53793e() {
        try {
            AbstractC30301c cVar = this.f72321a;
            if (cVar != null) {
                return cVar.mo53793e();
            }
            return false;
        } catch (RemoteException e) {
            e.printStackTrace();
            return false;
        }
    }

    public ServiceConnectionC30317f() {
        SqlDownloadCacheService.m61653a(C30399c.m61674B(), this);
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l
    /* renamed from: b */
    public final List<DownloadInfo> mo53779b() {
        try {
            AbstractC30301c cVar = this.f72321a;
            if (cVar != null) {
                return cVar.mo53779b();
            }
            return null;
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l
    /* renamed from: c */
    public final void mo53787c() {
        try {
            AbstractC30301c cVar = this.f72321a;
            if (cVar != null) {
                cVar.mo53787c();
            }
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l
    /* renamed from: d */
    public final boolean mo53791d() {
        try {
            AbstractC30301c cVar = this.f72321a;
            if (cVar != null) {
                return cVar.mo53791d();
            }
            return false;
        } catch (RemoteException e) {
            e.printStackTrace();
            return false;
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.f72321a = null;
        f72318b = false;
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l
    /* renamed from: b */
    public final DownloadInfo mo53777b(int i) {
        try {
            AbstractC30301c cVar = this.f72321a;
            if (cVar != null) {
                return cVar.mo53777b(i);
            }
            return null;
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l
    /* renamed from: f */
    public final boolean mo53795f(int i) {
        try {
            AbstractC30301c cVar = this.f72321a;
            if (cVar != null) {
                return cVar.mo53795f(i);
            }
            return false;
        } catch (RemoteException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l
    /* renamed from: g */
    public final DownloadInfo mo53796g(int i) {
        try {
            AbstractC30301c cVar = this.f72321a;
            if (cVar != null) {
                return cVar.mo53796g(i);
            }
            return null;
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l
    /* renamed from: h */
    public final DownloadInfo mo53797h(int i) {
        try {
            AbstractC30301c cVar = this.f72321a;
            if (cVar != null) {
                return cVar.mo53797h(i);
            }
            return null;
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l
    /* renamed from: i */
    public final DownloadInfo mo53798i(int i) {
        try {
            AbstractC30301c cVar = this.f72321a;
            if (cVar != null) {
                return cVar.mo53798i(i);
            }
            return null;
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l
    /* renamed from: j */
    public final DownloadInfo mo53799j(int i) {
        try {
            AbstractC30301c cVar = this.f72321a;
            if (cVar != null) {
                return cVar.mo53799j(i);
            }
            return null;
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l
    /* renamed from: c */
    public final List<DownloadChunk> mo53785c(int i) {
        try {
            AbstractC30301c cVar = this.f72321a;
            if (cVar != null) {
                return cVar.mo53785c(i);
            }
            return null;
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l
    /* renamed from: d */
    public final List<DownloadInfo> mo53789d(String str) {
        try {
            AbstractC30301c cVar = this.f72321a;
            if (cVar != null) {
                return cVar.mo53789d(str);
            }
            return null;
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l
    /* renamed from: e */
    public final boolean mo53794e(int i) {
        try {
            AbstractC30301c cVar = this.f72321a;
            if (cVar != null) {
                return cVar.mo53794e(i);
            }
            return false;
        } catch (RemoteException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l
    /* renamed from: c */
    public final List<DownloadInfo> mo53786c(String str) {
        try {
            AbstractC30301c cVar = this.f72321a;
            if (cVar != null) {
                return cVar.mo53786c(str);
            }
            return null;
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l
    /* renamed from: d */
    public final void mo53790d(int i) {
        try {
            AbstractC30301c cVar = this.f72321a;
            if (cVar != null) {
                cVar.mo53790d(i);
            }
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l
    /* renamed from: a */
    public final List<DownloadInfo> mo53767a(String str) {
        try {
            AbstractC30301c cVar = this.f72321a;
            if (cVar != null) {
                return cVar.mo53767a(str);
            }
            return null;
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l
    /* renamed from: b */
    public final List<DownloadInfo> mo53780b(String str) {
        try {
            AbstractC30301c cVar = this.f72321a;
            if (cVar != null) {
                return cVar.mo53780b(str);
            }
            return null;
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l
    /* renamed from: b */
    public final void mo53782b(DownloadChunk downloadChunk) {
        try {
            AbstractC30301c cVar = this.f72321a;
            if (cVar != null) {
                cVar.mo53782b(downloadChunk);
            }
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l
    /* renamed from: b */
    public final void mo53783b(DownloadInfo downloadInfo) {
        try {
            AbstractC30301c cVar = this.f72321a;
            if (cVar != null) {
                cVar.mo53783b(downloadInfo);
            }
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l
    /* renamed from: a */
    public final DownloadInfo mo53764a(int i, int i2) {
        try {
            AbstractC30301c cVar = this.f72321a;
            if (cVar != null) {
                return cVar.mo53764a(i, i2);
            }
            return null;
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l
    /* renamed from: c */
    public final DownloadInfo mo53784c(int i, long j) {
        try {
            AbstractC30301c cVar = this.f72321a;
            if (cVar != null) {
                return cVar.mo53784c(i, j);
            }
            return null;
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l
    /* renamed from: d */
    public final DownloadInfo mo53788d(int i, long j) {
        try {
            AbstractC30301c cVar = this.f72321a;
            if (cVar != null) {
                return cVar.mo53788d(i, j);
            }
            return null;
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l
    /* renamed from: a */
    public final DownloadInfo mo53765a(int i, long j) {
        try {
            AbstractC30301c cVar = this.f72321a;
            if (cVar != null) {
                return cVar.mo53765a(i, j);
            }
            return null;
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l
    /* renamed from: b */
    public final DownloadInfo mo53778b(int i, long j) {
        try {
            AbstractC30301c cVar = this.f72321a;
            if (cVar != null) {
                return cVar.mo53778b(i, j);
            }
            return null;
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        AbstractC30301c cVar;
        f72318b = true;
        this.f72322e.removeCallbacks(this.f72325h);
        if (iBinder == null) {
            cVar = null;
        } else {
            try {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                if (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC30301c)) {
                    cVar = new AbstractC30301c.AbstractBinderC30302a.C30303a(iBinder);
                } else {
                    cVar = (AbstractC30301c) queryLocalInterface;
                }
            } catch (Throwable unused) {
            }
        }
        this.f72321a = cVar;
        this.f72326i = C30399c.m61721g().submit(new Runnable() {
            /* class com.p2082ss.android.socialbase.downloader.p2180c.ServiceConnectionC30317f.RunnableC303192 */

            static {
                Covode.recordClassIndex(36831);
            }

            /* JADX INFO: finally extract failed */
            public final void run() {
                IBinder iBinder;
                C303201 r0;
                MethodCollector.m26663i(11862);
                synchronized (this) {
                    try {
                        if (!(ServiceConnectionC30317f.this.f72323f == null || ServiceConnectionC30317f.this.f72321a == null)) {
                            ServiceConnectionC30317f.this.f72321a.mo53773a(ServiceConnectionC30317f.this.f72323f);
                        }
                        try {
                            ServiceConnectionC30317f.this.f72327j.countDown();
                            try {
                                iBinder = iBinder;
                                r0 = new IBinder.DeathRecipient() {
                                    /* class com.p2082ss.android.socialbase.downloader.p2180c.ServiceConnectionC30317f.RunnableC303192.C303201 */

                                    static {
                                        Covode.recordClassIndex(36832);
                                    }

                                    public final void binderDied() {
                                        ServiceConnectionC30317f.f72318b = false;
                                        ServiceConnectionC30317f fVar = ServiceConnectionC30317f.this;
                                        if (Build.VERSION.SDK_INT < 26 && !ServiceConnectionC30317f.f72318b) {
                                            if (ServiceConnectionC30317f.f72319c > 5) {
                                                C30434a.m62029d("SqlDownloadCacheAidlWra", "bindMainProcess: bind too many times!!! ");
                                            } else {
                                                long currentTimeMillis = System.currentTimeMillis();
                                                if (currentTimeMillis - ServiceConnectionC30317f.f72320d < 15000) {
                                                    C30434a.m62029d("SqlDownloadCacheAidlWra", "bindMainProcess: time too short since last bind!!! ");
                                                } else {
                                                    ServiceConnectionC30317f.f72319c++;
                                                    ServiceConnectionC30317f.f72320d = currentTimeMillis;
                                                    fVar.f72322e.postDelayed(new Runnable() {
                                                        /* class com.p2082ss.android.socialbase.downloader.p2180c.ServiceConnectionC30317f.RunnableC303213 */

                                                        static {
                                                            Covode.recordClassIndex(36833);
                                                        }

                                                        public final void run() {
                                                            SqlDownloadCacheService.m61653a(C30399c.m61674B(), ServiceConnectionC30317f.this);
                                                        }
                                                    }, 1000);
                                                    return;
                                                }
                                            }
                                        }
                                        if (ServiceConnectionC30317f.this.f72324g != null) {
                                            ServiceConnectionC30317f.this.f72322e.postDelayed(ServiceConnectionC30317f.this.f72325h, InteractFirstFrameTimeOutDurationSetting.DEFAULT);
                                        }
                                    }
                                };
                                iBinder.linkToDeath(r0, 0);
                            } catch (Throwable unused) {
                            }
                        } catch (Throwable th) {
                            MethodCollector.m26664o(11862);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        ServiceConnectionC30317f.this.f72327j.countDown();
                        try {
                            iBinder.linkToDeath(new IBinder.DeathRecipient() {
                                /* class com.p2082ss.android.socialbase.downloader.p2180c.ServiceConnectionC30317f.RunnableC303192.C303201 */

                                static {
                                    Covode.recordClassIndex(36832);
                                }

                                public final void binderDied() {
                                    ServiceConnectionC30317f.f72318b = false;
                                    ServiceConnectionC30317f fVar = ServiceConnectionC30317f.this;
                                    if (Build.VERSION.SDK_INT < 26 && !ServiceConnectionC30317f.f72318b) {
                                        if (ServiceConnectionC30317f.f72319c > 5) {
                                            C30434a.m62029d("SqlDownloadCacheAidlWra", "bindMainProcess: bind too many times!!! ");
                                        } else {
                                            long currentTimeMillis = System.currentTimeMillis();
                                            if (currentTimeMillis - ServiceConnectionC30317f.f72320d < 15000) {
                                                C30434a.m62029d("SqlDownloadCacheAidlWra", "bindMainProcess: time too short since last bind!!! ");
                                            } else {
                                                ServiceConnectionC30317f.f72319c++;
                                                ServiceConnectionC30317f.f72320d = currentTimeMillis;
                                                fVar.f72322e.postDelayed(new Runnable() {
                                                    /* class com.p2082ss.android.socialbase.downloader.p2180c.ServiceConnectionC30317f.RunnableC303213 */

                                                    static {
                                                        Covode.recordClassIndex(36833);
                                                    }

                                                    public final void run() {
                                                        SqlDownloadCacheService.m61653a(C30399c.m61674B(), ServiceConnectionC30317f.this);
                                                    }
                                                }, 1000);
                                                return;
                                            }
                                        }
                                    }
                                    if (ServiceConnectionC30317f.this.f72324g != null) {
                                        ServiceConnectionC30317f.this.f72322e.postDelayed(ServiceConnectionC30317f.this.f72325h, InteractFirstFrameTimeOutDurationSetting.DEFAULT);
                                    }
                                }
                            }, 0);
                        } catch (Throwable unused2) {
                        }
                        MethodCollector.m26664o(11862);
                        throw th2;
                    }
                }
                MethodCollector.m26664o(11862);
            }
        });
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l
    /* renamed from: b */
    public final void mo53781b(int i, List<DownloadChunk> list) {
        try {
            AbstractC30301c cVar = this.f72321a;
            if (cVar != null) {
                cVar.mo53781b(i, list);
            }
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l
    /* renamed from: a */
    public final void mo53772a(int i, List<DownloadChunk> list) {
        try {
            AbstractC30301c cVar = this.f72321a;
            if (cVar != null) {
                cVar.mo53772a(i, list);
            }
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l
    /* renamed from: a */
    public final void mo53771a(int i, int i2, long j) {
        try {
            AbstractC30301c cVar = this.f72321a;
            if (cVar != null) {
                cVar.mo53771a(i, i2, j);
            }
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l
    /* renamed from: a */
    public final DownloadInfo mo53766a(int i, long j, String str, String str2) {
        try {
            AbstractC30301c cVar = this.f72321a;
            if (cVar != null) {
                return cVar.mo53766a(i, j, str, str2);
            }
            return null;
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l
    /* renamed from: a */
    public final void mo53769a(int i, int i2, int i3, int i4) {
        try {
            AbstractC30301c cVar = this.f72321a;
            if (cVar != null) {
                cVar.mo53769a(i, i2, i3, i4);
            }
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l
    /* renamed from: a */
    public final void mo53770a(int i, int i2, int i3, long j) {
        try {
            AbstractC30301c cVar = this.f72321a;
            if (cVar != null) {
                cVar.mo53770a(i, i2, i3, j);
            }
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
