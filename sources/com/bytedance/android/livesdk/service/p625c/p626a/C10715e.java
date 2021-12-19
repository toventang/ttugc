package com.bytedance.android.livesdk.service.p625c.p626a;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.livesdk.dialogv2.viewmodel.C8374a;
import com.bytedance.android.livesdk.firstrecharge.C8729d;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.model.C9904t;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p425aa.C6544e;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.p561j.C9009ac;
import com.bytedance.android.livesdk.p640t.C10890a;
import com.bytedance.android.livesdk.service.assets.GiftManager;
import com.bytedance.android.livesdk.service.p621a.C10635b;
import com.bytedance.android.livesdk.service.p621a.C10639c;
import com.bytedance.android.livesdk.service.p625c.p626a.C10707b;
import com.bytedance.android.livesdk.service.p625c.p629d.C10738a;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdk.utils.p653a.C11200a;
import com.bytedance.android.livesdk.wishlist.C11542d;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.C13607d;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89338d;
import p4600h.p4622m.C89361p;

/* renamed from: com.bytedance.android.livesdk.service.c.a.e */
public final class C10715e {

    /* renamed from: h */
    public static final C10715e f25799h = C10717b.f25810a;

    /* renamed from: i */
    public static final String f25800i = "is_anchor";

    /* renamed from: j */
    public static final C10716a f25801j = new C10716a((byte) 0);

    /* renamed from: a */
    public boolean f25802a;

    /* renamed from: b */
    public String f25803b;

    /* renamed from: c */
    public int f25804c;

    /* renamed from: d */
    public List<? extends C9904t> f25805d;

    /* renamed from: e */
    public boolean f25806e;

    /* renamed from: f */
    public long f25807f = C11200a.m19851a();

    /* renamed from: g */
    public String f25808g;

    /* renamed from: k */
    private int f25809k;

    /* renamed from: com.bytedance.android.livesdk.service.c.a.e$a */
    public static final class C10716a {
        static {
            Covode.recordClassIndex(12313);
        }

        private C10716a() {
        }

        public /* synthetic */ C10716a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.service.c.a.e$b */
    static final class C10717b {

        /* renamed from: a */
        static final C10715e f25810a = new C10715e();

        /* renamed from: b */
        public static final C10717b f25811b = new C10717b();

        private C10717b() {
        }

        static {
            Covode.recordClassIndex(12314);
        }
    }

