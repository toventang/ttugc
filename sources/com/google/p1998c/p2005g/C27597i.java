package com.google.p1998c.p2005g;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.C15346a;
import com.google.p1998c.p1999a.AbstractC27235f;
import com.google.p1998c.p1999a.AbstractC27246l;
import com.google.p1998c.p1999a.C27236g;
import com.google.p1998c.p1999a.C27241i;
import com.google.p1998c.p1999a.C27245k;
import com.google.p1998c.p1999a.C27247m;
import com.google.p1998c.p2001c.AbstractC27349ab;
import com.google.p1998c.p2001c.AbstractC27479br;
import com.google.p1998c.p2001c.AbstractC27540z;
import com.google.p1998c.p2001c.C27394am;
import java.io.Serializable;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.security.AccessControlException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* access modifiers changed from: package-private */
/* renamed from: com.google.c.g.i */
public final class C27597i {

    /* renamed from: a */
    public static final AbstractC27235f<Type, String> f64974a = new AbstractC27235f<Type, String>() {
        /* class com.google.p1998c.p2005g.C27597i.C275981 */

        static {
            Covode.recordClassIndex(33178);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.google.p1998c.p1999a.AbstractC27235f
        /* renamed from: a */
        public final /* synthetic */ String mo45319a(Type type) {
            return EnumC27606c.f64986e.mo46203c(type);
        }
    };

    /* renamed from: b */
    public static final C27236g f64975b = C27236g.m54207a(", ").mo45324b("null");

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.c.g.i$a */
    public enum EnumC27600a {
        OWNED_BY_ENCLOSING_CLASS {
            /* access modifiers changed from: package-private */
            @Override // com.google.p1998c.p2005g.C27597i.EnumC27600a
            /* renamed from: a */
            public final Class<?> mo46194a(Class<?> cls) {
                return cls.getEnclosingClass();
            }
        },
        LOCAL_CLASS_HAS_NO_OWNER {
            /* access modifiers changed from: package-private */
            @Override // com.google.p1998c.p2005g.C27597i.EnumC27600a
            /* renamed from: a */
            public final Class<?> mo46194a(Class<?> cls) {
                if (cls.isLocalClass()) {
                    return null;
                }
                return cls.getEnclosingClass();
            }
        };
        

        /* renamed from: c */
        static final EnumC27600a f64979c;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract Class<?> mo46194a(Class<?> cls);

        /* renamed from: com.google.c.g.i$a$a */
        class C27604a<T> {
            static {
                Covode.recordClassIndex(33184);
            }

            C27604a() {
            }
        }

        static {
            Covode.recordClassIndex(33180);
            ParameterizedType parameterizedType = (ParameterizedType) new C27604a<String>() {
                /* class com.google.p1998c.p2005g.C27597i.EnumC27600a.C276033 */

                static {
                    Covode.recordClassIndex(33183);
                }
            }.getClass().getGenericSuperclass();
            EnumC27600a[] values = values();
            for (EnumC27600a aVar : values) {
                if (aVar.mo46194a(C27604a.class) == parameterizedType.getOwnerType()) {
                    f64979c = aVar;
                    return;
                }
            }
            throw new AssertionError();
        }

        /* synthetic */ EnumC27600a(byte b) {
            this();
        }
    }

    /* renamed from: com.google.c.g.i$b */
    static final class C27605b implements Serializable, GenericArrayType {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        private final Type f64981a;

        static {
            Covode.recordClassIndex(33185);
        }

        public final Type getGenericComponentType() {
            return this.f64981a;
        }

        public final int hashCode() {
            return this.f64981a.hashCode();
        }

        public final String toString() {
            return C27597i.m55196b(this.f64981a) + "[]";
        }

        C27605b(Type type) {
            this.f64981a = EnumC27606c.f64986e.mo46202b(type);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof GenericArrayType) {
                return C27241i.m54222a(getGenericComponentType(), ((GenericArrayType) obj).getGenericComponentType());
            }
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.c.g.i$d */
    public static final class C27613d<X> {

        /* renamed from: a */
        static final boolean f64988a = (!C27613d.class.getTypeParameters()[0].equals(C27597i.m55193a(C27613d.class, "X", new Type[0])));

        C27613d() {
        }

        static {
            Covode.recordClassIndex(33193);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.c.g.i$e */
    public static final class C27614e implements Serializable, ParameterizedType {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        private final Type f64989a;

        /* renamed from: b */
        private final AbstractC27540z<Type> f64990b;

        /* renamed from: c */
        private final Class<?> f64991c;

        static {
            Covode.recordClassIndex(33194);
        }

        public final Type getOwnerType() {
            return this.f64989a;
        }

        public final Type getRawType() {
            return this.f64991c;
        }

        public final Type[] getActualTypeArguments() {
            return C27597i.m55195a(this.f64990b);
        }

        public final int hashCode() {
            int hashCode;
            Type type = this.f64989a;
            if (type == null) {
                hashCode = 0;
            } else {
                hashCode = type.hashCode();
            }
            return (hashCode ^ this.f64990b.hashCode()) ^ this.f64991c.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.f64989a != null && EnumC27606c.f64986e.mo46201a()) {
                sb.append(EnumC27606c.f64986e.mo46203c(this.f64989a)).append('.');
            }
            StringBuilder append = sb.append(this.f64991c.getName()).append('<');
            C27236g gVar = C27597i.f64975b;
            AbstractC27540z<Type> zVar = this.f64990b;
            AbstractC27235f<Type, String> fVar = C27597i.f64974a;
            C27245k.m54229a(zVar);
            C27245k.m54229a(fVar);
            return append.append(gVar.mo45322a((Iterable<?>) 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0055: RETURN  
                  (wrap: java.lang.String : 0x0051: INVOKE  (r0v8 java.lang.String) = 
                  (wrap: java.lang.StringBuilder : 0x004d: INVOKE  (r0v7 java.lang.StringBuilder) = 
                  (wrap: java.lang.StringBuilder : 0x0047: INVOKE  (r1v2 java.lang.StringBuilder) = 
                  (r4v0 'append' java.lang.StringBuilder)
                  (wrap: java.lang.String : 0x0043: INVOKE  (r0v5 java.lang.String) = 
                  (r3v0 'gVar' com.google.c.a.g)
                  (wrap: java.lang.Iterable<?> : ?: CAST (java.lang.Iterable<?>) (wrap: com.google.c.c.am$2 : 0x0040: CONSTRUCTOR  (r0v4 com.google.c.c.am$2) = 
                  (r2v1 'zVar' com.google.c.c.z<java.lang.reflect.Type>)
                  (r1v1 'fVar' com.google.c.a.f<java.lang.reflect.Type, java.lang.String>)
                 call: com.google.c.c.am.2.<init>(java.lang.Iterable, com.google.c.a.f):void type: CONSTRUCTOR))
                 type: VIRTUAL call: com.google.c.a.g.a(java.lang.Iterable):java.lang.String)
                 type: VIRTUAL call: java.lang.StringBuilder.append(java.lang.String):java.lang.StringBuilder)
                  ('>' char)
                 type: VIRTUAL call: java.lang.StringBuilder.append(char):java.lang.StringBuilder)
                 type: VIRTUAL call: java.lang.StringBuilder.toString():java.lang.String)
                 in method: com.google.c.g.i.e.toString():java.lang.String, file: classes9.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0051: INVOKE  (r0v8 java.lang.String) = 
                  (wrap: java.lang.StringBuilder : 0x004d: INVOKE  (r0v7 java.lang.StringBuilder) = 
                  (wrap: java.lang.StringBuilder : 0x0047: INVOKE  (r1v2 java.lang.StringBuilder) = 
                  (r4v0 'append' java.lang.StringBuilder)
                  (wrap: java.lang.String : 0x0043: INVOKE  (r0v5 java.lang.String) = 
                  (r3v0 'gVar' com.google.c.a.g)
                  (wrap: java.lang.Iterable<?> : ?: CAST (java.lang.Iterable<?>) (wrap: com.google.c.c.am$2 : 0x0040: CONSTRUCTOR  (r0v4 com.google.c.c.am$2) = 
                  (r2v1 'zVar' com.google.c.c.z<java.lang.reflect.Type>)
                  (r1v1 'fVar' com.google.c.a.f<java.lang.reflect.Type, java.lang.String>)
                 call: com.google.c.c.am.2.<init>(java.lang.Iterable, com.google.c.a.f):void type: CONSTRUCTOR))
                 type: VIRTUAL call: com.google.c.a.g.a(java.lang.Iterable):java.lang.String)
                 type: VIRTUAL call: java.lang.StringBuilder.append(java.lang.String):java.lang.StringBuilder)
                  ('>' char)
                 type: VIRTUAL call: java.lang.StringBuilder.append(char):java.lang.StringBuilder)
                 type: VIRTUAL call: java.lang.StringBuilder.toString():java.lang.String in method: com.google.c.g.i.e.toString():java.lang.String, file: classes9.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:313)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                	... 14 more
                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x004d: INVOKE  (r0v7 java.lang.StringBuilder) = 
                  (wrap: java.lang.StringBuilder : 0x0047: INVOKE  (r1v2 java.lang.StringBuilder) = 
                  (r4v0 'append' java.lang.StringBuilder)
                  (wrap: java.lang.String : 0x0043: INVOKE  (r0v5 java.lang.String) = 
                  (r3v0 'gVar' com.google.c.a.g)
                  (wrap: java.lang.Iterable<?> : ?: CAST (java.lang.Iterable<?>) (wrap: com.google.c.c.am$2 : 0x0040: CONSTRUCTOR  (r0v4 com.google.c.c.am$2) = 
                  (r2v1 'zVar' com.google.c.c.z<java.lang.reflect.Type>)
                  (r1v1 'fVar' com.google.c.a.f<java.lang.reflect.Type, java.lang.String>)
                 call: com.google.c.c.am.2.<init>(java.lang.Iterable, com.google.c.a.f):void type: CONSTRUCTOR))
                 type: VIRTUAL call: com.google.c.a.g.a(java.lang.Iterable):java.lang.String)
                 type: VIRTUAL call: java.lang.StringBuilder.append(java.lang.String):java.lang.StringBuilder)
                  ('>' char)
                 type: VIRTUAL call: java.lang.StringBuilder.append(char):java.lang.StringBuilder in method: com.google.c.g.i.e.toString():java.lang.String, file: classes9.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                	at jadx.core.codegen.InsnGen.addArgDot(InsnGen.java:87)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:715)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                	... 18 more
                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0047: INVOKE  (r1v2 java.lang.StringBuilder) = 
                  (r4v0 'append' java.lang.StringBuilder)
                  (wrap: java.lang.String : 0x0043: INVOKE  (r0v5 java.lang.String) = 
                  (r3v0 'gVar' com.google.c.a.g)
                  (wrap: java.lang.Iterable<?> : ?: CAST (java.lang.Iterable<?>) (wrap: com.google.c.c.am$2 : 0x0040: CONSTRUCTOR  (r0v4 com.google.c.c.am$2) = 
                  (r2v1 'zVar' com.google.c.c.z<java.lang.reflect.Type>)
                  (r1v1 'fVar' com.google.c.a.f<java.lang.reflect.Type, java.lang.String>)
                 call: com.google.c.c.am.2.<init>(java.lang.Iterable, com.google.c.a.f):void type: CONSTRUCTOR))
                 type: VIRTUAL call: com.google.c.a.g.a(java.lang.Iterable):java.lang.String)
                 type: VIRTUAL call: java.lang.StringBuilder.append(java.lang.String):java.lang.StringBuilder in method: com.google.c.g.i.e.toString():java.lang.String, file: classes9.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                	at jadx.core.codegen.InsnGen.addArgDot(InsnGen.java:87)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:715)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                	... 24 more
                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0043: INVOKE  (r0v5 java.lang.String) = 
                  (r3v0 'gVar' com.google.c.a.g)
                  (wrap: java.lang.Iterable<?> : ?: CAST (java.lang.Iterable<?>) (wrap: com.google.c.c.am$2 : 0x0040: CONSTRUCTOR  (r0v4 com.google.c.c.am$2) = 
                  (r2v1 'zVar' com.google.c.c.z<java.lang.reflect.Type>)
                  (r1v1 'fVar' com.google.c.a.f<java.lang.reflect.Type, java.lang.String>)
                 call: com.google.c.c.am.2.<init>(java.lang.Iterable, com.google.c.a.f):void type: CONSTRUCTOR))
                 type: VIRTUAL call: com.google.c.a.g.a(java.lang.Iterable):java.lang.String in method: com.google.c.g.i.e.toString():java.lang.String, file: classes9.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                	... 30 more
                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: ?: CAST (java.lang.Iterable<?>) (wrap: com.google.c.c.am$2 : 0x0040: CONSTRUCTOR  (r0v4 com.google.c.c.am$2) = 
                  (r2v1 'zVar' com.google.c.c.z<java.lang.reflect.Type>)
                  (r1v1 'fVar' com.google.c.a.f<java.lang.reflect.Type, java.lang.String>)
                 call: com.google.c.c.am.2.<init>(java.lang.Iterable, com.google.c.a.f):void type: CONSTRUCTOR) in method: com.google.c.g.i.e.toString():java.lang.String, file: classes9.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                	... 36 more
                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0040: CONSTRUCTOR  (r0v4 com.google.c.c.am$2) = 
                  (r2v1 'zVar' com.google.c.c.z<java.lang.reflect.Type>)
                  (r1v1 'fVar' com.google.c.a.f<java.lang.reflect.Type, java.lang.String>)
                 call: com.google.c.c.am.2.<init>(java.lang.Iterable, com.google.c.a.f):void type: CONSTRUCTOR in method: com.google.c.g.i.e.toString():java.lang.String, file: classes9.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:290)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                	... 42 more
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.google.c.c.am, state: GENERATED_AND_UNLOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                	... 46 more
                */
            /*
                this = this;
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.reflect.Type r0 = r5.f64989a
                if (r0 == 0) goto L_0x0022
                com.google.c.g.i$c r0 = com.google.p1998c.p2005g.C27597i.EnumC27606c.f64986e
                boolean r0 = r0.mo46201a()
                if (r0 == 0) goto L_0x0022
                com.google.c.g.i$c r1 = com.google.p1998c.p2005g.C27597i.EnumC27606c.f64986e
                java.lang.reflect.Type r0 = r5.f64989a
                java.lang.String r0 = r1.mo46203c(r0)
                java.lang.StringBuilder r1 = r2.append(r0)
                r0 = 46
                r1.append(r0)
            L_0x0022:
                java.lang.Class<?> r0 = r5.f64991c
                java.lang.String r0 = r0.getName()
                java.lang.StringBuilder r1 = r2.append(r0)
                r0 = 60
                java.lang.StringBuilder r4 = r1.append(r0)
                com.google.c.a.g r3 = com.google.p1998c.p2005g.C27597i.f64975b
                com.google.c.c.z<java.lang.reflect.Type> r2 = r5.f64990b
                com.google.c.a.f<java.lang.reflect.Type, java.lang.String> r1 = com.google.p1998c.p2005g.C27597i.f64974a
                com.google.p1998c.p1999a.C27245k.m54229a(r2)
                com.google.p1998c.p1999a.C27245k.m54229a(r1)
                com.google.c.c.am$2 r0 = new com.google.c.c.am$2
                r0.<init>(r2, r1)
                java.lang.String r0 = r3.mo45322a(r0)
                java.lang.StringBuilder r1 = r4.append(r0)
                r0 = 62
                java.lang.StringBuilder r0 = r1.append(r0)
                java.lang.String r0 = r0.toString()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.p1998c.p2005g.C27597i.C27614e.toString():java.lang.String");
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) obj;
            if (!getRawType().equals(parameterizedType.getRawType()) || !C27241i.m54222a(getOwnerType(), parameterizedType.getOwnerType()) || !Arrays.equals(getActualTypeArguments(), parameterizedType.getActualTypeArguments())) {
                return false;
            }
            return true;
        }

        C27614e(Type type, Class<?> cls, Type[] typeArr) {
            boolean z;
            C27245k.m54229a(cls);
            if (typeArr.length == cls.getTypeParameters().length) {
                z = true;
            } else {
                z = false;
            }
            C27245k.m54235a(z);
            C27597i.m55194a(typeArr, "type parameter");
            this.f64989a = type;
            this.f64991c = cls;
            this.f64990b = EnumC27606c.f64986e.mo46199a(typeArr);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.c.g.i$f */
    public static final class C27615f<D extends GenericDeclaration> {

        /* renamed from: a */
        public final D f64992a;

        /* renamed from: b */
        public final String f64993b;

        /* renamed from: c */
        private final AbstractC27540z<Type> f64994c;

        static {
            Covode.recordClassIndex(33195);
        }

        public final String toString() {
            return this.f64993b;
        }

        public final int hashCode() {
            return this.f64992a.hashCode() ^ this.f64993b.hashCode();
        }

        public final boolean equals(Object obj) {
            if (C27613d.f64988a) {
                if (obj != null && Proxy.isProxyClass(obj.getClass()) && (Proxy.getInvocationHandler(obj) instanceof C27616g)) {
                    C27615f<?> fVar = ((C27616g) Proxy.getInvocationHandler(obj)).f64996a;
                    if (!this.f64993b.equals(fVar.f64993b) || !this.f64992a.equals(fVar.f64992a) || !this.f64994c.equals(fVar.f64994c)) {
                        return false;
                    }
                    return true;
                }
                return false;
            }
            if (obj instanceof TypeVariable) {
                TypeVariable typeVariable = (TypeVariable) obj;
                if (!this.f64993b.equals(typeVariable.getName()) || !this.f64992a.equals(typeVariable.getGenericDeclaration())) {
                    return false;
                }
                return true;
            }
            return false;
        }

        C27615f(D d, String str, Type[] typeArr) {
            C27597i.m55194a(typeArr, "bound for type variable");
            this.f64992a = (D) ((GenericDeclaration) C27245k.m54229a(d));
            this.f64993b = (String) C27245k.m54229a(str);
            this.f64994c = AbstractC27540z.copyOf(typeArr);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.c.g.i$h */
    public static final class C27617h implements Serializable, WildcardType {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        private final AbstractC27540z<Type> f64997a;

        /* renamed from: b */
        private final AbstractC27540z<Type> f64998b;

        static {
            Covode.recordClassIndex(33197);
        }

        public final Type[] getLowerBounds() {
            return C27597i.m55195a(this.f64997a);
        }

        public final Type[] getUpperBounds() {
            return C27597i.m55195a(this.f64998b);
        }

        public final int hashCode() {
            return this.f64997a.hashCode() ^ this.f64998b.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("?");
            AbstractC27479br<Type> it = this.f64997a.iterator();
            while (it.hasNext()) {
                sb.append(" super ").append(EnumC27606c.f64986e.mo46203c(it.next()));
            }
            for (Type type : C27394am.m54792a((Iterable) this.f64998b, (AbstractC27246l) new C27247m.C27250c(new C27247m.C27249b(Object.class, (byte) 0)))) {
                sb.append(" extends ").append(EnumC27606c.f64986e.mo46203c(type));
            }
            return sb.toString();
        }

        public final boolean equals(Object obj) {
            if (obj instanceof WildcardType) {
                WildcardType wildcardType = (WildcardType) obj;
                if (!this.f64997a.equals(Arrays.asList(wildcardType.getLowerBounds())) || !this.f64998b.equals(Arrays.asList(wildcardType.getUpperBounds()))) {
                    return false;
                }
                return true;
            }
            return false;
        }

        C27617h(Type[] typeArr, Type[] typeArr2) {
            C27597i.m55194a(typeArr, "lower bound for wildcard");
            C27597i.m55194a(typeArr2, "upper bound for wildcard");
            this.f64997a = EnumC27606c.f64986e.mo46199a(typeArr);
            this.f64998b = EnumC27606c.f64986e.mo46199a(typeArr2);
        }
    }

    static {
        Covode.recordClassIndex(33177);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.c.g.i$g */
    public static final class C27616g implements InvocationHandler {

        /* renamed from: b */
        private static final AbstractC27349ab<String, Method> f64995b;

        /* renamed from: a */
        public final C27615f<?> f64996a;

        static {
            Covode.recordClassIndex(33196);
            AbstractC27349ab.C27351a builder = AbstractC27349ab.builder();
            Method[] methods = C27615f.class.getMethods();
            for (Method method : methods) {
                if (method.getDeclaringClass().equals(C27615f.class)) {
                    try {
                        method.setAccessible(true);
                    } catch (AccessControlException unused) {
                    }
                    builder.mo45567a(method.getName(), method);
                }
            }
            f64995b = builder.mo45568a();
        }

        C27616g(C27615f<?> fVar) {
            this.f64996a = fVar;
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) {
            String name = method.getName();
            Method method2 = f64995b.get(name);
            if (method2 != null) {
                try {
                    C27615f<?> fVar = this.f64996a;
                    Pair<Boolean, Object> a = C15346a.m28238a(method2, new Object[]{fVar, objArr}, 110000, "java.lang.Object", true, "com_google_common_reflect_Types$TypeVariableInvocationHandler_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                    if (((Boolean) a.first).booleanValue()) {
                        return a.second;
                    }
                    Object invoke = method2.invoke(fVar, objArr);
                    C15346a.m28242a(invoke, method2, new Object[]{fVar, objArr}, "com_google_common_reflect_Types$TypeVariableInvocationHandler_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                    return invoke;
                } catch (InvocationTargetException e) {
                    throw e.getCause();
                }
            } else {
                throw new UnsupportedOperationException(name);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.c.g.i$c */
    public enum EnumC27606c {
        JAVA6 {
            /* access modifiers changed from: package-private */
            @Override // com.google.p1998c.p2005g.C27597i.EnumC27606c
            /* renamed from: a */
            public final /* synthetic */ Type mo46200a(Type type) {
                return new C27605b(type);
            }

            /* access modifiers changed from: package-private */
            @Override // com.google.p1998c.p2005g.C27597i.EnumC27606c
            /* renamed from: b */
            public final Type mo46202b(Type type) {
                C27245k.m54229a(type);
                if (!(type instanceof Class)) {
                    return type;
                }
                Class cls = (Class) type;
                if (cls.isArray()) {
                    return new C27605b(cls.getComponentType());
                }
                return type;
            }
        },
        JAVA7 {
            /* access modifiers changed from: package-private */
            @Override // com.google.p1998c.p2005g.C27597i.EnumC27606c
            /* renamed from: b */
            public final Type mo46202b(Type type) {
                return (Type) C27245k.m54229a(type);
            }

            /* access modifiers changed from: package-private */
            @Override // com.google.p1998c.p2005g.C27597i.EnumC27606c
            /* renamed from: a */
            public final Type mo46200a(Type type) {
                if (type instanceof Class) {
                    return C27597i.m55188a((Class<?>) ((Class) type));
                }
                return new C27605b(type);
            }
        },
        JAVA8 {
            /* access modifiers changed from: package-private */
            @Override // com.google.p1998c.p2005g.C27597i.EnumC27606c
            /* renamed from: a */
            public final Type mo46200a(Type type) {
                return JAVA7.mo46200a(type);
            }

            /* access modifiers changed from: package-private */
            @Override // com.google.p1998c.p2005g.C27597i.EnumC27606c
            /* renamed from: b */
            public final Type mo46202b(Type type) {
                return JAVA7.mo46202b(type);
            }

            /* access modifiers changed from: package-private */
            @Override // com.google.p1998c.p2005g.C27597i.EnumC27606c
            /* renamed from: c */
            public final String mo46203c(Type type) {
                try {
                    return (String) Type.class.getMethod("getTypeName", new Class[0]).invoke(type, new Object[0]);
                } catch (NoSuchMethodException unused) {
                    throw new AssertionError("Type.getTypeName should be available in Java 8");
                } catch (IllegalAccessException | InvocationTargetException e) {
                    throw new RuntimeException(e);
                }
            }
        },
        JAVA9 {
            /* access modifiers changed from: package-private */
            @Override // com.google.p1998c.p2005g.C27597i.EnumC27606c
            /* renamed from: a */
            public final boolean mo46201a() {
                return false;
            }

            /* access modifiers changed from: package-private */
            @Override // com.google.p1998c.p2005g.C27597i.EnumC27606c
            /* renamed from: a */
            public final Type mo46200a(Type type) {
                return JAVA8.mo46200a(type);
            }

            /* access modifiers changed from: package-private */
            @Override // com.google.p1998c.p2005g.C27597i.EnumC27606c
            /* renamed from: b */
            public final Type mo46202b(Type type) {
                return JAVA8.mo46202b(type);
            }

            /* access modifiers changed from: package-private */
            @Override // com.google.p1998c.p2005g.C27597i.EnumC27606c
            /* renamed from: c */
            public final String mo46203c(Type type) {
                return JAVA8.mo46203c(type);
            }
        };
        

        /* renamed from: e */
        static final EnumC27606c f64986e;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract Type mo46200a(Type type);

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo46201a() {
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract Type mo46202b(Type type);

        static {
            C276071 r5;
            C276082 r4;
            C276093 r3;
            C276104 r2;
            Covode.recordClassIndex(33186);
            if (AnnotatedElement.class.isAssignableFrom(TypeVariable.class)) {
                if (new AbstractC27567d<Map.Entry<String, int[][]>>() {
                    /* class com.google.p1998c.p2005g.C27597i.EnumC27606c.C276115 */

                    static {
                        Covode.recordClassIndex(33191);
                    }
                }.mo46136a().toString().contains("java.util.Map.java.util.Map")) {
                    f64986e = r3;
                } else {
                    f64986e = r2;
                }
            } else if (new AbstractC27567d<int[]>() {
                /* class com.google.p1998c.p2005g.C27597i.EnumC27606c.C276126 */

                static {
                    Covode.recordClassIndex(33192);
                }
            }.mo46136a() instanceof Class) {
                f64986e = r4;
            } else {
                f64986e = r5;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public String mo46203c(Type type) {
            return C27597i.m55196b(type);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final AbstractC27540z<Type> mo46199a(Type[] typeArr) {
            AbstractC27540z.C27541a builder = AbstractC27540z.builder();
            for (Type type : typeArr) {
                builder.mo46104c(mo46202b(type));
            }
            return builder.mo46102a();
        }

        /* synthetic */ EnumC27606c(byte b) {
            this();
        }
    }

    /* renamed from: a */
    static Class<?> m55188a(Class<?> cls) {
        return Array.newInstance(cls, 0).getClass();
    }

    /* renamed from: b */
    static String m55196b(Type type) {
        if (type instanceof Class) {
            return ((Class) type).getName();
        }
        return type.toString();
    }

    /* renamed from: d */
    private static WildcardType m55199d(Type type) {
        return new C27617h(new Type[0], new Type[]{type});
    }

    /* renamed from: c */
    static Type m55198c(Type type) {
        C27245k.m54229a(type);
        final AtomicReference atomicReference = new AtomicReference();
        new AbstractC27596h() {
            /* class com.google.p1998c.p2005g.C27597i.C275992 */

            static {
                Covode.recordClassIndex(33179);
            }

            /* access modifiers changed from: package-private */
            @Override // com.google.p1998c.p2005g.AbstractC27596h
            /* renamed from: a */
            public final void mo46143a(Class<?> cls) {
                atomicReference.set(cls.getComponentType());
            }

            /* access modifiers changed from: package-private */
            @Override // com.google.p1998c.p2005g.AbstractC27596h
            /* renamed from: a */
            public final void mo46144a(GenericArrayType genericArrayType) {
                atomicReference.set(genericArrayType.getGenericComponentType());
            }

            /* access modifiers changed from: package-private */
            @Override // com.google.p1998c.p2005g.AbstractC27596h
            /* renamed from: a */
            public final void mo46146a(TypeVariable<?> typeVariable) {
                atomicReference.set(C27597i.m55192a(typeVariable.getBounds()));
            }

            /* access modifiers changed from: package-private */
            @Override // com.google.p1998c.p2005g.AbstractC27596h
            /* renamed from: a */
            public final void mo46147a(WildcardType wildcardType) {
                atomicReference.set(C27597i.m55192a(wildcardType.getUpperBounds()));
            }
        }.mo46193a(type);
        return (Type) atomicReference.get();
    }

    /* renamed from: e */
    private static WildcardType m55200e(Type type) {
        return new C27617h(new Type[]{type}, new Type[]{Object.class});
    }

    /* renamed from: a */
    static Type m55191a(Type type) {
        boolean z;
        if (!(type instanceof WildcardType)) {
            return EnumC27606c.f64986e.mo46200a(type);
        }
        WildcardType wildcardType = (WildcardType) type;
        Type[] lowerBounds = wildcardType.getLowerBounds();
        boolean z2 = true;
        if (lowerBounds.length <= 1) {
            z = true;
        } else {
            z = false;
        }
        C27245k.m54236a(z, "Wildcard cannot have more than one lower bounds.");
        if (lowerBounds.length == 1) {
            return m55200e(m55191a(lowerBounds[0]));
        }
        Type[] upperBounds = wildcardType.getUpperBounds();
        if (upperBounds.length != 1) {
            z2 = false;
        }
        C27245k.m54236a(z2, "Wildcard should have only one upper bound.");
        return m55199d(m55191a(upperBounds[0]));
    }

    /* renamed from: a */
    public static Type m55192a(Type[] typeArr) {
        for (Type type : typeArr) {
            Type c = m55198c(type);
            if (c != null) {
                if (c instanceof Class) {
                    Class cls = (Class) c;
                    if (cls.isPrimitive()) {
                        return cls;
                    }
                }
                return m55199d(c);
            }
        }
        return null;
    }

    /* renamed from: a */
    public static Type[] m55195a(Collection<Type> collection) {
        return (Type[]) collection.toArray(new Type[collection.size()]);
    }

    /* renamed from: a */
    private static ParameterizedType m55189a(Class<?> cls, Type... typeArr) {
        return new C27614e(EnumC27600a.f64979c.mo46194a(cls), cls, typeArr);
    }

    /* renamed from: a */
    public static void m55194a(Type[] typeArr, String str) {
        for (Type type : typeArr) {
            if (type instanceof Class) {
                Class cls = (Class) type;
                C27245k.m54241a(!cls.isPrimitive(), "Primitive type '%s' used as %s", cls, str);
            }
        }
    }

    /* renamed from: b */
    private static <D extends GenericDeclaration> TypeVariable<D> m55197b(D d, String str, Type[] typeArr) {
        return (TypeVariable) C27566c.m55105a(TypeVariable.class, new C27616g(new C27615f(d, str, typeArr)));
    }

    /* renamed from: a */
    static ParameterizedType m55190a(Type type, Class<?> cls, Type... typeArr) {
        boolean z;
        if (type == null) {
            return m55189a(cls, typeArr);
        }
        C27245k.m54229a(typeArr);
        if (cls.getEnclosingClass() != null) {
            z = true;
        } else {
            z = false;
        }
        C27245k.m54240a(z, "Owner type for unenclosed %s", cls);
        return new C27614e(type, cls, typeArr);
    }

    /* renamed from: a */
    static <D extends GenericDeclaration> TypeVariable<D> m55193a(D d, String str, Type... typeArr) {
        if (typeArr.length == 0) {
            typeArr = new Type[]{Object.class};
        }
        return m55197b(d, str, typeArr);
    }
}
