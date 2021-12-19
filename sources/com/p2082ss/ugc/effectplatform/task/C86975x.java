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
import com.p2082ss.ugc.effectplatform.p4444b.AbstractC86755f;
import com.p2082ss.ugc.effectplatform.util.C86989g;
import com.p2082ss.ugc.effectplatform.util.C86992i;
import com.p2082ss.ugc.effectplatform.util.C87002p;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p4519d.p4520a.p4522b.C87993b;
import p4519d.p4520a.p4530d.p4531a.C88045d;
import p4519d.p4520a.p4532e.C88060b;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.ugc.effectplatform.task.x */
public final class C86975x extends AbstractC86851a<ProviderEffectModel, ProviderEffectListResponse> {

    /* renamed from: c */
    public static final C86976a f196110c = new C86976a((byte) 0);

    /* renamed from: n */
    private static final String f196111n = f196111n;

    /* renamed from: d */
    private String f196112d;

    /* renamed from: f */
    private String f196113f;

    /* renamed from: g */
    private String f196114g;

    /* renamed from: h */
    private final C86687a f196115h;

    /* renamed from: i */
    private final String f196116i;

    /* renamed from: j */
    private final int f196117j;

    /* renamed from: k */
    private final int f196118k;

    /* renamed from: l */
    private final String f196119l;

    /* renamed from: m */
    private final Map<String, String> f196120m = null;

    /* renamed from: com.ss.ugc.effectplatform.task.x$a */
    public static final class C86976a {
        static {
            Covode.recordClassIndex(102741);
        }

        private C86976a() {
        }

        public /* synthetic */ C86976a(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(102740);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.ugc.effectplatform.task.AbstractC86851a
    /* renamed from: c */
    public final C86701e mo140550c() {
        HashMap<String, String> a = C86992i.m150657a(this.f196115h, true);
        String str = this.f196116i;
        if (str != null) {
            a.put("library", str);
        }
        a.put("cursor", String.valueOf(this.f196117j));
        a.put("count", String.valueOf(this.f196118k));
        String str2 = this.f196119l;
        if (str2 != null && !C89361p.m154870a((CharSequence) str2)) {
            a.put("giphy_type", this.f196119l);
        }
        Map<String, String> map = this.f196120m;
        if (map != null) {
            a.putAll(map);
        }
        return new C86701e(C87002p.m150693a(a, this.f196115h.f195433A + this.f196115h.f195445a + "/stickers/recommend"), EnumC86699c.GET, null, null, false, 60);
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
        eVar.mo140160a(this.f196112d, this.f196113f, this.f196114g);
        super.mo140549a(str, str2, eVar);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [long, long, long, com.ss.ugc.effectplatform.model.h] */
    @Override // com.p2082ss.ugc.effectplatform.task.AbstractC86851a
    /* renamed from: a */
    public final /* synthetic */ void mo140548a(long j, long j2, long j3, ProviderEffectListResponse providerEffectListResponse) {
        String convertObjToJson;
        AbstractC86755f fVar;
        List<ProviderEffect> sticker_list;
        ProviderEffectListResponse providerEffectListResponse2 = providerEffectListResponse;
        C89219l.m154719c(providerEffectListResponse2, "");
        ProviderEffectModel data = providerEffectListResponse2.getData();
        if (data != null) {
            if (!(data.getSticker_list() == null || (sticker_list = data.getSticker_list()) == null)) {
                for (ProviderEffect providerEffect : sticker_list) {
                    providerEffect.setPath(this.f196115h.f195453i + C88045d.f199951a + providerEffect.getId() + ".gif");
                }
            }
            try {
                String a = C86989g.m150648a(this.f196115h.f195450f, this.f196116i);
                C86695b bVar = this.f196115h.f195461q;
                if (!(bVar == null || (convertObjToJson = bVar.f195508a.convertObjToJson(data)) == null || (fVar = (AbstractC86755f) C87993b.m153064a(this.f196115h.f195467w)) == null)) {
                    fVar.mo140005a(a, convertObjToJson);
                }
            } catch (Exception e) {
                C88060b.m153136a(f196111n, String.valueOf(e), null);
            }
            super.mo140548a(j, j2, j3, providerEffectListResponse2);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C86975x(C86687a aVar, String str, String str2, int i, int i2, String str3) {
        super(aVar.f195462r.f199870a, aVar.f195461q, aVar.f195443K, str);
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(str, "");
        this.f196115h = aVar;
        this.f196116i = str2;
        this.f196117j = i;
        this.f196118k = i2;
        this.f196119l = str3;
    }
}
