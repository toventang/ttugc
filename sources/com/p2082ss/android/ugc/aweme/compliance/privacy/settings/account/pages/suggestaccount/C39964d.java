package com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.suggestaccount;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.AbstractC39856a;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.C39901g;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.suggestaccount.d */
public final class C39964d extends AbstractC39943a {

    /* renamed from: e */
    public final Fragment f93956e;

    static {
        Covode.recordClassIndex(47724);
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.AbstractC39856a
    /* renamed from: c */
    public final String mo69150c() {
        return "sug_to_interested_users";
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.suggestaccount.AbstractC39943a
    /* renamed from: e */
    public final String mo69168e() {
        return "like_account";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C39964d(SugToInterestedUsersViewModel sugToInterestedUsersViewModel, Fragment fragment) {
        super(sugToInterestedUsersViewModel, fragment);
        C89219l.m154721d(sugToInterestedUsersViewModel, "");
        C89219l.m154721d(fragment, "");
        this.f93956e = fragment;
        mo69093a(AbstractC39856a.m80771a(this, new C39901g()).mo69156a(R.string.dm1).mo69162b(R.string.dm2).mo69157a(1, 2).mo69155a());
        sugToInterestedUsersViewModel.f93798d.observe(fragment, new AbstractC1214u(this) {
            /* class com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.suggestaccount.C39964d.C399651 */

            /* renamed from: a */
            final /* synthetic */ C39964d f93957a;

            static {
                Covode.recordClassIndex(47725);
            }

            {
                this.f93957a = r1;
            }

            @Override // androidx.lifecycle.AbstractC1214u
            public final /* synthetic */ void onChanged(Object obj) {
                this.f93957a.mo69092a();
            }
        });
        sugToInterestedUsersViewModel.f93799e.observe(fragment, new AbstractC1214u(this) {
            /* class com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.suggestaccount.C39964d.C399662 */

            /* renamed from: a */
            final /* synthetic */ C39964d f93958a;

            static {
                Covode.recordClassIndex(47726);
            }

            {
                this.f93958a = r1;
            }

            @Override // androidx.lifecycle.AbstractC1214u
            public final /* synthetic */ void onChanged(Object obj) {
                this.f93958a.mo69092a();
            }
        });
    }
}
