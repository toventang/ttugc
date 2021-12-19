package com.p2082ss.android.ugc.aweme.main.p3430d;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.p2690cr.C40333c;
import com.p2082ss.android.ugc.aweme.utils.C80261bq;
import com.p2082ss.android.ugc.aweme.utils.C80535hi;
import com.p2082ss.android.ugc.aweme.utils.C80536hj;
import com.p2082ss.android.ugc.trill.R;
import p4560f.p4561a.AbstractC88982v;
import p4560f.p4561a.AbstractC88983w;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.main.d.a */
public final class C59068a {

    /* renamed from: a */
    public static final C59069a f134463a = new C59069a((byte) 0);

    /* renamed from: com.ss.android.ugc.aweme.main.d.a$g */
    static final class DialogInterface$OnClickListenerC59075g implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public static final DialogInterface$OnClickListenerC59075g f134471a = new DialogInterface$OnClickListenerC59075g();

        static {
            Covode.recordClassIndex(69421);
        }

        DialogInterface$OnClickListenerC59075g() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    static {
        Covode.recordClassIndex(69414);
    }

    /* renamed from: com.ss.android.ugc.aweme.main.d.a$a */
    public static final class C59069a {
        static {
            Covode.recordClassIndex(69415);
        }

        private C59069a() {
        }

        public /* synthetic */ C59069a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.main.d.a$d */
    public static final class C59072d<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C59072d f134467a = new C59072d();

        static {
            Covode.recordClassIndex(69418);
        }

        C59072d() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C51423a.m95787a("CleanCacheDialog#show: " + ((Throwable) obj).getMessage());
        }
    }

    /* renamed from: a */
    static void m108549a(String str) {
        C39162r.m79460a("storage_toast_show", new C33744d().mo59983a("toast_type", str).f79943a);
    }

    /* renamed from: com.ss.android.ugc.aweme.main.d.a$b */
    public static final class C59070b<T> implements AbstractC88983w {

        /* renamed from: a */
        final /* synthetic */ Activity f134464a;

        static {
            Covode.recordClassIndex(69416);
        }

        public C59070b(Activity activity) {
            this.f134464a = activity;
        }

        @Override // p4560f.p4561a.AbstractC88983w
        public final void subscribe(AbstractC88982v<Integer> vVar) {
            C89219l.m154721d(vVar, "");
            C40333c.m81488a().storeLong("last_check_storage_time", System.currentTimeMillis());
            Activity activity = this.f134464a;
            C89219l.m154721d(activity, "");
            C80535hi a = C80536hj.m139612a();
            if (C80261bq.m139130e(activity) <= ((long) a.f180151b) * 1048576 || C80261bq.m139127d(activity) >= ((long) a.f180150a) * 1048576) {
                Activity activity2 = this.f134464a;
                C89219l.m154721d(activity2, "");
                C80535hi a2 = C80536hj.m139612a();
                if (C80261bq.m139130e(activity2) >= ((long) a2.f180151b) * 1048576 || C80261bq.m139127d(activity2) >= ((long) a2.f180150a) * 1048576) {
                    vVar.mo143023a();
                } else {
                    vVar.mo143031a((Integer) 2);
                }
            } else {
                vVar.mo143031a((Integer) 1);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.main.d.a$c */
    public static final class C59071c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C59068a f134465a;

        /* renamed from: b */
        final /* synthetic */ Activity f134466b;

        static {
            Covode.recordClassIndex(69417);
        }

        public C59071c(C59068a aVar, Activity activity) {
            this.f134465a = aVar;
            this.f134466b = activity;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Integer num = (Integer) obj;
            if (num != null) {
                if (num.intValue() == 1) {
                    C59068a aVar = this.f134465a;
                    Activity activity = this.f134466b;
                    if (!C40333c.m81489b() && !activity.isFinishing()) {
                        C40333c.m81488a().storeInt("show_storage_manager_count", C40333c.m81490c() + 1);
                        C17197a.C17200a aVar2 = new C17197a.C17200a(activity);
                        aVar2.mo27189a(R.string.d0p).mo27194b(R.string.c0b).mo27195b(R.string.dhl, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC59073e(aVar), false).mo27190a(R.string.d0o, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC59074f(aVar, activity), false);
                        Dialog c = aVar2.mo27193a().mo27185c();
                        c.setCancelable(false);
                        c.setCanceledOnTouchOutside(false);
                        C59068a.m108549a("clean_app");
                    }
                } else if (num.intValue() == 2) {
                    Activity activity2 = this.f134466b;
                    if (!C40333c.m81491d() && !activity2.isFinishing()) {
                        C40333c.m81488a().storeInt("show_system_clean_count", C40333c.m81492e() + 1);
                        C17197a.C17200a aVar3 = new C17197a.C17200a(activity2);
                        aVar3.mo27189a(R.string.d0p).mo27194b(R.string.c0c).mo27190a(R.string.b6k, (DialogInterface.OnClickListener) DialogInterface$OnClickListenerC59075g.f134471a, false);
                        Dialog c2 = aVar3.mo27193a().mo27185c();
                        c2.setCancelable(false);
                        c2.setCanceledOnTouchOutside(false);
                        C59068a.m108549a("clean_system");
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.main.d.a$e */
    static final class DialogInterface$OnClickListenerC59073e implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C59068a f134468a;

        static {
            Covode.recordClassIndex(69419);
        }

        DialogInterface$OnClickListenerC59073e(C59068a aVar) {
            this.f134468a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C39162r.m79460a("storage_toast_cancel", new C33744d().mo59983a("toast_type", "clean_app").f79943a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.main.d.a$f */
    static final class DialogInterface$OnClickListenerC59074f implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C59068a f134469a;

        /* renamed from: b */
        final /* synthetic */ Activity f134470b;

        static {
            Covode.recordClassIndex(69420);
        }

        DialogInterface$OnClickListenerC59074f(C59068a aVar, Activity activity) {
            this.f134469a = aVar;
            this.f134470b = activity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            SmartRouter.buildRoute(this.f134470b, "//setting/diskmanager").open();
            C39162r.m79460a("storage_toast_clean", new C33744d().mo59983a("toast_type", "clean_app").f79943a);
        }
    }
}
