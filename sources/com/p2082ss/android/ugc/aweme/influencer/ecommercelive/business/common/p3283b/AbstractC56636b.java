package com.p2082ss.android.ugc.aweme.influencer.ecommercelive.business.common.p3283b;

import android.os.Bundle;
import androidx.lifecycle.AbstractC1174ac;
import com.bytedance.android.live.slot.AbstractC6166b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import java.lang.Enum;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.influencer.ecommercelive.business.common.b.b */
public abstract class AbstractC56636b<W, VM extends AbstractC1174ac, T extends Enum<T>> extends AbstractC6166b<W, VM, T> {

    /* renamed from: c */
    private final /* synthetic */ C56639e f129089c = new C56639e();

    static {
        Covode.recordClassIndex(66481);
    }

    /* renamed from: i */
    public final void mo93525i() {
        this.f129089c.mo93529a();
    }

    @Override // com.bytedance.android.live.slot.AbstractC6157ab, com.bytedance.android.live.slot.AbstractC6166b
    /* renamed from: d */
    public void mo12077d() {
        super.mo12077d();
        this.f129089c.mo93529a();
    }

    @Override // com.bytedance.android.live.slot.AbstractC6157ab, com.bytedance.android.live.slot.AbstractC6166b
    /* renamed from: a */
    public final void mo12070a(Bundle bundle) {
        super.mo12070a(bundle);
        this.f129089c.f129093a = System.currentTimeMillis();
    }

    /* renamed from: a */
    public final void mo93524a(C56638d dVar) {
        C89219l.m154721d(dVar, "");
        C56639e eVar = this.f129089c;
        C89219l.m154721d(dVar, "");
        if (eVar.f129094b) {
            eVar.f129094b = false;
            String str = dVar.f129090a;
            String str2 = dVar.f129091b;
            long currentTimeMillis = System.currentTimeMillis() - eVar.f129093a;
            String str3 = dVar.f129092c;
            C89219l.m154721d(str, "");
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("anchor_id", str2);
                jSONObject.put("room_id", str3);
                jSONObject.put("first_show_cost", currentTimeMillis);
                C39162r.m79461a(str, jSONObject);
            } catch (Exception unused) {
            }
        }
    }
}
