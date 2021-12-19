package com.p2082ss.android.ugc.aweme.kids.p3302a.p3312i;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.trill.R;
import java.net.URI;
import java.util.Collection;

/* renamed from: com.ss.android.ugc.aweme.kids.a.i.c */
public class C57147c {

    /* renamed from: a */
    private static final String f130107a = C57147c.class.getSimpleName();

    /* renamed from: b */
    private static final boolean f130108b = false;

    static {
        Covode.recordClassIndex(67041);
    }

    /* renamed from: a */
    public static String m103542a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new URI(str).getHost();
        } catch (Exception e) {
            e.printStackTrace();
            C51423a.m95787a("music url illegal");
            return null;
        }
    }

    /* renamed from: a */
    public static void m103543a(MusicModel musicModel) {
        if (musicModel.getMusic() != null && musicModel.getMusic().getChallenge() != null) {
            AVExternalServiceImpl.m113114a().publishService().addChallenge(musicModel.getMusic().getChallenge());
        }
    }

    /* renamed from: a */
    public static boolean m103544a(MusicModel musicModel, Context context, boolean z) {
        if (musicModel == null) {
            return false;
        }
        if (f130108b) {
            musicModel.getMusicStatus();
            musicModel.getLocalPath();
        }
        if (!TextUtils.isEmpty(musicModel.getLocalPath())) {
            return true;
        }
        if (musicModel.getUrl() != null && !TextUtils.isEmpty(musicModel.getUrl().getUri()) && !C13603b.m24435a((Collection) musicModel.getUrl().getUrlList()) && musicModel.getMusicStatus() != 0) {
            return true;
        }
        String offlineDesc = musicModel.getOfflineDesc();
        if (TextUtils.isEmpty(offlineDesc)) {
            offlineDesc = context.getString(R.string.dau);
        }
        if (z) {
            new C79459a(context).mo123052a(offlineDesc).mo123053a();
        }
        return false;
    }
}
