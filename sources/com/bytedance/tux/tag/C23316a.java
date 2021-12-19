package com.bytedance.tux.tag;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1719f.p1720a.C23135e;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.tux.tag.a */
public final class C23316a extends C23135e<TuxTag> {
    static {
        Covode.recordClassIndex(27269);
    }

    /* renamed from: a */
    public final void mo37993a() {
        ((TuxTag) this.f54756c).setTagSize(2);
    }

    /* renamed from: a */
    public final void mo37994a(int i) {
        ((TuxTag) this.f54756c).setTagTextColor(i);
    }

    /* renamed from: b */
    public final void mo37997b(int i) {
        ((TuxTag) this.f54756c).setIconTintColor(i);
    }

    /* renamed from: c */
    public final void mo37998c(int i) {
        ((TuxTag) this.f54756c).setIconWidth(i);
    }

    /* renamed from: d */
    public final void mo37999d(int i) {
        ((TuxTag) this.f54756c).setIconHeight(i);
    }

    /* renamed from: e */
    public final void mo38000e(int i) {
        ((TuxTag) this.f54756c).setTagBackgroundColor(i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23316a(Context context) {
        super(new TuxTag(context, null, 0, 6));
        C89219l.m154719c(context, "");
    }

    /* renamed from: a */
    public final void mo37995a(Integer num) {
        ((TuxTag) this.f54756c).setTagIcon(num);
    }

    /* renamed from: a */
    public final void mo37996a(String str) {
        C89219l.m154719c(str, "");
        ((TuxTag) this.f54756c).setText(str);
    }
}
