package com.p2082ss.android.ugc.aweme.emoji.systembigemoji;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3257g.AbstractC56226b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.emoji.systembigemoji.i */
public final class C46638i extends AbstractC56226b {

    /* renamed from: a */
    public final String f108756a;

    static {
        Covode.recordClassIndex(55229);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C46638i) && C89219l.m154714a(this.f108756a, ((C46638i) obj).f108756a);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f108756a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.p3257g.AbstractC56226b
    public final String toString() {
        return "StickerDownloadEventKey(resourceID=" + this.f108756a + ")";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46638i(String str) {
        super("aweme_im_sticker_download", str);
        C89219l.m154721d(str, "");
        this.f108756a = str;
    }
}
