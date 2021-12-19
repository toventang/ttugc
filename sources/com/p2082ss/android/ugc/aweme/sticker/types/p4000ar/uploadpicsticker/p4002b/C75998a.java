package com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.uploadpicsticker.p4002b;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sticker.EffectSdkExtra;
import com.p2082ss.android.ugc.tools.C84401c;
import com.p2082ss.android.ugc.tools.utils.C84904k;
import java.util.List;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.b.a */
public final class C75998a {

    /* renamed from: r */
    public static final C75999a f170739r = new C75999a((byte) 0);

    /* renamed from: a */
    public String f170740a;

    /* renamed from: b */
    public String f170741b;

    /* renamed from: c */
    public String f170742c;

    /* renamed from: d */
    public boolean f170743d;

    /* renamed from: e */
    public int f170744e;

    /* renamed from: f */
    public String f170745f;

    /* renamed from: g */
    public EffectSdkExtra f170746g = new EffectSdkExtra(null, 1, null);

    /* renamed from: h */
    public long f170747h;

    /* renamed from: i */
    public int f170748i = 1;

    /* renamed from: j */
    public String f170749j;

    /* renamed from: k */
    public String f170750k = "unknown";

    /* renamed from: l */
    public int f170751l = -1;

    /* renamed from: m */
    public int f170752m;

    /* renamed from: n */
    public int f170753n;

    /* renamed from: o */
    public String f170754o;

    /* renamed from: p */
    public String f170755p;

    /* renamed from: q */
    public String f170756q;

    static {
        Covode.recordClassIndex(88942);
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.b.a$a */
    public static final class C75999a {
        static {
            Covode.recordClassIndex(88943);
        }

        private C75999a() {
        }

        public /* synthetic */ C75999a(byte b) {
            this();
        }
    }

    /* renamed from: b */
    public final List<String> mo119702b() {
        return this.f170746g.getPl().getAlg();
    }

    /* renamed from: c */
    public final String mo119703c() {
        return this.f170746g.getPl().getImgK();
    }

    public C75998a() {
    }

    /* renamed from: a */
    public final boolean mo119700a() {
        if (!C84904k.m145909a(this.f170746g.getPl().getAlg())) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final C75998a mo119701b(String str) {
        if (str != null) {
            try {
                this.f170756q = new JSONObject(str).optString("effect_algorithm_hint");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return this;
    }

    /* renamed from: a */
    public final void mo119699a(String str) {
        C89219l.m154721d(str, "");
        if (!TextUtils.isEmpty(str)) {
            try {
                Object a = C84401c.f188719c.mo46670a(str, EffectSdkExtra.class);
                C89219l.m154716b(a, "");
                this.f170746g = (EffectSdkExtra) a;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public C75998a(String str, long j) {
        C89219l.m154721d(str, "");
        this.f170741b = str;
        this.f170747h = j;
    }

    public C75998a(String str, String str2, int i) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.f170741b = str;
        this.f170742c = str2;
        this.f170744e = i;
    }

    public C75998a(String str, String str2, boolean z) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.f170741b = str;
        this.f170742c = str2;
        this.f170743d = z;
    }
}
