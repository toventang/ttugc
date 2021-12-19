package com.p2082ss.ugc.effectplatform.task;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.effectplatform.C86687a;
import com.p2082ss.ugc.effectplatform.model.C86840e;
import com.p2082ss.ugc.effectplatform.model.ProviderEffect;
import com.p2082ss.ugc.effectplatform.model.ProviderEffectModel;
import com.p2082ss.ugc.effectplatform.model.net.ProviderEffectListResponse;
import com.p2082ss.ugc.effectplatform.p4440a.p4442b.C86695b;
import com.p2082ss.ugc.effectplatform.p4440a.p4443c.C86701e;
import com.p2082ss.ugc.effectplatform.p4440a.p4443c.EnumC86699c;
import com.p2082ss.ugc.effectplatform.util.C86992i;
import com.p2082ss.ugc.effectplatform.util.C87002p;
import java.util.HashMap;
import java.util.List;
import p4519d.p4520a.p4530d.p4531a.C88045d;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.ugc.effectplatform.task.ai */
public final class C86878ai extends AbstractC86851a<ProviderEffectModel, ProviderEffectListResponse> {

    /* renamed from: c */
    public static final C86879a f195885c = new C86879a((byte) 0);

    /* renamed from: d */
    private final C86687a f195886d;

    /* renamed from: f */
    private final String f195887f;

    /* renamed from: g */
    private final String f195888g;

    /* renamed from: h */
    private final int f195889h;

    /* renamed from: i */
    private final int f195890i;

    /* renamed from: j */
    private final String f195891j;

    static {
        Covode.recordClassIndex(102643);
    }

    /* renamed from: com.ss.ugc.effectplatform.task.ai$a */
    public static final class C86879a {
        static {
            Covode.recordClassIndex(102644);
        }

        private C86879a() {
        }

        public /* synthetic */ C86879a(byte b) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.ugc.effectplatform.task.AbstractC86851a
    /* renamed from: c */
    public final C86701e mo140550c() {
        HashMap<String, String> a = C86992i.m150657a(this.f195886d, true);
        String str = this.f195888g;
        if (str != null) {
            a.put("library", str);
        }
        String str2 = this.f195887f;
        if (str2 != null) {
            a.put("word", str2);
        }
        a.put("cursor", String.valueOf(this.f195889h));
        a.put("count", String.valueOf(this.f195890i));
        String str3 = this.f195891j;
        if (str3 != null && !C89361p.m154870a((CharSequence) str3)) {
            a.put("giphy_type", this.f195891j);
        }
        return new C86701e(C87002p.m150693a(a, this.f195886d.f195433A + this.f195886d.f195445a + "/stickers/search"), EnumC86699c.GET, null, null, false, 60);
    }

    /* Return type fixed from 'com.ss.ugc.effectplatform.model.h' to match base method */
    @Override // com.p2082ss.ugc.effectplatform.task.AbstractC86851a
    /* renamed from: a */
    public final /* synthetic */ ProviderEffectListResponse mo140547a(C86695b bVar, String str) {
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(str, "");
        return (ProviderEffectListResponse) bVar.f195508a.convertJsonToObj(str, ProviderEffectListResponse.class);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.ugc.effectplatform.task.AbstractC86851a
    /* renamed from: a */
    public final void mo140549a(String str, String str2, C86840e eVar) {
        C89219l.m154719c(eVar, "");
        eVar.mo140160a(str, this.f195886d.f195433A, str2);
        super.mo140549a(str, str2, eVar);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [long, long, long, com.ss.ugc.effectplatform.model.h] */
    @Override // com.p2082ss.ugc.effectplatform.task.AbstractC86851a
    /* renamed from: a */
    public final /* synthetic */ void mo140548a(long j, long j2, long j3, ProviderEffectListResponse providerEffectListResponse) {
        List<ProviderEffect> sticker_list;
        ProviderEffectListResponse providerEffectListResponse2 = providerEffectListResponse;
        C89219l.m154719c(providerEffectListResponse2, "");
        ProviderEffectModel data = providerEffectListResponse2.getData();
        if (!(data == null || (sticker_list = data.getSticker_list()) == null)) {
            for (ProviderEffect providerEffect : sticker_list) {
                providerEffect.setPath(this.f195886d.f195453i + C88045d.f199951a + providerEffect.getId() + ".gif");
            }
            super.mo140548a(j, j2, j3, providerEffectListResponse2);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C86878ai(C86687a aVar, String str, String str2, String str3, int i, int i2, String str4) {
        super(aVar.f195462r.f199870a, aVar.f195461q, aVar.f195443K, str);
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(str, "");
        this.f195886d = aVar;
        this.f195887f = str2;
        this.f195888g = str3;
        this.f195889h = i;
        this.f195890i = i2;
        this.f195891j = str4;
    }
}
