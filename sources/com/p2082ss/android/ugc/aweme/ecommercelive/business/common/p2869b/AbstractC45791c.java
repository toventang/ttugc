package com.p2082ss.android.ugc.aweme.ecommercelive.business.common.p2869b;

import android.os.Bundle;
import androidx.lifecycle.AbstractC1174ac;
import com.bytedance.android.live.slot.AbstractC6166b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import java.lang.Enum;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommercelive.business.common.b.c */
public abstract class AbstractC45791c<W, VM extends AbstractC1174ac, T extends Enum<T>> extends AbstractC6166b<W, VM, T> {

    /* renamed from: c */
    private final /* synthetic */ C45794f f106689c = new C45794f();

    /* renamed from: i */
    public String f106690i = "-1";

    static {
        Covode.recordClassIndex(54309);
    }

    @Override // com.bytedance.android.live.slot.AbstractC6157ab, com.bytedance.android.live.slot.AbstractC6166b
    /* renamed from: d */
    public void mo12077d() {
        super.mo12077d();
        C45794f fVar = this.f106689c;
        fVar.f106694a = 0;
        fVar.f106695b = true;
    }

    @Override // com.bytedance.android.live.slot.AbstractC6157ab, com.bytedance.android.live.slot.AbstractC6166b
    /* renamed from: a */
    public void mo12070a(Bundle bundle) {
        super.mo12070a(bundle);
        this.f106689c.f106694a = System.currentTimeMillis();
    }

    /* renamed from: a */
    public final void mo77098a(C45793e eVar) {
        C89219l.m154721d(eVar, "");
        C45794f fVar = this.f106689c;
        C89219l.m154721d(eVar, "");
        if (fVar.f106695b) {
            fVar.f106695b = false;
            String str = eVar.f106691a;
            String str2 = eVar.f106692b;
            long currentTimeMillis = System.currentTimeMillis() - fVar.f106694a;
            String str3 = eVar.f106693c;
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
