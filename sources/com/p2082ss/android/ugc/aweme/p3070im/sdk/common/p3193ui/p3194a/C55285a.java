package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.p3194a;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.icon.TuxIconView;
import com.p084a.p088b.C1862a;
import com.p2082ss.android.ugc.aweme.notification.p3528g.C62023a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.ui.a.a */
public final class C55285a {

    /* renamed from: a */
    public final View f126393a;

    static {
        Covode.recordClassIndex(65040);
    }

    /* renamed from: a */
    public final void mo92298a() {
        this.f126393a.setVisibility(0);
        TuxIconView tuxIconView = (TuxIconView) this.f126393a.findViewById(R.id.ezd);
        C89219l.m154716b(tuxIconView, "");
        tuxIconView.setVisibility(0);
        C62023a.m112168a(this.f126393a);
    }

    public C55285a(Context context, ViewGroup.LayoutParams layoutParams) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(layoutParams, "");
        View a = C1862a.m6031a(context, R.layout.a6w);
        C89219l.m154716b(a, "");
        this.f126393a = a;
        a.setLayoutParams(layoutParams);
    }
}
