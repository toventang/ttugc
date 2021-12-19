package com.p2082ss.android.ugc.aweme.kids.experiment.abmock;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.google.gson.AbstractC28019l;
import com.google.gson.C27910f;
import com.google.gson.C27919i;
import com.google.gson.C28022o;
import com.google.gson.C28025r;
import com.p2082ss.android.ugc.aweme.kids.api.abmock.AbstractC57149a;
import com.p2082ss.android.ugc.aweme.kids.api.abmock.C57150b;
import com.p2082ss.android.ugc.aweme.kids.api.abmock.EnumC57151c;
import com.p2082ss.android.ugc.aweme.kids.experiment.abmock.p3352b.C57620a;
import com.p2082ss.android.ugc.aweme.kids.experiment.abmock.p3352b.C57621b;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.experiment.abmock.a */
public final class C57611a {

    /* renamed from: a */
    public static final C57611a f131498a = new C57611a();

    /* renamed from: b */
    private static C57621b f131499b = C57621b.f131512a;

    /* renamed from: c */
    private static ConcurrentHashMap<String, Object> f131500c = new ConcurrentHashMap<>();

    private C57611a() {
    }

    static {
        Covode.recordClassIndex(67570);
    }

    /* renamed from: a */
    public static Object m104321a(AbstractC57149a aVar) {
        C89219l.m154721d(aVar, "");
        C57612a b = m104325b(aVar);
        String str = b.f131501a;
        Object obj = b.f131502b;
        EnumC57151c cVar = b.f131503c;
        boolean z = b.f131504d;
        if (cVar == EnumC57151c.BOOL) {
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Boolean");
            return Boolean.valueOf(m104324a(str, ((Boolean) obj).booleanValue(), z));
        } else if (cVar == EnumC57151c.INT) {
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Int");
            return Integer.valueOf(m104320a(str, ((Integer) obj).intValue(), z));
        } else if (cVar != EnumC57151c.STRING) {
            return new C79459a(C17867d.m33078a()).mo123052a("please use getObjectValue");
        } else {
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.String");
            return m104322a(str, (String) obj, z);
        }
    }

    /* renamed from: b */
    private static C57612a m104325b(AbstractC57149a aVar) {
        Object obj;
        String a = aVar.mo94306a();
        EnumC57151c c = aVar.mo94308c();
        List<C57150b> b = aVar.mo94307b();
        if (!b.isEmpty()) {
            obj = b.get(0).f130112c;
        } else {
            obj = "";
        }
        boolean d = aVar.mo94309d();
        for (T t : b) {
            if (t.f130111b) {
                obj = t.f130112c;
            }
        }
        return new C57612a(a, obj, c, d);
    }

