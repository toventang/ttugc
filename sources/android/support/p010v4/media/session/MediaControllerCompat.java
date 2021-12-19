package android.support.p010v4.media.session;

import android.content.Context;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.p010v4.media.MediaDescriptionCompat;
import android.support.p010v4.media.MediaMetadataCompat;
import android.support.p010v4.media.session.AbstractC0148a;
import android.support.p010v4.media.session.AbstractC0151b;
import android.support.p010v4.media.session.C0154c;
import android.support.p010v4.media.session.MediaSessionCompat;
import android.support.p010v4.media.session.PlaybackStateCompat;
import android.view.KeyEvent;
import androidx.core.app.C0578c;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* renamed from: android.support.v4.media.session.MediaControllerCompat */
public final class MediaControllerCompat {

    /* renamed from: a */
    public final MediaSessionCompat.Token f324a;

    /* renamed from: b */
    private final AbstractC0116b f325b;

    /* renamed from: c */
    private final HashSet<AbstractC0112a> f326c = new HashSet<>();

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$b */
    interface AbstractC0116b {
        static {
            Covode.recordClassIndex(132);
        }

        /* renamed from: a */
        boolean mo133a(KeyEvent keyEvent);
    }

    static {
        Covode.recordClassIndex(124);
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$a */
    public static abstract class AbstractC0112a implements IBinder.DeathRecipient {

        /* renamed from: a */
        final Object f333a;

        /* renamed from: b */
        HandlerC0113a f334b;

        /* renamed from: c */
        public AbstractC0148a f335c;

        static {
            Covode.recordClassIndex(128);
        }

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$a$c */
        static class BinderC0115c extends AbstractC0148a.AbstractBinderC0149a {

            /* renamed from: a */
            private final WeakReference<AbstractC0112a> f338a;

            static {
                Covode.recordClassIndex(131);
            }

            @Override // android.support.p010v4.media.session.AbstractC0148a
            /* renamed from: a */
            public final void mo154a(boolean z) {
            }

            @Override // android.support.p010v4.media.session.AbstractC0148a
            /* renamed from: a */
            public void mo140a(List<MediaSessionCompat.QueueItem> list) {
                AbstractC0112a aVar = this.f338a.get();
                if (aVar != null) {
                    aVar.mo141a(5, list, null);
                }
            }

            @Override // android.support.p010v4.media.session.AbstractC0148a
            /* renamed from: a */
            public void mo135a() {
                AbstractC0112a aVar = this.f338a.get();
                if (aVar != null) {
                    aVar.mo141a(8, null, null);
                }
            }

            @Override // android.support.p010v4.media.session.AbstractC0148a
            /* renamed from: b */
            public final void mo155b() {
                AbstractC0112a aVar = this.f338a.get();
                if (aVar != null) {
                    aVar.mo141a(13, null, null);
                }
            }

            BinderC0115c(AbstractC0112a aVar) {
                this.f338a = new WeakReference<>(aVar);
            }

            @Override // android.support.p010v4.media.session.AbstractC0148a
            /* renamed from: a */
            public void mo136a(Bundle bundle) {
                AbstractC0112a aVar = this.f338a.get();
                if (aVar != null) {
                    aVar.mo141a(7, bundle, null);
                }
            }

            @Override // android.support.p010v4.media.session.AbstractC0148a
            /* renamed from: a */
            public final void mo151a(int i) {
                AbstractC0112a aVar = this.f338a.get();
                if (aVar != null) {
                    aVar.mo141a(9, Integer.valueOf(i), null);
                }
            }

            @Override // android.support.p010v4.media.session.AbstractC0148a
            /* renamed from: b */
            public final void mo156b(int i) {
                AbstractC0112a aVar = this.f338a.get();
                if (aVar != null) {
                    aVar.mo141a(12, Integer.valueOf(i), null);
                }
            }

            @Override // android.support.p010v4.media.session.AbstractC0148a
            /* renamed from: a */
            public void mo137a(MediaMetadataCompat mediaMetadataCompat) {
                AbstractC0112a aVar = this.f338a.get();
                if (aVar != null) {
                    aVar.mo141a(3, mediaMetadataCompat, null);
                }
            }

            @Override // android.support.p010v4.media.session.AbstractC0148a
            /* renamed from: b */
            public final void mo157b(boolean z) {
                AbstractC0112a aVar = this.f338a.get();
                if (aVar != null) {
                    aVar.mo141a(11, Boolean.valueOf(z), null);
                }
            }

            @Override // android.support.p010v4.media.session.AbstractC0148a
            /* renamed from: a */
            public void mo138a(ParcelableVolumeInfo parcelableVolumeInfo) {
                C0120f fVar;
                AbstractC0112a aVar = this.f338a.get();
                if (aVar != null) {
                    if (parcelableVolumeInfo != null) {
                        fVar = new C0120f(parcelableVolumeInfo.f420a, parcelableVolumeInfo.f421b, parcelableVolumeInfo.f422c, parcelableVolumeInfo.f423d, parcelableVolumeInfo.f424e);
                    } else {
                        fVar = null;
                    }
                    aVar.mo141a(4, fVar, null);
                }
            }

            @Override // android.support.p010v4.media.session.AbstractC0148a
            /* renamed from: a */
            public final void mo152a(PlaybackStateCompat playbackStateCompat) {
                AbstractC0112a aVar = this.f338a.get();
                if (aVar != null) {
                    aVar.mo141a(2, playbackStateCompat, null);
                }
            }

            @Override // android.support.p010v4.media.session.AbstractC0148a
            /* renamed from: a */
            public void mo139a(CharSequence charSequence) {
                AbstractC0112a aVar = this.f338a.get();
                if (aVar != null) {
                    aVar.mo141a(6, charSequence, null);
                }
            }

            @Override // android.support.p010v4.media.session.AbstractC0148a
            /* renamed from: a */
            public final void mo153a(String str, Bundle bundle) {
                AbstractC0112a aVar = this.f338a.get();
                if (aVar != null) {
                    aVar.mo141a(1, str, bundle);
                }
            }
        }

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$a$b */
        static class C0114b implements C0154c.AbstractC0155a {

            /* renamed from: a */
            private final WeakReference<AbstractC0112a> f337a;

            static {
                Covode.recordClassIndex(130);
            }

            @Override // android.support.p010v4.media.session.C0154c.AbstractC0155a
            /* renamed from: a */
            public final void mo143a() {
                this.f337a.get();
            }

            @Override // android.support.p010v4.media.session.C0154c.AbstractC0155a
            /* renamed from: b */
            public final void mo146b() {
                this.f337a.get();
            }

            @Override // android.support.p010v4.media.session.C0154c.AbstractC0155a
            /* renamed from: c */
            public final void mo148c() {
                this.f337a.get();
            }

            @Override // android.support.p010v4.media.session.C0154c.AbstractC0155a
            /* renamed from: d */
            public final void mo149d() {
                this.f337a.get();
            }

            @Override // android.support.p010v4.media.session.C0154c.AbstractC0155a
            /* renamed from: e */
            public final void mo150e() {
                this.f337a.get();
            }

            C0114b(AbstractC0112a aVar) {
                this.f337a = new WeakReference<>(aVar);
            }

            @Override // android.support.p010v4.media.session.C0154c.AbstractC0155a
            /* renamed from: b */
            public final void mo147b(Object obj) {
                if (this.f337a.get() != null && obj != null && Build.VERSION.SDK_INT >= 21) {
                    Parcel obtain = Parcel.obtain();
                    ((MediaMetadata) obj).writeToParcel(obtain, 0);
                    obtain.setDataPosition(0);
                    obtain.recycle();
                    MediaMetadataCompat.CREATOR.createFromParcel(obtain).f317c = obj;
                }
            }

            @Override // android.support.p010v4.media.session.C0154c.AbstractC0155a
            /* renamed from: a */
            public final void mo145a(List<?> list) {
                MediaSessionCompat.QueueItem queueItem;
                if (!(this.f337a.get() == null || list == null || Build.VERSION.SDK_INT < 21)) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list) {
                        if (obj == null || Build.VERSION.SDK_INT < 21) {
                            queueItem = null;
                        } else {
                            MediaSession.QueueItem queueItem2 = (MediaSession.QueueItem) obj;
                            queueItem = new MediaSessionCompat.QueueItem(obj, MediaDescriptionCompat.m180a(queueItem2.getDescription()), queueItem2.getQueueId());
                        }
                        arrayList.add(queueItem);
                    }
                }
            }

            @Override // android.support.p010v4.media.session.C0154c.AbstractC0155a
            /* renamed from: a */
            public final void mo144a(Object obj) {
                ArrayList arrayList;
                PlaybackStateCompat.CustomAction customAction;
                AbstractC0112a aVar = this.f337a.get();
                if (aVar != null && aVar.f335c == null && obj != null && Build.VERSION.SDK_INT >= 21) {
                    PlaybackState playbackState = (PlaybackState) obj;
                    List<PlaybackState.CustomAction> customActions = playbackState.getCustomActions();
                    Bundle bundle = null;
                    if (customActions != null) {
                        arrayList = new ArrayList(customActions.size());
                        for (PlaybackState.CustomAction customAction2 : customActions) {
                            if (customAction2 == null || Build.VERSION.SDK_INT < 21) {
                                customAction = null;
                            } else {
                                PlaybackState.CustomAction customAction3 = customAction2;
                                customAction = new PlaybackStateCompat.CustomAction(customAction3.getAction(), customAction3.getName(), customAction3.getIcon(), customAction3.getExtras());
                                customAction.f441e = customAction2;
                            }
                            arrayList.add(customAction);
                        }
                    } else {
                        arrayList = null;
                    }
                    if (Build.VERSION.SDK_INT >= 22) {
                        bundle = playbackState.getExtras();
                    }
                    new PlaybackStateCompat(playbackState.getState(), playbackState.getPosition(), playbackState.getBufferedPosition(), playbackState.getPlaybackSpeed(), playbackState.getActions(), 0, playbackState.getErrorMessage(), playbackState.getLastPositionUpdateTime(), arrayList, playbackState.getActiveQueueItemId(), bundle).f436l = obj;
                }
            }
        }

