package com.p2082ss.android.ugc.aweme.share.improve.p3757b;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.bytedance.tux.p1710c.C22999a;
import com.bytedance.tux.p1710c.C23005c;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.awemeservice.AwemeService;
import com.p2082ss.android.ugc.aweme.base.utils.C34722h;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38189j;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.feed.C48314ai;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.login.C58957c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices.IMService;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.u16.controller.IMUnder16ProxyImpl;
import com.p2082ss.android.ugc.aweme.p3070im.service.IIMService;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3260j.AbstractC56234c;
import com.p2082ss.android.ugc.aweme.p3070im.service.share.AbstractC56267b;
import com.p2082ss.android.ugc.aweme.p3070im.service.share.p3265b.C56270c;
import com.p2082ss.android.ugc.aweme.share.improve.p3758c.C69124b;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69645h;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.C69684e;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import com.p2082ss.android.ugc.aweme.utils.C80519gy;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.improve.b.d */
public final class C69115d extends AbstractC69118e {

    /* renamed from: c */
    public static final C69116a f154559c = new C69116a((byte) 0);

    /* renamed from: a */
    public AbstractC56267b f154560a;

    /* renamed from: b */
    public boolean f154561b;

    /* renamed from: d */
    private final SharePackage f154562d;

    /* renamed from: e */
    private final String f154563e;

    /* renamed from: f */
    private final int f154564f;

    static {
        Covode.recordClassIndex(81429);
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b
    /* renamed from: a */
    public final String mo109548a() {
        return "chat_merge";
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b
    /* renamed from: a */
    public final boolean mo109549a(Context context, AbstractC69645h hVar) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(hVar, "");
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.b.d$a */
    public static final class C69116a {
        static {
            Covode.recordClassIndex(81430);
        }

        private C69116a() {
        }

        public /* synthetic */ C69116a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b
    /* renamed from: b */
    public final String mo109553b() {
        String b = C34722h.m70923b(R.string.frb);
        C89219l.m154716b(b, "");
        return b;
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.b.d$b */
    static final class C69117b extends AbstractC89220m implements AbstractC89172b<C22999a, C89391z> {

        /* renamed from: a */
        public static final C69117b f154565a = new C69117b();

        static {
            Covode.recordClassIndex(81431);
        }

        C69117b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C22999a aVar) {
            C22999a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            aVar2.f54431a = R.raw.icon_color_direct_message_circle;
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b
    /* renamed from: a */
    public final Drawable mo109547a(Context context) {
        if (context != null) {
            return C23005c.m43393a(C69117b.f154565a).mo37368a(context);
        }
        return null;
    }

    private C69115d(SharePackage sharePackage, String str) {
        AbstractC56267b bVar;
        AbstractC56234c shareService;
        C89219l.m154721d(sharePackage, "");
        C89219l.m154721d(str, "");
        this.f154562d = sharePackage;
        this.f154563e = str;
        this.f154564f = R.style.wi;
        IIMService createIIMServicebyMonsterPlugin = IMService.createIIMServicebyMonsterPlugin(false);
        if (createIIMServicebyMonsterPlugin == null || (shareService = createIIMServicebyMonsterPlugin.getShareService()) == null) {
            bVar = null;
        } else {
            bVar = shareService.mo92294a(new C56270c(C17867d.m33078a(), sharePackage));
        }
        this.f154560a = bVar;
        this.f154561b = true;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b
    /* renamed from: a */
    public final boolean mo61913a(AbstractC69645h hVar, Context context) {
        C89219l.m154721d(hVar, "");
        C89219l.m154721d(context, "");
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        if (!g.isLogin()) {
            C58957c.m108318a(C69124b.m122223a(context), this.f154563e, "click_shareim_button");
            return true;
        } else if (IMUnder16ProxyImpl.m102047n().mo93021c()) {
            IMUnder16ProxyImpl.m102047n().mo93026h();
            return true;
        } else {
            Activity a = C69124b.m122223a(context);
            if (a == null) {
                return false;
            }
            if (!this.f154561b) {
                new C23144b(a).mo37640e(R.string.fi1).mo37637b();
                return true;
            }
            AbstractC56234c shareService = IMService.createIIMServicebyMonsterPlugin(false).getShareService();
            if (shareService != null) {
                C69684e.C69686b bVar = new C69684e.C69686b();
                bVar.f155583n = this.f154562d;
                Dialog a2 = shareService.mo92292a(a, bVar.mo109831a(), null, this.f154564f, null);
                if (a2 != null) {
                    a2.show();
                }
            }
            C48314ai.m91746a("chat_merge");
            long j = this.f154562d.f155492i.getLong("ad_id");
            if (j != 0) {
                Aweme e = AwemeService.m70060b().mo60691e(String.valueOf(j));
                if (C37699a.m76314s(e)) {
                    C38189j.m77541p(context, e);
                    C89219l.m154716b(e, "");
                    C18129a.m33746a("draw_ad", "share", e.getAwemeRawAd()).mo28897a("anchor_id", C80519gy.m139579b(e)).mo28897a("room_id", C80519gy.m139578a(e)).mo28902c();
                }
            }
            return true;
        }
    }

    public /* synthetic */ C69115d(SharePackage sharePackage, String str, byte b) {
        this(sharePackage, str);
    }
}
