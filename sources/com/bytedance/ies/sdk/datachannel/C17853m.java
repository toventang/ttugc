package com.bytedance.ies.sdk.datachannel;

import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.sdk.datachannel.m */
public class C17853m<T> extends C1213t<T> implements AbstractC17856o<T> {

    /* renamed from: c */
    public static final C17854a f42561c = new C17854a((byte) 0);

    /* renamed from: a */
    private final Map<AbstractC89172b<T, C89391z>, C17855n<T>> f42562a = new HashMap();

    /* renamed from: b */
    public int f42563b = -1;

    /* renamed from: d */
    private T f42564d;

    static {
        Covode.recordClassIndex(20421);
    }

    /* renamed from: com.bytedance.ies.sdk.datachannel.m$a */
    public static final class C17854a {
        static {
            Covode.recordClassIndex(20422);
        }

        private C17854a() {
        }

        public /* synthetic */ C17854a(byte b) {
            this();
        }
    }

    public C17853m() {
    }

    @Override // androidx.lifecycle.LiveData
    public T getValue() {
        T t = (T) super.getValue();
        if (t == null) {
            return this.f42564d;
        }
        return t;
    }

    @Override // androidx.lifecycle.LiveData, androidx.lifecycle.C1213t
    public void postValue(T t) {
        if (t != null) {
            super.postValue(t);
        }
    }

    @Override // androidx.lifecycle.LiveData, androidx.lifecycle.C1213t
    public final void setValue(T t) {
        if (t != null) {
            this.f42563b++;
            super.setValue(t);
        }
    }

    public C17853m(T t) {
        this.f42564d = t;
    }

    @Override // androidx.lifecycle.LiveData
    public void removeObserver(AbstractC1214u<? super T> uVar) {
        C89219l.m154719c(uVar, "");
        super.removeObserver(uVar);
        if (uVar instanceof C17855n) {
            for (Map.Entry<AbstractC89172b<T, C89391z>, C17855n<T>> entry : this.f42562a.entrySet()) {
                AbstractC89172b<T, C89391z> key = entry.getKey();
                if (C89219l.m154714a(uVar, entry.getValue())) {
                    if (key != null) {
                        this.f42562a.remove(key);
                        return;
                    }
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public final C17855n<T> mo28332a(AbstractC89172b<? super T, C89391z> bVar, boolean z) {
        C89219l.m154719c(bVar, "");
        if (this.f42562a.containsKey(bVar)) {
            C17855n<T> nVar = this.f42562a.get(bVar);
            if (nVar == null) {
                C89219l.m154707a();
            }
            return nVar;
        }
        C17855n<T> nVar2 = new C17855n<>(bVar, z, this);
        this.f42562a.put(bVar, nVar2);
        super.observeForever(nVar2);
        return nVar2;
    }

    /* renamed from: a */
    public final C17855n<T> mo28331a(AbstractC1204m mVar, AbstractC89172b<? super T, C89391z> bVar, boolean z) {
        C89219l.m154719c(mVar, "");
        C89219l.m154719c(bVar, "");
        if (this.f42562a.containsKey(bVar)) {
            C17855n<T> nVar = this.f42562a.get(bVar);
            if (nVar == null) {
                C89219l.m154707a();
            }
            return nVar;
        }
        C17855n<T> nVar2 = new C17855n<>(bVar, z, this);
        this.f42562a.put(bVar, nVar2);
        super.observe(mVar, nVar2);
        return nVar2;
    }
}
