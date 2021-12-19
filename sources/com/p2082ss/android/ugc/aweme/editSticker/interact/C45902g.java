package com.p2082ss.android.ugc.aweme.editSticker.interact;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4619j.C89271h;

/* renamed from: com.ss.android.ugc.aweme.editSticker.interact.g */
public final class C45902g {

    /* renamed from: b */
    public static final C45903a f106890b = new C45903a((byte) 0);

    /* renamed from: a */
    public final Keva f106891a;

    static {
        Covode.recordClassIndex(54426);
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.interact.g$a */
    public static final class C45903a {
        static {
            Covode.recordClassIndex(54427);
        }

        private C45903a() {
        }

        public /* synthetic */ C45903a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final boolean mo77279a() {
        return this.f106891a.getBoolean("info_sticker_hint_set", false);
    }

    /* renamed from: b */
    public final void mo77280b() {
        this.f106891a.storeBoolean("info_sticker_hint_set", true);
    }

    /* renamed from: c */
    public final boolean mo77282c() {
        return this.f106891a.getBoolean("text_sticker_hint_set", false);
    }

    /* renamed from: d */
    public final boolean mo77283d() {
        return this.f106891a.getBoolean("interact_sticker_hint_set", false);
    }

    /* renamed from: e */
    public final boolean mo77284e() {
        return this.f106891a.getBoolean("lyric_sticker_hint_set", false);
    }

    /* renamed from: f */
    public final boolean mo77285f() {
        if (this.f106891a.getInt("read_text_toast_shown", 0) < 3) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final boolean mo77286g() {
        if (this.f106891a.getInt("change_text_toast_shown", 0) < 3) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public final void mo77287h() {
        Keva keva = this.f106891a;
        keva.storeInt("read_text_change_toast", keva.getInt("read_text_change_toast", 0) + 1);
    }

    public C45902g() {
        Keva repo = Keva.getRepo("text_sticker_keva");
        C89219l.m154716b(repo, "");
        this.f106891a = repo;
    }

    /* renamed from: a */
    public final void mo77278a(boolean z) {
        if (z) {
            this.f106891a.storeInt("edit_text_tux_bubble_1", 3);
            return;
        }
        Keva keva = this.f106891a;
        keva.storeInt("edit_text_tux_bubble_1", C89271h.m154772c(keva.getInt("edit_text_tux_bubble_1", 0) + 1, 3));
    }

    /* renamed from: b */
    public final void mo77281b(boolean z) {
        if (z) {
            this.f106891a.storeInt("read_text_toast_shown", 4);
            return;
        }
        Keva keva = this.f106891a;
        keva.storeInt("read_text_toast_shown", C89271h.m154772c(keva.getInt("read_text_toast_shown", 0) + 1, 4));
    }
}
