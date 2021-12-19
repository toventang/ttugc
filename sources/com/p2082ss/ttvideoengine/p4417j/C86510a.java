package com.p2082ss.ttvideoengine.p4417j;

import android.text.TextUtils;
import com.bytedance.bpea.entry.common.DataType;
import com.bytedance.covode.number.Covode;
import com.p2082ss.ttvideoengine.EnumC86649v;
import com.p2082ss.ttvideoengine.p4430s.C86641i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.ttvideoengine.j.a */
public final class C86510a extends C86534o {

    /* renamed from: a */
    public int f194665a;

    /* renamed from: b */
    public int f194666b;

    /* renamed from: c */
    public int f194667c;

    /* renamed from: d */
    public long f194668d;

    /* renamed from: e */
    public long f194669e;

    /* renamed from: f */
    public long f194670f;

    /* renamed from: g */
    public long f194671g;

    /* renamed from: h */
    public String f194672h;

    /* renamed from: i */
    public String f194673i;

    /* renamed from: j */
    public String f194674j;

    /* renamed from: k */
    public String f194675k;

    /* renamed from: l */
    public String f194676l;

    /* renamed from: m */
    public EnumC86649v f194677m;

    /* renamed from: n */
    public String f194678n;

    /* renamed from: o */
    public String f194679o;

    /* renamed from: p */
    public String f194680p;

    /* renamed from: q */
    public String f194681q;

    /* renamed from: r */
    public List<String> f194682r;

    static {
        Covode.recordClassIndex(101738);
    }

    @Override // com.p2082ss.ttvideoengine.p4417j.C86534o
    /* renamed from: d */
    public final JSONObject mo137730d() {
        return null;
    }

    @Override // com.p2082ss.ttvideoengine.p4417j.C86534o, com.p2082ss.ttvideoengine.p4417j.AbstractC86516d
    /* renamed from: e */
    public final C86528i mo137731e() {
        return null;
    }

    @Override // com.p2082ss.ttvideoengine.p4417j.C86534o, com.p2082ss.ttvideoengine.p4417j.AbstractC86516d
    /* renamed from: a */
    public final int mo137723a() {
        return this.f194665a;
    }

    @Override // com.p2082ss.ttvideoengine.p4417j.C86534o, com.p2082ss.ttvideoengine.p4417j.AbstractC86516d
    /* renamed from: c */
    public final EnumC86649v mo137729c() {
        return this.f194677m;
    }

    private C86510a() {
        super(null);
        this.f194665a = -1;
        this.f194671g = -1;
    }

    @Override // com.p2082ss.ttvideoengine.p4417j.C86534o
    /* renamed from: b */
    public final String[] mo137727b() {
        List<String> list = this.f194682r;
        if (list != null) {
            return (String[]) list.toArray(new String[0]);
        }
        return new String[0];
    }

    /* renamed from: com.ss.ttvideoengine.j.a$a */
    public static class C86511a {

        /* renamed from: a */
        public int f194683a;

        /* renamed from: b */
        public int f194684b;

        /* renamed from: c */
        public int f194685c;

        /* renamed from: d */
        public long f194686d;

        /* renamed from: e */
        public long f194687e;

        /* renamed from: f */
        public long f194688f = -1;

        /* renamed from: g */
        public String f194689g;

        /* renamed from: h */
        public String f194690h;

        /* renamed from: i */
        public String f194691i;

        /* renamed from: j */
        public String f194692j;

        /* renamed from: k */
        public EnumC86649v f194693k;

        /* renamed from: l */
        public String f194694l;

        /* renamed from: m */
        public String f194695m;

        /* renamed from: n */
        public String f194696n;

        /* renamed from: o */
        public String f194697o;

        /* renamed from: p */
        public List<String> f194698p;

        /* renamed from: q */
        private long f194699q;

        /* renamed from: r */
        private String f194700r;

        static {
            Covode.recordClassIndex(101739);
        }

        /* renamed from: a */
        public final C86510a mo137733a() {
            C86510a aVar = new C86510a((byte) 0);
            aVar.f194665a = this.f194683a;
            aVar.f194666b = this.f194684b;
            aVar.f194667c = this.f194685c;
            aVar.f194668d = this.f194686d;
            aVar.f194669e = this.f194699q;
            aVar.f194670f = this.f194687e;
            aVar.f194671g = this.f194688f;
            aVar.f194672h = this.f194689g;
            aVar.f194673i = this.f194690h;
            aVar.f194674j = this.f194691i;
            aVar.f194675k = this.f194692j;
            aVar.f194676l = this.f194700r;
            aVar.f194677m = this.f194693k;
            aVar.f194678n = this.f194694l;
            aVar.f194681q = this.f194695m;
            aVar.f194679o = this.f194696n;
            aVar.f194680p = this.f194697o;
            aVar.f194682r = this.f194698p;
            return aVar;
        }
    }

