package com.bytedance.android.livesdk.service.p625c.p628c;

import androidx.p025c.C0489d;
import com.bytedance.android.livesdk.gift.model.p553a.AbstractC8812b;
import com.bytedance.android.livesdk.model.C9543b;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.p561j.C9097di;
import com.bytedance.android.livesdk.p640t.C10890a;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdk.utils.p653a.C11200a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.service.c.c.d */
public final class C10731d {

    /* renamed from: f */
    public static final C10732a f25850f = new C10732a((byte) 0);

    /* renamed from: a */
    public boolean f25851a;

    /* renamed from: b */
    public boolean f25852b;

    /* renamed from: c */
    public long f25853c;

    /* renamed from: d */
    public long f25854d;

    /* renamed from: e */
    public final C88411a f25855e;

    /* renamed from: g */
    private LinkedList<AbstractC8812b<? extends C9543b>> f25856g;

    /* renamed from: h */
    private final C0489d<C10732a.C10735b> f25857h;

    /* renamed from: i */
    private boolean f25858i;

    static {
        Covode.recordClassIndex(12328);
    }

    /* renamed from: com.bytedance.android.livesdk.service.c.c.d$a */
    public static final class C10732a {

        /* renamed from: com.bytedance.android.livesdk.service.c.c.d$a$a */
        public static final class C10733a {

            /* renamed from: a */
            public static final C10731d f25859a = new C10731d((byte) 0);

            /* renamed from: b */
            public static final C10734a f25860b = new C10734a((byte) 0);

            /* renamed from: com.bytedance.android.livesdk.service.c.c.d$a$a$a */
            public static final class C10734a {
                static {
                    Covode.recordClassIndex(12331);
                }

                private C10734a() {
                }

                public /* synthetic */ C10734a(byte b) {
                    this();
                }
            }

            static {
                Covode.recordClassIndex(12330);
            }
        }

        static {
            Covode.recordClassIndex(12329);
        }

        private C10732a() {
        }

        public /* synthetic */ C10732a(byte b) {
            this();
        }

        /* renamed from: com.bytedance.android.livesdk.service.c.c.d$a$b */
        public static final class C10735b {

            /* renamed from: a */
            public long f25861a;

            /* renamed from: b */
            public long f25862b;

            /* renamed from: c */
            public long f25863c = C11200a.m19851a();

            /* renamed from: d */
            public long f25864d = C11200a.m19851a();

            /* renamed from: e */
            public int f25865e;

            /* renamed from: f */
            public int f25866f;

            /* renamed from: g */
            public long f25867g;

            static {
                Covode.recordClassIndex(12332);
            }

