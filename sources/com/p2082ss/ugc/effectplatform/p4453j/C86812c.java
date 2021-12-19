package com.p2082ss.ugc.effectplatform.p4453j;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.effectplatform.C86687a;
import com.p2082ss.ugc.effectplatform.model.CategoryPageModel;
import com.p2082ss.ugc.effectplatform.model.EffectChannelResponse;
import com.p2082ss.ugc.effectplatform.model.PanelInfoModel;
import com.p2082ss.ugc.effectplatform.p4451h.AbstractC86796e;
import com.p2082ss.ugc.effectplatform.task.C86882al;
import com.p2082ss.ugc.effectplatform.task.C86936l;
import com.p2082ss.ugc.effectplatform.task.C86941m;
import com.p2082ss.ugc.effectplatform.task.C86962u;
import com.p2082ss.ugc.effectplatform.task.C86967v;
import com.p2082ss.ugc.effectplatform.task.FetchCategoryEffectTask;
import com.p2082ss.ugc.effectplatform.task.FetchPanelEffectListTask;
import com.p2082ss.ugc.effectplatform.task.FetchPanelInfoTask;
import com.p2082ss.ugc.effectplatform.util.C87006t;
import p4519d.p4520a.p4533f.AbstractC88065d;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.ugc.effectplatform.j.c */
public final class C86812c {

    /* renamed from: a */
    public final C86687a f195723a;

    static {
        Covode.recordClassIndex(102511);
    }

    public C86812c(C86687a aVar) {
        C89219l.m154719c(aVar, "");
        this.f195723a = aVar;
    }

    /* renamed from: a */
    public final String mo140044a(String str, AbstractC86796e<EffectChannelResponse> eVar) {
        String a = C87006t.m150696a();
        if (eVar != null) {
            this.f195723a.f195443K.mo140036a(a, eVar);
        }
        C86941m mVar = new C86941m(this.f195723a, str, a);
        C86882al alVar = this.f195723a.f195470z;
        if (alVar != null) {
            alVar.mo140600a(mVar);
        }
        return a;
    }

    /* renamed from: a */
    public final String mo140046a(String str, boolean z, AbstractC86796e<EffectChannelResponse> eVar) {
        AbstractC88065d fetchPanelEffectListTask;
        C89219l.m154719c(str, "");
        String a = C87006t.m150696a();
        this.f195723a.f195443K.mo140036a(a, eVar);
        if (z) {
            fetchPanelEffectListTask = new C86962u(this.f195723a, str, a);
        } else {
            fetchPanelEffectListTask = new FetchPanelEffectListTask(this.f195723a, str, null, a);
        }
        C86882al alVar = this.f195723a.f195470z;
        if (alVar != null) {
            alVar.mo140600a(fetchPanelEffectListTask);
        }
        return a;
    }

    /* renamed from: a */
    public final String mo140047a(String str, boolean z, String str2, int i, int i2, boolean z2, AbstractC86796e<PanelInfoModel> eVar) {
        AbstractC88065d fetchPanelInfoTask;
        C89219l.m154719c(str, "");
        String a = C87006t.m150696a();
        if (eVar != null) {
            this.f195723a.f195443K.mo140036a(a, eVar);
        }
        if (z2) {
            fetchPanelInfoTask = new C86967v(this.f195723a, str, a, z, str2, i, i2);
        } else {
            fetchPanelInfoTask = new FetchPanelInfoTask(this.f195723a, str, a, z, str2, i, i2, null);
        }
        C86882al alVar = this.f195723a.f195470z;
        if (alVar != null) {
            alVar.mo140600a(fetchPanelInfoTask);
        }
        return a;
    }

    /* renamed from: a */
    public final String mo140045a(String str, String str2, int i, int i2, int i3, String str3, boolean z, AbstractC86796e<CategoryPageModel> eVar) {
        AbstractC88065d fetchCategoryEffectTask;
        C89219l.m154719c(str, "");
        String a = C87006t.m150696a();
        if (eVar != null) {
            this.f195723a.f195443K.mo140036a(a, eVar);
        }
        if (z) {
            fetchCategoryEffectTask = new C86936l(this.f195723a, str, a, str2, i, i2, i3);
        } else {
            fetchCategoryEffectTask = new FetchCategoryEffectTask(this.f195723a, str, a, str2, i, i2, i3, str3, null);
        }
        C86882al alVar = this.f195723a.f195470z;
        if (alVar != null) {
            alVar.mo140600a(fetchCategoryEffectTask);
        }
        return a;
    }
}
