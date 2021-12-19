package com.p2082ss.ugc.effectplatform.task;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.effectplatform.C86687a;
import com.p2082ss.ugc.effectplatform.model.C86840e;
import com.p2082ss.ugc.effectplatform.model.EffectChannelModel;
import com.p2082ss.ugc.effectplatform.model.EffectChannelResponse;
import com.p2082ss.ugc.effectplatform.model.net.EffectNetListResponse;
import com.p2082ss.ugc.effectplatform.model.p4456a.C86832a;
import com.p2082ss.ugc.effectplatform.p4440a.p4442b.C86695b;
import com.p2082ss.ugc.effectplatform.p4440a.p4443c.C86701e;
import com.p2082ss.ugc.effectplatform.p4440a.p4443c.EnumC86699c;
import com.p2082ss.ugc.effectplatform.p4444b.AbstractC86755f;
import com.p2082ss.ugc.effectplatform.p4446c.C86757a;
import com.p2082ss.ugc.effectplatform.p4451h.AbstractC86796e;
import com.p2082ss.ugc.effectplatform.p4452i.C86802b;
import com.p2082ss.ugc.effectplatform.util.C86989g;
import com.p2082ss.ugc.effectplatform.util.C86992i;
import com.p2082ss.ugc.effectplatform.util.C87002p;
import java.util.HashMap;
import java.util.Map;
import p4519d.p4520a.p4522b.C87993b;
import p4519d.p4520a.p4532e.C88060b;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.ugc.effectplatform.task.FetchPanelEffectListTask */
public final class FetchPanelEffectListTask extends AbstractC86851a<EffectChannelModel, EffectNetListResponse> {

    /* renamed from: f */
    public static final C86848a f195783f = new C86848a((byte) 0);

    /* renamed from: i */
    private static final String f195784i = f195784i;

    /* renamed from: c */
    public final C86687a f195785c;

    /* renamed from: d */
    public final String f195786d;

    /* renamed from: g */
    private final String f195787g;

    /* renamed from: h */
    private final Map<String, String> f195788h = null;

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.ugc.effectplatform.task.AbstractC86851a
    /* renamed from: e */
    public final int mo140552e() {
        return 10002;
    }

    /* renamed from: com.ss.ugc.effectplatform.task.FetchPanelEffectListTask$Version */
    public static final class Version {
        private String version;

        static {
            Covode.recordClassIndex(102610);
        }

        public Version() {
            this(null, 1, null);
        }

        public static /* synthetic */ Version copy$default(Version version2, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = version2.version;
            }
            return version2.copy(str);
        }

        public final String component1() {
            return this.version;
        }

