package com.p2082ss.android.ugc.aweme.feed.assem.more;

import android.graphics.Rect;
import android.util.SparseArray;
import android.view.TouchDelegate;
import android.view.View;
import androidx.lifecycle.C1175ad;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.core.C12752d;
import com.bytedance.assem.arch.core.C12753e;
import com.bytedance.assem.arch.p795b.AbstractC12693u;
import com.bytedance.assem.arch.viewModel.AbstractC12848i;
import com.bytedance.assem.jedi_vm.viewModel.C12874b;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ext_power_list.C14530k;
import com.bytedance.lighten.p1477a.C20751h;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.feed.assem.base.AbstractC48491a;
import com.p2082ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p2082ss.android.ugc.aweme.main.p3428b.C59043a;
import com.p2082ss.android.ugc.aweme.metrics.C59208ac;
import com.p2082ss.android.ugc.aweme.metrics.C59240f;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3252c.C56216k;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.share.C69508y;
import com.p2082ss.android.ugc.aweme.sharer.p3779a.C69576b;
import com.p2082ss.android.ugc.aweme.story.p4019b.C76598h;
import com.p2082ss.android.ugc.aweme.story.p4025d.C76706a;
import com.p2082ss.android.ugc.aweme.upvote.event.C79900c;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.C89170a;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89277c;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.ss.android.ugc.aweme.feed.assem.more.a */
public final class C48739a extends AbstractC48491a<C48739a> {

    /* renamed from: u */
    static final /* synthetic */ AbstractC89286i[] f112604u = {new C89232y(C48739a.class, "videoMoreVM", "getVideoMoreVM()Lcom/ss/android/ugc/aweme/feed/assem/more/VideoMoreVM;", 0)};

    /* renamed from: v */
    public static final C48746g f112605v = new C48746g((byte) 0);

    /* renamed from: x */
    private static final int f112606x = ((int) C13628n.m24520b(C20751h.f48987a, 10.0f));

    /* renamed from: w */
    private final AbstractC89248d f112607w;

    /* renamed from: y */
    private SparseArray f112608y;

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.more.a$b */
    public static final class C48741b extends AbstractC89220m implements AbstractC89172b<C48748b, C48748b> {
        public static final C48741b INSTANCE = new C48741b();

        static {
            Covode.recordClassIndex(57523);
        }

        public C48741b() {
            super(1);
        }

        public final C48748b invoke(C48748b bVar) {
            C89219l.m154719c(bVar, "");
            return bVar;
        }
    }

    @Override // com.bytedance.assem.arch.p795b.AbstractC12711w
    /* renamed from: D */
    public final int mo20547D() {
        return R.layout.t4;
    }

