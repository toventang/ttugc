package com.p2082ss.ttvideoengine.p4411e;

import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.ttvideoengine.p4430s.C86633c;
import com.p2082ss.ttvideoengine.p4430s.C86640h;
import com.p2082ss.ttvideoengine.p4430s.C86641i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.ttvideoengine.e.a */
public class C86412a {

    /* renamed from: a */
    public String f193699a;

    /* renamed from: b */
    protected long f193700b = -1;

    /* renamed from: c */
    protected String f193701c = "base_task";

    /* renamed from: d */
    public long f193702d;

    /* renamed from: e */
    public long f193703e;

    /* renamed from: f */
    public int f193704f;

    /* renamed from: g */
    public C86633c f193705g;

    /* renamed from: h */
    protected String f193706h;

    /* renamed from: i */
    protected ArrayList<String> f193707i;

    /* renamed from: j */
    protected HashMap<String, List<String>> f193708j;

    /* renamed from: k */
    protected boolean f193709k;

    /* renamed from: l */
    protected boolean f193710l;

    /* renamed from: m */
    public String f193711m;

    /* renamed from: n */
    public C86418d f193712n;

    /* renamed from: o */
    protected long f193713o;

    /* renamed from: p */
    protected long f193714p;

    /* renamed from: q */
    protected HashMap<String, Long> f193715q;

    /* renamed from: r */
    protected HashMap<String, Long> f193716r;

    /* renamed from: s */
    protected Handler f193717s;

    /* renamed from: t */
    protected EnumC86414a f193718t = EnumC86414a.NONE;

