package com.p2082ss.android.ugc.aweme.feed.assem.review;

import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.C0643b;
import androidx.lifecycle.C1175ad;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.core.C12752d;
import com.bytedance.assem.arch.core.C12753e;
import com.bytedance.assem.arch.p795b.AbstractC12693u;
import com.bytedance.assem.arch.viewModel.AbstractC12848i;
import com.bytedance.assem.arch.viewModel.C12856l;
import com.bytedance.assem.jedi_vm.viewModel.C12874b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ext_power_list.C14530k;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.base.utils.C34729o;
import com.p2082ss.android.ugc.aweme.feed.assem.base.AbstractC48491a;
import com.p2082ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.C89170a;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89277c;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.ss.android.ugc.aweme.feed.assem.review.b */
public final class C48990b extends AbstractC48491a<C48990b> {

    /* renamed from: u */
    static final /* synthetic */ AbstractC89286i[] f112900u = {new C89232y(C48990b.class, "videoReviewStatusVM", "getVideoReviewStatusVM()Lcom/ss/android/ugc/aweme/feed/assem/review/VideoReviewStatusVM;", 0)};

    /* renamed from: A */
    private SparseArray f112901A;

    /* renamed from: v */
    final AbstractC89244h f112902v;

    /* renamed from: w */
    private final AbstractC89248d f112903w;

    /* renamed from: x */
    private final AbstractC89244h f112904x;

    /* renamed from: y */
    private final AbstractC89244h f112905y;

    /* renamed from: z */
    private final AbstractC89244h f112906z;

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.review.b$b */
    public static final class C48992b extends AbstractC89220m implements AbstractC89172b<C48988a, C48988a> {
        public static final C48992b INSTANCE = new C48992b();

        static {
            Covode.recordClassIndex(57782);
        }

        public C48992b() {
            super(1);
        }

        public final C48988a invoke(C48988a aVar) {
            C89219l.m154719c(aVar, "");
            return aVar;
        }
    }

    static {
        Covode.recordClassIndex(57780);
    }

    @Override // com.bytedance.assem.arch.p795b.AbstractC12711w
    /* renamed from: D */
    public final int mo20547D() {
        return R.layout.tp;
    }

