package com.p2082ss.android.ugc.aweme.legoImp.inflate;

import android.content.Context;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.C17273d;
import com.bytedance.ies.dmt.p1194ui.widget.C17275e;
import com.bytedance.ies.dmt.p1194ui.widget.EnumC17270a;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.C50090az;
import com.p2082ss.android.ugc.trill.R;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.legoImp.inflate.c */
public final /* synthetic */ class C58290c implements C50090az.AbstractC50091a {

    /* renamed from: a */
    private final Context f132748a;

    /* renamed from: b */
    private final View.OnClickListener f132749b;

    static {
        Covode.recordClassIndex(68369);
    }

    C58290c(Context context, View.OnClickListener onClickListener) {
        this.f132748a = context;
        this.f132749b = onClickListener;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.C50090az.AbstractC50091a
    /* renamed from: a */
    public final View mo85227a(View view) {
        Context context = this.f132748a;
        C17273d dVar = new C17273d.C17274a(context).mo27457a(2131233182).mo27462b(R.string.gzs).mo27464c(R.string.gzr).mo27459a(EnumC17270a.BORDER, R.string.gzy, this.f132749b).f41365a;
        C17275e eVar = new C17275e(view.getContext());
        eVar.setStatus(dVar);
        return eVar;
    }
}
