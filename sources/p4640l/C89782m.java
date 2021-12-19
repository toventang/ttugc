package p4640l;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.C15346a;
import com.bytedance.p951d.p952a.p953a.p954a.p955a.C14420a;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import okhttp3.AbstractC90025ab;
import okhttp3.AbstractC90049e;
import okhttp3.C90029ac;
import okhttp3.C90200t;
import okhttp3.C90208y;
import p4640l.AbstractC89741c;
import p4640l.AbstractC89744e;
import p4640l.C89704a;
import p4640l.C89785n;
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

/* renamed from: l.m */
public final class C89782m {

    /* renamed from: a */
    public final AbstractC90049e.AbstractC90050a f203563a;

    /* renamed from: b */
    public final C90200t f203564b;

    /* renamed from: c */
    public final List<AbstractC89744e.AbstractC89745a> f203565c;

    /* renamed from: d */
    public final List<AbstractC89741c.AbstractC89742a> f203566d;

    /* renamed from: e */
    public final Executor f203567e;

    /* renamed from: f */
    final boolean f203568f;

    /* renamed from: g */
    private final Map<Method, C89785n<?, ?>> f203569g = new ConcurrentHashMap();

    static {
        Covode.recordClassIndex(105876);
    }

    /* renamed from: l.m$a */
    public static final class C89784a {

        /* renamed from: a */
        private final C89775j f203573a;

        /* renamed from: b */
        private AbstractC90049e.AbstractC90050a f203574b;

        /* renamed from: c */
        private C90200t f203575c;

        /* renamed from: d */
        private final List<AbstractC89744e.AbstractC89745a> f203576d;

        /* renamed from: e */
        private final List<AbstractC89741c.AbstractC89742a> f203577e;

        /* renamed from: f */
        private Executor f203578f;

        /* renamed from: g */
        private boolean f203579g;

        static {
            Covode.recordClassIndex(105878);
        }

        public C89784a() {
            this(C89775j.f203545a);
        }

        /* renamed from: a */
        public final C89782m mo144326a() {
            if (this.f203575c != null) {
                AbstractC90049e.AbstractC90050a aVar = this.f203574b;
                if (aVar == null) {
                    aVar = new C90208y();
                }
                Executor executor = this.f203578f;
                if (executor == null) {
                    executor = this.f203573a.mo144308a();
                }
                ArrayList arrayList = new ArrayList(this.f203577e);
                arrayList.add(this.f203573a.mo144309a(executor));
                return new C89782m(aVar, this.f203575c, new ArrayList(this.f203576d), arrayList, executor, this.f203579g);
            }
            throw new IllegalStateException("Base URL required.");
        }

        /* renamed from: a */
        private C89784a m155855a(AbstractC90049e.AbstractC90050a aVar) {
            this.f203574b = (AbstractC90049e.AbstractC90050a) C89787o.m155873a(aVar, "factory == null");
            return this;
        }

        private C89784a(C89775j jVar) {
            ArrayList arrayList = new ArrayList();
            this.f203576d = arrayList;
            this.f203577e = new ArrayList();
            this.f203573a = jVar;
            arrayList.add(new C89704a());
        }

        /* renamed from: a */
        public final C89784a mo144323a(String str) {
            C89787o.m155873a(str, "baseUrl == null");
            C90200t f = C90200t.m156802f(str);
            if (f != null) {
                return m155856a(f);
            }
            throw new IllegalArgumentException("Illegal URL: ".concat(String.valueOf(str)));
        }

        /* renamed from: a */
        private C89784a m155856a(C90200t tVar) {
            C89787o.m155873a(tVar, "baseUrl == null");
            List<String> list = tVar.f204863f;
            if ("".equals(list.get(list.size() - 1))) {
                this.f203575c = tVar;
                return this;
            }
            throw new IllegalArgumentException("baseUrl must end in /: ".concat(String.valueOf(tVar)));
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.List<l.e$a> */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public final C89784a mo144324a(AbstractC89744e.AbstractC89745a aVar) {
            this.f203576d.add(C89787o.m155873a(aVar, "factory == null"));
            return this;
        }

        /* renamed from: a */
        public final C89784a mo144325a(C90208y yVar) {
            return m155855a((AbstractC90049e.AbstractC90050a) C89787o.m155873a(yVar, "client == null"));
        }
    }

    /* renamed from: b */
    private void m155850b(Class<?> cls) {
        C89775j jVar = C89775j.f203545a;
        Method[] declaredMethods = cls.getDeclaredMethods();
        for (Method method : declaredMethods) {
            if (!jVar.mo144310a(method)) {
                mo144321a(method);
            }
        }
    }

