package com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.suggestaccount;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.AbstractC39856a;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.C39901g;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.suggestaccount.e */
public final class C39967e extends AbstractC39943a {

    /* renamed from: e */
    public final Fragment f93959e;

    static {
        Covode.recordClassIndex(47727);
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.AbstractC39856a
    /* renamed from: c */
    public final String mo69150c() {
        return "sug_to_mutual_connections";
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.suggestaccount.AbstractC39943a
    /* renamed from: e */
    public final String mo69168e() {
        return "mutual_connect";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C39967e(SugToMutualConnectionsViewModel sugToMutualConnectionsViewModel, Fragment fragment) {
        super(sugToMutualConnectionsViewModel, fragment);
        C89219l.m154721d(sugToMutualConnectionsViewModel, "");
        C89219l.m154721d(fragment, "");
        this.f93959e = fragment;
        mo69093a(AbstractC39856a.m80771a(this, new C39901g()).mo69156a(R.string.dlx).mo69162b(R.string.dlw).mo69157a(1, 2).mo69155a());
        sugToMutualConnectionsViewModel.f93798d.observe(fragment, new AbstractC1214u(this) {
            /* class com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.suggestaccount.C39967e.C399681 */

            /* renamed from: a */
            final /* synthetic */ C39967e f93960a;

            static {
                Covode.recordClassIndex(47728);
            }

            {
                this.f93960a = r1;
            }

            @Override // androidx.lifecycle.AbstractC1214u
            public final /* synthetic */ void onChanged(Object obj) {
                this.f93960a.mo69092a();
            }
        });
        sugToMutualConnectionsViewModel.f93799e.observe(fragment, new AbstractC1214u(this) {
            /* class com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.suggestaccount.C39967e.C399692 */

            /* renamed from: a */
            final /* synthetic */ C39967e f93961a;

            static {
                Covode.recordClassIndex(47729);
            }

            {
                this.f93961a = r1;
            }

            @Override // androidx.lifecycle.AbstractC1214u
            public final /* synthetic */ void onChanged(Object obj) {
                this.f93961a.mo69092a();
            }
        });
    }
}
