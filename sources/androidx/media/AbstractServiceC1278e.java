package androidx.media;

import android.app.Service;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.media.session.MediaSession;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.RemoteException;
import android.service.media.MediaBrowserService;
import android.support.p010v4.media.MediaBrowserCompat;
import android.support.p010v4.media.session.AbstractC0151b;
import android.support.p010v4.media.session.MediaSessionCompat;
import android.support.p010v4.p011os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import androidx.core.app.C0578c;
import androidx.core.p036g.C0692e;
import androidx.media.C1311f;
import androidx.media.C1316g;
import androidx.media.C1319h;
import androidx.media.C1323i;
import androidx.p025c.C0484a;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.C15346a;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: androidx.media.e */
public abstract class AbstractServiceC1278e extends Service {

    /* renamed from: a */
    static final boolean f4204a = Log.isLoggable("MBServiceCompat", 3);

    /* renamed from: b */
    final C0484a<IBinder, C1284b> f4205b = new C0484a<>();

    /* renamed from: c */
    C1284b f4206c;

    /* renamed from: d */
    final HandlerC1310m f4207d = new HandlerC1310m();

    /* renamed from: e */
    public MediaSessionCompat.Token f4208e;

    /* renamed from: f */
    private AbstractC1286c f4209f;

    /* renamed from: androidx.media.e$a */
    public static final class C1283a {

        /* renamed from: a */
        public final String f4221a;

        /* renamed from: b */
        public final Bundle f4222b;

        static {
            Covode.recordClassIndex(1396);
        }
    }

    /* renamed from: androidx.media.e$c */
    interface AbstractC1286c {
        static {
            Covode.recordClassIndex(1399);
        }

        /* renamed from: a */
        IBinder mo4269a(Intent intent);

        /* renamed from: a */
        void mo4270a();

        /* renamed from: a */
        void mo4271a(MediaSessionCompat.Token token);
    }

    /* renamed from: androidx.media.e$k */
    interface AbstractC1308k {
        static {
            Covode.recordClassIndex(1421);
        }

        /* renamed from: a */
        IBinder mo4289a();

        /* renamed from: a */
        void mo4290a(String str, MediaSessionCompat.Token token, Bundle bundle);

        /* renamed from: a */
        void mo4291a(String str, List<MediaBrowserCompat.MediaItem> list, Bundle bundle, Bundle bundle2);

        /* renamed from: b */
        void mo4292b();
    }

    /* renamed from: a */
    public abstract C1283a mo4257a(String str);

    /* renamed from: a */
    public abstract void mo4259a(String str, C1297i<List<MediaBrowserCompat.MediaItem>> iVar);

    public void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    /* renamed from: androidx.media.e$l */
    static class C1309l implements AbstractC1308k {

        /* renamed from: a */
        final Messenger f4297a;

        static {
            Covode.recordClassIndex(1422);
        }

        @Override // androidx.media.AbstractServiceC1278e.AbstractC1308k
        /* renamed from: a */
        public final IBinder mo4289a() {
            return this.f4297a.getBinder();
        }

        @Override // androidx.media.AbstractServiceC1278e.AbstractC1308k
        /* renamed from: b */
        public final void mo4292b() {
            m4090a(2, null);
        }

        C1309l(Messenger messenger) {
            this.f4297a = messenger;
        }

        /* renamed from: a */
        private void m4090a(int i, Bundle bundle) {
            Message obtain = Message.obtain();
            obtain.what = i;
            obtain.arg1 = 2;
            obtain.setData(bundle);
            this.f4297a.send(obtain);
        }

        @Override // androidx.media.AbstractServiceC1278e.AbstractC1308k
        /* renamed from: a */
        public final void mo4290a(String str, MediaSessionCompat.Token token, Bundle bundle) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putInt("extra_service_version", 2);
            Bundle bundle2 = new Bundle();
            bundle2.putString("data_media_item_id", str);
            bundle2.putParcelable("data_media_session_token", token);
            bundle2.putBundle("data_root_hints", bundle);
            m4090a(1, bundle2);
        }

