package com.p2082ss.android.ugc.aweme.music.presenter;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.p1610b.AbstractC21997e;
import com.bytedance.retrofit2.p1610b.AbstractC21999g;
import com.bytedance.retrofit2.p1610b.AbstractC22012t;
import com.google.gson.p2018a.AbstractC27891c;
import p4560f.p4561a.AbstractC88979t;

/* renamed from: com.ss.android.ugc.aweme.music.presenter.EditOriginMusicTitlePresenter */
public final class EditOriginMusicTitlePresenter {

    /* renamed from: a */
    public AbstractC60840b f138254a;

    /* renamed from: com.ss.android.ugc.aweme.music.presenter.EditOriginMusicTitlePresenter$MusicTitleApi */
    public interface MusicTitleApi {
        static {
            Covode.recordClassIndex(71426);
        }

        @AbstractC22012t(mo35799a = "/aweme/v1/music/update/")
        @AbstractC21999g
        AbstractC88979t<C60839a> alterMusicTitle(@AbstractC21997e(mo35786a = "music_id") String str, @AbstractC21997e(mo35786a = "title") String str2);
    }

    /* renamed from: com.ss.android.ugc.aweme.music.presenter.EditOriginMusicTitlePresenter$a */
    public static class C60839a {
        @AbstractC27891c(mo46611a = "status_code")

        /* renamed from: a */
        public int f138256a;
        @AbstractC27891c(mo46611a = "status_msg")

        /* renamed from: b */
        public String f138257b;

        static {
            Covode.recordClassIndex(71427);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.presenter.EditOriginMusicTitlePresenter$b */
    public interface AbstractC60840b {
        static {
            Covode.recordClassIndex(71428);
        }

        /* renamed from: a */
        void mo98490a();

        /* renamed from: a */
        void mo98491a(String str);
    }

    static {
        Covode.recordClassIndex(71424);
    }

    public EditOriginMusicTitlePresenter(AbstractC60840b bVar) {
        this.f138254a = bVar;
    }
}
