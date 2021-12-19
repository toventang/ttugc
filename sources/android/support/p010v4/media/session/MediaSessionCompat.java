package android.support.p010v4.media.session;

import android.app.PendingIntent;
import android.content.ClipboardManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.media.AudioManager;
import android.media.MediaMetadata;
import android.media.Rating;
import android.media.RemoteControlClient;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.support.p010v4.media.MediaDescriptionCompat;
import android.support.p010v4.media.MediaMetadataCompat;
import android.support.p010v4.media.RatingCompat;
import android.support.p010v4.media.session.AbstractC0151b;
import android.support.p010v4.media.session.C0157d;
import android.support.p010v4.media.session.C0160e;
import android.support.p010v4.media.session.C0163f;
import android.support.p010v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import androidx.core.app.C0578c;
import androidx.media.AbstractC1331m;
import androidx.media.C1323i;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeAgeThresholdSetting;
import com.bytedance.bpea.entry.common.DataType;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.playerkit.model.C84224v;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: android.support.v4.media.session.MediaSessionCompat */
public class MediaSessionCompat {

    /* renamed from: b */
    static int f345b;

    /* renamed from: a */
    public final MediaControllerCompat f346a;

    /* renamed from: c */
    private final AbstractC0131b f347c;

    /* renamed from: d */
    private final ArrayList<Object> f348d;

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.v4.media.session.MediaSessionCompat$b */
    public interface AbstractC0131b {
        static {
            Covode.recordClassIndex(151);
        }

        /* renamed from: a */
        void mo202a();

        /* renamed from: a */
        void mo203a(PendingIntent pendingIntent);

        /* renamed from: a */
        void mo204a(MediaMetadataCompat mediaMetadataCompat);

        /* renamed from: a */
        void mo205a(AbstractC0126a aVar, Handler handler);

        /* renamed from: a */
        void mo206a(PlaybackStateCompat playbackStateCompat);

        /* renamed from: a */
        void mo207a(C1323i.C1324a aVar);

        /* renamed from: a */
        void mo208a(boolean z);

        /* renamed from: b */
        boolean mo209b();

        /* renamed from: c */
        void mo210c();

        /* renamed from: d */
        Token mo211d();

        /* renamed from: e */
        PlaybackStateCompat mo212e();

        /* renamed from: f */
        C1323i.C1324a mo213f();
    }

