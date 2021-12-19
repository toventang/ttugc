package com.bytedance.android.livesdk.olddialog.widget;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.firstrecharge.C8729d;
import com.bytedance.android.livesdk.model.C9904t;
import com.bytedance.android.livesdk.olddialog.widget.LiveNewGiftPanelWidget;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p561j.C9009ac;
import com.bytedance.android.livesdk.p640t.C10890a;
import com.bytedance.android.livesdk.service.assets.GiftManager;
import com.bytedance.android.livesdk.service.p621a.C10635b;
import com.bytedance.android.livesdk.service.p621a.C10639c;
import com.bytedance.android.livesdk.service.p625c.p626a.C10715e;
import com.bytedance.android.livesdk.wishlist.C11542d;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.olddialog.widget.r */
final /* synthetic */ class C10068r implements LiveNewGiftPanelWidget.AbstractC10048a {

    /* renamed from: a */
    private final LiveNewGiftPanelWidget f24474a;

    static {
        Covode.recordClassIndex(11630);
    }

    C10068r(LiveNewGiftPanelWidget liveNewGiftPanelWidget) {
        this.f24474a = liveNewGiftPanelWidget;
    }

    @Override // com.bytedance.android.livesdk.olddialog.widget.LiveNewGiftPanelWidget.AbstractC10048a
    /* renamed from: a */
    public final void mo16878a(Boolean bool, Long l, int i) {
        int i2;
        String str;
        User owner;
        LiveNewGiftPanelWidget liveNewGiftPanelWidget = this.f24474a;
        C10715e eVar = C10715e.f25799h;
        boolean booleanValue = bool.booleanValue();
        long longValue = l.longValue();
        boolean z = liveNewGiftPanelWidget.f24424h;
        int i3 = liveNewGiftPanelWidget.f24430n;
        String tabNameByIndex = GiftManager.inst().getTabNameByIndex(liveNewGiftPanelWidget.f24430n);
        int i4 = 0;
        if (eVar.f25805d != null) {
            List<? extends C9904t> list = eVar.f25805d;
            if (list == null) {
                C89219l.m154715b();
            }
            int size = list.size();
            i2 = 1;
            for (int i5 = 0; i5 < size; i5++) {
                List<? extends C9904t> list2 = eVar.f25805d;
                if (list2 == null) {
                    C89219l.m154715b();
                }
                if (((C9904t) list2.get(i5)).f23999d == longValue) {
                    i2 = (i5 % 8) + 1;
                }
            }
        } else {
            i2 = 1;
        }
        Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
        C6501b a = C6501b.C6502a.m13948a("gift_preview").mo12639a();
        String str2 = eVar.f25808g;
        if (str2 == null) {
            str2 = "icon";
        }
        C6501b a2 = a.mo12651a("gift_enter_from", str2).mo12645a("tab_position", i3 + 1).mo12651a("tab_name", tabNameByIndex).mo12645a("page_position", eVar.f25804c + 1).mo12646a("gift_id", longValue).mo12645a("gift_price", i).mo12651a("show_type", booleanValue ? "call" : "click").mo12645a("gift_position", i2).mo12651a("gift_dialog_request_id", C10639c.f25641a).mo12651a("room_orientation", z ? "portrait" : "landscape").mo12651a("send_gift_scene", C10890a.m19496b().getDesc()).mo12645a("actual_gift_position", GiftManager.inst().getGiftPosition(longValue)).mo12651a("is_first_screen", C10635b.C10636a.C10637a.f25639a.f25638a ? "first_screen" : "other_screen");
        String str3 = "1";
        C6501b a3 = a2.mo12651a(C10715e.f25800i, C10715e.m19285b() ? str3 : "0");
        if (GiftManager.inst().isDynamicGift(longValue)) {
            str = str3;
        } else {
            str = "0";
        }
        C6501b a4 = a3.mo12651a("dynamic_preview", str).mo12651a("special_gift", C8729d.f21542u.mo15013i() == longValue ? "first_recharge_gift" : "null");
        C9904t findGiftById = GiftManager.inst().findGiftById(longValue);
        C6501b a5 = a4.mo12652a(findGiftById != null ? findGiftById.f23994K : null);
        if (!(room == null || (owner = room.getOwner()) == null || !owner.isSubscribed())) {
            i4 = 1;
        }
        C6501b a6 = a5.mo12645a("is_subscription", i4);
        List list3 = (List) DataChannelGlobal.f42558d.mo28324b(C11542d.class);
        if (list3 == null || !list3.contains(Long.valueOf(longValue))) {
            str3 = "0";
        }
        a6.mo12651a("is_wishlist_gift", str3).mo12655b();
    }
}
