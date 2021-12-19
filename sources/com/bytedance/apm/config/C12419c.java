package com.bytedance.apm.config;

import android.text.TextUtils;
import com.bytedance.apm.core.AbstractC12436b;
import com.bytedance.apm.p758b.C12310a;
import com.bytedance.apm.p775g.AbstractC12473a;
import com.bytedance.apm.p775g.AbstractC12474b;
import com.bytedance.apm.p775g.AbstractC12475c;
import com.bytedance.apm.p775g.AbstractC12476d;
import com.bytedance.apm.p775g.AbstractC12477e;
import com.bytedance.apm.p776h.AbstractC12483b;
import com.bytedance.apm.p776h.C12482a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.encryptor.EncryptorUtil;
import com.bytedance.p802b.p821e.AbstractC13039b;
import com.bytedance.services.apm.api.AbstractC22712e;
import com.bytedance.services.apm.api.IHttpService;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.config.c */
public final class C12419c {

    /* renamed from: A */
    public final String f30073A;

    /* renamed from: B */
    public final AbstractC12477e f30074B;

    /* renamed from: a */
    public List<String> f30075a;

    /* renamed from: b */
    public List<String> f30076b;

    /* renamed from: c */
    public List<String> f30077c;

    /* renamed from: d */
    public AbstractC12475c f30078d;

    /* renamed from: e */
    public final boolean f30079e;

    /* renamed from: f */
    public final boolean f30080f;

    /* renamed from: g */
    public final boolean f30081g;

    /* renamed from: h */
    public final boolean f30082h;

    /* renamed from: i */
    public final boolean f30083i;

    /* renamed from: j */
    public final boolean f30084j;

    /* renamed from: k */
    public final long f30085k;

    /* renamed from: l */
    public final boolean f30086l;

    /* renamed from: m */
    public final boolean f30087m;

    /* renamed from: n */
    public final boolean f30088n;

    /* renamed from: o */
    public final boolean f30089o;

    /* renamed from: p */
    public final boolean f30090p;

    /* renamed from: q */
    public final JSONObject f30091q;

    /* renamed from: r */
    public final AbstractC12436b f30092r;

    /* renamed from: s */
    public final IHttpService f30093s;

    /* renamed from: t */
    public final Set<Object> f30094t;

    /* renamed from: u */
    public final long f30095u;

    /* renamed from: v */
    public final AbstractC12474b f30096v;

    /* renamed from: w */
    public final AbstractC12473a f30097w;

    /* renamed from: x */
    public final AbstractC12476d f30098x;

    /* renamed from: y */
    public final ExecutorService f30099y;

    /* renamed from: z */
    public final AbstractC22712e f30100z;

    static {
        Covode.recordClassIndex(14227);
    }

    /* renamed from: com.bytedance.apm.config.c$a */
    public static final class C12420a {

        /* renamed from: A */
        AbstractC22712e f30101A = new AbstractC22712e() {
            /* class com.bytedance.apm.config.C12419c.C12420a.C124211 */

            static {
                Covode.recordClassIndex(14229);
            }

            @Override // com.bytedance.services.apm.api.AbstractC22712e
            /* renamed from: a */
            public final byte[] mo20216a(byte[] bArr) {
                return EncryptorUtil.m27092a(bArr, bArr.length);
            }
        };

        /* renamed from: B */
        AbstractC12483b f30102B;

        /* renamed from: C */
        AbstractC13039b f30103C;

        /* renamed from: D */
        String f30104D;

        /* renamed from: a */
        boolean f30105a;

        /* renamed from: b */
        boolean f30106b;

        /* renamed from: c */
        boolean f30107c;

        /* renamed from: d */
        boolean f30108d = C12433h.f30187a;

        /* renamed from: e */
        boolean f30109e;

        /* renamed from: f */
        boolean f30110f;

        /* renamed from: g */
        long f30111g = 2500;

        /* renamed from: h */
        boolean f30112h = C12433h.f30188b;

        /* renamed from: i */
        boolean f30113i = C12433h.f30189c;

        /* renamed from: j */
        boolean f30114j = true;

        /* renamed from: k */
        boolean f30115k;

        /* renamed from: l */
        public boolean f30116l;