    /* renamed from: a */
    public static void m104323a(C28022o oVar) {
        String[] strArr;
        C89219l.m154721d(oVar, "");
        C57620a.f131509a.clear();
        for (Map.Entry<String, AbstractC28019l> entry : oVar.f65804a.entrySet()) {
            String key = entry.getKey();
            AbstractC28019l value = entry.getValue();
            C89219l.m154716b(value, "");
            if (value instanceof C27919i) {
                C89219l.m154716b(key, "");
                C27919i k = value.mo46790k();
                C89219l.m154721d(key, "");
                try {
                    if (C57620a.f131510b == null) {
                        C57620a.f131510b = new C27910f();
                    }
                    C27910f fVar = C57620a.f131510b;
                    if (fVar != null) {
                        strArr = (String[]) fVar.mo46667a((AbstractC28019l) k, String[].class);
                    } else {
                        strArr = null;
                    }
                    C57620a.f131509a.storeStringArray(key, strArr);
                } catch (Throwable unused) {
                }
            } else if (value instanceof C28022o) {
                C89219l.m154716b(key, "");
                C28022o j = value.mo46789j();
                C89219l.m154716b(j, "");
                C89219l.m154721d(key, "");
                C89219l.m154721d(j, "");
                C57620a.f131509a.storeString(key, j.toString());
            } else {
                C28025r l = value.mo46791l();
                C89219l.m154716b(l, "");
                if (l.f65806a instanceof Number) {
                    C89219l.m154716b(key, "");
                    int g = value.mo46694g();
                    C89219l.m154721d(key, "");
                    C57620a.f131509a.storeInt(key, g);
                } else {
                    C28025r l2 = value.mo46791l();
                    C89219l.m154716b(l2, "");
                    if (l2.f65806a instanceof Boolean) {
                        C89219l.m154716b(key, "");
                        boolean h = value.mo46695h();
                        C89219l.m154721d(key, "");
                        C57620a.f131509a.storeBoolean(key, h);
                    } else {
                        C28025r l3 = value.mo46791l();
                        C89219l.m154716b(l3, "");
                        if (l3.f65806a instanceof String) {
                            C89219l.m154716b(key, "");
                            String c = value.mo46689c();
                            C89219l.m154716b(c, "");
                            C89219l.m154721d(key, "");
                            C89219l.m154721d(c, "");
                            C57620a.f131509a.storeString(key, c);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static int m104320a(String str, int i, boolean z) {
        Object obj;
        if (C57621b.m104347a("")) {
            return Integer.valueOf(C57621b.m104346a(str, i)).intValue();
        }
        if (z && (obj = f131500c.get(str)) != null) {
            return ((Integer) obj).intValue();
        }
        Integer valueOf = Integer.valueOf(C57620a.m104343a(str, i));
        f131500c.put(str, valueOf);
        return valueOf.intValue();
    }

    /* renamed from: a */
    private static String m104322a(String str, String str2, boolean z) {
        Object obj;
        String b;
        if (C57621b.m104347a("") && (b = C57621b.m104349b(str)) != null) {
            return b;
        }
        if (z && (obj = f131500c.get(str)) != null) {
            return (String) obj;
        }
        String a = C57620a.m104344a(str, str2);
        f131500c.put(str, a);
        return a;
    }

    /* renamed from: a */
    private static boolean m104324a(String str, boolean z, boolean z2) {
        Object obj;
        if (C57621b.m104347a("")) {
            return Boolean.valueOf(C57621b.m104348a(str, z)).booleanValue();
        }
        if (z2 && (obj = f131500c.get(str)) != null) {
            return ((Boolean) obj).booleanValue();
        }
        Boolean valueOf = Boolean.valueOf(C57620a.m104345a(str, z));
        f131500c.put(str, valueOf);
        return valueOf.booleanValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.experiment.abmock.a$a */
    public static final class C57612a {

        /* renamed from: a */
        public final String f131501a;

        /* renamed from: b */
        public final Object f131502b;

        /* renamed from: c */
        public final EnumC57151c f131503c;

        /* renamed from: d */
        public final boolean f131504d;

        static {
            Covode.recordClassIndex(67571);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C57612a)) {
                return false;
            }
            C57612a aVar = (C57612a) obj;
            return C89219l.m154714a(this.f131501a, aVar.f131501a) && C89219l.m154714a(this.f131502b, aVar.f131502b) && C89219l.m154714a(this.f131503c, aVar.f131503c) && this.f131504d == aVar.f131504d;
        }

        public final int hashCode() {
            String str = this.f131501a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            Object obj = this.f131502b;
            int hashCode2 = (hashCode + (obj != null ? obj.hashCode() : 0)) * 31;
            EnumC57151c cVar = this.f131503c;
            if (cVar != null) {
                i = cVar.hashCode();
            }
            int i2 = (hashCode2 + i) * 31;
            boolean z = this.f131504d;
            if (z) {
                z = true;
            }
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            int i5 = z ? 1 : 0;
            return i2 + i3;
        }

        public final String toString() {
            return "BasicInfo(key=" + this.f131501a + ", defaultValue=" + this.f131502b + ", type=" + this.f131503c + ", needCache=" + this.f131504d + ")";
        }

        public C57612a(String str, Object obj, EnumC57151c cVar, boolean z) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(obj, "");
            C89219l.m154721d(cVar, "");
            this.f131501a = str;
            this.f131502b = obj;
            this.f131503c = cVar;
            this.f131504d = z;
        }
    }
}
