package com.bytedance.android.livesdk.gifttray.p557d;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftTrayPriceColorSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.covode.number.Covode;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.gifttray.d.c */
public final class C8900c {

    /* renamed from: a */
    public static final C8900c f21943a = new C8900c();

    /* renamed from: a */
    public static final long m17247a(int i) {
        if (i <= 70) {
            return InteractFirstFrameTimeOutDurationSetting.DEFAULT;
        }
        if (71 <= i && 1750 >= i) {
            return 3000;
        }
        if (1751 <= i && 5200 >= i) {
            return 4000;
        }
        if (5201 <= i && 17500 >= i) {
            return 6000;
        }
        if (17500 <= i && 300000 >= i) {
            return 7000;
        }
        if (300000 <= i) {
            return 8000;
        }
        return InteractFirstFrameTimeOutDurationSetting.DEFAULT;
    }

    private C8900c() {
    }

    static {
        Covode.recordClassIndex(9784);
    }

    /* renamed from: a */
    private static Drawable m17248a(List<String> list) {
        C89219l.m154721d(list, "");
        LinkedList linkedList = new LinkedList();
        for (String str : list) {
            linkedList.addLast(Integer.valueOf(Color.parseColor(str)));
        }
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, C89070n.m154578e((Collection<Integer>) linkedList));
        gradientDrawable.setCornerRadius((float) C3966y.m9653a(24.0f));
        return gradientDrawable;
    }

    /* renamed from: b */
    public static final Drawable m17249b(int i) {
        Map<String, List<String>> value = LiveGiftTrayPriceColorSetting.INSTANCE.getValue();
        String str = "1";
        for (String str2 : value.keySet()) {
            if (Integer.parseInt(str2) < i && Integer.parseInt(str2) > Integer.parseInt(str)) {
                str = str2;
            }
        }
        List<String> list = value.get(str);
        if (list == null) {
            list = C89070n.m154522b("#99000000", "#33000000");
        }
        return m17248a(list);
    }
}
