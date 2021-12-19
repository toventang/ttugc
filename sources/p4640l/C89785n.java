package p4640l;

import com.C1764a;
import com.bytedance.covode.number.Covode;
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
import okhttp3.AbstractC90031ad;
import okhttp3.AbstractC90049e;
import okhttp3.C90198s;
import okhttp3.C90200t;
import okhttp3.C90204w;
import okhttp3.C90205x;
import okhttp3.Request;
import p4640l.AbstractC89759i;
import p4640l.p4644b.AbstractC89717a;
import p4640l.p4644b.AbstractC89719c;
import p4640l.p4644b.AbstractC89720d;
import p4640l.p4644b.AbstractC89725i;
import p4640l.p4644b.AbstractC89726j;
import p4640l.p4644b.AbstractC89733q;
import p4640l.p4644b.AbstractC89734r;
import p4640l.p4644b.AbstractC89735s;
import p4640l.p4644b.AbstractC89736t;
import p4640l.p4644b.AbstractC89737u;
import p4640l.p4644b.AbstractC89738v;
import p4640l.p4644b.AbstractC89740x;

/* access modifiers changed from: package-private */
/* renamed from: l.n */
public final class C89785n<R, T> {

    /* renamed from: a */
    static final Pattern f203580a = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

    /* renamed from: b */
    static final Pattern f203581b = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");

    /* renamed from: c */
    final AbstractC90049e.AbstractC90050a f203582c;

    /* renamed from: d */
    final AbstractC89741c<R, T> f203583d;

    /* renamed from: e */
    final AbstractC89744e<AbstractC90031ad, R> f203584e;

    /* renamed from: f */
    private final C90200t f203585f;

    /* renamed from: g */
    private final String f203586g;

    /* renamed from: h */
    private final String f203587h;

    /* renamed from: i */
    private final C90198s f203588i;

    /* renamed from: j */
    private final C90204w f203589j;

    /* renamed from: k */
    private final boolean f203590k;

    /* renamed from: l */
    private final boolean f203591l;

    /* renamed from: m */
    private final boolean f203592m;

    /* renamed from: n */
    private final AbstractC89759i<?>[] f203593n;

    /* access modifiers changed from: package-private */
    /* renamed from: l.n$a */
    public static final class C89786a<T, R> {

        /* renamed from: a */
        final C89782m f203594a;

        /* renamed from: b */
        final Method f203595b;

        /* renamed from: c */
        final Annotation[] f203596c;

        /* renamed from: d */
        final Annotation[][] f203597d;

        /* renamed from: e */
        final Type[] f203598e;

        /* renamed from: f */
        Type f203599f;

        /* renamed from: g */
        boolean f203600g;

        /* renamed from: h */
        boolean f203601h;

        /* renamed from: i */
        boolean f203602i;

        /* renamed from: j */
        boolean f203603j;

        /* renamed from: k */
        boolean f203604k;

        /* renamed from: l */
        boolean f203605l;

        /* renamed from: m */
        String f203606m;

        /* renamed from: n */
        boolean f203607n;

        /* renamed from: o */
        boolean f203608o;

        /* renamed from: p */
        boolean f203609p;

        /* renamed from: q */
        String f203610q;

        /* renamed from: r */
        C90198s f203611r;

        /* renamed from: s */
        C90204w f203612s;

        /* renamed from: t */
        Set<String> f203613t;

        /* renamed from: u */
        AbstractC89759i<?>[] f203614u;

        /* renamed from: v */
        AbstractC89744e<AbstractC90031ad, T> f203615v;

        /* renamed from: w */
        AbstractC89741c<T, R> f203616w;

