package com.p2082ss.android.ugc.aweme.xsearch.video;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import java.lang.ref.WeakReference;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.xsearch.video.d */
public final class C81772d {

    /* renamed from: d */
    public static final C81773a f182840d = new C81773a((byte) 0);

    /* renamed from: a */
    public WeakReference<Aweme> f182841a;

    /* renamed from: b */
    public boolean f182842b;

    /* renamed from: c */
    public Integer f182843c;

    /* renamed from: e */
    private Aweme f182844e;

    /* renamed from: f */
    private AbstractC34186b.AbstractC34189c f182845f;

    static {
        Covode.recordClassIndex(95179);
    }

    /* renamed from: com.ss.android.ugc.aweme.xsearch.video.d$a */
    public static final class C81773a {
        static {
            Covode.recordClassIndex(95180);
        }

        private C81773a() {
        }

        public /* synthetic */ C81773a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.xsearch.video.d$b */
    public static final class C81774b {

        /* renamed from: a */
        public static final C81772d f182846a = new C81772d((byte) 0);

        /* renamed from: b */
        public static final C81774b f182847b = new C81774b();

        private C81774b() {
        }

        static {
            Covode.recordClassIndex(95181);
        }
    }

    private C81772d() {
    }

    public /* synthetic */ C81772d(byte b) {
        this();
    }

    /* renamed from: a */
    public final void mo125489a(Aweme aweme, AbstractC34186b.AbstractC34189c cVar, Integer num, boolean z) {
        AbstractC34186b.AbstractC34189c cVar2;
        if ((!C89219l.m154714a(this.f182844e, aweme)) && (cVar2 = this.f182845f) != null) {
            cVar2.an_();
        }
        if (aweme != null) {
            this.f182841a = new WeakReference<>(aweme);
        } else {
            aweme = null;
        }
        this.f182844e = aweme;
        this.f182845f = cVar;
        this.f182843c = num;
        this.f182842b = z;
    }
}
