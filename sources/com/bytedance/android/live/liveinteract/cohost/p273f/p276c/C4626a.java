package com.bytedance.android.live.liveinteract.cohost.p273f.p276c;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.base.AbstractC2953a;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.liveinteract.api.AbstractC4409b;
import com.bytedance.android.live.liveinteract.api.C4394ah;
import com.bytedance.android.live.liveinteract.api.p260a.C4384b;
import com.bytedance.android.live.liveinteract.api.p261b.EnumC4422k;
import com.bytedance.android.live.liveinteract.cohost.p263a.p266c.C4502a;
import com.bytedance.android.live.liveinteract.cohost.p263a.p268e.C4592a;
import com.bytedance.android.live.liveinteract.cohost.p263a.p268e.C4595b;
import com.bytedance.android.live.liveinteract.cohost.p273f.p278e.C4630a;
import com.bytedance.android.live.liveinteract.cohost.p279ui.p284e.C4722d;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5713h;
import com.bytedance.android.live.p253j.AbstractC4367a;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.publicscreen.p386a.C5889g;
import com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5873h;
import com.bytedance.android.live.publicscreen.p386a.p392f.AbstractC5888b;
import com.bytedance.android.livesdk.livesetting.linkmic.TTliveLinkmicModeSwitchOpenSetting;
import com.bytedance.android.livesdk.model.message.C9608ak;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p561j.C9032az;
import com.bytedance.android.livesdk.p561j.C9071cj;
import com.bytedance.android.livesdk.p561j.C9093de;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.cohost.f.c.a */
public final class C4626a extends AbstractC5888b<C4630a> {

    /* renamed from: a */
    public final View f12274a;

    /* renamed from: d */
    private final ImageView f12275d;

    /* renamed from: e */
    private final LiveTextView f12276e;

    /* renamed from: f */
    private final LiveTextView f12277f;

