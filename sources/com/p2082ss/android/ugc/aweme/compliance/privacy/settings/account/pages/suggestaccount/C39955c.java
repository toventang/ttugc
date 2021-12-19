package com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.suggestaccount;

import android.text.SpannableStringBuilder;
import android.text.style.ClickableSpan;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1214u;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.lobby.C20891c;
import com.bytedance.lobby.auth.AbstractC20884a;
import com.bytedance.lobby.auth.AuthResult;
import com.bytedance.lobby.auth.C20886c;
import com.bytedance.lobby.internal.C20919d;
import com.bytedance.sdk.p1625a.p1626a.AbstractC22330f;
import com.bytedance.sdk.p1625a.p1626a.p1627a.C22292e;
import com.bytedance.sdk.p1625a.p1643f.C22374d;
import com.bytedance.sdk.p1625a.p1663n.C22507a;
import com.bytedance.tux.p1719f.C23137c;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.account.AbstractC29355g;
import com.p2082ss.android.account.C29346c;
import com.p2082ss.android.ugc.aweme.compliance.privacy.p2666a.C39631a;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.C39745b;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.AbstractC39856a;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.C39901g;
import com.p2082ss.android.ugc.trill.R;
import java.util.Arrays;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.suggestaccount.c */
public final class C39955c extends AbstractC39943a {

    /* renamed from: h */
    public static final C39959a f93946h = new C39959a((byte) 0);

    /* renamed from: e */
    final AbstractC89244h f93947e = C89250i.m154773a((AbstractC89171a) new C39960b(this));

    /* renamed from: f */
    public final AbstractC20884a f93948f;

    /* renamed from: g */
    public final Fragment f93949g;

