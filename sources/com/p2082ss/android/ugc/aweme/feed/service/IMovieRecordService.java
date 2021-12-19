package com.p2082ss.android.ugc.aweme.feed.service;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.feed.service.IMovieRecordService */
public interface IMovieRecordService {

    /* renamed from: com.ss.android.ugc.aweme.feed.service.IMovieRecordService$a */
    public interface AbstractC49911a {
        static {
            Covode.recordClassIndex(59021);
        }
    }

    static {
        Covode.recordClassIndex(59020);
    }

    void startRecordMovie(Activity activity, String str, int i, int i2, AbstractC49911a aVar);

    void startRecordMovie(Fragment fragment, String str);

    void startRecordMovie(Fragment fragment, String str, int i);
}
