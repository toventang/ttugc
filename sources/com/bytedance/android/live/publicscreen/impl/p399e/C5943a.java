package com.bytedance.android.live.publicscreen.impl.p399e;

import com.bytedance.android.live.base.model.user.AbstractC2994b;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.publicscreen.impl.model.C6030p;
import com.bytedance.android.live.publicscreen.impl.model.C6031q;
import com.bytedance.android.live.publicscreen.p386a.AbstractC5880e;
import com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5873h;
import com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5877k;
import com.bytedance.android.livesdk.model.C9542az;
import com.bytedance.android.livesdk.model.message.p579c.C9698b;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdkapi.p692h.C11778b;
import com.bytedance.android.livesdkapi.session.C11870f;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.TimeUnit;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.publicscreen.impl.e.a */
public final class C5943a extends AbstractC5949f {
    static {
        Covode.recordClassIndex(6551);
    }

    @Override // com.bytedance.android.live.publicscreen.impl.p399e.AbstractC5950g
    /* renamed from: a */
    public final void mo11789a() {
        C6501b.C6502a.m13948a("livesdk_message_show_monitor").mo12643a(mo11808e().f14755l).mo12645a("msg_comment_cnt", this.f14888f).mo12645a("msg_comment_chathead_loaded", this.f14898p).mo12651a("admin_type", mo11826g()).mo12646a("hot_duration", TimeUnit.MILLISECONDS.toSeconds(this.f14904v)).mo12645a("folded_show_msg_cnt", this.f14899q).mo12645a("unfolded_show_msg_cnt", this.f14900r).mo12645a("show_msg_cnt", this.f14899q + this.f14900r).mo12645a("msg_like_cnt", this.f14889g).mo12645a("msg_gift_cnt", this.f14890h).mo12645a("msg_share_cnt", this.f14891i).mo12645a("msg_follow_cnt", this.f14892j).mo12645a("drop_like_cnt", this.f14893k).mo12645a("drop_gift_cnt", this.f14894l).mo12645a("drop_share_cnt", this.f14895m).mo12645a("drop_follow_cnt", this.f14896n).mo12645a("drop_comment_cnt", this.f14897o).mo12645a("msg_member_enter_cnt", this.f14901s).mo12645a("drop_member_enter_cnt", this.f14902t).mo12655b();
    }

