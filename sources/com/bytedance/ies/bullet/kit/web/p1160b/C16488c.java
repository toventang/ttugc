package com.bytedance.ies.bullet.kit.web.p1160b;

import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.kit.web.p1160b.AbstractC16486b;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.C16167g;
import com.bytedance.ies.web.jsbridge2.AbstractC18347m;
import com.bytedance.ies.web.jsbridge2.AbstractC18354n;
import com.bytedance.ies.web.jsbridge2.AbstractC18356p;
import com.bytedance.ies.web.jsbridge2.AbstractC18357q;
import com.bytedance.ies.web.jsbridge2.C18326ak;
import com.bytedance.ies.web.jsbridge2.C18345k;
import com.bytedance.ies.web.jsbridge2.C18364w;
import com.bytedance.ies.web.jsbridge2.C18368x;
import com.bytedance.ies.web.jsbridge2.TimeLineEvent;
import com.bytedance.ies.web.p1285a.C18288a;
import com.google.gson.C27910f;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4601a.C89041ag;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4619j.C89271h;

/* renamed from: com.bytedance.ies.bullet.kit.web.b.c */
public final class C16488c implements AbstractC16485a {

    /* renamed from: o */
    public static final C16489a f39536o = new C16489a((byte) 0);

    /* renamed from: a */
    public WebViewClient f39537a;

    /* renamed from: b */
    public WebChromeClient f39538b;

    /* renamed from: c */
    public List<String> f39539c = new ArrayList();

    /* renamed from: d */
    public List<String> f39540d = new ArrayList();

    /* renamed from: e */
    public List<String> f39541e = new ArrayList();

    /* renamed from: f */
    public boolean f39542f;

    /* renamed from: g */
    public String f39543g = "bytedance";

    /* renamed from: h */
    public boolean f39544h;

    /* renamed from: i */
    public AbstractC16486b.AbstractC16487a f39545i;

    /* renamed from: j */
    public C18288a f39546j;

    /* renamed from: k */
    public C18368x f39547k;

    /* renamed from: l */
    public C18364w f39548l;

    /* renamed from: m */
    public AbstractC89183m<? super String, ? super C16167g, C89391z> f39549m;

    /* renamed from: n */
    public final Map<String, C16167g> f39550n = new LinkedHashMap();

    /* renamed from: p */
    private List<String> f39551p = new ArrayList();

    /* renamed from: q */
    private String f39552q = "ToutiaoJSBridge";

    /* renamed from: r */
    private AbstractC18356p f39553r;

    /* renamed from: s */
    private final AbstractC89244h f39554s = C89250i.m154773a((AbstractC89171a) C16493e.f39559a);

    /* renamed from: t */
    private final WebView f39555t;

    static {
        Covode.recordClassIndex(18919);
    }

    /* renamed from: a */
    public final C27910f mo26197a() {
        return (C27910f) this.f39554s.getValue();
    }

    /* renamed from: com.bytedance.ies.bullet.kit.web.b.c$a */
    public static final class C16489a {
        static {
            Covode.recordClassIndex(18920);
        }

        private C16489a() {
        }

        public /* synthetic */ C16489a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C16488c m30630a(WebView webView) {
            C89219l.m154719c(webView, "");
            return new C16488c(webView);
        }
    }

    /* renamed from: com.bytedance.ies.bullet.kit.web.b.c$e */
    static final class C16493e extends AbstractC89220m implements AbstractC89171a<C27910f> {

        /* renamed from: a */
        public static final C16493e f39559a = new C16493e();

        static {
            Covode.recordClassIndex(18924);
        }

        C16493e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C27910f invoke() {
            return new C27910f();
        }
    }

    /* renamed from: b */
    public final C16488c mo26200b() {
        List<String> list;
        C18345k b = C18364w.m34179a(this.f39555t).mo29365a().mo29370a(this.f39552q).mo29375b(this.f39540d).mo29367a(new C16490b(this)).mo29374b(new C16491c(this));
        AbstractC16486b.AbstractC16487a aVar = this.f39545i;
        if (aVar != null) {
            b.mo29366a(new C16492d(aVar));
        }
        List<String> list2 = this.f39551p;
        if (list2 == null || list2.isEmpty()) {
            list = this.f39539c;
        } else {
            list = this.f39551p;
        }
        C18345k a = b.mo29371a(list).mo29372a(this.f39542f).mo29373b().mo29368a(this.f39553r);
        if (this.f39544h) {
            a.mo29376c();
        }
        C18364w d = a.mo29377d();
        this.f39548l = d;
        C18368x a2 = C18368x.m34194a(this.f39555t, d);
        this.f39547k = a2;
        if (a2 == null) {
            C89219l.m154707a();
        }
        this.f39546j = a2.f43940a;
        return this;
    }