    /* renamed from: a */
    public final void mo17640a(int i, int i2, GiftPage giftPage, boolean z, String str) {
        C9904t tVar;
        C9904t tVar2;
        User owner;
        C9904t tVar3;
        C89219l.m154721d(giftPage, "");
        int i3 = this.f25804c;
        if (i3 != i || z) {
            this.f25809k = i3;
            this.f25804c = i;
            Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
            JSONObject jSONObject = new JSONObject();
            int i4 = 1;
            int size = giftPage.gifts.size() < 9 ? giftPage.gifts.size() : (giftPage.gifts.size() <= this.f25804c * 8 || giftPage.gifts.size() >= (this.f25804c + 1) * 8) ? 8 : giftPage.gifts.size() - (this.f25804c * 8);
            for (int i5 = 0; i5 < size; i5++) {
                int i6 = (this.f25804c * 8) + i5;
                List<? extends C9904t> list = this.f25805d;
                if ((list != null ? list.size() : 0) > i6) {
                    List<? extends C9904t> list2 = this.f25805d;
                    jSONObject.put(String.valueOf((list2 == null || (tVar3 = (C9904t) list2.get(i6)) == null) ? 0 : tVar3.f23999d), i5 + 1);
                }
            }
            int i7 = i + 1;
            C6501b a = C6501b.C6502a.m13948a("gift_pages_show").mo12639a().mo12651a("gift_dialog_request_id", C10639c.f25641a).mo12651a("tab_name", giftPage.pageName).mo12645a("tab_position", i2 + 1).mo12645a("from_page", this.f25809k + 1).mo12651a("gift_seen", jSONObject.toString()).mo12651a("is_first_screen", C10635b.C10636a.C10637a.f25639a.f25638a ? "first_screen" : "other_screen").mo12651a("send_gift_scene", C10890a.m19496b().getDesc()).mo12645a("page", i7).mo12645a("page_position", i7).mo12651a("gift_enter_from", str).mo12651a("event_module", str).mo12651a(f25800i, m19285b() ? "1" : "0");
            if (room == null || (owner = room.getOwner()) == null || !owner.isSubscribed()) {
                i4 = 0;
            }
            a.mo12645a("is_subscription", i4).mo12655b();
            for (int i8 = 0; i8 < size; i8++) {
                int i9 = (this.f25804c * 8) + i8;
                List<? extends C9904t> list3 = this.f25805d;
                if (i9 < (list3 != null ? list3.size() : 0)) {
                    List<? extends C9904t> list4 = this.f25805d;
                    Integer num = null;
                    Long valueOf = (list4 == null || (tVar2 = (C9904t) list4.get(i9)) == null) ? null : Long.valueOf(tVar2.f23999d);
                    List<? extends C9904t> list5 = this.f25805d;
                    if (!(list5 == null || (tVar = (C9904t) list5.get(i9)) == null)) {
                        num = Integer.valueOf(tVar.f24001f);
                    }
                    m19279a(i8, i2, giftPage, valueOf, num);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo17639a(int i, int i2, GiftPage giftPage, String str) {
        User owner;
        C9904t tVar;
        C89219l.m154721d(giftPage, "");
        JSONObject jSONObject = new JSONObject();
        int i3 = 1;
        int size = giftPage.gifts.size() < 9 ? giftPage.gifts.size() : (giftPage.gifts.size() <= this.f25804c * 8 || giftPage.gifts.size() >= (this.f25804c + 1) * 8) ? 8 : giftPage.gifts.size() - (this.f25804c * 8);
        for (int i4 = 0; i4 < size; i4++) {
            int i5 = (this.f25804c * 8) + i4;
            List<? extends C9904t> list = this.f25805d;
            if ((list != null ? list.size() : 0) > i5) {
                List<? extends C9904t> list2 = this.f25805d;
                jSONObject.put(String.valueOf((list2 == null || (tVar = (C9904t) list2.get(i5)) == null) ? 0 : tVar.f23999d), i4 + 1);
            }
        }
        Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
        int i6 = i + 1;
        C6501b a = C6501b.C6502a.m13948a("gift_pages_show").mo12639a().mo12651a("gift_dialog_request_id", C10639c.f25641a).mo12651a("tab_name", giftPage.pageName).mo12645a("tab_position", i2 + 1).mo12645a("from_page", this.f25809k + 1).mo12651a("gift_seen", jSONObject.toString()).mo12651a("is_first_screen", C10635b.C10636a.C10637a.f25639a.f25638a ? "first_screen" : "other_screen").mo12651a("send_gift_scene", C10890a.m19496b().getDesc()).mo12645a("page_position", i6).mo12645a("page", i6).mo12651a("gift_enter_from", str).mo12651a(f25800i, m19285b() ? "1" : "0").mo12651a("event_module", str);
        if (room == null || (owner = room.getOwner()) == null || !owner.isSubscribed()) {
            i3 = 0;
        }
        a.mo12645a("is_subscription", i3).mo12655b();
    }

    /* renamed from: a */
    public final void mo17641a(int i, boolean z, int i2, GiftPage giftPage, String str, Integer num) {
        C9904t tVar;
        C9904t tVar2;
        C89219l.m154721d(giftPage, "");
        this.f25808g = str;
        this.f25807f = C11200a.m19851a();
        String a = m19278a(String.valueOf(C10890a.m19495a() + C11200a.m19851a()));
        if (!C89219l.m154714a((Object) this.f25803b, (Object) a)) {
            this.f25803b = a;
            this.f25804c = i;
            this.f25809k = i;
            this.f25806e = z;
            C8374a.C8375a.C8376a.f20718a.f20716j = num != null ? num.intValue() : 1;
            int i3 = 8;
            if (giftPage.gifts.size() < 9) {
                i3 = giftPage.gifts.size();
            } else if (giftPage.gifts.size() <= this.f25804c * 8) {
                i3 = giftPage.gifts.size() - (this.f25804c * 8);
            }
            for (int i4 = 0; i4 < i3; i4++) {
                List<? extends C9904t> list = this.f25805d;
                Integer num2 = null;
                Long valueOf = (list == null || (tVar2 = (C9904t) list.get(i4)) == null) ? null : Long.valueOf(tVar2.f23999d);
                List<? extends C9904t> list2 = this.f25805d;
                if (!(list2 == null || (tVar = (C9904t) list2.get(i4)) == null)) {
                    num2 = Integer.valueOf(tVar.f24001f);
                }
                m19279a(i4, i2, giftPage, valueOf, num2);
            }
        }
    }

    /* renamed from: a */
    public final void mo17643a(long j, boolean z, boolean z2, String str, String str2, String str3) {
        C89219l.m154721d(str2, "");
        Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
        if (z) {
            C10707b.C10709b.f25792a.mo17634a(j, z, new C10718c(j, str3, z2));
        } else {
            C10707b.C10709b.f25792a.mo17634a(j, z, new C10719d(this, j, z2, str, str3, str2, room));
        }
    }

    /* renamed from: a */
    public final void mo17638a() {
        this.f25802a = false;
        this.f25803b = null;
    }

    static {
        Covode.recordClassIndex(12312);
    }

    /* renamed from: b */
    public static boolean m19285b() {
        Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
        if (room == null) {
            return false;
        }
        long ownerUserId = room.getOwnerUserId();
        AbstractC6872f b = C11115u.m19743a().mo17915b();
        C89219l.m154716b(b, "");
        if (ownerUserId == b.mo13161c()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo17644a(List<? extends C9904t> list) {
        if (list != null) {
            this.f25805d = list;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.service.c.a.e$f */
    public static final class C10721f implements C10738a.AbstractC10739a {

        /* renamed from: a */
        final /* synthetic */ long f25829a;

        static {
            Covode.recordClassIndex(12318);
        }

        public C10721f(long j) {
            this.f25829a = j;
        }

        @Override // com.bytedance.android.livesdk.service.p625c.p629d.C10738a.AbstractC10739a
        /* renamed from: a */
        public final void mo17645a(int i) {
            C6501b.C6502a.m13948a("send_prop").mo12639a().mo12645a("prop_cnt", i).mo12646a("prop_id", this.f25829a).mo12655b();
        }
    }

    /* renamed from: a */
    public static String m19278a(String str) {
        MessageDigest messageDigest;
        byte[] bArr = null;
        try {
            messageDigest = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException unused) {
            messageDigest = null;
        }
        if (messageDigest != null) {
            Charset charset = C89338d.f202990a;
            Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
            byte[] bytes = str.getBytes(charset);
            C89219l.m154716b(bytes, "");
            bArr = messageDigest.digest(bytes);
        }
        String a = C13607d.m24439a(bArr);
        C89219l.m154716b(a, "");
        return a;
    }

    /* renamed from: b */
    public static void m19283b(String str) {
        String str2;
        C89219l.m154721d(str, "");
        C6501b a = C6501b.C6502a.m13948a("gift_tab_click").mo12639a().mo12651a("tab_name", str).mo12651a("gift_dialog_request_id", C10639c.f25641a);
        if (C3966y.m9670f()) {
            str2 = "portrait";
        } else {
            str2 = "landscape";
        }
        a.mo12651a("room_orientation", str2).mo12655b();
    }

    /* renamed from: a */
    public final int mo17637a(long j) {
        List<? extends C9904t> list = this.f25805d;
        if (list == null) {
            return 0;
        }
        int i = 0;
        for (C9904t tVar : list) {
            i++;
            if (tVar.f23999d == j) {
                return i % 8;
            }
        }
        return 0;
    }

    /* renamed from: com.bytedance.android.livesdk.service.c.a.e$c */
    static final class C10718c implements C10707b.AbstractC10708a {

        /* renamed from: a */
        final /* synthetic */ long f25812a;

        /* renamed from: b */
        final /* synthetic */ String f25813b;

        /* renamed from: c */
        final /* synthetic */ boolean f25814c;

        static {
            Covode.recordClassIndex(12315);
        }

        C10718c(long j, String str, boolean z) {
            this.f25812a = j;
            this.f25813b = str;
            this.f25814c = z;
        }

        @Override // com.bytedance.android.livesdk.service.p625c.p626a.C10707b.AbstractC10708a
        /* renamed from: a */
        public final void mo17635a(String str, int i) {
            String str2;
            long j;
            C89219l.m154721d(str, "");
            HashMap hashMap = new HashMap();
            C9904t findGiftById = GiftManager.inst().findGiftById(this.f25812a);
            hashMap.put("gift_type", str);
            hashMap.put("combo_cnt", String.valueOf(i));
            hashMap.put("gift_cnt", String.valueOf(i));
            hashMap.put("gift_id", String.valueOf(this.f25812a));
            hashMap.put("gift_enter_from", "convenient_icon");
            String str3 = this.f25813b;
            if (str3 == null) {
                str3 = "";
            }
            hashMap.put("show_type", str3);
            if (findGiftById == null || findGiftById.f24000e != 4) {
                if (this.f25814c) {
                    str2 = "animation_gift";
                } else {
                    str2 = "non_animation_gift";
                }
                hashMap.put("gift_value_type", str2);
            } else {
                hashMap.put("gift_value_type", "sticker_gift");
            }
            GiftManager inst = GiftManager.inst();
            if (findGiftById != null) {
                j = findGiftById.f23999d;
            } else {
                j = 0;
            }
            C9904t findGiftById2 = inst.findGiftById(j);
            if (findGiftById2 == null || !findGiftById2.f23993J) {
                if (findGiftById != null) {
                    if (findGiftById.f23999d == C8729d.f21542u.mo15013i()) {
                        hashMap.put("special_gift", "first_recharge_gift");
                    } else if (findGiftById.f23999d == 0) {
                        hashMap.put("special_gift", "recall_gift");
                    }
                }
                hashMap.put("special_gift", "");
            } else {
                hashMap.put("special_gift", "announcements_gift");
            }
            hashMap.put("send_gift_scene", C10890a.m19496b().getDesc());
            hashMap.put("request_id", C6544e.m13997k());
            C6501b.C6502a.m13948a("convenient_gift_click").mo12639a().mo12652a((Map<String, String>) hashMap).mo12651a("gift_dialog_request_id", C10639c.f25641a).mo12655b();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.service.c.a.e$d */
    static final class C10719d implements C10707b.AbstractC10708a {

        /* renamed from: a */
        final /* synthetic */ C10715e f25815a;

        /* renamed from: b */
        final /* synthetic */ long f25816b;

        /* renamed from: c */
        final /* synthetic */ boolean f25817c;

        /* renamed from: d */
        final /* synthetic */ String f25818d;

        /* renamed from: e */
        final /* synthetic */ String f25819e;

        /* renamed from: f */
        final /* synthetic */ String f25820f;

        /* renamed from: g */
        final /* synthetic */ Room f25821g;

        static {
            Covode.recordClassIndex(12316);
        }

        C10719d(C10715e eVar, long j, boolean z, String str, String str2, String str3, Room room) {
            this.f25815a = eVar;
            this.f25816b = j;
            this.f25817c = z;
            this.f25818d = str;
            this.f25819e = str2;
            this.f25820f = str3;
            this.f25821g = room;
        }

        @Override // com.bytedance.android.livesdk.service.p625c.p626a.C10707b.AbstractC10708a
        /* renamed from: a */
        public final void mo17635a(String str, int i) {
            String str2;
            long j;
            String str3;
            Integer num;
            int i2;
            String str4;
            String str5;
            User owner;
            C89219l.m154721d(str, "");
            HashMap hashMap = new HashMap();
            C9904t findGiftById = GiftManager.inst().findGiftById(this.f25816b);
            hashMap.put("gift_type", str);
            String str6 = "animation_gift";
            if (this.f25817c) {
                str2 = str6;
            } else {
                str2 = "non_animation_gift";
            }
            hashMap.put("gift_value_type", str2);
            hashMap.put("combo_cnt", String.valueOf(i));
            hashMap.put("gift_cnt", String.valueOf(i));
            hashMap.put("gift_id", String.valueOf(this.f25816b));
            String str7 = "wishlist";
            if (!C89219l.m154714a((Object) str7, (Object) this.f25818d)) {
                if (C13627m.m24498a(this.f25818d)) {
                    str7 = "icon";
                } else {
                    str7 = this.f25818d;
                    if (str7 == null) {
                        str7 = "";
                    }
                }
            }
            hashMap.put("gift_enter_from", str7);
            hashMap.put("send_gift_scene", C10890a.m19496b().getDesc());
            String str8 = this.f25819e;
            if (str8 == null) {
                str8 = "";
            }
            hashMap.put("show_type", str8);
            if (findGiftById == null || findGiftById.f24000e != 4) {
                if (!this.f25817c) {
                    str6 = "non_animation_gift";
                }
                hashMap.put("gift_value_type", str6);
            } else {
                hashMap.put("gift_value_type", "sticker_gift");
            }
            GiftManager inst = GiftManager.inst();
            if (findGiftById != null) {
                j = findGiftById.f23999d;
            } else {
                j = 0;
            }
            C9904t findGiftById2 = inst.findGiftById(j);
            if (findGiftById2 == null || !findGiftById2.f23993J) {
                if (findGiftById != null) {
                    if (findGiftById.f23999d == C8729d.f21542u.mo15013i()) {
                        hashMap.put("special_gift", "first_recharge_gift");
                    } else if (findGiftById.f23999d == 0) {
                        hashMap.put("special_gift", "recall_gift");
                    }
                }
                hashMap.put("special_gift", "");
            } else {
                hashMap.put("special_gift", "announcements_gift");
            }
            hashMap.put("gift_position", String.valueOf(this.f25815a.mo17637a(this.f25816b)));
            hashMap.put("tab_position", String.valueOf(GiftManager.inst().getTabLocation(C8374a.C8375a.C8376a.f20718a.f20716j)));
            hashMap.put("page_position", String.valueOf(this.f25815a.f25804c));
            if (C10635b.C10636a.C10637a.f25639a.f25638a) {
                str3 = "first_screen";
            } else {
                str3 = "other_screen";
            }
            hashMap.put("is_first_screen", str3);
            hashMap.put("actual_gift_position", String.valueOf(GiftManager.inst().getGiftPosition(this.f25816b)));
            C6501b a = C6501b.C6502a.m13948a("gift_send_click").mo12651a("tab_name", this.f25820f);
            Map<String, String> map = null;
            if (findGiftById != null) {
                num = Integer.valueOf(findGiftById.f24001f);
            } else {
                num = null;
            }
            C6501b a2 = a.mo12650a("gift_price", (Number) num);
            int i3 = 0;
            if (findGiftById != null) {
                i2 = findGiftById.f24001f;
            } else {
                i2 = 0;
            }
            C6501b a3 = a2.mo12645a("consume_amount", i * i2);
            String str9 = "1";
            if (GiftManager.inst().isDynamicGift(this.f25816b)) {
                str4 = str9;
            } else {
                str4 = "0";
            }
            C6501b a4 = a3.mo12651a("dynamic_preview", str4).mo12652a((Map<String, String>) hashMap);
            C9904t findGiftById3 = GiftManager.inst().findGiftById(this.f25816b);
            if (findGiftById3 != null) {
                map = findGiftById3.f23994K;
            }
            C6501b a5 = a4.mo12652a(map).mo12651a("gift_dialog_request_id", C10639c.f25641a);
            String str10 = C10715e.f25800i;
            if (C10715e.m19285b()) {
                str5 = str9;
            } else {
                str5 = "0";
            }
            C6501b a6 = a5.mo12651a(str10, str5);
            Room room = this.f25821g;
            if (!(room == null || (owner = room.getOwner()) == null || !owner.isSubscribed())) {
                i3 = 1;
            }
            C6501b a7 = a6.mo12645a("is_subscription", i3);
            List list = (List) DataChannelGlobal.f42558d.mo28324b(C11542d.class);
            if (list == null || !list.contains(Long.valueOf(this.f25816b))) {
                str9 = "0";
            }
            a7.mo12651a("is_wishlist_gift", str9).mo12639a().mo12655b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.service.c.a.e$e */
    public static final class C10720e implements C10707b.AbstractC10708a {

        /* renamed from: a */
        final /* synthetic */ C10715e f25822a;

        /* renamed from: b */
        final /* synthetic */ long f25823b;

        /* renamed from: c */
        final /* synthetic */ boolean f25824c;

        /* renamed from: d */
        final /* synthetic */ String f25825d;

        /* renamed from: e */
        final /* synthetic */ String f25826e;

        /* renamed from: f */
        final /* synthetic */ Integer f25827f;

        /* renamed from: g */
        final /* synthetic */ Integer f25828g;

        static {
            Covode.recordClassIndex(12317);
        }

        C10720e(C10715e eVar, long j, boolean z, String str, String str2, Integer num, Integer num2) {
            this.f25822a = eVar;
            this.f25823b = j;
            this.f25824c = z;
            this.f25825d = str;
            this.f25826e = str2;
            this.f25827f = num;
            this.f25828g = num2;
        }

        @Override // com.bytedance.android.livesdk.service.p625c.p626a.C10707b.AbstractC10708a
        /* renamed from: a */
        public final void mo17635a(String str, int i) {
            String str2;
            int i2;
            int i3;
            long j;
            int i4;
            String str3;
            int i5;
            String str4;
            Map<String, String> map;
            String str5;
            User owner;
            C89219l.m154721d(str, "");
            HashMap hashMap = new HashMap();
            C9904t findGiftById = GiftManager.inst().findGiftById(this.f25823b);
            Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
            hashMap.put("gift_type", str);
            String str6 = "animation_gift";
            if (this.f25824c) {
                str2 = str6;
            } else {
                str2 = "non_animation_gift";
            }
            hashMap.put("gift_value_type", str2);
            hashMap.put("combo_cnt", String.valueOf(i));
            hashMap.put("gift_cnt", String.valueOf(i));
            hashMap.put("gift_id", String.valueOf(this.f25823b));
            int i6 = 0;
            if (findGiftById != null) {
                i2 = findGiftById.f24001f;
            } else {
                i2 = 0;
            }
            hashMap.put("gift_price", String.valueOf(i2));
            if (findGiftById != null) {
                i3 = findGiftById.f24001f;
            } else {
                i3 = 0;
            }
            hashMap.put("consume_amount", String.valueOf(i * i3));
            String str7 = "wishlist";
            if (!C89219l.m154714a((Object) str7, (Object) this.f25825d)) {
                if (C13627m.m24498a(this.f25825d)) {
                    str7 = "icon";
                } else {
                    str7 = this.f25825d;
                    if (str7 == null) {
                        str7 = "";
                    }
                }
            }
            hashMap.put("gift_enter_from", str7);
            hashMap.put("send_gift_scene", C10890a.m19496b().getDesc());
            String str8 = this.f25826e;
            if (str8 == null) {
                str8 = "";
            }
            hashMap.put("show_type", str8);
            if (findGiftById == null || findGiftById.f24000e != 4) {
                if (!this.f25824c) {
                    str6 = "non_animation_gift";
                }
                hashMap.put("gift_value_type", str6);
            } else {
                hashMap.put("gift_value_type", "sticker_gift");
            }
            GiftManager inst = GiftManager.inst();
            if (findGiftById != null) {
                j = findGiftById.f23999d;
            } else {
                j = 0;
            }
            C9904t findGiftById2 = inst.findGiftById(j);
            if (findGiftById2 == null || !findGiftById2.f23993J) {
                if (findGiftById != null) {
                    if (findGiftById.f23999d == C8729d.f21542u.mo15013i()) {
                        hashMap.put("special_gift", "first_recharge_gift");
                    } else if (findGiftById.f23999d == 0) {
                        hashMap.put("special_gift", "recall_gift");
                    }
                }
                hashMap.put("special_gift", "");
            } else {
                hashMap.put("special_gift", "announcements_gift");
            }
            GiftManager inst2 = GiftManager.inst();
            Integer num = this.f25827f;
            if (num != null) {
                i4 = num.intValue();
            } else {
                i4 = 0;
            }
            String tabName = inst2.getTabName(i4);
            C89219l.m154716b(tabName, "");
            hashMap.put("tab_name", tabName);
            if (C10635b.C10636a.C10637a.f25639a.f25638a) {
                str3 = "first_screen";
            } else {
                str3 = "other_screen";
            }
            hashMap.put("is_first_screen", str3);
            Integer num2 = this.f25828g;
            if (num2 != null) {
                i5 = num2.intValue();
            } else {
                i5 = 0;
            }
            hashMap.put("gift_position", String.valueOf(i5));
            hashMap.put("actual_gift_position", String.valueOf(GiftManager.inst().getGiftPosition(this.f25823b)));
            String str9 = C10715e.f25800i;
            String str10 = "1";
            if (C10715e.m19285b()) {
                str4 = str10;
            } else {
                str4 = "0";
            }
            hashMap.put(str9, str4);
            C6501b a = C6501b.C6502a.m13948a("gift_send_click").mo12652a((Map<String, String>) hashMap);
            C9904t findGiftById3 = GiftManager.inst().findGiftById(this.f25823b);
            if (findGiftById3 != null) {
                map = findGiftById3.f23994K;
            } else {
                map = null;
            }
            C6501b a2 = a.mo12652a(map);
            if (GiftManager.inst().isDynamicGift(this.f25823b)) {
                str5 = str10;
            } else {
                str5 = "0";
            }
            C6501b a3 = a2.mo12651a("dynamic_preview", str5);
            List list = (List) DataChannelGlobal.f42558d.mo28324b(C11542d.class);
            if (list == null || !list.contains(Long.valueOf(this.f25823b))) {
                str10 = "0";
            }
            C6501b a4 = a3.mo12651a("is_wishlist_gift", str10).mo12651a("gift_dialog_request_id", C10639c.f25641a).mo12639a();
            if (!(room == null || (owner = room.getOwner()) == null || !owner.isSubscribed())) {
                i6 = 1;
            }
            a4.mo12645a("is_subscription", i6).mo12655b();
        }
    }

    /* renamed from: a */
    public static void m19280a(String str, String str2, String str3) {
        String str4 = "";
        C89219l.m154721d(str, str4);
        C89219l.m154721d(str3, str4);
        HashMap hashMap = new HashMap();
        hashMap.put("error_code", str);
        if (C13627m.m24498a(str2)) {
            str4 = "icon";
        } else if (str2 != null) {
            str4 = str2;
        }
        hashMap.put("gift_enter_from", str4);
        if (C89361p.m154872a(str2, "convenient_gift", false)) {
            hashMap.put("convenient_gift_enter_from", str3);
        }
        C6501b.C6502a.m13948a("send_gift_network_fail").mo12639a().mo12652a((Map<String, String>) hashMap).mo12655b();
    }

    /* renamed from: b */
    public static void m19284b(String str, String str2, String str3, String str4) {
        String str5 = "";
        C89219l.m154721d(str, str5);
        C89219l.m154721d(str2, str5);
        C89219l.m154721d(str4, str5);
        HashMap hashMap = new HashMap();
        hashMap.put("error_code", str);
        if (C13627m.m24498a(str3)) {
            str5 = "icon";
        } else if (str3 != null) {
            str5 = str3;
        }
        hashMap.put("gift_enter_from", str5);
        hashMap.put("fail_reason", str2);
        if (C89361p.m154872a(str3, "convenient_gift", false)) {
            hashMap.put("convenient_gift_enter_from", str4);
        }
        C6501b.C6502a.m13948a("livesdk_gift_local_fail").mo12639a().mo12652a((Map<String, String>) hashMap).mo12655b();
    }

    /* renamed from: a */
    public static void m19281a(String str, String str2, String str3, String str4) {
        String str5 = "";
        C89219l.m154721d(str, str5);
        C89219l.m154721d(str2, str5);
        C89219l.m154721d(str4, str5);
        HashMap hashMap = new HashMap();
        hashMap.put("error_code", str);
        hashMap.put("fail_reason", str2);
        if (C13627m.m24498a(str3)) {
            str5 = "icon";
        } else if (str3 != null) {
            str5 = str3;
        }
        hashMap.put("gift_enter_from", str5);
        if (C89361p.m154872a(str3, "convenient_gift", false)) {
            hashMap.put("convenient_gift_enter_from", str4);
        }
        C6501b.C6502a.m13948a("livesdk_gift_request_fail").mo12639a().mo12652a((Map<String, String>) hashMap).mo12655b();
    }

    /* renamed from: a */
    private final void m19279a(int i, int i2, GiftPage giftPage, Long l, Integer num) {
        int i3;
        String str;
        long j;
        String str2;
        String str3;
        User owner;
        int i4 = (this.f25804c * 8) + i;
        List<? extends C9904t> list = this.f25805d;
        int i5 = 0;
        if (list != null) {
            i3 = list.size();
        } else {
            i3 = 0;
        }
        if (i3 > i4) {
            Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
            C6501b a = C6501b.C6502a.m13948a("gift_show").mo12639a().mo12650a("gift_id", (Number) l).mo12651a("gift_dialog_request_id", C10639c.f25641a).mo12651a("tab_name", giftPage.pageName).mo12645a("tab_position", i2 + 1).mo12645a("gift_position", i + 1).mo12645a("page_position", this.f25804c + 1);
            if (this.f25806e) {
                str = "guest";
            } else {
                str = "anchor";
            }
            C6501b a2 = a.mo12651a("to_user_type", str).mo12651a("send_gift_scene", C10890a.m19496b().getDesc());
            GiftManager inst = GiftManager.inst();
            if (l != null) {
                j = l.longValue();
            } else {
                j = 0;
            }
            C6501b a3 = a2.mo12645a("actual_gift_position", inst.getGiftPosition(j));
            String str4 = this.f25808g;
            if (str4 == null) {
                str4 = "icon";
            }
            C6501b a4 = a3.mo12651a("gift_enter_from", str4).mo12650a("gift_price", (Number) num);
            String str5 = f25800i;
            if (m19285b()) {
                str2 = "1";
            } else {
                str2 = "0";
            }
            C6501b a5 = a4.mo12651a(str5, str2);
            if (C10635b.C10636a.C10637a.f25639a.f25638a) {
                str3 = "first_screen";
            } else {
                str3 = "other_screen";
            }
            C6501b a6 = a5.mo12651a("is_first_screen", str3);
            if (!(room == null || (owner = room.getOwner()) == null || !owner.isSubscribed())) {
                i5 = 1;
            }
            a6.mo12645a("is_subscription", i5).mo12655b();
        }
    }

    /* renamed from: a */
    public final void mo17642a(long j, boolean z, String str, String str2, Integer num, Integer num2) {
        C10707b.C10709b.f25792a.mo17634a(j, false, new C10720e(this, j, z, str, str2, num, num2));
    }

    /* renamed from: a */
    public static void m19282a(boolean z, long j, boolean z2, int i, String str, int i2, Integer num) {
        String str2;
        int i3;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        Map<String, String> map;
        User owner;
        Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
        C6501b a = C6501b.C6502a.m13948a("gift_preview").mo12639a().mo12651a("gift_enter_from", C8374a.C8375a.C8376a.f20718a.f20711e).mo12645a("tab_position", GiftManager.inst().getTabLocation(i)).mo12651a("tab_name", str).mo12646a("gift_id", j);
        if (z) {
            str2 = "call";
        } else {
            str2 = "click";
        }
        C6501b a2 = a.mo12651a("show_type", str2).mo12645a("gift_position", i2);
        int i4 = 0;
        if (num != null) {
            i3 = num.intValue();
        } else {
            i3 = 0;
        }
        C6501b a3 = a2.mo12645a("gift_price", i3).mo12651a("gift_dialog_request_id", C10639c.f25641a);
        if (z2) {
            str3 = "portrait";
        } else {
            str3 = "landscape";
        }
        C6501b a4 = a3.mo12651a("room_orientation", str3).mo12651a("send_gift_scene", C10890a.m19496b().getDesc()).mo12645a("actual_gift_position", GiftManager.inst().getGiftPosition(j));
        if (C10635b.C10636a.C10637a.f25639a.f25638a) {
            str4 = "first_screen";
        } else {
            str4 = "other_screen";
        }
        C6501b a5 = a4.mo12651a("is_first_screen", str4);
        String str8 = f25800i;
        String str9 = "1";
        if (m19285b()) {
            str5 = str9;
        } else {
            str5 = "0";
        }
        C6501b a6 = a5.mo12651a(str8, str5);
        if (GiftManager.inst().isDynamicGift(j)) {
            str6 = str9;
        } else {
            str6 = "0";
        }
        C6501b a7 = a6.mo12651a("dynamic_preview", str6);
        if (C8729d.f21542u.mo15013i() == j) {
            str7 = "first_recharge_gift";
        } else {
            C9904t findGiftById = GiftManager.inst().findGiftById(j);
            if (findGiftById == null || !findGiftById.f23993J) {
                str7 = "null";
            } else {
                str7 = "announcements_gift";
            }
        }
        C6501b a8 = a7.mo12651a("special_gift", str7);
        C9904t findGiftById2 = GiftManager.inst().findGiftById(j);
        if (findGiftById2 != null) {
            map = findGiftById2.f23994K;
        } else {
            map = null;
        }
        C6501b a9 = a8.mo12652a(map);
        if (!(room == null || (owner = room.getOwner()) == null || !owner.isSubscribed())) {
            i4 = 1;
        }
        C6501b a10 = a9.mo12645a("is_subscription", i4);
        List list = (List) DataChannelGlobal.f42558d.mo28324b(C11542d.class);
        if (list == null || !list.contains(Long.valueOf(j))) {
            str9 = "0";
        }
        a10.mo12651a("is_wishlist_gift", str9).mo12655b();
    }
}
