package com.p2082ss.ugc.effectplatform.task;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.effectplatform.C86687a;
import com.p2082ss.ugc.effectplatform.model.C86840e;
import com.p2082ss.ugc.effectplatform.model.CategoryEffectModel;
import com.p2082ss.ugc.effectplatform.model.CategoryPageModel;
import com.p2082ss.ugc.effectplatform.model.Effect;
import com.p2082ss.ugc.effectplatform.model.net.CategoryEffectListResponse;
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
import java.util.List;
import java.util.Map;
import p4519d.p4520a.p4522b.C87993b;
import p4519d.p4520a.p4532e.C88060b;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.ugc.effectplatform.task.FetchCategoryEffectTask */
public final class FetchCategoryEffectTask extends AbstractC86851a<CategoryPageModel, CategoryEffectListResponse> {

    /* renamed from: c */
    public static final C86847a f195774c = new C86847a((byte) 0);

    /* renamed from: d */
    private final C86687a f195775d;

    /* renamed from: f */
    private final String f195776f;

    /* renamed from: g */
    private final String f195777g;

    /* renamed from: h */
    private final int f195778h;

    /* renamed from: i */
    private final int f195779i;

    /* renamed from: j */
    private final int f195780j;

    /* renamed from: k */
    private final String f195781k;

    /* renamed from: l */
    private final Map<String, String> f195782l = null;

    static {
        Covode.recordClassIndex(102606);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.ugc.effectplatform.task.AbstractC86851a
    /* renamed from: e */
    public final int mo140552e() {
        return 10002;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.ugc.effectplatform.task.FetchCategoryEffectTask$CategoryVersion */
    public static final class CategoryVersion {
        private final int cursor;
        private final int sorting_position;
        private final String version;

        static {
            Covode.recordClassIndex(102607);
        }

        public static /* synthetic */ CategoryVersion copy$default(CategoryVersion categoryVersion, String str, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                str = categoryVersion.version;
            }
            if ((i3 & 2) != 0) {
                i = categoryVersion.cursor;
            }
            if ((i3 & 4) != 0) {
                i2 = categoryVersion.sorting_position;
            }
            return categoryVersion.copy(str, i, i2);
        }

        public final String component1() {
            return this.version;
        }

        public final int component2() {
            return this.cursor;
        }

        public final int component3() {
            return this.sorting_position;
        }

        public final CategoryVersion copy(String str, int i, int i2) {
            C89219l.m154719c(str, "");
            return new CategoryVersion(str, i, i2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CategoryVersion)) {
                return false;
            }
            CategoryVersion categoryVersion = (CategoryVersion) obj;
            return C89219l.m154714a(this.version, categoryVersion.version) && this.cursor == categoryVersion.cursor && this.sorting_position == categoryVersion.sorting_position;
        }

        public final int hashCode() {
            String str = this.version;
            return ((((str != null ? str.hashCode() : 0) * 31) + this.cursor) * 31) + this.sorting_position;
        }

        public final String toString() {
            return "CategoryVersion(version=" + this.version + ", cursor=" + this.cursor + ", sorting_position=" + this.sorting_position + ")";
        }

        public final int getCursor() {
            return this.cursor;
        }

        public final int getSorting_position() {
            return this.sorting_position;
        }

        public final String getVersion() {
            return this.version;
        }

        public CategoryVersion(String str, int i, int i2) {
            C89219l.m154719c(str, "");
            this.version = str;
            this.cursor = i;
            this.sorting_position = i2;
        }
    }

    /* renamed from: com.ss.ugc.effectplatform.task.FetchCategoryEffectTask$a */
    public static final class C86847a {
        static {
            Covode.recordClassIndex(102608);
        }

        private C86847a() {
        }

