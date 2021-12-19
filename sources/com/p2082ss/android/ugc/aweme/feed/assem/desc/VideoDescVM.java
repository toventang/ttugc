package com.p2082ss.android.ugc.aweme.feed.assem.desc;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.bytedance.assem.arch.viewModel.AbstractC12853j;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.adaptation.C33403c;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.commercialize.C38000g;
import com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37873az;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.commercialize.p2571j.AbstractC38029b;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.assem.C48707g;
import com.p2082ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.p2082ss.android.ugc.aweme.feed.experiment.C49525p;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.C50153bv;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50530af;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.model.TextExtraStruct;
import com.p2082ss.android.ugc.tools.utils.C84912r;
import com.p2082ss.android.ugc.trill.R;
import java.util.Map;
import java.util.concurrent.Callable;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89225r;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.ss.android.ugc.aweme.feed.assem.desc.VideoDescVM */
public final class VideoDescVM extends FeedBaseViewModel<C48650l> {

    /* renamed from: k */
    static final /* synthetic */ AbstractC89286i[] f112361k = {new C89225r(VideoDescVM.class, "context", "getContext()Landroid/content/Context;", 0)};

    /* renamed from: A */
    public int f112362A;

    /* renamed from: B */
    public int f112363B;

    /* renamed from: C */
    public int f112364C;

    /* renamed from: D */
    private final C48707g f112365D = new C48707g(C48585a.f112374a);

    /* renamed from: l */
    public final boolean f112366l = C33403c.f79371a;

    /* renamed from: m */
    public boolean f112367m;

    /* renamed from: n */
    public boolean f112368n;

    /* renamed from: v */
    public boolean f112369v;

    /* renamed from: w */
    public boolean f112370w;

    /* renamed from: x */
    public SpannableStringBuilder f112371x;

    /* renamed from: y */
    public SpannableStringBuilder f112372y;

    /* renamed from: z */
    public int f112373z;

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.desc.VideoDescVM$a */
    static final class C48585a extends AbstractC89220m implements AbstractC89171a<Context> {

        /* renamed from: a */
        public static final C48585a f112374a = new C48585a();

        static {
            Covode.recordClassIndex(57364);
        }

        C48585a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ Context invoke() {
            return null;
        }
    }

    static {
        Covode.recordClassIndex(57363);
    }

    /* renamed from: a */
    public final void mo80587a(Context context) {
        this.f112365D.mo80661a(f112361k[0], context);
    }

