package com.p2082ss.ttvideoengine.p4411e;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.ttvideoengine.C86385d;
import com.p2082ss.ttvideoengine.p4430s.C86633c;
import com.p2082ss.ttvideoengine.p4430s.C86641i;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.ttvideoengine.e.b */
public class C86415b extends C86412a {

    /* renamed from: u */
    public ArrayList<String> f193722u;

    /* renamed from: v */
    public String f193723v;

    static {
        Covode.recordClassIndex(101643);
    }

    /* access modifiers changed from: package-private */
    @Override // com.p2082ss.ttvideoengine.p4411e.C86412a
    /* renamed from: b */
    public final boolean mo137437b(C86633c cVar) {
        return false;
    }

    private C86415b() {
    }

    /* renamed from: e */
    static C86415b m149088e() {
        C86415b bVar = new C86415b();
        bVar.mo137436b();
        return bVar;
    }

    /* access modifiers changed from: package-private */
    @Override // com.p2082ss.ttvideoengine.p4411e.C86412a
    /* renamed from: b */
    public final void mo137436b() {
        super.mo137436b();
        this.f193722u = null;
        this.f193723v = null;
        this.f193701c = "url_task";
    }

    /* access modifiers changed from: package-private */
    @Override // com.p2082ss.ttvideoengine.p4411e.C86412a
    /* renamed from: c */
    public final JSONObject mo137438c() {
        HashMap hashMap = new HashMap();
        m149077a(hashMap, "base_json", super.mo137439d());
        m149075a(hashMap, "key", this.f193723v);
        m149076a(hashMap, "urls", this.f193722u);
        return new JSONObject(hashMap);
    }

    @Override // com.p2082ss.ttvideoengine.p4411e.C86412a
    /* renamed from: a */
    public final void mo137432a() {
        C86641i.m150113b("TTVideoEngine.DownloadURLTask", "[downloader] did call resume, key = " + this.f193707i.toString());
        if (this.f193710l) {
            C86641i.m150113b("TTVideoEngine.DownloadURLTask", "[downloader] task did canceled");
        } else if (this.f193704f == 2) {
            C86641i.m150113b("TTVideoEngine.DownloadURLTask", "[downloader] state is running");
        } else {
            super.mo137432a();
            if (this.f193712n == null || this.f193712n.mo137450a(this)) {
                this.f193708j = new HashMap();
                this.f193708j.put(this.f193723v, this.f193722u);
                mo137433a(2);
                C86385d dVar = C86385d.C86400h.f193679a;
                String str = this.f193723v;
                String str2 = this.f193711m;
                ArrayList<String> arrayList = this.f193722u;
                String a = dVar.mo137359a(str, str2, (String[]) arrayList.toArray(new String[arrayList.size()]), this.f193718t.version);
                if (!C86385d.C86400h.f193679a.mo137396l(a)) {
                    mo137434a(new C86633c("kTTVideoErrorDomainDownload", -9996, 0, "resume download fail. url = " + a + " dataload state is " + C86385d.C86400h.f193679a.mo137380c()));
                    return;
                }
                C86641i.m150110a("TTVideoEngine.DownloadURLTask", "[downloader] resume a task. key = " + this.f193723v + " downloader url is " + a);
                if (this.f193712n != null) {
                    this.f193712n.mo137451b(this);
                    return;
                }
                return;
            }
            C86641i.m150110a("TTVideoEngine.DownloadURLTask", "[downloader] not should resume task = " + toString());
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.p2082ss.ttvideoengine.p4411e.C86412a
    /* renamed from: a */
    public final void mo137435a(JSONObject jSONObject) {
        super.mo137435a(jSONObject.optJSONObject("base_json"));
        this.f193723v = jSONObject.optString("key");
        JSONArray optJSONArray = jSONObject.optJSONArray("urls");
        if (optJSONArray != null && optJSONArray.length() > 0) {
            this.f193722u = new ArrayList<>();
            for (int i = 0; i < optJSONArray.length(); i++) {
                String optString = optJSONArray.optString(i);
                if (!TextUtils.isEmpty(optString)) {
                    this.f193722u.add(optString);
                }
            }
        }
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (super.equals(obj)) {
            return true;
        }
        if (!obj.getClass().equals(C86415b.class)) {
            return false;
        }
        return ((C86415b) obj).f193723v.equals(this.f193723v);
    }
}
