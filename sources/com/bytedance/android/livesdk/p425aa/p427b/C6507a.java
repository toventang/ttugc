package com.bytedance.android.livesdk.p425aa.p427b;

import android.text.TextUtils;
import com.bytedance.android.livesdk.p425aa.p428c.C6526e;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.aa.b.a */
public final class C6507a implements AbstractC6508b<C6526e> {
    static {
        Covode.recordClassIndex(7243);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.util.Map, java.lang.Object] */
    @Override // com.bytedance.android.livesdk.p425aa.p427b.AbstractC6508b
    /* renamed from: a */
    public final /* synthetic */ void mo12666a(Map map, C6526e eVar) {
        C6526e eVar2 = eVar;
        if (eVar2 != null) {
            if (!TextUtils.isEmpty(eVar2.f16285a)) {
                map.put("request_page", eVar2.f16285a);
            }
            if (eVar2.f16286b > 0) {
                map.put("to_user_id", String.valueOf(eVar2.f16286b));
            }
            if (!TextUtils.isEmpty(eVar2.f16287c)) {
                map.put(StringSet.type, eVar2.f16287c);
            }
        }
    }
}
