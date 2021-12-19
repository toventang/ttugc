package com.p2082ss.android.ugc.aweme.feed.assem.vpainfobar;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import com.bytedance.assem.arch.viewModel.AbstractC12853j;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17879g;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.VPAInfo;
import com.p2082ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50539g;
import com.p2082ss.android.ugc.aweme.shortvideo.C71872i;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.assem.vpainfobar.VPAInfoBarVM */
public final class VPAInfoBarVM extends FeedBaseViewModel<C49245f> {
    static {
        Covode.recordClassIndex(58012);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    /* renamed from: f */
    public final /* synthetic */ AbstractC12853j mo20674f() {
        return new C49245f();
    }

    /* renamed from: h */
    public final int mo23343h() {
        Aweme aweme;
        VideoItemParams videoItemParams = (VideoItemParams) mo23342g();
        if (videoItemParams != null) {
            aweme = videoItemParams.mAweme;
        } else {
            aweme = null;
        }
        if (C50539g.m94744a(aweme)) {
            return 0;
        }
        return 8;
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.vpainfobar.VPAInfoBarVM$a */
    public static final class C49217a extends ImageSpan {
        static {
            Covode.recordClassIndex(58013);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C49217a(Context context) {
            super(context, 2131231740);
            C89219l.m154721d(context, "");
        }

        public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
            C89219l.m154721d(canvas, "");
            C89219l.m154721d(charSequence, "");
            C89219l.m154721d(paint, "");
            Drawable drawable = getDrawable();
            canvas.save();
            Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
            C89219l.m154716b(drawable, "");
            canvas.translate(f, (float) (((((fontMetricsInt.descent + i4) + i4) + fontMetricsInt.ascent) / 2) - (drawable.getBounds().bottom / 2)));
            drawable.draw(canvas);
            canvas.restore();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.vpainfobar.VPAInfoBarVM$b */
    static final class C49218b extends AbstractC89220m implements AbstractC89172b<C49245f, C49245f> {

        /* renamed from: a */
        final /* synthetic */ VPAInfoBarVM f113205a;

        static {
            Covode.recordClassIndex(58014);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C49218b(VPAInfoBarVM vPAInfoBarVM) {
            super(1);
            this.f113205a = vPAInfoBarVM;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C49245f invoke(C49245f fVar) {
            C49245f fVar2 = fVar;
            C89219l.m154721d(fVar2, "");
            VPAInfoBarVM vPAInfoBarVM = this.f113205a;
            Object g = vPAInfoBarVM.mo23342g();
            if (g == null) {
                C89219l.m154715b();
            }
            return vPAInfoBarVM.mo80488a(fVar2, (VideoItemParams) g);
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

    /* renamed from: a */
    public final C49245f mo80488a(C49245f fVar, VideoItemParams videoItemParams) {
        Aweme aweme;
        SpannableString spannableString;
        Resources c;
        int i;
        Aweme aweme2;
        C71872i uploadMiscInfoStruct;
        VPAInfo vPAInfo;
        Aweme aweme3;
        int i2;
        VideoItemParams videoItemParams2;
        VideoItemParams videoItemParams3;
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(videoItemParams, "");
        VideoItemParams videoItemParams4 = (VideoItemParams) mo23342g();
        String str = null;
        if (videoItemParams4 != null) {
            aweme = videoItemParams4.mAweme;
        } else {
            aweme = null;
        }
        if (!C50539g.m94744a(aweme)) {
            spannableString = null;
        } else {
            StringBuilder sb = new StringBuilder();
            VideoItemParams videoItemParams5 = (VideoItemParams) mo23342g();
            if (videoItemParams5 == null || (aweme2 = videoItemParams5.mAweme) == null || (uploadMiscInfoStruct = aweme2.getUploadMiscInfoStruct()) == null || (vPAInfo = uploadMiscInfoStruct.vpaInfo) == null || vPAInfo.getInfoBarType() != 1) {
                c = C17879g.m33106c();
                i = R.string.bv4;
            } else {
                c = C17879g.m33106c();
                i = R.string.bv3;
            }
            spannableString = new SpannableString(sb.append(c.getString(i)).append("  ").toString());
            Application a = C17879g.m33104a();
            C89219l.m154716b(a, "");
            spannableString.setSpan(new C49217a(a), spannableString.length() - 1, spannableString.length(), 18);
        }
        int h = mo23343h();
        VideoItemParams videoItemParams6 = (VideoItemParams) mo23342g();
        if (videoItemParams6 != null) {
            aweme3 = videoItemParams6.mAweme;
        } else {
            aweme3 = null;
        }
        if (C50539g.m94744a(aweme3) && C39223a.m79591e().mo68728c() != 2) {
            VideoItemParams videoItemParams7 = (VideoItemParams) mo23342g();
            if (videoItemParams7 != null) {
                str = videoItemParams7.mEventType;
            }
            if (C89219l.m154714a((Object) "homepage_hot", (Object) str) && (videoItemParams2 = (VideoItemParams) mo23342g()) != null && videoItemParams2.mPageType == 0 && (videoItemParams3 = (VideoItemParams) mo23342g()) != null && videoItemParams3.mAwemeFromPage == 1) {
                i2 = 0;
                return new C49245f(spannableString, h, i2);
            }
        }
        i2 = 8;
        return new C49245f(spannableString, h, i2);
    }
}
