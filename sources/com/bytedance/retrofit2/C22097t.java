package com.bytedance.retrofit2;

import android.content.Context;
import android.text.TextUtils;
import com.C1764a;
import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.retrofit2.AbstractC22019c;
import com.bytedance.retrofit2.AbstractC22061o;
import com.bytedance.retrofit2.client.AbstractC22025a;
import com.bytedance.retrofit2.client.C22027b;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.p1609a.AbstractC21982a;
import com.bytedance.retrofit2.p1610b.AbstractC21984a;
import com.bytedance.retrofit2.p1610b.AbstractC21987aa;
import com.bytedance.retrofit2.p1610b.AbstractC21988ab;
import com.bytedance.retrofit2.p1610b.AbstractC21992af;
import com.bytedance.retrofit2.p1610b.AbstractC21993ag;
import com.bytedance.retrofit2.p1610b.AbstractC21994b;
import com.bytedance.retrofit2.p1610b.AbstractC21996d;
import com.bytedance.retrofit2.p1610b.AbstractC21997e;
import com.bytedance.retrofit2.p1610b.AbstractC21998f;
import com.bytedance.retrofit2.p1610b.AbstractC22003k;
import com.bytedance.retrofit2.p1610b.AbstractC22004l;
import com.bytedance.retrofit2.p1610b.AbstractC22005m;
import com.bytedance.retrofit2.p1610b.AbstractC22007o;
import com.bytedance.retrofit2.p1610b.AbstractC22008p;
import com.bytedance.retrofit2.p1610b.AbstractC22014v;
import com.bytedance.retrofit2.p1610b.AbstractC22015w;
import com.bytedance.retrofit2.p1610b.AbstractC22016x;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import com.bytedance.retrofit2.p1610b.p1611a.AbstractC21985a;
import com.bytedance.retrofit2.p1610b.p1611a.AbstractC21986b;
import com.bytedance.retrofit2.p1612c.AbstractC22021a;
import com.p2082ss.android.ugc.aweme.feed.C49710k;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import com.p2082ss.android.ugc.aweme.network.p3503a.C61471a;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.URI;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.AbstractC90025ab;
import okhttp3.C90198s;
import okhttp3.C90205x;
import org.json.JSONObject;
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
/* renamed from: com.bytedance.retrofit2.t */
public final class C22097t<T> {

    /* renamed from: a */
    static final Pattern f52200a = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

    /* renamed from: b */
    static final Pattern f52201b = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");

    /* renamed from: A */
    private List<C22027b> f52202A;

    /* renamed from: B */
    private String f52203B;

    /* renamed from: c */
    final AbstractC22025a.AbstractC22026a f52204c;

    /* renamed from: d */
    final AbstractC22019c<?> f52205d;

    /* renamed from: e */
    final List<AbstractC22021a> f52206e;

    /* renamed from: f */
    final Executor f52207f;

    /* renamed from: g */
    final int f52208g;

    /* renamed from: h */
    final int f52209h;

    /* renamed from: i */
    final String f52210i;

    /* renamed from: j */
    final boolean f52211j;

    /* renamed from: k */
    final int f52212k;

    /* renamed from: l */
    final boolean f52213l;

    /* renamed from: m */
    final Object f52214m;

    /* renamed from: n */
    final Method f52215n;

    /* renamed from: o */
    final AbstractC21982a f52216o;

    /* renamed from: p */
    public C22096s f52217p;

    /* renamed from: q */
    public Object f52218q;

    /* renamed from: r */
    private final AbstractC22047g f52219r;

    /* renamed from: s */
    private final AbstractC22043e<TypedInput, T> f52220s;

    /* renamed from: t */
    private final String f52221t;

    /* renamed from: u */
    private final String f52222u;

    /* renamed from: v */
    private final boolean f52223v;

    /* renamed from: w */
    private final boolean f52224w;

    /* renamed from: x */
    private final boolean f52225x;

    /* renamed from: y */
    private final boolean f52226y;

    /* renamed from: z */
    private final AbstractC22061o<?>[] f52227z;

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.retrofit2.t$a */
    public static final class C22098a<T> {

        /* renamed from: A */
        List<C22027b> f52228A;

        /* renamed from: B */
        String f52229B;

        /* renamed from: C */
        Set<String> f52230C;

        /* renamed from: D */
        String f52231D;

        /* renamed from: E */
        AbstractC22061o<?>[] f52232E;

        /* renamed from: F */
        AbstractC22043e<TypedInput, T> f52233F;

        /* renamed from: G */
        AbstractC22019c<?> f52234G;

        /* renamed from: a */
        final C22092q f52235a;

        /* renamed from: b */
        final Method f52236b;

        /* renamed from: c */
        final Annotation[] f52237c;

        /* renamed from: d */
        final Annotation[][] f52238d;

        /* renamed from: e */
        final Type[] f52239e;

        /* renamed from: f */
        int f52240f = 1;

        /* renamed from: g */
        String f52241g = "";

        /* renamed from: h */
        boolean f52242h;

        /* renamed from: i */
        int f52243i = -1;

        /* renamed from: j */
        boolean f52244j = true;

        /* renamed from: k */
        boolean f52245k;

        /* renamed from: l */
        Object f52246l;

        /* renamed from: m */
        int f52247m = 3;

        /* renamed from: n */
        Type f52248n;

        /* renamed from: o */
        boolean f52249o;

        /* renamed from: p */
        boolean f52250p;

        /* renamed from: q */
        boolean f52251q;

        /* renamed from: r */
        boolean f52252r;

        /* renamed from: s */
        boolean f52253s;

        /* renamed from: t */
        boolean f52254t;

        /* renamed from: u */
        boolean f52255u;

        /* renamed from: v */
        String f52256v;

        /* renamed from: w */
        boolean f52257w;

        /* renamed from: x */
        boolean f52258x;

        /* renamed from: y */
        boolean f52259y;

        /* renamed from: z */
        String f52260z;

