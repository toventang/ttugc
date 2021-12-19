package com.p2082ss.android.ugc.aweme.app.api;

import android.text.TextUtils;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.client.C22027b;
import com.bytedance.retrofit2.p1610b.AbstractC21993ag;
import com.bytedance.retrofit2.p1610b.AbstractC21996d;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22004l;
import com.google.gson.C27910f;
import com.google.gson.C27917g;
import com.google.p1998c.p2006h.p2007a.AbstractFutureC27655q;
import com.p2082ss.android.common.util.NetworkUtils;
import com.p2082ss.android.http.p2146a.AbstractC29926a;
import com.p2082ss.android.http.p2146a.p2149b.C29934d;
import com.p2082ss.android.http.p2146a.p2149b.C29935e;
import com.p2082ss.android.p2123b.C29736b;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.C34480a;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.p2366a.C34482b;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.p2366a.C34483c;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.p2366a.C34484d;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.p2367b.C34485a;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.net.MusicTypeAdapterFactory;
import com.p2082ss.android.ugc.aweme.net.UserTypeAdapterFactory;
import com.p2082ss.android.ugc.aweme.services.ApiMonitorService;
import com.p2082ss.android.ugc.aweme.utils.C80361dw;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.app.api.Api */
public final class Api {

    /* renamed from: a */
    public static final String f79768a;

    /* renamed from: b */
    public static final String f79769b = "api.tiktokv.com";

    /* renamed from: c */
    public static final String f79770c = ("https://" + "api.tiktokv.com");

    /* renamed from: d */
    public static final String f79771d;

    /* renamed from: e */
    public static final String f79772e;

    /* renamed from: f */
    public static final String f79773f;

    /* renamed from: g */
    public static final String f79774g;

    /* renamed from: h */
    public static final String f79775h;

    /* renamed from: i */
    private static NetApi f79776i;

    /* renamed from: com.ss.android.ugc.aweme.app.api.Api$NetApi */
    public interface NetApi {
        static {
            Covode.recordClassIndex(40488);
        }

        @AbstractC22000h
        AbstractFutureC27655q<String> doGet(@AbstractC21993ag String str, @AbstractC22004l List<C22027b> list, @AbstractC21996d Object obj);
    }

    /* renamed from: com.ss.android.ugc.aweme.app.api.Api$c */
    public interface AbstractC33599c<T> {
        static {
            Covode.recordClassIndex(40491);
        }

        /* renamed from: a */
        T mo59944a(Object obj);
    }

    /* renamed from: com.ss.android.ugc.aweme.app.api.Api$d */
    public static class C33600d implements AbstractC33599c<String> {

        /* renamed from: a */
        public static final C33600d f79780a = new C33600d();

        private C33600d() {
        }

        static {
            Covode.recordClassIndex(40492);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.p2082ss.android.ugc.aweme.app.api.Api.AbstractC33599c
        /* renamed from: a */
        public final /* synthetic */ String mo59944a(Object obj) {
            if (obj != null) {
                return obj.toString();
            }
            return null;
        }
    }

    /* renamed from: a */
    public static boolean m68820a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return false;
        }
        if (jSONObject.has("statusCode") && jSONObject.optInt("statusCode") == 0) {
            return true;
        }
        if (jSONObject.has("status_code") && jSONObject.optInt("status_code") == 0) {
            return true;
        }
        if (!jSONObject.has("message") || !TextUtils.equals("success", jSONObject.optString("message"))) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m68817a(String str, String str2) {
        JSONObject optJSONObject;
        if (!C13627m.m24498a(str)) {
            JSONObject jSONObject = new JSONObject(str);
            if (m68820a(jSONObject)) {
                return;
            }
            if (!jSONObject.has("message") || !TextUtils.equals(jSONObject.optString("message"), "error") || (optJSONObject = jSONObject.optJSONObject("data")) == null) {
                C34485a url = new C34485a(jSONObject.optInt("status_code")).setErrorMsg(jSONObject.optString("message", "")).setErrorMsg(jSONObject.optString("status_msg", "")).setPrompt(jSONObject.optString("prompts", "")).setResponse(str).setUrl(str2);
                url.setBlockCode(jSONObject.optInt("block_code"));
                throw url;
            }
            throw new C34485a(optJSONObject.optInt("error_code")).setErrorMsg(optJSONObject.optString("description", "")).setResponse(str).setUrl(str2);
        }
        throw new C34482b();
    }

