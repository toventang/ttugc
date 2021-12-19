package com.bytedance.android.live.liveinteract.cohost.p263a.p267d;

import com.bytedance.android.live.liveinteract.api.AbstractC4409b;
import com.bytedance.android.live.liveinteract.api.p260a.C4384b;
import com.bytedance.android.live.liveinteract.match.p295b.p297b.C4947a;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5737w;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p425aa.C6544e;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdkapi.depend.model.p686b.C11688a;
import com.bytedance.android.livesdkapi.depend.p678b.C11625a;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.live.liveinteract.cohost.a.d.m */
public final /* synthetic */ class C4577m implements AbstractC88433f {

    /* renamed from: a */
    private final C4566e f12206a;

    static {
        Covode.recordClassIndex(5153);
    }

    public C4577m(C4566e eVar) {
        this.f12206a = eVar;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        C4566e eVar = this.f12206a;
        C6779a.m14563a().mo13053a(new C11625a((C11688a) obj));
        String a = C5737w.m12598a(eVar.f12176d.f11968p);
        C6501b a2 = C6501b.C6502a.m13948a("livesdk_follow");
        a2.mo12646a("channel_id", eVar.f12176d.f11957e);
        if (((AbstractC4409b) C6193a.m13435a(AbstractC4409b.class)).isRoomInBattle()) {
            a2.mo12651a("connection_type", "manual_pk");
            a2.mo12646a("pk_id", ((AbstractC4409b) C6193a.m13435a(AbstractC4409b.class)).getBattleId());
            if (eVar.f12174b && C4947a.f12909a.f12914c) {
                a2.mo12646a("pk_inviter_id", eVar.f12173a.getOwnerUserId());
                a2.mo12646a("pk_invitee_id", C4384b.C4385a.m10496a().f11958f);
            } else if (eVar.f12174b && !C4947a.f12909a.f12914c) {
                a2.mo12646a("pk_invitee_id", eVar.f12173a.getOwnerUserId());
                a2.mo12646a("pk_inviter_id", C4384b.C4385a.m10496a().f11958f);
            }
        } else {
            a2.mo12651a("connection_type", "anchor");
        }
        if (eVar.f12174b) {
            if (C4384b.C4385a.m10496a().f11969q) {
                a2.mo12646a("connection_inviter_id", eVar.f12173a.getOwnerUserId());
                a2.mo12646a("connection_invitee_id", C4384b.C4385a.m10496a().f11958f);
            } else {
                a2.mo12646a("connection_inviter_id", C4384b.C4385a.m10496a().f11958f);
                a2.mo12646a("connection_invitee_id", eVar.f12173a.getOwnerUserId());
            }
        }
        a2.mo12651a("anchor_type", "opposite");
        a2.mo12643a(eVar.f18624w).mo12651a("request_page", eVar.f12174b ? "live_anchor_c_anchor" : "live_audience_c_anchor").mo12651a("enter_from_merge", C6544e.m13987a()).mo12651a("enter_method", C6544e.m13990d()).mo12651a("action_type", C6544e.m13991e()).mo12646a("anchor_id", eVar.f12173a.getOwnerUserId()).mo12646a("room_id", eVar.f12173a.getId()).mo12651a("request_id", eVar.f12173a.getRequestId()).mo12651a("log_pb", eVar.f12173a.getLog_pb()).mo12651a("click_user_position", "follow_icon").mo12646a("to_user_id", eVar.f12176d.f11958f).mo12651a("live_type", "video_live").mo12651a("invitee_list", a).mo12655b();
    }
}
