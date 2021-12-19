package com.bytedance.ies.ugc.aweme.ttsetting;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.ttsetting.model.TTSettingData;
import com.bytedance.ies.ugc.aweme.ttsetting.model.TTSettingDataBean;
import com.bytedance.ies.ugc.aweme.ttsetting.model.TTSettingDataResponse;
import com.bytedance.keva.Keva;
import com.bytedance.retrofit2.AbstractC21983b;
import com.bytedance.retrofit2.AbstractC22030d;
import com.bytedance.retrofit2.C22099u;
import com.google.gson.AbstractC28019l;
import com.google.gson.C27910f;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.bytedance.ies.ugc.aweme.ttsetting.a */
public final class C18161a {

    /* renamed from: a */
    static volatile TTSettingData f43259a;

    /* renamed from: b */
    static volatile JSONObject f43260b;

    /* renamed from: c */
    static boolean f43261c = Keva.getRepo("ab_repo_cold_boot").getBoolean("clear_red_point_cost", false);

    /* renamed from: d */
    public static final C18161a f43262d = new C18161a();

    /* renamed from: e */
    private static ArrayList<Object> f43263e;

    /* renamed from: f */
    private static ArrayList<AbstractC18168b> f43264f;

    /* renamed from: g */
    private static boolean f43265g;

    /* renamed from: com.bytedance.ies.ugc.aweme.ttsetting.a$a */
    public static final class C18162a implements AbstractC22030d<AbstractC28019l> {

        /* renamed from: a */
        final /* synthetic */ C89233z.C89238e f43266a;

        static {
            Covode.recordClassIndex(20811);
        }

        /* renamed from: com.bytedance.ies.ugc.aweme.ttsetting.a$a$a */
        static final class RunnableC18163a implements Runnable {

            /* renamed from: a */
            public static final RunnableC18163a f43267a = new RunnableC18163a();

            static {
                Covode.recordClassIndex(20812);
            }

            RunnableC18163a() {
            }

            public final void run() {
                C18161a.m33801a();
            }
        }

        /* renamed from: com.bytedance.ies.ugc.aweme.ttsetting.a$a$b */
        static final class RunnableC18164b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C18162a f43268a;

            /* renamed from: b */
            final /* synthetic */ C22099u f43269b;

            static {
                Covode.recordClassIndex(20813);
            }

            RunnableC18164b(C18162a aVar, C22099u uVar) {
                this.f43268a = aVar;
                this.f43269b = uVar;
            }

            public final void run() {
                T t;
                T t2;
                C22099u uVar = this.f43269b;
                if (uVar != null) {
                    t = uVar.f52262b;
                } else {
                    t = null;
                }
                C89233z.C89238e eVar = this.f43268a.f43266a;
                if (t == null || (t2 = (T) t.toString()) == null) {
                    t2 = "";
                }
                eVar.element = t2;
                if (TextUtils.isEmpty(this.f43268a.f43266a.element)) {
                    C18161a.m33801a();
                    return;
                }
                Object a = new C27910f().mo46667a((AbstractC28019l) t, TTSettingData.class);
                C89219l.m154709a(a, "");
                final TTSettingDataResponse tTSettingDataResponse = new TTSettingDataResponse((TTSettingData) a, new JSONObject((String) this.f43268a.f43266a.element));
                if (C18161a.f43261c) {
                    C18161a.m33803a(tTSettingDataResponse, this.f43268a.f43266a.element);
                } else {
                    new Handler(Looper.getMainLooper()).post(new Runnable(this) {
                        /* class com.bytedance.ies.ugc.aweme.ttsetting.C18161a.C18162a.RunnableC18164b.RunnableC181651 */

                        /* renamed from: a */
                        final /* synthetic */ RunnableC18164b f43270a;

                        static {
                            Covode.recordClassIndex(20814);
                        }

                        {
                            this.f43270a = r1;
                        }

                        public final void run() {
                            C18161a.m33803a(tTSettingDataResponse, this.f43270a.f43268a.f43266a.element);
                        }
                    });
                }
            }
        }

        C18162a(C89233z.C89238e eVar) {
            this.f43266a = eVar;
        }

        @Override // com.bytedance.retrofit2.AbstractC22030d
        /* renamed from: a */
        public final void mo6817a(AbstractC21983b<AbstractC28019l> bVar, C22099u<AbstractC28019l> uVar) {
            C40780g.m82246c().submit(new RunnableC18164b(this, uVar));
        }

