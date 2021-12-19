package com.p2082ss.android.ugc.aweme.money.growth;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.money.growth.d */
public final class C60178d {

    /* renamed from: d */
    public static final C60179a f137175d = new C60179a((byte) 0);

    /* renamed from: a */
    public int f137176a;

    /* renamed from: b */
    public boolean f137177b;

    /* renamed from: c */
    public String f137178c = "";

    /* renamed from: e */
    private final Keva f137179e;

    static {
        Covode.recordClassIndex(70707);
    }

    /* renamed from: com.ss.android.ugc.aweme.money.growth.d$a */
    public static final class C60179a {
        static {
            Covode.recordClassIndex(70708);
        }

        private C60179a() {
        }

        public /* synthetic */ C60179a(byte b) {
            this();
        }
    }

    public C60178d() {
        Keva repo = Keva.getRepo("money_growth");
        C89219l.m154716b(repo, "");
        this.f137179e = repo;
        mo97850a(repo.getInt("deepLinkDialogShown", 0));
        mo97852a(repo.getBoolean("has_showed_pop", false));
        String string = repo.getString("activity_id_for_deeplink", "");
        if (string != null) {
            mo97851a(string);
        }
    }

    /* renamed from: a */
    public final void mo97851a(String str) {
        C89219l.m154721d(str, "");
        this.f137178c = str;
        this.f137179e.storeString("activity_id_for_deeplink", str);
    }

    /* renamed from: a */
    public final void mo97850a(int i) {
        this.f137176a = i;
        this.f137179e.storeInt("deepLinkDialogShown", i);
        if (i == 2) {
            this.f137179e.storeString("activity_id_for_deeplink", "");
        }
    }

    /* renamed from: a */
    public final void mo97852a(boolean z) {
        this.f137177b = z;
        this.f137179e.storeBoolean("has_showed_pop", z);
    }
}
