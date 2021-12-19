package com.bytedance.ies.powerpreload.p1244c;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerpreload.C17807d;
import com.bytedance.ies.powerpreload.p1243b.AbstractC17788c;
import com.bytedance.ies.powerpreload.p1243b.C17794i;
import com.bytedance.ies.powerpreload.task.AbstractRunnableC17828f;
import com.bytedance.ies.ugc.aweme.network.AbstractC18096e;
import com.bytedance.ies.ugc.aweme.network.AbstractC18099f;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import java.util.HashMap;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.powerpreload.c.a */
public final class C17802a extends AbstractRunnableC17828f<AbstractC17788c<Object, ?>> {

    /* renamed from: b */
    public static final AbstractC89244h f42485b = C89250i.m154773a((AbstractC89171a) C17804b.f42488a);

    /* renamed from: c */
    public static final C17803a f42486c = new C17803a((byte) 0);

    /* renamed from: a */
    public final IRetrofitFactory f42487a;

    /* renamed from: com.bytedance.ies.powerpreload.c.a$a */
    public static final class C17803a {
        static {
            Covode.recordClassIndex(20367);
        }

        /* renamed from: a */
        public static HashMap<C17794i, AbstractC18099f> m32997a() {
            return (HashMap) C17802a.f42485b.getValue();
        }

        private C17803a() {
        }

        public /* synthetic */ C17803a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.ies.powerpreload.c.a$b */
    static final class C17804b extends AbstractC89220m implements AbstractC89171a<HashMap<C17794i, AbstractC18099f>> {

        /* renamed from: a */
        public static final C17804b f42488a = new C17804b();

        static {
            Covode.recordClassIndex(20368);
        }

        C17804b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ HashMap<C17794i, AbstractC18099f> invoke() {
            return new HashMap();
        }
    }

    @Override // com.bytedance.ies.powerpreload.task.AbstractRunnableC17828f
    /* renamed from: a */
    public final Object mo28272a() {
        return ((AbstractC17788c) this.f42538f).preload(this.f42540h, new C17805c(this));
    }

    static {
        Covode.recordClassIndex(20366);
    }

    /* renamed from: com.bytedance.ies.powerpreload.c.a$c */
    static final class C17805c extends AbstractC89220m implements AbstractC89172b<Class<Object>, Object> {

        /* renamed from: a */
        final /* synthetic */ C17802a f42489a;

        static {
            Covode.recordClassIndex(20369);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17805c(C17802a aVar) {
            super(1);
            this.f42489a = aVar;
        }

        /* renamed from: com.bytedance.ies.powerpreload.c.a$c$a */
        static final class C17806a extends AbstractC89220m implements AbstractC89171a<AbstractC18099f> {

            /* renamed from: a */
            final /* synthetic */ C17805c f42490a;

            /* renamed from: b */
            final /* synthetic */ C17794i f42491b;

            static {
                Covode.recordClassIndex(20370);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C17806a(C17805c cVar, C17794i iVar) {
                super(0);
                this.f42490a = cVar;
                this.f42491b = iVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ AbstractC18099f invoke() {
                String str = this.f42491b.f42472c;
                if (str == null) {
                    str = "";
                }
                AbstractC18096e b = this.f42490a.f42489a.f42487a.mo28817b(str);
                b.mo28827a(this.f42491b);
                C17803a.m32997a().put(this.f42491b, b.mo28832d());
                return C17803a.m32997a().get(this.f42491b);
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Object invoke(Class<Object> cls) {
            Class<Object> cls2 = cls;
            C89219l.m154719c(cls2, "");
            C17794i preloadStrategy = ((AbstractC17788c) this.f42489a.f42538f).getPreloadStrategy(this.f42489a.f42540h);
            AbstractC18099f fVar = C17803a.m32997a().get(preloadStrategy);
            if (fVar == null) {
                Object invoke = new C17806a(this, preloadStrategy).invoke();
                if (invoke == null) {
                    C89219l.m154707a();
                }
                fVar = (AbstractC18099f) invoke;
            }
            C89219l.m154709a((Object) fVar, "");
            return fVar.mo28858a(cls2);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C17802a(AbstractC17788c<Object, ?> cVar, C17807d dVar, Bundle bundle, IRetrofitFactory iRetrofitFactory) {
        super(cVar, dVar, bundle);
        C89219l.m154719c(cVar, "");
        C89219l.m154719c(dVar, "");
        C89219l.m154719c(iRetrofitFactory, "");
        this.f42487a = iRetrofitFactory;
    }
}
