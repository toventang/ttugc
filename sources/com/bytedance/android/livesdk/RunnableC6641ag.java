package com.bytedance.android.livesdk;

import android.text.TextUtils;
import com.bytedance.android.livesdk.chatroom.p489d.C7420c;
import com.bytedance.android.livesdk.chatroom.p492g.C7589k;
import com.bytedance.android.livesdk.p425aa.C6538d;
import com.bytedance.android.livesdk.p425aa.C6545f;
import com.bytedance.android.livesdk.p425aa.C6555i;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.android.livesdkapi.depend.p680d.AbstractC11652i;
import com.bytedance.android.livesdkapi.depend.p680d.EnumC11662p;
import com.bytedance.android.livesdkapi.session.C11870f;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.EnumC11866b;
import com.bytedance.android.livesdkapi.session.Event;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.ag */
final /* synthetic */ class RunnableC6641ag implements Runnable {

    /* renamed from: a */
    private final C6561ab f16537a;

    /* renamed from: b */
    private final String f16538b;

    static {
        Covode.recordClassIndex(7379);
    }

    RunnableC6641ag(C6561ab abVar, String str) {
        this.f16537a = abVar;
        this.f16538b = str;
    }

    public final void run() {
        String str;
        C6561ab abVar = this.f16537a;
        AbstractC11652i c = abVar.mo12702c();
        if (c != null) {
            abVar.f16403k = null;
            if (abVar.f16404l == null) {
                C6555i.m14021b();
                C6555i.m9464c("LiveRoomFragment", "mPageChangeListener is null !");
                return;
            }
            abVar.f16404l.f16426a = c;
            EnterRoomConfig w = c.mo14149w();
            if (w.f28233c.f28321ab == null) {
                EnterRoomConfig.RoomsData roomsData = w.f28233c;
                if (C7589k.m15600a(w)) {
                    str = "draw";
                } else {
                    str = "click";
                }
                roomsData.f28321ab = str;
            }
            String str2 = w.f28233c.f28321ab;
            w.f28233c.f28296M = str2;
            w.f28233c.f28325af.f28389b = Long.valueOf(abVar.f16408p);
            C7420c.m15300a(w, 0);
            c.mo14127k();
            if ((TextUtils.equals(str2, "draw") || w.f28233c.f28342aw) && C6561ab.f16389a != null) {
                C6545f.m14007a(str2, w);
            }
            if (c.mo14123g() == null || c.mo14123g() == EnumC11662p.IDLE) {
                C11226ao.m19882a(abVar.getContext(), (int) R.string.gn8);
                if (C6561ab.f16389a != null) {
                    C6545f.m14006a(w, "", 0, "init_state_invalid");
                }
                Event event = new Event("room_fg_enter_room_fail", 33025, EnumC11866b.BussinessApiCall);
                event.mo19003a("fail to enter room, because live play fg status is null or idle.");
                C11870f.C11871a.f28404a.mo19010a().mo18994a(event);
                abVar.f16396c.getRoomAction().mo15450a();
            }
            C6538d.m13977a(str2);
            if (C6561ab.f16389a != null) {
                C6545f.m14005a(c.mo14149w());
                C6561ab.f16389a.mo12681b(w);
            }
            abVar.f16395b.refreshTimer();
        }
        abVar.mo12707h();
    }
}
