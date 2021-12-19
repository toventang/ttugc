package com.bytedance.android.livesdk.livesetting.feed;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.live.model.C9302a;
import com.bytedance.covode.number.Covode;
import java.util.List;
import p4600h.p4601a.C89086z;

public final class FeedDrawerUrlsSetting {
    @Group(isDefault = true, value = "default group")
    private static final List<C9302a> DEFAULT = C89086z.INSTANCE;
    public static final FeedDrawerUrlsSetting INSTANCE = new FeedDrawerUrlsSetting();

    private FeedDrawerUrlsSetting() {
    }

    public final List<C9302a> getDEFAULT() {
        return DEFAULT;
    }

    public final List<C9302a> getValue() {
        List<C9302a> list = (List) SettingsManager.INSTANCE.getValueSafely(FeedDrawerUrlsSetting.class);
        if (list == null) {
            return DEFAULT;
        }
        return list;
    }

    static {
        Covode.recordClassIndex(10376);
    }
}
