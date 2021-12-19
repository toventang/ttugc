package com.p2082ss.android.ugc.aweme.share.improve.p3758c;

import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h;
import java.util.ArrayList;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.improve.c.d */
public final class C69128d {

    /* renamed from: a */
    private static final ArrayList<String> f154572a = C89070n.m154525d("copy", "qr_code");

    static {
        Covode.recordClassIndex(81442);
    }

    /* renamed from: a */
    public static final boolean m122236a(AbstractC69693h hVar) {
        C89219l.m154721d(hVar, "");
        return f154572a.contains(hVar.mo61919c());
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.c.d$a */
    public static final class DialogInterface$OnClickListenerC69129a implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public static final DialogInterface$OnClickListenerC69129a f154573a = new DialogInterface$OnClickListenerC69129a();

        static {
            Covode.recordClassIndex(81443);
        }

        DialogInterface$OnClickListenerC69129a() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }
}
