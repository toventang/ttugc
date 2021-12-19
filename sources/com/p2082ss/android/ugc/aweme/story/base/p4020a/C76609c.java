package com.p2082ss.android.ugc.aweme.story.base.p4020a;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.story.base.a.c */
public final class C76609c {
    @AbstractC27891c(mo46611a = "edit_toolbar_text_auto_fade_time")

    /* renamed from: a */
    public final int f171940a;
    @AbstractC27891c(mo46611a = "edit_toolbar_text_display_frequency")

    /* renamed from: b */
    public final int f171941b;

    static {
        Covode.recordClassIndex(89595);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C76609c)) {
            return false;
        }
        C76609c cVar = (C76609c) obj;
        return this.f171940a == cVar.f171940a && this.f171941b == cVar.f171941b;
    }

    public final int hashCode() {
        return (this.f171940a * 31) + this.f171941b;
    }

    public final String toString() {
        return "StoryCreationConfigure(editToolbarTextAutoFadeTime=" + this.f171940a + ", editToolbarTextDisplayFrequency=" + this.f171941b + ")";
    }

    private C76609c() {
        this.f171940a = 4000;
        this.f171941b = 0;
    }

    public /* synthetic */ C76609c(byte b) {
        this();
    }
}
