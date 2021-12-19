package com.p2082ss.android.ugc.aweme.p3070im.sdk.privacy.viewmodel;

import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.compliance.api.model.C39257p;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3171b.C55059b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.privacy.data.api.ChatAuthorityService;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.privacy.p3213a.C55688a;
import com.p2082ss.android.ugc.aweme.p3070im.service.IIMService;
import p4560f.p4561a.AbstractC88398aa;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88429b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.privacy.viewmodel.MessagingPrivacyViewModel */
public final class MessagingPrivacyViewModel extends AbstractC1174ac {

    /* renamed from: l */
    public static final C55706a f127066l = new C55706a((byte) 0);

    /* renamed from: a */
    public int f127067a;

    /* renamed from: b */
    public String f127068b;

    /* renamed from: c */
    public String f127069c;

    /* renamed from: d */
    public final C1213t<C39257p> f127070d;

    /* renamed from: e */
    public final C1213t<C39257p> f127071e;

    /* renamed from: f */
    public final C1213t<Boolean> f127072f;

    /* renamed from: g */
    public final C88411a f127073g;

    /* renamed from: h */
    public final ChatAuthorityService f127074h;

    /* renamed from: i */
    final IIMService f127075i;

    /* renamed from: j */
    public final AbstractC88398aa f127076j;

    /* renamed from: k */
    public final AbstractC88398aa f127077k;

    /* renamed from: m */
    private final C55688a f127078m;

    /* renamed from: n */
    private final C55059b f127079n;

    static {
        Covode.recordClassIndex(65491);
    }

