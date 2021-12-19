package com.p2082ss.android.ugc.aweme.shortvideo.subtitle;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.b */
public final class C73205b {

    /* renamed from: b */
    public static final C73206a f164401b = new C73206a((byte) 0);

    /* renamed from: a */
    public final Keva f164402a;

    static {
        Covode.recordClassIndex(85923);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.b$a */
    public static final class C73206a {
        static {
            Covode.recordClassIndex(85924);
        }

        private C73206a() {
        }

        public /* synthetic */ C73206a(byte b) {
            this();
        }
    }

    public C73205b() {
        Keva repo = Keva.getRepo("auto_caption");
        C89219l.m154716b(repo, "");
        this.f164402a = repo;
    }

    /* renamed from: a */
    public final void mo115748a(long j) {
        this.f164402a.storeLong("authkey_store_time", j);
    }

    /* renamed from: a */
    public final void mo115749a(String str) {
        C89219l.m154721d(str, "");
        this.f164402a.storeString("authkey_value", str);
    }
}
