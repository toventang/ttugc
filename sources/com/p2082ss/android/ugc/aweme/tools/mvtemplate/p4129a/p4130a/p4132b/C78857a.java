package com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4129a.p4130a.p4132b;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.property.C65402co;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73991bj;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.MvThemeData;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.a.a.b.a */
public final class C78857a {

    /* renamed from: b */
    public static final C78858a f177241b = new C78858a((byte) 0);

    /* renamed from: a */
    public final Keva f177242a;

    /* renamed from: c */
    private final boolean f177243c;

    static {
        Covode.recordClassIndex(92006);
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.a.a.b.a$a */
    public static final class C78858a {
        static {
            Covode.recordClassIndex(92007);
        }

        private C78858a() {
        }

        public /* synthetic */ C78858a(byte b) {
            this();
        }
    }

    public C78857a() {
        Keva repo = Keva.getRepo("pic_mv_theme_data_keva");
        C89219l.m154716b(repo, "");
        this.f177242a = repo;
        boolean z = false;
        this.f177243c = (SettingsManager.m29616a().mo25400a("enable_1080p_photo_mv", false) || C65402co.C65403a.m117104a().f147549a) ? true : z;
    }

    /* renamed from: a */
    public final MvThemeData mo122702a() {
        String string = this.f177242a.getString("single_mv", "");
        MvThemeData mvThemeData = null;
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            mvThemeData = (MvThemeData) C63238c.f143575b.mo46670a(string, MvThemeData.class);
            return mvThemeData;
        } catch (Exception unused) {
            this.f177242a.erase("single_mv");
            return mvThemeData;
        }
    }

    /* renamed from: b */
    public final MvThemeData mo122704b() {
        String string = this.f177242a.getString("slideshow_mv", "");
        MvThemeData mvThemeData = null;
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            mvThemeData = (MvThemeData) C63238c.f143575b.mo46670a(string, MvThemeData.class);
            return mvThemeData;
        } catch (Exception unused) {
            this.f177242a.erase("slideshow_mv");
            return mvThemeData;
        }
    }

    /* renamed from: a */
    public final void mo122703a(MvThemeData mvThemeData) {
        this.f177242a.storeBoolean("photo_mv_is1080p", this.f177243c);
        try {
            this.f177242a.storeString("single_mv", C63238c.f143575b.mo46674b(mvThemeData));
        } catch (Exception e) {
            C73991bj.m130129a(e);
        }
    }

    /* renamed from: b */
    public final void mo122705b(MvThemeData mvThemeData) {
        this.f177242a.storeBoolean("photo_mv_is1080p", this.f177243c);
        try {
            this.f177242a.storeString("slideshow_mv", C63238c.f143575b.mo46674b(mvThemeData));
        } catch (Exception e) {
            C73991bj.m130129a(e);
        }
    }
}
