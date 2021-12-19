package com.p2082ss.android.ugc.aweme.lancet.ssretrofitchain;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.C22099u;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.lancet.ssretrofitchain.AbstractC58051c;
import com.p2082ss.android.ugc.aweme.lancet.ssretrofitchain.C58057g;
import com.p2082ss.android.ugc.aweme.utils.ActivityStack;
import com.p2082ss.android.ugc.trill.R;
import java.util.concurrent.Callable;
import p077b.C1731i;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.lancet.ssretrofitchain.f */
public final class C58055f extends AbstractC58051c {
    static {
        Covode.recordClassIndex(68095);
    }

    /* renamed from: com.ss.android.ugc.aweme.lancet.ssretrofitchain.f$a */
    static final class CallableC58056a<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C58057g f132292a;

        static {
            Covode.recordClassIndex(68096);
        }

        CallableC58056a(C58057g gVar) {
            this.f132292a = gVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            Activity topActivity = ActivityStack.getTopActivity();
            if (topActivity == null) {
                return null;
            }
            new C23144b(topActivity).mo37633a(R.style.nz).mo37635a(this.f132292a.f132293a.f132296b).mo37637b();
            return null;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58055f(AbstractC58051c cVar) {
        super(cVar);
        C89219l.m154721d(cVar, "");
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.lancet.ssretrofitchain.AbstractC58051c
    /* renamed from: a */
    public final AbstractC58051c.C58052a mo95554a(C58057g gVar, Request request, C22099u<?> uVar) {
        C58057g.C58058a aVar;
        C58057g.C58058a aVar2;
        String str;
        if (!(gVar == null || (aVar = gVar.f132293a) == null || aVar.f132295a != 3003001 || (aVar2 = gVar.f132293a) == null || (str = aVar2.f132296b) == null || str.length() <= 0)) {
            C1731i.m5640b(new CallableC58056a(gVar), C1731i.f5564c);
        }
        AbstractC58051c.C58052a aVar3 = C58050b.f132285a;
        C89219l.m154716b(aVar3, "");
        return aVar3;
    }
}
