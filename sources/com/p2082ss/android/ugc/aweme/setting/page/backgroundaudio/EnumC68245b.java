package com.p2082ss.android.ugc.aweme.setting.page.backgroundaudio;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.experiment.C49510c;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.setting.page.backgroundaudio.b */
public enum EnumC68245b {
    PLAY_IN_ORDER(R.string.vk, R.raw.icon_list_arrow_down, C49510c.EnumC49511a.PLAY_IN_ORDER),
    REPEAT(R.string.vl, R.raw.icon_repeat_1, C49510c.EnumC49511a.REPEAT);
    

    /* renamed from: b */
    private final int f152781b;

    /* renamed from: c */
    private final int f152782c;

    /* renamed from: d */
    private final C49510c.EnumC49511a f152783d;

    public final int getIcon() {
        return this.f152782c;
    }

    public final C49510c.EnumC49511a getPlayOrder() {
        return this.f152783d;
    }

    public final int getTitle() {
        return this.f152781b;
    }

    static {
        Covode.recordClassIndex(80449);
    }

    private EnumC68245b(int i, int i2, C49510c.EnumC49511a aVar) {
        this.f152781b = i;
        this.f152782c = i2;
        this.f152783d = aVar;
    }
}
