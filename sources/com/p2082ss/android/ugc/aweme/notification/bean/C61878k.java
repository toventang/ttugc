package com.p2082ss.android.ugc.aweme.notification.bean;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89214g;

/* renamed from: com.ss.android.ugc.aweme.notification.bean.k */
public final class C61878k extends User {
    public static final C61879a Companion = new C61879a(null);

    /* renamed from: a */
    private int f140470a;

    static {
        Covode.recordClassIndex(72627);
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.bean.k$a */
    public static final class C61879a implements Serializable {
        static {
            Covode.recordClassIndex(72628);
        }

        private C61879a() {
        }

        public /* synthetic */ C61879a(C89214g gVar) {
            this();
        }
    }

    public final int getType() {
        return this.f140470a;
    }

    public final void setType(int i) {
        this.f140470a = i;
    }

    public C61878k(int i) {
        this.f140470a = i;
    }
}
