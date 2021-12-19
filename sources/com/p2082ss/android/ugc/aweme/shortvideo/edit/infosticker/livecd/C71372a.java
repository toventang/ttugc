package com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.livecd;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.livecd.a */
public final class C71372a {

    /* renamed from: a */
    public static final C71373a f159952a = new C71373a((byte) 0);

    /* renamed from: b */
    private final Keva f159953b;

    static {
        Covode.recordClassIndex(83900);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.livecd.a$a */
    public static final class C71373a {
        static {
            Covode.recordClassIndex(83901);
        }

        private C71373a() {
        }

        public /* synthetic */ C71373a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final boolean mo112863a() {
        return this.f159953b.getBoolean("has_live_cd_edit_hint_show", false);
    }

    /* renamed from: b */
    public final void mo112864b() {
        this.f159953b.storeBoolean("has_live_cd_edit_hint_show", true);
    }

    /* renamed from: c */
    public final boolean mo112865c() {
        return this.f159953b.getBoolean("is_has_live_cd_permission", false);
    }

    public C71372a() {
        Keva repo = Keva.getRepo("live_cd_sticker_keva_repo");
        C89219l.m154716b(repo, "");
        this.f159953b = repo;
    }

    /* renamed from: a */
    public final void mo112862a(boolean z) {
        this.f159953b.storeBoolean("is_has_live_cd_permission", z);
    }
}
