package com.bytedance.als;

import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.als.h */
public class C2560h<T> {

    /* renamed from: a */
    public C1213t<T> f7727a;

    static {
        Covode.recordClassIndex(2945);
    }

    /* renamed from: a */
    public final T mo7034a() {
        return this.f7727a.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo7019b(T t) {
        this.f7727a.setValue(t);
    }

    public C2560h(T t) {
        C1213t<T> tVar = new C1213t<>();
        this.f7727a = tVar;
        tVar.setValue(t);
    }

    /* renamed from: a */
    public final void mo7035a(AbstractC1204m mVar) {
        this.f7727a.removeObservers(mVar);
    }

    /* renamed from: a */
    public final void mo7037a(AbstractC2565m<T> mVar) {
        this.f7727a.removeObserver(mVar);
    }

    /* renamed from: a */
    public void mo7018a(T t) {
        this.f7727a.postValue(t);
    }

    /* renamed from: b */
    public final void mo7038b(AbstractC1204m mVar, AbstractC2565m<T> mVar2) {
        this.f7727a.observe(mVar, new C2561i(mVar2));
    }

    /* renamed from: a */
    public final void mo7036a(AbstractC1204m mVar, AbstractC2565m<T> mVar2) {
        this.f7727a.observe(mVar, mVar2);
    }
}
