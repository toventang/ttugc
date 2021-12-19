package com.bytedance.bdturing.ttnet;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.C22099u;
import com.bytedance.retrofit2.client.C22027b;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.p1612c.AbstractC22021a;
import com.p2082ss.android.ugc.aweme.p2404bs.C34932b;
import java.util.LinkedList;
import java.util.Map;

class TTNetUtil$2 implements AbstractC22021a {

    /* renamed from: a */
    final /* synthetic */ Map f32550a;

    static {
        Covode.recordClassIndex(15269);
    }

    TTNetUtil$2(Map map) {
        this.f32550a = map;
    }

    /* renamed from: a */
    private C22099u m23922a(AbstractC22021a.AbstractC22022a aVar) {
        Request a = aVar.mo35809a();
        LinkedList linkedList = new LinkedList();
        linkedList.addAll(a.getHeaders());
        for (String str : this.f32550a.keySet()) {
            linkedList.add(new C22027b(str, (String) this.f32550a.get(str)));
        }
        Request.C22024a newBuilder = a.newBuilder();
        newBuilder.f52025c = linkedList;
        return aVar.mo35810a(newBuilder.mo35840a());
    }

    @Override // com.bytedance.retrofit2.p1612c.AbstractC22021a
    public final C22099u intercept(AbstractC22021a.AbstractC22022a aVar) {
        if (!(aVar.mo35812c() instanceof C34932b)) {
            return m23922a(aVar);
        }
        C34932b bVar = (C34932b) aVar.mo35812c();
        if (bVar.f82415W > 0) {
            long uptimeMillis = SystemClock.uptimeMillis() - bVar.f82415W;
            bVar.mo61814a(bVar.f82417Y, uptimeMillis);
            bVar.mo61815b(bVar.f82417Y, uptimeMillis);
        }
        bVar.mo61813a(getClass().getSimpleName());
        bVar.f82415W = SystemClock.uptimeMillis();
        C22099u a = m23922a(aVar);
        if (bVar.f82416X > 0) {
            long uptimeMillis2 = SystemClock.uptimeMillis() - bVar.f82416X;
            String simpleName = getClass().getSimpleName();
            bVar.mo61814a(simpleName, uptimeMillis2);
            bVar.mo61816c(simpleName, uptimeMillis2);
        }
        bVar.f82416X = SystemClock.uptimeMillis();
        return a;
    }
}
