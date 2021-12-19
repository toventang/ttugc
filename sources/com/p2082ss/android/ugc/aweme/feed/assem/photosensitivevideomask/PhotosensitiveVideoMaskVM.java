package com.p2082ss.android.ugc.aweme.feed.assem.photosensitivevideomask;

import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import com.bytedance.assem.arch.viewModel.AbstractC12853j;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17879g;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService;
import com.p2082ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.p2082ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49674b;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.feed.assem.photosensitivevideomask.PhotosensitiveVideoMaskVM */
public final class PhotosensitiveVideoMaskVM extends FeedBaseViewModel<C48896j> {
    static {
        Covode.recordClassIndex(57650);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    /* renamed from: f */
    public final /* synthetic */ AbstractC12853j mo20674f() {
        return new C48896j();
    }

    /* renamed from: h */
    public final void mo23343h() {
        mo20667b(new C48866c(this));
    }

    /* renamed from: i */
    public final void mo80712i() {
        if (C39223a.m79590d().mo68623h() == 1) {
            mo20662a(new C48864a(this));
        } else {
            mo20662a(new C48865b(this));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.photosensitivevideomask.PhotosensitiveVideoMaskVM$c */
    static final class C48866c extends AbstractC89220m implements AbstractC89172b<C48896j, C89391z> {

        /* renamed from: a */
        final /* synthetic */ PhotosensitiveVideoMaskVM f112752a;

        static {
            Covode.recordClassIndex(57653);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48866c(PhotosensitiveVideoMaskVM photosensitiveVideoMaskVM) {
            super(1);
            this.f112752a = photosensitiveVideoMaskVM;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C48896j jVar) {
            C48896j jVar2 = jVar;
            C89219l.m154721d(jVar2, "");
            if (jVar2.f112783a != 8) {
                C39223a.m79590d().mo68615a((IComplianceBusinessService) 2, (int) ((AbstractC89171a<C89391z>) null));
                AbstractC81915c.m141874a(new C49674b());
                this.f112752a.mo20662a(C488671.f112753a);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.photosensitivevideomask.PhotosensitiveVideoMaskVM$a */
    static final class C48864a extends AbstractC89220m implements AbstractC89172b<C48896j, C48896j> {

        /* renamed from: a */
        final /* synthetic */ PhotosensitiveVideoMaskVM f112750a;

        static {
            Covode.recordClassIndex(57651);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48864a(PhotosensitiveVideoMaskVM photosensitiveVideoMaskVM) {
            super(1);
            this.f112750a = photosensitiveVideoMaskVM;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C48896j invoke(C48896j jVar) {
            C89219l.m154721d(jVar, "");
            String string = C17879g.m33106c().getString(R.string.dot);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C17879g.m33104a().getString(R.string.dou) + "\n\n" + C17879g.m33104a().getString(R.string.dov));
            int a = C89361p.m154888a((CharSequence) spannableStringBuilder, "\n\n", 0, false, 6);
            spannableStringBuilder.setSpan(new AbsoluteSizeSpan(7, true), a + 1, a + 2, 33);
            return C48896j.m92106a(0, string, spannableStringBuilder.toString(), 8, 8);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.photosensitivevideomask.PhotosensitiveVideoMaskVM$b */
    static final class C48865b extends AbstractC89220m implements AbstractC89172b<C48896j, C48896j> {

        /* renamed from: a */
        final /* synthetic */ PhotosensitiveVideoMaskVM f112751a;

        static {
            Covode.recordClassIndex(57652);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48865b(PhotosensitiveVideoMaskVM photosensitiveVideoMaskVM) {
            super(1);
            this.f112751a = photosensitiveVideoMaskVM;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C48896j invoke(C48896j jVar) {
            C89219l.m154721d(jVar, "");
            String string = C17879g.m33106c().getString(R.string.dox);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C17879g.m33104a().getString(R.string.dor) + "\n\n" + C17879g.m33104a().getString(R.string.dos));
            int a = C89361p.m154888a((CharSequence) spannableStringBuilder, "\n\n", 0, false, 6);
            spannableStringBuilder.setSpan(new AbsoluteSizeSpan(7, true), a + 1, a + 2, 33);
            return C48896j.m92106a(0, string, spannableStringBuilder.toString(), 0, 0);
        }
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
