package com.bytedance.android.livesdk.share;

import android.os.Bundle;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.android.live.p405s.AbstractC6103e;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.share.AbstractC6107a;
import com.bytedance.android.live.share.AbstractC6109c;
import com.bytedance.android.livesdk.p561j.C9065cd;
import com.bytedance.android.livesdk.util.rxutils.C11195i;
import com.bytedance.android.livesdk.utils.C11199a;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.android.livesdkapi.depend.p683e.AbstractC11665b;
import com.bytedance.android.livesdkapi.depend.p683e.C11666c;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.bytedance.android.livesdk.share.a */
final /* synthetic */ class C10763a implements AbstractC89172b {

    /* renamed from: a */
    private final LiveShareWidget f25924a;

    static {
        Covode.recordClassIndex(12363);
    }

    C10763a(LiveShareWidget liveShareWidget) {
        this.f25924a = liveShareWidget;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final Object invoke(Object obj) {
        LiveShareWidget liveShareWidget = this.f25924a;
        String str = (String) liveShareWidget.dataChannel.mo28318b(C9065cd.class);
        AbstractC6107a share = ((AbstractC6109c) C6193a.m13435a(AbstractC6109c.class)).share();
        ActivityC0945e a = C11279p.m20001a(liveShareWidget.context);
        C11666c.C11667a a2 = C11666c.m20576a(liveShareWidget.f25920b);
        a2.f27867n = liveShareWidget.f25919a ? liveShareWidget.f25920b.getAnchorShareText() : liveShareWidget.f25920b.getUserShareText();
        a2.f27870q = liveShareWidget.f25919a;
        a2.f27850N = ((AbstractC6103e) C6193a.m13435a(AbstractC6103e.class)).getReportScene();
        a2.f27874u = str;
        share.mo11989a(a, a2.mo18437a(), new AbstractC11665b() {
            /* class com.bytedance.android.livesdk.share.LiveShareWidget.C107621 */

            static {
                Covode.recordClassIndex(12362);
            }

            @Override // com.bytedance.android.livesdkapi.depend.p683e.AbstractC11665b
            /* renamed from: a */
            public final void mo8904a(Throwable th) {
            }

            @Override // com.bytedance.android.livesdkapi.depend.p683e.AbstractC11665b
            /* renamed from: a */
            public final void mo8903a(String str, String str2, Bundle bundle) {
                String str3 = "";
                if (bundle != null) {
                    str3 = bundle.getString("shareIdList", str3);
                }
                LiveShareWidget liveShareWidget = LiveShareWidget.this;
                ((AbstractC6109c) C6193a.m13435a(AbstractC6109c.class)).sendShare(liveShareWidget.f25920b.getId(), str2, 1, LiveShareWidget.this.f25920b.getLabels(), str3).mo143254a(new C10764b(liveShareWidget), C11195i.f26823a);
                if (C11199a.m19850a(LiveShareWidget.this.dataChannel) && LiveShareWidget.this.f25920b.author() != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("anchor_id", String.valueOf(LiveShareWidget.this.f25920b.author().getId()));
                    hashMap.put("room_id", String.valueOf(LiveShareWidget.this.f25920b.getId()));
                    C11199a.m19849a("live_ad", "live_share", null, hashMap);
                }
            }
        });
        return C89391z.f203057a;
    }
}
