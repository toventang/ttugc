package com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d;

import android.media.MediaMetadataRetriever;
import android.media.MediaPlayer;
import android.text.TextUtils;
import android.view.Surface;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.live.alphaplayer.p3401c.C58529d;

/* renamed from: com.ss.android.ugc.aweme.live.alphaplayer.d.b */
public class C58556b extends C58555a<C58556b> {

    /* renamed from: a */
    private MediaPlayer f133393a;

    /* renamed from: h */
    private MediaMetadataRetriever f133394h = new MediaMetadataRetriever();

    /* renamed from: i */
    private String f133395i;

    /* renamed from: j */
    private MediaPlayer.OnCompletionListener f133396j = new MediaPlayer.OnCompletionListener() {
        /* class com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.C58556b.C585571 */

        static {
            Covode.recordClassIndex(68852);
        }

        public final void onCompletion(MediaPlayer mediaPlayer) {
            if (C58556b.this.f133389d != null) {
                C58556b.this.f133389d.mo16789a();
            }
        }
    };

    /* renamed from: k */
    private MediaPlayer.OnPreparedListener f133397k = new MediaPlayer.OnPreparedListener() {
        /* class com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.C58556b.C585582 */

        static {
            Covode.recordClassIndex(68853);
        }

        public final void onPrepared(MediaPlayer mediaPlayer) {
            if (C58556b.this.f133390e != null) {
                C58556b.this.f133390e.mo16791a();
            }
        }
    };

    /* renamed from: l */
    private MediaPlayer.OnErrorListener f133398l = new MediaPlayer.OnErrorListener() {
        /* class com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.C58556b.C585593 */

        static {
            Covode.recordClassIndex(68854);
        }

        public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            if (C58556b.this.f133391f == null) {
                return false;
            }
            C58556b.this.f133391f.mo16792a(i, i2, "");
            return false;
        }
    };

    /* renamed from: m */
    private MediaPlayer.OnInfoListener f133399m = new MediaPlayer.OnInfoListener() {
        /* class com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.C58556b.C585604 */

        static {
            Covode.recordClassIndex(68855);
        }

        public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
            if (i != 3 || C58556b.this.f133392g == null) {
                return false;
            }
            C58556b.this.f133392g.mo16788a();
            return false;
        }
    };

    static {
        Covode.recordClassIndex(68851);
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.AbstractC58561c, com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.C58555a
    /* renamed from: j */
    public final String mo16744j() {
        return "DefaultSystemPlayer";
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.AbstractC58561c, com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.C58555a
    /* renamed from: b */
    public final void mo16735b() {
        this.f133393a.prepareAsync();
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.AbstractC58561c, com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.C58555a
    /* renamed from: c */
    public final void mo16737c() {
        this.f133393a.start();
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.AbstractC58561c, com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.C58555a
    /* renamed from: d */
    public final void mo16738d() {
        this.f133393a.pause();
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.AbstractC58561c, com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.C58555a
    /* renamed from: e */
    public final void mo16739e() {
        this.f133393a.stop();
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.AbstractC58561c, com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.C58555a
    /* renamed from: i */
    public final int mo16743i() {
        return this.f133393a.getCurrentPosition();
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.AbstractC58561c, com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.C58555a
    /* renamed from: k */
    public final boolean mo16756k() {
        return this.f133393a.isPlaying();
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.AbstractC58561c, com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.C58555a
    /* renamed from: f */
    public final void mo16740f() {
        this.f133393a.reset();
        this.f133395i = null;
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.AbstractC58561c, com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.C58555a
    /* renamed from: g */
    public final void mo16741g() {
        this.f133393a.release();
        this.f133395i = null;
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.AbstractC58561c, com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.C58555a
    /* renamed from: a */
    public final void mo16731a() {
        MediaPlayer mediaPlayer = new MediaPlayer();
        this.f133393a = mediaPlayer;
        mediaPlayer.setOnCompletionListener(this.f133396j);
        this.f133393a.setOnPreparedListener(this.f133397k);
        this.f133393a.setOnErrorListener(this.f133398l);
        this.f133393a.setOnInfoListener(this.f133399m);
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.AbstractC58561c, com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.C58555a
    /* renamed from: h */
    public final C58529d mo16742h() {
        if (!TextUtils.isEmpty(this.f133395i)) {
            this.f133394h.setDataSource(this.f133395i);
            String extractMetadata = this.f133394h.extractMetadata(18);
            String extractMetadata2 = this.f133394h.extractMetadata(19);
            if (!TextUtils.isEmpty(extractMetadata) && !TextUtils.isEmpty(extractMetadata2)) {
                return new C58529d(Integer.parseInt(this.f133394h.extractMetadata(18)), Integer.parseInt(this.f133394h.extractMetadata(19)), this.f133393a.getDuration());
            }
            throw new Exception("retriever get metadata failure");
        }
        throw new Exception("dataSource is null, please set setDataSource firstly");
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.AbstractC58561c, com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.C58555a
    /* renamed from: a */
    public final void mo16732a(Surface surface) {
        this.f133393a.setSurface(surface);
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.AbstractC58561c, com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.C58555a
    /* renamed from: a */
    public final void mo16733a(String str) {
        this.f133395i = str;
        this.f133393a.setDataSource(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.AbstractC58561c, com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.C58555a
    /* renamed from: b */
    public final void mo16736b(boolean z) {
        this.f133393a.setScreenOnWhilePlaying(z);
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.AbstractC58561c, com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.C58555a
    /* renamed from: a */
    public final void mo16734a(boolean z) {
        this.f133393a.setLooping(z);
    }
}
