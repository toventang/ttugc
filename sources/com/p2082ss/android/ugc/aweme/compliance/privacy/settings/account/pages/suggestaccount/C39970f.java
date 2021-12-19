package com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.suggestaccount;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.AbstractC39856a;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.C39901g;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.suggestaccount.f */
public final class C39970f extends AbstractC39943a {

    /* renamed from: e */
    public final Fragment f93962e;

    static {
        Covode.recordClassIndex(47730);
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.AbstractC39856a
    /* renamed from: c */
    public final String mo69150c() {
        return "sug_to_who_share_link";
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.suggestaccount.AbstractC39943a
    /* renamed from: e */
    public final String mo69168e() {
        return "link";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C39970f(SugToWhoShareLinkViewModel sugToWhoShareLinkViewModel, Fragment fragment) {
        super(sugToWhoShareLinkViewModel, fragment);
        C89219l.m154721d(sugToWhoShareLinkViewModel, "");
        C89219l.m154721d(fragment, "");
        this.f93962e = fragment;
        mo69093a(AbstractC39856a.m80771a(this, new C39901g()).mo69156a(R.string.dm0).mo69162b(R.string.dlz).mo69157a(1, 2).mo69155a());
        sugToWhoShareLinkViewModel.f93798d.observe(fragment, new AbstractC1214u(this) {
            /* class com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.suggestaccount.C39970f.C399711 */

            /* renamed from: a */
            final /* synthetic */ C39970f f93963a;

            static {
                Covode.recordClassIndex(47731);
            }

            {
                this.f93963a = r1;
            }

            @Override // androidx.lifecycle.AbstractC1214u
            public final /* synthetic */ void onChanged(Object obj) {
                this.f93963a.mo69092a();
            }
        });
        sugToWhoShareLinkViewModel.f93799e.observe(fragment, new AbstractC1214u(this) {
            /* class com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.suggestaccount.C39970f.C399722 */

            /* renamed from: a */
            final /* synthetic */ C39970f f93964a;

            static {
                Covode.recordClassIndex(47732);
            }

            {
                this.f93964a = r1;
            }

            @Override // androidx.lifecycle.AbstractC1214u
            public final /* synthetic */ void onChanged(Object obj) {
                this.f93964a.mo69092a();
            }
        });
    }
}
