package com.p2082ss.android.ugc.aweme.bridge;

import android.content.Intent;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16183k;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.bytedance.router.OnActivityResultCallback;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.util.C80138l;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.bridge.OpenQuestionPostPageMethod */
public final class OpenQuestionPostPageMethod extends BaseBridgeMethod implements AbstractC33974au {

    /* renamed from: b */
    private final String f82384b = "openPostPage";

    static {
        Covode.recordClassIndex(41936);
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q
    /* renamed from: d */
    public final String mo25752d() {
        return this.f82384b;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OpenQuestionPostPageMethod(C16248b bVar) {
        super(bVar);
        C89219l.m154721d(bVar, "");
    }

    /* renamed from: com.ss.android.ugc.aweme.bridge.OpenQuestionPostPageMethod$a */
    static final class C34922a implements OnActivityResultCallback {

        /* renamed from: a */
        final /* synthetic */ AbstractC16183k.AbstractC16185b f82385a;

        /* renamed from: b */
        final /* synthetic */ boolean f82386b;

        static {
            Covode.recordClassIndex(41937);
        }

        C34922a(AbstractC16183k.AbstractC16185b bVar, boolean z) {
            this.f82385a = bVar;
            this.f82386b = z;
        }

        /* renamed from: a */
        private static String m71304a(Intent intent, String str) {
            try {
                return intent.getStringExtra(str);
            } catch (Exception unused) {
                return null;
            }
        }

        @Override // com.bytedance.router.OnActivityResultCallback
        public final void onActivityResult(int i, int i2, Intent intent) {
            Object a;
            if (i == 10086 && i2 == -1 && (a = m71304a(intent, "question_id")) != null) {
                String str = "";
                C89219l.m154716b(a, str);
                String a2 = m71304a(intent, "question_text");
                if (a2 != null) {
                    C89219l.m154716b(a2, str);
                    IAccountUserService g = C31575b.m65865g();
                    C89219l.m154716b(g, str);
                    User curUser = g.getCurUser();
                    AbstractC16183k.AbstractC16185b bVar = this.f82385a;
                    JSONObject jSONObject = new JSONObject();
                    IAccountUserService g2 = C31575b.m65865g();
                    C89219l.m154716b(g2, str);
                    if (g2.isLogin() && this.f82386b) {
                        jSONObject.put("is_need_refresh", true);
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    C89219l.m154716b(curUser, str);
                    UrlModel avatarThumb = curUser.getAvatarThumb();
                    C89219l.m154716b(avatarThumb, str);
                    List<String> urlList = avatarThumb.getUrlList();
                    C89219l.m154716b(urlList, str);
                    if (C89070n.m154517a((List) urlList) >= 0) {
                        str = urlList.get(0);
                    }
                    jSONObject2.put("user_avatar_url", str);
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("question_id", a);
                    jSONObject3.put("question_text", a2);
                    jSONObject3.put("video_count", 0);
                    List<C80138l.C80140b> a3 = C80138l.m138902a(a2);
                    if (a3 != null && !a3.isEmpty()) {
                        JSONArray jSONArray = new JSONArray();
                        for (T t : C80138l.m138902a(a2)) {
                            JSONObject jSONObject4 = new JSONObject();
                            jSONObject4.put("start", t.f179561a);
                            jSONObject4.put("end", t.f179562b);
                            jSONArray.put(jSONObject4);
                        }
                        jSONObject3.put("highlight_infos", jSONArray);
                    }
                    jSONObject2.put("question_info", jSONObject3);
                    jSONObject.put("question", jSONObject2);
                    C34927a.m71314a(bVar, jSONObject);
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16183k
    /* renamed from: a */
    public final void mo25748a(JSONObject jSONObject, AbstractC16183k.AbstractC16185b bVar) {
        boolean z;
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(bVar, "");
        try {
            String optString = jSONObject.optString("uid");
            String optString2 = jSONObject.optString("unique_id");
            String optString3 = jSONObject.optString("question_text");
            String optString4 = jSONObject.optString("avatar_url");
            String optString5 = jSONObject.optString("enter_method");
            boolean optBoolean = jSONObject.optBoolean("need_open_invite_panel");
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            if (!g.isLogin()) {
                z = true;
            } else {
                z = false;
            }
            SmartRoute buildRoute = SmartRouter.buildRoute(mo26893e(), "aweme://user/ask/");
            IAccountUserService g2 = C31575b.m65865g();
            C89219l.m154716b(g2, "");
            User curUser = g2.getCurUser();
            C89219l.m154716b(curUser, "");
            SmartRoute withParam = buildRoute.withParam("uid", curUser.getUid());
            if (!((optString == null || optString.length() == 0) && (optString2 == null || optString2.length() == 0))) {
                User user = new User();
                user.setUniqueId(optString2);
                user.setUid(optString);
                UrlModel urlModel = new UrlModel();
                urlModel.setUrlList(C89070n.m154516a(optString4));
                user.setAvatarThumb(urlModel);
                withParam.withParam("invited_users", C89070n.m154525d(user));
            }
            withParam.withParam("question", optString3).withParam("auto_invite", optBoolean).withParam("enter_from", "eoy_hub").withParam("enter_method", optString5).open(10086, new C34922a(bVar, z));
        } catch (Exception e) {
            C34927a.m71313a(bVar, e);
        }
    }
}
