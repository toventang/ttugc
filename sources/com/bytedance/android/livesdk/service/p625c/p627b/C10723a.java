package com.bytedance.android.livesdk.service.p625c.p627b;

import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.service.c.b.a */
public final class C10723a {

    /* renamed from: a */
    public static final C10723a f25831a = new C10723a();

    /* renamed from: com.bytedance.android.livesdk.service.c.b.a$a */
    public enum EnumC10724a {
        TIME_UP("times_up"),
        USER_CLOSE("user_close"),
        SEND("send_click"),
        OTHER("other");
        

        /* renamed from: b */
        private final String f25833b;

        public final String getDesc() {
            return this.f25833b;
        }

        static {
            Covode.recordClassIndex(12321);
        }

        private EnumC10724a(String str) {
            this.f25833b = str;
        }
    }

    private C10723a() {
    }

    static {
        Covode.recordClassIndex(12320);
    }

    /* renamed from: a */
    public static final void m19301a(EnumC10724a aVar) {
        C89219l.m154721d(aVar, "");
        C6501b.C6502a.m13948a("gift_guide_bubble_close").mo12651a("close_reason", aVar.getDesc()).mo12639a().mo12655b();
    }

    /* renamed from: b */
    public static final void m19302b(EnumC10724a aVar) {
        C89219l.m154721d(aVar, "");
        C6501b.C6502a.m13948a("gift_guide_popup_close").mo12651a("close_reason", aVar.getDesc()).mo12639a().mo12655b();
    }
}
