package com.bytedance.assem.arch.core;

import android.os.Looper;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1169aa;
import androidx.lifecycle.C1213t;
import androidx.lifecycle.LiveData;
import com.bytedance.assem.arch.extensions.AbstractC12789k;
import com.bytedance.assem.arch.extensions.C12787j;
import com.bytedance.assem.arch.service.AbstractC12798a;
import com.bytedance.assem.arch.service.AbstractC12799b;
import com.bytedance.assem.arch.service.AbstractC12800c;
import com.bytedance.covode.number.Covode;
import java.util.LinkedHashMap;
import java.util.Map;
import p4600h.C89388w;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.assem.arch.core.e */
public final class C12753e {

    /* renamed from: b */
    public static final C12754a f31015b = new C12754a((byte) 0);

    /* renamed from: a */
    public final Map<C12765o, AbstractC12800c> f31016a;

    /* renamed from: c */
    private final Map<C12765o, C1213t<? extends AbstractC12798a>> f31017c;

    /* renamed from: d */
    private final C12753e f31018d;

    static {
        Covode.recordClassIndex(14577);
    }

    /* renamed from: com.bytedance.assem.arch.core.e$a */
    public static final class C12754a {
        static {
            Covode.recordClassIndex(14578);
        }

        private C12754a() {
        }

        public /* synthetic */ C12754a(byte b) {
            this();
        }
    }

    private /* synthetic */ C12753e() {
        this(null);
    }

    /* renamed from: a */
    public final void mo20609a() {
        this.f31016a.clear();
        this.f31017c.clear();
    }

    /* renamed from: com.bytedance.assem.arch.core.e$b */
    static final class C12755b<T> implements AbstractC1214u<T> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89172b f31019a;

        /* renamed from: b */
        final /* synthetic */ AbstractC1204m f31020b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89172b f31021c;

        static {
            Covode.recordClassIndex(14579);
        }

        C12755b(AbstractC89172b bVar, AbstractC1204m mVar, AbstractC89172b bVar2) {
            this.f31019a = bVar;
            this.f31020b = mVar;
            this.f31021c = bVar2;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final void onChanged(T t) {
            AbstractC89172b bVar = this.f31021c;
            if (bVar != null) {
                bVar.invoke(t);
            }
        }
    }

    public C12753e(C12753e eVar) {
        this.f31018d = eVar;
        this.f31016a = new LinkedHashMap();
        this.f31017c = new LinkedHashMap();
    }

    /* renamed from: a */
    public final <DATA extends AbstractC12798a> DATA mo20607a(Class<? extends AbstractC12799b<DATA>> cls) {
        C89219l.m154719c(cls, "");
        C12765o oVar = new C12765o(cls, null);
        for (C12753e eVar = this; eVar != null; eVar = eVar.f31018d) {
            if (eVar.f31017c.containsKey(oVar)) {
                C1213t<? extends AbstractC12798a> tVar = eVar.f31017c.get(oVar);
                DATA data = tVar != null ? (DATA) ((AbstractC12798a) tVar.getValue()) : null;
                if (!(data instanceof AbstractC12798a)) {
                    return null;
                }
                return data;
            }
        }
        return null;
    }

    /* renamed from: b */
    public final <SERVICE extends AbstractC12799b<?>> SERVICE mo20614b(Class<SERVICE> cls, String str) {
        C89219l.m154719c(cls, "");
        C12765o oVar = new C12765o(cls, null);
        for (C12753e eVar = this; eVar != null; eVar = eVar.f31018d) {
            if (eVar.f31016a.containsKey(oVar)) {
                AbstractC12800c cVar = eVar.f31016a.get(oVar);
                if (cVar != null) {
                    return (SERVICE) ((AbstractC12799b) cVar);
                }
                throw new C89388w("null cannot be cast to non-null type");
            }
        }
        return null;
    }

