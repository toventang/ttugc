package com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.items.privateaccount;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.text.Html;
import android.text.Spannable;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.dialog.C23023b;
import com.bytedance.tux.dialog.C23048e;
import com.bytedance.tux.dialog.p1713b.C23024a;
import com.bytedance.tux.dialog.p1713b.C23025b;
import com.bytedance.tux.dialog.p1713b.C23028c;
import com.bytedance.tux.p1719f.C23121a;
import com.bytedance.tux.p1719f.C23137c;
import com.bytedance.tux.p1721g.C23144b;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.IAccountService;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.p2367b.C34485a;
import com.p2082ss.android.ugc.aweme.compliance.common.p2662c.C39617a;
import com.p2082ss.android.ugc.aweme.compliance.privacy.p2666a.C39631a;
import com.p2082ss.android.ugc.aweme.compliance.privacy.p2666a.C39632b;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.PrivacySettingViewModel;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39722g;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.C39723h;
import com.p2082ss.android.ugc.aweme.compliance.privacy.utils.C40043a;
import com.p2082ss.android.ugc.aweme.metrics.C59206ab;
import com.p2082ss.android.ugc.aweme.p2339as.C33954a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.p3568b.C63501g;
import com.p2082ss.android.ugc.aweme.setting.p3716d.C68067b;
import com.p2082ss.android.ugc.aweme.setting.verification.VerificationResponse;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import java.util.Arrays;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.privateaccount.c */
public final class C39823c extends C39723h implements AbstractC39722g {

    /* renamed from: c */
    public static final C39824a f93749c = new C39824a((byte) 0);

    /* renamed from: a */
    final C88411a f93750a = new C88411a();

    /* renamed from: b */
    public final PrivacySettingViewModel f93751b;

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.privateaccount.c$f */
    static final class C39831f<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C39831f f93761a = new C39831f();

        static {
            Covode.recordClassIndex(47562);
        }

        C39831f() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(47554);
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.privateaccount.c$a */
    public static final class C39824a {
        static {
            Covode.recordClassIndex(47555);
        }

        private C39824a() {
        }

        public /* synthetic */ C39824a(byte b) {
            this();
        }

