package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.message.p577a.EnumC9596a;
import com.bytedance.android.livesdk.p430ab.p432b.AbstractC6571a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.pickview.p1392b.C19386b;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.bytedance.android.livesdk.model.message.bx */
public class C9692bx extends AbstractC6571a {
    @AbstractC27891c(mo46611a = "content")

    /* renamed from: a */
    public String f23610a;
    @AbstractC27891c(mo46611a = C19386b.f45894a)

    /* renamed from: f */
    public String f23611f;
    @AbstractC27891c(mo46611a = "traceid")

    /* renamed from: g */
    public String f23612g;
    @AbstractC27891c(mo46611a = "icon")

    /* renamed from: h */
    public ImageModel f23613h;
    @AbstractC27891c(mo46611a = "action_content")

    /* renamed from: i */
    public String f23614i;
    @AbstractC27891c(mo46611a = "action_type")

    /* renamed from: j */
    public String f23615j = "0";
    @AbstractC27891c(mo46611a = "push_message_display_time")

    /* renamed from: k */
    public long f23616k;
    @AbstractC27891c(mo46611a = "background_image")

    /* renamed from: l */
    public FlexImageModel f23617l;
    @AbstractC27891c(mo46611a = "new_background_image")

    /* renamed from: m */
    public FlexImageModel f23618m;
    @AbstractC27891c(mo46611a = "action_icon")

    /* renamed from: n */
    public ImageModel f23619n;
    @AbstractC27891c(mo46611a = "source")

    /* renamed from: o */
    public String f23620o;

    static {
        Covode.recordClassIndex(11234);
    }

    public C9692bx() {
        this.f28131L = EnumC9596a.ROOM_PUSH;
    }

    @Override // com.bytedance.android.livesdk.p430ab.p432b.AbstractC6571a
    /* renamed from: a */
    public final boolean mo12726a() {
        if (this.f28134O == null || this.f28134O.f28144j == null) {
            return false;
        }
        return true;
    }
}