        @Override // com.bytedance.retrofit2.AbstractC22030d
        /* renamed from: a */
        public final void mo6818a(AbstractC21983b<AbstractC28019l> bVar, Throwable th) {
            C89219l.m154719c(bVar, "");
            C89219l.m154719c(th, "");
            if (C18161a.f43261c) {
                C40780g.m82246c().submit(RunnableC18163a.f43267a);
            } else {
                C18161a.m33801a();
            }
        }
    }

    private C18161a() {
    }

    static {
        Covode.recordClassIndex(20810);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.ugc.aweme.ttsetting.a$b */
    public static final class RunnableC18166b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f43272a;

        static {
            Covode.recordClassIndex(20815);
        }

        RunnableC18166b(String str) {
            this.f43272a = str;
        }

        public final void run() {
            C18161a.f43259a = (TTSettingData) new C27910f().mo46670a(this.f43272a, TTSettingData.class);
            C18161a.f43260b = new JSONObject(this.f43272a);
            if (C18161a.f43261c) {
                C18161a.m33805b();
            } else {
                new Handler(Looper.getMainLooper()).post(RunnableC181671.f43273a);
            }
        }
    }

    /* renamed from: a */
    public static void m33801a() {
        String string = Keva.getRepo("TTSettingData").getString("settingData", "");
        if (TextUtils.isEmpty(string)) {
            m33806c();
            return;
        }
        C89219l.m154709a((Object) string, "");
        m33804a(string);
    }

    /* renamed from: c */
    private static void m33806c() {
        f43265g = true;
        ArrayList<Object> arrayList = f43263e;
        if (arrayList != null) {
            Iterator<T> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next();
                new Exception("no data to show");
            }
        }
        f43263e = null;
        ArrayList<AbstractC18168b> arrayList2 = f43264f;
        if (arrayList2 != null) {
            Iterator<T> it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                it2.next().mo28951a(new Exception("no data to show"));
            }
        }
        f43264f = null;
    }

    /* renamed from: b */
    public static void m33805b() {
        TTSettingDataBean data;
        ArrayList<Object> arrayList = f43263e;
        if (arrayList != null) {
            Iterator<T> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next();
                TTSettingData tTSettingData = f43259a;
                if (!(tTSettingData == null || (data = tTSettingData.getData()) == null)) {
                    data.getApp();
                }
            }
        }
        f43263e = null;
        ArrayList<AbstractC18168b> arrayList2 = f43264f;
        if (arrayList2 != null) {
            Iterator<T> it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                it2.next().mo28952a(m33800a(f43260b));
            }
        }
        f43264f = null;
    }

    /* renamed from: a */
    private static void m33804a(String str) {
        C40780g.m82246c().submit(new RunnableC18166b(str));
    }

    /* renamed from: a */
    private static JSONObject m33800a(JSONObject jSONObject) {
        JSONObject optJSONObject;
        if (jSONObject == null || (optJSONObject = jSONObject.optJSONObject("data")) == null) {
            return null;
        }
        return optJSONObject.optJSONObject("app");
    }

    /* renamed from: a */
    public static void m33802a(AbstractC18168b bVar) {
        C89219l.m154719c(bVar, "");
        JSONObject jSONObject = f43260b;
        if (jSONObject != null) {
            bVar.mo28952a(m33800a(jSONObject));
        } else if (f43265g) {
            bVar.mo28951a(new Exception("no data to show"));
        } else {
            ArrayList<AbstractC18168b> arrayList = f43264f;
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            f43264f = arrayList;
            arrayList.add(bVar);
        }
    }

    /* renamed from: a */
    public static void m33803a(TTSettingDataResponse tTSettingDataResponse, String str) {
        f43259a = tTSettingDataResponse.getTtSettingData();
        f43260b = tTSettingDataResponse.getTtSettingDataJSONObject();
        Keva repo = Keva.getRepo("TTSettingData");
        if (!TextUtils.isEmpty(str)) {
            repo.storeString("settingData", str);
            repo.storeLong("last_get_setting_time", System.currentTimeMillis());
            m33805b();
            return;
        }
        String string = repo.getString("settingData", "");
        if (TextUtils.isEmpty(string)) {
            m33806c();
            return;
        }
        C89219l.m154709a((Object) string, "");
        m33804a(string);
    }
}
