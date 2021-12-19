package com.p2082ss.android.ugc.effectmanager.effect.model.template;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.ugc.effectplatform.model.CategoryEffectModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.effectmanager.effect.model.template.CategoryEffectModelTemplate */
public class CategoryEffectModelTemplate extends CategoryEffectModel {
    private List<? extends Effect> bindEffects;
    private String categoryKey;
    private List<? extends Effect> collectEffects;
    private boolean hasMore;
    private final transient CategoryEffectModel kCategoryEffect;
    private int sortingPosition;

    static {
        Covode.recordClassIndex(95615);
    }

    public CategoryEffectModelTemplate() {
        this(null, 1, null);
    }

    public CategoryEffectModel getKCategoryEffect() {
        return this.kCategoryEffect;
    }

    public boolean hasMore() {
        return getHasMore();
    }

    public boolean getHasMore() {
        CategoryEffectModel kCategoryEffect2 = getKCategoryEffect();
        if (kCategoryEffect2 != null) {
            return kCategoryEffect2.getHas_more();
        }
        return super.getHas_more();
    }

    public int getSortingPosition() {
        CategoryEffectModel kCategoryEffect2 = getKCategoryEffect();
        if (kCategoryEffect2 != null) {
            return kCategoryEffect2.getSorting_position();
        }
        return super.getSorting_position();
    }

    public String getCategoryKey() {
        String category_key;
        CategoryEffectModel kCategoryEffect2 = getKCategoryEffect();
        if (kCategoryEffect2 == null || (category_key = kCategoryEffect2.getCategory_key()) == null) {
            return super.getCategory_key();
        }
        return category_key;
    }

