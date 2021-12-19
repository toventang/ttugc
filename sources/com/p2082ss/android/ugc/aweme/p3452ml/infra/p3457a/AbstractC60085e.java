package com.p2082ss.android.ugc.aweme.p3452ml.infra.p3457a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.p2160ml.AbstractC30090l;
import com.p2082ss.android.p2160ml.C30091m;
import com.p2082ss.android.p2160ml.C30094o;
import com.p2082ss.android.p2160ml.C30096p;
import com.p2082ss.android.ugc.aweme.p3452ml.infra.SmartSceneConfig;
import com.p2082ss.android.ugc.aweme.p3452ml.p3453a.C59975a;
import com.p2082ss.android.ugc.aweme.p3452ml.p3454ab.C59991f;
import java.util.Map;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ml.infra.a.e */
public abstract class AbstractC60085e extends AbstractC60086f {

    /* renamed from: a */
    public C30091m f136910a;

    /* renamed from: b */
    public long f136911b;

    /* renamed from: c */
    public int f136912c;

    static {
        Covode.recordClassIndex(70593);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3452ml.infra.p3457a.AbstractC60086f
    /* renamed from: c */
    public final void mo97620c() {
        C30091m mVar = this.f136910a;
        if (mVar != null) {
            mVar.mo53464b();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3452ml.infra.p3457a.AbstractC60086f
    /* renamed from: b */
    public final boolean mo97619b() {
        C30091m mVar = this.f136910a;
        if (mVar != null) {
            return mVar.mo53465c();
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3452ml.infra.p3457a.AbstractC60086f
    /* renamed from: a */
    public final boolean mo97617a() {
        boolean z;
        boolean z2;
        AbstractC30090l lVar;
        C30091m mVar = this.f136910a;
        if (mVar != null) {
            z = mVar.mo53465c();
        } else {
            z = false;
        }
        C30091m mVar2 = this.f136910a;
        if (mVar2 == null || (lVar = mVar2.f71806b) == null) {
            z2 = false;
        } else {
            z2 = lVar.mo53459a();
        }
        if (!z || !z2) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3452ml.infra.p3457a.AbstractC60086f
    /* renamed from: d */
    public final boolean mo97621d() {
        C30091m mVar;
        if (!super.mo97621d() || (mVar = this.f136910a) == null || !mVar.mo53465c()) {
            return false;
        }
        return true;
    }

    public AbstractC60085e(SmartSceneConfig smartSceneConfig) {
        super(smartSceneConfig);
        if (smartSceneConfig != null && !smartSceneConfig.getDisable()) {
            C30091m mVar = new C30091m(new C60082b(smartSceneConfig));
            this.f136910a = mVar;
            mVar.f71811g = this.f136914e;
            if (mVar.f71806b != null) {
                mVar.f71806b.mo53458a(mVar.f71811g);
            }
            C30094o a = C30096p.m60883a(this.f136913d);
            if (a != null) {
                a.f71819a = C59991f.m109509a(this.f136913d);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3452ml.infra.p3457a.AbstractC60086f
    /* renamed from: a */
    public final void mo97616a(boolean z, JSONObject jSONObject) {
        C89219l.m154721d(jSONObject, "");
        if (!z) {
            jSONObject.put("sdk_duration", this.f136911b);
            jSONObject.put("sdk_success", this.f136912c);
            C30094o a = C30096p.m60883a(this.f136913d);
            if (a != null) {
                C30094o.C30095a aVar = a.f71830l;
                if (aVar != null && aVar.mo53482a() >= 0.0f) {
                    jSONObject.put("pre_cost", Float.valueOf(aVar.mo53482a()));
                }
                C30094o.C30095a aVar2 = a.f71831m;
                if (aVar2 != null && aVar2.mo53482a() >= 0.0f) {
                    jSONObject.put("infer_cost", Float.valueOf(aVar2.mo53482a()));
                }
                C30094o.C30095a aVar3 = a.f71832n;
                if (aVar3 != null && aVar3.mo53482a() >= 0.0f) {
                    jSONObject.put("post_cost", Float.valueOf(aVar3.mo53482a()));
                }
                a.mo53471a();
                return;
            }
            return;
        }
        C30094o a2 = C30096p.m60883a(this.f136913d);
        if (a2 != null) {
            C30094o.C30095a aVar4 = a2.f71824f;
            if (aVar4 != null && aVar4.mo53482a() >= 0.0f) {
                jSONObject.put("download_cost", Float.valueOf(aVar4.mo53482a()));
                aVar4.mo53483b();
            }
            C30094o.C30095a aVar5 = a2.f71825g;
            if (aVar5 != null && aVar5.mo53482a() >= 0.0f) {
                jSONObject.put("model_cost", Float.valueOf(aVar5.mo53482a()));
                aVar5.mo53483b();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo97618a(C30091m mVar, C60087g gVar, AbstractC60081a aVar) {
        Map<String, Object> map;
        this.f136911b = -1;
        this.f136912c = -100;
        if (mVar == null || !mo97621d()) {
            if (C59975a.f136570a) {
                mo97621d();
            }
            if (aVar != null) {
                aVar.mo97584a(false, -1, null);
            }
            return false;
        } else if (gVar == null || (map = gVar.f136917a) == null || map.isEmpty()) {
            if (aVar != null) {
                aVar.mo97584a(false, -3, null);
            }
            return false;
        } else if (!mVar.mo53464b()) {
            this.f136912c = -2;
            if (aVar != null) {
                aVar.mo97584a(false, -2, null);
            }
            return false;
        } else if (mVar.f71806b != null) {
            return true;
        } else {
            this.f136912c = -4;
            if (aVar != null) {
                aVar.mo97584a(false, -4, null);
            }
            return false;
        }
    }
}
