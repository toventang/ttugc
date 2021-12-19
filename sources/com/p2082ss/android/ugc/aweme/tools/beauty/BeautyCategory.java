package com.p2082ss.android.ugc.aweme.tools.beauty;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.p2082ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import java.util.List;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.beauty.BeautyCategory */
public final class BeautyCategory {
    private final BeautyCategoryExtra beautyCategoryExtra;
    private final List<ComposerBeauty> beautyList;
    private final EffectCategoryResponse categoryResponse;
    private boolean selected;

    static {
        Covode.recordClassIndex(90902);
    }

    public final BeautyCategoryExtra getBeautyCategoryExtra() {
        return this.beautyCategoryExtra;
    }

    public final List<ComposerBeauty> getBeautyList() {
        return this.beautyList;
    }

    public final EffectCategoryResponse getCategoryResponse() {
        return this.categoryResponse;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    public final int hashCode() {
        Integer num;
        String id = this.categoryResponse.getId();
        if (id != null) {
            num = Integer.valueOf(id.hashCode());
        } else {
            num = null;
        }
        return num.intValue();
    }

    public final void setSelected(boolean z) {
        this.selected = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BeautyCategory) {
            return C89219l.m154714a((Object) ((BeautyCategory) obj).categoryResponse.getId(), (Object) this.categoryResponse.getId());
        }
        return false;
    }

    public BeautyCategory(EffectCategoryResponse effectCategoryResponse, BeautyCategoryExtra beautyCategoryExtra2, List<ComposerBeauty> list, boolean z) {
        C89219l.m154721d(effectCategoryResponse, "");
        C89219l.m154721d(beautyCategoryExtra2, "");
        C89219l.m154721d(list, "");
        this.categoryResponse = effectCategoryResponse;
        this.beautyCategoryExtra = beautyCategoryExtra2;
        this.beautyList = list;
        this.selected = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BeautyCategory(EffectCategoryResponse effectCategoryResponse, BeautyCategoryExtra beautyCategoryExtra2, List list, boolean z, int i, C89214g gVar) {
        this(effectCategoryResponse, beautyCategoryExtra2, list, (i & 8) != 0 ? false : z);
    }
}
