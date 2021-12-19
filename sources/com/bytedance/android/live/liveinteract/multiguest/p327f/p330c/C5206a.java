package com.bytedance.android.live.liveinteract.multiguest.p327f.p330c;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.base.AbstractC2953a;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.liveinteract.api.AbstractC4409b;
import com.bytedance.android.live.liveinteract.api.C4394ah;
import com.bytedance.android.live.liveinteract.api.C4452v;
import com.bytedance.android.live.liveinteract.api.p260a.C4384b;
import com.bytedance.android.live.liveinteract.multiguest.p327f.p332e.C5210a;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.publicscreen.p386a.C5889g;
import com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5873h;
import com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5877k;
import com.bytedance.android.live.publicscreen.p386a.p392f.AbstractC5888b;
import com.bytedance.android.livesdk.chatroom.p492g.C7577g;
import com.bytedance.android.livesdk.event.C8447a;
import com.bytedance.android.livesdk.model.message.C9609al;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p561j.C9040bf;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.multiguest.f.c.a */
public final class C5206a extends AbstractC5888b<C5210a> {

    /* renamed from: a */
    private final View f13452a;

    /* renamed from: d */
    private final ImageView f13453d;

    /* renamed from: e */
    private final LiveTextView f13454e;

    /* renamed from: f */
    private final LiveTextView f13455f;

    static {
        Covode.recordClassIndex(5798);
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.f.c.a$b */
    static final class View$OnClickListenerC5208b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C5889g f13457a;

        /* renamed from: b */
        final /* synthetic */ C9609al.C9610a f13458b;

        static {
            Covode.recordClassIndex(5800);
        }

        View$OnClickListenerC5208b(C5889g gVar, C9609al.C9610a aVar) {
            this.f13457a = gVar;
            this.f13458b = aVar;
        }

        public final void onClick(View view) {
            DataChannel dataChannel = this.f13457a.f14755l;
            if (view != null && view.getContext() != null && dataChannel != null) {
                if (C4384b.C4385a.m10496a().mo10147a() != 2) {
                    C11226ao.m19882a(C3966y.m9669e(), (int) R.string.e7o);
                } else {
                    dataChannel.mo28320c(C4452v.class, new C8447a(this.f13458b.f23346c, "mutual_notice"));
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5206a(View view) {
        super(view);
        C89219l.m154721d(view, "");
        View findViewById = view.findViewById(R.id.acq);
        C89219l.m154716b(findViewById, "");
        this.f13452a = findViewById;
        View findViewById2 = view.findViewById(R.id.ac1);
        C89219l.m154716b(findViewById2, "");
        this.f13453d = (ImageView) findViewById2;
        View findViewById3 = view.findViewById(R.id.bcm);
        C89219l.m154716b(findViewById3, "");
        this.f13454e = (LiveTextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.bps);
        C89219l.m154716b(findViewById4, "");
        this.f13455f = (LiveTextView) findViewById4;
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.f.c.a$a */
    static final class View$OnClickListenerC5207a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C5889g f13456a;

        static {
            Covode.recordClassIndex(5799);
        }

        View$OnClickListenerC5207a(C5889g gVar) {
            this.f13456a = gVar;
        }

        public final void onClick(View view) {
            DataChannel dataChannel = this.f13456a.f14755l;
            if (view != null && view.getContext() != null && dataChannel != null) {
                AbstractC2953a a = C6193a.m13435a(AbstractC4409b.class);
                C89219l.m154716b(a, "");
                if (C4394ah.m10505a(((AbstractC4409b) a).getCurrentLinkMode(), 2)) {
                    C11226ao.m19883a(C3966y.m9669e(), C3966y.m9657a((int) R.string.e9a), 0);
                    return;
                }
                dataChannel.mo28320c(C9040bf.class, "");
                C6501b.C6502a.m13948a("livesdk_anchor_invite_guest_popup_click").mo12639a().mo12655b();
            }
        }
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.p392f.AbstractC5887a
    /* renamed from: a */
    public final /* synthetic */ void mo10370a(C5889g gVar, AbstractC5873h hVar) {
        C9609al.C9610a aVar;
        AbstractC5877k kVar = (AbstractC5877k) hVar;
        C89219l.m154721d(gVar, "");
        C89219l.m154721d(kVar, "");
        if (((C9609al) kVar.f14737d).f23341a == 0) {
            C9609al.C9612c cVar = ((C9609al) kVar.f14737d).f23342f;
            if (cVar != null && cVar.f23348a != null && cVar.f23349b != null) {
                this.f13453d.setImageResource(2131234437);
                this.f13454e.setText(cVar.f23348a.f23347a);
                this.f13455f.setText(cVar.f23349b.f23347a);
                this.f13455f.setOnClickListener(new View$OnClickListenerC5207a(gVar));
                C6501b.C6502a.m13948a("livesdk_anchor_invite_guest_popup_show").mo12639a().mo12655b();
            }
        } else if (((C9609al) kVar.f14737d).f23341a == 1 && (aVar = ((C9609al) kVar.f14737d).f23343g) != null && aVar.f23346c != null) {
            User user = aVar.f23346c;
            C89219l.m154716b(user, "");
            if (user.getAvatarThumb() != null && aVar.f23345b != null && aVar.f23344a != null) {
                this.f13452a.setBackgroundResource(R.drawable.bs1);
                ViewGroup.LayoutParams layoutParams = this.f13453d.getLayoutParams();
                Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                ConstraintLayout.C0547a aVar2 = (ConstraintLayout.C0547a) layoutParams;
                aVar2.width = C3966y.m9653a(32.0f);
                aVar2.height = C3966y.m9653a(32.0f);
                aVar2.leftMargin = C3966y.m9653a(8.0f);
                aVar2.rightMargin = C3966y.m9653a(8.0f);
                this.f13453d.setLayoutParams(aVar2);
                ImageView imageView = this.f13453d;
                User user2 = aVar.f23346c;
                C89219l.m154716b(user2, "");
                C7577g.m15571a(imageView, user2.getAvatarThumb(), this.f13453d.getWidth(), this.f13453d.getHeight(), 2131234441);
                this.f13454e.setText(aVar.f23344a.f23347a);
                this.f13455f.setText(aVar.f23345b.f23347a);
                this.f13455f.setOnClickListener(new View$OnClickListenerC5208b(gVar, aVar));
            }
        }
    }
}
