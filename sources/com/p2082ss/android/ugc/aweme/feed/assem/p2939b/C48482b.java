package com.p2082ss.android.ugc.aweme.feed.assem.p2939b;

import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.assem.arch.core.AbstractC12748a;
import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.extensions.C12786i;
import com.bytedance.assem.arch.viewModel.AbstractC12818f;
import com.bytedance.assem.arch.viewModel.C12815c;
import com.bytedance.assem.arch.viewModel.C12854k;
import com.bytedance.assem.jedi_vm.viewModel.C12874b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ext_power_list.C14524g;
import com.p2082ss.android.ugc.aweme.feed.adapter.C48244cj;
import com.p2082ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.p2082ss.android.ugc.aweme.feed.assem.base.AbstractC48491a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.story.p4019b.C76598h;
import com.p2082ss.android.ugc.aweme.upvote.event.C79899b;
import com.p2082ss.android.ugc.aweme.upvote.p4187a.AbstractC79704a;
import com.p2082ss.android.ugc.aweme.upvote.service.C80034a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.assem.b.b */
public final class C48482b extends AbstractC48491a<C48482b> {

    /* renamed from: u */
    public AbstractC79704a f112219u;

    /* renamed from: v */
    private final C12786i f112220v = new C12786i(bW_(), new C48483a(this, null));

    /* renamed from: w */
    private final AbstractC89244h f112221w = new C14524g(C89204ab.m154669a(VideoViewModel.class), this, C48485c.INSTANCE, C48486d.INSTANCE, C48484b.INSTANCE);

    /* renamed from: x */
    private SparseArray f112222x;

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.b.b$b */
    public static final class C48484b extends AbstractC89220m implements AbstractC89172b<C48244cj, C48244cj> {
        public static final C48484b INSTANCE = new C48484b();

        static {
            Covode.recordClassIndex(57258);
        }

        public C48484b() {
            super(1);
        }

        public final C48244cj invoke(C48244cj cjVar) {
            C89219l.m154719c(cjVar, "");
            return cjVar;
        }
    }

    static {
        Covode.recordClassIndex(57256);
    }

    /* renamed from: G */
    private final C48481a m91892G() {
        return (C48481a) this.f112220v.getValue();
    }

