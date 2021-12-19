package com.bytedance.android.livesdk.service.p625c.p626a;

import android.util.LongSparseArray;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.service.p621a.C10631a;
import com.bytedance.android.livesdk.utils.p653a.C11200a;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.service.c.a.a */
public final class C10703a {

    /* renamed from: b */
    public static final C10704a f25778b = new C10704a((byte) 0);

    /* renamed from: a */
    public int f25779a;

    /* renamed from: c */
    private long f25780c;

    /* renamed from: d */
    private long f25781d;

    /* renamed from: e */
    private LongSparseArray<Long> f25782e = new LongSparseArray<>();

    static {
        Covode.recordClassIndex(12300);
    }

    /* renamed from: com.bytedance.android.livesdk.service.c.a.a$a */
    public static final class C10704a {

        /* renamed from: com.bytedance.android.livesdk.service.c.a.a$a$a */
        public static final class C10705a {

            /* renamed from: a */
            public static final C10703a f25783a = new C10703a();

            /* renamed from: b */
            public static final C10706a f25784b = new C10706a((byte) 0);

            /* renamed from: com.bytedance.android.livesdk.service.c.a.a$a$a$a */
            public static final class C10706a {
                static {
                    Covode.recordClassIndex(12303);
                }

                private C10706a() {
                }

                public /* synthetic */ C10706a(byte b) {
                    this();
                }
            }

            static {
                Covode.recordClassIndex(12302);
            }
        }

        static {
            Covode.recordClassIndex(12301);
        }

        private C10704a() {
        }

        public /* synthetic */ C10704a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo17630a() {
        String str;
        if (this.f25780c != 0) {
            C6501b a = C6501b.C6502a.m13948a("gift_dynamic_preview_success").mo12646a("zip_show_duration", C11200a.m19851a() - this.f25781d).mo12646a("gift_id", this.f25780c);
            if (C10631a.C10632a.C10633a.f25635a.f25634a) {
                str = "call";
            } else {
                str = "click";
            }
            a.mo12651a("show_type", str).mo12639a().mo12655b();
            this.f25780c = 0;
        }
    }

    /* renamed from: a */
    private final void m19270a(long j) {
        this.f25780c = j;
        this.f25781d = C11200a.m19851a();
    }

    /* renamed from: a */
    public final void mo17631a(long j, int i) {
        this.f25782e.put(j, Long.valueOf(C11200a.m19851a()));
        m19270a(j);
        this.f25779a = i;
    }

    /* renamed from: a */
    public static void m19271a(long j, String str) {
        String str2;
        C89219l.m154721d(str, "");
        C6501b a = C6501b.C6502a.m13948a("gift_dynamic_preview_fail").mo12639a().mo12646a("gift_id", j);
        if (C10631a.C10632a.C10633a.f25635a.f25634a) {
            str2 = "call";
        } else {
            str2 = "click";
        }
        a.mo12651a("show_type", str2).mo12651a("error_code", str).mo12655b();
    }

    /* renamed from: a */
    public final void mo17632a(long j, boolean z) {
        String str;
        String str2;
        long a = C11200a.m19851a();
        Long l = this.f25782e.get(j, Long.valueOf(a));
        C89219l.m154716b(l, "");
        C6501b a2 = C6501b.C6502a.m13948a("gift_zip_load_time").mo12639a().mo12646a("gift_id", j).mo12646a("zip_load_time", a - l.longValue());
        if (C10631a.C10632a.C10633a.f25635a.f25634a) {
            str = "call";
        } else {
            str = "click";
        }
        C6501b a3 = a2.mo12651a("show_type", str);
        if (z) {
            str2 = "1";
        } else {
            str2 = "0";
        }
        a3.mo12651a("is_zip_local", str2).mo12655b();
    }
}
