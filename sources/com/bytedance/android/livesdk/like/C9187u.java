package com.bytedance.android.livesdk.like;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.Collections;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.like.u */
public final class C9187u {
    @AbstractC27891c(mo46611a = "icons")

    /* renamed from: a */
    private List<ImageModel> f22363a;
    @AbstractC27891c(mo46611a = "icons_self")

    /* renamed from: b */
    private List<ImageModel> f22364b;

    static {
        Covode.recordClassIndex(10094);
    }

    /* renamed from: a */
    public final List<ImageModel> mo15306a() {
        List<ImageModel> list = this.f22363a;
        if (list == null) {
            return Collections.emptyList();
        }
        return Collections.unmodifiableList(list);
    }

    /* renamed from: b */
    public final List<ImageModel> mo15307b() {
        List<ImageModel> list = this.f22364b;
        if (list == null) {
            return Collections.emptyList();
        }
        return Collections.unmodifiableList(list);
    }
}
