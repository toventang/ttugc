package com.bytedance.android.live.publicscreen.impl.widget.p402b;

import android.view.View;
import android.widget.TextView;
import com.bytedance.android.live.publicscreen.impl.model.C6030p;
import com.bytedance.android.live.publicscreen.p386a.C5889g;
import com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5873h;
import com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5877k;
import com.bytedance.android.live.publicscreen.p386a.p392f.AbstractC5888b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.publicscreen.impl.widget.b.f */
public final class C6070f extends AbstractC5888b<C6030p> {

    /* renamed from: a */
    private final TextView f15204a;

    /* renamed from: d */
    private final TextView f15205d;

    static {
        Covode.recordClassIndex(6687);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6070f(View view) {
        super(view);
        C89219l.m154721d(view, "");
        this.f15204a = (TextView) view.findViewById(R.id.dxo);
        this.f15205d = (TextView) view.findViewById(R.id.dx5);
    }

    /* renamed from: com.bytedance.android.live.publicscreen.impl.widget.b.f$a */
    static final class View$OnClickListenerC6071a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C6070f f15206a;

        /* renamed from: b */
        final /* synthetic */ C5889g f15207b;

        static {
            Covode.recordClassIndex(6688);
        }

        View$OnClickListenerC6071a(C6070f fVar, C5889g gVar) {
            this.f15206a = fVar;
            this.f15207b = gVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
            r5 = (com.bytedance.android.livesdkapi.depend.model.live.Room) r6.mo28318b(com.bytedance.android.livesdk.p561j.C9093de.class);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r8) {
            /*
                r7 = this;
                com.bytedance.android.live.publicscreen.a.g r0 = r7.f15207b
                com.bytedance.ies.sdk.datachannel.DataChannel r6 = r0.f14755l
                if (r6 != 0) goto L_0x0007
                return
            L_0x0007:
                java.lang.Class<com.bytedance.android.livesdk.j.de> r0 = com.bytedance.android.livesdk.p561j.C9093de.class
                java.lang.Object r5 = r6.mo28318b(r0)
                com.bytedance.android.livesdkapi.depend.model.live.Room r5 = (com.bytedance.android.livesdkapi.depend.model.live.Room) r5
                if (r5 != 0) goto L_0x0012
                return
            L_0x0012:
                com.bytedance.android.livesdkapi.depend.e.c$a r0 = com.bytedance.android.livesdkapi.depend.p683e.C11666c.m20576a(r5)
                com.bytedance.android.livesdkapi.depend.e.c r4 = r0.mo18437a()
                java.lang.Class<com.bytedance.android.live.share.c> r0 = com.bytedance.android.live.share.AbstractC6109c.class
                com.bytedance.android.live.base.a r0 = com.bytedance.android.live.p407t.C6193a.m13435a(r0)
                com.bytedance.android.live.share.c r0 = (com.bytedance.android.live.share.AbstractC6109c) r0
                com.bytedance.android.live.share.a r2 = r0.share()
                com.bytedance.android.live.publicscreen.impl.widget.b.f r0 = r7.f15206a
                android.view.View r0 = r0.itemView
                java.lang.String r3 = ""
                p4600h.p4611f.p4613b.C89219l.m154716b(r0, r3)
                android.content.Context r0 = r0.getContext()
                androidx.fragment.app.e r1 = com.bytedance.android.livesdk.utils.C11279p.m20001a(r0)
                com.bytedance.android.live.publicscreen.impl.widget.b.f$a$1 r0 = new com.bytedance.android.live.publicscreen.impl.widget.b.f$a$1
                r0.<init>(r7, r5, r6)
                r2.mo11989a(r1, r4, r0)
                java.lang.String r0 = "livesdk_share_capsule_click"
                com.bytedance.android.livesdk.aa.b r0 = com.bytedance.android.livesdk.p425aa.C6501b.C6502a.m13948a(r0)
                com.bytedance.android.livesdk.aa.b r2 = r0.mo12643a(r6)
                java.lang.Class<com.bytedance.android.live.liveinteract.api.b> r0 = com.bytedance.android.live.liveinteract.api.AbstractC4409b.class
                com.bytedance.android.live.base.a r0 = com.bytedance.android.live.p407t.C6193a.m13435a(r0)
                p4600h.p4611f.p4613b.C89219l.m154716b(r0, r3)
                com.bytedance.android.live.liveinteract.api.b r0 = (com.bytedance.android.live.liveinteract.api.AbstractC4409b) r0
                java.lang.String r1 = r0.getRoomScene()
                java.lang.String r0 = "share_capsule_scence"
                com.bytedance.android.livesdk.aa.b r0 = r2.mo12651a(r0, r1)
                r0.mo12655b()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.publicscreen.impl.widget.p402b.C6070f.View$OnClickListenerC6071a.onClick(android.view.View):void");
        }
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.p392f.AbstractC5887a
    /* renamed from: a */
    public final /* synthetic */ void mo10370a(C5889g gVar, AbstractC5873h hVar) {
        AbstractC5877k kVar = (AbstractC5877k) hVar;
        C89219l.m154721d(gVar, "");
        C89219l.m154721d(kVar, "");
        TextView textView = this.f15204a;
        if (textView != null && this.f15205d != null) {
            textView.setText(kVar.mo11710z());
            this.f15205d.setOnClickListener(new View$OnClickListenerC6071a(this, gVar));
        }
    }
}
