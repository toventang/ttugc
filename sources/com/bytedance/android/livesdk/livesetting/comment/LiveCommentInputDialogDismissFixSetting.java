package com.bytedance.android.livesdk.livesetting.comment;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveCommentInputDialogDismissFixSetting {
    @Group(isDefault = true, value = "default group")
    private static final C9325a DEFAULT = new C9325a();
    public static final LiveCommentInputDialogDismissFixSetting INSTANCE = new LiveCommentInputDialogDismissFixSetting();

    private LiveCommentInputDialogDismissFixSetting() {
    }

    public static final C9325a getValue() {
        C9325a aVar = (C9325a) SettingsManager.INSTANCE.getValueSafely(LiveCommentInputDialogDismissFixSetting.class);
        if (aVar == null) {
            return DEFAULT;
        }
        return aVar;
    }

    static {
        Covode.recordClassIndex(10359);
    }
}
