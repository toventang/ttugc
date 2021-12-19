package com.bytedance.android.livesdk.p425aa.p427b;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.livesetting.feed.LiveForYouPageTagSetting;
import com.bytedance.android.livesdk.p425aa.p428c.C6520a;
import com.bytedance.android.livesdk.p425aa.p428c.C6523c;
import com.bytedance.android.livesdk.p425aa.p428c.C6529h;
import com.bytedance.android.livesdk.p425aa.p428c.C6535m;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import java.util.Map;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.aa.b.e */
public final class C6511e implements AbstractC6508b<C6529h> {

    /* renamed from: a */
    private final C6515g f16171a = new C6515g();

    static {
        Covode.recordClassIndex(7247);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.aa.b.e$a */
    public static final class C6512a extends AbstractC89220m implements AbstractC89183m<String, String, C89391z> {

        /* renamed from: a */
        final /* synthetic */ Map f16172a;

        static {
            Covode.recordClassIndex(7248);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C6512a(Map map) {
            super(2);
            this.f16172a = map;
        }

        /* renamed from: a */
        public final C89391z invoke(String str, String str2) {
            C89219l.m154721d(str, "");
            if (str2 == null) {
                return null;
            }
            this.f16172a.put(str, str2);
            return C89391z.f203057a;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.util.Map, java.lang.Object] */
    @Override // com.bytedance.android.livesdk.p425aa.p427b.AbstractC6508b
    /* renamed from: a */
    public final /* synthetic */ void mo12666a(Map map, C6529h hVar) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        C6529h hVar2 = hVar;
        C89219l.m154721d(map, "");
        C89219l.m154721d(hVar2, "");
        C6512a aVar = new C6512a(map);
        C6513b bVar = new C6513b(aVar);
        C6520a aVar2 = hVar2.f16313e;
        String str8 = "1";
        if (aVar2 != null) {
            aVar.invoke("enter_method", aVar2.f16195a);
            aVar.invoke("enter_from_merge", aVar2.f16196b);
            aVar.invoke("source", aVar2.f16197c);
            Long l = aVar2.f16198d;
            if (l != null) {
                str4 = String.valueOf(l.longValue());
            } else {
                str4 = null;
            }
            aVar.invoke("from_room_id", str4);
            aVar.invoke("video_id", aVar2.f16199e);
            aVar.invoke("superior_page_from", aVar2.f16200f);
            aVar.invoke("push_type", aVar2.f16201g);
            Integer num = aVar2.f16202h;
            if (num != null) {
                str5 = String.valueOf(num.intValue());
            } else {
                str5 = null;
            }
            aVar.invoke("instation_push_type", str5);
            aVar.invoke("top_message_type", aVar2.f16203i);
            aVar.invoke("gd_label", aVar2.f16204j);
            aVar.invoke("card_position", aVar2.f16205k);
            aVar.invoke("inner_push_type", aVar2.f16206l);
            aVar.invoke("live_reason", aVar2.f16207m);
            aVar.invoke("action_type", aVar2.f16208n);
            aVar.invoke("search_id", aVar2.f16209o);
            aVar.invoke("search_keyword", aVar2.f16210p);
            aVar.invoke("search_result_id", aVar2.f16211q);
            aVar.invoke("search_type", aVar2.f16212r);
            aVar.invoke("list_item_id", aVar2.f16213s);
            if (C11279p.m20012a(aVar2.f16214t)) {
                str6 = str8;
            } else {
                str6 = "0";
            }
            aVar.invoke("is_video_head", str6);
            aVar.invoke("log_pb", aVar2.f16215u);
            aVar.invoke("request_id", aVar2.f16216v);
            aVar.invoke("is_preview", aVar2.f16217w);
            aVar.invoke("live_window_mode", aVar2.f16218x);
            Long l2 = aVar2.f16219y;
            if (l2 != null) {
                str7 = String.valueOf(l2.longValue());
            } else {
                str7 = null;
            }
            aVar.invoke("small_picture_order", str7);
            aVar.invoke("is_guest_connection", aVar2.f16220z);
            aVar.invoke("content_type", aVar2.f16188K);
            aVar.invoke("distribution_type", aVar2.f16178A);
            aVar.invoke("toplive_position", aVar2.f16179B);
            aVar.invoke("magic3_source", aVar2.f16180C);
            aVar.invoke("magic3Comptype", aVar2.f16181D);
            aVar.invoke("magic3ActivityId", aVar2.f16182E);
            aVar.invoke("rank_area", aVar2.f16185H);
            aVar.invoke("explore_level", String.valueOf(aVar2.f16190M));
            aVar.invoke("top_left_label", aVar2.f16191N);
            aVar.invoke("bottom_left_label", aVar2.f16192O);
            bVar.mo12668a(aVar2.f16196b, aVar2.f16208n, aVar2.f16186I, aVar2.f16187J);
        }
        C6523c cVar = hVar2.f16312d;
        if (cVar != null) {
            aVar.invoke("is_preview", cVar.f16263a);
            aVar.invoke("starlight_rank", cVar.f16264b);
            aVar.invoke("is_live_recall", cVar.f16265c);
            aVar.invoke("live_window_mode", cVar.f16266d);
            Long l3 = cVar.f16269g;
            if (l3 != null) {
                str2 = String.valueOf(l3.longValue());
            } else {
                str2 = null;
            }
            aVar.invoke("small_picture_order", str2);
            aVar.invoke("log_pb", cVar.f16267e);
            aVar.invoke("request_id", cVar.f16268f);
            Long l4 = cVar.f16270h;
            if (l4 != null) {
                str3 = String.valueOf(l4.longValue());
            } else {
                str3 = null;
            }
            aVar.invoke("room_id", str3);
            aVar.invoke("is_ecom", cVar.f16272j);
        }
        C6535m mVar = hVar2.f16314f;
        if (mVar != null) {
            aVar.invoke("room_position", String.valueOf(mVar.f16324a));
            aVar.invoke("is_from_draw_req", String.valueOf(mVar.f16325b));
        }
        aVar.invoke("event_page", hVar2.f16309a);
        C6515g.m13960a((Map<String, String>) map, hVar2.f16310b);
        Long l5 = hVar2.f16311c;
        if (l5 != null) {
            str = String.valueOf(l5.longValue());
        } else {
            str = null;
        }
        aVar.invoke("anchor_id", str);
        Room room = hVar2.f16310b;
        if (room != null) {
            User owner = room.getOwner();
            C89219l.m154716b(owner, "");
            if (!owner.isSubscribed()) {
                str8 = "0";
            }
            aVar.invoke("is_subscription", str8);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.aa.b.e$b */
    static final class C6513b extends AbstractC89220m implements AbstractC89188r<String, String, Long, Long, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C6512a f16173a;

        static {
            Covode.recordClassIndex(7249);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C6513b(C6512a aVar) {
            super(4);
            this.f16173a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89188r
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ C89391z mo8774a(String str, String str2, Long l, Long l2) {
            mo12668a(str, str2, l, l2);
            return C89391z.f203057a;
        }

        /* renamed from: a */
        public final void mo12668a(String str, String str2, Long l, Long l2) {
            if (C89219l.m154714a((Object) "homepage_hot", (Object) str) && C89219l.m154714a((Object) "click", (Object) str2) && LiveForYouPageTagSetting.INSTANCE.getValue() > 0) {
                if (l != null && l.longValue() > 0) {
                    this.f16173a.invoke("first_label", String.valueOf(l.longValue()));
                }
                if (l2 != null && l2.longValue() > 0) {
                    this.f16173a.invoke("second_label", String.valueOf(l2.longValue()));
                }
            }
        }
    }
}
