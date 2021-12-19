package com.bytedance.ies.p1191d.p1192a;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import p4600h.C89378p;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.bytedance.ies.d.a.r */
public final class C17132r {

    /* renamed from: a */
    private final Map<String, List<C17093af>> f40740a;

    static {
        Covode.recordClassIndex(19589);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.Map<java.lang.String, ? extends java.util.List<? extends com.bytedance.ies.d.a.af>> */
    /* JADX WARN: Multi-variable type inference failed */
    private C17132r(Map<String, ? extends List<? extends C17093af>> map) {
        C89219l.m154719c(map, "");
        this.f40740a = map;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C17132r(org.json.JSONObject r11) {
        /*
        // Method dump skipped, instructions count: 106
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.p1191d.p1192a.C17132r.<init>(org.json.JSONObject):void");
    }

    /* renamed from: a */
    public final C89378p<List<String>, SortedMap<String, String>> mo27042a(C17100aj ajVar) {
        String str;
        List<C17093af> list;
        String str2 = "";
        C89219l.m154719c(ajVar, str2);
        String str3 = ajVar.f40701b;
        if (this.f40740a.containsKey(str3)) {
            list = this.f40740a.get(str3);
        } else {
            Uri a = ajVar.mo27010a();
            String path = a.getPath();
            if (path == null || (list = this.f40740a.get(path)) == null) {
                String path2 = a.getPath();
                if (path2 != null) {
                    str2 = path2;
                }
                if (C89361p.m154906a((CharSequence) str2, '/')) {
                    str = C89361p.m154911b(str2, '/');
                } else {
                    str = str2 + '/';
                }
                list = this.f40740a.get(str);
            }
        }
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                List<String> a2 = it.next().mo27001a(ajVar);
                if (a2 != null) {
                    return new C89378p<>(a2, null);
                }
            }
        }
        return null;
    }
}
