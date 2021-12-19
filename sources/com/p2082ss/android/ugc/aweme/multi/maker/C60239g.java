package com.p2082ss.android.ugc.aweme.multi.maker;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.EnumC31359ab;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.multi.AbstractC60201c;
import com.p2082ss.android.ugc.trill.R;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.multi.maker.g */
public final class C60239g extends AbstractC60267o {
    static {
        Covode.recordClassIndex(70771);
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.maker.AbstractC60267o
    /* renamed from: l */
    public final String mo97925l() {
        return "app_page";
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.maker.AbstractC60267o
    /* renamed from: m */
    public final boolean mo97926m() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60201c
    /* renamed from: i */
    public final AbstractC60201c mo97897i() {
        return new C60239g();
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.maker.AbstractC60267o
    /* renamed from: k */
    public final int mo97924k() {
        return EnumC31359ab.NEWS.getTYPE();
    }

    /* renamed from: n */
    private static boolean m109827n() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60201c
    /* renamed from: d */
    public final void mo97893d(C33744d dVar) {
        String schema;
        C89219l.m154721d(dVar, "");
        mo97952r();
        if (!C58029j.f132253e || !C58029j.m104846b() || C58029j.m104847c()) {
            C58029j.f132253e = m109827n();
        }
        if (!C58029j.f132253e) {
            new C23144b(mo97952r()).mo37640e(R.string.dck).mo37637b();
            return;
        }
        Activity e = mo97864a().mo97886e();
        AbstractC60267o.m109921a(this, dVar, false, false, 6);
        AnchorCommonStruct anchorCommonStruct = this.f137358h;
        if (!(anchorCommonStruct == null || (schema = anchorCommonStruct.getSchema()) == null)) {
            SmartRoute withParam = SmartRouter.buildRoute(e, schema).withParam("EVENT_NAME_WHEN_REQUEST", "request_anchor_detail").withParam("EVENT_NAME_FOR_STAY", "multi_anchor_stay_time");
            for (Map.Entry<String, String> entry : dVar.f79943a.entrySet()) {
                withParam = withParam.withParam(entry.getKey(), entry.getValue());
            }
            withParam.open();
        }
    }
}
