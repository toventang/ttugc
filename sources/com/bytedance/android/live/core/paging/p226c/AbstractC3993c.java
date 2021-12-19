package com.bytedance.android.live.core.paging.p226c;

import android.os.SystemClock;
import android.util.Pair;
import androidx.lifecycle.C1213t;
import androidx.p053i.AbstractC1012d;
import androidx.p053i.AbstractC1027g;
import com.bytedance.android.live.base.model.p181c.C2965a;
import com.bytedance.android.live.core.p210a.AbstractC3827a;
import com.bytedance.android.live.core.p210a.AbstractC3838b;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p215e.C3884b;
import com.bytedance.android.live.core.paging.p225b.C3988c;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.common.utility.C13617h;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;

/* renamed from: com.bytedance.android.live.core.paging.c.c */
public abstract class AbstractC3993c<DataKey, V, CacheKey> extends AbstractC1027g<DataKey, V> implements AbstractC1012d.AbstractC1014b {

    /* renamed from: e */
    protected CacheKey f10935e;

    /* renamed from: f */
    protected AbstractC3838b<CacheKey, V> f10936f;

    /* renamed from: g */
    protected AbstractC3827a<CacheKey, C2965a> f10937g;

    /* renamed from: h */
    protected C1213t<C3884b> f10938h;

    /* renamed from: i */
    protected C1213t<C3884b> f10939i;

    /* renamed from: j */
    protected C1213t<Boolean> f10940j;

    /* renamed from: k */
    protected C1213t<Boolean> f10941k;

    /* renamed from: l */
    final C3988c<CacheKey, V> f10942l;

    /* renamed from: m */
    Runnable f10943m;

    /* renamed from: n */
    private long f10944n;

    /* renamed from: o */
    private final C88411a f10945o = new C88411a();

