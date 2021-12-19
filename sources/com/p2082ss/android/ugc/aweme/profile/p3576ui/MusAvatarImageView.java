package com.p2082ss.android.ugc.aweme.profile.p3576ui;

import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.covode.number.Covode;
import com.facebook.drawee.p1855f.C24246a;
import com.p2082ss.android.ugc.aweme.base.p2379ui.CircleImageView;
import com.p2082ss.android.ugc.aweme.lancet.C58030k;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.MusAvatarImageView */
public class MusAvatarImageView extends CircleImageView {
    static {
        Covode.recordClassIndex(75378);
    }

    @Override // com.facebook.drawee.view.C24262c
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C58030k.m104850a(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.CircleImageView, com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView, com.p2082ss.android.ugc.aweme.base.p2379ui.AnimatedImageView
    /* renamed from: a */
    public final void mo61253a() {
        super.mo61253a();
        ((C24246a) getHierarchy()).mo39966c(R.color.l);
    }

    public MusAvatarImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
