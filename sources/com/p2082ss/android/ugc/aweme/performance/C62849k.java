package com.p2082ss.android.ugc.aweme.performance;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.api.AbstractC33631g;
import java.util.Iterator;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.performance.k */
public final class C62849k {

    /* renamed from: a */
    public long f142521a;

    /* renamed from: b */
    public long f142522b;

    /* renamed from: c */
    public long f142523c;

    /* renamed from: d */
    public AbstractC33631g f142524d;

    /* renamed from: e */
    public int f142525e;

    /* renamed from: f */
    public final String f142526f;

    static {
        Covode.recordClassIndex(73675);
    }

    public C62849k(String str) {
        C89219l.m154721d(str, "");
        this.f142526f = str;
    }

    /* renamed from: a */
    public static void m113260a(JSONObject jSONObject) {
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            Object obj = jSONObject.get(keys.next());
            if (((obj instanceof Integer) && ((Number) obj).intValue() < 0) || ((obj instanceof Long) && ((Number) obj).longValue() < 0)) {
                keys.remove();
            }
        }
    }
}
