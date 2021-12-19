package com.p2082ss.android.ugc.aweme.p2282ad.preload;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;
import p4600h.C89378p;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ad.preload.c */
public final class C33366c {

    /* renamed from: a */
    static C89378p<String, ? extends JSONObject> f79307a;

    /* renamed from: b */
    public static final C33366c f79308b = new C33366c();

    private C33366c() {
    }

    static {
        Covode.recordClassIndex(40212);
    }

    /* renamed from: a */
    public static JSONObject m68418a(String str) {
        String str2;
        C89378p<String, ? extends JSONObject> pVar;
        if (f79307a == null || TextUtils.isEmpty(str)) {
            return null;
        }
        C89378p<String, ? extends JSONObject> pVar2 = f79307a;
        if (pVar2 != null) {
            str2 = pVar2.getFirst();
        } else {
            str2 = null;
        }
        if (!C89219l.m154714a((Object) str2, (Object) str) || (pVar = f79307a) == null) {
            return null;
        }
        return (JSONObject) pVar.getSecond();
    }
}
