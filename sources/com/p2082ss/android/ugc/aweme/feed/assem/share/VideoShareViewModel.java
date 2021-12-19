package com.p2082ss.android.ugc.aweme.feed.assem.share;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.core.content.C0643b;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.viewModel.AbstractC12853j;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.feed.assem.C48707g;
import com.p2082ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.p2082ss.android.ugc.aweme.feed.guide.C49592h;
import com.p2082ss.android.ugc.aweme.feed.helper.C49658w;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.p2082ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p2082ss.android.ugc.aweme.i18n.C53437b;
import com.p2082ss.android.ugc.aweme.login.p3424b.C58956a;
import com.p2082ss.android.ugc.aweme.main.page.AwemeChangeCallBack;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3252c.C56216k;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.share.C68858ae;
import com.p2082ss.android.ugc.aweme.share.C68863ah;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89387v;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89225r;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.ss.android.ugc.aweme.feed.assem.share.VideoShareViewModel */
public final class VideoShareViewModel extends FeedBaseViewModel<C49067r> {

    /* renamed from: k */
    static final /* synthetic */ AbstractC89286i[] f112918k = {new C89225r(VideoShareViewModel.class, "context", "getContext()Landroid/content/Context;", 0)};

    /* renamed from: w */
    public static final C49004a f112919w = new C49004a((byte) 0);

    /* renamed from: l */
    int f112920l;

    /* renamed from: m */
    public volatile boolean f112921m;

    /* renamed from: n */
    public volatile boolean f112922n;

    /* renamed from: v */
    long f112923v;

    /* renamed from: x */
    private final C48707g f112924x = new C48707g(C49006c.f112927a);

    /* renamed from: y */
    private String f112925y;

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.share.VideoShareViewModel$c */
    static final class C49006c extends AbstractC89220m implements AbstractC89171a<Context> {

        /* renamed from: a */
        public static final C49006c f112927a = new C49006c();

        static {
            Covode.recordClassIndex(57797);
        }

        C49006c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ Context invoke() {
            return null;
        }
    }

    static {
        Covode.recordClassIndex(57794);
    }

    /* renamed from: a */
    public final void mo80765a(Context context) {
        this.f112924x.mo80661a(f112918k[0], context);
    }

