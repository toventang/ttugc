package com.p2082ss.android.ugc.aweme.multi.maker;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.EnumC31359ab;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.login.C58957c;
import com.p2082ss.android.ugc.aweme.multi.AbstractC60201c;
import com.p2082ss.android.ugc.trill.R;
import org.greenrobot.eventbus.EventBus;
import p4600h.C89387v;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.multi.maker.n */
public final class C60265n extends AbstractC60267o {

    /* renamed from: d */
    private C33744d f137352d;

    static {
        Covode.recordClassIndex(70797);
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60201c
    /* renamed from: i */
    public final AbstractC60201c mo97897i() {
        return new C60265n();
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.maker.AbstractC60267o
    /* renamed from: k */
    public final int mo97924k() {
        return EnumC31359ab.SHOUTOUT.getTYPE();
    }

    /* renamed from: n */
    private static boolean m109912n() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.multi.maker.n$a */
    static final class C60266a implements AbstractC34543f {

        /* renamed from: a */
        final /* synthetic */ C60265n f137353a;

        /* renamed from: b */
        final /* synthetic */ C33744d f137354b;

        /* renamed from: c */
        final /* synthetic */ Activity f137355c;

        static {
            Covode.recordClassIndex(70798);
        }

        C60266a(C60265n nVar, C33744d dVar, Activity activity) {
            this.f137353a = nVar;
            this.f137354b = dVar;
            this.f137355c = activity;
        }

        @Override // com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f
        /* renamed from: b */
        public final void mo57674b() {
        }

        @Override // com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f
        /* renamed from: a */
        public final void mo57673a() {
            String str;
            String schema;
            C33744d dVar = this.f137354b;
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            if (g.isLogin()) {
                str = "1";
            } else {
                str = "0";
            }
            dVar.mo59983a("login_status", str);
            AbstractC60267o.m109921a(this.f137353a, this.f137354b, false, false, 6);
            AnchorCommonStruct anchorCommonStruct = this.f137353a.f137358h;
            if (anchorCommonStruct != null && (schema = anchorCommonStruct.getSchema()) != null) {
                EventBus.m156966a(EventBus.m156962a(), this.f137353a);
                SmartRouter.buildRoute(this.f137355c, schema).withParam("need_close_event", true).withParam("enter_from", this.f137353a.mo97950p()).open();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60201c, com.p2082ss.android.ugc.aweme.multi.maker.AbstractC60267o
    /* renamed from: c */
    public final void mo97892c(C33744d dVar) {
        C89219l.m154721d(dVar, "");
        super.mo97892c(dVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60201c, com.p2082ss.android.ugc.aweme.multi.maker.AbstractC60267o
    /* renamed from: b */
    public final void mo97891b(C33744d dVar) {
        C89219l.m154721d(dVar, "");
        super.mo97891b(dVar);
        C39162r.m79460a("shoutouts_entrance_show", C89041ag.m154421a(C89387v.m154943a("enter_from", mo97950p()), C89387v.m154943a("channel", "anchor"), C89387v.m154943a("to_user_id", mo97949o().getAuthorUid())));
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60201c
    /* renamed from: d */
    public final void mo97893d(C33744d dVar) {
        String str;
        String schema;
        C89219l.m154721d(dVar, "");
        this.f137352d = dVar;
        mo97952r();
        if (!C58029j.f132253e || !C58029j.m104846b() || C58029j.m104847c()) {
            C58029j.f132253e = m109912n();
        }
        if (!C58029j.f132253e) {
            new C23144b(mo97952r()).mo37640e(R.string.dck).mo37637b();
            return;
        }
        Activity e = mo97864a().mo97886e();
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        if (!g.isLogin()) {
            C58957c.m108321a(e, mo97950p(), "", new C60266a(this, dVar, e));
            return;
        }
        IAccountUserService g2 = C31575b.m65865g();
        C89219l.m154716b(g2, "");
        if (g2.isLogin()) {
            str = "1";
        } else {
            str = "0";
        }
        dVar.mo59983a("login_status", str);
        AbstractC60267o.m109921a(this, dVar, false, false, 6);
        AnchorCommonStruct anchorCommonStruct = this.f137358h;
        if (anchorCommonStruct != null && (schema = anchorCommonStruct.getSchema()) != null) {
            SmartRouter.buildRoute(e, schema).withParam("need_close_event", true).withParam("enter_from", mo97950p()).open();
        }
    }
}
