package com.p2082ss.android.ugc.aweme.multi.p3462ui;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import org.greenrobot.eventbus.EventBus;

/* renamed from: com.ss.android.ugc.aweme.multi.ui.ShopWindowView$Adapter$whenShopLinkAnchorClicked$1 */
public final class ShopWindowView$Adapter$whenShopLinkAnchorClicked$1 implements AbstractC33974au {
    static {
        Covode.recordClassIndex(70834);
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onDestroy();
        }
    }

    ShopWindowView$Adapter$whenShopLinkAnchorClicked$1() {
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public final void onDestroy() {
        EventBus.m156962a().mo145395b(this);
    }
}
