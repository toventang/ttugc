package com.bytedance.ttnet.retrofit;

import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.common.utility.C13627m;
import com.bytedance.common.utility.Logger;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.C14731e;
import com.bytedance.frameworks.baselib.network.http.p983b.C14618a;
import com.bytedance.frameworks.baselib.network.http.p995g.C14757g;
import com.bytedance.frameworks.baselib.network.http.p995g.C14758h;
import com.bytedance.frameworks.baselib.network.http.p995g.C14759i;
import com.bytedance.frameworks.baselib.network.http.retrofit.BaseSsInterceptor;
import com.bytedance.frameworks.p977a.p978a.C14578a;
import com.bytedance.retrofit2.C22096s;
import com.bytedance.retrofit2.C22099u;
import com.bytedance.retrofit2.client.C22027b;
import com.bytedance.retrofit2.client.C22028c;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.ttnet.C22916b;
import com.bytedance.ttnet.clientkey.ClientKeyManager;
import com.bytedance.ttnet.p1703d.C22940b;
import com.bytedance.ttnet.p1703d.C22944d;
import com.bytedance.ttnet.utils.C22963a;
import com.bytedance.ttnet.utils.C22967c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

public final class SsInterceptor extends BaseSsInterceptor {

    /* renamed from: a */
    public static volatile boolean f54304a;

    static {
        Covode.recordClassIndex(26871);
    }