    static {
        Covode.recordClassIndex(137);
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$e */
    static class C0136e implements AbstractC0131b {

        /* renamed from: a */
        final Object f369a;

        /* renamed from: b */
        final Token f370b;

        /* renamed from: c */
        boolean f371c;

        /* renamed from: d */
        final RemoteCallbackList<AbstractC0148a> f372d = new RemoteCallbackList<>();

        /* renamed from: e */
        PlaybackStateCompat f373e;

        /* renamed from: f */
        List<QueueItem> f374f;

        /* renamed from: g */
        MediaMetadataCompat f375g;

        /* renamed from: h */
        int f376h;

        /* renamed from: i */
        boolean f377i;

        /* renamed from: j */
        int f378j;

        /* renamed from: k */
        int f379k;

        static {
            Covode.recordClassIndex(156);
        }

        @Override // android.support.p010v4.media.session.MediaSessionCompat.AbstractC0131b
        /* renamed from: a */
        public void mo207a(C1323i.C1324a aVar) {
        }

        @Override // android.support.p010v4.media.session.MediaSessionCompat.AbstractC0131b
        /* renamed from: f */
        public C1323i.C1324a mo213f() {
            return null;
        }

        @Override // android.support.p010v4.media.session.MediaSessionCompat.AbstractC0131b
        /* renamed from: d */
        public final Token mo211d() {
            return this.f370b;
        }

        @Override // android.support.p010v4.media.session.MediaSessionCompat.AbstractC0131b
        /* renamed from: e */
        public final PlaybackStateCompat mo212e() {
            return this.f373e;
        }

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$e$a */
        class BinderC0137a extends AbstractC0151b.AbstractBinderC0152a {
            static {
                Covode.recordClassIndex(157);
            }

            @Override // android.support.p010v4.media.session.AbstractC0151b
            /* renamed from: b */
            public final void mo243b(boolean z) {
            }

            @Override // android.support.p010v4.media.session.AbstractC0151b
            /* renamed from: i */
            public final List<QueueItem> mo254i() {
                return null;
            }

            @Override // android.support.p010v4.media.session.AbstractC0151b
            /* renamed from: o */
            public final boolean mo260o() {
                return false;
            }

            @Override // android.support.p010v4.media.session.AbstractC0151b
            /* renamed from: a */
            public final void mo231a(String str, Bundle bundle, ResultReceiverWrapper resultReceiverWrapper) {
                throw new AssertionError();
            }

            @Override // android.support.p010v4.media.session.AbstractC0151b
            /* renamed from: a */
            public final boolean mo234a(KeyEvent keyEvent) {
                throw new AssertionError();
            }

            @Override // android.support.p010v4.media.session.AbstractC0151b
            /* renamed from: a */
            public final void mo230a(String str, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.p010v4.media.session.AbstractC0151b
            /* renamed from: a */
            public final void mo232a(boolean z) {
                throw new AssertionError();
            }

            @Override // android.support.p010v4.media.session.AbstractC0151b
            /* renamed from: a */
            public final boolean mo233a() {
                throw new AssertionError();
            }

            @Override // android.support.p010v4.media.session.AbstractC0151b
            /* renamed from: b */
            public final String mo235b() {
                throw new AssertionError();
            }

            @Override // android.support.p010v4.media.session.AbstractC0151b
            /* renamed from: c */
            public final String mo244c() {
                throw new AssertionError();
            }

            @Override // android.support.p010v4.media.session.AbstractC0151b
            /* renamed from: d */
            public final PendingIntent mo247d() {
                throw new AssertionError();
            }

            @Override // android.support.p010v4.media.session.AbstractC0151b
            /* renamed from: e */
            public final long mo249e() {
                throw new AssertionError();
            }

            @Override // android.support.p010v4.media.session.AbstractC0151b
            /* renamed from: f */
            public final ParcelableVolumeInfo mo251f() {
                throw new AssertionError();
            }

            @Override // android.support.p010v4.media.session.AbstractC0151b
            /* renamed from: g */
            public final MediaMetadataCompat mo252g() {
                throw new AssertionError();
            }

            @Override // android.support.p010v4.media.session.AbstractC0151b
            /* renamed from: j */
            public final CharSequence mo255j() {
                throw new AssertionError();
            }

            @Override // android.support.p010v4.media.session.AbstractC0151b
            /* renamed from: k */
            public final Bundle mo256k() {
                throw new AssertionError();
            }

            @Override // android.support.p010v4.media.session.AbstractC0151b
            /* renamed from: l */
            public final int mo257l() {
                return C0136e.this.f376h;
            }

            @Override // android.support.p010v4.media.session.AbstractC0151b
            /* renamed from: m */
            public final boolean mo258m() {
                return C0136e.this.f377i;
            }

            @Override // android.support.p010v4.media.session.AbstractC0151b
            /* renamed from: n */
            public final int mo259n() {
                return C0136e.this.f378j;
            }

            @Override // android.support.p010v4.media.session.AbstractC0151b
            /* renamed from: p */
            public final int mo261p() {
                return C0136e.this.f379k;
            }

            @Override // android.support.p010v4.media.session.AbstractC0151b
            /* renamed from: q */
            public final void mo262q() {
                throw new AssertionError();
            }

            @Override // android.support.p010v4.media.session.AbstractC0151b
            /* renamed from: r */
            public final void mo263r() {
                throw new AssertionError();
            }

            @Override // android.support.p010v4.media.session.AbstractC0151b
            /* renamed from: s */
            public final void mo264s() {
                throw new AssertionError();
            }

            @Override // android.support.p010v4.media.session.AbstractC0151b
            /* renamed from: t */
            public final void mo265t() {
                throw new AssertionError();
            }

            @Override // android.support.p010v4.media.session.AbstractC0151b
            /* renamed from: u */
            public final void mo266u() {
                throw new AssertionError();
            }

            @Override // android.support.p010v4.media.session.AbstractC0151b
            /* renamed from: v */
            public final void mo267v() {
                throw new AssertionError();
            }

            @Override // android.support.p010v4.media.session.AbstractC0151b
            /* renamed from: w */
            public final void mo268w() {
                throw new AssertionError();
            }

            @Override // android.support.p010v4.media.session.AbstractC0151b
            /* renamed from: x */
            public final void mo269x() {
                throw new AssertionError();
            }

            @Override // android.support.p010v4.media.session.AbstractC0151b
            /* renamed from: h */
            public final PlaybackStateCompat mo253h() {
                return MediaSessionCompat.m226a(C0136e.this.f373e, C0136e.this.f375g);
            }

            BinderC0137a() {
            }

            @Override // android.support.p010v4.media.session.AbstractC0151b
            /* renamed from: a */
            public final void mo221a(int i) {
                throw new AssertionError();
            }

            @Override // android.support.p010v4.media.session.AbstractC0151b
            /* renamed from: b */
            public final void mo236b(int i) {
                throw new AssertionError();
            }

            @Override // android.support.p010v4.media.session.AbstractC0151b
            /* renamed from: c */
            public final void mo245c(int i) {
                throw new AssertionError();
            }

            @Override // android.support.p010v4.media.session.AbstractC0151b
            /* renamed from: a */
            public final void mo223a(long j) {
                throw new AssertionError();
            }

            @Override // android.support.p010v4.media.session.AbstractC0151b
            /* renamed from: b */
            public final void mo238b(long j) {
                throw new AssertionError();
            }

            @Override // android.support.p010v4.media.session.AbstractC0151b
            /* renamed from: a */
            public final void mo225a(MediaDescriptionCompat mediaDescriptionCompat) {
                throw new AssertionError();
            }

            @Override // android.support.p010v4.media.session.AbstractC0151b
            /* renamed from: b */
            public final void mo240b(MediaDescriptionCompat mediaDescriptionCompat) {
                throw new AssertionError();
            }

            @Override // android.support.p010v4.media.session.AbstractC0151b
            /* renamed from: a */
            public final void mo227a(RatingCompat ratingCompat) {
                throw new AssertionError();
            }

            @Override // android.support.p010v4.media.session.AbstractC0151b
            /* renamed from: b */
            public final void mo241b(AbstractC0148a aVar) {
                C0136e.this.f372d.unregister(aVar);
            }

            @Override // android.support.p010v4.media.session.AbstractC0151b
            /* renamed from: a */
            public final void mo229a(AbstractC0148a aVar) {
                String a;
                if (!C0136e.this.f371c) {
                    C0136e eVar = C0136e.this;
                    if (Build.VERSION.SDK_INT < 24 || (a = C0163f.m568a(eVar.f369a)) == null) {
                        a = "android.media.session.MediaController";
                    }
                    C0136e.this.f372d.register(aVar, new C1323i.C1324a(a, getCallingPid(), getCallingUid()));
                }
            }

            @Override // android.support.p010v4.media.session.AbstractC0151b
            /* renamed from: d */
            public final void mo248d(String str, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.p010v4.media.session.AbstractC0151b
            /* renamed from: e */
            public final void mo250e(String str, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.p010v4.media.session.AbstractC0151b
            /* renamed from: c */
            public final void mo246c(String str, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.p010v4.media.session.AbstractC0151b
            /* renamed from: a */
            public final void mo224a(Uri uri, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.p010v4.media.session.AbstractC0151b
            /* renamed from: b */
            public final void mo239b(Uri uri, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.p010v4.media.session.AbstractC0151b
            /* renamed from: a */
            public final void mo226a(MediaDescriptionCompat mediaDescriptionCompat, int i) {
                throw new AssertionError();
            }

            @Override // android.support.p010v4.media.session.AbstractC0151b
            /* renamed from: a */
            public final void mo228a(RatingCompat ratingCompat, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.p010v4.media.session.AbstractC0151b
            /* renamed from: b */
            public final void mo242b(String str, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.p010v4.media.session.AbstractC0151b
            /* renamed from: a */
            public final void mo222a(int i, int i2, String str) {
                throw new AssertionError();
            }

            @Override // android.support.p010v4.media.session.AbstractC0151b
            /* renamed from: b */
            public final void mo237b(int i, int i2, String str) {
                throw new AssertionError();
            }
        }

        @Override // android.support.p010v4.media.session.MediaSessionCompat.AbstractC0131b
        /* renamed from: a */
        public final void mo202a() {
            ((MediaSession) this.f369a).setFlags(3);
        }

        @Override // android.support.p010v4.media.session.MediaSessionCompat.AbstractC0131b
        /* renamed from: b */
        public final boolean mo209b() {
            return ((MediaSession) this.f369a).isActive();
        }

        @Override // android.support.p010v4.media.session.MediaSessionCompat.AbstractC0131b
        /* renamed from: c */
        public final void mo210c() {
            this.f371c = true;
            ((MediaSession) this.f369a).release();
        }

        @Override // android.support.p010v4.media.session.MediaSessionCompat.AbstractC0131b
        /* renamed from: a */
        public final void mo203a(PendingIntent pendingIntent) {
            ((MediaSession) this.f369a).setMediaButtonReceiver(pendingIntent);
        }

        @Override // android.support.p010v4.media.session.MediaSessionCompat.AbstractC0131b
        /* renamed from: a */
        public final void mo204a(MediaMetadataCompat mediaMetadataCompat) {
            Object obj;
            this.f375g = mediaMetadataCompat;
            Object obj2 = this.f369a;
            if (mediaMetadataCompat == null) {
                obj = null;
            } else {
                if (mediaMetadataCompat.f317c == null && Build.VERSION.SDK_INT >= 21) {
                    Parcel obtain = Parcel.obtain();
                    mediaMetadataCompat.writeToParcel(obtain, 0);
                    obtain.setDataPosition(0);
                    mediaMetadataCompat.f317c = MediaMetadata.CREATOR.createFromParcel(obtain);
                    obtain.recycle();
                }
                obj = mediaMetadataCompat.f317c;
            }
            ((MediaSession) obj2).setMetadata((MediaMetadata) obj);
        }

        @Override // android.support.p010v4.media.session.MediaSessionCompat.AbstractC0131b
        /* renamed from: a */
        public final void mo208a(boolean z) {
            ((MediaSession) this.f369a).setActive(z);
        }

        @Override // android.support.p010v4.media.session.MediaSessionCompat.AbstractC0131b
        /* renamed from: a */
        public final void mo206a(PlaybackStateCompat playbackStateCompat) {
            Object obj;
            this.f373e = playbackStateCompat;
            for (int beginBroadcast = this.f372d.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    this.f372d.getBroadcastItem(beginBroadcast).mo152a(playbackStateCompat);
                } catch (RemoteException unused) {
                }
            }
            this.f372d.finishBroadcast();
            Object obj2 = this.f369a;
            Object obj3 = null;
            ArrayList arrayList = null;
            if (playbackStateCompat != null) {
                if (playbackStateCompat.f436l == null && Build.VERSION.SDK_INT >= 21) {
                    if (playbackStateCompat.f433i != null) {
                        arrayList = new ArrayList(playbackStateCompat.f433i.size());
                        for (PlaybackStateCompat.CustomAction customAction : playbackStateCompat.f433i) {
                            if (customAction.f441e != null || Build.VERSION.SDK_INT < 21) {
                                obj = customAction.f441e;
                            } else {
                                String str = customAction.f437a;
                                CharSequence charSequence = customAction.f438b;
                                int i = customAction.f439c;
                                Bundle bundle = customAction.f440d;
                                PlaybackState.CustomAction.Builder builder = new PlaybackState.CustomAction.Builder(str, charSequence, i);
                                builder.setExtras(bundle);
                                customAction.f441e = builder.build();
                                obj = customAction.f441e;
                            }
                            arrayList.add(obj);
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 22) {
                        playbackStateCompat.f436l = C0167h.m570a(playbackStateCompat.f425a, playbackStateCompat.f426b, playbackStateCompat.f427c, playbackStateCompat.f428d, playbackStateCompat.f429e, playbackStateCompat.f431g, playbackStateCompat.f432h, arrayList, playbackStateCompat.f434j, playbackStateCompat.f435k);
                    } else {
                        playbackStateCompat.f436l = C0166g.m569a(playbackStateCompat.f425a, playbackStateCompat.f426b, playbackStateCompat.f427c, playbackStateCompat.f428d, playbackStateCompat.f429e, playbackStateCompat.f431g, playbackStateCompat.f432h, arrayList, playbackStateCompat.f434j);
                    }
                }
                obj3 = playbackStateCompat.f436l;
            }
            ((MediaSession) obj2).setPlaybackState((PlaybackState) obj3);
        }

        @Override // android.support.p010v4.media.session.MediaSessionCompat.AbstractC0131b
        /* renamed from: a */
        public final void mo205a(AbstractC0126a aVar, Handler handler) {
            Object obj;
            Object obj2 = this.f369a;
            if (aVar == null) {
                obj = null;
            } else {
                obj = aVar.f359b;
            }
            ((MediaSession) obj2).setCallback((MediaSession.Callback) obj, handler);
            if (aVar != null) {
                aVar.mo184a(this, handler);
            }
        }

        C0136e(Context context, String str, Bundle bundle) {
            MediaSession mediaSession = new MediaSession(context, str);
            this.f369a = mediaSession;
            this.f370b = new Token(mediaSession.getSessionToken(), new BinderC0137a(), null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.v4.media.session.MediaSessionCompat$g */
    public static class C0139g implements AbstractC0131b {

        /* renamed from: A */
        private final BinderC0142b f381A;

        /* renamed from: B */
        private final Token f382B;

        /* renamed from: C */
        private HandlerC0143c f383C;

        /* renamed from: D */
        private boolean f384D = false;

        /* renamed from: E */
        private boolean f385E = false;

        /* renamed from: F */
        private C1323i.C1324a f386F;

        /* renamed from: G */
        private AbstractC1331m.AbstractC1332a f387G = new AbstractC1331m.AbstractC1332a() {
            /* class android.support.p010v4.media.session.MediaSessionCompat.C0139g.C01401 */

            static {
                Covode.recordClassIndex(160);
            }
        };

        /* renamed from: a */
        final String f388a;

        /* renamed from: b */
        final String f389b;

        /* renamed from: c */
        final AudioManager f390c;

        /* renamed from: d */
        final RemoteControlClient f391d;

        /* renamed from: e */
        final Object f392e = new Object();

        /* renamed from: f */
        final RemoteCallbackList<AbstractC0148a> f393f = new RemoteCallbackList<>();

        /* renamed from: g */
        boolean f394g = false;

        /* renamed from: h */
        boolean f395h = false;

        /* renamed from: i */
        volatile AbstractC0126a f396i;

        /* renamed from: j */
        int f397j;

        /* renamed from: k */
        MediaMetadataCompat f398k;

        /* renamed from: l */
        PlaybackStateCompat f399l;

        /* renamed from: m */
        PendingIntent f400m;

        /* renamed from: n */
        List<QueueItem> f401n;

        /* renamed from: o */
        CharSequence f402o;

        /* renamed from: p */
        int f403p;

        /* renamed from: q */
        boolean f404q;

        /* renamed from: r */
        int f405r;

        /* renamed from: s */
        int f406s;

        /* renamed from: t */
        Bundle f407t;

        /* renamed from: u */
        int f408u;

        /* renamed from: v */
        int f409v;

        /* renamed from: w */
        AbstractC1331m f410w;

        /* renamed from: x */
        private final Context f411x;

        /* renamed from: y */
        private final ComponentName f412y;

        /* renamed from: z */
        private final PendingIntent f413z;

        static {
            Covode.recordClassIndex(159);
        }

        /* renamed from: a */
        static int m341a(int i) {
            switch (i) {
                case 0:
                    return 0;
                case 1:
                    return 1;
                case 2:
                    return 2;
                case 3:
                    return 3;
                case 4:
                    return 4;
                case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                    return 5;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                    return 8;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                    return 9;
                case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                    return 7;
                case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
                    return 6;
                default:
                    return -1;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo214a(long j) {
            int i = (1 & j) != 0 ? 32 : 0;
            if ((2 & j) != 0) {
                i |= 16;
            }
            if ((4 & j) != 0) {
                i |= 4;
            }
            if ((8 & j) != 0) {
                i |= 2;
            }
            if ((16 & j) != 0) {
                i |= 1;
            }
            if ((32 & j) != 0) {
                i |= 128;
            }
            if ((64 & j) != 0) {
                i |= 64;
            }
            return (j & 512) != 0 ? i | 8 : i;
        }

        @Override // android.support.p010v4.media.session.MediaSessionCompat.AbstractC0131b
        /* renamed from: a */
        public final void mo203a(PendingIntent pendingIntent) {
        }

        @Override // android.support.p010v4.media.session.MediaSessionCompat.AbstractC0131b
        /* renamed from: b */
        public final boolean mo209b() {
            return this.f395h;
        }

        @Override // android.support.p010v4.media.session.MediaSessionCompat.AbstractC0131b
        /* renamed from: d */
        public final Token mo211d() {
            return this.f382B;
        }

        @Override // android.support.p010v4.media.session.MediaSessionCompat.AbstractC0131b
        /* renamed from: a */
        public void mo205a(AbstractC0126a aVar, Handler handler) {
            this.f396i = aVar;
            if (aVar != null) {
                if (handler == null) {
                    handler = new Handler();
                }
                synchronized (this.f392e) {
                    HandlerC0143c cVar = this.f383C;
                    if (cVar != null) {
                        cVar.removeCallbacksAndMessages(null);
                    }
                    this.f383C = new HandlerC0143c(handler.getLooper());
                    this.f396i.mo184a(this, handler);
                }
            }
        }

        @Override // android.support.p010v4.media.session.MediaSessionCompat.AbstractC0131b
        /* renamed from: a */
        public final void mo208a(boolean z) {
            if (z != this.f395h) {
                this.f395h = z;
                if (m345g()) {
                    mo204a(this.f398k);
                    mo206a(this.f399l);
                }
            }
        }

        @Override // android.support.p010v4.media.session.MediaSessionCompat.AbstractC0131b
        /* renamed from: a */
        public final void mo206a(PlaybackStateCompat playbackStateCompat) {
            synchronized (this.f392e) {
                this.f399l = playbackStateCompat;
            }
            m344c(playbackStateCompat);
            if (this.f395h) {
                if (playbackStateCompat == null) {
                    this.f391d.setPlaybackState(0);
                    this.f391d.setTransportControlFlags(0);
                    return;
                }
                mo217b(playbackStateCompat);
                this.f391d.setTransportControlFlags(mo214a(playbackStateCompat.f429e));
            }
        }

        @Override // android.support.p010v4.media.session.MediaSessionCompat.AbstractC0131b
        /* renamed from: a */
        public final void mo207a(C1323i.C1324a aVar) {
            synchronized (this.f392e) {
                this.f386F = aVar;
            }
        }

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$g$b */
        class BinderC0142b extends AbstractC0151b.AbstractBinderC0152a {
            static {
                Covode.recordClassIndex(162);
            }

            @Override // android.support.p010v4.media.session.AbstractC0151b
            /* renamed from: b */
            public final void mo243b(boolean z) {
            }

            @Override // android.support.p010v4.media.session.AbstractC0151b
            /* renamed from: o */
            public final boolean mo260o() {
                return false;
            }

            @Override // android.support.p010v4.media.session.AbstractC0151b
            /* renamed from: a */
            public final void mo231a(String str, Bundle bundle, ResultReceiverWrapper resultReceiverWrapper) {
                m367a(1, new C0141a(str, bundle, resultReceiverWrapper.f354a));
            }

            @Override // android.support.p010v4.media.session.AbstractC0151b
            /* renamed from: a */
            public final boolean mo234a(KeyEvent keyEvent) {
                if ((C0139g.this.f397j & 1) == 0) {
                    return false;
                }
                m367a(21, keyEvent);
                return true;
            }

            @Override // android.support.p010v4.media.session.AbstractC0151b
            /* renamed from: a */
            public final void mo229a(AbstractC0148a aVar) {
                if (C0139g.this.f394g) {
                    try {
                        aVar.mo135a();
                    } catch (Exception unused) {
                    }
                } else {
                    C0139g.this.f393f.register(aVar, new C1323i.C1324a("android.media.session.MediaController", getCallingPid(), getCallingUid()));
                }
            }

            @Override // android.support.p010v4.media.session.AbstractC0151b
            /* renamed from: a */
            public final void mo230a(String str, Bundle bundle) {
                m368a(4, str, bundle);
            }

            @Override // android.support.p010v4.media.session.AbstractC0151b
            /* renamed from: a */
            public final void mo227a(RatingCompat ratingCompat) {
                m367a(19, ratingCompat);
            }

            @Override // android.support.p010v4.media.session.AbstractC0151b
            /* renamed from: a */
            public final void mo228a(RatingCompat ratingCompat, Bundle bundle) {
                m368a(31, ratingCompat, bundle);
            }

            @Override // android.support.p010v4.media.session.AbstractC0151b
            /* renamed from: a */
            public final void mo232a(boolean z) {
                m367a(29, Boolean.valueOf(z));
            }

            @Override // android.support.p010v4.media.session.AbstractC0151b
            /* renamed from: a */
            public final boolean mo233a() {
                return (C0139g.this.f397j & 2) != 0;
            }

            @Override // android.support.p010v4.media.session.AbstractC0151b
            /* renamed from: b */
            public final String mo235b() {
                return C0139g.this.f388a;
            }

            @Override // android.support.p010v4.media.session.AbstractC0151b
            /* renamed from: c */
            public final String mo244c() {
                return C0139g.this.f389b;
            }

            @Override // android.support.p010v4.media.session.AbstractC0151b
            /* renamed from: g */
            public final MediaMetadataCompat mo252g() {
                return C0139g.this.f398k;
            }

            @Override // android.support.p010v4.media.session.AbstractC0151b
            /* renamed from: j */
            public final CharSequence mo255j() {
                return C0139g.this.f402o;
            }

            @Override // android.support.p010v4.media.session.AbstractC0151b
            /* renamed from: l */
            public final int mo257l() {
                return C0139g.this.f403p;
            }

            @Override // android.support.p010v4.media.session.AbstractC0151b
            /* renamed from: m */
            public final boolean mo258m() {
                return C0139g.this.f404q;
            }

            @Override // android.support.p010v4.media.session.AbstractC0151b
            /* renamed from: n */
            public final int mo259n() {
                return C0139g.this.f405r;
            }

            @Override // android.support.p010v4.media.session.AbstractC0151b
            /* renamed from: p */
            public final int mo261p() {
                return C0139g.this.f406s;
            }

            @Override // android.support.p010v4.media.session.AbstractC0151b
            /* renamed from: q */
            public final void mo262q() {
                m369d(3);
            }

            @Override // android.support.p010v4.media.session.AbstractC0151b
            /* renamed from: r */
            public final void mo263r() {
                m369d(7);
            }

            @Override // android.support.p010v4.media.session.AbstractC0151b
            /* renamed from: s */
            public final void mo264s() {
                m369d(12);
            }

            @Override // android.support.p010v4.media.session.AbstractC0151b
            /* renamed from: t */
            public final void mo265t() {
                m369d(13);
            }

            @Override // android.support.p010v4.media.session.AbstractC0151b
            /* renamed from: u */
            public final void mo266u() {
                m369d(14);
            }

            @Override // android.support.p010v4.media.session.AbstractC0151b
            /* renamed from: v */
            public final void mo267v() {
                m369d(15);
            }

            @Override // android.support.p010v4.media.session.AbstractC0151b
            /* renamed from: w */
            public final void mo268w() {
                m369d(16);
            }

            @Override // android.support.p010v4.media.session.AbstractC0151b
            /* renamed from: x */
            public final void mo269x() {
                m369d(17);
            }

            @Override // android.support.p010v4.media.session.AbstractC0151b
            /* renamed from: e */
            public final long mo249e() {
                long j;
                synchronized (C0139g.this.f392e) {
                    j = (long) C0139g.this.f397j;
                }
                return j;
            }

            @Override // android.support.p010v4.media.session.AbstractC0151b
            /* renamed from: i */
            public final List<QueueItem> mo254i() {
                List<QueueItem> list;
                synchronized (C0139g.this.f392e) {
                    list = C0139g.this.f401n;
                }
                return list;
            }

            @Override // android.support.p010v4.media.session.AbstractC0151b
            /* renamed from: k */
            public final Bundle mo256k() {
                Bundle bundle;
                synchronized (C0139g.this.f392e) {
                    bundle = C0139g.this.f407t;
                }
                return bundle;
            }

            @Override // android.support.p010v4.media.session.AbstractC0151b
            /* renamed from: d */
            public final PendingIntent mo247d() {
                PendingIntent pendingIntent;
                synchronized (C0139g.this.f392e) {
                    pendingIntent = C0139g.this.f400m;
                }
                return pendingIntent;
            }

            @Override // android.support.p010v4.media.session.AbstractC0151b
            /* renamed from: h */
            public final PlaybackStateCompat mo253h() {
                PlaybackStateCompat playbackStateCompat;
                MediaMetadataCompat mediaMetadataCompat;
                synchronized (C0139g.this.f392e) {
                    playbackStateCompat = C0139g.this.f399l;
                    mediaMetadataCompat = C0139g.this.f398k;
                }
                return MediaSessionCompat.m226a(playbackStateCompat, mediaMetadataCompat);
            }

            @Override // android.support.p010v4.media.session.AbstractC0151b
            /* renamed from: f */
            public final ParcelableVolumeInfo mo251f() {
                int i;
                int i2;
                int streamMaxVolume;
                int streamVolume;
                int i3;
                synchronized (C0139g.this.f392e) {
                    i = C0139g.this.f408u;
                    i2 = C0139g.this.f409v;
                    AbstractC1331m mVar = C0139g.this.f410w;
                    if (i == 2) {
                        i3 = mVar.f4312a;
                        streamMaxVolume = mVar.f4313b;
                        streamVolume = mVar.f4314c;
                    } else {
                        streamMaxVolume = C0139g.this.f390c.getStreamMaxVolume(i2);
                        streamVolume = C0139g.this.f390c.getStreamVolume(i2);
                        i3 = 2;
                    }
                }
                return new ParcelableVolumeInfo(i, i2, i3, streamMaxVolume, streamVolume);
            }

            BinderC0142b() {
            }

            @Override // android.support.p010v4.media.session.AbstractC0151b
            /* renamed from: a */
            public final void mo221a(int i) {
                m366a(28, i);
            }

            /* renamed from: d */
            private void m369d(int i) {
                C0139g.this.mo271a(i, 0, 0, null, null);
            }

            @Override // android.support.p010v4.media.session.AbstractC0151b
            /* renamed from: b */
            public final void mo236b(int i) {
                m366a(23, i);
            }

            @Override // android.support.p010v4.media.session.AbstractC0151b
            /* renamed from: c */
            public final void mo245c(int i) {
                m366a(30, i);
            }

            @Override // android.support.p010v4.media.session.AbstractC0151b
            /* renamed from: b */
            public final void mo238b(long j) {
                m367a(18, Long.valueOf(j));
            }

            @Override // android.support.p010v4.media.session.AbstractC0151b
            /* renamed from: a */
            public final void mo223a(long j) {
                m367a(11, Long.valueOf(j));
            }

            @Override // android.support.p010v4.media.session.AbstractC0151b
            /* renamed from: b */
            public final void mo240b(MediaDescriptionCompat mediaDescriptionCompat) {
                m367a(27, mediaDescriptionCompat);
            }

            @Override // android.support.p010v4.media.session.AbstractC0151b
            /* renamed from: b */
            public final void mo241b(AbstractC0148a aVar) {
                C0139g.this.f393f.unregister(aVar);
            }

            @Override // android.support.p010v4.media.session.AbstractC0151b
            /* renamed from: a */
            public final void mo225a(MediaDescriptionCompat mediaDescriptionCompat) {
                m367a(25, mediaDescriptionCompat);
            }

            @Override // android.support.p010v4.media.session.AbstractC0151b
            /* renamed from: d */
            public final void mo248d(String str, Bundle bundle) {
                m368a(9, str, bundle);
            }

            @Override // android.support.p010v4.media.session.AbstractC0151b
            /* renamed from: e */
            public final void mo250e(String str, Bundle bundle) {
                m368a(20, str, bundle);
            }

            /* renamed from: a */
            private void m366a(int i, int i2) {
                C0139g.this.mo271a(i, i2, 0, null, null);
            }

            /* renamed from: a */
            private void m367a(int i, Object obj) {
                C0139g.this.mo271a(i, 0, 0, obj, null);
            }

            @Override // android.support.p010v4.media.session.AbstractC0151b
            /* renamed from: c */
            public final void mo246c(String str, Bundle bundle) {
                m368a(8, str, bundle);
            }

            @Override // android.support.p010v4.media.session.AbstractC0151b
            /* renamed from: b */
            public final void mo239b(Uri uri, Bundle bundle) {
                m368a(10, uri, bundle);
            }

            @Override // android.support.p010v4.media.session.AbstractC0151b
            /* renamed from: a */
            public final void mo224a(Uri uri, Bundle bundle) {
                m368a(6, uri, bundle);
            }

            @Override // android.support.p010v4.media.session.AbstractC0151b
            /* renamed from: b */
            public final void mo242b(String str, Bundle bundle) {
                m368a(5, str, bundle);
            }

            @Override // android.support.p010v4.media.session.AbstractC0151b
            /* renamed from: a */
            public final void mo226a(MediaDescriptionCompat mediaDescriptionCompat, int i) {
                C0139g.this.mo271a(26, i, 0, mediaDescriptionCompat, null);
            }

            @Override // android.support.p010v4.media.session.AbstractC0151b
            /* renamed from: b */
            public final void mo237b(int i, int i2, String str) {
                C0139g.this.mo272b(i, i2);
            }

            /* renamed from: a */
            private void m368a(int i, Object obj, Bundle bundle) {
                C0139g.this.mo271a(i, 0, 0, obj, bundle);
            }

            @Override // android.support.p010v4.media.session.AbstractC0151b
            /* renamed from: a */
            public final void mo222a(int i, int i2, String str) {
                C0139g.this.mo270a(i, i2);
            }
        }

        @Override // android.support.p010v4.media.session.MediaSessionCompat.AbstractC0131b
        /* renamed from: a */
        public final void mo202a() {
            synchronized (this.f392e) {
                this.f397j = 3;
            }
            m345g();
        }

        @Override // android.support.p010v4.media.session.MediaSessionCompat.AbstractC0131b
        /* renamed from: e */
        public final PlaybackStateCompat mo212e() {
            PlaybackStateCompat playbackStateCompat;
            synchronized (this.f392e) {
                playbackStateCompat = this.f399l;
            }
            return playbackStateCompat;
        }

        @Override // android.support.p010v4.media.session.MediaSessionCompat.AbstractC0131b
        /* renamed from: f */
        public final C1323i.C1324a mo213f() {
            C1323i.C1324a aVar;
            synchronized (this.f392e) {
                aVar = this.f386F;
            }
            return aVar;
        }

        @Override // android.support.p010v4.media.session.MediaSessionCompat.AbstractC0131b
        /* renamed from: c */
        public final void mo210c() {
            this.f395h = false;
            this.f394g = true;
            m345g();
            for (int beginBroadcast = this.f393f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    this.f393f.getBroadcastItem(beginBroadcast).mo135a();
                } catch (RemoteException unused) {
                }
            }
            this.f393f.finishBroadcast();
            this.f393f.kill();
        }

        /* renamed from: g */
        private boolean m345g() {
            if (this.f395h) {
                if (!this.f384D) {
                    if ((this.f397j & 1) != 0) {
                        mo215a(this.f413z, this.f412y);
                        this.f384D = true;
                    }
                } else if ((this.f397j & 1) == 0) {
                    mo216b(this.f413z, this.f412y);
                    this.f384D = false;
                }
                if (!this.f385E) {
                    if ((this.f397j & 2) != 0) {
                        this.f390c.registerRemoteControlClient(this.f391d);
                        this.f385E = true;
                        return true;
                    }
                } else if ((this.f397j & 2) == 0) {
                    this.f391d.setPlaybackState(0);
                    this.f390c.unregisterRemoteControlClient(this.f391d);
                    this.f385E = false;
                }
            } else {
                if (this.f384D) {
                    mo216b(this.f413z, this.f412y);
                    this.f384D = false;
                }
                if (this.f385E) {
                    this.f391d.setPlaybackState(0);
                    this.f390c.unregisterRemoteControlClient(this.f391d);
                    this.f385E = false;
                }
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo217b(PlaybackStateCompat playbackStateCompat) {
            this.f391d.setPlaybackState(m341a(playbackStateCompat.f425a));
        }

        /* renamed from: b */
        private void m343b(MediaMetadataCompat mediaMetadataCompat) {
            for (int beginBroadcast = this.f393f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    this.f393f.getBroadcastItem(beginBroadcast).mo137a(mediaMetadataCompat);
                } catch (RemoteException unused) {
                }
            }
            this.f393f.finishBroadcast();
        }

        /* renamed from: c */
        private void m344c(PlaybackStateCompat playbackStateCompat) {
            for (int beginBroadcast = this.f393f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    this.f393f.getBroadcastItem(beginBroadcast).mo152a(playbackStateCompat);
                } catch (RemoteException unused) {
                }
            }
            this.f393f.finishBroadcast();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: android.support.v4.media.session.MediaSessionCompat$g$c */
        public class HandlerC0143c extends Handler {
            static {
                Covode.recordClassIndex(163);
            }

            public final void handleMessage(Message message) {
                long j;
                AbstractC0126a aVar = C0139g.this.f396i;
                if (aVar != null) {
                    Bundle data = message.getData();
                    MediaSessionCompat.m227a(data);
                    C0139g.this.mo207a(new C1323i.C1324a(data.getString("data_calling_pkg"), data.getInt("data_calling_pid"), data.getInt("data_calling_uid")));
                    MediaSessionCompat.m227a(data.getBundle("data_extras"));
                    try {
                        switch (message.what) {
                            case 1:
                                Object obj = message.obj;
                                break;
                            case 2:
                                C0139g.this.mo270a(message.arg1, 0);
                                break;
                            case 4:
                                Object obj2 = message.obj;
                                break;
                            case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                                Object obj3 = message.obj;
                                break;
                            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                                Object obj4 = message.obj;
                                break;
                            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                                aVar.mo182a();
                                break;
                            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                                Object obj5 = message.obj;
                                break;
                            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                                Object obj6 = message.obj;
                                break;
                            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                                Object obj7 = message.obj;
                                break;
                            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
                                ((Long) message.obj).longValue();
                                break;
                            case ABRConfig.ABR_DEFAULT_WIFI_BITRATE /*{ENCODED_INT: 12}*/:
                                aVar.mo187b();
                                break;
                            case ABRConfig.ABR_STARTUP_MAX_BITRATE /*{ENCODED_INT: 13}*/:
                                aVar.mo190e();
                                break;
                            case ABRConfig.ABR_SELECT_SCENE /*{ENCODED_INT: 14}*/:
                                aVar.mo188c();
                                break;
                            case 15:
                                aVar.mo189d();
                                break;
                            case LiveRechargeAgeThresholdSetting.DEFAULT /*{ENCODED_INT: 18}*/:
                                aVar.mo183a(((Long) message.obj).longValue());
                                break;
                            case 19:
                                Object obj8 = message.obj;
                                break;
                            case C84224v.f188239U /*{ENCODED_INT: 20}*/:
                                Object obj9 = message.obj;
                                break;
                            case 21:
                                KeyEvent keyEvent = (KeyEvent) message.obj;
                                Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
                                intent.putExtra("android.intent.extra.KEY_EVENT", keyEvent);
                                if (!aVar.mo186a(intent) && keyEvent != null) {
                                    if (keyEvent.getAction() == 0) {
                                        if (C0139g.this.f399l == null) {
                                            j = 0;
                                        } else {
                                            j = C0139g.this.f399l.f429e;
                                        }
                                        int keyCode = keyEvent.getKeyCode();
                                        if (keyCode == 126) {
                                            if ((j & 4) != 0) {
                                                aVar.mo182a();
                                                break;
                                            }
                                        } else if (keyCode == 127) {
                                            if ((j & 2) != 0) {
                                                aVar.mo187b();
                                                break;
                                            }
                                        } else {
                                            switch (keyCode) {
                                                case 86:
                                                    if ((j & 1) != 0) {
                                                        aVar.mo190e();
                                                        break;
                                                    }
                                                    break;
                                                case 87:
                                                    if ((j & 32) != 0) {
                                                        aVar.mo188c();
                                                        break;
                                                    }
                                                    break;
                                                case 88:
                                                    if ((j & 16) != 0) {
                                                        aVar.mo189d();
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    } else {
                                        break;
                                    }
                                }
                                break;
                            case 22:
                                C0139g.this.mo272b(message.arg1, 0);
                                break;
                            case 23:
                                int i = message.arg1;
                                break;
                            case 25:
                                Object obj10 = message.obj;
                                break;
                            case 26:
                                Object obj11 = message.obj;
                                int i2 = message.arg1;
                                break;
                            case 27:
                                Object obj12 = message.obj;
                                break;
                            case 28:
                                if (C0139g.this.f401n != null && message.arg1 >= 0 && message.arg1 < C0139g.this.f401n.size()) {
                                    C0139g.this.f401n.get(message.arg1);
                                    break;
                                }
                            case 29:
                                ((Boolean) message.obj).booleanValue();
                                break;
                            case 30:
                                int i3 = message.arg1;
                                break;
                            case 31:
                                Object obj13 = message.obj;
                                break;
                        }
                    } finally {
                        C0139g.this.mo207a((C1323i.C1324a) null);
                    }
                }
            }

            public HandlerC0143c(Looper looper) {
                super(looper);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public RemoteControlClient.MetadataEditor mo219a(Bundle bundle) {
            RemoteControlClient.MetadataEditor editMetadata = this.f391d.editMetadata(true);
            if (bundle == null) {
                return editMetadata;
            }
            if (bundle.containsKey("android.media.metadata.ART")) {
                Bitmap bitmap = (Bitmap) bundle.getParcelable("android.media.metadata.ART");
                if (bitmap != null) {
                    bitmap = bitmap.copy(bitmap.getConfig(), false);
                }
                editMetadata.putBitmap(100, bitmap);
            } else if (bundle.containsKey("android.media.metadata.ALBUM_ART")) {
                Bitmap bitmap2 = (Bitmap) bundle.getParcelable("android.media.metadata.ALBUM_ART");
                if (bitmap2 != null) {
                    bitmap2 = bitmap2.copy(bitmap2.getConfig(), false);
                }
                editMetadata.putBitmap(100, bitmap2);
            }
            if (bundle.containsKey("android.media.metadata.ALBUM")) {
                editMetadata.putString(1, bundle.getString("android.media.metadata.ALBUM"));
            }
            if (bundle.containsKey("android.media.metadata.ALBUM_ARTIST")) {
                editMetadata.putString(13, bundle.getString("android.media.metadata.ALBUM_ARTIST"));
            }
            if (bundle.containsKey("android.media.metadata.ARTIST")) {
                editMetadata.putString(2, bundle.getString("android.media.metadata.ARTIST"));
            }
            if (bundle.containsKey("android.media.metadata.AUTHOR")) {
                editMetadata.putString(3, bundle.getString("android.media.metadata.AUTHOR"));
            }
            if (bundle.containsKey("android.media.metadata.COMPILATION")) {
                editMetadata.putString(15, bundle.getString("android.media.metadata.COMPILATION"));
            }
            if (bundle.containsKey("android.media.metadata.COMPOSER")) {
                editMetadata.putString(4, bundle.getString("android.media.metadata.COMPOSER"));
            }
            if (bundle.containsKey("android.media.metadata.DATE")) {
                editMetadata.putString(5, bundle.getString("android.media.metadata.DATE"));
            }
            if (bundle.containsKey("android.media.metadata.DISC_NUMBER")) {
                editMetadata.putLong(14, bundle.getLong("android.media.metadata.DISC_NUMBER"));
            }
            if (bundle.containsKey("android.media.metadata.DURATION")) {
                editMetadata.putLong(9, bundle.getLong("android.media.metadata.DURATION"));
            }
            if (bundle.containsKey("android.media.metadata.GENRE")) {
                editMetadata.putString(6, bundle.getString("android.media.metadata.GENRE"));
            }
            if (bundle.containsKey("android.media.metadata.TITLE")) {
                editMetadata.putString(7, bundle.getString("android.media.metadata.TITLE"));
            }
            if (bundle.containsKey("android.media.metadata.TRACK_NUMBER")) {
                editMetadata.putLong(0, bundle.getLong("android.media.metadata.TRACK_NUMBER"));
            }
            if (bundle.containsKey("android.media.metadata.WRITER")) {
                editMetadata.putString(11, bundle.getString("android.media.metadata.WRITER"));
            }
            return editMetadata;
        }

        @Override // android.support.p010v4.media.session.MediaSessionCompat.AbstractC0131b
        /* renamed from: a */
        public final void mo204a(MediaMetadataCompat mediaMetadataCompat) {
            Bundle a;
            if (mediaMetadataCompat != null) {
                mediaMetadataCompat = new MediaMetadataCompat.C0101a(mediaMetadataCompat, MediaSessionCompat.f345b).mo119a();
            }
            synchronized (this.f392e) {
                this.f398k = mediaMetadataCompat;
            }
            m343b(mediaMetadataCompat);
            if (this.f395h) {
                if (mediaMetadataCompat == null) {
                    a = null;
                } else {
                    a = mediaMetadataCompat.mo111a();
                }
                mo219a(a).apply();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo215a(PendingIntent pendingIntent, ComponentName componentName) {
            this.f390c.registerMediaButtonEventReceiver(componentName);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo216b(PendingIntent pendingIntent, ComponentName componentName) {
            this.f390c.unregisterMediaButtonEventReceiver(componentName);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo270a(int i, int i2) {
            if (this.f408u != 2) {
                this.f390c.adjustStreamVolume(this.f409v, i, i2);
            } else if (this.f410w == null) {
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final void mo272b(int i, int i2) {
            if (this.f408u != 2) {
                this.f390c.setStreamVolume(this.f409v, i, i2);
            } else if (this.f410w == null) {
            }
        }

        /* renamed from: a */
        private static Object m342a(Context context, String str) {
            Object systemService;
            if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
                if (!C58027i.f132247b && "connectivity".equals(str)) {
                    try {
                        new C21708b().mo35361a();
                        C58027i.f132247b = true;
                        return context.getSystemService(str);
                    } catch (Throwable unused) {
                    }
                }
                return context.getSystemService(str);
            } else if (!C58027i.f132246a) {
                return context.getSystemService(str);
            } else {
                synchronized (ClipboardManager.class) {
                    systemService = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(systemService, new C58027i.HandlerC58028a((Handler) declaredField.get(systemService)));
                        } catch (Exception e) {
                            C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    C58027i.f132246a = false;
                }
                return systemService;
            }
        }

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$g$a */
        static final class C0141a {

            /* renamed from: a */
            public final String f415a;

            /* renamed from: b */
            public final Bundle f416b;

            /* renamed from: c */
            public final ResultReceiver f417c;

            static {
                Covode.recordClassIndex(161);
            }

            public C0141a(String str, Bundle bundle, ResultReceiver resultReceiver) {
                this.f415a = str;
                this.f416b = bundle;
                this.f417c = resultReceiver;
            }
        }

        public C0139g(Context context, String str, ComponentName componentName, PendingIntent pendingIntent) {
            if (componentName != null) {
                this.f411x = context;
                this.f388a = context.getPackageName();
                this.f390c = (AudioManager) m342a(context, DataType.AUDIO);
                this.f389b = str;
                this.f412y = componentName;
                this.f413z = pendingIntent;
                BinderC0142b bVar = new BinderC0142b();
                this.f381A = bVar;
                this.f382B = new Token(bVar);
                this.f403p = 0;
                this.f408u = 1;
                this.f409v = 3;
                this.f391d = new RemoteControlClient(pendingIntent);
                return;
            }
            throw new IllegalArgumentException("MediaButtonReceiver component may not be null.");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo271a(int i, int i2, int i3, Object obj, Bundle bundle) {
            synchronized (this.f392e) {
                HandlerC0143c cVar = this.f383C;
                if (cVar != null) {
                    Message obtainMessage = cVar.obtainMessage(i, i2, i3, obj);
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("data_calling_pkg", "android.media.session.MediaController");
                    bundle2.putInt("data_calling_pid", Binder.getCallingPid());
                    bundle2.putInt("data_calling_uid", Binder.getCallingUid());
                    if (bundle != null) {
                        bundle2.putBundle("data_extras", bundle);
                    }
                    obtainMessage.setData(bundle2);
                    obtainMessage.sendToTarget();
                }
            }
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$a */
    public static abstract class AbstractC0126a {

        /* renamed from: a */
        private HandlerC0127a f358a;

        /* renamed from: b */
        final Object f359b;

        /* renamed from: c */
        WeakReference<AbstractC0131b> f360c;

        /* renamed from: d */
        private boolean f361d;

        static {
            Covode.recordClassIndex(146);
        }

        /* renamed from: a */
        public void mo182a() {
        }

        /* renamed from: a */
        public void mo183a(long j) {
        }

        /* renamed from: b */
        public void mo187b() {
        }

        /* renamed from: c */
        public void mo188c() {
        }

        /* renamed from: d */
        public void mo189d() {
        }

        /* renamed from: e */
        public void mo190e() {
        }

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$a$b */
        class C0128b implements C0157d.AbstractC0158a {
            static {
                Covode.recordClassIndex(148);
            }

            @Override // android.support.p010v4.media.session.C0157d.AbstractC0158a
            /* renamed from: a */
            public final void mo192a() {
                AbstractC0126a.this.mo182a();
            }

            @Override // android.support.p010v4.media.session.C0157d.AbstractC0158a
            /* renamed from: b */
            public final void mo198b() {
                AbstractC0126a.this.mo187b();
            }

            @Override // android.support.p010v4.media.session.C0157d.AbstractC0158a
            /* renamed from: c */
            public final void mo199c() {
                AbstractC0126a.this.mo188c();
            }

            @Override // android.support.p010v4.media.session.C0157d.AbstractC0158a
            /* renamed from: d */
            public final void mo200d() {
                AbstractC0126a.this.mo189d();
            }

            @Override // android.support.p010v4.media.session.C0157d.AbstractC0158a
            /* renamed from: e */
            public final void mo201e() {
                AbstractC0126a.this.mo190e();
            }

            @Override // android.support.p010v4.media.session.C0157d.AbstractC0158a
            /* renamed from: a */
            public final void mo194a(Object obj) {
                RatingCompat.m188a(obj);
            }

            C0128b() {
            }

            @Override // android.support.p010v4.media.session.C0157d.AbstractC0158a
            /* renamed from: a */
            public final void mo193a(long j) {
                AbstractC0126a.this.mo183a(j);
            }

            @Override // android.support.p010v4.media.session.C0157d.AbstractC0158a
            /* renamed from: a */
            public final boolean mo197a(Intent intent) {
                return AbstractC0126a.this.mo186a(intent);
            }

            @Override // android.support.p010v4.media.session.C0157d.AbstractC0158a
            /* renamed from: a */
            public final void mo195a(String str, Bundle bundle) {
                MediaSessionCompat.m227a(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                if (str.equals("android.support.v4.media.session.action.PLAY_FROM_URI")) {
                    bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
                } else if (str.equals("android.support.v4.media.session.action.PREPARE")) {
                } else {
                    if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID")) {
                        bundle.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID");
                    } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH")) {
                        bundle.getString("android.support.v4.media.session.action.ARGUMENT_QUERY");
                    } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_URI")) {
                        bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
                    } else if (str.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED")) {
                        bundle.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED");
                    } else if (str.equals("android.support.v4.media.session.action.SET_REPEAT_MODE")) {
                        bundle.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE");
                    } else if (str.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE")) {
                        bundle.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE");
                    } else if (str.equals("android.support.v4.media.session.action.SET_RATING")) {
                        bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_RATING");
                    }
                }
            }

            @Override // android.support.p010v4.media.session.C0157d.AbstractC0158a
            /* renamed from: a */
            public final void mo196a(String str, Bundle bundle, ResultReceiver resultReceiver) {
                C0136e eVar;
                int i;
                IBinder iBinder;
                try {
                    if (str.equals("android.support.v4.media.session.command.GET_EXTRA_BINDER")) {
                        C0136e eVar2 = (C0136e) AbstractC0126a.this.f360c.get();
                        if (eVar2 != null) {
                            Bundle bundle2 = new Bundle();
                            Token token = eVar2.f370b;
                            AbstractC0151b bVar = token.f356b;
                            if (bVar == null) {
                                iBinder = null;
                            } else {
                                iBinder = bVar.asBinder();
                            }
                            C0578c.m2197a(bundle2, "android.support.v4.media.session.EXTRA_BINDER", iBinder);
                            bundle2.putBundle("android.support.v4.media.session.SESSION_TOKEN2_BUNDLE", token.f357c);
                            resultReceiver.send(0, bundle2);
                        }
                    } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM")) {
                        bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION");
                    } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT")) {
                        bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION");
                        bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX");
                    } else if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM")) {
                        bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION");
                    } else if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT") && (eVar = (C0136e) AbstractC0126a.this.f360c.get()) != null && eVar.f374f != null && (i = bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX", -1)) >= 0 && i < eVar.f374f.size()) {
                        eVar.f374f.get(i);
                    }
                } catch (BadParcelableException unused) {
                }
            }
        }

        public AbstractC0126a() {
            if (Build.VERSION.SDK_INT >= 24) {
                this.f359b = new C0163f.C0165b(new C0130d());
            } else if (Build.VERSION.SDK_INT >= 23) {
                this.f359b = new C0160e.C0162b(new C0129c());
            } else if (Build.VERSION.SDK_INT >= 21) {
                this.f359b = new C0157d.C0159b(new C0128b());
            } else {
                this.f359b = null;
            }
        }

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$a$c */
        class C0129c extends C0128b implements C0160e.AbstractC0161a {
            static {
                Covode.recordClassIndex(149);
            }

            C0129c() {
                super();
            }
        }

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$a$d */
        class C0130d extends C0129c implements C0163f.AbstractC0164a {
            static {
                Covode.recordClassIndex(150);
            }

            C0130d() {
                super();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: android.support.v4.media.session.MediaSessionCompat$a$a */
        public class HandlerC0127a extends Handler {
            static {
                Covode.recordClassIndex(147);
            }

            public final void handleMessage(Message message) {
                if (message.what == 1) {
                    AbstractC0126a.this.mo185a((C1323i.C1324a) message.obj);
                }
            }

            HandlerC0127a(Looper looper) {
                super(looper);
            }
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x002b  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0033  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0039  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0043  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0049  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo185a(androidx.media.C1323i.C1324a r12) {
            /*
                r11 = this;
                boolean r0 = r11.f361d
                if (r0 != 0) goto L_0x0005
                return
            L_0x0005:
                r8 = 0
                r11.f361d = r8
                android.support.v4.media.session.MediaSessionCompat$a$a r1 = r11.f358a
                r0 = 1
                r1.removeMessages(r0)
                java.lang.ref.WeakReference<android.support.v4.media.session.MediaSessionCompat$b> r0 = r11.f360c
                java.lang.Object r7 = r0.get()
                android.support.v4.media.session.MediaSessionCompat$b r7 = (android.support.p010v4.media.session.MediaSessionCompat.AbstractC0131b) r7
                if (r7 != 0) goto L_0x0019
                return
            L_0x0019:
                android.support.v4.media.session.PlaybackStateCompat r0 = r7.mo212e()
                r9 = 0
                if (r0 != 0) goto L_0x004b
                r2 = 0
            L_0x0023:
                r6 = 0
            L_0x0024:
                r4 = 516(0x204, double:2.55E-321)
                long r4 = r4 & r2
                int r0 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
                if (r0 == 0) goto L_0x0049
                r4 = 1
            L_0x002c:
                r0 = 514(0x202, double:2.54E-321)
                long r2 = r2 & r0
                int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
                if (r0 == 0) goto L_0x0034
                r8 = 1
            L_0x0034:
                r7.mo207a(r12)
                if (r6 == 0) goto L_0x0043
                if (r8 == 0) goto L_0x003e
                r11.mo187b()
            L_0x003e:
                r0 = 0
                r7.mo207a(r0)
                return
            L_0x0043:
                if (r4 == 0) goto L_0x003e
                r11.mo182a()
                goto L_0x003e
            L_0x0049:
                r4 = 0
                goto L_0x002c
            L_0x004b:
                long r2 = r0.f429e
                int r1 = r0.f425a
                r0 = 3
                if (r1 != r0) goto L_0x0023
                r6 = 1
                goto L_0x0024
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p010v4.media.session.MediaSessionCompat.AbstractC0126a.mo185a(androidx.media.i$a):void");
        }

        /* renamed from: a */
        public boolean mo186a(Intent intent) {
            AbstractC0131b bVar;
            KeyEvent keyEvent;
            if (Build.VERSION.SDK_INT >= 27 || (bVar = this.f360c.get()) == null || this.f358a == null || (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) == null || keyEvent.getAction() != 0) {
                return false;
            }
            C1323i.C1324a f = bVar.mo213f();
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 79 || keyCode == 85) {
                if (keyEvent.getRepeatCount() > 0) {
                    mo185a(f);
                } else if (this.f361d) {
                    this.f358a.removeMessages(1);
                    this.f361d = false;
                    PlaybackStateCompat e = bVar.mo212e();
                    if (!(e == null || (e.f429e & 32) == 0)) {
                        mo188c();
                    }
                } else {
                    this.f361d = true;
                    HandlerC0127a aVar = this.f358a;
                    aVar.sendMessageDelayed(aVar.obtainMessage(1, f), (long) ViewConfiguration.getDoubleTapTimeout());
                }
                return true;
            }
            mo185a(f);
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo184a(AbstractC0131b bVar, Handler handler) {
            this.f360c = new WeakReference<>(bVar);
            HandlerC0127a aVar = this.f358a;
            if (aVar != null) {
                aVar.removeCallbacksAndMessages(null);
            }
            this.f358a = new HandlerC0127a(handler.getLooper());
        }
    }

    /* renamed from: a */
    public final void mo158a() {
        this.f347c.mo202a();
    }

    /* renamed from: b */
    public final boolean mo164b() {
        return this.f347c.mo209b();
    }

    /* renamed from: c */
    public final void mo165c() {
        this.f347c.mo210c();
    }

    /* renamed from: d */
    public final Token mo166d() {
        return this.f347c.mo211d();
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$QueueItem */
    public static final class QueueItem implements Parcelable {
        public static final Parcelable.Creator<QueueItem> CREATOR = new Parcelable.Creator<QueueItem>() {
            /* class android.support.p010v4.media.session.MediaSessionCompat.QueueItem.C01231 */

            static {
                Covode.recordClassIndex(141);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ QueueItem[] newArray(int i) {
                return new QueueItem[i];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ QueueItem createFromParcel(Parcel parcel) {
                return new QueueItem(parcel);
            }
        };

        /* renamed from: a */
        public final MediaDescriptionCompat f351a;

        /* renamed from: b */
        public final long f352b;

        /* renamed from: c */
        private Object f353c;

        public final int describeContents() {
            return 0;
        }

        static {
            Covode.recordClassIndex(140);
        }

        public final String toString() {
            return "MediaSession.QueueItem {Description=" + this.f351a + ", Id=" + this.f352b + " }";
        }

        QueueItem(Parcel parcel) {
            this.f351a = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.f352b = parcel.readLong();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            this.f351a.writeToParcel(parcel, i);
            parcel.writeLong(this.f352b);
        }

        QueueItem(Object obj, MediaDescriptionCompat mediaDescriptionCompat, long j) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("Description cannot be null.");
            } else if (j != -1) {
                this.f351a = mediaDescriptionCompat;
                this.f352b = j;
                this.f353c = obj;
            } else {
                throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
            }
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper */
    public static final class ResultReceiverWrapper implements Parcelable {
        public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new Parcelable.Creator<ResultReceiverWrapper>() {
            /* class android.support.p010v4.media.session.MediaSessionCompat.ResultReceiverWrapper.C01241 */

            static {
                Covode.recordClassIndex(143);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ ResultReceiverWrapper[] newArray(int i) {
                return new ResultReceiverWrapper[i];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ ResultReceiverWrapper createFromParcel(Parcel parcel) {
                return new ResultReceiverWrapper(parcel);
            }
        };

        /* renamed from: a */
        ResultReceiver f354a;

        public final int describeContents() {
            return 0;
        }

        static {
            Covode.recordClassIndex(142);
        }

        ResultReceiverWrapper(Parcel parcel) {
            this.f354a = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            this.f354a.writeToParcel(parcel, i);
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$Token */
    public static final class Token implements Parcelable {
        public static final Parcelable.Creator<Token> CREATOR = new Parcelable.Creator<Token>() {
            /* class android.support.p010v4.media.session.MediaSessionCompat.Token.C01251 */

            static {
                Covode.recordClassIndex(145);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ Token[] newArray(int i) {
                return new Token[i];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Token createFromParcel(Parcel parcel) {
                Object readStrongBinder;
                if (Build.VERSION.SDK_INT >= 21) {
                    readStrongBinder = parcel.readParcelable(null);
                } else {
                    readStrongBinder = parcel.readStrongBinder();
                }
                return new Token(readStrongBinder);
            }
        };

        /* renamed from: a */
        public final Object f355a;

        /* renamed from: b */
        public AbstractC0151b f356b;

        /* renamed from: c */
        public Bundle f357c;

        public final int describeContents() {
            return 0;
        }

        static {
            Covode.recordClassIndex(144);
        }

        public final int hashCode() {
            Object obj = this.f355a;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        Token(Object obj) {
            this(obj, null, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Token)) {
                return false;
            }
            Token token = (Token) obj;
            Object obj2 = this.f355a;
            if (obj2 != null) {
                Object obj3 = token.f355a;
                if (obj3 == null) {
                    return false;
                }
                return obj2.equals(obj3);
            } else if (token.f355a == null) {
                return true;
            } else {
                return false;
            }
        }

        private Token(Object obj, AbstractC0151b bVar) {
            this(obj, bVar, null);
        }

        /* renamed from: a */
        public static Token m238a(Object obj, AbstractC0151b bVar) {
            if (obj == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            return new Token(C0157d.m557a(obj), bVar);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            if (Build.VERSION.SDK_INT >= 21) {
                parcel.writeParcelable((Parcelable) this.f355a, i);
            } else {
                parcel.writeStrongBinder((IBinder) this.f355a);
            }
        }

        Token(Object obj, AbstractC0151b bVar, Bundle bundle) {
            this.f355a = obj;
            this.f356b = bVar;
            this.f357c = bundle;
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$c */
    static class C0132c extends C0139g {

        /* renamed from: x */
        private static boolean f366x = true;

        static {
            Covode.recordClassIndex(152);
        }

        /* access modifiers changed from: package-private */
        @Override // android.support.p010v4.media.session.MediaSessionCompat.C0139g
        /* renamed from: a */
        public int mo214a(long j) {
            int a = super.mo214a(j);
            if ((j & 256) != 0) {
                return a | 256;
            }
            return a;
        }

        /* access modifiers changed from: package-private */
        @Override // android.support.p010v4.media.session.MediaSessionCompat.C0139g
        /* renamed from: b */
        public final void mo217b(PlaybackStateCompat playbackStateCompat) {
            long j = playbackStateCompat.f426b;
            float f = playbackStateCompat.f428d;
            long j2 = playbackStateCompat.f432h;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (playbackStateCompat.f425a == 3) {
                long j3 = 0;
                if (j > 0) {
                    if (j2 > 0) {
                        j3 = elapsedRealtime - j2;
                        if (f > 0.0f && f != 1.0f) {
                            j3 = (long) (((float) j3) * f);
                        }
                    }
                    j += j3;
                }
            }
            this.f391d.setPlaybackState(m341a(playbackStateCompat.f425a), j, f);
        }

        /* access modifiers changed from: package-private */
        @Override // android.support.p010v4.media.session.MediaSessionCompat.C0139g
        /* renamed from: b */
        public final void mo216b(PendingIntent pendingIntent, ComponentName componentName) {
            if (f366x) {
                this.f390c.unregisterMediaButtonEventReceiver(pendingIntent);
            } else {
                super.mo216b(pendingIntent, componentName);
            }
        }

        /* access modifiers changed from: package-private */
        @Override // android.support.p010v4.media.session.MediaSessionCompat.C0139g
        /* renamed from: a */
        public final void mo215a(PendingIntent pendingIntent, ComponentName componentName) {
            if (f366x) {
                try {
                    this.f390c.registerMediaButtonEventReceiver(pendingIntent);
                } catch (NullPointerException unused) {
                    f366x = false;
                }
            }
            if (!f366x) {
                super.mo215a(pendingIntent, componentName);
            }
        }

        @Override // android.support.p010v4.media.session.MediaSessionCompat.AbstractC0131b, android.support.p010v4.media.session.MediaSessionCompat.C0139g
        /* renamed from: a */
        public void mo205a(AbstractC0126a aVar, Handler handler) {
            super.mo205a(aVar, handler);
            if (aVar == null) {
                this.f391d.setPlaybackPositionUpdateListener(null);
                return;
            }
            this.f391d.setPlaybackPositionUpdateListener(new RemoteControlClient.OnPlaybackPositionUpdateListener() {
                /* class android.support.p010v4.media.session.MediaSessionCompat.C0132c.C01331 */

                static {
                    Covode.recordClassIndex(153);
                }

                public final void onPlaybackPositionUpdate(long j) {
                    C0132c.this.mo271a(18, -1, -1, Long.valueOf(j), null);
                }
            });
        }

        C0132c(Context context, String str, ComponentName componentName, PendingIntent pendingIntent) {
            super(context, str, componentName, pendingIntent);
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$f */
    static class C0138f extends C0136e {
        static {
            Covode.recordClassIndex(158);
        }

        @Override // android.support.p010v4.media.session.MediaSessionCompat.AbstractC0131b, android.support.p010v4.media.session.MediaSessionCompat.C0136e
        /* renamed from: a */
        public final void mo207a(C1323i.C1324a aVar) {
        }

        @Override // android.support.p010v4.media.session.MediaSessionCompat.AbstractC0131b, android.support.p010v4.media.session.MediaSessionCompat.C0136e
        /* renamed from: f */
        public final C1323i.C1324a mo213f() {
            return new C1323i.C1324a(((MediaSession) this.f369a).getCurrentControllerInfo());
        }

        C0138f(Context context, String str) {
            super(context, str, null);
        }
    }

    /* renamed from: a */
    public final void mo161a(AbstractC0126a aVar) {
        m228b(aVar);
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$d */
    static class C0134d extends C0132c {
        static {
            Covode.recordClassIndex(154);
        }

        /* access modifiers changed from: package-private */
        @Override // android.support.p010v4.media.session.MediaSessionCompat.C0132c, android.support.p010v4.media.session.MediaSessionCompat.C0139g
        /* renamed from: a */
        public final int mo214a(long j) {
            int a = super.mo214a(j);
            if ((j & 128) != 0) {
                return a | 512;
            }
            return a;
        }

        /* access modifiers changed from: package-private */
        @Override // android.support.p010v4.media.session.MediaSessionCompat.C0139g
        /* renamed from: a */
        public final RemoteControlClient.MetadataEditor mo219a(Bundle bundle) {
            long j;
            RemoteControlClient.MetadataEditor a = super.mo219a(bundle);
            if (this.f399l == null) {
                j = 0;
            } else {
                j = this.f399l.f429e;
            }
            if ((j & 128) != 0) {
                a.addEditableKey(268435457);
            }
            if (bundle == null) {
                return a;
            }
            if (bundle.containsKey("android.media.metadata.YEAR")) {
                a.putLong(8, bundle.getLong("android.media.metadata.YEAR"));
            }
            if (bundle.containsKey("android.media.metadata.RATING")) {
                a.putObject(101, (Object) bundle.getParcelable("android.media.metadata.RATING"));
            }
            if (bundle.containsKey("android.media.metadata.USER_RATING")) {
                a.putObject(268435457, (Object) bundle.getParcelable("android.media.metadata.USER_RATING"));
            }
            return a;
        }

        @Override // android.support.p010v4.media.session.MediaSessionCompat.AbstractC0131b, android.support.p010v4.media.session.MediaSessionCompat.C0132c, android.support.p010v4.media.session.MediaSessionCompat.C0139g
        /* renamed from: a */
        public final void mo205a(AbstractC0126a aVar, Handler handler) {
            super.mo205a(aVar, handler);
            if (aVar == null) {
                this.f391d.setMetadataUpdateListener(null);
                return;
            }
            this.f391d.setMetadataUpdateListener(new RemoteControlClient.OnMetadataUpdateListener() {
                /* class android.support.p010v4.media.session.MediaSessionCompat.C0134d.C01351 */

                static {
                    Covode.recordClassIndex(155);
                }

                public final void onMetadataUpdate(int i, Object obj) {
                    if (i == 268435457 && (obj instanceof Rating)) {
                        C0134d.this.mo271a(19, -1, -1, RatingCompat.m188a(obj), null);
                    }
                }
            });
        }

        C0134d(Context context, String str, ComponentName componentName, PendingIntent pendingIntent) {
            super(context, str, componentName, pendingIntent);
        }
    }

    /* renamed from: a */
    public static void m227a(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
        }
    }

    /* renamed from: b */
    private void m228b(AbstractC0126a aVar) {
        if (aVar == null) {
            this.f347c.mo205a(null, null);
        } else {
            this.f347c.mo205a(aVar, new Handler());
        }
    }

    /* renamed from: a */
    public final void mo159a(PendingIntent pendingIntent) {
        this.f347c.mo203a(pendingIntent);
    }

    /* renamed from: a */
    public final void mo160a(MediaMetadataCompat mediaMetadataCompat) {
        this.f347c.mo204a(mediaMetadataCompat);
    }

    /* renamed from: a */
    public final void mo162a(PlaybackStateCompat playbackStateCompat) {
        this.f347c.mo206a(playbackStateCompat);
    }

    /* renamed from: a */
    public final void mo163a(boolean z) {
        this.f347c.mo208a(z);
        Iterator<Object> it = this.f348d.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public MediaSessionCompat(Context context, String str) {
        this(context, str, (byte) 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0048, code lost:
        if (r2 > r5) goto L_0x004a;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static android.support.p010v4.media.session.PlaybackStateCompat m226a(android.support.p010v4.media.session.PlaybackStateCompat r10, android.support.p010v4.media.MediaMetadataCompat r11) {
        /*
        // Method dump skipped, instructions count: 101
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p010v4.media.session.MediaSessionCompat.m226a(android.support.v4.media.session.PlaybackStateCompat, android.support.v4.media.MediaMetadataCompat):android.support.v4.media.session.PlaybackStateCompat");
    }

    public MediaSessionCompat(Context context, String str, byte b) {
        this(context, str, (PendingIntent) null);
    }

    private MediaSessionCompat(Context context, String str, PendingIntent pendingIntent) {
        ComponentName componentName;
        this.f348d = new ArrayList<>();
        if (context == null) {
            throw new IllegalArgumentException("context must not be null");
        } else if (!TextUtils.isEmpty(str)) {
            Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
            intent.setPackage(context.getPackageName());
            List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
            if (queryBroadcastReceivers.size() == 1) {
                ResolveInfo resolveInfo = queryBroadcastReceivers.get(0);
                componentName = new ComponentName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name);
                Intent intent2 = new Intent("android.intent.action.MEDIA_BUTTON");
                intent2.setComponent(componentName);
                pendingIntent = PendingIntent.getBroadcast(context, 0, intent2, 0);
            } else {
                queryBroadcastReceivers.size();
                componentName = null;
            }
            if (Build.VERSION.SDK_INT >= 28) {
                C0138f fVar = new C0138f(context, str);
                this.f347c = fVar;
                m228b(new AbstractC0126a() {
                    /* class android.support.p010v4.media.session.MediaSessionCompat.C01211 */

                    static {
                        Covode.recordClassIndex(138);
                    }
                });
                fVar.mo203a(pendingIntent);
            } else if (Build.VERSION.SDK_INT >= 21) {
                C0136e eVar = new C0136e(context, str, null);
                this.f347c = eVar;
                m228b(new AbstractC0126a() {
                    /* class android.support.p010v4.media.session.MediaSessionCompat.C01222 */

                    static {
                        Covode.recordClassIndex(139);
                    }
                });
                eVar.mo203a(pendingIntent);
            } else {
                int i = Build.VERSION.SDK_INT;
                this.f347c = new C0134d(context, str, componentName, pendingIntent);
            }
            this.f346a = new MediaControllerCompat(context, this);
            if (f345b == 0) {
                f345b = (int) (TypedValue.applyDimension(1, 320.0f, context.getResources().getDisplayMetrics()) + 0.5f);
            }
        } else {
            throw new IllegalArgumentException("tag must not be null or empty");
        }
    }
}
