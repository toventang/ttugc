package com.p2082ss.android.ugc.aweme.shortvideo.model;

import android.view.View;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.common.views.CommonItemView;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.model.CommonSettingItemStatus */
public class CommonSettingItemStatus extends CommonViewStatus {
    public final C1213t<Boolean> _checked = new C1213t<>();
    public final C1213t<String> _leftText = new C1213t<>();

    static {
        Covode.recordClassIndex(84563);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.model.CommonViewStatus
    public void bindView(View view, AbstractC1204m mVar) {
        C89219l.m154721d(view, "");
        C89219l.m154721d(mVar, "");
        super.bindView(view, mVar);
        if (view instanceof CommonItemView) {
            this._checked.observe(mVar, new CommonSettingItemStatus$bindView$1(view));
            this._leftText.observe(mVar, new CommonSettingItemStatus$bindView$2(view));
        }
    }
}
