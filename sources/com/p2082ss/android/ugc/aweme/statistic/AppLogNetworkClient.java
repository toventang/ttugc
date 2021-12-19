package com.p2082ss.android.ugc.aweme.statistic;

import android.util.Pair;
import com.bytedance.common.utility.AbstractC13621j;
import com.bytedance.common.utility.C13585b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.cronet.p986b.C14652c;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.AbstractC21983b;
import com.bytedance.retrofit2.client.C22027b;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.p1610b.AbstractC21984a;
import com.bytedance.retrofit2.p1610b.AbstractC21993ag;
import com.bytedance.retrofit2.p1610b.AbstractC21994b;
import com.bytedance.retrofit2.p1610b.AbstractC21998f;
import com.bytedance.retrofit2.p1610b.AbstractC21999g;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22004l;
import com.bytedance.retrofit2.p1610b.AbstractC22007o;
import com.bytedance.retrofit2.p1610b.AbstractC22012t;
import com.google.p1998c.p2006h.p2007a.AbstractFutureC27655q;
import com.p2082ss.android.common.applog.C29803q;
import com.p2082ss.android.common.util.NetworkUtils;
import com.p2082ss.android.http.p2146a.p2147a.C29929b;
import com.p2082ss.android.p2123b.C29736b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* renamed from: com.ss.android.ugc.aweme.statistic.AppLogNetworkClient */
public final class AppLogNetworkClient extends AbstractC13621j {

    /* renamed from: b */
    private volatile AppLogGetApi f169144b;

    /* renamed from: c */
    private volatile AppLogPostApi f169145c;

    /* renamed from: d */
    private final int f169146d = 1024;

    /* renamed from: com.ss.android.ugc.aweme.statistic.AppLogNetworkClient$AppLogGetApi */
    interface AppLogGetApi {
        static {
            Covode.recordClassIndex(88126);
        }

        @AbstractC22000h
        AbstractFutureC27655q<String> getResponse(@AbstractC21993ag String str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.statistic.AppLogNetworkClient$AppLogPostApi */
    public interface AppLogPostApi {
        static {
            Covode.recordClassIndex(88127);
        }

        @AbstractC22012t
        AbstractFutureC27655q<String> doPost(@AbstractC21993ag String str, @AbstractC21994b TypedOutput typedOutput, @AbstractC22007o int i, @AbstractC22004l List<C22027b> list);

        @AbstractC22012t
        @AbstractC21999g
        AbstractFutureC27655q<String> getResponse(@AbstractC21993ag String str, @AbstractC21998f Map<String, String> map, @AbstractC22007o int i);

        @AbstractC22012t
        AbstractC21983b<TypedInput> postDataStream(@AbstractC22007o int i, @AbstractC21993ag String str, @AbstractC21994b TypedOutput typedOutput, @AbstractC22004l List<C22027b> list, @AbstractC21984a boolean z);
    }

    static {
        Covode.recordClassIndex(88125);
    }

    /* renamed from: a */
    private AppLogPostApi m132010a() {
        if (this.f169145c == null) {
            this.f169145c = (AppLogPostApi) RetrofitFactory.m33635a().mo28817b(C29736b.f70924e).mo28832d().mo28858a(AppLogPostApi.class);
        }
        return this.f169145c;
    }

    /* renamed from: a */
    private static List<C22027b> m132011a(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(new C22027b(entry.getKey(), entry.getValue()));
        }
        return arrayList;
    }

    @Override // com.bytedance.common.utility.AbstractC13621j
    /* renamed from: a */
    public final String mo21870a(String str, Map<String, String> map) {
        if (str == null) {
            return null;
        }
        try {
            if (this.f169144b == null) {
                this.f169144b = (AppLogGetApi) RetrofitFactory.m33635a().mo28817b(C29736b.f70924e).mo28832d().mo28858a(AppLogGetApi.class);
            }
            return this.f169144b.getResponse(str).get();
        } catch (ExecutionException e) {
            if (e.getCause() instanceof C29929b) {
                throw new C13585b(((C29929b) e.getCause()).getStatusCode(), e.getMessage());
            }
            throw new C13585b(0, e.getMessage());
        } catch (Exception e2) {
            throw new C13585b(0, e2.getMessage());
        }
    }

    @Override // com.bytedance.common.utility.AbstractC13621j
    /* renamed from: a */
    public final String mo21869a(String str, List<Pair<String, String>> list, Map<String, String> map) {
        if (str == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (Pair<String, String> pair : list) {
            hashMap.put(pair.first, pair.second);
        }
        C29803q.m60037b(hashMap, true);
        try {
            return m132010a().getResponse(str, hashMap, 204800).get();
        } catch (ExecutionException e) {
            if (e.getCause() instanceof C29929b) {
                throw new C13585b(((C29929b) e.getCause()).getStatusCode(), e.getMessage());
            } else if (e.getCause() instanceof C14652c) {
                C14652c cVar = (C14652c) e.getCause();
                throw new C13585b(cVar.getStatusCode(), cVar.getMessage());
            } else {
                throw new C13585b(0, e.getMessage());
            }
        } catch (Exception e2) {
            throw new C13585b(0, e2.getMessage());
        }
    }

    @Override // com.bytedance.common.utility.AbstractC13621j
    /* renamed from: a */
    public final String mo21871a(String str, byte[] bArr, Map<String, String> map) {
        String filterUrl = NetworkUtils.filterUrl(str);
        if (filterUrl == null) {
            return null;
        }
        if (map != null) {
            try {
                String str2 = map.get("Content-Encoding");
                String str3 = map.get("Content-Type");
                ArrayList arrayList = new ArrayList();
                if (str2 != null) {
                    arrayList.add(new C22027b("Content-Encoding", str2));
                }
                if (str3 != null && str3.length() > 0) {
                    arrayList.add(new C22027b("Content-Type", str3));
                }
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    arrayList.add(new C22027b(entry.getKey(), entry.getValue()));
                }
                return m132010a().doPost(filterUrl, new TypedByteArray(str3, bArr, new String[0]), 204800, arrayList).get();
            } catch (ExecutionException e) {
                if (e.getCause() instanceof C29929b) {
                    throw new C13585b(((C29929b) e.getCause()).getStatusCode(), e.getMessage());
                } else if (e.getCause() instanceof C14652c) {
                    C14652c cVar = (C14652c) e.getCause();
                    throw new C13585b(cVar.getStatusCode(), cVar.getMessage());
                } else {
                    throw new C13585b(0, e.getMessage());
                }
            } catch (Exception e2) {
                throw new C13585b(0, e2.getMessage());
            }
        } else {
            return m132010a().doPost(filterUrl, new TypedByteArray(null, bArr, new String[0]), 204800, null).get();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x00e6 A[Catch:{ all -> 0x0107 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00fa A[Catch:{ all -> 0x0107 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x010e A[SYNTHETIC, Splitter:B:52:0x010e] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0118 A[SYNTHETIC, Splitter:B:57:0x0118] */
    @Override // com.bytedance.common.utility.AbstractC13621j
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] mo21877b(java.lang.String r16, byte[] r17, java.util.Map<java.lang.String, java.lang.String> r18) {
        /*
        // Method dump skipped, instructions count: 292
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.statistic.AppLogNetworkClient.mo21877b(java.lang.String, byte[], java.util.Map):byte[]");
    }
}
