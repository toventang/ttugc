package com.p2082ss.android.ugc.aweme.autoplay.p2346b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.autoplay.p2348d.AbstractC34145c;
import com.p2082ss.android.ugc.aweme.autoplay.p2348d.C34176n;
import com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b;
import com.p2082ss.android.ugc.aweme.autoplay.player.live.C34205d;
import com.p2082ss.android.ugc.aweme.autoplay.player.live.C34223j;
import com.p2082ss.android.ugc.aweme.autoplay.player.video.C34246c;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.autoplay.b.b */
public final class C34058b implements AbstractC34145c {

    /* renamed from: a */
    public final C34205d f80534a;

    /* renamed from: b */
    private final AbstractC89244h f80535b = C89250i.m154773a((AbstractC89171a) new C34060b(this));

    /* renamed from: c */
    private final C34246c f80536c;

    /* renamed from: d */
    private final AbstractC89244h f80537d = C89250i.m154773a((AbstractC89171a) new C34059a(this));

    /* renamed from: e */
    private AbstractC34186b.AbstractC34187a f80538e;

    static {
        Covode.recordClassIndex(40992);
    }

    /* renamed from: a */
    public final C34223j mo60346a() {
        return (C34223j) this.f80535b.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34189c
    public final void an_() {
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.p2348d.AbstractC34145c
    /* renamed from: h */
    public final C34176n mo60349h() {
        return (C34176n) this.f80537d.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.p2348d.AbstractC34145c
    /* renamed from: g */
    public final C34246c mo60348g() {
        return this.f80536c;
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.p2348d.AbstractC34145c
    /* renamed from: i */
    public final AbstractC34186b.AbstractC34187a mo60350i() {
        return this.f80538e;
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34189c
    public final void bg_() {
        mo60346a().bg_();
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34189c
    public final void bi_() {
        mo60346a().bi_();
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34189c
    /* renamed from: e */
    public final void mo60344e() {
        mo60346a().mo60344e();
    }

    /* renamed from: com.ss.android.ugc.aweme.autoplay.b.b$b */
    static final class C34060b extends AbstractC89220m implements AbstractC89171a<C34223j> {

        /* renamed from: a */
        final /* synthetic */ C34058b f80540a;

        static {
            Covode.recordClassIndex(40994);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34060b(C34058b bVar) {
            super(0);
            this.f80540a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C34223j invoke() {
            return new C34223j(this.f80540a.f80534a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34189c
    public final boolean aZ_() {
        return mo60346a().aZ_();
    }

    /* renamed from: com.ss.android.ugc.aweme.autoplay.b.b$a */
    static final class C34059a extends AbstractC89220m implements AbstractC89171a<C34176n> {

        /* renamed from: a */
        final /* synthetic */ C34058b f80539a;

        static {
            Covode.recordClassIndex(40993);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34059a(C34058b bVar) {
            super(0);
            this.f80539a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C34176n invoke() {
            return new C34176n(this.f80539a.f80534a, this.f80539a.mo60346a(), (byte) 0);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.p2348d.AbstractC34145c
    /* renamed from: a */
    public final void mo60347a(AbstractC34186b.AbstractC34187a aVar) {
        this.f80538e = aVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34189c
    /* renamed from: a */
    public final void mo60340a(long j) {
        mo60346a().mo60340a(j);
    }

    public C34058b(C34205d dVar) {
        C89219l.m154721d(dVar, "");
        this.f80534a = dVar;
    }
}
