package androidx.room;

import android.app.ActivityManager;
import android.content.ClipboardManager;
import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.p012a.p013a.p014a.C0175a;
import androidx.p025c.C0498h;
import androidx.p054j.p055a.AbstractC1061b;
import androidx.p054j.p055a.AbstractC1062c;
import androidx.p054j.p055a.AbstractC1068e;
import androidx.p054j.p055a.AbstractC1069f;
import androidx.p054j.p055a.p056a.C1058c;
import androidx.room.p068a.AbstractC1501a;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: androidx.room.j */
public abstract class AbstractC1533j {

    /* renamed from: a */
    public volatile AbstractC1061b f5034a;

    /* renamed from: b */
    public Executor f5035b;

    /* renamed from: c */
    public Executor f5036c;

    /* renamed from: d */
    public AbstractC1062c f5037d;

    /* renamed from: e */
    public final C1519g f5038e = mo5084a();

    /* renamed from: f */
    boolean f5039f;

    /* renamed from: g */
    public List<AbstractC1535b> f5040g;

    /* renamed from: h */
    final ReentrantReadWriteLock f5041h = new ReentrantReadWriteLock();

    /* renamed from: i */
    public final ThreadLocal<Integer> f5042i = new ThreadLocal<>();

    /* renamed from: j */
    public final Map<String, Object> f5043j = new ConcurrentHashMap();

    /* renamed from: k */
    private boolean f5044k;

    /* renamed from: androidx.room.j$b */
    public static abstract class AbstractC1535b {
        static {
            Covode.recordClassIndex(1674);
        }

        /* renamed from: a */
        public void mo5097a(AbstractC1061b bVar) {
        }
    }

