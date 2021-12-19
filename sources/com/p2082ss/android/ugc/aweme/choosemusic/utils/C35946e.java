package com.p2082ss.android.ugc.aweme.choosemusic.utils;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.utils.e */
public final class C35946e {

    /* renamed from: a */
    public String f84836a;

    /* renamed from: b */
    public long f84837b;

    /* renamed from: c */
    private long f84838c;

    /* renamed from: d */
    private int f84839d;

    static {
        Covode.recordClassIndex(43188);
    }

    /* renamed from: c */
    public final int mo63064c(String str) {
        if (!C89219l.m154714a((Object) this.f84836a, (Object) str)) {
            return 0;
        }
        return this.f84839d;
    }

    /* renamed from: a */
    public final void mo63061a(String str) {
        if (!C89219l.m154714a((Object) this.f84836a, (Object) str)) {
            this.f84837b = -1;
            this.f84838c = 0;
            return;
        }
        this.f84838c = System.currentTimeMillis() - this.f84837b;
    }

    /* renamed from: b */
    public final long mo63063b(String str) {
        if (!C89219l.m154714a((Object) this.f84836a, (Object) str)) {
            return 0;
        }
        if (this.f84838c <= 0 && this.f84837b > 0) {
            this.f84838c = System.currentTimeMillis() - this.f84837b;
        }
        return this.f84838c;
    }

    /* renamed from: a */
    public final void mo63062a(String str, int i) {
        this.f84836a = str;
        this.f84838c = 0;
        this.f84837b = System.currentTimeMillis();
        this.f84839d = i;
    }
}
