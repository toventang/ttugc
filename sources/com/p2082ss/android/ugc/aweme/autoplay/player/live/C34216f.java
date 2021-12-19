package com.p2082ss.android.ugc.aweme.autoplay.player.live;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67482ak;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67540c;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67568r;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67573s;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67575t;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.autoplay.player.live.f */
public final class C34216f implements AbstractC34203b {

    /* renamed from: b */
    public static final C34217a f80905b = new C34217a((byte) 0);

    /* renamed from: a */
    public final C34215e f80906a;

    /* renamed from: c */
    private long f80907c = -1;

    /* renamed from: d */
    private long f80908d;

    /* renamed from: e */
    private long f80909e;

    static {
        Covode.recordClassIndex(41151);
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.live.AbstractC34203b
    /* renamed from: a */
    public final void mo60366a(View view, int i, int i2) {
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.live.AbstractC34203b
    public final void ak_() {
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.live.AbstractC34203b
    /* renamed from: e */
    public final void mo60522e() {
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.live.AbstractC34203b
    /* renamed from: f */
    public final void mo60523f() {
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.live.AbstractC34203b
    /* renamed from: h */
    public final void mo60530h() {
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.live.AbstractC34203b
    /* renamed from: i */
    public final void mo60531i() {
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.live.AbstractC34203b
    /* renamed from: j */
    public final void mo60532j() {
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.live.AbstractC34203b
    /* renamed from: k */
    public final void mo60533k() {
    }

    /* renamed from: com.ss.android.ugc.aweme.autoplay.player.live.f$a */
    public static final class C34217a {
        static {
            Covode.recordClassIndex(41152);
        }

        private C34217a() {
        }

        public /* synthetic */ C34217a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.live.AbstractC34203b
    public final void al_() {
        this.f80908d = 0;
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.live.AbstractC34203b
    /* renamed from: l */
    public final void mo60534l() {
        this.f80908d = 0;
    }

    /* renamed from: m */
    private final LiveRoomStruct m69946m() {
        Aweme aweme = this.f80906a.f80898g;
        if (aweme != null) {
            return aweme.getNewLiveRoomData();
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.live.AbstractC34203b
    /* renamed from: g */
    public final void mo60524g() {
        this.f80907c = System.currentTimeMillis();
        this.f80909e = System.currentTimeMillis();
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.live.AbstractC34203b
    /* renamed from: a */
    public final void mo60365a() {
        this.f80908d = System.currentTimeMillis();
        if (this.f80907c >= 0) {
            this.f80907c = -1;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.live.AbstractC34203b
    public final void am_() {
        C67568r rVar;
        Object obj;
        User user;
        Long l;
        LiveRoomStruct m = m69946m();
        if (m == null || !m.isFinish()) {
            if (this.f80906a.f80901j && this.f80908d > 0) {
                if (this.f80906a.f80903l != null) {
                    System.currentTimeMillis();
                }
                if (this.f80909e > 0 && (rVar = this.f80906a.f80899h) != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    C67540c cVar = (C67540c) new C67575t().mo106433s(rVar.f151312g).mo106460p(rVar.f151313h);
                    LiveRoomStruct m2 = m69946m();
                    Integer num = null;
                    if (m2 != null) {
                        obj = Long.valueOf(m2.ownerUserId);
                    } else {
                        LiveRoomStruct m3 = m69946m();
                        if (m3 == null || (user = m3.owner) == null) {
                            obj = null;
                        } else {
                            obj = user.getUid();
                        }
                    }
                    C67482ak akVar = (C67482ak) cVar.mo106485e(String.valueOf(obj));
                    LiveRoomStruct m4 = m69946m();
                    if (m4 != null) {
                        l = Long.valueOf(m4.f114485id);
                    } else {
                        l = null;
                    }
                    C67575t tVar = (C67575t) akVar.mo106434t(String.valueOf(l)).mo106488q("click").mo106458n(rVar.f151315j);
                    tVar.mo106452c("duration", String.valueOf(Long.valueOf(currentTimeMillis - this.f80909e)));
                    C67540c b = tVar.mo106480a(rVar.f151314i).mo106482b(rVar.f151311f);
                    String str = rVar.f151321p;
                    C89219l.m154721d(str, "");
                    b.mo106452c(C67573s.f151337e, str);
                    C67575t tVar2 = (C67575t) b.mo106486f(rVar.f151309d).mo106487g(rVar.f151319n);
                    Aweme aweme = this.f80906a.f80898g;
                    if (aweme != null) {
                        num = Integer.valueOf(aweme.getFollowStatus());
                    }
                    tVar2.mo106452c("follow_status", String.valueOf(num));
                    tVar2.mo96792f();
                }
            }
            this.f80908d = 0;
        }
    }

    public C34216f(C34215e eVar) {
        C89219l.m154721d(eVar, "");
        this.f80906a = eVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.live.AbstractC34203b
    /* renamed from: a */
    public final void mo60519a(String str) {
        C89219l.m154721d(str, "");
        this.f80908d = 0;
    }
}
