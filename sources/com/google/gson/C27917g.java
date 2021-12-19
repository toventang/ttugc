package com.google.gson;

import com.bytedance.covode.number.Covode;
import com.google.gson.internal.C27921a;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.C27949i;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.google.gson.p2019b.C27895a;
import java.lang.reflect.Type;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.gson.g */
public final class C27917g {

    /* renamed from: a */
    public Excluder f65561a;

    /* renamed from: b */
    public AbstractC27909e f65562b;

    /* renamed from: c */
    public boolean f65563c;

    /* renamed from: d */
    public boolean f65564d;

    /* renamed from: e */
    public boolean f65565e;

    /* renamed from: f */
    public boolean f65566f;

    /* renamed from: g */
    public boolean f65567g;

    /* renamed from: h */
    private EnumC28028u f65568h;

    /* renamed from: i */
    private final Map<Type, AbstractC27918h<?>> f65569i;

    /* renamed from: j */
    private final List<AbstractC28033w> f65570j;

    /* renamed from: k */
    private final List<AbstractC28033w> f65571k;

    /* renamed from: l */
    private String f65572l;

    /* renamed from: m */
    private int f65573m;

    /* renamed from: n */
    private int f65574n;

    /* renamed from: o */
    private boolean f65575o;

    /* renamed from: p */
    private boolean f65576p;

    static {
        Covode.recordClassIndex(33511);
    }

    /* renamed from: a */
    public final C27917g mo46677a() {
        Excluder a = this.f65561a.clone();
        a.f65582e = true;
        this.f65561a = a;
        return this;
    }

    public C27917g() {
        this.f65561a = Excluder.f65578a;
        this.f65568h = EnumC28028u.DEFAULT;
        this.f65562b = EnumC27902d.IDENTITY;
        this.f65569i = new HashMap();
        this.f65570j = new ArrayList();
        this.f65571k = new ArrayList();
        this.f65563c = false;
        this.f65573m = 2;
        this.f65574n = 2;
        this.f65564d = false;
        this.f65575o = false;
        this.f65565e = true;
        this.f65566f = false;
        this.f65576p = false;
        this.f65567g = false;
    }

    /* renamed from: b */
    public final C27910f mo46682b() {
        ArrayList arrayList = new ArrayList(this.f65570j.size() + this.f65571k.size() + 3);
        arrayList.addAll(this.f65570j);
        Collections.reverse(arrayList);
        ArrayList arrayList2 = new ArrayList(this.f65571k);
        Collections.reverse(arrayList2);
        arrayList.addAll(arrayList2);
        m55937a(this.f65572l, this.f65573m, this.f65574n, arrayList);
        return new C27910f(this.f65561a, this.f65562b, this.f65569i, this.f65563c, this.f65564d, this.f65576p, this.f65565e, this.f65566f, this.f65567g, this.f65575o, this.f65568h, this.f65572l, this.f65573m, this.f65574n, this.f65570j, this.f65571k, arrayList);
    }

    /* renamed from: a */
    public final C27917g mo46679a(AbstractC28033w wVar) {
        this.f65570j.add(wVar);
        return this;
    }

    /* renamed from: a */
    public final C27917g mo46678a(AbstractC27894b bVar) {
        this.f65561a = this.f65561a.mo46700a(bVar, true, false);
        return this;
    }

    public C27917g(C27910f fVar) {
        this.f65561a = Excluder.f65578a;
        this.f65568h = EnumC28028u.DEFAULT;
        this.f65562b = EnumC27902d.IDENTITY;
        HashMap hashMap = new HashMap();
        this.f65569i = hashMap;
        ArrayList arrayList = new ArrayList();
        this.f65570j = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f65571k = arrayList2;
        this.f65563c = false;
        this.f65573m = 2;
        this.f65574n = 2;
        this.f65564d = false;
        this.f65575o = false;
        this.f65565e = true;
        this.f65566f = false;
        this.f65576p = false;
        this.f65567g = false;
        this.f65561a = fVar.f65536b;
        this.f65562b = fVar.f65537c;
        hashMap.putAll(fVar.f65538d);
        this.f65563c = fVar.f65539e;
        this.f65564d = fVar.f65540f;
        this.f65576p = fVar.f65541g;
        this.f65565e = fVar.f65542h;
        this.f65566f = fVar.f65543i;
        this.f65567g = fVar.f65544j;
        this.f65575o = fVar.f65545k;
        this.f65568h = fVar.f65549o;
        this.f65572l = fVar.f65546l;
        this.f65573m = fVar.f65547m;
        this.f65574n = fVar.f65548n;
        arrayList.addAll(fVar.f65550p);
        arrayList2.addAll(fVar.f65551q);
    }

    /* renamed from: a */
    public final C27917g mo46680a(Class<?> cls, Object obj) {
        boolean z;
        boolean z2 = obj instanceof AbstractC28026s;
        if (z2 || (obj instanceof AbstractC28018k) || (obj instanceof AbstractC28031v)) {
            z = true;
        } else {
            z = false;
        }
        C27921a.m55969a(z);
        if ((obj instanceof AbstractC28018k) || z2) {
            this.f65571k.add(TreeTypeAdapter.m56000a(cls, obj));
        }
        if (obj instanceof AbstractC28031v) {
            this.f65570j.add(C27949i.m56050b(cls, (AbstractC28031v) obj));
        }
        return this;
    }

    /* renamed from: a */
    public final C27917g mo46681a(Type type, Object obj) {
        boolean z;
        boolean z2 = obj instanceof AbstractC28026s;
        if (z2 || (obj instanceof AbstractC28018k) || (obj instanceof AbstractC27918h) || (obj instanceof AbstractC28031v)) {
            z = true;
        } else {
            z = false;
        }
        C27921a.m55969a(z);
        if (obj instanceof AbstractC27918h) {
            this.f65569i.put(type, obj);
        }
        if (z2 || (obj instanceof AbstractC28018k)) {
            this.f65570j.add(TreeTypeAdapter.m55999a(C27895a.get(type), obj));
        }
        if (obj instanceof AbstractC28031v) {
            this.f65570j.add(C27949i.m56047a(C27895a.get(type), (AbstractC28031v) obj));
        }
        return this;
    }

    /* renamed from: a */
    private static void m55937a(String str, int i, int i2, List<AbstractC28033w> list) {
        C27888a aVar;
        C27888a aVar2;
        C27888a aVar3;
        if (str != null && !"".equals(str.trim())) {
            aVar = new C27888a(Date.class, str);
            aVar2 = new C27888a(Timestamp.class, str);
            aVar3 = new C27888a(java.sql.Date.class, str);
        } else if (i != 2 && i2 != 2) {
            aVar = new C27888a(Date.class, i, i2);
            aVar2 = new C27888a(Timestamp.class, i, i2);
            aVar3 = new C27888a(java.sql.Date.class, i, i2);
        } else {
            return;
        }
        list.add(C27949i.m56048a(Date.class, aVar));
        list.add(C27949i.m56048a(Timestamp.class, aVar2));
        list.add(C27949i.m56048a(java.sql.Date.class, aVar3));
    }
}
