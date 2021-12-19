package com.bytedance.p1603q;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1603q.p1605b.AbstractC21932a;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.q.i */
public final class C21942i implements AbstractC21931b, Serializable {

    /* renamed from: a */
    protected AbstractC21937f f51930a;

    /* renamed from: b */
    public Map<String, Object> f51931b;

    /* renamed from: c */
    private int f51932c;

    /* renamed from: d */
    private List<C21940h> f51933d;

    /* renamed from: e */
    private AbstractC21935d f51934e;

    static {
        Covode.recordClassIndex(25608);
    }

    @Override // com.bytedance.p1603q.AbstractC21931b
    /* renamed from: a */
    public final Object mo35690a() {
        this.f51932c = 0;
        this.f51934e = null;
        return mo35692a((Object) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.q.i$a */
    public static final class C21943a extends Exception {
        static {
            Covode.recordClassIndex(25609);
        }

        C21943a(Throwable th) {
            super(th);
        }
    }

    @Override // com.bytedance.p1603q.AbstractC21931b
    /* renamed from: a */
    public final Object mo35693a(String str) {
        return this.f51931b.get(str);
    }

    /* renamed from: c */
    private AbstractC21935d m41259c(Class cls) {
        AbstractC21935d dVar = this.f51934e;
        while (dVar != null && dVar.getClass() != cls) {
            dVar = dVar.f51918d;
        }
        return dVar;
    }

    @Override // com.bytedance.p1603q.AbstractC21931b
    /* renamed from: a */
    public final Object mo35691a(Class cls) {
        AbstractC21935d c = m41259c(cls);
        if (c != null) {
            return c.f51919e;
        }
        throw new IllegalArgumentException("can not find pre Interceptor , class:".concat(String.valueOf(cls)));
    }

    @Override // com.bytedance.p1603q.AbstractC21931b
    /* renamed from: b */
    public final Object mo35695b(Class cls) {
        AbstractC21935d c = m41259c(cls);
        if (c != null) {
            return c.f51920f;
        }
        throw new IllegalArgumentException("can not find pre Interceptor , class:".concat(String.valueOf(cls)));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.p1603q.AbstractC21931b
    /* renamed from: a */
    public final Object mo35692a(Object obj) {
        AbstractC21935d dVar = this.f51934e;
        if (dVar != null) {
            dVar.f51920f = obj;
            AbstractC21935d dVar2 = this.f51934e;
            if (dVar2.f51921g != null) {
                dVar2.f51921g.mo24306b(dVar2.f51922h, dVar2);
            }
        }
        if (this.f51932c >= this.f51933d.size()) {
            return obj;
        }
        C21940h hVar = this.f51933d.get(this.f51932c);
        Class<? extends AbstractC21935d> cls = hVar.f51924a;
        AbstractC21935d dVar3 = (AbstractC21935d) this.f51930a.mo35697a(cls);
        if (dVar3 != null) {
            AbstractC21932a aVar = hVar.f51925b;
            C21942i iVar = new C21942i(this.f51933d, this.f51932c + 1, this.f51930a, dVar3);
            iVar.f51931b = this.f51931b;
            AbstractC21935d dVar4 = this.f51934e;
            Object[] objArr = hVar.f51926c;
            dVar3.f51922h = new C21949m(iVar);
            dVar3.f51918d = dVar4;
            dVar3.f51919e = obj;
            dVar3.f51921g = aVar;
            if (dVar3.f51918d != null) {
                dVar3.f51923i = dVar3.f51918d.f51923i;
            } else {
                dVar3.f51923i = AbstractC21935d.f51917c.getAndIncrement();
                if (dVar3.f51923i < 0) {
                    throw new RuntimeException("Pipeline ID use up!");
                }
            }
            dVar3.mo24021a(objArr);
            if (dVar3.f51921g != null) {
                dVar3.f51921g.mo24304a(dVar3.f51922h, dVar3);
            }
            try {
                Object a = dVar3.mo24020a(iVar, obj);
                if (dVar3.f51921g != null) {
                    dVar3.f51921g.mo24308c(dVar3.f51922h, dVar3);
                }
                return a;
            } catch (C21943a e) {
                Throwable cause = e.getCause();
                if (dVar3.f51921g != null) {
                    dVar3.f51921g.mo24307b(dVar3.f51922h, dVar3, cause);
                }
                throw e;
            } catch (Throwable th) {
                if (dVar3.f51921g != null) {
                    dVar3.f51921g.mo24305a(dVar3.f51922h, dVar3, th);
                }
                throw new C21943a(th);
            }
        } else {
            throw new IllegalArgumentException("interceptor == null , index = " + obj + " , class: " + cls);
        }
    }

    @Override // com.bytedance.p1603q.AbstractC21931b
    /* renamed from: a */
    public final void mo35694a(String str, Object obj) {
        this.f51931b.put(str, obj);
    }

    C21942i(List<C21940h> list, int i, AbstractC21937f fVar, AbstractC21935d dVar) {
        HashMap hashMap = new HashMap();
        this.f51931b = hashMap;
        this.f51933d = list;
        this.f51932c = i;
        this.f51930a = fVar;
        this.f51934e = dVar;
        hashMap.put("req_type", 1);
        this.f51931b.put("sync_task_id", 0);
    }
}
