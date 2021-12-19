package com.p2082ss.android.ugc.aweme.sticker.types.p3999a;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63261s;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.shortvideo.C70005cr;
import com.p2082ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.p2082ss.android.ugc.aweme.sticker.model.FaceStickerCommerceBean;
import com.p2082ss.android.ugc.aweme.sticker.p3970p.C75464f;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3979b.AbstractC75616b;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.tools.p4340c.C84402a;
import com.p2082ss.android.ugc.tools.view.style.C84980f;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.types.a.d */
public final class C75908d {

    /* renamed from: c */
    public static final C75909a f170492c = new C75909a((byte) 0);

    /* renamed from: a */
    public TextView f170493a;

    /* renamed from: b */
    public final AbstractC75616b f170494b;

    /* renamed from: d */
    private SimpleDraweeView f170495d;

    /* renamed from: e */
    private final LinearLayout f170496e;

    /* renamed from: f */
    private final String f170497f;

    static {
        Covode.recordClassIndex(88848);
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.a.d$a */
    public static final class C75909a {
        static {
            Covode.recordClassIndex(88849);
        }

        private C75909a() {
        }

        public /* synthetic */ C75909a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.a.d$b */
    static final class View$OnClickListenerC75910b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C75908d f170498a;

        /* renamed from: b */
        final /* synthetic */ FaceStickerBean f170499b;

        static {
            Covode.recordClassIndex(88850);
        }

        View$OnClickListenerC75910b(C75908d dVar, FaceStickerBean faceStickerBean) {
            this.f170498a = dVar;
            this.f170499b = faceStickerBean;
        }

        public final void onClick(View view) {
            Context context;
            String str;
            Context context2;
            String str2;
            ClickAgent.onClick(view);
            C70005cr a = C70005cr.m123611a();
            String str3 = "";
            C89219l.m154716b(a, str3);
            a.f156490i = false;
            C70005cr a2 = C70005cr.m123611a();
            C89219l.m154716b(a2, str3);
            a2.f156491j = true;
            this.f170498a.f170494b.mo118961b(String.valueOf(this.f170499b.getStickerId()), "prop_panel");
            AbstractC63261s z = C63244g.m114602a().mo73298z();
            TextView textView = this.f170498a.f170493a;
            if (textView != null) {
                context = textView.getContext();
            } else {
                context = null;
            }
            FaceStickerCommerceBean faceStickerCommerceBean = this.f170499b.getFaceStickerCommerceBean();
            if (faceStickerCommerceBean != null) {
                str = faceStickerCommerceBean.f169519b;
            } else {
                str = null;
            }
            if (!z.mo93822a(context, str)) {
                AbstractC63261s z2 = C63244g.m114602a().mo73298z();
                TextView textView2 = this.f170498a.f170493a;
                if (textView2 != null) {
                    context2 = textView2.getContext();
                } else {
                    context2 = null;
                }
                FaceStickerCommerceBean faceStickerCommerceBean2 = this.f170499b.getFaceStickerCommerceBean();
                if (faceStickerCommerceBean2 != null) {
                    str2 = faceStickerCommerceBean2.f169518a;
                } else {
                    str2 = null;
                }
                String valueOf = String.valueOf(this.f170499b.getStickerId());
                if (!TextUtils.isEmpty(str2)) {
                    Uri.Builder appendQueryParameter = Uri.parse(str2).buildUpon().appendQueryParameter("enter_from", "commerce_sticker_button");
                    if (!TextUtils.isEmpty(valueOf)) {
                        str3 = valueOf;
                    }
                    str2 = appendQueryParameter.appendQueryParameter("sticker_id", str3).build().toString();
                }
                z2.mo93823a(context2, str2, null);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo119569a(Effect effect) {
        FaceStickerCommerceBean faceStickerCommerceBean;
        String str;
        FaceStickerBean a = C75464f.m132334a(effect, "");
        C89219l.m154716b(a, "");
        if (effect == null || !effect.isBusiness() || (faceStickerCommerceBean = a.getFaceStickerCommerceBean()) == null || 1 != faceStickerCommerceBean.f169521d) {
            this.f170496e.setVisibility(8);
            return false;
        }
        this.f170494b.mo118960a(String.valueOf(a.getStickerId()), "prop_panel");
        this.f170496e.setVisibility(0);
        SimpleDraweeView simpleDraweeView = this.f170495d;
        UrlModel iconUrl = a.getIconUrl();
        C89219l.m154716b(iconUrl, "");
        C84402a.m145174a(simpleDraweeView, iconUrl.getUrlList().get(0), -1, -1);
        TextView textView = this.f170493a;
        if (textView != null) {
            FaceStickerCommerceBean faceStickerCommerceBean2 = a.getFaceStickerCommerceBean();
            if (faceStickerCommerceBean2 != null) {
                str = faceStickerCommerceBean2.f169520c;
            } else {
                str = null;
            }
            textView.setText(str);
        }
        TextView textView2 = this.f170493a;
        if (textView2 != null) {
            String str2 = this.f170497f;
            C89219l.m154721d(textView2, "");
            C89219l.m154721d(str2, "");
            Typeface a2 = C84980f.m146052a(str2);
            if (a2 != null) {
                textView2.setTypeface(a2);
            }
        }
        this.f170496e.setOnClickListener(new View$OnClickListenerC75910b(this, a));
        return true;
    }

    public C75908d(LinearLayout linearLayout, AbstractC75616b bVar, String str) {
        C89219l.m154721d(linearLayout, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(str, "");
        this.f170496e = linearLayout;
        this.f170494b = bVar;
        this.f170497f = str;
        this.f170495d = (SimpleDraweeView) linearLayout.findViewById(R.id.aaz);
        this.f170493a = (TextView) linearLayout.findViewById(R.id.ab1);
    }
}
