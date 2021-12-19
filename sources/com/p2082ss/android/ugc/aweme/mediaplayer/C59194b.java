package com.p2082ss.android.ugc.aweme.mediaplayer;

import android.content.Context;
import android.view.Surface;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.medialib.player.IESMediaPlayer;

/* renamed from: com.ss.android.ugc.aweme.mediaplayer.b */
public final class C59194b implements AbstractC59193a {

    /* renamed from: a */
    private IESMediaPlayer f134721a;

    /* renamed from: b */
    private Context f134722b;

    static {
        Covode.recordClassIndex(69554);
    }

    @Override // com.p2082ss.android.ugc.aweme.mediaplayer.AbstractC59193a
    /* renamed from: a */
    public final void mo96707a() {
        IESMediaPlayer iESMediaPlayer = this.f134721a;
        if (iESMediaPlayer != null) {
            iESMediaPlayer.pause();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.mediaplayer.AbstractC59193a
    /* renamed from: b */
    public final void mo96713b() {
        IESMediaPlayer iESMediaPlayer = this.f134721a;
        if (iESMediaPlayer != null) {
            iESMediaPlayer.resume();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.mediaplayer.AbstractC59193a
    /* renamed from: c */
    public final void mo96716c() {
        IESMediaPlayer iESMediaPlayer = this.f134721a;
        if (iESMediaPlayer != null) {
            iESMediaPlayer.stop();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.mediaplayer.AbstractC59193a
    /* renamed from: d */
    public final void mo96717d() {
        IESMediaPlayer iESMediaPlayer = this.f134721a;
        if (iESMediaPlayer != null) {
            iESMediaPlayer.release();
            this.f134721a = null;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.mediaplayer.AbstractC59193a
    /* renamed from: e */
    public final long mo96718e() {
        IESMediaPlayer iESMediaPlayer = this.f134721a;
        if (iESMediaPlayer != null) {
            return iESMediaPlayer.getDuration();
        }
        return 0;
    }

    @Override // com.p2082ss.android.ugc.aweme.mediaplayer.AbstractC59193a
    /* renamed from: f */
    public final long mo96719f() {
        IESMediaPlayer iESMediaPlayer = this.f134721a;
        if (iESMediaPlayer != null) {
            return iESMediaPlayer.getCurrentPosition();
        }
        return 0;
    }

    public C59194b(Context context) {
        this.f134722b = context;
        this.f134721a = new IESMediaPlayer(context);
    }

    @Override // com.p2082ss.android.ugc.aweme.mediaplayer.AbstractC59193a
    /* renamed from: a */
    public final int mo96705a(long j) {
        IESMediaPlayer iESMediaPlayer = this.f134721a;
        if (iESMediaPlayer != null) {
            return iESMediaPlayer.seek(j);
        }
        return -1;
    }

    @Override // com.p2082ss.android.ugc.aweme.mediaplayer.AbstractC59193a
    /* renamed from: b */
    public final int mo96712b(long j) {
        IESMediaPlayer iESMediaPlayer = this.f134721a;
        if (iESMediaPlayer != null) {
            return iESMediaPlayer.seekLeft(j);
        }
        return -1;
    }

    @Override // com.p2082ss.android.ugc.aweme.mediaplayer.AbstractC59193a
    /* renamed from: c */
    public final int mo96715c(long j) {
        IESMediaPlayer iESMediaPlayer = this.f134721a;
        if (iESMediaPlayer != null) {
            return iESMediaPlayer.seekRight(j);
        }
        return -1;
    }

    @Override // com.p2082ss.android.ugc.aweme.mediaplayer.AbstractC59193a
    /* renamed from: a */
    public final int mo96706a(String str) {
        if (this.f134721a == null) {
            this.f134721a = new IESMediaPlayer(this.f134722b);
        }
        return this.f134721a.prepare(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.mediaplayer.AbstractC59193a
    /* renamed from: b */
    public final void mo96714b(double d) {
        IESMediaPlayer iESMediaPlayer = this.f134721a;
        if (iESMediaPlayer != null) {
            iESMediaPlayer.setSpeed(d);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.mediaplayer.AbstractC59193a
    /* renamed from: a */
    public final void mo96708a(double d) {
        IESMediaPlayer iESMediaPlayer = this.f134721a;
        if (iESMediaPlayer != null) {
            iESMediaPlayer.setVolume(d);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.mediaplayer.AbstractC59193a
    /* renamed from: a */
    public final void mo96710a(boolean z) {
        IESMediaPlayer iESMediaPlayer = this.f134721a;
        if (iESMediaPlayer != null) {
            iESMediaPlayer.setLoop(z);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.mediaplayer.AbstractC59193a
    /* renamed from: a */
    public final boolean mo96711a(Surface surface) {
        IESMediaPlayer iESMediaPlayer = this.f134721a;
        if (iESMediaPlayer == null) {
            return false;
        }
        iESMediaPlayer.start(surface);
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.mediaplayer.AbstractC59193a
    /* renamed from: a */
    public final void mo96709a(long j, long j2) {
        IESMediaPlayer iESMediaPlayer = this.f134721a;
        if (iESMediaPlayer != null) {
            iESMediaPlayer.setBoundary(j, j2);
        }
    }
}
