package com.p2082ss.ugc.effectplatform.task;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.effectplatform.C86687a;
import com.p2082ss.ugc.effectplatform.model.C86840e;
import com.p2082ss.ugc.effectplatform.model.CategoryEffectModel;
import com.p2082ss.ugc.effectplatform.model.PanelInfoModel;
import com.p2082ss.ugc.effectplatform.model.net.PanelInfoResponse;
import com.p2082ss.ugc.effectplatform.p4440a.p4442b.C86695b;
import com.p2082ss.ugc.effectplatform.p4440a.p4443c.C86701e;
import com.p2082ss.ugc.effectplatform.p4440a.p4443c.EnumC86699c;
import com.p2082ss.ugc.effectplatform.p4444b.AbstractC86755f;
import com.p2082ss.ugc.effectplatform.p4446c.C86757a;
import com.p2082ss.ugc.effectplatform.p4452i.C86802b;
import com.p2082ss.ugc.effectplatform.util.C86989g;
import com.p2082ss.ugc.effectplatform.util.C86992i;
import com.p2082ss.ugc.effectplatform.util.C86993j;
import com.p2082ss.ugc.effectplatform.util.C87002p;
import java.util.HashMap;
import java.util.Map;
import p4519d.p4520a.p4522b.C87991a;
import p4519d.p4520a.p4522b.C87993b;
import p4519d.p4520a.p4532e.C88060b;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.ugc.effectplatform.task.FetchPanelInfoTask */
public final class FetchPanelInfoTask extends AbstractC86851a<PanelInfoModel, PanelInfoResponse> {

    /* renamed from: c */
    public static final C86850a f195791c = new C86850a((byte) 0);

    /* renamed from: d */
    private C87991a<Long> f195792d = new C87991a<>(0L);

    /* renamed from: f */
    private final C86687a f195793f;

    /* renamed from: g */
    private final String f195794g;

    /* renamed from: h */
    private final boolean f195795h;

    /* renamed from: i */
    private final String f195796i;

    /* renamed from: j */
    private final int f195797j;

    /* renamed from: k */
    private final int f195798k;

    /* renamed from: l */
    private final Map<String, String> f195799l = null;

