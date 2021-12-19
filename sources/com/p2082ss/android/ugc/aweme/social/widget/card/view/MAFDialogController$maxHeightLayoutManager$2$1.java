package com.p2082ss.android.ugc.aweme.social.widget.card.view;

import android.content.res.Resources;
import android.graphics.Rect;
import android.util.TypedValue;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.social.widget.card.view.C74891b;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.social.widget.card.view.MAFDialogController$maxHeightLayoutManager$2$1 */
public final class MAFDialogController$maxHeightLayoutManager$2$1 extends LinearLayoutManager {

    /* renamed from: a */
    final /* synthetic */ C74891b.C74898f f168357a;

    static {
        Covode.recordClassIndex(87752);
    }

    /* JADX WARN: Incorrect args count in method signature: ()V */
    MAFDialogController$maxHeightLayoutManager$2$1(C74891b.C74898f fVar) {
        this.f168357a = fVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: a */
    public final void mo4319a(Rect rect, int i, int i2) {
        Resources system = Resources.getSystem();
        C89219l.m154709a((Object) system, "");
        super.mo4319a(rect, i, View.MeasureSpec.makeMeasureSpec(C89241a.m154730a(TypedValue.applyDimension(1, 272.0f, system.getDisplayMetrics())), Integer.MIN_VALUE));
    }
}
