package com.p2082ss.android.ugc.aweme.feed.assem.caution;

import android.text.SpannableString;
import android.text.style.StyleSpan;
import com.C1764a;
import com.bytedance.assem.arch.viewModel.AbstractC12853j;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.KtfInfo;
import com.p2082ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p2082ss.android.ugc.aweme.shortvideo.C71872i;
import java.util.Arrays;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.feed.assem.caution.VideoTopCautionVM */
public final class VideoTopCautionVM extends FeedBaseViewModel<C48522g> {

    /* renamed from: k */
    boolean f112239k;

    static {
        Covode.recordClassIndex(57268);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    /* renamed from: f */
    public final /* synthetic */ AbstractC12853j mo20674f() {
        return new C48522g();
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.caution.VideoTopCautionVM$a */
    static final class C48493a extends AbstractC89220m implements AbstractC89172b<C48522g, C48522g> {

        /* renamed from: a */
        public static final C48493a f112240a = new C48493a();

        static {
            Covode.recordClassIndex(57269);
        }

        C48493a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C48522g invoke(C48522g gVar) {
            C48522g gVar2 = gVar;
            C89219l.m154721d(gVar2, "");
            return C48522g.m91922a(false, gVar2.f112266b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.caution.VideoTopCautionVM$b */
    static final class C48494b extends AbstractC89220m implements AbstractC89172b<C48522g, C48522g> {

        /* renamed from: a */
        public static final C48494b f112241a = new C48494b();

        static {
            Covode.recordClassIndex(57270);
        }

        C48494b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C48522g invoke(C48522g gVar) {
            C48522g gVar2 = gVar;
            C89219l.m154721d(gVar2, "");
            return C48522g.m91922a(false, gVar2.f112266b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.caution.VideoTopCautionVM$c */
    static final class C48495c extends AbstractC89220m implements AbstractC89172b<C48522g, C89391z> {

        /* renamed from: a */
        final /* synthetic */ VideoTopCautionVM f112242a;

        static {
            Covode.recordClassIndex(57271);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48495c(VideoTopCautionVM videoTopCautionVM) {
            super(1);
            this.f112242a = videoTopCautionVM;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C48522g gVar) {
            VideoItemParams videoItemParams;
            Aweme aweme;
            C71872i uploadMiscInfoStruct;
            KtfInfo ktfInfo;
            Aweme aweme2;
            C48522g gVar2 = gVar;
            C89219l.m154721d(gVar2, "");
            if (!gVar2.f112265a) {
                VideoItemParams videoItemParams2 = (VideoItemParams) this.f112242a.mo23342g();
                String str = null;
                if (!(videoItemParams2 == null || videoItemParams2.mAweme == null || (videoItemParams = (VideoItemParams) this.f112242a.mo23342g()) == null || (aweme = videoItemParams.mAweme) == null || (uploadMiscInfoStruct = aweme.getUploadMiscInfoStruct()) == null || (ktfInfo = uploadMiscInfoStruct.ktfInfo) == null)) {
                    C89219l.m154716b(ktfInfo, "");
                    String cautionLabel = ktfInfo.getCautionLabel();
                    String a = C1764a.m5928a(ktfInfo.getWarningText(), Arrays.copyOf(new Object[]{cautionLabel}, 1));
                    C89219l.m154716b(a, "");
                    int a2 = C89361p.m154888a((CharSequence) a, cautionLabel, 0, false, 6);
                    final SpannableString spannableString = new SpannableString(a);
                    if (a2 >= 0) {
                        spannableString.setSpan(new StyleSpan(1), a2, cautionLabel.length(), 18);
                    }
                    this.f112242a.mo20662a(new AbstractC89172b<C48522g, C48522g>() {
                        /* class com.p2082ss.android.ugc.aweme.feed.assem.caution.VideoTopCautionVM.C48495c.C484961 */

                        static {
                            Covode.recordClassIndex(57272);
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // p4600h.p4611f.p4612a.AbstractC89172b
                        public final /* synthetic */ C48522g invoke(C48522g gVar) {
                            C89219l.m154721d(gVar, "");
                            return C48522g.m91922a(true, spannableString);
                        }
                    });
                    C33744d dVar = new C33744d();
                    VideoItemParams videoItemParams3 = (VideoItemParams) this.f112242a.mo23342g();
                    if (!(videoItemParams3 == null || (aweme2 = videoItemParams3.mAweme) == null)) {
                        str = aweme2.getAid();
                    }
                    C39162r.m79460a("tns_banner_popout_ktf", dVar.mo59983a("object_id", str).mo59983a("enter_from", this.f112242a.f112231p).f79943a);
                }
            }
            return C89391z.f203057a;
        }
    }

    /* Return type fixed from 'com.bytedance.assem.arch.viewModel.j' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.assem.arch.viewModel.j, com.ss.android.ugc.aweme.feed.model.VideoItemParams] */
    @Override // com.p2082ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel
    /* renamed from: a */
    public final /* synthetic */ C48522g mo80488a(C48522g gVar, VideoItemParams videoItemParams) {
        C89219l.m154721d(gVar, "");
        C89219l.m154721d(videoItemParams, "");
        return new C48522g();
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
}
