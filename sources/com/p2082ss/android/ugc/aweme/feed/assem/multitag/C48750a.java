package com.p2082ss.android.ugc.aweme.feed.assem.multitag;

import android.app.Activity;
import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import androidx.lifecycle.C1175ad;
import com.bytedance.assem.arch.core.C12752d;
import com.bytedance.assem.arch.core.C12753e;
import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.p795b.AbstractC12693u;
import com.bytedance.assem.arch.viewModel.AbstractC12818f;
import com.bytedance.assem.arch.viewModel.AbstractC12848i;
import com.bytedance.assem.arch.viewModel.C12815c;
import com.bytedance.assem.arch.viewModel.C12854k;
import com.bytedance.assem.arch.viewModel.C12856l;
import com.bytedance.assem.jedi_vm.viewModel.C12874b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ext_power_list.C14524g;
import com.bytedance.ext_power_list.C14530k;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.anchor.multi.p2314ui.FeedMultiTagLayout;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.feed.adapter.C48244cj;
import com.p2082ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.p2082ss.android.ugc.aweme.feed.assem.base.AbstractC48491a;
import com.p2082ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.p2082ss.android.ugc.aweme.feed.assem.multitag.VideoFeedMultiTagVM;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p2082ss.android.ugc.aweme.feed.p2949i.AbstractC49691s;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50534c;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import org.json.JSONObject;
import p4600h.AbstractC89244h;
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

/* renamed from: com.ss.android.ugc.aweme.feed.assem.multitag.a */
public final class C48750a extends AbstractC48491a<C48750a> {

    /* renamed from: u */
    static final /* synthetic */ AbstractC89286i[] f112615u = {new C89232y(C48750a.class, "tagVM", "getTagVM()Lcom/ss/android/ugc/aweme/feed/assem/multitag/VideoFeedMultiTagVM;", 0)};

    /* renamed from: v */
    public FeedMultiTagLayout f112616v;

    /* renamed from: w */
    private final AbstractC89248d f112617w;

    /* renamed from: x */
    private final AbstractC89244h f112618x;

    /* renamed from: y */
    private SparseArray f112619y;

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.multitag.a$b */
    public static final class C48752b extends AbstractC89220m implements AbstractC89172b<C48767e, C48767e> {
        public static final C48752b INSTANCE = new C48752b();

        static {
            Covode.recordClassIndex(57535);
        }

        public C48752b() {
            super(1);
        }

