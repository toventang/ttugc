package com.bytedance.ies.sdk.datachannel;

import android.os.Looper;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.LiveData;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89388w;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4620k.AbstractC89286i;

public abstract class BaseDataChannel extends AbstractC1174ac {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f42551a = {new C89232y(C89204ab.m154669a(BaseDataChannel.class), "mainThread", "getMainThread()Ljava/lang/Thread;")};

    /* renamed from: b */
    public final Map<Class<?>, AbstractC17856o<?>> f42552b = new ConcurrentHashMap();

    /* renamed from: c */
    public final Map<Object, Map<Class<?>, C17855n<Object>>> f42553c = new HashMap();

    /* renamed from: d */
    private final AbstractC89244h f42554d = C89250i.m154773a((AbstractC89171a) C17839a.f42555a);

    /* renamed from: com.bytedance.ies.sdk.datachannel.BaseDataChannel$a */
    static final class C17839a extends AbstractC89220m implements AbstractC89171a<Thread> {

        /* renamed from: a */
        public static final C17839a f42555a = new C17839a();

        static {
            Covode.recordClassIndex(20405);
        }

        C17839a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Thread invoke() {
            Looper mainLooper = Looper.getMainLooper();
            C89219l.m154709a((Object) mainLooper, "");
            return mainLooper.getThread();
        }
    }

    /* renamed from: a */
    public final boolean mo28308a() {
        if (Thread.currentThread() != this.f42554d.getValue()) {
            return true;
        }
        return false;
    }

    @Override // androidx.lifecycle.AbstractC1174ac
    public void onCleared() {
        super.onCleared();
        this.f42552b.clear();
    }

    static {
        Covode.recordClassIndex(20404);
    }

    /* renamed from: a */
    public final synchronized <T extends AbstractC17856o<O>, O> T mo28305a(Class<T> cls) {
        T t;
        C89219l.m154719c(cls, "");
        AbstractC17856o<?> oVar = this.f42552b.get(cls);
        if (oVar == null || (t = cls.cast(oVar)) == null) {
            try {
                t = cls.newInstance();
                Map<Class<?>, AbstractC17856o<?>> map = this.f42552b;
                C89219l.m154709a((Object) t, "");
                map.put(cls, t);
            } catch (InstantiationException e) {
                throw new RuntimeException("class " + cls + " init fail", e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("class " + cls + " init fail", e2);
            }
        }
        return t;
    }

    /* renamed from: a */
    public final void mo28306a(Object obj) {
        C89219l.m154719c(obj, "");
        Map<Class<?>, C17855n<Object>> remove = this.f42553c.remove(obj);
        if (remove != null) {
            for (Map.Entry<Class<?>, C17855n<Object>> entry : remove.entrySet()) {
                AbstractC17856o<?> oVar = this.f42552b.get(entry.getKey());
                if (oVar != null && (oVar instanceof C17853m)) {
                    LiveData liveData = (LiveData) oVar;
                    liveData.removeObserver(entry.getValue());
                    if (!liveData.hasObservers() && (((oVar instanceof C17849i) && !((C17849i) oVar).f42560a) || (oVar instanceof C17848h))) {
                        this.f42552b.remove(entry.getKey());
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final <T extends C17853m<O>, O> void mo28307a(Object obj, AbstractC1204m mVar, Class<T> cls, boolean z, AbstractC89172b<? super O, C89391z> bVar) {
        Map<Class<?>, C17855n<Object>> map;
        C17853m mVar2;
        C17855n<Object> a;
        C89219l.m154719c(obj, "");
        C89219l.m154719c(cls, "");
        C89219l.m154719c(bVar, "");
        if (!this.f42553c.containsKey(obj)) {
            this.f42553c.put(obj, new HashMap());
        }
        Map<Class<?>, C17855n<Object>> map2 = this.f42553c.get(obj);
        if ((map2 == null || !map2.containsKey(cls)) && (map = this.f42553c.get(obj)) != null && (mVar2 = (C17853m) mo28305a((Class) cls)) != null) {
            if (mVar == null) {
                a = mVar2.mo28332a(bVar, z);
            } else {
                a = mVar2.mo28331a(mVar, bVar, z);
            }
            if (a != null) {
                map.put(cls, a);
                return;
            }
            throw new C89388w("null cannot be cast to non-null type");
        }
    }
}
