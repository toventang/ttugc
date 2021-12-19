package com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.items;

import android.content.Context;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.compliance.api.model.C39243d;
import com.p2082ss.android.ugc.aweme.compliance.api.model.C39256o;
import com.p2082ss.android.ugc.aweme.compliance.api.model.C39257p;
import com.p2082ss.android.ugc.aweme.compliance.api.model.C39258q;
import com.p2082ss.android.ugc.aweme.compliance.common.p2662c.C39617a;
import com.p2082ss.android.ugc.aweme.compliance.privacy.data.C39659b;
import com.p2082ss.android.ugc.aweme.compliance.privacy.p2666a.C39631a;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.C39699a;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.PrivacySettingViewModel;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39718e;
import com.p2082ss.android.ugc.aweme.global.config.settings.C52912c;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89387v;
import p4600h.p4601a.C89041ag;
import p4600h.p4601a.C89047am;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.d */
public final class C39774d extends AbstractC39751a implements AbstractC39718e.AbstractC39719a {

    /* renamed from: a */
    public final PrivacySettingViewModel f93643a;

    /* renamed from: b */
    private final AbstractC89244h f93644b = C89250i.m154773a((AbstractC89171a) C39777c.f93650a);

    /* renamed from: c */
    private final AbstractC89244h f93645c = C89250i.m154773a((AbstractC89171a) C39775a.f93648a);

    /* renamed from: d */
    private final int f93646d = R.string.n5;

    /* renamed from: e */
    private final int f93647e = R.raw.icon_paperplane;

    static {
        Covode.recordClassIndex(47504);
    }

    /* renamed from: i */
    private final C39256o m80663i() {
        return (C39256o) this.f93645c.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.items.AbstractC39771b
    /* renamed from: e */
    public final C39256o mo69120e() {
        return (C39256o) this.f93644b.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.items.AbstractC39771b
    /* renamed from: f */
    public final int mo69121f() {
        return this.f93646d;
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.d$a */
    static final class C39775a extends AbstractC89220m implements AbstractC89171a<C39256o> {

        /* renamed from: a */
        public static final C39775a f93648a = new C39775a();

        static {
            Covode.recordClassIndex(47505);
        }

        C39775a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C39256o invoke() {
            return C39659b.m80537a(0, "group_chat");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.d$c */
    static final class C39777c extends AbstractC89220m implements AbstractC89171a<C39256o> {

        /* renamed from: a */
        public static final C39777c f93650a = new C39777c();

        static {
            Covode.recordClassIndex(47507);
        }

        C39777c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C39256o invoke() {
            return C39659b.m80537a(0, "chatsets");
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.items.AbstractC39771b
    /* renamed from: h */
    public final Integer mo69124h() {
        return Integer.valueOf(this.f93647e);
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39720f, com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39724i, com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.items.AbstractC39771b
    /* renamed from: c */
    public final boolean mo69102c() {
        if (super.mo69102c() || C39699a.m80586b(m80663i()).f93535a) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39720f, com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39724i, com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.items.AbstractC39771b
    /* renamed from: d */
    public final boolean mo69103d() {
        if (super.mo69103d() || C39699a.m80586b(m80663i()).f93536b) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39718e.AbstractC39719a
    /* renamed from: a */
    public final void mo69100a(AbstractC39718e eVar) {
        C89219l.m154721d(eVar, "");
        this.f93643a.f93548c.observe(eVar, new C39776b(this));
    }

    public C39774d(PrivacySettingViewModel privacySettingViewModel) {
        C89219l.m154721d(privacySettingViewModel, "");
        this.f93643a = privacySettingViewModel;
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.items.AbstractC39751a
    /* renamed from: a */
    public final void mo69114a(Context context) {
        C89219l.m154721d(context, "");
        C39162r.m79460a("enter_message_permission", new C33744d().mo59983a("enter_from", "privacy_and_safety_settings").f79943a);
        C39162r.m79460a("enter_group_chat_permission", new C33744d().mo59983a("enter_from", "privacy_and_safety_settings").mo59980a("is_private", C39631a.m80486b() ? 1 : 0).f79943a);
        SmartRouter.buildRoute(context, "aweme://chatcontrol/setting").open(1);
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.d$b */
    static final class C39776b<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C39774d f93649a;

        static {
            Covode.recordClassIndex(47506);
        }

        C39776b(C39774d dVar) {
            this.f93649a = dVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Integer num;
            boolean z;
            boolean z2;
            C39257p targetRestrictionOption;
            C39243d dVar;
            C39258q qVar = (C39258q) obj;
            C39774d dVar2 = this.f93649a;
            Integer num2 = null;
            if (qVar == null || (dVar = qVar.f92746e) == null) {
                num = null;
            } else {
                num = Integer.valueOf(dVar.f92685a);
            }
            IESSettingsProxy iESSettingsProxy = C52912c.f121688a.f121689b;
            C89219l.m154716b(iESSettingsProxy, "");
            Boolean enableTImChatEveryone = iESSettingsProxy.getEnableTImChatEveryone();
            C39256o e = dVar2.mo69120e();
            if (!(e == null || (targetRestrictionOption = e.getTargetRestrictionOption(1)) == null)) {
                num2 = Integer.valueOf(targetRestrictionOption.getShowType());
            }
            if (num2 != null && (num2.intValue() == 1 || num2.intValue() == 2)) {
                z = false;
            } else {
                z = true;
            }
            if (C89070n.m154556a((Iterable) C89047am.m154438a((Object[]) new Integer[]{1, 2, 3}), (Object) num) && (z || num == null || num.intValue() != 1)) {
                C89219l.m154716b(enableTImChatEveryone, "");
                if (enableTImChatEveryone.booleanValue() || C89219l.m154714a(Boolean.valueOf(z), enableTImChatEveryone)) {
                    z2 = true;
                    C39617a.m80458a("Privacy_DM_user_setting", z2, C89041ag.m154421a(C89387v.m154943a("chatSet", num), C89387v.m154943a("enableTImChatEveryone", enableTImChatEveryone), C89387v.m154943a("restrictionShowType", num2)));
                }
            }
            z2 = false;
            C39617a.m80458a("Privacy_DM_user_setting", z2, C89041ag.m154421a(C89387v.m154943a("chatSet", num), C89387v.m154943a("enableTImChatEveryone", enableTImChatEveryone), C89387v.m154943a("restrictionShowType", num2)));
        }
    }
}
