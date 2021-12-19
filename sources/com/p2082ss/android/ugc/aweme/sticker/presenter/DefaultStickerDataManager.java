package com.p2082ss.android.ugc.aweme.sticker.presenter;

import androidx.appcompat.app.ActivityC0218d;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.sticker.p3957e.AbstractC75327g;
import com.p2082ss.android.ugc.aweme.sticker.p3957e.C75315a;
import com.p2082ss.android.ugc.aweme.sticker.p3959g.AbstractC75374c;
import com.p2082ss.android.ugc.aweme.sticker.p3959g.C75381h;
import com.p2082ss.android.ugc.aweme.sticker.repository.internals.p3990b.C75760g;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75705k;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75706l;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75718w;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75719x;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.C75691ac;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3986c.C75727b;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import java.util.Map;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4589j.C88934a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89378p;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.presenter.DefaultStickerDataManager */
public class DefaultStickerDataManager implements AbstractC33974au, AbstractC75655o {

    /* renamed from: a */
    public final C88411a f169877a = new C88411a();

    /* renamed from: b */
    private boolean f169878b;

    /* renamed from: c */
    private boolean f169879c;

    /* renamed from: d */
    private AbstractC75327g f169880d;

    /* renamed from: e */
    private final AbstractC75718w f169881e;

    /* renamed from: f */
    private String f169882f;

    /* renamed from: g */
    private int f169883g;

    /* renamed from: h */
    private Effect f169884h;

    /* renamed from: i */
    private long f169885i;

    /* renamed from: j */
    private boolean f169886j;

    /* renamed from: k */
    private String f169887k;

    /* renamed from: l */
    private String f169888l;

    /* renamed from: m */
    private C89378p<String, String> f169889m;

    /* renamed from: n */
    private boolean f169890n;

    /* renamed from: o */
    private final C75657q f169891o;

    /* renamed from: p */
    private final AbstractC75650j f169892p;

    /* renamed from: q */
    private final AbstractC75705k f169893q;

