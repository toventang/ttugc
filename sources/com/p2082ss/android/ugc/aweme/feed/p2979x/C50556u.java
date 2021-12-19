package com.p2082ss.android.ugc.aweme.feed.p2979x;

import android.app.Activity;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.p2082ss.android.ugc.aweme.share.ShareDependService;
import com.p2082ss.android.ugc.aweme.share.improve.p3758c.C69124b;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import java.util.UUID;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.x.u */
public final class C50556u {
    static {
        Covode.recordClassIndex(59703);
    }

    /* renamed from: a */
    public static /* synthetic */ void m94784a(Aweme aweme, Context context, String str, String str2, boolean z, int i) {
        if ((i & 8) != 0) {
            z = false;
        }
        m94785a(aweme, context, str, str2, z, false);
    }

    /* renamed from: a */
    public static final void m94785a(Aweme aweme, Context context, String str, String str2, boolean z, boolean z2) {
        C89219l.m154721d(aweme, "");
        C89219l.m154721d(context, "");
        C89219l.m154721d(str2, "");
        if (MSAdaptionService.m97895c().mo89375b(context)) {
            new C79459a(context).mo123052a("Camera is only available in the single screen mod").mo123053a();
            return;
        }
        String uuid = UUID.randomUUID().toString();
        C89219l.m154716b(uuid, "");
        Activity a = C69124b.m122223a(context);
        if (a != null) {
            ShareDependService a2 = ShareDependService.C68822a.m121324a();
            C89378p[] pVarArr = new C89378p[4];
            pVarArr[0] = C89387v.m154943a("group_id", aweme.getAid());
            String authorUid = aweme.getAuthorUid();
            if (authorUid == null) {
                authorUid = "";
            }
            pVarArr[1] = C89387v.m154943a("author_id", authorUid);
            pVarArr[2] = C89387v.m154943a("enter_from", str2);
            if (str == null) {
                str = "";
            }
            pVarArr[3] = C89387v.m154943a("enter_method", str);
            a2.mo109343a(uuid, aweme, a, str2, C89041ag.m154421a(pVarArr), z, z2);
        }
    }
}
