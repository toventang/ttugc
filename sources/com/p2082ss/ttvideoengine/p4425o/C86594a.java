package com.p2082ss.ttvideoengine.p4425o;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1781y.C23707a;
import com.bytedance.p1781y.C23715f;
import com.bytedance.vcloud.preload.BuildConfig;
import com.p2082ss.ttm.player.C86277r;
import com.p2082ss.ttvideoengine.C86366b;
import com.p2082ss.ttvideoengine.C86385d;
import com.p2082ss.ttvideoengine.p4418k.AbstractC86561j;
import java.util.HashMap;

/* renamed from: com.ss.ttvideoengine.o.a */
public final class C86594a {

    /* renamed from: a */
    public static String f195104a = "SettingsHelper";

    /* renamed from: b */
    public static String f195105b = C23707a.f56058a;

    /* renamed from: c */
    public static String f195106c = C23707a.f56059b;

    /* renamed from: d */
    public static String f195107d = C23707a.f56060c;

    /* renamed from: e */
    public static String f195108e = "vod";

    /* renamed from: f */
    public static String f195109f = "mdl";

    /* renamed from: g */
    public static int f195110g = 2;

    /* renamed from: h */
    public static int f195111h = 3;

    /* renamed from: i */
    public C23715f f195112i;

    /* renamed from: j */
    public Context f195113j;

    /* renamed from: k */
    public boolean f195114k;

    /* renamed from: l */
    public int f195115l;

    /* renamed from: m */
    public AbstractC86561j f195116m;

    /* renamed from: n */
    private String f195117n;

    /* renamed from: o */
    private String f195118o;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.ttvideoengine.o.a$a */
    public static class C86597a {

        /* renamed from: a */
        public static final C86594a f195122a = new C86594a();

        static {
            Covode.recordClassIndex(101825);
        }
    }

    /* renamed from: d */
    private String m149987d() {
        if (this.f195118o == null) {
            this.f195118o = C86385d.C86400h.f193679a.mo137387f();
        }
        return this.f195118o;
    }

    /* renamed from: a */
    public static C86594a m149985a() {
        if (C86597a.f195122a.f195112i == null) {
            C86597a.f195122a.f195112i = C23715f.m44812a();
        }
        return C86597a.f195122a;
    }

    /* renamed from: c */
    private String m149986c() {
        if (this.f195117n == null) {
            this.f195117n = C86277r.m148504a(14, "");
        }
        return this.f195117n;
    }

    static {
        Covode.recordClassIndex(101822);
    }

    /* renamed from: b */
    public final C86594a mo137863b() {
        String str;
        if (!TextUtils.isEmpty(C86366b.f193481g)) {
            if (C86366b.f193481g.equals("cn-north-1")) {
                C23707a.f56065h = C23707a.f56058a;
            } else {
                C23707a.f56065h = C86366b.f193481g;
            }
        }
        HashMap hashMap = new HashMap();
        hashMap.put("aid", Integer.valueOf(C86366b.f193476b));
        hashMap.put("app_name", C86366b.f193477c);
        if (C86366b.f193480f == null) {
            str = "";
        } else {
            str = C86366b.f193480f;
        }
        hashMap.put("device_id", str);
        hashMap.put("app_channel", C86366b.f193478d);
        hashMap.put("app_version", C86366b.f193479e);
        C23707a.f56066i = hashMap;
        HashMap hashMap2 = new HashMap();
        hashMap2.put("sdk_version", "1.10.61.5");
        hashMap2.put("player_version", m149986c());
        hashMap2.put("mdl_version", m149987d());
        hashMap2.put("st_version", BuildConfig.VERSION_NAME);
        hashMap2.put("settings_version", "2.0.1");
        C23707a.f56067j = hashMap2;
        return this;
    }

    /* renamed from: a */
    public final C86594a mo137861a(String str) {
        C23715f fVar;
        if (!(this.f195115l == 0 || this.f195113j == null || (fVar = this.f195112i) == null)) {
            fVar.mo39144a(str);
        }
        return this;
    }

    /* renamed from: a */
    public final void mo137862a(int i) {
        this.f195115l = i;
        if (C23707a.f56065h != null) {
            mo137863b().mo137861a(f195108e);
        }
    }

    /* renamed from: a */
    public final int mo137859a(String str, int i) {
        if (this.f195115l == 0) {
            return i;
        }
        return this.f195112i.mo39142a("vod", str, i);
    }

    /* renamed from: a */
    public final C86594a mo137860a(int i, String str) {
        switch (i) {
            case 116:
                C23707a.f56064g = str;
                break;
            case 117:
                C23707a.f56063f = str;
                break;
            case 118:
                C23707a.f56062e = str;
                break;
        }
        return this;
    }
}
