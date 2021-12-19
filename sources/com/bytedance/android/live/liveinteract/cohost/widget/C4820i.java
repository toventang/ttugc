package com.bytedance.android.live.liveinteract.cohost.widget;

import android.text.TextUtils;
import com.bytedance.android.live.liveinteract.api.p261b.C4413d;
import com.bytedance.android.live.liveinteract.match.p295b.p297b.C4947a;
import com.bytedance.android.live.liveinteract.match.p295b.p297b.C4948b;
import com.bytedance.android.live.liveinteract.match.p295b.p297b.EnumC4949c;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.cohost.widget.i */
final /* synthetic */ class C4820i implements AbstractC88433f {

    /* renamed from: a */
    private final LinkCrossRoomWidget f12671a;

    static {
        Covode.recordClassIndex(5402);
    }

    C4820i(LinkCrossRoomWidget linkCrossRoomWidget) {
        this.f12671a = linkCrossRoomWidget;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        LinkCrossRoomWidget linkCrossRoomWidget = this.f12671a;
        if (TextUtils.equals(C4413d.f12000c, ((C4413d) obj).f12004a) && linkCrossRoomWidget.f12641e) {
            C4948b bVar = C4947a.f12909a;
            EnumC4949c cVar = EnumC4949c.START;
            EnumC4949c cVar2 = EnumC4949c.END;
            C89219l.m154721d(cVar, "");
            C89219l.m154721d(cVar2, "");
            EnumC4949c a = bVar.mo10672a();
            if ((a.compareTo((Object) cVar) < 0 || a.compareTo((Object) cVar2) > 0) && linkCrossRoomWidget.f12647k != null) {
                linkCrossRoomWidget.f12647k.mo10733a();
            }
        }
    }
}
