package com.p2082ss.android.ugc.aweme.port.p3561in;

import android.content.Intent;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.draft.model.CutSameEditData;
import com.p2082ss.android.ugc.aweme.services.upload.IServiceMusicResDownListener;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;

/* renamed from: com.ss.android.ugc.aweme.port.in.at */
public interface AbstractC63194at {

    /* renamed from: com.ss.android.ugc.aweme.port.in.at$a */
    public interface AbstractC63195a {
        static {
            Covode.recordClassIndex(74468);
        }

        /* renamed from: a */
        Intent mo101652a(CutSameEditData cutSameEditData);

        /* renamed from: a */
        String mo101653a();

        /* renamed from: a */
        void mo101654a(ActivityC0945e eVar);

        /* renamed from: a */
        void mo101655a(ActivityC0945e eVar, MusicModel musicModel, IServiceMusicResDownListener iServiceMusicResDownListener, String str);

        /* renamed from: a */
        void mo101656a(ActivityC0945e eVar, String str, String str2);

        /* renamed from: a */
        void mo101657a(C43223c cVar);

        /* renamed from: b */
        String mo101658b();

        /* renamed from: b */
        void mo101659b(ActivityC0945e eVar);

        /* renamed from: b */
        void mo101660b(C43223c cVar);

        /* renamed from: c */
        String mo101661c();

        /* renamed from: c */
        void mo101662c(ActivityC0945e eVar);

        /* renamed from: d */
        void mo101663d();
    }

    static {
        Covode.recordClassIndex(74467);
    }

    /* renamed from: a */
    AbstractC63195a mo101651a();
}
