package com.bytedance.ies.foundation.base;

import androidx.lifecycle.AbstractC1174ac;
import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

public class BaseViewModel extends AbstractC1174ac {
    private final AbstractC89244h configuration$delegate = C89250i.m154773a((AbstractC89171a) C17360a.f41678a);
    public volatile boolean initialized;
    private final AbstractC89244h subscribeStore$delegate = C89250i.m154773a((AbstractC89171a) C17361b.f41679a);

    static {
        Covode.recordClassIndex(19845);
    }

    public final C17365b getConfiguration() {
        return (C17365b) this.configuration$delegate.getValue();
    }

    public final C17369d getSubscribeStore() {
        return (C17369d) this.subscribeStore$delegate.getValue();
    }

    public List<AbstractC17368c> initProcessors() {
        return C89086z.INSTANCE;
    }

    /* renamed from: com.bytedance.ies.foundation.base.BaseViewModel$a */
    static final class C17360a extends AbstractC89220m implements AbstractC89171a<C17365b> {

        /* renamed from: a */
        public static final C17360a f41678a = new C17360a();

        static {
            Covode.recordClassIndex(19846);
        }

        C17360a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C17365b invoke() {
            return new C17365b();
        }
    }

    /* renamed from: com.bytedance.ies.foundation.base.BaseViewModel$b */
    static final class C17361b extends AbstractC89220m implements AbstractC89171a<C17369d> {

        /* renamed from: a */
        public static final C17361b f41679a = new C17361b();

        static {
            Covode.recordClassIndex(19847);
        }

        C17361b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C17369d invoke() {
            return new C17369d();
        }
    }

    public final List<AbstractC17368c> getProcessors() {
        return getConfiguration().mo27697a();
    }

    @Override // androidx.lifecycle.AbstractC1174ac
    public void onCleared() {
        super.onCleared();
        C17365b configuration = getConfiguration();
        configuration.mo27699b().clear();
        configuration.mo27697a().clear();
    }

    public void init() {
        if (!this.initialized) {
            List<AbstractC17368c> initProcessors = initProcessors();
            getConfiguration().mo27697a().addAll(initProcessors);
            Iterator<T> it = initProcessors.iterator();
            while (it.hasNext()) {
                C17365b configuration = getConfiguration();
                C89219l.m154721d(configuration, "");
                it.next().f41687c = configuration;
            }
            this.initialized = true;
        }
    }

    public final void config(AbstractC89171a<? extends AbstractC17362a> aVar) {
        C89219l.m154721d(aVar, "");
        getConfiguration().mo27698a((AbstractC17362a) aVar.invoke());
    }
}
