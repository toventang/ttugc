package com.bytedance.android.livesdk.livesetting.hybrid;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LynxCardConfig {
    @Group(isDefault = true, value = "default")
    private static final C9328a DEFAULT = new C9328a();
    public static final LynxCardConfig INSTANCE = new LynxCardConfig();

    private LynxCardConfig() {
    }

    public final C9328a getDEFAULT() {
        return DEFAULT;
    }

    public final int getItemHeight() {
        return getConfig().f22777g;
    }

    public final int getItemSpacing() {
        return getConfig().f22778h;
    }

    public final int getItemWidth() {
        return getConfig().f22776f;
    }

    public final int getPreviewHeight() {
        return getConfig().f22780j;
    }

    public final int getPreviewStartMargin() {
        return getConfig().f22782l;
    }

    public final int getPreviewTopMargin() {
        return getConfig().f22781k;
    }

    public final int getPreviewWidth() {
        return getConfig().f22779i;
    }

    public final int getWidgetEndMargin() {
        return getConfig().f22775e;
    }

    public final int getWidgetHeight() {
        return getConfig().f22772b;
    }

    public final int getWidgetStartMargin() {
        return getConfig().f22774d;
    }

    public final int getWidgetTopMargin() {
        return getConfig().f22773c;
    }

    public final int getWidgetWidth() {
        return getConfig().f22771a;
    }

    private final C9328a getConfig() {
        C9328a aVar = (C9328a) SettingsManager.INSTANCE.getValueSafely(LynxCardConfig.class);
        if (aVar == null) {
            return DEFAULT;
        }
        return aVar;
    }

    static {
        Covode.recordClassIndex(10462);
    }
}
