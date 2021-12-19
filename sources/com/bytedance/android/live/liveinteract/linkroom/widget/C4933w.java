package com.bytedance.android.live.liveinteract.linkroom.widget;

import androidx.fragment.app.ActivityC0945e;
import com.bytedance.android.live.liveinteract.cohost.p263a.p267d.C4588x;
import com.bytedance.android.live.liveinteract.cohost.p279ui.p281b.C4645c;
import com.bytedance.android.live.liveinteract.match.p295b.p296a.C4942a;
import com.bytedance.android.live.liveinteract.match.p295b.p297b.C4947a;
import com.bytedance.covode.number.Covode;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.linkroom.widget.w */
final /* synthetic */ class C4933w implements AbstractC89172b {

    /* renamed from: a */
    private final LinkControlWidget f12892a;

    static {
        Covode.recordClassIndex(5516);
    }

    C4933w(LinkControlWidget linkControlWidget) {
        this.f12892a = linkControlWidget;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final Object invoke(Object obj) {
        long b;
        LinkControlWidget linkControlWidget = this.f12892a;
        Integer num = (Integer) obj;
        if (num.intValue() == 1) {
            b = C4947a.f12910b.mo10677b();
        } else {
            b = C4947a.f12909a.mo10677b();
        }
        int intValue = num.intValue();
        C89219l.m154721d(linkControlWidget, "");
        C4645c cVar = new C4645c(linkControlWidget);
        C4588x.EnumC4589a aVar = C4588x.EnumC4589a.TYPE_PK_BE_INVITED;
        C4942a.C4943a aVar2 = new C4942a.C4943a((byte) 0);
        aVar2.f12906a = intValue;
        aVar2.f12907b = b;
        linkControlWidget.f12834h = cVar.mo10394b(aVar, aVar2);
        linkControlWidget.f12834h.show(((ActivityC0945e) linkControlWidget.context).getSupportFragmentManager(), "LinkDialog");
        return C89391z.f203057a;
    }
}
