package com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.feature.topnotice.p3163ui;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.feature.topnotice.ui.b */
public enum EnumC54957b {
    EmptyTopNoticeView("empty_item", 0, 0, 0, "empty"),
    TurnOnNotificationView("dm_turn_on_notification_bar", R.string.w, R.string.v, R.string.u, "dm_push"),
    TurnOnMessagePreview("im_push_preview", R.string.bn9, R.string.bn8, R.string.bn7, "preview_message"),
    PermissionUpdatedNoticeView("permission_updated_notice", R.string.dni, R.string.dnh, 0, "empty");
    

    /* renamed from: b */
    private final String f125802b;

    /* renamed from: c */
    private final int f125803c;

    /* renamed from: d */
    private final int f125804d;

    /* renamed from: e */
    private final int f125805e;

    /* renamed from: f */
    private final String f125806f;

    public final int getButtonText() {
        return this.f125805e;
    }

    public final int getDescription() {
        return this.f125804d;
    }

    public final String getEventPopUpType() {
        return this.f125806f;
    }

    public final String getNoticeCode() {
        return this.f125802b;
    }

    public final int getTitle() {
        return this.f125803c;
    }

    static {
        Covode.recordClassIndex(64681);
    }

    private EnumC54957b(String str, int i, int i2, int i3, String str2) {
        this.f125802b = str;
        this.f125803c = i;
        this.f125804d = i2;
        this.f125805e = i3;
        this.f125806f = str2;
    }
}
