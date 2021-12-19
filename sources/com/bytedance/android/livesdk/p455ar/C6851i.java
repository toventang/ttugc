package com.bytedance.android.livesdk.p455ar;

import com.C1764a;
import com.bytedance.android.live.network.p380a.AbstractC5798b;
import com.bytedance.android.livesdk.p455ar.AbstractC6841g;
import com.bytedance.covode.number.Covode;
import com.bytedance.p951d.p952a.p953a.p954a.p955a.C14420a;
import com.bytedance.retrofit2.AbstractC22019c;
import com.bytedance.retrofit2.AbstractC22043e;
import com.bytedance.retrofit2.AbstractC22047g;
import com.bytedance.retrofit2.C22092q;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.p1610b.AbstractC21984a;
import com.bytedance.retrofit2.p1610b.AbstractC21987aa;
import com.bytedance.retrofit2.p1610b.AbstractC21988ab;
import com.bytedance.retrofit2.p1610b.AbstractC21990ad;
import com.bytedance.retrofit2.p1610b.AbstractC21991ae;
import com.bytedance.retrofit2.p1610b.AbstractC21992af;
import com.bytedance.retrofit2.p1610b.AbstractC21993ag;
import com.bytedance.retrofit2.p1610b.AbstractC21994b;
import com.bytedance.retrofit2.p1610b.AbstractC21995c;
import com.bytedance.retrofit2.p1610b.AbstractC21996d;
import com.bytedance.retrofit2.p1610b.AbstractC21997e;
import com.bytedance.retrofit2.p1610b.AbstractC21998f;
import com.bytedance.retrofit2.p1610b.AbstractC21999g;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22001i;
import com.bytedance.retrofit2.p1610b.AbstractC22002j;
import com.bytedance.retrofit2.p1610b.AbstractC22003k;
import com.bytedance.retrofit2.p1610b.AbstractC22004l;
import com.bytedance.retrofit2.p1610b.AbstractC22005m;
import com.bytedance.retrofit2.p1610b.AbstractC22006n;
import com.bytedance.retrofit2.p1610b.AbstractC22007o;
import com.bytedance.retrofit2.p1610b.AbstractC22008p;
import com.bytedance.retrofit2.p1610b.AbstractC22009q;
import com.bytedance.retrofit2.p1610b.AbstractC22010r;
import com.bytedance.retrofit2.p1610b.AbstractC22011s;
import com.bytedance.retrofit2.p1610b.AbstractC22012t;
import com.bytedance.retrofit2.p1610b.AbstractC22013u;
import com.bytedance.retrofit2.p1610b.AbstractC22014v;
import com.bytedance.retrofit2.p1610b.AbstractC22015w;
import com.bytedance.retrofit2.p1610b.AbstractC22016x;
import com.bytedance.retrofit2.p1610b.AbstractC22017y;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import com.bytedance.retrofit2.p1610b.p1611a.AbstractC21985a;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.URI;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.AbstractC90025ab;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.AbstractC88979t;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.ar.i */
public final class C6851i<T> {

    /* renamed from: a */
    static final Pattern f17153a = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

    /* renamed from: b */
    public long f17154b;

    /* renamed from: c */
    final String f17155c;

    /* renamed from: d */
    final String f17156d;

    /* renamed from: e */
    final boolean f17157e;

    /* renamed from: f */
    final AbstractC22019c<?> f17158f;

    /* renamed from: g */
    final Type f17159g;

    /* renamed from: h */
    final AbstractC6841g<?>[] f17160h;

    /* renamed from: i */
    final AbstractC22047g f17161i;

    /* renamed from: j */
    public final EnumC6853b f17162j;

    /* renamed from: k */
    private final boolean f17163k;

    static {
        Covode.recordClassIndex(7589);
    }

    /* renamed from: com.bytedance.android.livesdk.ar.i$b */
    public enum EnumC6853b {
        Unknown,
        Observable,
        Single;

