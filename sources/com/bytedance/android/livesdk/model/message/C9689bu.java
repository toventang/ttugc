package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.message.p577a.EnumC9596a;
import com.bytedance.android.livesdk.p430ab.p432b.AbstractC6571a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.pickview.p1392b.C19386b;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.bytedance.android.livesdk.model.message.bu */
public class C9689bu extends AbstractC6571a {
    @AbstractC27891c(mo46611a = "content")

    /* renamed from: a */
    public String f23588a;
    @AbstractC27891c(mo46611a = C19386b.f45894a)

    /* renamed from: f */
    public String f23589f;
    @AbstractC27891c(mo46611a = "traceid")

    /* renamed from: g */
    public String f23590g;
    @AbstractC27891c(mo46611a = "icon")

    /* renamed from: h */
    public ImageModel f23591h;
    @AbstractC27891c(mo46611a = "action_content")

    /* renamed from: i */
    public String f23592i;
    @AbstractC27891c(mo46611a = "action_type")

    /* renamed from: j */
    public String f23593j;
    @AbstractC27891c(mo46611a = "push_message_display_time")

    /* renamed from: k */
    public long f23594k;

    /* renamed from: l */
    public ImageModel f23595l;

    /* renamed from: m */
    public transient ImageModel f23596m;

    /* renamed from: n */
    public transient CharSequence f23597n;

    /* renamed from: o */
    public transient int f23598o;

    static {
        Covode.recordClassIndex(11231);
    }

    @Override // com.bytedance.android.livesdkapi.p692h.C11777a
    /* renamed from: b */
    public final boolean mo15100b() {
        return true;
    }

    public C9689bu() {
        this.f28131L = EnumC9596a.ROOM_RICH_CHAT_MESSAGE;
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
