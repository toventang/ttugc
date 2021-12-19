package com.p2082ss.android.ugc.aweme.commercialize.utils;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.commercialize.AdCardServiceImpl;
import com.p2082ss.android.ugc.aweme.commercialize.IAdCardService;
import com.p2082ss.android.ugc.aweme.commercialize.depend.AbstractC37687t;
import com.p2082ss.android.ugc.aweme.commercialize.depend.C37663b;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.feed.model.CardStruct;
import com.p2082ss.android.ugc.aweme.framework.p3009d.C51428b;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p4600h.p4601a.C89047am;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.i */
public final class C38748i {

    /* renamed from: a */
    public static final C38748i f91503a = new C38748i();

    /* renamed from: b */
    private static final Set<Integer> f91504b = C89047am.m154438a((Object[]) new Integer[]{2, 3, 10, 6, 11, 7});

    private C38748i() {
    }

    static {
        Covode.recordClassIndex(46289);
    }

    /* renamed from: c */
    public static final boolean m78598c(Aweme aweme) {
        if (m78595a(aweme) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static final int m78600e(Aweme aweme) {
        CardStruct a = m78595a(aweme);
        if (a != null) {
            return a.getShowDuration();
        }
        return -1;
    }

    /* renamed from: a */
    public static final CardStruct m78595a(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        Map<String, CardStruct> cardInfos;
        if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || (cardInfos = awemeRawAd.getCardInfos()) == null) {
            return null;
        }
        return cardInfos.get("3");
    }

    /* renamed from: b */
    public static final CardStruct m78597b(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        Map<String, CardStruct> cardInfos;
        if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || (cardInfos = awemeRawAd.getCardInfos()) == null) {
            return null;
        }
        return cardInfos.get("5");
    }

    /* renamed from: h */
    public static final boolean m78603h(Aweme aweme) {
        C89219l.m154721d(aweme, "");
        CardStruct i = m78604i(aweme);
        if (i == null) {
            return false;
        }
        if (i.getCardType() == 9 || i.getCardType() == 1001) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    private static CardStruct m78604i(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        Map<String, CardStruct> cardInfos;
        if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || (cardInfos = awemeRawAd.getCardInfos()) == null) {
            return null;
        }
        return cardInfos.get("4");
    }

    /* renamed from: a */
    public static final View m78594a(ViewGroup viewGroup) {
        MethodCollector.m26663i(8361);
        if (viewGroup == null) {
            MethodCollector.m26664o(8361);
            return null;
        }
        View childAt = viewGroup.getChildAt(0);
        if (childAt == null) {
            int i = Build.VERSION.SDK_INT;
            int generateViewId = View.generateViewId();
            childAt = new FrameLayout(viewGroup.getContext());
            ((FrameLayout) childAt).setId(generateViewId);
            viewGroup.addView(childAt, new FrameLayout.LayoutParams(-1, -1));
        }
        MethodCollector.m26664o(8361);
        return childAt;
    }

    /* renamed from: d */
    public static final boolean m78599d(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        String webUrl;
        if (aweme != null) {
            awemeRawAd = aweme.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        if (awemeRawAd == null || awemeRawAd.getAnimationType() != 2 || (webUrl = awemeRawAd.getWebUrl()) == null || webUrl.length() <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public static final void m78602g(Aweme aweme) {
        CardStruct i;
        AwemeRawAd awemeRawAd;
        Map<String, CardStruct> cardInfos;
        if (aweme != null && (i = m78604i(aweme)) != null && i.getCardType() == 1001 && (awemeRawAd = aweme.getAwemeRawAd()) != null && (cardInfos = awemeRawAd.getCardInfos()) != null) {
            cardInfos.remove("4");
        }
    }

    /* renamed from: f */
    public static final boolean m78601f(Aweme aweme) {
        CardStruct f;
        boolean z;
        boolean z2;
        boolean z3;
        C89219l.m154721d(aweme, "");
        AbstractC37687t a = C37663b.f89031b.mo65688a();
        if (a == null || (f = a.mo65672f(aweme)) == null) {
            return false;
        }
        if (f.getCardStyle() == 1) {
            z = true;
        } else {
            z = false;
        }
        boolean contains = f91504b.contains(Integer.valueOf(f.getCardType()));
        if (f.getCardStyle() == 2 && f.getDynamicType() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        IAdCardService c = AdCardServiceImpl.m75807c();
        if (c != null) {
            z3 = c.mo65443a(f);
        } else {
            z3 = false;
        }
        if ((!z || !contains) && !z2 && !z3) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static final int m78593a(CardStruct cardStruct, View view) {
        Integer valueOf;
        C89219l.m154721d(view, "");
        if (!(cardStruct == null || (valueOf = Integer.valueOf(cardStruct.getCardType())) == null)) {
            if (valueOf.intValue() == 1) {
                return C34728n.m70946a(278.0d);
            }
            if (valueOf.intValue() == 9) {
                return C34728n.m70946a(342.0d);
            }
            if (valueOf.intValue() == 8) {
                return C34728n.m70946a(295.0d);
            }
        }
        return view.getHeight();
    }

    /* renamed from: a */
    public static final void m78596a(Context context, Aweme aweme, ViewGroup viewGroup) {
        if (context != null && aweme != null && viewGroup != null) {
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (aweme.isHotSearchAweme() || aweme.isHotVideoAweme() || aweme.isMixAweme()) {
                marginLayoutParams.bottomMargin += C51428b.m95803a(context, 32.0f);
            }
            viewGroup.setLayoutParams(marginLayoutParams);
        }
    }
}
