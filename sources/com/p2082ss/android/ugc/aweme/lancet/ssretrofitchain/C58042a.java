package com.p2082ss.android.ugc.aweme.lancet.ssretrofitchain;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.retrofit2.C22099u;
import com.bytedance.retrofit2.client.Request;
import com.p2082ss.android.ugc.aweme.AbstractC34892bo;
import com.p2082ss.android.ugc.aweme.IAccountService;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.base.p2372d.C34569a;
import com.p2082ss.android.ugc.aweme.lancet.ssretrofitchain.AbstractC58051c;
import com.p2082ss.android.ugc.aweme.lancet.ssretrofitchain.C58057g;
import com.p2082ss.android.ugc.aweme.sec.SecApiImpl;
import com.p2082ss.android.ugc.aweme.secapi.C67837a;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import java.util.concurrent.atomic.AtomicBoolean;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.lancet.ssretrofitchain.a */
public final class C58042a extends AbstractC58051c {

    /* renamed from: a */
    public final AtomicBoolean f132272a = new AtomicBoolean(false);

    static {
        Covode.recordClassIndex(68082);
    }

    /* renamed from: com.ss.android.ugc.aweme.lancet.ssretrofitchain.a$b */
    public static final class C58045b extends C67837a {

        /* renamed from: a */
        final /* synthetic */ C58042a f132277a;

        /* renamed from: b */
        final /* synthetic */ String f132278b;

        static {
            Covode.recordClassIndex(68085);
        }

        @Override // com.p2082ss.android.ugc.aweme.secapi.C67837a
        /* renamed from: a */
        public final void mo90185a() {
            this.f132277a.f132272a.set(false);
        }

        C58045b(C58042a aVar, String str) {
            this.f132277a = aVar;
            this.f132278b = str;
        }

