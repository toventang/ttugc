package com.p2082ss.android.ugc.aweme.commercialize.media.impl.p2603b;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.commercialize.media.api.p2601a.AbstractC38207a;
import com.p2082ss.android.ugc.aweme.commercialize.media.impl.p2602a.C38208a;
import com.p2082ss.android.ugc.aweme.music.model.Music;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.media.impl.b.a */
public final class C38210a {

    /* renamed from: a */
    public static boolean f90255a;

    /* renamed from: b */
    public static final C38210a f90256b = new C38210a();

    private C38210a() {
    }

    static {
        Covode.recordClassIndex(45691);
    }

    /* renamed from: b */
    public static final boolean m77571b() {
        return SettingsManager.m29616a().mo25400a("enable_music_legal_optimize", false);
    }

    /* renamed from: h */
    private static boolean m77577h() {
        AbstractC38207a a = C38208a.m77568a();
        if (a == null) {
            C89219l.m154715b();
        }
        return a.mo65699e();
    }

    /* renamed from: a */
    public static final boolean m77569a() {
        User f;
        AbstractC38207a a = C38208a.m77568a();
        if (a == null || (f = a.mo65700f()) == null || f.getMusicComplianceAccount() <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    private static boolean m77574e() {
        String str;
        AbstractC38207a a = C38208a.m77568a();
        if (a != null) {
            str = a.mo65696b();
        } else {
            str = null;
        }
        return TextUtils.equals(str, "mission");
    }

    /* renamed from: f */
    private static boolean m77575f() {
        AbstractC38207a a = C38208a.m77568a();
        if (a == null || !a.mo65697c() || !m77571b()) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    private static boolean m77576g() {
        String str;
        AbstractC38207a a = C38208a.m77568a();
        if (a != null) {
            str = a.mo65696b();
        } else {
            str = null;
        }
        return TextUtils.equals(str, "tcm_upload");
    }

    /* renamed from: c */
    public static final boolean m77572c() {
        AbstractC38207a a = C38208a.m77568a();
        if (a != null && a.mo65698d()) {
            return false;
        }
        if (m77569a() || m77573d() || m77575f() || m77576g() || m77574e() || m77577h()) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private static boolean m77573d() {
        String str;
        AbstractC38207a a;
        AbstractC38207a a2 = C38208a.m77568a();
        if (a2 != null) {
            str = a2.mo65696b();
        } else {
            str = null;
        }
        if (!TextUtils.equals(str, "challenge") || (a = C38208a.m77568a()) == null || !a.mo65695a()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static final boolean m77570a(Music music) {
        if (music != null && !music.isCommercialMusic()) {
            return true;
        }
        return false;
    }
}
