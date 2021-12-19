package com.p2082ss.android.ugc.aweme.account.p2251j;

import android.app.Activity;
import android.content.DialogInterface;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.p2082ss.android.sdk.p2174a.C30223b;
import com.p2082ss.android.sdk.p2174a.C30224c;
import com.p2082ss.android.ugc.aweme.C36085cj;
import com.p2082ss.android.ugc.aweme.IAccountService;
import com.p2082ss.android.ugc.aweme.account.p2233a.p2235b.C31376a;
import com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f;
import com.p2082ss.android.ugc.aweme.base.utils.C34727m;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.j.f */
public final class C31706f {

    /* renamed from: a */
    public static final C31706f f75841a = new C31706f();

    private C31706f() {
    }

    static {
        Covode.recordClassIndex(38440);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.j.f$a */
    static final class RunnableC31707a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Activity f75842a;

        /* renamed from: b */
        final /* synthetic */ String f75843b;

        /* renamed from: c */
        final /* synthetic */ String f75844c;

        /* renamed from: d */
        final /* synthetic */ String f75845d;

        /* renamed from: e */
        final /* synthetic */ AbstractC34543f f75846e;

        static {
            Covode.recordClassIndex(38441);
        }

        RunnableC31707a(Activity activity, String str, String str2, String str3, AbstractC34543f fVar) {
            this.f75842a = activity;
            this.f75843b = str;
            this.f75844c = str2;
            this.f75845d = str3;
            this.f75846e = fVar;
        }

        public final void run() {
            String str;
            C30223b bVar = C30223b.f72086a;
            String str2 = "";
            C89219l.m154716b(bVar, str2);
            C30224c b = bVar.mo53669b();
            if (!(b == null || (str = b.f72101l) == null)) {
                str2 = str;
            }
            C17197a.C17200a a = new C17197a.C17200a(this.f75842a).mo27189a(R.string.a5_);
            a.f41071b = this.f75843b;
            a.f41059E = true;
            a.mo27190a(R.string.cy2, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC31708a(this, str2), true).mo27195b(R.string.cy3, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC31711b(this), true).mo27193a().mo27185c().setCancelable(false);
            C39162r.m79460a("bind_notify", new C31376a().mo57399a("enter_from", this.f75844c).mo57399a("enter_method", this.f75845d).mo57399a("platform", str2).f75156a);
        }

        /* renamed from: com.ss.android.ugc.aweme.account.j.f$a$b */
        static final class DialogInterface$OnClickListenerC31711b implements DialogInterface.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ RunnableC31707a f75852a;

            static {
                Covode.recordClassIndex(38445);
            }

            DialogInterface$OnClickListenerC31711b(RunnableC31707a aVar) {
                this.f75852a = aVar;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                if (!this.f75852a.f75842a.isFinishing()) {
                    dialogInterface.dismiss();
                }
                this.f75852a.f75846e.mo57674b();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.account.j.f$a$a */
        static final class DialogInterface$OnClickListenerC31708a implements DialogInterface.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ RunnableC31707a f75847a;

            /* renamed from: b */
            final /* synthetic */ String f75848b;

            static {
                Covode.recordClassIndex(38442);
            }

            DialogInterface$OnClickListenerC31708a(RunnableC31707a aVar, String str) {
                this.f75847a = aVar;
                this.f75848b = str;
            }

            public final void onClick(final DialogInterface dialogInterface, int i) {
                C39162r.m79460a("bind_notify_confirm", new C31376a().mo57399a("enter_from", this.f75847a.f75844c).mo57399a("enter_method", this.f75847a.f75845d).mo57399a("platform", this.f75848b).f75156a);
                C36085cj.m73554h().bindMobileOrEmailAndSetPwd(this.f75847a.f75842a, this.f75847a.f75844c, this.f75847a.f75845d, null, new IAccountService.AbstractC31277g(this) {
                    /* class com.p2082ss.android.ugc.aweme.account.p2251j.C31706f.RunnableC31707a.DialogInterface$OnClickListenerC31708a.C317091 */

                    /* renamed from: a */
                    final /* synthetic */ DialogInterface$OnClickListenerC31708a f75849a;

                    static {
                        Covode.recordClassIndex(38443);
                    }

                    {
                        this.f75849a = r1;
                    }

                    @Override // com.p2082ss.android.ugc.aweme.IAccountService.AbstractC31277g
                    public final void onResult(int i, int i2, Object obj) {
                        if (i2 == 1) {
                            if (!this.f75849a.f75847a.f75842a.isFinishing()) {
                                dialogInterface.dismiss();
                            }
                            C34727m.m70945a(new Runnable(this) {
                                /* class com.p2082ss.android.ugc.aweme.account.p2251j.C31706f.RunnableC31707a.DialogInterface$OnClickListenerC31708a.C317091.RunnableC317101 */

                                /* renamed from: a */
                                final /* synthetic */ C317091 f75851a;

                                static {
                                    Covode.recordClassIndex(38444);
                                }

                                {
                                    this.f75851a = r1;
                                }

                                public final void run() {
                                    this.f75851a.f75849a.f75847a.f75846e.mo57673a();
                                }
                            }, 200);
                        }
                    }
                });
            }
        }
    }

    /* renamed from: a */
    public static void m66037a(Activity activity, String str, AbstractC34543f fVar, String str2, String str3) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        if (activity != null && !TextUtils.isEmpty(str)) {
            activity.runOnUiThread(new RunnableC31707a(activity, str, str2, str3, fVar));
        }
    }
}
