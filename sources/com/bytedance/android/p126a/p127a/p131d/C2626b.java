package com.bytedance.android.p126a.p127a.p131d;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.a.a.d.b */
public class C2626b extends AbstractC2625a {

    /* renamed from: j */
    public int f7888j;

    /* renamed from: k */
    public String f7889k;

    /* renamed from: l */
    public Map<String, String> f7890l;

    /* renamed from: m */
    public boolean f7891m;

    /* renamed from: n */
    public long f7892n;

    static {
        Covode.recordClassIndex(3014);
    }

    @Override // com.bytedance.android.p126a.p127a.p131d.AbstractC2625a
    /* renamed from: a */
    public final String mo7142a() {
        return this.f7889k;
    }

    /* renamed from: com.bytedance.android.a.a.d.b$a */
    public static class C2627a {

        /* renamed from: a */
        public long f7893a = -1;

        /* renamed from: b */
        public boolean f7894b = true;

        /* renamed from: c */
        public long f7895c = -1;

        /* renamed from: d */
        public String f7896d;

        /* renamed from: e */
        public JSONObject f7897e;

        /* renamed from: f */
        public String f7898f;

        /* renamed from: g */
        public long f7899g = -1;

        /* renamed from: h */
        public boolean f7900h;

        /* renamed from: i */
        private List<String> f7901i;

        /* renamed from: j */
        private Map<String, String> f7902j;

        static {
            Covode.recordClassIndex(3015);
        }

        /* renamed from: a */
        public final C2626b mo7146a() {
            C2626b bVar = new C2626b(this.f7893a, this.f7901i, this.f7898f, this.f7894b, this.f7895c, this.f7896d, this.f7897e, this.f7902j);
            bVar.f7892n = this.f7899g;
            bVar.f7891m = this.f7900h;
            return bVar;
        }

        /* renamed from: a */
        public final C2627a mo7145a(List<String> list) {
            this.f7901i = list;
            return this;
        }
    }

    /* renamed from: b */
    public final boolean mo7143b() {
        if (this.f7892n <= 0 || (System.currentTimeMillis() - this.f7887i) / 1000 <= this.f7892n) {
            return false;
        }
        return true;
    }

    public String toString() {
        int size;
        String str;
        StringBuilder append = new StringBuilder("C2STrackEvent{adid:").append(this.f7881c).append(",non_std_adid:").append(this.f7883e).append(",usize:");
        if (this.f7884f == null) {
            size = 0;
        } else {
            size = this.f7884f.size();
        }
        StringBuilder append2 = append.append(size).append(",key:");
        if (TextUtils.isEmpty(this.f7880b)) {
            str = "empty";
        } else {
            str = this.f7880b;
        }
        return append2.append(str).append(",label:").append(this.f7889k).append(",create_time:").append(this.f7887i).append(",retry_when_network_available:").append(this.f7891m).append(",expire_seconds:").append(this.f7892n).append("}").toString();
    }

    public C2626b(long j, List<String> list, String str, boolean z, long j2, String str2, JSONObject jSONObject, Map<String, String> map) {
        this(UUID.randomUUID().toString(), "c2s", j, list, str, z, j2, str2, jSONObject, 0, map);
    }

    public C2626b(String str, String str2, long j, List<String> list, String str3, boolean z, long j2, String str4, JSONObject jSONObject, int i, Map<String, String> map) {
        super(str, str2, j, list, z, j2, str4, jSONObject);
        this.f7889k = "";
        this.f7892n = -1;
        this.f7889k = str3;
        this.f7888j = i;
        this.f7890l = map;
    }
}
