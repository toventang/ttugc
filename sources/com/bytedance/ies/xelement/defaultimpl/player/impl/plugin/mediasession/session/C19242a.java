package com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.mediasession.session;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.support.p010v4.media.MediaMetadataCompat;
import android.support.p010v4.media.session.MediaSessionCompat;
import android.support.p010v4.media.session.PlaybackStateCompat;
import android.view.KeyEvent;
import androidx.media.p067b.C1274a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.AbstractC19173b;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.AbstractC19192a;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.C19194c;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19158c;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.EnumC19170o;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19181b;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19186f;
import com.bytedance.ies.xelement.p1364b.C19004g;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89376n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.mediasession.session.a */
public final class C19242a implements AbstractC19192a {

    /* renamed from: e */
    public static final C19244b f45451e = new C19244b((byte) 0);

    /* renamed from: a */
    public final Context f45452a;

    /* renamed from: b */
    public final AbstractC19158c f45453b;

    /* renamed from: c */
    public final AbstractC19181b f45454c;

    /* renamed from: d */
    public final AbstractC19173b f45455d;

    /* renamed from: f */
    private final MediaSessionCompat f45456f;

    /* renamed from: g */
    private final AbstractC89244h f45457g = C89250i.m154773a((AbstractC89171a) C19246d.f45463a);

    /* renamed from: h */
    private final AbstractC89244h f45458h = C89250i.m154773a((AbstractC89171a) C19245c.f45462a);

    static {
        Covode.recordClassIndex(22010);
    }

    /* renamed from: e */
    private final PlaybackStateCompat.C0147a m35940e() {
        return (PlaybackStateCompat.C0147a) this.f45457g.getValue();
    }

    /* renamed from: f */
    private final MediaMetadataCompat.C0101a m35941f() {
        return (MediaMetadataCompat.C0101a) this.f45458h.getValue();
    }

    /* renamed from: com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.mediasession.session.a$b */
    public static final class C19244b {
        static {
            Covode.recordClassIndex(22012);
        }

        private C19244b() {
        }

