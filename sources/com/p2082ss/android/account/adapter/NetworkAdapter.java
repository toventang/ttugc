package com.p2082ss.android.account.adapter;

import android.content.Context;
import android.util.Pair;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.p995g.C14759i;
import com.bytedance.retrofit2.C22099u;
import com.bytedance.retrofit2.client.C22027b;
import com.bytedance.retrofit2.mime.TypedFile;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.mime.TypedString;
import com.bytedance.sdk.p1625a.AbstractC22354d;
import com.bytedance.ttnet.INetworkApi;
import com.bytedance.ttnet.utils.RetrofitUtils;
import com.p2082ss.android.C29910g;
import com.p2082ss.android.C29912h;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.account.adapter.NetworkAdapter */
public class NetworkAdapter implements AbstractC22354d {
    static {
        Covode.recordClassIndex(35730);
    }

    @Override // com.bytedance.sdk.p1625a.AbstractC22354d
    /* renamed from: a */
    public final int mo36700a(Context context, Throwable th) {
        return 0;
    }

    /* renamed from: a */
    private static C29912h m58762a(C22099u<String> uVar) {
        String str;
        int i;
        if (uVar == null) {
            return null;
        }
        if (uVar.f52261a != null) {
            str = uVar.f52261a.f52039a;
            i = uVar.f52261a.f52040b;
        } else {
            str = "";
            i = -1;
        }
        ArrayList arrayList = new ArrayList();
        List<C22027b> list = uVar.f52261a.f52042d;
        if (list != null && list.size() > 0) {
            for (C22027b bVar : list) {
                if (bVar != null) {
                    arrayList.add(new C29910g(bVar.f52037a, bVar.f52038b));
                }
            }
        }
        return new C29912h(str, i, arrayList, uVar.f52262b);
    }

    @Override // com.bytedance.sdk.p1625a.AbstractC22354d
    /* renamed from: a */
    public final C29912h mo36701a(String str, List<C29910g> list) {
        C22099u<String> uVar = null;
        if (!C13627m.m24498a(str)) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Pair<String, String> a = C14759i.m27066a(str, linkedHashMap);
            String str2 = (String) a.second;
            INetworkApi iNetworkApi = (INetworkApi) RetrofitUtils.m43281a((String) a.first, INetworkApi.class);
            LinkedList linkedList = new LinkedList();
            if (!list.isEmpty()) {
                for (C29910g gVar : list) {
                    if (gVar != null) {
                        linkedList.add(new C22027b(gVar.f71345a, gVar.f71346b));
                    }
                }
            }
            if (iNetworkApi != null) {
                uVar = iNetworkApi.doGet(true, Integer.MAX_VALUE, str2, linkedHashMap, linkedList, null).execute();
            }
        }
        return m58762a(uVar);
    }

    @Override // com.bytedance.sdk.p1625a.AbstractC22354d
    /* renamed from: a */
    public final C29912h mo36703a(String str, Map<String, String> map, List<C29910g> list) {
        C22099u<String> uVar = null;
        if (!C13627m.m24498a(str)) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Pair<String, String> a = C14759i.m27066a(str, linkedHashMap);
            String str2 = (String) a.second;
            INetworkApi iNetworkApi = (INetworkApi) RetrofitUtils.m43281a((String) a.first, INetworkApi.class);
            LinkedList linkedList = new LinkedList();
            if (list.size() != 0) {
                for (C29910g gVar : list) {
                    if (gVar != null) {
                        linkedList.add(new C22027b(gVar.f71345a, gVar.f71346b));
                    }
                }
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            if (!map.isEmpty()) {
                linkedHashMap2.putAll(map);
            }
            if (iNetworkApi != null) {
                uVar = iNetworkApi.doPost(Integer.MAX_VALUE, str2, linkedHashMap, linkedHashMap2, linkedList, null).execute();
            }
        }
        return m58762a(uVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r11v0, resolved type: java.util.Map<java.lang.String, com.bytedance.retrofit2.mime.TypedOutput> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private static C22099u<String> m58761a(int i, String str, Map<String, TypedOutput> map, List<C29910g> list) {
        if (C13627m.m24498a(str)) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Pair<String, String> a = C14759i.m27066a(str, linkedHashMap);
        String str2 = (String) a.second;
        INetworkApi iNetworkApi = (INetworkApi) RetrofitUtils.m43281a((String) a.first, INetworkApi.class);
        LinkedList linkedList = new LinkedList();
        if (list != null && list.size() > 0) {
            for (C29910g gVar : list) {
                linkedList.add(new C22027b(gVar.f71345a, gVar.f71346b));
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        if (!linkedHashMap2.isEmpty()) {
            for (Map.Entry entry : linkedHashMap2.entrySet()) {
                if (entry != null) {
                    map.put(entry.getKey(), new TypedString((String) entry.getValue()));
                }
            }
        }
        if (iNetworkApi != null) {
            return iNetworkApi.postMultiPart(Integer.MAX_VALUE, str2, linkedHashMap, map, linkedList).execute();
        }
        return null;
    }

    @Override // com.bytedance.sdk.p1625a.AbstractC22354d
    /* renamed from: a */
    public final C29912h mo36702a(String str, Map<String, String> map, String str2, String str3, List<C29910g> list) {
        if (C13627m.m24498a(str)) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!map.isEmpty()) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), new TypedString(entry.getValue()));
            }
        }
        linkedHashMap.put(str2, new TypedFile(null, new File(str3)));
        return m58762a(m58761a(Integer.MAX_VALUE, str, linkedHashMap, list));
    }
}
