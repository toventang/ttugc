package com.bytedance.ies.ugc.aweme.network;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.p1264a.C18084c;
import com.bytedance.ies.ugc.network.partner.AbstractC18185b;
import com.bytedance.ies.ugc.network.partner.NetworkPartnerGroup;
import com.bytedance.retrofit2.AbstractC22019c;
import com.bytedance.retrofit2.AbstractC22043e;
import com.bytedance.retrofit2.p1612c.AbstractC22021a;
import com.bytedance.retrofit2.p1613d.p1614a.C22042h;
import com.google.gson.C27910f;
import com.p2082ss.android.ugc.aweme.app.api.C33602a;
import com.p2082ss.android.ugc.aweme.app.api.C33610b;
import com.p2082ss.android.ugc.aweme.app.api.C33624e;
import com.p2082ss.android.ugc.aweme.app.api.C33627f;
import com.p2082ss.android.ugc.aweme.app.api.C33655r;
import com.p2082ss.android.ugc.aweme.app.api.p2318a.C33607a;
import com.p2082ss.android.ugc.aweme.app.api.p2320c.AbstractC33621d;
import com.p2082ss.android.ugc.aweme.utils.GsonHolder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.bytedance.ies.ugc.aweme.network.a */
final class C18077a implements AbstractC18096e {

    /* renamed from: a */
    String f43032a;

    /* renamed from: b */
    boolean f43033b;

    /* renamed from: c */
    boolean f43034c;

    /* renamed from: d */
    C27910f f43035d;

    /* renamed from: e */
    List<AbstractC22021a> f43036e = new ArrayList();

    /* renamed from: f */
    List<AbstractC22043e.AbstractC22044a> f43037f = null;

    /* renamed from: g */
    List<AbstractC22019c.AbstractC22020a> f43038g;

    /* renamed from: h */
    AbstractC33621d f43039h;

    /* renamed from: i */
    Object f43040i;

    /* renamed from: j */
    NetworkPartnerGroup f43041j;

    /* renamed from: k */
    int f43042k;

    static {
        Covode.recordClassIndex(20714);
    }

    @Override // com.bytedance.ies.ugc.aweme.network.AbstractC18096e
    /* renamed from: a */
    public final AbstractC18096e mo28823a() {
        this.f43034c = true;
        return this;
    }

    @Override // com.bytedance.ies.ugc.aweme.network.AbstractC18096e
    /* renamed from: b */
    public final AbstractC18096e mo28830b() {
        this.f43033b = true;
        return this;
    }

    @Override // com.bytedance.ies.ugc.aweme.network.AbstractC18096e
    /* renamed from: c */
    public final AbstractC18096e mo28831c() {
        this.f43042k = 3;
        return this;
    }

    public final int hashCode() {
        return (((this.f43032a.hashCode() * 31) + (this.f43033b ? 1 : 0)) * 31) + (this.f43034c ? 1 : 0);
    }

    @Override // com.bytedance.ies.ugc.aweme.network.AbstractC18096e
    /* renamed from: d */
    public final AbstractC18099f mo28832d() {
        if (this.f43037f == null) {
            C27910f fVar = this.f43035d;
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C33607a());
            arrayList.add(new C33655r(GsonHolder.m138943c().mo123620b()));
            arrayList.add(new C18084c(GsonHolder.m138943c().mo123620b()));
            if (fVar == null) {
                fVar = GsonHolder.m138943c().mo123620b();
            }
            arrayList.add(new C18093b(fVar));
            this.f43037f = arrayList;
        }
        if (this.f43039h != null) {
            Iterator<AbstractC22043e.AbstractC22044a> it = this.f43037f.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AbstractC22043e.AbstractC22044a next = it.next();
                if (next instanceof C33655r) {
                    ((C33655r) next).f79851a = this.f43039h;
                    break;
                }
            }
        }
        return new C18103h(this);
    }

    /* renamed from: a */
    public final AbstractC18096e mo28824a(AbstractC18185b bVar) {
        this.f43041j.mo29023a(bVar);
        return this;
    }

    @Override // com.bytedance.ies.ugc.aweme.network.AbstractC18096e
    /* renamed from: a */
    public final AbstractC18096e mo28825a(AbstractC22021a aVar) {
        this.f43036e.add(aVar);
        return this;
    }

    @Override // com.bytedance.ies.ugc.aweme.network.AbstractC18096e
    /* renamed from: a */
    public final AbstractC18096e mo28826a(AbstractC33621d dVar) {
        this.f43039h = dVar;
        return this;
    }

    @Override // com.bytedance.ies.ugc.aweme.network.AbstractC18096e
    /* renamed from: a */
    public final AbstractC18096e mo28827a(Object obj) {
        this.f43040i = obj;
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C18077a aVar = (C18077a) obj;
            if (this.f43033b == aVar.f43033b && this.f43034c == aVar.f43034c && this.f43032a.equals(aVar.f43032a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    C18077a(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C33610b());
        arrayList.add(new C33627f());
        arrayList.add(new C33624e());
        arrayList.add(C22042h.m41421a());
        arrayList.add(new C33602a((byte) 0));
        this.f43038g = arrayList;
        this.f43039h = null;
        this.f43041j = new NetworkPartnerGroup();
        this.f43042k = 0;
        this.f43032a = str;
    }

    @Override // com.bytedance.ies.ugc.aweme.network.AbstractC18096e
    /* renamed from: a */
    public final AbstractC18096e mo28828a(List<AbstractC22021a> list) {
        this.f43036e.addAll(list);
        return this;
    }

    @Override // com.bytedance.ies.ugc.aweme.network.AbstractC18096e
    /* renamed from: a */
    public final AbstractC18096e mo28829a(boolean z) {
        if (!z) {
            this.f43034c = true;
        }
        return this;
    }
}
