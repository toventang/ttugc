package com.p2082ss.android.ugc.playerkit.model;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.playerkit.model.w */
public final class C84226w {

    /* renamed from: a */
    public static final C84226w f188289a = new C84226w();

    /* renamed from: b */
    private static List<String> f188290b;

    private C84226w() {
    }

    static {
        Covode.recordClassIndex(98133);
        ArrayList arrayList = new ArrayList();
        f188290b = arrayList;
        arrayList.add("TCP_HIT");
        List<String> list = f188290b;
        if (list == null) {
            C89219l.m154707a();
        }
        list.add("TCP_MISS");
        List<String> list2 = f188290b;
        if (list2 == null) {
            C89219l.m154707a();
        }
        list2.add("HIT, HIT");
        List<String> list3 = f188290b;
        if (list3 == null) {
            C89219l.m154707a();
        }
        list3.add("HIT, MISS");
        List<String> list4 = f188290b;
        if (list4 == null) {
            C89219l.m154707a();
        }
        list4.add("MISS, HIT");
        List<String> list5 = f188290b;
        if (list5 == null) {
            C89219l.m154707a();
        }
        list5.add("MISS, MISS");
        List<String> list6 = f188290b;
        if (list6 == null) {
            C89219l.m154707a();
        }
        list6.add("HIT");
        List<String> list7 = f188290b;
        if (list7 == null) {
            C89219l.m154707a();
        }
        list7.add("MISS");
        List<String> list8 = f188290b;
        if (list8 == null) {
            C89219l.m154707a();
        }
        list8.add("TCP_MEM_HIT");
        List<String> list9 = f188290b;
        if (list9 == null) {
            C89219l.m154707a();
        }
        list9.add("TCP_REFRESH_HIT");
        List<String> list10 = f188290b;
        if (list10 == null) {
            C89219l.m154707a();
        }
        list10.add("TCP_REFRESH_MISS");
        List<String> list11 = f188290b;
        if (list11 == null) {
            C89219l.m154707a();
        }
        list11.add("TCP_REFRESH_FAIL_HIT");
        List<String> list12 = f188290b;
        if (list12 == null) {
            C89219l.m154707a();
        }
        list12.add("TCP_IMS_HIT");
        List<String> list13 = f188290b;
        if (list13 == null) {
            C89219l.m154707a();
        }
        list13.add("TCP_NEGATIVE_HIT");
    }

    /* renamed from: a */
    public static int m144819a(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        List<String> list = f188290b;
        if (list == null) {
            C89219l.m154707a();
        }
        for (String str2 : list) {
            if (str == null) {
                C89219l.m154707a();
            }
            if (C89361p.m154874b(str, str2, false)) {
                List<String> list2 = f188290b;
                if (list2 == null) {
                    C89219l.m154707a();
                }
                return list2.indexOf(str2) + 1;
            }
        }
        return 0;
    }

    /* renamed from: a */
    public static String m144820a(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        if (str == null) {
            C89219l.m154707a();
        }
        if (str.length() <= i) {
            return str;
        }
        String substring = str.substring(0, i - 1);
        C89219l.m154709a((Object) substring, "");
        return substring;
    }
}