    /* renamed from: h */
    public final Context mo23343h() {
        return (Context) this.f112365D.mo80660a(f112361k[0]);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    /* renamed from: f */
    public final /* synthetic */ AbstractC12853j mo20674f() {
        return new C48650l();
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.desc.VideoDescVM$e */
    static final class CallableC48590e<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ VideoDescVM f112381a;

        static {
            Covode.recordClassIndex(57369);
        }

        CallableC48590e(VideoDescVM videoDescVM) {
            this.f112381a = videoDescVM;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            C39162r.m79460a("video_title", this.f112381a.mo80586a("show"));
            return null;
        }
    }

    /* renamed from: k */
    private static boolean m91950k() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: i */
    public static boolean m91949i() {
        if (C58029j.f132256h && C58029j.m104846b() && !C58029j.m104847c()) {
            return C58029j.f132256h;
        }
        boolean k = m91950k();
        C58029j.f132256h = k;
        return k;
    }

    /* renamed from: j */
    public final void mo80591j() {
        AbstractC38029b bVar;
        if (!m91951l()) {
            VideoItemParams videoItemParams = (VideoItemParams) mo23342g();
            Aweme aweme = null;
            if (videoItemParams != null && (bVar = videoItemParams.mAdOpenCallBack) != null) {
                AbstractC37873az c = C38000g.m77052c();
                Context h = mo23343h();
                VideoItemParams videoItemParams2 = (VideoItemParams) mo23342g();
                if (videoItemParams2 != null) {
                    aweme = videoItemParams2.mAweme;
                }
                c.mo65918a(h, aweme, 1, bVar);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0034, code lost:
        if (r0 == null) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0036, code lost:
        r0 = r0.getWebUrl();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003e, code lost:
        if (android.text.TextUtils.isEmpty(r0) == false) goto L_0x000a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0040, code lost:
        new com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a(mo23343h()).mo123050a(com.p2082ss.android.ugc.trill.R.string.o6).mo123053a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0053, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0054, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0056, code lost:
        if (r1 == false) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0020, code lost:
        if (r0.isAd() != false) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0029, code lost:
        if (com.p2082ss.android.ugc.aweme.commercialize.utils.C38701br.m78512a(r5.mAweme, 3) == false) goto L_0x000a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002b, code lost:
        r0 = r5.mAweme;
        p4600h.p4611f.p4613b.C89219l.m154716b(r0, "");
        r0 = r0.getAwemeRawAd();
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m91951l() {
        /*
            r6 = this;
            java.lang.Object r5 = r6.mo23342g()
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r5 = (com.p2082ss.android.ugc.aweme.feed.model.VideoItemParams) r5
            r4 = 1
            r3 = 0
            if (r5 != 0) goto L_0x000b
        L_0x000a:
            return r3
        L_0x000b:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r5.mAweme
            boolean r1 = com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a.m76202E(r0)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r5.mAweme
            java.lang.String r2 = ""
            if (r0 == 0) goto L_0x0056
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r5.mAweme
            p4600h.p4611f.p4613b.C89219l.m154716b(r0, r2)
            boolean r0 = r0.isAd()
            if (r0 == 0) goto L_0x0056
        L_0x0022:
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r5.mAweme
            r0 = 3
            boolean r0 = com.p2082ss.android.ugc.aweme.commercialize.utils.C38701br.m78512a(r1, r0)
            if (r0 == 0) goto L_0x000a
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r5.mAweme
            p4600h.p4611f.p4613b.C89219l.m154716b(r0, r2)
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
            if (r0 == 0) goto L_0x0054
            java.lang.String r0 = r0.getWebUrl()
        L_0x003a:
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x000a
        L_0x0040:
            com.ss.android.ugc.aweme.tux.a.i.a r1 = new com.ss.android.ugc.aweme.tux.a.i.a
            android.content.Context r0 = r6.mo23343h()
            r1.<init>(r0)
            r0 = 2131821094(0x7f110226, float:1.9274921E38)
            com.ss.android.ugc.aweme.tux.a.i.a r0 = r1.mo123050a(r0)
            r0.mo123053a()
            return r4
        L_0x0054:
            r0 = 0
            goto L_0x003a
        L_0x0056:
            if (r1 != 0) goto L_0x0040
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.assem.desc.VideoDescVM.m91951l():boolean");
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.desc.VideoDescVM$d */
    static final class CallableC48589d<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ VideoDescVM f112378a;

        /* renamed from: b */
        final /* synthetic */ VideoItemParams f112379b;

        /* renamed from: c */
        final /* synthetic */ C50153bv f112380c;

        static {
            Covode.recordClassIndex(57368);
        }

        CallableC48589d(VideoDescVM videoDescVM, VideoItemParams videoItemParams, C50153bv bvVar) {
            this.f112378a = videoDescVM;
            this.f112379b = videoItemParams;
            this.f112380c = bvVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:21:0x008f  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x00ca  */
        @Override // java.util.concurrent.Callable
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object call() {
            /*
            // Method dump skipped, instructions count: 261
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.assem.desc.VideoDescVM.CallableC48589d.call():java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.desc.VideoDescVM$c */
    static final class C48587c extends AbstractC89220m implements AbstractC89172b<C48650l, C89391z> {

        /* renamed from: a */
        final /* synthetic */ VideoDescVM f112376a;

        static {
            Covode.recordClassIndex(57366);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48587c(VideoDescVM videoDescVM) {
            super(1);
            this.f112376a = videoDescVM;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C48650l lVar) {
            C89219l.m154721d(lVar, "");
            this.f112376a.mo20662a(C485881.f112377a);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.assem.desc.VideoDescVM$b */
    public static final class C48586b extends AbstractC89220m implements AbstractC89172b<C48650l, C48650l> {

        /* renamed from: a */
        final /* synthetic */ C48591a f112375a;

        static {
            Covode.recordClassIndex(57365);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48586b(C48591a aVar) {
            super(1);
            this.f112375a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C48650l invoke(C48650l lVar) {
            C48650l lVar2 = lVar;
            C89219l.m154721d(lVar2, "");
            return C48650l.m91989a(lVar2, null, false, false, false, this.f112375a, null, null, 111);
        }
    }

    /* renamed from: a */
    public static int m91948a(Aweme aweme) {
        C89219l.m154721d(aweme, "");
        if (C48593c.f112395y || !C37699a.m76314s(aweme)) {
            return C50530af.m94719b();
        }
        return aweme.getAdDescMaxLines();
    }

    /* renamed from: a */
    public final Map<String, String> mo80586a(String str) {
        String str2;
        String str3;
        Aweme aweme;
        String authorUid;
        Aweme aweme2;
        String str4 = "";
        C89219l.m154721d(str, str4);
        C33744d dVar = new C33744d();
        VideoItemParams videoItemParams = (VideoItemParams) mo23342g();
        if (videoItemParams == null || (str2 = videoItemParams.mEventType) == null) {
            str2 = str4;
        }
        C33744d a = dVar.mo59983a("enter_from", str2);
        VideoItemParams videoItemParams2 = (VideoItemParams) mo23342g();
        if (videoItemParams2 == null || (aweme2 = videoItemParams2.mAweme) == null || (str3 = aweme2.getAid()) == null) {
            str3 = str4;
        }
        C33744d a2 = a.mo59983a("group_id", str3);
        VideoItemParams videoItemParams3 = (VideoItemParams) mo23342g();
        if (!(videoItemParams3 == null || (aweme = videoItemParams3.mAweme) == null || (authorUid = aweme.getAuthorUid()) == null)) {
            str4 = authorUid;
        }
        return a2.mo59983a("author_id", str4).mo59983a("action_type", str).f79943a;
    }

    /* renamed from: a */
    public final boolean mo80590a(TextExtraStruct textExtraStruct) {
        C89219l.m154721d(textExtraStruct, "");
        VideoItemParams videoItemParams = (VideoItemParams) mo23342g();
        if (videoItemParams == null || videoItemParams.mAweme == null || videoItemParams.mAweme.getDesc() == null || textExtraStruct.getStart() < 0 || textExtraStruct.getEnd() < 0 || textExtraStruct.getEnd() > videoItemParams.mAweme.getDesc().length() || textExtraStruct.getStart() >= videoItemParams.mAweme.getDesc().length() || textExtraStruct.getStart() >= textExtraStruct.getEnd()) {
            return false;
        }
        return true;
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

    /* Return type fixed from 'com.bytedance.assem.arch.viewModel.j' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.assem.arch.viewModel.j, com.ss.android.ugc.aweme.feed.model.VideoItemParams] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x0031  */
    @Override // com.p2082ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ com.p2082ss.android.ugc.aweme.feed.assem.desc.C48650l mo80488a(com.p2082ss.android.ugc.aweme.feed.assem.desc.C48650l r18, com.p2082ss.android.ugc.aweme.feed.model.VideoItemParams r19) {
        /*
        // Method dump skipped, instructions count: 212
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.assem.desc.VideoDescVM.mo80488a(com.bytedance.assem.arch.viewModel.j, com.ss.android.ugc.aweme.feed.model.VideoItemParams):com.bytedance.assem.arch.viewModel.j");
    }

    /* renamed from: a */
    public final void mo80589a(String str, int i, int i2) {
        SpannableStringBuilder spannableStringBuilder;
        String string;
        String str2 = "";
        C89219l.m154721d(str, str2);
        VideoItemParams videoItemParams = (VideoItemParams) mo23342g();
        if (videoItemParams != null) {
            if (TextUtils.isEmpty(this.f112371x) || TextUtils.isEmpty(this.f112372y)) {
                Aweme aweme = videoItemParams.mAweme;
                C89219l.m154716b(aweme, str2);
                this.f112371x = new SpannableStringBuilder(aweme.getProcessedDesc());
                Aweme aweme2 = videoItemParams.mAweme;
                C89219l.m154716b(aweme2, str2);
                this.f112372y = new SpannableStringBuilder(aweme2.getEllipsizeDesc());
            }
            Context h = mo23343h();
            if (!(h == null || (string = h.getString(R.string.bua)) == null)) {
                str2 = string;
            }
            boolean a = C89219l.m154714a((Object) str, (Object) str2);
            if (a) {
                spannableStringBuilder = this.f112371x;
            } else {
                spannableStringBuilder = this.f112372y;
            }
            if (spannableStringBuilder != null) {
                mo80588a(spannableStringBuilder, a, i, i2);
            }
        }
    }

    /* renamed from: a */
    public final void mo80588a(SpannableStringBuilder spannableStringBuilder, boolean z, int i, int i2) {
        String str;
        int a;
        Context h;
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        C89219l.m154721d(spannableStringBuilder2, "");
        VideoItemParams videoItemParams = (VideoItemParams) mo23342g();
        if (videoItemParams != null) {
            int i3 = this.f112362A;
            int i4 = this.f112373z;
            if (videoItemParams.mAweme != null && i == 0) {
                if (i2 == 2) {
                    if (videoItemParams.mAweme.getTransDesc() != null) {
                        if (C48593c.f112395y) {
                            i3 = videoItemParams.mAweme.getTruncatedTransTextHeight();
                            Aweme aweme = videoItemParams.mAweme;
                            C89219l.m154716b(aweme, "");
                            i4 = (Math.min(C48593c.f112396z, videoItemParams.mAweme.getTransDescLines()) * i3) / m91948a(aweme);
                        } else {
                            Aweme aweme2 = videoItemParams.mAweme;
                            C89219l.m154716b(aweme2, "");
                            i4 = (videoItemParams.mAweme.getTransDescLines() * i3) / m91948a(aweme2);
                        }
                        spannableStringBuilder2 = z ? new SpannableStringBuilder(videoItemParams.mAweme.getTransDesc()) : new SpannableStringBuilder(videoItemParams.mAweme.getEllipsizeTransDesc());
                    }
                } else if (i2 == 0 && videoItemParams.mAweme.getTransDesc() != null && (TextUtils.equals(videoItemParams.mAweme.getTransDesc(), this.f112371x) || TextUtils.equals(videoItemParams.mAweme.getDesc(), videoItemParams.mAweme.getEllipsizeDesc()))) {
                    if (C48593c.f112395y) {
                        i3 = videoItemParams.mAweme.getDescTruncatedTextHeight();
                        Aweme aweme3 = videoItemParams.mAweme;
                        C89219l.m154716b(aweme3, "");
                        i4 = (videoItemParams.mAweme.getDescLines() * i3) / m91948a(aweme3);
                    }
                    spannableStringBuilder2 = z ? new SpannableStringBuilder(videoItemParams.mAweme.getProcessedDesc()) : new SpannableStringBuilder(videoItemParams.mAweme.getEllipsizeDesc());
                }
            }
            if (z) {
                str = "spread";
            } else {
                str = "fold";
            }
            C39162r.m79460a("video_title", mo80586a(str));
            if (z) {
                a = C48593c.f112396z;
            } else {
                Aweme aweme4 = videoItemParams.mAweme;
                C89219l.m154716b(aweme4, "");
                a = m91948a(aweme4);
            }
            if (C49525p.m92764d() && z && (h = mo23343h()) != null) {
                if (this.f112364C != 0) {
                    i4 = Math.min((int) (((float) (this.f112364C + i3)) - (C84912r.m145930a(h, 60.0f) + C84912r.m145930a(h, 40.0f))), i4);
                } else {
                    i4 = Math.min(600, i4);
                }
            }
            mo20662a(new C48586b(new C48591a(spannableStringBuilder2, i4, i3, a, z)));
        }
    }
}