    /* renamed from: h */
    public final Context mo23343h() {
        return (Context) this.f112924x.mo80660a(f112918k[0]);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.share.VideoShareViewModel$a */
    public static final class C49004a {
        static {
            Covode.recordClassIndex(57795);
        }

        private C49004a() {
        }

        public /* synthetic */ C49004a(byte b) {
            this();
        }
    }

    /* renamed from: k */
    public static int m92171k() {
        return C16048b.m29633a().mo25412a(true, "share_guide_daily_limit", 0);
    }

    /* renamed from: l */
    private final void m92172l() {
        mo20662a(new C49005b(this));
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    /* renamed from: f */
    public final /* synthetic */ AbstractC12853j mo20674f() {
        return new C49067r(null, 127);
    }

    /* renamed from: i */
    public final void mo80768i() {
        if (this.f112921m) {
            this.f112921m = false;
            m92172l();
        }
        if (this.f112922n) {
            this.f112922n = false;
            m92172l();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final boolean mo80769j() {
        Aweme aweme;
        String str;
        VideoItemParams videoItemParams = (VideoItemParams) mo23342g();
        if (!(videoItemParams == null || (aweme = videoItemParams.mAweme) == null)) {
            try {
                Activity j = C17873f.m33102j();
                Context h = mo23343h();
                Activity activity = null;
                if (!(h instanceof Activity)) {
                    h = null;
                }
                if (j != ((Activity) h)) {
                    return false;
                }
                Activity j2 = C17873f.m33102j();
                if (!(j2 instanceof ActivityC0945e)) {
                    j2 = null;
                }
                Aweme a = AwemeChangeCallBack.m108593a((ActivityC0945e) j2);
                if (a != null) {
                    str = a.getAid();
                } else {
                    str = null;
                }
                if (!TextUtils.equals(str, aweme.getAid()) || !C49658w.m93105a(mo23343h()) || !C49658w.m93106a(aweme) || C49592h.C49593a.f114095a.mo81382a(aweme.getAid())) {
                    return false;
                }
                C49592h.C49593a.f114095a.mo81383b(aweme.getAid());
                int a2 = C16048b.m29633a().mo25412a(true, "interction_share_button_whatsapp_style", 0);
                Context h2 = mo23343h();
                if (h2 instanceof Activity) {
                    activity = h2;
                }
                if (!C49658w.m93104a(activity)) {
                    mo20662a(new C49008e(this));
                    if (a2 == 1) {
                        m92166a(1.02f, 0.95f);
                    } else if (a2 == 2) {
                        m92166a(1.05f, 0.9f);
                    }
                } else if (a2 == 1) {
                    m92166a(1.02f, 0.95f);
                } else if (a2 == 2 && !this.f112921m) {
                    this.f112921m = true;
                    mo20662a(C49011h.f112933a);
                }
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.share.VideoShareViewModel$f */
    static final class C49009f extends AbstractC89220m implements AbstractC89172b<C49067r, C49067r> {

        /* renamed from: a */
        final /* synthetic */ VideoShareViewModel f112930a;

        /* renamed from: b */
        final /* synthetic */ VideoItemParams f112931b;

        static {
            Covode.recordClassIndex(57800);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C49009f(VideoShareViewModel videoShareViewModel, VideoItemParams videoItemParams) {
            super(1);
            this.f112930a = videoShareViewModel;
            this.f112931b = videoItemParams;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C49067r invoke(C49067r rVar) {
            C49067r rVar2 = rVar;
            C89219l.m154721d(rVar2, "");
            return this.f112930a.mo23372a((AbstractC12853j) rVar2, this.f112931b);
        }
    }

    /* renamed from: d */
    public static C49020f m92168d(C49067r rVar) {
        C49020f fVar = rVar.f113002c;
        if (fVar == null) {
            return new C49020f();
        }
        return fVar;
    }

    /* renamed from: g */
    private static C49018d m92170g(C49067r rVar) {
        C49018d dVar = rVar.f113005f;
        if (dVar == null) {
            return new C49018d();
        }
        return dVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.share.VideoShareViewModel$g */
    static final class C49010g extends AbstractC89220m implements AbstractC89172b<C49067r, C49067r> {

        /* renamed from: a */
        public static final C49010g f112932a = new C49010g();

        static {
            Covode.recordClassIndex(57801);
        }

        C49010g() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C49067r invoke(C49067r rVar) {
            C49067r rVar2 = rVar;
            C89219l.m154721d(rVar2, "");
            return C49067r.m92201a(rVar2, false, null, null, null, C89387v.m154943a(1, 1), null, null, 111);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.share.VideoShareViewModel$d */
    public static final class C49007d extends AbstractC89220m implements AbstractC89172b<C49067r, C49067r> {

        /* renamed from: a */
        public static final C49007d f112928a = new C49007d();

        static {
            Covode.recordClassIndex(57798);
        }

        C49007d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C49067r invoke(C49067r rVar) {
            C49067r rVar2 = rVar;
            C89219l.m154721d(rVar2, "");
            return C49067r.m92201a(rVar2, false, null, null, null, null, null, new C12776a(C89387v.m154943a(EnumC49016b.HideStayHomeGuide, null)), 63);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.share.VideoShareViewModel$e */
    static final class C49008e extends AbstractC89220m implements AbstractC89172b<C49067r, C49067r> {

        /* renamed from: a */
        final /* synthetic */ VideoShareViewModel f112929a;

        static {
            Covode.recordClassIndex(57799);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C49008e(VideoShareViewModel videoShareViewModel) {
            super(1);
            this.f112929a = videoShareViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C49067r invoke(C49067r rVar) {
            C49067r rVar2 = rVar;
            C89219l.m154721d(rVar2, "");
            return C49067r.m92201a(rVar2, false, null, C49020f.m92186a(VideoShareViewModel.m92168d(rVar2), C0643b.m2369a(C17867d.m33078a(), 2131231752)), null, null, null, null, 123);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.share.VideoShareViewModel$h */
    static final class C49011h extends AbstractC89220m implements AbstractC89172b<C49067r, C49067r> {

        /* renamed from: a */
        public static final C49011h f112933a = new C49011h();

        static {
            Covode.recordClassIndex(57802);
        }

        C49011h() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C49067r invoke(C49067r rVar) {
            C49067r rVar2 = rVar;
            C89219l.m154721d(rVar2, "");
            return C49067r.m92201a(rVar2, false, null, null, null, null, null, new C12776a(C89387v.m154943a(EnumC49016b.BreatheShare, null)), 63);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.assem.share.VideoShareViewModel$i */
    public static final class C49012i extends AbstractC89220m implements AbstractC89172b<C49067r, C49067r> {

        /* renamed from: a */
        final /* synthetic */ float f112934a;

        /* renamed from: b */
        final /* synthetic */ float f112935b;

        static {
            Covode.recordClassIndex(57803);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C49012i(float f, float f2) {
            super(1);
            this.f112934a = f;
            this.f112935b = f2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C49067r invoke(C49067r rVar) {
            C49067r rVar2 = rVar;
            C89219l.m154721d(rVar2, "");
            return C49067r.m92201a(rVar2, false, null, null, null, null, null, new C12776a(C89387v.m154943a(EnumC49016b.FlipAndBreathe, new C49017c(this.f112934a, this.f112935b))), 63);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.share.VideoShareViewModel$j */
    public static final class C49013j extends AbstractC89220m implements AbstractC89172b<C49067r, C49067r> {

        /* renamed from: a */
        final /* synthetic */ VideoShareViewModel f112936a;

        static {
            Covode.recordClassIndex(57804);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C49013j(VideoShareViewModel videoShareViewModel) {
            super(1);
            this.f112936a = videoShareViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C49067r invoke(C49067r rVar) {
            Aweme aweme;
            C49067r rVar2 = rVar;
            C89219l.m154721d(rVar2, "");
            EnumC49016b bVar = EnumC49016b.ShareGuide;
            VideoItemParams videoItemParams = (VideoItemParams) this.f112936a.mo23342g();
            if (videoItemParams != null) {
                aweme = videoItemParams.mAweme;
            } else {
                aweme = null;
            }
            return C49067r.m92201a(rVar2, false, null, null, null, null, null, new C12776a(C89387v.m154943a(bVar, new C49015a(aweme, this.f112936a.f112231p))), 63);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.share.VideoShareViewModel$k */
    public static final class C49014k extends AbstractC89220m implements AbstractC89172b<C49067r, C49067r> {

        /* renamed from: a */
        public static final C49014k f112937a = new C49014k();

        static {
            Covode.recordClassIndex(57805);
        }

        C49014k() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C49067r invoke(C49067r rVar) {
            C49067r rVar2 = rVar;
            C89219l.m154721d(rVar2, "");
            return C49067r.m92201a(rVar2, false, null, null, null, null, null, new C12776a(C89387v.m154943a(EnumC49016b.ShowStayHomeGuide, null)), 63);
        }
    }

    /* renamed from: a */
    private final CharSequence m92165a(AwemeStatistics awemeStatistics) {
        Resources resources;
        String a = C53437b.m98615a(awemeStatistics.getShareCount());
        if (!TextUtils.equals("0", a) || mo23343h() == null) {
            return a;
        }
        Context h = mo23343h();
        if (h == null || (resources = h.getResources()) == null) {
            return null;
        }
        return resources.getText(R.string.h84);
    }

    /* renamed from: c */
    public static C49067r m92167c(C49067r rVar) {
        int b = (int) C13628n.m24520b(C17867d.m33078a(), 40.0f);
        C49018d a = C49018d.m92183a(m92170g(rVar), Float.valueOf(1.0f));
        m92168d(rVar);
        return C49067r.m92201a(rVar, false, null, C49020f.m92185a(C0643b.m2369a(C17867d.m33078a(), C68858ae.m121526a()), new ViewGroup.LayoutParams(b, -1)), null, null, a, null, 91);
    }

    /* renamed from: b */
    public final C49067r mo80766b(C49067r rVar) {
        Context h = mo23343h();
        if (!(h instanceof Activity)) {
            h = null;
        }
        Activity activity = (Activity) h;
        if (activity == null || !C49658w.m93104a(activity)) {
            return m92167c(rVar);
        }
        return C49067r.m92201a(rVar, false, null, C49020f.m92186a(m92168d(rVar), C0643b.m2369a(C17867d.m33078a(), 2131231752)), null, null, null, null, 123);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.assem.share.VideoShareViewModel$b */
    public static final class C49005b extends AbstractC89220m implements AbstractC89172b<C49067r, C49067r> {

        /* renamed from: a */
        final /* synthetic */ VideoShareViewModel f112926a;

        static {
            Covode.recordClassIndex(57796);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C49005b(VideoShareViewModel videoShareViewModel) {
            super(1);
            this.f112926a = videoShareViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C49067r invoke(C49067r rVar) {
            C49067r c;
            C49067r rVar2 = rVar;
            C89219l.m154721d(rVar2, "");
            if (C49658w.m93105a(this.f112926a.mo23343h())) {
                c = this.f112926a.mo80766b(rVar2);
            } else if (C16048b.m29633a().mo25412a(true, "interction_share_button_style", 0) != 0) {
                c = this.f112926a.mo80764a(rVar2);
            } else {
                c = VideoShareViewModel.m92167c(rVar2);
            }
            return C49067r.m92201a(this.f112926a.mo80767e(c), false, null, null, null, C89387v.m154943a(1, 1), null, null, 111);
        }
    }

    /* renamed from: f */
    private final C49067r m92169f(C49067r rVar) {
        Aweme aweme;
        Aweme aweme2;
        User author;
        C49067r rVar2 = rVar;
        VideoItemParams videoItemParams = (VideoItemParams) mo23342g();
        String str = null;
        if (!(videoItemParams == null || (aweme = videoItemParams.mAweme) == null || aweme.getAuthor() == null || C56216k.m102133c())) {
            IAccountUserService g = C31575b.m65865g();
            VideoItemParams videoItemParams2 = (VideoItemParams) mo23342g();
            if (!(videoItemParams2 == null || (aweme2 = videoItemParams2.mAweme) == null || (author = aweme2.getAuthor()) == null)) {
                str = author.getUid();
            }
            if (g.isMe(str)) {
                return C49067r.m92201a(rVar2, false, null, C49020f.m92186a(m92168d(rVar2), C0643b.m2369a(C17867d.m33078a(), 2131233178)), null, null, null, null, 123);
            }
        }
        if (C49658w.m93105a(mo23343h())) {
            return mo80766b(rVar2);
        }
        if (C16048b.m29633a().mo25412a(true, "interction_share_button_style", 0) != 0) {
            return mo80764a(rVar2);
        }
        try {
            rVar2 = m92167c(rVar2);
            return rVar2;
        } catch (Exception e) {
            e.printStackTrace();
            return rVar2;
        }
    }

    /* renamed from: a */
    public final C49067r mo80764a(C49067r rVar) {
        Drawable a;
        this.f112925y = C68863ah.f154028b.mo109368d();
        boolean b = C49658w.m93109b(mo23343h());
        if (this.f112925y != null || !b) {
            int a2 = C16048b.m29633a().mo25412a(true, "interction_share_button_style", 0);
            if (this.f112925y == null || a2 == 1) {
                return m92167c(rVar);
            }
            Context h = mo23343h();
            if (!(h instanceof Activity)) {
                h = null;
            }
            Activity activity = (Activity) h;
            if (activity == null || (a = C68863ah.f154028b.mo109354a(activity, this.f112925y)) == null) {
                return rVar;
            }
            m92168d(rVar);
            return C49067r.m92201a(rVar, false, null, C49020f.m92185a(a, new ViewGroup.LayoutParams((int) C13628n.m24520b(mo23343h(), 36.0f), (int) C13628n.m24520b(mo23343h(), 36.0f))), null, null, null, null, 123);
        }
        m92168d(rVar);
        return C49067r.m92201a(rVar, false, null, C49020f.m92185a(C0643b.m2369a(C17867d.m33078a(), 2131231752), new ViewGroup.LayoutParams((int) C13628n.m24520b(C17867d.m33078a(), 36.0f), (int) C13628n.m24520b(C17867d.m33078a(), 36.0f))), null, null, null, null, 123);
    }

    /* renamed from: e */
    public final C49067r mo80767e(C49067r rVar) {
        User user;
        AwemeStatistics awemeStatistics;
        C49019e eVar;
        String str;
        Aweme aweme;
        Aweme aweme2;
        VideoItemParams videoItemParams = (VideoItemParams) mo23342g();
        Aweme aweme3 = null;
        if (videoItemParams == null || (aweme2 = videoItemParams.mAweme) == null) {
            user = null;
        } else {
            user = aweme2.getAuthor();
        }
        VideoItemParams videoItemParams2 = (VideoItemParams) mo23342g();
        if (videoItemParams2 == null || (aweme = videoItemParams2.mAweme) == null) {
            awemeStatistics = null;
        } else {
            awemeStatistics = aweme.getStatistics();
        }
        if (awemeStatistics == null || user == null) {
            eVar = new C49019e(false, 6);
        } else {
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            if (TextUtils.equals(g.getCurUserId(), user.getUid())) {
                eVar = new C49019e(false, 6);
            } else if (C16048b.m29633a().mo25412a(true, "share_button_style", 2) == 2) {
                eVar = new C49019e(true, Float.valueOf(10.0f), C17867d.m33078a().getString(R.string.h84));
            } else if (C16048b.m29633a().mo25412a(true, "share_button_style", 2) == 3) {
                Float valueOf = Float.valueOf(12.0f);
                CharSequence a = m92165a(awemeStatistics);
                if (a != null) {
                    str = a.toString();
                } else {
                    str = null;
                }
                eVar = new C49019e(true, valueOf, str);
            } else {
                eVar = new C49019e(false, 6);
            }
        }
        VideoItemParams videoItemParams3 = (VideoItemParams) mo23342g();
        if (videoItemParams3 != null) {
            aweme3 = videoItemParams3.mAweme;
        }
        if (C58956a.m108315a(aweme3)) {
            return C49067r.m92201a(rVar, false, C49019e.m92184a(eVar, "0"), null, null, null, null, null, 125);
        }
        return C49067r.m92201a(rVar, false, eVar, null, null, null, null, null, 125);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.assem.arch.viewModel.j, java.lang.Object] */
    @Override // com.bytedance.ext_power_list.AbstractC14529j
    /* renamed from: b */
    public final /* synthetic */ VideoItemParams mo23373b(AbstractC12853j jVar, VideoItemParams videoItemParams) {
        C89219l.m154721d(jVar, "");
        C89219l.m154721d(videoItemParams, "");
        return videoItemParams;
    }

    /* renamed from: a */
    private final void m92166a(float f, float f2) {
        if (!this.f112921m) {
            this.f112921m = true;
            mo20662a(new C49012i(f2, f));
        }
    }

    /* Return type fixed from 'com.bytedance.assem.arch.viewModel.j' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.assem.arch.viewModel.j, com.ss.android.ugc.aweme.feed.model.VideoItemParams] */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0070, code lost:
        if (android.text.TextUtils.equals(r1, r0.getUid()) == false) goto L_0x0038;
     */
    @Override // com.p2082ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ com.p2082ss.android.ugc.aweme.feed.assem.share.C49067r mo80488a(com.p2082ss.android.ugc.aweme.feed.assem.share.C49067r r7, com.p2082ss.android.ugc.aweme.feed.model.VideoItemParams r8) {
        /*
        // Method dump skipped, instructions count: 119
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.assem.share.VideoShareViewModel.mo80488a(com.bytedance.assem.arch.viewModel.j, com.ss.android.ugc.aweme.feed.model.VideoItemParams):com.bytedance.assem.arch.viewModel.j");
    }
}
