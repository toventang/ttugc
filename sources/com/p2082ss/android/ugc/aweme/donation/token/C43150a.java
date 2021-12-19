package com.p2082ss.android.ugc.aweme.donation.token;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.dialog.DialogC17223o;
import com.p2082ss.android.newmedia.C30128d;
import com.p2082ss.android.ugc.aweme.AccountService;
import com.p2082ss.android.ugc.aweme.IAccountService;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f;
import com.p2082ss.android.ugc.aweme.donation.token.DonationTokenCreateApi;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.login.C58957c;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80273bt;
import com.p2082ss.android.ugc.trill.R;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.donation.token.a */
public final class C43150a {

    /* renamed from: a */
    public static final C43150a f100554a = new C43150a();

    /* renamed from: b */
    private static final IAccountService f100555b = AccountService.m65215a();

    private C43150a() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.donation.token.a$a */
    public static final class C43151a implements AbstractC34543f {

        /* renamed from: a */
        final /* synthetic */ Context f100556a;

        /* renamed from: b */
        final /* synthetic */ String f100557b;

        /* renamed from: c */
        final /* synthetic */ int f100558c;

        /* renamed from: d */
        final /* synthetic */ String f100559d;

        /* renamed from: e */
        final /* synthetic */ String f100560e;

        /* renamed from: f */
        final /* synthetic */ AbstractC89172b f100561f;

        static {
            Covode.recordClassIndex(51326);
        }

        C43151a(Context context, String str, int i, String str2, String str3, AbstractC89172b bVar) {
            this.f100556a = context;
            this.f100557b = str;
            this.f100558c = i;
            this.f100559d = str2;
            this.f100560e = str3;
            this.f100561f = bVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f
        /* renamed from: b */
        public final void mo57674b() {
        }

        @Override // com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f
        /* renamed from: a */
        public final void mo57673a() {
            C43150a.m86051b(this.f100556a, this.f100557b, this.f100558c, this.f100559d, this.f100560e, this.f100561f);
        }
    }

    static {
        Covode.recordClassIndex(51325);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.donation.token.a$c */
    public static final class C43153c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C89233z.C89238e f100566a;

        /* renamed from: b */
        final /* synthetic */ Context f100567b;

        static {
            Covode.recordClassIndex(51328);
        }

        C43153c(C89233z.C89238e eVar, Context context) {
            this.f100566a = eVar;
            this.f100567b = context;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C80273bt.m139146b(this.f100566a.element);
            C51423a.m95790a((Throwable) obj);
            Context context = this.f100567b;
            if (context != null) {
                new C79459a(context).mo123052a(context.getString(R.string.ev7)).mo123053a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.donation.token.a$b */
    public static final class C43152b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C89233z.C89238e f100562a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89172b f100563b;

        /* renamed from: c */
        final /* synthetic */ String f100564c;

        /* renamed from: d */
        final /* synthetic */ Context f100565d;

        static {
            Covode.recordClassIndex(51327);
        }

        C43152b(C89233z.C89238e eVar, AbstractC89172b bVar, String str, Context context) {
            this.f100562a = eVar;
            this.f100563b = bVar;
            this.f100564c = str;
            this.f100565d = context;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            String str;
            DonationTokenResponse donationTokenResponse = (DonationTokenResponse) obj;
            C80273bt.m139146b(this.f100562a.element);
            if (donationTokenResponse.status_code == 0) {
                DonationTokenBean data = donationTokenResponse.getData();
                String str2 = null;
                if (data != null) {
                    str = data.getToken();
                } else {
                    str = null;
                }
                if (!TextUtils.isEmpty(str)) {
                    DonationTokenBean data2 = donationTokenResponse.getData();
                    if (data2 != null) {
                        data2.getToken();
                    }
                    AbstractC89172b bVar = this.f100563b;
                    String str3 = this.f100564c;
                    DonationTokenBean data3 = donationTokenResponse.getData();
                    if (data3 != null) {
                        str2 = data3.getToken();
                    }
                    if (str3 != null && C30128d.m60946a(str3) && !TextUtils.isEmpty(str2)) {
                        StringBuilder sb = new StringBuilder(str3);
                        if (!C89361p.m154929e((CharSequence) str3, (CharSequence) "?")) {
                            sb.append("?");
                        } else {
                            sb.append("&");
                        }
                        sb.append(str2);
                        str3 = sb.toString();
                    }
                    bVar.invoke(str3);
                    return;
                }
            }
            Context context = this.f100565d;
            if (context != null) {
                new C79459a(context).mo123052a(context.getString(R.string.ev7)).mo123053a();
            }
        }
    }

    /* renamed from: a */
    public static void m86050a(Context context, String str, int i, String str2, String str3, AbstractC89172b<? super String, C89391z> bVar) {
        C89219l.m154721d(bVar, "");
        IAccountUserService e = f100555b.mo57069e();
        C89219l.m154716b(e, "");
        if (e.isLogin()) {
            m86051b(context, str, i, str2, str3, bVar);
        } else if (context instanceof Activity) {
            C58957c.m108321a((Activity) context, "", "", new C43151a(context, str, i, str2, str3, bVar));
        }
    }

    /* renamed from: b */
    public static void m86051b(Context context, String str, int i, String str2, String str3, AbstractC89172b<? super String, C89391z> bVar) {
        Long l;
        AbstractC88979t<DonationTokenResponse> tVar;
        C89233z.C89238e eVar = new C89233z.C89238e();
        eVar.element = null;
        if (context instanceof Activity) {
            eVar.element = (T) new DialogC17223o((Activity) context);
            C80273bt.m139145a(eVar.element);
        }
        if (i == 3) {
            tVar = DonationTokenCreateApi.C43149a.m86049a().tokenCreate(i, 0L, str, str3);
        } else {
            DonationTokenCreateApi a = DonationTokenCreateApi.C43149a.m86049a();
            if (str != null) {
                l = Long.valueOf(Long.parseLong(str));
            } else {
                l = null;
            }
            tVar = a.tokenCreate(i, l, null, str3);
        }
        tVar.mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C43152b(eVar, bVar, str2, context), new C43153c(eVar, context));
    }
}