    static {
        Covode.recordClassIndex(4524);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract AbstractC88979t<Pair<List<V>, C2965a>> mo9361a(boolean z, DataKey datakey);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract DataKey mo9362a(C2965a aVar);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo9367a(AbstractC1027g.C1033f fVar, AbstractC1027g.AbstractC1028a aVar, Throwable th) {
        this.f10938h.postValue(C3884b.m9500a(th));
        this.f10943m = new RunnableC4005o(this, fVar, aVar);
    }

    /* renamed from: c */
    private void m9763c() {
        if (this.f10942l.f10922h) {
            m9764d();
            this.f10942l.f10922h = false;
        }
    }

    /* renamed from: d */
    private void m9764d() {
        this.f10936f.mo9207d(this.f10935e);
        this.f10937g.mo9174b(this.f10935e);
    }

    /* renamed from: e */
    private boolean m9765e() {
        boolean z;
        synchronized (this.f10942l) {
            if (this.f10944n == this.f10942l.f10924j.get()) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo9368b() {
        if (this.f10938h.getValue() == null || this.f10938h.getValue() != C3884b.f10739c) {
            mo3719f_();
        }
    }

    @Override // androidx.p053i.AbstractC1012d.AbstractC1014b
    /* renamed from: a */
    public final void mo3721a() {
        this.f10945o.mo142944a();
        mo3718b(this);
    }

    /* renamed from: a */
    private void m9762a(AbstractC88412b bVar) {
        this.f10945o.mo142945a(bVar);
    }

    public AbstractC3993c(C3988c<CacheKey, V> cVar) {
        this.f10935e = cVar.f10925k;
        this.f10936f = cVar.f10926l;
        this.f10937g = cVar.f10927m;
        this.f10939i = cVar.f10916b;
        this.f10938h = cVar.f10915a;
        this.f10940j = cVar.f10917c;
        this.f10941k = cVar.f10918d;
        this.f10942l = cVar;
        this.f10944n = cVar.f10924j.incrementAndGet();
        m9762a(cVar.f10920f.mo143254a(new C3994d(this), C3995e.f10947a));
        m9762a(cVar.f10919e.mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C3998h(this, cVar), C3999i.f10954a));
        m9762a(cVar.f10921g.mo143289d(new C4000j(this)));
        mo3717a((AbstractC1012d.AbstractC1014b) this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo9369b(AbstractC1027g.C1032e eVar, AbstractC1027g.AbstractC1030c cVar) {
        mo3734a(eVar, cVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo9370b(AbstractC1027g.C1033f fVar, AbstractC1027g.AbstractC1028a aVar) {
        mo3735a(fVar, aVar);
    }

    /* renamed from: a */
    private List<V> m9761a(List<V> list, C2965a aVar) {
        this.f10937g.mo9173a(this.f10935e, aVar);
        return this.f10936f.mo9202a(this.f10935e, (List) new ArrayList(list));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo9365a(AbstractC1027g.AbstractC1028a aVar, Pair pair) {
        boolean z;
        DataKey a = mo9362a((C2965a) pair.second);
        C1213t<Boolean> tVar = this.f10940j;
        if (a != null) {
            z = true;
        } else {
            z = false;
        }
        tVar.postValue(Boolean.valueOf(z));
        aVar.mo3736a(m9761a((List) pair.first, (C2965a) pair.second), a);
        this.f10938h.postValue(C3884b.f10740d);
    }

    @Override // androidx.p053i.AbstractC1027g
    /* renamed from: a */
    public final void mo3734a(AbstractC1027g.C1032e<DataKey> eVar, AbstractC1027g.AbstractC1030c<DataKey, V> cVar) {
        if (!m9765e()) {
            C3854a.m9453a(3, "RxCacheDataSource", "load initial not my generation ");
            return;
        }
        boolean z = false;
        if (this.f10942l.f10923i) {
            this.f10942l.f10923i = false;
            this.f10942l.f10922h = true;
        }
        this.f10939i.postValue(C3884b.f10739c);
        this.f10938h.postValue(C3884b.f10739c);
        this.f10940j.postValue(true);
        this.f10943m = null;
        List<V> b = this.f10936f.mo9205b(this.f10935e);
        if (!C13617h.m24465a(b)) {
            C2965a c = this.f10937g.mo9175c(this.f10935e);
            cVar.mo3737a(new ArrayList(b), mo9362a(c));
            if (!this.f10942l.f10922h) {
                this.f10941k.postValue(false);
                C1213t<Boolean> tVar = this.f10940j;
                if (mo9362a(c) != null) {
                    z = true;
                }
                tVar.postValue(Boolean.valueOf(z));
                this.f10939i.postValue(C3884b.f10740d);
                this.f10938h.postValue(C3884b.f10740d);
                return;
            }
        }
        AbstractC88979t<Pair<List<V>, C2965a>> a = mo9361a(true, (Object) null);
        if (a == null) {
            this.f10939i.postValue(C3884b.f10740d);
            this.f10938h.postValue(C3884b.f10740d);
            return;
        }
        m9762a(a.mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C4001k(this, SystemClock.elapsedRealtime(), cVar), new C4002l(this, eVar, cVar)));
    }

    @Override // androidx.p053i.AbstractC1027g
    /* renamed from: a */
    public final void mo3735a(AbstractC1027g.C1033f<DataKey> fVar, AbstractC1027g.AbstractC1028a<DataKey, V> aVar) {
        if (!this.f10942l.f10922h) {
            this.f10938h.postValue(C3884b.f10739c);
            this.f10943m = null;
            m9762a(mo9361a(false, (Object) fVar.f3625a).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C4003m(this, aVar), new C4004n(this, fVar, aVar)));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo9364a(long j, AbstractC1027g.AbstractC1030c cVar, Pair pair) {
        boolean z;
        C6501b.C6502a.m13948a("livesdk_live_request_response").mo12661f("click").mo12651a("enter_from_merge", "live_merge").mo12651a("enter_method", "live_cover").mo12646a("duration", SystemClock.elapsedRealtime() - j).mo12651a("request_api", "webcast/feed").mo12645a("room_num", ((List) pair.first).size()).mo12655b();
        this.f10939i.postValue(C3884b.f10740d);
        this.f10938h.postValue(C3884b.f10740d);
        if (!m9765e()) {
            C3854a.m9453a(3, "RxCacheDataSource", "on data not my generation ");
            if (this.f10942l.f10922h) {
                this.f10942l.f10922h = false;
                return;
            }
            return;
        }
        DataKey a = mo9362a((C2965a) pair.second);
        C1213t<Boolean> tVar = this.f10940j;
        boolean z2 = true;
        if (a != null) {
            z = true;
        } else {
            z = false;
        }
        tVar.postValue(Boolean.valueOf(z));
        if (!C13617h.m24465a(this.f10936f.mo9205b(this.f10935e)) || !C13617h.m24465a((List) pair.first)) {
            z2 = false;
        }
        if (!this.f10942l.f10922h || z2) {
            if (!C13617h.m24465a((List) pair.first)) {
                m9764d();
            }
            List<V> a2 = m9761a((List) pair.first, (C2965a) pair.second);
            this.f10941k.postValue(Boolean.valueOf(C13617h.m24465a(a2)));
            cVar.mo3737a(a2, a);
            this.f10942l.f10922h = false;
            return;
        }
        m9763c();
        m9761a((List) pair.first, (C2965a) pair.second);
        mo3719f_();
        this.f10941k.postValue(false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo9366a(AbstractC1027g.C1032e eVar, AbstractC1027g.AbstractC1030c cVar, Throwable th) {
        this.f10942l.f10922h = false;
        this.f10939i.postValue(C3884b.m9500a(th));
        this.f10938h.postValue(C3884b.m9500a(th));
        if (!m9765e()) {
            C3854a.m9453a(3, "RxCacheDataSource", "exception not my generation " + th.getMessage());
        } else if (this.f10942l.f10922h) {
            m9763c();
            this.f10943m = new RunnableC3996f(this);
        } else {
            this.f10943m = new RunnableC3997g(this, eVar, cVar);
        }
    }
}
