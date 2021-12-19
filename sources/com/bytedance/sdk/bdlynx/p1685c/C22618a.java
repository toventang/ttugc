package com.bytedance.sdk.bdlynx.p1685c;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.bdlynx.p1677a.p1678a.C22589a;
import com.bytedance.sdk.bdlynx.p1677a.p1678a.C22600e;
import com.bytedance.sdk.bdlynx.p1677a.p1678a.C22603f;
import com.bytedance.sdk.bdlynx.p1677a.p1680c.C22607a;
import com.bytedance.sdk.bdlynx.p1677a.p1683f.C22614b;
import com.bytedance.sdk.bdlynx.p1687e.C22659g;
import com.bytedance.sdk.bdlynx.view.C22683f;
import java.io.File;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.bytedance.sdk.bdlynx.c.a */
public final class C22618a implements AbstractC22620b {

    /* renamed from: a */
    public static final C22619a f53431a = new C22619a((byte) 0);

    /* renamed from: b */
    private long f53432b;

    /* renamed from: c */
    private long f53433c;

    /* renamed from: d */
    private long f53434d;

    /* renamed from: e */
    private final String f53435e;

    /* renamed from: f */
    private String f53436f;

    /* renamed from: g */
    private C22607a f53437g;

    static {
        Covode.recordClassIndex(26434);
    }

    @Override // com.bytedance.sdk.bdlynx.p1685c.AbstractC22621c
    /* renamed from: a */
    public final void mo36881a(C22683f fVar) {
        C89219l.m154719c(fVar, "");
    }

    /* renamed from: com.bytedance.sdk.bdlynx.c.a$a */
    public static final class C22619a {
        static {
            Covode.recordClassIndex(26435);
        }

        private C22619a() {
        }

        public /* synthetic */ C22619a(byte b) {
            this();
        }

        /* renamed from: a */
        public static AbstractC22620b m42666a(C22607a aVar, String str) {
            boolean z;
            String builder;
            C89219l.m154719c(aVar, "");
            String str2 = aVar.f53415b;
            String str3 = aVar.f53416c;
            String a = C22624f.m42681a();
            if (str2.length() == 0 && str3.length() == 0) {
                builder = "bdlynx://";
            } else {
                Uri.Builder builder2 = new Uri.Builder();
                builder2.scheme("bdlynx");
                builder2.authority(str2);
                if (str3.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && str3 != null) {
                    builder2.appendPath(str3);
                }
                if (!(str == null || str.length() == 0)) {
                    String str4 = File.separator;
                    C89219l.m154709a((Object) str4, "");
                    if (C89361p.m154874b(str, str4, false)) {
                        str = str.substring(1);
                        C89219l.m154709a((Object) str, "");
                    }
                    builder2.appendPath(str);
                }
                builder = builder2.toString();
                C89219l.m154709a((Object) builder, "");
            }
            return new C22618a(a, builder, new C22607a(str2, str3));
        }
    }

    /* renamed from: g */
    private final long m42651g() {
        return C22614b.m42648b() - this.f53434d;
    }

    @Override // com.bytedance.sdk.bdlynx.p1685c.AbstractC22623e
    /* renamed from: b */
    public final void mo36884b() {
        this.f53433c = C22614b.m42648b();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("trigger", "on_start_load");
        m42649a(this, "bdlynx_lynx_load_time_line_event", jSONObject, null, 12);
    }

