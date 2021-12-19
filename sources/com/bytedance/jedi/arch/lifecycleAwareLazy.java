package com.bytedance.jedi.arch;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import androidx.lifecycle.C1182af;
import androidx.lifecycle.C1184ah;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.Serializable;
import p4600h.AbstractC89244h;
import p4600h.C89388w;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

public class lifecycleAwareLazy<T extends AbstractC1174ac> implements AbstractC89244h<T>, Serializable, Serializable {

    /* renamed from: a */
    private AbstractC89171a<? extends T> f48600a;

    /* renamed from: b */
    private volatile Object f48601b;

    /* renamed from: c */
    private final lifecycleAwareLazy<T> f48602c;

    /* renamed from: d */
    private final AbstractC1204m f48603d;

    /* renamed from: e */
    private final AbstractC89171a<String> f48604e;

    static {
        Covode.recordClassIndex(24046);
    }

    public static /* synthetic */ void value$annotations() {
    }

    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_CREATE) {
            onStart();
        }
    }

    @Override // p4600h.AbstractC89244h
    public boolean isInitialized() {
        if (this.f48601b != C20378ap.f48272a) {
            return true;
        }
        return false;
    }

    public String toString() {
        if (isInitialized()) {
            return getValue().toString();
        }
        return "Lazy value not initialized yet.";
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_CREATE)
    public final void onStart() {
        if (!isInitialized()) {
            getValue();
        }
        if (this.f48604e == null) {
            this.f48603d.getLifecycle().mo4013b(this);
        } else {
            mo33796a(this.f48603d, getValue(), this.f48604e);
        }
    }

    @Override // p4600h.AbstractC89244h
    public T getValue() {
        T t;
        MethodCollector.m26663i(8044);
        Object obj = this.f48601b;
        if (obj == C20378ap.f48272a) {
            synchronized (this.f48602c) {
                try {
                    Object obj2 = this.f48601b;
                    if (obj2 == C20378ap.f48272a) {
                        AbstractC89171a<? extends T> aVar = this.f48600a;
                        if (aVar == null) {
                            C89219l.m154707a();
                        }
                        t = (T) ((AbstractC1174ac) aVar.invoke());
                        this.f48601b = t;
                        this.f48600a = null;
                    } else if (obj2 != null) {
                        t = (T) ((AbstractC1174ac) obj2);
                    } else {
                        C89388w wVar = new C89388w("null cannot be cast to non-null type");
                        MethodCollector.m26664o(8044);
                        throw wVar;
                    }
                } finally {
                    MethodCollector.m26664o(8044);
                }
            }
            return t;
        } else if (obj != null) {
            T t2 = (T) ((AbstractC1174ac) obj);
            MethodCollector.m26664o(8044);
            return t2;
        } else {
            C89388w wVar2 = new C89388w("null cannot be cast to non-null type");
            MethodCollector.m26664o(8044);
            throw wVar2;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public lifecycleAwareLazy(AbstractC1204m mVar, AbstractC89171a<? extends T> aVar) {
        this(mVar, null, aVar);
        C89219l.m154719c(mVar, "");
        C89219l.m154719c(aVar, "");
    }

    public lifecycleAwareLazy(AbstractC1204m mVar, AbstractC89171a<String> aVar, AbstractC89171a<? extends T> aVar2) {
        C89219l.m154719c(mVar, "");
        C89219l.m154719c(aVar2, "");
        this.f48603d = mVar;
        this.f48604e = aVar;
        this.f48600a = aVar2;
        this.f48601b = C20378ap.f48272a;
        this.f48602c = this;
        mVar.getLifecycle().mo4012a(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo33796a(AbstractC1204m mVar, T t, AbstractC89171a<String> aVar) {
        C89219l.m154719c(mVar, "");
        C89219l.m154719c(t, "");
        C89219l.m154719c(aVar, "");
        Fragment fragment = (Fragment) mVar;
        C89219l.m154719c(fragment, "");
        C89219l.m154719c(t, "");
        C89219l.m154719c(aVar, "");
        C1182af a = C1184ah.m3885a(fragment);
        C89219l.m154709a((Object) a, "");
        String invoke = aVar.invoke();
        if (a.mo3996a(invoke) == null) {
            a.mo3998a(invoke, t);
        }
    }
}
