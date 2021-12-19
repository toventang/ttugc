package com.p2082ss.android.ugc.aweme.p2929fe.p2930a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.keva.Keva;

/* renamed from: com.ss.android.ugc.aweme.fe.a.e */
public final class C47809e {

    /* renamed from: a */
    private Keva f110761a;

    static {
        Covode.recordClassIndex(56435);
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.a.e$a */
    public static class C47810a {

        /* renamed from: a */
        public static C47809e f110762a = new C47809e((byte) 0);

        static {
            Covode.recordClassIndex(56436);
        }
    }

    private C47809e() {
        this.f110761a = Keva.getRepoFromSp(C17867d.m33078a(), "fe-storage", 0);
    }

    /* synthetic */ C47809e(byte b) {
        this();
    }

    /* renamed from: a */
    public final String mo79873a(String str, String str2) {
        return this.f110761a.getString(str, str2);
    }

    /* renamed from: b */
    public final void mo79877b(String str, String str2) {
        this.f110761a.storeString(str, str2);
    }

    /* renamed from: a */
    public final Boolean mo79871a(String str, Boolean bool) {
        return Boolean.valueOf(this.f110761a.getBoolean(str, bool.booleanValue()));
    }

    /* renamed from: b */
    public final void mo79875b(String str, Boolean bool) {
        this.f110761a.storeBoolean(str, bool.booleanValue());
    }

    /* renamed from: a */
    public final Integer mo79872a(String str, Integer num) {
        return Integer.valueOf(this.f110761a.getInt(str, num.intValue()));
    }

    /* renamed from: b */
    public final void mo79876b(String str, Integer num) {
        this.f110761a.storeInt(str, num.intValue());
    }

    /* renamed from: a */
    public final boolean mo79874a(String str, Object obj) {
        if (!(str == null || obj == null)) {
            try {
                if (!(obj instanceof String)) {
                    return false;
                }
                mo79877b(str, (String) obj);
                return true;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }
}