        @Override // androidx.media.AbstractServiceC1278e.AbstractC1308k
        /* renamed from: a */
        public final void mo4291a(String str, List<MediaBrowserCompat.MediaItem> list, Bundle bundle, Bundle bundle2) {
            Bundle bundle3 = new Bundle();
            bundle3.putString("data_media_item_id", str);
            bundle3.putBundle("data_options", bundle);
            bundle3.putBundle("data_notify_children_changed_options", bundle2);
            m4090a(3, bundle3);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.media.e$b */
    public class C1284b implements IBinder.DeathRecipient {

        /* renamed from: a */
        public final String f4223a;

        /* renamed from: b */
        public final int f4224b;

        /* renamed from: c */
        public final int f4225c;

        /* renamed from: d */
        public final C1323i.C1324a f4226d;

        /* renamed from: e */
        public final Bundle f4227e;

        /* renamed from: f */
        public final AbstractC1308k f4228f;

        /* renamed from: g */
        public final HashMap<String, List<C0692e<IBinder, Bundle>>> f4229g = new HashMap<>();

        /* renamed from: h */
        public C1283a f4230h;

        static {
            Covode.recordClassIndex(1397);
        }

        public final void binderDied() {
            AbstractServiceC1278e.this.f4207d.post(new Runnable() {
                /* class androidx.media.AbstractServiceC1278e.C1284b.RunnableC12851 */

                static {
                    Covode.recordClassIndex(1398);
                }

                public final void run() {
                    AbstractServiceC1278e.this.f4205b.remove(C1284b.this.f4228f.mo4289a());
                }
            });
        }

        C1284b(String str, int i, int i2, Bundle bundle, AbstractC1308k kVar) {
            this.f4223a = str;
            this.f4224b = i;
            this.f4225c = i2;
            this.f4226d = new C1323i.C1324a(str, i, i2);
            this.f4227e = bundle;
            this.f4228f = kVar;
        }
    }

    /* renamed from: androidx.media.e$h */
    class C1295h implements AbstractC1286c {

        /* renamed from: b */
        private Messenger f4249b;

        static {
            Covode.recordClassIndex(1408);
        }

        @Override // androidx.media.AbstractServiceC1278e.AbstractC1286c
        /* renamed from: a */
        public final void mo4270a() {
            this.f4249b = new Messenger(AbstractServiceC1278e.this.f4207d);
        }

        C1295h() {
        }

        @Override // androidx.media.AbstractServiceC1278e.AbstractC1286c
        /* renamed from: a */
        public final IBinder mo4269a(Intent intent) {
            if ("android.media.browse.MediaBrowserService".equals(intent.getAction())) {
                return this.f4249b.getBinder();
            }
            return null;
        }

        @Override // androidx.media.AbstractServiceC1278e.AbstractC1286c
        /* renamed from: a */
        public final void mo4271a(final MediaSessionCompat.Token token) {
            AbstractServiceC1278e.this.f4207d.post(new Runnable() {
                /* class androidx.media.AbstractServiceC1278e.C1295h.RunnableC12961 */

                static {
                    Covode.recordClassIndex(1409);
                }

                public final void run() {
                    Iterator<C1284b> it = AbstractServiceC1278e.this.f4205b.values().iterator();
                    while (it.hasNext()) {
                        C1284b next = it.next();
                        try {
                            next.f4228f.mo4290a(next.f4230h.f4221a, token, next.f4230h.f4222b);
                        } catch (RemoteException unused) {
                            it.remove();
                        }
                    }
                }
            });
        }
    }

    /* renamed from: androidx.media.e$i */
    public static class C1297i<T> {

        /* renamed from: a */
        private boolean f4252a;

        /* renamed from: f */
        final Object f4253f;

        /* renamed from: g */
        boolean f4254g;

        /* renamed from: h */
        boolean f4255h;

        /* renamed from: i */
        public int f4256i;

        static {
            Covode.recordClassIndex(1410);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4265a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public final boolean mo4279d() {
            if (this.f4252a || this.f4254g || this.f4255h) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo4266b() {
            throw new UnsupportedOperationException("It is not supported to send an error for " + this.f4253f);
        }

        /* renamed from: c */
        public final void mo4278c() {
            if (this.f4254g || this.f4255h) {
                throw new IllegalStateException("sendResult() called when either sendResult() or sendError() had already been called for: " + this.f4253f);
            }
            this.f4254g = true;
            mo4265a();
        }

        C1297i(Object obj) {
            this.f4253f = obj;
        }
    }

    static {
        Covode.recordClassIndex(1391);
    }

    /* renamed from: androidx.media.e$d */
    class C1287d implements AbstractC1286c, C1311f.AbstractC1315d {

        /* renamed from: a */
        final List<Bundle> f4233a = new ArrayList();

        /* renamed from: b */
        Object f4234b;

        /* renamed from: c */
        Messenger f4235c;

        static {
            Covode.recordClassIndex(1400);
        }

        @Override // androidx.media.AbstractServiceC1278e.AbstractC1286c
        /* renamed from: a */
        public void mo4270a() {
            C1311f.C1313b bVar = new C1311f.C1313b(AbstractServiceC1278e.this, this);
            this.f4234b = bVar;
            bVar.onCreate();
        }

        C1287d() {
        }

        @Override // androidx.media.AbstractServiceC1278e.AbstractC1286c
        /* renamed from: a */
        public final IBinder mo4269a(Intent intent) {
            return ((MediaBrowserService) this.f4234b).onBind(intent);
        }

        @Override // androidx.media.AbstractServiceC1278e.AbstractC1286c
        /* renamed from: a */
        public final void mo4271a(final MediaSessionCompat.Token token) {
            AbstractServiceC1278e.this.f4207d.mo4293a(new Runnable() {
                /* class androidx.media.AbstractServiceC1278e.C1287d.RunnableC12881 */

                static {
                    Covode.recordClassIndex(1401);
                }

                public final void run() {
                    if (!C1287d.this.f4233a.isEmpty()) {
                        AbstractC0151b bVar = token.f356b;
                        if (bVar != null) {
                            for (Bundle bundle : C1287d.this.f4233a) {
                                C0578c.m2197a(bundle, "extra_session_binder", bVar.asBinder());
                            }
                        }
                        C1287d.this.f4233a.clear();
                    }
                    ((MediaBrowserService) C1287d.this.f4234b).setSessionToken((MediaSession.Token) token.f355a);
                }
            });
        }

        @Override // androidx.media.C1311f.AbstractC1315d
        /* renamed from: a */
        public final void mo4273a(String str, final C1311f.C1314c<List<Parcel>> cVar) {
            AbstractServiceC1278e.this.mo4259a(str, new C1297i<List<MediaBrowserCompat.MediaItem>>(str) {
                /* class androidx.media.AbstractServiceC1278e.C1287d.C12892 */

                static {
                    Covode.recordClassIndex(1402);
                }

                /* access modifiers changed from: package-private */
                @Override // androidx.media.AbstractServiceC1278e.C1297i
                /* renamed from: a */
                public final /* bridge */ /* synthetic */ void mo4265a() {
                    cVar.mo4298a(null);
                }
            });
        }

        @Override // androidx.media.C1311f.AbstractC1315d
        /* renamed from: a */
        public final C1311f.C1312a mo4272a(String str, int i, Bundle bundle) {
            IBinder asBinder;
            if (!(bundle == null || bundle.getInt("extra_client_version", 0) == 0)) {
                bundle.remove("extra_client_version");
                this.f4235c = new Messenger(AbstractServiceC1278e.this.f4207d);
                Bundle bundle2 = new Bundle();
                bundle2.putInt("extra_service_version", 2);
                C0578c.m2197a(bundle2, "extra_messenger", this.f4235c.getBinder());
                if (AbstractServiceC1278e.this.f4208e != null) {
                    AbstractC0151b bVar = AbstractServiceC1278e.this.f4208e.f356b;
                    if (bVar == null) {
                        asBinder = null;
                    } else {
                        asBinder = bVar.asBinder();
                    }
                    C0578c.m2197a(bundle2, "extra_session_binder", asBinder);
                } else {
                    this.f4233a.add(bundle2);
                }
            }
            AbstractServiceC1278e.this.f4206c = new C1284b(str, -1, i, bundle, null);
            AbstractServiceC1278e.this.mo4257a(str);
            AbstractServiceC1278e.this.f4206c = null;
            return null;
        }
    }

    /* renamed from: androidx.media.e$e */
    class C1290e extends C1287d implements C1316g.AbstractC1318b {
        static {
            Covode.recordClassIndex(1403);
        }

        @Override // androidx.media.AbstractServiceC1278e.C1287d, androidx.media.AbstractServiceC1278e.AbstractC1286c
        /* renamed from: a */
        public void mo4270a() {
            this.f4234b = new C1316g.C1317a(AbstractServiceC1278e.this, this);
            ((MediaBrowserService) this.f4234b).onCreate();
        }

        C1290e() {
            super();
        }

        @Override // androidx.media.C1316g.AbstractC1318b
        /* renamed from: b */
        public final void mo4275b(String str, final C1311f.C1314c<Parcel> cVar) {
            AbstractServiceC1278e.m4053a(new C1297i<MediaBrowserCompat.MediaItem>(str) {
                /* class androidx.media.AbstractServiceC1278e.C1290e.C12911 */

                static {
                    Covode.recordClassIndex(1404);
                }

                /* access modifiers changed from: package-private */
                @Override // androidx.media.AbstractServiceC1278e.C1297i
                /* renamed from: a */
                public final /* bridge */ /* synthetic */ void mo4265a() {
                    cVar.mo4298a(null);
                }
            });
        }
    }

    /* renamed from: androidx.media.e$f */
    class C1292f extends C1290e implements C1319h.AbstractC1322c {
        static {
            Covode.recordClassIndex(1405);
        }

        @Override // androidx.media.AbstractServiceC1278e.C1287d, androidx.media.AbstractServiceC1278e.C1290e, androidx.media.AbstractServiceC1278e.AbstractC1286c
        /* renamed from: a */
        public final void mo4270a() {
            this.f4234b = new C1319h.C1320a(AbstractServiceC1278e.this, this);
            ((MediaBrowserService) this.f4234b).onCreate();
        }

        C1292f() {
            super();
        }

        @Override // androidx.media.C1319h.AbstractC1322c
        /* renamed from: a */
        public final void mo4276a(String str, final C1319h.C1321b bVar) {
            AbstractServiceC1278e.this.mo4261b(str, new C1297i<List<MediaBrowserCompat.MediaItem>>(str) {
                /* class androidx.media.AbstractServiceC1278e.C1292f.C12931 */

                static {
                    Covode.recordClassIndex(1406);
                }

                /* access modifiers changed from: package-private */
                @Override // androidx.media.AbstractServiceC1278e.C1297i
                /* renamed from: a */
                public final /* synthetic */ void mo4265a() {
                    C1319h.C1321b bVar = bVar;
                    try {
                        C1319h.f4302a.setInt(bVar.f4303a, this.f4256i);
                    } catch (IllegalAccessException unused) {
                    }
                    bVar.f4303a.sendResult(null);
                }
            });
        }
    }

    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 28) {
            this.f4209f = new C1294g();
        } else if (Build.VERSION.SDK_INT >= 26) {
            this.f4209f = new C1292f();
        } else if (Build.VERSION.SDK_INT >= 23) {
            this.f4209f = new C1290e();
        } else if (Build.VERSION.SDK_INT >= 21) {
            this.f4209f = new C1287d();
        } else {
            this.f4209f = new C1295h();
        }
        this.f4209f.mo4270a();
    }

    /* renamed from: androidx.media.e$g */
    class C1294g extends C1292f {
        static {
            Covode.recordClassIndex(1407);
        }

        C1294g() {
            super();
        }
    }

    /* renamed from: androidx.media.e$j */
    class C1298j {
        static {
            Covode.recordClassIndex(1411);
        }

        C1298j() {
        }
    }

    /* renamed from: a */
    public static void m4053a(C1297i<MediaBrowserCompat.MediaItem> iVar) {
        iVar.f4256i = 2;
        iVar.mo4278c();
    }

    public IBinder onBind(Intent intent) {
        return this.f4209f.mo4269a(intent);
    }

    /* renamed from: androidx.media.e$m */
    final class HandlerC1310m extends Handler {

        /* renamed from: b */
        private final C1298j f4299b;

        static {
            Covode.recordClassIndex(1423);
        }

        HandlerC1310m() {
            this.f4299b = new C1298j();
        }

        /* renamed from: a */
        public final void mo4293a(Runnable runnable) {
            if (Thread.currentThread() == getLooper().getThread()) {
                runnable.run();
            } else {
                post(runnable);
            }
        }

        public final void handleMessage(Message message) {
            String[] packagesForUid;
            Bundle data = message.getData();
            switch (message.what) {
                case 1:
                    Bundle bundle = data.getBundle("data_root_hints");
                    MediaSessionCompat.m227a(bundle);
                    C1298j jVar = this.f4299b;
                    String string = data.getString("data_package_name");
                    int i = data.getInt("data_calling_pid");
                    int i2 = data.getInt("data_calling_uid");
                    C1309l lVar = new C1309l(message.replyTo);
                    AbstractServiceC1278e eVar = AbstractServiceC1278e.this;
                    if (string != null) {
                        PackageManager packageManager = eVar.getPackageManager();
                        Pair<Boolean, Object> a = C15346a.m28238a(packageManager, new Object[]{Integer.valueOf(i2)}, 101310, "java.lang.String[]", false, null);
                        if (((Boolean) a.first).booleanValue()) {
                            packagesForUid = (String[]) a.second;
                        } else {
                            packagesForUid = packageManager.getPackagesForUid(i2);
                            C15346a.m28240a(packagesForUid, packageManager, new Object[]{Integer.valueOf(i2)}, 101310, "androidx_media_MediaBrowserServiceCompat_android_content_pm_PackageManager_getPackagesForUid(Landroid/content/pm/PackageManager;I)[Ljava/lang/String;");
                        }
                        for (String str : packagesForUid) {
                            if (str.equals(string)) {
                                AbstractServiceC1278e.this.f4207d.mo4293a(new Runnable(lVar, string, i, i2, bundle) {
                                    /* class androidx.media.AbstractServiceC1278e.C1298j.RunnableC12991 */

                                    /* renamed from: a */
                                    final /* synthetic */ AbstractC1308k f4258a;

                                    /* renamed from: b */
                                    final /* synthetic */ String f4259b;

                                    /* renamed from: c */
                                    final /* synthetic */ int f4260c;

                                    /* renamed from: d */
                                    final /* synthetic */ int f4261d;

                                    /* renamed from: e */
                                    final /* synthetic */ Bundle f4262e;

                                    static {
                                        Covode.recordClassIndex(1412);
                                    }

                                    public final void run() {
                                        IBinder a = this.f4258a.mo4289a();
                                        AbstractServiceC1278e.this.f4205b.remove(a);
                                        C1284b bVar = new C1284b(this.f4259b, this.f4260c, this.f4261d, this.f4262e, this.f4258a);
                                        AbstractServiceC1278e.this.f4206c = bVar;
                                        bVar.f4230h = AbstractServiceC1278e.this.mo4257a(this.f4259b);
                                        AbstractServiceC1278e.this.f4206c = null;
                                        if (bVar.f4230h == null) {
                                            getClass().getName();
                                            try {
                                                this.f4258a.mo4292b();
                                            } catch (RemoteException unused) {
                                            }
                                        } else {
                                            try {
                                                AbstractServiceC1278e.this.f4205b.put(a, bVar);
                                                a.linkToDeath(bVar, 0);
                                                if (AbstractServiceC1278e.this.f4208e != null) {
                                                    this.f4258a.mo4290a(bVar.f4230h.f4221a, AbstractServiceC1278e.this.f4208e, bVar.f4230h.f4222b);
                                                }
                                            } catch (RemoteException unused2) {
                                                AbstractServiceC1278e.this.f4205b.remove(a);
                                            }
                                        }
                                    }

                                    {
                                        this.f4258a = r2;
                                        this.f4259b = r3;
                                        this.f4260c = r4;
                                        this.f4261d = r5;
                                        this.f4262e = r6;
                                    }
                                });
                                return;
                            }
                        }
                    }
                    throw new IllegalArgumentException("Package/uid mismatch: uid=" + i2 + " package=" + string);
                case 2:
                    C1298j jVar2 = this.f4299b;
                    AbstractServiceC1278e.this.f4207d.mo4293a(new Runnable(new C1309l(message.replyTo)) {
                        /* class androidx.media.AbstractServiceC1278e.C1298j.RunnableC13002 */

                        /* renamed from: a */
                        final /* synthetic */ AbstractC1308k f4264a;

                        static {
                            Covode.recordClassIndex(1413);
                        }

                        public final void run() {
                            C1284b remove = AbstractServiceC1278e.this.f4205b.remove(this.f4264a.mo4289a());
                            if (remove != null) {
                                remove.f4228f.mo4289a().unlinkToDeath(remove, 0);
                            }
                        }

                        {
                            this.f4264a = r2;
                        }
                    });
                    return;
                case 3:
                    Bundle bundle2 = data.getBundle("data_options");
                    MediaSessionCompat.m227a(bundle2);
                    C1298j jVar3 = this.f4299b;
                    AbstractServiceC1278e.this.f4207d.mo4293a(new Runnable(new C1309l(message.replyTo), data.getString("data_media_item_id"), C0578c.m2196a(data, "data_callback_token"), bundle2) {
                        /* class androidx.media.AbstractServiceC1278e.C1298j.RunnableC13013 */

                        /* renamed from: a */
                        final /* synthetic */ AbstractC1308k f4266a;

                        /* renamed from: b */
                        final /* synthetic */ String f4267b;

                        /* renamed from: c */
                        final /* synthetic */ IBinder f4268c;

                        /* renamed from: d */
                        final /* synthetic */ Bundle f4269d;

                        static {
                            Covode.recordClassIndex(1414);
                        }

                        public final void run() {
                            C1284b bVar = AbstractServiceC1278e.this.f4205b.get(this.f4266a.mo4289a());
                            if (bVar != null) {
                                AbstractServiceC1278e eVar = AbstractServiceC1278e.this;
                                String str = this.f4267b;
                                IBinder iBinder = this.f4268c;
                                Bundle bundle = this.f4269d;
                                List<C0692e<IBinder, Bundle>> list = bVar.f4229g.get(str);
                                if (list == null) {
                                    list = new ArrayList<>();
                                }
                                for (C0692e<IBinder, Bundle> eVar2 : list) {
                                    if (iBinder == eVar2.f2750a && C1277d.m4052a(bundle, eVar2.f2751b)) {
                                        return;
                                    }
                                }
                                list.add(new C0692e<>(iBinder, bundle));
                                bVar.f4229g.put(str, list);
                                C12791 r4 = new C1297i<List<MediaBrowserCompat.MediaItem>>(str, bVar, str, bundle) {
                                    /* class androidx.media.AbstractServiceC1278e.C12791 */

                                    /* renamed from: a */
                                    final /* synthetic */ C1284b f4210a;

                                    /* renamed from: b */
                                    final /* synthetic */ String f4211b;

                                    /* renamed from: c */
                                    final /* synthetic */ Bundle f4212c;

                                    /* renamed from: d */
                                    final /* synthetic */ Bundle f4213d = null;

                                    static {
                                        Covode.recordClassIndex(1392);
                                    }

                                    /* access modifiers changed from: package-private */
                                    @Override // androidx.media.AbstractServiceC1278e.C1297i
                                    /* renamed from: a */
                                    public final /* synthetic */ void mo4265a() {
                                        C1284b bVar = AbstractServiceC1278e.this.f4205b.get(this.f4210a.f4228f.mo4289a());
                                        C1284b bVar2 = this.f4210a;
                                        if (bVar == bVar2) {
                                            try {
                                                bVar2.f4228f.mo4291a(this.f4211b, null, this.f4212c, this.f4213d);
                                            } catch (RemoteException unused) {
                                            }
                                        }
                                    }

                                    {
                                        this.f4210a = r4;
                                        this.f4211b = r5;
                                        this.f4212c = r6;
                                    }
                                };
                                eVar.f4206c = bVar;
                                if (bundle == null) {
                                    eVar.mo4259a(str, r4);
                                } else {
                                    eVar.mo4261b(str, r4);
                                }
                                eVar.f4206c = null;
                                if (r4.mo4279d()) {
                                    eVar.f4206c = bVar;
                                    eVar.f4206c = null;
                                    return;
                                }
                                throw new IllegalStateException("onLoadChildren must call detach() or sendResult() before returning for package=" + bVar.f4223a + " id=" + str);
                            }
                        }

                        {
                            this.f4266a = r2;
                            this.f4267b = r3;
                            this.f4268c = r4;
                            this.f4269d = r5;
                        }
                    });
                    return;
                case 4:
                    C1298j jVar4 = this.f4299b;
                    AbstractServiceC1278e.this.f4207d.mo4293a(new Runnable(new C1309l(message.replyTo), data.getString("data_media_item_id"), C0578c.m2196a(data, "data_callback_token")) {
                        /* class androidx.media.AbstractServiceC1278e.C1298j.RunnableC13024 */

                        /* renamed from: a */
                        final /* synthetic */ AbstractC1308k f4271a;

                        /* renamed from: b */
                        final /* synthetic */ String f4272b;

                        /* renamed from: c */
                        final /* synthetic */ IBinder f4273c;

                        static {
                            Covode.recordClassIndex(1415);
                        }

                        public final void run() {
                            C1284b bVar = AbstractServiceC1278e.this.f4205b.get(this.f4271a.mo4289a());
                            if (bVar != null) {
                                AbstractServiceC1278e.this.mo4260a(this.f4272b, bVar, this.f4273c);
                            }
                        }

                        {
                            this.f4271a = r2;
                            this.f4272b = r3;
                            this.f4273c = r4;
                        }
                    });
                    return;
                case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                    C1298j jVar5 = this.f4299b;
                    String string2 = data.getString("data_media_item_id");
                    ResultReceiver resultReceiver = (ResultReceiver) data.getParcelable("data_result_receiver");
                    C1309l lVar2 = new C1309l(message.replyTo);
                    if (!(TextUtils.isEmpty(string2) || resultReceiver == null)) {
                        AbstractServiceC1278e.this.f4207d.mo4293a(new Runnable(lVar2, string2, resultReceiver) {
                            /* class androidx.media.AbstractServiceC1278e.C1298j.RunnableC13035 */

                            /* renamed from: a */
                            final /* synthetic */ AbstractC1308k f4275a;

                            /* renamed from: b */
                            final /* synthetic */ String f4276b;

                            /* renamed from: c */
                            final /* synthetic */ ResultReceiver f4277c;

                            static {
                                Covode.recordClassIndex(1416);
                            }

                            public final void run() {
                                C1284b bVar = AbstractServiceC1278e.this.f4205b.get(this.f4275a.mo4289a());
                                if (bVar != null) {
                                    AbstractServiceC1278e eVar = AbstractServiceC1278e.this;
                                    String str = this.f4276b;
                                    C12802 r1 = new C1297i<MediaBrowserCompat.MediaItem>(str, this.f4277c) {
                                        /* class androidx.media.AbstractServiceC1278e.C12802 */

                                        /* renamed from: a */
                                        final /* synthetic */ ResultReceiver f4215a;

                                        static {
                                            Covode.recordClassIndex(1393);
                                        }

                                        /* access modifiers changed from: package-private */
                                        @Override // androidx.media.AbstractServiceC1278e.C1297i
                                        /* renamed from: a */
                                        public final /* synthetic */ void mo4265a() {
                                            if ((this.f4256i & 2) != 0) {
                                                this.f4215a.mo326b(-1, null);
                                                return;
                                            }
                                            Bundle bundle = new Bundle();
                                            bundle.putParcelable("media_item", null);
                                            this.f4215a.mo326b(0, bundle);
                                        }

                                        {
                                            this.f4215a = r3;
                                        }
                                    };
                                    eVar.f4206c = bVar;
                                    AbstractServiceC1278e.m4053a(r1);
                                    eVar.f4206c = null;
                                    if (!r1.mo4279d()) {
                                        throw new IllegalStateException("onLoadItem must call detach() or sendResult() before returning for id=".concat(String.valueOf(str)));
                                    }
                                }
                            }

                            {
                                this.f4275a = r2;
                                this.f4276b = r3;
                                this.f4277c = r4;
                            }
                        });
                        return;
                    }
                    return;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                    Bundle bundle3 = data.getBundle("data_root_hints");
                    MediaSessionCompat.m227a(bundle3);
                    C1298j jVar6 = this.f4299b;
                    AbstractServiceC1278e.this.f4207d.mo4293a(new Runnable(new C1309l(message.replyTo), data.getString("data_package_name"), data.getInt("data_calling_pid"), data.getInt("data_calling_uid"), bundle3) {
                        /* class androidx.media.AbstractServiceC1278e.C1298j.RunnableC13046 */

                        /* renamed from: a */
                        final /* synthetic */ AbstractC1308k f4279a;

                        /* renamed from: b */
                        final /* synthetic */ String f4280b;

                        /* renamed from: c */
                        final /* synthetic */ int f4281c;

                        /* renamed from: d */
                        final /* synthetic */ int f4282d;

                        /* renamed from: e */
                        final /* synthetic */ Bundle f4283e;

                        static {
                            Covode.recordClassIndex(1417);
                        }

                        public final void run() {
                            IBinder a = this.f4279a.mo4289a();
                            AbstractServiceC1278e.this.f4205b.remove(a);
                            C1284b bVar = new C1284b(this.f4280b, this.f4281c, this.f4282d, this.f4283e, this.f4279a);
                            AbstractServiceC1278e.this.f4205b.put(a, bVar);
                            try {
                                a.linkToDeath(bVar, 0);
                            } catch (RemoteException unused) {
                            }
                        }

                        {
                            this.f4279a = r2;
                            this.f4280b = r3;
                            this.f4281c = r4;
                            this.f4282d = r5;
                            this.f4283e = r6;
                        }
                    });
                    return;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                    C1298j jVar7 = this.f4299b;
                    AbstractServiceC1278e.this.f4207d.mo4293a(new Runnable(new C1309l(message.replyTo)) {
                        /* class androidx.media.AbstractServiceC1278e.C1298j.RunnableC13057 */

                        /* renamed from: a */
                        final /* synthetic */ AbstractC1308k f4285a;

                        static {
                            Covode.recordClassIndex(1418);
                        }

                        public final void run() {
                            IBinder a = this.f4285a.mo4289a();
                            C1284b remove = AbstractServiceC1278e.this.f4205b.remove(a);
                            if (remove != null) {
                                a.unlinkToDeath(remove, 0);
                            }
                        }

                        {
                            this.f4285a = r2;
                        }
                    });
                    return;
                case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                    Bundle bundle4 = data.getBundle("data_search_extras");
                    MediaSessionCompat.m227a(bundle4);
                    C1298j jVar8 = this.f4299b;
                    String string3 = data.getString("data_search_query");
                    ResultReceiver resultReceiver2 = (ResultReceiver) data.getParcelable("data_result_receiver");
                    C1309l lVar3 = new C1309l(message.replyTo);
                    if (!(TextUtils.isEmpty(string3) || resultReceiver2 == null)) {
                        AbstractServiceC1278e.this.f4207d.mo4293a(new Runnable(lVar3, string3, bundle4, resultReceiver2) {
                            /* class androidx.media.AbstractServiceC1278e.C1298j.RunnableC13068 */

                            /* renamed from: a */
                            final /* synthetic */ AbstractC1308k f4287a;

                            /* renamed from: b */
                            final /* synthetic */ String f4288b;

                            /* renamed from: c */
                            final /* synthetic */ Bundle f4289c;

                            /* renamed from: d */
                            final /* synthetic */ ResultReceiver f4290d;

                            static {
                                Covode.recordClassIndex(1419);
                            }

                            public final void run() {
                                C1284b bVar = AbstractServiceC1278e.this.f4205b.get(this.f4287a.mo4289a());
                                if (bVar != null) {
                                    AbstractServiceC1278e eVar = AbstractServiceC1278e.this;
                                    String str = this.f4288b;
                                    C12813 r1 = new C1297i<List<MediaBrowserCompat.MediaItem>>(str, this.f4290d) {
                                        /* class androidx.media.AbstractServiceC1278e.C12813 */

                                        /* renamed from: a */
                                        final /* synthetic */ ResultReceiver f4217a;

                                        static {
                                            Covode.recordClassIndex(1394);
                                        }

                                        /* access modifiers changed from: package-private */
                                        @Override // androidx.media.AbstractServiceC1278e.C1297i
                                        /* renamed from: a */
                                        public final /* synthetic */ void mo4265a() {
                                            this.f4217a.mo326b(-1, null);
                                        }

                                        {
                                            this.f4217a = r3;
                                        }
                                    };
                                    eVar.f4206c = bVar;
                                    r1.f4256i = 4;
                                    r1.mo4278c();
                                    eVar.f4206c = null;
                                    if (!r1.mo4279d()) {
                                        throw new IllegalStateException("onSearch must call detach() or sendResult() before returning for query=".concat(String.valueOf(str)));
                                    }
                                }
                            }

                            {
                                this.f4287a = r2;
                                this.f4288b = r3;
                                this.f4289c = r4;
                                this.f4290d = r5;
                            }
                        });
                        return;
                    }
                    return;
                case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                    Bundle bundle5 = data.getBundle("data_custom_action_extras");
                    MediaSessionCompat.m227a(bundle5);
                    C1298j jVar9 = this.f4299b;
                    String string4 = data.getString("data_custom_action");
                    ResultReceiver resultReceiver3 = (ResultReceiver) data.getParcelable("data_result_receiver");
                    C1309l lVar4 = new C1309l(message.replyTo);
                    if (!(TextUtils.isEmpty(string4) || resultReceiver3 == null)) {
                        AbstractServiceC1278e.this.f4207d.mo4293a(new Runnable(lVar4, string4, bundle5, resultReceiver3) {
                            /* class androidx.media.AbstractServiceC1278e.C1298j.RunnableC13079 */

                            /* renamed from: a */
                            final /* synthetic */ AbstractC1308k f4292a;

                            /* renamed from: b */
                            final /* synthetic */ String f4293b;

                            /* renamed from: c */
                            final /* synthetic */ Bundle f4294c;

                            /* renamed from: d */
                            final /* synthetic */ ResultReceiver f4295d;

                            static {
                                Covode.recordClassIndex(1420);
                            }

                            public final void run() {
                                C1284b bVar = AbstractServiceC1278e.this.f4205b.get(this.f4292a.mo4289a());
                                if (bVar != null) {
                                    AbstractServiceC1278e eVar = AbstractServiceC1278e.this;
                                    String str = this.f4293b;
                                    Bundle bundle = this.f4294c;
                                    C12824 r3 = new C1297i<Bundle>(str, this.f4295d) {
                                        /* class androidx.media.AbstractServiceC1278e.C12824 */

                                        /* renamed from: a */
                                        final /* synthetic */ ResultReceiver f4219a;

                                        static {
                                            Covode.recordClassIndex(1395);
                                        }

                                        /* access modifiers changed from: package-private */
                                        @Override // androidx.media.AbstractServiceC1278e.C1297i
                                        /* renamed from: a */
                                        public final /* synthetic */ void mo4265a() {
                                            this.f4219a.mo326b(0, null);
                                        }

                                        /* access modifiers changed from: package-private */
                                        @Override // androidx.media.AbstractServiceC1278e.C1297i
                                        /* renamed from: b */
                                        public final void mo4266b() {
                                            this.f4219a.mo326b(-1, null);
                                        }

                                        {
                                            this.f4219a = r3;
                                        }
                                    };
                                    eVar.f4206c = bVar;
                                    if (r3.f4254g || r3.f4255h) {
                                        throw new IllegalStateException("sendError() called when either sendResult() or sendError() had already been called for: " + r3.f4253f);
                                    }
                                    r3.f4255h = true;
                                    r3.mo4266b();
                                    eVar.f4206c = null;
                                    if (!r3.mo4279d()) {
                                        throw new IllegalStateException("onCustomAction must call detach() or sendResult() or sendError() before returning for action=" + str + " extras=" + bundle);
                                    }
                                }
                            }

                            {
                                this.f4292a = r2;
                                this.f4293b = r3;
                                this.f4294c = r4;
                                this.f4295d = r5;
                            }
                        });
                        return;
                    }
                    return;
                default:
                    int i3 = message.arg1;
                    return;
            }
        }

        public final boolean sendMessageAtTime(Message message, long j) {
            Bundle data = message.getData();
            data.setClassLoader(MediaBrowserCompat.class.getClassLoader());
            data.putInt("data_calling_uid", Binder.getCallingUid());
            data.putInt("data_calling_pid", Binder.getCallingPid());
            return super.sendMessageAtTime(message, j);
        }
    }

    /* renamed from: a */
    public final void mo4258a(MediaSessionCompat.Token token) {
        if (token == null) {
            throw new IllegalArgumentException("Session token may not be null.");
        } else if (this.f4208e == null) {
            this.f4208e = token;
            this.f4209f.mo4271a(token);
        } else {
            throw new IllegalStateException("The session token has already been set.");
        }
    }

    /* renamed from: b */
    public final void mo4261b(String str, C1297i<List<MediaBrowserCompat.MediaItem>> iVar) {
        iVar.f4256i = 1;
        mo4259a(str, iVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo4260a(String str, C1284b bVar, IBinder iBinder) {
        boolean z = true;
        boolean z2 = false;
        if (iBinder == null) {
            try {
                if (bVar.f4229g.remove(str) == null) {
                    z = false;
                }
                return z;
            } finally {
                this.f4206c = bVar;
                this.f4206c = null;
            }
        } else {
            List<C0692e<IBinder, Bundle>> list = bVar.f4229g.get(str);
            if (list != null) {
                Iterator<C0692e<IBinder, Bundle>> it = list.iterator();
                while (it.hasNext()) {
                    if (iBinder == it.next().f2750a) {
                        it.remove();
                        z2 = true;
                    }
                }
                if (list.size() == 0) {
                    bVar.f4229g.remove(str);
                }
            }
            this.f4206c = bVar;
            this.f4206c = null;
            return z2;
        }
    }
}
