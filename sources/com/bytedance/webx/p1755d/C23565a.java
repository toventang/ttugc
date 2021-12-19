package com.bytedance.webx.p1755d;

import com.bytedance.covode.number.Covode;
import com.bytedance.webx.AbstractC23547a;
import com.bytedance.webx.C23612h;
import com.bytedance.webx.C23628i;
import com.bytedance.webx.p1756e.AbstractC23595b;
import com.bytedance.webx.p1762f.AbstractC23606a;
import com.bytedance.webx.p1763g.C23611b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* renamed from: com.bytedance.webx.d.a */
public class C23565a implements AbstractC23566b {

    /* renamed from: d */
    private static final WeakReference<Object> f55817d = new WeakReference<>(null);

    /* renamed from: a */
    public boolean f55818a;

    /* renamed from: b */
    public Set<C23612h.AbstractC23616c> f55819b;

    /* renamed from: c */
    public HashMap<Class<? extends AbstractC23547a>, C23612h.AbstractC23616c> f55820c;

    /* renamed from: e */
    private WeakReference<Object> f55821e = f55817d;

    /* renamed from: f */
    private C23612h f55822f;

    /* renamed from: g */
    private AbstractC23595b f55823g;

    /* renamed from: h */
    private ArrayList<AbstractC23567c> f55824h = new ArrayList<>();

    /* renamed from: i */
    private HashMap<Class, WeakReference<AbstractC23567c>> f55825i = new HashMap<>();

    /* renamed from: j */
    private Map<String, TreeMap<Integer, AbstractC23606a>> f55826j;

    @Override // com.bytedance.webx.p1755d.AbstractC23566b
    /* renamed from: a */
    public final Map<String, TreeMap<Integer, AbstractC23606a>> mo38641a() {
        return this.f55826j;
    }

    @Override // com.bytedance.webx.p1755d.AbstractC23566b
    /* renamed from: d */
    public final C23612h mo38648d() {
        return this.f55822f;
    }

    @Override // com.bytedance.webx.p1755d.AbstractC23566b
    /* renamed from: b */
    public final AbstractC23567c mo38646b() {
        return (AbstractC23567c) this.f55823g;
    }

    @Override // com.bytedance.webx.p1755d.AbstractC23566b
    /* renamed from: c */
    public final Iterator<AbstractC23567c> mo38647c() {
        return this.f55824h.iterator();
    }

    static {
        Covode.recordClassIndex(27663);
    }

    @Override // com.bytedance.webx.p1755d.AbstractC23566b
    /* renamed from: a */
    public final void mo38644a(Map<String, TreeMap<Integer, AbstractC23606a>> map) {
        this.f55826j = map;
    }

    /* renamed from: a */
    public final boolean mo38645a(Class<? extends AbstractC23547a> cls) {
        return this.f55825i.containsKey(cls);
    }

    /* renamed from: a */
    public final void mo38643a(LinkedHashSet<Class<? extends AbstractC23547a>> linkedHashSet) {
        if (linkedHashSet != null) {
            Iterator<Class<? extends AbstractC23547a>> it = linkedHashSet.iterator();
            while (it.hasNext()) {
                Class<? extends AbstractC23547a> next = it.next();
                AbstractC23547a aVar = (AbstractC23547a) C23611b.m44646b(next);
                if (aVar != null) {
                    mo38642a(next, aVar);
                } else {
                    throw new Error("extension init fail: ".concat(String.valueOf(next)));
                }
            }
        }
        Iterator it2 = new ArrayList(this.f55824h).iterator();
        while (it2.hasNext()) {
            AbstractC23567c cVar = (AbstractC23567c) it2.next();
            if (cVar instanceof AbstractC23547a) {
                C23628i.m44674a((AbstractC23547a) cVar);
            }
        }
    }

    /* renamed from: a */
    private void m44310a(Class<? extends AbstractC23547a> cls, AbstractC23567c cVar) {
        this.f55824h.add(cVar);
        this.f55825i.put(cls, new WeakReference<>(cVar));
    }

    public C23565a(C23612h hVar, AbstractC23595b bVar) {
        this.f55822f = hVar;
        this.f55823g = bVar;
        this.f55824h.add(bVar);
    }

    /* renamed from: a */
    public final void mo38642a(Class<? extends AbstractC23547a> cls, AbstractC23547a aVar) {
        C23612h.AbstractC23616c cVar;
        LinkedHashSet<C23612h.AbstractC23616c> linkedHashSet;
        aVar.f55777d = this.f55822f;
        if (this.f55822f.f55882f != null) {
            Iterator<C23612h.AbstractC23616c> it = this.f55822f.f55882f.iterator();
            while (it.hasNext()) {
                it.next().mo34738a(aVar);
            }
        }
        if (!(this.f55822f.f55883g == null || (linkedHashSet = this.f55822f.f55883g.get(cls)) == null)) {
            Iterator<C23612h.AbstractC23616c> it2 = linkedHashSet.iterator();
            while (it2.hasNext()) {
                it2.next().mo34738a(aVar);
            }
        }
        Set<C23612h.AbstractC23616c> set = this.f55819b;
        if (set != null) {
            for (C23612h.AbstractC23616c cVar2 : set) {
                cVar2.mo34738a(aVar);
            }
        }
        HashMap<Class<? extends AbstractC23547a>, C23612h.AbstractC23616c> hashMap = this.f55820c;
        if (!(hashMap == null || (cVar = hashMap.get(cls)) == null)) {
            cVar.mo34738a(aVar);
        }
        m44310a(cls, (AbstractC23567c) aVar);
        aVar.f55778e = this;
    }
}
