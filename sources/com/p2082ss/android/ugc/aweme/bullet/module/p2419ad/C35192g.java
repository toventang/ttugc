package com.p2082ss.android.ugc.aweme.bullet.module.p2419ad;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16208i;
import com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16210j;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.p2082ss.android.ugc.aweme.bullet.business.AbstractC35125b;
import com.p2082ss.android.ugc.aweme.bullet.business.AdLynxStatBusiness;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.bullet.module.ad.g */
public final class C35192g implements AbstractC16210j {

    /* renamed from: a */
    public final AbstractC35125b f83063a;

    static {
        Covode.recordClassIndex(42350);
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16210j
    /* renamed from: a */
    public final void mo25781a(AbstractC16208i iVar) {
        C89219l.m154721d(iVar, "");
        AbstractC16210j.C16211a.m30127a(iVar);
    }

    public C35192g(C16248b bVar, AbstractC35125b bVar2) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(bVar2, "");
        this.f83063a = bVar2;
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16210j
    /* renamed from: a */
    public final void mo25782a(AbstractC16208i iVar, Uri uri) {
        C89219l.m154721d(iVar, "");
        C89219l.m154721d(uri, "");
        AbstractC16210j.C16211a.m30128a(iVar, uri);
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16210j
    /* renamed from: a */
    public final void mo25784a(AbstractC16208i iVar, Throwable th) {
        AdLynxStatBusiness adLynxStatBusiness;
        C89219l.m154721d(iVar, "");
        if (th != null && (adLynxStatBusiness = (AdLynxStatBusiness) this.f83063a.mo61972a(AdLynxStatBusiness.class)) != null) {
            adLynxStatBusiness.mo61935b(th.getMessage());
        }
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16210j
    /* renamed from: a */
    public final void mo25783a(AbstractC16208i iVar, Uri uri, AbstractC89172b<? super Uri, C89391z> bVar, AbstractC89172b<? super Throwable, C89391z> bVar2) {
        C89219l.m154721d(iVar, "");
        C89219l.m154721d(uri, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(bVar2, "");
        AbstractC16210j.C16211a.m30129a(iVar, uri, bVar, bVar2);
    }
}
