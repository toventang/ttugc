package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import androidx.core.p035f.C0671a;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1710c.C23008e;
import com.bytedance.tux.p1710c.C23009f;
import com.facebook.drawee.p1851c.AbstractC24203d;
import com.facebook.imagepipeline.p1890o.AbstractC24641d;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.BaseContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.ShareChallengeContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.p3136d.C54438a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55215k;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55226r;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.p3184b.C55192b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.p3185c.C55198a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.z */
public class C54575z extends AbstractC54482a<ShareChallengeContent> {

    /* renamed from: A */
    private RemoteImageView f125095A;

    /* renamed from: B */
    private Drawable f125096B;

    /* renamed from: a */
    private TuxIconView f125097a;

    /* renamed from: b */
    private TuxTextView f125098b;

    /* renamed from: x */
    private TuxTextView f125099x;

    /* renamed from: y */
    private RemoteImageView f125100y;

    /* renamed from: z */
    private RemoteImageView f125101z;

    static {
        Covode.recordClassIndex(64286);
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
            RemoteImageView remoteImageView = this.f125100y;
            if (remoteImageView == null) {
                C89219l.m154710a("img1View");
            }
            C55192b.m100905a(remoteImageView, new float[]{0.0f, 0.0f, 0.0f, dimensionPixelSize});
            RemoteImageView remoteImageView2 = this.f125095A;
            if (remoteImageView2 == null) {
                C89219l.m154710a("img3View");
            }
            C55192b.m100905a(remoteImageView2, new float[]{0.0f, 0.0f, dimensionPixelSize, 0.0f});
            return;
        }
        RemoteImageView remoteImageView3 = this.f125100y;
        if (remoteImageView3 == null) {
            C89219l.m154710a("img1View");
        }
        C55192b.m100905a(remoteImageView3, new float[]{0.0f, 0.0f, dimensionPixelSize, 0.0f});
        RemoteImageView remoteImageView4 = this.f125095A;
        if (remoteImageView4 == null) {
            C89219l.m154710a("img3View");
        }
        C55192b.m100905a(remoteImageView4, new float[]{0.0f, 0.0f, 0.0f, dimensionPixelSize});
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.AbstractC54482a
    /* renamed from: a */
    public void mo91007a() {
        super.mo91007a();
        View findViewById = this.itemView.findViewById(R.id.acq);
        C89219l.m154716b(findViewById, "");
        this.f124819o = C54438a.C54439a.m99780a(findViewById);
        View findViewById2 = this.itemView.findViewById(R.id.bic);
        C89219l.m154716b(findViewById2, "");
        this.f125097a = (TuxIconView) findViewById2;
        View findViewById3 = this.itemView.findViewById(R.id.icon_iv);
        C89219l.m154716b(findViewById3, "");
        ((RemoteImageView) findViewById3).setVisibility(8);
        View findViewById4 = this.itemView.findViewById(R.id.title_tv);
        C89219l.m154716b(findViewById4, "");
        this.f125098b = (TuxTextView) findViewById4;
        View findViewById5 = this.itemView.findViewById(R.id.ajs);
        C89219l.m154716b(findViewById5, "");
        this.f125099x = (TuxTextView) findViewById5;
        View findViewById6 = this.itemView.findViewById(R.id.blf);
        C89219l.m154716b(findViewById6, "");
        this.f125100y = (RemoteImageView) findViewById6;
        View findViewById7 = this.itemView.findViewById(R.id.blg);
        C89219l.m154716b(findViewById7, "");
        this.f125101z = (RemoteImageView) findViewById7;
        View findViewById8 = this.itemView.findViewById(R.id.blh);
        C89219l.m154716b(findViewById8, "");
        this.f125095A = (RemoteImageView) findViewById8;
        C23008e a = C23009f.m43397a(C54576a.f125102a);
        View view = this.itemView;
        C89219l.m154716b(view, "");
        Context context = view.getContext();
        C89219l.m154716b(context, "");
        this.f125096B = a.mo37389a(context);
        TuxIconView tuxIconView = this.f125097a;
        if (tuxIconView == null) {
            C89219l.m154710a("iconView");
        }
        Drawable drawable = this.f125096B;
        if (drawable == null) {
            C89219l.m154710a("iconShapeDrawable");
        }
        tuxIconView.setBackground(drawable);
        TuxIconView tuxIconView2 = this.f125097a;
        if (tuxIconView2 == null) {
            C89219l.m154710a("iconView");
        }
        Resources system = Resources.getSystem();
        C89219l.m154709a((Object) system, "");
        tuxIconView2.setIconHeight(C89241a.m154730a(TypedValue.applyDimension(1, 24.0f, system.getDisplayMetrics())));
        TuxIconView tuxIconView3 = this.f125097a;
        if (tuxIconView3 == null) {
            C89219l.m154710a("iconView");
        }
        Resources system2 = Resources.getSystem();
        C89219l.m154709a((Object) system2, "");
        tuxIconView3.setIconWidth(C89241a.m154730a(TypedValue.applyDimension(1, 24.0f, system2.getDisplayMetrics())));
        TuxIconView tuxIconView4 = this.f125097a;
        if (tuxIconView4 == null) {
            C89219l.m154710a("iconView");
        }
        tuxIconView4.setTintColorRes(R.attr.bj);
        TuxIconView tuxIconView5 = this.f125097a;
        if (tuxIconView5 == null) {
            C89219l.m154710a("iconView");
        }
        tuxIconView5.setIconRes(R.raw.icon_number);
        TuxIconView tuxIconView6 = this.f125097a;
        if (tuxIconView6 == null) {
            C89219l.m154710a("iconView");
        }
        tuxIconView6.setVisibility(0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.z$a */
    public static final class C54576a extends AbstractC89220m implements AbstractC89172b<C23008e, C89391z> {

        /* renamed from: a */
        public static final C54576a f125102a = new C54576a();

        static {
            Covode.recordClassIndex(64287);
        }

        C54576a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23008e eVar) {
            C23008e eVar2 = eVar;
            C89219l.m154721d(eVar2, "");
            eVar2.f54467f = Integer.valueOf((int) R.attr.al);
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            eVar2.f54464c = Float.valueOf((float) C89241a.m154730a(TypedValue.applyDimension(1, 24.0f, system.getDisplayMetrics())));
            eVar2.f54465d = 1;
            return C89391z.f203057a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54575z(View view, EnumC53772b bVar) {
        super(view);
        C89219l.m154721d(view, "");
        C89219l.m154721d(bVar, "");
    }

    /* renamed from: a */
    public void mo91008a(C19538ai aiVar, C19538ai aiVar2, ShareChallengeContent shareChallengeContent, int i) {
        C89219l.m154721d(aiVar, "");
        C89219l.m154721d(shareChallengeContent, "");
        super.mo91008a(aiVar, aiVar2, (BaseContent) shareChallengeContent, i);
        C0671a a = C0671a.m2407a();
        TuxTextView tuxTextView = this.f125098b;
        if (tuxTextView == null) {
            C89219l.m154710a("titleView");
        }
        tuxTextView.setText(shareChallengeContent.getTitle());
        TuxTextView tuxTextView2 = this.f125099x;
        if (tuxTextView2 == null) {
            C89219l.m154710a("descView");
        }
        tuxTextView2.setVisibility(0);
        TuxTextView tuxTextView3 = this.f125099x;
        if (tuxTextView3 == null) {
            C89219l.m154710a("descView");
        }
        View view = this.itemView;
        C89219l.m154716b(view, "");
        Context context = view.getContext();
        C89219l.m154716b(context, "");
        tuxTextView3.setText(context.getResources().getString(R.string.ccq, a.mo2696b(C55215k.m100959a(shareChallengeContent.getUserCount()))));
        RemoteImageView remoteImageView = this.f125100y;
        if (remoteImageView == null) {
            C89219l.m154710a("img1View");
        }
        C55198a.m100933a(remoteImageView, shareChallengeContent.getCoverUrl().get(0), (AbstractC24641d) null, 0, 0, (AbstractC24203d) null, 60);
        RemoteImageView remoteImageView2 = this.f125101z;
        if (remoteImageView2 == null) {
            C89219l.m154710a("img2View");
        }
        C55198a.m100933a(remoteImageView2, shareChallengeContent.getCoverUrl().get(1), (AbstractC24641d) null, 0, 0, (AbstractC24203d) null, 60);
        RemoteImageView remoteImageView3 = this.f125095A;
        if (remoteImageView3 == null) {
            C89219l.m154710a("img3View");
        }
        C55198a.m100933a(remoteImageView3, shareChallengeContent.getCoverUrl().get(2), (AbstractC24641d) null, 0, 0, (AbstractC24203d) null, 60);
        this.f124819o.mo91505a(50331648, 18);
        this.f124819o.mo91505a(67108864, shareChallengeContent.getChallengeId());
        this.f124819o.mo91505a(50331649, Boolean.valueOf(shareChallengeContent.isCommerce()));
    }
}
