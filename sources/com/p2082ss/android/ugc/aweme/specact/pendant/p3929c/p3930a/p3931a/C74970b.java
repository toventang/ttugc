package com.p2082ss.android.ugc.aweme.specact.pendant.p3929c.p3930a.p3931a;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.aweme.specact.pendant.p3929c.AbstractC74981c;
import com.p2082ss.android.ugc.aweme.specact.pendant.p3929c.C74972b;
import com.p2082ss.android.ugc.aweme.specact.pendant.p3937e.AbstractC75020a;
import com.p2082ss.android.ugc.aweme.specact.popup.p3942a.C75126k;
import java.util.concurrent.TimeUnit;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.specact.pendant.c.a.a.b */
public final class C74970b implements AbstractC74981c {

    /* renamed from: a */
    public static final C74971a f168544a = new C74971a((byte) 0);

    /* renamed from: b */
    private C75126k.C75132f f168545b;

    /* renamed from: c */
    private boolean f168546c;

    /* renamed from: d */
    private Keva f168547d = Keva.getRepo("specact.pendant.bubble.PendantClickTipBubble");

    static {
        Covode.recordClassIndex(87842);
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.pendant.p3929c.AbstractC74981c
    /* renamed from: a */
    public final boolean mo118102a() {
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.c.a.a.b$a */
    public static final class C74971a {
        static {
            Covode.recordClassIndex(87843);
        }

        private C74971a() {
        }

        public /* synthetic */ C74971a(byte b) {
            this();
        }
    }

    /* renamed from: b */
    private final boolean m131615b() {
        return this.f168547d.getBoolean("_pendant_is_click", false);
    }

    /* renamed from: c */
    private final int m131616c() {
        return this.f168547d.getInt("_bubble_show_num", 0);
    }

    /* renamed from: d */
    private final long m131617d() {
        return this.f168547d.getLong("_bubble_first_show_time", 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.pendant.p3929c.AbstractC74981c
    /* renamed from: a */
    public final void mo118101a(String str) {
        C89219l.m154721d(str, "");
        if (C89219l.m154714a((Object) str, (Object) "CLICK_STATIC_PENDANT") && this.f168545b != null) {
            this.f168547d.storeBoolean("_pendant_is_click", true);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.pendant.p3929c.AbstractC74981c
    /* renamed from: a */
    public final void mo118100a(C75126k.C75129c cVar) {
        C75126k.C75132f fVar;
        String str = null;
        if (cVar != null) {
            fVar = cVar.f168913e;
        } else {
            fVar = null;
        }
        this.f168545b = fVar;
        if (fVar != null) {
            str = fVar.f168929a;
        }
        if (str == null || str.length() == 0) {
            C74972b.m131623a("PendantClickTipBubble.onSettingSynced  something is null or empty");
            this.f168546c = false;
            return;
        }
        C75126k.C75132f fVar2 = this.f168545b;
        if (fVar2 != null) {
            int c = m131616c();
            boolean b = m131615b();
            if (c == 0) {
                this.f168546c = true;
                C74972b.m131623a("PendantClickTipBubble.onSettingSynced showTimes:0,  needShow:true");
            } else if (b) {
                C74972b.m131623a("PendantClickTipBubble.onSettingSynced showTimes:" + c + ",  isPendentClick:" + b + ",  needShow:false");
            } else if (c == 1) {
                if (System.currentTimeMillis() - m131617d() > TimeUnit.DAYS.toMillis((long) fVar2.f168931c)) {
                    this.f168546c = true;
                } else {
                    C74972b.m131623a("PendantClickTipBubble.onSettingSynced showTimes:" + c + ", Time is not,  needShow:false");
                }
            } else if (c != 2) {
                C74972b.m131623a("PendantClickTipBubble.onSettingSynced showTimes:" + c + ",  needShow:false");
            } else if (System.currentTimeMillis() - m131617d() > TimeUnit.DAYS.toMillis((long) fVar2.f168932d)) {
                this.f168546c = true;
            } else {
                C74972b.m131623a("PendantClickTipBubble.onSettingSynced showTimes:" + c + ", Time is not,  needShow:false");
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.pendant.p3929c.AbstractC74981c
    /* renamed from: a */
    public final boolean mo118103a(AbstractC75020a aVar, int i) {
        C75126k.C75132f fVar = this.f168545b;
        if (fVar == null || !this.f168546c) {
            return false;
        }
        if (m131616c() != 0 && m131615b()) {
            C74972b.m131623a("PendantClickTipBubble.tryShowBubble, notShow, b: isClicked");
            this.f168546c = false;
            return false;
        } else if (i < fVar.f168930b) {
            C74972b.m131623a("PendantClickTipBubble.tryShowBubble, notShow, b: vv is:".concat(String.valueOf(i)));
            return false;
        } else {
            if (aVar != null) {
                if (aVar.mo118142e()) {
                    C74972b.m131623a("PendantClickTipBubble.tryShowBubble, notShow, b: staticPendantIsFold");
                    return false;
                }
                String str = fVar.f168929a;
                if (str == null) {
                    C89219l.m154715b();
                }
                aVar.mo118135b(str);
            }
            C74972b.m131623a("PendantClickTipBubble.tryShowBubble, Show!!!");
            this.f168547d.storeInt("_bubble_show_num", m131616c() + 1);
            if (m131617d() == 0) {
                this.f168547d.storeLong("_bubble_first_show_time", System.currentTimeMillis());
            }
            this.f168546c = false;
            return true;
        }
    }
}