    static {
        Covode.recordClassIndex(101640);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo137435a(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f193700b = jSONObject.optLong("id");
            this.f193699a = jSONObject.optString("des");
            long optLong = jSONObject.optLong("res_size");
            this.f193702d = optLong;
            this.f193714p = optLong;
            this.f193703e = jSONObject.optLong("content_size");
            this.f193704f = jSONObject.optInt("state");
            this.f193705g = C86640h.m150078a(jSONObject.optJSONObject("error"));
            this.f193706h = jSONObject.optString("file_path");
            JSONArray optJSONArray = jSONObject.optJSONArray("media_keys");
            if (optJSONArray == null || optJSONArray.length() <= 0) {
                this.f193707i = new ArrayList<>();
            } else {
                this.f193707i = new ArrayList<>();
                for (int i = 0; i < optJSONArray.length(); i++) {
                    String optString = optJSONArray.optString(i);
                    if (!TextUtils.isEmpty(optString)) {
                        this.f193707i.add(optString);
                    }
                }
            }
            this.f193709k = jSONObject.optBoolean("finish");
            this.f193710l = jSONObject.optBoolean("cancel");
            this.f193701c = jSONObject.optString("task_type");
            this.f193711m = jSONObject.optString("vid");
            if (jSONObject.optInt("encrypt_version", 0) == 1) {
                this.f193718t = EnumC86414a.MDL_VERSION_1;
            } else {
                this.f193718t = EnumC86414a.NONE;
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("bytes_rec_map");
            if (optJSONObject != null && optJSONObject.length() > 0) {
                Iterator<String> keys = optJSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    this.f193715q.put(next, Long.valueOf(optJSONObject.optLong(next)));
                }
            }
            JSONObject optJSONObject2 = jSONObject.optJSONObject("bytes_expect_map");
            if (optJSONObject2 != null && optJSONObject2.length() > 0) {
                Iterator<String> keys2 = optJSONObject2.keys();
                while (keys2.hasNext()) {
                    String next2 = keys2.next();
                    this.f193716r.put(next2, Long.valueOf(optJSONObject2.optLong(next2)));
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public JSONObject mo137438c() {
        return new JSONObject(mo137439d());
    }

    /* renamed from: e */
    private void m149079e() {
        if (this.f193717s == null) {
            this.f193717s = new Handler(C86640h.m150077a()) {
                /* class com.p2082ss.ttvideoengine.p4411e.C86412a.HandlerC864131 */

                static {
                    Covode.recordClassIndex(101641);
                }

                public final void handleMessage(Message message) {
                    if (message != null && this != null) {
                        super.handleMessage(message);
                        if (message.what == 111) {
                            this.mo137433a(0);
                            if (this.f193712n != null) {
                                this.f193712n.mo137452c(this);
                            }
                        } else if (message.what == 112) {
                            this.f193705g = (C86633c) message.obj;
                            if (!C86412a.this.mo137437b(this.f193705g)) {
                                this.mo137433a(5);
                            }
                            if (this.f193712n != null) {
                                C86418d dVar = this.f193712n;
                                C86412a aVar = this;
                                dVar.mo137447a(aVar, aVar.f193705g);
                            }
                        } else if (message.what == 113) {
                            this.f193705g = null;
                            this.mo137433a(5);
                            if (this.f193712n != null) {
                                this.f193712n.mo137447a(this, (C86633c) null);
                            }
                        }
                    }
                }
            };
        }
    }

    /* renamed from: com.ss.ttvideoengine.e.a$a */
    public enum EnumC86414a {
        NONE(0),
        MDL_VERSION_1(1);
        
        public int version;

        static {
            Covode.recordClassIndex(101642);
        }

        private EnumC86414a(int i) {
            this.version = i;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo137436b() {
        this.f193700b = -1;
        this.f193701c = "base_task";
        this.f193702d = 0;
        this.f193703e = 0;
        this.f193704f = 0;
        this.f193705g = null;
        this.f193706h = null;
        this.f193707i = new ArrayList<>();
        this.f193708j = null;
        this.f193709k = false;
        this.f193711m = null;
        this.f193713o = 0;
        this.f193715q = new HashMap<>();
        this.f193716r = new HashMap<>();
    }

    public String toString() {
        return super.toString() + "   id = " + this.f193700b + ", state = " + this.f193704f + ",  videoId " + this.f193711m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final Map mo137439d() {
        HashMap hashMap = new HashMap();
        m149074a(hashMap, "id", this.f193700b);
        m149075a(hashMap, "des", this.f193699a);
        m149074a(hashMap, "res_size", this.f193702d);
        m149074a(hashMap, "content_size", this.f193703e);
        m149073a((Map) hashMap, "state", this.f193704f);
        C86633c cVar = this.f193705g;
        if (cVar != null) {
            m149077a(hashMap, "error", cVar.mo137898a());
        }
        m149075a(hashMap, "file_path", this.f193706h);
        m149076a(hashMap, "media_keys", this.f193707i);
        m149077a(hashMap, "use_urls", this.f193708j);
        m149078a(hashMap, "finish", this.f193709k);
        m149078a(hashMap, "cancel", this.f193710l);
        m149075a(hashMap, "task_type", this.f193701c);
        m149075a(hashMap, "vid", this.f193711m);
        m149077a(hashMap, "bytes_rec_map", this.f193715q);
        m149077a(hashMap, "bytes_expect_map", this.f193716r);
        m149073a((Map) hashMap, "encrypt_version", this.f193718t.version);
        return hashMap;
    }

    /* renamed from: a */
    public void mo137432a() {
        m149079e();
        this.f193705g = null;
        this.f193709k = false;
        this.f193713o = System.currentTimeMillis();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo137437b(C86633c cVar) {
        if (cVar == null || cVar.f195251a == -9995 || cVar.f195251a == -9948 || cVar.f195251a == -9949 || cVar.f195251a == -9947 || cVar.f195251a == -9946) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo137433a(int i) {
        String str;
        if (i != this.f193704f) {
            this.f193704f = i;
            StringBuilder append = new StringBuilder("[downloader] state did changed. state = ").append(i).append(" key = ");
            ArrayList<String> arrayList = this.f193707i;
            if (arrayList != null) {
                str = arrayList.toString();
            } else {
                str = null;
            }
            C86641i.m150113b("TTVideoEngine.DownloadTask", append.append(str).toString());
            C86418d dVar = this.f193712n;
            if (dVar != null && dVar.f193746b != null) {
                C86641i.m150113b("TTVideoEngine.DownloadTask", "[downloader] state did changed. and notify downloader state = ".concat(String.valueOf(i)));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo137434a(C86633c cVar) {
        m149079e();
        Handler handler = this.f193717s;
        if (handler != null) {
            handler.sendMessage(Message.obtain(handler, 112, cVar));
        }
    }

    /* renamed from: a */
    public static void m149073a(Map map, String str, int i) {
        map.put(str, Integer.valueOf(i));
    }

    /* renamed from: a */
    private static void m149074a(Map map, String str, long j) {
        map.put(str, Long.valueOf(j));
    }

    /* renamed from: a */
    public static void m149075a(Map map, String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            map.put(str, str2);
        }
    }

    /* renamed from: a */
    public static void m149076a(Map map, String str, ArrayList arrayList) {
        if (arrayList != null && !arrayList.isEmpty()) {
            map.put(str, arrayList);
        }
    }

    /* renamed from: a */
    public static void m149077a(Map map, String str, Map map2) {
        if (map2 != null && !map2.isEmpty()) {
            map.put(str, map2);
        }
    }

    /* renamed from: a */
    public static void m149078a(Map map, String str, boolean z) {
        map.put(str, Boolean.valueOf(z));
    }
}
