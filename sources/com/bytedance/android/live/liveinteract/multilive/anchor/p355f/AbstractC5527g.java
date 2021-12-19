package com.bytedance.android.live.liveinteract.multilive.anchor.p355f;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.android.live.liveinteract.multilive.anchor.p351b.C5483b;
import com.bytedance.android.live.liveinteract.multilive.anchor.p356ui.p357a.C5533a;
import com.bytedance.android.live.liveinteract.multilive.p360c.C5590c;
import com.bytedance.android.live.liveinteract.multilive.p362e.AbstractC5612a;
import com.bytedance.android.live.liveinteract.multilive.p362e.C5631d;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.multilive.anchor.f.g */
public abstract class AbstractC5527g extends AbstractC5612a {
    static {
        Covode.recordClassIndex(6122);
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multilive.anchor.f.g$b */
    static final class View$OnClickListenerC5529b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC5527g f14114a;

        static {
            Covode.recordClassIndex(6124);
        }

        View$OnClickListenerC5529b(AbstractC5527g gVar) {
            this.f14114a = gVar;
        }

        public final void onClick(View view) {
            this.f14114a.mo11255a(1);
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multilive.anchor.f.g$c */
    static final class View$OnClickListenerC5530c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC5527g f14115a;

        static {
            Covode.recordClassIndex(6125);
        }

        View$OnClickListenerC5530c(AbstractC5527g gVar) {
            this.f14115a = gVar;
        }

        public final void onClick(View view) {
            this.f14115a.mo11255a(2);
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multilive.anchor.f.g$d */
    static final class View$OnClickListenerC5531d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC5527g f14116a;

        static {
            Covode.recordClassIndex(6126);
        }

        View$OnClickListenerC5531d(AbstractC5527g gVar) {
            this.f14116a = gVar;
        }

        public final void onClick(View view) {
            this.f14116a.mo11255a(3);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractC5527g(DataChannel dataChannel) {
        super(dataChannel);
        C89219l.m154721d(dataChannel, "");
    }

    /* renamed from: a */
    public final void mo11255a(int i) {
        this.f14261h.mo28320c(C5483b.class, new C5533a(i));
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multilive.anchor.f.g$a */
    static final class C5528a extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC5527g f14113a;

        static {
            Covode.recordClassIndex(6123);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5528a(AbstractC5527g gVar) {
            super(1);
            this.f14113a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            View view;
            boolean booleanValue = bool.booleanValue();
            AbstractC5527g gVar = this.f14113a;
            FrameLayout e = gVar.mo11309e();
            if (e == null || e.getChildCount() != 0) {
                FrameLayout e2 = gVar.mo11309e();
                if (e2 != null) {
                    view = e2.getChildAt(0);
                } else {
                    view = null;
                }
                if (view instanceof C5631d) {
                    ((C5631d) view).mo11412a(Boolean.valueOf(booleanValue));
                }
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.p362e.AbstractC5612a, com.bytedance.android.live.liveinteract.multilive.p362e.AbstractC5622b
    /* renamed from: a */
    public void mo11256a(ViewGroup viewGroup) {
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        FrameLayout frameLayout3;
        C89219l.m154721d(viewGroup, "");
        super.mo11256a(viewGroup);
        mo11393k();
        this.f14261h.mo28312a(this, C5590c.class, new C5528a(this));
        if ((this instanceof C5518a) || (this instanceof C5521c)) {
            ViewGroup viewGroup2 = this.f14257d;
            if (!(viewGroup2 == null || (frameLayout3 = (FrameLayout) viewGroup2.findViewById(R.id.av0)) == null)) {
                frameLayout3.setOnClickListener(new View$OnClickListenerC5529b(this));
            }
            ViewGroup viewGroup3 = this.f14257d;
            if (!(viewGroup3 == null || (frameLayout2 = (FrameLayout) viewGroup3.findViewById(R.id.av1)) == null)) {
                frameLayout2.setOnClickListener(new View$OnClickListenerC5530c(this));
            }
            ViewGroup viewGroup4 = this.f14257d;
            if (viewGroup4 != null && (frameLayout = (FrameLayout) viewGroup4.findViewById(R.id.av2)) != null) {
                frameLayout.setOnClickListener(new View$OnClickListenerC5531d(this));
            }
        }
    }
}
