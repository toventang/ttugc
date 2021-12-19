package com.p2082ss.android.ugc.aweme.story.avatar.entry;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.story.avatar.AbstractC76508e;
import com.p2082ss.android.ugc.aweme.story.avatar.AbstractC76548h;
import com.p2082ss.android.ugc.aweme.tux.business.story.EnumC79475a;
import com.p2082ss.android.ugc.aweme.tux.business.story.StoryBrandView;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.avatar.entry.g */
public class C76541g implements AbstractC76526a, AbstractC76548h {

    /* renamed from: a */
    public final StoryBrandView f171855a;

    /* renamed from: b */
    private final /* synthetic */ AbstractC76508e f171856b;

    static {
        Covode.recordClassIndex(89526);
    }

    @Override // com.p2082ss.android.ugc.aweme.story.avatar.AbstractC76548h
    /* renamed from: a */
    public final void mo80536a(boolean z, EnumC79475a aVar) {
        C89219l.m154721d(aVar, "");
        this.f171856b.mo80536a(z, aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.story.avatar.AbstractC76548h
    /* renamed from: d */
    public final boolean mo80540d() {
        return this.f171856b.mo80540d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo120261a() {
        this.f171855a.setVisibility(8);
    }

    public C76541g(AbstractC76508e eVar) {
        C89219l.m154721d(eVar, "");
        this.f171856b = eVar;
        this.f171855a = eVar.mo80534a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo120262a(EnumC79475a aVar) {
        C89219l.m154721d(aVar, "");
        this.f171855a.setMode(aVar);
        this.f171855a.setVisibility(0);
    }

    @Override // com.p2082ss.android.ugc.aweme.story.avatar.entry.AbstractC76526a
    /* renamed from: a */
    public final void mo120253a(C76545k kVar) {
        boolean z;
        C89219l.m154721d(kVar, "");
        if (!mo80540d() || !kVar.f171858a) {
            mo120261a();
        } else {
            mo120262a(kVar.f171859b);
            if (kVar.f171859b == EnumC79475a.PRORGRESS) {
                this.f171855a.setProgress(kVar.f171860c);
            }
        }
        if (this.f171855a.getVisibility() == 0) {
            z = true;
        } else {
            z = false;
        }
        mo80536a(z, this.f171855a.getMode());
    }
}
