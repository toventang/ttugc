package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import androidx.core.p035f.C0671a;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.bytedance.tux.input.TuxTextView;
import com.facebook.drawee.p1851c.AbstractC24203d;
import com.facebook.imagepipeline.p1890o.AbstractC24641d;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.BaseContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.ShareCompilationContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.p3136d.C54438a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55215k;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55226r;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.p3184b.C55192b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.p3185c.C55198a;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.ad */
public class C54489ad extends AbstractC54482a<ShareCompilationContent> {

    /* renamed from: A */
    private RemoteImageView f124840A;

    /* renamed from: a */
    private RemoteImageView f124841a;

    /* renamed from: b */
    private TuxTextView f124842b;

    /* renamed from: x */
    private TuxTextView f124843x;

    /* renamed from: y */
    private RemoteImageView f124844y;

    /* renamed from: z */
    private RemoteImageView f124845z;

    static {
        Covode.recordClassIndex(64200);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.AbstractC54482a
    /* renamed from: a */
    public void mo91007a() {
        super.mo91007a();
        Object a = mo91563a(R.id.acq);
        C89219l.m154716b(a, "");
        this.f124819o = C54438a.C54439a.m99780a((View) a);
        Object a2 = mo91563a(R.id.icon_iv);
        C89219l.m154716b(a2, "");
        this.f124841a = (RemoteImageView) a2;
        Object a3 = mo91563a(R.id.title_tv);
        C89219l.m154716b(a3, "");
        this.f124842b = (TuxTextView) a3;
        Object a4 = mo91563a(R.id.ajs);
        C89219l.m154716b(a4, "");
        this.f124843x = (TuxTextView) a4;
        Object a5 = mo91563a(R.id.blf);
        C89219l.m154716b(a5, "");
        this.f124844y = (RemoteImageView) a5;
        Object a6 = mo91563a(R.id.blg);
        C89219l.m154716b(a6, "");
        this.f124845z = (RemoteImageView) a6;
        Object a7 = mo91563a(R.id.blh);
        C89219l.m154716b(a7, "");
        this.f124840A = (RemoteImageView) a7;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.AbstractC54482a
    public final void bK_() {
        View view = this.itemView;
        C89219l.m154716b(view, "");
        Context context = view.getContext();
        C89219l.m154716b(context, "");
        float dimensionPixelSize = (float) context.getResources().getDimensionPixelSize(R.dimen.li);
        if (C55226r.m100992a()) {
            RemoteImageView remoteImageView = this.f124844y;
            if (remoteImageView == null) {
                C89219l.m154710a("coverFirstView");
            }
            C55192b.m100905a(remoteImageView, new float[]{0.0f, 0.0f, 0.0f, dimensionPixelSize});
            RemoteImageView remoteImageView2 = this.f124840A;
            if (remoteImageView2 == null) {
                C89219l.m154710a("coverThirdView");
            }
            C55192b.m100905a(remoteImageView2, new float[]{0.0f, 0.0f, dimensionPixelSize, 0.0f});
            return;
        }
        RemoteImageView remoteImageView3 = this.f124844y;
        if (remoteImageView3 == null) {
            C89219l.m154710a("coverFirstView");
        }
        C55192b.m100905a(remoteImageView3, new float[]{0.0f, 0.0f, dimensionPixelSize, 0.0f});
        RemoteImageView remoteImageView4 = this.f124840A;
        if (remoteImageView4 == null) {
            C89219l.m154710a("coverThirdView");
        }
        C55192b.m100905a(remoteImageView4, new float[]{0.0f, 0.0f, 0.0f, dimensionPixelSize});
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.AbstractC54482a
    /* renamed from: a */
    public void mo91564a(View.OnClickListener onClickListener) {
        super.mo91564a(onClickListener);
        this.f124819o.mo91506a(onClickListener);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.AbstractC54482a
    /* renamed from: a */
    public final void mo91565a(View.OnLongClickListener onLongClickListener) {
        super.mo91565a(onLongClickListener);
        this.f124819o.mo91507a(onLongClickListener);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54489ad(View view, EnumC53772b bVar) {
        super(view);
        C89219l.m154721d(view, "");
        C89219l.m154721d(bVar, "");
    }

    /* renamed from: a */
    public void mo91008a(C19538ai aiVar, C19538ai aiVar2, ShareCompilationContent shareCompilationContent, int i) {
        long j;
        C89219l.m154721d(aiVar, "");
        super.mo91008a(aiVar, aiVar2, (BaseContent) shareCompilationContent, i);
        if (shareCompilationContent != null) {
            C0671a a = C0671a.m2407a();
            TuxTextView tuxTextView = this.f124842b;
            if (tuxTextView == null) {
                C89219l.m154710a("titleView");
            }
            tuxTextView.setText(shareCompilationContent.getTitle());
            TuxTextView tuxTextView2 = this.f124843x;
            if (tuxTextView2 == null) {
                C89219l.m154710a("descView");
            }
            View view = this.itemView;
            C89219l.m154716b(view, "");
            Context context = view.getContext();
            C89219l.m154716b(context, "");
            Resources resources = context.getResources();
            Object[] objArr = new Object[1];
            Long viewCount = shareCompilationContent.getViewCount();
            if (viewCount != null) {
                j = viewCount.longValue();
            } else {
                j = 0;
            }
            objArr[0] = a.mo2696b(C55215k.m100959a(j));
            tuxTextView2.setText(resources.getString(R.string.arl, objArr));
            TuxTextView tuxTextView3 = this.f124843x;
            if (tuxTextView3 == null) {
                C89219l.m154710a("descView");
            }
            tuxTextView3.setVisibility(0);
            List<UrlModel> awemeCoverList = shareCompilationContent.getAwemeCoverList();
            if (awemeCoverList != null && !awemeCoverList.isEmpty() && awemeCoverList.size() >= 3) {
                RemoteImageView remoteImageView = this.f124844y;
                if (remoteImageView == null) {
                    C89219l.m154710a("coverFirstView");
                }
                C55198a.m100933a(remoteImageView, awemeCoverList.get(0), (AbstractC24641d) null, 0, 0, (AbstractC24203d) null, 60);
                RemoteImageView remoteImageView2 = this.f124845z;
                if (remoteImageView2 == null) {
                    C89219l.m154710a("coverSecondView");
                }
                C55198a.m100933a(remoteImageView2, awemeCoverList.get(1), (AbstractC24641d) null, 0, 0, (AbstractC24203d) null, 60);
                RemoteImageView remoteImageView3 = this.f124840A;
                if (remoteImageView3 == null) {
                    C89219l.m154710a("coverThirdView");
                }
                C55198a.m100933a(remoteImageView3, awemeCoverList.get(2), (AbstractC24641d) null, 0, 0, (AbstractC24203d) null, 60);
            }
            RemoteImageView remoteImageView4 = this.f124841a;
            if (remoteImageView4 == null) {
                C89219l.m154710a("iconView");
            }
            C34577e.m70591a(remoteImageView4, 2131232895);
        }
        this.f124819o.mo91505a(50331648, 38);
        this.f124819o.mo91505a(67108864, this.f124823s);
    }
}
