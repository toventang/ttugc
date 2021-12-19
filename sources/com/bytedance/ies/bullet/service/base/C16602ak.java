package com.bytedance.ies.bullet.service.base;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* renamed from: com.bytedance.ies.bullet.service.base.ak */
public final class C16602ak {

    /* renamed from: f */
    public static final C16602ak f39721f = new C16602ak("", null, null, null, null);

    /* renamed from: g */
    public static final C16604b f39722g = new C16604b((byte) 0);

    /* renamed from: a */
    public final String f39723a;

    /* renamed from: b */
    public final String f39724b;

    /* renamed from: c */
    public final String f39725c;

    /* renamed from: d */
    public final JSONObject f39726d;

    /* renamed from: e */
    public final JSONObject f39727e;

    /* renamed from: com.bytedance.ies.bullet.service.base.ak$b */
    public static final class C16604b {
        static {
            Covode.recordClassIndex(19041);
        }

        private C16604b() {
        }

        public /* synthetic */ C16604b(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.base.ak$a */
    public static final class C16603a {

        /* renamed from: a */
        public String f39728a = "";

        /* renamed from: b */
        public String f39729b;

        /* renamed from: c */
        public JSONObject f39730c;

        /* renamed from: d */
        public String f39731d;

        /* renamed from: e */
        public JSONObject f39732e;

        static {
            Covode.recordClassIndex(19040);
        }

        /* renamed from: a */
        public final C16602ak mo26368a() {
            return new C16602ak(this.f39728a, this.f39729b, this.f39731d, this.f39732e, this.f39730c, (byte) 0);
        }
    }

    static {
        Covode.recordClassIndex(19039);
    }

    private C16602ak(String str, String str2, String str3, JSONObject jSONObject, JSONObject jSONObject2) {
        this.f39723a = str;
        this.f39724b = str2;
        this.f39725c = str3;
        this.f39726d = jSONObject;
        this.f39727e = jSONObject2;
    }

    public /* synthetic */ C16602ak(String str, String str2, String str3, JSONObject jSONObject, JSONObject jSONObject2, byte b) {
        this(str, str2, str3, jSONObject, jSONObject2);
    }
}
