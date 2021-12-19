package com.p2082ss.android.ugc.aweme.compliance.protection.restrictmode.p2678a;

import android.text.TextUtils;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.tiktok.homepage.mainfragment.toolbar.AbstractC22772b;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AnimatedImageView;
import com.p2082ss.android.ugc.aweme.base.utils.C34729o;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.compliance.api.p2639c.AbstractC39237h;
import com.p2082ss.android.ugc.aweme.homepage.p3055ui.experiment.SpecialTopicEntry;
import com.p2082ss.android.ugc.aweme.utils.C80580in;

/* renamed from: com.ss.android.ugc.aweme.compliance.protection.restrictmode.a.a */
public final class C40093a implements AbstractC39237h {
    static {
        Covode.recordClassIndex(47869);
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.p2639c.AbstractC39237h
    /* renamed from: a */
    public final void mo68127a(Object obj, View view, View view2, View view3) {
        if (C39223a.m79601o().mo68703a()) {
            C34729o.m70956a(false, view3);
            view.setVisibility(0);
            AbstractC22772b bVar = (AbstractC22772b) obj;
            AnimatedImageView animatedImageView = (AnimatedImageView) view2;
            SpecialTopicEntry i = bVar.mo37094i();
            if (i != null && i.getEnable() && !TextUtils.isEmpty(i.getLandingRoute()) && !TextUtils.isEmpty(i.getIconUrl())) {
                if (!C80580in.m139687c() || i.getChildViewable()) {
                    C34729o.m70959b(true, animatedImageView);
                    C34577e.m70608b(animatedImageView, i.getIconUrl(), -1, -1);
                    C39162r.m79460a("topic_entrance_show", new C33744d().mo59983a("enter_from", bVar.mo37091g()).mo59983a(StringSet.type, i.getEventName()).mo59983a("url", i.getLandingRoute()).f79943a);
                    animatedImageView.setOnClickListener(new View$OnClickListenerC40094b(bVar, i));
                }
            }
        }
    }
}
