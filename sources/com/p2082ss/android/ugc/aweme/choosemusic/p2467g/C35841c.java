package com.p2082ss.android.ugc.aweme.choosemusic.p2467g;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.g.c */
public final class C35841c {

    /* renamed from: a */
    public static final C35840b f84608a = new C35840b((byte) 0);

    /* renamed from: b */
    public static final C35841c f84609b = new C35841c();

    private C35841c() {
    }

    static {
        Covode.recordClassIndex(43080);
    }

    /* renamed from: a */
    public static String m73234a() {
        C35840b bVar = f84608a;
        try {
            bVar = (C35840b) SettingsManager.m29616a().mo25397a("tt_commercial_music_info", C35840b.class, bVar);
        } catch (Throwable unused) {
        }
        if (bVar != null) {
            return bVar.f84607a;
        }
        return null;
    }
}
