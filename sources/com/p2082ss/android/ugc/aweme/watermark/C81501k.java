package com.p2082ss.android.ugc.aweme.watermark;

import android.text.TextUtils;
import com.bytedance.common.utility.C13607d;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.C34359ay;
import com.p2082ss.android.ugc.aweme.account.model.AbstractC32846a;
import com.p2082ss.android.ugc.aweme.p2730de.C40970e;
import com.p2082ss.android.ugc.aweme.shortvideo.C70638dj;
import com.p2082ss.android.ugc.aweme.shortvideo.p3793af.p3794a.AbstractC69815a;
import com.p2082ss.android.ugc.aweme.shortvideo.p3793af.p3794a.C69821e;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73991bj;
import com.p2082ss.android.vesdk.EnumC85399bi;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.watermark.k */
public final class C81501k implements AbstractC69815a {

    /* renamed from: a */
    private String f182207a;

    /* renamed from: b */
    private int f182208b;

    /* renamed from: c */
    private int f182209c;

    /* renamed from: d */
    private int f182210d;

    /* renamed from: e */
    private Map<String, String[]> f182211e = new HashMap();

    static {
        Covode.recordClassIndex(94874);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3793af.p3794a.AbstractC69815a
    /* renamed from: b */
    public final void mo110165b() {
        this.f182211e.clear();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3793af.p3794a.AbstractC69815a
    /* renamed from: a */
    public final C69821e mo110163a() {
        int i = (int) ((((float) this.f182208b) / 1080.0f) * 24.0f);
        C69821e eVar = new C69821e();
        eVar.xOffset = i;
        eVar.yOffset = i;
        eVar.position = EnumC85399bi.TL_BR;
        C73991bj.m130128a("WaterMarkPositionConfig xOffset:" + i + " yOffset:" + i + " videoWidth:" + this.f182208b);
        return eVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3793af.p3794a.AbstractC69815a
    /* renamed from: a */
    public final void mo110164a(boolean z, AbstractC32846a aVar) {
        mo110166b(z, aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3793af.p3794a.AbstractC69815a
    /* renamed from: b */
    public final String[] mo110166b(boolean z, AbstractC32846a aVar) {
        String a;
        boolean z2;
        int i;
        if (TextUtils.isEmpty(aVar.mo58658a())) {
            a = aVar.mo58659b();
        } else {
            a = aVar.mo58658a();
        }
        if (a == null) {
            a = "";
        }
        String str = a + z;
        String[] strArr = this.f182211e.get(str);
        if (strArr != null && strArr.length > 0) {
            return strArr;
        }
        String b = C13607d.m24442b(this.f182207a);
        if (TextUtils.isEmpty(a)) {
            C40970e.m82487a((Throwable) new IllegalArgumentException("userId is empty"));
            return null;
        }
        File file = new File(C70638dj.f158108k);
        if (file.exists() || file.mkdirs()) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i2 = this.f182208b;
        if (i2 == 0 || (i = this.f182209c) == 0) {
            return null;
        }
        if (!z2) {
            C40970e.m82487a((Throwable) new IllegalStateException("provide error " + z2 + " " + this.f182208b + " " + this.f182209c));
            return null;
        }
        String[] a2 = C34359ay.m70311a(aVar, i2, i, z, b);
        this.f182211e.put(str, a2);
        return a2;
    }

    public C81501k(String str, int i, int i2, int i3) {
        this.f182207a = str;
        this.f182208b = i;
        this.f182209c = i2;
        this.f182210d = i3;
    }
}
