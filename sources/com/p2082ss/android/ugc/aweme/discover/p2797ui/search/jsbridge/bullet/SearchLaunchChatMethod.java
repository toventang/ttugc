package com.p2082ss.android.ugc.aweme.discover.p2797ui.search.jsbridge.bullet;

import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.AbstractC16249c;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f;
import com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p2082ss.android.ugc.aweme.login.C58957c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices.IMService;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.service.IMAdapterServiceImpl;
import com.p2082ss.android.ugc.aweme.p3070im.service.IIMService;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.C56245a;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import java.util.Objects;
import org.json.JSONObject;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.search.jsbridge.bullet.SearchLaunchChatMethod */
public final class SearchLaunchChatMethod extends BaseBridgeMethod implements AbstractC33974au {

    /* renamed from: b */
    public static final C42944a f100139b = new C42944a((byte) 0);

    /* renamed from: c */
    private final AbstractC89244h f100140c;

    /* renamed from: d */
    private final String f100141d = "searchLaunchChat";

    static {
        Covode.recordClassIndex(51068);
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.search.jsbridge.bullet.SearchLaunchChatMethod$a */
    public static final class C42944a {
        static {
            Covode.recordClassIndex(51069);
        }

        private C42944a() {
        }

        public /* synthetic */ C42944a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q
    /* renamed from: d */
    public final String mo25752d() {
        return this.f100141d;
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.search.jsbridge.bullet.SearchLaunchChatMethod$c */
    static final class C42946c extends AbstractC89220m implements AbstractC89171a<AbstractC16249c<? extends Context>> {

        /* renamed from: a */
        final /* synthetic */ C16248b f100148a;

        static {
            Covode.recordClassIndex(51071);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42946c(C16248b bVar) {
            super(0);
            this.f100148a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC16249c<? extends Context> invoke() {
            return this.f100148a.mo25830b(Context.class);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.search.jsbridge.bullet.SearchLaunchChatMethod$b */
    static final class C42945b implements AbstractC34543f {

        /* renamed from: a */
        final /* synthetic */ SearchLaunchChatMethod f100142a;

        /* renamed from: b */
        final /* synthetic */ String f100143b;

        /* renamed from: c */
        final /* synthetic */ String f100144c;

        /* renamed from: d */
        final /* synthetic */ Context f100145d;

        /* renamed from: e */
        final /* synthetic */ IMUser f100146e;

        /* renamed from: f */
        final /* synthetic */ BaseBridgeMethod.AbstractC34965a f100147f;

        static {
            Covode.recordClassIndex(51070);
        }

        C42945b(SearchLaunchChatMethod searchLaunchChatMethod, String str, String str2, Context context, IMUser iMUser, BaseBridgeMethod.AbstractC34965a aVar) {
            this.f100142a = searchLaunchChatMethod;
            this.f100143b = str;
            this.f100144c = str2;
            this.f100145d = context;
            this.f100146e = iMUser;
            this.f100147f = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f
        /* renamed from: b */
        public final void mo57674b() {
        }

        @Override // com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f
        /* renamed from: a */
        public final void mo57673a() {
            Context context = this.f100145d;
            IMUser iMUser = this.f100146e;
            String str = this.f100143b;
            C89219l.m154716b(str, "");
            String str2 = this.f100144c;
            C89219l.m154716b(str2, "");
            if (SearchLaunchChatMethod.m85731a(context, iMUser, str, str2)) {
                this.f100147f.mo61872a((Object) 1);
            } else {
                this.f100147f.mo61871a(0, "open chat fail");
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchLaunchChatMethod(C16248b bVar) {
        super(bVar);
        C89219l.m154721d(bVar, "");
        this.f100140c = C89250i.m154773a((AbstractC89171a) new C42946c(bVar));
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    /* renamed from: a */
    public final void mo61866a(JSONObject jSONObject, BaseBridgeMethod.AbstractC34965a aVar) {
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(aVar, "");
        AbstractC16249c cVar = (AbstractC16249c) this.f100140c.getValue();
        Context context = null;
        if (cVar != null) {
            context = (Context) cVar.mo25823b();
        }
        if (context == null) {
            aVar.mo61871a(0, "no params found");
            return;
        }
        IMUser iMUser = new IMUser();
        iMUser.setUid(jSONObject.optString("uid"));
        iMUser.setNickName(jSONObject.optString("nick_name"));
        String optString = jSONObject.optString("enter_from", "search");
        String optString2 = jSONObject.optString("enter_method", "button");
        iMUser.setFake(true);
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        if (g.isLogin()) {
            C89219l.m154716b(optString, "");
            C89219l.m154716b(optString2, "");
            if (m85731a(context, iMUser, optString, optString2)) {
                aVar.mo61872a((Object) 1);
            } else {
                aVar.mo61871a(0, "open chat fail");
            }
        } else if (context instanceof Activity) {
            Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
            C58957c.m108321a((Activity) context, optString, optString2, new C42945b(this, optString, optString2, context, iMUser, aVar));
        }
    }

    /* renamed from: a */
    public static boolean m85731a(Context context, IMUser iMUser, String str, String str2) {
        if (context == null) {
            return false;
        }
        IIMService createIIMServicebyMonsterPlugin = IMService.createIIMServicebyMonsterPlugin(false);
        C89219l.m154716b(createIIMServicebyMonsterPlugin, "");
        if (!IMAdapterServiceImpl.m101068d().mo90129a()) {
            return false;
        }
        createIIMServicebyMonsterPlugin.startChat(C56245a.C56247b.m102214a(context, iMUser).mo93274c(str).mo93271b(str2).f128281a);
        return true;
    }
}
