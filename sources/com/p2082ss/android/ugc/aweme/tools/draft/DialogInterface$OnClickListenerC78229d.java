package com.p2082ss.android.ugc.aweme.tools.draft;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C70788aa;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.d */
final /* synthetic */ class DialogInterface$OnClickListenerC78229d implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final C78121a f175699a;

    /* renamed from: b */
    private final View f175700b;

    /* renamed from: c */
    private final C43223c f175701c;

    static {
        Covode.recordClassIndex(91344);
    }

    DialogInterface$OnClickListenerC78229d(C78121a aVar, View view, C43223c cVar) {
        this.f175699a = aVar;
        this.f175700b = view;
        this.f175701c = cVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C78121a aVar = this.f175699a;
        View view = this.f175700b;
        C43223c cVar = this.f175701c;
        Context context = view.getContext();
        C70788aa.m125072a(context, context.getResources().getQuantityString(R.plurals.b4, 1), context.getString(R.string.bc2), new C78244e(aVar, cVar), context.getString(R.string.bc3));
        dialogInterface.dismiss();
    }
}
