package com.bytedance.ies.ugc.aweme.commercialize.search.core;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.aweme.commercialize.search.p1256a.C17928a;
import com.bytedance.ies.ugc.aweme.commercialize.search.service.ISearchAdService;
import com.bytedance.ies.ugc.aweme.commercialize.search.transformbutton.AbstractC17929a;
import com.bytedance.ies.ugc.aweme.commercialize.search.transformbutton.SearchAdTransformButton;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.bytedance.ies.ugc.aweme.rich.p1274ui.RichTagView;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.feed.model.search.AwemeSearchAdModel;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

public final class SearchAdServiceImpl implements ISearchAdService {
    static {
        Covode.recordClassIndex(20539);
    }

    /* renamed from: a */
    public static ISearchAdService m33267a() {
        MethodCollector.m26663i(9534);
        Object a = C81908b.m141854a(ISearchAdService.class, false);
        if (a != null) {
            ISearchAdService iSearchAdService = (ISearchAdService) a;
            MethodCollector.m26664o(9534);
            return iSearchAdService;
        }
        if (C81908b.f183250c == null) {
            synchronized (ISearchAdService.class) {
                try {
                    if (C81908b.f183250c == null) {
                        C81908b.f183250c = new SearchAdServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(9534);
                    throw th;
                }
            }
        }
        SearchAdServiceImpl searchAdServiceImpl = (SearchAdServiceImpl) C81908b.f183250c;
        MethodCollector.m26664o(9534);
        return searchAdServiceImpl;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.service.ISearchAdService
    /* renamed from: b */
    public final void mo28578b(ViewGroup viewGroup) {
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.service.ISearchAdService
    /* renamed from: c */
    public final void mo28579c(ViewGroup viewGroup) {
        if (viewGroup != null) {
            viewGroup.setVisibility(4);
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.service.ISearchAdService
    /* renamed from: e */
    public final void mo28581e(ViewGroup viewGroup) {
        if (viewGroup != null) {
            viewGroup.setVisibility(4);
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.service.ISearchAdService
    /* renamed from: d */
    public final void mo28580d(ViewGroup viewGroup) {
        AbstractC17929a aVar;
        if (viewGroup != null && (aVar = (AbstractC17929a) viewGroup.findViewById(R.id.cy7)) != null) {
            if (aVar.f42745e != null) {
                aVar.removeCallbacks(aVar.f42745e);
            }
            if (aVar.f42745e == null) {
                aVar.f42745e = new AbstractC17929a.RunnableC17930a(aVar);
            }
            aVar.postDelayed(aVar.f42745e, 0);
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.service.ISearchAdService
    /* renamed from: f */
    public final void mo28582f(ViewGroup viewGroup) {
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
            AbstractC17929a aVar = (AbstractC17929a) viewGroup.findViewById(R.id.cy7);
            if (aVar != null) {
                ViewGroup.LayoutParams layoutParams = aVar.getLayoutParams();
                Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.bottomMargin = -200;
                aVar.setLayoutParams(marginLayoutParams);
                aVar.mo28583a(aVar.f42749i, 0);
            }
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.service.ISearchAdService
    /* renamed from: a */
    public final void mo28576a(ViewGroup viewGroup) {
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
            AbstractC17929a aVar = (AbstractC17929a) viewGroup.findViewById(R.id.cy7);
            if (aVar != null) {
                if (aVar.f42744d != null) {
                    aVar.removeCallbacks(aVar.f42744d);
                }
                if (aVar.f42744d == null) {
                    aVar.f42744d = new AbstractC17929a.RunnableC17931b(aVar);
                }
                aVar.postDelayed(aVar.f42744d, 0);
            }
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.service.ISearchAdService
    /* renamed from: a */
    public final ViewGroup mo28574a(ViewGroup viewGroup, Context context, AwemeRawAd awemeRawAd) {
        if (viewGroup == null) {
            return null;
        }
        viewGroup.setVisibility(8);
        if (awemeRawAd != null && (C1764a.m5927a(LayoutInflater.from(context), R.layout.atr, viewGroup, true) instanceof ViewGroup)) {
            return viewGroup;
        }
        return null;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.service.ISearchAdService
    /* renamed from: a */
    public final ViewGroup mo28575a(ViewGroup viewGroup, Context context, AwemeRawAd awemeRawAd, View.OnClickListener onClickListener) {
        AwemeSearchAdModel awemeSearchAdModel;
        TextView textView;
        MethodCollector.m26663i(9531);
        ImageView imageView = null;
        if (viewGroup == null) {
            MethodCollector.m26664o(9531);
            return null;
        }
        viewGroup.setVisibility(8);
        if (awemeRawAd == null) {
            MethodCollector.m26664o(9531);
            return null;
        }
        AwemeSearchAdModel searchAdInfo = awemeRawAd.getSearchAdInfo();
        View a = C1764a.m5927a(LayoutInflater.from(context), R.layout.ats, viewGroup, true);
        if (!(a instanceof ViewGroup)) {
            MethodCollector.m26664o(9531);
            return null;
        }
        viewGroup.setVisibility(0);
        if (searchAdInfo != null) {
            SearchAdTransformButton searchAdTransformButton = (SearchAdTransformButton) a.findViewById(R.id.cy7);
            C17928a.m33266a((RichTagView) a.findViewById(R.id.g3), awemeRawAd);
            C89219l.m154721d(onClickListener, "");
            if (searchAdTransformButton != null) {
                C89219l.m154721d(onClickListener, "");
                searchAdTransformButton.f42746f = awemeRawAd;
                AwemeRawAd awemeRawAd2 = searchAdTransformButton.f42746f;
                if (awemeRawAd2 != null) {
                    awemeSearchAdModel = awemeRawAd2.getSearchAdInfo();
                } else {
                    awemeSearchAdModel = null;
                }
                searchAdTransformButton.f42747g = awemeSearchAdModel;
                if (!searchAdTransformButton.mo28584a()) {
                    searchAdTransformButton.setTransformButtonVisibility$commercialize_search_impl_release(8);
                } else {
                    if (searchAdTransformButton.f42746f != null) {
                        if (!searchAdTransformButton.f42748h) {
                            searchAdTransformButton.f42741a = View.inflate(searchAdTransformButton.getContext(), searchAdTransformButton.getLayoutId$commercialize_search_impl_release(), searchAdTransformButton);
                            View view = searchAdTransformButton.f42741a;
                            if (view != null) {
                                textView = (TextView) view.findViewById(R.id.dr1);
                            } else {
                                textView = null;
                            }
                            searchAdTransformButton.f42742b = textView;
                            View view2 = searchAdTransformButton.f42741a;
                            if (view2 != null) {
                                imageView = (ImageView) view2.findViewById(R.id.dr0);
                            }
                            searchAdTransformButton.f42743c = imageView;
                            searchAdTransformButton.f42748h = true;
                        }
                        searchAdTransformButton.setTransformButtonVisibility$commercialize_search_impl_release(0);
                        TextView textView2 = searchAdTransformButton.f42742b;
                        if (textView2 != null) {
                            textView2.setText(searchAdTransformButton.getTransformButtonText());
                        }
                        searchAdTransformButton.mo28583a(searchAdTransformButton.f42749i, 0);
                        searchAdTransformButton.setAlpha(0.75f);
                    } else {
                        searchAdTransformButton.setTransformButtonVisibility$commercialize_search_impl_release(8);
                    }
                    searchAdTransformButton.setOnClickListener(onClickListener);
                }
            }
        } else {
            C17928a.m33266a((RichTagView) a.findViewById(R.id.g3), awemeRawAd);
        }
        ViewGroup viewGroup2 = (ViewGroup) a;
        MethodCollector.m26664o(9531);
        return viewGroup2;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.service.ISearchAdService
    /* renamed from: a */
    public final void mo28577a(AwemeRawAd awemeRawAd, ViewGroup viewGroup, View.OnClickListener onClickListener, View.OnClickListener onClickListener2) {
        String str;
        AwemeSearchAdModel searchAdInfo;
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
            String str2 = null;
            if (viewGroup != null) {
                View findViewById = viewGroup.findViewById(R.id.dqw);
                if (findViewById != null) {
                    Drawable background = findViewById.getBackground();
                    if (background != null) {
                        background.setAlpha(128);
                    }
                    findViewById.setOnClickListener(onClickListener2);
                }
                if (viewGroup != null) {
                    TuxTextView tuxTextView = (TuxTextView) viewGroup.findViewById(R.id.dqx);
                    TuxTextView tuxTextView2 = (TuxTextView) viewGroup.findViewById(R.id.dqz);
                    if (tuxTextView != null) {
                        if (!(awemeRawAd == null || (searchAdInfo = awemeRawAd.getSearchAdInfo()) == null)) {
                            str2 = searchAdInfo.getSearchAdTransformButtonText();
                        }
                        tuxTextView.setText(str2);
                        tuxTextView.setOnClickListener(onClickListener);
                    }
                    if (tuxTextView2 != null) {
                        tuxTextView2.setOnClickListener(onClickListener2);
                    }
                }
            }
        }
        if (awemeRawAd == null || (str = awemeRawAd.getType()) == null) {
            str = "";
        }
        int hashCode = str.hashCode();
        if (hashCode != 96801) {
            if (hashCode == 117588 && str.equals("web")) {
                C18129a.m33746a("result_ad_bg", "button_show", awemeRawAd).mo28900b("refer", "bg_more_button").mo28901b();
            }
        } else if (str.equals("app")) {
            C18129a.m33746a("result_ad_bg", "button_show", awemeRawAd).mo28900b("refer", "bg_download_button").mo28901b();
        }
    }
}
