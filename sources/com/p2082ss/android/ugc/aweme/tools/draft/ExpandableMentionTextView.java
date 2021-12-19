package com.p2082ss.android.ugc.aweme.tools.draft;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.p3788aa.AbstractC69754b;
import com.p2082ss.android.ugc.aweme.tools.draft.p4114l.C78406d;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.ExpandableMentionTextView */
public final class ExpandableMentionTextView extends C78406d implements AbstractC69754b {

    /* renamed from: c */
    private int f175438c;

    static {
        Covode.recordClassIndex(91228);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3788aa.AbstractC69754b
    public final int getHookAtMaxWidth() {
        return this.f175438c;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExpandableMentionTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C89219l.m154721d(context, "");
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, com.p2082ss.android.ugc.aweme.tools.draft.p4114l.C78406d
    public final void onMeasure(int i, int i2) {
        this.f175438c = View.MeasureSpec.getSize(i);
        super.onMeasure(i, i2);
    }
}
