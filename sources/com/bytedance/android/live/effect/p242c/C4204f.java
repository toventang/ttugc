package com.bytedance.android.live.effect.p242c;

import android.text.TextUtils;
import com.bytedance.android.live.broadcast.api.model.C3070c;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.effect.C4175b;
import com.bytedance.android.live.effect.api.AbstractC4166c;
import com.bytedance.android.live.effect.api.AbstractC4169e;
import com.bytedance.android.live.effect.api.AbstractC4170f;
import com.bytedance.android.live.effect.api.EffectRelatedApi;
import com.bytedance.android.live.effect.model.C4313c;
import com.bytedance.android.live.effect.model.FilterModel;
import com.bytedance.android.live.effect.p242c.C4208j;
import com.bytedance.android.live.network.C5805e;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p452ao.AbstractC6804a;
import com.bytedance.android.livesdk.p452ao.C6806c;
import com.bytedance.common.utility.C13627m;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import java.util.Collection;
import java.util.List;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;

/* renamed from: com.bytedance.android.live.effect.c.f */
public final class C4204f implements AbstractC4169e {

    /* renamed from: c */
    static AbstractC4170f f11673c = C4208j.C4212b.f11691a;

    /* renamed from: a */
    public List<FilterModel> f11674a = f11673c.mo9890a();

    /* renamed from: b */
    public C4313c f11675b;

    /* renamed from: d */
    private int f11676d = -1;

    static {
        Covode.recordClassIndex(4774);
    }

    @Override // com.bytedance.android.live.effect.api.AbstractC4169e
    /* renamed from: a */
    public final void mo9879a() {
        f11673c.mo9897b(this);
        C4313c cVar = this.f11675b;
        if (cVar != null) {
            cVar.f11846a = null;
        }
    }

    public C4204f() {
        f11673c.mo9892a(this);
        this.f11675b = new C4313c();
    }

    @Override // com.bytedance.android.live.effect.api.AbstractC4169e
    /* renamed from: b */
    public final String mo9884b() {
        if (this.f11674a.isEmpty()) {
            return "";
        }
        return this.f11674a.get(mo9888f()).getName();
    }

    @Override // com.bytedance.android.live.effect.api.AbstractC4169e
    /* renamed from: f */
    public final int mo9888f() {
        int intValue = AbstractC6804a.f16886O.mo13066a().intValue();
        if (intValue >= this.f11674a.size() || intValue < 0) {
            return 0;
        }
        return intValue;
    }

    @Override // com.bytedance.android.live.effect.api.AbstractC4169e
    /* renamed from: e */
    public final String mo9887e() {
        int intValue = AbstractC6804a.f16886O.mo13066a().intValue();
        if (intValue <= 0 || intValue >= this.f11674a.size()) {
            return "";
        }
        return this.f11674a.get(intValue).getFilterId();
    }

    @Override // com.bytedance.android.live.effect.api.AbstractC4169e
    /* renamed from: c */
    public final void mo9885c() {
        if (!this.f11674a.isEmpty()) {
            int f = mo9888f();
            int i = f - 1;
            if (i < 0) {
                i = this.f11674a.size() - 1;
            }
            FilterModel filterModel = this.f11674a.get(i);
            if (f11673c.mo9898b(filterModel)) {
                if (!C13627m.m24498a(filterModel.getFilterId()) && !filterModel.getFilterId().equals("0")) {
                    C4175b.f11604a.mo9876a(null, false, filterModel.getFilterId(), false, i + 1);
                }
                f11673c.mo9895b(i);
                m10281a(f, i);
            } else if (!f11673c.mo9900c(filterModel)) {
                f11673c.mo9893a(filterModel);
            }
        }
    }

    @Override // com.bytedance.android.live.effect.api.AbstractC4169e
    /* renamed from: d */
    public final void mo9886d() {
        if (!this.f11674a.isEmpty()) {
            int f = mo9888f();
            int i = f + 1;
            if (i >= this.f11674a.size()) {
                i = 0;
            }
            FilterModel filterModel = this.f11674a.get(i);
            if (f11673c.mo9898b(filterModel)) {
                if (!C13627m.m24498a(filterModel.getFilterId()) && !filterModel.getFilterId().equals("0")) {
                    C4175b.f11604a.mo9876a(null, false, filterModel.getFilterId(), false, i + 1);
                }
                f11673c.mo9895b(i);
                m10281a(f, i);
            } else if (!f11673c.mo9900c(filterModel)) {
                f11673c.mo9893a(filterModel);
            }
        }
    }

