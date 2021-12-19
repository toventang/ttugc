package com.bytedance.android.livesdk.function;

import android.net.Uri;
import com.bytedance.android.livesdk.event.C8452e;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.rank.api.AbstractC10339d;
import com.bytedance.android.livesdkapi.session.C11870f;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import com.bytedance.android.livesdkapi.session.EnumC11866b;
import com.bytedance.android.livesdkapi.session.Event;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.bytedance.android.livesdk.function.f */
final /* synthetic */ class C8761f implements AbstractC10339d.AbstractC10340a {

    /* renamed from: a */
    private final Uri f21616a;

    /* renamed from: b */
    private final String f21617b;

    /* renamed from: c */
    private final String f21618c;

    static {
        Covode.recordClassIndex(9638);
    }

    C8761f(Uri uri, String str, String str2) {
        this.f21616a = uri;
        this.f21617b = str;
        this.f21618c = str2;
    }

    @Override // com.bytedance.android.livesdk.rank.api.AbstractC10339d.AbstractC10340a
    /* renamed from: a */
    public final void mo15036a(ArrayList arrayList) {
        Uri uri = this.f21616a;
        String str = this.f21617b;
        String str2 = this.f21618c;
        C11870f.C11871a.f28404a.mo19010a().mo18994a(new Event("weekly_rank_jump_other_room", 37888, EnumC11866b.BussinessApiCall));
        EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
        enterRoomConfig.f28233c.f28295L = "weekly_rank_notice";
        enterRoomConfig.f28233c.f28293J = uri.getQueryParameter("enter_from_merge");
        enterRoomConfig.f28233c.f28321ab = "click";
        enterRoomConfig.f28232b.f28258b = str;
        if (!arrayList.isEmpty()) {
            long[] jArr = new long[arrayList.size()];
            int i = 0;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                jArr[i] = ((Long) it.next()).longValue();
                i++;
            }
            enterRoomConfig.f28233c.f28291H = jArr;
        }
        EnterRoomLinkSession.m20943a(enterRoomConfig).mo18994a(new Event("weekly_rank_jump_to_live", 5120, EnumC11866b.BussinessApiCall));
        C6779a.m14563a().mo13053a(new C8452e(Long.parseLong(str2), enterRoomConfig));
    }
}
