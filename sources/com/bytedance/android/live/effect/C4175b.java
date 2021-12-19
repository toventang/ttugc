package com.bytedance.android.live.effect;

import android.os.Handler;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.api.C3046c;
import com.bytedance.android.live.core.p218f.C3940j;
import com.bytedance.android.live.effect.api.AbstractC4167d;
import com.bytedance.android.live.effect.api.C4165b;
import com.bytedance.android.live.effect.model.FilterModel;
import com.bytedance.android.live.effect.p241b.C4187e;
import com.bytedance.android.live.effect.p242c.C4208j;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p561j.C9009ac;
import com.bytedance.android.livesdk.p561j.C9019am;
import com.bytedance.android.livesdk.p561j.C9082cu;
import com.bytedance.android.livesdk.p561j.C9132n;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.android.livesdkapi.depend.model.live.C11729j;
import com.bytedance.android.livesdkapi.depend.model.live.EnumC11728i;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.Iterator;
import java.util.List;
import p4600h.C89386u;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.effect.b */
public final class C4175b implements AbstractC4167d {

    /* renamed from: a */
    public static final C4175b f11604a = new C4175b();

    /* renamed from: c */
    private static RunnableC4176a f11605c;

    /* renamed from: d */
    private static RunnableC4177b f11606d;

