package com.p2082ss.android.ugc.aweme.specact.popup.calendar;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.utils.permission.C80611a;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.specact.popup.calendar.a */
public final class C75190a {

    /* renamed from: a */
    static final Keva f169060a = Keva.getRepo("com.ss.android.ugc.aweme.specact.calendar.CalendarHelper");

    /* renamed from: b */
    public static final C75190a f169061b = new C75190a();

    private C75190a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.popup.calendar.a$c */
    public static final class C75193c implements C80611a.AbstractC80613a {

        /* renamed from: a */
        final /* synthetic */ Activity f169065a;

        /* renamed from: b */
        final /* synthetic */ C75194b f169066b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89172b f169067c;

        static {
            Covode.recordClassIndex(88071);
        }

        @Override // com.p2082ss.android.ugc.aweme.utils.permission.C80611a.AbstractC80613a
        /* renamed from: a */
        public final void mo79924a() {
            C75190a.m131923a(this.f169065a, this.f169066b, this.f169067c);
        }

        @Override // com.p2082ss.android.ugc.aweme.utils.permission.C80611a.AbstractC80613a
        /* renamed from: b */
        public final void mo79925b() {
            Activity activity = this.f169065a;
            if (!activity.shouldShowRequestPermissionRationale("android.permission.WRITE_CALENDAR") || !activity.shouldShowRequestPermissionRationale("android.permission.READ_CALENDAR")) {
                C75190a.f169060a.storeBoolean("isUserChoosesNotToAsk", true);
                this.f169067c.invoke(6);
                return;
            }
            this.f169067c.invoke(2);
        }

        C75193c(Activity activity, C75194b bVar, AbstractC89172b bVar2) {
            this.f169065a = activity;
            this.f169066b = bVar;
            this.f169067c = bVar2;
        }
    }

    static {
        Covode.recordClassIndex(88068);
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.popup.calendar.a$a */
    static final class DialogInterface$OnClickListenerC75191a implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C75194b f169062a;

        static {
            Covode.recordClassIndex(88069);
        }

        DialogInterface$OnClickListenerC75191a(C75194b bVar) {
            this.f169062a = bVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C39162r.m79460a("warmup_auth_deny_pop_click", new C33744d().mo59983a("position", this.f169062a.f169078k).mo59983a("button", "cancel").f79943a);
        }
    }

    /* renamed from: a */
    public static String m131922a(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        return str + '_' + str2;
    }

    /* renamed from: a */
    public static boolean m131925a(Activity activity, String str) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(str, "");
        if (C80611a.m139769b(activity, new String[]{"android.permission.WRITE_CALENDAR", "android.permission.READ_CALENDAR"})) {
            return C75195c.m131932a(activity, str);
        }
        C89219l.m154721d(str, "");
        return C75195c.f169079a.getBoolean(str, false);
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.popup.calendar.a$b */
    static final class DialogInterface$OnClickListenerC75192b implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C75194b f169063a;

        /* renamed from: b */
        final /* synthetic */ Activity f169064b;

        static {
            Covode.recordClassIndex(88070);
        }

        DialogInterface$OnClickListenerC75192b(C75194b bVar, Activity activity) {
            this.f169063a = bVar;
            this.f169064b = activity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C39162r.m79460a("warmup_auth_deny_pop_click", new C33744d().mo59983a("position", this.f169063a.f169078k).mo59983a("button", "setting").f79943a);
            Intent intent = new Intent();
            intent.addFlags(268435456);
            intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.fromParts("package", this.f169064b.getPackageName(), null));
            Activity activity = this.f169064b;
            C84349a.m145093a(intent, activity);
            activity.startActivity(intent);
        }
    }

    /* renamed from: a */
    public static void m131923a(Activity activity, C75194b bVar, AbstractC89172b<? super Integer, C89391z> bVar2) {
        bVar2.invoke(Integer.valueOf(C75195c.m131929a(activity, bVar)));
    }

    /* renamed from: a */
    public static void m131924a(Activity activity, C75194b bVar, boolean z, AbstractC89172b<? super Integer, C89391z> bVar2) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(bVar2, "");
        if (Build.VERSION.SDK_INT < 23) {
            m131923a(activity, bVar, bVar2);
        } else if (C80611a.m139769b(activity, new String[]{"android.permission.WRITE_CALENDAR", "android.permission.READ_CALENDAR"})) {
            m131923a(activity, bVar, bVar2);
        } else if (f169060a.getBoolean("isUserChoosesNotToAsk", false)) {
            if (z) {
                C39162r.m79460a("warmup_auth_deny_pop_show", new C33744d().mo59983a("position", bVar.f169078k).f79943a);
                C17197a.C17200a aVar = new C17197a.C17200a(activity);
                aVar.mo27189a(R.string.c4u).mo27194b(R.string.c4y).mo27195b(R.string.a8y, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC75191a(bVar), false).mo27190a(R.string.c4j, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC75192b(bVar, activity), false);
                aVar.mo27193a().mo27185c().show();
            }
            bVar2.invoke(6);
        } else {
            C80611a.m139767a(activity, new String[]{"android.permission.WRITE_CALENDAR", "android.permission.READ_CALENDAR"}, new C75193c(activity, bVar, bVar2));
        }
    }
}