    /* renamed from: com.bytedance.ies.bullet.kit.web.b.c$b */
    public static final class C16490b implements AbstractC18354n {

        /* renamed from: a */
        final /* synthetic */ C16488c f39556a;

        static {
            Covode.recordClassIndex(18921);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C16490b(C16488c cVar) {
            this.f39556a = cVar;
        }

        @Override // com.bytedance.ies.web.jsbridge2.AbstractC18354n
        /* renamed from: a */
        public final <T> String mo13334a(T t) {
            String b = this.f39556a.mo26197a().mo46674b(t);
            C89219l.m154709a((Object) b, "");
            return b;
        }

        @Override // com.bytedance.ies.web.jsbridge2.AbstractC18354n
        /* renamed from: a */
        public final <T> T mo13333a(String str, Type type) {
            C89219l.m154719c(str, "");
            C89219l.m154719c(type, "");
            return (T) this.f39556a.mo26197a().mo46671a(str, type);
        }
    }

    /* renamed from: com.bytedance.ies.bullet.kit.web.b.c$c */
    public static final class C16491c implements AbstractC18356p {

        /* renamed from: a */
        final /* synthetic */ C16488c f39557a;

        static {
            Covode.recordClassIndex(18922);
        }

        @Override // com.bytedance.ies.web.jsbridge2.AbstractC18356p
        /* renamed from: a */
        public final void mo13317a(String str) {
        }

        @Override // com.bytedance.ies.web.jsbridge2.AbstractC18356p
        /* renamed from: a */
        public final void mo13319a(String str, String str2, int i) {
            AbstractC18357q.m34169a(this, str, str2, i);
        }

        @Override // com.bytedance.ies.web.jsbridge2.AbstractC18356p
        /* renamed from: a */
        public final void mo13320a(String str, String str2, int i, String str3, C18326ak akVar) {
            AbstractC18357q.m34170b(this, str, str2, i);
        }

        @Override // com.bytedance.ies.web.jsbridge2.AbstractC18356p
        /* renamed from: b */
        public final void mo13321b(String str, String str2, int i) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C16491c(C16488c cVar) {
            this.f39557a = cVar;
        }

        @Override // com.bytedance.ies.web.jsbridge2.AbstractC18356p
        /* renamed from: a */
        public final void mo13318a(String str, C18326ak akVar) {
            try {
                List<TimeLineEvent> list = akVar.f43834c;
                C89391z zVar = null;
                if (list != null) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap(C89271h.m154769b(C89041ag.m154411a(C89070n.m154526a((Iterable) list, 10)), 16));
                    for (T t : list) {
                        T t2 = t;
                        C89219l.m154709a((Object) t2, "");
                        linkedHashMap.put(t2.getLabel(), t);
                    }
                    TimeLineEvent timeLineEvent = (TimeLineEvent) linkedHashMap.get(TimeLineEvent.C18303b.f43744ar);
                    if (timeLineEvent != null) {
                        HashMap<String, Object> extra = timeLineEvent.getExtra();
                        Object obj = extra != null ? extra.get("callbackId") : null;
                        if (!(obj instanceof String)) {
                            obj = null;
                        }
                        String str2 = (String) obj;
                        if (str2 != null) {
                            C16167g b = this.f39557a.mo26199b(str2);
                            TimeLineEvent timeLineEvent2 = (TimeLineEvent) linkedHashMap.get(TimeLineEvent.C18303b.f43723aL);
                            if (timeLineEvent2 != null) {
                                b.mo25725a(timeLineEvent2.getTimeInMillis());
                            }
                            TimeLineEvent timeLineEvent3 = (TimeLineEvent) linkedHashMap.get(TimeLineEvent.C18303b.f43721aJ);
                            if (timeLineEvent3 != null) {
                                b.mo25728b(timeLineEvent3.getTimeInMillis());
                            }
                            TimeLineEvent timeLineEvent4 = (TimeLineEvent) linkedHashMap.get(TimeLineEvent.C18303b.f43726aO);
                            if (timeLineEvent4 != null) {
                                b.mo25729c(timeLineEvent4.getTimeInMillis());
                            }
                            if (b.mo25726a()) {
                                this.f39557a.f39550n.remove(str2);
                                AbstractC89183m<? super String, ? super C16167g, C89391z> mVar = this.f39557a.f39549m;
                                if (mVar != null) {
                                    if (str == null) {
                                        str = "";
                                    }
                                    mVar.invoke(str, b);
                                }
                            }
                            zVar = C89391z.f203057a;
                        }
                    }
                }
                C89379q.m157068constructorimpl(zVar);
            } catch (Throwable th) {
                C89379q.m157068constructorimpl(C89382r.m154941a(th));
            }
        }
    }