    private C4175b() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0059, code lost:
        if (r4 != null) goto L_0x005c;
     */
    @Override // com.bytedance.android.live.effect.api.AbstractC4167d
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo9877a(java.lang.String r11, float r12, int r13, boolean r14) {
        /*
        // Method dump skipped, instructions count: 308
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.effect.C4175b.mo9877a(java.lang.String, float, int, boolean):void");
    }

    /* renamed from: com.bytedance.android.live.effect.b$a */
    static final class RunnableC4176a implements Runnable {

        /* renamed from: a */
        DataChannel f11607a;

        /* renamed from: b */
        boolean f11608b;

        static {
            Covode.recordClassIndex(4746);
        }

        public final void run() {
            C4175b.m10177a(this.f11607a, this.f11608b, "livesdk_live_take_beauty_effective_use", false);
        }
    }

    static {
        Covode.recordClassIndex(4745);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.effect.b$b */
    public static final class RunnableC4177b implements Runnable {

        /* renamed from: a */
        DataChannel f11609a;

        /* renamed from: b */
        boolean f11610b;

        /* renamed from: c */
        String f11611c = "";

        /* renamed from: d */
        boolean f11612d;

        /* renamed from: e */
        int f11613e;

        static {
            Covode.recordClassIndex(4747);
        }

        public final void run() {
            C4175b.m10178a("live_take_filter_effective_use", this.f11609a, this.f11610b, this.f11611c, this.f11612d, this.f11613e);
            DataChannel dataChannel = this.f11609a;
            if (dataChannel != null) {
                dataChannel.mo28311a(C4165b.class, (Object) true);
            }
            DataChannelGlobal.f42558d.mo28321a(C9132n.class, true);
        }
    }

    @Override // com.bytedance.android.live.effect.api.AbstractC4167d
    /* renamed from: a */
    public final void mo9873a(Handler handler) {
        C89219l.m154721d(handler, "");
        RunnableC4176a aVar = f11605c;
        if (aVar != null) {
            handler.removeCallbacks(aVar);
        }
        RunnableC4177b bVar = f11606d;
        if (bVar != null) {
            handler.removeCallbacks(bVar);
        }
        f11605c = null;
        f11606d = null;
    }

    /* renamed from: a */
    public static boolean m10179a(String str) {
        String str2 = "";
        C89219l.m154721d(str, str2);
        float a = C4208j.C4212b.f11691a.mo9919a(str);
        C89386u uVar = (C89386u) DataChannelGlobal.f42558d.mo28324b(C9082cu.class);
        if (uVar == null) {
            uVar = new C89386u(str2, Float.valueOf(-1.0f), 0);
        }
        if (!C89219l.m154714a(uVar.getFirst(), (Object) str) || ((Number) uVar.getSecond()).floatValue() != a) {
            return true;
        }
        String str3 = (String) DataChannelGlobal.f42558d.mo28324b(C9019am.class);
        if (str3 != null) {
            str2 = str3;
        }
        if (!C11279p.m20026d() || TextUtils.isEmpty(str2) || !(!C89219l.m154714a((Object) str2, (Object) "0"))) {
            return false;
        }
        DataChannelGlobal.f42558d.mo28327c(C9019am.class);
        return true;
    }

    /* renamed from: b */
    public static void m10180b(String str) {
        long j;
        Long l;
        Long l2;
        EnumC11728i streamType;
        Long l3;
        String str2;
        String str3 = "";
        C89219l.m154721d(str, str3);
        if (!C11279p.m20022c() && m10179a(str) && DataChannelGlobal.f42558d.mo28324b(C9082cu.class) != null) {
            C89386u uVar = (C89386u) DataChannelGlobal.f42558d.mo28324b(C9082cu.class);
            if (!(uVar == null || (str2 = (String) uVar.getFirst()) == null)) {
                str3 = str2;
            }
            if (!TextUtils.isEmpty(str3) && !C89219l.m154714a((Object) str3, (Object) "0")) {
                long currentTimeMillis = System.currentTimeMillis();
                if (uVar == null || (l3 = (Long) uVar.getThird()) == null) {
                    j = 0;
                } else {
                    j = l3.longValue();
                }
                Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
                C6501b a = C6501b.C6502a.m13948a("livesdk_live_filter_use_time").mo12651a("event_page", "live_take_detail");
                String str4 = null;
                if (room != null) {
                    l = Long.valueOf(room.getOwnerUserId());
                } else {
                    l = null;
                }
                C6501b a2 = a.mo12650a("anchor_id", (Number) l);
                if (room != null) {
                    l2 = Long.valueOf(room.getId());
                } else {
                    l2 = null;
                }
                C6501b a3 = a2.mo12650a("room_id", (Number) l2).mo12651a("filter_id", str3).mo12646a("use_time", currentTimeMillis - j);
                if (!(room == null || (streamType = room.getStreamType()) == null)) {
                    str4 = C11729j.m20684a(streamType);
                }
                a3.mo12651a("live_type", str4).mo12655b();
            }
        }
    }

    @Override // com.bytedance.android.live.effect.api.AbstractC4167d
    /* renamed from: a */
    public final void mo9875a(DataChannel dataChannel, boolean z) {
        m10177a(dataChannel, z, "livesdk_live_take_beauty_select", true);
    }

    @Override // com.bytedance.android.live.effect.api.AbstractC4167d
    /* renamed from: a */
    public final void mo9874a(Handler handler, DataChannel dataChannel, boolean z) {
        C89219l.m154721d(handler, "");
        if (C11279p.m20026d()) {
            if (f11605c == null) {
                f11605c = new RunnableC4176a();
            }
            RunnableC4176a aVar = f11605c;
            if (aVar != null) {
                handler.removeCallbacks(aVar);
                aVar.f11607a = dataChannel;
                aVar.f11608b = z;
                handler.postDelayed(aVar, 30000);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0057, code lost:
        if (r0.intValue() >= 0) goto L_0x009f;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m10176a(com.bytedance.android.livesdkapi.depend.model.live.Room r7, com.bytedance.android.livesdkapi.depend.model.C11672a r8, long r9, com.bytedance.android.livesdk.p425aa.p428c.C6525d r11) {
        /*
        // Method dump skipped, instructions count: 315
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.effect.C4175b.m10176a(com.bytedance.android.livesdkapi.depend.model.live.Room, com.bytedance.android.livesdkapi.depend.model.a, long, com.bytedance.android.livesdk.aa.c.d):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:109:0x020c, code lost:
        if (r23 == false) goto L_0x00de;
     */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0115  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m10177a(com.bytedance.ies.sdk.datachannel.DataChannel r22, boolean r23, java.lang.String r24, boolean r25) {
        /*
        // Method dump skipped, instructions count: 715
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.effect.C4175b.m10177a(com.bytedance.ies.sdk.datachannel.DataChannel, boolean, java.lang.String, boolean):void");
    }

    @Override // com.bytedance.android.live.effect.api.AbstractC4167d
    /* renamed from: b */
    public final void mo9878b(DataChannel dataChannel, boolean z, String str, boolean z2, int i) {
        C89219l.m154721d(str, "");
        if (str.length() == 0 || C89219l.m154714a((Object) str, (Object) "0")) {
            RunnableC4177b bVar = f11606d;
            Handler a = C3940j.m9594a();
            if (bVar != null) {
                a.removeCallbacks(bVar);
            }
        } else if (m10179a(str) && C11279p.m20026d()) {
            if (f11606d == null) {
                f11606d = new RunnableC4177b();
            }
            Boolean bool = (Boolean) DataChannelGlobal.f42558d.mo28324b(C3046c.class);
            Handler a2 = C3940j.m9594a();
            RunnableC4177b bVar2 = f11606d;
            if (bVar2 != null) {
                a2.removeCallbacks(bVar2);
                if (bool != null) {
                    z2 = bool.booleanValue();
                }
                C89219l.m154721d(str, "");
                bVar2.f11609a = dataChannel;
                bVar2.f11610b = z;
                bVar2.f11611c = str;
                bVar2.f11612d = z2;
                bVar2.f11613e = i;
                a2.postDelayed(bVar2, 30000);
                DataChannelGlobal.f42558d.mo28321a(C3046c.class, null);
            }
        }
    }

    @Override // com.bytedance.android.live.effect.api.AbstractC4167d
    /* renamed from: a */
    public final void mo9876a(DataChannel dataChannel, boolean z, String str, boolean z2, int i) {
        C89219l.m154721d(str, "");
        if (str.length() != 0 && !C89219l.m154714a((Object) str, (Object) "0") && m10179a(str)) {
            m10178a("live_take_filter_select", dataChannel, z, str, z2, i);
        }
    }

    /* renamed from: a */
    public static void m10178a(String str, DataChannel dataChannel, boolean z, String str2, boolean z2, int i) {
        String str3;
        String str4;
        T t;
        int i2;
        User owner;
        C6501b b = C6501b.C6502a.m13948a(str).mo12654b("live_take");
        if (z2) {
            str3 = "click";
        } else {
            str3 = "draw";
        }
        C6501b a = b.mo12661f(str3).mo12651a("filter_id", str2);
        if (dataChannel != null) {
            a.mo12643a(dataChannel);
        } else {
            a.mo12639a();
        }
        List<FilterModel> list = C4208j.C4212b.f11691a.f11679a;
        C89219l.m154716b(list, "");
        Iterator<T> it = list.iterator();
        while (true) {
            str4 = null;
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            T t2 = t;
            C89219l.m154716b(t2, "");
            if (C89219l.m154714a((Object) t2.getFilterId(), (Object) str2)) {
                break;
            }
        }
        T t3 = t;
        if (t3 != null) {
            float d = C4208j.C4212b.f11691a.mo9901d(t3);
            int a2 = C4187e.m10265a(t3.filterConfig.f11842a, t3.filterConfig.f11843b, d);
            if (d != 0.0f) {
                Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
                C6501b a3 = a.mo12645a("is_live_take_default", z ? 1 : 0).mo12645a("impr_position", i);
                if (!(room == null || (owner = room.getOwner()) == null)) {
                    str4 = owner.getIdStr();
                }
                C6501b a4 = a3.mo12662g(str4).mo12649a("filter_value", Float.valueOf(d));
                if (a2 == t3.filterConfig.f11844c) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                a4.mo12645a("is_default_value", i2).mo12655b();
            }
        }
    }
}
