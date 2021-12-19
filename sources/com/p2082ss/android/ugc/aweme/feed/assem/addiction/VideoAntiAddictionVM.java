package com.p2082ss.android.ugc.aweme.feed.assem.addiction;

import android.content.Context;
import com.bytedance.assem.arch.viewModel.AbstractC12853j;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.C16041a;
import com.p2082ss.android.ugc.aweme.feed.assem.C48707g;
import com.p2082ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.C49557n;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50539g;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50545m;
import com.p2082ss.android.ugc.aweme.global.config.settings.C52912c;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import java.text.SimpleDateFormat;
import java.util.Locale;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89225r;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.ss.android.ugc.aweme.feed.assem.addiction.VideoAntiAddictionVM */
public final class VideoAntiAddictionVM extends FeedBaseViewModel<C48379e> {

    /* renamed from: k */
    static final /* synthetic */ AbstractC89286i[] f112058k = {new C89225r(VideoAntiAddictionVM.class, "context", "getContext()Landroid/content/Context;", 0)};

    /* renamed from: n */
    public static final C48358a f112059n = new C48358a((byte) 0);

    /* renamed from: l */
    public boolean f112060l;

    /* renamed from: m */
    public boolean f112061m;

    /* renamed from: v */
    private final C48707g f112062v = new C48707g(C48359b.f112063a);

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.addiction.VideoAntiAddictionVM$b */
    static final class C48359b extends AbstractC89220m implements AbstractC89171a<Context> {

        /* renamed from: a */
        public static final C48359b f112063a = new C48359b();

        static {
            Covode.recordClassIndex(57132);
        }

        C48359b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ Context invoke() {
            return null;
        }
    }

    static {
        Covode.recordClassIndex(57130);
    }

    /* renamed from: a */
    public final void mo80489a(Context context) {
        this.f112062v.mo80661a(f112058k[0], context);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.addiction.VideoAntiAddictionVM$a */
    public static final class C48358a {
        static {
            Covode.recordClassIndex(57131);
        }

        private C48358a() {
        }

        public /* synthetic */ C48358a(byte b) {
            this();
        }

        /* renamed from: a */
        public static boolean m91812a(VideoItemParams videoItemParams) {
            C89219l.m154721d(videoItemParams, "");
            if (C49557n.m92869a(videoItemParams.mAweme)) {
                return false;
            }
            Aweme aweme = videoItemParams.mAweme;
            C89219l.m154716b(aweme, "");
            if (aweme.isHotSearchAweme()) {
                return false;
            }
            Aweme aweme2 = videoItemParams.mAweme;
            C89219l.m154716b(aweme2, "");
            if (aweme2.isHotVideoAweme() || C50545m.m94770g(videoItemParams.mAweme) || C50539g.m94744a(videoItemParams.mAweme)) {
                return false;
            }
            return true;
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    /* renamed from: f */
    public final /* synthetic */ AbstractC12853j mo20674f() {
        return new C48379e();
    }

    /* renamed from: h */
    public static SimpleDateFormat m91807h() {
        boolean z;
        try {
            IESSettingsProxy iESSettingsProxy = C52912c.f121688a.f121689b;
            C89219l.m154716b(iESSettingsProxy, "");
            Boolean antiAddictionToastEnable24hourTime = iESSettingsProxy.getAntiAddictionToastEnable24hourTime();
            C89219l.m154716b(antiAddictionToastEnable24hourTime, "");
            z = antiAddictionToastEnable24hourTime.booleanValue();
        } catch (C16041a unused) {
            z = false;
        }
        if (z) {
            return new SimpleDateFormat("HH:mm", Locale.ENGLISH);
        }
        return new SimpleDateFormat("hh:mm aa", Locale.ENGLISH);
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
    /* JADX WARNING: Removed duplicated region for block: B:10:0x003c  */
    @Override // com.p2082ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ com.p2082ss.android.ugc.aweme.feed.assem.addiction.C48379e mo80488a(com.p2082ss.android.ugc.aweme.feed.assem.addiction.C48379e r10, com.p2082ss.android.ugc.aweme.feed.model.VideoItemParams r11) {
        /*
        // Method dump skipped, instructions count: 181
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.assem.addiction.VideoAntiAddictionVM.mo80488a(com.bytedance.assem.arch.viewModel.j, com.ss.android.ugc.aweme.feed.model.VideoItemParams):com.bytedance.assem.arch.viewModel.j");
    }
}
