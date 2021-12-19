package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.selectmsg;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import java.util.HashMap;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.selectmsg.c */
public final class C54314c {

    /* renamed from: a */
    static HashMap<String, List<C19538ai>> f124413a;

    /* renamed from: b */
    public static HashMap<String, Integer> f124414b;

    /* renamed from: c */
    public static final C54314c f124415c = new C54314c();

    private C54314c() {
    }

    static {
        Covode.recordClassIndex(64011);
    }

    /* renamed from: a */
    public static final void m99607a() {
        if (f124414b != null) {
            f124414b = null;
        }
        if (f124413a != null) {
            f124413a = null;
        }
    }

    /* renamed from: a */
    public static final void m99608a(String str) {
        HashMap<String, List<C19538ai>> hashMap = f124413a;
        if (hashMap != null) {
            hashMap.remove(str);
        }
    }

    /* renamed from: a */
    public static final void m99609a(String str, Integer num) {
        if (f124414b == null) {
            f124414b = new HashMap<>();
        }
        HashMap<String, Integer> hashMap = f124414b;
        if (hashMap == null) {
            C89219l.m154715b();
        }
        hashMap.put(str, num);
    }

    /* renamed from: a */
    public static final void m99610a(String str, List<C19538ai> list) {
        if (f124413a == null) {
            f124413a = new HashMap<>();
        }
        HashMap<String, List<C19538ai>> hashMap = f124413a;
        if (hashMap == null) {
            C89219l.m154715b();
        }
        hashMap.put(str, list);
    }
}
