package com.p2082ss.android.ugc.aweme.sticker.panel.p3974c;

import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p2082ss.android.ugc.aweme.sticker.p3970p.C75466g;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3980c.C75618a;
import com.p2082ss.android.ugc.effectmanager.common.model.UrlModel;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.tools.p4340c.C84402a;
import com.p2082ss.android.ugc.tools.view.style.StyleTextView;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.panel.c.g */
public final class C75516g implements AbstractC75517h {

    /* renamed from: a */
    public boolean f169718a;

    /* renamed from: b */
    private LinearLayout f169719b;

    /* renamed from: c */
    private SimpleDraweeView f169720c;

    /* renamed from: d */
    private StyleTextView f169721d;

    /* renamed from: e */
    private SimpleDraweeView f169722e;

    /* renamed from: f */
    private LinearLayout f169723f;

    static {
        Covode.recordClassIndex(88438);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.panel.p3974c.AbstractC75517h
    /* renamed from: a */
    public final EnumC75518i mo119168a() {
        return EnumC75518i.NormalStickerInfoHandlerPriority;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.panel.p3974c.AbstractC75517h
    /* renamed from: b */
    public final void mo119171b() {
        LinearLayout linearLayout = this.f169719b;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
    }

    public C75516g(boolean z) {
        this.f169718a = z;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.panel.p3974c.AbstractC75517h
    /* renamed from: a */
    public final void mo119169a(View view) {
        C89219l.m154721d(view, "");
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.c6v);
        this.f169719b = linearLayout;
        if (this.f169718a) {
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
            }
            this.f169720c = (SimpleDraweeView) view.findViewById(R.id.e90);
            this.f169721d = (StyleTextView) view.findViewById(R.id.e96);
            this.f169722e = (SimpleDraweeView) view.findViewById(R.id.crz);
            this.f169723f = (LinearLayout) view.findViewById(R.id.cry);
        } else if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.panel.p3974c.AbstractC75517h
    /* renamed from: a */
    public final boolean mo119170a(C75618a aVar) {
        String str;
        List<String> urlList;
        C89219l.m154721d(aVar, "");
        Effect effect = aVar.f170022a;
        if (!C75466g.m132352d(effect) || !this.f169718a) {
            mo119171b();
            return false;
        }
        LinearLayout linearLayout = this.f169723f;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        SimpleDraweeView simpleDraweeView = this.f169722e;
        if (simpleDraweeView != null) {
            simpleDraweeView.setVisibility(8);
        }
        SimpleDraweeView simpleDraweeView2 = this.f169720c;
        if (simpleDraweeView2 != null) {
            simpleDraweeView2.setVisibility(0);
        }
        StyleTextView styleTextView = this.f169721d;
        if (styleTextView != null) {
            styleTextView.setVisibility(0);
        }
        LinearLayout linearLayout2 = this.f169719b;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(0);
        }
        SimpleDraweeView simpleDraweeView3 = this.f169720c;
        if (simpleDraweeView3 != null) {
            UrlModel iconUrl = effect.getIconUrl();
            if (iconUrl == null || (urlList = iconUrl.getUrlList()) == null) {
                str = null;
            } else {
                str = (String) C89070n.m154583g((List) urlList);
            }
            C84402a.m145173a(simpleDraweeView3, str);
        }
        StyleTextView styleTextView2 = this.f169721d;
        if (styleTextView2 == null) {
            return true;
        }
        styleTextView2.setText(effect.getName());
        return true;
    }
}
