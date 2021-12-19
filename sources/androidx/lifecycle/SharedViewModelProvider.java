package androidx.lifecycle;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.C1175ad;
import com.bytedance.covode.number.Covode;
import com.bytedance.provider.p1587vm.ScopeViewModel;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import p4600h.p4611f.p4613b.C89219l;

public final class SharedViewModelProvider extends C1175ad {

    /* renamed from: a */
    public static final C1165a f3939a = new C1165a((byte) 0);

    /* renamed from: d */
    private static final C1182af f3940d = new C1182af();

    /* renamed from: e */
    private static final HashMap<String, Set<AbstractC1196i>> f3941e = new HashMap<>();

    /* renamed from: b */
    private C1182af f3942b;

    /* renamed from: c */
    private HashMap<String, Set<AbstractC1196i>> f3943c;

    /* renamed from: androidx.lifecycle.SharedViewModelProvider$a */
    public static final class C1165a {
        static {
            Covode.recordClassIndex(1269);
        }

        private C1165a() {
        }

        public /* synthetic */ C1165a(byte b) {
            this();
        }
    }

    public /* synthetic */ SharedViewModelProvider() {
        this(new C1175ad.C1179d());
    }

    static {
        Covode.recordClassIndex(1267);
    }

    @Override // androidx.lifecycle.C1175ad
    /* renamed from: a */
    public final <T extends AbstractC1174ac> T mo3983a(Class<T> cls) {
        C89219l.m154719c(cls, "");
        throw new IllegalAccessException("Unsupport get viewmodel without lifecycle, please use method get(Lifecycle,Class) or get(Lifecycle,String,Class) instead");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SharedViewModelProvider(androidx.lifecycle.C1175ad.AbstractC1177b r2) {
        /*
            r1 = this;
            java.lang.String r0 = ""
            p4600h.p4611f.p4613b.C89219l.m154719c(r2, r0)
            androidx.lifecycle.af r0 = androidx.lifecycle.SharedViewModelProvider.f3940d
            r1.<init>(r0, r2)
            r1.f3942b = r0
            java.util.HashMap<java.lang.String, java.util.Set<androidx.lifecycle.i>> r0 = androidx.lifecycle.SharedViewModelProvider.f3941e
            r1.f3943c = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.SharedViewModelProvider.<init>(androidx.lifecycle.ad$b):void");
    }

    /* access modifiers changed from: package-private */
    public static final class ClearUselessViewModelObserver implements AbstractC1202k {

        /* renamed from: a */
        private final AbstractC1196i f3944a;

        /* renamed from: b */
        private final String f3945b;

        /* renamed from: c */
        private final C1182af f3946c;

        /* renamed from: d */
        private final HashMap<String, Set<AbstractC1196i>> f3947d;

        static {
            Covode.recordClassIndex(1268);
        }

        @Override // androidx.lifecycle.AbstractC1202k
        public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
            C89219l.m154719c(mVar, "");
            C89219l.m154719c(aVar, "");
            if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
                Set<AbstractC1196i> set = this.f3947d.get(this.f3945b);
                if (set == null) {
                    set = new LinkedHashSet<>();
                }
                Set<AbstractC1196i> set2 = set;
                set2.remove(this.f3944a);
                if (set2.isEmpty()) {
                    this.f3946c.mo3998a(this.f3945b, null);
                    this.f3947d.remove(this.f3945b);
                }
            }
        }

        public ClearUselessViewModelObserver(AbstractC1196i iVar, String str, C1182af afVar, HashMap<String, Set<AbstractC1196i>> hashMap) {
            C89219l.m154719c(iVar, "");
            C89219l.m154719c(str, "");
            C89219l.m154719c(afVar, "");
            C89219l.m154719c(hashMap, "");
            this.f3944a = iVar;
            this.f3945b = str;
            this.f3946c = afVar;
            this.f3947d = hashMap;
        }
    }

    /* renamed from: a */
    public final <T extends AbstractC1174ac> T mo3981a(AbstractC1196i iVar, Class<T> cls) {
        C89219l.m154719c(iVar, "");
        C89219l.m154719c(cls, "");
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return (T) mo3982a(iVar, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(String.valueOf(canonicalName)), cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.C1175ad
    /* renamed from: a */
    public final <T extends AbstractC1174ac> T mo3984a(String str, Class<T> cls) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(cls, "");
        throw new IllegalAccessException("Unsupport get viewmodel without lifecycle, please use method get(Lifecycle,Class) or get(Lifecycle,String,Class) instead");
    }

    /* renamed from: a */
    private static AbstractC1174ac m3858a(C1175ad adVar, String str, Class cls) {
        if (cls.equals(ScopeViewModel.class)) {
            return super.mo3984a(str, cls);
        }
        AbstractC1174ac a = super.mo3984a(str, cls);
        C1171ab.m3870a(a, adVar);
        return a;
    }

    /* renamed from: a */
    public final <T extends AbstractC1174ac> T mo3982a(AbstractC1196i iVar, String str, Class<T> cls) {
        C89219l.m154719c(iVar, "");
        C89219l.m154719c(str, "");
        C89219l.m154719c(cls, "");
        if (iVar.mo4011a() != AbstractC1196i.EnumC1199b.DESTROYED) {
            T t = (T) m3858a(this, str, cls);
            Set<AbstractC1196i> set = this.f3943c.get(str);
            if (set == null) {
                set = new LinkedHashSet<>();
            }
            Set<AbstractC1196i> set2 = set;
            this.f3943c.put(str, set2);
            if (!set2.contains(iVar)) {
                set2.add(iVar);
                iVar.mo4012a(new ClearUselessViewModelObserver(iVar, str, this.f3942b, this.f3943c));
            }
            return t;
        }
        throw new IllegalStateException("Could not get viewmodel when lifecycle was destroyed");
    }
}
