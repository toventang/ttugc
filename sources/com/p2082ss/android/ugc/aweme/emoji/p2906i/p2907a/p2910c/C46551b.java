package com.p2082ss.android.ugc.aweme.emoji.p2906i.p2907a.p2910c;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3257g.AbstractC56226b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.emoji.i.a.c.b */
public final class C46551b extends AbstractC56226b {

    /* renamed from: a */
    public final String f108536a;

    static {
        Covode.recordClassIndex(55138);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C46551b) && C89219l.m154714a(this.f108536a, ((C46551b) obj).f108536a);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f108536a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.p3257g.AbstractC56226b
    public final String toString() {
        return "GeckoSmallEmojiLoadEventKey(text=" + this.f108536a + ")";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46551b(String str) {
        super("aweme_im_gecko_small_emoji_load", str);
        C89219l.m154721d(str, "");
        this.f108536a = str;
    }
}