    /* renamed from: a */
    public final <SERVICE extends AbstractC12800c> SERVICE mo20608a(Class<SERVICE> cls, String str) {
        C89219l.m154719c(cls, "");
        C12765o oVar = new C12765o(cls, null);
        for (C12753e eVar = this; eVar != null; eVar = eVar.f31018d) {
            if (eVar.f31016a.containsKey(oVar)) {
                AbstractC12800c cVar = eVar.f31016a.get(oVar);
                if (cVar != null) {
                    return (SERVICE) cVar;
                }
                throw new C89388w("null cannot be cast to non-null type");
            }
        }
        return null;
    }

    /* renamed from: b */
    public final void mo20615b(Class<?> cls, AbstractC12800c cVar) {
        C89219l.m154719c(cls, "");
        C89219l.m154719c(cVar, "");
        C12765o oVar = new C12765o(cls, null);
        this.f31016a.remove(oVar);
        new StringBuilder("realUnregister: clazz = ").append(cls).append(", assemService = ").append(cVar).append(", mapSize = ").append(this.f31016a.size()).append(", serviceIdentifierMap=").append(this.f31016a);
        if (cVar instanceof AbstractC12799b) {
            this.f31017c.remove(oVar);
        }
    }

    /* renamed from: a */
    public final <SERVICE extends AbstractC12800c> void mo20611a(C12765o oVar, SERVICE service) {
        C89219l.m154719c(oVar, "");
        C89219l.m154719c(service, "");
        Class<?> cls = oVar.f31045a;
        if (C89219l.m154714a(cls, AbstractC12800c.class) || C89219l.m154714a(cls, AbstractC12799b.class)) {
            throw new IllegalArgumentException("{" + cls + " - " + service + "}: AssemService or AssemObservableService can't be registered directly, use subclass instead");
        }
        new StringBuilder("realRegister: clazz = ").append(cls).append(", assemService = ").append(service).append(", mapSize = ").append(this.f31016a.size()).append(", serviceIdentifierMap=").append(this.f31016a);
        if (this.f31016a.containsKey(oVar) && service != this.f31016a.get(oVar)) {
            if (!C12787j.f31107a) {
                this.f31016a.remove(oVar);
                this.f31017c.remove(oVar);
                AbstractC12789k kVar = C12787j.f31108b;
                if (kVar != null) {
                    kVar.mo20639a("(service=" + cls + ", serviceKey =" + ((String) null) + ") has been already registered on service store. the service real instance is " + service + ", the registered service real instance is " + this.f31016a.get(oVar) + ", currentMap info is " + this.f31016a + "\",", new IllegalStateException());
                }
            } else {
                throw new IllegalStateException("(service=" + cls + ", serviceKey =" + ((String) null) + ") has been already registered on service store. the service real instance is " + service + ", the registered service real instance is " + this.f31016a.get(oVar));
            }
        }
        this.f31016a.put(oVar, service);
        if (service instanceof AbstractC12799b) {
            AbstractC12798a e = ((AbstractC12799b) service).mo20658e();
            C1213t<? extends AbstractC12798a> tVar = this.f31017c.get(oVar);
            if (tVar == null) {
                tVar = new C1213t<>();
                this.f31017c.put(oVar, tVar);
            }
            if (tVar.getValue() != null) {
                return;
            }
            if (C89219l.m154714a(Looper.getMainLooper(), Looper.myLooper())) {
                tVar.setValue(e);
            } else if (tVar instanceof C1213t) {
                tVar.postValue(e);
            }
        }
    }

