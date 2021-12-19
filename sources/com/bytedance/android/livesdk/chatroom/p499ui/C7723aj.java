package com.bytedance.android.livesdk.chatroom.p499ui;

import com.bytedance.android.live.core.p218f.C3941k;
import com.bytedance.android.livesdk.chatroom.p499ui.AbstractC7703a;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.model.C9904t;
import com.bytedance.covode.number.Covode;
import java.util.List;
import p4560f.p4561a.AbstractC88982v;
import p4560f.p4561a.AbstractC88983w;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.aj */
final /* synthetic */ class C7723aj implements AbstractC88983w {

    /* renamed from: a */
    private final AbstractC7703a.C77096 f19187a;

    /* renamed from: b */
    private final List f19188b;

    static {
        Covode.recordClassIndex(8518);
    }

    C7723aj(AbstractC7703a.C77096 r1, List list) {
        this.f19187a = r1;
        this.f19188b = list;
    }

    @Override // p4560f.p4561a.AbstractC88983w
    public final void subscribe(AbstractC88982v vVar) {
        AbstractC7703a.C77096 r3 = this.f19187a;
        List<GiftPage> list = this.f19188b;
        if (list != null && list.size() > 0) {
            for (GiftPage giftPage : list) {
                List<C9904t> list2 = giftPage.gifts;
                if (list2 != null && list2.size() > 0) {
                    for (C9904t tVar : list2) {
                        if (tVar.f23997b != null) {
                            C3941k.m9598a(tVar.f23997b);
                        }
                    }
                    if (AbstractC7703a.this.getView() != null) {
                        AbstractC7703a.this.getView().post(new RunnableC7724ak(r3));
                    }
                }
            }
        }
    }
}
