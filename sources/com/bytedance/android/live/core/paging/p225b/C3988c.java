package com.bytedance.android.live.core.paging.p225b;

import androidx.lifecycle.C1213t;
import androidx.p053i.AbstractC1036i;
import com.bytedance.android.live.base.model.p181c.C2965a;
import com.bytedance.android.live.core.p210a.AbstractC3827a;
import com.bytedance.android.live.core.p210a.AbstractC3838b;
import com.bytedance.android.live.core.p215e.C3884b;
import com.bytedance.android.live.core.paging.p226c.AbstractC3992b;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicLong;
import p4560f.p4561a.p4591l.C88960c;

/* renamed from: com.bytedance.android.live.core.paging.b.c */
public final class C3988c<CacheKey, V> implements AbstractC3986a<V> {

    /* renamed from: p */
    private static final AbstractC1036i.C1042d f10914p;

    /* renamed from: a */
    public C1213t<C3884b> f10915a = new C1213t<>();

    /* renamed from: b */
    public C1213t<C3884b> f10916b = new C1213t<>();

    /* renamed from: c */
    public C1213t<Boolean> f10917c = new C1213t<>();

    /* renamed from: d */
    public C1213t<Boolean> f10918d = new C1213t<>();

    /* renamed from: e */
    public C88960c<Object> f10919e = new C88960c<>();

    /* renamed from: f */
    public C88960c<Object> f10920f = new C88960c<>();

    /* renamed from: g */
    public C88960c<Object> f10921g = new C88960c<>();

    /* renamed from: h */
    public volatile boolean f10922h = false;

    /* renamed from: i */
    public volatile boolean f10923i = false;

    /* renamed from: j */
    public AtomicLong f10924j = new AtomicLong(0);

    /* renamed from: k */
    public CacheKey f10925k;

    /* renamed from: l */
    public AbstractC3838b<CacheKey, V> f10926l;

    /* renamed from: m */
    public AbstractC3827a<CacheKey, C2965a> f10927m;

    /* renamed from: n */
    public AbstractC1036i.C1042d f10928n = f10914p;

    /* renamed from: o */
    public AbstractC3992b<V> f10929o;

    /* renamed from: q */
    private C1213t<Integer> f10930q = new C1213t<>();

    @Override // com.bytedance.android.live.core.paging.p225b.AbstractC3986a
    /* renamed from: a */
    public final C1213t<C3884b> mo9353a() {
        return this.f10915a;
    }

    @Override // com.bytedance.android.live.core.paging.p225b.AbstractC3986a
    /* renamed from: b */
    public final C1213t<C3884b> mo9354b() {
        return this.f10916b;
    }

    @Override // com.bytedance.android.live.core.paging.p225b.AbstractC3986a
    /* renamed from: c */
    public final C1213t<Boolean> mo9355c() {
        return this.f10917c;
    }

    @Override // com.bytedance.android.live.core.paging.p225b.AbstractC3986a
    /* renamed from: d */
    public final C1213t<Boolean> mo9356d() {
        return this.f10918d;
    }

    @Override // com.bytedance.android.live.core.paging.p225b.AbstractC3986a
    /* renamed from: e */
    public final C88960c<Object> mo9357e() {
        return this.f10919e;
    }

    @Override // com.bytedance.android.live.core.paging.p225b.AbstractC3986a
    /* renamed from: f */
    public final C88960c<Object> mo9358f() {
        return this.f10920f;
    }

    @Override // com.bytedance.android.live.core.paging.p225b.AbstractC3986a
    /* renamed from: g */
    public final C88960c<Object> mo9359g() {
        return this.f10921g;
    }

    @Override // com.bytedance.android.live.core.paging.p225b.AbstractC3986a
    /* renamed from: h */
    public final C1213t<Integer> mo9360h() {
        return this.f10930q;
    }

    static {
        Covode.recordClassIndex(4519);
        AbstractC1036i.C1042d.C1043a aVar = new AbstractC1036i.C1042d.C1043a();
        aVar.f3666d = false;
        aVar.f3663a = 12;
        aVar.f3664b = 12;
        f10914p = aVar.mo3756a();
    }
}