    /* renamed from: a */
    public static void m68818a(JSONObject jSONObject, String str, String str2) {
        JSONObject optJSONObject;
        if (C13627m.m24498a(str)) {
            throw new C34482b();
        } else if (m68820a(jSONObject)) {
        } else {
            if (!jSONObject.has("message") || !TextUtils.equals(jSONObject.optString("message"), "error") || (optJSONObject = jSONObject.optJSONObject("data")) == null) {
                C34485a url = new C34485a(jSONObject.optInt("status_code")).setErrorMsg(jSONObject.optString("message", "")).setErrorMsg(jSONObject.optString("status_msg", "")).setPrompt(jSONObject.optString("prompts", "")).setResponse(str).setUrl(str2);
                url.setBlockCode(jSONObject.optInt("block_code"));
                throw url;
            }
            throw new C34485a(optJSONObject.optInt("error_code")).setErrorMsg(optJSONObject.optString("description", "")).setResponse(str).setUrl(str2);
        }
    }

    /* renamed from: a */
    private static boolean m68819a() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: b */
    private static boolean m68821b() {
        if (C58029j.f132256h && C58029j.m104846b() && !C58029j.m104847c()) {
            return C58029j.f132256h;
        }
        boolean a = m68819a();
        C58029j.f132256h = a;
        return a;
    }

    /* renamed from: com.ss.android.ugc.aweme.app.api.Api$b */
    public static class C33598b<T> implements AbstractC33599c<T> {

        /* renamed from: b */
        static final C27910f f79778b;

        /* renamed from: a */
        Class<T> f79779a;

        static {
            Covode.recordClassIndex(40490);
            C27917g a = C80361dw.m139332a();
            a.mo46679a(new MusicTypeAdapterFactory());
            a.mo46679a(new UserTypeAdapterFactory());
            f79778b = a.mo46682b();
        }

        public C33598b(Class<T> cls) {
            this.f79779a = cls;
        }

        @Override // com.p2082ss.android.ugc.aweme.app.api.Api.AbstractC33599c
        /* renamed from: a */
        public final T mo59944a(Object obj) {
            if (!BaseResponse.class.isAssignableFrom(this.f79779a)) {
                this.f79779a.getName();
            }
            try {
                T t = (T) f79778b.mo46670a(obj.toString(), (Class) this.f79779a);
                if (!(t instanceof BaseResponse)) {
                    return t;
                }
                try {
                    return (T) t.checkValid();
                } catch (C34485a e) {
                    throw e;
                } catch (Throwable th) {
                    throw new C34480a(-1, th);
                }
            } catch (Throwable th2) {
                throw new C34483c(th2);
            }
        }
    }

