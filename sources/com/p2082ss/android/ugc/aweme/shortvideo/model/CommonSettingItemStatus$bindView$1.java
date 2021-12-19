package com.p2082ss.android.ugc.aweme.shortvideo.model;

import android.view.View;
import com.bytedance.als.AbstractC2565m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.common.views.CommonItemView;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.model.CommonSettingItemStatus$bindView$1 */
final class CommonSettingItemStatus$bindView$1<T> implements AbstractC2565m {
    final /* synthetic */ View $view;

    static {
        Covode.recordClassIndex(84564);
    }

    CommonSettingItemStatus$bindView$1(View view) {
        this.$view = view;
    }

    public final void onChanged(Boolean bool) {
        C89219l.m154716b(bool, "");
        ((CommonItemView) this.$view).setChecked(bool.booleanValue());
    }
}
