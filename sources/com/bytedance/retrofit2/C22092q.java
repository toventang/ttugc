package com.bytedance.retrofit2;

import android.os.SystemClock;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.C15346a;
import com.bytedance.p951d.p952a.p953a.p954a.p955a.C14420a;
import com.bytedance.retrofit2.AbstractC22019c;
import com.bytedance.retrofit2.AbstractC22043e;
import com.bytedance.retrofit2.C21972a;
import com.bytedance.retrofit2.C22097t;
import com.bytedance.retrofit2.client.AbstractC22025a;
import com.bytedance.retrofit2.client.C22027b;
import com.bytedance.retrofit2.client.C22028c;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.p1609a.AbstractC21982a;
import com.bytedance.retrofit2.p1610b.AbstractC21989ac;
import com.bytedance.retrofit2.p1610b.AbstractC21990ad;
import com.bytedance.retrofit2.p1610b.AbstractC21991ae;
import com.bytedance.retrofit2.p1610b.AbstractC21995c;
import com.bytedance.retrofit2.p1610b.AbstractC21999g;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22001i;
import com.bytedance.retrofit2.p1610b.AbstractC22002j;
import com.bytedance.retrofit2.p1610b.AbstractC22006n;
import com.bytedance.retrofit2.p1610b.AbstractC22009q;
import com.bytedance.retrofit2.p1610b.AbstractC22010r;
import com.bytedance.retrofit2.p1610b.AbstractC22011s;
import com.bytedance.retrofit2.p1610b.AbstractC22012t;
import com.bytedance.retrofit2.p1610b.AbstractC22013u;
import com.bytedance.retrofit2.p1610b.AbstractC22017y;
import com.bytedance.retrofit2.p1612c.AbstractC22021a;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import p4640l.p4644b.AbstractC89718b;
import p4640l.p4644b.AbstractC89721e;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89723g;
import p4640l.p4644b.AbstractC89724h;
import p4640l.p4644b.AbstractC89727k;
import p4640l.p4644b.AbstractC89728l;
import p4640l.p4644b.AbstractC89729m;
import p4640l.p4644b.AbstractC89730n;
import p4640l.p4644b.AbstractC89731o;
import p4640l.p4644b.AbstractC89732p;
import p4640l.p4644b.AbstractC89739w;

/* renamed from: com.bytedance.retrofit2.q */
public final class C22092q {

    /* renamed from: h */
    public static volatile CopyOnWriteArrayList<AbstractC22021a> f52133h;

    /* renamed from: a */
    public final AbstractC22025a.AbstractC22026a f52134a;

    /* renamed from: b */
    public final AbstractC22047g f52135b;

    /* renamed from: c */
    public final List<AbstractC22043e.AbstractC22044a> f52136c;

    /* renamed from: d */
    public final List<AbstractC22019c.AbstractC22020a> f52137d;

    /* renamed from: e */
    public final Executor f52138e;

    /* renamed from: f */
    public final Executor f52139f;

    /* renamed from: g */
    public final List<AbstractC22021a> f52140g;

    /* renamed from: i */
    public final AbstractC21982a f52141i;

    /* renamed from: j */
    private final Map<Method, C22097t> f52142j;

    /* renamed from: k */
    private final boolean f52143k;

    static {
        Covode.recordClassIndex(25792);
    }

    /* renamed from: com.bytedance.retrofit2.q$a */
    public static final class C22094a {

        /* renamed from: a */
        public AbstractC21982a f52147a;

        /* renamed from: b */
        private C22087p f52148b;

        /* renamed from: c */
        private AbstractC22025a.AbstractC22026a f52149c;

        /* renamed from: d */
        private AbstractC22047g f52150d;

        /* renamed from: e */
        private List<AbstractC22021a> f52151e;

        /* renamed from: f */
        private List<AbstractC22043e.AbstractC22044a> f52152f;

        /* renamed from: g */
        private List<AbstractC22019c.AbstractC22020a> f52153g;

        /* renamed from: h */
        private Executor f52154h;

        /* renamed from: i */
        private Executor f52155i;

        /* renamed from: j */
        private boolean f52156j;

