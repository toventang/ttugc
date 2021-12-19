package com.bytedance.android.live.liveinteract.cohost.p263a.p267d;

import com.bytedance.android.live.liveinteract.cohost.p263a.p264a.AbstractC4475e;
import com.bytedance.android.live.network.C5805e;
import com.bytedance.android.livesdk.chatroom.api.LinkApi;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p561j.C9009ac;
import com.bytedance.android.livesdk.util.rxutils.autodispose.AbstractC11181z;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.cohost.a.d.d */
public final class C4562d extends AbstractC4475e.AbstractC4476a {

    /* renamed from: b */
    public static final C4563a f12168b = new C4563a((byte) 0);

    /* renamed from: a */
    public final AbstractC4475e.AbstractC4477b f12169a;

    /* renamed from: c */
    private final Map<String, Long> f12170c;

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.a.d.d$b */
    static final class C4564b<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C4564b f12171a = new C4564b();

        static {
            Covode.recordClassIndex(5140);
        }

        C4564b() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.a.d.d$c */
    static final class C4565c<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C4565c f12172a = new C4565c();

        static {
            Covode.recordClassIndex(5141);
        }

        C4565c() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(5138);
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.a.d.d$a */
    public static final class C4563a {
        static {
            Covode.recordClassIndex(5139);
        }

        private C4563a() {
        }

        public /* synthetic */ C4563a(byte b) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4562d(AbstractC4475e.AbstractC4477b bVar, Map<String, Long> map) {
        super(bVar);
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(map, "");
        this.f12169a = bVar;
        this.f12170c = map;
    }

    @Override // com.bytedance.android.live.liveinteract.cohost.p263a.p264a.AbstractC4475e.AbstractC4476a
    /* renamed from: a */
    public final void mo10261a(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        String str;
        ArrayList arrayList = new ArrayList();
        if (z) {
            arrayList.add("Good");
        }
        if (z2) {
            arrayList.add("Poor video quality");
        }
        if (z3) {
            arrayList.add("Poor connection");
        }
        if (z4) {
            arrayList.add("Privacy and safty concerns");
        }
        Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
        if (room != null) {
            j = room.getId();
        } else {
            j = 0;
        }
        Room room2 = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
        if (room2 != null) {
            j2 = room2.getOwnerUserId();
        } else {
            j2 = 0;
        }
        Long l = this.f12170c.get("channel_id");
        if (l != null) {
            j3 = l.longValue();
        } else {
            j3 = 0;
        }
        Long l2 = this.f12170c.get("to_user_id");
        if (l2 != null) {
            j4 = l2.longValue();
        } else {
            j4 = 0;
        }
        Long l3 = this.f12170c.get("invite_type");
        if (l3 != null) {
            j5 = l3.longValue();
        } else {
            j5 = 0;
        }
        if (j != 0 && j2 != 0 && j3 != 0 && j4 != 0 && j5 != 0) {
            ArrayList arrayList2 = new ArrayList();
            if (z) {
                arrayList2.add("good");
            }
            if (z2) {
                arrayList2.add("poor_video_quality");
            }
            if (z3) {
                arrayList2.add("poor_connection");
            }
            if (z4) {
                arrayList2.add("privacy_concern");
            }
            int i = (int) j5;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Room room3 = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
            if (room3 != null) {
                linkedHashMap.put("anchor_id", String.valueOf(room3.getOwnerUserId()));
                linkedHashMap.put("room_id", String.valueOf(room3.getId()));
            }
            linkedHashMap.put("channel_id", String.valueOf(j3));
            linkedHashMap.put("co_host_feedback", arrayList2.toString());
            if (i == 1) {
                str = "mutual_follow";
            } else {
                str = "recommend";
            }
            linkedHashMap.put("invite_type", str);
            C6501b.C6502a.m13948a("connection_over_submit").mo12645a("is_never_recommend", z5 ? 1 : 0).mo12652a((Map<String, String>) linkedHashMap).mo12655b();
            ((AbstractC11181z) ((LinkApi) C5805e.m12718a().mo11572a(LinkApi.class)).reportCustomerFeedback(j, j3, j2, j4, z5, arrayList).mo143274a(mo10250f())).mo17950a(C4564b.f12171a, C4565c.f12172a);
        }
    }
}
