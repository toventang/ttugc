package com.p2082ss.android.ugc.aweme.story.avatar.entry;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.story.avatar.AbstractC76508e;
import com.p2082ss.android.ugc.aweme.tux.business.story.EnumC79475a;
import p4600h.p4611f.p4613b.C89219l;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.story.avatar.entry.i */
public final class C76543i extends C76541g {
    static {
        Covode.recordClassIndex(89528);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.story.avatar.entry.C76541g
    /* renamed from: a */
    public final void mo120261a() {
        this.f171855a.setVisibility(4);
        this.f171855a.setClickable(false);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C76543i(AbstractC76508e eVar) {
        super(eVar);
        C89219l.m154721d(eVar, "");
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.story.avatar.entry.C76541g
    /* renamed from: a */
    public final void mo120262a(EnumC79475a aVar) {
        C89219l.m154721d(aVar, "");
        super.mo120262a(aVar);
        this.f171855a.setClickable(true);
    }
}
