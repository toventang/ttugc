package com.p2082ss.android.ugc.aweme.ftc.countdown;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Handler;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.ftc.countdown.e */
public final class C52462e {

    /* renamed from: a */
    public MediaPlayer f120822a;

    /* renamed from: b */
    public Handler f120823b = new Handler();

    /* renamed from: c */
    public AbstractC52464a f120824c;

    /* renamed from: d */
    Runnable f120825d;

    /* renamed from: e */
    public boolean f120826e;

    /* renamed from: f */
    private final Context f120827f;

    /* renamed from: g */
    private final Uri f120828g;

    /* renamed from: com.ss.android.ugc.aweme.ftc.countdown.e$a */
    public interface AbstractC52464a {
        static {
            Covode.recordClassIndex(61860);
        }

        /* renamed from: a */
        void mo88251a(int i);
    }

    static {
        Covode.recordClassIndex(61858);
    }

    /* renamed from: a */
    public final void mo88249a() {
        if (!this.f120826e) {
            this.f120826e = true;
            MediaPlayer mediaPlayer = this.f120822a;
            if (mediaPlayer != null) {
                mediaPlayer.release();
                Runnable runnable = this.f120825d;
                if (runnable != null) {
                    this.f120823b.removeCallbacks(runnable);
                }
            }
        }
    }

    public C52462e(Context context, Uri uri) {
        this.f120827f = context;
        this.f120828g = uri;
        this.f120822a = MediaPlayer.create(context, uri);
    }
}
