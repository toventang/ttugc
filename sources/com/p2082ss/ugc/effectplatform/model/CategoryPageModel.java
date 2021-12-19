package com.p2082ss.ugc.effectplatform.model;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.ugc.effectplatform.model.CategoryPageModel */
public class CategoryPageModel {
    private CategoryEffectModel category_effects;
    private Extra extra;
    private List<String> url_prefix;

    static {
        Covode.recordClassIndex(102526);
    }

    public CategoryPageModel() {
        this(null, null, null, 7, null);
    }

    /* renamed from: com.ss.ugc.effectplatform.model.CategoryPageModel$Extra */
    public static final class Extra {
        private String rec_id = "";

        static {
            Covode.recordClassIndex(102527);
        }

        public final String getRec_id() {
            return this.rec_id;
        }

        public final void setRec_id(String str) {
            C89219l.m154719c(str, "");
            this.rec_id = str;
        }
    }

    public CategoryEffectModel getCategory_effects() {
        return this.category_effects;
    }

    public final Extra getExtra() {
        return this.extra;
    }

    public List<String> getUrl_prefix() {
        return this.url_prefix;
    }

    public void setCategory_effects(CategoryEffectModel categoryEffectModel) {
        this.category_effects = categoryEffectModel;
    }

    public final void setExtra(Extra extra2) {
        this.extra = extra2;
    }

    public void setUrl_prefix(List<String> list) {
        C89219l.m154719c(list, "");
        this.url_prefix = list;
    }

    public CategoryPageModel(CategoryEffectModel categoryEffectModel, List<String> list, Extra extra2) {
        C89219l.m154719c(list, "");
        this.category_effects = categoryEffectModel;
        this.url_prefix = list;
        this.extra = extra2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CategoryPageModel(CategoryEffectModel categoryEffectModel, List list, Extra extra2, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : categoryEffectModel, (i & 2) != 0 ? new ArrayList() : list, (i & 4) != 0 ? null : extra2);
    }
}