    static {
        Covode.recordClassIndex(47715);
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.AbstractC39856a
    /* renamed from: c */
    public final String mo69150c() {
        return "sug_to_fb_friends";
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.suggestaccount.AbstractC39943a
    /* renamed from: e */
    public final String mo69168e() {
        return "fb";
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.suggestaccount.c$a */
    public static final class C39959a {
        static {
            Covode.recordClassIndex(47719);
        }

        private C39959a() {
        }

        public /* synthetic */ C39959a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.suggestaccount.c$b */
    static final class C39960b extends AbstractC89220m implements AbstractC89171a<AbstractC22330f> {

        /* renamed from: a */
        final /* synthetic */ C39955c f93952a;

        static {
            Covode.recordClassIndex(47720);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39960b(C39955c cVar) {
            super(0);
            this.f93952a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC22330f invoke() {
            return C22374d.m42170b(this.f93952a.f93566d);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.suggestaccount.c$d */
    static final class C39963d extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C39955c f93955a;

        static {
            Covode.recordClassIndex(47723);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39963d(C39955c cVar) {
            super(0);
            this.f93955a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            C39955c cVar = this.f93955a;
            C20886c.C20887a aVar = new C20886c.C20887a(cVar.f93949g.getActivity());
            aVar.f49390a = "facebook";
            aVar.f49392c = cVar.f93948f;
            C20886c a = aVar.mo34322a();
            C20919d.m39339a();
            C20919d.m39340a(a);
            C39745b.C39750e.m80630a("fb");
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.suggestaccount.c$c */
    static final class C39961c implements AbstractC20884a {

        /* renamed from: a */
        final /* synthetic */ C39955c f93953a;

        static {
            Covode.recordClassIndex(47721);
        }

        C39961c(C39955c cVar) {
            this.f93953a = cVar;
        }

        @Override // com.bytedance.lobby.auth.AbstractC20884a
        /* renamed from: a */
        public final void mo34320a(AuthResult authResult) {
            C89219l.m154721d(authResult, "");
            if (authResult.f49367a) {
                C89219l.m154716b("", "");
                String str = authResult.f49372f;
                C89219l.m154716b(str, "");
                ((AbstractC22330f) this.f93953a.f93947e.getValue()).mo36667a("", "facebook", str, authResult.f49374h / 1000, C89041ag.m154415a(), (AbstractC29355g) new AbstractC29355g(this) {
                    /* class com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.suggestaccount.C39955c.C39961c.C399621 */

                    /* renamed from: c */
                    final /* synthetic */ C39961c f93954c;

                    static {
                        Covode.recordClassIndex(47722);
                    }

                    /* JADX WARN: Incorrect args count in method signature: ()V */
                    {
                        this.f93954c = r1;
                    }

                    @Override // com.p2082ss.android.account.AbstractC29355g
                    /* renamed from: a */
                    public final void mo51311a(C22292e eVar) {
                        new C23144b(this.f93954c.f93953a.f93949g).mo37635a(this.f93954c.f93953a.f93566d.getString(R.string.dl6)).mo37637b();
                    }

                    @Override // com.p2082ss.android.account.AbstractC29355g
                    /* renamed from: b */
                    public final void mo51313b(C22292e eVar) {
                        this.f93954c.f93953a.notifyDataSetChanged();
                        if (eVar != null) {
                            C22507a aVar = eVar.f52724j;
                            Objects.requireNonNull(aVar, "null cannot be cast to non-null type com.ss.android.account.BDAccountUserEntity");
                            C39631a.m80490f().mo57069e().updateUserInfo((C29346c) aVar);
                        }
                    }

                    @Override // com.p2082ss.android.account.AbstractC29355g
                    /* renamed from: a */
                    public final void mo51312a(C22292e eVar, String str) {
                        if (str == null || str.length() == 0) {
                            str = this.f93954c.f93953a.f93566d.getString(R.string.dl6);
                        }
                        C89219l.m154716b(str, "");
                        new C23144b(this.f93954c.f93953a.f93949g).mo37635a(str).mo37637b();
                    }
                });
                return;
            }
            C20891c cVar = authResult.f49369c;
            if (cVar != null) {
                cVar.printStackTrace();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C39955c(SugToFbFriendsViewModel sugToFbFriendsViewModel, Fragment fragment) {
        super(sugToFbFriendsViewModel, fragment);
        C89219l.m154721d(sugToFbFriendsViewModel, "");
        C89219l.m154721d(fragment, "");
        this.f93949g = fragment;
        mo69093a(AbstractC39856a.m80771a(this, new C39901g()).mo69156a(R.string.dln).mo69160a(new AbstractC89171a<CharSequence>(this) {
            /* class com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.suggestaccount.C39955c.C399561 */

            static {
                Covode.recordClassIndex(47716);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ CharSequence invoke() {
                C39955c cVar = (C39955c) this.receiver;
                boolean isPlatformBound = C39631a.m80490f().mo57072h().isPlatformBound("facebook");
                CharSequence text = cVar.f93566d.getText(R.string.dlo);
                C89219l.m154716b(text, "");
                if (isPlatformBound) {
                    return text;
                }
                String string = cVar.f93566d.getString(R.string.dlq);
                C89219l.m154716b(string, "");
                String string2 = cVar.f93566d.getString(R.string.dlp);
                C89219l.m154716b(string2, "");
                String a = C1764a.m5928a(string2, Arrays.copyOf(new Object[]{string}, 1));
                C89219l.m154716b(a, "");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append(text);
                spannableStringBuilder.append((CharSequence) a);
                int a2 = C89361p.m154888a((CharSequence) spannableStringBuilder, string, 0, false, 6);
                int length = string.length() + a2;
                if (a2 >= 0 && length < spannableStringBuilder.length()) {
                    C23137c cVar2 = new C23137c();
                    cVar2.f54763f = new C39963d(cVar);
                    cVar2.f54761d = 1;
                    SpannableStringBuilder spannableStringBuilder2 = (SpannableStringBuilder) cVar2.mo37625a(cVar.f93566d);
                    for (ClickableSpan clickableSpan : (ClickableSpan[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), ClickableSpan.class)) {
                        spannableStringBuilder.setSpan(clickableSpan, a2, length, 33);
                    }
                }
                return spannableStringBuilder;
            }
        }).mo69157a(1, 2).mo69155a());
        sugToFbFriendsViewModel.f93798d.observe(fragment, new AbstractC1214u(this) {
            /* class com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.suggestaccount.C39955c.C399572 */

            /* renamed from: a */
            final /* synthetic */ C39955c f93950a;

            static {
                Covode.recordClassIndex(47717);
            }

            {
                this.f93950a = r1;
            }

            @Override // androidx.lifecycle.AbstractC1214u
            public final /* synthetic */ void onChanged(Object obj) {
                this.f93950a.mo69092a();
            }
        });
        sugToFbFriendsViewModel.f93799e.observe(fragment, new AbstractC1214u(this) {
            /* class com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.suggestaccount.C39955c.C399583 */

            /* renamed from: a */
            final /* synthetic */ C39955c f93951a;

            static {
                Covode.recordClassIndex(47718);
            }

            {
                this.f93951a = r1;
            }

            @Override // androidx.lifecycle.AbstractC1214u
            public final /* synthetic */ void onChanged(Object obj) {
                this.f93951a.mo69092a();
            }
        });
        this.f93948f = new C39961c(this);
    }
}