    @Override // com.bytedance.sdk.bdlynx.p1685c.AbstractC22623e
    /* renamed from: f */
    public final void mo36891f() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("trigger", "on_page_update");
        m42649a(this, "bdlynx_lynx_load_time_line_event", jSONObject, null, 12);
    }

    @Override // com.bytedance.sdk.bdlynx.p1685c.AbstractC22622d
    /* renamed from: a */
    public final void mo36878a() {
        this.f53432b = C22614b.m42648b();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("trigger", "load_tpl_start");
        m42649a(this, "bdlynx_load_event", jSONObject, null, 12);
    }

    @Override // com.bytedance.sdk.bdlynx.p1685c.AbstractC22623e
    /* renamed from: c */
    public final void mo36887c() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("trigger", "on_runtime_ready");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("interval_page_start", m42651g());
        m42649a(this, "bdlynx_lynx_load_time_line_event", jSONObject, jSONObject2, 8);
    }

    @Override // com.bytedance.sdk.bdlynx.p1685c.AbstractC22623e
    /* renamed from: d */
    public final void mo36889d() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("trigger", "on_load_success");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("interval_page_start", m42651g());
        m42649a(this, "bdlynx_lynx_load_time_line_event", jSONObject, jSONObject2, 8);
    }

    @Override // com.bytedance.sdk.bdlynx.p1685c.AbstractC22623e
    /* renamed from: e */
    public final void mo36890e() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("trigger", "on_first_screen");
        JSONObject jSONObject2 = new JSONObject();
        if (this.f53434d > 0) {
            jSONObject2.put("interval_page_start", m42651g());
        }
        m42649a(this, "bdlynx_lynx_load_time_line_event", jSONObject, jSONObject2, 8);
        if (this.f53432b > 0) {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("trigger", "on_load");
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("interval_load_start", C22614b.m42648b() - this.f53432b);
            m42649a(this, "bdlynx_load_event", jSONObject3, jSONObject4, 8);
        }
    }

    @Override // com.bytedance.sdk.bdlynx.p1685c.AbstractC22620b
    /* renamed from: a */
    public final void mo36879a(C22607a aVar) {
        this.f53437g = aVar;
    }

    @Override // com.bytedance.sdk.bdlynx.p1685c.AbstractC22623e
    /* renamed from: c */
    public final void mo36888c(String str) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("trigger", "on_receive_error");
        if (str != null) {
            jSONObject.put("reason", str);
        }
        m42649a(this, "bdlynx_lynx_load_receive_error_event", jSONObject, null, 12);
    }

    @Override // com.bytedance.sdk.bdlynx.p1685c.AbstractC22623e
    /* renamed from: b */
    public final void mo36885b(String str) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("trigger", "on_load_fail");
        if (str != null) {
            jSONObject.put("reason", str);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("interval_page_start", m42651g());
        m42649a(this, "bdlynx_lynx_load_fail_event", jSONObject, jSONObject2, 8);
    }

    @Override // com.bytedance.sdk.bdlynx.p1685c.AbstractC22622d
    /* renamed from: a */
    public final void mo36880a(C22659g gVar) {
        C89219l.m154719c(gVar, "");
        gVar.f53526e = C22614b.m42645a(this.f53432b);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("trigger", "load_tpl_result");
        jSONObject.put("result_type", gVar.f53522a);
        jSONObject.put("tpl_provider_name", gVar.f53524c);
        jSONObject.put("hit_cache", String.valueOf(gVar.f53523b));
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("tpl_size", gVar.f53525d);
        jSONObject2.put("duration", gVar.f53526e);
        m42649a(this, "bdlynx_load_event", jSONObject, jSONObject2, 8);
    }

    @Override // com.bytedance.sdk.bdlynx.p1685c.AbstractC22623e
    /* renamed from: b */
    public final void mo36886b(JSONObject jSONObject) {
        int i;
        int i2;
        int i3;
        if (jSONObject != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("trigger", "on_update_pref_ready");
            JSONObject jSONObject3 = new JSONObject();
            if (jSONObject.has("render_page")) {
                i = Double.valueOf(jSONObject.getDouble("render_page"));
            } else {
                i = 0;
            }
            jSONObject3.put("render_page", i);
            if (jSONObject.has("diff_same_root")) {
                i2 = Double.valueOf(jSONObject.getDouble("diff_same_root"));
            } else {
                i2 = 0;
            }
            jSONObject3.put("diff_same_root", i2);
            if (jSONObject.has("layout")) {
                i3 = Double.valueOf(jSONObject.getDouble("layout"));
            } else {
                i3 = 0;
            }
            jSONObject3.put("layout", i3);
            m42649a(this, "bdlynx_lynx_load_time_line_event", jSONObject2, jSONObject3, 8);
        }
    }

    @Override // com.bytedance.sdk.bdlynx.p1685c.AbstractC22623e
    /* renamed from: a */
    public final void mo36882a(String str) {
        this.f53434d = C22614b.m42648b();
        if (!(!TextUtils.equals(this.f53436f, "bdlynx://") || str == null || str.length() == 0)) {
            this.f53436f = str;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("trigger", "on_page_start");
        JSONObject jSONObject2 = new JSONObject();
        long j = this.f53433c;
        if (j > 0) {
            jSONObject2.put("interval_load_start", this.f53434d - j);
        }
        m42649a(this, "bdlynx_lynx_load_time_line_event", jSONObject, jSONObject2, 8);
    }

    @Override // com.bytedance.sdk.bdlynx.p1685c.AbstractC22623e
    /* renamed from: a */
    public final void mo36883a(JSONObject jSONObject) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        if (jSONObject != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("trigger", "on_first_load_pref");
            JSONObject jSONObject3 = new JSONObject();
            if (jSONObject.has("tasm_binary_decode")) {
                i = Double.valueOf(jSONObject.getDouble("tasm_binary_decode"));
            } else {
                i = 0;
            }
            jSONObject3.put("tasm_binary_decode", i);
            if (jSONObject.has("tasm_end_decode_finish_load_template")) {
                i2 = Double.valueOf(jSONObject.getDouble("tasm_end_decode_finish_load_template"));
            } else {
                i2 = 0;
            }
            jSONObject3.put("tasm_end_decode_finish_load_template", i2);
            if (jSONObject.has("tasm_finish_load_template")) {
                i3 = Double.valueOf(jSONObject.getDouble("tasm_finish_load_template"));
            } else {
                i3 = 0;
            }
            jSONObject3.put("tasm_finish_load_template", i3);
            if (jSONObject.has("diff_root_create")) {
                i4 = Double.valueOf(jSONObject.getDouble("diff_root_create"));
            } else {
                i4 = 0;
            }
            jSONObject3.put("diff_root_create", i4);
            if (jSONObject.has("js_finish_load_core")) {
                i5 = Double.valueOf(jSONObject.getDouble("js_finish_load_core"));
            } else {
                i5 = 0;
            }
            jSONObject3.put("js_finish_load_core", i5);
            if (jSONObject.has("js_finish_load_app")) {
                i6 = Double.valueOf(jSONObject.getDouble("js_finish_load_app"));
            } else {
                i6 = 0;
            }
            jSONObject3.put("js_finish_load_app", i6);
            if (jSONObject.has("js_and_tasm_all_ready")) {
                i7 = Double.valueOf(jSONObject.getDouble("js_and_tasm_all_ready"));
            } else {
                i7 = 0;
            }
            jSONObject3.put("js_and_tasm_all_ready", i7);
            if (jSONObject.has("tti")) {
                i8 = Double.valueOf(jSONObject.getDouble("tti"));
            } else {
                i8 = 0;
            }
            jSONObject3.put("tti", i8);
            if (jSONObject.has("js_runtime_type")) {
                i9 = Double.valueOf(jSONObject.getDouble("js_runtime_type"));
            } else {
                i9 = 0;
            }
            jSONObject3.put("js_runtime_type", i9);
            if (jSONObject.has("corejs_size")) {
                i10 = Double.valueOf(jSONObject.getDouble("corejs_size"));
            } else {
                i10 = 0;
            }
            jSONObject3.put("corejs_size", i10);
            if (jSONObject.has("layout")) {
                i11 = Double.valueOf(jSONObject.getDouble("layout"));
            } else {
                i11 = 0;
            }
            jSONObject3.put("layout", i11);
            if (jSONObject.has("first_page_layout")) {
                i12 = Double.valueOf(jSONObject.getDouble("first_page_layout"));
            } else {
                i12 = 0;
            }
            jSONObject3.put("first_page_layout", i12);
            m42649a(this, "bdlynx_lynx_load_time_line_event", jSONObject2, jSONObject3, 8);
        }
    }

    public C22618a(String str, String str2, C22607a aVar) {
        C89219l.m154719c(str, "");
        this.f53435e = str;
        this.f53436f = str2;
        this.f53437g = aVar;
    }

    /* renamed from: a */
    private final void m42650a(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        String str2 = this.f53436f;
        C22607a aVar = this.f53437g;
        C89219l.m154719c(str, "");
        if (C22589a.m42626a().mo36873a()) {
            C22603f.m42638b(new C22600e.RunnableC22602b(str2, str, jSONObject, aVar, jSONObject2, null));
        }
    }

    /* renamed from: a */
    private static /* synthetic */ void m42649a(C22618a aVar, String str, JSONObject jSONObject, JSONObject jSONObject2, int i) {
        if ((i & 2) != 0) {
            jSONObject = null;
        }
        if ((i & 4) != 0) {
            jSONObject2 = null;
        }
        aVar.m42650a(str, jSONObject, jSONObject2);
    }
}
