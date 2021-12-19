package com.bytedance.ies.sdk.datachannel;

import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1213t;
import androidx.lifecycle.LiveData;
import com.bytedance.covode.number.Covode;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

public final class DataChannelGlobal extends BaseDataChannel {

    /* renamed from: d */
    public static final DataChannelGlobal f42558d = new DataChannelGlobal();

    private DataChannelGlobal() {
    }

    static {
        Covode.recordClassIndex(20408);
    }

    @Override // com.bytedance.ies.sdk.datachannel.BaseDataChannel, androidx.lifecycle.AbstractC1174ac
    public final void onCleared() {
        super.onCleared();
        this.f42552b.clear();
        this.f42553c.clear();
    }

    /* renamed from: b */
    public final void mo28326b(Object obj) {
        C89219l.m154719c(obj, "");
        mo28306a(obj);
    }

    /* renamed from: c */
    public final <T extends C17850j<O>, O> void mo28327c(Class<T> cls) {
        C89219l.m154719c(cls, "");
        this.f42552b.remove(cls);
    }

    /* renamed from: b */
    public final <T extends AbstractC17851k<O>, O> O mo28324b(Class<T> cls) {
        C89219l.m154719c(cls, "");
        AbstractC17851k kVar = (AbstractC17851k) mo28305a((Class) cls);
        if (kVar != null) {
            return (O) kVar.getValue();
        }
        return null;
    }

    /* renamed from: d */
    public final <T extends C17852l<C89391z>> void mo28329d(Class<T> cls) {
        C89219l.m154719c(cls, "");
        if (mo28308a()) {
            LiveData liveData = (LiveData) mo28305a((Class) cls);
            if (liveData != null) {
                liveData.postValue(C89391z.f203057a);
                return;
            }
            return;
        }
        C1213t tVar = (C1213t) mo28305a((Class) cls);
        if (tVar != null) {
            tVar.setValue(C89391z.f203057a);
        }
    }

    /* renamed from: a */
    public final <T extends C17850j<O>, O> void mo28321a(Class<T> cls, O o) {
        C89219l.m154719c(cls, "");
        C17841a aVar = (C17841a) mo28305a((Class) cls);
        if (aVar != null) {
            aVar.f42559a = o;
        }
    }

    /* renamed from: b */
    public final <T extends C17849i<O>, O> void mo28325b(Class<T> cls, O o) {
        C89219l.m154719c(cls, "");
        if (mo28308a()) {
            LiveData liveData = (LiveData) mo28305a((Class) cls);
            if (liveData != null) {
                liveData.postValue(o);
                return;
            }
            return;
        }
        C1213t tVar = (C1213t) mo28305a((Class) cls);
        if (tVar != null) {
            tVar.setValue(o);
        }
    }

    /* renamed from: c */
    public final <T extends C17852l<O>, O> void mo28328c(Class<T> cls, O o) {
        C89219l.m154719c(cls, "");
        if (mo28308a()) {
            LiveData liveData = (LiveData) mo28305a((Class) cls);
            if (liveData != null) {
                liveData.postValue(o);
                return;
            }
            return;
        }
        C1213t tVar = (C1213t) mo28305a((Class) cls);
        if (tVar != null) {
            tVar.setValue(o);
        }
    }

    /* renamed from: a */
    public final <T extends C17853m<O>, O> void mo28323a(Object obj, Class<T> cls, AbstractC89172b<? super O, C89391z> bVar) {
        C89219l.m154719c(obj, "");
        C89219l.m154719c(cls, "");
        C89219l.m154719c(bVar, "");
        mo28307a(obj, null, cls, false, bVar);
    }

    /* renamed from: a */
    public final <T extends C17853m<O>, O> void mo28322a(Object obj, AbstractC1204m mVar, Class<T> cls, AbstractC89172b<? super O, C89391z> bVar) {
        C89219l.m154719c(obj, "");
        C89219l.m154719c(mVar, "");
        C89219l.m154719c(cls, "");
        C89219l.m154719c(bVar, "");
        mo28307a(obj, mVar, cls, false, bVar);
    }
}
