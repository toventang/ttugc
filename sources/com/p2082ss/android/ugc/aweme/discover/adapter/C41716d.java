package com.p2082ss.android.ugc.aweme.discover.adapter;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.C1764a;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.uikit.p1284f.AbstractC18272a;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.base.C34735v;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.commercialize.p2534ad.C37591b;
import com.p2082ss.android.ugc.aweme.discover.model.Banner;
import com.p2082ss.android.ugc.aweme.discover.tooltip.AbstractC42533a;
import com.p2082ss.android.ugc.aweme.miniapp_api.C59308d;
import com.p2082ss.android.ugc.aweme.miniapp_api.services.C59320c;
import com.p2082ss.android.ugc.aweme.notification.p3528g.C62023a;
import com.p2082ss.android.ugc.aweme.p4173ug.C79631g;
import com.p2082ss.android.ugc.aweme.utils.C80397em;
import com.p2082ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.d */
public final class C41716d extends AbstractC18272a implements AbstractC42533a {

    /* renamed from: d */
    List<? extends Banner> f97322d = C89086z.INSTANCE;

    /* renamed from: e */
    public final AbstractC42533a f97323e;

    static {
        Covode.recordClassIndex(49629);
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.tooltip.AbstractC42533a
    public final void bd_() {
        this.f97323e.bd_();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.f97322d.size();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41716d(AbstractC42533a aVar, Context context, LayoutInflater layoutInflater) {
        super(context, layoutInflater);
        C89219l.m154721d(aVar, "");
        this.f97323e = aVar;
    }

    @Override // com.bytedance.ies.uikit.p1284f.AbstractC18272a
    /* renamed from: a */
    public final View mo29160a(int i, View view, ViewGroup viewGroup) {
        C41717e eVar;
        C89219l.m154721d(viewGroup, "");
        if (view == null) {
            view = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.xr, viewGroup, false);
            C89219l.m154716b(view, "");
            eVar = new C41717e(this, view);
            view.setTag(eVar);
        } else {
            Object tag = view.getTag();
            Objects.requireNonNull(tag, "null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.adapter.BannerViewHolder");
            eVar = (C41717e) tag;
        }
        if (getCount() > 0) {
            Banner banner = (Banner) this.f97322d.get(i);
            if (!(banner == null || banner == eVar.f97326b)) {
                eVar.f97326b = banner;
                Banner banner2 = eVar.f97326b;
                if (banner2 == null) {
                    C89219l.m154715b();
                }
                String schema = banner2.getSchema();
                if (!TextUtils.isEmpty(schema) && (C59308d.m109008c(schema) || !C79631g.m138444a())) {
                    C59320c cVar = C59320c.C59324a.f135560a;
                    C89219l.m154716b(cVar, "");
                    cVar.mo96989a().preloadMiniApp(schema);
                }
                eVar.f97327c = i;
                Banner banner3 = eVar.f97326b;
                if (banner3 == null) {
                    C89219l.m154715b();
                }
                if (banner3.getBannerUrl() != null) {
                    Banner banner4 = eVar.f97326b;
                    if (banner4 == null) {
                        C89219l.m154715b();
                    }
                    UrlModel bannerUrl = banner4.getBannerUrl();
                    C89219l.m154716b(bannerUrl, "");
                    if (!C13603b.m24435a((Collection) bannerUrl.getUrlList())) {
                        int[] a = C80397em.m139369a(600);
                        Banner banner5 = eVar.f97326b;
                        if (banner5 == null) {
                            C89219l.m154715b();
                        }
                        C20766v a2 = C20761r.m39060a(C34735v.m70965a(banner5.getBannerUrl())).mo34185b(C80397em.m139369a(600)).mo34180a(a);
                        a2.f49106c = true;
                        C20766v a3 = a2.mo34179a("BannerViewHolder");
                        a3.f49092E = eVar.f97325a;
                        a3.mo34186c();
                    }
                }
                float a4 = (float) C34728n.m70946a(4.0d);
                View view2 = eVar.itemView;
                C89219l.m154716b(view2, "");
                Context context = view2.getContext();
                C89219l.m154716b(context, "");
                C37591b bVar = new C37591b(a4, context.getResources().getColor(R.color.aw));
                bVar.setAlpha(76);
                View findViewById = eVar.itemView.findViewById(R.id.aa3);
                C89219l.m154716b(findViewById, "");
                TuxTextView tuxTextView = (TuxTextView) findViewById;
                if (tuxTextView != null) {
                    tuxTextView.setBackgroundDrawable(bVar);
                    Banner banner6 = eVar.f97326b;
                    if (banner6 == null) {
                        C89219l.m154715b();
                    }
                    if (banner6.getAdData() != null) {
                        Banner banner7 = eVar.f97326b;
                        if (banner7 == null) {
                            C89219l.m154715b();
                        }
                        Banner.BannerAdData adData = banner7.getAdData();
                        C89219l.m154716b(adData, "");
                        if (adData.getAdLabel() != null) {
                            Banner banner8 = eVar.f97326b;
                            if (banner8 == null) {
                                C89219l.m154715b();
                            }
                            Banner.BannerAdData adData2 = banner8.getAdData();
                            C89219l.m154716b(adData2, "");
                            tuxTextView.setText(adData2.getAdLabel().text);
                            tuxTextView.setVisibility(0);
                        }
                    }
                    tuxTextView.setVisibility(8);
                }
            }
            if (eVar.f97325a != null) {
                if (Build.VERSION.SDK_INT >= 23) {
                    SmartImageView smartImageView = eVar.f97325a;
                    if (smartImageView == null) {
                        C89219l.m154715b();
                    }
                    smartImageView.setForeground(viewGroup.getContext().getDrawable(R.drawable.a5d));
                } else {
                    C62023a.m112168a(eVar.f97325a);
                }
            }
        }
        return view;
    }
}
