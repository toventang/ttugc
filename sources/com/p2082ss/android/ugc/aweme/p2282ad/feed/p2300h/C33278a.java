package com.p2082ss.android.ugc.aweme.p2282ad.feed.p2300h;

import android.text.TextUtils;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.commerce.model.C37513b;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.feed.model.SpecialSticker;
import java.util.Collection;

/* renamed from: com.ss.android.ugc.aweme.ad.feed.h.a */
public final class C33278a {
    static {
        Covode.recordClassIndex(40104);
    }

    /* renamed from: c */
    public static boolean m68227c(Aweme aweme) {
        SpecialSticker specialSticker;
        if (aweme == null || (specialSticker = aweme.getSpecialSticker()) == null || specialSticker.getStickerType() != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static boolean m68228d(Aweme aweme) {
        if (aweme == null || !aweme.isAd() || aweme.getAwemeRawAd().getPlayFunModel() == null) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m68225a(Aweme aweme) {
        UrlModel redImageUrl;
        if (aweme == null || !aweme.isAd()) {
            return false;
        }
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (TextUtils.equals(awemeRawAd.getType(), "redpacket") && (redImageUrl = awemeRawAd.getRedImageUrl()) != null && !C13603b.m24435a((Collection) redImageUrl.getUrlList())) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m68226b(Aweme aweme) {
        C37513b activityPendant;
        UrlModel image;
        if (!(aweme == null || aweme.getActivityPendant() == null || (image = (activityPendant = aweme.getActivityPendant()).getImage()) == null || C13603b.m24435a((Collection) image.getUrlList()))) {
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            if (currentTimeMillis < activityPendant.getStartTime() || currentTimeMillis > activityPendant.getEndTime()) {
                return false;
            }
            return true;
        }
        return false;
    }
}
