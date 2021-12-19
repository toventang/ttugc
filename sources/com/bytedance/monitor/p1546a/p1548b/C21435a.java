package com.bytedance.monitor.p1546a.p1548b;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.C15346a;
import com.bytedance.monitor.p1546a.p1548b.AbstractC21450d;
import com.bytedance.monitor.p1546a.p1548b.p1549a.AbstractC21446c;
import com.bytedance.monitor.p1546a.p1548b.p1549a.C21443b;
import com.bytedance.monitor.p1546a.p1548b.p1549a.ThreadFactoryC21440a;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: com.bytedance.monitor.a.b.a */
public final class C21435a implements AbstractC21450d {

    /* renamed from: b */
    private static final Object f50822b = new Object();

    /* renamed from: a */
    public Map<EnumC21447b, Long> f50823a = new ConcurrentHashMap(3);

    /* renamed from: c */
    private volatile C21443b f50824c;

    /* renamed from: d */
    private volatile C21443b f50825d;

    /* renamed from: e */
    private volatile C21443b f50826e;

    /* renamed from: f */
    private AbstractC21453f f50827f;

    /* renamed from: g */
    private AbstractC21450d.AbstractC21451a f50828g;

    @Override // com.bytedance.monitor.p1546a.p1548b.AbstractC21450d
    /* renamed from: b */
    public final AbstractC21453f mo35039b() {
        return this.f50827f;
    }

    @Override // com.bytedance.monitor.p1546a.p1548b.AbstractC21450d
    /* renamed from: a */
    public final ExecutorService mo35032a() {
        return m40244d();
    }

    /* renamed from: com.bytedance.monitor.a.b.a$a */
    public static final class C21439a {

        /* renamed from: a */
        public static final C21435a f50832a = new C21435a();

        static {
            Covode.recordClassIndex(25062);
        }
    }

    static {
        Covode.recordClassIndex(25058);
    }

    /* renamed from: c */
    private C21443b m40242c() {
        if (this.f50825d == null) {
            Object obj = f50822b;
            synchronized (obj) {
                if (this.f50825d == null) {
                    AbstractC21453f fVar = this.f50827f;
                    synchronized (obj) {
                        if (this.f50825d == null) {
                            ThreadFactoryC21440a aVar = new ThreadFactoryC21440a("light-weight-task");
                            aVar.f50834b = fVar;
                            aVar.f50835c = new ThreadFactoryC21440a.AbstractC21442a() {
                                /* class com.bytedance.monitor.p1546a.p1548b.C21435a.C214372 */

                                static {
                                    Covode.recordClassIndex(25060);
                                }

                                @Override // com.bytedance.monitor.p1546a.p1548b.p1549a.ThreadFactoryC21440a.AbstractC21442a
                                /* renamed from: a */
                                public final void mo35041a(long j) {
                                    C21435a.this.f50823a.put(EnumC21447b.LIGHT_WEIGHT, Long.valueOf(j));
                                }
                            };
                            C21443b bVar = new C21443b(aVar);
                            bVar.f50840b = fVar;
                            this.f50825d = bVar;
                        }
                    }
                }
            }
        }
        return this.f50825d;
    }

    /* renamed from: d */
    private C21443b m40244d() {
        if (this.f50824c == null) {
            Object obj = f50822b;
            synchronized (obj) {
                if (this.f50824c == null) {
                    AbstractC21453f fVar = this.f50827f;
                    synchronized (obj) {
                        if (this.f50824c == null) {
                            ThreadFactoryC21440a aVar = new ThreadFactoryC21440a("io-task");
                            aVar.f50834b = fVar;
                            aVar.f50835c = new ThreadFactoryC21440a.AbstractC21442a() {
                                /* class com.bytedance.monitor.p1546a.p1548b.C21435a.C214361 */

                                static {
                                    Covode.recordClassIndex(25059);
                                }

                                @Override // com.bytedance.monitor.p1546a.p1548b.p1549a.ThreadFactoryC21440a.AbstractC21442a
                                /* renamed from: a */
                                public final void mo35041a(long j) {
                                    C21435a.this.f50823a.put(EnumC21447b.IO, Long.valueOf(j));
                                }
                            };
                            C21443b bVar = new C21443b(aVar);
                            bVar.f50840b = fVar;
                            this.f50824c = bVar;
                        }
                    }
                }
            }
        }
        return this.f50824c;
    }

    /* renamed from: e */
    private C21443b m40245e() {
        if (this.f50826e == null) {
            Object obj = f50822b;
            synchronized (obj) {
                if (this.f50826e == null) {
                    AbstractC21453f fVar = this.f50827f;
                    synchronized (obj) {
                        if (this.f50826e == null) {
                            ThreadFactoryC21440a aVar = new ThreadFactoryC21440a("time-sensitive-task");
                            aVar.f50834b = fVar;
                            aVar.f50835c = new ThreadFactoryC21440a.AbstractC21442a() {
                                /* class com.bytedance.monitor.p1546a.p1548b.C21435a.C214383 */

                                static {
                                    Covode.recordClassIndex(25061);
                                }

                                @Override // com.bytedance.monitor.p1546a.p1548b.p1549a.ThreadFactoryC21440a.AbstractC21442a
                                /* renamed from: a */
                                public final void mo35041a(long j) {
                                    C21435a.this.f50823a.put(EnumC21447b.TIME_SENSITIVE, Long.valueOf(j));
                                }
                            };
                            C21443b bVar = new C21443b(aVar);
                            bVar.f50840b = fVar;
                            this.f50826e = bVar;
                        }
                    }
                }
            }
        }
        return this.f50826e;
    }

