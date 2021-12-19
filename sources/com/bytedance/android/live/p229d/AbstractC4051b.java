package com.bytedance.android.live.p229d;

import android.content.Context;
import com.bytedance.android.live.base.AbstractC2953a;
import com.bytedance.covode.number.Covode;
import p4600h.C89378p;

/* renamed from: com.bytedance.android.live.d.b */
public interface AbstractC4051b extends AbstractC2953a {
    static {
        Covode.recordClassIndex(4592);
    }

    C89378p<String, String> getNextLowerLevelDefinition();

    boolean isAudienceLowestDefinition();

    void reportAnchorDefinitionBtnShow();

    void reportAudienceDefinitionBtnShow(String str, String str2, String str3);

    void reportAudienceDefinitionDialogSelectSuccess(String str, String str2, String str3, String str4, String str5, String str6, String str7);

    void reportAudienceDefinitionTipsShow(String str, String str2, String str3);

    void reportAudienceRotateBtnClick(String str, long j, String str2);

    void reportAudienceRotateBtnShow(String str);

    void showDefinitionSelectionDialog(Context context, boolean z);
}
