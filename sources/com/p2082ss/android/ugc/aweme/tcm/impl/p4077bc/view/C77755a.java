package com.p2082ss.android.ugc.aweme.tcm.impl.p4077bc.view;

import android.view.View;
import android.view.ViewStub;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63199ax;
import com.p2082ss.android.ugc.aweme.shortvideo.model.PublishExtensionModel;
import com.p2082ss.android.ugc.aweme.tcm.api.p4074b.C77731c;
import com.p2082ss.android.ugc.trill.R;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tcm.impl.bc.view.a */
public final class C77755a {

    /* renamed from: a */
    private BCInPublishLayout f174372a;

    static {
        Covode.recordClassIndex(90816);
    }

    public C77755a(ViewStub viewStub, AbstractC63199ax.AbstractC63200a aVar) {
        String str;
        C89219l.m154721d(viewStub, "");
        C89219l.m154721d(aVar, "");
        MethodCollector.m26663i(11021);
        if (viewStub.getParent() != null) {
            viewStub.setLayoutResource(R.layout.lr);
            viewStub.setInflatedId(R.id.r9);
            View inflate = viewStub.inflate();
            if (inflate != null) {
                this.f174372a = (BCInPublishLayout) inflate;
            } else {
                NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.tcm.impl.bc.view.BCInPublishLayout");
                MethodCollector.m26664o(11021);
                throw nullPointerException;
            }
        } else {
            this.f174372a = (BCInPublishLayout) viewStub.findViewById(R.id.r9);
        }
        BCInPublishLayout bCInPublishLayout = this.f174372a;
        if (bCInPublishLayout != null) {
            bCInPublishLayout.setMusicUsageOrigin(aVar.mo101681b());
        }
        BCInPublishLayout bCInPublishLayout2 = this.f174372a;
        if (bCInPublishLayout2 != null) {
            bCInPublishLayout2.setCommerceMusic(aVar.mo101682c());
        }
        BCInPublishLayout bCInPublishLayout3 = this.f174372a;
        if (bCInPublishLayout3 != null) {
            bCInPublishLayout3.setVisibility(0);
        }
        BCInPublishLayout bCInPublishLayout4 = this.f174372a;
        if (bCInPublishLayout4 != null) {
            bCInPublishLayout4.setPublishExtensionDataContainer(aVar);
        }
        BCInPublishLayout bCInPublishLayout5 = this.f174372a;
        if (bCInPublishLayout5 != null) {
            AbstractC63199ax.AbstractC63200a aVar2 = bCInPublishLayout5.f174355a;
            if (aVar2 != null) {
                str = aVar2.mo101676a();
            } else {
                str = null;
            }
            PublishExtensionModel fromString = PublishExtensionModel.fromString(str);
            String str2 = fromString.outerStarAtlas;
            if (!(str2 == null || str2.length() == 0)) {
                JSONObject jSONObject = new JSONObject(fromString.outerStarAtlas);
                if (C89219l.m154714a((Object) jSONObject.optString("recordParam"), (Object) "tcm") && jSONObject.optString("campaignInfo") != null) {
                    C77731c.m135807b("1");
                }
            }
            MethodCollector.m26664o(11021);
            return;
        }
        MethodCollector.m26664o(11021);
    }
}