    /* renamed from: I */
    private final VideoViewModel m91893I() {
        return (VideoViewModel) this.f112221w.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.assem.base.AbstractC48491a
    /* renamed from: H */
    public final View mo80494H() {
        if (this.f112222x == null) {
            this.f112222x = new SparseArray();
        }
        View view = (View) this.f112222x.get(R.id.dii);
        if (view != null) {
            return view;
        }
        View t = mo20528t();
        if (t == null) {
            return null;
        }
        View findViewById = t.findViewById(R.id.dii);
        this.f112222x.put(R.id.dii, findViewById);
        return findViewById;
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.b.b$c */
    public static final class C48485c extends AbstractC89220m implements AbstractC89171a<C12874b<C48244cj>> {
        public static final C48485c INSTANCE = new C48485c();

        static {
            Covode.recordClassIndex(57259);
        }

        public C48485c() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C48244cj> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.b.b$d */
    public static final class C48486d extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C48486d INSTANCE = new C48486d();

        static {
            Covode.recordClassIndex(57260);
        }

        public C48486d() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    @Override // com.bytedance.assem.arch.p795b.AbstractC12711w
    /* renamed from: D */
    public final int mo20547D() {
        return C80034a.f179347a.mo123474a();
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.b.b$a */
    public static final class C48483a extends AbstractC89220m implements AbstractC89171a<C48481a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f112223a;

        /* renamed from: b */
        final /* synthetic */ String f112224b;

        static {
            Covode.recordClassIndex(57257);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C48483a(AbstractC12748a aVar, String str) {
            super(0);
            this.f112223a = aVar;
            this.f112224b = str;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.feed.assem.b.a, java.lang.Object] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.feed.assem.p2939b.C48481a invoke() {
            /*
                r3 = this;
                com.bytedance.assem.arch.core.a r0 = r3.f112223a
                com.bytedance.assem.arch.core.AssemSupervisor r0 = r0.bD_()
                com.bytedance.assem.arch.core.d r2 = r0.f30984f
                java.lang.Class<com.ss.android.ugc.aweme.feed.assem.b.a> r1 = com.p2082ss.android.ugc.aweme.feed.assem.p2939b.C48481a.class
                java.lang.String r0 = r3.f112224b
                java.lang.Object r0 = r2.mo20606b(r1, r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.assem.p2939b.C48482b.C48483a.invoke():java.lang.Object");
        }
    }

    @Override // com.bytedance.assem.arch.p795b.AbstractC12693u
    /* renamed from: c */
    public final void mo20517c(View view) {
        C89219l.m154721d(view, "");
        View t = mo20528t();
        if (!(t instanceof FrameLayout)) {
            t = null;
        }
        FrameLayout frameLayout = (FrameLayout) t;
        if (frameLayout != null) {
            this.f112219u = C80034a.f179347a.mo123476a(frameLayout, this);
            AbstractC12818f.C12819a.m23063a(this, m91893I(), C48489c.f112227a, (C12854k) null, C48487e.f112225a, 6);
            AbstractC12818f.C12819a.m23063a(this, m91893I(), C48490d.f112228a, (C12854k) null, C48488f.f112226a, 6);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.assem.arch.p795b.AbstractC12658i
    /* renamed from: a */
    public final /* synthetic */ void mo20467a(VideoItemParams videoItemParams) {
        String str;
        String str2;
        String str3;
        User user;
        String str4;
        boolean z;
        String str5;
        String aid;
        VideoItemParams videoItemParams2 = videoItemParams;
        String str6 = "";
        C89219l.m154721d(videoItemParams2, str6);
        AbstractC79704a aVar = this.f112219u;
        if (aVar != null) {
            String str7 = videoItemParams2.mEventType;
            C89219l.m154716b(str7, str6);
            Aweme aweme = videoItemParams2.mAweme;
            if (aweme == null || (str = aweme.getAid()) == null) {
                str = str6;
            }
            Aweme aweme2 = videoItemParams2.mAweme;
            if (aweme2 == null || (str2 = aweme2.getAuthorUid()) == null) {
                str2 = str6;
            }
            Aweme aweme3 = videoItemParams2.mAweme;
            if (aweme3 == null || (str3 = aweme3.getRequestId()) == null) {
                str3 = str6;
            }
            Aweme aweme4 = videoItemParams2.mAweme;
            String str8 = null;
            if (aweme4 != null) {
                user = aweme4.getAuthor();
            } else {
                user = null;
            }
            C79899b bVar = new C79899b(str7, str, str2, str3, String.valueOf(C76598h.m134176a(user)));
            C48481a G = m91892G();
            if (G != null) {
                str4 = G.f112218a;
            } else {
                str4 = null;
            }
            boolean z2 = false;
            if (str4 != null) {
                z = true;
            } else {
                z = false;
            }
            C80034a aVar2 = C80034a.f179347a;
            Aweme aweme5 = videoItemParams2.mAweme;
            if (!(aweme5 == null || (aid = aweme5.getAid()) == null)) {
                str6 = aid;
            }
            Integer b = aVar2.mo123483b(str6);
            if (b != null && b.intValue() == 0) {
                z2 = true;
            }
            if (z) {
                Aweme aweme6 = videoItemParams2.mAweme;
                if (aweme6 != null) {
                    str5 = aweme6.getAid();
                } else {
                    str5 = null;
                }
                aVar.mo123244a(str5, z2, bVar);
                if (z2) {
                    C48481a G2 = m91892G();
                    if (G2 != null) {
                        str8 = G2.f112218a;
                    }
                    aVar.mo123243a(str8);
                    return;
                }
                return;
            }
            Aweme aweme7 = videoItemParams2.mAweme;
            if (aweme7 != null) {
                str8 = aweme7.getAid();
            }
            aVar.mo123244a(str8, true, bVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.b.b$e */
    static final class C48487e extends AbstractC89220m implements AbstractC89183m<C48482b, C12776a<? extends Integer>, C89391z> {

        /* renamed from: a */
        public static final C48487e f112225a = new C48487e();

        static {
            Covode.recordClassIndex(57261);
        }

        C48487e() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C48482b bVar, C12776a<? extends Integer> aVar) {
            AbstractC79704a aVar2;
            C48482b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            if (!(aVar == null || (aVar2 = bVar2.f112219u) == null)) {
                aVar2.mo123245a(true);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.b.b$f */
    static final class C48488f extends AbstractC89220m implements AbstractC89183m<C48482b, C12776a<? extends C89391z>, C89391z> {

        /* renamed from: a */
        public static final C48488f f112226a = new C48488f();

        static {
            Covode.recordClassIndex(57262);
        }

        C48488f() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C48482b bVar, C12776a<? extends C89391z> aVar) {
            AbstractC79704a aVar2;
            C48482b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            if (!(aVar == null || (aVar2 = bVar2.f112219u) == null)) {
                aVar2.mo123245a(false);
            }
            return C89391z.f203057a;
        }
    }
}