    static {
        Covode.recordClassIndex(1672);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C1519g mo5084a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract AbstractC1062c mo5087b(C1500a aVar);

    /* renamed from: b */
    public final boolean mo5088b() {
        AbstractC1061b bVar = this.f5034a;
        if (bVar == null || !bVar.mo3788e()) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public final void mo5093g() {
        this.f5037d.mo3792a().mo3784c();
    }

    /* renamed from: h */
    public final boolean mo5094h() {
        return this.f5037d.mo3792a().mo3787d();
    }

    /* renamed from: c */
    public final void mo5089c() {
        if (!this.f5044k && Looper.getMainLooper().getThread() == Thread.currentThread()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    /* renamed from: d */
    public final void mo5090d() {
        if (!mo5094h() && this.f5042i.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    /* renamed from: e */
    public final void mo5091e() {
        mo5089c();
        AbstractC1061b a = this.f5037d.mo3792a();
        this.f5038e.mo5067a(a);
        a.mo3781a();
    }

    /* renamed from: androidx.room.j$c */
    public enum EnumC1536c {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING;

        static {
            Covode.recordClassIndex(1675);
        }

        /* renamed from: androidx_room_RoomDatabase$JournalMode_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService */
        public static Object m5184x786fca12(Context context, String str) {
            Object systemService;
            if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
                if (!C58027i.f132247b && "connectivity".equals(str)) {
                    try {
                        new C21708b().mo35361a();
                        C58027i.f132247b = true;
                        return context.getSystemService(str);
                    } catch (Throwable unused) {
                    }
                }
                return context.getSystemService(str);
            } else if (!C58027i.f132246a) {
                return context.getSystemService(str);
            } else {
                synchronized (ClipboardManager.class) {
                    systemService = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(systemService, new C58027i.HandlerC58028a((Handler) declaredField.get(systemService)));
                        } catch (Exception e) {
                            C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    C58027i.f132246a = false;
                }
                return systemService;
            }
        }
    }

    /* renamed from: f */
    public final void mo5092f() {
        this.f5037d.mo3792a().mo3783b();
        if (!mo5094h()) {
            C1519g gVar = this.f5038e;
            if (gVar.f4993d.compareAndSet(false, true)) {
                gVar.f4992c.f5035b.execute(gVar.f4998i);
            }
        }
    }

    /* renamed from: androidx.room.j$a */
    public static class C1534a<T extends AbstractC1533j> {

        /* renamed from: a */
        public ArrayList<AbstractC1535b> f5045a;

        /* renamed from: b */
        public boolean f5046b;

        /* renamed from: c */
        public boolean f5047c = true;

        /* renamed from: d */
        public boolean f5048d;

        /* renamed from: e */
        private final Class<T> f5049e;

        /* renamed from: f */
        private final String f5050f;

        /* renamed from: g */
        private final Context f5051g;

        /* renamed from: h */
        private Executor f5052h;

        /* renamed from: i */
        private Executor f5053i;

        /* renamed from: j */
        private AbstractC1062c.AbstractC1066c f5054j;

        /* renamed from: k */
        private EnumC1536c f5055k = EnumC1536c.AUTOMATIC;

        /* renamed from: l */
        private boolean f5056l;

        /* renamed from: m */
        private final C1537d f5057m = new C1537d();

        /* renamed from: n */
        private Set<Integer> f5058n;

        /* renamed from: o */
        private Set<Integer> f5059o;

        static {
            Covode.recordClassIndex(1673);
        }

        /* renamed from: a */
        public final T mo5096a() {
            if (this.f5051g == null) {
                throw new IllegalArgumentException("Cannot provide null context for the database.");
            } else if (this.f5049e != null) {
                Executor executor = this.f5052h;
                if (executor == null) {
                    if (this.f5053i == null) {
                        Executor executor2 = C0175a.f467c;
                        this.f5053i = executor2;
                        this.f5052h = executor2;
                    } else {
                        Executor executor3 = this.f5053i;
                        if (executor3 != null) {
                            this.f5052h = executor3;
                        }
                    }
                } else if (this.f5053i == null) {
                    this.f5053i = executor;
                }
                Set<Integer> set = this.f5059o;
                if (!(set == null || this.f5058n == null)) {
                    for (Integer num : set) {
                        if (this.f5058n.contains(num)) {
                            throw new IllegalArgumentException("Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: ".concat(String.valueOf(num)));
                        }
                    }
                }
                if (this.f5054j == null) {
                    this.f5054j = new C1058c();
                }
                Context context = this.f5051g;
                String str = this.f5050f;
                AbstractC1062c.AbstractC1066c cVar = this.f5054j;
                C1537d dVar = this.f5057m;
                ArrayList<AbstractC1535b> arrayList = this.f5045a;
                boolean z = this.f5046b;
                EnumC1536c cVar2 = this.f5055k;
                if (cVar2 == EnumC1536c.AUTOMATIC) {
                    int i = Build.VERSION.SDK_INT;
                    ActivityManager activityManager = (ActivityManager) EnumC1536c.m5184x786fca12(context, "activity");
                    if (activityManager != null) {
                        int i2 = Build.VERSION.SDK_INT;
                        if (!activityManager.isLowRamDevice()) {
                            cVar2 = EnumC1536c.WRITE_AHEAD_LOGGING;
                        }
                    }
                    cVar2 = EnumC1536c.TRUNCATE;
                }
                C1500a aVar = new C1500a(context, str, cVar, dVar, arrayList, z, cVar2, this.f5052h, this.f5053i, this.f5056l, this.f5047c, this.f5048d, this.f5058n);
                T t = (T) ((AbstractC1533j) C1532i.m5167a(this.f5049e, "_Impl"));
                t.mo5086a(aVar);
                return t;
            } else {
                throw new IllegalArgumentException("Must provide an abstract class that extends RoomDatabase");
            }
        }

        /* renamed from: a */
        public final C1534a<T> mo5095a(AbstractC1501a... aVarArr) {
            if (this.f5059o == null) {
                this.f5059o = new HashSet();
            }
            for (AbstractC1501a aVar : aVarArr) {
                this.f5059o.add(Integer.valueOf(aVar.f4961a));
                this.f5059o.add(Integer.valueOf(aVar.f4962b));
            }
            this.f5057m.mo5099a(aVarArr);
            return this;
        }

        public C1534a(Context context, Class<T> cls, String str) {
            this.f5051g = context;
            this.f5049e = cls;
            this.f5050f = str;
        }
    }

    /* renamed from: a */
    public final Cursor mo5082a(AbstractC1068e eVar) {
        mo5089c();
        mo5090d();
        return this.f5037d.mo3792a().mo3779a(eVar);
    }

    /* renamed from: androidx.room.j$d */
    public static class C1537d {

        /* renamed from: a */
        private C0498h<C0498h<AbstractC1501a>> f5061a = new C0498h<>();

        static {
            Covode.recordClassIndex(1676);
        }

        /* renamed from: a */
        public final void mo5099a(AbstractC1501a... aVarArr) {
            for (AbstractC1501a aVar : aVarArr) {
                int i = aVar.f4961a;
                int i2 = aVar.f4962b;
                C0498h<AbstractC1501a> a = this.f5061a.mo2183a(i, null);
                if (a == null) {
                    a = new C0498h<>();
                    this.f5061a.mo2186b(i, a);
                }
                a.mo2183a(i2, null);
                a.mo2188c(i2, aVar);
            }
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x001d, code lost:
            if (r0 == r2) goto L_0x0042;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
            r1 = r3.mo2187c(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0023, code lost:
            if (r8 == false) goto L_0x0035;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0025, code lost:
            if (r1 > r10) goto L_0x003a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0027, code lost:
            if (r1 <= r9) goto L_0x003a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0029, code lost:
            r7.add(r3.mo2190d(r0));
            r9 = r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0032, code lost:
            if (r8 == false) goto L_0x003f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0035, code lost:
            if (r1 < r10) goto L_0x003a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0037, code lost:
            if (r1 >= r9) goto L_0x003a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x003a, code lost:
            r0 = r0 + r5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x003c, code lost:
            r0 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x003f, code lost:
            if (r9 > r10) goto L_0x0007;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0042, code lost:
            return null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0043, code lost:
            return r7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0005, code lost:
            if (r9 < r10) goto L_0x0007;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0007, code lost:
            r3 = r6.f5061a.mo2183a(r9, null);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
            if (r3 != null) goto L_0x0013;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
            return null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:7:0x0013, code lost:
            r2 = r3.mo2184b();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0018, code lost:
            if (r8 == false) goto L_0x003c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
            r0 = r2 - 1;
            r2 = -1;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.util.List<androidx.room.p068a.AbstractC1501a> mo5098a(java.util.List<androidx.room.p068a.AbstractC1501a> r7, boolean r8, int r9, int r10) {
            /*
                r6 = this;
                r0 = -1
                r0 = 1
                if (r8 == 0) goto L_0x003e
                r5 = -1
            L_0x0005:
                if (r9 >= r10) goto L_0x0043
            L_0x0007:
                androidx.c.h<androidx.c.h<androidx.room.a.a>> r0 = r6.f5061a
                r4 = 0
                java.lang.Object r3 = r0.mo2183a(r9, r4)
                androidx.c.h r3 = (androidx.p025c.C0498h) r3
                if (r3 != 0) goto L_0x0013
                return r4
            L_0x0013:
                int r2 = r3.mo2184b()
                r0 = 0
                if (r8 == 0) goto L_0x003c
                int r0 = r2 + -1
                r2 = -1
            L_0x001d:
                if (r0 == r2) goto L_0x0042
                int r1 = r3.mo2187c(r0)
                if (r8 == 0) goto L_0x0035
                if (r1 > r10) goto L_0x003a
                if (r1 <= r9) goto L_0x003a
            L_0x0029:
                java.lang.Object r0 = r3.mo2190d(r0)
                r7.add(r0)
                r9 = r1
                r0 = 1
                if (r8 == 0) goto L_0x003f
                goto L_0x0005
            L_0x0035:
                if (r1 < r10) goto L_0x003a
                if (r1 >= r9) goto L_0x003a
                goto L_0x0029
            L_0x003a:
                int r0 = r0 + r5
                goto L_0x001d
            L_0x003c:
                r0 = 0
                goto L_0x001d
            L_0x003e:
                r5 = 1
            L_0x003f:
                if (r9 <= r10) goto L_0x0043
                goto L_0x0007
            L_0x0042:
                return r4
            L_0x0043:
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.AbstractC1533j.C1537d.mo5098a(java.util.List, boolean, int, int):java.util.List");
        }
    }

    /* renamed from: a */
    public final AbstractC1069f mo5083a(String str) {
        mo5089c();
        mo5090d();
        return this.f5037d.mo3792a().mo3780a(str);
    }

    /* renamed from: a */
    public final void mo5085a(AbstractC1061b bVar) {
        C1519g gVar = this.f5038e;
        synchronized (gVar) {
            if (!gVar.f4994e) {
                bVar.mo3785c("PRAGMA temp_store = MEMORY;");
                bVar.mo3785c("PRAGMA recursive_triggers='ON';");
                bVar.mo3785c("CREATE TEMP TABLE room_table_modification_log(table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                gVar.mo5067a(bVar);
                gVar.f4995f = bVar.mo3780a("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1 ");
                gVar.f4994e = true;
            }
        }
    }

    /* renamed from: a */
    public final void mo5086a(C1500a aVar) {
        this.f5037d = mo5087b(aVar);
        int i = Build.VERSION.SDK_INT;
        boolean z = false;
        if (aVar.f4954g == EnumC1536c.WRITE_AHEAD_LOGGING) {
            z = true;
        }
        this.f5037d.mo3793a(z);
        this.f5040g = aVar.f4952e;
        this.f5035b = aVar.f4955h;
        this.f5036c = new ExecutorC1543o(aVar.f4956i);
        this.f5044k = aVar.f4953f;
        this.f5039f = z;
        if (aVar.f4957j) {
            C1519g gVar = this.f5038e;
            gVar.f4997h = new C1524h(aVar.f4949b, aVar.f4950c, gVar, gVar.f4992c.f5035b);
        }
    }
}
