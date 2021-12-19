package com.bytedance.android.livesdk.chatroom.detail;

import android.text.TextUtils;
import com.bytedance.android.live.network.C5805e;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.livesdk.chatroom.detail.AbstractC7430b;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.AbstractC88979t;

/* renamed from: com.bytedance.android.livesdk.chatroom.detail.y */
public final class C7466y extends AbstractC7430b {

    /* renamed from: e */
    private final long f18563e;

    /* renamed from: f */
    private final String f18564f;

    static {
        Covode.recordClassIndex(8236);
    }

    /* access modifiers changed from: package-private */
    @Override // com.bytedance.android.livesdk.chatroom.detail.AbstractC7430b
    /* renamed from: c */
    public final AbstractC88979t<C5832d<Room>> mo13652c() {
        String str;
        RoomApi roomApi = (RoomApi) C5805e.m12718a().mo11572a(RoomApi.class);
        if (!TextUtils.isEmpty(C11115u.m19743a().mo17915b().mo13153a(this.f18563e))) {
            str = C11115u.m19743a().mo17915b().mo13153a(this.f18563e);
        } else {
            str = this.f18564f;
        }
        return roomApi.fetchUserRoom(this.f18563e, str);
    }

    public C7466y(AbstractC7430b.AbstractC7431a aVar, long j, String str) {
        super(aVar);
        this.f18563e = j;
        this.f18564f = str;
    }
}