    /* renamed from: G */
    public final View mo80758G() {
        return (View) this.f112904x.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.assem.base.AbstractC48491a
    /* renamed from: H */
    public final View mo80494H() {
        if (this.f112901A == null) {
            this.f112901A = new SparseArray();
        }
        View view = (View) this.f112901A.get(R.id.dii);
        if (view != null) {
            return view;
        }
        View t = mo20528t();
        if (t == null) {
            return null;
        }
        View findViewById = t.findViewById(R.id.dii);
        this.f112901A.put(R.id.dii, findViewById);
        return findViewById;
    }

    /* renamed from: I */
    public final TuxIconView mo80759I() {
        return (TuxIconView) this.f112905y.getValue();
    }

    /* renamed from: J */
    public final TuxIconView mo80760J() {
        return (TuxIconView) this.f112906z.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.review.b$c */
    public static final class C48993c extends AbstractC89220m implements AbstractC89171a<C12874b<C48988a>> {
        public static final C48993c INSTANCE = new C48993c();

        static {
            Covode.recordClassIndex(57783);
        }

        public C48993c() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C48988a> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.review.b$d */
    public static final class C48994d extends AbstractC89220m implements AbstractC89171a<C1175ad.AbstractC1177b> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12693u f112908a;

        static {
            Covode.recordClassIndex(57784);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C48994d(AbstractC12693u uVar) {
            super(0);
            this.f112908a = uVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1175ad.AbstractC1177b invoke() {
            return this.f112908a.mo20598q();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.review.b$i */
    static final class C48999i extends AbstractC89220m implements AbstractC89171a<View> {

        /* renamed from: a */
        final /* synthetic */ C48990b f112913a;

        static {
            Covode.recordClassIndex(57789);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48999i(C48990b bVar) {
            super(0);
            this.f112913a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ View invoke() {
            return this.f112913a.mo20546C();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.review.b$e */
    public static final class C48995e extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12693u f112909a;

        static {
            Covode.recordClassIndex(57785);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C48995e(AbstractC12693u uVar) {
            super(0);
            this.f112909a = uVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            return this.f112909a.bD_().f30984f;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.review.b$f */
    public static final class C48996f extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12693u f112910a;

        static {
            Covode.recordClassIndex(57786);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C48996f(AbstractC12693u uVar) {
            super(0);
            this.f112910a = uVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            return this.f112910a.bD_().f30985g;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.review.b$g */
    static final class C48997g extends AbstractC89220m implements AbstractC89171a<TuxIconView> {

        /* renamed from: a */
        final /* synthetic */ C48990b f112911a;

        static {
            Covode.recordClassIndex(57787);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48997g(C48990b bVar) {
            super(0);
            this.f112911a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TuxIconView invoke() {
            return this.f112911a.mo80758G().findViewById(R.id.fdj);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.review.b$h */
    static final class C48998h extends AbstractC89220m implements AbstractC89171a<TuxIconView> {

        /* renamed from: a */
        final /* synthetic */ C48990b f112912a;

        static {
            Covode.recordClassIndex(57788);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48998h(C48990b bVar) {
            super(0);
            this.f112912a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TuxIconView invoke() {
            return this.f112912a.mo80758G().findViewById(R.id.fdk);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.review.b$j */
    static final class C49000j extends AbstractC89220m implements AbstractC89171a<TuxTextView> {

        /* renamed from: a */
        final /* synthetic */ C48990b f112914a;

        static {
            Covode.recordClassIndex(57790);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C49000j(C48990b bVar) {
            super(0);
            this.f112914a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TuxTextView invoke() {
            return this.f112914a.mo80758G().findViewById(R.id.fdl);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.review.b$a */
    public static final class C48991a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f112907a;

        static {
            Covode.recordClassIndex(57781);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C48991a(AbstractC89277c cVar) {
            super(0);
            this.f112907a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f112907a).getName();
        }
    }

    @Override // com.bytedance.assem.arch.p795b.AbstractC12693u
    /* renamed from: y */
    public final void mo20533y() {
        VideoReviewStatusVM videoReviewStatusVM;
        mo20508a(videoReviewStatusVM, C12856l.m23102a(((VideoReviewStatusVM) this.f112903w.mo23374a(this, f112900u[0])).f31149c), null, C49001k.f112915a);
    }

    public C48990b() {
        AbstractC12848i.C12851c cVar = AbstractC12848i.C12851c.f31277a;
        AbstractC89277c a = C89204ab.m154669a(VideoReviewStatusVM.class);
        this.f112903w = C14530k.m26542a(this, a, cVar == null ? AbstractC12848i.C12851c.f31277a : cVar, new C48991a(a), C48993c.INSTANCE, new C48994d(this), C48992b.INSTANCE, null, null, new C48995e(this), new C48996f(this));
        this.f112904x = C89250i.m154773a((AbstractC89171a) new C48999i(this));
        this.f112905y = C89250i.m154773a((AbstractC89171a) new C48998h(this));
        this.f112902v = C89250i.m154773a((AbstractC89171a) new C49000j(this));
        this.f112906z = C89250i.m154773a((AbstractC89171a) new C48997g(this));
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.assem.arch.p795b.AbstractC12658i
    /* renamed from: a */
    public final /* synthetic */ void mo20467a(VideoItemParams videoItemParams) {
        C89219l.m154721d(videoItemParams, "");
    }

    @Override // com.bytedance.assem.arch.p795b.AbstractC12693u
    /* renamed from: c */
    public final void mo20517c(View view) {
        C89219l.m154721d(view, "");
        C34729o.m70955a(mo80758G(), 8);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.review.b$k */
    static final class C49001k extends AbstractC89220m implements AbstractC89183m<C48990b, C48988a, C89391z> {

        /* renamed from: a */
        public static final C49001k f112915a = new C49001k();

        static {
            Covode.recordClassIndex(57791);
        }

        C49001k() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C48990b bVar, C48988a aVar) {
            C48990b bVar2 = bVar;
            final C48988a aVar2 = aVar;
            C89219l.m154721d(bVar2, "");
            C89219l.m154721d(aVar2, "");
            if (!VideoReviewStatusVM.f112887k.contains(Integer.valueOf(aVar2.f112893a)) || TextUtils.isEmpty(aVar2.f112896d)) {
                C34729o.m70955a(bVar2.mo80758G(), 8);
            } else {
                C34729o.m70955a(bVar2.mo80758G(), 0);
                if (aVar2.f112894b != -1) {
                    bVar2.mo80758G().setBackgroundColor(C0643b.m2378c(bVar2.mo80758G().getContext(), aVar2.f112894b));
                }
                if (aVar2.f112895c != -1) {
                    bVar2.mo80759I().setVisibility(0);
                    bVar2.mo80759I().setIconRes(aVar2.f112895c);
                } else {
                    bVar2.mo80759I().setVisibility(8);
                }
                ((TextView) bVar2.f112902v.getValue()).setText(aVar2.f112896d);
                if (aVar2.f112897e.length() == 0) {
                    bVar2.mo80760J().setVisibility(8);
                    bVar2.mo80758G().setOnClickListener(View$OnClickListenerC490021.f112916a);
                } else {
                    bVar2.mo80760J().setVisibility(0);
                    bVar2.mo80758G().setOnClickListener(new View.OnClickListener() {
                        /* class com.p2082ss.android.ugc.aweme.feed.assem.review.C48990b.C49001k.View$OnClickListenerC490032 */

                        static {
                            Covode.recordClassIndex(57793);
                        }

                        public final void onClick(View view) {
                            AbstractC89183m<View, String, C89391z> mVar;
                            ClickAgent.onClick(view);
                            if (!C58001a.m104815a(view, 1200) && (mVar = aVar2.f112899g) != null) {
                                C89219l.m154716b(view, "");
                                mVar.invoke(view, aVar2.f112897e);
                            }
                        }
                    });
                }
                AbstractC89172b<String, C89391z> bVar3 = aVar2.f112898f;
                if (bVar3 != null) {
                    bVar3.invoke(aVar2.f112897e);
                }
            }
            return C89391z.f203057a;
        }
    }
}
