package com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.setting.SettingItem;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.widgets.NewSettingItem */
public final class NewSettingItem extends SettingItem {
    static {
        Covode.recordClassIndex(67947);
    }

    public NewSettingItem(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* renamed from: a */
    public final void mo95242a() {
        if (this.f41416b != null) {
            ImageView imageView = this.f41416b;
            C89219l.m154716b(imageView, "");
            imageView.setVisibility(8);
        }
    }

    private /* synthetic */ NewSettingItem(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private NewSettingItem(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
    }
}