        public /* synthetic */ C86847a(byte b) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.ugc.effectplatform.task.AbstractC86851a
    /* renamed from: d */
    public final int mo140551d() {
        return this.f195775d.f195458n;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.ugc.effectplatform.task.AbstractC86851a
    /* renamed from: c */
    public final C86701e mo140550c() {
        String str;
        HashMap<String, String> a = C86992i.m150657a(this.f195775d, true);
        a.put("panel", this.f195776f);
        String str2 = this.f195777g;
        if (str2 == null) {
            str2 = "hot";
        }
        a.put("category", str2);
        a.put("cursor", String.valueOf(this.f195779i));
        a.put("count", String.valueOf(this.f195778h));
        a.put("sorting_position", String.valueOf(this.f195780j));
        String str3 = this.f195781k;
        if (str3 == null) {
            str3 = "0";
        }
        a.put("version", str3);
        String str4 = this.f195775d.f195469y;
        if (str4 != null) {
            a.put("test_status", str4);
        }
        Map<String, String> map = this.f195782l;
        if (map != null) {
            a.putAll(map);
        }
        EnumC86699c cVar = EnumC86699c.GET;
        StringBuilder append = new StringBuilder().append(this.f195775d.f195433A).append(this.f195775d.f195445a);
        if (this.f195775d.f195460p == 2) {
            str = "/category/effects/v2";
        } else {
            str = "/category/effects";
        }
        return new C86701e(C87002p.m150693a(a, append.append(str).toString()), cVar, null, null, false, 60);
    }

    /* renamed from: a */
    private final long m150417a(CategoryEffectListResponse categoryEffectListResponse) {
        String str;
        int i;
        String convertObjToJson;
        AbstractC86755f fVar;
        CategoryEffectModel category_effects;
        CategoryEffectModel category_effects2;
        CategoryEffectModel category_effects3;
        String convertObjToJson2;
        long j;
        String a = C86989g.m150649a(this.f195776f, this.f195777g, this.f195778h, this.f195779i, this.f195780j);
        long j2 = 0;
        try {
            C86695b bVar = this.f195775d.f195461q;
            if (!(bVar == null || (convertObjToJson2 = bVar.f195508a.convertObjToJson(categoryEffectListResponse)) == null)) {
                AbstractC86755f fVar2 = (AbstractC86755f) C87993b.m153064a(this.f195775d.f195467w);
                if (fVar2 != null) {
                    j = fVar2.mo140005a(a, convertObjToJson2);
                } else {
                    j = 0;
                }
                j2 = j / ((long) C86757a.f195654a);
            }
        } catch (Exception e) {
            C88060b.m153136a("FetchCategoryEffectTask", "Json Exception: ".concat(String.valueOf(e)), null);
        }
        try {
            CategoryPageModel data = categoryEffectListResponse.getData();
            if (data == null || (category_effects3 = data.getCategory_effects()) == null || (str = category_effects3.getVersion()) == null) {
                str = "0";
            }
            CategoryPageModel data2 = categoryEffectListResponse.getData();
            int i2 = 0;
            if (data2 == null || (category_effects2 = data2.getCategory_effects()) == null) {
                i = 0;
            } else {
                i = category_effects2.getCursor();
            }
            CategoryPageModel data3 = categoryEffectListResponse.getData();
            if (!(data3 == null || (category_effects = data3.getCategory_effects()) == null)) {
                i2 = category_effects.getSorting_position();
            }
            CategoryVersion categoryVersion = new CategoryVersion(str, i, i2);
            C86695b bVar2 = this.f195775d.f195461q;
            if (!(bVar2 == null || (convertObjToJson = bVar2.f195508a.convertObjToJson(categoryVersion)) == null || (fVar = (AbstractC86755f) C87993b.m153064a(this.f195775d.f195467w)) == null)) {
                fVar.mo140005a(C86989g.m150651b(this.f195776f, this.f195777g), convertObjToJson);
            }
        } catch (Exception e2) {
            C88060b.m153136a("FetchCategoryEffectTask", "Json Exception: ".concat(String.valueOf(e2)), null);
        }
        return j2;
    }

    /* Return type fixed from 'com.ss.ugc.effectplatform.model.h' to match base method */
    @Override // com.p2082ss.ugc.effectplatform.task.AbstractC86851a
    /* renamed from: a */
    public final /* synthetic */ CategoryEffectListResponse mo140547a(C86695b bVar, String str) {
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(str, "");
        return (CategoryEffectListResponse) bVar.f195508a.convertJsonToObj(str, CategoryEffectListResponse.class);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.ugc.effectplatform.task.AbstractC86851a
    /* renamed from: a */
    public final void mo140549a(String str, String str2, C86840e eVar) {
        C89219l.m154719c(eVar, "");
        eVar.mo140160a(str, this.f195775d.f195433A, str2);
        super.mo140549a(str, str2, eVar);
        V v = this.f195775d.f195463s.f199870a;
        if (v != null) {
            C86687a aVar = this.f195775d;
            String str3 = this.f195776f;
            String str4 = this.f195777g;
            if (str4 == null) {
                str4 = "";
            }
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
            C86802b.m150353a(v, false, aVar, str3, str4, C89041ag.m154421a(pVarArr), eVar.f195757b);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [long, long, long, com.ss.ugc.effectplatform.model.h] */
    @Override // com.p2082ss.ugc.effectplatform.task.AbstractC86851a
    /* renamed from: a */
    public final /* synthetic */ void mo140548a(long j, long j2, long j3, CategoryEffectListResponse categoryEffectListResponse) {
        List<Effect> list;
        List<Effect> list2;
        List<Effect> list3;
        List<Effect> list4;
        List<Effect> list5;
        CategoryEffectListResponse categoryEffectListResponse2 = categoryEffectListResponse;
        String str = "";
        C89219l.m154719c(categoryEffectListResponse2, str);
        CategoryPageModel data = categoryEffectListResponse2.getData();
        if (data != null) {
            String str2 = this.f195775d.f195453i;
            String str3 = this.f195776f;
            CategoryEffectModel category_effects = data.getCategory_effects();
            List<Effect> list6 = null;
            if (category_effects != null) {
                list = category_effects.getCategory_effects();
            } else {
                list = null;
            }
            C86993j.m150661a(str2, str3, list);
            String str4 = this.f195775d.f195453i;
            String str5 = this.f195776f;
            CategoryEffectModel category_effects2 = data.getCategory_effects();
            if (category_effects2 != null) {
                list2 = category_effects2.getCollection();
            } else {
                list2 = null;
            }
            C86993j.m150661a(str4, str5, list2);
            String str6 = this.f195775d.f195453i;
            String str7 = this.f195776f;
            CategoryEffectModel category_effects3 = data.getCategory_effects();
            if (category_effects3 != null) {
                list3 = category_effects3.getBind_effects();
            } else {
                list3 = null;
            }
            C86993j.m150661a(str6, str7, list3);
            if (this.f195775d.f195460p == 2) {
                List<String> url_prefix = data.getUrl_prefix();
                CategoryEffectModel category_effects4 = data.getCategory_effects();
                if (category_effects4 != null) {
                    list4 = category_effects4.getCategory_effects();
                } else {
                    list4 = null;
                }
                C86993j.m150663a(url_prefix, list4);
                List<String> url_prefix2 = data.getUrl_prefix();
                CategoryEffectModel category_effects5 = data.getCategory_effects();
                if (category_effects5 != null) {
                    list5 = category_effects5.getCollection();
                } else {
                    list5 = null;
                }
                C86993j.m150663a(url_prefix2, list5);
                List<String> url_prefix3 = data.getUrl_prefix();
                CategoryEffectModel category_effects6 = data.getCategory_effects();
                if (category_effects6 != null) {
                    list6 = category_effects6.getBind_effects();
                }
                C86993j.m150663a(url_prefix3, list6);
            }
            long a = m150417a(categoryEffectListResponse2);
            super.mo140548a(j, j2, j3, categoryEffectListResponse2);
            long currentTimeMillis = System.currentTimeMillis();
            V v = this.f195775d.f195463s.f199870a;
            if (v != null) {
                C86687a aVar = this.f195775d;
                String str8 = this.f195776f;
                String str9 = this.f195777g;
                if (str9 != null) {
                    str = str9;
                }
                C86802b.m150353a(v, true, aVar, str8, str, C89041ag.m154421a(C89387v.m154943a("duration", Long.valueOf(currentTimeMillis - j)), C89387v.m154943a("network_time", Long.valueOf(j2 - j)), C89387v.m154943a("json_time", Long.valueOf(j3 - j2)), C89387v.m154943a("io_time", Long.valueOf(currentTimeMillis - j3)), C89387v.m154943a("size", Long.valueOf(a))), "");
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FetchCategoryEffectTask(C86687a aVar, String str, String str2, String str3, int i, int i2, int i3, String str4, Map<String, String> map) {
        super(aVar.f195462r.f199870a, aVar.f195461q, aVar.f195443K, str2);
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        this.f195775d = aVar;
        this.f195776f = str;
        this.f195777g = str3;
        this.f195778h = i;
        this.f195779i = i2;
        this.f195780j = i3;
        this.f195781k = str4;
    }
}
