package com.bytedance.als;

import androidx.core.p036g.C0692e;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: com.bytedance.als.g */
public class C2559g<T> {

    /* renamed from: a */
    private C1213t<T> f7724a;

    /* renamed from: b */
    private final Set<AbstractC2565m<T>> f7725b = new HashSet();

    /* renamed from: c */
    private final List<C0692e<AbstractC2565m<T>, AbstractC1204m>> f7726c = new ArrayList();

    static {
        Covode.recordClassIndex(2944);
    }

    /* renamed from: a */
    public T mo6996a() {
        C1213t<T> tVar = this.f7724a;
        if (tVar != null) {
            return tVar.getValue();
        }
        return null;
    }

    /* renamed from: b */
    private void m7475b() {
        C1213t<T> tVar = this.f7724a;
        if (tVar == null) {
            this.f7724a = new C1213t<>();
        } else if (tVar.getValue() != null) {
            for (C0692e<AbstractC2565m<T>, AbstractC1204m> eVar : this.f7726c) {
                this.f7724a.removeObserver(eVar.f2750a);
            }
            this.f7724a = new C1213t<>();
            for (C0692e<AbstractC2565m<T>, AbstractC1204m> eVar2 : this.f7726c) {
                if (eVar2.f2751b != null) {
                    this.f7724a.observe(eVar2.f2751b, eVar2.f2750a);
                } else {
                    this.f7724a.observeForever(eVar2.f2750a);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6999a(T t) {
        C1213t<T> tVar = this.f7724a;
        if (tVar != null) {
            tVar.setValue(t);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo7000b(T t) {
        C1213t<T> tVar = this.f7724a;
        if (tVar != null) {
            tVar.postValue(t);
        }
    }

    /* renamed from: a */
    public void mo6998a(AbstractC2565m<T> mVar) {
        C1213t<T> tVar = this.f7724a;
        if (tVar != null) {
            tVar.removeObserver(mVar);
            mo7033b((AbstractC2565m) mVar);
        }
    }

    /* renamed from: b */
    public final void mo7033b(AbstractC2565m<T> mVar) {
        this.f7725b.remove(mVar);
        Iterator<C0692e<AbstractC2565m<T>, AbstractC1204m>> it = this.f7726c.iterator();
        while (true) {
            if (it.hasNext()) {
                if (it.next().f2750a == mVar) {
                    it.remove();
                    break;
                }
            } else {
                break;
            }
        }
        C1213t<T> tVar = this.f7724a;
        if (tVar != null && !tVar.hasObservers()) {
            this.f7724a = null;
        }
    }

    /* renamed from: a */
    public void mo6997a(AbstractC1204m mVar, AbstractC2565m<T> mVar2) {
        if (mVar.getLifecycle().mo4011a() != AbstractC1196i.EnumC1199b.DESTROYED) {
            if (!this.f7725b.contains(mVar2)) {
                this.f7725b.add(mVar2);
                m7475b();
                this.f7726c.add(C0692e.m2449a(mVar2, mVar));
                this.f7724a.observe(mVar, mVar2);
                mVar.getLifecycle().mo4012a(new LiveEvent$1(this, mVar2));
                return;
            }
            throw new IllegalArgumentException("Can't add the same observer twice");
        }
    }
}
