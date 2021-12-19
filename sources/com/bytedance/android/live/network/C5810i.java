package com.bytedance.android.live.network;

import com.bytedance.android.live.C4139e;
import com.bytedance.android.live.network.gson.BaseListResponseTypeAdapter;
import com.bytedance.android.live.network.gson.BaseResponseTypeAdapter;
import com.bytedance.android.live.network.gson.ListResponseTypeAdapter;
import com.bytedance.android.live.network.gson.ResponseTypeAdapter;
import com.bytedance.android.live.network.response.C5827a;
import com.bytedance.android.live.network.response.C5830b;
import com.bytedance.android.live.network.response.C5831c;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.covode.number.Covode;
import com.google.gson.C27910f;
import java.lang.reflect.Type;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.bytedance.android.live.network.i */
public final class C5810i {

    /* renamed from: a */
    public static final C5810i f14663a = new C5810i();

    /* renamed from: b */
    private static final AbstractC89244h f14664b = C89250i.m154773a((AbstractC89171a) C5811a.f14665a);

    /* renamed from: a */
    public static C27910f m12748a() {
        return (C27910f) f14664b.getValue();
    }

    private C5810i() {
    }

    static {
        Covode.recordClassIndex(6415);
    }

    /* renamed from: com.bytedance.android.live.network.i$a */
    static final class C5811a extends AbstractC89220m implements AbstractC89171a<C27910f> {

        /* renamed from: a */
        public static final C5811a f14665a = new C5811a();

        static {
            Covode.recordClassIndex(6416);
        }

        C5811a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C27910f invoke() {
            C27910f fVar = C4139e.C4140a.f11575b;
            return C4139e.C4140a.f11574a.mo46681a((Type) C5830b.class, (Object) new BaseResponseTypeAdapter(fVar)).mo46681a((Type) C5832d.class, (Object) new ResponseTypeAdapter(fVar)).mo46681a((Type) C5827a.class, (Object) new BaseListResponseTypeAdapter(fVar)).mo46681a((Type) C5831c.class, (Object) new ListResponseTypeAdapter(fVar)).mo46682b();
        }
    }
}
