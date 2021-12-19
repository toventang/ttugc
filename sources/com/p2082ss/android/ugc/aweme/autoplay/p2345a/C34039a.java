package com.p2082ss.android.ugc.aweme.autoplay.p2345a;

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

/* renamed from: com.ss.android.ugc.aweme.autoplay.a.a */
public final class C34039a extends AbstractC51064i {

    /* renamed from: a */
    public AbstractC89171a<? extends AbstractC34186b.AbstractC34192d> f80503a;

    /* renamed from: b */
    public AbstractC89171a<? extends AbstractC34186b.AbstractC34189c> f80504b;

    /* renamed from: c */
    public AbstractC89171a<Integer> f80505c;

    /* renamed from: d */
    public AbstractC89171a<? extends Aweme> f80506d;

    /* renamed from: i */
    private final AbstractC89244h f80507i = C89250i.m154773a((AbstractC89171a) C34040a.f80509a);

    /* renamed from: j */
    private final AbstractC89244h f80508j = C89250i.m154773a((AbstractC89171a) C34041b.f80510a);

    /* renamed from: com.ss.android.ugc.aweme.autoplay.a.a$a */
    static final class C34040a extends AbstractC89220m implements AbstractC89171a<int[]> {

        /* renamed from: a */
        public static final C34040a f80509a = new C34040a();

        static {
            Covode.recordClassIndex(40974);
        }

        C34040a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ int[] invoke() {
            return new int[2];
        }
    }

    static {
        Covode.recordClassIndex(40973);
    }

    /* renamed from: g */
    private final int[] m69615g() {
        return (int[]) this.f80507i.getValue();
    }

    /* renamed from: h */
    private final Rect m69616h() {
        return (Rect) this.f80508j.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.autoplay.a.a$b */
    static final class C34041b extends AbstractC89220m implements AbstractC89171a<Rect> {

        /* renamed from: a */
        public static final C34041b f80510a = new C34041b();

        static {
            Covode.recordClassIndex(40975);
        }

        C34041b() {
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
        AbstractC34186b.AbstractC34189c cVar;
        AbstractC89171a<? extends AbstractC34186b.AbstractC34189c> aVar = this.f80504b;
        if (aVar != null && (cVar = (AbstractC34186b.AbstractC34189c) aVar.invoke()) != null) {
            cVar.bi_();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.flowfeed.utils.AbstractC51064i
    /* renamed from: a */
    public final int mo60326a() {
        Integer invoke;
        AbstractC89171a<Integer> aVar = this.f80505c;
        if (aVar == null || (invoke = aVar.invoke()) == null) {
            return 0;
        }
        return invoke.intValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.flowfeed.utils.AbstractC51064i
    /* renamed from: c */
    public final Rect mo60332c() {
        View view;
        AbstractC34186b.AbstractC34192d dVar;
        AbstractC89171a<? extends AbstractC34186b.AbstractC34192d> aVar = this.f80503a;
        if (aVar == null || (dVar = (AbstractC34186b.AbstractC34192d) aVar.invoke()) == null) {
            view = null;
        } else {
            view = dVar.mo60468z();
        }
        if (view != null) {
            view.getLocationOnScreen(m69615g());
            m69616h().set(m69615g()[0], m69615g()[1], m69615g()[0] + view.getWidth(), m69615g()[1] + view.getHeight());
        } else {
            m69616h().set(0, 0, 0, 0);
        }
        return m69616h();
    }

    @Override // com.p2082ss.android.ugc.aweme.flowfeed.utils.AbstractC51064i
    /* renamed from: d */
    public final String mo60334d() {
        Aweme aweme;
        String str;
        Aweme aweme2;
        User author;
        Aweme aweme3;
        User author2;
        Aweme aweme4;
        User author3;
        AbstractC89171a<? extends Aweme> aVar = this.f80506d;
        if (aVar == null || (aweme = (Aweme) aVar.invoke()) == null || aweme.getAuthor() == null) {
            return "";
        }
        AbstractC89171a<? extends Aweme> aVar2 = this.f80506d;
        if (aVar2 == null || (aweme4 = (Aweme) aVar2.invoke()) == null || (author3 = aweme4.getAuthor()) == null) {
            str = null;
        } else {
            str = author3.getRemarkName();
        }
        if (TextUtils.isEmpty(str)) {
            AbstractC89171a<? extends Aweme> aVar3 = this.f80506d;
            if (aVar3 == null || (aweme3 = (Aweme) aVar3.invoke()) == null || (author2 = aweme3.getAuthor()) == null) {
                return null;
            }
            return author2.getNickname();
        }
        AbstractC89171a<? extends Aweme> aVar4 = this.f80506d;
        if (aVar4 == null || (aweme2 = (Aweme) aVar4.invoke()) == null || (author = aweme2.getAuthor()) == null) {
            return null;
        }
        return author.getRemarkName();
    }

    /* renamed from: a */
    public final void mo60328a(AbstractC89171a<? extends AbstractC34186b.AbstractC34192d> aVar) {
        C89219l.m154721d(aVar, "");
        this.f80503a = aVar;
    }

    /* renamed from: b */
    public final void mo60331b(AbstractC89171a<? extends AbstractC34186b.AbstractC34189c> aVar) {
        C89219l.m154721d(aVar, "");
        this.f80504b = aVar;
    }

    /* renamed from: c */
    public final void mo60333c(AbstractC89171a<Integer> aVar) {
        C89219l.m154721d(aVar, "");
        this.f80505c = aVar;
    }

    /* renamed from: d */
    public final void mo60335d(AbstractC89171a<? extends Aweme> aVar) {
        C89219l.m154721d(aVar, "");
        this.f80506d = aVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.flowfeed.utils.AbstractC51064i
    /* renamed from: b */
    public final void mo60330b(int i) {
        AbstractC34186b.AbstractC34189c cVar;
        AbstractC89171a<? extends AbstractC34186b.AbstractC34189c> aVar = this.f80504b;
        if (aVar != null && (cVar = (AbstractC34186b.AbstractC34189c) aVar.invoke()) != null) {
            cVar.mo60340a(150);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.flowfeed.utils.AbstractC51064i
    /* renamed from: a */
    public final void mo60327a(int i) {
        AbstractC34186b.AbstractC34189c cVar;
        AbstractC89171a<? extends AbstractC34186b.AbstractC34189c> aVar = this.f80504b;
        if (aVar != null && (cVar = (AbstractC34186b.AbstractC34189c) aVar.invoke()) != null) {
            cVar.mo60340a(0);
        }
    }
}
