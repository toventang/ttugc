package com.p2082ss.android.ugc.aweme.shortvideo.widget;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.widget.ChooseVideoCoverView;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.C89378p;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.d */
public final /* synthetic */ class C74279d implements AbstractC88433f {

    /* renamed from: a */
    private final ChooseVideoCoverView.C74231a f167028a;

    static {
        Covode.recordClassIndex(87051);
    }

    C74279d(ChooseVideoCoverView.C74231a aVar) {
        this.f167028a = aVar;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        ChooseVideoCoverView.C74231a aVar = this.f167028a;
        C89378p pVar = (C89378p) obj;
        Integer num = (Integer) pVar.getFirst();
        aVar.f166756b[num.intValue()] = pVar;
        if (aVar.f166757c) {
            aVar.f166757c = false;
            aVar.notifyDataSetChanged();
            return;
        }
        aVar.notifyItemChanged(num.intValue());
    }
}