    public MessagingPrivacyViewModel() {
        this((byte) 0);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.privacy.viewmodel.MessagingPrivacyViewModel$a */
    public static final class C55706a {
        static {
            Covode.recordClassIndex(65492);
        }

        private C55706a() {
        }

        public /* synthetic */ C55706a(byte b) {
            this();
        }
    }

    @Override // androidx.lifecycle.AbstractC1174ac
    public final void onCleared() {
        super.onCleared();
        this.f127073g.mo142944a();
    }

    /* renamed from: a */
    public final void mo92593a(boolean z) {
        String str;
        Integer num;
        if (z) {
            C39257p value = this.f127070d.getValue();
            if (value != null) {
                num = Integer.valueOf(value.getValue());
            } else {
                num = null;
            }
            str = C55688a.m101442a(num);
        } else {
            str = "";
        }
        C55059b.m100689a(this.f127069c, this.f127068b, z ? 1 : 0, str, this.f127067a);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private /* synthetic */ MessagingPrivacyViewModel(byte r9) {
        /*
            r8 = this;
            com.ss.android.ugc.aweme.im.sdk.privacy.data.api.ChatAuthorityService r0 = com.p2082ss.android.ugc.aweme.p3070im.sdk.privacy.data.api.ChatAuthorityService.C55704a.f127061a
            if (r0 != 0) goto L_0x0018
            com.bytedance.ies.ugc.aweme.network.IRetrofitFactory r1 = com.bytedance.ies.ugc.aweme.network.RetrofitFactory.m33635a()
            java.lang.String r0 = com.p2082ss.android.p2123b.C29736b.f70924e
            com.bytedance.ies.ugc.aweme.network.f r1 = r1.mo28816a(r0)
            java.lang.Class<com.ss.android.ugc.aweme.im.sdk.privacy.data.api.ChatAuthorityService> r0 = com.p2082ss.android.ugc.aweme.p3070im.sdk.privacy.data.api.ChatAuthorityService.class
            java.lang.Object r0 = r1.mo28858a(r0)
            com.ss.android.ugc.aweme.im.sdk.privacy.data.api.ChatAuthorityService r0 = (com.p2082ss.android.ugc.aweme.p3070im.sdk.privacy.data.api.ChatAuthorityService) r0
            com.p2082ss.android.ugc.aweme.p3070im.sdk.privacy.data.api.ChatAuthorityService.C55704a.f127061a = r0
        L_0x0018:
            com.ss.android.ugc.aweme.im.sdk.privacy.data.api.ChatAuthorityService r2 = com.p2082ss.android.ugc.aweme.p3070im.sdk.privacy.data.api.ChatAuthorityService.C55704a.f127061a
            if (r2 != 0) goto L_0x001f
            p4600h.p4611f.p4613b.C89219l.m154715b()
        L_0x001f:
            com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService$Companion r0 = com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices.IMService.Companion
            com.ss.android.ugc.aweme.im.service.IIMService r3 = r0.get()
            f.a.aa r0 = p4560f.p4561a.p4562a.p4564b.C88392a.f200660a
            f.a.aa r4 = p4560f.p4561a.p4562a.p4563a.C88391a.m153580a(r0)
            java.lang.String r1 = ""
            p4600h.p4611f.p4613b.C89219l.m154716b(r4, r1)
            f.a.aa r0 = p4560f.p4561a.p4590k.C88946a.f201991c
            f.a.aa r5 = p4560f.p4561a.p4587h.C88925a.m154180b(r0)
            p4600h.p4611f.p4613b.C89219l.m154716b(r5, r1)
            com.ss.android.ugc.aweme.im.sdk.privacy.a.a r6 = com.p2082ss.android.ugc.aweme.p3070im.sdk.privacy.p3213a.C55688a.f127034a
            com.ss.android.ugc.aweme.im.sdk.common.controller.b.b r7 = com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3171b.C55059b.m100685a()
            p4600h.p4611f.p4613b.C89219l.m154716b(r7, r1)
            r1 = r8
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.privacy.viewmodel.MessagingPrivacyViewModel.<init>(byte):void");
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.privacy.viewmodel.MessagingPrivacyViewModel$b */
    public static final class C55707b<T1, T2> implements AbstractC88429b {

        /* renamed from: a */
        final /* synthetic */ C39257p f127080a;

        /* renamed from: b */
        final /* synthetic */ MessagingPrivacyViewModel f127081b;

        static {
            Covode.recordClassIndex(65493);
        }

        public C55707b(C39257p pVar, MessagingPrivacyViewModel messagingPrivacyViewModel) {
            this.f127080a = pVar;
            this.f127081b = messagingPrivacyViewModel;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88429b
        /* renamed from: a */
        public final /* synthetic */ void mo10350a(Object obj, Object obj2) {
            if (obj != null) {
                this.f127081b.f127071e.setValue(this.f127080a);
                this.f127081b.mo92593a(true);
                MessagingPrivacyViewModel messagingPrivacyViewModel = this.f127081b;
                messagingPrivacyViewModel.f127075i.updateChatUserSetting(this.f127080a.getValue());
            }
        }
    }

    private MessagingPrivacyViewModel(ChatAuthorityService chatAuthorityService, IIMService iIMService, AbstractC88398aa aaVar, AbstractC88398aa aaVar2, C55688a aVar, C55059b bVar) {
        C89219l.m154721d(chatAuthorityService, "");
        C89219l.m154721d(iIMService, "");
        C89219l.m154721d(aaVar, "");
        C89219l.m154721d(aaVar2, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(bVar, "");
        this.f127074h = chatAuthorityService;
        this.f127075i = iIMService;
        this.f127076j = aaVar;
        this.f127077k = aaVar2;
        this.f127078m = aVar;
        this.f127079n = bVar;
        this.f127068b = "";
        this.f127069c = "";
        C1213t<C39257p> tVar = new C1213t<>();
        tVar.setValue(null);
        this.f127070d = tVar;
        this.f127071e = new C1213t<>();
        C1213t<Boolean> tVar2 = new C1213t<>();
        tVar2.setValue(false);
        this.f127072f = tVar2;
        this.f127073g = new C88411a();
    }
}
