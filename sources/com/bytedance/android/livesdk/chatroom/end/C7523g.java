package com.bytedance.android.livesdk.chatroom.end;

import android.text.TextUtils;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.livesdk.chatroom.C7411d;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p425aa.C6544e;
import com.bytedance.android.livesdk.p425aa.p428c.C6526e;
import com.bytedance.android.livesdk.p456as.C6865d;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.p686b.C11688a;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4565b.C88411a;

/* renamed from: com.bytedance.android.livesdk.chatroom.end.g */
public final class C7523g {

    /* renamed from: a */
    public final C88411a f18694a = new C88411a();

    /* renamed from: com.bytedance.android.livesdk.chatroom.end.g$a */
    public interface AbstractC7525a {
        static {
            Covode.recordClassIndex(8297);
        }

        /* renamed from: a */
        void mo13760a(C11688a aVar);

        /* renamed from: a */
        void mo13761a(Throwable th);
    }

    static {
        Covode.recordClassIndex(8295);
    }

    /* renamed from: a */
    public final void mo13777a(long j, Room room, String str, final AbstractC7525a aVar) {
        boolean z;
        String str2;
        String str3;
        if (room != null) {
            String str4 = "live_over";
            C11115u.m19743a().mo17915b().mo13150a(((C6865d.AbstractC6866a) new C6865d.C6867b().mo13134a(j)).mo13136a(room.getRequestId()).mo13139b("live_detail").mo13140c(str4).mo13138b(0).mo13142d(room.getLabels()).mo13141c()).mo143062b(new AbstractC88986z<C11688a>() {
                /* class com.bytedance.android.livesdk.chatroom.end.C7523g.C75241 */

                static {
                    Covode.recordClassIndex(8296);
                }

                @Override // p4560f.p4561a.AbstractC88986z
                public final void onComplete() {
                }

                @Override // p4560f.p4561a.AbstractC88986z
                public final void onError(Throwable th) {
                    AbstractC7525a aVar = aVar;
                    if (aVar != null) {
                        aVar.mo13761a(th);
                    }
                }

                @Override // p4560f.p4561a.AbstractC88986z
                public final void onSubscribe(AbstractC88412b bVar) {
                    C7523g.this.f18694a.mo142945a(bVar);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4560f.p4561a.AbstractC88986z
                public final /* synthetic */ void onNext(C11688a aVar) {
                    C11688a aVar2 = aVar;
                    AbstractC7525a aVar3 = aVar;
                    if (aVar3 != null) {
                        aVar3.mo13760a(aVar2);
                    }
                }
            });
            if (room.getOwner() == null || room.getOwner().getId() != j) {
                z = false;
            } else {
                z = true;
            }
            try {
                HashMap hashMap = new HashMap();
                hashMap.put("growth_deepevent", "1");
                if (!C13627m.m24498a(C7411d.m15284a().mo13614e())) {
                    hashMap.put("enter_live_method", C7411d.m15284a().mo13614e());
                }
                String g = C6544e.m13993g();
                if (TextUtils.isEmpty(g) || !"click_push_live_cd_user".equals(g)) {
                    hashMap.put("is_subscribe", "0");
                } else {
                    hashMap.put("is_subscribe", "1");
                }
                if (!z) {
                    str4 = "live_anchor_c_audience";
                }
                if (str == null || (!str.contains("carousel_audience_c") && !str.contains("loyal_audience_c"))) {
                    str = str4;
                }
                if (C3966y.m9670f()) {
                    str2 = "portrait";
                } else {
                    str2 = "landscape";
                }
                hashMap.put("room_orientation", str2);
                if (!(room.getOwner() == null || room.getOwner().getFollowInfo() == null)) {
                    int followStatus = (int) room.getOwner().getFollowInfo().getFollowStatus();
                    if (followStatus == 1 || followStatus == 3) {
                        str3 = "mutual";
                    } else {
                        str3 = "single";
                    }
                    hashMap.put("follow_type", str3);
                }
                C6501b.C6502a.m13948a("follow").mo12652a((Map<String, String>) hashMap).mo12640a(new C6526e(str, j)).mo12654b("live_interact").mo12656c("core").mo12658d("live_detail").mo12639a().mo12655b();
            } catch (Exception unused) {
            }
        }
    }
}
