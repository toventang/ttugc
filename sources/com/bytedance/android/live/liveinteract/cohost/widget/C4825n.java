package com.bytedance.android.live.liveinteract.cohost.widget;

import android.view.View;
import android.widget.ImageView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.platform.common.view.C5753b;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.live.liveinteract.cohost.widget.n */
final /* synthetic */ class C4825n implements C5753b.AbstractC5756b {

    /* renamed from: a */
    static final C5753b.AbstractC5756b f12676a = new C4825n();

    static {
        Covode.recordClassIndex(5407);
    }

    private C4825n() {
    }

    @Override // com.bytedance.android.live.liveinteract.platform.common.view.C5753b.AbstractC5756b
    /* renamed from: a */
    public final void mo10550a(View view, Object obj) {
        ((ImageView) view).setVisibility(((User) obj).isFollowing() ? 8 : 0);
    }
}
