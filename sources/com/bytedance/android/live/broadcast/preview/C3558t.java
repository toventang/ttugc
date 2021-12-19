package com.bytedance.android.live.broadcast.preview;

import com.bytedance.android.live.C4139e;
import com.bytedance.android.live.broadcast.C3012ad;
import com.bytedance.android.live.broadcast.C3015ag;
import com.bytedance.android.live.broadcast.C3247i;
import com.bytedance.android.live.broadcast.C3802x;
import com.bytedance.android.live.broadcast.api.p185c.C3051c;
import com.bytedance.android.live.broadcast.model.C3272o;
import com.bytedance.android.livesdk.chatroom.model.C7694n;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBeautyParamSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveObsBroadcastGuideStrategySetting;
import com.bytedance.android.livesdk.p425aa.C6497a;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p425aa.C6519c;
import com.bytedance.android.livesdk.p452ao.AbstractC6804a;
import com.bytedance.android.livesdk.p452ao.C6805b;
import com.bytedance.android.livesdk.p561j.C9009ac;
import com.bytedance.android.livesdk.p561j.C9094df;
import com.bytedance.android.livesdkapi.depend.model.live.C11729j;
import com.bytedance.android.livesdkapi.depend.model.live.EnumC11728i;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.google.gson.C27910f;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.broadcast.preview.t */
public final class C3558t {

    /* renamed from: a */
    public static long f9868a;

    static {
        Covode.recordClassIndex(4042);
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.t$a */
    static final class RunnableC3559a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f9869a;

        static {
            Covode.recordClassIndex(4043);
        }

        RunnableC3559a(String str) {
            this.f9869a = str;
        }

        public final void run() {
            String str;
            C6497a a = C3051c.C3052a.m8359a("ttlive_enter_preview_all");
            C6805b<Float> bVar = AbstractC6804a.f16888Q;
            C89219l.m154716b(bVar, "");
            C6497a a2 = a.mo12626a("beauty_skin", bVar.mo13066a());
            C6805b<Float> bVar2 = AbstractC6804a.f16889R;
            C89219l.m154716b(bVar2, "");
            C6497a a3 = a2.mo12626a("big_eyes", bVar2.mo13066a());
            C6805b<Float> bVar3 = AbstractC6804a.f16890S;
            C89219l.m154716b(bVar3, "");
            C6497a a4 = a3.mo12626a("face_lift", bVar3.mo13066a()).mo12626a("beauty_skin_default", Float.valueOf(LiveBeautyParamSetting.INSTANCE.getValue().f23102b.f23107b)).mo12626a("beauty_skin_scale", Float.valueOf(LiveBeautyParamSetting.INSTANCE.getValue().f23102b.f23106a)).mo12626a("big_eyes_default", Float.valueOf(LiveBeautyParamSetting.INSTANCE.getValue().f23103c.f23107b)).mo12626a("big_eyes_scale", Float.valueOf(LiveBeautyParamSetting.INSTANCE.getValue().f23103c.f23106a)).mo12626a("face_lift_default", Float.valueOf(LiveBeautyParamSetting.INSTANCE.getValue().f23104d.f23107b)).mo12626a("face_lift_scale", Float.valueOf(LiveBeautyParamSetting.INSTANCE.getValue().f23104d.f23106a));
            C6805b<Integer> bVar4 = AbstractC6804a.f17058i;
            C89219l.m154716b(bVar4, "");
            Integer a5 = bVar4.mo13066a();
            if (a5 != null && a5.intValue() == 1) {
                str = "front";
            } else {
                str = "back";
            }
            C6497a a6 = a4.mo12629a("camera_type", str).mo12629a("live_mode", this.f9869a);
            C6805b<Integer> bVar5 = AbstractC6804a.f16886O;
            C89219l.m154716b(bVar5, "");
            C6497a a7 = a6.mo12627a("filter_position", bVar5.mo13066a());
            a7.f16147c = true;
            a7.mo12632a();
        }
    }

    /* renamed from: a */
    public static final int m8950a(EnumC11728i iVar) {
        String str;
        C27910f fVar = C4139e.C4140a.f11575b;
        C6805b<Map<String, String>> bVar = AbstractC6804a.f16884M;
        C89219l.m154716b(bVar, "");
        Map<String, String> a = bVar.mo13066a();
        if (iVar != null) {
            str = iVar.name();
        } else {
            str = null;
        }
        C7694n nVar = (C7694n) fVar.mo46670a(a.get(str), C7694n.class);
        if (nVar != null) {
            return nVar.f19072a;
        }
        return -1;
    }

    /* renamed from: a */
    public static final void m8952a(DataChannel dataChannel) {
        String str;
        String str2;
        C6501b a = C6501b.C6502a.m13948a("live_edit_features").mo12643a(dataChannel).mo12656c("click").mo12654b("live").mo12658d("live_action").mo12660e("title").mo12651a("live_edit_type", "title");
        if (dataChannel != null) {
            str = (String) dataChannel.mo28318b(C3012ad.class);
        } else {
            str = null;
        }
        if (str == null || str.length() == 0) {
            str2 = "off";
        } else {
            str2 = "on";
        }
        a.mo12651a("title_status", str2).mo12655b();
        m8954a(dataChannel, false);
    }

