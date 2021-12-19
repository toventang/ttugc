package com.p2082ss.android.ugc.aweme.specact.pendant.p3929c.p3934d;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.aweme.specact.pendant.p3929c.AbstractC74981c;
import com.p2082ss.android.ugc.aweme.specact.pendant.p3929c.C74972b;
import com.p2082ss.android.ugc.aweme.specact.pendant.p3937e.AbstractC75020a;
import com.p2082ss.android.ugc.aweme.specact.pendant.p3940h.C75081k;
import com.p2082ss.android.ugc.aweme.specact.popup.p3942a.C75126k;
import java.util.concurrent.TimeUnit;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.specact.pendant.c.d.a */
public final class C74991a implements AbstractC74981c {

    /* renamed from: a */
    public static final C74992a f168583a = new C74992a((byte) 0);

    /* renamed from: b */
    private C75126k.C75130d f168584b;

    /* renamed from: c */
    private boolean f168585c;

    /* renamed from: d */
    private Keva f168586d = Keva.getRepo("specact.pendant.bubble.NewUserStaticLongBubble");

    static {
        Covode.recordClassIndex(87863);
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.pendant.p3929c.AbstractC74981c
    /* renamed from: a */
    public final void mo118101a(String str) {
        C89219l.m154721d(str, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.pendant.p3929c.AbstractC74981c
    /* renamed from: a */
    public final boolean mo118102a() {
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.c.d.a$a */
    public static final class C74992a {
        static {
            Covode.recordClassIndex(87864);
        }

        private C74992a() {
        }

        public /* synthetic */ C74992a(byte b) {
            this();
        }
    }

    /* renamed from: b */
    private final int m131644b() {
        return this.f168586d.getInt("_bubble_show_num", 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.pendant.p3929c.AbstractC74981c
    /* renamed from: a */
    public final void mo118100a(C75126k.C75129c cVar) {
        C75126k.C75130d dVar;
        String str = null;
        if (cVar != null) {
            dVar = cVar.f168918j;
        } else {
            dVar = null;
        }
        this.f168584b = dVar;
        if (dVar != null) {
            str = dVar.f168920a;
        }
        if (str == null || str.length() == 0) {
            C74972b.m131623a("NewUserStaticLongBubble.onSettingSynced  something is null or empty");
            this.f168585c = false;
            return;
        }
        C75126k.C75130d dVar2 = this.f168584b;
        if (dVar2 == null) {
            return;
        }
        if (m131644b() >= dVar2.f168922c) {
            this.f168585c = false;
        } else if (((long) (C75081k.m131844a() - this.f168586d.getInt("_bubble_last_show_time", 0))) > TimeUnit.DAYS.toSeconds((long) dVar2.f168923d)) {
            this.f168585c = true;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.pendant.p3929c.AbstractC74981c
    /* renamed from: a */
    public final boolean mo118103a(AbstractC75020a aVar, int i) {
        C75126k.C75130d dVar = this.f168584b;
        if (dVar == null || !this.f168585c || i < dVar.f168921b) {
            return false;
        }
        if (aVar != null) {
            if (aVar.mo118142e()) {
                return false;
            }
            String str = dVar.f168920a;
            if (str == null) {
                C89219l.m154715b();
            }
            aVar.mo118136b(str, "new_user_rewards");
        }
        this.f168586d.storeInt("_bubble_show_num", m131644b() + 1);
        this.f168586d.storeInt("_bubble_last_show_time", C75081k.m131844a());
        this.f168585c = false;
        return true;
    }
}