        public AbstractC0112a() {
            if (Build.VERSION.SDK_INT >= 21) {
                this.f333a = new C0154c.C0156b(new C0114b(this));
                return;
            }
            BinderC0115c cVar = new BinderC0115c(this);
            this.f335c = cVar;
            this.f333a = cVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: android.support.v4.media.session.MediaControllerCompat$a$a */
        public class HandlerC0113a extends Handler {

            /* renamed from: a */
            boolean f336a;

            static {
                Covode.recordClassIndex(129);
            }

            public final void handleMessage(Message message) {
                if (this.f336a) {
                    switch (message.what) {
                        case 1:
                            MediaSessionCompat.m227a(message.getData());
                            Object obj = message.obj;
                            return;
                        case 2:
                            Object obj2 = message.obj;
                            return;
                        case 3:
                            Object obj3 = message.obj;
                            return;
                        case 4:
                            Object obj4 = message.obj;
                            return;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                            Object obj5 = message.obj;
                            return;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                            Object obj6 = message.obj;
                            return;
                        case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                            MediaSessionCompat.m227a((Bundle) message.obj);
                            return;
                        case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                        case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                        default:
                            return;
                        case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                            ((Integer) message.obj).intValue();
                            return;
                        case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
                            ((Boolean) message.obj).booleanValue();
                            return;
                        case ABRConfig.ABR_DEFAULT_WIFI_BITRATE /*{ENCODED_INT: 12}*/:
                            ((Integer) message.obj).intValue();
                            return;
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo141a(int i, Object obj, Bundle bundle) {
            HandlerC0113a aVar = this.f334b;
            if (aVar != null) {
                Message obtainMessage = aVar.obtainMessage(i, obj);
                obtainMessage.setData(bundle);
                obtainMessage.sendToTarget();
            }
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21 */
    static class MediaControllerImplApi21 implements AbstractC0116b {

        /* renamed from: a */
        protected final Object f327a;

        /* renamed from: b */
        final Object f328b = new Object();

        /* renamed from: c */
        final List<AbstractC0112a> f329c = new ArrayList();

        /* renamed from: d */
        HashMap<AbstractC0112a, BinderC0111a> f330d = new HashMap<>();

        /* renamed from: e */
        final MediaSessionCompat.Token f331e;

        static {
            Covode.recordClassIndex(125);
        }

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$a */
        static class BinderC0111a extends AbstractC0112a.BinderC0115c {
            static {
                Covode.recordClassIndex(127);
            }

            @Override // android.support.p010v4.media.session.AbstractC0148a, android.support.p010v4.media.session.MediaControllerCompat.AbstractC0112a.BinderC0115c
            /* renamed from: a */
            public final void mo135a() {
                throw new AssertionError();
            }

            BinderC0111a(AbstractC0112a aVar) {
                super(aVar);
            }

            @Override // android.support.p010v4.media.session.AbstractC0148a, android.support.p010v4.media.session.MediaControllerCompat.AbstractC0112a.BinderC0115c
            /* renamed from: a */
            public final void mo136a(Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.p010v4.media.session.AbstractC0148a, android.support.p010v4.media.session.MediaControllerCompat.AbstractC0112a.BinderC0115c
            /* renamed from: a */
            public final void mo137a(MediaMetadataCompat mediaMetadataCompat) {
                throw new AssertionError();
            }

            @Override // android.support.p010v4.media.session.AbstractC0148a, android.support.p010v4.media.session.MediaControllerCompat.AbstractC0112a.BinderC0115c
            /* renamed from: a */
            public final void mo138a(ParcelableVolumeInfo parcelableVolumeInfo) {
                throw new AssertionError();
            }

            @Override // android.support.p010v4.media.session.AbstractC0148a, android.support.p010v4.media.session.MediaControllerCompat.AbstractC0112a.BinderC0115c
            /* renamed from: a */
            public final void mo139a(CharSequence charSequence) {
                throw new AssertionError();
            }

            @Override // android.support.p010v4.media.session.AbstractC0148a, android.support.p010v4.media.session.MediaControllerCompat.AbstractC0112a.BinderC0115c
            /* renamed from: a */
            public final void mo140a(List<MediaSessionCompat.QueueItem> list) {
                throw new AssertionError();
            }
        }

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
        static class ExtraBinderRequestResultReceiver extends ResultReceiver {

            /* renamed from: a */
            private WeakReference<MediaControllerImplApi21> f332a;

            static {
                Covode.recordClassIndex(126);
            }

            ExtraBinderRequestResultReceiver(MediaControllerImplApi21 mediaControllerImplApi21) {
                super(null);
                this.f332a = new WeakReference<>(mediaControllerImplApi21);
            }

            /* access modifiers changed from: protected */
            public void onReceiveResult(int i, Bundle bundle) {
                MediaControllerImplApi21 mediaControllerImplApi21 = this.f332a.get();
                if (!(mediaControllerImplApi21 == null || bundle == null)) {
                    synchronized (mediaControllerImplApi21.f328b) {
                        mediaControllerImplApi21.f331e.f356b = AbstractC0151b.AbstractBinderC0152a.m499a(C0578c.m2196a(bundle, "android.support.v4.media.session.EXTRA_BINDER"));
                        mediaControllerImplApi21.f331e.f357c = bundle.getBundle("android.support.v4.media.session.SESSION_TOKEN2_BUNDLE");
                        if (mediaControllerImplApi21.f331e.f356b != null) {
                            for (AbstractC0112a aVar : mediaControllerImplApi21.f329c) {
                                BinderC0111a aVar2 = new BinderC0111a(aVar);
                                mediaControllerImplApi21.f330d.put(aVar, aVar2);
                                aVar.f335c = aVar2;
                                try {
                                    mediaControllerImplApi21.f331e.f356b.mo229a(aVar2);
                                    aVar.mo141a(13, null, null);
                                } catch (RemoteException unused) {
                                }
                            }
                            mediaControllerImplApi21.f329c.clear();
                        }
                    }
                }
            }
        }

        @Override // android.support.p010v4.media.session.MediaControllerCompat.AbstractC0116b
        /* renamed from: a */
        public final boolean mo133a(KeyEvent keyEvent) {
            return ((MediaController) this.f327a).dispatchMediaButtonEvent(keyEvent);
        }

        public MediaControllerImplApi21(Context context, MediaSessionCompat.Token token) {
            this.f331e = token;
            MediaController mediaController = new MediaController(context, (MediaSession.Token) token.f355a);
            this.f327a = mediaController;
            if (token.f356b == null) {
                mediaController.sendCommand("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, new ExtraBinderRequestResultReceiver(this));
            }
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$e */
    static class C0119e implements AbstractC0116b {

        /* renamed from: a */
        private AbstractC0151b f339a;

        static {
            Covode.recordClassIndex(135);
        }

        public C0119e(MediaSessionCompat.Token token) {
            this.f339a = AbstractC0151b.AbstractBinderC0152a.m499a((IBinder) token.f355a);
        }

        @Override // android.support.p010v4.media.session.MediaControllerCompat.AbstractC0116b
        /* renamed from: a */
        public final boolean mo133a(KeyEvent keyEvent) {
            if (keyEvent != null) {
                try {
                    this.f339a.mo234a(keyEvent);
                    return false;
                } catch (RemoteException unused) {
                    return false;
                }
            } else {
                throw new IllegalArgumentException("event may not be null.");
            }
        }
    }

    /* renamed from: a */
    public final boolean mo132a(KeyEvent keyEvent) {
        if (keyEvent != null) {
            return this.f325b.mo133a(keyEvent);
        }
        throw new IllegalArgumentException("KeyEvent may not be null");
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$c */
    static class C0117c extends MediaControllerImplApi21 {
        static {
            Covode.recordClassIndex(133);
        }

        public C0117c(Context context, MediaSessionCompat.Token token) {
            super(context, token);
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$d */
    static class C0118d extends C0117c {
        static {
            Covode.recordClassIndex(134);
        }

        public C0118d(Context context, MediaSessionCompat.Token token) {
            super(context, token);
        }
    }

    public MediaControllerCompat(Context context, MediaSessionCompat mediaSessionCompat) {
        AbstractC0116b bVar;
        MediaSessionCompat.Token d = mediaSessionCompat.mo166d();
        this.f324a = d;
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                bVar = new C0118d(context, d);
            } else if (Build.VERSION.SDK_INT >= 23) {
                bVar = new C0117c(context, d);
            } else if (Build.VERSION.SDK_INT >= 21) {
                bVar = new MediaControllerImplApi21(context, d);
            } else {
                bVar = new C0119e(d);
            }
        } catch (RemoteException unused) {
            bVar = null;
        }
        this.f325b = bVar;
    }

    public MediaControllerCompat(Context context, MediaSessionCompat.Token token) {
        if (token != null) {
            this.f324a = token;
            if (Build.VERSION.SDK_INT >= 24) {
                this.f325b = new C0118d(context, token);
            } else if (Build.VERSION.SDK_INT >= 23) {
                this.f325b = new C0117c(context, token);
            } else if (Build.VERSION.SDK_INT >= 21) {
                this.f325b = new MediaControllerImplApi21(context, token);
            } else {
                this.f325b = new C0119e(token);
            }
        } else {
            throw new IllegalArgumentException("sessionToken must not be null");
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$f */
    public static final class C0120f {

        /* renamed from: a */
        public final int f340a;

        /* renamed from: b */
        public final int f341b;

        /* renamed from: c */
        public final int f342c;

        /* renamed from: d */
        public final int f343d;

        /* renamed from: e */
        public final int f344e;

        static {
            Covode.recordClassIndex(136);
        }

        C0120f(int i, int i2, int i3, int i4, int i5) {
            this.f340a = i;
            this.f341b = i2;
            this.f342c = i3;
            this.f343d = i4;
            this.f344e = i5;
        }
    }
}
