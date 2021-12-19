package com.p2082ss.ugc.effectplatform.task;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.effectplatform.C86687a;
import com.p2082ss.ugc.effectplatform.model.C86840e;
import com.p2082ss.ugc.effectplatform.model.GifProviderEffectModel;
import com.p2082ss.ugc.effectplatform.model.ProviderEffect;
import com.p2082ss.ugc.effectplatform.model.ProviderEffectModel;
import com.p2082ss.ugc.effectplatform.model.net.GifProviderEffectListResponse;
import com.p2082ss.ugc.effectplatform.p4440a.p4442b.C86695b;
import com.p2082ss.ugc.effectplatform.p4440a.p4443c.C86701e;
import com.p2082ss.ugc.effectplatform.p4451h.AbstractC86794c;
import com.p2082ss.ugc.effectplatform.p4451h.AbstractC86795d;
import com.p2082ss.ugc.effectplatform.p4451h.AbstractC86796e;
import com.p2082ss.ugc.effectplatform.util.C86992i;
import com.p2082ss.ugc.effectplatform.util.C87002p;
import com.p2082ss.ugc.effectplatform.util.C87006t;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p4519d.p4520a.p4530d.p4531a.C88045d;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.ugc.effectplatform.task.w */
public final class C86972w extends AbstractC86851a<GifProviderEffectModel, GifProviderEffectListResponse> {

    /* renamed from: c */
    private String f196092c;

    /* renamed from: d */
    private String f196093d;

    /* renamed from: f */
    private String f196094f;

    /* renamed from: g */
    private final C86687a f196095g;

    /* renamed from: h */
    private final String f196096h;

    /* renamed from: i */
    private final String f196097i;

    /* renamed from: j */
    private final String f196098j;

    /* renamed from: k */
    private final Map<String, String> f196099k;

    /* renamed from: l */
    private final boolean f196100l;

    static {
        Covode.recordClassIndex(102737);
    }

    /* renamed from: com.ss.ugc.effectplatform.task.w$a */
    static final class C86973a extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC86796e f196101a;

        /* renamed from: b */
        final /* synthetic */ GifProviderEffectListResponse f196102b;

