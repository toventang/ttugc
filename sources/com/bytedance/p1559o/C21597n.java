package com.bytedance.p1559o;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1559o.p1560a.C21569c;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.bytedance.o.n */
public final class C21597n {

    /* renamed from: a */
    final Map<C21604q, AbstractC21603p<?>> f51222a;

    /* renamed from: b */
    final Map<Class<? extends Object>, Object<?, ?>> f51223b;

    /* renamed from: c */
    final Map<C21581e, Map<?, AbstractC21603p<?>>> f51224c;

    /* renamed from: d */
    final Map<C21605r, Set<AbstractC21603p<?>>> f51225d;

    /* renamed from: e */
    final Map<C21580d, List<AbstractC21603p<?>>> f51226e;

    /* renamed from: f */
    private boolean f51227f;

    /* renamed from: g */
    private final C21582f f51228g;

    static {
        Covode.recordClassIndex(25238);
    }

    public C21597n() {
        this(null, false);
    }

    /* renamed from: a */
    public final C21582f mo35258a() {
        return new C21582f(this.f51228g, this.f51227f, this);
    }

    /* renamed from: com.bytedance.o.n$b */
    public class C21601b<CHILD> {

        /* renamed from: c */
        Class<CHILD> f51236c;

        /* renamed from: d */
        String f51237d;

        static {
            Covode.recordClassIndex(25242);
        }

        /* renamed from: a */
        public final C21601b<CHILD> mo35263a(Class<? super CHILD>... clsArr) {
            for (Class<? super CHILD> cls : clsArr) {
                C21597n nVar = C21597n.this;
                Class<CHILD> cls2 = this.f51236c;
                String str = this.f51237d;
                nVar.mo35262b(cls, str, new AbstractC21603p<T>(cls2, str) {
                    /* class com.bytedance.p1559o.C21597n.C215992 */

                    /* renamed from: a */
                    final /* synthetic */ Class f51231a;

                    /* renamed from: b */
                    final /* synthetic */ String f51232b;

                    static {
                        Covode.recordClassIndex(25240);
                    }

                    @Override // com.bytedance.p1559o.AbstractC21603p
                    public final T get(C21582f fVar) {
                        return (T) fVar.mo35249a((Type) this.f51231a, this.f51232b);
                    }

                    {
                        this.f51231a = r2;
                        this.f51232b = r3;
                    }
                });
            }
            return this;
        }

        C21601b(Class<CHILD> cls, String str) {
            this.f51236c = cls;
            this.f51237d = str;
        }
    }

    /* renamed from: a */
    public final <T> C21600a<T> mo35259a(Class<T> cls, AbstractC21603p<T> pVar) {
        return mo35260a((Class) cls, (String) null, (AbstractC21603p) pVar);
    }

    public C21597n(C21582f fVar, boolean z) {
        this.f51222a = new LinkedHashMap();
        this.f51223b = new LinkedHashMap();
        this.f51224c = new LinkedHashMap();
        this.f51225d = new LinkedHashMap();
        this.f51226e = new LinkedHashMap();
        this.f51228g = fVar;
        this.f51227f = z;
    }

    /* renamed from: a */
    public final <T> C21600a<T> mo35260a(Class<T> cls, String str, AbstractC21603p<T> pVar) {
        return mo35262b(cls, str, new C21606s(pVar));
    }

    /* renamed from: a */
    public final <T> C21601b<T> mo35261a(Class<T> cls, String str, final T t) {
        return mo35262b(cls, str, new C21606s(new AbstractC21603p<T>() {
            /* class com.bytedance.p1559o.C21597n.C215981 */

            static {
                Covode.recordClassIndex(25239);
            }

            @Override // com.bytedance.p1559o.AbstractC21603p
            public final T get(C21582f fVar) {
                return (T) t;
            }
        }));
    }

    /* renamed from: b */
    public final <T> C21600a<T> mo35262b(Class<T> cls, String str, AbstractC21603p<T> pVar) {
        C21604q a = C21604q.m40540a(cls, str);
        if (!this.f51222a.containsKey(a)) {
            this.f51222a.put(a, pVar);
            return new C21600a<>(cls, str, pVar.onCreateGetter);
        }
        throw new C21569c("duplicate already contain " + cls.toString() + " " + this.f51222a.get(a));
    }

    /* renamed from: com.bytedance.o.n$a */
    public final class C21600a<CHILD> extends C21601b<CHILD> {

        /* renamed from: a */
        C21602o<CHILD> f51234a;

        static {
            Covode.recordClassIndex(25241);
        }

        C21600a(Class<CHILD> cls, String str, C21602o<CHILD> oVar) {
            super(cls, str);
            this.f51234a = oVar;
        }
    }
}
