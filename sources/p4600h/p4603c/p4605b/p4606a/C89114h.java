package p4600h.p4603c.p4605b.p4606a;

import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import java.lang.reflect.Method;

/* access modifiers changed from: package-private */
/* renamed from: h.c.b.a.h */
public final class C89114h {

    /* renamed from: a */
    static final C89115a f202826a = new C89115a(null, null, null);

    /* renamed from: b */
    static C89115a f202827b;

    /* renamed from: c */
    public static final C89114h f202828c = new C89114h();

    private C89114h() {
    }

    static {
        Covode.recordClassIndex(105198);
    }

    /* renamed from: a */
    static C89115a m154618a(AbstractC89107a aVar) {
        try {
            C89115a aVar2 = new C89115a(Class.class.getDeclaredMethod("getModule", new Class[0]), aVar.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), aVar.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod(StringSet.name, new Class[0]));
            f202827b = aVar2;
            return aVar2;
        } catch (Exception unused) {
            C89115a aVar3 = f202826a;
            f202827b = aVar3;
            return aVar3;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h.c.b.a.h$a */
    public static final class C89115a {

        /* renamed from: a */
        public final Method f202829a;

        /* renamed from: b */
        public final Method f202830b;

        /* renamed from: c */
        public final Method f202831c;

        static {
            Covode.recordClassIndex(105199);
        }

        public C89115a(Method method, Method method2, Method method3) {
            this.f202829a = method;
            this.f202830b = method2;
            this.f202831c = method3;
        }
    }
}
