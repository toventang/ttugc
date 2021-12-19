package com.p2082ss.android.ugc.aweme.autoplay.p2348d;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.flowfeed.utils.AbstractC51064i;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.autoplay.d.n */
public final class C34176n extends AbstractC51064i {

    /* renamed from: a */
    public Aweme f80821a;

    /* renamed from: b */
    public AbstractC34186b.AbstractC34192d f80822b;

    /* renamed from: c */
    public AbstractC34186b.AbstractC34189c f80823c;

    /* renamed from: d */
    public int f80824d;

    /* renamed from: i */
    private final AbstractC89244h f80825i;

    /* renamed from: j */
    private final AbstractC89244h f80826j;

    /* renamed from: com.ss.android.ugc.aweme.autoplay.d.n$a */
    static final class C34177a extends AbstractC89220m implements AbstractC89171a<int[]> {

        /* renamed from: a */
        public static final C34177a f80827a = new C34177a();

        static {
            Covode.recordClassIndex(41111);
        }

        C34177a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ int[] invoke() {
            return new int[2];
        }
    }

    static {
        Covode.recordClassIndex(41110);
    }

    /* renamed from: g */
    private final int[] m69839g() {
        return (int[]) this.f80825i.getValue();
    }

    /* renamed from: h */
    private final Rect m69840h() {
        return (Rect) this.f80826j.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.flowfeed.utils.AbstractC51064i
    /* renamed from: a */
    public final int mo60326a() {
        return this.f80824d;
    }

    /* renamed from: com.ss.android.ugc.aweme.autoplay.d.n$b */
    static final class C34178b extends AbstractC89220m implements AbstractC89171a<Rect> {

        /* renamed from: a */
        public static final C34178b f80828a = new C34178b();

        static {
            Covode.recordClassIndex(41112);
        }

        C34178b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Rect invoke() {
            return new Rect();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.flowfeed.utils.AbstractC51064i
    /* renamed from: b */
    public final void mo60329b() {
        AbstractC34186b.AbstractC34189c cVar = this.f80823c;
        if (cVar != null) {
            cVar.bi_();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.flowfeed.utils.AbstractC51064i
    /* renamed from: c */
    public final Rect mo60332c() {
        View z;
        AbstractC34186b.AbstractC34192d dVar = this.f80822b;
        if (!(dVar == null || (z = dVar.mo60468z()) == null)) {
            z.getLocationOnScreen(m69839g());
            m69840h().set(m69839g()[0], m69839g()[1], m69839g()[0] + z.getWidth(), m69839g()[1] + z.getHeight());
        }
        return m69840h();
    }

    @Override // com.p2082ss.android.ugc.aweme.flowfeed.utils.AbstractC51064i
    /* renamed from: d */
    public final String mo60334d() {
        String str;
        User author;
        User author2;
        User author3;
        Aweme aweme = this.f80821a;
        if (aweme == null || aweme.getAuthor() == null) {
            return "SearchMultiVideoSubScrollObserver";
        }
        Aweme aweme2 = this.f80821a;
        if (aweme2 == null || (author3 = aweme2.getAuthor()) == null) {
            str = null;
        } else {
            str = author3.getRemarkName();
        }
        if (TextUtils.isEmpty(str)) {
            Aweme aweme3 = this.f80821a;
            if (aweme3 == null || (author2 = aweme3.getAuthor()) == null) {
                return null;
            }
            return author2.getNickname();
        }
        Aweme aweme4 = this.f80821a;
        if (aweme4 == null || (author = aweme4.getAuthor()) == null) {
            return null;
        }
        return author.getRemarkName();
    }

    @Override // com.p2082ss.android.ugc.aweme.flowfeed.utils.AbstractC51064i
    /* renamed from: a */
    public final void mo60327a(int i) {
        AbstractC34186b.AbstractC34189c cVar;
        if (i == 0 && (cVar = this.f80823c) != null) {
            cVar.mo60340a(0);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.flowfeed.utils.AbstractC51064i
    /* renamed from: b */
    public final void mo60330b(int i) {
        AbstractC34186b.AbstractC34189c cVar;
        if (i == 0 && (cVar = this.f80823c) != null) {
            cVar.mo60340a(150);
        }
    }

    private C34176n(AbstractC34186b.AbstractC34192d dVar, AbstractC34186b.AbstractC34189c cVar) {
        this.f80822b = dVar;
        this.f80823c = cVar;
        this.f80824d = 0;
        this.f80825i = C89250i.m154773a((AbstractC89171a) C34177a.f80827a);
        this.f80826j = C89250i.m154773a((AbstractC89171a) C34178b.f80828a);
    }

    public /* synthetic */ C34176n(AbstractC34186b.AbstractC34192d dVar, AbstractC34186b.AbstractC34189c cVar, byte b) {
        this(dVar, cVar);
    }
}
