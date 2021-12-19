package com.bytedance.android.livesdk.p425aa.p427b;

import com.bytedance.android.livesdk.p425aa.p428c.C6528g;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.aa.b.d */
public final class C6510d implements AbstractC6508b<C6528g> {
    static {
        Covode.recordClassIndex(7246);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.util.Map, java.lang.Object] */
    @Override // com.bytedance.android.livesdk.p425aa.p427b.AbstractC6508b
    /* renamed from: a */
    public final /* synthetic */ void mo12666a(Map map, C6528g gVar) {
        C6528g gVar2 = gVar;
        if (gVar2 != null) {
            if (gVar2.f16304g > 0) {
                map.put("channel_id", String.valueOf(gVar2.f16304g));
            }
            if (gVar2.f16299b > 0) {
                map.put("invitee_id", String.valueOf(gVar2.f16299b));
            }
            if (gVar2.f16298a > 0) {
                map.put("inviter_id", String.valueOf(gVar2.f16298a));
            }
            if (!C13627m.m24498a(gVar2.f16308k)) {
                map.put("match_type", gVar2.f16308k);
            }
            if (!C13627m.m24498a(gVar2.f16300c)) {
                map.put("end_type", gVar2.f16300c);
            }
            if (!C13627m.m24498a(gVar2.f16301d)) {
                map.put("connection_time", gVar2.f16301d);
            }
            if (!C13627m.m24498a(gVar2.f16302e)) {
                map.put("invitee_list", gVar2.f16302e);
            }
            if (!C13627m.m24498a(gVar2.f16303f)) {
                map.put("is_rematch", gVar2.f16303f);
            }
            map.put("pk_time", String.valueOf(gVar2.f16307j));
            if (!C13627m.m24498a(gVar2.f16305h)) {
                map.put("connection_type", gVar2.f16305h);
                if (gVar2.f16305h.equals("pk")) {
                    if (!C13627m.m24498a(gVar2.f16306i)) {
                        map.put("title", gVar2.f16306i);
                    }
                    if (gVar2.f16307j > 0) {
                        map.put("pk_time", String.valueOf(gVar2.f16307j));
                    }
                }
            }
        }
    }
}
