package com.bytedance.android.live.liveinteract.cohost.p263a.p267d;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.liveinteract.api.EnumC4442m;
import com.bytedance.android.live.liveinteract.cohost.p263a.p264a.AbstractC4487h;
import com.bytedance.android.live.liveinteract.cohost.p263a.p266c.C4502a;
import com.bytedance.android.live.liveinteract.cohost.p263a.p268e.C4596c;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5737w;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.android.ugc.trill.R;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4565b.C88411a;
import p4600h.C89378p;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.cohost.a.d.aa */
public final class C4540aa implements AbstractC4487h.AbstractC4488a {

    /* renamed from: c */
    public static final C4541a f12133c = new C4541a((byte) 0);

    /* renamed from: a */
    public AbstractC4487h.AbstractC4489b f12134a;

    /* renamed from: b */
    public final DataChannel f12135b;

    /* renamed from: d */
    private final C88411a f12136d = new C88411a();

    static {
        Covode.recordClassIndex(5116);
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.a.d.aa$a */
    public static final class C4541a {
        static {
            Covode.recordClassIndex(5117);
        }

        private C4541a() {
        }

        public /* synthetic */ C4541a(byte b) {
            this();
        }

        /* renamed from: a */
        public static SpannableString m10605a(C89378p<? extends C4502a.EnumC4510g, Long> pVar) {
            int i;
            int i2;
            C89219l.m154721d(pVar, "");
            if (pVar.getFirst() == C4502a.EnumC4510g.COUNTDOWN_WAITING) {
                i = R.string.dsl;
            } else {
                i = R.string.dsu;
            }
            long longValue = pVar.getSecond().longValue();
            String a = C4596c.m10706a(longValue);
            String b = C4596c.m10707b(longValue);
            String a2 = C3966y.m9660a(i, a, b);
            int indexOf = a2.indexOf(a);
            int lastIndexOf = a2.lastIndexOf(b);
            if (indexOf < lastIndexOf) {
                i2 = lastIndexOf + b.length();
            } else {
                int length = a.length() + indexOf;
                indexOf = lastIndexOf;
                i2 = length;
            }
            C4596c.C4597a aVar = new C4596c.C4597a(indexOf, i2);
            int i3 = aVar.f12231a;
            int i4 = aVar.f12232b;
            SpannableString spannableString = new SpannableString(a2);
            spannableString.setSpan(new ForegroundColorSpan(C3966y.m9663b((int) R.color.a0d)), i3, i4, 33);
            return spannableString;
        }
    }

    @Override // com.bytedance.android.live.liveinteract.cohost.p263a.p264a.AbstractC4487h.AbstractC4488a
    /* renamed from: b */
    public final void mo10274b() {
        this.f12136d.mo142944a();
        this.f12134a = null;
    }

    @Override // com.bytedance.android.live.liveinteract.cohost.p263a.p264a.AbstractC4487h.AbstractC4488a
    /* renamed from: a */
    public final void mo10272a() {
        C6501b.C6502a.m13948a("livesdk_cancel_connection_popup_click").mo12639a().mo12646a("waiting_time", C4502a.f12071c * 1000).mo12651a("enter_from", "connection_icon").mo12651a("invitee_list", C5737w.m12598a(EnumC4442m.RANDOM_LINK_MIC_INVITE)).mo12655b();
        C4502a.m10578a(C4502a.EnumC4505b.DISCONNECT);
        AbstractC4487h.AbstractC4489b bVar = this.f12134a;
        if (bVar != null) {
            bVar.dismiss();
        }
    }

    public C4540aa(DataChannel dataChannel) {
        this.f12135b = dataChannel;
    }

    @Override // com.bytedance.android.live.liveinteract.cohost.p263a.p264a.AbstractC4487h.AbstractC4488a
    /* renamed from: a */
    public final void mo10273a(AbstractC88412b bVar) {
        C89219l.m154721d(bVar, "");
        this.f12136d.mo142945a(bVar);
    }
}
