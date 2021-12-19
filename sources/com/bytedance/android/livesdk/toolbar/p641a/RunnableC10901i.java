package com.bytedance.android.livesdk.toolbar.p641a;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.C1764a;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.design.widget.rtl.LiveAutoRtlTextView;
import com.bytedance.android.live.gift.C4332h;
import com.bytedance.android.livesdk.gift.model.C8843h;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p561j.C9009ac;
import com.bytedance.android.livesdk.p561j.C9093de;
import com.bytedance.android.livesdk.service.assets.GiftManager;
import com.bytedance.android.livesdk.toolbar.C10892a;
import com.bytedance.android.livesdk.toolbar.C10905d;
import com.bytedance.android.livesdk.toolbar.C10908e;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.facebook.drawee.p1855f.C24246a;
import com.p2082ss.android.ugc.trill.R;
import java.util.concurrent.TimeUnit;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.toolbar.a.i */
final /* synthetic */ class RunnableC10901i implements Runnable {

    /* renamed from: a */
    private final C10898f f26198a;

    /* renamed from: b */
    private final View f26199b;

    /* renamed from: c */
    private final DataChannel f26200c;

    static {
        Covode.recordClassIndex(12509);
    }

    RunnableC10901i(C10898f fVar, View view, DataChannel dataChannel) {
        this.f26198a = fVar;
        this.f26199b = view;
        this.f26200c = dataChannel;
    }

    public final void run() {
        C8843h giftIconInfo;
        Room room;
        C24246a aVar;
        MethodCollector.m26663i(5928);
        C10898f fVar = this.f26198a;
        View view = this.f26199b;
        DataChannel dataChannel = this.f26200c;
        if (fVar.f26193d != null && fVar.f26193d.booleanValue()) {
            C10892a.m19505a(view);
        }
        fVar.f26190a = new C10908e(view.getContext(), dataChannel);
        C10908e eVar = fVar.f26190a;
        C1764a.m5927a(LayoutInflater.from(eVar.getContext()), eVar.f26216i ? R.layout.b96 : R.layout.b95, eVar, true);
        eVar.setClipChildren(false);
        if (eVar.f26216i) {
            LiveAutoRtlTextView liveAutoRtlTextView = (LiveAutoRtlTextView) eVar.findViewById(R.id.ekj);
            liveAutoRtlTextView.setText(C3966y.m9657a((int) R.string.ebg));
            eVar.f26213f = liveAutoRtlTextView;
        }
        eVar.f26210c = (HSImageView) eVar.findViewById(R.id.ba5);
        HSImageView hSImageView = eVar.f26210c;
        if (!(hSImageView == null || (aVar = (C24246a) hSImageView.getHierarchy()) == null)) {
            aVar.mo39961b(0);
        }
        eVar.f26212e = (ImageView) eVar.findViewById(R.id.ba6);
        eVar.f26209b = new C10905d(eVar.f26208a);
        C10905d dVar = eVar.f26209b;
        if (dVar != null) {
            C89219l.m154721d(eVar, "");
            dVar.f26205b = eVar;
            DataChannel dataChannel2 = dVar.f26204a;
            long id = (dataChannel2 == null || (room = (Room) dataChannel2.mo28318b(C9093de.class)) == null) ? 0 : room.getId();
            if (GiftManager.inst().getGiftIconInfo(id) == null || (giftIconInfo = GiftManager.inst().getGiftIconInfo(id)) == null || giftIconInfo.f21717c >= System.currentTimeMillis() / 1000 || giftIconInfo.f21718d <= System.currentTimeMillis() / 1000) {
                C10905d.AbstractC10906a aVar2 = dVar.f26205b;
                if (aVar2 != null) {
                    aVar2.mo17772a(null);
                }
            } else {
                C10905d.AbstractC10906a aVar3 = dVar.f26205b;
                if (aVar3 != null) {
                    aVar3.mo17772a(GiftManager.inst().getGiftIconInfo(id));
                }
            }
        }
        Room room2 = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
        if (room2 == null || !room2.hasCommerceGoods) {
            eVar.f26211d.mo142945a(AbstractC88979t.m154307b(5, TimeUnit.SECONDS).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143289d(new C10908e.C10909a(eVar)));
        }
        FrameLayout frameLayout = (FrameLayout) view;
        frameLayout.addView(fVar.f26190a);
        frameLayout.setClipChildren(false);
        fVar.f26192c.mo142945a(C6779a.m14563a().mo13052a(C4332h.class).mo143289d(fVar.f26195f));
        MethodCollector.m26664o(5928);
    }
}
