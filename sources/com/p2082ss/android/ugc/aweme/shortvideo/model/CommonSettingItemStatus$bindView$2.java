package com.p2082ss.android.ugc.aweme.shortvideo.model;

import android.view.View;
import com.bytedance.als.AbstractC2565m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.common.views.CommonItemView;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.model.CommonSettingItemStatus$bindView$2 */
final class CommonSettingItemStatus$bindView$2<T> implements AbstractC2565m {
    final /* synthetic */ View $view;

    static {
        Covode.recordClassIndex(84565);
    }

    CommonSettingItemStatus$bindView$2(View view) {
        this.$view = view;
    }

    public final void onChanged(String str) {
        ((CommonItemView) this.$view).setLeftText(str);
    }
}
