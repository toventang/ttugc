package com.p2082ss.android.ugc.tools.infosticker.view.p4360a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.p2082ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.EnumC84444c;
import com.p2082ss.ugc.effectplatform.model.EffectCategoryModel;
import com.p2082ss.ugc.effectplatform.model.net.InfoStickerEffect;
import java.util.List;
import p4600h.C89378p;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.infosticker.view.a.g */
public final class C84636g {

    /* renamed from: a */
    public final EnumC84637h f189102a;

    /* renamed from: b */
    public final EnumC84639j f189103b;

    /* renamed from: c */
    public final List<Effect> f189104c;

    /* renamed from: d */
    public final List<ProviderEffect> f189105d;

    /* renamed from: e */
    public final List<InfoStickerEffect> f189106e;

    /* renamed from: f */
    public final int f189107f;

    /* renamed from: g */
    public final EffectCategoryResponse f189108g;

    /* renamed from: h */
    public final Integer f189109h;

    /* renamed from: i */
    public final EnumC84444c f189110i;

    /* renamed from: j */
    public final String f189111j;

    /* renamed from: k */
    public final EffectCategoryModel f189112k;

    /* renamed from: l */
    public final int f189113l;

    /* renamed from: m */
    public final List<C89378p<Effect, Integer>> f189114m;

    /* renamed from: n */
    public final EnumC84638i f189115n;

    static {
        Covode.recordClassIndex(98601);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C84636g)) {
            return false;
        }
        C84636g gVar = (C84636g) obj;
        return C89219l.m154714a(this.f189102a, gVar.f189102a) && C89219l.m154714a(this.f189103b, gVar.f189103b) && C89219l.m154714a(this.f189104c, gVar.f189104c) && C89219l.m154714a(this.f189105d, gVar.f189105d) && C89219l.m154714a(this.f189106e, gVar.f189106e) && this.f189107f == gVar.f189107f && C89219l.m154714a(this.f189108g, gVar.f189108g) && C89219l.m154714a(this.f189109h, gVar.f189109h) && C89219l.m154714a(this.f189110i, gVar.f189110i) && C89219l.m154714a(this.f189111j, gVar.f189111j) && C89219l.m154714a(this.f189112k, gVar.f189112k) && this.f189113l == gVar.f189113l && C89219l.m154714a(this.f189114m, gVar.f189114m) && C89219l.m154714a(this.f189115n, gVar.f189115n);
    }

    public final int hashCode() {
        EnumC84637h hVar = this.f189102a;
        int i = 0;
        int hashCode = (hVar != null ? hVar.hashCode() : 0) * 31;
        EnumC84639j jVar = this.f189103b;
        int hashCode2 = (hashCode + (jVar != null ? jVar.hashCode() : 0)) * 31;
        List<Effect> list = this.f189104c;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        List<ProviderEffect> list2 = this.f189105d;
        int hashCode4 = (hashCode3 + (list2 != null ? list2.hashCode() : 0)) * 31;
        List<InfoStickerEffect> list3 = this.f189106e;
        int hashCode5 = (((hashCode4 + (list3 != null ? list3.hashCode() : 0)) * 31) + this.f189107f) * 31;
        EffectCategoryResponse effectCategoryResponse = this.f189108g;
        int hashCode6 = (hashCode5 + (effectCategoryResponse != null ? effectCategoryResponse.hashCode() : 0)) * 31;
        Integer num = this.f189109h;
        int hashCode7 = (hashCode6 + (num != null ? num.hashCode() : 0)) * 31;
        EnumC84444c cVar = this.f189110i;
        int hashCode8 = (hashCode7 + (cVar != null ? cVar.hashCode() : 0)) * 31;
        String str = this.f189111j;
        int hashCode9 = (hashCode8 + (str != null ? str.hashCode() : 0)) * 31;
        EffectCategoryModel effectCategoryModel = this.f189112k;
        int hashCode10 = (((hashCode9 + (effectCategoryModel != null ? effectCategoryModel.hashCode() : 0)) * 31) + this.f189113l) * 31;
        List<C89378p<Effect, Integer>> list4 = this.f189114m;
        int hashCode11 = (hashCode10 + (list4 != null ? list4.hashCode() : 0)) * 31;
        EnumC84638i iVar = this.f189115n;
        if (iVar != null) {
            i = iVar.hashCode();
        }
        return hashCode11 + i;
    }

    public final String toString() {
        return "StickerViewEvent(eventType=" + this.f189102a + ", pageType=" + this.f189103b + ", effects=" + this.f189104c + ", providerEffects=" + this.f189105d + ", infoStickerEffects=" + this.f189106e + ", firstVisibleEffectPosition=" + this.f189107f + ", category=" + this.f189108g + ", stickerPosition=" + this.f189109h + ", stickerState=" + this.f189110i + ", providerKeyWord=" + this.f189111j + ", tabCategory=" + this.f189112k + ", tabIndex=" + this.f189113l + ", effectAndPositionList=" + this.f189114m + ", stickerViewLoadState=" + this.f189115n + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.List<? extends com.ss.android.ugc.effectmanager.effect.model.Effect> */
    /* JADX DEBUG: Multi-variable search result rejected for r12v0, resolved type: java.util.List<? extends h.p<? extends com.ss.android.ugc.effectmanager.effect.model.Effect, java.lang.Integer>> */
    /* JADX WARN: Multi-variable type inference failed */
    private C84636g(EnumC84637h hVar, EnumC84639j jVar, List<? extends Effect> list, List<ProviderEffect> list2, List<InfoStickerEffect> list3, int i, EffectCategoryResponse effectCategoryResponse, Integer num, EnumC84444c cVar, String str, List<? extends C89378p<? extends Effect, Integer>> list4, EnumC84638i iVar) {
        C89219l.m154721d(hVar, "");
        this.f189102a = hVar;
        this.f189103b = jVar;
        this.f189104c = list;
        this.f189105d = list2;
        this.f189106e = list3;
        this.f189107f = i;
        this.f189108g = effectCategoryResponse;
        this.f189109h = num;
        this.f189110i = cVar;
        this.f189111j = str;
        this.f189112k = null;
        this.f189113l = 0;
        this.f189114m = list4;
        this.f189115n = iVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C84636g(EnumC84637h hVar, EnumC84639j jVar, List list, List list2, List list3, int i, EffectCategoryResponse effectCategoryResponse, Integer num, EnumC84444c cVar, String str, List list4, EnumC84638i iVar, int i2) {
        this(hVar, (i2 & 2) != 0 ? null : jVar, (i2 & 4) != 0 ? null : list, (i2 & 8) != 0 ? null : list2, (i2 & 16) != 0 ? null : list3, (i2 & 32) != 0 ? 0 : i, (i2 & 64) != 0 ? null : effectCategoryResponse, (i2 & 128) != 0 ? null : num, (i2 & 256) != 0 ? null : cVar, (i2 & 512) != 0 ? null : str, (i2 & 4096) != 0 ? null : list4, (i2 & 8192) == 0 ? iVar : null);
    }
}
