package com.bytedance.android.live.liveinteract.cohost.p263a.p268e;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.bytedance.android.live.base.model.user.C2997d;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.design.widget.LiveButton;
import com.bytedance.android.live.liveinteract.api.EnumC4440k;
import com.bytedance.android.live.liveinteract.api.p260a.C4384b;
import com.bytedance.android.live.liveinteract.cohost.p263a.p265b.C4491b;
import com.bytedance.android.live.liveinteract.cohost.p263a.p266c.C4502a;
import com.bytedance.android.live.liveinteract.cohost.p279ui.p281b.C4658d;
import com.bytedance.android.live.liveinteract.cohost.p279ui.p284e.C4722d;
import com.bytedance.android.live.liveinteract.platform.common.p371c.C5692k;
import com.bytedance.android.livesdk.chatroom.interact.model.C7611i;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p450an.C6800c;
import com.bytedance.android.livesdk.p452ao.AbstractC6804a;
import com.bytedance.android.livesdk.p452ao.C6805b;
import com.bytedance.android.livesdk.p452ao.C6806c;
import com.bytedance.android.livesdk.p458b.p459a.C6894d;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.cohost.a.e.a */
public final class C4592a {
    static {
        Covode.recordClassIndex(5168);
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.a.e.a$a */
    public static final class C4593a implements C4658d.AbstractC4659a {

        /* renamed from: a */
        final /* synthetic */ C4722d.AbstractC4723a f12224a;

        static {
            Covode.recordClassIndex(5169);
        }

        @Override // com.bytedance.android.live.liveinteract.cohost.p279ui.p281b.C4658d.AbstractC4659a
        /* renamed from: b */
        public final void mo10338b() {
            this.f12224a.mo10372a();
        }

        @Override // com.bytedance.android.live.liveinteract.cohost.p279ui.p281b.C4658d.AbstractC4659a
        /* renamed from: a */
        public final void mo10337a() {
            DataChannel dataChannel = C4384b.C4385a.m10496a().f11951an;
            if (dataChannel != null) {
                dataChannel.mo28319c(C4491b.class);
            }
        }

        C4593a(C4722d.AbstractC4723a aVar) {
            this.f12224a = aVar;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.cohost.a.e.a$b */
    public static final class View$OnClickListenerC4594b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ LiveButton f12225a;

        /* renamed from: b */
        final /* synthetic */ C4722d.AbstractC4723a f12226b;

        static {
            Covode.recordClassIndex(5170);
        }

        View$OnClickListenerC4594b(LiveButton liveButton, C4722d.AbstractC4723a aVar) {
            this.f12225a = liveButton;
            this.f12226b = aVar;
        }

        public final void onClick(View view) {
            C4592a.m10696a((View) this.f12225a, this.f12226b);
        }
    }

    /* renamed from: a */
    public static final void m10697a(LiveButton liveButton, C4722d.AbstractC4723a aVar) {
        C89219l.m154721d(liveButton, "");
        C89219l.m154721d(aVar, "");
        liveButton.setOnClickListener(new View$OnClickListenerC4594b(liveButton, aVar));
    }

    /* renamed from: a */
    public static final void m10698a(LiveButton liveButton, C7611i.C7612a aVar) {
        C89219l.m154721d(liveButton, "");
        C89219l.m154721d(aVar, "");
        liveButton.setText(aVar.f18905c);
        liveButton.setEnabled(true);
        if (!aVar.f18906d) {
            liveButton.setEnabled(false);
            liveButton.setIcon(2131234484);
            return;
        }
        liveButton.setIcon((Drawable) null);
        if (C4595b.m10702b()) {
            C6805b<Boolean> bVar = AbstractC6804a.f17027ca;
            C89219l.m154716b(bVar, "");
            Boolean a = bVar.mo13066a();
            C89219l.m154716b(a, "");
            if (a.booleanValue() && C4595b.m10702b()) {
                long d = C4595b.m10704d();
                String a2 = C3966y.m9660a((int) R.string.dsg, C4596c.m10706a(d), C4596c.m10707b(d));
                if (a2 != null) {
                    liveButton.setText(a2);
                    liveButton.setEnabled(false);
                }
            }
        }
        if (liveButton.isEnabled()) {
            C6805b<Boolean> bVar2 = AbstractC6804a.f17027ca;
            C89219l.m154716b(bVar2, "");
            C6806c.m14603a((C6800c) bVar2, (Object) false);
        }
    }

    /* renamed from: a */
    public static final void m10696a(View view, C4722d.AbstractC4723a aVar) {
        C89219l.m154721d(view, "");
        C89219l.m154721d(aVar, "");
        if (C4595b.m10702b()) {
            if (!(view instanceof LiveButton)) {
                view = null;
            }
            LiveButton liveButton = (LiveButton) view;
            if (liveButton != null) {
                liveButton.setEnabled(false);
            }
            C11226ao.m19883a(C3966y.m9669e(), C3966y.m9657a((int) R.string.dsn), 0);
            C6805b<Boolean> bVar = AbstractC6804a.f17027ca;
            C89219l.m154716b(bVar, "");
            C6806c.m14603a((C6800c) bVar, (Object) true);
            C6501b.C6502a.m13948a("livesdk_connection_click_banned").mo12639a().mo12651a("invitee_list", C4502a.EnumC4507d.RANDOM_MATCH.getType()).mo12651a("connection_type", "anchor").mo12646a("banned_time", C4595b.m10704d()).mo12655b();
        } else if (C4384b.C4385a.m10496a().mo10151b() != EnumC4440k.DISABLED) {
            C11226ao.m19882a(C3966y.m9669e(), (int) R.string.e4f);
        } else {
            C6894d a = C6894d.m14753a();
            C89219l.m154716b(a, "");
            if (a.f17258c) {
                DataChannelGlobal.f42558d.mo28329d(C5692k.class);
                return;
            }
            User a2 = C2997d.C2998a.m8305a();
            if (a2 == null || a2.getSecret() != 1) {
                aVar.mo10372a();
                return;
            }
            Context context = view.getContext();
            C89219l.m154716b(context, "");
            C4658d.m10789a(context, new C4593a(aVar)).show();
        }
    }
}
