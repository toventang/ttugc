package com.p2082ss.android.ugc.aweme.commercialize.link;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.EnumC31359ab;
import com.p2082ss.android.ugc.aweme.app.C33594aj;
import com.p2082ss.android.ugc.aweme.app.C33842s;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38214ac;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38681bh;
import com.p2082ss.android.ugc.aweme.feed.model.AnchorInfo;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.p2406bu.p2408b.C34944a;
import com.p2082ss.android.ugc.aweme.prop.impl.PropReuseServiceImpl;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.link.b */
public final class C38038b {

    /* renamed from: a */
    public static List<String> f89886a = C89070n.m154524c("dou+", "company_link", "iron_man", "shopping_cart", "open_platform", "movie", "sticker");

    /* renamed from: b */
    public static final C38038b f89887b = new C38038b();

    private C38038b() {
    }

    static {
        Covode.recordClassIndex(45500);
    }

    /* renamed from: b */
    private static boolean m77117b(Aweme aweme, boolean z) {
        Integer valueOf;
        C38214ac a = C38681bh.m78486a(aweme);
        if (a == null || (valueOf = Integer.valueOf(a.getLinkType())) == null || valueOf.intValue() != 0) {
            return false;
        }
        if (z) {
            return a.showOnComment();
        }
        return a.showOnFeed();
    }

    /* renamed from: a */
    static final String m77114a(Aweme aweme, boolean z) {
        boolean z2;
        if (aweme == null) {
            return null;
        }
        for (String str : f89886a) {
            switch (str.hashCode()) {
                case -1890252483:
                    if (str.equals("sticker")) {
                        z2 = PropReuseServiceImpl.m116994c().mo104485a(aweme);
                        break;
                    } else {
                        continue;
                    }
                case -1648893033:
                    if (str.equals("shopping_cart") && z && aweme.getPromotion() != null) {
                        C33842s sVar = C33842s.C33843a.f80132a;
                        C89219l.m154716b(sVar, "");
                        C33594aj<Boolean> p = sVar.mo60072p();
                        C89219l.m154716b(p, "");
                        Boolean c = p.mo59941c();
                        C89219l.m154716b(c, "");
                        if (c.booleanValue()) {
                            return str;
                        }
                    }
                case -309942941:
                    if (str.equals("iron_man") && aweme.getMicroAppInfo() != null) {
                        return str;
                    }
                case -210508088:
                    if (str.equals("open_platform") && !z) {
                        AnchorInfo anchorInfo = aweme.getAnchorInfo();
                        Integer type = anchorInfo != null ? anchorInfo.getType() : null;
                        int type2 = EnumC31359ab.OPEN_PLATFORM_ANCHOR.getTYPE();
                        if (type != null && type.intValue() == type2) {
                            return str;
                        }
                    }
                case 3089441:
                    if (str.equals("dou+")) {
                        z2 = C37699a.m76301i(aweme);
                        break;
                    } else {
                        continue;
                    }
                case 104087344:
                    if (str.equals("movie")) {
                        z2 = C34944a.C34945a.m71334a(aweme);
                        break;
                    } else {
                        continue;
                    }
                case 1429828220:
                    if (str.equals("company_link")) {
                        z2 = m77117b(aweme, z);
                        break;
                    } else {
                        continue;
                    }
            }
            if (z2) {
                return str;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static boolean m77116a(String str, Aweme aweme, boolean z) {
        return TextUtils.equals(str, m77114a(aweme, z));
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m77115a(Aweme aweme, boolean z, int i) {
        if ((i & 1) != 0) {
            aweme = null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return m77116a("iron_man", aweme, z);
    }
}