        public final Version copy(String str) {
            return new Version(str);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof Version) && C89219l.m154714a(this.version, ((Version) obj).version);
            }
            return true;
        }

        public final int hashCode() {
            String str = this.version;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public final String toString() {
            return "Version(version=" + this.version + ")";
        }

        public final String getVersion() {
            return this.version;
        }

        public final void setVersion(String str) {
            this.version = str;
        }

        public Version(String str) {
            this.version = str;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Version(String str, int i, C89214g gVar) {
            this((i & 1) != 0 ? "0" : str);
        }
    }

    /* renamed from: com.ss.ugc.effectplatform.task.FetchPanelEffectListTask$a */
    public static final class C86848a {
        static {
            Covode.recordClassIndex(102611);
        }

        private C86848a() {
        }

        public /* synthetic */ C86848a(byte b) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.ugc.effectplatform.task.AbstractC86851a
    /* renamed from: d */
    public final int mo140551d() {
        return this.f195785c.f195458n;
    }

    static {
        Covode.recordClassIndex(102609);
    }

    /* renamed from: com.ss.ugc.effectplatform.task.FetchPanelEffectListTask$b */
    static final class C86849b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ FetchPanelEffectListTask f195789a;

        /* renamed from: b */
        final /* synthetic */ EffectChannelResponse f195790b;

        static {
            Covode.recordClassIndex(102612);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C86849b(FetchPanelEffectListTask fetchPanelEffectListTask, EffectChannelResponse effectChannelResponse) {
            super(0);
            this.f195789a = fetchPanelEffectListTask;
            this.f195790b = effectChannelResponse;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            AbstractC86796e a = this.f195789a.f195785c.f195443K.mo140035a(this.f195789a.f195786d);
            if (a != null) {
                a.onSuccess(this.f195790b);
            }
            this.f195789a.f195785c.f195443K.mo140037b(this.f195789a.f195786d);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.ugc.effectplatform.task.AbstractC86851a
    /* renamed from: c */
    public final C86701e mo140550c() {
        HashMap<String, String> a = C86992i.m150657a(this.f195785c, true);
        a.put("panel", this.f195787g);
        Map<String, String> map = this.f195788h;
        if (map != null) {
            a.putAll(map);
        }
        return new C86701e(C87002p.m150693a(a, this.f195785c.f195433A + this.f195785c.f195445a + "/v3/effects"), EnumC86699c.GET, null, null, false, 60);
    }

    /* renamed from: a */
    private final long m150424a(EffectChannelModel effectChannelModel) {
        String convertObjToJson;
        AbstractC86755f fVar;
        String convertObjToJson2;
        long j;
        long j2 = 0;
        if (effectChannelModel == null) {
            return 0;
        }
        String a = C86989g.m150648a(this.f195785c.f195450f, this.f195787g);
        try {
            C86695b bVar = this.f195785c.f195461q;
            if (!(bVar == null || (convertObjToJson2 = bVar.f195508a.convertObjToJson(effectChannelModel)) == null)) {
                AbstractC86755f fVar2 = (AbstractC86755f) C87993b.m153064a(this.f195785c.f195467w);
                if (fVar2 != null) {
                    j = fVar2.mo140005a(a, convertObjToJson2);
                } else {
                    j = 0;
                }
                j2 = j / ((long) C86757a.f195654a);
            }
        } catch (Exception e) {
            C88060b.m153136a(f195784i, "Exception: ".concat(String.valueOf(e)), null);
        }
        try {
            Version version = new Version(effectChannelModel.getVersion());
            C86695b bVar2 = this.f195785c.f195461q;
            if (!(bVar2 == null || (convertObjToJson = bVar2.f195508a.convertObjToJson(version)) == null || (fVar = (AbstractC86755f) C87993b.m153064a(this.f195785c.f195467w)) == null)) {
                fVar.mo140005a("effect_version" + this.f195787g, convertObjToJson);
            }
        } catch (Exception e2) {
            C88060b.m153136a("FetchPanelInfoTask", "Json Exception: ".concat(String.valueOf(e2)), null);
        }
        return j2;
    }

    /* Return type fixed from 'com.ss.ugc.effectplatform.model.h' to match base method */
    @Override // com.p2082ss.ugc.effectplatform.task.AbstractC86851a
    /* renamed from: a */
    public final /* synthetic */ EffectNetListResponse mo140547a(C86695b bVar, String str) {
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(str, "");
        return (EffectNetListResponse) bVar.f195508a.convertJsonToObj(str, EffectNetListResponse.class);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.ugc.effectplatform.task.AbstractC86851a
    /* renamed from: a */
    public final void mo140549a(String str, String str2, C86840e eVar) {
        C89219l.m154719c(eVar, "");
        eVar.mo140160a(str, this.f195785c.f195433A, str2);
        super.mo140549a(str, str2, eVar);
        V v = this.f195785c.f195463s.f199870a;
        if (v != null) {
            C86687a aVar = this.f195785c;
            String str3 = this.f195787g;
            C89378p[] pVarArr = new C89378p[2];
            pVarArr[0] = C89387v.m154943a("error_code", Integer.valueOf(eVar.f195756a));
            if (str2 == null) {
                str2 = "";
            }
            pVarArr[1] = C89387v.m154943a("host_ip", str2);
            C86802b.m150357b(v, false, aVar, str3, C89041ag.m154421a(pVarArr), eVar.f195757b);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FetchPanelEffectListTask(C86687a aVar, String str, Map<String, String> map, String str2) {
        super(aVar.f195462r.f199870a, aVar.f195461q, aVar.f195443K, str2);
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        this.f195785c = aVar;
        this.f195787g = str;
        this.f195786d = str2;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [long, long, long, com.ss.ugc.effectplatform.model.h] */
    @Override // com.p2082ss.ugc.effectplatform.task.AbstractC86851a
    /* renamed from: a */
    public final /* synthetic */ void mo140548a(long j, long j2, long j3, EffectNetListResponse effectNetListResponse) {
        EffectNetListResponse effectNetListResponse2 = effectNetListResponse;
        C89219l.m154719c(effectNetListResponse2, "");
        EffectChannelModel data = effectNetListResponse2.getData();
        if (data != null) {
            EffectChannelResponse a = new C86832a(this.f195787g, this.f195785c.f195453i, false).mo140149a(data);
            long a2 = m150424a(data);
            m150523a(new C86849b(this, a));
            long currentTimeMillis = System.currentTimeMillis();
            V v = this.f195785c.f195463s.f199870a;
            if (v != null) {
                C86802b.m150357b(v, true, this.f195785c, this.f195787g, C89041ag.m154421a(C89387v.m154943a("duration", Long.valueOf(currentTimeMillis - j)), C89387v.m154943a("network_time", Long.valueOf(j2 - j)), C89387v.m154943a("json_time", Long.valueOf(j3 - j2)), C89387v.m154943a("io_time", Long.valueOf(currentTimeMillis - j3)), C89387v.m154943a("size", Long.valueOf(a2))), "");
            }
        }
    }
}
