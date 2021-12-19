package com.p2082ss.android.ugc.aweme.utils;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.aweme.base.C34611o;
import java.net.URLDecoder;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;
import okhttp3.C90200t;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.utils.gw */
public class C80517gw {

    /* renamed from: a */
    public static final String f180118a = "RELEASE";

    /* renamed from: b */
    public static final String[] f180119b = {"uid", "user_id", "author_id", "target_user_ud", "to_user_id", "from_user_id", "push_user_id", "share_user_id", "star_uid"};

    /* renamed from: e */
    private static final String[] f180120e = {"com.tellh.me.ele.", "com.ixigua.", "com.ss.", "com.bytedance."};

    /* renamed from: f */
    private static final String[] f180121f = {"com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity", "com.ss.android.ugc.aweme.bullet.BulletContainerActivity", "com.ss.android.ugc.aweme.live.LiveDummyActivity"};

    /* renamed from: g */
    private static final String[] f180122g = {"com.bytedance.ies.web.jsbridge", "com.ss.android.ugc.aweme.bullet", "com.ss.android.ugc.aweme.crossplatform", "com.ss.android.ugc.aweme.web.jsbridge", "com.ss.android.ugc.aweme.fe.method", "com.bytedance.android.live.browser.jsbridge"};

    /* renamed from: h */
    private static final String[] f180123h = {"/api/ad/splash"};

    /* renamed from: i */
    private static volatile C80517gw f180124i;

    /* renamed from: j */
    private static boolean f180125j;

    /* renamed from: k */
    private static boolean f180126k;

    /* renamed from: l */
    private static boolean f180127l;

    /* renamed from: c */
    public boolean f180128c;

    /* renamed from: d */
    public boolean f180129d;

    /* renamed from: m */
    private final ConcurrentHashMap<String, String> f180130m = new ConcurrentHashMap<>();

    /* renamed from: n */
    private final LinkedList<String> f180131n;

    /* renamed from: o */
    private String f180132o;

    /* renamed from: p */
    private Keva f180133p;

    /* renamed from: a */
    public final void mo123773a(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.equals("0", str) && !TextUtils.equals("-1", str) && !TextUtils.isEmpty(str2)) {
            this.f180130m.put(str, str2);
        }
    }

    /* renamed from: b */
    public static boolean m139568b() {
        if (f180125j || f180126k || f180127l) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static C80517gw m139563a() {
        MethodCollector.m26663i(13901);
        if (f180124i == null) {
            synchronized (C80517gw.class) {
                try {
                    if (f180124i == null) {
                        f180124i = new C80517gw();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(13901);
                    throw th;
                }
            }
        }
        C80517gw gwVar = f180124i;
        MethodCollector.m26664o(13901);
        return gwVar;
    }

    static {
        Covode.recordClassIndex(93790);
    }

    private C80517gw() {
        boolean equalsIgnoreCase;
        boolean equalsIgnoreCase2;
        LinkedList<String> linkedList;
        String str = C17867d.f42595s;
        if (TextUtils.isEmpty(str)) {
            equalsIgnoreCase = false;
        } else {
            equalsIgnoreCase = str.equalsIgnoreCase("local_test");
        }
        f180126k = equalsIgnoreCase;
        String str2 = C17867d.f42595s;
        if (TextUtils.isEmpty(str2)) {
            equalsIgnoreCase2 = false;
        } else {
            equalsIgnoreCase2 = str2.equalsIgnoreCase("lark_inhouse");
        }
        f180127l = equalsIgnoreCase2;
        f180125j = false;
        Keva repo = Keva.getRepo("aweme_network");
        this.f180133p = repo;
        this.f180128c = repo.getBoolean("strict_mode", f180125j);
        this.f180129d = this.f180133p.getBoolean("request_with_compile_mode", f180125j);
        this.f180132o = this.f180133p.getString("lastInputEmailPrefix", "");
        if (m139568b()) {
            linkedList = new LinkedList<>();
        } else {
            linkedList = null;
        }
        this.f180131n = linkedList;
    }

    /* renamed from: a */
    public static void m139567a(C90200t tVar) {
        if (tVar != null && !m139568b()) {
            try {
                m139566a(tVar.mo145055f(), false);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: d */
    private static boolean m139569d(String str) {
        if (TextUtils.isEmpty(str) || "null".equalsIgnoreCase(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo123774b(String str) {
        if (!this.f180128c || str.contains("passport")) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final String mo123775c(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals("0", str) || TextUtils.equals("-1", str)) {
            return null;
        }
        return this.f180130m.get(str);
    }

    /* renamed from: a */
    public final void mo123771a(Uri uri) {
        if (uri != null) {
            String str = "";
            try {
                str = URLDecoder.decode(uri.toString(), "UTF-8");
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                mo123772a(str);
            }
        }
    }

    /* renamed from: a */
    public final void mo123772a(String str) {
        if (this.f180131n != null && !TextUtils.isEmpty(str)) {
            if (this.f180131n.size() == 6) {
                this.f180131n.pollLast();
            }
            this.f180131n.offerFirst(str);
        }
    }

    /* renamed from: a */
    public static void m139565a(String str, JSONObject jSONObject) {
        if (!TextUtils.isEmpty(str) && jSONObject != null && jSONObject.length() > 0) {
            try {
                String[] strArr = f180119b;
                for (String str2 : strArr) {
                    String optString = jSONObject.optString(str2);
                    String optString2 = jSONObject.optString("sec_".concat(String.valueOf(str2)));
                    if (!m139569d(optString) && m139569d(optString2)) {
                        m139566a(str, m139568b());
                        return;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static void m139566a(String str, boolean z) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("path", str);
        jSONObject.put("pages", C80601m.m139744a());
        if (z) {
            jSONObject.put("backtrace", C80601m.m139745a(f180120e));
        }
        C34611o.m70668a("log_miss_sec_uid", jSONObject);
    }

    /* renamed from: a */
    public static void m139564a(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            try {
                m139566a(str, m139568b());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
