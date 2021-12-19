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
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.BaseContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.ShareQnAContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.p3136d.C54438a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55215k;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55226r;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55231t;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.p3184b.C55192b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.p3185c.C55198a;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.ap */
public class C54507ap extends AbstractC54482a<ShareQnAContent> {

    /* renamed from: A */
    private RemoteImageView f124925A;

    /* renamed from: a */
    private RemoteImageView f124926a;

    /* renamed from: b */
    private TuxTextView f124927b;

    /* renamed from: x */
    private TuxTextView f124928x;

    /* renamed from: y */
    private RemoteImageView f124929y;

    /* renamed from: z */
    private RemoteImageView f124930z;

    static {
        Covode.recordClassIndex(64218);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.AbstractC54482a
    /* renamed from: a */
    public void mo91007a() {
        super.mo91007a();
        View findViewById = this.itemView.findViewById(R.id.acq);
        C89219l.m154716b(findViewById, "");
        this.f124819o = C54438a.C54439a.m99780a(findViewById);
        View findViewById2 = this.itemView.findViewById(R.id.icon_iv);
        C89219l.m154716b(findViewById2, "");
        this.f124926a = (RemoteImageView) findViewById2;
        View findViewById3 = this.itemView.findViewById(R.id.title_tv);
        C89219l.m154716b(findViewById3, "");
        this.f124927b = (TuxTextView) findViewById3;
        View findViewById4 = this.itemView.findViewById(R.id.ajs);
        C89219l.m154716b(findViewById4, "");
        this.f124928x = (TuxTextView) findViewById4;
        View findViewById5 = this.itemView.findViewById(R.id.blf);
        C89219l.m154716b(findViewById5, "");
        this.f124929y = (RemoteImageView) findViewById5;
        View findViewById6 = this.itemView.findViewById(R.id.blg);
        C89219l.m154716b(findViewById6, "");
        this.f124930z = (RemoteImageView) findViewById6;
        View findViewById7 = this.itemView.findViewById(R.id.blh);
        C89219l.m154716b(findViewById7, "");
        this.f124925A = (RemoteImageView) findViewById7;
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
            RemoteImageView remoteImageView = this.f124929y;
            if (remoteImageView == null) {
                C89219l.m154710a("img1View");
            }
            C55192b.m100905a(remoteImageView, new float[]{0.0f, 0.0f, 0.0f, dimensionPixelSize});
            RemoteImageView remoteImageView2 = this.f124925A;
            if (remoteImageView2 == null) {
                C89219l.m154710a("img3View");
            }
            C55192b.m100905a(remoteImageView2, new float[]{0.0f, 0.0f, dimensionPixelSize, 0.0f});
            return;
        }
        RemoteImageView remoteImageView3 = this.f124929y;
        if (remoteImageView3 == null) {
            C89219l.m154710a("img1View");
        }
        C55192b.m100905a(remoteImageView3, new float[]{0.0f, 0.0f, dimensionPixelSize, 0.0f});
        RemoteImageView remoteImageView4 = this.f124925A;
        if (remoteImageView4 == null) {
            C89219l.m154710a("img3View");
        }
        C55192b.m100905a(remoteImageView4, new float[]{0.0f, 0.0f, 0.0f, dimensionPixelSize});
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54507ap(View view, EnumC53772b bVar) {
        super(view);
        C89219l.m154721d(view, "");
        C89219l.m154721d(bVar, "");
    }

    /* renamed from: a */
    public void mo91008a(C19538ai aiVar, C19538ai aiVar2, ShareQnAContent shareQnAContent, int i) {
        String str;
        long j;
        UrlModel urlModel;
        UrlModel urlModel2;
        List<UrlModel> awemeCoverList;
        List<UrlModel> awemeCoverList2;
        List<UrlModel> awemeCoverList3;
        C89219l.m154721d(aiVar, "");
        super.mo91008a(aiVar, aiVar2, (BaseContent) shareQnAContent, i);
        C0671a a = C0671a.m2407a();
        TuxTextView tuxTextView = this.f124927b;
        if (tuxTextView == null) {
            C89219l.m154710a("titleView");
        }
        UrlModel urlModel3 = null;
        if (shareQnAContent != null) {
            str = shareQnAContent.getQuestionName();
        } else {
            str = null;
        }
        tuxTextView.setText(str);
        TuxTextView tuxTextView2 = this.f124928x;
        if (tuxTextView2 == null) {
            C89219l.m154710a("descView");
        }
        tuxTextView2.setVisibility(0);
        TuxTextView tuxTextView3 = this.f124928x;
        if (tuxTextView3 == null) {
            C89219l.m154710a("descView");
        }
        View view = this.itemView;
        C89219l.m154716b(view, "");
        Context context = view.getContext();
        C89219l.m154716b(context, "");
        Resources resources = context.getResources();
        Object[] objArr = new Object[1];
        if (shareQnAContent != null) {
            j = (long) shareQnAContent.getUserCount();
        } else {
            j = 0;
        }
        objArr[0] = a.mo2696b(C55215k.m100959a(j));
        tuxTextView3.setText(resources.getString(R.string.cfc, objArr));
        this.f124819o.mo91505a(50331649, Boolean.valueOf(C55231t.m101002b(aiVar, shareQnAContent)));
        RemoteImageView remoteImageView = this.f124926a;
        if (remoteImageView == null) {
            C89219l.m154710a("iconView");
        }
        C55198a.m100926a(remoteImageView, 2131232868);
        RemoteImageView remoteImageView2 = this.f124929y;
        if (remoteImageView2 == null) {
            C89219l.m154710a("img1View");
        }
        if (shareQnAContent == null || (awemeCoverList3 = shareQnAContent.getAwemeCoverList()) == null) {
            urlModel = null;
        } else {
            urlModel = (UrlModel) C89070n.m154561b((List) awemeCoverList3, 0);
        }
        C55198a.m100933a(remoteImageView2, urlModel, (AbstractC24641d) null, 0, 0, (AbstractC24203d) null, 60);
        RemoteImageView remoteImageView3 = this.f124930z;
        if (remoteImageView3 == null) {
            C89219l.m154710a("img2View");
        }
        if (shareQnAContent == null || (awemeCoverList2 = shareQnAContent.getAwemeCoverList()) == null) {
            urlModel2 = null;
        } else {
            urlModel2 = (UrlModel) C89070n.m154561b((List) awemeCoverList2, 1);
        }
        C55198a.m100933a(remoteImageView3, urlModel2, (AbstractC24641d) null, 0, 0, (AbstractC24203d) null, 60);
        RemoteImageView remoteImageView4 = this.f124925A;
        if (remoteImageView4 == null) {
            C89219l.m154710a("img3View");
        }
        if (!(shareQnAContent == null || (awemeCoverList = shareQnAContent.getAwemeCoverList()) == null)) {
            urlModel3 = (UrlModel) C89070n.m154561b((List) awemeCoverList, 2);
        }
        C55198a.m100933a(remoteImageView4, urlModel3, (AbstractC24641d) null, 0, 0, (AbstractC24203d) null, 60);
        this.f124819o.mo91505a(50331648, 49);
        this.f124819o.mo91505a(67108864, this.f124823s);
    }
}
