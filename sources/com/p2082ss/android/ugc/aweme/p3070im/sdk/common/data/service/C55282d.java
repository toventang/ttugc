package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.service;

import android.app.Activity;
import android.app.Dialog;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1208im.core.api.C17419b;
import com.bytedance.ies.p1208im.core.api.p1213c.AbstractC17446a;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55197c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55212h;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.p3245ui.nested.DialogC56125a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.p3245ui.p3247b.C56090a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.p3245ui.p3249d.DialogC56104a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.p3238a.p3239a.C55968c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.p3241ui.p3243b.C55978b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.p3241ui.p3243b.C55979c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.p3241ui.widget.LongPressShareWidget;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.p3241ui.widget.SharePanelWidget;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3260j.AbstractC56234c;
import com.p2082ss.android.ugc.aweme.p3070im.service.share.AbstractC56267b;
import com.p2082ss.android.ugc.aweme.p3070im.service.share.C56271c;
import com.p2082ss.android.ugc.aweme.p3070im.service.share.p3264a.AbstractC56263a;
import com.p2082ss.android.ugc.aweme.p3070im.service.share.p3264a.AbstractC56264b;
import com.p2082ss.android.ugc.aweme.p3070im.service.share.p3264a.AbstractC56266c;
import com.p2082ss.android.ugc.aweme.p3070im.service.share.p3265b.C56268a;
import com.p2082ss.android.ugc.aweme.p3070im.service.share.p3265b.C56269b;
import com.p2082ss.android.ugc.aweme.p3070im.service.share.p3265b.C56270c;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.C69684e;
import java.util.Set;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.data.service.d */
public final class C55282d implements AbstractC56234c {
    static {
        Covode.recordClassIndex(65037);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.p3260j.AbstractC56234c
    /* renamed from: a */
    public final AbstractC56267b mo92294a(C56270c cVar) {
        C89219l.m154721d(cVar, "");
        return new C55979c(cVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.p3260j.AbstractC56234c
    /* renamed from: a */
    public final void mo92295a(C56268a aVar, AbstractC56264b bVar) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(bVar, "");
        new LongPressShareWidget(aVar, bVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.p3260j.AbstractC56234c
    /* renamed from: a */
    public final AbstractC56267b mo92293a(C56269b bVar, AbstractC56266c cVar) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(cVar, "");
        C17419b.m32261a().mo27887a(AbstractC17446a.EnumC17447a.ENTER_SHARE_PANEL);
        C55978b bVar2 = new C55978b(bVar, cVar);
        cVar.mo90146a(bVar2);
        C56269b bVar3 = bVar2.f127645b;
        if (!C55197c.m100917a() || C55212h.m100953a(bVar2.f127645b.f128359k) || bVar3 == null) {
            bVar2.f127645b.f128352a.setVisibility(8);
        } else {
            bVar2.f127644a = new SharePanelWidget(bVar2.f127645b, bVar2.f127646c);
        }
        return bVar2;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.p3260j.AbstractC56234c
    /* renamed from: a */
    public final Dialog mo92292a(Activity activity, C69684e eVar, C56271c cVar, int i, AbstractC56264b bVar) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(eVar, "");
        if (cVar == null) {
            return C56090a.m101988a(activity, eVar.f155557i, (Set) null, true, (AbstractC56263a) null, false, (C55968c) null, 236);
        }
        C89219l.m154721d(activity, "");
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(cVar, "");
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        if (!g.isLogin()) {
            return new DialogC56104a(activity, cVar);
        }
        return new DialogC56125a(activity, cVar, bVar, eVar, i);
    }
}