        public /* synthetic */ C19244b(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.mediasession.session.a$c */
    static final class C19245c extends AbstractC89220m implements AbstractC89171a<MediaMetadataCompat.C0101a> {

        /* renamed from: a */
        public static final C19245c f45462a = new C19245c();

        static {
            Covode.recordClassIndex(22013);
        }

        C19245c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ MediaMetadataCompat.C0101a invoke() {
            return new MediaMetadataCompat.C0101a();
        }
    }

    /* renamed from: com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.mediasession.session.a$d */
    static final class C19246d extends AbstractC89220m implements AbstractC89171a<PlaybackStateCompat.C0147a> {

        /* renamed from: a */
        public static final C19246d f45463a = new C19246d();

        static {
            Covode.recordClassIndex(22014);
        }

        C19246d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ PlaybackStateCompat.C0147a invoke() {
            return new PlaybackStateCompat.C0147a();
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.AbstractC19192a
    /* renamed from: a */
    public final void mo30373a() {
        try {
            MediaSessionCompat mediaSessionCompat = this.f45456f;
            mediaSessionCompat.mo163a(false);
            mediaSessionCompat.mo161a((MediaSessionCompat.AbstractC0126a) null);
            mediaSessionCompat.mo165c();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: c */
    public final MediaSessionCompat.Token mo30599c() {
        MediaSessionCompat.Token d = this.f45456f.mo166d();
        C89219l.m154709a((Object) d, "");
        return d;
    }

    /* renamed from: com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.mediasession.session.a$a */
    public static final class C19243a extends MediaSessionCompat.AbstractC0126a {

        /* renamed from: a */
        final /* synthetic */ MediaSessionCompat f45459a;

        /* renamed from: d */
        final /* synthetic */ C19242a f45460d;

        /* renamed from: e */
        final /* synthetic */ ComponentName f45461e;

        static {
            Covode.recordClassIndex(22011);
        }

        @Override // android.support.p010v4.media.session.MediaSessionCompat.AbstractC0126a
        /* renamed from: a */
        public final void mo182a() {
            super.mo182a();
            if (this.f45459a.mo164b()) {
                this.f45460d.f45453b.mo30395c(null);
            }
        }

        @Override // android.support.p010v4.media.session.MediaSessionCompat.AbstractC0126a
        /* renamed from: b */
        public final void mo187b() {
            super.mo187b();
            if (this.f45459a.mo164b()) {
                this.f45460d.f45453b.mo30397d(new C19194c("PAUSE_FROM_MEDIA_SESSION_CALLBACK"));
            }
        }

        @Override // android.support.p010v4.media.session.MediaSessionCompat.AbstractC0126a
        /* renamed from: e */
        public final void mo190e() {
            super.mo190e();
            if (this.f45459a.mo164b()) {
                this.f45460d.f45453b.mo30401f(new C19194c("STOP_FROM_MEDIA_SESSION_CALLBACK"));
            }
        }

        @Override // android.support.p010v4.media.session.MediaSessionCompat.AbstractC0126a
        /* renamed from: c */
        public final void mo188c() {
            super.mo188c();
            if (this.f45459a.mo164b() && this.f45460d.f45454c.mo30404i()) {
                this.f45460d.f45455d.mo30393b(new C19194c("operation_from_media_session_skip_to_next"));
            }
        }

        @Override // android.support.p010v4.media.session.MediaSessionCompat.AbstractC0126a
        /* renamed from: d */
        public final void mo189d() {
            super.mo189d();
            if (this.f45459a.mo164b() && this.f45460d.f45454c.mo30405j()) {
                this.f45460d.f45455d.mo30386a(new C19194c("operation_from_media_session_skip_to_prev"));
            }
        }

        @Override // android.support.p010v4.media.session.MediaSessionCompat.AbstractC0126a
        /* renamed from: a */
        public final void mo183a(long j) {
            super.mo183a(j);
            if (this.f45459a.mo164b()) {
                this.f45460d.f45453b.mo30374a(j, null);
            }
        }

        @Override // android.support.p010v4.media.session.MediaSessionCompat.AbstractC0126a
        /* renamed from: a */
        public final boolean mo186a(Intent intent) {
            C89219l.m154719c(intent, "");
            KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
            C89219l.m154709a((Object) keyEvent, "");
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 79) {
                C19004g.f44970a.mo30155a("MediaSessionController", "KEYCODE_HEADSETHOOK");
            } else if (keyCode == 126) {
                C19004g.f44970a.mo30155a("MediaSessionController", "KEYCODE_MEDIA_PLAY");
            } else if (keyCode != 127) {
                switch (keyCode) {
                    case 85:
                        C19004g.f44970a.mo30155a("MediaSessionController", "KEYCODE_MEDIA_PLAY_PAUSE");
                        break;
                    case 86:
                        C19004g.f44970a.mo30155a("MediaSessionController", "KEYCODE_MEDIA_STOP");
                        break;
                    case 87:
                        C19004g.f44970a.mo30155a("MediaSessionController", "KEYCODE_MEDIA_NEXT");
                        break;
                    case 88:
                        C19004g.f44970a.mo30155a("MediaSessionController", "KEYCODE_MEDIA_PREVIOUS");
                        break;
                }
            } else {
                C19004g.f44970a.mo30155a("MediaSessionController", "KEYCODE_MEDIA_PAUSE");
            }
            return super.mo186a(intent);
        }

        C19243a(MediaSessionCompat mediaSessionCompat, C19242a aVar, ComponentName componentName) {
            this.f45459a = mediaSessionCompat;
            this.f45460d = aVar;
            this.f45461e = componentName;
        }
    }

    /* renamed from: b */
    public final void mo30598b() {
        long j;
        MediaMetadataCompat.C0101a f = m35941f();
        AbstractC19186f m = this.f45454c.mo30408m();
        if (m != null) {
            j = m.getDuration();
        } else {
            j = 0;
        }
        long d = this.f45453b.mo30396d();
        if (d > 0) {
            j = d;
        }
        f.mo116a("android.media.metadata.DURATION", j);
        this.f45456f.mo160a(m35941f().mo119a());
    }

    /* renamed from: d */
    public final void mo30600d() {
        boolean z;
        EnumC19170o b = this.f45453b.mo30387b();
        int a = m35939a(b);
        m35940e().mo288a();
        m35940e().mo289a(a, this.f45453b.mo30394c());
        this.f45456f.mo162a(m35940e().mo291b());
        MediaSessionCompat mediaSessionCompat = this.f45456f;
        if (b != EnumC19170o.PLAYBACK_STATE_STOPPED) {
            z = true;
        } else {
            z = false;
        }
        mediaSessionCompat.mo163a(z);
    }

    /* renamed from: a */
    public final void mo30597a(boolean z) {
        this.f45456f.mo163a(z);
    }

    /* renamed from: a */
    private static int m35939a(EnumC19170o oVar) {
        int i = C19247b.f45464a[oVar.ordinal()];
        if (i == 1 || i == 2) {
            return 3;
        }
        if (i == 3) {
            return 2;
        }
        if (i == 4 || i == 5) {
            return 1;
        }
        throw new C89376n();
    }

    /* renamed from: a */
    public final void mo30594a(Intent intent) {
        C89219l.m154719c(intent, "");
        C1274a.m4047a(this.f45456f, intent);
    }

    /* renamed from: a */
    public final void mo30595a(Bitmap bitmap) {
        if (!C89219l.m154714a((Object) Build.MANUFACTURER, (Object) "Xiaomi")) {
            return;
        }
        if (bitmap == null || !bitmap.isRecycled()) {
            m35941f().mo117a("android.media.metadata.ART", bitmap);
            this.f45456f.mo160a(m35941f().mo119a());
            return;
        }
        C19004g.f44970a.mo30156b("MediaSessionController", "coverBitmap(" + bitmap + ") already recycled.");
    }

    /* renamed from: a */
    public final void mo30596a(AbstractC19186f fVar) {
        C89219l.m154719c(fVar, "");
        MediaMetadataCompat.C0101a f = m35941f();
        f.mo118a("android.media.metadata.TITLE", fVar.getSongName());
        f.mo118a("android.media.metadata.ALBUM", fVar.getAlbumName());
        f.mo118a("android.media.metadata.ARTIST", fVar.getArtistName());
        long duration = fVar.getDuration();
        long d = this.f45453b.mo30396d();
        if (d > 0) {
            duration = d;
        }
        f.mo116a("android.media.metadata.DURATION", duration);
        f.mo117a("android.media.metadata.ART", (Bitmap) null);
        this.f45456f.mo163a(true);
        this.f45456f.mo160a(m35941f().mo119a());
    }

    public C19242a(Context context, AbstractC19158c cVar, AbstractC19181b bVar, AbstractC19173b bVar2, ComponentName componentName) {
        C89219l.m154719c(context, "");
        C89219l.m154719c(cVar, "");
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(bVar2, "");
        C89219l.m154719c(componentName, "");
        this.f45452a = context;
        this.f45453b = cVar;
        this.f45454c = bVar;
        this.f45455d = bVar2;
        MediaSessionCompat mediaSessionCompat = new MediaSessionCompat(context, "MediaSessionController", (byte) 0);
        mediaSessionCompat.mo159a(PendingIntent.getBroadcast(context, 0, new Intent("android.intent.action.MEDIA_BUTTON").setComponent(componentName), 0));
        mediaSessionCompat.mo161a(new C19243a(mediaSessionCompat, this, componentName));
        mediaSessionCompat.mo158a();
        this.f45456f = mediaSessionCompat;
    }
}
