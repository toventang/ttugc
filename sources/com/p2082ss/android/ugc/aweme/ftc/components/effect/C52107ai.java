package com.p2082ss.android.ugc.aweme.ftc.components.effect;

import androidx.lifecycle.AbstractC1214u;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.effect.EffectModel;
import com.p2082ss.android.ugc.aweme.effect.EffectPointModel;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.model.VEEffectSelectOp;
import dmt.p4542av.video.C88292p;
import dmt.p4542av.video.C88296t;
import java.util.Collection;

/* renamed from: com.ss.android.ugc.aweme.ftc.components.effect.ai */
final /* synthetic */ class C52107ai implements AbstractC1214u {

    /* renamed from: a */
    private final C52125f f120029a;

    static {
        Covode.recordClassIndex(61488);
    }

    C52107ai(C52125f fVar) {
        this.f120029a = fVar;
    }

    @Override // androidx.lifecycle.AbstractC1214u
    public final void onChanged(Object obj) {
        C88292p value;
        long G;
        C88292p a;
        C52125f fVar = this.f120029a;
        VEEffectSelectOp vEEffectSelectOp = (VEEffectSelectOp) obj;
        if (vEEffectSelectOp != null) {
            int i = vEEffectSelectOp.mType;
            if (i == 1) {
                fVar.mo87851b(vEEffectSelectOp.mTimePosition, false);
            } else if (i == 2) {
                EffectModel effectModel = vEEffectSelectOp.mEffectModel;
                if (!fVar.f120063B.mo78735b()) {
                    C88292p b = C88292p.m153431b(effectModel.resDir, fVar.f120063B.mo78732a());
                    b.f200339e = fVar.f120063B.mo78737d();
                    b.f200343i = effectModel.color;
                    b.f200345k = effectModel.key;
                    b.f200346l = effectModel.name;
                    b.f200342h = fVar.f120063B.mo78736c();
                    b.f200348n = effectModel.category;
                    b.f200347m = effectModel.duration;
                    b.f200349o = effectModel.extra;
                    fVar.f120094d.setValue(b);
                    fVar.mo87862i();
                    long j = b.f200339e + ((long) effectModel.duration);
                    C88292p a2 = C88292p.m153426a((long) fVar.f120062A.mo56386s((int) j));
                    a2.f200340f = j;
                    a2.f200342h = fVar.f120063B.mo78736c();
                    fVar.f120094d.setValue(a2);
                }
            } else if (i == 3) {
                int i2 = vEEffectSelectOp.action;
                EffectModel effectModel2 = vEEffectSelectOp.mEffectModel;
                if (i2 == 0) {
                    if (fVar.f120062A == null) {
                        C63244g.m114602a().mo73263I().mo101628a("VEEffectHelper selectFilterEffect mVEEditor is null");
                    } else if (!fVar.f120063B.mo78735b()) {
                        C88292p b2 = C88292p.m153431b(effectModel2.resDir, fVar.f120063B.mo78732a());
                        b2.f200339e = fVar.f120063B.mo78737d();
                        b2.f200343i = effectModel2.color;
                        b2.f200345k = effectModel2.key;
                        b2.f200346l = effectModel2.name;
                        b2.f200342h = fVar.f120063B.mo78736c();
                        b2.f200348n = effectModel2.category;
                        b2.f200349o = effectModel2.extra;
                        fVar.f120094d.setValue(b2);
                        fVar.mo87862i();
                    }
                } else if (i2 == 1 && (value = fVar.f120094d.getValue()) != null && value.f200341g == 0) {
                    C88292p a3 = C88292p.m153426a(fVar.f120063B.mo78732a());
                    a3.f200340f = fVar.f120063B.mo78737d();
                    a3.f200342h = fVar.f120063B.mo78736c();
                    fVar.f120094d.setValue(a3);
                    fVar.mo87863j();
                }
            } else if (i == 4) {
                EffectModel effectModel3 = vEEffectSelectOp.mEffectModel;
                EffectPointModel effectPointModel = vEEffectSelectOp.mPreviousModel;
                fVar.f120095e.setValue(C88296t.m153438b(0));
                VideoEditViewModel videoEditViewModel = fVar.f120114x.getVideoEditViewModel();
                if (videoEditViewModel == null || C13603b.m24435a((Collection) videoEditViewModel.mo111231j()) || videoEditViewModel.mo111231j().size() != 1) {
                    G = (long) fVar.f120062A.mo56246G();
                } else {
                    G = videoEditViewModel.mo111231j().get(0).f156710b;
                }
                long a4 = fVar.f120063B.mo78733a(G);
                if (effectPointModel == null) {
                    a = C88292p.m153428a(effectModel3.resDir, a4);
                } else {
                    a = C88292p.m153429a(effectModel3.resDir, a4, effectPointModel.getIndex(), effectPointModel.getUuid());
                }
                a.f200339e = 0;
                a.f200340f = G;
                a.f200343i = effectModel3.color;
                a.f200345k = effectModel3.key;
                a.f200346l = effectModel3.name;
                a.f200342h = fVar.f120063B.mo78736c();
                a.f200348n = effectModel3.category;
                a.f200349o = effectModel3.extra;
                fVar.f120094d.setValue(a);
                fVar.mo87862i();
            }
        }
    }
}