    /* renamed from: com.bytedance.ies.bullet.kit.web.b.c$d */
    public static final class C16492d implements AbstractC18347m.AbstractC18351c {

        /* renamed from: a */
        final /* synthetic */ AbstractC16486b.AbstractC16487a f39558a;

        static {
            Covode.recordClassIndex(18923);
        }

        C16492d(AbstractC16486b.AbstractC16487a aVar) {
            this.f39558a = aVar;
        }

        @Override // com.bytedance.ies.web.jsbridge2.AbstractC18347m.AbstractC18351c
        /* renamed from: a */
        public final boolean mo26206a(String str) {
            return this.f39558a.mo26194b();
        }

        @Override // com.bytedance.ies.web.jsbridge2.AbstractC18347m.AbstractC18351c
        /* renamed from: a */
        public final boolean mo26207a(String str, String str2) {
            return this.f39558a.mo26193a();
        }
    }

    /* renamed from: a */
    public final C16488c mo26195a(AbstractC18356p pVar) {
        C89219l.m154719c(pVar, "");
        this.f39553r = pVar;
        return this;
    }

    /* renamed from: c */
    public final C16488c mo26202c(String str) {
        C89219l.m154719c(str, "");
        this.f39552q = str;
        return this;
    }

    /* renamed from: d */
    public final C16488c mo26204d(String str) {
        C89219l.m154719c(str, "");
        this.f39543g = str;
        return this;
    }

    /* renamed from: a */
    public final C16488c mo26196a(List<String> list) {
        C89219l.m154719c(list, "");
        this.f39539c.addAll(list);
        return this;
    }

    /* renamed from: b */
    public final C16488c mo26201b(List<String> list) {
        C89219l.m154719c(list, "");
        this.f39551p.addAll(list);
        return this;
    }

    /* renamed from: c */
    public final C16488c mo26203c(List<String> list) {
        C89219l.m154719c(list, "");
        this.f39540d.addAll(list);
        return this;
    }

    /* renamed from: d */
    public final C16488c mo26205d(List<String> list) {
        C89219l.m154719c(list, "");
        this.f39541e.addAll(list);
        return this;
    }

    /* renamed from: b */
    public final C16167g mo26199b(String str) {
        C16167g gVar = this.f39550n.get(str);
        if (gVar != null) {
            return gVar;
        }
        C16167g gVar2 = new C16167g();
        this.f39550n.put(str, gVar2);
        return gVar2;
    }

    public C16488c(WebView webView) {
        C89219l.m154719c(webView, "");
        this.f39555t = webView;
    }

    @Override // com.bytedance.ies.bullet.kit.web.p1160b.AbstractC16485a
    /* renamed from: a */
    public final boolean mo26192a(String str) {
        C18288a aVar = this.f39546j;
        if (aVar == null || !aVar.mo29253b(str)) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.ies.bullet.kit.web.p1160b.AbstractC16485a
    /* renamed from: a */
    public final void mo26191a(String str, JSONObject jSONObject) {
        C18288a aVar = this.f39546j;
        if (aVar != null) {
            aVar.mo29252b(str, jSONObject);
        }
    }

    /* renamed from: a */
    public final void mo26198a(AbstractC16192q qVar, String str, JSONObject jSONObject) {
        C16167g gVar;
        C89219l.m154719c(qVar, "");
        if (str != null) {
            gVar = mo26199b(str);
            if (gVar != null) {
                gVar.f38931e = System.currentTimeMillis();
            }
        } else {
            gVar = null;
        }
        C18288a aVar = this.f39546j;
        if (aVar != null) {
            aVar.mo29249a(str, jSONObject);
        }
        if (gVar != null) {
            gVar.f38932f = System.currentTimeMillis();
            gVar.f38933g = System.currentTimeMillis();
            if (gVar.mo25726a()) {
                if (str != null) {
                    this.f39550n.remove(str);
                }
                AbstractC89183m<? super String, ? super C16167g, C89391z> mVar = this.f39549m;
                if (mVar != null) {
                    mVar.invoke(qVar.mo25752d(), gVar);
                }
            }
        }
    }
}