        /* renamed from: m */
        public List<String> f30117m = C12310a.f29614a;

        /* renamed from: n */
        public List<String> f30118n = C12310a.f29616c;

        /* renamed from: o */
        public List<String> f30119o = C12310a.f29619f;

        /* renamed from: p */
        JSONObject f30120p = new JSONObject();

        /* renamed from: q */
        public AbstractC12436b f30121q;

        /* renamed from: r */
        public IHttpService f30122r;

        /* renamed from: s */
        Set<Object> f30123s = new HashSet();

        /* renamed from: t */
        public long f30124t = 0;

        /* renamed from: u */
        public AbstractC12474b f30125u;

        /* renamed from: v */
        public AbstractC12473a f30126v;

        /* renamed from: w */
        AbstractC12476d f30127w;

        /* renamed from: x */
        AbstractC12477e f30128x;

        /* renamed from: y */
        ExecutorService f30129y;

        /* renamed from: z */
        AbstractC12475c f30130z;

        static {
            Covode.recordClassIndex(14228);
        }

        /* renamed from: a */
        public final C12419c mo20215a() {
            if (!TextUtils.isEmpty(this.f30120p.optString("aid"))) {
                TextUtils.isEmpty(this.f30120p.optString("app_version"));
                TextUtils.isEmpty(this.f30120p.optString("update_version_code"));
                TextUtils.isEmpty(this.f30120p.optString("device_id"));
                return new C12419c(this, (byte) 0);
            }
            throw new IllegalArgumentException("aid" + " must not be empty");
        }

        /* renamed from: a */
        public final C12420a mo20214a(JSONObject jSONObject) {
            Iterator<String> keys;
            try {
                JSONObject jSONObject2 = this.f30120p;
                if (!(jSONObject2 == null || jSONObject == null || (keys = jSONObject.keys()) == null)) {
                    while (keys.hasNext()) {
                        String next = keys.next();
                        if (!jSONObject.isNull(next)) {
                            jSONObject2.put(next, jSONObject.opt(next));
                        }
                    }
                }
            } catch (JSONException unused) {
            }
            return this;
        }

        /* renamed from: a */
        public final C12420a mo20212a(String str, int i) {
            try {
                this.f30120p.put(str, i);
            } catch (JSONException unused) {
            }
            return this;
        }

        /* renamed from: a */
        public final C12420a mo20213a(String str, String str2) {
            try {
                this.f30120p.put(str, str2);
            } catch (JSONException unused) {
            }
            return this;
        }
    }

    private C12419c(C12420a aVar) {
        this.f30091q = aVar.f30120p;
        this.f30088n = aVar.f30105a;
        this.f30089o = aVar.f30106b;
        this.f30092r = aVar.f30121q;
        this.f30075a = aVar.f30117m;
        this.f30093s = aVar.f30122r;
        this.f30080f = aVar.f30114j;
        this.f30079e = aVar.f30113i;
        this.f30082h = aVar.f30108d;
        this.f30083i = aVar.f30109e;
        this.f30084j = aVar.f30110f;
        this.f30085k = aVar.f30111g;
        this.f30087m = aVar.f30116l;
        this.f30094t = aVar.f30123s;
        this.f30076b = aVar.f30118n;
        this.f30077c = aVar.f30119o;
        this.f30095u = aVar.f30124t;
        this.f30086l = aVar.f30112h;
        this.f30081g = aVar.f30115k;
        this.f30097w = aVar.f30126v;
        this.f30096v = aVar.f30125u;
        this.f30098x = aVar.f30127w;
        this.f30099y = aVar.f30129y;
        this.f30078d = aVar.f30130z;
        this.f30100z = aVar.f30101A;
        this.f30090p = aVar.f30107c;
        this.f30073A = aVar.f30104D;
        this.f30074B = aVar.f30128x;
        AbstractC12483b bVar = aVar.f30102B;
        C12482a.f30320c = bVar;
        if (bVar != null) {
            C12482a.f30318a = true;
        }
        C12482a.f30321d = aVar.f30103C;
    }

    /* synthetic */ C12419c(C12420a aVar, byte b) {
        this(aVar);
    }
}