    @Override // com.p2082ss.ttvideoengine.p4417j.C86534o
    /* renamed from: f */
    public final Map<String, Object> mo137732f() {
        String str;
        HashMap hashMap = new HashMap();
        hashMap.put("file_id", mo137726b(28));
        if (this.f194665a == C86537q.f194867a) {
            str = "video";
        } else {
            str = DataType.AUDIO;
        }
        hashMap.put("media_type", str);
        hashMap.put("file_size", Long.valueOf(mo137728c(12)));
        hashMap.put("bitrate", Integer.valueOf(mo137724a(3)));
        hashMap.put("quality", mo137726b(18));
        hashMap.put("definition", mo137726b(7));
        hashMap.put("width", Integer.valueOf(mo137724a(1)));
        hashMap.put("height", Integer.valueOf(mo137724a(2)));
        hashMap.put("codec", mo137726b(8));
        hashMap.put("urls", mo137727b());
        hashMap.put("file_hash", mo137726b(15));
        return hashMap;
    }

    /* synthetic */ C86510a(byte b) {
        this();
    }

    @Override // com.p2082ss.ttvideoengine.p4417j.C86534o, com.p2082ss.ttvideoengine.p4417j.AbstractC86516d
    /* renamed from: a */
    public final int mo137724a(int i) {
        long j;
        if (i == 1) {
            return this.f194666b;
        }
        if (i == 2) {
            return this.f194667c;
        }
        if (i == 3) {
            j = this.f194668d;
        } else if (i != 27) {
            return 0;
        } else {
            j = this.f194669e;
        }
        return (int) j;
    }

    @Override // com.p2082ss.ttvideoengine.p4417j.C86534o
    /* renamed from: c */
    public final long mo137728c(int i) {
        if (i == 12) {
            return this.f194670f;
        }
        if (i != 30) {
            return 0;
        }
        return this.f194671g;
    }

    @Override // com.p2082ss.ttvideoengine.p4417j.C86534o, com.p2082ss.ttvideoengine.p4417j.AbstractC86516d
    /* renamed from: b */
    public final String mo137726b(int i) {
        if (i == 5) {
            return this.f194680p;
        }
        if (i == 6) {
            return this.f194675k;
        }
        if (i == 7) {
            return this.f194679o;
        }
        if (i == 8) {
            return this.f194674j;
        }
        if (i == 15) {
            return this.f194672h;
        }
        if (i == 18) {
            return this.f194678n;
        }
        if (i == 28) {
            return this.f194673i;
        }
        if (i == 31) {
            return this.f194676l;
        }
        if (i != 32) {
            return null;
        }
        return this.f194681q;
    }

    @Override // com.p2082ss.ttvideoengine.p4417j.C86534o
    /* renamed from: a */
    public final int mo137725a(JSONObject jSONObject) {
        int i;
        try {
            this.f194673i = jSONObject.optString("file_id");
            if (jSONObject.optString("media_type").compareTo(DataType.AUDIO) == 0) {
                i = C86537q.f194868b;
            } else {
                i = C86537q.f194867a;
            }
            this.f194665a = i;
            this.f194670f = jSONObject.optLong("file_size");
            this.f194668d = (long) jSONObject.optInt("bitrate");
            this.f194678n = jSONObject.optString("quality");
            this.f194797K = jSONObject.optString("definition");
            this.f194666b = jSONObject.optInt("width");
            this.f194667c = jSONObject.optInt("height");
            this.f194674j = jSONObject.optString("codec");
            JSONArray jSONArray = jSONObject.getJSONArray("urls");
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                String string = jSONArray.getString(i2);
                if (!TextUtils.isEmpty(string)) {
                    if (this.f194682r == null) {
                        this.f194682r = new ArrayList();
                    }
                    this.f194682r.add(string);
                }
            }
            this.f194672h = jSONObject.optString("file_hash");
            return 0;
        } catch (Exception e) {
            C86641i.m150110a("TTVideoEngine.BareVideoInfo", "[GearStrategy]fromMediaInfoJsonObject exception=".concat(String.valueOf(e)));
            return -1;
        }
    }
}