        public final C48767e invoke(C48767e eVar) {
            C89219l.m154719c(eVar, "");
            return eVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.multitag.a$g */
    public static final class C48757g extends AbstractC89220m implements AbstractC89172b<C48244cj, C48244cj> {
        public static final C48757g INSTANCE = new C48757g();

        static {
            Covode.recordClassIndex(57540);
        }

        public C48757g() {
            super(1);
        }

        public final C48244cj invoke(C48244cj cjVar) {
            C89219l.m154719c(cjVar, "");
            return cjVar;
        }
    }

    static {
        Covode.recordClassIndex(57533);
    }

    @Override // com.bytedance.assem.arch.p795b.AbstractC12711w
    /* renamed from: D */
    public final int mo20547D() {
        return R.layout.aiu;
    }

    /* renamed from: G */
    public final VideoFeedMultiTagVM mo80674G() {
        return (VideoFeedMultiTagVM) this.f112617w.mo23374a(this, f112615u[0]);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.assem.base.AbstractC48491a
    /* renamed from: H */
    public final View mo80494H() {
        if (this.f112619y == null) {
            this.f112619y = new SparseArray();
        }
        View view = (View) this.f112619y.get(R.id.dii);
        if (view != null) {
            return view;
        }
        View t = mo20528t();
        if (t == null) {
            return null;
        }
        View findViewById = t.findViewById(R.id.dii);
        this.f112619y.put(R.id.dii, findViewById);
        return findViewById;
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.multitag.a$c */
    public static final class C48753c extends AbstractC89220m implements AbstractC89171a<C12874b<C48767e>> {
        public static final C48753c INSTANCE = new C48753c();

        static {
            Covode.recordClassIndex(57536);
        }

        public C48753c() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C48767e> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.multitag.a$d */
    public static final class C48754d extends AbstractC89220m implements AbstractC89171a<C1175ad.AbstractC1177b> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12693u f112621a;

        static {
            Covode.recordClassIndex(57537);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C48754d(AbstractC12693u uVar) {
            super(0);
            this.f112621a = uVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1175ad.AbstractC1177b invoke() {
            return this.f112621a.mo20598q();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.multitag.a$h */
    public static final class C48758h extends AbstractC89220m implements AbstractC89171a<C12874b<C48244cj>> {
        public static final C48758h INSTANCE = new C48758h();

        static {
            Covode.recordClassIndex(57541);
        }

        public C48758h() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C48244cj> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.multitag.a$i */
    public static final class C48759i extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C48759i INSTANCE = new C48759i();

        static {
            Covode.recordClassIndex(57542);
        }

        public C48759i() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.multitag.a$e */
    public static final class C48755e extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12693u f112622a;

        static {
            Covode.recordClassIndex(57538);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C48755e(AbstractC12693u uVar) {
            super(0);
            this.f112622a = uVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            return this.f112622a.bD_().f30984f;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.multitag.a$f */
    public static final class C48756f extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12693u f112623a;

        static {
            Covode.recordClassIndex(57539);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C48756f(AbstractC12693u uVar) {
            super(0);
            this.f112623a = uVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            return this.f112623a.bD_().f30985g;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.multitag.a$a */
    public static final class C48751a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f112620a;

        static {
            Covode.recordClassIndex(57534);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C48751a(AbstractC89277c cVar) {
            super(0);
            this.f112620a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f112620a).getName();
        }
    }

    @Override // com.bytedance.assem.arch.p795b.AbstractC12693u
    /* renamed from: y */
    public final void mo20533y() {
        super.mo20533y();
        AbstractC12818f.C12819a.m23063a(this, mo80674G(), C48764b.f112628a, (C12854k) null, C48760j.f112624a, 6);
        AbstractC12818f.C12819a.m23063a(this, mo80674G(), C48765c.f112629a, (C12854k) null, C48761k.f112625a, 6);
    }

    public C48750a() {
        AbstractC12848i.C12851c cVar = AbstractC12848i.C12851c.f31277a;
        AbstractC89277c a = C89204ab.m154669a(VideoFeedMultiTagVM.class);
        this.f112617w = C14530k.m26542a(this, a, cVar == null ? AbstractC12848i.C12851c.f31277a : cVar, new C48751a(a), C48753c.INSTANCE, new C48754d(this), C48752b.INSTANCE, null, null, new C48755e(this), new C48756f(this));
        this.f112618x = new C14524g(C89204ab.m154669a(VideoViewModel.class), this, C48758h.INSTANCE, C48759i.INSTANCE, C48757g.INSTANCE);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.assem.arch.p795b.AbstractC12658i
    /* renamed from: a */
    public final /* synthetic */ void mo20467a(VideoItemParams videoItemParams) {
        C89219l.m154721d(videoItemParams, "");
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.multitag.a$l */
    static final class C48762l<T> implements AbstractC49691s {

        /* renamed from: a */
        final /* synthetic */ C48750a f112626a;

        static {
            Covode.recordClassIndex(57545);
        }

        C48762l(C48750a aVar) {
            this.f112626a = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.feed.p2949i.AbstractC49691s
        /* renamed from: a */
        public final /* synthetic */ void mo63634a(Object obj) {
            DataCenter dataCenter;
            VideoItemParams videoItemParams = (VideoItemParams) this.f112626a.mo80674G().mo23342g();
            if (videoItemParams != null && (dataCenter = videoItemParams.dataCenter) != null) {
                dataCenter.mo60191a("feed_internal_event", obj);
            }
        }
    }

    @Override // com.bytedance.assem.arch.p795b.AbstractC12693u
    /* renamed from: c */
    public final void mo20517c(View view) {
        C89219l.m154721d(view, "");
        FeedMultiTagLayout feedMultiTagLayout = (FeedMultiTagLayout) view.findViewById(R.id.b0t);
        this.f112616v = feedMultiTagLayout;
        if (feedMultiTagLayout != null) {
            feedMultiTagLayout.setOnInternalEventListener(new C48762l(this));
        }
        AbstractC12818f.C12819a.m23063a(this, (VideoViewModel) this.f112618x.getValue(), C48766d.f112630a, C12856l.m23100a(), C48763m.f112627a, 4);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.multitag.a$k */
    static final class C48761k extends AbstractC89220m implements AbstractC89183m<C48750a, Integer, C89391z> {

        /* renamed from: a */
        public static final C48761k f112625a = new C48761k();

        static {
            Covode.recordClassIndex(57544);
        }

        C48761k() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C48750a aVar, Integer num) {
            C48750a aVar2 = aVar;
            int intValue = num.intValue();
            C89219l.m154721d(aVar2, "");
            if (intValue == 0) {
                FeedMultiTagLayout feedMultiTagLayout = aVar2.f112616v;
                if (feedMultiTagLayout != null) {
                    feedMultiTagLayout.mo59613c();
                }
            } else {
                FeedMultiTagLayout feedMultiTagLayout2 = aVar2.f112616v;
                if (feedMultiTagLayout2 != null) {
                    feedMultiTagLayout2.mo59611a();
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.multitag.a$j */
    static final class C48760j extends AbstractC89220m implements AbstractC89183m<C48750a, String, C89391z> {

        /* renamed from: a */
        public static final C48760j f112624a = new C48760j();

        static {
            Covode.recordClassIndex(57543);
        }

        C48760j() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C48750a aVar, String str) {
            String str2;
            VideoItemParams videoItemParams;
            JSONObject jSONObject;
            FeedMultiTagLayout feedMultiTagLayout;
            C48750a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            Aweme h = aVar2.mo80674G().mo23343h();
            if (!(h == null || (str2 = aVar2.mo80674G().f112231p) == null || (videoItemParams = (VideoItemParams) aVar2.mo80674G().mo23342g()) == null || (jSONObject = videoItemParams.mRequestId) == null || (feedMultiTagLayout = aVar2.f112616v) == null)) {
                Context az_ = aVar2.az_();
                Objects.requireNonNull(az_, "null cannot be cast to non-null type android.app.Activity");
                aVar2.mo80674G().mo20662a(new VideoFeedMultiTagVM.C48749a(feedMultiTagLayout.mo59610a(h, (Activity) az_, str2, jSONObject)));
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.multitag.a$m */
    static final class C48763m extends AbstractC89220m implements AbstractC89183m<C48750a, C12776a<? extends Integer>, C89391z> {

        /* renamed from: a */
        public static final C48763m f112627a = new C48763m();

        static {
            Covode.recordClassIndex(57546);
        }

        C48763m() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C48750a aVar, C12776a<? extends Integer> aVar2) {
            String anchorWikiOfflineText;
            FeedMultiTagLayout feedMultiTagLayout;
            C48750a aVar3 = aVar;
            C89219l.m154721d(aVar3, "");
            Aweme h = aVar3.mo80674G().mo23343h();
            if (!(h == null || (anchorWikiOfflineText = h.getAnchorWikiOfflineText()) == null || anchorWikiOfflineText.length() == 0 || (feedMultiTagLayout = aVar3.f112616v) == null)) {
                new C23144b(feedMultiTagLayout).mo37635a(h.getAnchorWikiOfflineText()).mo37637b();
                h.setAnchorWikiOfflineText("");
            }
            C50534c.m94737a(h, aVar3.az_(), Integer.valueOf(((FeedBaseViewModel) aVar3.mo80674G()).f112230o));
            FeedMultiTagLayout feedMultiTagLayout2 = aVar3.f112616v;
            if (feedMultiTagLayout2 != null) {
                feedMultiTagLayout2.mo59622l();
            }
            return C89391z.f203057a;
        }
    }
}