        static {
            Covode.recordClassIndex(25794);
        }

        public C22094a() {
            this(C22087p.f52128a);
        }

        /* renamed from: a */
        public final C22092q mo35894a() {
            if (this.f52150d == null) {
                throw new IllegalStateException("Endpoint may not be null.");
            } else if (this.f52149c == null) {
                throw new IllegalStateException("ClientProvider may not be null.");
            } else if (this.f52154h != null) {
                Executor executor = this.f52155i;
                if (executor == null) {
                    executor = this.f52148b.mo35877a();
                }
                ArrayList arrayList = new ArrayList(this.f52153g);
                arrayList.add(this.f52148b.mo35876a(executor));
                ArrayList arrayList2 = new ArrayList(this.f52152f);
                if (C22092q.f52133h != null) {
                    Iterator<AbstractC22021a> it = C22092q.f52133h.iterator();
                    while (it.hasNext()) {
                        AbstractC22021a next = it.next();
                        if (!this.f52151e.contains(next)) {
                            this.f52151e.add(next);
                        }
                    }
                }
                return new C22092q(this.f52150d, this.f52149c, this.f52151e, arrayList2, arrayList, this.f52154h, executor, this.f52156j);
            } else {
                throw new IllegalStateException("HttpExecutor may not be null.");
            }
        }

