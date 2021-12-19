package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.video.data.p3115a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.video.p3116ui.DialogInterface$OnDismissListenerC54209b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.video.data.a.a */
public final class C54200a {

    /* renamed from: a */
    public final Aweme f124169a;

    /* renamed from: b */
    public final DialogInterface$OnDismissListenerC54209b.AbstractC54212c f124170b;

    static {
        Covode.recordClassIndex(63885);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C54200a)) {
            return false;
        }
        C54200a aVar = (C54200a) obj;
        return C89219l.m154714a(this.f124169a, aVar.f124169a) && C89219l.m154714a(this.f124170b, aVar.f124170b);
    }

    public final int hashCode() {
        Aweme aweme = this.f124169a;
        int i = 0;
        int hashCode = (aweme != null ? aweme.hashCode() : 0) * 31;
        DialogInterface$OnDismissListenerC54209b.AbstractC54212c cVar = this.f124170b;
        if (cVar != null) {
            i = cVar.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "SendVideoEvent(video=" + this.f124169a + ", sendMethod=" + this.f124170b + ")";
    }

    public C54200a(Aweme aweme, DialogInterface$OnDismissListenerC54209b.AbstractC54212c cVar) {
        C89219l.m154721d(aweme, "");
        C89219l.m154721d(cVar, "");
        this.f124169a = aweme;
        this.f124170b = cVar;
    }
}
