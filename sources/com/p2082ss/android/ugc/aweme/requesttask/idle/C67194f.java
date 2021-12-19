package com.p2082ss.android.ugc.aweme.requesttask.idle;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58259r;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58260s;
import com.p2082ss.android.ugc.aweme.lego.EnumC58147aa;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.notice.api.C61542b;
import com.p2082ss.android.ugc.aweme.notice.api.bean.C61561m;
import com.p2082ss.android.ugc.aweme.notice.api.p3513d.AbstractC61571e;
import com.p2082ss.android.ugc.aweme.notice.api.p3513d.C61569d;
import com.p2082ss.android.ugc.aweme.notice.repo.TutorialVideoApiManager;
import com.p2082ss.android.ugc.aweme.notice.repo.TutorialVideoInfo;
import com.p2082ss.android.ugc.aweme.notice.repo.TutorialVideoResp;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import java.util.List;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.requesttask.idle.f */
public final class C67194f implements AbstractC58259r {
    static {
        Covode.recordClassIndex(78811);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: a */
    public final void mo28600a(Context context) {
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    public final int bQ_() {
        return 1048575;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: f */
    public final EnumC58150ad mo28606f() {
        return AbstractC58260s.m105199a(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: g */
    public final String mo28607g() {
        return "request_";
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: i */
    public final boolean mo28609i() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: j */
    public final List mo28610j() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58259r
    /* renamed from: b */
    public final EnumC58147aa mo58051b() {
        return EnumC58147aa.NORMAL;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: k */
    public final EnumC58148ab mo28611k() {
        return EnumC58148ab.DEFAULT;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: h */
    public final String mo28608h() {
        return getClass().getSimpleName();
    }

    /* renamed from: com.ss.android.ugc.aweme.requesttask.idle.f$a */
    static final class C67195a<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ C67194f f150618a;

        /* renamed from: b */
        final /* synthetic */ String f150619b;

        static {
            Covode.recordClassIndex(78812);
        }

        C67195a(C67194f fVar, String str) {
            this.f150618a = fVar;
            this.f150619b = str;
        }

        @Override // p077b.AbstractC1729g
        public final Object then(C1731i<TutorialVideoResp> iVar) {
            TutorialVideoInfo info;
            int i;
            C89219l.m154716b(iVar, "");
            if (iVar.mo5535a()) {
                AbstractC61571e eVar = (AbstractC61571e) C61569d.C61570a.m111506a(AbstractC61571e.class);
                TutorialVideoResp d = iVar.mo5545d();
                if (d != null && (info = d.getInfo()) != null) {
                    if (TextUtils.isEmpty(info.getMsgId()) || TextUtils.isEmpty(info.getDeepLink()) || TextUtils.equals(this.f150619b, info.getMsgId())) {
                        i = 0;
                    } else {
                        i = 1;
                    }
                    C61542b.m111460a(1000, i);
                    AbstractC81915c.m141875b(new C61561m(1000, i));
                    if (eVar != null) {
                        eVar.mo60987b(info.getMsgId());
                        eVar.mo60989d(info.getIcon());
                        eVar.mo60991f(info.getTitle());
                        eVar.mo60993h(info.getDesc());
                        eVar.mo60995j(info.getButton());
                        eVar.mo60997l(info.getDeepLink());
                    }
                } else if (eVar != null) {
                    eVar.mo60987b("");
                    eVar.mo60989d("");
                    eVar.mo60991f("");
                    eVar.mo60993h("");
                    eVar.mo60995j("");
                    eVar.mo60997l("");
                }
            }
            return null;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58259r
    /* renamed from: a */
    public final void mo58050a(Context context, boolean z) {
        C89219l.m154721d(context, "");
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        String curUserId = g.getCurUserId();
        Keva repo = Keva.getRepo("top_message_keva_repo");
        String string = repo.getString("msg_id_".concat(String.valueOf(curUserId)), "");
        long j = repo.getLong("first_show_time_".concat(String.valueOf(curUserId)), 0);
        long j2 = repo.getLong("current_show_time_".concat(String.valueOf(curUserId)), 0);
        int i = repo.getInt("clicked_".concat(String.valueOf(curUserId)), 0);
        C89219l.m154716b(string, "");
        TutorialVideoApiManager.C61614a.m111625a(string, j, j2, i).mo5543c(new C67195a(this, string), C1731i.f5564c);
    }
}