        static {
            Covode.recordClassIndex(25798);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final AbstractC22019c<?> mo35897a() {
            Type genericReturnType = this.f52236b.getGenericReturnType();
            if (C22101w.m41546d(genericReturnType)) {
                throw mo35900a((Throwable) null, "Method return type must not include a type variable or wildcard: %s", genericReturnType);
            } else if (genericReturnType != Void.TYPE) {
                try {
                    return this.f52235a.mo35880a((AbstractC22019c.AbstractC22020a) null, genericReturnType, this.f52236b.getAnnotations());
                } catch (RuntimeException e) {
                    throw mo35900a(e, "Unable to create call adapter for %s", genericReturnType);
                }
            } else {
                throw mo35900a((Throwable) null, "Service methods cannot return void.", new Object[0]);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo35902a(String str, String str2, boolean z) {
            String str3 = this.f52256v;
            if (str3 == null) {
                this.f52256v = str;
                if (str != null) {
                    this.f52231D = C22097t.m41509b(str);
                }
                if (this.f52231D != null) {
                    this.f52245k = true;
                }
                this.f52257w = z;
                if (!str2.isEmpty()) {
                    int indexOf = str2.indexOf(63);
                    if (indexOf != -1 && indexOf < str2.length() - 1) {
                        String substring = str2.substring(indexOf + 1);
                        if (C22097t.f52200a.matcher(substring).find()) {
                            throw mo35900a((Throwable) null, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", substring);
                        }
                    }
                    this.f52260z = str2;
                    this.f52230C = C22097t.m41507a(str2);
                    return;
                }
                return;
            }
            throw mo35900a((Throwable) null, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final List<C22027b> mo35901a(String[] strArr) {
            ArrayList arrayList = new ArrayList();
            for (String str : strArr) {
                int indexOf = str.indexOf(58);
                if (indexOf == -1 || indexOf == 0 || indexOf == str.length() - 1) {
                    throw mo35900a((Throwable) null, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str);
                }
                String substring = str.substring(0, indexOf);
                String trim = str.substring(indexOf + 1).trim();
                if ("Content-Type".equalsIgnoreCase(substring)) {
                    this.f52229B = trim;
                } else {
                    arrayList.add(new C22027b(substring, trim));
                }
            }
            return arrayList;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final AbstractC22061o<?> mo35898a(int i, Type type, Annotation[] annotationArr) {
            AbstractC22061o<?> oVar = null;
            for (Annotation annotation : annotationArr) {
                AbstractC22061o<?> a = m41511a(i, type, annotationArr, annotation);
                if (a != null || (C22087p.f52129b && (a = m41519b(i, type, annotationArr, annotation)) != null)) {
                    if (oVar == null) {
                        oVar = a;
                    } else {
                        throw mo35899a(i, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                    }
                }
            }
            if (oVar != null) {
                return oVar;
            }
            throw mo35899a(i, "No Retrofit annotation found.", new Object[0]);
        }

        /* renamed from: a */
        private void m41518a(int i, String str) {
            if (!C22097t.f52201b.matcher(str).matches()) {
                throw mo35899a(i, "@Path parameter name must match %s. Found: %s", C22097t.f52200a.pattern(), str);
            } else if (!this.f52230C.contains(str)) {
                throw mo35899a(i, "URL \"%s\" does not contain \"{%s}\".", this.f52260z, str);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final RuntimeException mo35900a(Throwable th, String str, Object... objArr) {
            return new IllegalArgumentException(C1764a.m5928a(str, objArr) + "\n    for method " + this.f52236b.getDeclaringClass().getSimpleName() + "." + this.f52236b.getName(), th);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final RuntimeException mo35899a(int i, String str, Object... objArr) {
            return mo35900a((Throwable) null, str + " (parameter #" + (i + 1) + ")", objArr);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final AbstractC22043e<TypedInput, T> mo35903b() {
            Annotation[] annotations = this.f52236b.getAnnotations();
            try {
                C22092q qVar = this.f52235a;
                Type type = this.f52248n;
                C22101w.m41535a(type, "type == null");
                C22101w.m41535a(annotations, "annotations == null");
                int indexOf = qVar.f52136c.indexOf(null) + 1;
                int size = qVar.f52136c.size();
                for (int i = indexOf; i < size; i++) {
                    AbstractC22043e<TypedInput, T> eVar = (AbstractC22043e<TypedInput, T>) qVar.f52136c.get(i).mo11574a(type, annotations, qVar);
                    if (eVar != null) {
                        return eVar;
                    }
                }
                StringBuilder append = new StringBuilder("Could not locate TypeInput converter for ").append(type).append(".\n");
                append.append("  Tried:");
                int size2 = qVar.f52136c.size();
                while (indexOf < size2) {
                    append.append("\n   * ").append(qVar.f52136c.get(indexOf).getClass().getName());
                    indexOf++;
                }
                throw new IllegalArgumentException(append.toString());
            } catch (RuntimeException e) {
                throw mo35900a(e, "Unable to create converter for %s", this.f52248n);
            }
        }

        /* renamed from: a */
        private static AbstractC22061o<?> m41514a(Type type) {
            if (AbstractC90025ab.class.isAssignableFrom(C22101w.m41534a(type))) {
                return AbstractC22061o.C22066c.f52096a;
            }
            return null;
        }

        /* renamed from: a */
        private static AbstractC22061o<?> m41513a(ParameterizedType parameterizedType, Annotation annotation) {
            if (AbstractC90025ab.class.isAssignableFrom(C22101w.m41534a(C22101w.m41536a(1, parameterizedType)))) {
                return new AbstractC22061o.C22068e(((AbstractC22015w) annotation).mo35803a());
            }
            return null;
        }

        public C22098a(C22092q qVar, Method method) {
            this.f52235a = qVar;
            this.f52236b = method;
            this.f52237c = method.getAnnotations();
            this.f52239e = method.getGenericParameterTypes();
            this.f52238d = method.getParameterAnnotations();
        }

        /* renamed from: a */
        private static C90198s m41517a(String str, String str2) {
            return C90198s.m156771a("Content-Disposition", "form-data; name=\"" + str + "\"", "Content-Transfer-Encoding", str2);
        }

        /* renamed from: a */
        private static AbstractC22061o<?> m41515a(Type type, String str, String str2) {
            Class<?> a = C22101w.m41534a(type);
            if (TextUtils.isEmpty(str)) {
                if (Iterable.class.isAssignableFrom(a)) {
                    if ((type instanceof ParameterizedType) && C90205x.C90207b.class.isAssignableFrom(C22101w.m41534a(C22101w.m41536a(0, (ParameterizedType) type)))) {
                        return AbstractC22061o.C22069f.f52099a.mo35873a();
                    }
                } else if (a.isArray()) {
                    if (C90205x.C90207b.class.isAssignableFrom(a.getComponentType())) {
                        return AbstractC22061o.C22069f.f52099a.mo35875b();
                    }
                } else if (C90205x.C90207b.class.isAssignableFrom(a)) {
                    return AbstractC22061o.C22069f.f52099a;
                }
            } else if (Iterable.class.isAssignableFrom(a)) {
                if ((type instanceof ParameterizedType) && AbstractC90025ab.class.isAssignableFrom(C22101w.m41534a(C22101w.m41536a(0, (ParameterizedType) type)))) {
                    return new AbstractC22061o.C22067d(m41517a(str, str2)).mo35873a();
                }
            } else if (a.isArray()) {
                if (AbstractC90025ab.class.isAssignableFrom(C22097t.m41505a(a.getComponentType()))) {
                    return new AbstractC22061o.C22067d(m41517a(str, str2)).mo35875b();
                }
            } else if (AbstractC90025ab.class.isAssignableFrom(a)) {
                return new AbstractC22061o.C22067d(m41517a(str, str2));
            }
            return null;
        }

        /* renamed from: a */
        private RuntimeException m41516a(Throwable th, int i, String str, Object... objArr) {
            return mo35900a(th, str + " (parameter #" + (i + 1) + ")", objArr);
        }

        /* renamed from: a */
        private AbstractC22061o<?> m41511a(int i, Type type, Annotation[] annotationArr, Annotation annotation) {
            if (annotation instanceof AbstractC21993ag) {
                if (this.f52254t) {
                    throw mo35899a(i, "Multiple @Url method annotations found.", new Object[0]);
                } else if (this.f52252r) {
                    throw mo35899a(i, "@Path parameters may not be used with @Url.", new Object[0]);
                } else if (this.f52253s) {
                    throw mo35899a(i, "A @Url parameter must not come after a @Query", new Object[0]);
                } else if (this.f52260z == null) {
                    this.f52254t = true;
                    if (type == String.class || type == URI.class || ((type instanceof Class) && "android.net.Uri".equals(((Class) type).getName()))) {
                        return new AbstractC22061o.C22085v();
                    }
                    throw mo35899a(i, "@Url must be String, java.net.URI, or android.net.Uri type.", new Object[0]);
                } else {
                    throw mo35899a(i, "@Url cannot be used with @%s URL", this.f52256v);
                }
            } else if (annotation instanceof AbstractC22016x) {
                if (this.f52253s) {
                    throw mo35899a(i, "A @Path parameter must not come after a @Query.", new Object[0]);
                } else if (this.f52254t) {
                    throw mo35899a(i, "@Path parameters may not be used with @Url.", new Object[0]);
                } else if (this.f52260z != null) {
                    this.f52252r = true;
                    AbstractC22016x xVar = (AbstractC22016x) annotation;
                    String a = xVar.mo35804a();
                    m41518a(i, a);
                    return new AbstractC22061o.C22080q(a, this.f52235a.mo35885b(type, annotationArr), xVar.mo35805b());
                } else {
                    throw mo35899a(i, "@Path can only be used with relative url on @%s", this.f52256v);
                }
            } else if (annotation instanceof AbstractC22018z) {
                AbstractC22018z zVar = (AbstractC22018z) annotation;
                return m41512a(i, type, annotationArr, false, zVar.mo35807a(), zVar.mo35808b());
            } else if (annotation instanceof AbstractC21988ab) {
                return m41512a(i, type, annotationArr, true, null, ((AbstractC21988ab) annotation).mo35782a());
            } else {
                if (annotation instanceof AbstractC21987aa) {
                    Class<?> a2 = C22101w.m41534a(type);
                    if (Map.class.isAssignableFrom(a2)) {
                        Type a3 = C22101w.m41537a(type, a2, (Class<?>) Map.class);
                        if (a3 instanceof ParameterizedType) {
                            ParameterizedType parameterizedType = (ParameterizedType) a3;
                            Type a4 = C22101w.m41536a(0, parameterizedType);
                            if (String.class == a4) {
                                return new AbstractC22061o.C22082s(this.f52235a.mo35885b(C22101w.m41536a(1, parameterizedType), annotationArr), ((AbstractC21987aa) annotation).mo35781a());
                            }
                            throw mo35899a(i, "@QueryMap keys must be of type String: ".concat(String.valueOf(a4)), new Object[0]);
                        }
                        throw mo35899a(i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                    }
                    throw mo35899a(i, "@QueryMap parameter type must be Map.", new Object[0]);
                } else if (annotation instanceof AbstractC22003k) {
                    String a5 = ((AbstractC22003k) annotation).mo35794a();
                    Class<?> a6 = C22101w.m41534a(type);
                    if (Iterable.class.isAssignableFrom(a6)) {
                        if (type instanceof ParameterizedType) {
                            return new AbstractC22061o.C22073j(a5, this.f52235a.mo35885b(C22101w.m41536a(0, (ParameterizedType) type), annotationArr)).mo35873a();
                        }
                        throw mo35899a(i, a6.getSimpleName() + " must include generic type (e.g., " + a6.getSimpleName() + "<String>)", new Object[0]);
                    } else if (!a6.isArray()) {
                        return new AbstractC22061o.C22073j(a5, this.f52235a.mo35885b(type, annotationArr));
                    } else {
                        return new AbstractC22061o.C22073j(a5, this.f52235a.mo35885b(C22097t.m41505a(a6.getComponentType()), annotationArr)).mo35875b();
                    }
                } else if (annotation instanceof AbstractC22004l) {
                    Class<?> a7 = C22101w.m41534a(type);
                    if (List.class.isAssignableFrom(a7)) {
                        Type a8 = C22101w.m41537a(type, a7, (Class<?>) List.class);
                        if (a8 instanceof ParameterizedType) {
                            Type a9 = C22101w.m41536a(0, (ParameterizedType) a8);
                            if (C22027b.class == a9) {
                                return new AbstractC22061o.C22074k(this.f52235a.mo35886c(a9, annotationArr));
                            }
                            throw mo35899a(i, "@HeaderList keys must be of type retrofit.client.Header: ".concat(String.valueOf(a9)), new Object[0]);
                        }
                        throw mo35899a(i, "List must include generic types (e.g., List<Header>)", new Object[0]);
                    }
                    throw mo35899a(i, "@HeaderList parameter type must be List.", new Object[0]);
                } else if (annotation instanceof AbstractC22005m) {
                    Class<?> a10 = C22101w.m41534a(type);
                    if (Map.class.isAssignableFrom(a10)) {
                        Type a11 = C22101w.m41537a(type, a10, (Class<?>) Map.class);
                        if (a11 instanceof ParameterizedType) {
                            ParameterizedType parameterizedType2 = (ParameterizedType) a11;
                            Type a12 = C22101w.m41536a(0, parameterizedType2);
                            if (String.class == a12) {
                                return new AbstractC22061o.C22075l(this.f52235a.mo35885b(C22101w.m41536a(1, parameterizedType2), annotationArr));
                            }
                            throw mo35899a(i, "@HeaderMap keys must be of type String: ".concat(String.valueOf(a12)), new Object[0]);
                        }
                        throw mo35899a(i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                    }
                    throw mo35899a(i, "@HeaderMap parameter type must be Map.", new Object[0]);
                } else if (annotation instanceof AbstractC21997e) {
                    if (this.f52258x) {
                        AbstractC21997e eVar = (AbstractC21997e) annotation;
                        String a13 = eVar.mo35786a();
                        boolean b = eVar.mo35787b();
                        this.f52249o = true;
                        Class<?> a14 = C22101w.m41534a(type);
                        if (Iterable.class.isAssignableFrom(a14)) {
                            if (type instanceof ParameterizedType) {
                                return new AbstractC22061o.C22071h(a13, this.f52235a.mo35885b(C22101w.m41536a(0, (ParameterizedType) type), annotationArr), b).mo35873a();
                            }
                            throw mo35899a(i, a14.getSimpleName() + " must include generic type (e.g., " + a14.getSimpleName() + "<String>)", new Object[0]);
                        } else if (!a14.isArray()) {
                            return new AbstractC22061o.C22071h(a13, this.f52235a.mo35885b(type, annotationArr), b);
                        } else {
                            return new AbstractC22061o.C22071h(a13, this.f52235a.mo35885b(C22097t.m41505a(a14.getComponentType()), annotationArr), b).mo35875b();
                        }
                    } else {
                        throw mo35899a(i, "@Field parameters can only be used with form encoding.", new Object[0]);
                    }
                } else if (annotation instanceof AbstractC21998f) {
                    if (this.f52258x) {
                        Class<?> a15 = C22101w.m41534a(type);
                        if (Map.class.isAssignableFrom(a15)) {
                            Type a16 = C22101w.m41537a(type, a15, (Class<?>) Map.class);
                            if (a16 instanceof ParameterizedType) {
                                ParameterizedType parameterizedType3 = (ParameterizedType) a16;
                                Type a17 = C22101w.m41536a(0, parameterizedType3);
                                if (String.class == a17) {
                                    AbstractC22043e<T, String> b2 = this.f52235a.mo35885b(C22101w.m41536a(1, parameterizedType3), annotationArr);
                                    this.f52249o = true;
                                    return new AbstractC22061o.C22072i(b2, ((AbstractC21998f) annotation).mo35788a());
                                }
                                throw mo35899a(i, "@FieldMap keys must be of type String: ".concat(String.valueOf(a17)), new Object[0]);
                            }
                            throw mo35899a(i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                        }
                        throw mo35899a(i, "@FieldMap parameter type must be Map.", new Object[0]);
                    }
                    throw mo35899a(i, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
                } else if (annotation instanceof AbstractC22014v) {
                    if (this.f52259y) {
                        AbstractC22014v vVar = (AbstractC22014v) annotation;
                        this.f52250p = true;
                        AbstractC22061o<?> a18 = m41515a(type, vVar.mo35801a(), vVar.mo35802b());
                        if (a18 != null) {
                            return a18;
                        }
                        return new AbstractC22061o.C22078o(vVar.mo35801a(), this.f52235a.mo35882a(type, annotationArr, this.f52237c));
                    }
                    throw mo35899a(i, "@Part parameters can only be used with multipart encoding.", new Object[0]);
                } else if (annotation instanceof AbstractC22015w) {
                    if (this.f52259y) {
                        this.f52250p = true;
                        Class<?> a19 = C22101w.m41534a(type);
                        if (Map.class.isAssignableFrom(a19)) {
                            Type a20 = C22101w.m41537a(type, a19, (Class<?>) Map.class);
                            if (a20 instanceof ParameterizedType) {
                                ParameterizedType parameterizedType4 = (ParameterizedType) a20;
                                Type a21 = C22101w.m41536a(0, parameterizedType4);
                                if (String.class == a21) {
                                    AbstractC22061o<?> a22 = m41513a(parameterizedType4, annotation);
                                    if (a22 != null) {
                                        return a22;
                                    }
                                    return new AbstractC22061o.C22079p(this.f52235a.mo35882a(C22101w.m41536a(1, parameterizedType4), annotationArr, this.f52237c), ((AbstractC22015w) annotation).mo35803a());
                                }
                                throw mo35899a(i, "@PartMap keys must be of type String: ".concat(String.valueOf(a21)), new Object[0]);
                            }
                            throw mo35899a(i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                        }
                        throw mo35899a(i, "@PartMap parameter type must be Map.", new Object[0]);
                    }
                    throw mo35899a(i, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
                } else if (annotation instanceof AbstractC21994b) {
                    if (this.f52258x || this.f52259y) {
                        throw mo35899a(i, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                    } else if (!this.f52251q) {
                        AbstractC22061o<?> a23 = m41514a(type);
                        if (a23 != null) {
                            this.f52251q = true;
                            return a23;
                        }
                        try {
                            AbstractC22043e<T, TypedOutput> a24 = this.f52235a.mo35882a(type, annotationArr, this.f52237c);
                            this.f52251q = true;
                            return new AbstractC22061o.C22065b(this.f52245k, a24);
                        } catch (RuntimeException e) {
                            throw m41516a(e, i, "Unable to create @Body converter for %s", type);
                        }
                    } else {
                        throw mo35899a(i, "Multiple @Body method annotations found.", new Object[0]);
                    }
                } else if (annotation instanceof AbstractC22008p) {
                    if (!this.f52255u) {
                        this.f52255u = true;
                        String a25 = ((AbstractC22008p) annotation).mo35796a();
                        if (C22097t.f52201b.matcher(a25).matches()) {
                            String str = this.f52231D;
                            if (str == null || str.equals(a25)) {
                                return new AbstractC22061o.C22077n(a25, this.f52235a.mo35885b(type, annotationArr));
                            }
                            throw mo35899a(i, "Method \"%s\" does not contain \"{%s}\".", this.f52256v, a25);
                        }
                        throw mo35899a(i, "@Method parameter name must match %s. Found: %s", C22097t.f52200a.pattern(), a25);
                    }
                    throw mo35899a(i, "Multiple @Method method annotations found.", new Object[0]);
                } else if (annotation instanceof AbstractC22007o) {
                    try {
                        return new AbstractC22061o.C22076m(this.f52235a.mo35885b(type, annotationArr));
                    } catch (RuntimeException e2) {
                        throw m41516a(e2, i, "Unable to create @MaxLength converter for %s", type);
                    }
                } else if (annotation instanceof AbstractC21984a) {
                    try {
                        return new AbstractC22061o.C22064a(this.f52235a.mo35885b(type, annotationArr));
                    } catch (RuntimeException e3) {
                        throw m41516a(e3, i, "Unable to create @AddCommonParam converter for %s", type);
                    }
                } else if (annotation instanceof AbstractC21996d) {
                    try {
                        return new AbstractC22061o.C22070g(this.f52235a.mo35881a(type, annotationArr));
                    } catch (RuntimeException e4) {
                        throw m41516a(e4, i, "Unable to create @ExtraInfo converter for %s", type);
                    }
                } else if (annotation instanceof AbstractC21985a) {
                    if (AbstractC21986b.class.isAssignableFrom(C22101w.m41534a(type))) {
                        return new AbstractC22061o.C22084u();
                    }
                    throw mo35899a(i, "Unable to create @QueryObject for %s not QueryParamObject type", type);
                } else if (!(annotation instanceof AbstractC21992af)) {
                    return null;
                } else {
                    Class<?> a26 = C22101w.m41534a(type);
                    for (int i2 = i - 1; i2 >= 0; i2--) {
                        AbstractC22061o<?> oVar = this.f52232E[i2];
                        if ((oVar instanceof AbstractC22061o.C22086w) && ((AbstractC22061o.C22086w) oVar).f52127a.equals(a26)) {
                            throw mo35899a(i, "@Tag type " + a26.getName() + " is duplicate of parameter #" + (i2 + 1) + " and would always overwrite its value.", new Object[0]);
                        }
                    }
                    return new AbstractC22061o.C22086w(a26);
                }
            }
        }

        /* renamed from: b */
        private AbstractC22061o<?> m41519b(int i, Type type, Annotation[] annotationArr, Annotation annotation) {
            if (annotation instanceof AbstractC89740x) {
                if (this.f52254t) {
                    throw mo35899a(i, "Multiple @Url method annotations found.", new Object[0]);
                } else if (this.f52252r) {
                    throw mo35899a(i, "@Path parameters may not be used with @Url.", new Object[0]);
                } else if (this.f52253s) {
                    throw mo35899a(i, "A @Url parameter must not come after a @Query", new Object[0]);
                } else if (this.f52260z == null) {
                    this.f52254t = true;
                    if (type == String.class || type == URI.class || ((type instanceof Class) && "android.net.Uri".equals(((Class) type).getName()))) {
                        return new AbstractC22061o.C22085v();
                    }
                    throw mo35899a(i, "@Url must be String, java.net.URI, or android.net.Uri type.", new Object[0]);
                } else {
                    throw mo35899a(i, "@Url cannot be used with @%s URL", this.f52256v);
                }
            } else if (annotation instanceof AbstractC89735s) {
                if (this.f52253s) {
                    throw mo35899a(i, "A @Path parameter must not come after a @Query.", new Object[0]);
                } else if (this.f52254t) {
                    throw mo35899a(i, "@Path parameters may not be used with @Url.", new Object[0]);
                } else if (this.f52260z != null) {
                    this.f52252r = true;
                    AbstractC89735s sVar = (AbstractC89735s) annotation;
                    String a = sVar.mo144290a();
                    m41518a(i, a);
                    return new AbstractC22061o.C22080q(a, this.f52235a.mo35885b(type, annotationArr), !sVar.mo144291b());
                } else {
                    throw mo35899a(i, "@Path can only be used with relative url on @%s", this.f52256v);
                }
            } else if (annotation instanceof AbstractC89736t) {
                AbstractC89736t tVar = (AbstractC89736t) annotation;
                String a2 = tVar.mo144292a();
                boolean b = tVar.mo144293b();
                Class<?> a3 = C22101w.m41534a(type);
                this.f52253s = true;
                if (Iterable.class.isAssignableFrom(a3)) {
                    if (type instanceof ParameterizedType) {
                        return new AbstractC22061o.C22081r(a2, this.f52235a.mo35885b(C22101w.m41536a(0, (ParameterizedType) type), annotationArr), !b).mo35873a();
                    }
                    throw mo35899a(i, a3.getSimpleName() + " must include generic type (e.g., " + a3.getSimpleName() + "<String>)", new Object[0]);
                } else if (!a3.isArray()) {
                    return new AbstractC22061o.C22081r(a2, this.f52235a.mo35885b(type, annotationArr), !b);
                } else {
                    return new AbstractC22061o.C22081r(a2, this.f52235a.mo35885b(C22097t.m41505a(a3.getComponentType()), annotationArr), !b).mo35875b();
                }
            } else if (annotation instanceof AbstractC89738v) {
                boolean a4 = ((AbstractC89738v) annotation).mo144295a();
                Class<?> a5 = C22101w.m41534a(type);
                this.f52253s = true;
                if (Iterable.class.isAssignableFrom(a5)) {
                    if (type instanceof ParameterizedType) {
                        return new AbstractC22061o.C22083t(this.f52235a.mo35885b(C22101w.m41536a(0, (ParameterizedType) type), annotationArr), a4).mo35873a();
                    }
                    throw mo35899a(i, a5.getSimpleName() + " must include generic type (e.g., " + a5.getSimpleName() + "<String>)", new Object[0]);
                } else if (!a5.isArray()) {
                    return new AbstractC22061o.C22083t(this.f52235a.mo35885b(type, annotationArr), a4);
                } else {
                    return new AbstractC22061o.C22083t(this.f52235a.mo35885b(C22097t.m41505a(a5.getComponentType()), annotationArr), a4).mo35875b();
                }
            } else if (annotation instanceof AbstractC89737u) {
                Class<?> a6 = C22101w.m41534a(type);
                if (Map.class.isAssignableFrom(a6)) {
                    Type a7 = C22101w.m41537a(type, a6, (Class<?>) Map.class);
                    if (a7 instanceof ParameterizedType) {
                        ParameterizedType parameterizedType = (ParameterizedType) a7;
                        Type a8 = C22101w.m41536a(0, parameterizedType);
                        if (String.class == a8) {
                            return new AbstractC22061o.C22082s(this.f52235a.mo35885b(C22101w.m41536a(1, parameterizedType), annotationArr), !((AbstractC89737u) annotation).mo144294a());
                        }
                        throw mo35899a(i, "@QueryMap keys must be of type String: ".concat(String.valueOf(a8)), new Object[0]);
                    }
                    throw mo35899a(i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                throw mo35899a(i, "@QueryMap parameter type must be Map.", new Object[0]);
            } else if (annotation instanceof AbstractC89725i) {
                String a9 = ((AbstractC89725i) annotation).mo144281a();
                Class<?> a10 = C22101w.m41534a(type);
                if (Iterable.class.isAssignableFrom(a10)) {
                    if (type instanceof ParameterizedType) {
                        return new AbstractC22061o.C22073j(a9, this.f52235a.mo35885b(C22101w.m41536a(0, (ParameterizedType) type), annotationArr)).mo35873a();
                    }
                    throw mo35899a(i, a10.getSimpleName() + " must include generic type (e.g., " + a10.getSimpleName() + "<String>)", new Object[0]);
                } else if (!a10.isArray()) {
                    return new AbstractC22061o.C22073j(a9, this.f52235a.mo35885b(type, annotationArr));
                } else {
                    return new AbstractC22061o.C22073j(a9, this.f52235a.mo35885b(C22097t.m41505a(a10.getComponentType()), annotationArr)).mo35875b();
                }
            } else if (annotation instanceof AbstractC89726j) {
                Class<?> a11 = C22101w.m41534a(type);
                if (Map.class.isAssignableFrom(a11)) {
                    Type a12 = C22101w.m41537a(type, a11, (Class<?>) Map.class);
                    if (a12 instanceof ParameterizedType) {
                        ParameterizedType parameterizedType2 = (ParameterizedType) a12;
                        Type a13 = C22101w.m41536a(0, parameterizedType2);
                        if (String.class == a13) {
                            return new AbstractC22061o.C22075l(this.f52235a.mo35885b(C22101w.m41536a(1, parameterizedType2), annotationArr));
                        }
                        throw mo35899a(i, "@HeaderMap keys must be of type String: ".concat(String.valueOf(a13)), new Object[0]);
                    }
                    throw mo35899a(i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                throw mo35899a(i, "@HeaderMap parameter type must be Map.", new Object[0]);
            } else if (annotation instanceof AbstractC89719c) {
                if (this.f52258x) {
                    AbstractC89719c cVar = (AbstractC89719c) annotation;
                    String a14 = cVar.mo144273a();
                    boolean b2 = cVar.mo144274b();
                    this.f52249o = true;
                    Class<?> a15 = C22101w.m41534a(type);
                    if (Iterable.class.isAssignableFrom(a15)) {
                        if (type instanceof ParameterizedType) {
                            return new AbstractC22061o.C22071h(a14, this.f52235a.mo35885b(C22101w.m41536a(0, (ParameterizedType) type), annotationArr), !b2).mo35873a();
                        }
                        throw mo35899a(i, a15.getSimpleName() + " must include generic type (e.g., " + a15.getSimpleName() + "<String>)", new Object[0]);
                    } else if (!a15.isArray()) {
                        return new AbstractC22061o.C22071h(a14, this.f52235a.mo35885b(type, annotationArr), !b2);
                    } else {
                        return new AbstractC22061o.C22071h(a14, this.f52235a.mo35885b(C22097t.m41505a(a15.getComponentType()), annotationArr), !b2).mo35875b();
                    }
                } else {
                    throw mo35899a(i, "@Field parameters can only be used with form encoding.", new Object[0]);
                }
            } else if (annotation instanceof AbstractC89720d) {
                if (this.f52258x) {
                    Class<?> a16 = C22101w.m41534a(type);
                    if (Map.class.isAssignableFrom(a16)) {
                        Type a17 = C22101w.m41537a(type, a16, (Class<?>) Map.class);
                        if (a17 instanceof ParameterizedType) {
                            ParameterizedType parameterizedType3 = (ParameterizedType) a17;
                            Type a18 = C22101w.m41536a(0, parameterizedType3);
                            if (String.class == a18) {
                                AbstractC22043e<T, String> b3 = this.f52235a.mo35885b(C22101w.m41536a(1, parameterizedType3), annotationArr);
                                this.f52249o = true;
                                return new AbstractC22061o.C22072i(b3, !((AbstractC89720d) annotation).mo144275a());
                            }
                            throw mo35899a(i, "@FieldMap keys must be of type String: ".concat(String.valueOf(a18)), new Object[0]);
                        }
                        throw mo35899a(i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                    }
                    throw mo35899a(i, "@FieldMap parameter type must be Map.", new Object[0]);
                }
                throw mo35899a(i, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
            } else if (annotation instanceof AbstractC89733q) {
                if (this.f52259y) {
                    AbstractC89733q qVar = (AbstractC89733q) annotation;
                    this.f52250p = true;
                    AbstractC22061o<?> a19 = m41515a(type, qVar.mo144287a(), qVar.mo144288b());
                    if (a19 != null) {
                        return a19;
                    }
                    return new AbstractC22061o.C22078o(qVar.mo144287a(), this.f52235a.mo35882a(type, annotationArr, this.f52237c));
                }
                throw mo35899a(i, "@Part parameters can only be used with multipart encoding.", new Object[0]);
            } else if (annotation instanceof AbstractC89734r) {
                if (this.f52259y) {
                    this.f52250p = true;
                    Class<?> a20 = C22101w.m41534a(type);
                    if (Map.class.isAssignableFrom(a20)) {
                        Type a21 = C22101w.m41537a(type, a20, (Class<?>) Map.class);
                        if (a21 instanceof ParameterizedType) {
                            ParameterizedType parameterizedType4 = (ParameterizedType) a21;
                            Type a22 = C22101w.m41536a(0, parameterizedType4);
                            if (String.class == a22) {
                                AbstractC22061o<?> a23 = m41513a(parameterizedType4, annotation);
                                if (a23 != null) {
                                    return a23;
                                }
                                return new AbstractC22061o.C22079p(this.f52235a.mo35882a(C22101w.m41536a(1, parameterizedType4), annotationArr, this.f52237c), ((AbstractC89734r) annotation).mo144289a());
                            }
                            throw mo35899a(i, "@PartMap keys must be of type String: ".concat(String.valueOf(a22)), new Object[0]);
                        }
                        throw mo35899a(i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                    }
                    throw mo35899a(i, "@PartMap parameter type must be Map.", new Object[0]);
                }
                throw mo35899a(i, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
            } else if (!(annotation instanceof AbstractC89717a)) {
                return null;
            } else {
                if (this.f52258x || this.f52259y) {
                    throw mo35899a(i, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                } else if (!this.f52251q) {
                    AbstractC22061o<?> a24 = m41514a(type);
                    if (a24 != null) {
                        this.f52251q = true;
                        return a24;
                    }
                    try {
                        AbstractC22043e<T, TypedOutput> a25 = this.f52235a.mo35882a(type, annotationArr, this.f52237c);
                        this.f52251q = true;
                        return new AbstractC22061o.C22065b(this.f52245k, a25);
                    } catch (RuntimeException e) {
                        throw m41516a(e, i, "Unable to create @Body converter for %s", type);
                    }
                } else {
                    throw mo35899a(i, "Multiple @Body method annotations found.", new Object[0]);
                }
            }
        }

        /* renamed from: a */
        private AbstractC22061o m41512a(int i, Type type, Annotation[] annotationArr, boolean z, String str, boolean z2) {
            Class<?> a = C22101w.m41534a(type);
            this.f52253s = true;
            if (Iterable.class.isAssignableFrom(a)) {
                if (type instanceof ParameterizedType) {
                    AbstractC22043e<T, String> b = this.f52235a.mo35885b(C22101w.m41536a(0, (ParameterizedType) type), annotationArr);
                    if (z) {
                        return new AbstractC22061o.C22083t(b, z2).mo35873a();
                    }
                    return new AbstractC22061o.C22081r(str, b, z2).mo35873a();
                }
                throw mo35899a(i, a.getSimpleName() + " must include generic type (e.g., " + a.getSimpleName() + "<String>)", new Object[0]);
            } else if (a.isArray()) {
                AbstractC22043e<T, String> b2 = this.f52235a.mo35885b(C22097t.m41505a(a.getComponentType()), annotationArr);
                if (z) {
                    return new AbstractC22061o.C22083t(b2, z2).mo35875b();
                }
                return new AbstractC22061o.C22081r(str, b2, z2).mo35875b();
            } else {
                AbstractC22043e<T, String> b3 = this.f52235a.mo35885b(type, annotationArr);
                if (z) {
                    return new AbstractC22061o.C22083t(b3, z2);
                }
                return new AbstractC22061o.C22081r(str, b3, z2);
            }
        }
    }

    static {
        Covode.recordClassIndex(25797);
    }

    /* renamed from: a */
    static Set<String> m41507a(String str) {
        Matcher matcher = f52200a.matcher(str);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (matcher.find()) {
            linkedHashSet.add(matcher.group(1));
        }
        return linkedHashSet;
    }

    /* renamed from: b */
    static String m41509b(String str) {
        Matcher matcher = f52200a.matcher(str);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return null;
    }

    /* renamed from: a */
    static Class<?> m41505a(Class<?> cls) {
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

    C22097t(C22098a<T> aVar) {
        this.f52204c = aVar.f52235a.f52134a;
        this.f52205d = aVar.f52234G;
        this.f52206e = aVar.f52235a.f52140g;
        this.f52207f = aVar.f52235a.f52139f;
        this.f52219r = aVar.f52235a.f52135b;
        this.f52220s = aVar.f52233F;
        this.f52221t = aVar.f52256v;
        this.f52222u = aVar.f52260z;
        this.f52224w = aVar.f52257w;
        this.f52225x = aVar.f52258x;
        this.f52226y = aVar.f52259y;
        this.f52227z = aVar.f52232E;
        this.f52202A = aVar.f52228A;
        this.f52203B = aVar.f52229B;
        this.f52208g = aVar.f52240f;
        this.f52209h = aVar.f52247m;
        this.f52210i = aVar.f52241g;
        this.f52211j = aVar.f52242h;
        this.f52212k = aVar.f52243i;
        this.f52213l = aVar.f52244j;
        this.f52223v = aVar.f52245k;
        this.f52214m = aVar.f52246l;
        this.f52215n = aVar.f52236b;
        this.f52216o = aVar.f52235a.f52141i;
    }

    /* renamed from: a */
    private static boolean m41508a(File file) {
        MethodCollector.m26663i(12148);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(12148);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(12148);
        return delete;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r15v0, resolved type: com.bytedance.retrofit2.RequestBuilder */
    /* JADX WARN: Multi-variable type inference failed */
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Request mo35896a(Object... objArr) {
        int i;
        RequestBuilder requestBuilder = new RequestBuilder(this.f52221t, this.f52219r, this.f52222u, this.f52202A, this.f52203B, this.f52208g, this.f52209h, this.f52211j, this.f52212k, this.f52213l, this.f52214m, this.f52224w, this.f52225x, this.f52226y, this.f52210i);
        AbstractC22061o<?>[] oVarArr = this.f52227z;
        if (objArr != null) {
            i = objArr.length;
        } else {
            i = 0;
        }
        if (i == oVarArr.length) {
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add(objArr[i2]);
                oVarArr[i2].mo35874a(requestBuilder, objArr[i2]);
            }
            requestBuilder.mo35748a(C22060n.class, new C22060n(this.f52215n, arrayList));
            Request a = requestBuilder.mo35747a();
            if (C61471a.m111324a() && C49710k.f114401i) {
                a.getPath();
                ArrayList arrayList2 = new ArrayList(a.getHeaders());
                arrayList2.add(new C22027b("x-tt-request-tag", "feed=0"));
                Request.C22024a newBuilder = a.newBuilder();
                newBuilder.f52025c = arrayList2;
                a = newBuilder.mo35840a();
            }
            this.f52218q = a.getPath();
            return a;
        }
        throw new IllegalArgumentException("Argument count (" + i + ") doesn't match expected count (" + oVarArr.length + ")");
    }

    /* renamed from: a */
    public static Object m41506a(C22097t tVar, TypedInput typedInput) {
        BufferedOutputStream bufferedOutputStream;
        Throwable th;
        FileNotFoundException e;
        IOException e2;
        Exception e3;
        BufferedInputStream bufferedInputStream;
        MethodCollector.m26663i(12013);
        try {
            T a = tVar.f52220s.mo11580a(typedInput);
            MethodCollector.m26664o(12013);
            return a;
        } catch (Exception e4) {
            if (!(typedInput == null || typedInput.mimeType() == null || !(typedInput.mimeType().contains("application/json") || typedInput.mimeType().contains("application/x-protobuf")))) {
                String str = (String) tVar.f52218q;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("urlpath", str);
                    jSONObject.put("errorDesc", e4.getMessage());
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
                C12290b.m22064a("parser_err", jSONObject);
                BufferedInputStream bufferedInputStream2 = null;
                try {
                    StringBuilder sb = new StringBuilder();
                    Context a2 = C17867d.m33078a();
                    if (C58016d.f132221b == null || !C58016d.f132224e) {
                        C58016d.f132221b = a2.getCacheDir();
                    }
                    File file = new File(sb.append(C58016d.f132221b.getAbsolutePath()).append(File.separator).append("parser").toString());
                    if (!file.exists()) {
                        file.mkdir();
                    } else {
                        File[] listFiles = file.listFiles();
                        if (listFiles != null && listFiles.length > 0) {
                            for (File file2 : listFiles) {
                                if (file2.isFile() && file2.exists() && file2.lastModified() + 86400000 < System.currentTimeMillis()) {
                                    m41508a(file2);
                                }
                            }
                        }
                    }
                    File[] listFiles2 = file.listFiles();
                    if (listFiles2 == null || listFiles2.length < 10) {
                        File file3 = new File(file + File.separator + str.hashCode() + "_" + System.currentTimeMillis() + "_" + Thread.currentThread().getId() + ".txt");
                        if (!file3.exists()) {
                            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file3));
                            try {
                                bufferedInputStream = new BufferedInputStream(typedInput.mo11577in());
                            } catch (FileNotFoundException e6) {
                                e = e6;
                                e.printStackTrace();
                                bufferedInputStream2.close();
                                bufferedOutputStream.close();
                                MethodCollector.m26664o(12013);
                                throw e4;
                            } catch (IOException e7) {
                                e2 = e7;
                                e2.printStackTrace();
                                bufferedInputStream2.close();
                                bufferedOutputStream.close();
                                MethodCollector.m26664o(12013);
                                throw e4;
                            } catch (Exception e8) {
                                e3 = e8;
                                try {
                                    e3.printStackTrace();
                                    bufferedInputStream2.close();
                                    bufferedOutputStream.close();
                                    MethodCollector.m26664o(12013);
                                    throw e4;
                                } catch (Throwable th2) {
                                    th = th2;
                                    try {
                                        bufferedInputStream2.close();
                                        bufferedOutputStream.close();
                                    } catch (Exception e9) {
                                        e9.printStackTrace();
                                    }
                                    MethodCollector.m26664o(12013);
                                    throw th;
                                }
                            }
                            try {
                                byte[] bArr = new byte[4096];
                                while (true) {
                                    int read = bufferedInputStream.read(bArr);
                                    if (read == -1) {
                                        break;
                                    }
                                    bufferedOutputStream.write(bArr, 0, read);
                                }
                                bufferedInputStream2 = bufferedInputStream;
                                bufferedInputStream2.close();
                                bufferedOutputStream.close();
                            } catch (FileNotFoundException e10) {
                                e = e10;
                                bufferedInputStream2 = bufferedInputStream;
                                e.printStackTrace();
                                bufferedInputStream2.close();
                                bufferedOutputStream.close();
                                MethodCollector.m26664o(12013);
                                throw e4;
                            } catch (IOException e11) {
                                e2 = e11;
                                bufferedInputStream2 = bufferedInputStream;
                                e2.printStackTrace();
                                bufferedInputStream2.close();
                                bufferedOutputStream.close();
                                MethodCollector.m26664o(12013);
                                throw e4;
                            } catch (Exception e12) {
                                e3 = e12;
                                bufferedInputStream2 = bufferedInputStream;
                                e3.printStackTrace();
                                bufferedInputStream2.close();
                                bufferedOutputStream.close();
                                MethodCollector.m26664o(12013);
                                throw e4;
                            } catch (Throwable th3) {
                                th = th3;
                                bufferedInputStream2 = bufferedInputStream;
                                bufferedInputStream2.close();
                                bufferedOutputStream.close();
                                MethodCollector.m26664o(12013);
                                throw th;
                            }
                        }
                    }
                    bufferedOutputStream = null;
                    try {
                        bufferedInputStream2.close();
                        bufferedOutputStream.close();
                    } catch (Exception e13) {
                        e13.printStackTrace();
                    }
                } catch (FileNotFoundException e14) {
                    e = e14;
                    bufferedOutputStream = null;
                    e.printStackTrace();
                    bufferedInputStream2.close();
                    bufferedOutputStream.close();
                    MethodCollector.m26664o(12013);
                    throw e4;
                } catch (IOException e15) {
                    e2 = e15;
                    bufferedOutputStream = null;
                    e2.printStackTrace();
                    bufferedInputStream2.close();
                    bufferedOutputStream.close();
                    MethodCollector.m26664o(12013);
                    throw e4;
                } catch (Exception e16) {
                    e3 = e16;
                    bufferedOutputStream = null;
                    e3.printStackTrace();
                    bufferedInputStream2.close();
                    bufferedOutputStream.close();
                    MethodCollector.m26664o(12013);
                    throw e4;
                } catch (Throwable th4) {
                    th = th4;
                    bufferedOutputStream = null;
                    bufferedInputStream2.close();
                    bufferedOutputStream.close();
                    MethodCollector.m26664o(12013);
                    throw th;
                }
            }
            MethodCollector.m26664o(12013);
            throw e4;
        }
    }
}
