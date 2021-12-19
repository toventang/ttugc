package com.bytedance.android.livesdk.chatroom.detail;

import android.content.Context;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.chatroom.p499ui.DialogC7813bq;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.p680d.C11661o;
import com.bytedance.android.livesdkapi.host.AbstractC11815j;
import com.bytedance.android.livesdkapi.session.C11870f;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.chatroom.detail.g */
public final class C7438g {

    /* renamed from: d */
    public static final C7439a f18454d = new C7439a((byte) 0);

    /* renamed from: a */
    public Context f18455a;

    /* renamed from: b */
    public EnterRoomConfig.GuestUser f18456b;

    /* renamed from: c */
    public Room f18457c;

    static {
        Covode.recordClassIndex(8208);
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.detail.g$a */
    public static final class C7439a {
        static {
            Covode.recordClassIndex(8209);
        }

        private C7439a() {
        }

        public /* synthetic */ C7439a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.detail.g$c */
    public static final class C7441c implements DialogC7813bq.AbstractC7815b {

        /* renamed from: a */
        final /* synthetic */ C7438g f18459a;

        /* renamed from: b */
        final /* synthetic */ Room f18460b;

        static {
            Covode.recordClassIndex(8211);
        }

        @Override // com.bytedance.android.livesdk.chatroom.p499ui.DialogC7813bq.AbstractC7815b
        /* renamed from: a */
        public final void mo13659a() {
            C7438g gVar = this.f18459a;
            Room room = this.f18460b;
            EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
            EnterRoomConfig.RoomsData roomsData = enterRoomConfig.f28233c;
            C11870f fVar = C11870f.C11871a.f28404a;
            C89219l.m154716b(fVar, "");
            EnterRoomLinkSession a = fVar.mo19010a();
            C89219l.m154716b(a, "");
            roomsData.f28340au = a.f28391b.f28233c.f28340au;
            C11661o.m20565a(room, "", enterRoomConfig);
            enterRoomConfig.f28233c.f28293J = "live_detail";
            enterRoomConfig.f28233c.f28295L = "guest_connection_distribution";
            EnterRoomLinkSession enterRoomLinkSession = new EnterRoomLinkSession(enterRoomConfig);
            C11870f fVar2 = C11870f.C11871a.f28404a;
            C89219l.m154716b(fVar2, "");
            fVar2.mo19012a(enterRoomLinkSession);
            AbstractC11815j jVar = (AbstractC11815j) C6193a.m13435a(AbstractC11815j.class);
            if (jVar != null) {
                Context context = gVar.f18455a;
                if (context == null) {
                    C89219l.m154710a("context");
                }
                jVar.mo18880b(context, enterRoomConfig);
            }
        }

        C7441c(C7438g gVar, Room room) {
            this.f18459a = gVar;
            this.f18460b = room;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.detail.g$b */
    public static final class C7440b implements AbstractC88986z<C5832d<Room>> {

        /* renamed from: a */
        final /* synthetic */ C7438g f18458a;

        static {
            Covode.recordClassIndex(8210);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onComplete() {
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onError(Throwable th) {
            C89219l.m154721d(th, "");
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onSubscribe(AbstractC88412b bVar) {
            C89219l.m154721d(bVar, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public C7440b(C7438g gVar) {
            this.f18458a = gVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.AbstractC88986z
        public final /* synthetic */ void onNext(C5832d<Room> dVar) {
            Room room;
            Long l;
            C5832d<Room> dVar2 = dVar;
            C89219l.m154721d(dVar2, "");
            if (dVar2.data != null && ((room = (Room) dVar2.data) == null || room.getId() != 0)) {
                Room room2 = (Room) dVar2.data;
                Long l2 = null;
                if (room2 != null) {
                    l = Long.valueOf(room2.getId());
                } else {
                    l = null;
                }
                Room room3 = this.f18458a.f18457c;
                if (room3 != null) {
                    l2 = Long.valueOf(room3.getId());
                }
                if (!C89219l.m154714a(l, l2)) {
                    C7438g gVar = this.f18458a;
                    Room room4 = (Room) dVar2.data;
                    Context context = gVar.f18455a;
                    if (context == null) {
                        C89219l.m154710a("context");
                    }
                    Context context2 = gVar.f18455a;
                    if (context2 == null) {
                        C89219l.m154710a("context");
                    }
                    Object[] objArr = new Object[1];
                    EnterRoomConfig.GuestUser guestUser = gVar.f18456b;
                    if (guestUser == null) {
                        C89219l.m154710a("guestUser");
                    }
                    objArr[0] = guestUser.f28240b;
                    String string = context2.getString(R.string.eb5, objArr);
                    Context context3 = gVar.f18455a;
                    if (context3 == null) {
                        C89219l.m154710a("context");
                    }
                    String string2 = context3.getString(R.string.e79);
                    C7441c cVar = new C7441c(gVar, room4);
                    C89219l.m154721d(context, "");
                    DialogC7813bq bqVar = new DialogC7813bq(context);
                    bqVar.f19386a = cVar;
                    bqVar.f19387b = string;
                    bqVar.f19388c = string2;
                    bqVar.show();
                    return;
                }
            }
            Context context4 = this.f18458a.f18455a;
            if (context4 == null) {
                C89219l.m154710a("context");
            }
            Object[] objArr2 = new Object[1];
            EnterRoomConfig.GuestUser guestUser2 = this.f18458a.f18456b;
            if (guestUser2 == null) {
                C89219l.m154710a("guestUser");
            }
            objArr2[0] = guestUser2.f28240b;
            C11226ao.m19883a(C3966y.m9669e(), context4.getString(R.string.e7u, objArr2), 0);
        }
    }
}
