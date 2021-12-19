package com.bytedance.android.livesdk.widget;

import android.graphics.Bitmap;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.livesdk.chatroom.model.C7674c;
import com.bytedance.android.livesdk.chatroom.p492g.C7577g;
import com.bytedance.common.utility.C13617h;
import com.bytedance.covode.number.Covode;
import java.util.List;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;

/* renamed from: com.bytedance.android.livesdk.widget.b */
final /* synthetic */ class C11378b implements AbstractC88433f {

    /* renamed from: a */
    private final BarrageWidget f27339a;

    static {
        Covode.recordClassIndex(13034);
    }

    C11378b(BarrageWidget barrageWidget) {
        this.f27339a = barrageWidget;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        BarrageWidget barrageWidget = this.f27339a;
        C5832d dVar = (C5832d) obj;
        if (C13617h.m24465a(((C7674c) dVar.data).f19016a)) {
            barrageWidget.f27161g = false;
            return;
        }
        barrageWidget.f27161g = true;
        for (C7674c.C7675a aVar : ((C7674c) dVar.data).f19016a) {
            AbstractC88979t<R> a = C7577g.m15569a(aVar.f19018b).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143271a(barrageWidget.getAutoUnbindTransformer());
            List<Bitmap> list = barrageWidget.f27155a;
            list.getClass();
            a.mo143254a(new C11422d(list), new C11423e(barrageWidget));
        }
    }
}
