package com.bytedance.ies.powerlist;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1202k;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.header.C17660a;
import com.bytedance.ies.powerlist.header.FixedViewCell;
import com.bytedance.ies.powerlist.p1230a.C17638b;
import com.bytedance.ies.powerlist.p1231b.AbstractC17641a;
import com.p084a.p088b.C1870c;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89388w;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

public final class PowerStub implements AbstractC1202k, AbstractC1214u<C17640b<AbstractC17641a>> {

    /* renamed from: o */
    public static final C17634a f42168o = new C17634a((byte) 0);

    /* renamed from: a */
    public final C17656f<AbstractC17641a> f42169a = new C17656f<>();

    /* renamed from: b */
    public PowerStub f42170b;

    /* renamed from: c */
    int f42171c = 20000;

    /* renamed from: d */
    public final Map<Integer, Class<? extends PowerCell<?>>> f42172d = new HashMap();

    /* renamed from: e */
    public final Map<Type, Integer> f42173e = new HashMap();

    /* renamed from: f */
    final List<AbstractC17641a> f42174f = new ArrayList();

    /* renamed from: g */
    public final List<C17660a> f42175g = new CopyOnWriteArrayList();

    /* renamed from: h */
    final List<C17660a> f42176h = new CopyOnWriteArrayList();

    /* renamed from: i */
    AbstractC1204m f42177i;

    /* renamed from: j */
    public final List<AbstractC17641a> f42178j = new ArrayList();

    /* renamed from: k */
    public final AbstractC17654e f42179k;

    /* renamed from: l */
    public final AbstractC89183m<Integer, Integer, C89391z> f42180l;

    /* renamed from: m */
    public final AbstractC89183m<Integer, Integer, C89391z> f42181m;

    /* renamed from: n */
    public final AbstractC89183m<Boolean, Boolean, C89391z> f42182n;

    /* renamed from: p */
    private int f42183p = 10000;

    /* renamed from: q */
    private volatile int f42184q;

    /* renamed from: r */
    private boolean f42185r;

    /* renamed from: s */
    private final AbstractC89244h f42186s = C89250i.m154773a((AbstractC89171a) C17635b.f42187a);

    static {
        Covode.recordClassIndex(20186);
    }

    /* renamed from: e */
    public final C17638b mo28103e() {
        return (C17638b) this.f42186s.getValue();
    }

    /* renamed from: com.bytedance.ies.powerlist.PowerStub$a */
    public static final class C17634a {
        static {
            Covode.recordClassIndex(20187);
        }

        private C17634a() {
        }

        public /* synthetic */ C17634a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.ies.powerlist.PowerStub$b */
    static final class C17635b extends AbstractC89220m implements AbstractC89171a<C17638b> {

        /* renamed from: a */
        public static final C17635b f42187a = new C17635b();

        static {
            Covode.recordClassIndex(20188);
        }

        C17635b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C17638b invoke() {
            return new C17638b();
        }
    }

    /* renamed from: f */
    private final int m32741f() {
        int i = this.f42183p;
        this.f42183p = i + 1;
        return i;
    }

    /* renamed from: a */
    public final int mo28096a() {
        return this.f42175g.size();
    }

    /* renamed from: b */
    public final int mo28100b() {
        return this.f42176h.size();
    }

    /* renamed from: d */
    public final int mo28102d() {
        return this.f42178j.size();
    }

    /* renamed from: c */
    public final void mo28101c() {
        this.f42182n.invoke(false, true);
    }

    /* renamed from: a */
    public final void mo28098a(AbstractC1204m mVar) {
        C89219l.m154719c(mVar, "");
        this.f42169a.f42188a.observe(mVar, this);
        mVar.getLifecycle().mo4012a(this);
        this.f42177i = mVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.AbstractC1214u
    public final /* synthetic */ void onChanged(C17640b<AbstractC17641a> bVar) {
        C17640b<AbstractC17641a> bVar2 = bVar;
        C89219l.m154719c(bVar2, "");
        this.f42174f.clear();
        this.f42174f.addAll(bVar2.f42191a);
        this.f42182n.invoke(Boolean.valueOf(bVar2.f42192b), false);
    }

    /* renamed from: a */
    public final void mo28099a(List<? extends Class<? extends PowerCell<?>>> list) {
        C89219l.m154719c(list, "");
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        for (T t : list) {
            Type genericSuperclass = t.getGenericSuperclass();
            if (genericSuperclass != null) {
                Type[] actualTypeArguments = ((ParameterizedType) genericSuperclass).getActualTypeArguments();
                C89219l.m154709a((Object) actualTypeArguments, "");
                for (Type type : actualTypeArguments) {
                    if (this.f42173e.get(type) == null) {
                        int i = this.f42184q;
                        this.f42184q = i + 1;
                        hashMap.put(type, Integer.valueOf(i));
                        hashMap2.put(Integer.valueOf(i), t);
                    }
                }
            } else {
                throw new C89388w("null cannot be cast to non-null type");
            }
        }
        m32740a(hashMap, hashMap2);
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Context context = this.f42179k.f42221b;
            Integer a = C17643c.m32758a().mo28150a(it.next());
            C89219l.m154709a((Object) a, "");
            C1870c.m6049a(context, a.intValue());
        }
    }

    /* renamed from: a */
    private final void m32740a(Map<Type, Integer> map, Map<Integer, ? extends Class<? extends PowerCell<?>>> map2) {
        this.f42173e.putAll(map);
        this.f42172d.putAll(map2);
    }

    /* renamed from: a */
    public final void mo28097a(int i, View view) {
        if (view != null) {
            int f = m32741f();
            this.f42175g.add(i, new C17660a(view, f));
            this.f42172d.put(Integer.valueOf(f), FixedViewCell.class);
            this.f42180l.invoke(0, 1);
            mo28101c();
        }
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        C89219l.m154719c(mVar, "");
        C89219l.m154719c(aVar, "");
        if (C17658g.f42227a[aVar.ordinal()] == 1) {
            Boolean valueOf = Boolean.valueOf(this.f42185r);
            if (!valueOf.booleanValue()) {
                valueOf.booleanValue();
                this.f42179k.mo28126c();
                this.f42185r = true;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.f.a.m<? super java.lang.Integer, ? super java.lang.Integer, h.z> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: h.f.a.m<? super java.lang.Integer, ? super java.lang.Integer, h.z> */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: h.f.a.m<? super java.lang.Boolean, ? super java.lang.Boolean, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public PowerStub(AbstractC17654e eVar, AbstractC89183m<? super Integer, ? super Integer, C89391z> mVar, AbstractC89183m<? super Integer, ? super Integer, C89391z> mVar2, AbstractC89183m<? super Boolean, ? super Boolean, C89391z> mVar3) {
        C89219l.m154719c(eVar, "");
        C89219l.m154719c(mVar, "");
        C89219l.m154719c(mVar2, "");
        C89219l.m154719c(mVar3, "");
        this.f42179k = eVar;
        this.f42180l = mVar;
        this.f42181m = mVar2;
        this.f42182n = mVar3;
    }
}