        /* renamed from: a */
        public static boolean m80749a(User user) {
            if (user == null) {
                return false;
            }
            if (!C39632b.m80491a()) {
                return user.isProAccount();
            }
            if (user.getAccountType() == 2 || user.getAccountType() == 3 || user.getAccountType() == 1) {
                return true;
            }
            return false;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39722g
    /* renamed from: a */
    public final void mo69104a() {
        this.f93750a.mo142944a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final String mo69136c() {
        if (this.f93751b.f93547b) {
            return "pop_up";
        }
        return "";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.privateaccount.c$h */
    public static final class C39834h<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C39823c f93765a;

        static {
            Covode.recordClassIndex(47565);
        }

        C39834h(C39823c cVar) {
            this.f93765a = cVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.privateaccount.c$h$a */
        static final class C39840a extends AbstractC89220m implements AbstractC89171a<C89391z> {

            /* renamed from: a */
            final /* synthetic */ C39834h f93772a;

            static {
                Covode.recordClassIndex(47571);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C39840a(C39834h hVar) {
                super(0);
                this.f93772a = hVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ C89391z invoke() {
                View view = this.f93772a.f93765a.itemView;
                C89219l.m154716b(view, "");
                SmartRouter.buildRoute(view.getContext(), "//authmanagement").open();
                return C89391z.f203057a;
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v51, resolved type: android.text.Spannable[] */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Spanned fromHtml;
            Throwable th = (Throwable) obj;
            this.f93765a.f93751b.f93550e.setValue(false);
            this.f93765a.f93751b.f93549d.setValue(Boolean.valueOf(C39631a.m80486b()));
            if (th instanceof C34485a) {
                C34485a aVar = (C34485a) th;
                int errorCode = aVar.getErrorCode();
                if (errorCode == -5007) {
                    View view = this.f93765a.itemView;
                    C89219l.m154716b(view, "");
                    Context context = view.getContext();
                    C89219l.m154716b(context, "");
                    ((C23023b) C23028c.m43435a(new C23023b(context).mo37413d(aVar.getErrorMsg()), C398372.f93768a).mo37482a(false)).mo37405a().mo37396b().show();
                } else if (errorCode == -5002) {
                    View view2 = this.f93765a.itemView;
                    C89219l.m154716b(view2, "");
                    Context context2 = view2.getContext();
                    C89219l.m154716b(context2, "");
                    ((C23023b) C23028c.m43435a((C23023b) new C23023b(context2).mo37479a(R.string.mr).mo37483b(R.string.n_), new AbstractC89172b<C23025b, C89391z>(this) {
                        /* class com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.items.privateaccount.C39823c.C39834h.C398351 */

                        /* renamed from: a */
                        final /* synthetic */ C39834h f93766a;

                        static {
                            Covode.recordClassIndex(47566);
                        }

                        {
                            this.f93766a = r2;
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // p4600h.p4611f.p4612a.AbstractC89172b
                        public final /* synthetic */ C89391z invoke(C23025b bVar) {
                            C23025b bVar2 = bVar;
                            C89219l.m154721d(bVar2, "");
                            bVar2.mo37416a(R.string.mp, new AbstractC89172b<C23024a, C89391z>(this) {
                                /* class com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.items.privateaccount.C39823c.C39834h.C398351.C398361 */

                                /* renamed from: a */
                                final /* synthetic */ C398351 f93767a;

                                static {
                                    Covode.recordClassIndex(47567);
                                }

                                {
                                    this.f93767a = r2;
                                }

                                /* Return type fixed from 'java.lang.Object' to match base method */
                                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                                public final /* synthetic */ C89391z invoke(C23024a aVar) {
                                    C89219l.m154721d(aVar, "");
                                    this.f93767a.f93766a.f93765a.mo69134b(!this.f93767a.f93766a.f93765a.mo69135b());
                                    this.f93767a.f93766a.f93765a.mo69133a(true, true);
                                    return C89391z.f203057a;
                                }
                            });
                            bVar2.mo37418b(R.string.b6e, (AbstractC89172b<? super C23024a, C89391z>) null);
                            bVar2.f54513b = true;
                            return C89391z.f203057a;
                        }
                    }).mo37482a(false)).mo37405a().mo37396b().show();
                } else if (errorCode == 3026002) {
                    View view3 = this.f93765a.itemView;
                    C89219l.m154716b(view3, "");
                    Context context3 = view3.getContext();
                    C89219l.m154716b(context3, "");
                    C23023b bVar = (C23023b) new C23023b(context3).mo37479a(R.string.a2q);
                    C23137c a = new C23137c().mo37623a(R.string.a2p);
                    a.f54761d = 2;
                    a.f54759b = false;
                    a.f54760c = 42;
                    a.f54763f = new C39840a(this);
                    View view4 = this.f93765a.itemView;
                    C89219l.m154716b(view4, "");
                    Context context4 = view4.getContext();
                    C89219l.m154716b(context4, "");
                    CharSequence a2 = a.mo37625a(context4);
                    View view5 = this.f93765a.itemView;
                    C89219l.m154716b(view5, "");
                    Context context5 = view5.getContext();
                    C89219l.m154716b(context5, "");
                    Spannable[] spannableArr = {a2};
                    C89219l.m154719c(context5, "");
                    C89219l.m154719c(spannableArr, "");
                    Spannable[] spannableArr2 = (Spannable[]) Arrays.copyOf(spannableArr, 1);
                    C89219l.m154719c(context5, "");
                    C89219l.m154719c(spannableArr2, "");
                    String string = context5.getString(R.string.a2o);
                    C89219l.m154709a((Object) string, "");
                    Spannable[] spannableArr3 = (Spannable[]) Arrays.copyOf(spannableArr2, spannableArr2.length);
                    C89219l.m154719c(string, "");
                    C89219l.m154719c(spannableArr3, "");
                    int length = spannableArr3.length;
                    String[] strArr = new String[length];
                    for (int i = 0; i < length; i++) {
                        strArr[i] = "";
                    }
                    int length2 = spannableArr3.length;
                    int i2 = 0;
                    int i3 = 0;
                    while (i2 < length2) {
                        strArr[i3] = "<tux-span-" + i3 + '>' + spannableArr3[i2].toString() + "</tux-span-" + i3 + '>';
                        i2++;
                        i3++;
                    }
                    Object[] copyOf = Arrays.copyOf(strArr, length);
                    String a3 = C1764a.m5928a(string, Arrays.copyOf(copyOf, copyOf.length));
                    C89219l.m154709a((Object) a3, "");
                    C23121a.C23122a.C23123a aVar2 = new C23121a.C23122a.C23123a(spannableArr3);
                    if (Build.VERSION.SDK_INT >= 24) {
                        fromHtml = Html.fromHtml(a3, 0, null, aVar2);
                    } else {
                        fromHtml = Html.fromHtml(a3, null, aVar2);
                    }
                    C89219l.m154709a((Object) fromHtml, "");
                    bVar.mo37413d(fromHtml);
                    C23028c.m43435a(bVar, C398383.f93769a).mo37405a().mo37396b().show();
                }
            } else {
                View view6 = this.f93765a.itemView;
                C89219l.m154716b(view6, "");
                new C23144b(view6).mo37640e(R.string.dl6).mo37637b();
                if (th != null) {
                    final String a4 = C40043a.m80996a(th);
                    final String b = C40043a.m81001b(th);
                    C40043a.m80998a("PRIVACY_SETTING_ALOG", new AbstractC89172b<C33743c, C33743c>() {
                        /* class com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.items.privateaccount.C39823c.C39834h.C398394 */

                        static {
                            Covode.recordClassIndex(47570);
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // p4600h.p4611f.p4612a.AbstractC89172b
                        public final /* synthetic */ C33743c invoke(C33743c cVar) {
                            C33743c cVar2 = cVar;
                            C89219l.m154721d(cVar2, "");
                            C40043a.m80991a(cVar2, "Change private account fail");
                            C40043a.m80992a(cVar2, "target_value", Boolean.valueOf(!C39631a.m80486b()));
                            C40043a.m81000b(cVar2, a4);
                            return C40043a.m80992a(cVar2, "cause", b);
                        }
                    });
                    C39617a.m80457a("/tiktok/privacy/user/private_account/update/v1", a4, b);
                }
            }
        }
    }

    /* renamed from: b */
    public final boolean mo69135b() {
        return C89219l.m154714a((Object) this.f93751b.f93549d.getValue(), (Object) true);
    }

    /* renamed from: a */
    public final void mo69132a(boolean z) {
        mo69134b(z);
        mo69133a(z, false);
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.privateaccount.c$c */
    static final class C39826c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C39823c f93754a;

        /* renamed from: b */
        final /* synthetic */ User f93755b;

        static {
            Covode.recordClassIndex(47557);
        }

        C39826c(C39823c cVar, User user) {
            this.f93754a = cVar;
            this.f93755b = user;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C40043a.m80999a("PRIVACY_SETTING_ALOG", "Business account: quit check success, showPrivacyDialog");
            this.f93754a.mo69131a(this.f93755b);
            C39617a.m80456a("/aweme/v1/ad/ba/quitcheck/", 0);
        }
    }

    /* renamed from: a */
    public final void mo69130a(DialogInterface dialogInterface) {
        C40043a.m80999a("PRIVACY_SETTING_ALOG", "changeAccountToPersonal: Start switch to personal account");
        C39631a.m80490f().mo57074j().switchProAccount(0, null, null, 0, new C39825b(this, dialogInterface));
    }

    /* renamed from: b */
    public final void mo69134b(boolean z) {
        this.f93751b.f93550e.setValue(true);
        this.f93751b.f93549d.setValue(Boolean.valueOf(z));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.privateaccount.c$k */
    public static final class C39843k extends AbstractC89220m implements AbstractC89172b<C23025b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C39823c f93775a;

        /* renamed from: b */
        final /* synthetic */ int f93776b;

        static {
            Covode.recordClassIndex(47574);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39843k(C39823c cVar, int i) {
            super(1);
            this.f93775a = cVar;
            this.f93776b = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23025b bVar) {
            C23025b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            bVar2.mo37416a(this.f93776b, new AbstractC89172b<C23024a, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.items.privateaccount.C39823c.C39843k.C398441 */

                /* renamed from: a */
                final /* synthetic */ C39843k f93777a;

                static {
                    Covode.recordClassIndex(47575);
                }

                {
                    this.f93777a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C23024a aVar) {
                    C23024a aVar2 = aVar;
                    C89219l.m154721d(aVar2, "");
                    C40043a.m80999a("PRIVACY_SETTING_ALOG", "Switch to personal account dialog: user confirm");
                    this.f93777a.f93775a.mo69130a(aVar2.mo37414a());
                    return C89391z.f203057a;
                }
            });
            bVar2.mo37418b(R.string.etk, new AbstractC89172b<C23024a, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.items.privateaccount.C39823c.C39843k.C398452 */

                /* renamed from: a */
                final /* synthetic */ C39843k f93778a;

                static {
                    Covode.recordClassIndex(47576);
                }

                {
                    this.f93778a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C23024a aVar) {
                    C89219l.m154721d(aVar, "");
                    C40043a.m80999a("PRIVACY_SETTING_ALOG", "Switch to personal account dialog: user cancel");
                    return C89391z.f203057a;
                }
            });
            bVar2.f54513b = true;
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.privateaccount.c$e */
    static final class C39829e<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C39823c f93758a;

        /* renamed from: b */
        final /* synthetic */ Context f93759b;

        static {
            Covode.recordClassIndex(47560);
        }

        C39829e(C39823c cVar, Context context) {
            this.f93758a = cVar;
            this.f93759b = context;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C40043a.m80999a("PRIVACY_SETTING_ALOG", "requestVerificationWhenChangePrivate: onSuccess");
            if (((VerificationResponse) obj).shouldShowChangeMobileDialog()) {
                C40043a.m80999a("PRIVACY_SETTING_ALOG", "requestVerificationWhenChangePrivate: onSuccess, shouldShowChangeMobileDialog");
                ((C23048e) new C23048e(this.f93759b).mo37479a(R.string.fbm).mo37483b(R.string.fbn)).mo37443a(R.string.fbj, new DialogInterface.OnClickListener(this) {
                    /* class com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.items.privateaccount.C39823c.C39829e.DialogInterface$OnClickListenerC398301 */

                    /* renamed from: a */
                    final /* synthetic */ C39829e f93760a;

                    static {
                        Covode.recordClassIndex(47561);
                    }

                    {
                        this.f93760a = r1;
                    }

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        C33954a.m69530a();
                        this.f93760a.f93758a.mo69132a(true);
                    }
                }).mo37444a((DialogInterface.OnClickListener) null).mo37442a().mo37396b().show();
                return;
            }
            C33954a.m69530a();
            this.f93758a.mo69132a(true);
            C40043a.m80999a("PRIVACY_SETTING_ALOG", "requestVerificationWhenChangePrivate: onSuccess, updatePrivateAccountOn");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.privateaccount.c$g */
    public static final class C39832g<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C39823c f93762a;

        /* renamed from: b */
        final /* synthetic */ boolean f93763b;

        static {
            Covode.recordClassIndex(47563);
        }

        C39832g(C39823c cVar, boolean z) {
            this.f93762a = cVar;
            this.f93763b = z;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f93762a.f93751b.f93549d.setValue(Boolean.valueOf(this.f93763b));
            this.f93762a.f93751b.f93550e.setValue(false);
            this.f93762a.f93751b.mo69090a();
            if (this.f93762a.mo69135b()) {
                this.f93762a.f93751b.f93551f.setValue(false);
                C39631a.m80485a(false);
            }
            AbstractC81915c.m141874a(new C63501g());
            C40043a.m80998a("PRIVACY_SETTING_ALOG", new AbstractC89172b<C33743c, C33743c>(this) {
                /* class com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.items.privateaccount.C39823c.C39832g.C398331 */

                /* renamed from: a */
                final /* synthetic */ C39832g f93764a;

                static {
                    Covode.recordClassIndex(47564);
                }

                {
                    this.f93764a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C33743c invoke(C33743c cVar) {
                    C33743c cVar2 = cVar;
                    C89219l.m154721d(cVar2, "");
                    C40043a.m80991a(cVar2, "Change private account success");
                    return C40043a.m80992a(cVar2, "target_value", this.f93764a.f93762a.f93751b.f93549d.getValue());
                }
            });
            C39617a.m80456a("/tiktok/privacy/user/private_account/update/v1", 0);
        }
    }

    /* renamed from: a */
    public final void mo69131a(User user) {
        int i;
        int i2;
        if (user == null || user.getAccountType() != 3) {
            C40043a.m80999a("PRIVACY_SETTING_ALOG", "RebrandCreatorToolExperiment enabled and not business account: changeAccountToPersonal");
            mo69130a((DialogInterface) null);
            return;
        }
        if (user.getAccountType() != 3) {
            i = R.string.etl;
        } else if (user.getCommerceUserLevel() == 2) {
            i = R.string.ghm;
        } else {
            i = R.string.ghn;
        }
        if (user.getAccountType() == 3) {
            i2 = R.string.ghs;
        } else {
            i2 = R.string.etj;
        }
        View view = this.itemView;
        C89219l.m154716b(view, "");
        Context context = view.getContext();
        C89219l.m154716b(context, "");
        C23028c.m43435a((C23023b) new C23023b(context).mo37479a(R.string.etm).mo37483b(i), new C39843k(this, i2)).mo37405a().mo37396b().show();
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.privateaccount.c$d */
    static final class C39827d<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C39823c f93756a;

        static {
            Covode.recordClassIndex(47558);
        }

        C39827d(C39823c cVar) {
            this.f93756a = cVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            if (th instanceof C34485a) {
                C34485a aVar = (C34485a) th;
                if (TextUtils.isEmpty(aVar.getErrorMsg())) {
                    View view = this.f93756a.itemView;
                    C89219l.m154716b(view, "");
                    new C23144b(view).mo37640e(R.string.bon).mo37637b();
                } else {
                    View view2 = this.f93756a.itemView;
                    C89219l.m154716b(view2, "");
                    Context context = view2.getContext();
                    C89219l.m154716b(context, "");
                    C23028c.m43435a(new C23023b(context).mo37413d(aVar.getErrorMsg()), C398281.f93757a).mo37405a().mo37396b().show();
                }
            } else {
                View view3 = this.f93756a.itemView;
                C89219l.m154716b(view3, "");
                new C23144b(view3).mo37640e(R.string.dcr).mo37637b();
            }
            C89219l.m154716b(th, "");
            String a = C40043a.m80996a(th);
            String b = C40043a.m81001b(th);
            C40043a.m80999a("PRIVACY_SETTING_ALOG", "Business account: quit check error - " + a + " - " + b);
            C39617a.m80457a("/aweme/v1/ad/ba/quitcheck/", a, b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.privateaccount.c$j */
    static final class DialogInterface$OnClickListenerC39842j implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C39823c f93774a;

        static {
            Covode.recordClassIndex(47573);
        }

        DialogInterface$OnClickListenerC39842j(C39823c cVar) {
            this.f93774a = cVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C40043a.m80999a("PRIVACY_SETTING_ALOG", "Close private account alert dialog: user cancel");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.privateaccount.c$i */
    static final class DialogInterface$OnClickListenerC39841i implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C39823c f93773a;

        static {
            Covode.recordClassIndex(47572);
        }

        DialogInterface$OnClickListenerC39841i(C39823c cVar) {
            this.f93773a = cVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C40043a.m80999a("PRIVACY_SETTING_ALOG", "Close private account alert dialog: user confirm");
            this.f93773a.mo69132a(false);
            C59206ab.m108755a("change_approve").mo96746b(StringSet.type, "account").mo96792f();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C39823c(View view, PrivacySettingViewModel privacySettingViewModel) {
        super(view);
        C89219l.m154721d(view, "");
        C89219l.m154721d(privacySettingViewModel, "");
        this.f93751b = privacySettingViewModel;
    }

    /* renamed from: a */
    public final void mo69133a(boolean z, boolean z2) {
        this.f93750a.mo142945a(C39810a.m80730a(z, z2).mo143254a(new C39832g(this, z), new C39834h(this)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.privateaccount.c$b */
    public static final class C39825b implements IAccountService.AbstractC31277g {

        /* renamed from: a */
        final /* synthetic */ C39823c f93752a;

        /* renamed from: b */
        final /* synthetic */ DialogInterface f93753b;

        static {
            Covode.recordClassIndex(47556);
        }

        C39825b(C39823c cVar, DialogInterface dialogInterface) {
            this.f93752a = cVar;
            this.f93753b = dialogInterface;
        }

        @Override // com.p2082ss.android.ugc.aweme.IAccountService.AbstractC31277g
        public final void onResult(int i, int i2, Object obj) {
            if (i == 14 && i2 == 1) {
                C39631a.m80490f().mo57069e().queryUser();
                View view = this.f93752a.itemView;
                C89219l.m154716b(view, "");
                new C23144b(view).mo37640e(R.string.etn).mo37637b();
                AbstractC81915c.m141874a(new C68067b());
                C40043a.m80999a("PRIVACY_SETTING_ALOG", "changeAccountToPersonal: Switch to personal account success");
            } else {
                View view2 = this.f93752a.itemView;
                C89219l.m154716b(view2, "");
                new C23144b(view2).mo37640e(R.string.dcr).mo37637b();
                C40043a.m80999a("PRIVACY_SETTING_ALOG", "changeAccountToPersonal: Switch to personal account fail");
            }
            DialogInterface dialogInterface = this.f93753b;
            if (dialogInterface != null) {
                dialogInterface.dismiss();
            }
        }
    }
}