    @Override // com.bytedance.android.live.publicscreen.impl.p399e.C5945c, com.bytedance.android.live.publicscreen.impl.p399e.AbstractC5944b, com.bytedance.android.live.publicscreen.impl.p399e.AbstractC5950g, com.bytedance.android.live.publicscreen.impl.p399e.AbstractC5949f
    /* renamed from: a */
    public final void mo11790a(AbstractC5873h hVar, long j) {
        C9698b bVar;
        String str;
        String str2;
        C89219l.m154721d(hVar, "");
        super.mo11790a(hVar, j);
        if (j == 0) {
            C6501b a = C6501b.C6502a.m13948a("livesdk_public_screen_metrics").mo12643a(mo11808e().f14755l);
            if (mo11808e().f14752i) {
                Long startStreamingTimestamp = ((AbstractC5880e) C6193a.m13435a(AbstractC5880e.class)).getStartStreamingTimestamp(mo11808e().f14744a);
                if (startStreamingTimestamp != null) {
                    long longValue = startStreamingTimestamp.longValue();
                    a.mo12646a("public_screen_load_duration", ((AbstractC5949f) this).f14881b - longValue).mo12646a("public_screen_first_message_total_duration", this.f14883d - longValue);
                }
            } else {
                C11870f fVar = C11870f.C11871a.f28404a;
                C89219l.m154716b(fVar, "");
                EnterRoomLinkSession a2 = fVar.mo19010a();
                C89219l.m154716b(a2, "");
                EnterRoomConfig.TimeStamp timeStamp = a2.f28391b.f28233c.f28325af;
                if (timeStamp != null) {
                    long j2 = timeStamp.f28388a;
                    a.mo12646a("public_screen_load_duration", ((AbstractC5949f) this).f14881b - j2).mo12646a("public_screen_first_message_total_duration", this.f14883d - j2);
                }
            }
            a.mo12646a("public_screen_first_message_receive_duration", ((AbstractC5949f) this).f14882c - ((AbstractC5949f) this).f14881b).mo12646a("public_screen_first_message_show_duration", this.f14883d - ((AbstractC5949f) this).f14882c).mo12655b();
        }
        if (hVar instanceof C6030p) {
            C6030p pVar = (C6030p) hVar;
            if (!pVar.f15110e) {
                C6501b.C6502a.m13948a("livesdk_share_capsule_show").mo12643a(mo11808e().f14755l).mo12655b();
                pVar.f15110e = true;
            }
        }
        if ((hVar instanceof C6031q) && hVar.mo11676d().f14726a == 1) {
            MESSAGE message = ((AbstractC5877k) hVar).f14737d;
            C89219l.m154716b(message, "");
            C11778b bVar2 = message.f28134O;
            if (bVar2 != null && (bVar = bVar2.f28144j) != null && (str = bVar.f23645a) != null) {
                if (mo11808e().f14752i) {
                    str2 = "anchor";
                } else {
                    AbstractC6872f b = C11115u.m19743a().mo17915b();
                    C89219l.m154716b(b, "");
                    AbstractC2994b a3 = b.mo13147a();
                    C89219l.m154716b(a3, "");
                    C9542az userAttr = a3.getUserAttr();
                    if (userAttr == null || !userAttr.f23192b) {
                        str2 = "user";
                    } else {
                        str2 = "admin";
                    }
                }
                switch (str.hashCode()) {
                    case -1660150875:
                        if (!str.equals("pm_mt_guidance_host_10_share")) {
                            return;
                        }
                        C6501b.C6502a.m13948a("livesdk_enhanced_share_info").mo12643a(mo11808e().f14755l).mo12651a("msg_type", "to_more_than_10_users").mo12651a("admin_type", str2).mo12655b();
                        return;
                    case -1130060071:
                        if (!str.equals("pm_mt_guidance_viewer_5_share")) {
                            return;
                        }
                        C6501b.C6502a.m13948a("livesdk_enhanced_share_info").mo12643a(mo11808e().f14755l).mo12651a("msg_type", "to_more_than_5_users").mo12651a("admin_type", str2).mo12655b();
                        return;
                    case -686828615:
                        if (str.equals("pm_mt_guidance_host_share")) {
                            C6501b.C6502a.m13948a("livesdk_anchor_share_notify_notice").mo12643a(mo11808e().f14755l).mo12651a("msg_type", "encourage_user_share").mo12655b();
                            return;
                        }
                        return;
                    case 188624603:
                        if (str.equals("pm_mt_guidance_host_more_share")) {
                            C6501b.C6502a.m13948a("livesdk_anchor_share_notify_notice").mo12643a(mo11808e().f14755l).mo12651a("msg_type", "first_user_share").mo12655b();
                            return;
                        }
                        return;
                    case 1621337787:
                        if (!str.equals("pm_mt_guidance_viewer_10_share")) {
                            return;
                        }
                        C6501b.C6502a.m13948a("livesdk_enhanced_share_info").mo12643a(mo11808e().f14755l).mo12651a("msg_type", "to_more_than_10_users").mo12651a("admin_type", str2).mo12655b();
                        return;
                    case 1950674095:
                        if (!str.equals("pm_mt_guidance_host_5_share")) {
                            return;
                        }
                        C6501b.C6502a.m13948a("livesdk_enhanced_share_info").mo12643a(mo11808e().f14755l).mo12651a("msg_type", "to_more_than_5_users").mo12651a("admin_type", str2).mo12655b();
                        return;
                    default:
                        return;
                }
            }
        }
    }
}
