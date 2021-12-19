package com.bytedance.android.livesdk.firstrecharge;

import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p425aa.C6544e;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.firstrecharge.e */
public final class C8740e {

    /* renamed from: a */
    public static final C8740e f21577a = new C8740e();

    private C8740e() {
    }

    static {
        Covode.recordClassIndex(9614);
    }

    /* renamed from: a */
    public static void m17059a() {
        C6501b.C6502a.m13948a("welcome_gift_show").mo12639a().mo12651a("request_id", C6544e.m13997k()).mo12655b();
    }

    /* renamed from: b */
    public static void m17061b(String str) {
        C6501b.C6502a.m13948a("welcome_gift_pack_buy_success").mo12639a().mo12651a("gift_enter_from", str).mo12651a("request_id", C6544e.m13997k()).mo12655b();
    }

    /* renamed from: a */
    public static void m17060a(String str) {
        C6501b.C6502a.m13948a("welcome_gift_pack_page_show").mo12639a().mo12651a("gift_enter_from", str).mo12651a("request_id", C6544e.m13997k()).mo12655b();
    }
}
