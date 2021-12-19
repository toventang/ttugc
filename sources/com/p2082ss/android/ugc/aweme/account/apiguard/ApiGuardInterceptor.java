package com.p2082ss.android.ugc.aweme.account.apiguard;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.C22099u;
import com.bytedance.retrofit2.client.C22027b;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.p1612c.AbstractC22021a;
import com.p2082ss.android.ugc.aweme.p2404bs.C34932b;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.apiguard.ApiGuardInterceptor */
public final class ApiGuardInterceptor implements AbstractC22021a {
    static {
        Covode.recordClassIndex(38296);
    }

    @Override // com.bytedance.retrofit2.p1612c.AbstractC22021a
    public final C22099u intercept(AbstractC22021a.AbstractC22022a aVar) {
        if (!(aVar.mo35812c() instanceof C34932b)) {
            return m65857a(aVar);
        }
        C34932b bVar = (C34932b) aVar.mo35812c();
        if (bVar.f82415W > 0) {
            long uptimeMillis = SystemClock.uptimeMillis() - bVar.f82415W;
            bVar.mo61814a(bVar.f82417Y, uptimeMillis);
            bVar.mo61815b(bVar.f82417Y, uptimeMillis);
        }
        bVar.mo61813a(getClass().getSimpleName());
        bVar.f82415W = SystemClock.uptimeMillis();
        C22099u<?> a = m65857a(aVar);
        if (bVar.f82416X > 0) {
            long uptimeMillis2 = SystemClock.uptimeMillis() - bVar.f82416X;
            String simpleName = getClass().getSimpleName();
            bVar.mo61814a(simpleName, uptimeMillis2);
            bVar.mo61816c(simpleName, uptimeMillis2);
        }
        bVar.f82416X = SystemClock.uptimeMillis();
        return a;
    }

    /* renamed from: a */
    private static C22099u<?> m65857a(AbstractC22021a.AbstractC22022a aVar) {
        C89219l.m154721d(aVar, "");
        if (!ApiGuardService.createIApiGuardServicebyMonsterPlugin(false).isEnabled()) {
            C22099u<?> a = aVar.mo35810a(aVar.mo35809a());
            C89219l.m154716b(a, "");
            return a;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (linkedHashMap.isEmpty()) {
            C22099u<?> a2 = aVar.mo35810a(aVar.mo35809a());
            C89219l.m154716b(a2, "");
            return a2;
        }
        Request a3 = aVar.mo35809a();
        C89219l.m154716b(a3, "");
        List<C22027b> headers = a3.getHeaders();
        C89219l.m154716b(headers, "");
        for (T t : headers) {
            C89219l.m154716b(t, "");
            if (!linkedHashMap.containsKey(t.f52037a)) {
                String str = t.f52037a;
                C89219l.m154716b(str, "");
                String str2 = t.f52038b;
                C89219l.m154716b(str2, "");
                linkedHashMap.put(str, str2);
            }
        }
        Request.C22024a newBuilder = aVar.mo35809a().newBuilder();
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(new C22027b((String) entry.getKey(), (String) entry.getValue()));
        }
        newBuilder.f52025c = arrayList;
        C22099u<?> a4 = aVar.mo35810a(newBuilder.mo35840a());
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        List<C22027b> list = a4.f52261a.f52042d;
        C89219l.m154716b(list, "");
        for (T t2 : list) {
            if (t2 instanceof C22027b) {
                T t3 = t2;
                String str3 = t3.f52037a;
                C89219l.m154716b(str3, "");
                String str4 = t3.f52038b;
                C89219l.m154716b(str4, "");
                linkedHashMap2.put(str3, str4);
            }
        }
        C89219l.m154716b(a4, "");
        return a4;
    }
}
