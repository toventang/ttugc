package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.viewholder;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.ImageSpan;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.AutoRTLImageView;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.lighten.p1477a.EnumC20760q;
import com.bytedance.lighten.p1477a.p1478a.C20714a;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.Image;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.p2829a.C43732h;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.p2830b.C43741b;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.view.compat.C44998a;
import com.p2082ss.android.ugc.aweme.ecommerce.track.C45544c;
import com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp;
import com.p2082ss.android.ugc.aweme.utils.C80537hk;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.viewholder.AnnouncementVH */
public final class AnnouncementVH extends JediSimpleViewHolder<C43741b> implements AbstractC33974au {

    /* renamed from: f */
    public final View f102343f;

    static {
        Covode.recordClassIndex(52186);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void cc_() {
        super.cc_();
        C44998a.C44999a.m87685a(this.f102343f, false);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnnouncementVH(View view) {
        super(view);
        C89219l.m154721d(view, "");
        this.f102343f = view;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.viewholder.AnnouncementVH$a */
    public static final class C43903a extends AbstractView$OnClickListenerC80259bp {

        /* renamed from: a */
        final /* synthetic */ long f102344a = 700;

        /* renamed from: b */
        final /* synthetic */ View f102345b;

        /* renamed from: c */
        final /* synthetic */ C43741b f102346c;

        static {
            Covode.recordClassIndex(52187);
        }

        @Override // com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp
        /* renamed from: a */
        public final void mo60873a(View view) {
            if (view != null) {
                Uri.Builder buildUpon = Uri.parse(this.f102346c.f101968d).buildUpon();
                buildUpon.appendQueryParameter("source", "order_submit");
                SmartRouter.buildRoute(this.f102345b.getContext(), buildUpon.toString()).open();
                String str = this.f102346c.f101965a;
                if (str == null) {
                    str = "";
                }
                C89219l.m154721d(str, "");
                C89219l.m154721d("open", "");
                C45544c.m88081a("tiktokec_banner_click", new C43732h.C43734b(str, "open"));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43903a(View view, C43741b bVar) {
            super(700);
            this.f102345b = view;
            this.f102346c = bVar;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    /* renamed from: a */
    public final /* synthetic */ void mo33817a(C43741b bVar) {
        String str;
        Spanned fromHtml;
        List<String> urls;
        List<String> urls2;
        C20714a imageUrlModel;
        C43741b bVar2 = bVar;
        String str2 = "";
        C89219l.m154721d(bVar2, str2);
        View view = this.f102343f;
        if (C80537hk.m139613a(bVar2.f101968d)) {
            FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.k1);
            C89219l.m154716b(frameLayout, str2);
            frameLayout.setOnClickListener(new C43903a(view, bVar2));
            AutoRTLImageView autoRTLImageView = (AutoRTLImageView) view.findViewById(R.id.l2);
            C89219l.m154716b(autoRTLImageView, str2);
            autoRTLImageView.setVisibility(0);
        } else {
            AutoRTLImageView autoRTLImageView2 = (AutoRTLImageView) view.findViewById(R.id.l2);
            C89219l.m154716b(autoRTLImageView2, str2);
            autoRTLImageView2.setVisibility(8);
            ((FrameLayout) view.findViewById(R.id.k1)).setOnClickListener(null);
        }
        SmartImageView smartImageView = (SmartImageView) view.findViewById(R.id.k0);
        C89219l.m154716b(smartImageView, str2);
        smartImageView.setVisibility(8);
        Image image = bVar2.f101969e;
        if (!(image == null || (imageUrlModel = image.toImageUrlModel()) == null)) {
            SmartImageView smartImageView2 = (SmartImageView) view.findViewById(R.id.k0);
            C89219l.m154716b(smartImageView2, str2);
            smartImageView2.setVisibility(0);
            C20766v a = C20761r.m39058a(imageUrlModel);
            a.f49088A = EnumC20760q.MEDIUM;
            a.f49092E = (SmartImageView) view.findViewById(R.id.k0);
            a.mo34186c();
        }
        Image image2 = bVar2.f101967c;
        if (image2 == null || (urls = image2.getUrls()) == null || urls.size() <= 0) {
            str = bVar2.f101966b;
        } else {
            StringBuilder sb = new StringBuilder("<img src='");
            Image image3 = bVar2.f101967c;
            str = sb.append((image3 == null || (urls2 = image3.getUrls()) == null) ? null : urls2.get(0)).append("'/> ").append(bVar2.f101966b).toString();
        }
        if (Build.VERSION.SDK_INT >= 24) {
            Context context = view.getContext();
            C89219l.m154716b(context, str2);
            TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.k2);
            C89219l.m154716b(tuxTextView, str2);
            fromHtml = Html.fromHtml(str, 0, new C43936b(context, tuxTextView), null);
        } else {
            Context context2 = view.getContext();
            C89219l.m154716b(context2, str2);
            TuxTextView tuxTextView2 = (TuxTextView) view.findViewById(R.id.k2);
            C89219l.m154716b(tuxTextView2, str2);
            fromHtml = Html.fromHtml(str, new C43936b(context2, tuxTextView2), null);
        }
        if (fromHtml instanceof SpannableStringBuilder) {
            ImageSpan[] imageSpanArr = (ImageSpan[]) fromHtml.getSpans(0, fromHtml.length(), ImageSpan.class);
            for (ImageSpan imageSpan : imageSpanArr) {
                int spanStart = fromHtml.getSpanStart(imageSpan);
                int spanEnd = fromHtml.getSpanEnd(imageSpan);
                C89219l.m154716b(imageSpan, str2);
                Drawable drawable = imageSpan.getDrawable();
                C89219l.m154716b(drawable, str2);
                SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) fromHtml;
                spannableStringBuilder.setSpan(new C43935a(drawable), spanStart, spanEnd, 34);
                spannableStringBuilder.removeSpan(imageSpan);
            }
        }
        TuxTextView tuxTextView3 = (TuxTextView) view.findViewById(R.id.k2);
        C89219l.m154716b(tuxTextView3, str2);
        tuxTextView3.setText(fromHtml);
        String str3 = bVar2.f101965a;
        if (str3 != null) {
            str2 = str3;
        }
        C43732h.m86739c(str2);
    }
}
