package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1710c.C23008e;
import com.bytedance.tux.p1710c.C23009f;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.BaseContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.ShareChallengeContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.p3136d.C54438a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55215k;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55226r;
import com.p2082ss.android.ugc.trill.R;
import java.util.Arrays;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.y */
public class C54573y extends AbstractC54482a<ShareChallengeContent> {

    /* renamed from: a */
    private TuxIconView f125089a;

    /* renamed from: b */
    private TuxTextView f125090b;

    /* renamed from: x */
    private TuxTextView f125091x;

    /* renamed from: y */
    private TextView f125092y;

    /* renamed from: z */
    private Drawable f125093z;

    static {
        Covode.recordClassIndex(64284);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.AbstractC54482a
    public final void bK_() {
        View view = this.itemView;
        C89219l.m154716b(view, "");
        Context context = view.getContext();
        C89219l.m154716b(context, "");
        C23008e a = C23009f.m43397a(new C54574a((float) context.getResources().getDimensionPixelSize(R.dimen.li)));
        View view2 = this.itemView;
        C89219l.m154716b(view2, "");
        Context context2 = view2.getContext();
        C89219l.m154716b(context2, "");
        this.f125093z = a.mo37389a(context2);
        TuxIconView tuxIconView = this.f125089a;
        if (tuxIconView == null) {
            C89219l.m154710a("iconView");
        }
        Drawable drawable = this.f125093z;
        if (drawable == null) {
            C89219l.m154710a("iconShapeDrawable");
        }
        tuxIconView.setBackground(drawable);
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
        this.f125089a = (TuxIconView) findViewById2;
        View findViewById3 = this.itemView.findViewById(R.id.icon_iv);
        C89219l.m154716b(findViewById3, "");
        ((RemoteImageView) findViewById3).setVisibility(8);
        View findViewById4 = this.itemView.findViewById(R.id.title_tv);
        C89219l.m154716b(findViewById4, "");
        this.f125090b = (TuxTextView) findViewById4;
        View findViewById5 = this.itemView.findViewById(R.id.ajs);
        C89219l.m154716b(findViewById5, "");
        this.f125091x = (TuxTextView) findViewById5;
        View findViewById6 = this.itemView.findViewById(R.id.eez);
        C89219l.m154716b(findViewById6, "");
        this.f125092y = (TextView) findViewById6;
        TuxIconView tuxIconView = this.f125089a;
        if (tuxIconView == null) {
            C89219l.m154710a("iconView");
        }
        Resources system = Resources.getSystem();
        C89219l.m154709a((Object) system, "");
        tuxIconView.setIconHeight(C89241a.m154730a(TypedValue.applyDimension(1, 48.0f, system.getDisplayMetrics())));
        TuxIconView tuxIconView2 = this.f125089a;
        if (tuxIconView2 == null) {
            C89219l.m154710a("iconView");
        }
        Resources system2 = Resources.getSystem();
        C89219l.m154709a((Object) system2, "");
        tuxIconView2.setIconWidth(C89241a.m154730a(TypedValue.applyDimension(1, 48.0f, system2.getDisplayMetrics())));
        TuxIconView tuxIconView3 = this.f125089a;
        if (tuxIconView3 == null) {
            C89219l.m154710a("iconView");
        }
        tuxIconView3.setTintColorRes(R.attr.bj);
        TuxIconView tuxIconView4 = this.f125089a;
        if (tuxIconView4 == null) {
            C89219l.m154710a("iconView");
        }
        tuxIconView4.setVisibility(0);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.y$a */
    static final class C54574a extends AbstractC89220m implements AbstractC89172b<C23008e, C89391z> {

        /* renamed from: a */
        final /* synthetic */ float f125094a;

        static {
            Covode.recordClassIndex(64285);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54574a(float f) {
            super(1);
            this.f125094a = f;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23008e eVar) {
            C23008e eVar2 = eVar;
            C89219l.m154721d(eVar2, "");
            eVar2.f54462a = Integer.valueOf(Color.parseColor("#08202020"));
            if (C55226r.m100992a()) {
                eVar2.f54470i = Float.valueOf(this.f125094a);
                eVar2.f54472k = Float.valueOf(this.f125094a);
            } else {
                eVar2.f54471j = Float.valueOf(this.f125094a);
                eVar2.f54473l = Float.valueOf(this.f125094a);
            }
            return C89391z.f203057a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54573y(View view, EnumC53772b bVar) {
        super(view);
        C89219l.m154721d(view, "");
        C89219l.m154721d(bVar, "");
    }

    /* renamed from: a */
    public void mo91008a(C19538ai aiVar, C19538ai aiVar2, ShareChallengeContent shareChallengeContent, int i) {
        C89219l.m154721d(aiVar, "");
        C89219l.m154721d(shareChallengeContent, "");
        super.mo91008a(aiVar, aiVar2, (BaseContent) shareChallengeContent, i);
        TuxTextView tuxTextView = this.f125090b;
        if (tuxTextView == null) {
            C89219l.m154710a("titleView");
        }
        tuxTextView.setText(shareChallengeContent.getTitle());
        TuxTextView tuxTextView2 = this.f125091x;
        if (tuxTextView2 == null) {
            C89219l.m154710a("descView");
        }
        tuxTextView2.setVisibility(0);
        TuxTextView tuxTextView3 = this.f125091x;
        if (tuxTextView3 == null) {
            C89219l.m154710a("descView");
        }
        View view = this.itemView;
        C89219l.m154716b(view, "");
        Context context = view.getContext();
        C89219l.m154716b(context, "");
        String string = context.getResources().getString(R.string.ccq);
        C89219l.m154716b(string, "");
        String a = C1764a.m5928a(string, Arrays.copyOf(new Object[]{C55215k.m100959a(shareChallengeContent.getUserCount())}, 1));
        C89219l.m154716b(a, "");
        tuxTextView3.setText(a);
        TextView textView = this.f125092y;
        if (textView == null) {
            C89219l.m154710a("tagView");
        }
        textView.setText(R.string.ccp);
        TuxIconView tuxIconView = this.f125089a;
        if (tuxIconView == null) {
            C89219l.m154710a("iconView");
        }
        tuxIconView.setIconRes(R.raw.icon_2pt_number);
        this.f124819o.mo91505a(50331648, 18);
        this.f124819o.mo91505a(67108864, shareChallengeContent.getChallengeId());
        this.f124819o.mo91505a(50331649, Boolean.valueOf(shareChallengeContent.isCommerce()));
    }
}