    @Override // com.bytedance.monitor.p1546a.p1548b.AbstractC21450d
    /* renamed from: a */
    public final void mo35033a(AbstractC21450d.AbstractC21451a aVar) {
        this.f50828g = aVar;
    }

    /* renamed from: c */
    private AbstractC21446c m40243c(AbstractRunnableC21452e eVar) {
        EnumC21447b b = eVar.mo20278b();
        if (b == EnumC21447b.IO) {
            return m40244d();
        }
        if (b == EnumC21447b.TIME_SENSITIVE) {
            return m40245e();
        }
        return m40242c();
    }

    @Override // com.bytedance.monitor.p1546a.p1548b.AbstractC21450d
    /* renamed from: a */
    public final long mo35031a(EnumC21447b bVar) {
        Long l = this.f50823a.get(bVar);
        if (l != null) {
            return l.longValue();
        }
        return -1;
    }

    @Override // com.bytedance.monitor.p1546a.p1548b.p1549a.AbstractC21446c
    /* renamed from: b */
    public final void mo35040b(AbstractRunnableC21452e eVar) {
        if (eVar != null) {
            try {
                m40243c(eVar).mo35040b(eVar);
            } catch (Throwable th) {
                mo35037a(th, "Apm-Async-task-removeTask");
            }
        }
    }

    @Override // com.bytedance.monitor.p1546a.p1548b.p1549a.AbstractC21446c
    /* renamed from: a */
    public final void mo35034a(AbstractRunnableC21452e eVar) {
        if (eVar != null) {
            try {
                m40243c(eVar).mo35034a(eVar);
            } catch (Throwable th) {
                mo35037a(th, "Apm-Async-task-post");
            }
        }
    }

    @Override // com.bytedance.monitor.p1546a.p1548b.AbstractC21450d
    /* renamed from: a */
    public final void mo35038a(ExecutorService executorService) {
        C21443b d = m40244d();
        if (executorService == null) {
            d.f50841c = null;
            d.f50842d = null;
            return;
        }
        if (executorService instanceof ThreadPoolExecutor) {
            d.f50842d = (ThreadPoolExecutor) executorService;
        }
        d.f50841c = (ExecutorService) Proxy.newProxyInstance(executorService.getClass().getClassLoader(), new Class[]{ExecutorService.class}, new InvocationHandler(executorService) {
            /* class com.bytedance.monitor.p1546a.p1548b.p1549a.C21443b.C214441 */

            /* renamed from: a */
            final /* synthetic */ ExecutorService f50847a;

            static {
                Covode.recordClassIndex(25067);
            }

            {
                this.f50847a = r2;
            }

            @Override // java.lang.reflect.InvocationHandler
            public final Object invoke(Object obj, Method method, Object[] objArr) {
                Object invoke;
                ExecutorService executorService = this.f50847a;
                Pair<Boolean, Object> a = C15346a.m28238a(method, new Object[]{executorService, objArr}, 110000, "java.lang.Object", true, "com_bytedance_monitor_util_thread_inner_ApmInnerThreadPool$1_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                if (((Boolean) a.first).booleanValue()) {
                    invoke = a.second;
                } else {
                    invoke = method.invoke(executorService, objArr);
                    C15346a.m28242a(invoke, method, new Object[]{executorService, objArr}, "com_bytedance_monitor_util_thread_inner_ApmInnerThreadPool$1_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                }
                if (C21443b.this.mo35045a()) {
                    String str = "null";
                    if (objArr != null) {
                        for (int i = 0; i < objArr.length; i++) {
                            str = str + objArr[i];
                        }
                    }
                    C21443b.this.mo35044a("call outer-executor " + method.getName() + ", args: " + str);
                    if ("submit".equals(method.getName())) {
                        C21443b.this.mo35044a("call outer-executor " + method.getName() + ", args: " + str);
                    }
                }
                return invoke;
            }
        });
    }

    @Override // com.bytedance.monitor.p1546a.p1548b.AbstractC21450d
    /* renamed from: a */
    public final void mo35037a(Throwable th, String str) {
        AbstractC21450d.AbstractC21451a aVar = this.f50828g;
        if (aVar != null) {
            aVar.mo20298a(th, str);
        }
    }

    @Override // com.bytedance.monitor.p1546a.p1548b.p1549a.AbstractC21446c
    /* renamed from: a */
    public final void mo35035a(AbstractRunnableC21452e eVar, long j) {
        if (eVar != null) {
            try {
                m40243c(eVar).mo35035a(eVar, j);
            } catch (Throwable th) {
                mo35037a(th, "Apm-Async-task-postDelayed");
            }
        }
    }

    @Override // com.bytedance.monitor.p1546a.p1548b.p1549a.AbstractC21446c
    /* renamed from: a */
    public final void mo35036a(AbstractRunnableC21452e eVar, long j, long j2) {
        if (eVar != null) {
            try {
                m40243c(eVar).mo35036a(eVar, j, j2);
            } catch (Throwable th) {
                mo35037a(th, "Apm-Async-task-removeTask");
            }
        }
    }
}
