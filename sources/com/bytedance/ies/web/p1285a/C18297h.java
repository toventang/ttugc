package com.bytedance.ies.web.p1285a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* renamed from: com.bytedance.ies.web.a.h */
public class C18297h {

    /* renamed from: a */
    public String f43668a;

    /* renamed from: b */
    public String f43669b;

    /* renamed from: c */
    public String f43670c;

    /* renamed from: d */
    public JSONObject f43671d;

    /* renamed from: e */
    public int f43672e;

    /* renamed from: f */
    public String f43673f;

    /* renamed from: g */
    public String f43674g;

    /* renamed from: h */
    public String f43675h;

    /* renamed from: i */
    public boolean f43676i = true;

    static {
        Covode.recordClassIndex(20968);
    }

    public String toString() {
        String str;
        StringBuilder append = new StringBuilder("JsMsg{type='").append(this.f43668a).append('\'').append(", callback_id='").append(this.f43669b).append('\'').append(", func='").append(this.f43670c).append('\'').append(", params=").append(this.f43671d).append(", version=").append(this.f43672e).append(", namespace=").append(this.f43673f).append(", iFrameUrl=").append(this.f43674g).append(", permissionGroup=");
        if (TextUtils.isEmpty(this.f43675h)) {
            str = "";
        } else {
            str = this.f43675h;
        }
        return append.append(str).append('}').toString();
    }
}
