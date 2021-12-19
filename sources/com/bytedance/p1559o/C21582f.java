package com.bytedance.p1559o;

import android.text.TextUtils;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.p1559o.p1560a.C21567a;
import com.bytedance.p1559o.p1560a.C21568b;
import com.bytedance.p1559o.p1560a.C21569c;
import com.bytedance.p1559o.p1560a.C21570d;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.bytedance.o.f */
public final class C21582f {

    /* renamed from: a */
    public final boolean f51189a;

    /* renamed from: b */
    public final Map<C21581e, Map<?, AbstractC21603p<?>>> f51190b;

    /* renamed from: c */
    public final Map<C21580d, List<AbstractC21603p<?>>> f51191c;

    /* renamed from: d */
    public final Map<C21605r, Set<AbstractC21603p<?>>> f51192d;

    /* renamed from: e */
    public final C21588c f51193e = new C21588c();

    /* renamed from: f */
    public final C21589d f51194f = new C21589d();

    /* renamed from: g */
    public final C21587b f51195g = new C21587b();

    /* renamed from: h */
    private final C21582f f51196h;

    /* renamed from: i */
    private final Map<C21604q, AbstractC21603p<?>> f51197i;

    /* renamed from: j */
    private final Map<Class<? extends Object>, Object<?, ?>> f51198j;

    /* renamed from: k */
    private final Map<C21604q, C21586a> f51199k = new LinkedHashMap();

    /* renamed from: l */
    private final Map<C21604q, Object> f51200l = new HashMap();

    /* renamed from: m */
    private final Map<C21604q, Object> f51201m = new HashMap();

    static {
        Covode.recordClassIndex(25223);
    }