    /* renamed from: a */
    public final <T> T mo144318a(final Class<T> cls) {
        C89787o.m155878a((Class) cls);
        if (this.f203568f) {
            m155850b(cls);
        }
        return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new InvocationHandler() {
            /* class p4640l.C89782m.C897831 */

            /* renamed from: c */
            private final C89775j f203572c = C89775j.f203545a;

            static {
                Covode.recordClassIndex(105877);
            }

            @Override // java.lang.reflect.InvocationHandler
            public final Object invoke(Object obj, Method method, Object[] objArr) {
                if (method.getDeclaringClass() == Object.class) {
                    Pair<Boolean, Object> a = C15346a.m28238a(method, new Object[]{this, objArr}, 110000, "java.lang.Object", true, "retrofit2_Retrofit$1_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                    if (((Boolean) a.first).booleanValue()) {
                        return a.second;
                    }
                    Object invoke = method.invoke(this, objArr);
                    C15346a.m28242a(invoke, method, new Object[]{this, objArr}, "retrofit2_Retrofit$1_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                    return invoke;
                } else if (this.f203572c.mo144310a(method)) {
                    return this.f203572c.mo144307a(method, cls, obj, objArr);
                } else {
                    C89785n<?, ?> a2 = C89782m.this.mo144321a(method);
                    return a2.f203583d.mo144296a(new C89754h(a2, objArr));
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C89785n<?, ?> mo144321a(Method method) {
        C89785n<?, ?> nVar;
        MethodCollector.m26663i(11513);
        C89785n<?, ?> nVar2 = this.f203569g.get(method);
        if (nVar2 != null) {
            MethodCollector.m26664o(11513);
            return nVar2;
        }
        synchronized (this.f203569g) {
            try {
                nVar = this.f203569g.get(method);
                if (nVar == null) {
                    C89785n.C89786a aVar = new C89785n.C89786a(this, method);
                    aVar.f203616w = aVar.mo144330a();
                    aVar.f203599f = aVar.f203616w.mo144297a();
                    if (aVar.f203599f == C89781l.class || aVar.f203599f == C90029ac.class) {
                        RuntimeException a = aVar.mo144329a((Throwable) null, "'" + C89787o.m155872a(aVar.f203599f).getName() + "' is not a valid response body type. Did you mean ResponseBody?", new Object[0]);
                        MethodCollector.m26664o(11513);
                        throw a;
                    }
                    aVar.f203615v = aVar.mo144334b();
                    Annotation[] annotationArr = aVar.f203596c;
                    for (Annotation annotation : annotationArr) {
                        if (annotation instanceof AbstractC89718b) {
                            aVar.mo144333a(C14420a.f34884d, ((AbstractC89718b) annotation).mo144272a(), false);
                        } else if (annotation instanceof AbstractC89722f) {
                            aVar.mo144333a("GET", ((AbstractC89722f) annotation).mo144276a(), false);
                        } else if (annotation instanceof AbstractC89723g) {
                            aVar.mo144333a("HEAD", ((AbstractC89723g) annotation).mo144277a(), false);
                            if (!Void.class.equals(aVar.f203599f)) {
                                RuntimeException a2 = aVar.mo144329a((Throwable) null, "HEAD method must use Void as response type.", new Object[0]);
                                MethodCollector.m26664o(11513);
                                throw a2;
                            }
                        } else if (annotation instanceof AbstractC89730n) {
                            aVar.mo144333a("PATCH", ((AbstractC89730n) annotation).mo144284a(), true);
                        } else if (annotation instanceof AbstractC89731o) {
                            aVar.mo144333a("POST", ((AbstractC89731o) annotation).mo144285a(), true);
                        } else if (annotation instanceof AbstractC89732p) {
                            aVar.mo144333a(C14420a.f34883c, ((AbstractC89732p) annotation).mo144286a(), true);
                        } else if (annotation instanceof AbstractC89729m) {
                            aVar.mo144333a(C14420a.f34885e, ((AbstractC89729m) annotation).mo144283a(), false);
                        } else if (annotation instanceof AbstractC89724h) {
                            AbstractC89724h hVar = (AbstractC89724h) annotation;
                            aVar.mo144333a(hVar.mo144278a(), hVar.mo144279b(), hVar.mo144280c());
                        } else if (annotation instanceof AbstractC89727k) {
                            String[] a3 = ((AbstractC89727k) annotation).mo144282a();
                            if (a3.length != 0) {
                                aVar.f203611r = aVar.mo144332a(a3);
                            } else {
                                RuntimeException a4 = aVar.mo144329a((Throwable) null, "@Headers annotation is empty.", new Object[0]);
                                MethodCollector.m26664o(11513);
                                throw a4;
                            }
                        } else if (annotation instanceof AbstractC89728l) {
                            if (!aVar.f203608o) {
                                aVar.f203609p = true;
                            } else {
                                RuntimeException a5 = aVar.mo144329a((Throwable) null, "Only one encoding annotation is allowed.", new Object[0]);
                                MethodCollector.m26664o(11513);
                                throw a5;
                            }
                        } else if (!(annotation instanceof AbstractC89721e)) {
                            continue;
                        } else if (!aVar.f203609p) {
                            aVar.f203608o = true;
                        } else {
                            RuntimeException a6 = aVar.mo144329a((Throwable) null, "Only one encoding annotation is allowed.", new Object[0]);
                            MethodCollector.m26664o(11513);
                            throw a6;
                        }
                    }
                    if (aVar.f203606m != null) {
                        if (!aVar.f203607n) {
                            if (aVar.f203609p) {
                                RuntimeException a7 = aVar.mo144329a((Throwable) null, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                                MethodCollector.m26664o(11513);
                                throw a7;
                            } else if (aVar.f203608o) {
                                RuntimeException a8 = aVar.mo144329a((Throwable) null, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                                MethodCollector.m26664o(11513);
                                throw a8;
                            }
                        }
                        int length = aVar.f203597d.length;
                        aVar.f203614u = new AbstractC89759i[length];
                        for (int i = 0; i < length; i++) {
                            Type type = aVar.f203598e[i];
                            if (!C89787o.m155883d(type)) {
                                Annotation[] annotationArr2 = aVar.f203597d[i];
                                if (annotationArr2 != null) {
                                    aVar.f203614u[i] = aVar.mo144331a(i, type, annotationArr2);
                                } else {
                                    RuntimeException a9 = aVar.mo144328a(i, "No Retrofit annotation found.", new Object[0]);
                                    MethodCollector.m26664o(11513);
                                    throw a9;
                                }
                            } else {
                                RuntimeException a10 = aVar.mo144328a(i, "Parameter type must not include a type variable or wildcard: %s", type);
                                MethodCollector.m26664o(11513);
                                throw a10;
                            }
                        }
                        if (aVar.f203610q == null && !aVar.f203605l) {
                            RuntimeException a11 = aVar.mo144329a((Throwable) null, "Missing either @%s URL or @Url parameter.", aVar.f203606m);
                            MethodCollector.m26664o(11513);
                            throw a11;
                        } else if (!aVar.f203608o && !aVar.f203609p && !aVar.f203607n && aVar.f203602i) {
                            RuntimeException a12 = aVar.mo144329a((Throwable) null, "Non-body HTTP method cannot contain @Body.", new Object[0]);
                            MethodCollector.m26664o(11513);
                            throw a12;
                        } else if (aVar.f203608o && !aVar.f203600g) {
                            RuntimeException a13 = aVar.mo144329a((Throwable) null, "Form-encoded method must contain at least one @Field.", new Object[0]);
                            MethodCollector.m26664o(11513);
                            throw a13;
                        } else if (!aVar.f203609p || aVar.f203601h) {
                            nVar = new C89785n<>(aVar);
                            this.f203569g.put(method, nVar);
                        } else {
                            RuntimeException a14 = aVar.mo144329a((Throwable) null, "Multipart method must contain at least one @Part.", new Object[0]);
                            MethodCollector.m26664o(11513);
                            throw a14;
                        }
                    } else {
                        RuntimeException a15 = aVar.mo144329a((Throwable) null, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
                        MethodCollector.m26664o(11513);
                        throw a15;
                    }
                }
            } finally {
                MethodCollector.m26664o(11513);
            }
        }
        return nVar;
    }

    /* renamed from: a */
    public final <T> AbstractC89744e<T, String> mo144319a(Type type, Annotation[] annotationArr) {
        C89787o.m155873a(type, "type == null");
        C89787o.m155873a(annotationArr, "annotations == null");
        int size = this.f203565c.size();
        for (int i = 0; i < size; i++) {
            this.f203565c.get(i);
        }
        return C89704a.C89708d.f203480a;
    }

    /* renamed from: a */
    public final <T> AbstractC89744e<T, AbstractC90025ab> mo144320a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        C89787o.m155873a(type, "type == null");
        C89787o.m155873a(annotationArr, "parameterAnnotations == null");
        C89787o.m155873a(annotationArr2, "methodAnnotations == null");
        int indexOf = this.f203565c.indexOf(null) + 1;
        int size = this.f203565c.size();
        for (int i = indexOf; i < size; i++) {
            AbstractC89744e<T, AbstractC90025ab> eVar = (AbstractC89744e<T, AbstractC90025ab>) this.f203565c.get(i).mo144264a(type);
            if (eVar != null) {
                return eVar;
            }
        }
        StringBuilder append = new StringBuilder("Could not locate RequestBody converter for ").append(type).append(".\n");
        append.append("  Tried:");
        int size2 = this.f203565c.size();
        while (indexOf < size2) {
            append.append("\n   * ").append(this.f203565c.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(append.toString());
    }

    C89782m(AbstractC90049e.AbstractC90050a aVar, C90200t tVar, List<AbstractC89744e.AbstractC89745a> list, List<AbstractC89741c.AbstractC89742a> list2, Executor executor, boolean z) {
        this.f203563a = aVar;
        this.f203564b = tVar;
        this.f203565c = Collections.unmodifiableList(list);
        this.f203566d = Collections.unmodifiableList(list2);
        this.f203567e = executor;
        this.f203568f = z;
    }
}
