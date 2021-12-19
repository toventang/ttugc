package com.p2082ss.android.ugc.gamora.editor.sticker.read;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;

/* renamed from: com.ss.android.ugc.gamora.editor.sticker.read.h */
public final class C83064h {

    /* renamed from: a */
    public static final C83064h f185613a = new C83064h();

    private C83064h() {
    }

    static {
        Covode.recordClassIndex(96937);
    }

    /* renamed from: d */
    public static final int m143411d() {
        return C16048b.m29633a().mo25412a(true, "text_reader_allowing_choose_sound_effects", 0);
    }

    /* renamed from: b */
    public static final boolean m143409b() {
        if (!m143408a() || C16048b.m29633a().mo25412a(true, "text_reader_allowing_choose_sound_effects", 0) == 2) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static final boolean m143410c() {
        if (!m143408a() || C16048b.m29633a().mo25412a(true, "text_reader_allowing_choose_sound_effects", 0) == 3) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static final boolean m143408a() {
        if (!C63244g.m114602a().mo73255A().mo93903b() || C63244g.m114602a().mo73255A().mo93901a() || C16048b.m29633a().mo25412a(true, "text_reader_allowing_choose_sound_effects", 0) <= 0) {
            return false;
        }
        return true;
    }
}
