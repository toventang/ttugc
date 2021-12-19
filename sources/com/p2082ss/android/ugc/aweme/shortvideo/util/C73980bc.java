package com.p2082ss.android.ugc.aweme.shortvideo.util;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.p2082ss.android.ugc.aweme.p2730de.C40970e;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.shortvideo.C71827ew;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.bc */
public final class C73980bc {

    /* renamed from: a */
    static Dialog f166074a;

    /* renamed from: b */
    public static final C73980bc f166075b = new C73980bc();

    private C73980bc() {
    }

    static {
        Covode.recordClassIndex(86730);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.util.bc$c */
    public static final class DialogInterface$OnDismissListenerC73983c implements DialogInterface.OnDismissListener {

        /* renamed from: a */
        public static final DialogInterface$OnDismissListenerC73983c f166079a = new DialogInterface$OnDismissListenerC73983c();

        static {
            Covode.recordClassIndex(86733);
        }

        DialogInterface$OnDismissListenerC73983c() {
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            C73980bc.f166074a = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.util.bc$a */
    public static final class DialogInterface$OnClickListenerC73981a implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f166076a;

        static {
            Covode.recordClassIndex(86731);
        }

        DialogInterface$OnClickListenerC73981a(AbstractC89171a aVar) {
            this.f166076a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            this.f166076a.invoke();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.util.bc$b */
    public static final class DialogInterface$OnClickListenerC73982b implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Context f166077a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f166078b;

        static {
            Covode.recordClassIndex(86732);
        }

        DialogInterface$OnClickListenerC73982b(Context context, AbstractC89171a aVar) {
            this.f166077a = context;
            this.f166078b = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            C63238c.f143566D.mo73307c().mo101675d(this.f166077a);
            this.f166078b.invoke();
        }
    }

    /* renamed from: a */
    public static void m130118a(Context context, AbstractC89171a<C89391z> aVar, AbstractC89171a<C89391z> aVar2) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(aVar2, "");
        if (f166074a == null) {
            C17197a.C17200a a = new C17197a.C17200a(context).mo27194b(R.string.v0).mo27195b(R.string.v1, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC73981a(aVar), false).mo27190a(R.string.as2, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC73982b(context, aVar2), false);
            a.f41067M = false;
            Dialog b = a.mo27193a().mo27184b();
            b.setOnDismissListener(DialogInterface$OnDismissListenerC73983c.f166079a);
            f166074a = b;
        }
        Dialog dialog = f166074a;
        if (dialog != null && (context instanceof Activity) && !((Activity) context).isFinishing() && !dialog.isShowing()) {
            try {
                dialog.show();
                C71827ew.m126824a(dialog);
            } catch (Exception e) {
                C40970e.m82485a(e.toString());
            }
        }
    }
}
