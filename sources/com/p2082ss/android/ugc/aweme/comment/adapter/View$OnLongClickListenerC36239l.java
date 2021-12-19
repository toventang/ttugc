package com.p2082ss.android.ugc.aweme.comment.adapter;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36421g;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.comment.adapter.l */
public final /* synthetic */ class View$OnLongClickListenerC36239l implements View.OnLongClickListener {

    /* renamed from: a */
    private final C36229h f85611a;

    static {
        Covode.recordClassIndex(43505);
    }

    View$OnLongClickListenerC36239l(C36229h hVar) {
        this.f85611a = hVar;
    }

    public final boolean onLongClick(View view) {
        C36229h hVar = this.f85611a;
        if (hVar.f85599x == null || hVar.f85600y == null) {
            return true;
        }
        hVar.f85599x.mo63744a(hVar.f85601z, hVar.f85600y, (AbstractC36421g) null);
        return true;
    }
}
