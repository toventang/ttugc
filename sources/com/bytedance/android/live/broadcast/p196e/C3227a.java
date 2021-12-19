package com.bytedance.android.live.broadcast.p196e;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.broadcast.e.a */
public final class C3227a {

    /* renamed from: a */
    public static final Map<String, String> f9267a = new LinkedHashMap();

    /* renamed from: b */
    public static final List<String> f9268b = new ArrayList();

    /* renamed from: c */
    public static boolean f9269c;

    /* renamed from: d */
    public static final C3227a f9270d = new C3227a();

    private C3227a() {
    }

    static {
        Covode.recordClassIndex(3708);
    }

    /* renamed from: a */
    public static void m8721a(String str) {
        C89219l.m154721d(str, "");
        List<String> list = f9268b;
        if (!list.contains(str)) {
            list.add(str);
        }
        f9267a.put("webview_banner", list.toString());
    }

    /* renamed from: b */
    public static void m8722b(String str) {
        C89219l.m154721d(str, "");
        List<String> list = f9268b;
        list.remove(str);
        f9267a.put("webview_banner", list.toString());
    }
}
