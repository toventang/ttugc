package com.p2082ss.android.ugc.aweme.editSticker.p2877a;

import android.view.View;
import android.widget.PopupWindow;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.editSticker.C45866d;

/* renamed from: com.ss.android.ugc.aweme.editSticker.a.c */
public abstract class AbstractC45827c extends PopupWindow implements AbstractC45834h {
    static {
        Covode.recordClassIndex(54350);
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.p2877a.AbstractC45834h
    public void dismiss() {
        super.dismiss();
    }

    public void showAtLocation(View view, int i, int i2, int i3) {
        try {
            super.showAtLocation(view, i, i2, i3);
        } catch (Exception e) {
            C45866d.m88491d().mo77252a(e);
        }
    }
}
