package com.p2082ss.android.ugc.aweme.story.record.p4062b;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63253l;
import com.p2082ss.android.ugc.aweme.shortvideo.C71827ew;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.p3877a.p3878a.AbstractC73354a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.record.b.b */
public final class C77481b implements AbstractC73354a {

    /* renamed from: a */
    public static final C77481b f173814a = new C77481b();

    /* renamed from: b */
    private static Dialog f173815b;

    private C77481b() {
    }

    static {
        Covode.recordClassIndex(90516);
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.b.b$c */
    static final class DialogInterface$OnDismissListenerC77484c implements DialogInterface.OnDismissListener {

        /* renamed from: a */
        final /* synthetic */ Activity f173818a;

        static {
            Covode.recordClassIndex(90519);
        }

        DialogInterface$OnDismissListenerC77484c(Activity activity) {
            this.f173818a = activity;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            this.f173818a.finish();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.b.b$d */
    public static final class DialogInterface$OnClickListenerC77485d implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Activity f173819a;

        static {
            Covode.recordClassIndex(90520);
        }

        DialogInterface$OnClickListenerC77485d(Activity activity) {
            this.f173819a = activity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f173819a.finish();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.p3877a.p3878a.AbstractC73354a
    /* renamed from: b */
    public final void mo116016b(Activity activity) {
        C89219l.m154721d(activity, "");
        Dialog b = new C17197a.C17200a(activity).mo27189a(R.string.a8m).mo27194b(R.string.a8l).mo27195b(R.string.a8y, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC77485d(activity), false).mo27193a().mo27184b();
        int i = Build.VERSION.SDK_INT;
        b.setOnDismissListener(new DialogInterface$OnDismissListenerC77484c(activity));
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.p3877a.p3878a.AbstractC73354a
    /* renamed from: a */
    public final void mo116015a(Activity activity) {
        C89219l.m154721d(activity, "");
        if (f173815b == null) {
            f173815b = new C17197a.C17200a(activity).mo27194b(R.string.v0).mo27195b(R.string.v1, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC77482a(activity), false).mo27190a(R.string.as2, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC77483b(activity), false).mo27193a().mo27184b();
        }
        Dialog dialog = f173815b;
        if (dialog != null && !dialog.isShowing()) {
            C71827ew.m126824a(f173815b);
            try {
                Dialog dialog2 = f173815b;
                if (dialog2 != null) {
                    dialog2.show();
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.b.b$a */
    static final class DialogInterface$OnClickListenerC77482a implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Activity f173816a;

        static {
            Covode.recordClassIndex(90517);
        }

        DialogInterface$OnClickListenerC77482a(Activity activity) {
            this.f173816a = activity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f173816a.finish();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.b.b$b */
    static final class DialogInterface$OnClickListenerC77483b implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Activity f173817a;

        static {
            Covode.recordClassIndex(90518);
        }

        DialogInterface$OnClickListenerC77483b(Activity activity) {
            this.f173817a = activity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C63253l.f143623a.mo73307c().mo101675d(this.f173817a);
            this.f173817a.finish();
        }
    }
}
