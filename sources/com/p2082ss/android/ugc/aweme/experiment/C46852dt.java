package com.p2082ss.android.ugc.aweme.experiment;

import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.component.DialogC34545h;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.experiment.dt */
public final class C46852dt {

    /* renamed from: a */
    public static long f109160a = -1;

    /* renamed from: b */
    public static String f109161b = "";

    /* renamed from: c */
    public static final Keva f109162c;

    /* renamed from: d */
    public static final C46852dt f109163d = new C46852dt();

    private C46852dt() {
    }

    static {
        Covode.recordClassIndex(55453);
        Keva repo = Keva.getRepo("new_illegal_username_keva");
        C89219l.m154716b(repo, "");
        f109162c = repo;
    }

    /* renamed from: com.ss.android.ugc.aweme.experiment.dt$a */
    public static final class DialogInterface$OnDismissListenerC46853a implements DialogInterface.OnDismissListener {

        /* renamed from: a */
        final /* synthetic */ Runnable f109164a;

        /* renamed from: b */
        final /* synthetic */ DialogC34545h f109165b;

        /* renamed from: c */
        final /* synthetic */ String f109166c;

        /* renamed from: d */
        final /* synthetic */ long f109167d;

        static {
            Covode.recordClassIndex(55454);
        }

        public DialogInterface$OnDismissListenerC46853a(Runnable runnable, DialogC34545h hVar, String str, long j) {
            this.f109164a = runnable;
            this.f109165b = hVar;
            this.f109166c = str;
            this.f109167d = j;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            String str;
            Runnable runnable = this.f109164a;
            if (runnable != null) {
                runnable.run();
            }
            DialogC34545h hVar = this.f109165b;
            if (hVar == null || (str = hVar.f81565e) == null) {
                str = "background";
            }
            C46852dt.m90165a(this.f109166c, System.currentTimeMillis() - this.f109167d, str);
            C46852dt.f109160a = -1;
        }
    }

    /* renamed from: a */
    public static void m90165a(String str, long j, String str2) {
        C39162r.m79460a("exit_username", new C33744d().mo59983a("enter_from", str).mo59983a("result", str2).mo59981a("stay_time", j).f79943a);
    }
}
