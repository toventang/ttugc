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

/* renamed from: com.ss.android.ugc.aweme.specact.pendant.c.d.c */
public final class C74999c implements AbstractC74981c {

    /* renamed from: a */
    public static final C75000a f168598a = new C75000a((byte) 0);

    /* renamed from: b */
    private C75126k.C75137k f168599b;

    /* renamed from: c */
    private boolean f168600c;

    /* renamed from: d */
    private Keva f168601d = Keva.getRepo("specact.pendant.bubble.VideoTaskPromptLongBubble");

    static {
        Covode.recordClassIndex(87871);
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.pendant.p3929c.AbstractC74981c
    /* renamed from: a */
    public final void mo118101a(String str) {
        C89219l.m154721d(str, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.pendant.p3929c.AbstractC74981c
    /* renamed from: a */
    public final boolean mo118102a() {
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.c.d.c$a */
    public static final class C75000a {
        static {
            Covode.recordClassIndex(87872);
        }

        private C75000a() {
        }

        public /* synthetic */ C75000a(byte b) {
            this();
        }
    }

    /* renamed from: b */
    private final int m131650b() {
        return this.f168601d.getInt("_bubble_show_num", 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.pendant.p3929c.AbstractC74981c
    /* renamed from: a */
    public final void mo118100a(C75126k.C75129c cVar) {
        C75126k.C75137k kVar;
        String str = null;
        if (cVar != null) {
            kVar = cVar.f168919k;
        } else {
            kVar = null;
        }
        this.f168599b = kVar;
        if (kVar != null) {
            str = kVar.f168948a;
        }
        if (str == null || str.length() == 0) {
            C74972b.m131623a("VideoTaskPromptLongBubble.onSettingSynced  something is null or empty");
            this.f168600c = false;
            return;
        }
        C75126k.C75137k kVar2 = this.f168599b;
        if (kVar2 == null) {
            return;
        }
        if (m131650b() >= kVar2.f168950c) {
            this.f168600c = false;
        } else if (((long) (C75081k.m131844a() - this.f168601d.getInt("_bubble_last_show_time", 0))) > TimeUnit.DAYS.toSeconds((long) kVar2.f168951d)) {
            this.f168600c = true;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.pendant.p3929c.AbstractC74981c
    /* renamed from: a */
    public final boolean mo118103a(AbstractC75020a aVar, int i) {
        C75126k.C75137k kVar = this.f168599b;
        if (kVar == null || !this.f168600c) {
            return false;
        }
        if (aVar != null) {
            String str = kVar.f168948a;
            if (str == null) {
                C89219l.m154715b();
            }
            aVar.mo118140d(str);
        }
        this.f168601d.storeInt("_bubble_show_num", m131650b() + 1);
        this.f168601d.storeInt("_bubble_last_show_time", C75081k.m131844a());
        this.f168600c = false;
        return true;
    }
}