        static {
            Covode.recordClassIndex(105880);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo144333a(String str, String str2, boolean z) {
            String str3 = this.f203606m;
            if (str3 == null) {
                this.f203606m = str;
                this.f203607n = z;
                if (!str2.isEmpty()) {
                    int indexOf = str2.indexOf(63);
                    if (indexOf != -1 && indexOf < str2.length() - 1) {
                        String substring = str2.substring(indexOf + 1);
                        if (C89785n.f203580a.matcher(substring).find()) {
                            throw mo144329a((Throwable) null, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", substring);
                        }
                    }
                    this.f203610q = str2;
                    this.f203613t = C89785n.m155862a(str2);
                    return;
                }
                return;
            }
            throw mo144329a((Throwable) null, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final AbstractC89741c<T, R> mo144330a() {
            Type genericReturnType = this.f203595b.getGenericReturnType();
            if (C89787o.m155883d(genericReturnType)) {
                throw mo144329a((Throwable) null, "Method return type must not include a type variable or wildcard: %s", genericReturnType);
            } else if (genericReturnType != Void.TYPE) {
                Annotation[] annotations = this.f203595b.getAnnotations();
                try {
                    C89782m mVar = this.f203594a;
                    C89787o.m155873a(genericReturnType, "returnType == null");
                    C89787o.m155873a(annotations, "annotations == null");
                    int indexOf = mVar.f203566d.indexOf(null) + 1;
                    int size = mVar.f203566d.size();
                    for (int i = indexOf; i < size; i++) {
                        AbstractC89741c<T, R> cVar = (AbstractC89741c<T, R>) mVar.f203566d.get(i).mo144298a(genericReturnType);
                        if (cVar != null) {
                            return cVar;
                        }
                    }
                    StringBuilder append = new StringBuilder("Could not locate call adapter for ").append(genericReturnType).append(".\n");
                    append.append("  Tried:");
                    int size2 = mVar.f203566d.size();
                    while (indexOf < size2) {
                        append.append("\n   * ").append(mVar.f203566d.get(indexOf).getClass().getName());
                        indexOf++;
                    }
                    throw new IllegalArgumentException(append.toString());
                } catch (RuntimeException e) {
                    throw mo144329a(e, "Unable to create call adapter for %s", genericReturnType);
                }
            } else {
                throw mo144329a((Throwable) null, "Service methods cannot return void.", new Object[0]);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final AbstractC89744e<AbstractC90031ad, T> mo144334b() {
            Annotation[] annotations = this.f203595b.getAnnotations();
            try {
                C89782m mVar = this.f203594a;
                Type type = this.f203599f;
                C89787o.m155873a(type, "type == null");
                C89787o.m155873a(annotations, "annotations == null");
                int indexOf = mVar.f203565c.indexOf(null) + 1;
                int size = mVar.f203565c.size();
                for (int i = indexOf; i < size; i++) {
                    AbstractC89744e<AbstractC90031ad, T> eVar = (AbstractC89744e<AbstractC90031ad, T>) mVar.f203565c.get(i).mo144265a(type, annotations);
                    if (eVar != null) {
                        return eVar;
                    }
                }
                StringBuilder append = new StringBuilder("Could not locate ResponseBody converter for ").append(type).append(".\n");
                append.append("  Tried:");
                int size2 = mVar.f203565c.size();
                while (indexOf < size2) {
                    append.append("\n   * ").append(mVar.f203565c.get(indexOf).getClass().getName());
                    indexOf++;
                }
                throw new IllegalArgumentException(append.toString());
            } catch (RuntimeException e) {
                throw mo144329a(e, "Unable to create converter for %s", this.f203599f);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final C90198s mo144332a(String[] strArr) {
            C90198s.C90199a aVar = new C90198s.C90199a();
            for (String str : strArr) {
                int indexOf = str.indexOf(58);
                if (indexOf == -1 || indexOf == 0 || indexOf == str.length() - 1) {
                    throw mo144329a((Throwable) null, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str);
                }
                String substring = str.substring(0, indexOf);
                String trim = str.substring(indexOf + 1).trim();
                if ("Content-Type".equalsIgnoreCase(substring)) {
                    C90204w b = C90204w.m156843b(trim);
                    if (b != null) {
                        this.f203612s = b;
                    } else {
                        throw mo144329a((Throwable) null, "Malformed content type: %s", trim);
                    }
                } else {
                    aVar.mo145039a(substring, trim);
                }
            }
            return aVar.mo145040a();
        }

        C89786a(C89782m mVar, Method method) {
            this.f203594a = mVar;
            this.f203595b = method;
            this.f203596c = method.getAnnotations();
            this.f203598e = method.getGenericParameterTypes();
            this.f203597d = method.getParameterAnnotations();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final RuntimeException mo144328a(int i, String str, Object... objArr) {
            return mo144329a((Throwable) null, str + " (parameter #" + (i + 1) + ")", objArr);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final RuntimeException mo144329a(Throwable th, String str, Object... objArr) {
            return new IllegalArgumentException(C1764a.m5928a(str, objArr) + "\n    for method " + this.f203595b.getDeclaringClass().getSimpleName() + "." + this.f203595b.getName(), th);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final AbstractC89759i<?> mo144331a(int i, Type type, Annotation[] annotationArr) {
            AbstractC89759i<?> iVar = null;
            for (Annotation annotation : annotationArr) {
                AbstractC89759i<?> a = m155864a(i, type, annotationArr, annotation);
                if (a != null) {
                    if (iVar == null) {
                        iVar = a;
                    } else {
                        throw mo144328a(i, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                    }
                }
            }
            if (iVar != null) {
                return iVar;
            }
            throw mo144328a(i, "No Retrofit annotation found.", new Object[0]);
        }

        /* renamed from: a */
        private AbstractC89759i<?> m155864a(int i, Type type, Annotation[] annotationArr, Annotation annotation) {
            if (annotation instanceof AbstractC89740x) {
                if (this.f203605l) {
                    throw mo144328a(i, "Multiple @Url method annotations found.", new Object[0]);
                } else if (this.f203603j) {
                    throw mo144328a(i, "@Path parameters may not be used with @Url.", new Object[0]);
                } else if (this.f203604k) {
                    throw mo144328a(i, "A @Url parameter must not come after a @Query", new Object[0]);
                } else if (this.f203610q == null) {
                    this.f203605l = true;
                    if (type == C90200t.class || type == String.class || type == URI.class || ((type instanceof Class) && "android.net.Uri".equals(((Class) type).getName()))) {
                        return new AbstractC89759i.C89774m();
                    }
                    throw mo144328a(i, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
                } else {
                    throw mo144328a(i, "@Url cannot be used with @%s URL", this.f203606m);
                }
            } else if (annotation instanceof AbstractC89735s) {
                if (this.f203604k) {
                    throw mo144328a(i, "A @Path parameter must not come after a @Query.", new Object[0]);
                } else if (this.f203605l) {
                    throw mo144328a(i, "@Path parameters may not be used with @Url.", new Object[0]);
                } else if (this.f203610q != null) {
                    this.f203603j = true;
                    AbstractC89735s sVar = (AbstractC89735s) annotation;
                    String a = sVar.mo144290a();
                    if (!C89785n.f203581b.matcher(a).matches()) {
                        throw mo144328a(i, "@Path parameter name must match %s. Found: %s", C89785n.f203580a.pattern(), a);
                    } else if (this.f203613t.contains(a)) {
                        return new AbstractC89759i.C89769h(a, this.f203594a.mo144319a(type, annotationArr), sVar.mo144291b());
                    } else {
                        throw mo144328a(i, "URL \"%s\" does not contain \"{%s}\".", this.f203610q, a);
                    }
                } else {
                    throw mo144328a(i, "@Path can only be used with relative url on @%s", this.f203606m);
                }
            } else if (annotation instanceof AbstractC89736t) {
                AbstractC89736t tVar = (AbstractC89736t) annotation;
                String a2 = tVar.mo144292a();
                boolean b = tVar.mo144293b();
                Class<?> a3 = C89787o.m155872a(type);
                this.f203604k = true;
                if (Iterable.class.isAssignableFrom(a3)) {
                    if (type instanceof ParameterizedType) {
                        return new AbstractC89759i.C89770i(a2, this.f203594a.mo144319a(C89787o.m155874a(0, (ParameterizedType) type), annotationArr), b).mo144304a();
                    }
                    throw mo144328a(i, a3.getSimpleName() + " must include generic type (e.g., " + a3.getSimpleName() + "<String>)", new Object[0]);
                } else if (!a3.isArray()) {
                    return new AbstractC89759i.C89770i(a2, this.f203594a.mo144319a(type, annotationArr), b);
                } else {
                    return new AbstractC89759i.C89770i(a2, this.f203594a.mo144319a(C89785n.m155861a(a3.getComponentType()), annotationArr), b).mo144306b();
                }
            } else if (annotation instanceof AbstractC89738v) {
                boolean a4 = ((AbstractC89738v) annotation).mo144295a();
                Class<?> a5 = C89787o.m155872a(type);
                this.f203604k = true;
                if (Iterable.class.isAssignableFrom(a5)) {
                    if (type instanceof ParameterizedType) {
                        return new AbstractC89759i.C89772k(this.f203594a.mo144319a(C89787o.m155874a(0, (ParameterizedType) type), annotationArr), a4).mo144304a();
                    }
                    throw mo144328a(i, a5.getSimpleName() + " must include generic type (e.g., " + a5.getSimpleName() + "<String>)", new Object[0]);
                } else if (!a5.isArray()) {
                    return new AbstractC89759i.C89772k(this.f203594a.mo144319a(type, annotationArr), a4);
                } else {
                    return new AbstractC89759i.C89772k(this.f203594a.mo144319a(C89785n.m155861a(a5.getComponentType()), annotationArr), a4).mo144306b();
                }
            } else if (annotation instanceof AbstractC89737u) {
                Class<?> a6 = C89787o.m155872a(type);
                if (Map.class.isAssignableFrom(a6)) {
                    Type a7 = C89787o.m155875a(type, a6, (Class<?>) Map.class);
                    if (a7 instanceof ParameterizedType) {
                        ParameterizedType parameterizedType = (ParameterizedType) a7;
                        Type a8 = C89787o.m155874a(0, parameterizedType);
                        if (String.class == a8) {
                            return new AbstractC89759i.C89771j(this.f203594a.mo144319a(C89787o.m155874a(1, parameterizedType), annotationArr), ((AbstractC89737u) annotation).mo144294a());
                        }
                        throw mo144328a(i, "@QueryMap keys must be of type String: ".concat(String.valueOf(a8)), new Object[0]);
                    }
                    throw mo144328a(i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                throw mo144328a(i, "@QueryMap parameter type must be Map.", new Object[0]);
            } else if (annotation instanceof AbstractC89725i) {
                String a9 = ((AbstractC89725i) annotation).mo144281a();
                Class<?> a10 = C89787o.m155872a(type);
                if (Iterable.class.isAssignableFrom(a10)) {
                    if (type instanceof ParameterizedType) {
                        return new AbstractC89759i.C89765d(a9, this.f203594a.mo144319a(C89787o.m155874a(0, (ParameterizedType) type), annotationArr)).mo144304a();
                    }
                    throw mo144328a(i, a10.getSimpleName() + " must include generic type (e.g., " + a10.getSimpleName() + "<String>)", new Object[0]);
                } else if (!a10.isArray()) {
                    return new AbstractC89759i.C89765d(a9, this.f203594a.mo144319a(type, annotationArr));
                } else {
                    return new AbstractC89759i.C89765d(a9, this.f203594a.mo144319a(C89785n.m155861a(a10.getComponentType()), annotationArr)).mo144306b();
                }
            } else if (annotation instanceof AbstractC89726j) {
                Class<?> a11 = C89787o.m155872a(type);
                if (Map.class.isAssignableFrom(a11)) {
                    Type a12 = C89787o.m155875a(type, a11, (Class<?>) Map.class);
                    if (a12 instanceof ParameterizedType) {
                        ParameterizedType parameterizedType2 = (ParameterizedType) a12;
                        Type a13 = C89787o.m155874a(0, parameterizedType2);
                        if (String.class == a13) {
                            return new AbstractC89759i.C89766e(this.f203594a.mo144319a(C89787o.m155874a(1, parameterizedType2), annotationArr));
                        }
                        throw mo144328a(i, "@HeaderMap keys must be of type String: ".concat(String.valueOf(a13)), new Object[0]);
                    }
                    throw mo144328a(i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                throw mo144328a(i, "@HeaderMap parameter type must be Map.", new Object[0]);
            } else if (annotation instanceof AbstractC89719c) {
                if (this.f203608o) {
                    AbstractC89719c cVar = (AbstractC89719c) annotation;
                    String a14 = cVar.mo144273a();
                    boolean b2 = cVar.mo144274b();
                    this.f203600g = true;
                    Class<?> a15 = C89787o.m155872a(type);
                    if (Iterable.class.isAssignableFrom(a15)) {
                        if (type instanceof ParameterizedType) {
                            return new AbstractC89759i.C89763b(a14, this.f203594a.mo144319a(C89787o.m155874a(0, (ParameterizedType) type), annotationArr), b2).mo144304a();
                        }
                        throw mo144328a(i, a15.getSimpleName() + " must include generic type (e.g., " + a15.getSimpleName() + "<String>)", new Object[0]);
                    } else if (!a15.isArray()) {
                        return new AbstractC89759i.C89763b(a14, this.f203594a.mo144319a(type, annotationArr), b2);
                    } else {
                        return new AbstractC89759i.C89763b(a14, this.f203594a.mo144319a(C89785n.m155861a(a15.getComponentType()), annotationArr), b2).mo144306b();
                    }
                } else {
                    throw mo144328a(i, "@Field parameters can only be used with form encoding.", new Object[0]);
                }
            } else if (annotation instanceof AbstractC89720d) {
                if (this.f203608o) {
                    Class<?> a16 = C89787o.m155872a(type);
                    if (Map.class.isAssignableFrom(a16)) {
                        Type a17 = C89787o.m155875a(type, a16, (Class<?>) Map.class);
                        if (a17 instanceof ParameterizedType) {
                            ParameterizedType parameterizedType3 = (ParameterizedType) a17;
                            Type a18 = C89787o.m155874a(0, parameterizedType3);
                            if (String.class == a18) {
                                AbstractC89744e<T, String> a19 = this.f203594a.mo144319a(C89787o.m155874a(1, parameterizedType3), annotationArr);
                                this.f203600g = true;
                                return new AbstractC89759i.C89764c(a19, ((AbstractC89720d) annotation).mo144275a());
                            }
                            throw mo144328a(i, "@FieldMap keys must be of type String: ".concat(String.valueOf(a18)), new Object[0]);
                        }
                        throw mo144328a(i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                    }
                    throw mo144328a(i, "@FieldMap parameter type must be Map.", new Object[0]);
                }
                throw mo144328a(i, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
            } else if (annotation instanceof AbstractC89733q) {
                if (this.f203609p) {
                    AbstractC89733q qVar = (AbstractC89733q) annotation;
                    this.f203601h = true;
                    String a20 = qVar.mo144287a();
                    Class<?> a21 = C89787o.m155872a(type);
                    if (!a20.isEmpty()) {
                        C90198s a22 = C90198s.m156771a("Content-Disposition", "form-data; name=\"" + a20 + "\"", "Content-Transfer-Encoding", qVar.mo144288b());
                        if (Iterable.class.isAssignableFrom(a21)) {
                            if (type instanceof ParameterizedType) {
                                Type a23 = C89787o.m155874a(0, (ParameterizedType) type);
                                if (!C90205x.C90207b.class.isAssignableFrom(C89787o.m155872a(a23))) {
                                    return new AbstractC89759i.C89767f(a22, this.f203594a.mo144320a(a23, annotationArr, this.f203596c)).mo144304a();
                                }
                                throw mo144328a(i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                            }
                            throw mo144328a(i, a21.getSimpleName() + " must include generic type (e.g., " + a21.getSimpleName() + "<String>)", new Object[0]);
                        } else if (a21.isArray()) {
                            Class<?> a24 = C89785n.m155861a(a21.getComponentType());
                            if (!C90205x.C90207b.class.isAssignableFrom(a24)) {
                                return new AbstractC89759i.C89767f(a22, this.f203594a.mo144320a(a24, annotationArr, this.f203596c)).mo144306b();
                            }
                            throw mo144328a(i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                        } else if (!C90205x.C90207b.class.isAssignableFrom(a21)) {
                            return new AbstractC89759i.C89767f(a22, this.f203594a.mo144320a(type, annotationArr, this.f203596c));
                        } else {
                            throw mo144328a(i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                        }
                    } else if (Iterable.class.isAssignableFrom(a21)) {
                        if (!(type instanceof ParameterizedType)) {
                            throw mo144328a(i, a21.getSimpleName() + " must include generic type (e.g., " + a21.getSimpleName() + "<String>)", new Object[0]);
                        } else if (C90205x.C90207b.class.isAssignableFrom(C89787o.m155872a(C89787o.m155874a(0, (ParameterizedType) type)))) {
                            return AbstractC89759i.C89773l.f203544a.mo144304a();
                        } else {
                            throw mo144328a(i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                        }
                    } else if (a21.isArray()) {
                        if (C90205x.C90207b.class.isAssignableFrom(a21.getComponentType())) {
                            return AbstractC89759i.C89773l.f203544a.mo144306b();
                        }
                        throw mo144328a(i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                    } else if (C90205x.C90207b.class.isAssignableFrom(a21)) {
                        return AbstractC89759i.C89773l.f203544a;
                    } else {
                        throw mo144328a(i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                    }
                } else {
                    throw mo144328a(i, "@Part parameters can only be used with multipart encoding.", new Object[0]);
                }
            } else if (annotation instanceof AbstractC89734r) {
                if (this.f203609p) {
                    this.f203601h = true;
                    Class<?> a25 = C89787o.m155872a(type);
                    if (Map.class.isAssignableFrom(a25)) {
                        Type a26 = C89787o.m155875a(type, a25, (Class<?>) Map.class);
                        if (a26 instanceof ParameterizedType) {
                            ParameterizedType parameterizedType4 = (ParameterizedType) a26;
                            Type a27 = C89787o.m155874a(0, parameterizedType4);
                            if (String.class == a27) {
                                Type a28 = C89787o.m155874a(1, parameterizedType4);
                                if (!C90205x.C90207b.class.isAssignableFrom(C89787o.m155872a(a28))) {
                                    return new AbstractC89759i.C89768g(this.f203594a.mo144320a(a28, annotationArr, this.f203596c), ((AbstractC89734r) annotation).mo144289a());
                                }
                                throw mo144328a(i, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                            }
                            throw mo144328a(i, "@PartMap keys must be of type String: ".concat(String.valueOf(a27)), new Object[0]);
                        }
                        throw mo144328a(i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                    }
                    throw mo144328a(i, "@PartMap parameter type must be Map.", new Object[0]);
                }
                throw mo144328a(i, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
            } else if (!(annotation instanceof AbstractC89717a)) {
                return null;
            } else {
                if (this.f203608o || this.f203609p) {
                    throw mo144328a(i, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                } else if (!this.f203602i) {
                    try {
                        AbstractC89744e<T, AbstractC90025ab> a29 = this.f203594a.mo144320a(type, annotationArr, this.f203596c);
                        this.f203602i = true;
                        return new AbstractC89759i.C89762a(a29);
                    } catch (RuntimeException e) {
                        throw mo144329a(e, "Unable to create @Body converter for %s" + " (parameter #" + (i + 1) + ")", type);
                    }
                } else {
                    throw mo144328a(i, "Multiple @Body method annotations found.", new Object[0]);
                }
            }
        }
    }

    static {
        Covode.recordClassIndex(105879);
    }

    /* renamed from: a */
    static Set<String> m155862a(String str) {
        Matcher matcher = f203580a.matcher(str);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (matcher.find()) {
            linkedHashSet.add(matcher.group(1));
        }
        return linkedHashSet;
    }

    /* JADX DEBUG: Type inference failed for r0v2. Raw type applied. Possible types: l.c<T, R>, l.c<R, T> */
    /* JADX DEBUG: Type inference failed for r0v5. Raw type applied. Possible types: l.e<okhttp3.ad, T>, l.e<okhttp3.ad, R> */
    C89785n(C89786a<R, T> aVar) {
        this.f203582c = aVar.f203594a.f203563a;
        this.f203583d = (AbstractC89741c<T, R>) aVar.f203616w;
        this.f203585f = aVar.f203594a.f203564b;
        this.f203584e = (AbstractC89744e<AbstractC90031ad, T>) aVar.f203615v;
        this.f203586g = aVar.f203606m;
        this.f203587h = aVar.f203610q;
        this.f203588i = aVar.f203611r;
        this.f203589j = aVar.f203612s;
        this.f203590k = aVar.f203607n;
        this.f203591l = aVar.f203608o;
        this.f203592m = aVar.f203609p;
        this.f203593n = aVar.f203614u;
    }

    /* renamed from: a */
    static Class<?> m155861a(Class<?> cls) {
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

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Request mo144327a(Object... objArr) {
        int i;
        C89779k kVar = new C89779k(this.f203586g, this.f203585f, this.f203587h, this.f203588i, this.f203589j, this.f203590k, this.f203591l, this.f203592m);
        AbstractC89759i<?>[] iVarArr = this.f203593n;
        if (objArr != null) {
            i = objArr.length;
        } else {
            i = 0;
        }
        if (i == iVarArr.length) {
            for (int i2 = 0; i2 < i; i2++) {
                iVarArr[i2].mo144305a(kVar, objArr[i2]);
            }
            return kVar.mo144312a();
        }
        throw new IllegalArgumentException("Argument count (" + i + ") doesn't match expected count (" + iVarArr.length + ")");
    }
}
