package com.bytedance.android.livesdk.chatroom.p492g;

import android.text.TextUtils;
import com.bytedance.android.live.base.AbstractC2953a;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.live.base.model.user.AbstractC2994b;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.AbstractC4409b;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.chatroom.C7411d;
import com.bytedance.android.livesdk.chatroom.p488c.AbstractC7394l;
import com.bytedance.android.livesdk.model.C9542az;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p425aa.C6544e;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.p561j.C9036bc;
import com.bytedance.android.livesdk.p561j.C9093de;
import com.bytedance.android.livesdk.p561j.C9119ed;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.chatroom.g.b */
public final class C7569b {

    /* renamed from: a */
    public static final C7569b f18789a = new C7569b();

    private C7569b() {
    }

    static {
        Covode.recordClassIndex(8342);
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.g.b$a */
    public static final class C7570a extends AbstractC89220m implements AbstractC89172b<EmoteModel, CharSequence> {

        /* renamed from: a */
        public static final C7570a f18790a = new C7570a();

        static {
            Covode.recordClassIndex(8343);
        }

        C7570a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ CharSequence invoke(EmoteModel emoteModel) {
            EmoteModel emoteModel2 = emoteModel;
            C89219l.m154721d(emoteModel2, "");
            String str = emoteModel2.f8727g;
            C89219l.m154716b(str, "");
            return str;
        }
    }

    /* renamed from: a */
    public static void m15556a(C6501b bVar) {
        AbstractC2953a a = C6193a.m13435a(AbstractC4409b.class);
        C89219l.m154716b(a, "");
        bVar.mo12651a("send_comment_scene", ((AbstractC4409b) a).getRoomScene());
    }

    /* renamed from: a */
    public static void m15558a(DataChannel dataChannel) {
        if (dataChannel != null) {
            C6501b a = C6501b.C6502a.m13948a("livesdk_anchor_live_message");
            a.mo12643a(dataChannel);
            m15556a(a);
            a.mo12655b();
        }
    }

    /* renamed from: a */
    public static void m15557a(C6501b bVar, DataChannel dataChannel) {
        String str;
        if (dataChannel != null) {
            Room room = (Room) dataChannel.mo28318b(C9093de.class);
            AbstractC6872f b = C11115u.m19743a().mo17915b();
            C89219l.m154716b(b, "");
            long c = b.mo13161c();
            if (room == null || c != room.getOwnerUserId()) {
                AbstractC2994b a = b.mo13147a();
                C89219l.m154716b(a, "");
                C9542az userAttr = a.getUserAttr();
                if (userAttr == null || !userAttr.f23192b) {
                    str = "user";
                } else {
                    str = "admin";
                }
            } else {
                str = "anchor";
            }
            bVar.mo12651a("admin_type", str);
        }
    }

    /* renamed from: a */
    public static void m15559a(DataChannel dataChannel, boolean z, long j, String str, boolean z2, boolean z3, AbstractC7394l.EnumC7395a aVar, long j2) {
        boolean z4;
        String str2;
        String str3;
        Long l;
        String str4;
        String str5;
        String str6;
        String str7;
        User owner;
        C89219l.m154721d(str, "");
        C89219l.m154721d(aVar, "");
        if (dataChannel != null) {
            String g = C6544e.m13993g();
            boolean z5 = false;
            if (TextUtils.isEmpty(g) || !C89219l.m154714a((Object) "click_push_live_cd_user", (Object) g)) {
                z4 = false;
            } else {
                z4 = true;
            }
            Room room = (Room) dataChannel.mo28318b(C9093de.class);
            Boolean bool = (Boolean) dataChannel.mo28318b(C9119ed.class);
            if (bool != null) {
                z5 = bool.booleanValue();
            }
            C6501b a = C6501b.C6502a.m13948a("livesdk_audience_live_message");
            a.mo12643a(dataChannel);
            a.mo12654b("live_interact");
            String str8 = "0";
            if (z) {
                str2 = "1";
            } else {
                str2 = str8;
            }
            a.mo12651a("with_emoji", str2);
            Object b = dataChannel.mo28318b(C9036bc.class);
            if (b == null) {
                C89219l.m154715b();
            }
            String str9 = "chat_room";
            if (((Boolean) b).booleanValue()) {
                str3 = str9;
            } else {
                str3 = "bubble";
            }
            a.mo12651a("comment_pannel_type", str3);
            C7411d a2 = C7411d.m15284a();
            C89219l.m154716b(a2, "");
            a.mo12651a("enter_live_method", a2.mo13614e());
            a.mo12651a("comment_id", String.valueOf(j));
            if (room == null || (owner = room.getOwner()) == null) {
                l = null;
            } else {
                l = Long.valueOf(owner.getId());
            }
            a.mo12651a("to_user_id", String.valueOf(l));
            a.mo12651a("live_source", str);
            if (room != null) {
                str4 = room.getSourceType();
            } else {
                str4 = null;
            }
            a.mo12651a("moment_room_source", str4);
            if (!C89219l.m154714a(dataChannel.mo28318b(C9036bc.class), (Object) true)) {
                str9 = "bubble";
            }
            a.mo12651a("comment_pannel_type", str9);
            if (j2 != 0) {
                str5 = "1";
            } else {
                str5 = str8;
            }
            a.mo12651a("is_message_reply", str5);
            if (z4) {
                str8 = "1";
            }
            a.mo12651a("is_subscribe", str8);
            if (z2) {
                str6 = "portrait";
            } else {
                str6 = "landscape";
            }
            a.mo12651a("room_orientation", str6);
            if (!z5) {
                AbstractC2953a a3 = C6193a.m13435a(AbstractC4409b.class);
                C89219l.m154716b(a3, "");
                if (((AbstractC4409b) a3).isRoomInBattle()) {
                    a.mo12651a("connection_type", "manual_pk");
                    AbstractC2953a a4 = C6193a.m13435a(AbstractC4409b.class);
                    C89219l.m154716b(a4, "");
                    a.mo12651a("pk_id", String.valueOf(((AbstractC4409b) a4).getBattleId()));
                }
            }
            if (z3) {
                str7 = "sub_only";
            } else {
                str7 = "normal";
            }
            a.mo12651a("mode", str7);
            if (aVar == AbstractC7394l.EnumC7395a.QA) {
                a.mo12651a("is_from_denied_qa", "1");
            }
            if (j2 != 0) {
                a.mo12646a("reply_user_id", j2);
            }
            m15556a(a);
            a.mo12655b();
        }
    }
}
