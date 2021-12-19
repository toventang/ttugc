package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3080b.p3082b;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.b.b.a */
public final class C53634a {
    @AbstractC27891c(mo46611a = "preload_chat_scroll_count")

    /* renamed from: a */
    public final int f123056a = 3;
    @AbstractC27891c(mo46611a = "preload_max_count_per_conversation")

    /* renamed from: b */
    public final int f123057b = 4;
    @AbstractC27891c(mo46611a = "preload_image_monitor_switch_on")

    /* renamed from: c */
    public final boolean f123058c = false;

    static {
        Covode.recordClassIndex(63214);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C53634a)) {
            return false;
        }
        C53634a aVar = (C53634a) obj;
        return this.f123056a == aVar.f123056a && this.f123057b == aVar.f123057b && this.f123058c == aVar.f123058c;
    }

    public final int hashCode() {
        int i = ((this.f123056a * 31) + this.f123057b) * 31;
        boolean z = this.f123058c;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        return i + i2;
    }

    public final String toString() {
        return "IMPreloadConfig(chatScrollCount=" + this.f123056a + ", maxCountPerConversation=" + this.f123057b + ", preloadImageMonitorSwitchOn=" + this.f123058c + ")";
    }
}
