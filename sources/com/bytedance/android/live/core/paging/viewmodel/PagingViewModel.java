package com.bytedance.android.live.core.paging.viewmodel;

import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1213t;
import androidx.p053i.AbstractC1036i;
import com.bytedance.android.live.core.p215e.C3884b;
import com.bytedance.android.live.core.paging.AbstractC3985b;
import com.bytedance.android.livesdk.util.rxutils.RxViewModel;
import com.bytedance.covode.number.Covode;

public class PagingViewModel<T> extends RxViewModel {

    /* renamed from: a */
    private final AbstractC1214u<C3884b> f10971a = new C4006a(this);

    /* renamed from: b */
    public C1213t<C3884b> f10972b = new C1213t<>();

    /* renamed from: c */
    public C1213t<C3884b> f10973c = new C1213t<>();

    /* renamed from: d */
    public C1213t<Boolean> f10974d = new C1213t<>();

    /* renamed from: e */
    public C1213t<Boolean> f10975e = new C1213t<>();

    /* renamed from: f */
    public C1213t<Integer> f10976f = new C1213t<>();

    /* renamed from: g */
    public C1213t<AbstractC1036i<T>> f10977g = new C1213t<>();

    /* renamed from: h */
    public AbstractC3985b<T> f10978h;

    /* renamed from: i */
    private final AbstractC1214u<C3884b> f10979i = new C4007b(this);

    /* renamed from: j */
    private final AbstractC1214u<AbstractC1036i<T>> f10980j = new C4008c(this);

    /* renamed from: k */
    private final AbstractC1214u<Boolean> f10981k = new C4009d(this);

    /* renamed from: l */
    private final AbstractC1214u<Boolean> f10982l = new C4010e(this);

    /* renamed from: m */
    private final AbstractC1214u<Integer> f10983m = new C4011f(this);

    static {
        Covode.recordClassIndex(4538);
    }

    /* renamed from: b */
    public void mo9376b() {
        AbstractC3985b<T> bVar = this.f10978h;
        if (bVar != null) {
            bVar.mo9324g();
        }
    }

    /* renamed from: a */
    public boolean mo9375a() {
        AbstractC3985b<T> bVar;
        if ((this.f10973c.getValue() != null && this.f10973c.getValue().mo9243a()) || (bVar = this.f10978h) == null) {
            return false;
        }
        bVar.mo9323f();
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo9374a(AbstractC3985b<T> bVar) {
        AbstractC3985b<T> bVar2 = this.f10978h;
        if (bVar2 != null) {
            bVar2.mo9319b().removeObserver(this.f10971a);
            this.f10978h.mo9320c().removeObserver(this.f10979i);
            this.f10978h.mo9318a().removeObserver(this.f10980j);
            this.f10978h.mo9322e().removeObserver(this.f10981k);
            this.f10978h.mo9321d().removeObserver(this.f10982l);
            this.f10978h.mo9326i().removeObserver(this.f10983m);
        }
        this.f10978h = bVar;
        if (bVar != null) {
            bVar.mo9319b().observeForever(this.f10971a);
            this.f10978h.mo9320c().observeForever(this.f10979i);
            this.f10978h.mo9318a().observeForever(this.f10980j);
            this.f10978h.mo9322e().observeForever(this.f10981k);
            this.f10978h.mo9321d().observeForever(this.f10982l);
            this.f10978h.mo9326i().observeForever(this.f10983m);
        }
    }
}