    /* renamed from: a */
    public final void mo35250a() {
        for (C21604q qVar : this.f51197i.keySet()) {
            mo35249a(qVar.f51239a, qVar.f51240b);
        }
        for (C21580d dVar : this.f51191c.keySet()) {
            C21587b bVar = this.f51195g;
            C21580d dVar2 = new C21580d(dVar.f51186a);
            C21604q a = C21604q.m40540a(dVar2, null);
            ArrayList arrayList = new ArrayList();
            for (AbstractC21603p<?> pVar : C21582f.this.f51191c.get(dVar2)) {
                arrayList.add(C21582f.this.mo35246a(a, new C21594k(pVar)));
            }
            Collections.unmodifiableList(arrayList);
        }
        for (C21605r rVar : this.f51192d.keySet()) {
            this.f51194f.mo35257a(rVar.f51242a);
        }
        for (C21581e eVar : this.f51190b.keySet()) {
            this.f51193e.mo35256a(eVar.f51187a, eVar.f51188b);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.o.f$a */
    public static class C21586a {

        /* renamed from: a */
        String f51209a;

        static {
            Covode.recordClassIndex(25227);
        }

        C21586a(String str) {
            this.f51209a = str;
        }
    }

    /* renamed from: com.bytedance.o.f$b */
    public class C21587b {
        static {
            Covode.recordClassIndex(25228);
        }

        public C21587b() {
        }
    }

    /* renamed from: com.bytedance.o.f$c */
    public class C21588c {
        static {
            Covode.recordClassIndex(25229);
        }

        public C21588c() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.HashMap */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public final <K, V> Map<K, V> mo35256a(Class<K> cls, Class<V> cls2) {
            C21581e eVar = new C21581e(cls, cls2);
            C21604q a = C21604q.m40540a(eVar, null);
            HashMap hashMap = new HashMap();
            for (Map.Entry<?, AbstractC21603p<?>> entry : C21582f.this.f51190b.get(eVar).entrySet()) {
                hashMap.put(entry.getKey(), C21582f.this.mo35246a(a, new C21595l(entry)));
            }
            return Collections.unmodifiableMap(hashMap);
        }
    }

    /* renamed from: com.bytedance.o.f$d */
    public class C21589d {
        static {
            Covode.recordClassIndex(25230);
        }

        public C21589d() {
        }

        /* renamed from: a */
        public final <T> Set<T> mo35257a(Class<T> cls) {
            C21605r rVar = new C21605r(cls);
            C21604q a = C21604q.m40540a(rVar, null);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (AbstractC21603p<?> pVar : C21582f.this.f51192d.get(rVar)) {
                linkedHashSet.add(C21582f.this.mo35246a(a, new C21596m(pVar)));
            }
            return Collections.unmodifiableSet(linkedHashSet);
        }
    }

    /* renamed from: a */
    public final <T> T mo35247a(Class<T> cls) {
        return (T) mo35249a((Type) cls, (String) null);
    }

    /* renamed from: b */
    public final <T> T mo35251b(Class<T> cls) {
        return (T) mo35252b(cls, null);
    }

    /* renamed from: c */
    public final <T> T mo35254c(Class<T> cls) {
        return (T) mo35252b(cls, null);
    }

    /* renamed from: a */
    public final <T> AbstractC21603p<T> mo35245a(C21604q qVar) {
        C21582f fVar = this;
        do {
            AbstractC21603p<?> pVar = fVar.f51197i.get(qVar);
            if (pVar != null) {
                return (AbstractC21603p<T>) pVar;
            }
            fVar = fVar.f51196h;
        } while (fVar != null);
        return null;
    }

    /* renamed from: a */
    public final <T> T mo35248a(Class<T> cls, String str) {
        return (T) mo35249a((Type) cls, str);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.bytedance.o.f */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public final <T> T mo35252b(Type type, String str) {
        AbstractC21579c hVar;
        if (type != C21582f.class) {
            C21604q a = C21604q.m40540a(type, str);
            if (this.f51189a) {
                hVar = new C21590g(this, a);
            } else {
                hVar = new C21591h(mo35245a(a));
            }
            return (T) mo35246a(a, hVar);
        } else if (TextUtils.isEmpty(str)) {
            return this;
        } else {
            throw new IllegalArgumentException("ObjectContainer.class should not contain name");
        }
    }

    /* renamed from: c */
    public final <T> AbstractC21571b<T> mo35253c(Type type, String str) {
        AbstractC21571b<T> d = mo35255d(type, str);
        if (d != null) {
            return d;
        }
        throw new C21570d(C1764a.m5928a("Dependency not found %s", new Object[]{C21604q.m40540a(type, str).toString()}));
    }

    /* renamed from: d */
    public final <T> AbstractC21571b<T> mo35255d(final Type type, final String str) {
        if (type == C21582f.class) {
            if (TextUtils.isEmpty(str)) {
                return new AbstractC21571b<T>() {
                    /* class com.bytedance.p1559o.C21582f.C215831 */

                    static {
                        Covode.recordClassIndex(25224);
                    }

                    /* access modifiers changed from: protected */
                    @Override // com.bytedance.p1559o.AbstractC21571b
                    /* renamed from: b */
                    public final T mo35237b() {
                        return (T) C21582f.this;
                    }
                };
            }
            throw new IllegalArgumentException("ObjectContainer.class should not contain name");
        } else if (this.f51189a) {
            return new AbstractC21571b<T>() {
                /* class com.bytedance.p1559o.C21582f.C215842 */

                static {
                    Covode.recordClassIndex(25225);
                }

                /* access modifiers changed from: protected */
                @Override // com.bytedance.p1559o.AbstractC21571b
                /* renamed from: b */
                public final T mo35237b() {
                    C21604q a = C21604q.m40540a(type, str);
                    return (T) C21582f.this.mo35246a(a, new C21592i(this, a));
                }
            };
        } else {
            final C21604q a = C21604q.m40540a(type, str);
            final AbstractC21603p<T> a2 = mo35245a(a);
            if (a2 == null) {
                return null;
            }
            return new AbstractC21571b<T>() {
                /* class com.bytedance.p1559o.C21582f.C215853 */

                static {
                    Covode.recordClassIndex(25226);
                }

                /* access modifiers changed from: protected */
                @Override // com.bytedance.p1559o.AbstractC21571b
                /* renamed from: b */
                public final T mo35237b() {
                    T t = (T) C21582f.this.mo35246a(a, new C21593j(a2));
                    if (t != null) {
                        return t;
                    }
                    throw new C21568b("impossible");
                }
            };
        }
    }

    /* renamed from: a */
    public final <T> T mo35249a(Type type, String str) {
        T t = (T) mo35252b(type, str);
        if (t != null) {
            return t;
        }
        if (this.f51199k.size() > 0) {
            Set<C21604q> keySet = this.f51199k.keySet();
            StringBuilder sb = new StringBuilder();
            Iterator<C21604q> it = keySet.iterator();
            while (it.hasNext()) {
                sb.append(it.next().mo35265a() + "\n ╚> ");
            }
            sb.append(C21604q.m40540a(type, str).mo35265a());
            throw new C21570d(C1764a.m5928a("Dependency not found: \n %s", new Object[]{sb.toString()}));
        }
        throw new C21570d(C1764a.m5928a("Dependency not found %s", new Object[]{type.toString()}));
    }

    /* renamed from: a */
    public final synchronized <T> T mo35246a(C21604q qVar, AbstractC21579c<AbstractC21603p<T>> cVar) {
        T t;
        MethodCollector.m26663i(10847);
        if (!this.f51189a || (t = (T) this.f51201m.get(qVar)) == null) {
            T t2 = (T) this.f51200l.get(qVar);
            if (t2 != null) {
                MethodCollector.m26664o(10847);
                return t2;
            }
            AbstractC21603p<T> a = cVar.mo35238a();
            if (a == null) {
                MethodCollector.m26664o(10847);
                return null;
            } else if (this.f51199k.containsKey(qVar)) {
                Set<C21604q> keySet = this.f51199k.keySet();
                StringBuilder sb = new StringBuilder();
                for (C21604q qVar2 : keySet) {
                    sb.append(qVar2.mo35265a() + " " + this.f51199k.get(qVar2).f51209a + "\n ╚> ");
                }
                sb.append(qVar.mo35265a());
                C21567a aVar = new C21567a(C1764a.m5928a("circle dependency: \n %s", new Object[]{sb.toString()}));
                MethodCollector.m26664o(10847);
                throw aVar;
            } else {
                if (a instanceof C21606s) {
                    this.f51199k.put(qVar, new C21586a("singleton"));
                } else {
                    this.f51199k.put(qVar, new C21586a(""));
                }
                T t3 = a.get(this);
                if (t3 == null) {
                    NullPointerException nullPointerException = new NullPointerException("Provider should return nonnull value ".concat(String.valueOf(a)));
                    MethodCollector.m26664o(10847);
                    throw nullPointerException;
                } else if (!this.f51200l.containsKey(qVar)) {
                    if (a instanceof C21606s) {
                        this.f51200l.put(qVar, t3);
                    }
                    a.executeOnCreate(t3, this);
                    if (a instanceof C21606s) {
                        this.f51200l.remove(qVar);
                        if (this.f51189a) {
                            this.f51201m.put(qVar, t3);
                        }
                    }
                    this.f51199k.remove(qVar);
                    MethodCollector.m26664o(10847);
                    return t3;
                } else {
                    C21568b bVar = new C21568b("Why duplicate key!!!");
                    MethodCollector.m26664o(10847);
                    throw bVar;
                }
            }
        } else {
            MethodCollector.m26664o(10847);
            return t;
        }
    }

    public C21582f(C21582f fVar, boolean z, C21597n... nVarArr) {
        this.f51196h = fVar;
        this.f51189a = z;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
        int i = 0;
        do {
            C21597n nVar = nVarArr[0];
            for (Map.Entry<C21604q, AbstractC21603p<?>> entry : nVar.f51222a.entrySet()) {
                if (!linkedHashMap.containsKey(entry.getKey())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                } else {
                    throw new C21569c("duplicate already contain " + entry.getKey().mo35265a() + " " + entry.getValue());
                }
            }
            for (Map.Entry<Class<? extends Object>, Object<?, ?>> entry2 : nVar.f51223b.entrySet()) {
                if (!linkedHashMap2.containsKey(entry2.getKey())) {
                    linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                } else {
                    throw new C21569c("duplicate already contain " + entry2.getKey() + " " + entry2.getValue());
                }
            }
            for (Map.Entry<C21581e, Map<?, AbstractC21603p<?>>> entry3 : nVar.f51224c.entrySet()) {
                if (!linkedHashMap3.containsKey(entry3.getKey())) {
                    linkedHashMap3.put(entry3.getKey(), entry3.getValue());
                } else {
                    throw new C21569c("duplicate already contain " + entry3.getKey() + " " + entry3.getValue());
                }
            }
            for (Map.Entry<C21580d, List<AbstractC21603p<?>>> entry4 : nVar.f51226e.entrySet()) {
                if (!linkedHashMap4.containsKey(entry4.getKey())) {
                    linkedHashMap4.put(entry4.getKey(), entry4.getValue());
                } else {
                    throw new C21569c("duplicate already contain " + entry4.getKey() + " " + entry4.getValue());
                }
            }
            for (Map.Entry<C21605r, Set<AbstractC21603p<?>>> entry5 : nVar.f51225d.entrySet()) {
                if (!linkedHashMap5.containsKey(entry5.getKey())) {
                    linkedHashMap5.put(entry5.getKey(), entry5.getValue());
                } else {
                    throw new C21569c("duplicate already contain " + entry5.getKey() + " " + entry5.getValue());
                }
            }
            i++;
        } while (i <= 0);
        this.f51197i = Collections.unmodifiableMap(linkedHashMap);
        this.f51198j = Collections.unmodifiableMap(linkedHashMap2);
        this.f51190b = Collections.unmodifiableMap(linkedHashMap3);
        this.f51191c = Collections.unmodifiableMap(linkedHashMap4);
        this.f51192d = Collections.unmodifiableMap(linkedHashMap5);
    }
}
