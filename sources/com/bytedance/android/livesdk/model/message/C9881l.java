package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.message.p577a.EnumC9596a;
import com.bytedance.android.livesdk.p430ab.p432b.AbstractC6571a;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.bytedance.android.livesdk.model.message.l */
public class C9881l extends AbstractC6571a {
    @AbstractC27891c(mo46611a = "discardable")

    /* renamed from: a */
    public boolean f23867a;
    @AbstractC27891c(mo46611a = "immediate")

    /* renamed from: f */
    public boolean f23868f;
    @AbstractC27891c(mo46611a = "duration")

    /* renamed from: g */
    public int f23869g;
    @AbstractC27891c(mo46611a = "background_color_start")

    /* renamed from: h */
    public String f23870h = "#ff9d5c";
    @AbstractC27891c(mo46611a = "background_color_end")

    /* renamed from: i */
    public String f23871i = "#ff9d5c";
    @AbstractC27891c(mo46611a = "text_color")

    /* renamed from: j */
    public String f23872j = "#ffffff";
    @AbstractC27891c(mo46611a = "position")

    /* renamed from: k */
    public int f23873k = 1;
    @AbstractC27891c(mo46611a = "top_img")

    /* renamed from: l */
    public ImageModel f23874l;
    @AbstractC27891c(mo46611a = "top_img_width")

    /* renamed from: m */
    public int f23875m;
    @AbstractC27891c(mo46611a = "top_img_height")

    /* renamed from: n */
    public int f23876n;
    @AbstractC27891c(mo46611a = "show_mongolia_layer")

    /* renamed from: o */
    public boolean f23877o;

    static {
        Covode.recordClassIndex(11423);
    }

    public C9881l() {
        this.f28131L = EnumC9596a.COMMON_TOAST;
    }
}
