package com.bytedance.android.livesdk.hashtag;

import android.view.View;
import androidx.fragment.app.AbstractC0952i;
import com.bytedance.android.live.p385p.AbstractView$OnClickListenerC5841f;
import com.bytedance.android.live.p385p.EnumC5847l;
import com.bytedance.android.livesdk.hashtag.C8937f;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p425aa.C6519c;
import com.bytedance.android.livesdk.p450an.C6800c;
import com.bytedance.android.livesdk.p452ao.AbstractC6804a;
import com.bytedance.android.livesdk.p452ao.C6805b;
import com.bytedance.android.livesdk.p452ao.C6806c;
import com.bytedance.android.livesdk.p561j.C9021ao;
import com.bytedance.android.livesdk.p561j.C9091dc;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.hashtag.m */
public final class C8971m implements AbstractView$OnClickListenerC5841f {

    /* renamed from: a */
    private DataChannel f22081a;

    static {
        Covode.recordClassIndex(9863);
    }

    @Override // com.bytedance.android.live.p385p.AbstractView$OnClickListenerC5841f
    /* renamed from: a */
    public final void mo8492a(boolean z) {
    }

    @Override // com.bytedance.android.live.p385p.AbstractView$OnClickListenerC5841f
    /* renamed from: b */
    public final void mo8493b(View view, DataChannel dataChannel) {
    }

    public final void onClick(View view) {
        DataChannel dataChannel = this.f22081a;
        if (dataChannel == null) {
            C89219l.m154710a("dataChannel");
        }
        AbstractC0952i iVar = (AbstractC0952i) dataChannel.mo28318b(C9021ao.class);
        if (iVar != null) {
            C8937f.C8938a.m17286a(iVar, "Broadcast", null);
        }
        C6805b<Boolean> bVar = AbstractC6804a.f17048cv;
        C89219l.m154716b(bVar, "");
        C6806c.m14603a((C6800c) bVar, (Object) false);
        DataChannel dataChannel2 = this.f22081a;
        if (dataChannel2 == null) {
            C89219l.m154710a("dataChannel");
        }
        dataChannel2.mo28319c(C9091dc.class);
        C6501b a = C6501b.C6502a.m13948a("livesdk_anchor_more_topic_click");
        DataChannel dataChannel3 = this.f22081a;
        if (dataChannel3 == null) {
            C89219l.m154710a("dataChannel");
        }
        C6501b a2 = a.mo12643a(dataChannel3);
        DataChannel dataChannel4 = this.f22081a;
        if (dataChannel4 == null) {
            C89219l.m154710a("dataChannel");
        }
        C6519c.m13965a(a2, dataChannel4).mo12651a("event_belong", "live_take").mo12655b();
    }

    @Override // com.bytedance.android.live.p385p.AbstractView$OnClickListenerC5841f
    /* renamed from: a */
    public final void mo8491a(View view, DataChannel dataChannel) {
        C89219l.m154721d(dataChannel, "");
        this.f22081a = dataChannel;
        EnumC5847l lVar = EnumC5847l.TOPICS;
        C6805b<Boolean> bVar = AbstractC6804a.f17048cv;
        C89219l.m154716b(bVar, "");
        Boolean a = bVar.mo13066a();
        C89219l.m154716b(a, "");
        lVar.setRedDotVisible(dataChannel, a.booleanValue());
    }
}