    static {
        Covode.recordClassIndex(40487);
        String str = C17867d.f42587k.f42569a;
        f79768a = str;
        String str2 = "https://" + str;
        f79771d = str2;
        f79772e = str2 + "/aweme/v1/upload/image/";
        f79773f = str2 + "/aweme/v1/upload/image/";
        f79774g = str2 + "/aweme/v1/weibo/bind/";
        f79775h = str2 + "/aweme/v1/friend/register/notice/";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.app.api.Api$a */
    public static class C33597a<T> implements AbstractC33599c<List<T>> {

        /* renamed from: a */
        public Class<T> f79777a;

        static {
            Covode.recordClassIndex(40489);
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public List<T> mo59944a(Object obj) {
            if (obj instanceof JSONArray) {
                try {
                    return C80361dw.m139335b(obj.toString(), this.f79777a);
                } catch (Throwable th) {
                    throw new C34483c(th);
                }
            } else {
                throw new C34484d();
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: java.util.List */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private static <T> T m68814a(String str, AbstractC33599c<T> cVar, String str2, C29935e eVar) {
        C17867d.m33078a();
        if (m68821b() || (!TextUtils.isEmpty(str) && str.contains("/aweme/v1/feed/?type=0"))) {
            if (f79776i == null) {
                f79776i = (NetApi) RetrofitFactory.m33635a().mo28817b(C29736b.f70924e).mo28832d().mo28858a(NetApi.class);
            }
            ArrayList arrayList = new ArrayList();
            if (eVar != null) {
                AbstractC29926a[] aVarArr = (AbstractC29926a[]) eVar.f71421a.toArray(new AbstractC29926a[eVar.f71421a.size()]);
                for (AbstractC29926a aVar : aVarArr) {
                    arrayList.add(new C22027b(aVar.mo52240a(), aVar.mo52241b()));
                }
            }
            try {
                return (T) m68815a(f79776i.doGet(str, arrayList, null).get(), cVar, str2, str);
            } catch (ExecutionException e) {
                throw e.getCause();
            }
        } else {
            throw new IOException();
        }
    }

    /* renamed from: a */
    public static <T> T m68815a(String str, AbstractC33599c<T> cVar, String str2, String str3) {
        JSONObject optJSONObject;
        if (cVar == null) {
            throw new IllegalArgumentException("Parser can't be null");
        } else if (!C13627m.m24498a(str)) {
            T t = (T) new JSONObject(str);
            if (m68820a(t)) {
                try {
                    if (!TextUtils.isEmpty(str2)) {
                        return cVar.mo59944a(t.opt(str2));
                    }
                    if ((cVar instanceof C33598b) && ((C33598b) cVar).f79779a == null) {
                        return t;
                    }
                    if (!(cVar instanceof C33597a) || ((C33597a) cVar).f79777a != null) {
                        return cVar.mo59944a(str);
                    }
                    return t;
                } catch (Exception unused) {
                    return null;
                }
            } else if (!t.has("message") || !TextUtils.equals(t.optString("message"), "error") || (optJSONObject = t.optJSONObject("data")) == null) {
                C34485a url = new C34485a(t.optInt("status_code")).setErrorMsg(t.optString("message", "")).setErrorMsg(t.optString("status_msg", "")).setPrompt(t.optString("prompts", "")).setResponse(str).setUrl(str3);
                url.setBlockCode(t.optInt("block_code"));
                ApiMonitorService.Companion.getInstance().apiMonitor(str3, "", str);
                throw url;
            } else {
                ApiMonitorService.Companion.getInstance().apiMonitor(str3, "", str);
                throw new C34485a(optJSONObject.optInt("error_code")).setErrorMsg(optJSONObject.optString("description", "")).setResponse(str).setUrl(str3);
            }
        } else {
            throw new C34482b();
        }
    }

    /* renamed from: a */
    public static <T> T m68816a(String str, Class<T> cls, String str2, C29935e eVar) {
        return String.class.equals(cls) ? (T) m68814a(str, C33600d.f79780a, str2, eVar) : (T) m68814a(str, new C33598b(cls), str2, eVar);
    }

    /* renamed from: a */
    private static <T> T m68810a(String str, int i, String str2, AbstractC33599c<T> cVar, String str3) {
        C17867d.m33078a();
        if (m68821b()) {
            return (T) m68815a(NetworkUtils.postFile(i, str, "file", str2), cVar, str3, str);
        }
        throw new IOException();
    }

    /* renamed from: a */
    public static <T> T m68812a(String str, int i, String str2, Class<T> cls, String str3) {
        return String.class.equals(cls) ? (T) m68810a(str, i, str2, C33600d.f79780a, str3) : (T) m68810a(str, i, str2, new C33598b(cls), str3);
    }

    /* renamed from: a */
    private static <T> T m68811a(String str, int i, String str2, AbstractC33599c<T> cVar, String str3, List<C29934d> list) {
        C17867d.m33078a();
        if (m68821b()) {
            return (T) m68815a(NetworkUtils.postFile(i, str, "file", str2, list), cVar, str3, str);
        }
        throw new IOException();
    }

    /* renamed from: a */
    public static <T> T m68813a(String str, int i, String str2, Class<T> cls, String str3, List<C29934d> list) {
        return String.class.equals(cls) ? (T) m68810a(str, i, str2, C33600d.f79780a, str3) : (T) m68811a(str, i, str2, new C33598b(cls), str3, list);
    }
}
