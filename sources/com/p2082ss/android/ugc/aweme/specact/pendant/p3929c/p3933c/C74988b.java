package com.p2082ss.android.ugc.aweme.specact.pendant.p3929c.p3933c;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.aweme.specact.pendant.p3929c.AbstractC74981c;
import com.p2082ss.android.ugc.aweme.specact.pendant.p3929c.C74972b;
import com.p2082ss.android.ugc.aweme.specact.pendant.p3937e.AbstractC75020a;
import com.p2082ss.android.ugc.aweme.specact.popup.p3942a.C75126k;
import java.util.concurrent.TimeUnit;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.specact.pendant.c.c.b */
public final class C74988b implements AbstractC74981c {

    /* renamed from: a */
    public static final C74989a f168579a = new C74989a((byte) 0);

    /* renamed from: b */
    private C75126k.C75133g f168580b;

    /* renamed from: c */
    private boolean f168581c;

    /* renamed from: d */
    private Keva f168582d = Keva.getRepo("specact.pendant.bubble.StaticPendantLongBubble");

    static {
        Covode.recordClassIndex(87860);
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.pendant.p3929c.AbstractC74981c
    /* renamed from: a */
    public final boolean mo118102a() {
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.c.c.b$a */
    public static final class C74989a {
        static {
            Covode.recordClassIndex(87861);
        }

        private C74989a() {
        }

        public /* synthetic */ C74989a(byte b) {
            this();
        }
    }

    /* renamed from: b */
    private final boolean m131637b() {
        return this.f168582d.getBoolean("_pendant_is_click", false);
    }

    /* renamed from: c */
    private final int m131638c() {
        return this.f168582d.getInt("_bubble_show_num", 0);
    }

    /* renamed from: d */
    private final long m131639d() {
        return this.f168582d.getLong("_bubble_first_show_time", 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.pendant.p3929c.AbstractC74981c
    /* renamed from: a */
    public final void mo118101a(String str) {
        C89219l.m154721d(str, "");
        if (C89219l.m154714a((Object) str, (Object) "CLICK_STATIC_PENDANT") && this.f168580b != null) {
            this.f168582d.storeBoolean("_pendant_is_click", true);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.pendant.p3929c.AbstractC74981c
    /* renamed from: a */
    public final void mo118100a(C75126k.C75129c cVar) {
        C75126k.C75133g gVar;
        String str = null;
        if (cVar != null) {
            gVar = cVar.f168914f;
        } else {
            gVar = null;
        }
        this.f168580b = gVar;
        if (gVar != null) {
            str = gVar.f168934b;
        }
        if (str == null || str.length() == 0) {
            C74972b.m131623a("PendantClickTipBubble.onSettingSynced  something is null or empty");
            this.f168581c = false;
            return;
        }
        C75126k.C75133g gVar2 = this.f168580b;
        if (gVar2 != null) {
            int c = m131638c();
            boolean b = m131637b();
            if (c == 0) {
                this.f168581c = true;
                C74972b.m131623a("PendantClickTipBubble.onSettingSynced showTimes:0,  needShow:true");
            } else if (b) {
                C74972b.m131623a("PendantClickTipBubble.onSettingSynced showTimes:" + c + ",  isPendentClick:" + b + ",  needShow:false");
            } else if (c != 1) {
                C74972b.m131623a("PendantClickTipBubble.onSettingSynced showTimes:" + c + ",  needShow:false");
            } else if (System.currentTimeMillis() - m131639d() > TimeUnit.DAYS.toMillis((long) gVar2.f168936d)) {
                this.f168581c = true;
                C74972b.m131623a("PendantClickTipBubble.onSettingSynced showTimes:" + c + ", show!!!");
            } else {
                C74972b.m131623a("PendantClickTipBubble.onSettingSynced showTimes:" + c + ", Time is not,  needShow:false");
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.pendant.p3929c.AbstractC74981c
    /* renamed from: a */
    public final boolean mo118103a(AbstractC75020a aVar, int i) {
        C75126k.C75133g gVar = this.f168580b;
        if (gVar == null) {
            return false;
        }
        if (m131638c() != 0 && m131637b()) {
            this.f168581c = false;
            return false;
        } else if (aVar != null && aVar.mo118141d()) {
            this.f168581c = false;
            return false;
        } else if (!this.f168581c) {
            return false;
        } else {
            if (i < gVar.f168935c) {
                C74972b.m131623a("StaticPendantLongBubble.tryShowBubble, notShow, b: vv is:".concat(String.valueOf(i)));
                return false;
            }
            if (aVar != null) {
                if (aVar.mo118142e()) {
                    C74972b.m131623a("StaticPendantLongBubble.tryShowBubble, notShow, b: staticPendantIsFold");
                    return false;
                }
                String str = gVar.f168934b;
                if (str == null) {
                    C89219l.m154715b();
                }
                aVar.mo118136b(str, "warmup_long_inform");
            }
            C74972b.m131623a("StaticPendantLongBubble.tryShowBubble, Show!!!");
            this.f168582d.storeInt("_bubble_show_num", m131638c() + 1);
            if (m131639d() == 0) {
                this.f168582d.storeLong("_bubble_first_show_time", System.currentTimeMillis());
            }
            this.f168581c = false;
            return true;
        }
    }
}
