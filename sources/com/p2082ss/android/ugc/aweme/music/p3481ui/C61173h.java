package com.p2082ss.android.ugc.aweme.music.p3481ui;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.music.ui.h */
public final class C61173h implements AbstractC61172g {

    /* renamed from: a */
    public boolean f138885a;

    /* renamed from: b */
    public Effect f138886b;

    /* renamed from: c */
    public AbstractC61172g f138887c;

    /* renamed from: d */
    private Effect f138888d;

    /* renamed from: e */
    private boolean f138889e;

    /* renamed from: f */
    private C61198q f138890f;

    /* renamed from: g */
    private boolean f138891g;

    /* renamed from: h */
    private C61198q f138892h;

    /* renamed from: i */
    private boolean f138893i;

    /* renamed from: j */
    private int f138894j;

    /* renamed from: k */
    private Effect f138895k;

    /* renamed from: l */
    private Long f138896l = 0L;

    /* renamed from: m */
    private boolean f138897m;

    /* renamed from: n */
    private boolean f138898n;

    /* renamed from: o */
    private Effect f138899o;

    static {
        Covode.recordClassIndex(71778);
    }

    public C61173h(AbstractC61172g gVar) {
        this.f138887c = gVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.AbstractC61172g
    /* renamed from: a */
    public final void mo98715a(Effect effect) {
        this.f138888d = effect;
        this.f138889e = true;
        AbstractC61172g gVar = this.f138887c;
        if (gVar != null) {
            gVar.mo98715a(effect);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.AbstractC61172g
    /* renamed from: b */
    public final void mo98718b(Effect effect) {
        this.f138885a = true;
        this.f138886b = effect;
        AbstractC61172g gVar = this.f138887c;
        if (gVar != null) {
            gVar.mo98718b(effect);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.AbstractC61172g
    /* renamed from: b */
    public final void mo98717b(C61198q qVar) {
        C89219l.m154721d(qVar, "");
        this.f138892h = qVar;
        this.f138893i = true;
        AbstractC61172g gVar = this.f138887c;
        if (gVar != null) {
            gVar.mo98717b(qVar);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.AbstractC61172g
    /* renamed from: a */
    public final void mo98714a(C61198q qVar) {
        C89219l.m154721d(qVar, "");
        this.f138890f = qVar;
        this.f138891g = true;
        AbstractC61172g gVar = this.f138887c;
        if (gVar != null) {
            gVar.mo98714a(qVar);
        }
    }

    /* renamed from: a */
    public final void mo98719a(AbstractC61172g gVar) {
        String str;
        if (this.f138885a && gVar != null) {
            gVar.mo98718b(this.f138886b);
        }
        if (this.f138898n && gVar != null) {
            Effect effect = this.f138899o;
            if (effect != null) {
                str = effect.getEffectId();
            } else {
                str = null;
            }
            gVar.mo98716a(str, this.f138899o);
        }
        if (this.f138889e && gVar != null) {
            gVar.mo98715a(this.f138888d);
        }
        if (this.f138897m && gVar != null) {
            gVar.mo98713a(this.f138894j, this.f138895k, this.f138896l);
        }
        if (this.f138893i && gVar != null) {
            C61198q qVar = this.f138892h;
            if (qVar == null) {
                C89219l.m154715b();
            }
            gVar.mo98717b(qVar);
        }
        if (this.f138891g && gVar != null) {
            C61198q qVar2 = this.f138890f;
            if (qVar2 == null) {
                C89219l.m154715b();
            }
            gVar.mo98714a(qVar2);
        }
        this.f138887c = gVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.AbstractC61172g
    /* renamed from: a */
    public final void mo98716a(String str, Effect effect) {
        this.f138898n = true;
        this.f138899o = effect;
        AbstractC61172g gVar = this.f138887c;
        if (gVar != null) {
            gVar.mo98716a(str, effect);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.AbstractC61172g
    /* renamed from: a */
    public final void mo98713a(int i, Effect effect, Long l) {
        this.f138894j = i;
        this.f138895k = effect;
        this.f138896l = l;
        this.f138897m = true;
        AbstractC61172g gVar = this.f138887c;
        if (gVar != null) {
            gVar.mo98713a(i, effect, l);
        }
    }
}
