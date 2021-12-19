package com.bytedance.ies.powerlist.optimize;

import androidx.lifecycle.AbstractC1204m;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerList;
import com.bytedance.ies.powerlist.debug.C17648Dr;
import com.bytedance.ies.powerlist.debug.C17651a;
import com.bytedance.ies.powerlist.debug.C17652b;
import com.bytedance.ies.powerlist.optimize.p1233a.C17664b;
import com.bytedance.ies.powerlist.page.config.C17693c;
import com.bytedance.ies.powerlist.page.config.OptimizeAbility;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4591l.C88958b;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.powerlist.optimize.b */
public final class C17670b {

    /* renamed from: a */
    public C17661a f42257a;

    /* renamed from: b */
    public C17664b f42258b;

    /* renamed from: c */
    public AbstractC88412b f42259c;

    /* renamed from: d */
    public final PowerList f42260d;

    /* renamed from: e */
    public final C88958b<C17693c> f42261e;

    /* renamed from: f */
    public final AbstractC1204m f42262f;

    /* renamed from: g */
    public final ConcurrentHashMap<Integer, CopyOnWriteArrayList<RecyclerView.ViewHolder>> f42263g;

    static {
        Covode.recordClassIndex(20227);
    }

    /* renamed from: com.bytedance.ies.powerlist.optimize.b$a */
    public static final class C17671a<T> implements AbstractC88433f<C17693c> {

        /* renamed from: a */
        final /* synthetic */ C17670b f42264a;

        static {
            Covode.recordClassIndex(20228);
        }

        public C17671a(C17670b bVar) {
            this.f42264a = bVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(C17693c cVar) {
            C17651a aVar;
            AbstractC89172b<C17652b, C89391z> bVar;
            C17693c cVar2 = cVar;
            C89219l.m154709a((Object) cVar2, "");
            C17661a aVar2 = new C17661a(cVar2, this.f42264a.f42260d);
            C17661a aVar3 = this.f42264a.f42257a;
            if (aVar3 != null) {
                aVar3.mo28149c();
                aVar3.f42231a.mo4418b(aVar3);
            }
            this.f42264a.f42257a = aVar2;
            C17661a aVar4 = this.f42264a.f42257a;
            if (aVar4 != null) {
                String a = aVar4.mo28147a();
                if (!(a == null || a.length() <= 0 || (aVar = C17648Dr.f42203a) == null || (bVar = aVar.f42216a) == null)) {
                    bVar.invoke(new C17652b(aVar4.f42231a, a));
                }
                if (C17648Dr.f42204b) {
                    aVar4.f42231a.mo4405a(aVar4);
                    aVar4.mo28148b().mo20429a(aVar4);
                }
            }
            OptimizeAbility optimizeAbility = cVar2.f42326h;
            if (optimizeAbility != null && optimizeAbility.f42316a) {
                C17664b bVar2 = new C17664b(optimizeAbility, this.f42264a.f42260d, this.f42264a.f42263g);
                C17664b bVar3 = this.f42264a.f42258b;
                if (bVar3 != null) {
                    bVar3.f42242e.clear();
                    bVar3.f42239b.mo144011o();
                    bVar3.f42241d.mo4418b(bVar3);
                    bVar3.f42241d.setViewCacheExtension(null);
                }
                this.f42264a.f42258b = bVar2;
                bVar2.mo28153b();
                bVar2.f42241d.mo4405a(bVar2);
                bVar2.f42241d.setViewCacheExtension(new C17664b.C17665a(bVar2, bVar2));
            }
        }
    }

    public /* synthetic */ C17670b(PowerList powerList, C88958b bVar, AbstractC1204m mVar) {
        this(powerList, bVar, mVar, new ConcurrentHashMap());
    }

    private C17670b(PowerList powerList, C88958b<C17693c> bVar, AbstractC1204m mVar, ConcurrentHashMap<Integer, CopyOnWriteArrayList<RecyclerView.ViewHolder>> concurrentHashMap) {
        C89219l.m154719c(powerList, "");
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(mVar, "");
        C89219l.m154719c(concurrentHashMap, "");
        this.f42260d = powerList;
        this.f42261e = bVar;
        this.f42262f = mVar;
        this.f42263g = concurrentHashMap;
    }
}