    /* renamed from: a */
    public final void mo20612a(Class<?> cls, AbstractC12800c cVar) {
        C89219l.m154719c(cls, "");
        C89219l.m154719c(cVar, "");
        if (C89219l.m154714a(cls, AbstractC12800c.class) || C89219l.m154714a(cls, AbstractC12799b.class)) {
            throw new IllegalArgumentException("{" + cls + " - " + cVar + "}: AssemService or AssemObservableService can't be registered directly, use subclass instead");
        }
        C12765o oVar = new C12765o(cls, null);
        new StringBuilder("realRegister: clazz = ").append(cls).append(", assemService = ").append(cVar).append(", mapSize = ").append(this.f31016a.size()).append(", serviceIdentifierMap=").append(this.f31016a);
        if (this.f31016a.containsKey(oVar) && cVar != this.f31016a.get(oVar)) {
            if (!C12787j.f31107a) {
                this.f31016a.remove(oVar);
                this.f31017c.remove(oVar);
                AbstractC12789k kVar = C12787j.f31108b;
                if (kVar != null) {
                    kVar.mo20639a("(service=" + cls + ", serviceKey =" + ((String) null) + ") has been already registered on service store. the service real instance is " + cVar + ", the registered service real instance is " + this.f31016a.get(oVar) + ", currentMap info is " + this.f31016a, new IllegalStateException());
                }
            } else {
                throw new IllegalStateException("(service=" + cls + ", serviceKey =" + ((String) null) + ") has been already registered on service store. the service real instance is " + cVar + ", the registered service real instance is " + this.f31016a.get(oVar));
            }
        }
        this.f31016a.put(oVar, cVar);
        if (cVar instanceof AbstractC12799b) {
            AbstractC12798a e = ((AbstractC12799b) cVar).mo20658e();
            C1213t<? extends AbstractC12798a> tVar = this.f31017c.get(oVar);
            if (tVar == null) {
                tVar = new C1213t<>();
                this.f31017c.put(oVar, tVar);
            }
            if (tVar.getValue() != null) {
                return;
            }
            if (C89219l.m154714a(Looper.getMainLooper(), Looper.myLooper())) {
                tVar.setValue(e);
            } else if (tVar instanceof C1213t) {
                tVar.postValue(e);
            }
        }
    }

    /* renamed from: a */
    public final <DATA extends AbstractC12798a> boolean mo20613a(Class<? extends AbstractC12799b<DATA>> cls, AbstractC89172b<? super DATA, ? extends DATA> bVar) {
        AbstractC12800c cVar;
        C89219l.m154719c(cls, "");
        C89219l.m154719c(bVar, "");
        Object obj = null;
        C12765o oVar = new C12765o(cls, null);
        for (C12753e eVar = this; eVar != null; eVar = eVar.f31018d) {
            if (eVar.f31016a.containsKey(oVar)) {
                Map<C12765o, C1213t<? extends AbstractC12798a>> map = eVar.f31017c;
                if (!map.containsKey(oVar)) {
                    return true;
                }
                C1213t<? extends AbstractC12798a> tVar = map.get(oVar);
                if (tVar == null) {
                    tVar = new C1213t<>();
                    map.put(oVar, tVar);
                }
                Object value = tVar.getValue();
                if (value == null && (cVar = eVar.f31016a.get(oVar)) != null && (cVar instanceof AbstractC12799b)) {
                    value = ((AbstractC12799b) cVar).mo20658e();
                }
                if (value instanceof AbstractC12798a) {
                    obj = value;
                }
                Object invoke = bVar.invoke(obj);
                if (value == null || value.equals(invoke)) {
                    return true;
                }
                if (C89219l.m154714a(Looper.getMainLooper(), Looper.myLooper())) {
                    tVar.setValue(invoke);
                    return true;
                } else if (!(tVar instanceof C1213t)) {
                    return true;
                } else {
                    tVar.postValue(invoke);
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public final <DATA extends AbstractC12798a, T> void mo20610a(AbstractC1204m mVar, Class<? extends AbstractC12799b<DATA>> cls, AbstractC89172b<? super DATA, ? extends T> bVar, AbstractC89172b<? super T, C89391z> bVar2) {
        C89219l.m154719c(mVar, "");
        C89219l.m154719c(cls, "");
        C89219l.m154719c(bVar, "");
        C12765o oVar = new C12765o(cls, null);
        for (C12753e eVar = this; eVar != null; eVar = eVar.f31018d) {
            if (eVar.f31016a.containsKey(oVar)) {
                Map<C12765o, C1213t<? extends AbstractC12798a>> map = eVar.f31017c;
                C1213t<? extends AbstractC12798a> tVar = map.get(oVar);
                if (map.containsKey(oVar) && tVar == null) {
                    tVar = new C1213t<>();
                    map.put(oVar, tVar);
                }
                if ((tVar instanceof LiveData) && tVar != null) {
                    C1169aa.m3869a(tVar, new C12756f(bVar)).observe(mVar, new C12755b(bVar, mVar, bVar2));
                    return;
                }
                return;
            }
        }
    }
}
