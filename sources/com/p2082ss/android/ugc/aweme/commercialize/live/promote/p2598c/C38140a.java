package com.p2082ss.android.ugc.aweme.commercialize.live.promote.p2598c;

import android.content.Context;
import com.bytedance.android.ecommerce.C2732a;
import com.bytedance.android.ecommerce.p159e.C2773a;
import com.bytedance.android.ecommerce.p163i.AbstractC2801b;
import com.bytedance.android.ecommerce.p164j.AbstractC2813k;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17879g;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.framework.services.IUserService;
import com.p2082ss.android.ugc.aweme.profile.model.CommerceUserInfo;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.services.BaseUserService;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.commercialize.live.promote.c.a */
public final class C38140a {

    /* renamed from: a */
    public static final C38140a f90104a = new C38140a();

    private C38140a() {
    }

    static {
        Covode.recordClassIndex(45611);
    }

    /* renamed from: a */
    public static final String m77274a() {
        String currentUserID;
        IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
        if (createIUserServicebyMonsterPlugin == null || (currentUserID = createIUserServicebyMonsterPlugin.getCurrentUserID()) == null) {
            return "";
        }
        return currentUserID;
    }

    /* renamed from: b */
    public static final int m77276b() {
        User currentUser;
        CommerceUserInfo commerceUserInfo;
        IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
        if (createIUserServicebyMonsterPlugin == null || (currentUser = createIUserServicebyMonsterPlugin.getCurrentUser()) == null || (commerceUserInfo = currentUser.getCommerceUserInfo()) == null) {
            return 0;
        }
        return commerceUserInfo.promotePayType;
    }

    /* renamed from: c */
    public static final int m77277c() {
        User currentUser;
        IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
        if (createIUserServicebyMonsterPlugin == null || (currentUser = createIUserServicebyMonsterPlugin.getCurrentUser()) == null) {
            return 0;
        }
        return currentUser.getAccountType();
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.live.promote.c.a$b */
    static final class C38142b implements AbstractC2813k {

        /* renamed from: a */
        final /* synthetic */ Context f90106a;

        static {
            Covode.recordClassIndex(45613);
        }

        C38142b(Context context) {
            this.f90106a = context;
        }

        @Override // com.bytedance.android.ecommerce.p164j.AbstractC2813k
        /* renamed from: a */
        public final void mo7407a(String str) {
            C89219l.m154716b(str, "");
            if (!C89361p.m154874b(str, "aweme://webview/", false)) {
                SmartRouter.buildRoute(this.f90106a, "aweme://webview/").withParam("url", str).open();
            } else {
                SmartRouter.buildRoute(this.f90106a, str).open();
            }
        }
    }

    /* renamed from: a */
    public static final void m77275a(Context context) {
        C89219l.m154721d(context, "");
        C2773a.C2774a aVar = new C2773a.C2774a(C17879g.m33104a());
        aVar.f8345l = C38141a.f90105a;
        aVar.f8350q = new C38142b(context);
        aVar.f8335b = "https://fp22-normal-useast1a.tiktokv.com";
        C2773a a = aVar.mo7355a();
        C89219l.m154716b(a, "");
        C2732a.f8145a.mo7360a(a);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.live.promote.c.a$a */
    static final class C38141a implements AbstractC2801b {

        /* renamed from: a */
        public static final C38141a f90105a = new C38141a();

        static {
            Covode.recordClassIndex(45612);
        }

        C38141a() {
        }

        @Override // com.bytedance.android.ecommerce.p163i.AbstractC2801b
        /* renamed from: a */
        public final void mo7380a(String str, JSONObject jSONObject) {
            C39162r.m79461a(str, jSONObject);
        }
    }
}
