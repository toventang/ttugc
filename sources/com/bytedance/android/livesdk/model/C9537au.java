package com.bytedance.android.livesdk.model;

import android.text.TextUtils;
import com.bytedance.android.live.C4139e;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.model.au */
public class C9537au {
    @AbstractC27891c(mo46611a = "image")

    /* renamed from: a */
    public ImageModel f23159a;
    @AbstractC27891c(mo46611a = "text_color")

    /* renamed from: b */
    public String f23160b;
    @AbstractC27891c(mo46611a = "text_size")

    /* renamed from: c */
    public int f23161c;
    @AbstractC27891c(mo46611a = "content")

    /* renamed from: d */
    public String f23162d;
    @AbstractC27891c(mo46611a = "max_length")

    /* renamed from: e */
    public int f23163e;
    @AbstractC27891c(mo46611a = "input_rect")

    /* renamed from: f */
    public int[] f23164f;
    @AbstractC27891c(mo46611a = StringSet.type)

    /* renamed from: g */
    public int f23165g;
    @AbstractC27891c(mo46611a = "id")

    /* renamed from: h */
    public long f23166h;
    @AbstractC27891c(mo46611a = "x")

    /* renamed from: i */
    public int f23167i = -1;
    @AbstractC27891c(mo46611a = "y")

    /* renamed from: j */
    public int f23168j = -1;
    @AbstractC27891c(mo46611a = "w")

    /* renamed from: k */
    public int f23169k;
    @AbstractC27891c(mo46611a = "h")

    /* renamed from: l */
    public int f23170l;
    @AbstractC27891c(mo46611a = "status")

    /* renamed from: m */
    public int f23171m;
    @AbstractC27891c(mo46611a = "kind")

    /* renamed from: n */
    public int f23172n;
    @AbstractC27891c(mo46611a = "sit_rect")

    /* renamed from: o */
    public List<Double> f23173o;

    static {
        Covode.recordClassIndex(11076);
    }

    public C9537au() {
    }

    /* renamed from: a */
    public final C9533aq mo16523a() {
        if (this.f23165g != 3 || TextUtils.isEmpty(this.f23162d)) {
            return null;
        }
        try {
            return (C9533aq) C4139e.C4140a.f11575b.mo46670a(this.f23162d, C9533aq.class);
        } catch (Exception unused) {
            return null;
        }
    }

    public C9537au(C9537au auVar) {
        this.f23159a = auVar.f23159a;
        this.f23160b = auVar.f23160b;
        this.f23161c = auVar.f23161c;
        this.f23162d = auVar.f23162d;
        this.f23163e = auVar.f23163e;
        this.f23164f = auVar.f23164f;
        this.f23165g = auVar.f23165g;
        this.f23166h = auVar.f23166h;
        this.f23167i = auVar.f23167i;
        this.f23168j = auVar.f23168j;
        this.f23169k = auVar.f23169k;
        this.f23170l = auVar.f23170l;
        this.f23171m = auVar.f23171m;
    }
}
