package com.bytedance.ies.sdk.datachannel;

import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1213t;
import androidx.lifecycle.LiveData;
import com.bytedance.covode.number.Covode;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

public final class DataChannel extends BaseDataChannel {

    /* renamed from: e */
    public static final C17840a f42556e = new C17840a((byte) 0);

    /* renamed from: d */
    public AbstractC1204m f42557d;

    static {
        Covode.recordClassIndex(20406);
    }

    /* renamed from: com.bytedance.ies.sdk.datachannel.DataChannel$a */
    public static final class C17840a {
        static {
            Covode.recordClassIndex(20407);
        }

        private C17840a() {
        }

        public /* synthetic */ C17840a(byte b) {
            this();
        }

        /* renamed from: a */
        public static DataChannel m33044a(C1175ad adVar, AbstractC1204m mVar) {
            C89219l.m154719c(adVar, "");
            C89219l.m154719c(mVar, "");
            AbstractC1174ac a = adVar.mo3983a(DataChannel.class);
            C89219l.m154709a((Object) a, "");
            DataChannel dataChannel = (DataChannel) a;
            dataChannel.f42557d = mVar;
            return dataChannel;
        }
    }

    /* renamed from: b */
    public final DataChannel mo28316b(Object obj) {
        C89219l.m154719c(obj, "");
        mo28306a(obj);
        return this;
    }

    /* renamed from: c */
    public final <T extends C17848h<C89391z>> DataChannel mo28319c(Class<T> cls) {
        C89219l.m154719c(cls, "");
        if (mo28308a()) {
            LiveData liveData = (LiveData) mo28305a((Class) cls);
            if (liveData != null) {
                liveData.postValue(C89391z.f203057a);
            }
        } else {
            C1213t tVar = (C1213t) mo28305a((Class) cls);
            if (tVar != null) {
                tVar.setValue(C89391z.f203057a);
            }
        }
        return this;
    }

    /* renamed from: b */
    public final <T extends AbstractC17847g<O>, O> O mo28318b(Class<T> cls) {
        C89219l.m154719c(cls, "");
        AbstractC17847g gVar = (AbstractC17847g) mo28305a((Class) cls);
        if (gVar != null) {
            return (O) gVar.getValue();
        }
        return null;
    }

    /* renamed from: a */
    public final <T extends C17853m<O>, O> DataChannel mo28310a(Class<T> cls, AbstractC89172b<? super O, C89391z> bVar) {
        C89219l.m154719c(cls, "");
        C89219l.m154719c(bVar, "");
        AbstractC1204m mVar = this.f42557d;
        if (mVar == null) {
            C89219l.m154710a("lifecycleOwner");
        }
        m33031a(cls, mVar, false, bVar);
        return this;
    }

    /* renamed from: b */
    public final <T extends C17853m<O>, O> DataChannel mo28314b(Class<T> cls, AbstractC89172b<? super O, C89391z> bVar) {
        C89219l.m154719c(cls, "");
        C89219l.m154719c(bVar, "");
        AbstractC1204m mVar = this.f42557d;
        if (mVar == null) {
            C89219l.m154710a("lifecycleOwner");
        }
        m33031a(cls, mVar, true, bVar);
        return this;
    }

    /* renamed from: a */
    public final <T extends C17844d<O>, O> DataChannel mo28311a(Class<T> cls, O o) {
        C89219l.m154719c(cls, "");
        C17841a aVar = (C17841a) mo28305a((Class) cls);
        if (aVar != null) {
            aVar.f42559a = o;
        }
        return this;
    }

    /* renamed from: b */
    public final <T extends C17843c<O>, O> DataChannel mo28315b(Class<T> cls, O o) {
        C89219l.m154719c(cls, "");
        if (mo28308a()) {
            LiveData liveData = (LiveData) mo28305a((Class) cls);
            if (liveData != null) {
                liveData.postValue(o);
            }
        } else {
            C1213t tVar = (C1213t) mo28305a((Class) cls);
            if (tVar != null) {
                tVar.setValue(o);
            }
        }
        return this;
    }

    /* renamed from: c */
    public final <T extends C17848h<O>, O> DataChannel mo28320c(Class<T> cls, O o) {
        C89219l.m154719c(cls, "");
        if (mo28308a()) {
            LiveData liveData = (LiveData) mo28305a((Class) cls);
            if (liveData != null) {
                liveData.postValue(o);
            }
        } else {
            C1213t tVar = (C1213t) mo28305a((Class) cls);
            if (tVar != null) {
                tVar.setValue(o);
            }
        }
        return this;
    }

    /* renamed from: a */
    public final <T extends C17853m<O>, O> DataChannel mo28309a(AbstractC1204m mVar, Class<T> cls, AbstractC89172b<? super O, C89391z> bVar) {
        C89219l.m154719c(cls, "");
        C89219l.m154719c(bVar, "");
        if (mVar == null && (mVar = this.f42557d) == null) {
            C89219l.m154710a("lifecycleOwner");
        }
        m33031a(cls, mVar, false, bVar);
        return this;
    }

    /* renamed from: b */
    public final <T extends C17853m<O>, O> DataChannel mo28313b(AbstractC1204m mVar, Class<T> cls, AbstractC89172b<? super O, C89391z> bVar) {
        C89219l.m154719c(cls, "");
        C89219l.m154719c(bVar, "");
        if (mVar == null && (mVar = this.f42557d) == null) {
            C89219l.m154710a("lifecycleOwner");
        }
        m33031a(cls, mVar, true, bVar);
        return this;
    }

    /* renamed from: a */
    public final <T extends C17853m<O>, O> DataChannel mo28312a(Object obj, Class<T> cls, AbstractC89172b<? super O, C89391z> bVar) {
        C89219l.m154719c(obj, "");
        C89219l.m154719c(cls, "");
        C89219l.m154719c(bVar, "");
        mo28307a(obj, null, cls, false, bVar);
        return this;
    }

    /* renamed from: b */
    public final <T extends C17853m<O>, O> DataChannel mo28317b(Object obj, Class<T> cls, AbstractC89172b<? super O, C89391z> bVar) {
        C89219l.m154719c(obj, "");
        C89219l.m154719c(cls, "");
        C89219l.m154719c(bVar, "");
        mo28307a(obj, null, cls, true, bVar);
        return this;
    }

    /* renamed from: a */
    private final <T extends C17853m<O>, O> void m33031a(Class<T> cls, AbstractC1204m mVar, boolean z, AbstractC89172b<? super O, C89391z> bVar) {
        C17853m mVar2 = (C17853m) mo28305a((Class) cls);
        if (mVar2 != null) {
            mVar2.mo28331a(mVar, bVar, z);
        }
    }
}
