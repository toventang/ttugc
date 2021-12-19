package com.bytedance.android.livesdk.model;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.message.p579c.C9698b;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.bytedance.android.livesdk.model.v */
public class C9914v {

    /* renamed from: d */
    public static final C9914v f24032d = new C9914v();
    @AbstractC27891c(mo46611a = "left_icon")

    /* renamed from: a */
    public ImageModel f24033a;
    @AbstractC27891c(mo46611a = "display_text")

    /* renamed from: b */
    public C9698b f24034b;
    @AbstractC27891c(mo46611a = "schema_url")

    /* renamed from: c */
    public String f24035c;

    static {
        Covode.recordClassIndex(11462);
    }

    /* renamed from: a */
    public final boolean mo16616a() {
        if (this.f24033a == null || this.f24035c == null) {
            return false;
        }
        return true;
    }
}