        static {
            Covode.recordClassIndex(102738);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C86973a(AbstractC86796e eVar, GifProviderEffectListResponse gifProviderEffectListResponse) {
            super(0);
            this.f196101a = eVar;
            this.f196102b = gifProviderEffectListResponse;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f196101a.onSuccess(this.f196102b);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.ugc.effectplatform.task.w$b */
    public static final class C86974b implements AbstractC86795d {

        /* renamed from: a */
        public final List<ProviderEffect> f196103a = new ArrayList();

        /* renamed from: b */
        public final List<ProviderEffect> f196104b = new ArrayList();

        /* renamed from: c */
        public final C86840e f196105c;

        /* renamed from: d */
        public int f196106d;

        /* renamed from: e */
        final /* synthetic */ C86972w f196107e;

        /* renamed from: f */
        final /* synthetic */ GifProviderEffectListResponse f196108f;

        /* renamed from: g */
        final /* synthetic */ List f196109g;

        static {
            Covode.recordClassIndex(102739);
        }

        @Override // com.p2082ss.ugc.effectplatform.p4451h.AbstractC86795d
        public final void onProgress(ProviderEffect providerEffect, int i, long j) {
        }

        /* renamed from: a */
        private final boolean m150619a() {
            if (this.f196103a.size() + this.f196104b.size() == this.f196106d) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        private final void m150620b() {
            if (this.f196104b.size() > 0) {
                C86972w wVar = this.f196107e;
                GifProviderEffectListResponse gifProviderEffectListResponse = this.f196108f;
                C86840e eVar = this.f196105c;
                if (eVar == null) {
                    eVar = new C86840e(1);
                }
                wVar.mo140615a(gifProviderEffectListResponse, eVar);
                return;
            }
            this.f196107e.mo140616a(this.f196108f, this.f196109g);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.p2082ss.ugc.effectplatform.p4451h.AbstractC86796e
        public final /* synthetic */ void onSuccess(ProviderEffect providerEffect) {
            C89219l.m154719c(providerEffect, "");
            this.f196103a.add(providerEffect);
            if (m150619a()) {
                m150620b();
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.ss.ugc.effectplatform.model.e] */
        @Override // com.p2082ss.ugc.effectplatform.p4451h.AbstractC86796e
        public final /* synthetic */ void onFail(ProviderEffect providerEffect, C86840e eVar) {
            C89219l.m154719c(eVar, "");
            this.f196104b.add(providerEffect);
            if (m150619a()) {
                m150620b();
            }
        }

        C86974b(C86972w wVar, GifProviderEffectListResponse gifProviderEffectListResponse, List list) {
            this.f196107e = wVar;
            this.f196108f = gifProviderEffectListResponse;
            this.f196109g = list;
            this.f196106d = list.size();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.ugc.effectplatform.task.AbstractC86851a
    /* renamed from: c */
    public final C86701e mo140550c() {
        HashMap<String, String> a = C86992i.m150657a(this.f196095g, true);
        a.put("gif_id", this.f196097i);
        String str = this.f196098j;
        if (str != null && !C89361p.m154870a((CharSequence) str)) {
            a.put("giphy_type", this.f196098j);
        }
        Map<String, String> map = this.f196099k;
        if (map != null) {
            a.putAll(map);
        }
        return new C86701e(C87002p.m150693a(a, this.f196095g.f195433A + this.f196095g.f195445a + "/stickers/list"), null, null, null, false, 62);
    }

    /* Return type fixed from 'com.ss.ugc.effectplatform.model.h' to match base method */
    @Override // com.p2082ss.ugc.effectplatform.task.AbstractC86851a
    /* renamed from: a */
    public final /* synthetic */ GifProviderEffectListResponse mo140547a(C86695b bVar, String str) {
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(str, "");
        return (GifProviderEffectListResponse) bVar.f195508a.convertJsonToObj(str, GifProviderEffectListResponse.class);
    }

    /* renamed from: a */
    public final void mo140615a(GifProviderEffectListResponse gifProviderEffectListResponse, C86840e eVar) {
        AbstractC86796e a = this.f196095g.f195443K.mo140035a(this.f196096h);
        if (a instanceof AbstractC86794c) {
            ((AbstractC86794c) a).mo116409a(eVar);
        } else if (a != null) {
            a.onFail(gifProviderEffectListResponse, eVar);
        }
        this.f196095g.f195443K.mo140037b(this.f196096h);
    }

    /* renamed from: a */
    public final void mo140616a(GifProviderEffectListResponse gifProviderEffectListResponse, List<? extends ProviderEffect> list) {
        AbstractC86796e a = this.f196095g.f195443K.mo140035a(this.f196096h);
        if (a instanceof AbstractC86794c) {
            ((AbstractC86794c) a).mo116410a(list);
        } else if (a != null) {
            a.onSuccess(gifProviderEffectListResponse);
        }
        this.f196095g.f195443K.mo140037b(this.f196096h);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.ugc.effectplatform.task.AbstractC86851a
    /* renamed from: a */
    public final void mo140549a(String str, String str2, C86840e eVar) {
        C89219l.m154719c(eVar, "");
        eVar.mo140160a(this.f196092c, this.f196093d, this.f196094f);
        super.mo140549a(str, str2, eVar);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [long, long, long, com.ss.ugc.effectplatform.model.h] */
    @Override // com.p2082ss.ugc.effectplatform.task.AbstractC86851a
    /* renamed from: a */
    public final /* synthetic */ void mo140548a(long j, long j2, long j3, GifProviderEffectListResponse gifProviderEffectListResponse) {
        List<ProviderEffect> list;
        ProviderEffectModel gifs;
        GifProviderEffectListResponse gifProviderEffectListResponse2 = gifProviderEffectListResponse;
        C89219l.m154719c(gifProviderEffectListResponse2, "");
        GifProviderEffectModel data = gifProviderEffectListResponse2.getData();
        if (data == null || (gifs = data.getGifs()) == null) {
            list = null;
        } else {
            list = gifs.getSticker_list();
        }
        if (list != null && !list.isEmpty()) {
            for (ProviderEffect providerEffect : list) {
                providerEffect.setPath(this.f196095g.f195453i + C88045d.f199951a + providerEffect.getId() + ".gif");
            }
        }
        if (!this.f196100l || list == null || list.isEmpty()) {
            super.mo140548a(j, j2, j3, gifProviderEffectListResponse2);
            return;
        }
        AbstractC86796e a = this.f196095g.f195443K.mo140035a(this.f196096h);
        if (a instanceof AbstractC86794c) {
            m150523a(new C86973a(a, gifProviderEffectListResponse2));
        }
        C86974b bVar = new C86974b(this, gifProviderEffectListResponse2, list);
        for (ProviderEffect providerEffect2 : list) {
            String a2 = C87006t.m150696a();
            this.f196095g.f195443K.mo140036a(a2, bVar);
            C86882al alVar = this.f196095g.f195470z;
            if (alVar != null) {
                alVar.mo140600a(new C86923i(this.f196095g, providerEffect2, a2));
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C86972w(C86687a aVar, String str, String str2, String str3, Map<String, String> map, boolean z) {
        super(aVar.f195462r.f199870a, aVar.f195461q, aVar.f195443K, str);
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        this.f196095g = aVar;
        this.f196096h = str;
        this.f196097i = str2;
        this.f196098j = str3;
        this.f196099k = map;
        this.f196100l = z;
    }
}