        @Override // com.p2082ss.android.ugc.aweme.secapi.C67837a
        /* renamed from: a */
        public final void mo61882a(boolean z, int i) {
            if (z) {
                AbstractC81915c.m141874a(new C34569a(this.f132278b));
            }
            this.f132277a.f132272a.set(false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.lancet.ssretrofitchain.a$a */
    static final class RunnableC58043a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C58042a f132273a;

        /* renamed from: b */
        final /* synthetic */ int f132274b;

        /* renamed from: c */
        final /* synthetic */ String f132275c;

        static {
            Covode.recordClassIndex(68083);
        }

        RunnableC58043a(C58042a aVar, int i, String str) {
            this.f132273a = aVar;
            this.f132274b = i;
            this.f132275c = str;
        }

        public final void run() {
            Activity j = C17873f.m33102j();
            if (j != null) {
                this.f132273a.mo95555a(j, this.f132274b, this.f132275c);
            } else {
                new Handler().postDelayed(new Runnable(this) {
                    /* class com.p2082ss.android.ugc.aweme.lancet.ssretrofitchain.C58042a.RunnableC58043a.RunnableC580441 */

                    /* renamed from: a */
                    final /* synthetic */ RunnableC58043a f132276a;

                    static {
                        Covode.recordClassIndex(68084);
                    }

                    {
                        this.f132276a = r1;
                    }

                    public final void run() {
                        Activity j = C17873f.m33102j();
                        if (j != null) {
                            this.f132276a.f132273a.mo95555a(j, this.f132276a.f132274b, this.f132276a.f132275c);
                        } else {
                            this.f132276a.f132273a.f132272a.set(false);
                        }
                    }
                }, 1000);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58042a(AbstractC58051c cVar) {
        super(cVar);
        C89219l.m154721d(cVar, "");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.lancet.ssretrofitchain.a$d */
    public static final class DialogInterface$OnClickListenerC58047d implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C58042a f132280a;

        static {
            Covode.recordClassIndex(68087);
        }

        DialogInterface$OnClickListenerC58047d(C58042a aVar) {
            this.f132280a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f132280a.f132272a.set(false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.lancet.ssretrofitchain.a$c */
    public static final class DialogInterface$OnClickListenerC58046c implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C58042a f132279a;

        static {
            Covode.recordClassIndex(68086);
        }

        DialogInterface$OnClickListenerC58046c(C58042a aVar) {
            this.f132279a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C31575b.m65860b().logout("expired_logout", "sdk_expired_logout");
            this.f132279a.f132272a.set(false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.lancet.ssretrofitchain.a$e */
    public static final class DialogInterface$OnClickListenerC58048e implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C58042a f132281a;

        /* renamed from: b */
        final /* synthetic */ Activity f132282b;

        /* renamed from: c */
        final /* synthetic */ String f132283c;

        static {
            Covode.recordClassIndex(68088);
        }

        DialogInterface$OnClickListenerC58048e(C58042a aVar, Activity activity, String str) {
            this.f132281a = aVar;
            this.f132282b = activity;
            this.f132283c = str;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            AbstractC34892bo b = C31575b.m65860b();
            IAccountService.C31274d dVar = new IAccountService.C31274d();
            dVar.f74960a = this.f132282b;
            dVar.f74964e = new IAccountService.AbstractC31277g(this) {
                /* class com.p2082ss.android.ugc.aweme.lancet.ssretrofitchain.C58042a.DialogInterface$OnClickListenerC58048e.C580491 */

                /* renamed from: a */
                final /* synthetic */ DialogInterface$OnClickListenerC58048e f132284a;

                static {
                    Covode.recordClassIndex(68089);
                }

                {
                    this.f132284a = r1;
                }

                @Override // com.p2082ss.android.ugc.aweme.IAccountService.AbstractC31277g
                public final void onResult(int i, int i2, Object obj) {
                    C58042a aVar = this.f132284a.f132281a;
                    if (i == 1 && i2 == 1) {
                        AbstractC81915c.m141874a(new C34569a(this.f132284a.f132283c));
                    }
                    aVar.f132272a.set(false);
                }
            };
            b.showLoginAndRegisterView(dVar.mo57084a());
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.lancet.ssretrofitchain.AbstractC58051c
    /* renamed from: a */
    public final AbstractC58051c.C58052a mo95554a(C58057g gVar, Request request, C22099u<?> uVar) {
        C58057g.C58058a aVar;
        String str;
        C58057g.C58058a aVar2;
        C58057g.C58058a aVar3;
        if (gVar == null || ((((aVar = gVar.f132293a) == null || aVar.f132295a != 3070) && (((aVar2 = gVar.f132293a) == null || aVar2.f132295a != 3071) && ((aVar3 = gVar.f132293a) == null || aVar3.f132295a != 3072))) || !this.f132272a.compareAndSet(false, true))) {
            AbstractC58051c.C58052a aVar4 = C58050b.f132285a;
            C89219l.m154716b(aVar4, "");
            return aVar4;
        }
        int i = gVar.f132293a.f132295a;
        if (request != null) {
            str = request.getUrl();
        } else {
            str = null;
        }
        new Handler(Looper.getMainLooper()).post(new RunnableC58043a(this, i, str));
        return new AbstractC58051c.C58052a(true, false);
    }

    /* renamed from: a */
    public final void mo95555a(Activity activity, int i, String str) {
        C89219l.m154721d(activity, "");
        if (i == 3070 || i == 3072) {
            SecApiImpl.m119993a().popCaptcha(activity, i, new C58045b(this, str));
        } else if (i == 3071) {
            C17197a.C17200a aVar = new C17197a.C17200a(activity);
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            if (g.isLogin()) {
                aVar.mo27189a(R.string.cy5).mo27194b(R.string.cy4).mo27190a(R.string.b6k, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC58046c(this), false);
            } else {
                aVar.mo27194b(R.string.ar7).mo27195b(R.string.a7d, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC58047d(this), false).mo27190a(R.string.anv, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC58048e(this, activity, str), false);
            }
            aVar.mo27193a().mo27184b().setCancelable(false);
        }
    }
}
