package com.bytedance.android.livesdk.usercard;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.network.C5805e;
import com.bytedance.android.livesdk.chatroom.api.LinkApi;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.p686b.C11688a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1114a.AbstractC16042a;
import com.bytedance.ies.p1114a.AbstractC16043b;
import java.util.HashMap;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;

/* renamed from: com.bytedance.android.livesdk.usercard.x */
public final class C10992x extends AbstractC16043b<AbstractC10994b> {

    /* renamed from: a */
    final C88411a f26464a = new C88411a();

    /* renamed from: b */
    public AbstractC10993a f26465b;

    /* renamed from: c */
    boolean f26466c;

    /* renamed from: com.bytedance.android.livesdk.usercard.x$a */
    public interface AbstractC10993a {
        static {
            Covode.recordClassIndex(12608);
        }

        /* renamed from: a */
        void mo17819a(C11688a aVar);

        /* renamed from: a */
        void mo17820a(Throwable th);
    }

    /* renamed from: com.bytedance.android.livesdk.usercard.x$b */
    public interface AbstractC10994b extends AbstractC16042a {
        static {
            Covode.recordClassIndex(12609);
        }

        /* renamed from: a */
        void mo17831a(User user);

        /* renamed from: a */
        void mo17833a(Throwable th);

        /* renamed from: f */
        void mo17835f();

        /* renamed from: g */
        void mo17836g();
    }

    static {
        Covode.recordClassIndex(12607);
    }

    /* renamed from: a */
    public final void mo17844a() {
        if (this.f38654y != null) {
            ((AbstractC10994b) this.f38654y).mo17836g();
        }
    }

    @Override // com.bytedance.ies.p1114a.AbstractC16043b
    /* renamed from: b */
    public final void mo8577b() {
        super.mo8577b();
        this.f26464a.mo142944a();
    }

    /* renamed from: a */
    public final void mo17846a(HashMap<String, String> hashMap) {
        this.f26464a.mo142945a(C11115u.m19743a().mo17915b().mo13148a(hashMap).mo142909a(C88391a.m153580a(C88392a.f200660a)).mo142915a(new C10995y(this), new C10996z(this)));
    }

    /* renamed from: a */
    public final void mo17845a(Room room, long j) {
        ((LinkApi) C5805e.m12718a().mo11572a(LinkApi.class)).checkPermissionV1(room.getId(), room.getOwnerUserId(), 1, j).mo142918b(C88925a.m154180b(C88946a.f201991c)).mo142909a(C88391a.m153580a(C88392a.f200660a)).mo142915a(new C10944aa(this), C10945ab.f26308a);
    }
}
