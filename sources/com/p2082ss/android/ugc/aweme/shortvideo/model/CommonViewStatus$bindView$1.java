package com.p2082ss.android.ugc.aweme.shortvideo.model;

import android.view.View;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.model.CommonViewStatus$bindView$1 */
public final class CommonViewStatus$bindView$1<T> implements AbstractC1214u {
    final /* synthetic */ View $view;

    static {
        Covode.recordClassIndex(84567);
    }

    CommonViewStatus$bindView$1(View view) {
        this.$view = view;
    }

    public final void onChanged(Integer num) {
        View view = this.$view;
        C89219l.m154716b(num, "");
        view.setVisibility(num.intValue());
    }
}
