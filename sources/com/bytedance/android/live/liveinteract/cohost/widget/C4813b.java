package com.bytedance.android.live.liveinteract.cohost.widget;

import com.bytedance.android.livesdkapi.depend.model.p686b.C11688a;
import com.bytedance.android.livesdkapi.depend.p678b.C11625a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.live.liveinteract.cohost.widget.b */
final /* synthetic */ class C4813b implements AbstractC88433f {

    /* renamed from: a */
    private final LinkCrossRoomWidget f12664a;

    static {
        Covode.recordClassIndex(5395);
    }

    C4813b(LinkCrossRoomWidget linkCrossRoomWidget) {
        this.f12664a = linkCrossRoomWidget;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        LinkCrossRoomWidget linkCrossRoomWidget = this.f12664a;
        C11688a aVar = ((C11625a) obj).f27775a;
        if (aVar != null && linkCrossRoomWidget.isViewValid()) {
            linkCrossRoomWidget.findViewById(R.id.bvz).setVisibility(aVar.mo18452b() ? 8 : 0);
            linkCrossRoomWidget.f12643g.mo10314c();
        }
    }
}
