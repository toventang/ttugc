package com.p2082ss.android.ugc.aweme.sticker.panel.p3972b;

import android.widget.FrameLayout;
import androidx.appcompat.app.ActivityC0218d;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sticker.p3954d.AbstractC75300d;
import com.p2082ss.android.ugc.aweme.sticker.p3965m.AbstractC75429h;
import com.p2082ss.android.ugc.aweme.sticker.p3965m.AbstractC75431i;
import com.p2082ss.android.ugc.aweme.sticker.p3965m.C75426e;
import com.p2082ss.android.ugc.aweme.sticker.p3965m.C75427f;
import com.p2082ss.android.ugc.aweme.sticker.panel.AbstractC75573i;
import com.p2082ss.android.ugc.aweme.sticker.panel.C75574j;
import com.p2082ss.android.ugc.aweme.sticker.panel.p3971a.AbstractC75473a;
import com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75655o;
import com.p2082ss.android.ugc.aweme.sticker.types.lock.AbstractC76085a;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.AbstractC76151g;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.main.C76179d;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.main.C76180e;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.search.AbstractC76329a;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.search.SearchStickerViewModel;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.viewmodels.AbstractC76396a;
import com.p2082ss.android.ugc.aweme.sticker.view.p4013a.AbstractC76115b;
import com.p2082ss.android.ugc.aweme.sticker.view.p4013a.AbstractC76122i;
import com.p2082ss.android.ugc.aweme.sticker.view.p4013a.AbstractC76124k;
import com.p2082ss.android.ugc.aweme.sticker.view.p4013a.AbstractC76125l;
import com.p2082ss.android.ugc.tools.utils.AbstractC84903j;
import com.p2082ss.android.ugc.tools.view.style.C84984j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.panel.b.a */
public final class C75479a implements AbstractC75495c {

    /* renamed from: a */
    public AbstractC76122i f169597a;

    /* renamed from: b */
    public AbstractC76085a f169598b;

    /* renamed from: c */
    public AbstractC84903j f169599c;

    /* renamed from: d */
    public boolean f169600d;

    /* renamed from: e */
    public AbstractC76115b<C84984j, Fragment> f169601e;

    /* renamed from: f */
    public AbstractC76329a f169602f;

    /* renamed from: g */
    public final List<AbstractC75473a> f169603g;

    /* renamed from: h */
    public AbstractC89172b<? super C75574j, C89391z> f169604h;

    /* renamed from: i */
    private AbstractC76124k f169605i;

    /* renamed from: j */
    private AbstractC76396a f169606j;

    /* renamed from: k */
    private C75574j f169607k;

    /* renamed from: l */
    private final AbstractC75655o f169608l;

    /* renamed from: m */
    private final AbstractC75300d f169609m;

    /* renamed from: n */
    private final AbstractC75429h f169610n;

    /* renamed from: o */
    private final AbstractC75431i f169611o;

    /* renamed from: p */
    private final AbstractC76151g f169612p;

    static {
        Covode.recordClassIndex(88401);
    }

    public /* synthetic */ C75479a(AbstractC75655o oVar, AbstractC75300d dVar) {
        this(oVar, dVar, C75426e.f169510a, C75427f.f169511a, C76180e.f171138a);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.panel.p3972b.AbstractC75495c
    /* renamed from: a */
    public final AbstractC75573i mo119151a(ActivityC0218d dVar, FrameLayout frameLayout, AbstractC1204m mVar, AbstractC0952i iVar) {
        C75574j jVar;
        ActivityC0218d dVar2 = dVar;
        C89219l.m154721d(dVar2, "");
        C89219l.m154721d(frameLayout, "");
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(iVar, "");
        AbstractC89172b<? super C75574j, C89391z> bVar = this.f169604h;
        if (bVar != null) {
            jVar = r16;
            C75574j jVar2 = new C75574j(0, 0, null, 0, 0, 0, false, 0, false, null, null, false, false, false, 131071);
            bVar.invoke(jVar);
        } else {
            jVar = this.f169607k;
            if (jVar == null) {
                jVar = new C75574j(0, 0, null, 0, 0, 0, false, 0, false, null, null, false, false, false, 131071);
            }
        }
        AbstractC76125l.C76127b bVar2 = new AbstractC76125l.C76127b(this.f169608l, this.f169609m, this.f169610n, this.f169611o, this.f169612p, jVar.f169851m);
        AbstractC76125l.C76126a aVar = new AbstractC76125l.C76126a(this.f169597a, this.f169598b, this.f169599c, 120);
        AbstractC76396a aVar2 = this.f169606j;
        AbstractC76115b<C84984j, Fragment> bVar3 = this.f169601e;
        AbstractC76124k kVar = this.f169605i;
        boolean z = this.f169600d;
        AbstractC76329a aVar3 = this.f169602f;
        if (aVar3 == null) {
            dVar2 = dVar2;
            aVar3 = new SearchStickerViewModel(dVar2, this.f169608l, this.f169609m, this.f169612p);
        }
        C75494b bVar4 = new C75494b(dVar2, frameLayout, mVar, iVar, jVar, bVar2, aVar, aVar2, bVar3, kVar, z, aVar3);
        Iterator<T> it = this.f169603g.iterator();
        while (it.hasNext()) {
            bVar4.f169577h.mo119150a(it.next());
        }
        return bVar4;
    }

    private C75479a(AbstractC75655o oVar, AbstractC75300d dVar, AbstractC75429h hVar, AbstractC75431i iVar, AbstractC76151g gVar) {
        C89219l.m154721d(oVar, "");
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(hVar, "");
        C89219l.m154721d(iVar, "");
        C89219l.m154721d(gVar, "");
        this.f169608l = oVar;
        this.f169609m = dVar;
        this.f169610n = hVar;
        this.f169611o = iVar;
        this.f169612p = gVar;
        this.f169600d = true;
        this.f169605i = new C76179d();
        this.f169603g = new ArrayList();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C75479a(C75574j jVar, AbstractC75655o oVar, AbstractC75300d dVar, AbstractC75429h hVar, AbstractC75431i iVar, AbstractC76151g gVar) {
        this(oVar, dVar, hVar, iVar, gVar);
        C89219l.m154721d(oVar, "");
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(hVar, "");
        C89219l.m154721d(iVar, "");
        C89219l.m154721d(gVar, "");
        this.f169607k = jVar;
    }
}
