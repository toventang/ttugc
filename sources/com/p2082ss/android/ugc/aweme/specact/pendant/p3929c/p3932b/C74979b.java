package com.p2082ss.android.ugc.aweme.specact.pendant.p3929c.p3932b;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.aweme.specact.pendant.p3929c.AbstractC74981c;
import com.p2082ss.android.ugc.aweme.specact.pendant.p3929c.C74972b;
import com.p2082ss.android.ugc.aweme.specact.pendant.p3937e.AbstractC75020a;
import com.p2082ss.android.ugc.aweme.specact.popup.p3942a.C75126k;
import java.util.concurrent.TimeUnit;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.specact.pendant.c.b.b */
public final class C74979b implements AbstractC74981c {

    /* renamed from: a */
    public static final C74980a f168563a = new C74980a((byte) 0);

    /* renamed from: b */
    private C75126k.C75134h f168564b;

    /* renamed from: c */
    private boolean f168565c;

    /* renamed from: d */
    private Keva f168566d = Keva.getRepo("specact.pendant.bubble.PendantDynamicTipBubble");

    static {
        Covode.recordClassIndex(87851);
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.pendant.p3929c.AbstractC74981c
    /* renamed from: a */
    public final boolean mo118102a() {
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.c.b.b$a */
    public static final class C74980a {
        static {
            Covode.recordClassIndex(87852);
        }

        private C74980a() {
        }

        public /* synthetic */ C74980a(byte b) {
            this();
        }
    }

    /* renamed from: b */
    private final boolean m131625b() {
        return this.f168566d.getBoolean("_pendant_is_click", false);
    }

    /* renamed from: c */
    private final int m131626c() {
        return this.f168566d.getInt("_bubble_show_num", 0);
    }

    /* renamed from: d */
    private final long m131627d() {
        return this.f168566d.getLong("_bubble_first_show_time", 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.pendant.p3929c.AbstractC74981c
    /* renamed from: a */
    public final void mo118101a(String str) {
        C89219l.m154721d(str, "");
        if (C89219l.m154714a((Object) str, (Object) "CLICK_DYNAMIC_PENDANT") && this.f168564b != null) {
            this.f168566d.storeBoolean("_pendant_is_click", true);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.pendant.p3929c.AbstractC74981c
    /* renamed from: a */
    public final void mo118100a(C75126k.C75129c cVar) {
        C75126k.C75134h hVar;
        String str = null;
        if (cVar != null) {
            hVar = cVar.f168917i;
        } else {
            hVar = null;
        }
        this.f168564b = hVar;
        if (hVar != null) {
            str = hVar.f168937a;
        }
        if (str == null || str.length() == 0) {
            C74972b.m131623a("PendantDynamicTipBubble.onSettingSynced  something is null or empty");
            this.f168565c = false;
            return;
        }
        C75126k.C75134h hVar2 = this.f168564b;
        if (hVar2 != null) {
            int c = m131626c();
            boolean b = m131625b();
            if (c == 0) {
                this.f168565c = true;
                C74972b.m131623a("PendantDynamicTipBubble.onSettingSynced showTimes:0,  needShow:true");
            } else if (b) {
                C74972b.m131623a("PendantDynamicTipBubble.onSettingSynced showTimes:" + c + ",  isPendentClick:" + b + ",  needShow:false");
            } else if (c == 1) {
                if (System.currentTimeMillis() - m131627d() > TimeUnit.DAYS.toMillis((long) hVar2.f168939c)) {
                    this.f168565c = true;
                } else {
                    C74972b.m131623a("PendantDynamicTipBubble.onSettingSynced showTimes:" + c + ", Time is not,  needShow:false");
                }
            } else if (c != 2) {
                C74972b.m131623a("PendantDynamicTipBubble.onSettingSynced showTimes:" + c + ",  needShow:false");
            } else if (System.currentTimeMillis() - m131627d() > TimeUnit.DAYS.toMillis((long) hVar2.f168940d)) {
                this.f168565c = true;
            } else {
                C74972b.m131623a("PendantDynamicTipBubble.onSettingSynced showTimes:" + c + ", Time is not,  needShow:false");
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.pendant.p3929c.AbstractC74981c
    /* renamed from: a */
    public final boolean mo118103a(AbstractC75020a aVar, int i) {
        C75126k.C75134h hVar = this.f168564b;
        if (hVar == null || !this.f168565c) {
            return false;
        }
        if (m131626c() != 0 && m131625b()) {
            C74972b.m131623a("PendantDynamicTipBubble.tryShowBubble, notShow, b: isClicked");
            this.f168565c = false;
            return false;
        } else if (i < hVar.f168938b) {
            C74972b.m131623a("PendantDynamicTipBubble.tryShowBubble, notShow, b: vv is:".concat(String.valueOf(i)));
            return false;
        } else {
            if (aVar != null) {
                String str = hVar.f168937a;
                if (str == null) {
                    C89219l.m154715b();
                }
                aVar.mo118139c(str);
            }
            C74972b.m131623a("PendantDynamicTipBubble.tryShowBubble, Show!!!");
            this.f168566d.storeInt("_bubble_show_num", m131626c() + 1);
            if (m131627d() == 0) {
                this.f168566d.storeLong("_bubble_first_show_time", System.currentTimeMillis());
            }
            this.f168565c = false;
            return true;
        }
    }
}
