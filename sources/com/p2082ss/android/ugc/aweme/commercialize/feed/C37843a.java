package com.p2082ss.android.ugc.aweme.commercialize.feed;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.kit.p1148a.C16343g;
import com.bytedance.ies.bullet.kit.p1148a.p1149a.C16326f;
import com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16208i;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h;
import com.bytedance.ies.bullet.p1184ui.common.BulletContainerView;
import com.bytedance.ies.bullet.p1184ui.common.p1187c.C17029d;
import com.bytedance.ies.bullet.service.base.EnumC16636e;
import com.bytedance.ies.bullet.service.base.IResourceLoaderService;
import com.bytedance.ies.bullet.service.base.p1164b.C16622e;
import com.bytedance.ies.bullet.service.base.resourceloader.config.GeckoConfig;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.AbstractC16741q;
import com.p2082ss.android.ugc.aweme.bullet.AbstractC34952a;
import com.p2082ss.android.ugc.aweme.bullet.AbstractC35142e;
import com.p2082ss.android.ugc.aweme.bullet.C34963b;
import com.p2082ss.android.ugc.aweme.bullet.module.base.C35229g;
import com.p2082ss.android.ugc.aweme.bullet.utils.C35301c;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.feed.a */
public final class C37843a implements AbstractC17046h.AbstractC17048b, AbstractC35142e {

    /* renamed from: a */
    private final BulletContainerView f89340a;

    /* renamed from: b */
    private final String f89341b;

    /* renamed from: c */
    private final AbstractC34952a f89342c;

    static {
        Covode.recordClassIndex(45295);
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h.AbstractC17048b
    /* renamed from: a */
    public final void mo25851a(Uri uri) {
        C89219l.m154721d(uri, "");
        AbstractC34952a aVar = this.f89342c;
        if (aVar != null) {
            aVar.mo25851a(uri);
        }
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h.AbstractC17048b
    /* renamed from: a */
    public final void mo25852a(Uri uri, Throwable th) {
        C89219l.m154721d(uri, "");
        C89219l.m154721d(th, "");
        AbstractC34952a aVar = this.f89342c;
        if (aVar != null) {
            aVar.mo25852a(uri, th);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.AbstractC35142e
    /* renamed from: a */
    public final void mo61984a(String str, Bundle bundle) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(bundle, "");
        BulletContainerView bulletContainerView = this.f89340a;
        bulletContainerView.mo25820a(C34963b.m71411a().mo61850a());
        C16248b bVar = new C16248b();
        String str2 = this.f89341b;
        if (!(str2 == null || str2.length() == 0)) {
            String str3 = this.f89341b;
            C89219l.m154721d(str3, "");
            C37874b.f89375a = str3;
            IResourceLoaderService iResourceLoaderService = (IResourceLoaderService) C16622e.C16623a.m30858a().mo26346a(IResourceLoaderService.class);
            if (iResourceLoaderService != null) {
                GeckoConfig a = C16326f.m30330a(C16343g.C16345b.f39286a.mo25918a(iResourceLoaderService), this.f89341b);
                if (true ^ C89219l.m154714a((Object) a.getAccessKey(), (Object) this.f89341b)) {
                    iResourceLoaderService.registerConfig(this.f89341b, new GeckoConfig(this.f89341b, a.getOfflineDir(), a.getLoaderDepender(), false, false, 24, null));
                }
                iResourceLoaderService.registerCustomLoader(C37874b.class, EnumC16636e.HIGH);
            }
        }
        List a2 = C89070n.m154516a("ad_commerce");
        Context context = bulletContainerView.getContext();
        C89219l.m154716b(context, "");
        bulletContainerView.mo26837a(C35301c.m72248a(str, a2, bundle, new C35229g(context)), bundle, bVar, this);
    }

    public C37843a(BulletContainerView bulletContainerView, String str, AbstractC34952a aVar) {
        C89219l.m154721d(bulletContainerView, "");
        this.f89340a = bulletContainerView;
        this.f89341b = str;
        this.f89342c = aVar;
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h.AbstractC17048b
    /* renamed from: a */
    public final void mo25853a(View view, Uri uri, AbstractC16208i iVar) {
        C89219l.m154721d(view, "");
        C89219l.m154721d(uri, "");
        C89219l.m154721d(iVar, "");
        AbstractC34952a aVar = this.f89342c;
        if (aVar != null) {
            aVar.mo25853a(view, uri, iVar);
        }
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h.AbstractC17048b
    /* renamed from: a */
    public final void mo25854a(AbstractC16208i iVar, Uri uri, AbstractC16741q qVar) {
        C89219l.m154721d(iVar, "");
        C89219l.m154721d(uri, "");
        C89219l.m154721d(qVar, "");
        AbstractC34952a aVar = this.f89342c;
        if (aVar != null) {
            aVar.mo25854a(iVar, uri, qVar);
        }
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h.AbstractC17048b
    /* renamed from: a */
    public final void mo25855a(List<? extends C17029d<? extends View>> list, Uri uri, AbstractC16208i iVar, boolean z) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(uri, "");
        C89219l.m154721d(iVar, "");
        AbstractC34952a aVar = this.f89342c;
        if (aVar != null) {
            aVar.mo25855a(list, uri, iVar, z);
        }
    }
}
