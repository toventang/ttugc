package com.bytedance.android.live.liveinteract.match.p307e.p310c;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.base.AbstractC2953a;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.core.widget.C4031a;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.liveinteract.api.AbstractC4409b;
import com.bytedance.android.live.liveinteract.api.EnumC4440k;
import com.bytedance.android.live.liveinteract.api.p260a.C4384b;
import com.bytedance.android.live.liveinteract.match.p305d.p306a.C5011a;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5703b;
import com.bytedance.android.live.p176b.AbstractC2928f;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.publicscreen.p386a.C5889g;
import com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5873h;
import com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5877k;
import com.bytedance.android.live.publicscreen.p386a.p392f.AbstractC5888b;
import com.bytedance.android.livesdk.browser.p462c.AbstractC6956d;
import com.bytedance.android.livesdk.browser.p462c.AbstractC6963e;
import com.bytedance.android.livesdk.model.message.C9615ao;
import com.bytedance.android.livesdk.model.message.p578b.C9637c;
import com.bytedance.android.livesdk.model.message.p578b.C9639e;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p450an.C6800c;
import com.bytedance.android.livesdk.p452ao.AbstractC6804a;
import com.bytedance.android.livesdk.p452ao.C6805b;
import com.bytedance.android.livesdk.p452ao.C6806c;
import com.bytedance.android.livesdk.p561j.C9032az;
import com.bytedance.android.livesdk.p561j.C9041bg;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.android.livesdk.utils.C11227ap;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.match.e.c.a */
public final class C5016a extends AbstractC5888b<C5011a> {

    /* renamed from: a */
    private final View f13046a;

    /* renamed from: d */
    private final ImageView f13047d;

    /* renamed from: e */
    private final LiveTextView f13048e;

    /* renamed from: f */
    private final LiveTextView f13049f;

    static {
        Covode.recordClassIndex(5599);
    }

    /* renamed from: com.bytedance.android.live.liveinteract.match.e.c.a$a */
    static final class View$OnClickListenerC5017a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C5889g f13050a;

        static {
            Covode.recordClassIndex(5600);
        }

        View$OnClickListenerC5017a(C5889g gVar) {
            this.f13050a = gVar;
        }

        public final void onClick(View view) {
            if (view != null && view.getContext() != null && this.f13050a.f14755l != null) {
                if (C4384b.C4385a.m10496a().mo10151b() == EnumC4440k.CONNECTION_SUCCEED) {
                    DataChannel dataChannel = this.f13050a.f14755l;
                    if (dataChannel != null) {
                        dataChannel.mo28320c(C9041bg.class, "");
                        return;
                    }
                    return;
                }
                C11226ao.m19882a(C3966y.m9669e(), (int) R.string.e7n);
                C5703b.m12461a(C5703b.EnumC5705b.PK_GUIDE, false);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5016a(View view) {
        super(view);
        C89219l.m154721d(view, "");
        View findViewById = view.findViewById(R.id.acq);
        C89219l.m154716b(findViewById, "");
        this.f13046a = findViewById;
        View findViewById2 = view.findViewById(R.id.ac1);
        C89219l.m154716b(findViewById2, "");
        this.f13047d = (ImageView) findViewById2;
        View findViewById3 = view.findViewById(R.id.bcm);
        C89219l.m154716b(findViewById3, "");
        this.f13048e = (LiveTextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.bps);
        C89219l.m154716b(findViewById4, "");
        this.f13049f = (LiveTextView) findViewById4;
    }

    /* renamed from: com.bytedance.android.live.liveinteract.match.e.c.a$b */
    static final class View$OnClickListenerC5018b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C5889g f13051a;

        /* renamed from: b */
        final /* synthetic */ C9639e f13052b;

        static {
            Covode.recordClassIndex(5601);
        }

        View$OnClickListenerC5018b(C5889g gVar, C9639e eVar) {
            this.f13051a = gVar;
            this.f13052b = eVar;
        }

        public final void onClick(View view) {
            if (view != null && view.getContext() != null && this.f13051a.f14755l != null) {
                Context context = this.f13051a.f14747d;
                int e = (int) C3966y.m9668e(C11227ap.m19886a(context));
                AbstractC6956d webViewManager = ((AbstractC2928f) C6193a.m13435a(AbstractC2928f.class)).webViewManager();
                AbstractC6956d.C6958b a = AbstractC6963e.m14871a(this.f13052b.f23485c);
                a.f17398b = e;
                a.f17399c = 402;
                AbstractC6956d.C6958b a2 = a.mo13259a(8, 8, 0, 0);
                a2.f17406j = 80;
                C4031a.m9839a(C11279p.m20001a(context), webViewManager.mo13245a(a2));
                AbstractC2953a a3 = C6193a.m13435a(AbstractC4409b.class);
                C89219l.m154716b(a3, "");
                if (((AbstractC4409b) a3).isRoomInBattle()) {
                    C6805b<Boolean> bVar = AbstractC6804a.f17037ck;
                    C89219l.m154716b(bVar, "");
                    C6806c.m14603a((C6800c) bVar, (Object) false);
                }
            }
        }
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.p392f.AbstractC5887a
    /* renamed from: a */
    public final /* synthetic */ void mo10370a(C5889g gVar, AbstractC5873h hVar) {
        boolean z;
        float f;
        Boolean bool;
        AbstractC5877k kVar = (AbstractC5877k) hVar;
        C89219l.m154721d(gVar, "");
        C89219l.m154721d(kVar, "");
        this.f13047d.setImageResource(2131234642);
        DataChannel dataChannel = gVar.f14755l;
        if (dataChannel == null || (bool = (Boolean) dataChannel.mo28318b(C9032az.class)) == null) {
            z = false;
        } else {
            z = bool.booleanValue();
        }
        ViewGroup.LayoutParams layoutParams = this.f13046a.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.C0547a aVar = (ConstraintLayout.C0547a) layoutParams;
        if (z) {
            f = 0.99f;
        } else {
            f = 0.8f;
        }
        aVar.f2238O = f;
        this.f13046a.setLayoutParams(aVar);
        int i = ((C9615ao) kVar.f14737d).f23365a;
        if (i == 0) {
            C9637c cVar = ((C9615ao) kVar.f14737d).f23366f;
            C89219l.m154716b(cVar, "");
            this.f13048e.setText(cVar.f23480a.f23487a);
            this.f13049f.setText(cVar.f23481b.f23487a);
            this.f13046a.setOnClickListener(new View$OnClickListenerC5017a(gVar));
        } else if (i == 4) {
            C9639e eVar = ((C9615ao) kVar.f14737d).f23370j;
            C89219l.m154716b(eVar, "");
            this.f13048e.setText(eVar.f23483a.f23487a);
            this.f13049f.setText(eVar.f23484b.f23487a);
            C6501b.C6502a.m13948a("livesdk_match_rule_notice_show").mo12639a().mo12655b();
            this.f13046a.setOnClickListener(new View$OnClickListenerC5018b(gVar, eVar));
        }
    }
}
