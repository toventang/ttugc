package com.p2082ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: com.ss.android.ugc.aweme.experiment.fm */
public final class C46936fm {

    /* renamed from: a */
    public static final ProfileMusicTabConfig f109389a = new ProfileMusicTabConfig();

    /* renamed from: b */
    public static final C46936fm f109390b = new C46936fm();

    private C46936fm() {
    }

    static {
        Covode.recordClassIndex(55537);
    }

    /* renamed from: a */
    public static ProfileMusicTabConfig m90230a() {
        ProfileMusicTabConfig profileMusicTabConfig = (ProfileMusicTabConfig) SettingsManager.m29616a().mo25397a("profile_music_tab_config", ProfileMusicTabConfig.class, f109389a);
        if (profileMusicTabConfig == null) {
            return new ProfileMusicTabConfig();
        }
        return profileMusicTabConfig;
    }
}
