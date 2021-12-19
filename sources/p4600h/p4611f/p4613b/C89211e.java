package p4600h.p4611f.p4613b;

import com.bytedance.covode.number.Covode;
import java.lang.annotation.Annotation;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p4600h.AbstractC89096c;
import p4600h.p4611f.C89170a;
import p4600h.p4611f.C89194b;
import p4600h.p4620k.AbstractC89277c;

/* renamed from: h.f.b.e */
public final class C89211e implements AbstractC89210d, AbstractC89277c<Object> {

    /* renamed from: a */
    public static final Map<Class<? extends AbstractC89096c<?>>, Integer> f202889a;

    /* renamed from: b */
    public static final HashMap<String, String> f202890b;

    /* renamed from: c */
    public static final Map<String, String> f202891c;

    /* renamed from: d */
    public static final C89212a f202892d = new C89212a((byte) 0);

    /* renamed from: f */
    private static final HashMap<String, String> f202893f;

    /* renamed from: g */
    private static final HashMap<String, String> f202894g;

    /* renamed from: e */
    private final Class<?> f202895e;

    /* renamed from: h.f.b.e$a */
    public static final class C89212a {
        static {
            Covode.recordClassIndex(105296);
        }

        private C89212a() {
        }

        public /* synthetic */ C89212a(byte b) {
            this();
        }
    }

    @Override // p4600h.p4611f.p4613b.AbstractC89210d
    /* renamed from: a */
    public final Class<?> mo143612a() {
        return this.f202895e;
    }

    @Override // p4600h.p4620k.AbstractC89275a
    public final List<Annotation> getAnnotations() {
        throw new C89194b();
    }

    public final int hashCode() {
        return C89170a.m154666b(this).hashCode();
    }

    public final String toString() {
        return this.f202895e.toString() + " (Kotlin reflection is not available)";
    }

    @Override // p4600h.p4620k.AbstractC89277c
    /* renamed from: c */
    public final String mo143614c() {
        String str;
        String str2;
        Class<?> cls = this.f202895e;
        C89219l.m154721d(cls, "");
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return null;
        }
        if (cls.isArray()) {
            Class<?> componentType = cls.getComponentType();
            C89219l.m154716b(componentType, "");
            if (!componentType.isPrimitive() || (str = f202890b.get(componentType.getName())) == null || (str + "Array") == null) {
                return "kotlin.Array";
            }
            return str2;
        }
        String str3 = f202890b.get(cls.getName());
        if (str3 == null) {
            return cls.getCanonicalName();
        }
        return str3;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
        java.lang.IndexOutOfBoundsException: Index 2 out of bounds for length 2
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
        	at java.base/java.util.Objects.checkIndex(Objects.java:359)
        	at java.base/java.util.ArrayList.get(ArrayList.java:427)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
        */
    @Override // p4600h.p4620k.AbstractC89277c
    /* renamed from: b */
    public final java.lang.String mo143613b() {
        /*
        // Method dump skipped, instructions count: 208
        */
        throw new UnsupportedOperationException("Method not decompiled: p4600h.p4611f.p4613b.C89211e.mo143613b():java.lang.String");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v3, resolved type: java.util.HashMap<java.lang.String, java.lang.String> */
    /* JADX WARN: Multi-variable type inference failed */
    /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
        java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 1
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
        	at java.base/java.util.Objects.checkIndex(Objects.java:359)
        	at java.base/java.util.ArrayList.get(ArrayList.java:427)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:78)
        */
    static {
        /*
        // Method dump skipped, instructions count: 656
        */
        throw new UnsupportedOperationException("Method not decompiled: p4600h.p4611f.p4613b.C89211e.<clinit>():void");
    }

    public C89211e(Class<?> cls) {
        C89219l.m154721d(cls, "");
        this.f202895e = cls;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C89211e) || !C89219l.m154714a(C89170a.m154666b(this), C89170a.m154666b((AbstractC89277c) obj))) {
            return false;
        }
        return true;
    }
}