        static {
            Covode.recordClassIndex(7591);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.ar.i$a */
    public static final class C6852a<T> {

        /* renamed from: a */
        final C22092q f17164a;

        /* renamed from: b */
        final Method f17165b;

        /* renamed from: c */
        final Annotation[] f17166c;

        /* renamed from: d */
        final Annotation[][] f17167d;

        /* renamed from: e */
        final Type[] f17168e;

        /* renamed from: f */
        AbstractC22019c<?> f17169f;

        /* renamed from: g */
        Type f17170g;

        /* renamed from: h */
        boolean f17171h;

        /* renamed from: i */
        boolean f17172i;

        /* renamed from: j */
        boolean f17173j;

        /* renamed from: k */
        boolean f17174k;

        /* renamed from: l */
        boolean f17175l;

        /* renamed from: m */
        boolean f17176m;

        /* renamed from: n */
        String f17177n;

        /* renamed from: o */
        boolean f17178o;

        /* renamed from: p */
        boolean f17179p;

        /* renamed from: q */
        boolean f17180q;

        /* renamed from: r */
        String f17181r;

        /* renamed from: s */
        Set<String> f17182s;

        /* renamed from: t */
        String f17183t;

        /* renamed from: u */
        AbstractC6841g<?>[] f17184u;

        /* renamed from: v */
        EnumC6853b f17185v;

        /* renamed from: w */
        long f17186w = -1;

        static {
            Covode.recordClassIndex(7590);
        }

        /* renamed from: b */
        private AbstractC22019c<?> m14657b() {
            EnumC6853b bVar;
            Type genericReturnType = this.f17165b.getGenericReturnType();
            if (C6856l.m14674d(genericReturnType)) {
                throw m14655a((Throwable) null, "Method return type must not include a type variable or wildcard: %s", genericReturnType);
            } else if (genericReturnType != Void.TYPE) {
                Class<?> a = C6856l.m14665a(genericReturnType);
                if (a == AbstractC88979t.class) {
                    bVar = EnumC6853b.Observable;
                } else if (a == AbstractC88403ab.class) {
                    bVar = EnumC6853b.Single;
                } else {
                    bVar = EnumC6853b.Unknown;
                }
                this.f17185v = bVar;
                if (bVar != EnumC6853b.Unknown) {
                    try {
                        return this.f17164a.mo35880a((AbstractC22019c.AbstractC22020a) null, genericReturnType, this.f17165b.getAnnotations());
                    } catch (RuntimeException e) {
                        throw m14655a(e, "Unable to create call adapter for %s", genericReturnType);
                    }
                } else {
                    throw m14655a((Throwable) null, "Uplink Service only support Observable and Single", new Object[0]);
                }
            } else {
                throw m14655a((Throwable) null, "Service methods cannot return void.", new Object[0]);
            }
        }

        /* renamed from: a */
        public final C6851i mo13100a() {
            AbstractC22019c<?> b = m14657b();
            this.f17169f = b;
            this.f17170g = b.mo11591a();
            Annotation[] annotationArr = this.f17166c;
            for (Annotation annotation : annotationArr) {
                if (!(annotation instanceof AbstractC21995c)) {
                    if (annotation instanceof AbstractC22000h) {
                        m14656a("GET", ((AbstractC22000h) annotation).mo35789a(), false);
                    } else if (annotation instanceof AbstractC22001i) {
                        throw m14654a("HEAD", new Object[0]);
                    } else if (annotation instanceof AbstractC22011s) {
                        throw m14654a("PATCH", new Object[0]);
                    } else if (annotation instanceof AbstractC22012t) {
                        m14656a("POST", ((AbstractC22012t) annotation).mo35799a(), true);
                    } else if (annotation instanceof AbstractC22013u) {
                        throw m14654a(C14420a.f34883c, new Object[0]);
                    } else if (annotation instanceof AbstractC22010r) {
                        throw m14654a(C14420a.f34885e, new Object[0]);
                    } else if (annotation instanceof AbstractC22002j) {
                        throw m14654a("HTTP", new Object[0]);
                    } else if (annotation instanceof AbstractC22006n) {
                        throw m14654a("Headers", new Object[0]);
                    } else if (annotation instanceof AbstractC22009q) {
                        throw m14654a("Multipart", new Object[0]);
                    } else if (annotation instanceof AbstractC21999g) {
                        if (!this.f17180q) {
                            this.f17179p = true;
                        } else {
                            throw m14655a((Throwable) null, "Only one encoding annotation is allowed.", new Object[0]);
                        }
                    } else if (annotation instanceof AbstractC21991ae) {
                        throw m14654a("Streaming", new Object[0]);
                    } else if (annotation instanceof AbstractC22017y) {
                        throw m14654a("Priority", new Object[0]);
                    } else if (annotation instanceof AbstractC21990ad) {
                        throw m14654a("ServiceType", new Object[0]);
                    } else if (annotation instanceof AbstractC5798b) {
                        this.f17186w = ((AbstractC5798b) annotation).mo11569a();
                    }
                } else {
                    throw m14654a(C14420a.f34884d, new Object[0]);
                }
            }
            if (this.f17177n != null) {
                if (!this.f17178o) {
                    if (this.f17180q) {
                        throw m14655a((Throwable) null, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    } else if (this.f17179p) {
                        throw m14655a((Throwable) null, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    }
                }
                int length = this.f17167d.length;
                this.f17184u = new AbstractC6841g[length];
                for (int i = 0; i < length; i++) {
                    Type type = this.f17168e[i];
                    if (!C6856l.m14674d(type)) {
                        Annotation[] annotationArr2 = this.f17167d[i];
                        if (annotationArr2 != null) {
                            AbstractC6841g<?>[] gVarArr = this.f17184u;
                            AbstractC6841g<?> gVar = null;
                            for (Annotation annotation2 : annotationArr2) {
                                AbstractC6841g<?> a = m14652a(i, type, annotationArr2, annotation2);
                                if (a != null) {
                                    if (gVar == null) {
                                        gVar = a;
                                    } else {
                                        throw m14653a(i, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                                    }
                                }
                            }
                            if (gVar != null) {
                                gVarArr[i] = gVar;
                            } else {
                                throw m14653a(i, "No Retrofit annotation found.", new Object[0]);
                            }
                        } else {
                            throw m14653a(i, "No Retrofit annotation found.", new Object[0]);
                        }
                    } else {
                        throw m14653a(i, "Parameter type must not include a type variable or wildcard: %s", type);
                    }
                }
                if (this.f17181r != null || this.f17176m) {
                    if (!this.f17179p) {
                        if (!this.f17180q && !this.f17178o && this.f17173j) {
                            throw m14655a((Throwable) null, "Non-body HTTP method cannot contain @Body.", new Object[0]);
                        }
                    } else if (!this.f17171h) {
                        throw m14655a((Throwable) null, "Form-encode method must contain at least one @Field.", new Object[0]);
                    }
                    if (!this.f17180q || this.f17172i) {
                        return new C6851i(this);
                    }
                    throw m14655a((Throwable) null, "Multipart method must contain at least one @Part.", new Object[0]);
                }
                throw m14655a((Throwable) null, "Missing either @%s URL or @Url parameter.", this.f17177n);
            }
            throw m14655a((Throwable) null, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
        }

        /* renamed from: a */
        private RuntimeException m14654a(String str, Object... objArr) {
            return m14655a((Throwable) null, "uplink not support annotation: ".concat(String.valueOf(str)), objArr);
        }

        public C6852a(C22092q qVar, Method method) {
            this.f17164a = qVar;
            this.f17165b = method;
            this.f17166c = method.getAnnotations();
            this.f17168e = method.getGenericParameterTypes();
            this.f17167d = method.getParameterAnnotations();
        }

        /* renamed from: a */
        private RuntimeException m14653a(int i, String str, Object... objArr) {
            return m14655a((Throwable) null, str + " (parameter #" + (i + 1) + ")", objArr);
        }

        /* renamed from: a */
        private RuntimeException m14655a(Throwable th, String str, Object... objArr) {
            return new IllegalArgumentException(C1764a.m5928a(str, objArr) + "\n    for method " + this.f17165b.getDeclaringClass().getSimpleName() + "." + this.f17165b.getName(), th);
        }

        /* renamed from: a */
        private void m14656a(String str, String str2, boolean z) {
            String str3 = this.f17177n;
            if (str3 == null) {
                this.f17177n = str;
                this.f17183t = C6851i.m14651b(str);
                this.f17178o = z;
                if (!str2.isEmpty()) {
                    int indexOf = str2.indexOf(63);
                    if (indexOf != -1 && indexOf < str2.length() - 1) {
                        String substring = str2.substring(indexOf + 1);
                        if (C6851i.f17153a.matcher(substring).find()) {
                            throw m14655a((Throwable) null, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", substring);
                        }
                    }
                    this.f17181r = str2;
                    this.f17182s = C6851i.m14650a(str2);
                    return;
                }
                return;
            }
            throw m14655a((Throwable) null, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
        }

        /* renamed from: a */
        private AbstractC6841g<?> m14652a(int i, Type type, Annotation[] annotationArr, Annotation annotation) {
            if (annotation instanceof AbstractC21993ag) {
                if (this.f17176m) {
                    throw m14653a(i, "Multiple @Url method annotations found.", new Object[0]);
                } else if (this.f17174k) {
                    throw m14653a(i, "@Path parameters may not be used with @Url.", new Object[0]);
                } else if (this.f17175l) {
                    throw m14653a(i, "A @Url parameter must not come after a @Query", new Object[0]);
                } else if (this.f17181r == null) {
                    this.f17176m = true;
                    if (type == String.class || type == URI.class || ((type instanceof Class) && "android.net.Uri".equals(((Class) type).getName()))) {
                        return new AbstractC6841g.C6849f();
                    }
                    throw m14653a(i, "@Url must be String, java.net.URI, or android.net.Uri type.", new Object[0]);
                } else {
                    throw m14653a(i, "@Url cannot be used with @%s URL", this.f17177n);
                }
            } else if (annotation instanceof AbstractC22016x) {
                throw m14654a("Path", new Object[0]);
            } else if (annotation instanceof AbstractC22018z) {
                AbstractC22018z zVar = (AbstractC22018z) annotation;
                String a = zVar.mo35807a();
                boolean b = zVar.mo35808b();
                Class<?> a2 = C6856l.m14665a(type);
                this.f17175l = true;
                if (Iterable.class.isAssignableFrom(a2)) {
                    if (type instanceof ParameterizedType) {
                        return new AbstractC6841g.C6847d(a, this.f17164a.mo35885b(C6856l.m14667a(0, (ParameterizedType) type), annotationArr), b).mo13095a();
                    }
                    throw m14653a(i, a2.getSimpleName() + " must include generic type (e.g., " + a2.getSimpleName() + "<String>)", new Object[0]);
                } else if (!a2.isArray()) {
                    return new AbstractC6841g.C6847d(a, this.f17164a.mo35885b(type, annotationArr), b);
                } else {
                    return new AbstractC6841g.C6847d(a, this.f17164a.mo35885b(C6851i.m14649a(a2.getComponentType()), annotationArr), b).mo13097b();
                }
            } else if (annotation instanceof AbstractC21988ab) {
                throw m14654a("QueryName", new Object[0]);
            } else if (annotation instanceof AbstractC21987aa) {
                Class<?> a3 = C6856l.m14665a(type);
                if (Map.class.isAssignableFrom(a3)) {
                    Type a4 = C6856l.m14668a(type, a3, (Class<?>) Map.class);
                    if (a4 instanceof ParameterizedType) {
                        ParameterizedType parameterizedType = (ParameterizedType) a4;
                        Type a5 = C6856l.m14667a(0, parameterizedType);
                        if (String.class == a5) {
                            return new AbstractC6841g.C6848e(this.f17164a.mo35885b(C6856l.m14667a(1, parameterizedType), annotationArr), ((AbstractC21987aa) annotation).mo35781a());
                        }
                        throw m14653a(i, "@QueryMap keys must be of type String: ".concat(String.valueOf(a5)), new Object[0]);
                    }
                    throw m14653a(i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                throw m14653a(i, "@QueryMap parameter type must be Map.", new Object[0]);
            } else if (annotation instanceof AbstractC22003k) {
                throw m14654a("Header", new Object[0]);
            } else if (annotation instanceof AbstractC22004l) {
                throw m14654a("HeaderList", new Object[0]);
            } else if (annotation instanceof AbstractC22005m) {
                throw m14654a("HeaderMap", new Object[0]);
            } else if (annotation instanceof AbstractC21997e) {
                if (this.f17179p) {
                    AbstractC21997e eVar = (AbstractC21997e) annotation;
                    String a6 = eVar.mo35786a();
                    boolean b2 = eVar.mo35787b();
                    this.f17171h = true;
                    Class<?> a7 = C6856l.m14665a(type);
                    if (Iterable.class.isAssignableFrom(a7)) {
                        if (type instanceof ParameterizedType) {
                            return new AbstractC6841g.C6845b(a6, this.f17164a.mo35885b(C6856l.m14667a(0, (ParameterizedType) type), annotationArr), b2).mo13095a();
                        }
                        throw m14653a(i, a7.getSimpleName() + " must include generic type (e.g., " + a7.getSimpleName() + "<String>)", new Object[0]);
                    } else if (!a7.isArray()) {
                        return new AbstractC6841g.C6845b(a6, this.f17164a.mo35885b(type, annotationArr), b2);
                    } else {
                        return new AbstractC6841g.C6845b(a6, this.f17164a.mo35885b(C6851i.m14649a(a7.getComponentType()), annotationArr), b2).mo13097b();
                    }
                } else {
                    throw m14653a(i, "@Field parameters can only be used with form encoding.", new Object[0]);
                }
            } else if (annotation instanceof AbstractC21998f) {
                if (this.f17179p) {
                    Class<?> a8 = C6856l.m14665a(type);
                    if (Map.class.isAssignableFrom(a8)) {
                        Type a9 = C6856l.m14668a(type, a8, (Class<?>) Map.class);
                        if (a9 instanceof ParameterizedType) {
                            ParameterizedType parameterizedType2 = (ParameterizedType) a9;
                            Type a10 = C6856l.m14667a(0, parameterizedType2);
                            if (String.class == a10) {
                                AbstractC22043e<T, String> b3 = this.f17164a.mo35885b(C6856l.m14667a(1, parameterizedType2), annotationArr);
                                this.f17171h = true;
                                return new AbstractC6841g.C6846c(b3, ((AbstractC21998f) annotation).mo35788a());
                            }
                            throw m14653a(i, "@FieldMap keys must be of type String: ".concat(String.valueOf(a10)), new Object[0]);
                        }
                        throw m14653a(i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                    }
                    throw m14653a(i, "@FieldMap parameter type must be Map.", new Object[0]);
                }
                throw m14653a(i, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
            } else if (annotation instanceof AbstractC22014v) {
                throw m14654a("Part", new Object[0]);
            } else if (annotation instanceof AbstractC22015w) {
                throw m14654a("PartMap", new Object[0]);
            } else if (annotation instanceof AbstractC21994b) {
                if (this.f17179p || this.f17180q) {
                    throw m14653a(i, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                } else if (this.f17173j) {
                    throw m14653a(i, "Multiple @Body method annotations found.", new Object[0]);
                } else if (!AbstractC90025ab.class.isAssignableFrom(C6856l.m14665a(type))) {
                    try {
                        AbstractC22043e<T, TypedOutput> a11 = this.f17164a.mo35882a(type, annotationArr, this.f17166c);
                        this.f17173j = true;
                        return new AbstractC6841g.C6844a(a11);
                    } catch (RuntimeException e) {
                        throw m14655a(e, "Unable to create @Body converter for %s" + " (parameter #" + (i + 1) + ")", type);
                    }
                } else {
                    throw m14655a((Throwable) null, "uplink not support RequestBody", new Object[0]);
                }
            } else if (annotation instanceof AbstractC22008p) {
                throw m14654a("Method", new Object[0]);
            } else if (annotation instanceof AbstractC22007o) {
                throw m14654a("MaxLength", new Object[0]);
            } else if (annotation instanceof AbstractC21984a) {
                throw m14654a("AddCommonParam", new Object[0]);
            } else if (annotation instanceof AbstractC21996d) {
                throw m14654a("ExtraInfo", new Object[0]);
            } else if (annotation instanceof AbstractC21985a) {
                throw m14654a("QueryObject", new Object[0]);
            } else if (annotation instanceof AbstractC21992af) {
                throw m14654a("Tag", new Object[0]);
            } else {
                throw m14654a(annotation.toString(), new Object[0]);
            }
        }
    }

    /* renamed from: a */
    static Set<String> m14650a(String str) {
        Matcher matcher = f17153a.matcher(str);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (matcher.find()) {
            linkedHashSet.add(matcher.group(1));
        }
        return linkedHashSet;
    }

    /* renamed from: b */
    static String m14651b(String str) {
        Matcher matcher = f17153a.matcher(str);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return null;
    }

    C6851i(C6852a<T> aVar) {
        this.f17154b = aVar.f17186w;
        this.f17155c = aVar.f17177n;
        this.f17156d = aVar.f17181r;
        this.f17163k = aVar.f17178o;
        this.f17157e = aVar.f17179p;
        this.f17158f = aVar.f17169f;
        this.f17159g = aVar.f17170g;
        this.f17160h = aVar.f17184u;
        this.f17161i = aVar.f17164a.f52135b;
        this.f17162j = aVar.f17185v;
    }

    /* renamed from: a */
    static Class<?> m14649a(Class<?> cls) {
        if (Boolean.TYPE == cls) {
            return Boolean.class;
        }
        if (Byte.TYPE == cls) {
            return Byte.class;
        }
        if (Character.TYPE == cls) {
            return Character.class;
        }
        if (Double.TYPE == cls) {
            return Double.class;
        }
        if (Float.TYPE == cls) {
            return Float.class;
        }
        if (Integer.TYPE == cls) {
            return Integer.class;
        }
        if (Long.TYPE == cls) {
            return Long.class;
        }
        if (Short.TYPE == cls) {
            return Short.class;
        }
        return cls;
    }
}
