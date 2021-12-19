package com.bytedance.android.livesdk.p425aa.p427b;

import com.bytedance.android.livesdk.p425aa.p428c.C6527f;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.aa.b.c */
public final class C6509c implements AbstractC6508b<C6527f> {
    static {
        Covode.recordClassIndex(7245);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.util.Map, java.lang.Object] */
    @Override // com.bytedance.android.livesdk.p425aa.p427b.AbstractC6508b
    /* renamed from: a */
    public final /* synthetic */ void mo12666a(Map map, C6527f fVar) {
        C6527f fVar2 = fVar;
        if (fVar2 != null) {
            if (fVar2.f16289a > 0) {
                map.put("channel_id", String.valueOf(fVar2.f16289a));
            }
            if (fVar2.f16290b > 0) {
                map.put("right_user_id", String.valueOf(fVar2.f16290b));
            }
            map.put("is_oncemore", String.valueOf(fVar2.f16297i));
            if (fVar2.f16291c > 0) {
                map.put("pk_time", String.valueOf(fVar2.f16291c));
                map.put("connection_type", fVar2.f16292d);
                map.put("match_type", fVar2.f16293e);
                if (fVar2.f16294f > 0) {
                    map.put("pk_id", String.valueOf(fVar2.f16294f));
                }
                if (C13627m.m24498a(fVar2.f16295g)) {
                    map.put("title", fVar2.f16295g);
                }
                if (fVar2.f16296h > 0) {
                    map.put("backdoor_time", String.valueOf(fVar2.f16296h));
                    return;
                }
                return;
            }
            map.put("connection_type", fVar2.f16292d);
        }
    }
}
