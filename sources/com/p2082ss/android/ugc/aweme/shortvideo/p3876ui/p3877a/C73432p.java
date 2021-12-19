package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.p3877a;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.shortvideo.C71827ew;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.p3877a.p3878a.AbstractC73354a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.a.p */
public final class C73432p implements AbstractC73354a {

    /* renamed from: a */
    public static final C73432p f164966a = new C73432p();

    /* renamed from: b */
    private static Dialog f164967b;

    private C73432p() {
    }

    static {
        Covode.recordClassIndex(86169);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.a.p$c */
    public static final class DialogInterface$OnDismissListenerC73435c implements DialogInterface.OnDismissListener {

        /* renamed from: a */
        final /* synthetic */ Activity f164970a;

        static {
            Covode.recordClassIndex(86172);
        }

        DialogInterface$OnDismissListenerC73435c(Activity activity) {
            this.f164970a = activity;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            this.f164970a.finish();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.a.p$d */
    public static final class DialogInterface$OnClickListenerC73436d implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Activity f164971a;

        static {
            Covode.recordClassIndex(86173);
        }

        DialogInterface$OnClickListenerC73436d(Activity activity) {
            this.f164971a = activity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f164971a.finish();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.p3877a.p3878a.AbstractC73354a
    /* renamed from: b */
    public final void mo116016b(Activity activity) {
        C89219l.m154721d(activity, "");
        Dialog b = new C17197a.C17200a(activity).mo27189a(R.string.a8m).mo27194b(R.string.a8l).mo27195b(R.string.a8y, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC73436d(activity), false).mo27193a().mo27184b();
        int i = Build.VERSION.SDK_INT;
        b.setOnDismissListener(new DialogInterface$OnDismissListenerC73435c(activity));
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.p3877a.p3878a.AbstractC73354a
    /* renamed from: a */
    public final void mo116015a(Activity activity) {
        C89219l.m154721d(activity, "");
        if (f164967b == null) {
            f164967b = new C17197a.C17200a(activity).mo27194b(R.string.v0).mo27195b(R.string.v1, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC73433a(activity), false).mo27190a(R.string.as2, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC73434b(activity), false).mo27193a().mo27184b();
        }
        Dialog dialog = f164967b;
        if (dialog != null && !dialog.isShowing()) {
            C71827ew.m126824a(f164967b);
            try {
                Dialog dialog2 = f164967b;
                if (dialog2 != null) {
                    dialog2.show();
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.a.p$a */
    static final class DialogInterface$OnClickListenerC73433a implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Activity f164968a;

        static {
            Covode.recordClassIndex(86170);
        }

        DialogInterface$OnClickListenerC73433a(Activity activity) {
            this.f164968a = activity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f164968a.finish();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.a.p$b */
    static final class DialogInterface$OnClickListenerC73434b implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Activity f164969a;

        static {
            Covode.recordClassIndex(86171);
        }

        DialogInterface$OnClickListenerC73434b(Activity activity) {
            this.f164969a = activity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C63238c.f143566D.mo73307c().mo101675d(this.f164969a);
            this.f164969a.finish();
        }
    }
}
