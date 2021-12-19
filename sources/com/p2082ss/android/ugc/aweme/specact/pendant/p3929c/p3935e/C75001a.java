package com.p2082ss.android.ugc.aweme.specact.pendant.p3929c.p3935e;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.aweme.specact.pendant.p3929c.AbstractC74981c;
import com.p2082ss.android.ugc.aweme.specact.pendant.p3929c.C74972b;
import com.p2082ss.android.ugc.aweme.specact.popup.p3942a.C75126k;
import java.util.concurrent.TimeUnit;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.specact.pendant.c.e.a */
public final class C75001a implements AbstractC74981c {

    /* renamed from: a */
    public static final C75002a f168602a = new C75002a((byte) 0);

    /* renamed from: b */
    private Keva f168603b = Keva.getRepo("specact.pendant.bubble.BubbleManager");

    /* renamed from: c */
    private C75126k.C75131e f168604c;

    /* renamed from: d */
    private boolean f168605d;

    static {
        Covode.recordClassIndex(87873);
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.pendant.p3929c.AbstractC74981c
    /* renamed from: a */
    public final boolean mo118102a() {
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.c.e.a$a */
    public static final class C75002a {
        static {
            Covode.recordClassIndex(87874);
        }

        private C75002a() {
        }

        public /* synthetic */ C75002a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    private final int m131655a(C75126k.C75131e eVar) {
        return this.f168603b.getInt(eVar.f168924a + "_bubble_show_num", 0);
    }

    /* renamed from: b */
    private final long m131656b(C75126k.C75131e eVar) {
        return this.f168603b.getLong(eVar.f168924a + "_bubble_last_show_time", 0);
    }

    /* renamed from: c */
    private final boolean m131657c(C75126k.C75131e eVar) {
        return this.f168603b.getBoolean(eVar.f168924a + "_pendant_click_time", false);
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.pendant.p3929c.AbstractC74981c
    /* renamed from: a */
    public final void mo118101a(String str) {
        C75126k.C75131e eVar;
        C89219l.m154721d(str, "");
        if (C89219l.m154714a((Object) str, (Object) "CLICK_DYNAMIC_PENDANT") && (eVar = this.f168604c) != null) {
            this.f168603b.storeBoolean(eVar.f168924a + "_pendant_click_time", true);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.pendant.p3929c.AbstractC74981c
    /* renamed from: a */
    public final void mo118100a(C75126k.C75129c cVar) {
        C75126k.C75131e eVar;
        String str;
        C75126k.C75131e eVar2;
        C75126k.C75131e eVar3;
        String str2;
        String str3;
        String str4 = null;
        if (cVar != null) {
            eVar = cVar.f168912d;
        } else {
            eVar = null;
        }
        this.f168604c = eVar;
        if (eVar != null) {
            str = eVar.f168924a;
        } else {
            str = null;
        }
        if ((str == null || str.length() == 0) && (((eVar2 = this.f168604c) == null || (str3 = eVar2.f168925b) == null || str3.length() == 0) && ((eVar3 = this.f168604c) == null || (str2 = eVar3.f168926c) == null || str2.length() == 0))) {
            C74972b.m131623a("V1Bubble.onSettingSynced  something is null or empty");
            this.f168605d = false;
            return;
        }
        C75126k.C75131e eVar4 = this.f168604c;
        if (eVar4 != null) {
            StringBuilder sb = new StringBuilder("V1Bubble.onSettingSynced :bubbleId:");
            C75126k.C75131e eVar5 = this.f168604c;
            if (eVar5 != null) {
                str4 = eVar5.f168924a;
            }
            C74972b.m131623a(sb.append(str4).toString());
            Keva keva = this.f168603b;
            C89219l.m154716b(keva, "");
            if (keva.getAll().size() > 1000) {
                long b = m131656b(eVar4);
                int a = m131655a(eVar4);
                boolean c = m131657c(eVar4);
                this.f168603b.clear();
                C74972b.m131623a("V1Bubble.onSettingSynced clear keva");
                this.f168603b.storeInt(eVar4.f168924a + "_bubble_last_show_time", a);
                this.f168603b.storeLong(eVar4.f168924a + "_pendant_click_time", b);
                this.f168603b.storeBoolean(eVar4.f168924a + "_pendant_click_time", c);
            }
            int a2 = m131655a(eVar4);
            if (a2 == 0) {
                this.f168605d = true;
                C74972b.m131623a("V1Bubble.onSettingSynced showTimes:0,  needShow:true");
            } else if (a2 != 1) {
                C74972b.m131623a("V1Bubble.onSettingSynced showTimes:" + a2 + ",  needShow:false");
            } else if (m131657c(eVar4)) {
                C74972b.m131623a("V1Bubble.onSettingSynced  Have to click,  needShow:false");
            } else if (System.currentTimeMillis() - m131656b(eVar4) > TimeUnit.DAYS.toMillis((long) eVar4.f168928e)) {
                this.f168605d = true;
                C74972b.m131623a("V1Bubble.onSettingSynced showTimes:1, Time is not,  needShow:true");
            } else {
                C74972b.m131623a("V1Bubble.onSettingSynced showTimes:1, Time is not,  needShow:false");
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0039, code lost:
        if (r1 == null) goto L_0x003b;
     */
    @Override // com.p2082ss.android.ugc.aweme.specact.pendant.p3929c.AbstractC74981c
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo118103a(com.p2082ss.android.ugc.aweme.specact.pendant.p3937e.AbstractC75020a r8, int r9) {
        /*
        // Method dump skipped, instructions count: 148
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.specact.pendant.p3929c.p3935e.C75001a.mo118103a(com.ss.android.ugc.aweme.specact.pendant.e.a, int):boolean");
    }
}
