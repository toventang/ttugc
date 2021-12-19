package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.group.invite;

import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1175ad;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.invite.p3203a.C55371a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.group.invite.h */
public final class C54046h implements C1175ad.AbstractC1177b {

    /* renamed from: a */
    private final String f123886a;

    /* renamed from: b */
    private final C55371a f123887b;

    static {
        Covode.recordClassIndex(63719);
    }

    public /* synthetic */ C54046h() {
        this(null, null);
    }

    @Override // androidx.lifecycle.C1175ad.AbstractC1177b
    /* renamed from: a */
    public final <T extends AbstractC1174ac> T mo3261a(Class<T> cls) {
        C89219l.m154721d(cls, "");
        return new GroupInviteViewModel(this.f123886a, this.f123887b);
    }

    public C54046h(String str, C55371a aVar) {
        this.f123886a = str;
        this.f123887b = aVar;
    }
}
