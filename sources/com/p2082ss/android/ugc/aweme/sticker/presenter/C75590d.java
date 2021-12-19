package com.p2082ss.android.ugc.aweme.sticker.presenter;

import android.text.TextUtils;
import androidx.lifecycle.C1213t;
import androidx.lifecycle.LiveData;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3980c.C75618a;
import com.p2082ss.android.ugc.aweme.utils.C80576ij;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.presenter.d */
public final class C75590d implements AbstractC75650j {

    /* renamed from: a */
    public Effect f169930a;

    /* renamed from: b */
    public final C80576ij<C75658r> f169931b;

    /* renamed from: c */
    public final C1213t<C75618a> f169932c;

    /* renamed from: d */
    private final C1213t<Effect> f169933d;

    /* renamed from: e */
    private final C1213t<C75651k> f169934e;

    /* renamed from: f */
    private final C1213t<C75654n> f169935f;

    /* renamed from: g */
    private final C1213t<C75652l> f169936g;

    /* renamed from: h */
    private final C1213t<C75588b> f169937h;

    /* renamed from: i */
    private final C1213t<Effect> f169938i;

    /* renamed from: j */
    private final C1213t<Effect> f169939j;

    /* renamed from: k */
    private String f169940k;

    /* renamed from: l */
    private final boolean f169941l;

    static {
        Covode.recordClassIndex(88515);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75650j
    /* renamed from: a */
    public final Effect mo119318a() {
        return this.f169930a;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75650j
    /* renamed from: b */
    public final LiveData<Effect> mo119323b() {
        return this.f169933d;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75650j
    /* renamed from: c */
    public final LiveData<C75651k> mo119325c() {
        return this.f169934e;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75650j
    /* renamed from: d */
    public final LiveData<C75654n> mo119327d() {
        return this.f169935f;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75650j
    /* renamed from: e */
    public final LiveData<C75652l> mo119328e() {
        return this.f169936g;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75650j
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ LiveData mo119329f() {
        return this.f169931b;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75650j
    /* renamed from: g */
    public final LiveData<C75588b> mo119330g() {
        return this.f169937h;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75650j
    /* renamed from: h */
    public final LiveData<Effect> mo119331h() {
        return this.f169938i;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75650j
    /* renamed from: i */
    public final LiveData<Effect> mo119332i() {
        return this.f169939j;
    }

    private C75590d() {
        this.f169941l = false;
        this.f169933d = new C1213t<>();
        this.f169934e = new C1213t<>();
        this.f169935f = new C1213t<>();
        this.f169936g = new C1213t<>();
        this.f169937h = new C1213t<>();
        this.f169938i = new C1213t<>();
        this.f169939j = new C1213t<>();
        this.f169940k = "";
        this.f169931b = new C80576ij<>();
        this.f169932c = new C1213t<>();
    }

    public /* synthetic */ C75590d(byte b) {
        this();
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75650j
    /* renamed from: a */
    public final void mo119320a(C75618a aVar) {
        C89219l.m154721d(aVar, "");
        this.f169932c.setValue(aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75650j
    /* renamed from: a */
    public final void mo119319a(C75588b bVar) {
        this.f169937h.setValue(bVar);
        if (bVar != null && !bVar.f169920e) {
            this.f169931b.setValue(new C75658r(bVar.f169917b));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75650j
    /* renamed from: a */
    public final void mo119321a(Effect effect) {
        Effect effect2;
        this.f169933d.setValue(effect);
        C75654n value = this.f169935f.getValue();
        if (value != null) {
            effect2 = value.f170068b;
        } else {
            effect2 = null;
        }
        this.f169935f.setValue(new C75654n(effect2, effect));
        this.f169934e.setValue(null);
        this.f169930a = effect;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75650j
    /* renamed from: b */
    public final void mo119324b(Effect effect) {
        if (effect == null) {
            this.f169938i.setValue(null);
            this.f169939j.setValue(null);
            return;
        }
        this.f169938i.setValue(effect);
        if (!TextUtils.isEmpty(effect.getParentId())) {
            String parentId = effect.getParentId();
            if (parentId == null) {
                C89219l.m154715b();
            }
            this.f169940k = parentId;
            return;
        }
        this.f169939j.setValue(effect);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75650j
    /* renamed from: c */
    public final boolean mo119326c(Effect effect) {
        List<String> children;
        Boolean valueOf;
        Effect effect2 = this.f169930a;
        if (effect2 == null || (children = effect2.getChildren()) == null || effect == null || (valueOf = Boolean.valueOf(children.contains(effect.getEffectId()))) == null) {
            return false;
        }
        return valueOf.booleanValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75650j
    /* renamed from: a */
    public final void mo119322a(Effect effect, int i) {
        int i2;
        C75651k value = this.f169934e.getValue();
        if (value != null) {
            i2 = value.f170064b;
        } else {
            i2 = -1;
        }
        if (i2 != i) {
            this.f169933d.setValue(effect);
            C75651k value2 = this.f169934e.getValue();
            if (value2 == null) {
                value2 = new C75651k();
            }
            C89219l.m154716b(value2, "");
            C75651k kVar = new C75651k(effect, i);
            this.f169934e.setValue(kVar);
            this.f169936g.setValue(new C75652l(value2, kVar));
        }
    }
}
