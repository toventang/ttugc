package com.p2082ss.android.ugc.aweme.p2929fe.method;

import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f;
import com.p2082ss.android.ugc.aweme.login.C58957c;
import com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod;
import com.p2082ss.android.ugc.aweme.p3070im.C53588a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices.IMService;
import com.p2082ss.android.ugc.aweme.p3070im.service.IIMService;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.C56245a;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import java.util.Objects;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.fe.method.LaunchChatMethod */
public final class LaunchChatMethod extends BaseCommonJavaMethod implements AbstractC33974au {
    static {
        Covode.recordClassIndex(56494);
    }

    @Override // androidx.lifecycle.AbstractC1202k, com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.LaunchChatMethod$a */
    static final class C47842a implements AbstractC34543f {

        /* renamed from: a */
        final /* synthetic */ LaunchChatMethod f110830a;

        /* renamed from: b */
        final /* synthetic */ String f110831b;

        /* renamed from: c */
        final /* synthetic */ IMUser f110832c;

        /* renamed from: d */
        final /* synthetic */ int f110833d;

        /* renamed from: e */
        final /* synthetic */ BaseCommonJavaMethod.AbstractC47813a f110834e;

        static {
            Covode.recordClassIndex(56495);
        }

        C47842a(LaunchChatMethod launchChatMethod, String str, IMUser iMUser, int i, BaseCommonJavaMethod.AbstractC47813a aVar) {
            this.f110830a = launchChatMethod;
            this.f110831b = str;
            this.f110832c = iMUser;
            this.f110833d = i;
            this.f110834e = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f
        /* renamed from: b */
        public final void mo57674b() {
        }

        @Override // com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f
        /* renamed from: a */
        public final void mo57673a() {
            if (LaunchChatMethod.m90854a(this.f110830a.getActContext(), this.f110832c, this.f110833d)) {
                BaseCommonJavaMethod.AbstractC47813a aVar = this.f110834e;
                if (aVar != null) {
                    aVar.mo79886a((Object) 1);
                    return;
                }
                return;
            }
            BaseCommonJavaMethod.AbstractC47813a aVar2 = this.f110834e;
            if (aVar2 != null) {
                aVar2.mo79885a(0, "open chat fail");
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.AbstractC47813a aVar) {
        String str;
        int i;
        if (jSONObject != null) {
            IMUser iMUser = new IMUser();
            iMUser.setUid(jSONObject.optString("uid"));
            iMUser.setNickName(jSONObject.optString("nick_name"));
            iMUser.setSignature(jSONObject.optString("alias"));
            iMUser.setFake(true);
            if (jSONObject.optBoolean("is_author_service")) {
                str = "message";
                i = 12;
            } else {
                str = "";
                i = 0;
            }
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            if (!g.isLogin()) {
                Context actContext = getActContext();
                if (actContext != null && (actContext instanceof Activity)) {
                    Objects.requireNonNull(actContext, "null cannot be cast to non-null type android.app.Activity");
                    C58957c.m108321a((Activity) actContext, str, "click_chat_button", new C47842a(this, str, iMUser, i, aVar));
                }
            } else if (m90854a(getActContext(), iMUser, i)) {
                if (aVar != null) {
                    aVar.mo79886a((Object) 1);
                }
            } else if (aVar != null) {
                aVar.mo79885a(0, "open chat fail");
            }
        } else if (aVar != null) {
            aVar.mo79885a(0, "no params found");
        }
    }

    /* renamed from: a */
    public static boolean m90854a(Context context, IMUser iMUser, int i) {
        if (context == null) {
            return false;
        }
        IIMService createIIMServicebyMonsterPlugin = IMService.createIIMServicebyMonsterPlugin(false);
        C89219l.m154716b(createIIMServicebyMonsterPlugin, "");
        if (!C53588a.m98813a() || createIIMServicebyMonsterPlugin == null) {
            return false;
        }
        createIIMServicebyMonsterPlugin.startChat(C56245a.C56247b.m102214a(context, iMUser).mo93262a(i).f128281a);
        return true;
    }
}
