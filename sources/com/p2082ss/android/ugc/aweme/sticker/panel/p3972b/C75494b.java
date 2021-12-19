package com.p2082ss.android.ugc.aweme.sticker.panel.p3972b;

import android.widget.FrameLayout;
import androidx.appcompat.app.ActivityC0218d;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sticker.p3954d.AbstractC75300d;
import com.p2082ss.android.ugc.aweme.sticker.p3954d.AbstractC75301e;
import com.p2082ss.android.ugc.aweme.sticker.panel.AbstractC75467a;
import com.p2082ss.android.ugc.aweme.sticker.panel.C75574j;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.main.StickerViewImpl;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.search.AbstractC76329a;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.viewmodels.AbstractC76396a;
import com.p2082ss.android.ugc.aweme.sticker.view.p4013a.AbstractC76115b;
import com.p2082ss.android.ugc.aweme.sticker.view.p4013a.AbstractC76121h;
import com.p2082ss.android.ugc.aweme.sticker.view.p4013a.AbstractC76124k;
import com.p2082ss.android.ugc.aweme.sticker.view.p4013a.AbstractC76125l;
import com.p2082ss.android.ugc.tools.view.style.C84984j;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.panel.b.b */
public final class C75494b extends AbstractC75467a {

    /* renamed from: k */
    public final AbstractC75300d f169639k;

    /* renamed from: l */
    private final ActivityC0218d f169640l;

    /* renamed from: m */
    private final FrameLayout f169641m;

    /* renamed from: n */
    private final AbstractC0952i f169642n;

    /* renamed from: o */
    private final C75574j f169643o;

    /* renamed from: p */
    private final AbstractC76125l.C76127b f169644p;

    /* renamed from: q */
    private final AbstractC76125l.C76126a f169645q;

    /* renamed from: r */
    private final AbstractC76396a f169646r;

    /* renamed from: s */
    private final AbstractC76115b<C84984j, Fragment> f169647s;

    /* renamed from: t */
    private final AbstractC76124k f169648t;

    /* renamed from: u */
    private final boolean f169649u;

    /* renamed from: v */
    private final AbstractC76329a f169650v;

    static {
        Covode.recordClassIndex(88416);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.panel.AbstractC75573i
    /* renamed from: m */
    public final C75574j mo119167m() {
        return this.f169643o;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.panel.AbstractC75467a
    /* renamed from: a */
    public final AbstractC76121h mo119130a(AbstractC75301e eVar) {
        C89219l.m154721d(eVar, "");
        ActivityC0218d dVar = this.f169640l;
        FrameLayout frameLayout = this.f169641m;
        AbstractC1204m mVar = this.f169578i;
        AbstractC76125l.C76127b bVar = this.f169644p;
        AbstractC76125l.C76126a aVar = this.f169645q;
        return new StickerViewImpl(dVar, frameLayout, mVar, bVar, new AbstractC76125l.C76126a(aVar.f171017a, aVar.f171018b, aVar.f171019c, this.f169577h, aVar.f171021e, aVar.f171022f, aVar.f171023g), eVar, this.f169643o, this.f169642n, this.f169646r, this.f169647s, this.f169648t, this.f169649u, this.f169650v);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C75494b(ActivityC0218d dVar, FrameLayout frameLayout, AbstractC1204m mVar, AbstractC0952i iVar, C75574j jVar, AbstractC76125l.C76127b bVar, AbstractC76125l.C76126a aVar, AbstractC76396a aVar2, AbstractC76115b<C84984j, Fragment> bVar2, AbstractC76124k kVar, boolean z, AbstractC76329a aVar3) {
        super(mVar, bVar.f171024a);
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(frameLayout, "");
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(iVar, "");
        C89219l.m154721d(jVar, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(aVar3, "");
        this.f169640l = dVar;
        this.f169641m = frameLayout;
        this.f169642n = iVar;
        this.f169643o = jVar;
        this.f169644p = bVar;
        this.f169645q = aVar;
        this.f169646r = aVar2;
        this.f169647s = bVar2;
        this.f169648t = kVar;
        this.f169649u = z;
        this.f169650v = aVar3;
        this.f169639k = bVar.f171025b;
    }
}
