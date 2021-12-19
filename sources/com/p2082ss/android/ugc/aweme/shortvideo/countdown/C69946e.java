package com.p2082ss.android.ugc.aweme.shortvideo.countdown;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Handler;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.countdown.e */
public final class C69946e {

    /* renamed from: a */
    public MediaPlayer f156331a;

    /* renamed from: b */
    public Handler f156332b = new Handler();

    /* renamed from: c */
    public AbstractC69948a f156333c;

    /* renamed from: d */
    public Runnable f156334d;

    /* renamed from: e */
    public boolean f156335e;

    /* renamed from: f */
    private final Context f156336f;

    /* renamed from: g */
    private final Uri f156337g;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.countdown.e$a */
    public interface AbstractC69948a {
        static {
            Covode.recordClassIndex(82359);
        }

        /* renamed from: a */
        void mo110397a(int i);
    }

    static {
        Covode.recordClassIndex(82357);
    }

    /* renamed from: a */
    public final void mo110395a() {
        if (!this.f156335e) {
            this.f156335e = true;
            MediaPlayer mediaPlayer = this.f156331a;
            if (mediaPlayer != null) {
                mediaPlayer.release();
                Runnable runnable = this.f156334d;
                if (runnable != null) {
                    this.f156332b.removeCallbacks(runnable);
                }
            }
        }
    }

    public C69946e(Context context, Uri uri) {
        this.f156336f = context;
        this.f156337g = uri;
        this.f156331a = MediaPlayer.create(context, uri);
    }
}
