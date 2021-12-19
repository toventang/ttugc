package com.p2082ss.android.ugc.aweme.search.model;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.discover.model.suggest.Word;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.search.model.b */
public final class C67674b implements Serializable {
    public static final C67676b Companion = new C67676b(null);
    public static final long serialVersionUID = 42;

    /* renamed from: a */
    private boolean f151610a;

    /* renamed from: b */
    private String f151611b;

    /* renamed from: c */
    private String f151612c;

    /* renamed from: d */
    private String f151613d;

    /* renamed from: e */
    private String f151614e;

    /* renamed from: f */
    private String f151615f;

    /* renamed from: g */
    private String f151616g;

    /* renamed from: h */
    private String f151617h;

    /* renamed from: i */
    private String f151618i;

    /* renamed from: j */
    private boolean f151619j = true;

    /* renamed from: k */
    private boolean f151620k = true;

    /* renamed from: l */
    private Word f151621l;

    /* renamed from: m */
    private boolean f151622m;

    /* renamed from: n */
    private boolean f151623n;

    /* renamed from: o */
    private Map<String, Object> f151624o;

    static {
        Covode.recordClassIndex(79319);
    }

    public static final C67675a newBuilder() {
        return Companion.newBuilder();
    }

    /* renamed from: com.ss.android.ugc.aweme.search.model.b$b */
    public static final class C67676b implements Serializable {
        static {
            Covode.recordClassIndex(79321);
        }

        private C67676b() {
        }

        public final C67675a newBuilder() {
            return new C67675a();
        }

        public /* synthetic */ C67676b(C89214g gVar) {
            this();
        }
    }

    public final String getAuthorId() {
        return this.f151614e;
    }

    public final String getDisplayHint() {
        return this.f151616g;
    }

    public final String getEnterSearchFrom() {
        return this.f151611b;
    }

    public final String getGidRequest() {
        return this.f151615f;
    }

    public final String getGroupId() {
        return this.f151613d;
    }

    public final Word getInboxWord() {
        return this.f151621l;
    }

    public final Map<String, Object> getLogExtraMap() {
        return this.f151624o;
    }

    public final String getPreviousPage() {
        return this.f151612c;
    }

    public final String getSearchHint() {
        return this.f151617h;
    }

    public final String getSearchHintWordId() {
        return this.f151618i;
    }

    public final boolean getShouldShowScanView() {
        return this.f151619j;
    }

    public final boolean getShouldShowSug() {
        return this.f151620k;
    }

    public final boolean getUseSingleStack() {
        return this.f151623n;
    }

    public final boolean isFromDiscoverSuggestSearch() {
        return this.f151610a;
    }

    public final boolean isSetHintBySugWord() {
        return this.f151622m;
    }

    public final String consumeGid() {
        String str = this.f151615f;
        this.f151615f = null;
        return str;
    }

    public final void restEnterSearchPosition() {
        Map<String, Object> map = this.f151624o;
        if (map != null && map.containsKey("search_position")) {
            Map<String, Object> map2 = this.f151624o;
            if (map2 == null) {
                C89219l.m154715b();
            }
            map2.remove("search_position");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.search.model.b$a */
    public static final class C67675a {

        /* renamed from: a */
        public String f151625a = "discovery";

        /* renamed from: b */
        public String f151626b;

        /* renamed from: c */
        public String f151627c;

        /* renamed from: d */
        public String f151628d;

        /* renamed from: e */
        public String f151629e;

        /* renamed from: f */
        public String f151630f;

        /* renamed from: g */
        public String f151631g;

        /* renamed from: h */
        public boolean f151632h = true;

        /* renamed from: i */
        public boolean f151633i = true;

        /* renamed from: j */
        public boolean f151634j;

        /* renamed from: k */
        public boolean f151635k;

        /* renamed from: l */
        private Map<String, Object> f151636l = new LinkedHashMap();

        static {
            Covode.recordClassIndex(79320);
        }

        /* renamed from: a */
        public final C67674b mo106686a() {
            C67674b bVar = new C67674b();
            bVar.setEnterSearchFrom(this.f151625a);
            bVar.setPreviousPage(this.f151626b);
            bVar.setGroupId(this.f151627c);
            bVar.setAuthorId(this.f151628d);
            bVar.setSearchHint(this.f151630f);
            bVar.setSearchHintWordId(this.f151631g);
            bVar.setShouldShowScanView(this.f151632h);
            bVar.setShouldShowSug(this.f151633i);
            bVar.setDisplayHint(this.f151629e);
            bVar.setSetHintBySugWord(this.f151634j);
            bVar.setUseSingleStack(this.f151635k);
            bVar.setLogExtraMap(this.f151636l);
            return bVar;
        }

        /* renamed from: a */
        public final C67675a mo106684a(String str) {
            C89219l.m154721d(str, "");
            return mo106685a("tab_name", str);
        }

        /* renamed from: b */
        public final C67675a mo106687b(String str) {
            C89219l.m154721d(str, "");
            return mo106685a("is_from_video", str);
        }

        /* renamed from: c */
        public final C67675a mo106688c(String str) {
            C89219l.m154721d(str, "");
            this.f151636l.put("search_position", str);
            return this;
        }

        /* renamed from: a */
        public final C67675a mo106685a(String str, String str2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            this.f151636l.put(str, str2);
            return this;
        }
    }

    public final void setAuthorId(String str) {
        this.f151614e = str;
    }

    public final void setDisplayHint(String str) {
        this.f151616g = str;
    }

    public final void setEnterSearchFrom(String str) {
        this.f151611b = str;
    }

    public final void setFromDiscoverSuggestSearch(boolean z) {
        this.f151610a = z;
    }

    public final void setGidRequest(String str) {
        this.f151615f = str;
    }

    public final void setInboxWord(Word word) {
        this.f151621l = word;
    }

    public final void setLogExtraMap(Map<String, Object> map) {
        this.f151624o = map;
    }

    public final void setPreviousPage(String str) {
        this.f151612c = str;
    }

    public final void setSearchHint(String str) {
        this.f151617h = str;
    }

    public final void setSearchHintWordId(String str) {
        this.f151618i = str;
    }

    public final void setSetHintBySugWord(boolean z) {
        this.f151622m = z;
    }

    public final void setShouldShowScanView(boolean z) {
        this.f151619j = z;
    }

    public final void setShouldShowSug(boolean z) {
        this.f151620k = z;
    }

    public final void setUseSingleStack(boolean z) {
        this.f151623n = z;
    }

    public final void setGroupId(String str) {
        this.f151613d = str;
        this.f151615f = str;
    }

    public final Object obtainLogData(String str) {
        C89219l.m154721d(str, "");
        Map<String, Object> map = this.f151624o;
        if (map != null) {
            return map.get(str);
        }
        return null;
    }
}