    static {
        Covode.recordClassIndex(5202);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4626a(View view) {
        super(view);
        C89219l.m154721d(view, "");
        View findViewById = view.findViewById(R.id.acq);
        C89219l.m154716b(findViewById, "");
        this.f12274a = findViewById;
        View findViewById2 = view.findViewById(R.id.ac1);
        C89219l.m154716b(findViewById2, "");
        this.f12275d = (ImageView) findViewById2;
        View findViewById3 = view.findViewById(R.id.bcm);
        C89219l.m154716b(findViewById3, "");
        this.f12276e = (LiveTextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.bps);
        C89219l.m154716b(findViewById4, "");
        this.f12277f = (LiveTextView) findViewById4;
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.f.c.a$a */
    static final class View$OnClickListenerC4627a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C4626a f12278a;

        /* renamed from: b */
        final /* synthetic */ C5889g f12279b;

        /* renamed from: c */
        final /* synthetic */ C4630a f12280c;

        static {
            Covode.recordClassIndex(5203);
        }

        View$OnClickListenerC4627a(C4626a aVar, C5889g gVar, C4630a aVar2) {
            this.f12278a = aVar;
            this.f12279b = gVar;
            this.f12280c = aVar2;
        }

        public final void onClick(View view) {
            Room room;
            DataChannel dataChannel;
            Room room2;
            if (view != null && view.getContext() != null && this.f12279b.f14755l != null) {
                C4384b.C4385a.m10496a().f11932V = "anchor_host_notice";
                AbstractC2953a a = C6193a.m13435a(AbstractC4409b.class);
                C89219l.m154716b(a, "");
                if (!((AbstractC4409b) a).isInMultiGuest() && ((!C4394ah.m10505a(C4384b.C4385a.m10496a().mo10147a(), 2) || TTliveLinkmicModeSwitchOpenSetting.INSTANCE.getValue()) && !((AbstractC4367a) C6193a.m13435a(AbstractC4367a.class)).isMicRoomForAnchorNow())) {
                    MESSAGE message = this.f12280c.f14737d;
                    C89219l.m154716b(message, "");
                    if (((C9608ak) message).f23340g != 1 || (!C4502a.m10589e() && !C4502a.m10588d())) {
                        MESSAGE message2 = this.f12280c.f14737d;
                        C89219l.m154716b(message2, "");
                        if (((C9608ak) message2).f23340g != 2 || (!C4502a.m10589e() && !C4502a.m10588d())) {
                            MESSAGE message3 = this.f12280c.f14737d;
                            C89219l.m154716b(message3, "");
                            if (((C9608ak) message3).f23340g == 1) {
                                DataChannel dataChannel2 = this.f12279b.f14755l;
                                if (dataChannel2 != null) {
                                    room2 = (Room) dataChannel2.mo28318b(C9093de.class);
                                } else {
                                    room2 = null;
                                }
                                C5713h.m12504a(4, room2, (EnumC4422k) null, false, false);
                                DataChannel dataChannel3 = this.f12279b.f14755l;
                                if (dataChannel3 != null) {
                                    dataChannel3.mo28320c(C9071cj.class, "anchor_host_notice");
                                }
                                C5713h.m12516a("room", "anchor_host_notice", false);
                                C6501b.C6502a.m13948a("livesdk_anchor_host_notice").mo12643a(this.f12279b.f14755l).mo12651a("event_type", "click").mo12655b();
                                return;
                            }
                            MESSAGE message4 = this.f12280c.f14737d;
                            C89219l.m154716b(message4, "");
                            if (((C9608ak) message4).f23340g == 2) {
                                DataChannel dataChannel4 = this.f12279b.f14755l;
                                if (dataChannel4 != null) {
                                    room = (Room) dataChannel4.mo28318b(C9093de.class);
                                } else {
                                    room = null;
                                }
                                C5713h.m12504a(4, room, (EnumC4422k) null, false, true);
                                C5713h.m12516a("room", "anchor_host_notice", true);
                                if (C4384b.C4385a.m10496a().f11937a) {
                                    C11226ao.m19882a(C3966y.m9669e(), (int) R.string.dwh);
                                    return;
                                }
                                C4592a.m10696a(this.f12278a.f12274a, new C4722d.AbstractC4723a(this) {
                                    /* class com.bytedance.android.live.liveinteract.cohost.p273f.p276c.C4626a.View$OnClickListenerC4627a.C46281 */

                                    /* renamed from: a */
                                    final /* synthetic */ View$OnClickListenerC4627a f12281a;

                                    static {
                                        Covode.recordClassIndex(5204);
                                    }

                                    @Override // com.bytedance.android.live.liveinteract.cohost.p279ui.p284e.C4722d.AbstractC4723a
                                    /* renamed from: a */
                                    public final boolean mo10372a() {
                                        C4502a.m10581a(this.f12281a.f12279b.f14755l, C4502a.EnumC4508e.TYPE_PUBLIC_SCREEN);
                                        return true;
                                    }

                                    /* JADX WARN: Incorrect args count in method signature: ()V */
                                    {
                                        this.f12281a = r1;
                                    }
                                });
                                if (C4595b.m10702b() && (dataChannel = this.f12279b.f14755l) != null) {
                                    dataChannel.mo28320c(C9071cj.class, "anchor_host_notice");
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        C4502a.m10579a(C4502a.EnumC4506c.PREVIEW_DIALOG);
                        return;
                    }
                }
                C11226ao.m19882a(C3966y.m9669e(), (int) R.string.dwh);
            }
        }
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.p392f.AbstractC5887a
    /* renamed from: a */
    public final /* synthetic */ void mo10370a(C5889g gVar, AbstractC5873h hVar) {
        boolean z;
        float f;
        Boolean bool;
        C4630a aVar = (C4630a) hVar;
        C89219l.m154721d(gVar, "");
        C89219l.m154721d(aVar, "");
        this.f12275d.setImageResource(2131234437);
        LiveTextView liveTextView = this.f12276e;
        MESSAGE message = aVar.f14737d;
        C89219l.m154716b(message, "");
        liveTextView.setText(((C9608ak) message).f23338a);
        LiveTextView liveTextView2 = this.f12277f;
        MESSAGE message2 = aVar.f14737d;
        C89219l.m154716b(message2, "");
        liveTextView2.setText(((C9608ak) message2).f23339f);
        this.f12274a.setBackgroundResource(R.drawable.bs2);
        this.f12274a.setOnClickListener(new View$OnClickListenerC4627a(this, gVar, aVar));
        DataChannel dataChannel = gVar.f14755l;
        if (dataChannel == null || (bool = (Boolean) dataChannel.mo28318b(C9032az.class)) == null) {
            z = false;
        } else {
            z = bool.booleanValue();
        }
        ViewGroup.LayoutParams layoutParams = this.f12274a.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.C0547a aVar2 = (ConstraintLayout.C0547a) layoutParams;
        if (z) {
            f = 0.99f;
        } else {
            f = 0.8f;
        }
        aVar2.f2238O = f;
        this.f12274a.setLayoutParams(aVar2);
    }
}
