package com.p2082ss.android.ugc.aweme.bullet.business;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.kit.web.p1160b.AbstractC16485a;
import com.bytedance.ies.bullet.service.p1172f.p1173a.C16721b;
import com.p2082ss.android.ugc.aweme.bullet.business.BulletBusinessService;
import com.p2082ss.android.ugc.aweme.bullet.module.p2419ad.C35196j;
import org.json.JSONException;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.bullet.business.PlayableBusiness */
public final class PlayableBusiness extends BulletBusinessService.Business {

    /* renamed from: a */
    public boolean f82894a;

    static {
        Covode.recordClassIndex(42270);
    }

    /* renamed from: a */
    public final void mo61963a() {
        mo61964a(false, true);
    }

    /* renamed from: b */
    public final void mo61965b() {
        if (!this.f82894a) {
            mo61964a(false, true);
        }
    }

    /* renamed from: c */
    public final void mo61966c() {
        if (!this.f82894a) {
            mo61964a(true, false);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PlayableBusiness(C35123a aVar) {
        super(aVar);
        C89219l.m154721d(aVar, "");
    }

    /* renamed from: a */
    public final void mo61964a(boolean z, boolean z2) {
        Integer num;
        C16721b bVar = this.f82870k.f82900a;
        if ((bVar instanceof C35196j) && (num = (Integer) ((C35196j) bVar).f83086aa.mo26550b()) != null && num.intValue() == 1) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(C35127d.f82920b, z);
                jSONObject.put(C35127d.f82921c, z2);
                AbstractC16485a aVar = this.f82870k.f82902c;
                if (aVar != null) {
                    aVar.mo26191a(C35127d.f82919a, jSONObject);
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }
}
