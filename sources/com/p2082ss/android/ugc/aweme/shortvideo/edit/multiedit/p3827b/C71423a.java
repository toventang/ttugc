package com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.p3827b;

import android.app.Activity;
import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.b.a */
public final class C71423a {

    /* renamed from: a */
    public static final C71423a f160038a = new C71423a();

    private C71423a() {
    }

    static {
        Covode.recordClassIndex(83957);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.b.a$a */
    public static final class DialogInterface$OnClickListenerC71424a implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ String f160039a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f160040b;

        static {
            Covode.recordClassIndex(83958);
        }

        public DialogInterface$OnClickListenerC71424a(String str, AbstractC89171a aVar) {
            this.f160039a = str;
            this.f160040b = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f160040b.invoke();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.b.a$b */
    public static final class DialogInterface$OnClickListenerC71425b implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f160041a;

        static {
            Covode.recordClassIndex(83959);
        }

        DialogInterface$OnClickListenerC71425b(AbstractC89171a aVar) {
            this.f160041a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f160041a.invoke();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.b.a$c */
    public static final class DialogInterface$OnClickListenerC71426c implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f160042a;

        static {
            Covode.recordClassIndex(83960);
        }

        DialogInterface$OnClickListenerC71426c(AbstractC89171a aVar) {
            this.f160042a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f160042a.invoke();
        }
    }

    /* renamed from: a */
    public static void m126139a(Activity activity, AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(aVar, "");
        if (activity == null || activity.isFinishing()) {
            aVar.invoke();
        } else {
            new C17197a.C17200a(activity).mo27194b(R.string.bjh).mo27195b(R.string.bja, (DialogInterface.OnClickListener) null, false).mo27190a(R.string.bjg, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC71426c(aVar), false).mo27193a().mo27184b().show();
        }
    }

    /* renamed from: b */
    public static void m126140b(Activity activity, AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(aVar, "");
        if (activity == null || activity.isFinishing()) {
            aVar.invoke();
        } else {
            new C17197a.C17200a(activity).mo27194b(R.string.bjh).mo27195b(R.string.bja, (DialogInterface.OnClickListener) null, false).mo27190a(R.string.bjg, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC71425b(aVar), false).mo27193a().mo27184b().show();
        }
    }
}