    /* renamed from: a */
    private void m10282a(FilterModel filterModel) {
        if (filterModel == null) {
            return;
        }
        if (TextUtils.isEmpty(filterModel.getFilterPath())) {
            this.f11675b.mo9992a();
        } else {
            this.f11675b.mo9993a(filterModel.getFilterPath(), f11673c.mo9901d(filterModel));
        }
    }

    @Override // com.bytedance.android.live.effect.api.AbstractC4169e
    /* renamed from: a */
    public final void mo9880a(int i) {
        int f = mo9888f();
        if (i >= 0 && i < this.f11674a.size()) {
            if (f11673c.mo9898b(this.f11674a.get(i))) {
                m10281a(f, i);
            } else if (!f11673c.mo9900c(this.f11674a.get(i))) {
                f11673c.mo9893a(this.f11674a.get(i));
            }
        }
    }

    @Override // com.bytedance.android.live.effect.api.AbstractC4169e
    /* renamed from: a */
    public final void mo9881a(long j) {
        String str;
        int intValue = AbstractC6804a.f16886O.mo13066a().intValue();
        if (intValue < f11673c.mo9890a().size()) {
            if (C13603b.m24435a((Collection) f11673c.mo9890a()) || intValue >= f11673c.mo9890a().size() || f11673c.mo9890a().get(intValue) == null) {
                str = "";
            } else {
                str = f11673c.mo9890a().get(intValue).getName();
            }
            ((EffectRelatedApi) C5805e.m12718a().mo11572a(EffectRelatedApi.class)).uploadBeautyParams(j, str, (int) (AbstractC6804a.f16887P.mo13066a().floatValue() * 100.0f), (int) (AbstractC6804a.f16888Q.mo13066a().floatValue() * 100.0f), (int) (AbstractC6804a.f16889R.mo13066a().floatValue() * 100.0f), (int) (AbstractC6804a.f16890S.mo13066a().floatValue() * 100.0f), false).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(C4205g.f11677a, C4206h.f11678a);
        }
    }

    @Override // com.bytedance.android.live.effect.api.AbstractC4169e
    /* renamed from: a */
    public final void mo9882a(AbstractC4166c cVar) {
        FilterModel filterModel;
        cVar.mo8964a(this.f11675b);
        int f = mo9888f();
        if (f <= 0 || f >= this.f11674a.size()) {
            filterModel = null;
        } else {
            filterModel = this.f11674a.get(f);
        }
        m10282a(filterModel);
    }

    @Override // com.bytedance.android.live.effect.api.AbstractC4170f.AbstractC4172b
    /* renamed from: a */
    public final void mo9902a(boolean z) {
        if (z) {
            List<FilterModel> a = f11673c.mo9890a();
            this.f11674a = a;
            if (!C13603b.m24435a((Collection) a) && AbstractC6804a.f16886O.mo13066a().intValue() > 0 && AbstractC6804a.f16886O.mo13066a().intValue() < this.f11674a.size() && this.f11675b != null) {
                mo9880a(AbstractC6804a.f16886O.mo13066a().intValue());
            }
        }
    }

    @Override // com.bytedance.android.live.effect.api.AbstractC4169e
    /* renamed from: a */
    public final void mo9883a(FilterModel filterModel, float f) {
        C4313c cVar = this.f11675b;
        if (cVar != null) {
            cVar.mo9993a(filterModel.getFilterPath(), f);
        }
    }

    /* renamed from: a */
    private void m10281a(int i, int i2) {
        String str;
        if (i < this.f11674a.size() && i2 < this.f11674a.size()) {
            C6806c.m14603a(AbstractC6804a.f16886O, Integer.valueOf(i2));
            C6779a.m14563a().mo13053a(new C3070c(i2));
            if (mo9888f() == 0 || this.f11674a.isEmpty()) {
                str = "";
            } else {
                str = this.f11674a.get(mo9888f()).getFilterPath();
            }
            if (i2 == 0) {
                C3854a.m9453a(3, "LiveFilterHelper", "FilterEffect unset");
                this.f11675b.mo9992a();
                return;
            }
            C3854a.m9453a(3, "LiveFilterHelper", "FilterEffect update file:".concat(String.valueOf(str)));
            m10282a(this.f11674a.get(mo9888f()));
        }
    }
}
