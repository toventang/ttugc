package com.bytedance.android.livesdk.chatroom.p499ui;

import com.bytedance.android.live.core.p218f.C3941k;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.livesetting.gift.LivePrefetchGiftImageSetting;
import com.bytedance.android.livesdk.model.C9904t;
import com.bytedance.covode.number.Covode;
import java.util.List;
import p4560f.p4561a.AbstractC88982v;
import p4560f.p4561a.AbstractC88983w;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.cv */
final /* synthetic */ class C7873cv implements AbstractC88983w {

    /* renamed from: a */
    private final List f19596a;

    static {
        Covode.recordClassIndex(8668);
    }

    C7873cv(List list) {
        this.f19596a = list;
    }

    @Override // p4560f.p4561a.AbstractC88983w
    public final void subscribe(AbstractC88982v vVar) {
        List<GiftPage> list = this.f19596a;
        if (LivePrefetchGiftImageSetting.INSTANCE.getValue() && list != null && list.size() > 0) {
            for (GiftPage giftPage : list) {
                List<C9904t> list2 = giftPage.gifts;
                if (list2 != null && list2.size() > 0) {
                    for (C9904t tVar : list2) {
                        if (tVar.f23997b != null) {
                            C3941k.m9598a(tVar.f23997b);
                        }
                    }
                }
            }
        }
    }
}
