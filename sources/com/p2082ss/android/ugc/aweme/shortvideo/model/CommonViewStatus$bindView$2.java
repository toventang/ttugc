package com.p2082ss.android.ugc.aweme.shortvideo.model;

import android.view.View;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.model.CommonViewStatus$bindView$2 */
public final class CommonViewStatus$bindView$2<T> implements AbstractC1214u {
    final /* synthetic */ View $view;

    static {
        Covode.recordClassIndex(84568);
    }

    CommonViewStatus$bindView$2(View view) {
        this.$view = view;
    }

    public final void onChanged(Float f) {
        View view = this.$view;
        C89219l.m154716b(f, "");
        view.setAlpha(f.floatValue());
    }
}
