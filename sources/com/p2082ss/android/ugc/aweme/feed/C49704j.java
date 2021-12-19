package com.p2082ss.android.ugc.aweme.feed;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.j */
public final class C49704j {

    /* renamed from: d */
    public static final C49705a f114387d = new C49705a((byte) 0);

    /* renamed from: a */
    public final Aweme f114388a;

    /* renamed from: b */
    public final String f114389b;

    /* renamed from: c */
    public final String f114390c;

    /* renamed from: com.ss.android.ugc.aweme.feed.j$b */
    public static final class C49706b<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C49706b f114391a = new C49706b();

        static {
            Covode.recordClassIndex(58555);
        }

        C49706b() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(58553);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.j$a */
    public static final class C49705a {
        static {
            Covode.recordClassIndex(58554);
        }

        private C49705a() {
        }

        public /* synthetic */ C49705a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.j$c */
    public static final class C49707c<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C49707c f114392a = new C49707c();

        static {
            Covode.recordClassIndex(58556);
        }

        C49707c() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            if (th != null) {
                th.getMessage();
            }
        }
    }

    public C49704j(Aweme aweme, String str, String str2) {
        C89219l.m154721d(aweme, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.f114388a = aweme;
        this.f114389b = str;
        this.f114390c = str2;
    }
}
