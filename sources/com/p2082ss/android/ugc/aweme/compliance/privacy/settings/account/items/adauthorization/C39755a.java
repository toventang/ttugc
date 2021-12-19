package com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.items.adauthorization;

import android.content.Context;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.compliance.privacy.p2666a.C39631a;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.PrivacySettingViewModel;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.C39723h;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.adauthorization.a */
public final class C39755a extends C39723h {

    /* renamed from: a */
    final Context f93608a;

    /* renamed from: b */
    public final PrivacySettingViewModel f93609b;

    static {
        Covode.recordClassIndex(47485);
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.adauthorization.a$a */
    public static final class C39756a implements AbstractC39763c {

        /* renamed from: a */
        final /* synthetic */ C39755a f93610a;

        /* renamed from: b */
        final /* synthetic */ boolean f93611b;

        static {
            Covode.recordClassIndex(47486);
        }

        @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.items.adauthorization.AbstractC39763c
        /* renamed from: b */
        public final void mo69118b() {
            this.f93610a.f93609b.f93552g.setValue(false);
            this.f93610a.f93609b.f93551f.setValue(Boolean.valueOf(!this.f93611b));
        }

        @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.items.adauthorization.AbstractC39763c
        /* renamed from: c */
        public final void mo69119c() {
            this.f93610a.f93609b.f93552g.setValue(true);
            this.f93610a.f93609b.f93551f.setValue(Boolean.valueOf(this.f93611b));
        }

        @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.items.adauthorization.AbstractC39763c
        /* renamed from: a */
        public final void mo69117a() {
            this.f93610a.f93609b.f93552g.setValue(false);
            this.f93610a.f93609b.f93551f.setValue(Boolean.valueOf(this.f93611b));
            C39631a.m80485a(this.f93611b);
        }

        C39756a(C39755a aVar, boolean z) {
            this.f93610a = aVar;
            this.f93611b = z;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C39755a(View view, PrivacySettingViewModel privacySettingViewModel) {
        super(view);
        C89219l.m154721d(view, "");
        C89219l.m154721d(privacySettingViewModel, "");
        this.f93609b = privacySettingViewModel;
        this.f93608a = view.getContext();
    }
}
