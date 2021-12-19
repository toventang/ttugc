package com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.suggestaccount;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1214u;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1719f.C23137c;
import com.p2082ss.android.ugc.aweme.IAccountService;
import com.p2082ss.android.ugc.aweme.compliance.privacy.p2666a.C39631a;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.C39745b;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.AbstractC39856a;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.C39901g;
import com.p2082ss.android.ugc.trill.R;
import java.util.Arrays;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.suggestaccount.b */
public final class C39949b extends AbstractC39943a {

    /* renamed from: e */
    public final Fragment f93941e;

    static {
        Covode.recordClassIndex(47709);
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.AbstractC39856a
    /* renamed from: c */
    public final String mo69150c() {
        return "sug_to_contacts";
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.suggestaccount.AbstractC39943a
    /* renamed from: e */
    public final String mo69168e() {
        return "contact";
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.suggestaccount.b$b */
    static final class C39954b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C39949b f93945a;

        static {
            Covode.recordClassIndex(47714);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39954b(C39949b bVar) {
            super(0);
            this.f93945a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            C39949b bVar = this.f93945a;
            C39631a.m80490f().mo57072h().bindMobile(bVar.f93941e.getActivity(), "suggest_account_setting", null, new C39953a(bVar));
            C39745b.C39750e.m80630a("contact");
            return C89391z.f203057a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C39949b(SugToContactsViewModel sugToContactsViewModel, Fragment fragment) {
        super(sugToContactsViewModel, fragment);
        C89219l.m154721d(sugToContactsViewModel, "");
        C89219l.m154721d(fragment, "");
        this.f93941e = fragment;
        mo69093a(AbstractC39856a.m80771a(this, new C39901g()).mo69156a(R.string.dlr).mo69160a(new AbstractC89171a<CharSequence>(this) {
            /* class com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.suggestaccount.C39949b.C399501 */

            static {
                Covode.recordClassIndex(47710);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ CharSequence invoke() {
                C39949b bVar = (C39949b) this.receiver;
                boolean z = !TextUtils.isEmpty(C39631a.m80489e().getBindPhone());
                CharSequence text = bVar.f93566d.getText(R.string.dls);
                C89219l.m154716b(text, "");
                if (z) {
                    return text;
                }
                String string = bVar.f93566d.getString(R.string.dlu);
                C89219l.m154716b(string, "");
                String string2 = bVar.f93566d.getString(R.string.dlt);
                C89219l.m154716b(string2, "");
                String a = C1764a.m5928a(string2, Arrays.copyOf(new Object[]{string}, 1));
                C89219l.m154716b(a, "");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append(text);
                spannableStringBuilder.append((CharSequence) a);
                int a2 = C89361p.m154888a((CharSequence) spannableStringBuilder, string, 0, false, 6);
                int length = string.length() + a2;
                if (a2 >= 0 && length < spannableStringBuilder.length()) {
                    C23137c cVar = new C23137c();
                    cVar.f54763f = new C39954b(bVar);
                    cVar.f54761d = 1;
                    SpannableStringBuilder spannableStringBuilder2 = (SpannableStringBuilder) cVar.mo37625a(bVar.f93566d);
                    for (ClickableSpan clickableSpan : (ClickableSpan[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), ClickableSpan.class)) {
                        spannableStringBuilder.setSpan(clickableSpan, a2, length, 33);
                    }
                }
                return spannableStringBuilder;
            }
        }).mo69157a(1, 2).mo69155a());
        sugToContactsViewModel.f93798d.observe(fragment, new AbstractC1214u(this) {
            /* class com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.suggestaccount.C39949b.C399512 */

            /* renamed from: a */
            final /* synthetic */ C39949b f93942a;

            static {
                Covode.recordClassIndex(47711);
            }

            {
                this.f93942a = r1;
            }

            @Override // androidx.lifecycle.AbstractC1214u
            public final /* synthetic */ void onChanged(Object obj) {
                this.f93942a.mo69092a();
            }
        });
        sugToContactsViewModel.f93799e.observe(fragment, new AbstractC1214u(this) {
            /* class com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.suggestaccount.C39949b.C399523 */

            /* renamed from: a */
            final /* synthetic */ C39949b f93943a;

            static {
                Covode.recordClassIndex(47712);
            }

            {
                this.f93943a = r1;
            }

            @Override // androidx.lifecycle.AbstractC1214u
            public final /* synthetic */ void onChanged(Object obj) {
                this.f93943a.mo69092a();
            }
        });
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.suggestaccount.b$a */
    static final class C39953a implements IAccountService.AbstractC31277g {

        /* renamed from: a */
        final /* synthetic */ C39949b f93944a;

        static {
            Covode.recordClassIndex(47713);
        }

        C39953a(C39949b bVar) {
            this.f93944a = bVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.IAccountService.AbstractC31277g
        public final void onResult(int i, int i2, Object obj) {
            if (i == 7 && i2 == 1) {
                this.f93944a.notifyDataSetChanged();
            }
        }
    }
}
