package com.bytedance.android.widget;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.bytedance.covode.number.Covode;
import java.util.Set;
import p4600h.p4601a.C89047am;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.widget.h */
public final class C12254h {

    /* renamed from: a */
    private static final Set<String> f29532a = C89047am.m154438a((Object[]) new String[]{"GiftWidget", "LiveNewVideoGiftWidget", "LiveNewSpecialGiftWidget", "NormalGiftAnimWidget", "LiveNewGiftBottomWidget", "LiveNewGiftGuestInfoWidget", "LiveNewGiftPageIndicatorWidget", "LiveNewGiftPanelWidget", "LiveGiftBottomWidget", "LiveGiftPanelWidget", "LiveGiftGuestInfoWidget", "LiveFirstRechargeWidget", "LiveGiftTrayWidget", "SocialAnchorWidget", "SocialGuestWidget", "FrameSlotWidget", "FrameL2SlotWidget", "FrameL3SlotWidget", "LiveMaskLayerWidget", "OnlineAudienceRankWidget", "HourlyRankWidget", "RankEntranceWidget", "SurveyCardWidget"});

    static {
        Covode.recordClassIndex(13989);
    }

    /* renamed from: a */
    public static final boolean m22031a(Widget widget) {
        C89219l.m154719c(widget, "");
        return m22032a((Class<? extends Widget>) widget.getClass());
    }

    /* renamed from: a */
    public static final boolean m22030a(Context context) {
        C89219l.m154719c(context, "");
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo == null || (applicationInfo.flags & 2) == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static final boolean m22032a(Class<? extends Widget> cls) {
        C89219l.m154719c(cls, "");
        return f29532a.contains(cls.getSimpleName());
    }
}
