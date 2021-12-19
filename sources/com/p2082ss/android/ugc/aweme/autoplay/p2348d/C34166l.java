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
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.autoplay.d.l */
public final class C34166l extends AbstractC51064i {

    /* renamed from: a */
    public int f80798a;

    /* renamed from: b */
    public Aweme f80799b;

    /* renamed from: c */
    public final AbstractC34186b.AbstractC34192d f80800c;

    /* renamed from: d */
    private final AbstractC89244h f80801d = C89250i.m154773a((AbstractC89171a) C34167a.f80803a);

    /* renamed from: i */
    private final AbstractC89244h f80802i = C89250i.m154773a((AbstractC89171a) C34168b.f80804a);

    /* renamed from: com.ss.android.ugc.aweme.autoplay.d.l$a */
    static final class C34167a extends AbstractC89220m implements AbstractC89171a<int[]> {

        /* renamed from: a */
        public static final C34167a f80803a = new C34167a();

        static {
            Covode.recordClassIndex(41101);
        }

        C34167a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ int[] invoke() {
            return new int[2];
        }
    }

    static {
        Covode.recordClassIndex(41100);
    }

    /* renamed from: g */
    private final int[] m69819g() {
        return (int[]) this.f80801d.getValue();
    }

    /* renamed from: h */
    private final Rect m69820h() {
        return (Rect) this.f80802i.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.flowfeed.utils.AbstractC51064i
    /* renamed from: a */
    public final int mo60326a() {
        return this.f80798a;
    }

    /* renamed from: com.ss.android.ugc.aweme.autoplay.d.l$b */
    static final class C34168b extends AbstractC89220m implements AbstractC89171a<Rect> {

        /* renamed from: a */
        public static final C34168b f80804a = new C34168b();

        static {
            Covode.recordClassIndex(41102);
        }

        C34168b() {
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
        this.f80800c.bi_();
    }

    @Override // com.p2082ss.android.ugc.aweme.flowfeed.utils.AbstractC51064i
    /* renamed from: c */
    public final Rect mo60332c() {
        View z = this.f80800c.mo60468z();
        if (z != null) {
            z.getLocationOnScreen(m69819g());
            m69820h().set(m69819g()[0], m69819g()[1], m69819g()[0] + z.getWidth(), m69819g()[1] + z.getHeight());
        }
        return m69820h();
    }

    @Override // com.p2082ss.android.ugc.aweme.flowfeed.utils.AbstractC51064i
    /* renamed from: d */
    public final String mo60334d() {
        String str;
        User author;
        User author2;
        User author3;
        Aweme aweme = this.f80799b;
        if (aweme == null || aweme.getAuthor() == null) {
            return "SearchMultiVideoScrollObserver";
        }
        Aweme aweme2 = this.f80799b;
        if (aweme2 == null || (author3 = aweme2.getAuthor()) == null) {
            str = null;
        } else {
            str = author3.getRemarkName();
        }
        if (TextUtils.isEmpty(str)) {
            Aweme aweme3 = this.f80799b;
            if (aweme3 == null || (author2 = aweme3.getAuthor()) == null) {
                return null;
            }
            return author2.getNickname();
        }
        Aweme aweme4 = this.f80799b;
        if (aweme4 == null || (author = aweme4.getAuthor()) == null) {
            return null;
        }
        return author.getRemarkName();
    }

    @Override // com.p2082ss.android.ugc.aweme.flowfeed.utils.AbstractC51064i
    /* renamed from: a */
    public final void mo60327a(int i) {
        if (i == 0 || i == 1) {
            this.f80800c.mo60424A();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.flowfeed.utils.AbstractC51064i
    /* renamed from: b */
    public final void mo60330b(int i) {
        super.mo60330b(i);
        if (i == 0 || i == 1) {
            this.f80800c.mo60424A();
        }
    }

    public C34166l(AbstractC34186b.AbstractC34192d dVar) {
        C89219l.m154721d(dVar, "");
        this.f80800c = dVar;
    }
}