        /* renamed from: b */
        private C22094a m41490b(AbstractC22025a.AbstractC22026a aVar) {
            this.f52149c = (AbstractC22025a.AbstractC22026a) C22101w.m41535a(aVar, "provider == null");
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.List<com.bytedance.retrofit2.c$a> */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public final C22094a mo35888a(AbstractC22019c.AbstractC22020a aVar) {
            this.f52153g.add(C22101w.m41535a(aVar, "factory == null"));
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: java.util.List<com.bytedance.retrofit2.c.a> */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public final C22094a mo35889a(AbstractC22021a aVar) {
            this.f52151e.add(C22101w.m41535a(aVar, "interceptor == null"));
            return this;
        }

        private C22094a(C22087p pVar) {
            this.f52151e = new CopyOnWriteArrayList();
            this.f52152f = new ArrayList();
            this.f52153g = new ArrayList();
            this.f52148b = pVar;
            this.f52152f.add(new C21972a());
        }

        /* renamed from: a */
        public final C22094a mo35890a(AbstractC22025a.AbstractC22026a aVar) {
            return m41490b((AbstractC22025a.AbstractC22026a) C22101w.m41535a(aVar, "provider == null"));
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.List<com.bytedance.retrofit2.e$a> */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public final C22094a mo35891a(AbstractC22043e.AbstractC22044a aVar) {
            this.f52152f.add(C22101w.m41535a(aVar, "factory == null"));
            return this;
        }

        /* renamed from: a */
        public final C22094a mo35892a(String str) {
            if (str == null || str.trim().length() == 0) {
                throw new NullPointerException("Endpoint may not be blank.");
            }
            this.f52150d = C22048h.m41433a(str);
            return this;
        }

        /* renamed from: a */
        public final C22094a mo35893a(Executor executor) {
            this.f52154h = (Executor) C22101w.m41535a(executor, "httpExecutor == null");
            return this;
        }
    }

    /* renamed from: b */
    private void m41482b(Class<?> cls) {
        for (Method method : cls.getDeclaredMethods()) {
            mo35883a(method);
        }
    }

    /* renamed from: a */
    public final <T> T mo35884a(final Class<T> cls) {
        C22101w.m41539a((Class) cls);
        if (this.f52143k) {
            m41482b(cls);
        }
        return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new InvocationHandler() {
            /* class com.bytedance.retrofit2.C22092q.C220931 */

            /* renamed from: c */
            private final C22087p f52146c = C22087p.f52128a;

            static {
                Covode.recordClassIndex(25793);
            }

            @Override // java.lang.reflect.InvocationHandler
            public final Object invoke(Object obj, Method method, Object... objArr) {
                C22096s sVar = new C22096s();
                sVar.f52179f = System.currentTimeMillis();
                if (method.getDeclaringClass() == Object.class) {
                    Pair<Boolean, Object> a = C15346a.m28238a(method, new Object[]{this, objArr}, 110000, "java.lang.Object", true, "com_bytedance_retrofit2_Retrofit$1_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                    if (((Boolean) a.first).booleanValue()) {
                        return a.second;
                    }
                    Object invoke = method.invoke(this, objArr);
                    C15346a.m28242a(invoke, method, new Object[]{this, objArr}, "com_bytedance_retrofit2_Retrofit$1_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                    return invoke;
                }
                sVar.f52185l = SystemClock.uptimeMillis();
                C22097t a2 = C22092q.this.mo35883a(method);
                sVar.f52186m = SystemClock.uptimeMillis();
                a2.f52217p = sVar;
                return a2.f52205d.mo11590a(new SsHttpCall(a2, objArr));
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C22097t mo35883a(Method method) {
        C22097t tVar;
        MethodCollector.m26663i(12158);
        C22097t tVar2 = this.f52142j.get(method);
        if (tVar2 != null) {
            MethodCollector.m26664o(12158);
            return tVar2;
        }
        synchronized (this.f52142j) {
            try {
                tVar = this.f52142j.get(method);
                if (tVar == null) {
                    C22097t.C22098a aVar = new C22097t.C22098a(this, method);
                    aVar.f52234G = aVar.mo35897a();
                    aVar.f52248n = aVar.f52234G.mo11591a();
                    if (aVar.f52248n != C22028c.class) {
                        aVar.f52233F = aVar.mo35903b();
                        Annotation[] annotationArr = aVar.f52237c;
                        for (Annotation annotation : annotationArr) {
                            if (annotation instanceof AbstractC21995c) {
                                aVar.mo35902a(C14420a.f34884d, ((AbstractC21995c) annotation).mo35785a(), false);
                            } else if (annotation instanceof AbstractC22000h) {
                                aVar.mo35902a("GET", ((AbstractC22000h) annotation).mo35789a(), false);
                            } else if (annotation instanceof AbstractC22001i) {
                                aVar.mo35902a("HEAD", ((AbstractC22001i) annotation).mo35790a(), false);
                                if (!Void.class.equals(aVar.f52248n)) {
                                    RuntimeException a = aVar.mo35900a((Throwable) null, "HEAD method must use Void as response type.", new Object[0]);
                                    MethodCollector.m26664o(12158);
                                    throw a;
                                }
                            } else if (annotation instanceof AbstractC22011s) {
                                aVar.mo35902a("PATCH", ((AbstractC22011s) annotation).mo35798a(), true);
                            } else if (annotation instanceof AbstractC22012t) {
                                aVar.mo35902a("POST", ((AbstractC22012t) annotation).mo35799a(), true);
                            } else if (annotation instanceof AbstractC22013u) {
                                aVar.mo35902a(C14420a.f34883c, ((AbstractC22013u) annotation).mo35800a(), true);
                            } else if (annotation instanceof AbstractC22010r) {
                                aVar.mo35902a(C14420a.f34885e, ((AbstractC22010r) annotation).mo35797a(), false);
                            } else if (annotation instanceof AbstractC22002j) {
                                AbstractC22002j jVar = (AbstractC22002j) annotation;
                                aVar.mo35902a(jVar.mo35791a(), jVar.mo35792b(), jVar.mo35793c());
                            } else if (annotation instanceof AbstractC22006n) {
                                String[] a2 = ((AbstractC22006n) annotation).mo35795a();
                                if (a2.length != 0) {
                                    aVar.f52228A = aVar.mo35901a(a2);
                                } else {
                                    RuntimeException a3 = aVar.mo35900a((Throwable) null, "@Headers annotation is empty.", new Object[0]);
                                    MethodCollector.m26664o(12158);
                                    throw a3;
                                }
                            } else if (annotation instanceof AbstractC22009q) {
                                if (!aVar.f52258x) {
                                    aVar.f52259y = true;
                                } else {
                                    RuntimeException a4 = aVar.mo35900a((Throwable) null, "Only one encoding annotation is allowed.", new Object[0]);
                                    MethodCollector.m26664o(12158);
                                    throw a4;
                                }
                            } else if (annotation instanceof AbstractC21999g) {
                                if (!aVar.f52259y) {
                                    aVar.f52258x = true;
                                } else {
                                    RuntimeException a5 = aVar.mo35900a((Throwable) null, "Only one encoding annotation is allowed.", new Object[0]);
                                    MethodCollector.m26664o(12158);
                                    throw a5;
                                }
                            } else if (annotation instanceof AbstractC21991ae) {
                                aVar.f52242h = true;
                            } else if (annotation instanceof AbstractC22017y) {
                                aVar.f52240f = ((AbstractC22017y) annotation).mo35806a();
                            } else if (annotation instanceof AbstractC21990ad) {
                                aVar.f52241g = ((AbstractC21990ad) annotation).mo35784a();
                            } else if (annotation instanceof AbstractC21989ac) {
                                aVar.f52247m = ((AbstractC21989ac) annotation).mo35783a();
                            }
                            if (C22087p.f52129b) {
                                if (annotation instanceof AbstractC89718b) {
                                    aVar.mo35902a(C14420a.f34884d, ((AbstractC89718b) annotation).mo144272a(), false);
                                } else if (annotation instanceof AbstractC89722f) {
                                    aVar.mo35902a("GET", ((AbstractC89722f) annotation).mo144276a(), false);
                                } else if (annotation instanceof AbstractC89723g) {
                                    aVar.mo35902a("HEAD", ((AbstractC89723g) annotation).mo144277a(), false);
                                    if (!Void.class.equals(aVar.f52248n)) {
                                        RuntimeException a6 = aVar.mo35900a((Throwable) null, "HEAD method must use Void as response type.", new Object[0]);
                                        MethodCollector.m26664o(12158);
                                        throw a6;
                                    }
                                } else if (annotation instanceof AbstractC89730n) {
                                    aVar.mo35902a("PATCH", ((AbstractC89730n) annotation).mo144284a(), true);
                                } else if (annotation instanceof AbstractC89731o) {
                                    aVar.mo35902a("POST", ((AbstractC89731o) annotation).mo144285a(), true);
                                } else if (annotation instanceof AbstractC89732p) {
                                    aVar.mo35902a(C14420a.f34883c, ((AbstractC89732p) annotation).mo144286a(), true);
                                } else if (annotation instanceof AbstractC89729m) {
                                    aVar.mo35902a(C14420a.f34885e, ((AbstractC89729m) annotation).mo144283a(), false);
                                } else if (annotation instanceof AbstractC89724h) {
                                    AbstractC89724h hVar = (AbstractC89724h) annotation;
                                    aVar.mo35902a(hVar.mo144278a(), hVar.mo144279b(), hVar.mo144280c());
                                } else if (annotation instanceof AbstractC89727k) {
                                    String[] a7 = ((AbstractC89727k) annotation).mo144282a();
                                    if (a7.length != 0) {
                                        aVar.f52228A = aVar.mo35901a(a7);
                                    } else {
                                        RuntimeException a8 = aVar.mo35900a((Throwable) null, "@Headers annotation is empty.", new Object[0]);
                                        MethodCollector.m26664o(12158);
                                        throw a8;
                                    }
                                } else if (annotation instanceof AbstractC89728l) {
                                    if (!aVar.f52258x) {
                                        aVar.f52259y = true;
                                    } else {
                                        RuntimeException a9 = aVar.mo35900a((Throwable) null, "Only one encoding annotation is allowed.", new Object[0]);
                                        MethodCollector.m26664o(12158);
                                        throw a9;
                                    }
                                } else if (annotation instanceof AbstractC89721e) {
                                    if (!aVar.f52259y) {
                                        aVar.f52258x = true;
                                    } else {
                                        RuntimeException a10 = aVar.mo35900a((Throwable) null, "Only one encoding annotation is allowed.", new Object[0]);
                                        MethodCollector.m26664o(12158);
                                        throw a10;
                                    }
                                } else if (annotation instanceof AbstractC89739w) {
                                    aVar.f52242h = true;
                                }
                            }
                        }
                        if (aVar.f52256v != null) {
                            if (!aVar.f52257w && !aVar.f52245k) {
                                if (aVar.f52259y) {
                                    RuntimeException a11 = aVar.mo35900a((Throwable) null, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                                    MethodCollector.m26664o(12158);
                                    throw a11;
                                } else if (aVar.f52258x) {
                                    RuntimeException a12 = aVar.mo35900a((Throwable) null, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                                    MethodCollector.m26664o(12158);
                                    throw a12;
                                }
                            }
                            int length = aVar.f52238d.length;
                            aVar.f52232E = new AbstractC22061o[length];
                            for (int i = 0; i < length; i++) {
                                Type type = aVar.f52239e[i];
                                if (!C22101w.m41546d(type)) {
                                    Annotation[] annotationArr2 = aVar.f52238d[i];
                                    if (annotationArr2 != null) {
                                        aVar.f52232E[i] = aVar.mo35898a(i, type, annotationArr2);
                                    } else {
                                        RuntimeException a13 = aVar.mo35899a(i, "No Retrofit annotation found.", new Object[0]);
                                        MethodCollector.m26664o(12158);
                                        throw a13;
                                    }
                                } else {
                                    RuntimeException a14 = aVar.mo35899a(i, "Parameter type must not include a type variable or wildcard: %s", type);
                                    MethodCollector.m26664o(12158);
                                    throw a14;
                                }
                            }
                            if (aVar.f52260z == null && !aVar.f52254t) {
                                RuntimeException a15 = aVar.mo35900a((Throwable) null, "Missing either @%s URL or @Url parameter.", aVar.f52256v);
                                MethodCollector.m26664o(12158);
                                throw a15;
                            } else if (!aVar.f52258x && !aVar.f52259y && !aVar.f52257w && !aVar.f52245k && aVar.f52251q) {
                                RuntimeException a16 = aVar.mo35900a((Throwable) null, "Non-body HTTP method cannot contain @Body.", new Object[0]);
                                MethodCollector.m26664o(12158);
                                throw a16;
                            } else if (aVar.f52258x && !aVar.f52249o) {
                                RuntimeException a17 = aVar.mo35900a((Throwable) null, "Form-encode method must contain at least one @Field.", new Object[0]);
                                MethodCollector.m26664o(12158);
                                throw a17;
                            } else if (!aVar.f52259y || aVar.f52250p) {
                                tVar = new C22097t(aVar);
                                this.f52142j.put(method, tVar);
                            } else {
                                RuntimeException a18 = aVar.mo35900a((Throwable) null, "Multipart method must contain at least one @Part.", new Object[0]);
                                MethodCollector.m26664o(12158);
                                throw a18;
                            }
                        } else {
                            RuntimeException a19 = aVar.mo35900a((Throwable) null, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
                            MethodCollector.m26664o(12158);
                            throw a19;
                        }
                    } else {
                        RuntimeException a20 = aVar.mo35900a((Throwable) null, "'" + C22101w.m41534a(aVar.f52248n).getName() + "' is not a valid response body type.", new Object[0]);
                        MethodCollector.m26664o(12158);
                        throw a20;
                    }
                }
            } finally {
                MethodCollector.m26664o(12158);
            }
        }
        return tVar;
    }

    /* renamed from: a */
    public final <T> AbstractC22043e<T, Object> mo35881a(Type type, Annotation[] annotationArr) {
        C22101w.m41535a(type, "type == null");
        C22101w.m41535a(annotationArr, "annotations == null");
        int size = this.f52136c.size();
        for (int i = 0; i < size; i++) {
            AbstractC22043e<T, Object> eVar = (AbstractC22043e<T, Object>) this.f52136c.get(i).mo35775a(type);
            if (eVar != null) {
                return eVar;
            }
        }
        throw new IllegalArgumentException("Could not locate object converter");
    }

    /* renamed from: b */
    public final <T> AbstractC22043e<T, String> mo35885b(Type type, Annotation[] annotationArr) {
        C22101w.m41535a(type, "type == null");
        C22101w.m41535a(annotationArr, "annotations == null");
        int size = this.f52136c.size();
        for (int i = 0; i < size; i++) {
            AbstractC22043e<T, String> eVar = (AbstractC22043e<T, String>) this.f52136c.get(i).mo35776b(type);
            if (eVar != null) {
                return eVar;
            }
        }
        return C21972a.C21980h.f52015a;
    }

    /* renamed from: c */
    public final <T> AbstractC22043e<T, C22027b> mo35886c(Type type, Annotation[] annotationArr) {
        C22101w.m41535a(type, "type == null");
        C22101w.m41535a(annotationArr, "annotations == null");
        int size = this.f52136c.size();
        for (int i = 0; i < size; i++) {
            AbstractC22043e<T, C22027b> eVar = (AbstractC22043e<T, C22027b>) this.f52136c.get(i).mo35777c(type);
            if (eVar != null) {
                return eVar;
            }
        }
        throw new IllegalArgumentException("Could not locate header converter");
    }

    /* renamed from: a */
    public final <T> AbstractC22043e<T, TypedOutput> mo35882a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        return m41481b(type, annotationArr, annotationArr2);
    }

    /* renamed from: b */
    private <T> AbstractC22043e<T, TypedOutput> m41481b(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        C22101w.m41535a(type, "type == null");
        C22101w.m41535a(annotationArr, "parameterAnnotations == null");
        C22101w.m41535a(annotationArr2, "methodAnnotations == null");
        int indexOf = this.f52136c.indexOf(null) + 1;
        int size = this.f52136c.size();
        for (int i = indexOf; i < size; i++) {
            AbstractC22043e<T, TypedOutput> eVar = (AbstractC22043e<T, TypedOutput>) this.f52136c.get(i).mo11575a(type, annotationArr, annotationArr2, this);
            if (eVar != null) {
                return eVar;
            }
        }
        StringBuilder append = new StringBuilder("Could not locate RequestBody converter for ").append(type).append(".\n");
        append.append("  Tried:");
        int size2 = this.f52136c.size();
        while (indexOf < size2) {
            append.append("\n   * ").append(this.f52136c.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(append.toString());
    }

    /* renamed from: a */
    public final AbstractC22019c<?> mo35880a(AbstractC22019c.AbstractC22020a aVar, Type type, Annotation[] annotationArr) {
        C22101w.m41535a(type, "returnType == null");
        C22101w.m41535a(annotationArr, "annotations == null");
        int indexOf = this.f52137d.indexOf(aVar) + 1;
        int size = this.f52137d.size();
        for (int i = indexOf; i < size; i++) {
            AbstractC22019c<?> a = this.f52137d.get(i).mo11589a(type, annotationArr, this);
            if (a != null) {
                return a;
            }
        }
        StringBuilder append = new StringBuilder("Could not locate call adapter for ").append(type).append(".\n");
        if (aVar != null) {
            append.append("  Skipped:");
            for (int i2 = 0; i2 < indexOf; i2++) {
                append.append("\n   * ").append(this.f52137d.get(i2).getClass().getName());
            }
            append.append('\n');
        }
        append.append("  Tried:");
        int size2 = this.f52137d.size();
        while (indexOf < size2) {
            append.append("\n   * ").append(this.f52137d.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(append.toString());
    }

    C22092q(AbstractC22047g gVar, AbstractC22025a.AbstractC22026a aVar, List<AbstractC22021a> list, List<AbstractC22043e.AbstractC22044a> list2, List<AbstractC22019c.AbstractC22020a> list3, Executor executor, Executor executor2, boolean z) {
        this(gVar, aVar, list, list2, list3, executor, executor2, z, (byte) 0);
    }

    private C22092q(AbstractC22047g gVar, AbstractC22025a.AbstractC22026a aVar, List<AbstractC22021a> list, List<AbstractC22043e.AbstractC22044a> list2, List<AbstractC22019c.AbstractC22020a> list3, Executor executor, Executor executor2, boolean z, byte b) {
        this.f52142j = new ConcurrentHashMap();
        this.f52135b = gVar;
        this.f52134a = aVar;
        this.f52140g = list;
        this.f52136c = Collections.unmodifiableList(list2);
        this.f52137d = Collections.unmodifiableList(list3);
        this.f52139f = executor;
        this.f52138e = executor2;
        this.f52143k = z;
        this.f52141i = null;
    }
}