    /* renamed from: a */
    private static String m43270a(String str) {
        List<String> list;
        List list2;
        if (C13627m.m24498a(str)) {
            return str;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Pair<String, String> b = C14759i.m27070b(str, linkedHashMap);
            if (!linkedHashMap.isEmpty()) {
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    if (!(entry == null || (list2 = (List) entry.getValue()) == null || list2.isEmpty())) {
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            String str2 = (String) it.next();
                            if (linkedHashSet.contains(str2)) {
                                it.remove();
                            } else {
                                linkedHashSet.add(str2);
                            }
                        }
                    }
                }
            }
            C14758h hVar = new C14758h(((String) b.first) + ((String) b.second));
            if (!linkedHashMap.isEmpty()) {
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    if (!(entry2 == null || entry2.getKey() == null || (list = (List) entry2.getValue()) == null || list.isEmpty())) {
                        for (String str3 : list) {
                            hVar.mo23779a((String) entry2.getKey(), str3);
                        }
                    }
                }
            }
            return hVar.mo23776a();
        } catch (Throwable unused) {
            return str;
        }
    }

    @Override // com.bytedance.frameworks.baselib.network.http.retrofit.BaseSsInterceptor
    /* renamed from: a */
    public final Request mo23781a(Request request) {
        Request a = super.mo23781a(request);
        String str = null;
        if (a == null) {
            return null;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        Request.C22024a newBuilder = a.newBuilder();
        String a2 = m43270a(a.getUrl());
        newBuilder.mo35838a(a2);
        if (a.getMetrics() != null) {
            a.getMetrics().f52160C = SystemClock.uptimeMillis() - uptimeMillis;
        }
        Long valueOf = Long.valueOf(SystemClock.uptimeMillis());
        ArrayList arrayList = new ArrayList();
        if (a.getHeaders() != null) {
            arrayList.addAll(a.getHeaders());
        }
        if (f54304a) {
            try {
                LinkedList<Pair> linkedList = new LinkedList();
                String a3 = C14578a.m26655a(a2, linkedList);
                if (a3 != null) {
                    newBuilder.mo35838a(a3);
                }
                if (!linkedList.isEmpty()) {
                    for (Pair pair : linkedList) {
                        if (pair != null) {
                            arrayList.add(new C22027b((String) pair.first, (String) pair.second));
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
        if (a.getMetrics() != null) {
            a.getMetrics().f52161D = SystemClock.uptimeMillis() - valueOf.longValue();
        }
        Long valueOf2 = Long.valueOf(SystemClock.uptimeMillis());
        try {
            String a4 = C22967c.m43299a(a2);
            if (!C13627m.m24498a(a4)) {
                arrayList.add(new C22027b("X-SS-REQ-TICKET", a4));
            }
        } catch (Throwable unused2) {
        }
        if (a.getMetrics() != null) {
            a.getMetrics().f52162E = SystemClock.uptimeMillis() - valueOf2.longValue();
        }
        Long valueOf3 = Long.valueOf(SystemClock.uptimeMillis());
        if (C22963a.f54311a) {
            try {
                if (C22963a.m43295a(C14757g.m27060a(a2))) {
                    str = UUID.randomUUID().toString();
                }
                if (!TextUtils.isEmpty(str)) {
                    arrayList.add(new C22027b("X-TT-VERIFY-ID", str));
                }
            } catch (Throwable unused3) {
            }
        }
        if (a.getMetrics() != null) {
            a.getMetrics().f52164G = SystemClock.uptimeMillis() - valueOf3.longValue();
        }
        ClientKeyManager a5 = ClientKeyManager.m43224a();
        C22096s metrics = a.getMetrics();
        if (ClientKeyManager.f54211a != null && ClientKeyManager.f54212b && !TextUtils.isEmpty(a5.f54217c) && !TextUtils.isEmpty(a5.f54220f)) {
            Long valueOf4 = Long.valueOf(SystemClock.uptimeMillis());
            arrayList.add(new C22027b("x-bd-client-key", a5.f54217c));
            arrayList.add(new C22027b("x-bd-kmsv", a5.f54220f));
            if (metrics != null) {
                metrics.f52165H = SystemClock.uptimeMillis() - valueOf4.longValue();
            }
        }
        newBuilder.f52025c = arrayList;
        return newBuilder.mo35840a();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.retrofit.BaseSsInterceptor
    /* renamed from: a */
    public final void mo23782a(Request request, C22099u uVar) {
        C22940b bVar;
        String str;
        String str2;
        String str3;
        List<C22027b> b;
        super.mo23782a(request, uVar);
        if (request != null && uVar != null) {
            C22028c cVar = uVar.f52261a;
            Long valueOf = Long.valueOf(SystemClock.uptimeMillis());
            try {
                if (C14731e.f35916e != null) {
                    String a = C14731e.f35916e.mo23736a();
                    if (!C13627m.m24498a(a) && (b = cVar.mo35846b(a)) != null && b.size() > 0) {
                        ArrayList arrayList = new ArrayList();
                        for (C22027b bVar2 : b) {
                            arrayList.add(bVar2.f52038b);
                        }
                    }
                }
            } catch (Throwable unused) {
            }
            if (request.getMetrics() != null) {
                request.getMetrics().f52168K = SystemClock.uptimeMillis() - valueOf.longValue();
            }
            ClientKeyManager.m43224a().mo37254a(request, cVar);
            Long valueOf2 = Long.valueOf(SystemClock.uptimeMillis());
            Object obj = cVar.f52044f;
            if (obj instanceof C22940b) {
                bVar = (C22940b) obj;
                if (bVar.f35359b != null) {
                    JSONObject jSONObject = new JSONObject();
                    List<C22027b> list = cVar.f52042d;
                    for (int i = 0; i < list.size(); i++) {
                        try {
                            C22027b bVar3 = list.get(i);
                            if (bVar3 != null) {
                                if (!TextUtils.isEmpty(bVar3.f52037a)) {
                                    jSONObject.put(bVar3.f52037a.toUpperCase(), bVar3.f52038b);
                                }
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    if (bVar.f35359b instanceof C22944d) {
                        ((C22944d) bVar.f35359b).f54239u = jSONObject;
                    }
                    ((C22944d) bVar.f35359b).f35399b = cVar.f52040b;
                    ((C22944d) bVar.f35359b).f35398a = bVar.f35358a;
                }
            } else {
                bVar = null;
            }
            try {
                request.getUrl();
                request.getFirstHeader("X-SS-REQ-TICKET");
                cVar.mo35844a("X-SS-REQ-TICKET");
            } catch (Throwable unused2) {
            }
            try {
                String url = request.getUrl();
                Uri parse = Uri.parse(url);
                if (parse.getHost().endsWith(C22916b.m43214a())) {
                    String[] strArr = {"Set-Cookie"};
                    String[] strArr2 = {"sessionid", "tt_sessionid"};
                    int i2 = 0;
                    do {
                        List<C22027b> b2 = cVar.mo35846b(strArr[i2]);
                        if (b2 != null && b2.size() > 0) {
                            for (C22027b bVar4 : b2) {
                                int i3 = 0;
                                do {
                                    String str4 = strArr2[i3];
                                    Matcher matcher = Pattern.compile(".*(((" + str4 + "=[^;]*)|(" + str4 + "=\"[\";]*))|(" + str4 + "=.*$)).*").matcher(bVar4.f52038b);
                                    if (matcher.matches()) {
                                        str3 = matcher.group(1);
                                    } else {
                                        str3 = null;
                                    }
                                    Logger.debug();
                                    if (!C13627m.m24498a(str3)) {
                                        int i4 = cVar.f52040b;
                                        boolean z = bVar.f54232M;
                                        JSONObject jSONObject2 = new JSONObject();
                                        try {
                                            String encodedQuery = parse.getEncodedQuery();
                                            if (!C13627m.m24498a(encodedQuery)) {
                                                jSONObject2.put("url_query", encodedQuery);
                                            }
                                        } catch (Throwable unused3) {
                                        }
                                        if (!C13627m.m24498a(bVar.f35358a)) {
                                            jSONObject2.put("remote_ip", bVar.f35358a);
                                        }
                                        if (cVar.f52042d != null) {
                                            jSONObject2.put("header_list", cVar.f52042d.toString());
                                        }
                                        int indexOf = url.indexOf("?");
                                        if (indexOf == -1) {
                                            indexOf = url.length();
                                        }
                                        String substring = url.substring(0, indexOf);
                                        C22967c.AbstractC22969b bVar5 = C22967c.f54319a;
                                        if (bVar5 != null) {
                                            bVar5.mo37226a(substring, i4, z, jSONObject2);
                                        }
                                    }
                                    i3++;
                                } while (i3 < 2);
                            }
                        }
                        i2++;
                    } while (i2 <= 0);
                    if (request.getMetrics() != null) {
                        request.getMetrics().f52163F = SystemClock.uptimeMillis() - valueOf2.longValue();
                    }
                    Long valueOf3 = Long.valueOf(SystemClock.uptimeMillis());
                    if (C22963a.f54311a && bVar != null) {
                        C22027b firstHeader = request.getFirstHeader("X-TT-VERIFY-ID");
                        if (firstHeader != null) {
                            str = firstHeader.f52038b;
                        } else {
                            str = null;
                        }
                        C22027b a2 = cVar.mo35844a("X-TT-VERIFY-ID");
                        if (a2 != null) {
                            str2 = a2.f52038b;
                        } else {
                            str2 = null;
                        }
                        if (str != null) {
                            if (str2 == null) {
                                bVar.f54233N = 1;
                            } else if (str.equals(str2)) {
                                bVar.f54233N = 2;
                            } else {
                                bVar.f54233N = 3;
                                try {
                                    cVar.f52043e.mo11577in().close();
                                } catch (Throwable unused4) {
                                }
                            }
                            if (C22967c.f54320b != null) {
                                request.getUrl();
                            }
                            if (bVar.f54233N == 3) {
                                throw new C14618a("Fail to verify cdn cache");
                            }
                        }
                    }
                    if (request.getMetrics() != null) {
                        request.getMetrics().f52167J = SystemClock.uptimeMillis() - valueOf3.longValue();
                    }
                }
            } catch (Throwable unused5) {
            }
        }
    }
}
