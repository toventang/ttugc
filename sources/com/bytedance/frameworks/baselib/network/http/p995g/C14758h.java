package com.bytedance.frameworks.baselib.network.http.p995g;

import com.bytedance.covode.number.Covode;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.frameworks.baselib.network.http.g.h */
public final class C14758h {

    /* renamed from: a */
    public final Map<String, List<String>> f35971a;

    /* renamed from: b */
    public String f35972b;

    static {
        Covode.recordClassIndex(16855);
    }

    public final String toString() {
        return mo23776a();
    }

    public C14758h() {
        this.f35971a = new LinkedHashMap();
        this.f35972b = null;
    }

    /* renamed from: a */
    public final String mo23776a() {
        if (this.f35971a.isEmpty()) {
            return this.f35972b;
        }
        String a = C14759i.m27067a(this.f35971a, "UTF-8");
        String str = this.f35972b;
        if (str == null || str.length() == 0) {
            return a;
        }
        if (this.f35972b.indexOf(63) >= 0) {
            return this.f35972b + "&" + a;
        }
        return this.f35972b + "?" + a;
    }

    public C14758h(String str) {
        this.f35971a = new LinkedHashMap();
        this.f35972b = str;
    }

    /* renamed from: a */
    public final void mo23777a(String str, int i) {
        List<String> list = this.f35971a.get(str);
        if (list == null) {
            list = new LinkedList<>();
        }
        list.add(String.valueOf(i));
        this.f35971a.put(str, list);
    }

    /* renamed from: a */
    public final void mo23778a(String str, long j) {
        List<String> list = this.f35971a.get(str);
        if (list == null) {
            list = new LinkedList<>();
        }
        list.add(String.valueOf(j));
        this.f35971a.put(str, list);
    }

    /* renamed from: a */
    public final void mo23779a(String str, String str2) {
        List<String> list = this.f35971a.get(str);
        if (list == null) {
            list = new LinkedList<>();
        }
        list.add(String.valueOf(str2));
        this.f35971a.put(str, list);
    }
}