    static {
        Covode.recordClassIndex(88502);
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onDestroy();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75655o
    /* renamed from: c */
    public final AbstractC75718w mo119291c() {
        return this.f169881e;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75655o
    /* renamed from: d */
    public final String mo119292d() {
        return this.f169882f;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75655o
    /* renamed from: e */
    public final int mo119293e() {
        return this.f169883g;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75655o
    /* renamed from: h */
    public final Effect mo119296h() {
        return this.f169884h;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75655o
    /* renamed from: i */
    public final long mo119297i() {
        return this.f169885i;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75655o
    /* renamed from: j */
    public final boolean mo119298j() {
        return this.f169886j;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75655o
    /* renamed from: k */
    public final String mo119299k() {
        return this.f169887k;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75655o
    /* renamed from: l */
    public final String mo119300l() {
        return this.f169888l;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75655o
    /* renamed from: m */
    public final C89378p<String, String> mo119301m() {
        return this.f169889m;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75655o
    /* renamed from: n */
    public final AbstractC75650j mo119302n() {
        return this.f169892p;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75655o
    /* renamed from: o */
    public final void mo119303o() {
        onDestroy();
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75655o
    /* renamed from: p */
    public final C75657q mo119305p() {
        return this.f169891o;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75655o
    /* renamed from: a */
    public final boolean mo119288a() {
        return this.f169878b;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.p3957e.AbstractC75327g
    /* renamed from: a */
    public final boolean mo118905a(Effect effect) {
        C89219l.m154721d(effect, "");
        AbstractC75327g gVar = this.f169880d;
        if (gVar != null) {
            return gVar.mo118905a(effect);
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75655o
    /* renamed from: b */
    public final boolean mo119290b() {
        return this.f169879c;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75655o
    /* renamed from: f */
    public final Effect mo119294f() {
        return this.f169892p.mo119318a();
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75655o
    /* renamed from: g */
    public final Effect mo119295g() {
        return this.f169892p.mo119323b().getValue();
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public final void onDestroy() {
        if (!this.f169890n) {
            this.f169890n = true;
            this.f169881e.mo119455b();
            this.f169877a.mo142944a();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75655o
    /* renamed from: a */
    public final void mo119279a(int i) {
        this.f169883g = i;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75655o
    /* renamed from: b */
    public final void mo119289b(Effect effect) {
        this.f169884h = effect;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75655o
    /* renamed from: a */
    public final void mo119281a(long j) {
        this.f169885i = j;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75655o
    /* renamed from: a */
    public final void mo119284a(String str) {
        C89219l.m154721d(str, "");
        this.f169882f = str;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75655o
    /* renamed from: a */
    public final void mo119287a(boolean z) {
        this.f169886j = z;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75655o
    /* renamed from: a */
    public final void mo119283a(Effect effect, IFetchEffectListener iFetchEffectListener) {
        if (effect != null) {
            this.f169881e.mo119458d().mo119436a(effect, iFetchEffectListener);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75655o
    /* renamed from: a */
    public final void mo119280a(int i, List<? extends Effect> list) {
        C89219l.m154721d(list, "");
        this.f169881e.mo119462h().mo119448a(new C75727b(list, i));
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.p3957e.AbstractC75327g
    /* renamed from: a */
    public final void mo118904a(Effect effect, AbstractC75374c.AbstractC75376b bVar) {
        C89219l.m154721d(effect, "");
        C89219l.m154721d(bVar, "");
        AbstractC75327g gVar = this.f169880d;
        if (gVar != null) {
            gVar.mo118904a(effect, bVar);
        } else {
            bVar.mo118622a();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75707m
    /* renamed from: a */
    public final void mo119282a(C75691ac acVar, AbstractC75374c.AbstractC75375a aVar) {
        C89219l.m154721d(acVar, "");
        Effect effect = acVar.f170122a;
        AbstractC75706l c = this.f169881e.mo119457c();
        if (aVar != null) {
            boolean a = this.f169881e.mo119459e().mo119439a(effect);
            C75381h hVar = new C75381h(a ? 1 : 0, aVar, this.f169893q);
            C75315a aVar2 = new C75315a(a, c);
            C89219l.m154721d(effect, "");
            C89219l.m154721d(hVar, "");
            AbstractC88412b d = AbstractC88979t.m154314c(new C75315a.CallableC75316a(aVar2, effect)).mo143299f(C75315a.C75317b.f169315a).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88392a.m153583a()).mo143289d(new C75315a.C75318c(aVar2, effect, hVar));
            C89219l.m154716b(d, "");
            C88934a.m154195a(d, aVar2.f169310c);
            C88411a aVar3 = aVar2.f169310c;
            if (aVar3 != null) {
                C88934a.m154195a(aVar3, this.f169877a);
                return;
            }
            return;
        }
        C75760g.m132921a(c, effect, acVar.f170123b, false);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75655o
    /* renamed from: a */
    public final void mo119285a(List<String> list, Map<String, String> map, IFetchEffectListByIdsListener iFetchEffectListByIdsListener) {
        C89219l.m154721d(list, "");
        this.f169881e.mo119458d().mo119437a(list, map, iFetchEffectListByIdsListener);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75655o
    /* renamed from: a */
    public final void mo119286a(List<String> list, Map<String, String> map, IFetchEffectListListener iFetchEffectListListener) {
        C89219l.m154721d(list, "");
        this.f169881e.mo119458d().mo119438a(list, true, map, iFetchEffectListListener);
    }

    public DefaultStickerDataManager(ActivityC0218d dVar, C75657q qVar, AbstractC75719x xVar, AbstractC75650j jVar, AbstractC75705k kVar) {
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(qVar, "");
        C89219l.m154721d(xVar, "");
        C89219l.m154721d(jVar, "");
        this.f169891o = qVar;
        this.f169892p = jVar;
        this.f169893q = kVar;
        this.f169881e = xVar.mo119405a();
        dVar.getLifecycle().mo4012a(this);
        this.f169882f = "";
        this.f169883g = -1;
        this.f169885i = -1;
        this.f169886j = true;
        this.f169887k = "";
        this.f169888l = "";
        this.f169889m = new C89378p<>("", "");
    }
}
