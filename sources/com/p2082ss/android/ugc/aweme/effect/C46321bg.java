package com.p2082ss.android.ugc.aweme.effect;

import android.text.TextUtils;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.shortvideo.C71817eu;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.StoryEditEtParam;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.model.VEEffectSelectOp;
import com.p2082ss.android.ugc.aweme.utils.C80322d;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import dmt.p4542av.video.C88292p;
import dmt.p4542av.video.C88296t;
import java.util.Collection;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.effect.bg */
public final /* synthetic */ class C46321bg implements AbstractC1214u {

    /* renamed from: a */
    private final C46267ac f107977a;

    static {
        Covode.recordClassIndex(54898);
    }

    public C46321bg(C46267ac acVar) {
        this.f107977a = acVar;
    }

    @Override // androidx.lifecycle.AbstractC1214u
    public final void onChanged(Object obj) {
        C88292p value;
        String str;
        String str2;
        long G;
        C88292p a;
        C46267ac acVar = this.f107977a;
        VEEffectSelectOp vEEffectSelectOp = (VEEffectSelectOp) obj;
        if (vEEffectSelectOp != null) {
            int i = vEEffectSelectOp.mType;
            if (i == 1) {
                acVar.mo78746a(vEEffectSelectOp.mTimePosition, false, true);
            } else if (i == 2) {
                EffectModel effectModel = vEEffectSelectOp.mEffectModel;
                if (!acVar.f107841B.mo78735b()) {
                    C88292p b = C88292p.m153431b(effectModel.resDir, acVar.f107841B.mo78732a());
                    b.f200339e = acVar.f107841B.mo78737d();
                    b.f200343i = effectModel.color;
                    b.f200345k = effectModel.key;
                    b.f200346l = effectModel.name;
                    b.f200342h = acVar.f107841B.mo78736c();
                    b.f200348n = effectModel.category;
                    b.f200347m = effectModel.duration;
                    b.f200349o = effectModel.extra;
                    acVar.f107876d.setValue(b);
                    acVar.mo78767k();
                    long j = b.f200339e + ((long) effectModel.duration);
                    C88292p a2 = C88292p.m153426a((long) acVar.f107840A.mo56386s((int) j));
                    a2.f200340f = j;
                    a2.f200342h = acVar.f107841B.mo78736c();
                    acVar.f107876d.setValue(a2);
                    C84425b a3 = new C84425b().mo129406a("creation_id", acVar.f107874b.creationId).mo129403a("scene_id", 1003).mo129406a("shoot_way", acVar.f107874b.mShootWay).mo129406a("tab_name", acVar.f107855P).mo129406a("effect_name", effectModel.name).mo129406a("effect_id", effectModel.key);
                    if (acVar.f107874b.draftId != 0) {
                        a3.mo129403a("draft_id", acVar.f107874b.draftId);
                    }
                    if (!TextUtils.isEmpty(acVar.f107874b.newDraftId)) {
                        a3.mo129406a("new_draft_id", acVar.f107874b.newDraftId);
                    }
                    C80322d.m139251a("effect_click", a3.f188764a);
                }
            } else if (i == 3) {
                int i2 = vEEffectSelectOp.action;
                EffectModel effectModel2 = vEEffectSelectOp.mEffectModel;
                if (i2 == 0) {
                    if (acVar.f107840A == null) {
                        C63244g.m114602a().mo73263I().mo101628a("VEEffectHelper selectFilterEffect mVEEditor is null");
                    } else if (!acVar.f107841B.mo78735b()) {
                        C88292p b2 = C88292p.m153431b(effectModel2.resDir, acVar.f107841B.mo78732a());
                        b2.f200339e = acVar.f107841B.mo78737d();
                        b2.f200343i = effectModel2.color;
                        b2.f200345k = effectModel2.key;
                        b2.f200346l = effectModel2.name;
                        b2.f200342h = acVar.f107841B.mo78736c();
                        b2.f200348n = effectModel2.category;
                        b2.f200349o = effectModel2.extra;
                        acVar.f107876d.setValue(b2);
                        acVar.mo78767k();
                        VideoPublishEditModel videoPublishEditModel = acVar.f107874b;
                        C89219l.m154721d(videoPublishEditModel, "");
                        C84425b bVar = new C84425b();
                        StoryEditEtParam storyEditEtParam = videoPublishEditModel.storyEditEtParam;
                        if (storyEditEtParam == null || (str = storyEditEtParam.getShootPage()) == null) {
                            str = "video_shoot_page";
                        }
                        C84425b a4 = bVar.mo129406a("shoot_page", str);
                        StoryEditEtParam storyEditEtParam2 = videoPublishEditModel.storyEditEtParam;
                        if ((storyEditEtParam2 == null || (str2 = storyEditEtParam2.getShootTabName()) == null) && (str2 = C71817eu.m126794e(videoPublishEditModel)) == null) {
                            str2 = "";
                        }
                        C84425b a5 = a4.mo129406a("shoot_tab_name", str2);
                        if (videoPublishEditModel.storyEditEtParam != null) {
                            StoryEditEtParam storyEditEtParam3 = videoPublishEditModel.storyEditEtParam;
                            a5.mo129403a("clips_cnt", storyEditEtParam3 != null ? storyEditEtParam3.getClipCount() : 1);
                        }
                        C89219l.m154716b(a5, "");
                        C84425b a6 = a5.mo129406a("creation_id", acVar.f107874b.creationId).mo129403a("scene_id", 1003).mo129406a("shoot_way", acVar.f107874b.mShootWay).mo129406a("tab_name", acVar.f107855P).mo129406a("effect_name", effectModel2.name).mo129406a("effect_id", effectModel2.key);
                        if (acVar.f107874b.draftId != 0) {
                            a6.mo129403a("draft_id", acVar.f107874b.draftId);
                        }
                        if (!TextUtils.isEmpty(acVar.f107874b.newDraftId)) {
                            a6.mo129406a("new_draft_id", acVar.f107874b.newDraftId);
                        }
                        C80322d.m139251a("effect_click", a6.f188764a);
                    }
                } else if (i2 == 1 && (value = acVar.f107876d.getValue()) != null && value.f200341g == 0) {
                    C88292p a7 = C88292p.m153426a(acVar.f107841B.mo78732a());
                    a7.f200340f = acVar.f107841B.mo78737d();
                    a7.f200342h = acVar.f107841B.mo78736c();
                    acVar.f107876d.setValue(a7);
                    acVar.mo78768l();
                }
            } else if (i == 4) {
                EffectModel effectModel3 = vEEffectSelectOp.mEffectModel;
                EffectPointModel effectPointModel = vEEffectSelectOp.mPreviousModel;
                acVar.f107877e.setValue(C88296t.m153438b(0));
                VideoEditViewModel videoEditViewModel = acVar.f107896x.getVideoEditViewModel();
                if (videoEditViewModel == null || C13603b.m24435a((Collection) videoEditViewModel.mo111231j()) || videoEditViewModel.mo111231j().size() != 1) {
                    G = (long) acVar.f107840A.mo56246G();
                } else {
                    G = videoEditViewModel.mo111231j().get(0).f156710b;
                }
                long a8 = acVar.f107841B.mo78733a(G);
                if (effectPointModel == null) {
                    a = C88292p.m153428a(effectModel3.resDir, a8);
                } else {
                    a = C88292p.m153429a(effectModel3.resDir, a8, effectPointModel.getIndex(), effectPointModel.getUuid());
                }
                a.f200339e = 0;
                a.f200340f = G;
                a.f200343i = effectModel3.color;
                a.f200345k = effectModel3.key;
                a.f200346l = effectModel3.name;
                a.f200342h = acVar.f107841B.mo78736c();
                a.f200348n = effectModel3.category;
                a.f200349o = effectModel3.extra;
                acVar.f107876d.setValue(a);
                acVar.mo78767k();
            }
        }
    }
}
