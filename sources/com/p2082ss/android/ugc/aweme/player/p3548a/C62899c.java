package com.p2082ss.android.ugc.aweme.player.p3548a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.player.a.c */
public final class C62899c {

    /* renamed from: a */
    public static final C62899c f142726a = new C62899c();

    /* renamed from: b */
    private static List<String> f142727b;

    private C62899c() {
    }

    static {
        Covode.recordClassIndex(73734);
        ArrayList arrayList = new ArrayList();
        f142727b = arrayList;
        arrayList.add("TCP_HIT");
        List<String> list = f142727b;
        if (list == null) {
            C89219l.m154715b();
        }
        list.add("TCP_MISS");
        List<String> list2 = f142727b;
        if (list2 == null) {
            C89219l.m154715b();
        }
        list2.add("HIT, HIT");
        List<String> list3 = f142727b;
        if (list3 == null) {
            C89219l.m154715b();
        }
        list3.add("HIT, MISS");
        List<String> list4 = f142727b;
        if (list4 == null) {
            C89219l.m154715b();
        }
        list4.add("MISS, HIT");
        List<String> list5 = f142727b;
        if (list5 == null) {
            C89219l.m154715b();
        }
        list5.add("MISS, MISS");
        List<String> list6 = f142727b;
        if (list6 == null) {
            C89219l.m154715b();
        }
        list6.add("HIT");
        List<String> list7 = f142727b;
        if (list7 == null) {
            C89219l.m154715b();
        }
        list7.add("MISS");
        List<String> list8 = f142727b;
        if (list8 == null) {
            C89219l.m154715b();
        }
        list8.add("TCP_MEM_HIT");
        List<String> list9 = f142727b;
        if (list9 == null) {
            C89219l.m154715b();
        }
        list9.add("TCP_REFRESH_HIT");
        List<String> list10 = f142727b;
        if (list10 == null) {
            C89219l.m154715b();
        }
        list10.add("TCP_REFRESH_MISS");
        List<String> list11 = f142727b;
        if (list11 == null) {
            C89219l.m154715b();
        }
        list11.add("TCP_REFRESH_FAIL_HIT");
        List<String> list12 = f142727b;
        if (list12 == null) {
            C89219l.m154715b();
        }
        list12.add("TCP_IMS_HIT");
        List<String> list13 = f142727b;
        if (list13 == null) {
            C89219l.m154715b();
        }
        list13.add("TCP_NEGATIVE_HIT");
    }

    /* renamed from: a */
    public static int m113294a(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        List<String> list = f142727b;
        if (list == null) {
            C89219l.m154715b();
        }
        for (String str2 : list) {
            if (str == null) {
                C89219l.m154715b();
            }
            if (C89361p.m154874b(str, str2, false)) {
                List<String> list2 = f142727b;
                if (list2 == null) {
                    C89219l.m154715b();
                }
                return list2.indexOf(str2) + 1;
            }
        }
        return 0;
    }
}
