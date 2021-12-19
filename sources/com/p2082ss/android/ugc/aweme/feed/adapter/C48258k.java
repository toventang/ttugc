package com.p2082ss.android.ugc.aweme.feed.adapter;

import android.text.TextUtils;
import com.bytedance.android.livesdkapi.depend.p680d.AbstractC11656k;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.k */
public final class C48258k implements AbstractC11656k {

    /* renamed from: b */
    public final ConcurrentHashMap<String, String> f111789b = new ConcurrentHashMap<>();

    static {
        Covode.recordClassIndex(57000);
    }

    @Override // com.bytedance.android.livesdkapi.depend.p680d.AbstractC11656k
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Map mo18427a() {
        return this.f111789b;
    }

    @Override // com.bytedance.android.livesdkapi.depend.p680d.AbstractC11656k
    /* renamed from: b */
    public final Map<String, String> mo18430b() {
        return mo18427a();
    }

    @Override // com.bytedance.android.livesdkapi.depend.p680d.AbstractC11656k
    /* renamed from: e */
    public final void mo18433e() {
        mo18428a("sdk_player_first_frame", String.valueOf(System.currentTimeMillis()));
    }

    @Override // com.bytedance.android.livesdkapi.depend.p680d.AbstractC11656k
    /* renamed from: c */
    public final void mo18431c() {
        if (mo18427a() instanceof HashMap) {
            Map<String, String> a = mo18427a();
            Objects.requireNonNull(a, "null cannot be cast to non-null type kotlin.collections.HashMap<kotlin.String, kotlin.String> /* = java.util.HashMap<kotlin.String, kotlin.String> */");
            ((HashMap) a).clear();
        } else if (mo18427a() instanceof ConcurrentHashMap) {
            Map<String, String> a2 = mo18427a();
            Objects.requireNonNull(a2, "null cannot be cast to non-null type java.util.concurrent.ConcurrentHashMap<kotlin.String, kotlin.String>");
            ((ConcurrentHashMap) a2).clear();
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.p680d.AbstractC11656k
    /* renamed from: d */
    public final long mo18432d() {
        long j;
        long j2;
        String str = this.f111789b.get("start");
        if (str != null) {
            j = Long.parseLong(str);
        } else {
            j = Long.MAX_VALUE;
        }
        String str2 = this.f111789b.get("sdk_player_first_frame");
        if (str2 != null) {
            j2 = Long.parseLong(str2);
        } else {
            j2 = Long.MIN_VALUE;
        }
        long j3 = j2 - j;
        if (j3 >= 0) {
            return j3;
        }
        return -1;
    }

    @Override // com.bytedance.android.livesdkapi.depend.p680d.AbstractC11656k
    /* renamed from: f */
    public final long mo18434f() {
        Long l;
        String str = this.f111789b.get("start");
        Long l2 = null;
        if (str != null) {
            l = C89361p.m154865g(str);
        } else {
            l = null;
        }
        String str2 = this.f111789b.get("player_first_video_package_end");
        if (str2 != null) {
            l2 = C89361p.m154865g(str2);
        }
        if (l == null || l2 == null) {
            return 0;
        }
        return l2.longValue() - l.longValue();
    }

    @Override // com.bytedance.android.livesdkapi.depend.p680d.AbstractC11656k
    /* renamed from: a */
    public final void mo18429a(JSONObject jSONObject) {
        C89219l.m154721d(jSONObject, "");
        String optString = jSONObject.optString("event_key");
        C89219l.m154716b(optString, "");
        if (TextUtils.equals(optString, "first_frame")) {
            int length = AbstractC11656k.C11657a.f27790a.length;
            for (int i = 0; i < length; i++) {
                String str = AbstractC11656k.C11657a.f27790a[i];
                long optLong = jSONObject.optLong(AbstractC11656k.C11657a.f27791b[i], 0);
                if (optLong != 0) {
                    this.f111789b.put(str, String.valueOf(optLong));
                }
            }
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.p680d.AbstractC11656k
    /* renamed from: a */
    public final void mo18428a(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            this.f111789b.put(str, str2);
        }
    }
}