    public List<Effect> getBindEffects() {
        List<com.p2082ss.ugc.effectplatform.model.Effect> bind_effects;
        CategoryEffectModel kCategoryEffect2 = getKCategoryEffect();
        if (kCategoryEffect2 == null || (bind_effects = kCategoryEffect2.getBind_effects()) == null) {
            List<com.p2082ss.ugc.effectplatform.model.Effect> bind_effects2 = super.getBind_effects();
            ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) bind_effects2, 10));
            Iterator<T> it = bind_effects2.iterator();
            while (it.hasNext()) {
                arrayList.add(new Effect(it.next()));
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(C89070n.m154526a((Iterable) bind_effects, 10));
        Iterator<T> it2 = bind_effects.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new Effect(it2.next()));
        }
        return arrayList2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX DEBUG: Type inference failed for r1v4. Raw type applied. Possible types: java.util.List<com.ss.ugc.effectplatform.model.Effect> */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.ss.ugc.effectplatform.model.CategoryEffectModel, com.ss.android.ugc.effectmanager.effect.model.template.CategoryEffectModelTemplate] */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r1 == null) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<com.p2082ss.android.ugc.effectmanager.effect.model.Effect> getCollectEffects() {
        /*
            r5 = this;
            com.ss.ugc.effectplatform.model.CategoryEffectModel r4 = r5.getKCategoryEffect()
            if (r4 == 0) goto L_0x000c
            java.util.List r1 = r4.getCollection()
            if (r1 != 0) goto L_0x0010
        L_0x000c:
            java.util.List r1 = super.getCollection()
        L_0x0010:
            boolean r0 = r1.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0022
            r0 = 0
            java.lang.Object r0 = r1.get(r0)
            boolean r0 = r0 instanceof com.p2082ss.android.ugc.effectmanager.effect.model.Effect
            if (r0 == 0) goto L_0x0028
        L_0x0021:
            return r1
        L_0x0022:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            goto L_0x0021
        L_0x0028:
            java.util.ArrayList r3 = new java.util.ArrayList
            r0 = 10
            int r0 = p4600h.p4601a.C89070n.m154526a(r1, r0)
            r3.<init>(r0)
            java.util.Iterator r2 = r1.iterator()
        L_0x0037:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x004c
            java.lang.Object r1 = r2.next()
            com.ss.ugc.effectplatform.model.Effect r1 = (com.p2082ss.ugc.effectplatform.model.Effect) r1
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = new com.ss.android.ugc.effectmanager.effect.model.Effect
            r0.<init>(r1)
            r3.add(r0)
            goto L_0x0037
        L_0x004c:
            java.util.List r3 = (java.util.List) r3
            if (r4 == 0) goto L_0x0053
            r4.setCollection(r3)
        L_0x0053:
            super.setCollection(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.effectmanager.effect.model.template.CategoryEffectModelTemplate.getCollectEffects():java.util.List");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX DEBUG: Type inference failed for r1v4. Raw type applied. Possible types: java.util.List<com.ss.ugc.effectplatform.model.Effect> */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.ss.ugc.effectplatform.model.CategoryEffectModel, com.ss.android.ugc.effectmanager.effect.model.template.CategoryEffectModelTemplate] */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r1 == null) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<com.p2082ss.android.ugc.effectmanager.effect.model.Effect> getEffects() {
        /*
            r5 = this;
            com.ss.ugc.effectplatform.model.CategoryEffectModel r4 = r5.getKCategoryEffect()
            if (r4 == 0) goto L_0x000c
            java.util.List r1 = r4.getCategory_effects()
            if (r1 != 0) goto L_0x0010
        L_0x000c:
            java.util.List r1 = super.getCategory_effects()
        L_0x0010:
            boolean r0 = r1.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0022
            r0 = 0
            java.lang.Object r0 = r1.get(r0)
            boolean r0 = r0 instanceof com.p2082ss.android.ugc.effectmanager.effect.model.Effect
            if (r0 == 0) goto L_0x0028
        L_0x0021:
            return r1
        L_0x0022:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            goto L_0x0021
        L_0x0028:
            java.util.ArrayList r3 = new java.util.ArrayList
            r0 = 10
            int r0 = p4600h.p4601a.C89070n.m154526a(r1, r0)
            r3.<init>(r0)
            java.util.Iterator r2 = r1.iterator()
        L_0x0037:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x004c
            java.lang.Object r1 = r2.next()
            com.ss.ugc.effectplatform.model.Effect r1 = (com.p2082ss.ugc.effectplatform.model.Effect) r1
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = new com.ss.android.ugc.effectmanager.effect.model.Effect
            r0.<init>(r1)
            r3.add(r0)
            goto L_0x0037
        L_0x004c:
            java.util.List r3 = (java.util.List) r3
            if (r4 == 0) goto L_0x0053
            r4.setCategory_effects(r3)
        L_0x0053:
            super.setCategory_effects(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.effectmanager.effect.model.template.CategoryEffectModelTemplate.getEffects():java.util.List");
    }

    public void setHasMore(boolean z) {
        this.hasMore = z;
        CategoryEffectModel kCategoryEffect2 = getKCategoryEffect();
        if (kCategoryEffect2 != null) {
            kCategoryEffect2.setHas_more(z);
        }
        super.setHas_more(z);
    }

    public void setSortingPosition(int i) {
        this.sortingPosition = i;
        CategoryEffectModel kCategoryEffect2 = getKCategoryEffect();
        if (kCategoryEffect2 != null) {
            kCategoryEffect2.setSorting_position(i);
        }
        super.setSorting_position(i);
    }

    public void setBindEffects(List<? extends Effect> list) {
        C89219l.m154719c(list, "");
        this.bindEffects = list;
        CategoryEffectModel kCategoryEffect2 = getKCategoryEffect();
        if (kCategoryEffect2 != null) {
            kCategoryEffect2.setBind_effects(list);
        }
        super.setBind_effects(list);
    }

    public void setCategoryKey(String str) {
        C89219l.m154719c(str, "");
        this.categoryKey = str;
        CategoryEffectModel kCategoryEffect2 = getKCategoryEffect();
        if (kCategoryEffect2 != null) {
            kCategoryEffect2.setCategory_key(str);
        }
        super.setCategory_key(str);
    }

    public void setCollectEffects(List<? extends Effect> list) {
        C89219l.m154719c(list, "");
        this.collectEffects = list;
        CategoryEffectModel kCategoryEffect2 = getKCategoryEffect();
        if (kCategoryEffect2 != null) {
            kCategoryEffect2.setCollection(list);
        }
        super.setCollection(list);
    }

    public void setEffects(List<? extends Effect> list) {
        C89219l.m154719c(list, "");
        CategoryEffectModel kCategoryEffect2 = getKCategoryEffect();
        if (kCategoryEffect2 != null) {
            kCategoryEffect2.setCategory_effects(list);
        }
        super.setCategory_effects(list);
    }

    public CategoryEffectModelTemplate(CategoryEffectModel categoryEffectModel) {
        super(null, null, false, 0, 0, null, null, null, 255, null);
        this.kCategoryEffect = categoryEffectModel;
        this.collectEffects = new ArrayList();
        this.bindEffects = new ArrayList();
        this.categoryKey = "";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CategoryEffectModelTemplate(CategoryEffectModel categoryEffectModel, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : categoryEffectModel);
    }
}