    /* renamed from: a */
    public static final void m8953a(DataChannel dataChannel, String str) {
        C6501b.C6502a.m13948a("livesdk_more_icon_click").mo12643a(dataChannel).mo12658d("live_take_page").mo12651a("direction", str).mo12655b();
    }

    /* renamed from: a */
    public static final String m8951a(String str, String str2) {
        int hashCode;
        if (str2 != null && ((hashCode = str2.hashCode()) == -1572049565 ? str2.equals("notification_page") : !(hashCode == 3452698 ? !str2.equals("push") : hashCode != 823500643 || !str2.equals("inner_push")))) {
            return str2;
        }
        if (str == null) {
            return "camera";
        }
        return str;
    }

    /* renamed from: b */
    public static final void m8957b(String str, DataChannel dataChannel) {
        String str2;
        Long l;
        EnumC11728i streamType;
        C89219l.m154721d(str, "");
        Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
        C6501b a = C6501b.C6502a.m13948a("livesdk_back_to_live").mo12643a(dataChannel);
        String str3 = null;
        if (room != null) {
            str2 = room.getIdStr();
        } else {
            str2 = null;
        }
        C6501b h = a.mo12663h(str2);
        if (room != null) {
            l = Long.valueOf(room.getOwnerUserId());
        } else {
            l = null;
        }
        C6501b g = h.mo12662g(String.valueOf(l));
        if (!(room == null || (streamType = room.getStreamType()) == null)) {
            str3 = C11729j.m20684a(streamType);
        }
        g.mo12644a(str3).mo12661f(str).mo12655b();
    }

    /* renamed from: a */
    public static final void m8954a(DataChannel dataChannel, boolean z) {
        boolean z2;
        String str;
        String str2;
        EnumC11728i iVar;
        if (LiveObsBroadcastGuideStrategySetting.INSTANCE.getValue() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        C6501b a = C6519c.m13965a(C6501b.C6502a.m13948a("live_action").mo12643a(dataChannel).mo12656c("click").mo12654b("live").mo12658d("live_action").mo12660e("action"), dataChannel);
        String str3 = (String) DataChannelGlobal.f42558d.mo28324b(C3015ag.class);
        String str4 = null;
        if (dataChannel != null) {
            str = (String) dataChannel.mo28318b(C3247i.class);
        } else {
            str = null;
        }
        C6501b a2 = a.mo12651a("enter_from", m8951a(str3, str));
        if (!(dataChannel == null || (iVar = (EnumC11728i) dataChannel.mo28318b(C3802x.class)) == null)) {
            str4 = C11729j.m20684a(iVar);
        }
        C6501b a3 = a2.mo12651a("live_type", str4);
        String str5 = "1";
        if (z2) {
            str2 = str5;
        } else {
            str2 = "0";
        }
        C6501b a4 = a3.mo12651a("is_pc_guidance", str2);
        if (!z) {
            str5 = "0";
        }
        a4.mo12651a("is_application_needed", str5).mo12655b();
    }

    /* renamed from: a */
    public static final void m8955a(String str, DataChannel dataChannel) {
        Long l;
        EnumC11728i iVar;
        C3272o oVar;
        C89219l.m154721d(str, "");
        C6501b a = C6501b.C6502a.m13948a("anchor_enter_room").mo12643a(dataChannel);
        String str2 = null;
        if (dataChannel == null || (oVar = (C3272o) dataChannel.mo28318b(C9094df.class)) == null) {
            l = null;
        } else {
            l = Long.valueOf(oVar.f9368c);
        }
        C6501b a2 = a.mo12650a("room_id", (Number) l);
        if (!(dataChannel == null || (iVar = (EnumC11728i) dataChannel.mo28318b(C3802x.class)) == null)) {
            str2 = C11729j.m20684a(iVar);
        }
        a2.mo12651a("live_type", str2).mo12651a("action_type", str).mo12655b();
    }

    /* renamed from: a */
    public static final void m8956a(String str, String str2, EnumC11728i iVar, boolean z) {
        String str3;
        String str4;
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C6497a a = C3051c.C3052a.m8359a("ttlive_open_room").mo12629a("title", str).mo12629a("cover", str2);
        if (iVar != null) {
            str3 = iVar.name();
        } else {
            str3 = null;
        }
        C6497a a2 = a.mo12629a("live_mode", str3);
        C6805b<Integer> bVar = AbstractC6804a.f16886O;
        C89219l.m154716b(bVar, "");
        C6497a a3 = a2.mo12627a("filter_position", bVar.mo13066a());
        if (z) {
            str4 = "front";
        } else {
            str4 = "back";
        }
        C6497a a4 = a3.mo12629a("camera_type", str4);
        C6805b<Float> bVar2 = AbstractC6804a.f16888Q;
        C89219l.m154716b(bVar2, "");
        C6497a a5 = a4.mo12626a("beauty_skin", bVar2.mo13066a());
        C6805b<Float> bVar3 = AbstractC6804a.f16889R;
        C89219l.m154716b(bVar3, "");
        C6497a a6 = a5.mo12626a("big_eyes", bVar3.mo13066a());
        C6805b<Float> bVar4 = AbstractC6804a.f16890S;
        C89219l.m154716b(bVar4, "");
        a6.mo12626a("face_lift", bVar4.mo13066a()).mo12632a();
    }
}
