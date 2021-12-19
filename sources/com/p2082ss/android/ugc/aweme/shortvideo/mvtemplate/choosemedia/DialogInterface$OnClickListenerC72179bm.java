package com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.content.Context;
import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.C72175bj;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73991bj;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.bm */
final /* synthetic */ class DialogInterface$OnClickListenerC72179bm implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final boolean f161796a;

    /* renamed from: b */
    private final Context f161797b;

    /* renamed from: c */
    private final C72175bj.AbstractC72176a f161798c;

    static {
        Covode.recordClassIndex(84844);
    }

    DialogInterface$OnClickListenerC72179bm(boolean z, Context context, C72175bj.AbstractC72176a aVar) {
        this.f161796a = z;
        this.f161797b = context;
        this.f161798c = aVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        boolean z = this.f161796a;
        Context context = this.f161797b;
        C72175bj.AbstractC72176a aVar = this.f161798c;
        if (z) {
            C73991bj.m130128a("reuse support open setting activity");
            C63238c.f143566D.mo73307c().mo101675d(context);
            return;
        }
        C73991bj.m130128a("reuse not support open setting activity");
        C72175bj.m127364a(context, aVar);
    }
}
