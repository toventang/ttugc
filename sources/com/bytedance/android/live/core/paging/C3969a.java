package com.bytedance.android.live.core.paging;

import androidx.lifecycle.C1213t;
import androidx.lifecycle.LiveData;
import androidx.p053i.AbstractC1036i;
import com.bytedance.android.live.core.p215e.C3884b;
import com.bytedance.android.live.core.paging.p225b.AbstractC3986a;
import com.bytedance.android.livesdk.util.rxutils.C11195i;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4591l.C88960c;

/* renamed from: com.bytedance.android.live.core.paging.a */
public class C3969a<T> implements AbstractC3985b<T> {

    /* renamed from: a */
    private LiveData<AbstractC1036i<T>> f10872a;

    /* renamed from: b */
    private C1213t<C3884b> f10873b;

    /* renamed from: c */
    private C1213t<C3884b> f10874c;

    /* renamed from: d */
    private C1213t<Boolean> f10875d;

    /* renamed from: e */
    private C88960c<Object> f10876e;

    /* renamed from: f */
    private C88960c<Object> f10877f;

    /* renamed from: g */
    private C88960c<Object> f10878g;

    /* renamed from: h */
    private C1213t<Integer> f10879h;

    /* renamed from: i */
    private C1213t<Boolean> f10880i;

    static {
        Covode.recordClassIndex(4500);
    }

    @Override // com.bytedance.android.live.core.paging.AbstractC3985b
    /* renamed from: a */
    public final LiveData<AbstractC1036i<T>> mo9318a() {
        return this.f10872a;
    }

    @Override // com.bytedance.android.live.core.paging.AbstractC3985b
    /* renamed from: b */
    public final LiveData<C3884b> mo9319b() {
        return this.f10873b;
    }

    @Override // com.bytedance.android.live.core.paging.AbstractC3985b
    /* renamed from: c */
    public final LiveData<C3884b> mo9320c() {
        return this.f10874c;
    }

    @Override // com.bytedance.android.live.core.paging.AbstractC3985b
    /* renamed from: d */
    public final LiveData<Boolean> mo9321d() {
        return this.f10880i;
    }

    @Override // com.bytedance.android.live.core.paging.AbstractC3985b
    /* renamed from: e */
    public final LiveData<Boolean> mo9322e() {
        return this.f10875d;
    }

    @Override // com.bytedance.android.live.core.paging.AbstractC3985b
    /* renamed from: i */
    public final LiveData<Integer> mo9326i() {
        return this.f10879h;
    }

    @Override // com.bytedance.android.live.core.paging.AbstractC3985b
    /* renamed from: f */
    public final void mo9323f() {
        this.f10876e.onNext(C11195i.f26825c);
    }

    @Override // com.bytedance.android.live.core.paging.AbstractC3985b
    /* renamed from: g */
    public final void mo9324g() {
        this.f10877f.onNext(C11195i.f26825c);
    }

    @Override // com.bytedance.android.live.core.paging.AbstractC3985b
    /* renamed from: h */
    public final void mo9325h() {
        this.f10878g.onNext(C11195i.f26825c);
    }

    @Override // com.bytedance.android.live.core.paging.AbstractC3985b
    /* renamed from: j */
    public void mo9327j() {
        throw new RuntimeException("unsupported operation");
    }

    @Override // com.bytedance.android.live.core.paging.AbstractC3985b
    /* renamed from: k */
    public int mo9328k() {
        throw new RuntimeException("unsupported operation");
    }

    public C3969a(AbstractC3986a<T> aVar, LiveData<AbstractC1036i<T>> liveData) {
        this.f10873b = aVar.mo9353a();
        this.f10874c = aVar.mo9354b();
        this.f10880i = aVar.mo9355c();
        this.f10876e = aVar.mo9357e();
        this.f10877f = aVar.mo9358f();
        this.f10878g = aVar.mo9359g();
        this.f10872a = liveData;
        this.f10875d = aVar.mo9356d();
        this.f10879h = aVar.mo9360h();
    }
}