    /* renamed from: G */
    public final VideoMoreVM mo80671G() {
        return (VideoMoreVM) this.f112607w.mo23374a(this, f112604u[0]);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.assem.base.AbstractC48491a
    /* renamed from: H */
    public final View mo80494H() {
        if (this.f112608y == null) {
            this.f112608y = new SparseArray();
        }
        View view = (View) this.f112608y.get(R.id.dii);
        if (view != null) {
            return view;
        }
        View t = mo20528t();
        if (t == null) {
            return null;
        }
        View findViewById = t.findViewById(R.id.dii);
        this.f112608y.put(R.id.dii, findViewById);
        return findViewById;
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.more.a$g */
    public static final class C48746g {
        static {
            Covode.recordClassIndex(57528);
        }

        private C48746g() {
        }

        public /* synthetic */ C48746g(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.more.a$c */
    public static final class C48742c extends AbstractC89220m implements AbstractC89171a<C12874b<C48748b>> {
        public static final C48742c INSTANCE = new C48742c();

        static {
            Covode.recordClassIndex(57524);
        }

        public C48742c() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C48748b> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.more.a$d */
    public static final class C48743d extends AbstractC89220m implements AbstractC89171a<C1175ad.AbstractC1177b> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12693u f112610a;

        static {
            Covode.recordClassIndex(57525);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C48743d(AbstractC12693u uVar) {
            super(0);
            this.f112610a = uVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1175ad.AbstractC1177b invoke() {
            return this.f112610a.mo20598q();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.more.a$e */
    public static final class C48744e extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12693u f112611a;

        static {
            Covode.recordClassIndex(57526);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C48744e(AbstractC12693u uVar) {
            super(0);
            this.f112611a = uVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            return this.f112611a.bD_().f30984f;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.more.a$f */
    public static final class C48745f extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12693u f112612a;

        static {
            Covode.recordClassIndex(57527);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C48745f(AbstractC12693u uVar) {
            super(0);
            this.f112612a = uVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            return this.f112612a.bD_().f30985g;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.more.a$a */
    public static final class C48740a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f112609a;

        static {
            Covode.recordClassIndex(57522);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C48740a(AbstractC89277c cVar) {
            super(0);
            this.f112609a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f112609a).getName();
        }
    }

    static {
        Covode.recordClassIndex(57521);
    }

    public C48739a() {
        AbstractC12848i.C12851c cVar = AbstractC12848i.C12851c.f31277a;
        AbstractC89277c a = C89204ab.m154669a(VideoMoreVM.class);
        this.f112607w = C14530k.m26542a(this, a, cVar == null ? AbstractC12848i.C12851c.f31277a : cVar, new C48740a(a), C48742c.INSTANCE, new C48743d(this), C48741b.INSTANCE, null, null, new C48744e(this), new C48745f(this));
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
        mo20546C().setOnClickListener(new View$OnClickListenerC48747h(this));
        Rect rect = new Rect();
        mo20546C().getHitRect(rect);
        int i = rect.top;
        int i2 = f112606x;
        rect.top = i - i2;
        rect.left -= i2;
        rect.bottom += i2;
        rect.right += i2;
        mo20528t().setTouchDelegate(new TouchDelegate(rect, mo20546C()));
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.more.a$h */
    static final class View$OnClickListenerC48747h implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C48739a f112613a;

        static {
            Covode.recordClassIndex(57529);
        }

        View$OnClickListenerC48747h(C48739a aVar) {
            this.f112613a = aVar;
        }

        public final void onClick(View view) {
            String uid;
            DataCenter dataCenter;
            ClickAgent.onClick(view);
            if (!C69576b.m122788a(view, 1200)) {
                VideoItemParams videoItemParams = (VideoItemParams) this.f112613a.mo80671G().mo23342g();
                if (!(videoItemParams == null || (dataCenter = videoItemParams.dataCenter) == null)) {
                    dataCenter.mo60191a("video_more_click", (Object) null);
                }
                VideoMoreVM G = this.f112613a.mo80671G();
                VideoItemParams videoItemParams2 = (VideoItemParams) G.mo23342g();
                if (videoItemParams2 != null) {
                    if (C69508y.f155284b && C56216k.m102133c()) {
                        Aweme aweme = videoItemParams2.mAweme;
                        C89219l.m154716b(aweme, "");
                        C69508y.m122723c(aweme);
                    }
                    if (videoItemParams2.mEventType == null) {
                        videoItemParams2.setEventType("");
                    }
                    C59240f fVar = (C59240f) new C59240f().mo96797a("homepage_hot").mo96749g(videoItemParams2.mAweme).mo96802d(C59208ac.m108764b(videoItemParams2.mAweme, videoItemParams2.mPageType));
                    Aweme aweme2 = videoItemParams2.mAweme;
                    C89219l.m154716b(aweme2, "");
                    if (aweme2.getAuthor() == null) {
                        uid = "";
                    } else {
                        Aweme aweme3 = videoItemParams2.mAweme;
                        C89219l.m154716b(aweme3, "");
                        User author = aweme3.getAuthor();
                        if (author == null) {
                            C89219l.m154715b();
                        }
                        uid = author.getUid();
                    }
                    fVar.f135190b = uid;
                    Aweme aweme4 = videoItemParams2.mAweme;
                    C89219l.m154716b(aweme4, "");
                    fVar.f135222V = C76598h.m134176a(aweme4.getAuthor());
                    fVar.f135199u = Boolean.valueOf(C76706a.m134281g(videoItemParams2.mAweme));
                    Aweme aweme5 = videoItemParams2.mAweme;
                    C89219l.m154716b(aweme5, "");
                    fVar.f135200v = C76706a.m134276b(aweme5);
                    fVar.f135191c = ((FeedBaseViewModel) G).f112230o;
                    C59240f fVar2 = (C59240f) C79900c.m138667a(fVar, videoItemParams2.mAweme, "homepage_hot");
                    String str = videoItemParams2.mEventType;
                    if (str != null) {
                        int hashCode = str.hashCode();
                        if (hashCode != -1271119582) {
                            if (hashCode == 1691937916 && str.equals("homepage_hot")) {
                                fVar2.mo96797a("homepage_hot");
                                fVar2.mo96792f();
                                AbstractC81915c.m141874a(new C59043a());
                            }
                        } else if (str.equals("homepage_follow")) {
                            fVar2.mo96797a("homepage_follow");
                            fVar2.mo96792f();
                            AbstractC81915c.m141874a(new C59043a());
                        }
                    }
                    if (videoItemParams2.mAwemeFromPage == 2) {
                        fVar2.mo96797a(videoItemParams2.mEventType);
                    }
                    fVar2.mo96792f();
                    AbstractC81915c.m141874a(new C59043a());
                }
            }
        }
    }
}