    static {
        Covode.recordClassIndex(102613);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.ugc.effectplatform.task.AbstractC86851a
    /* renamed from: e */
    public final int mo140552e() {
        return 10002;
    }

    /* renamed from: com.ss.ugc.effectplatform.task.FetchPanelInfoTask$Version */
    public static final class Version {
        private String version;

        static {
            Covode.recordClassIndex(102614);
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

    /* renamed from: com.ss.ugc.effectplatform.task.FetchPanelInfoTask$a */
    public static final class C86850a {
        static {
            Covode.recordClassIndex(102615);
        }

        private C86850a() {
        }

        public /* synthetic */ C86850a(byte b) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.ugc.effectplatform.task.AbstractC86851a
    /* renamed from: d */
    public final int mo140551d() {
        return this.f195793f.f195458n;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.ugc.effectplatform.task.AbstractC86851a
    /* renamed from: c */
    public final C86701e mo140550c() {
        String str;
        HashMap<String, String> a = C86992i.m150657a(this.f195793f, true);
        a.put("panel", this.f195794g);
        if (this.f195795h) {
            a.put("has_category_effects", "true");
            String str2 = this.f195796i;
            if (str2 == null) {
                str2 = "default";
            }
            a.put("category", str2);
            a.put("cursor", String.valueOf(this.f195798k));
            a.put("count", String.valueOf(this.f195797j));
        }
        String str3 = this.f195793f.f195469y;
        if (str3 != null) {
            a.put("test_status", str3);
        }
        Map<String, String> map = this.f195799l;
        if (map != null) {
            a.putAll(map);
        }
        EnumC86699c cVar = EnumC86699c.GET;
        StringBuilder append = new StringBuilder().append(this.f195793f.f195433A).append(this.f195793f.f195445a);
        if (this.f195793f.f195460p == 2) {
            str = "/panel/info/v2";
        } else {
            str = "/panel/info";
        }
        return new C86701e(C87002p.m150693a(a, append.append(str).toString()), cVar, null, null, false, 60);
    }

    /* Return type fixed from 'com.ss.ugc.effectplatform.model.h' to match base method */
    @Override // com.p2082ss.ugc.effectplatform.task.AbstractC86851a
    /* renamed from: a */
    public final /* synthetic */ PanelInfoResponse mo140547a(C86695b bVar, String str) {
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(str, "");
        return (PanelInfoResponse) bVar.f195508a.convertJsonToObj(str, PanelInfoResponse.class);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.ugc.effectplatform.task.AbstractC86851a
    /* renamed from: a */
    public final void mo140549a(String str, String str2, C86840e eVar) {
        C89219l.m154719c(eVar, "");
        C88060b.m153136a("FetchPanelInfoTask", "Failed: ".concat(String.valueOf(eVar)), null);
        eVar.mo140160a(str, this.f195793f.f195433A, str2);
        super.mo140549a(str, str2, eVar);
        V v = this.f195793f.f195463s.f199870a;
        if (v != null) {
            C86687a aVar = this.f195793f;
            String str3 = this.f195794g;
            C89378p[] pVarArr = new C89378p[3];
            pVarArr[0] = C89387v.m154943a("error_code", Integer.valueOf(eVar.f195756a));
            if (str2 == null) {
                str2 = "";
            }
            pVarArr[1] = C89387v.m154943a("host_ip", str2);
            if (str == null) {
                str = "";
            }
            pVarArr[2] = C89387v.m154943a("download_url", str);
            C86802b.m150354a(v, false, aVar, str3, C89041ag.m154421a(pVarArr), eVar.f195757b);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [long, long, long, com.ss.ugc.effectplatform.model.h] */
    @Override // com.p2082ss.ugc.effectplatform.task.AbstractC86851a
    /* renamed from: a */
    public final /* synthetic */ void mo140548a(long j, long j2, long j3, PanelInfoResponse panelInfoResponse) {
        String str;
        String convertObjToJson;
        AbstractC86755f fVar;
        String convertObjToJson2;
        long j4;
        PanelInfoResponse panelInfoResponse2 = panelInfoResponse;
        C89219l.m154719c(panelInfoResponse2, "");
        PanelInfoModel data = panelInfoResponse2.getData();
        if (data != null) {
            CategoryEffectModel category_effects = data.getCategory_effects();
            if (category_effects != null) {
                C86993j.m150661a(this.f195793f.f195453i, this.f195794g, category_effects.getCategory_effects());
                C86993j.m150661a(this.f195793f.f195453i, this.f195794g, category_effects.getCollection());
                C86993j.m150661a(this.f195793f.f195453i, this.f195794g, category_effects.getBind_effects());
                if (this.f195793f.f195460p == 2) {
                    C86993j.m150663a(data.getUrl_prefix(), category_effects.getCategory_effects());
                    C86993j.m150663a(data.getUrl_prefix(), category_effects.getCollection());
                    C86993j.m150663a(data.getUrl_prefix(), category_effects.getBind_effects());
                }
            }
            String a = C86989g.m150650a(this.f195793f.f195450f, this.f195794g, this.f195795h, this.f195796i, this.f195798k, this.f195797j);
            try {
                C86695b bVar = this.f195793f.f195461q;
                if (!(bVar == null || (convertObjToJson2 = bVar.f195508a.convertObjToJson(panelInfoResponse2)) == null)) {
                    C87991a<Long> aVar = this.f195792d;
                    AbstractC86755f fVar2 = (AbstractC86755f) C87993b.m153064a(this.f195793f.f195467w);
                    if (fVar2 != null) {
                        j4 = fVar2.mo140005a(a, convertObjToJson2);
                    } else {
                        j4 = 0;
                    }
                    C87993b.m153065a(aVar, Long.valueOf(j4 / ((long) C86757a.f195654a)));
                }
            } catch (Exception e) {
                C88060b.m153136a("NewFetchPanelInfoTask", "Exception: ".concat(String.valueOf(e)), null);
            }
            try {
                PanelInfoModel responseData = panelInfoResponse2.getResponseData();
                if (responseData != null) {
                    str = responseData.getVersion();
                } else {
                    str = null;
                }
                Version version = new Version(str);
                C86695b bVar2 = this.f195793f.f195461q;
                if (!(bVar2 == null || (convertObjToJson = bVar2.f195508a.convertObjToJson(version)) == null || (fVar = (AbstractC86755f) C87993b.m153064a(this.f195793f.f195467w)) == null)) {
                    fVar.mo140005a(C86989g.m150647a(this.f195794g), convertObjToJson);
                }
            } catch (Exception e2) {
                C88060b.m153136a("FetchPanelInfoTask", "Json Exception: ".concat(String.valueOf(e2)), null);
            }
            super.mo140548a(j, j2, j3, panelInfoResponse2);
            long currentTimeMillis = System.currentTimeMillis();
            V v = this.f195793f.f195463s.f199870a;
            if (v != null) {
                C86802b.m150354a(v, true, this.f195793f, this.f195794g, C89041ag.m154421a(C89387v.m154943a("duration", Long.valueOf(currentTimeMillis - j)), C89387v.m154943a("network_time", Long.valueOf(j2 - j)), C89387v.m154943a("json_time", Long.valueOf(j3 - j2)), C89387v.m154943a("io_time", Long.valueOf(currentTimeMillis - j3)), C89387v.m154943a("size", this.f195792d.f199870a)), "");
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FetchPanelInfoTask(C86687a aVar, String str, String str2, boolean z, String str3, int i, int i2, Map<String, String> map) {
        super(aVar.f195462r.f199870a, aVar.f195461q, aVar.f195443K, str2);
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        this.f195793f = aVar;
        this.f195794g = str;
        this.f195795h = z;
        this.f195796i = str3;
        this.f195797j = i;
        this.f195798k = i2;
    }
}
