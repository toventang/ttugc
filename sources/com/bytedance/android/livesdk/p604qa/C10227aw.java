package com.bytedance.android.livesdk.p604qa;

import android.content.Context;
import android.view.View;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.design.view.AbstractC4085c;
import com.bytedance.android.live.design.view.C4081a;
import com.bytedance.android.live.design.view.C4097j;
import com.bytedance.android.live.p378m.C5762c;
import com.bytedance.android.live.p385p.AbstractView$OnClickListenerC5841f;
import com.bytedance.android.live.p385p.EnumC5847l;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p450an.C6800c;
import com.bytedance.android.livesdk.p452ao.AbstractC6804a;
import com.bytedance.android.livesdk.p452ao.C6805b;
import com.bytedance.android.livesdk.p452ao.C6806c;
import com.bytedance.android.livesdk.p561j.C9119ed;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.qa.aw */
public final class C10227aw implements AbstractView$OnClickListenerC5841f {

    /* renamed from: a */
    private View f24757a;

    /* renamed from: b */
    private DataChannel f24758b;

    /* renamed from: c */
    private boolean f24759c;

    /* renamed from: d */
    private final Context f24760d;

    static {
        Covode.recordClassIndex(11793);
    }

    /* renamed from: com.bytedance.android.livesdk.qa.aw$a */
    static final class C10228a implements AbstractC4085c {

        /* renamed from: a */
        final /* synthetic */ C10227aw f24761a;

        static {
            Covode.recordClassIndex(11794);
        }

        C10228a(C10227aw awVar) {
            this.f24761a = awVar;
        }

        @Override // com.bytedance.android.live.design.view.AbstractC4085c
        /* renamed from: a */
        public final void mo9539a() {
            C6501b.C6502a.m13948a("livesdk_qa_guide_show").mo12639a().mo12656c("show").mo12655b();
        }
    }

    public C10227aw(Context context) {
        C89219l.m154721d(context, "");
        this.f24760d = context;
    }

    @Override // com.bytedance.android.live.p385p.AbstractView$OnClickListenerC5841f
    /* renamed from: a */
    public final void mo8492a(boolean z) {
        if (z && this.f24759c) {
            C6501b.C6502a.m13948a("livesdk_anchor_qa_red_dot_show").mo12639a().mo12655b();
        }
    }

    public final void onClick(View view) {
        C89219l.m154721d(view, "");
        DataChannel dataChannel = this.f24758b;
        if (dataChannel == null) {
            C89219l.m154710a("mDataChannel");
        }
        C10175aa.m18671a(dataChannel, "qa_entrance");
        if (this.f24759c) {
            EnumC5847l lVar = EnumC5847l.QUESTION;
            DataChannel dataChannel2 = this.f24758b;
            if (dataChannel2 == null) {
                C89219l.m154710a("mDataChannel");
            }
            C6501b.C6502a.m13948a("livesdk_anchor_qa_entrance_click").mo12645a("has_red_dot", lVar.isRedDotShowing(dataChannel2) ? 1 : 0).mo12639a().mo12655b();
            return;
        }
        C6501b.C6502a.m13948a("livesdk_qa_entrance_click").mo12639a().mo12655b();
    }

    @Override // com.bytedance.android.live.p385p.AbstractView$OnClickListenerC5841f
    /* renamed from: b */
    public final void mo8493b(View view, DataChannel dataChannel) {
        C89219l.m154721d(dataChannel, "");
        C10226av.f24755c = null;
    }

    @Override // com.bytedance.android.live.p385p.AbstractView$OnClickListenerC5841f
    /* renamed from: a */
    public final void mo8491a(View view, DataChannel dataChannel) {
        C89219l.m154721d(view, "");
        C89219l.m154721d(dataChannel, "");
        this.f24758b = dataChannel;
        Object b = dataChannel.mo28318b(C9119ed.class);
        if (b == null) {
            C89219l.m154715b();
        }
        boolean booleanValue = ((Boolean) b).booleanValue();
        this.f24759c = booleanValue;
        this.f24757a = view;
        if (booleanValue) {
            EnumC5847l lVar = EnumC5847l.QUESTION;
            DataChannel dataChannel2 = this.f24758b;
            if (dataChannel2 == null) {
                C89219l.m154710a("mDataChannel");
            }
            C6501b.C6502a.m13948a("livesdk_anchor_qa_entrance_show").mo12645a("has_red_dot", lVar.isRedDotShowing(dataChannel2) ? 1 : 0).mo12639a().mo12655b();
            return;
        }
        C6805b<Boolean> bVar = AbstractC6804a.f16916aR;
        C89219l.m154716b(bVar, "");
        Boolean a = bVar.mo13066a();
        C89219l.m154716b(a, "");
        if (a.booleanValue()) {
            C6805b<Boolean> bVar2 = AbstractC6804a.f16916aR;
            C89219l.m154716b(bVar2, "");
            C6806c.m14603a((C6800c) bVar2, (Object) false);
            View view2 = this.f24757a;
            if (view2 == null) {
                C89219l.m154710a("mView");
            }
            C4081a.C4082a aVar = new C4081a.C4082a(view2);
            aVar.f11288a = C3966y.m9657a((int) R.string.dv1);
            C4097j.m9924a(((C4081a.C4082a) aVar.mo9556a(new C10228a(this))).mo9530b());
        }
        if (!C5762c.m12633b(dataChannel)) {
            EnumC5847l.QUESTION.unload(dataChannel);
        } else if (!this.f24759c) {
            C6501b.C6502a.m13948a("livesdk_qa_entrance_show").mo12639a().mo12655b();
        }
    }
}
