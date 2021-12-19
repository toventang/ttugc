package com.bytedance.ies.abmock.datacenter;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.bytedance.p890c.p891a.p892a.p893a.C13468b;
import com.google.gson.C27910f;

/* renamed from: com.bytedance.ies.abmock.datacenter.b */
public final class C16053b {

    /* renamed from: a */
    public static final C16053b f38668a = new C16053b();

    /* renamed from: b */
    public Keva f38669b = Keva.getRepoSync("abtest_data_repo", 1);

    /* renamed from: c */
    private C27910f f38670c;

    static {
        Covode.recordClassIndex(18324);
    }

    private C16053b() {
        System.nanoTime();
    }

    /* renamed from: a */
    public final C27910f mo25441a() {
        if (this.f38670c == null) {
            this.f38670c = new C27910f();
        }
        return this.f38670c;
    }

    /* renamed from: a */
    public final void mo25443a(String str, String str2) {
        this.f38669b.storeString(str, str2);
    }

    /* renamed from: a */
    public final Object mo25442a(String str, Class cls) {
        try {
            return mo25441a().mo46670a(this.f38669b.getString(str, null), cls);
        } catch (Throwable th) {
            C13468b.m24209a("throwable" + th + "  , key = " + str);
            return null;
        }
    }
}
