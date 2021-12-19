package com.p2082ss.android.ugc.aweme.bullet.module.p2419ad;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.kit.lynx.AbstractC16370a;
import com.bytedance.ies.bullet.kit.lynx.AbstractC16387b;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.p2082ss.android.ugc.aweme.bullet.business.AbstractC35125b;
import com.p2082ss.android.ugc.aweme.bullet.business.AdLynxStatBusiness;
import org.json.JSONObject;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.bullet.module.ad.f */
public final class C35191f extends AbstractC16370a.AbstractC16371a {

    /* renamed from: a */
    public final AbstractC35125b f83062a;

    static {
        Covode.recordClassIndex(42349);
    }

    @Override // com.bytedance.ies.bullet.kit.lynx.AbstractC16370a, com.bytedance.ies.bullet.kit.lynx.AbstractC16370a.AbstractC16371a
    /* renamed from: a */
    public final void mo25954a(AbstractC16387b bVar, Context context, AbstractC89183m<Object, ? super Throwable, C89391z> mVar) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(context, "");
        C89219l.m154721d(mVar, "");
    }

    @Override // com.bytedance.ies.bullet.kit.lynx.AbstractC16370a, com.bytedance.ies.bullet.kit.lynx.AbstractC16370a.AbstractC16371a
    /* renamed from: c */
    public final void mo25959c(AbstractC16387b bVar) {
        C89219l.m154721d(bVar, "");
    }

    @Override // com.bytedance.ies.bullet.kit.lynx.AbstractC16370a, com.bytedance.ies.bullet.kit.lynx.AbstractC16370a.AbstractC16371a
    /* renamed from: d */
    public final void mo25960d(AbstractC16387b bVar) {
        C89219l.m154721d(bVar, "");
    }

    @Override // com.bytedance.ies.bullet.kit.lynx.AbstractC16370a, com.bytedance.ies.bullet.kit.lynx.AbstractC16370a.AbstractC16371a
    /* renamed from: e */
    public final void mo25961e(AbstractC16387b bVar) {
        C89219l.m154721d(bVar, "");
    }

    @Override // com.bytedance.ies.bullet.kit.lynx.AbstractC16370a, com.bytedance.ies.bullet.kit.lynx.AbstractC16370a.AbstractC16371a
    /* renamed from: f */
    public final void mo25962f(AbstractC16387b bVar) {
        C89219l.m154721d(bVar, "");
    }

    @Override // com.bytedance.ies.bullet.kit.lynx.AbstractC16370a, com.bytedance.ies.bullet.kit.lynx.AbstractC16370a.AbstractC16371a
    /* renamed from: a */
    public final void mo25953a(AbstractC16387b bVar) {
        C89219l.m154721d(bVar, "");
        AdLynxStatBusiness adLynxStatBusiness = (AdLynxStatBusiness) this.f83062a.mo61972a(AdLynxStatBusiness.class);
        if (adLynxStatBusiness != null) {
            adLynxStatBusiness.f82854a = false;
            adLynxStatBusiness.f82855b = false;
            adLynxStatBusiness.f82857d.clear();
            adLynxStatBusiness.mo61934b();
        }
    }

    @Override // com.bytedance.ies.bullet.kit.lynx.AbstractC16370a, com.bytedance.ies.bullet.kit.lynx.AbstractC16370a.AbstractC16371a
    /* renamed from: b */
    public final void mo25958b(AbstractC16387b bVar) {
        C89219l.m154721d(bVar, "");
        AdLynxStatBusiness adLynxStatBusiness = (AdLynxStatBusiness) this.f83062a.mo61972a(AdLynxStatBusiness.class);
        if (adLynxStatBusiness != null) {
            adLynxStatBusiness.mo61931a();
        }
    }

    public C35191f(C16248b bVar, AbstractC35125b bVar2) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(bVar2, "");
        this.f83062a = bVar2;
    }

    @Override // com.bytedance.ies.bullet.kit.lynx.AbstractC16370a, com.bytedance.ies.bullet.kit.lynx.AbstractC16370a.AbstractC16371a
    /* renamed from: a */
    public final void mo25956a(AbstractC16387b bVar, String str) {
        C89219l.m154721d(bVar, "");
        AdLynxStatBusiness adLynxStatBusiness = (AdLynxStatBusiness) this.f83062a.mo61972a(AdLynxStatBusiness.class);
        if (adLynxStatBusiness != null) {
            adLynxStatBusiness.mo61932a(str);
        }
    }

    @Override // com.bytedance.ies.bullet.kit.lynx.AbstractC16370a, com.bytedance.ies.bullet.kit.lynx.AbstractC16370a.AbstractC16371a
    /* renamed from: a */
    public final void mo25957a(AbstractC16387b bVar, JSONObject jSONObject) {
        C89219l.m154721d(bVar, "");
        AdLynxStatBusiness adLynxStatBusiness = (AdLynxStatBusiness) this.f83062a.mo61972a(AdLynxStatBusiness.class);
        if (adLynxStatBusiness != null) {
            long j = -1;
            if (jSONObject != null) {
                j = jSONObject.optLong("first_page_layout", -1);
            }
            adLynxStatBusiness.f82856c = j;
        }
    }
}