            public C10735b(long j) {
                this.f25867g = j;
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.service.c.c.d$b */
    public enum EnumC10736b {
        MESSAGE_ERROR(-10),
        ASSET_NOT_FOUND(-11),
        ASSET_ERROR(-12),
        FOUNDATION_ERROR(-13);
        

        /* renamed from: b */
        private int f25869b;

        public final int getErrorCode() {
            return this.f25869b;
        }

        static {
            Covode.recordClassIndex(12333);
        }

        public final void setErrorCode(int i) {
            this.f25869b = i;
        }

        private EnumC10736b(int i) {
            this.f25869b = i;
        }
    }

    private C10731d() {
        this.f25856g = new LinkedList<>();
        this.f25855e = new C88411a();
        this.f25857h = new C0489d<>();
    }

    public /* synthetic */ C10731d(byte b) {
        this();
    }

    /* renamed from: a */
    public final void mo17655a(int i) {
        C10732a.C10735b a = this.f25857h.mo2078a((long) i, null);
        if (a != null) {
            a.f25861a = C11200a.m19851a() - a.f25863c;
            a.f25865e = 1;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.service.c.c.d$c */
    public static final class C10737c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C10731d f25870a;

        /* renamed from: b */
        final /* synthetic */ boolean f25871b;

        static {
            Covode.recordClassIndex(12334);
        }

        public C10737c(C10731d dVar, boolean z) {
            this.f25870a = dVar;
            this.f25871b = z;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            int i;
            C10731d dVar = this.f25870a;
            boolean z = this.f25871b;
            HashMap hashMap = new HashMap();
            C89219l.m154721d(hashMap, "");
            String a = C10729b.m19318a();
            if (a == null) {
                a = "";
            }
            hashMap.put("cpu", a);
            String b = C10729b.m19320b();
            if (b == null) {
                b = "";
            }
            hashMap.put("pss", b);
            String a2 = C10729b.m19319a(z);
            if (a2 == null) {
                a2 = "";
            }
            hashMap.put("stream", a2);
            C6501b a3 = C6501b.C6502a.m13948a("gift_effect_performance_monitor").mo12652a((Map<String, String>) hashMap).mo12651a("send_gift_scene", C10890a.m19496b().getDesc()).mo12646a("asset_id", dVar.f25853c);
            AbstractC6872f b2 = C11115u.m19743a().mo17915b();
            C89219l.m154716b(b2, "");
            String valueOf = String.valueOf(b2.mo13161c());
            Map map = (Map) DataChannelGlobal.f42558d.mo28324b(C9097di.class);
            if (map == null || (i = map.get("anchor_id")) == null) {
                i = 0;
            }
            a3.mo12645a("is_anchor", C89219l.m154714a(valueOf, i) ? 1 : 0).mo12639a().mo12655b();
        }
    }

    /* renamed from: a */
    public final void mo17660a(LinkedList<AbstractC8812b<? extends C9543b>> linkedList) {
        if (linkedList == null) {
            linkedList = new LinkedList<>();
        }
        this.f25856g = linkedList;
    }

    /* renamed from: a */
    public final void mo17658a(C10732a.C10735b bVar, int i) {
        C89219l.m154721d(bVar, "");
        this.f25857h.mo2083b((long) i, bVar);
    }

    /* renamed from: a */
    public final void mo17657a(int i, boolean z) {
        this.f25858i = z;
        C10732a.C10735b a = this.f25857h.mo2078a((long) i, null);
        if (a != null) {
            a.f25862b = C11200a.m19851a() - a.f25864d;
            a.f25866f = 1;
        }
    }

    /* renamed from: a */
    public final void mo17659a(EnumC10736b bVar, String str) {
        C89219l.m154721d(bVar, "");
        C6501b a = C6501b.C6502a.m13948a("gift_effect_msg_load_fail").mo12645a("is_asset_local", this.f25851a ? 1 : 0).mo12645a("is_own_send", this.f25852b ? 1 : 0).mo12646a("asset_id", this.f25853c).mo12651a("error_code", String.valueOf(bVar.getErrorCode())).mo12651a("error_msg", str);
        AbstractC6872f b = C11115u.m19743a().mo17915b();
        C89219l.m154716b(b, "");
        b.mo13161c();
        Map map = (Map) DataChannelGlobal.f42558d.mo28324b(C9097di.class);
        if (map == null || map.get("anchor_id") == null) {
            Integer.valueOf(0);
        }
        a.mo12645a("is_anchor", 0).mo12639a().mo12655b();
    }

    /* renamed from: a */
    public final void mo17656a(int i, Long l, Integer num, Long l2, Integer num2) {
        String str;
        C10732a.C10735b a = this.f25857h.mo2078a((long) i, null);
        if (a != null) {
            C6501b a2 = C6501b.C6502a.m13948a("gift_plate_fadeout").mo12650a("tray_show_time", (Number) l2).mo12650a("combo_cnts", (Number) num).mo12650a("tray_show_cnts", (Number) num2).mo12645a("is_profile_icon_load_success", a.f25865e).mo12645a("is_gift_icon_load_success", a.f25866f).mo12646a("profile_icon_duration_ms", a.f25861a).mo12646a("gift_icon_duration_ms", a.f25862b).mo12645a("is_dynamic_icon", this.f25858i ? 1 : 0);
            AbstractC6872f b = C11115u.m19743a().mo17915b();
            C89219l.m154716b(b, "");
            b.mo13161c();
            Map map = (Map) DataChannelGlobal.f42558d.mo28324b(C9097di.class);
            if (map == null || map.get("anchor_id") == null) {
                Integer.valueOf(0);
            }
            C6501b a3 = a2.mo12645a("is_anchor", 0);
            AbstractC6872f b2 = C11115u.m19743a().mo17915b();
            C89219l.m154716b(b2, "");
            long c = b2.mo13161c();
            if (l != null && l.longValue() == c) {
                str = "1";
            } else {
                str = "0";
            }
            a3.mo12651a("is_own_send", str).mo12639a().mo12655b();
        }
    }
}
