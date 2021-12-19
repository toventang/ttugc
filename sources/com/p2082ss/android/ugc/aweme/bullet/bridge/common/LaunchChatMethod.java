package com.p2082ss.android.ugc.aweme.bullet.bridge.common;

import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f;
import com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p2082ss.android.ugc.aweme.login.C58957c;
import com.p2082ss.android.ugc.aweme.p3070im.C53588a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices.IMService;
import com.p2082ss.android.ugc.aweme.p3070im.service.IIMService;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.C56245a;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import java.util.Objects;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.LaunchChatMethod */
public final class LaunchChatMethod extends BaseBridgeMethod implements AbstractC33974au {

    /* renamed from: b */
    private final String f82621b = "launchChat";

    static {
        Covode.recordClassIndex(42118);
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q
    /* renamed from: d */
    public final String mo25752d() {
        return this.f82621b;
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.LaunchChatMethod$a */
    static final class C35025a implements AbstractC34543f {

        /* renamed from: a */
        final /* synthetic */ LaunchChatMethod f82622a;

        /* renamed from: b */
        final /* synthetic */ String f82623b;

        /* renamed from: c */
        final /* synthetic */ Context f82624c;

        /* renamed from: d */
        final /* synthetic */ IMUser f82625d;

        /* renamed from: e */
        final /* synthetic */ int f82626e;

        /* renamed from: f */
        final /* synthetic */ BaseBridgeMethod.AbstractC34965a f82627f;

        static {
            Covode.recordClassIndex(42119);
        }

        C35025a(LaunchChatMethod launchChatMethod, String str, Context context, IMUser iMUser, int i, BaseBridgeMethod.AbstractC34965a aVar) {
            this.f82622a = launchChatMethod;
            this.f82623b = str;
            this.f82624c = context;
            this.f82625d = iMUser;
            this.f82626e = i;
            this.f82627f = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f
        /* renamed from: b */
        public final void mo57674b() {
        }

        @Override // com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f
        /* renamed from: a */
        public final void mo57673a() {
            if (LaunchChatMethod.m71589a(this.f82624c, this.f82625d, this.f82626e)) {
                this.f82627f.mo61872a((Object) 1);
            } else {
                this.f82627f.mo61871a(0, "open chat fail");
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LaunchChatMethod(C16248b bVar) {
        super(bVar);
        C89219l.m154721d(bVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    /* renamed from: a */
    public final void mo61866a(JSONObject jSONObject, BaseBridgeMethod.AbstractC34965a aVar) {
        String str;
        int i;
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(aVar, "");
        Context context = (Context) this.f38923a.mo25832c(Context.class);
        IMUser iMUser = new IMUser();
        iMUser.setUid(jSONObject.optString("uid"));
        iMUser.setNickName(jSONObject.optString("nick_name"));
        iMUser.setSignature(jSONObject.optString("alias"));
        iMUser.setFake(true);
        boolean optBoolean = jSONObject.optBoolean("is_author_service");
        if (optBoolean) {
            str = "message";
        } else {
            str = "";
        }
        if (optBoolean) {
            i = 12;
        } else {
            i = 0;
        }
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        if (!g.isLogin()) {
            if (context != null && (context instanceof Activity)) {
                Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
                C58957c.m108321a((Activity) context, str, "click_chat_button", new C35025a(this, str, context, iMUser, i, aVar));
            }
        } else if (m71589a(context, iMUser, i)) {
            aVar.mo61872a((Object) 1);
        } else {
            aVar.mo61871a(0, "open chat fail");
        }
    }

    /* renamed from: a */
    public static boolean m71589a(Context context, IMUser iMUser, int i) {
        if (context == null) {
            return false;
        }
        IIMService createIIMServicebyMonsterPlugin = IMService.createIIMServicebyMonsterPlugin(false);
        C89219l.m154716b(createIIMServicebyMonsterPlugin, "");
        if (!C53588a.m98813a()) {
            return false;
        }
        createIIMServicebyMonsterPlugin.startChat(C56245a.C56247b.m102214a(context, iMUser).mo93262a(i).f128281a);
        return true;
    }
}
