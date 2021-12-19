package androidx.lifecycle;

import android.app.Application;
import com.bytedance.covode.number.Covode;
import com.bytedance.provider.p1587vm.ScopeViewModel;
import java.lang.reflect.InvocationTargetException;

/* renamed from: androidx.lifecycle.ad */
public class C1175ad {

    /* renamed from: a */
    private final AbstractC1177b f3965a;

    /* renamed from: b */
    private final C1182af f3966b;

    /* renamed from: androidx.lifecycle.ad$b */
    public interface AbstractC1177b {
        static {
            Covode.recordClassIndex(1284);
        }

        /* renamed from: a */
        <T extends AbstractC1174ac> T mo3261a(Class<T> cls);
    }

    static {
        Covode.recordClassIndex(1282);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.lifecycle.ad$c */
    public static abstract class AbstractC1178c extends C1180e implements AbstractC1177b {
        static {
            Covode.recordClassIndex(1285);
        }

        /* renamed from: a */
        public abstract <T extends AbstractC1174ac> T mo3995a();

        AbstractC1178c() {
        }
    }

    /* renamed from: androidx.lifecycle.ad$e */
    static class C1180e {
        static {
            Covode.recordClassIndex(1287);
        }

        C1180e() {
        }
    }

    /* renamed from: androidx.lifecycle.ad$a */
    public static class C1176a extends C1179d {

        /* renamed from: b */
        private static C1176a f3967b;

        /* renamed from: c */
        private Application f3968c;

        static {
            Covode.recordClassIndex(1283);
        }

        public C1176a(Application application) {
            this.f3968c = application;
        }

        /* renamed from: a */
        public static C1176a m3873a(Application application) {
            if (f3967b == null) {
                f3967b = new C1176a(application);
            }
            return f3967b;
        }

        @Override // androidx.lifecycle.C1175ad.C1179d, androidx.lifecycle.C1175ad.AbstractC1177b
        /* renamed from: a */
        public <T extends AbstractC1174ac> T mo3261a(Class<T> cls) {
            if (!AndroidViewModel.class.isAssignableFrom(cls)) {
                return (T) super.mo3261a(cls);
            }
            try {
                return cls.getConstructor(Application.class).newInstance(this.f3968c);
            } catch (NoSuchMethodException e) {
                throw new RuntimeException("Cannot create an instance of ".concat(String.valueOf(cls)), e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("Cannot create an instance of ".concat(String.valueOf(cls)), e2);
            } catch (InstantiationException e3) {
                throw new RuntimeException("Cannot create an instance of ".concat(String.valueOf(cls)), e3);
            } catch (InvocationTargetException e4) {
                throw new RuntimeException("Cannot create an instance of ".concat(String.valueOf(cls)), e4);
            }
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1175ad(androidx.lifecycle.AbstractC1183ag r3) {
        /*
            r2 = this;
            androidx.lifecycle.af r1 = r3.getViewModelStore()
            boolean r0 = r3 instanceof androidx.lifecycle.AbstractC1193g
            if (r0 == 0) goto L_0x0012
            androidx.lifecycle.g r3 = (androidx.lifecycle.AbstractC1193g) r3
            androidx.lifecycle.ad$b r0 = r3.mo4009a()
        L_0x000e:
            r2.<init>(r1, r0)
            return
        L_0x0012:
            androidx.lifecycle.ad$d r0 = androidx.lifecycle.C1175ad.C1179d.f3969a
            if (r0 != 0) goto L_0x001d
            androidx.lifecycle.ad$d r0 = new androidx.lifecycle.ad$d
            r0.<init>()
            androidx.lifecycle.C1175ad.C1179d.f3969a = r0
        L_0x001d:
            androidx.lifecycle.ad$d r0 = androidx.lifecycle.C1175ad.C1179d.f3969a
            goto L_0x000e
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.C1175ad.<init>(androidx.lifecycle.ag):void");
    }

    /* renamed from: androidx.lifecycle.ad$d */
    public static class C1179d implements AbstractC1177b {

        /* renamed from: a */
        static C1179d f3969a;

        static {
            Covode.recordClassIndex(1286);
        }

        @Override // androidx.lifecycle.C1175ad.AbstractC1177b
        /* renamed from: a */
        public <T extends AbstractC1174ac> T mo3261a(Class<T> cls) {
            try {
                return cls.newInstance();
            } catch (InstantiationException e) {
                throw new RuntimeException("Cannot create an instance of ".concat(String.valueOf(cls)), e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("Cannot create an instance of ".concat(String.valueOf(cls)), e2);
            }
        }
    }

    /* renamed from: a */
    public <T extends AbstractC1174ac> T mo3983a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            String concat = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(String.valueOf(canonicalName));
            if (cls.equals(ScopeViewModel.class)) {
                return (T) mo3984a(concat, cls);
            }
            T t = (T) mo3984a(concat, cls);
            C1171ab.m3870a(t, this);
            return t;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public C1175ad(C1182af afVar, AbstractC1177b bVar) {
        this.f3965a = bVar;
        this.f3966b = afVar;
    }

    public C1175ad(AbstractC1183ag agVar, AbstractC1177b bVar) {
        this(agVar.getViewModelStore(), bVar);
    }

    /* renamed from: a */
    public <T extends AbstractC1174ac> T mo3984a(String str, Class<T> cls) {
        T t = (T) this.f3966b.mo3996a(str);
        if (cls.isInstance(t)) {
            return t;
        }
        AbstractC1177b bVar = this.f3965a;
        T t2 = bVar instanceof AbstractC1178c ? (T) ((AbstractC1178c) bVar).mo3995a() : (T) bVar.mo3261a(cls);
        this.f3966b.mo3998a(str, t2);
        return t2;
    }
}
