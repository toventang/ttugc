package com.p2082ss.android.ugc.aweme.base.p2379ui;

import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.loader.SmartCircleImageView;
import com.facebook.drawee.p1854e.C24229q;
import com.facebook.drawee.p1855f.C24246a;
import com.p2082ss.android.ugc.aweme.lancet.C58030k;

/* renamed from: com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView */
public class SmartAvatarImageView extends SmartCircleImageView {
    static {
        Covode.recordClassIndex(41645);
    }

    @Override // com.facebook.drawee.view.C24262c
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C58030k.m104850a(this);
    }

    @Override // com.bytedance.lighten.loader.SmartImageView, com.bytedance.lighten.loader.SmartCircleImageView
    /* renamed from: a */
    public final void mo34192a() {
        super.mo34192a();
        ((C24246a) getHierarchy()).mo39954a(2131232314, C24229q.AbstractC24231b.f57458h);
    }

    public SmartAvatarImageView(Context context) {
        super(context);
    }

    public SmartAvatarImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
