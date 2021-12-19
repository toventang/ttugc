package com.bytedance.android.live.broadcast.utils;

import android.text.TextUtils;
import com.bytedance.android.live.broadcast.model.C3270n;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.publicscreen.p386a.AbstractC5880e;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p452ao.AbstractC6804a;
import com.bytedance.android.livesdk.p452ao.C6805b;
import com.bytedance.android.livesdk.p561j.C9009ac;
import com.bytedance.android.livesdk.p561j.C9140v;
import com.bytedance.android.livesdk.p561j.C9141w;
import com.bytedance.android.livesdkapi.depend.model.live.C11729j;
import com.bytedance.android.livesdkapi.depend.model.live.EnumC11728i;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.concurrent.TimeUnit;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.broadcast.utils.f */
public final class C3726f {

    /* renamed from: a */
    public static final C3727a f10324a = new C3727a((byte) 0);

    static {
        Covode.recordClassIndex(4241);
    }

    /* renamed from: com.bytedance.android.live.broadcast.utils.f$a */
    public static final class C3727a {
        static {
            Covode.recordClassIndex(4242);
        }

        private C3727a() {
        }

        public /* synthetic */ C3727a(byte b) {
            this();
        }

        /* renamed from: a */
        public static void m9235a(Room room) {
            if (room != null) {
                ((AbstractC5880e) C6193a.m13435a(AbstractC5880e.class)).onStartStreaming(room.getId());
            }
        }

        /* renamed from: a */
        public static void m9236a(Room room, DataChannel dataChannel) {
            long j;
            long j2;
            String str;
            long currentTimeMillis;
            String str2;
            String str3;
            EnumC11728i streamType;
            AbstractC5880e eVar = (AbstractC5880e) C6193a.m13435a(AbstractC5880e.class);
            long j3 = 0;
            if (room != null) {
                j = room.getId();
            } else {
                j = 0;
            }
            eVar.onStopStreaming(j);
            AbstractC5880e eVar2 = (AbstractC5880e) C6193a.m13435a(AbstractC5880e.class);
            if (room != null) {
                j2 = room.getId();
            } else {
                j2 = 0;
            }
            long hotDuration = eVar2.getHotDuration(j2);
            AbstractC5880e eVar3 = (AbstractC5880e) C6193a.m13435a(AbstractC5880e.class);
            if (room != null) {
                j3 = room.getId();
            }
            eVar3.resetDuration(j3);
            C3270n.C3271a aVar = (C3270n.C3271a) DataChannelGlobal.f42558d.mo28324b(C9140v.class);
            if (aVar == null || (str = aVar.f9365b) == null) {
                str = "";
            }
            long currentTimeMillis2 = System.currentTimeMillis();
            Long l = (Long) DataChannelGlobal.f42558d.mo28324b(C9141w.class);
            if (l != null) {
                currentTimeMillis = l.longValue();
            } else {
                currentTimeMillis = System.currentTimeMillis();
            }
            long j4 = currentTimeMillis2 - currentTimeMillis;
            C6501b a = C6501b.C6502a.m13948a("livesdk_live_over");
            if (room == null || (streamType = room.getStreamType()) == null) {
                str2 = null;
            } else {
                str2 = C11729j.m20684a(streamType);
            }
            C6501b a2 = a.mo12651a("live_type", str2).mo12646a("hot_duration", TimeUnit.MILLISECONDS.toSeconds(hotDuration)).mo12643a(dataChannel).mo12658d("live_take_detail").mo12651a("duration", String.valueOf(j4 / 1000)).mo12651a("take_definition", str);
            if (room != null && room.isScreenshot) {
                if (room.gameCategoryInfo != null) {
                    if (TextUtils.isEmpty(room.gameCategoryInfo.f23981a)) {
                        a2.mo12651a("selected_app_name", "none");
                    } else {
                        a2.mo12651a("selected_app_name", room.gameCategoryInfo.f23981a);
                    }
                    if (TextUtils.isEmpty(room.gameCategoryInfo.f23982b)) {
                        a2.mo12651a("selected_app_id", "none");
                    } else {
                        a2.mo12651a("selected_app_id", room.gameCategoryInfo.f23982b);
                    }
                }
                C6805b<Boolean> bVar = AbstractC6804a.f16932ah;
                C89219l.m154716b(bVar, "");
                Boolean a3 = bVar.mo13066a();
                C89219l.m154716b(a3, "");
                String str4 = "on";
                if (a3.booleanValue()) {
                    str3 = str4;
                } else {
                    str3 = "off";
                }
                C6501b a4 = a2.mo12651a("screen_share_comment_push_setting", str3);
                C6805b<Boolean> bVar2 = AbstractC6804a.f16933ai;
                C89219l.m154716b(bVar2, "");
                Boolean a5 = bVar2.mo13066a();
                C89219l.m154716b(a5, "");
                if (!a5.booleanValue()) {
                    str4 = "off";
                }
                a4.mo12651a("screen_share_gift_push_setting", str4);
            }
            a2.mo12655b();
        }

        /* renamed from: a */
        public static void m9237a(String str, int i, long j, long j2) {
            Long l;
            Long l2;
            EnumC11728i streamType;
            C89219l.m154721d(str, "");
            if (!TextUtils.isEmpty(str) && !C89219l.m154714a((Object) str, (Object) "0")) {
                Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
                C6501b a = C6501b.C6502a.m13948a("livesdk_live_filter_use_time").mo12651a("event_page", "live_take_detail");
                String str2 = null;
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
                C6501b a3 = a2.mo12650a("room_id", (Number) l2).mo12651a("filter_id", str).mo12645a("impr_position", i).mo12646a("use_time", j2 - j);
                if (!(room == null || (streamType = room.getStreamType()) == null)) {
                    str2 = C11729j.m20684a(streamType);
                }
                a3.mo12651a("live_type", str2).mo12655b();
            }
        }
    }
}
