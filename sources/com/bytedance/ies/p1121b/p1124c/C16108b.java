package com.bytedance.ies.p1121b.p1124c;

import android.text.TextUtils;
import com.bytedance.common.utility.C13617h;
import com.bytedance.covode.number.Covode;
import java.io.IOException;
import java.net.CookieHandler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import okhttp3.AbstractC90186m;
import okhttp3.C90184l;
import okhttp3.C90200t;

/* renamed from: com.bytedance.ies.b.c.b */
public final class C16108b implements AbstractC90186m {

    /* renamed from: b */
    private CookieHandler f38796b;

    /* renamed from: c */
    private Pattern f38797c = Pattern.compile("(?<=Domain=)([^;]*)", 2);

    static {
        Covode.recordClassIndex(18401);
    }

    public C16108b(CookieHandler cookieHandler) {
        this.f38796b = cookieHandler;
    }

    @Override // okhttp3.AbstractC90186m
    public final List<C90184l> loadForRequest(C90200t tVar) {
        if (tVar == null) {
            return Collections.emptyList();
        }
        try {
            Map<String, List<String>> map = this.f38796b.get(tVar.mo145047b(), Collections.emptyMap());
            if (map == null || map.isEmpty()) {
                return Collections.emptyList();
            }
            ArrayList arrayList = null;
            for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                String key = entry.getKey();
                if (("Cookie".equalsIgnoreCase(key) || "Cookie2".equalsIgnoreCase(key)) && entry.getValue() != null && !entry.getValue().isEmpty()) {
                    for (String str : entry.getValue()) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.addAll(m29909a(tVar, str));
                    }
                }
            }
            if (arrayList != null) {
                return Collections.unmodifiableList(arrayList);
            }
            return Collections.emptyList();
        } catch (IOException unused) {
            return Collections.emptyList();
        }
    }

    /* renamed from: a */
    private static List<C90184l> m29909a(C90200t tVar, String str) {
        String[] split;
        if (TextUtils.isEmpty(str)) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : str.split(";")) {
            C90184l a = C90184l.m156747a(tVar, str2);
            if (a != null) {
                arrayList.add(a);
            }
        }
        return arrayList;
    }

    @Override // okhttp3.AbstractC90186m
    public final void saveFromResponse(C90200t tVar, List<C90184l> list) {
        if (tVar != null && !C13617h.m24465a(list)) {
            ArrayList arrayList = new ArrayList();
            for (C90184l lVar : list) {
                arrayList.add(lVar.toString());
            }
            try {
                this.f38796b.put(tVar.mo145047b(), Collections.singletonMap("Set-Cookie", arrayList));
            } catch (IOException unused) {
            }
        }
    }
}
