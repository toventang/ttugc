package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3087c;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3263m.C56244a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.c.d */
public final class C53718d implements AbstractC53717c {

    /* renamed from: a */
    public final String f123247a;

    static {
        Covode.recordClassIndex(63298);
    }

    private /* synthetic */ C53718d() {
        this("ChatRoomLogger");
    }

    public C53718d(String str) {
        C89219l.m154721d(str, "");
        this.f123247a = str;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3087c.AbstractC53717c
    /* renamed from: a */
    public final void mo90293a(String str) {
        C89219l.m154721d(str, "");
        C56244a.m102190b(this.f123247a, str);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3087c.AbstractC53717c
    /* renamed from: b */
    public final void mo90296b(String str) {
        C89219l.m154721d(str, "");
        C56244a.m102191c(this.f123247a, str);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3087c.AbstractC53717c
    /* renamed from: c */
    public final void mo90297c(String str) {
        C89219l.m154721d(str, "");
        C56244a.m102193e(this.f123247a, str);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3087c.AbstractC53717c
    /* renamed from: a */
    public final void mo90295a(Throwable th) {
        C89219l.m154721d(th, "");
        C56244a.m102187a(this.f123247a, th);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3087c.AbstractC53717c
    /* renamed from: a */
    public final void mo90294a(String str, Throwable th) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(th, "");
        C56244a.m102186a(this.f123247a, str, th);
    }
}
