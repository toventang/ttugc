package com.p2082ss.android.ugc.aweme.commercialize.profile.impl;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.facebook.drawee.p1845a.p1846a.C24182c;
import com.facebook.drawee.p1845a.p1846a.C24185e;
import com.facebook.drawee.p1851c.AbstractC24198b;
import com.facebook.drawee.p1851c.AbstractC24203d;
import com.facebook.imagepipeline.common.C24363d;
import com.facebook.imagepipeline.p1885j.AbstractC24457f;
import com.facebook.imagepipeline.p1890o.AbstractC24641d;
import com.facebook.imagepipeline.p1890o.C24636b;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AvatarImageView;
import com.p2082ss.android.ugc.aweme.commercialize.p2566g.C38005c;
import com.p2082ss.android.ugc.aweme.commercialize.profile.api.C38395d;
import com.p2082ss.android.ugc.aweme.commercialize.profile.api.C38396e;
import com.p2082ss.android.ugc.aweme.commercialize.uikit.p2617a.C38545a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.feed.model.CallToActionBarInfo;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.profile.impl.c */
public final class C38434c extends View$OnClickListenerC38428a {

    /* renamed from: e */
    public final LinearLayout f90793e;

    /* renamed from: f */
    private final AbstractC89244h f90794f = C89250i.m154773a((AbstractC89171a) new C38436b(this));

    /* renamed from: g */
    private final AbstractC89244h f90795g = C89250i.m154773a((AbstractC89171a) new C38435a(this));

    static {
        Covode.recordClassIndex(45942);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.impl.c$a */
    static final class C38435a extends AbstractC89220m implements AbstractC89171a<AvatarImageView> {

        /* renamed from: a */
        final /* synthetic */ C38434c f90796a;

        static {
            Covode.recordClassIndex(45943);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38435a(C38434c cVar) {
            super(0);
            this.f90796a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AvatarImageView invoke() {
            return this.f90796a.f90793e.findViewById(R.id.d7);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.impl.c$b */
    static final class C38436b extends AbstractC89220m implements AbstractC89171a<TextView> {

        /* renamed from: a */
        final /* synthetic */ C38434c f90797a;

        static {
            Covode.recordClassIndex(45944);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38436b(C38434c cVar) {
            super(0);
            this.f90797a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TextView invoke() {
            return this.f90797a.f90793e.findViewById(R.id.f7y);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C38434c(LinearLayout linearLayout) {
        super(linearLayout);
        C89219l.m154721d(linearLayout, "");
        this.f90793e = linearLayout;
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.profile.api.AbstractC38392a, com.p2082ss.android.ugc.aweme.commercialize.profile.impl.View$OnClickListenerC38428a
    /* renamed from: a */
    public final void mo66984a(int i) {
        ViewGroup.LayoutParams layoutParams = this.f90793e.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        int i2 = ((RelativeLayout.LayoutParams) layoutParams).bottomMargin;
        if (i2 >= 0) {
            LinearLayout linearLayout = this.f90793e;
            ValueAnimator a = C38545a.m78160a(linearLayout, i2, (linearLayout.getMeasuredHeight() + 61) * -1, i);
            C89219l.m154716b(a, "");
            a.start();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.profile.impl.View$OnClickListenerC38428a
    public final void onClick(View view) {
        Integer valueOf;
        C38395d dVar;
        if (view != null && (valueOf = Integer.valueOf(view.getId())) != null) {
            if (valueOf.intValue() == R.id.dh) {
                C38395d dVar2 = this.f90787c;
                if (dVar2 != null) {
                    dVar2.mo66987a();
                }
                mo66984a(300);
            } else if (valueOf.intValue() == R.id.dj && (dVar = this.f90787c) != null) {
                dVar.mo66988b();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.profile.api.AbstractC38392a, com.p2082ss.android.ugc.aweme.commercialize.profile.impl.View$OnClickListenerC38428a
    /* renamed from: a */
    public final void mo66986a(boolean z) {
        ViewGroup.LayoutParams layoutParams = this.f90793e.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        int i = ((RelativeLayout.LayoutParams) layoutParams).bottomMargin;
        if (i < 0) {
            ValueAnimator a = C38545a.m78160a(this.f90793e, i, 60, 300);
            C89219l.m154716b(a, "");
            a.start();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.profile.api.AbstractC38392a, com.p2082ss.android.ugc.aweme.commercialize.profile.impl.View$OnClickListenerC38428a
    /* renamed from: a */
    public final void mo66985a(C38396e eVar) {
        String str;
        String str2;
        Drawable drawable;
        UrlModel urlModel;
        C24636b[] a;
        User author;
        Resources resources;
        AwemeRawAd awemeRawAd;
        CallToActionBarInfo callToActionBarInfo;
        AwemeRawAd awemeRawAd2;
        CallToActionBarInfo callToActionBarInfo2;
        C89219l.m154721d(eVar, "");
        super.mo66985a(eVar);
        TextView textView = (TextView) this.f90794f.getValue();
        C89219l.m154716b(textView, "");
        Aweme aweme = this.f90786b;
        if (aweme == null || (awemeRawAd2 = aweme.getAwemeRawAd()) == null || (callToActionBarInfo2 = awemeRawAd2.getCallToActionBarInfo()) == null) {
            str = null;
        } else {
            str = callToActionBarInfo2.getText();
        }
        textView.setText(str);
        TextView b = mo67011b();
        Aweme aweme2 = this.f90786b;
        if (aweme2 == null || (awemeRawAd = aweme2.getAwemeRawAd()) == null || (callToActionBarInfo = awemeRawAd.getCallToActionBarInfo()) == null) {
            str2 = null;
        } else {
            str2 = callToActionBarInfo.getButtonText();
        }
        b.setText(str2);
        TextView b2 = mo67011b();
        Context context = this.f90785a;
        if (context == null || (resources = context.getResources()) == null) {
            drawable = null;
        } else {
            drawable = resources.getDrawable(R.drawable.b5r);
        }
        b2.setBackground(drawable);
        AvatarImageView avatarImageView = (AvatarImageView) this.f90795g.getValue();
        Aweme aweme3 = this.f90786b;
        if (aweme3 == null || (author = aweme3.getAuthor()) == null) {
            urlModel = null;
        } else {
            urlModel = author.getAvatarThumb();
        }
        if (avatarImageView != null && urlModel != null && avatarImageView.getContext() != null && (a = C34577e.m70607a(urlModel, (C24363d) null, (AbstractC24641d) null)) != null && a.length > 0) {
            avatarImageView.getContext();
            AbstractC24203d<AbstractC24457f> a2 = C34577e.m70586a((AbstractC24203d<AbstractC24457f>) null);
            C24185e b3 = C24182c.m45843b();
            b3.f57309m = avatarImageView.getController();
            AbstractC24198b a3 = b3.mo39823a(a);
            a3.f57303g = new C38005c(a2, null);
            avatarImageView.setController(a3.mo39827e());
        }
    }
}
