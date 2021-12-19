package com.bytedance.android.livesdk.model;

import android.text.TextUtils;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.model.m */
public class C9594m implements AbstractC9519af {
    @AbstractC27891c(mo46611a = "id")

    /* renamed from: a */
    public long f23272a;
    @AbstractC27891c(mo46611a = "title")

    /* renamed from: b */
    public String f23273b;
    @AbstractC27891c(mo46611a = "url_list")

    /* renamed from: c */
    public List<String> f23274c;
    @AbstractC27891c(mo46611a = "uri")

    /* renamed from: d */
    public String f23275d;
    @AbstractC27891c(mo46611a = "height")

    /* renamed from: e */
    public int f23276e;
    @AbstractC27891c(mo46611a = "width")

    /* renamed from: f */
    public int f23277f;
    @AbstractC27891c(mo46611a = "schema_url")

    /* renamed from: g */
    public String f23278g;
    @AbstractC27891c(mo46611a = "text")

    /* renamed from: h */
    public String f23279h;
    @AbstractC27891c(mo46611a = "avg_color")

    /* renamed from: i */
    public String f23280i;
    @AbstractC27891c(mo46611a = "banner_type")

    /* renamed from: j */
    public int f23281j;

    /* renamed from: k */
    private ImageModel f23282k;

    static {
        Covode.recordClassIndex(11133);
    }

    @Override // com.bytedance.android.livesdk.model.AbstractC9519af
    public long getId() {
        return this.f23272a;
    }

    @Override // com.bytedance.android.livesdk.model.AbstractC9519af
    public String getMixId() {
        return String.valueOf(getId());
    }

    /* renamed from: a */
    public final ImageModel mo16557a() {
        if (!(this.f23282k != null || this.f23274c == null || this.f23275d == null)) {
            this.f23282k = new ImageModel(this.f23275d, this.f23274c);
        }
        return this.f23282k;
    }

    /* renamed from: a */
    public final boolean mo16558a(C9594m mVar) {
        if (this == mVar) {
            return true;
        }
        if (!(mVar != null && this.f23272a == mVar.f23272a && TextUtils.equals(this.f23273b, mVar.f23273b) && TextUtils.equals(this.f23275d, mVar.f23275d) && TextUtils.equals(this.f23278g, mVar.f23278g) && TextUtils.equals(this.f23279h, mVar.f23279h) && this.f23277f == mVar.f23277f && this.f23276e == mVar.f23276e)) {
            return false;
        }
        List<String> list = this.f23274c;
        if (list == null) {
            if (mVar.f23274c != null) {
                return false;
            }
            if (mVar.f23274c == null) {
                return true;
            }
        } else if (mVar.f23274c == null) {
            return false;
        }
        if (list.size() != mVar.f23274c.size()) {
            return false;
        }
        for (int i = 0; i < this.f23274c.size(); i++) {
            if (!TextUtils.equals(this.f23274c.get(i), mVar.f23274c.get(i))) {
                return false;
            }
        }
        return true;
    }
}
