package android.support.p010v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.media.browse.MediaBrowser;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.p010v4.media.C0103a;
import android.support.p010v4.media.C0108b;
import android.support.p010v4.media.session.AbstractC0151b;
import android.support.p010v4.media.session.MediaSessionCompat;
import android.support.p010v4.p011os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.app.C0578c;
import androidx.media.C1277d;
import androidx.p025c.C0484a;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: android.support.v4.media.MediaBrowserCompat */
public final class MediaBrowserCompat {

    /* renamed from: a */
    static final boolean f244a = Log.isLoggable("MediaBrowserCompat", 3);

    /* renamed from: b */
    public final AbstractC0082d f245b;

    /* renamed from: android.support.v4.media.MediaBrowserCompat$c */
    public static abstract class AbstractC0081c {
        static {
            Covode.recordClassIndex(91);
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$d */
    public interface AbstractC0082d {
        static {
            Covode.recordClassIndex(92);
        }

        /* renamed from: c */
        void mo86c();

        /* renamed from: d */
        void mo87d();

        /* renamed from: e */
        MediaSessionCompat.Token mo88e();
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$i */
    interface AbstractC0092i {
        static {
            Covode.recordClassIndex(102);
        }

        /* renamed from: a */
        void mo89a(Messenger messenger);

        /* renamed from: a */
        void mo90a(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle);

        /* renamed from: a */
        void mo91a(Messenger messenger, String str, List list, Bundle bundle, Bundle bundle2);
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$b */
    public static class C0078b {

        /* renamed from: a */
        final Object f251a;

        /* renamed from: b */
        public AbstractC0079a f252b;

        /* renamed from: android.support.v4.media.MediaBrowserCompat$b$a */
        interface AbstractC0079a {
            static {
                Covode.recordClassIndex(89);
            }

            /* renamed from: a */
            void mo81a();

            /* renamed from: b */
            void mo82b();
        }

        static {
            Covode.recordClassIndex(88);
        }

        /* renamed from: a */
        public void mo78a() {
        }

        /* renamed from: b */
        public void mo79b() {
        }

        /* renamed from: c */
        public void mo80c() {
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$b$b */
        class C0080b implements C0103a.AbstractC0104a {
            static {
                Covode.recordClassIndex(90);
            }

            @Override // android.support.p010v4.media.C0103a.AbstractC0104a
            /* renamed from: c */
            public final void mo85c() {
                C0078b.this.mo80c();
            }

            @Override // android.support.p010v4.media.C0103a.AbstractC0104a
            /* renamed from: a */
            public final void mo83a() {
                if (C0078b.this.f252b != null) {
                    C0078b.this.f252b.mo81a();
                }
                C0078b.this.mo78a();
            }

            @Override // android.support.p010v4.media.C0103a.AbstractC0104a
            /* renamed from: b */
            public final void mo84b() {
                if (C0078b.this.f252b != null) {
                    C0078b.this.f252b.mo82b();
                }
                C0078b.this.mo79b();
            }

            C0080b() {
            }
        }

        public C0078b() {
            if (Build.VERSION.SDK_INT >= 21) {
                this.f251a = new C0103a.C0105b(new C0080b());
            } else {
                this.f251a = null;
            }
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$e */
    static class C0083e implements C0078b.AbstractC0079a, AbstractC0082d, AbstractC0092i {

        /* renamed from: a */
        final Context f254a;

        /* renamed from: b */
        protected final Object f255b;

        /* renamed from: c */
        protected final Bundle f256c;

        /* renamed from: d */
        protected final HandlerC0077a f257d = new HandlerC0077a(this);

        /* renamed from: e */
        protected int f258e;

        /* renamed from: f */
        protected C0093j f259f;

        /* renamed from: g */
        protected Messenger f260g;

        /* renamed from: h */
        private final C0484a<String, C0094k> f261h = new C0484a<>();

        /* renamed from: i */
        private MediaSessionCompat.Token f262i;

        /* renamed from: j */
        private Bundle f263j;

        static {
            Covode.recordClassIndex(93);
        }

        @Override // android.support.p010v4.media.MediaBrowserCompat.AbstractC0092i
        /* renamed from: a */
        public final void mo89a(Messenger messenger) {
        }

        @Override // android.support.p010v4.media.MediaBrowserCompat.AbstractC0092i
        /* renamed from: a */
        public final void mo90a(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle) {
        }

        @Override // android.support.p010v4.media.MediaBrowserCompat.AbstractC0082d
        /* renamed from: c */
        public final void mo86c() {
            ((MediaBrowser) this.f255b).connect();
        }

        @Override // android.support.p010v4.media.MediaBrowserCompat.C0078b.AbstractC0079a
        /* renamed from: b */
        public final void mo82b() {
            this.f259f = null;
            this.f260g = null;
            this.f262i = null;
            this.f257d.mo76a(null);
        }

        @Override // android.support.p010v4.media.MediaBrowserCompat.AbstractC0082d
        /* renamed from: d */
        public final void mo87d() {
            Messenger messenger;
            C0093j jVar = this.f259f;
            if (!(jVar == null || (messenger = this.f260g) == null)) {
                try {
                    jVar.mo101a(7, null, messenger);
                } catch (RemoteException unused) {
                }
            }
            ((MediaBrowser) this.f255b).disconnect();
        }

        @Override // android.support.p010v4.media.MediaBrowserCompat.AbstractC0082d
        /* renamed from: e */
        public final MediaSessionCompat.Token mo88e() {
            if (this.f262i == null) {
                this.f262i = MediaSessionCompat.Token.m238a(((MediaBrowser) this.f255b).getSessionToken(), null);
            }
            return this.f262i;
        }

        @Override // android.support.p010v4.media.MediaBrowserCompat.C0078b.AbstractC0079a
        /* renamed from: a */
        public final void mo81a() {
            Bundle extras = ((MediaBrowser) this.f255b).getExtras();
            if (extras != null) {
                this.f258e = extras.getInt("extra_service_version", 0);
                IBinder a = C0578c.m2196a(extras, "extra_messenger");
                if (a != null) {
                    this.f259f = new C0093j(a, this.f256c);
                    Messenger messenger = new Messenger(this.f257d);
                    this.f260g = messenger;
                    this.f257d.mo76a(messenger);
                    try {
                        C0093j jVar = this.f259f;
                        Context context = this.f254a;
                        Messenger messenger2 = this.f260g;
                        Bundle bundle = new Bundle();
                        bundle.putString("data_package_name", context.getPackageName());
                        bundle.putBundle("data_root_hints", jVar.f286a);
                        jVar.mo101a(6, bundle, messenger2);
                    } catch (RemoteException unused) {
                    }
                }
                AbstractC0151b a2 = AbstractC0151b.AbstractBinderC0152a.m499a(C0578c.m2196a(extras, "extra_session_binder"));
                if (a2 != null) {
                    this.f262i = MediaSessionCompat.Token.m238a(((MediaBrowser) this.f255b).getSessionToken(), a2);
                }
            }
        }

        C0083e(Context context, ComponentName componentName, C0078b bVar, Bundle bundle) {
            Bundle bundle2;
            this.f254a = context;
            if (bundle == null) {
                bundle2 = new Bundle();
            }
            this.f256c = bundle2;
            bundle2.putInt("extra_client_version", 1);
            bVar.f252b = this;
            this.f255b = new MediaBrowser(context, componentName, (MediaBrowser.ConnectionCallback) bVar.f251a, bundle2);
        }

        @Override // android.support.p010v4.media.MediaBrowserCompat.AbstractC0092i
        /* renamed from: a */
        public final void mo91a(Messenger messenger, String str, List list, Bundle bundle, Bundle bundle2) {
            C0094k kVar;
            if (this.f260g == messenger && (kVar = this.f261h.get(str)) != null && kVar.mo102a(bundle) != null) {
                if (bundle == null) {
                    if (list != null) {
                        this.f263j = bundle2;
                        this.f263j = null;
                    }
                } else if (list != null) {
                    this.f263j = bundle2;
                    this.f263j = null;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.v4.media.MediaBrowserCompat$h */
    public static class C0086h implements AbstractC0082d, AbstractC0092i {

        /* renamed from: a */
        final Context f264a;

        /* renamed from: b */
        final ComponentName f265b;

        /* renamed from: c */
        final C0078b f266c;

        /* renamed from: d */
        final Bundle f267d;

        /* renamed from: e */
        final HandlerC0077a f268e = new HandlerC0077a(this);

        /* renamed from: f */
        int f269f = 1;

        /* renamed from: g */
        ServiceConnectionC0089a f270g;

        /* renamed from: h */
        C0093j f271h;

        /* renamed from: i */
        Messenger f272i;

        /* renamed from: j */
        private final C0484a<String, C0094k> f273j = new C0484a<>();

        /* renamed from: k */
        private String f274k;

        /* renamed from: l */
        private MediaSessionCompat.Token f275l;

        /* renamed from: m */
        private Bundle f276m;

        /* renamed from: n */
        private Bundle f277n;

        static {
            Covode.recordClassIndex(96);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final void mo93b() {
            m161a(this.f269f);
        }

        @Override // android.support.p010v4.media.MediaBrowserCompat.AbstractC0082d
        /* renamed from: d */
        public final void mo87d() {
            this.f269f = 0;
            this.f268e.post(new Runnable() {
                /* class android.support.p010v4.media.MediaBrowserCompat.C0086h.RunnableC00882 */

                static {
                    Covode.recordClassIndex(98);
                }

                public final void run() {
                    if (C0086h.this.f272i != null) {
                        try {
                            C0086h.this.f271h.mo101a(2, null, C0086h.this.f272i);
                        } catch (RemoteException unused) {
                        }
                    }
                    int i = C0086h.this.f269f;
                    C0086h.this.mo92a();
                    if (i != 0) {
                        C0086h.this.f269f = i;
                    }
                    if (MediaBrowserCompat.f244a) {
                        C0086h.this.mo93b();
                    }
                }
            });
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo92a() {
            ServiceConnectionC0089a aVar = this.f270g;
            if (aVar != null) {
                this.f264a.unbindService(aVar);
            }
            this.f269f = 1;
            this.f270g = null;
            this.f271h = null;
            this.f272i = null;
            this.f268e.mo76a(null);
            this.f274k = null;
            this.f275l = null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: android.support.v4.media.MediaBrowserCompat$h$a */
        public class ServiceConnectionC0089a implements ServiceConnection {
            static {
                Covode.recordClassIndex(99);
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public final boolean mo96a() {
                if (C0086h.this.f270g != this || C0086h.this.f269f == 0 || C0086h.this.f269f == 1) {
                    return false;
                }
                return true;
            }

            ServiceConnectionC0089a() {
            }

            public final void onServiceDisconnected(final ComponentName componentName) {
                m171a(new Runnable() {
                    /* class android.support.p010v4.media.MediaBrowserCompat.C0086h.ServiceConnectionC0089a.RunnableC00912 */

                    static {
                        Covode.recordClassIndex(101);
                    }

                    public final void run() {
                        if (MediaBrowserCompat.f244a) {
                            C0086h.this.mo93b();
                        }
                        if (ServiceConnectionC0089a.this.mo96a()) {
                            C0086h.this.f271h = null;
                            C0086h.this.f272i = null;
                            C0086h.this.f268e.mo76a(null);
                            C0086h.this.f269f = 4;
                            C0086h.this.f266c.mo79b();
                        }
                    }
                });
            }

            /* renamed from: a */
            private void m171a(Runnable runnable) {
                if (Thread.currentThread() == C0086h.this.f268e.getLooper().getThread()) {
                    runnable.run();
                } else {
                    C0086h.this.f268e.post(runnable);
                }
            }

            public final void onServiceConnected(final ComponentName componentName, final IBinder iBinder) {
                m171a(new Runnable() {
                    /* class android.support.p010v4.media.MediaBrowserCompat.C0086h.ServiceConnectionC0089a.RunnableC00901 */

                    static {
                        Covode.recordClassIndex(100);
                    }

                    public final void run() {
                        if (MediaBrowserCompat.f244a) {
                            C0086h.this.mo93b();
                        }
                        if (ServiceConnectionC0089a.this.mo96a()) {
                            C0086h.this.f271h = new C0093j(iBinder, C0086h.this.f267d);
                            C0086h.this.f272i = new Messenger(C0086h.this.f268e);
                            C0086h.this.f268e.mo76a(C0086h.this.f272i);
                            C0086h.this.f269f = 2;
                            try {
                                if (MediaBrowserCompat.f244a) {
                                    C0086h.this.mo93b();
                                }
                                C0093j jVar = C0086h.this.f271h;
                                Context context = C0086h.this.f264a;
                                Messenger messenger = C0086h.this.f272i;
                                Bundle bundle = new Bundle();
                                bundle.putString("data_package_name", context.getPackageName());
                                bundle.putBundle("data_root_hints", jVar.f286a);
                                jVar.mo101a(1, bundle, messenger);
                            } catch (RemoteException unused) {
                                if (MediaBrowserCompat.f244a) {
                                    C0086h.this.mo93b();
                                }
                            }
                        }
                    }
                });
            }
        }

        @Override // android.support.p010v4.media.MediaBrowserCompat.AbstractC0082d
        /* renamed from: c */
        public final void mo86c() {
            int i = this.f269f;
            if (i == 0 || i == 1) {
                this.f269f = 2;
                this.f268e.post(new Runnable() {
                    /* class android.support.p010v4.media.MediaBrowserCompat.C0086h.RunnableC00871 */

                    static {
                        Covode.recordClassIndex(97);
                    }

                    /* JADX WARNING: Removed duplicated region for block: B:24:0x005d  */
                    /* JADX WARNING: Removed duplicated region for block: B:27:0x006d  */
                    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final void run() {
                        /*
                        // Method dump skipped, instructions count: 190
                        */
                        throw new UnsupportedOperationException("Method not decompiled: android.support.p010v4.media.MediaBrowserCompat.C0086h.RunnableC00871.run():void");
                    }
                });
                return;
            }
            throw new IllegalStateException("connect() called while neigther disconnecting nor disconnected (state=" + m161a(this.f269f) + ")");
        }

        @Override // android.support.p010v4.media.MediaBrowserCompat.AbstractC0082d
        /* renamed from: e */
        public final MediaSessionCompat.Token mo88e() {
            if (this.f269f == 3) {
                return this.f275l;
            }
            throw new IllegalStateException("getSessionToken() called while not connected(state=" + this.f269f + ")");
        }

        /* renamed from: b */
        private boolean m162b(Messenger messenger) {
            int i;
            if (this.f272i != messenger || (i = this.f269f) == 0 || i == 1) {
                return false;
            }
            return true;
        }

        /* renamed from: a */
        private static String m161a(int i) {
            if (i == 0) {
                return "CONNECT_STATE_DISCONNECTING";
            }
            if (i == 1) {
                return "CONNECT_STATE_DISCONNECTED";
            }
            if (i == 2) {
                return "CONNECT_STATE_CONNECTING";
            }
            if (i == 3) {
                return "CONNECT_STATE_CONNECTED";
            }
            if (i != 4) {
                return "UNKNOWN/".concat(String.valueOf(i));
            }
            return "CONNECT_STATE_SUSPENDED";
        }

        @Override // android.support.p010v4.media.MediaBrowserCompat.AbstractC0092i
        /* renamed from: a */
        public final void mo89a(Messenger messenger) {
            if (m162b(messenger)) {
                int i = this.f269f;
                if (i != 2) {
                    m161a(i);
                    return;
                }
                mo92a();
                this.f266c.mo80c();
            }
        }

        public C0086h(Context context, ComponentName componentName, C0078b bVar) {
            if (context == null) {
                throw new IllegalArgumentException("context must not be null");
            } else if (componentName == null) {
                throw new IllegalArgumentException("service component must not be null");
            } else if (bVar != null) {
                this.f264a = context;
                this.f265b = componentName;
                this.f266c = bVar;
                this.f267d = null;
            } else {
                throw new IllegalArgumentException("connection callback must not be null");
            }
        }

        @Override // android.support.p010v4.media.MediaBrowserCompat.AbstractC0092i
        /* renamed from: a */
        public final void mo90a(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle) {
            if (m162b(messenger)) {
                int i = this.f269f;
                if (i != 2) {
                    m161a(i);
                    return;
                }
                this.f274k = str;
                this.f275l = token;
                this.f276m = bundle;
                this.f269f = 3;
                if (MediaBrowserCompat.f244a) {
                    mo93b();
                }
                this.f266c.mo78a();
                try {
                    for (Map.Entry<String, C0094k> entry : this.f273j.entrySet()) {
                        String key = entry.getKey();
                        C0094k value = entry.getValue();
                        List<AbstractC0095l> list = value.f288a;
                        List<Bundle> list2 = value.f289b;
                        for (int i2 = 0; i2 < list.size(); i2++) {
                            C0093j jVar = this.f271h;
                            IBinder iBinder = list.get(i2).f291b;
                            Messenger messenger2 = this.f272i;
                            Bundle bundle2 = new Bundle();
                            bundle2.putString("data_media_item_id", key);
                            C0578c.m2197a(bundle2, "data_callback_token", iBinder);
                            bundle2.putBundle("data_options", list2.get(i2));
                            jVar.mo101a(3, bundle2, messenger2);
                        }
                    }
                } catch (RemoteException unused) {
                }
            }
        }

        @Override // android.support.p010v4.media.MediaBrowserCompat.AbstractC0092i
        /* renamed from: a */
        public final void mo91a(Messenger messenger, String str, List list, Bundle bundle, Bundle bundle2) {
            C0094k kVar;
            if (m162b(messenger) && (kVar = this.f273j.get(str)) != null && kVar.mo102a(bundle) != null) {
                if (bundle == null) {
                    if (list != null) {
                        this.f277n = bundle2;
                        this.f277n = null;
                    }
                } else if (list != null) {
                    this.f277n = bundle2;
                    this.f277n = null;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo69a() {
        this.f245b.mo87d();
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaItem */
    public static class MediaItem implements Parcelable {
        public static final Parcelable.Creator<MediaItem> CREATOR = new Parcelable.Creator<MediaItem>() {
            /* class android.support.p010v4.media.MediaBrowserCompat.MediaItem.C00761 */

            static {
                Covode.recordClassIndex(85);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ MediaItem[] newArray(int i) {
                return new MediaItem[i];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ MediaItem createFromParcel(Parcel parcel) {
                return new MediaItem(parcel);
            }
        };

        /* renamed from: a */
        public final int f247a;

        /* renamed from: b */
        public final MediaDescriptionCompat f248b;

        public int describeContents() {
            return 0;
        }

        static {
            Covode.recordClassIndex(84);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("MediaItem{");
            sb.append("mFlags=").append(this.f247a);
            sb.append(", mDescription=").append(this.f248b);
            sb.append('}');
            return sb.toString();
        }

        MediaItem(Parcel parcel) {
            this.f247a = parcel.readInt();
            this.f248b = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        }

        /* renamed from: a */
        public static List<MediaItem> m139a(List<?> list) {
            MediaItem mediaItem;
            if (list == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            for (Object obj : list) {
                if (obj == null || Build.VERSION.SDK_INT < 21) {
                    mediaItem = null;
                } else {
                    MediaBrowser.MediaItem mediaItem2 = (MediaBrowser.MediaItem) obj;
                    mediaItem = new MediaItem(MediaDescriptionCompat.m180a(mediaItem2.getDescription()), mediaItem2.getFlags());
                }
                arrayList.add(mediaItem);
            }
            return arrayList;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f247a);
            this.f248b.writeToParcel(parcel, i);
        }

        private MediaItem(MediaDescriptionCompat mediaDescriptionCompat, int i) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("description cannot be null");
            } else if (!TextUtils.isEmpty(mediaDescriptionCompat.f295a)) {
                this.f247a = i;
                this.f248b = mediaDescriptionCompat;
            } else {
                throw new IllegalArgumentException("description must have a non-empty media id");
            }
        }
    }

    static {
        Covode.recordClassIndex(81);
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$l */
    public static abstract class AbstractC0095l {

        /* renamed from: a */
        final Object f290a;

        /* renamed from: b */
        final IBinder f291b = new Binder();

        /* renamed from: c */
        WeakReference<C0094k> f292c;

        static {
            Covode.recordClassIndex(105);
        }

        public AbstractC0095l() {
            if (Build.VERSION.SDK_INT >= 26) {
                this.f290a = new C0108b.C0110b(new C0097b());
            } else if (Build.VERSION.SDK_INT >= 21) {
                this.f290a = new C0103a.C0107d(new C0096a());
            } else {
                this.f290a = null;
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$l$b */
        class C0097b extends C0096a implements C0108b.AbstractC0109a {
            static {
                Covode.recordClassIndex(107);
            }

            @Override // android.support.p010v4.media.C0108b.AbstractC0109a
            /* renamed from: b */
            public final void mo104b(List<?> list) {
                MediaItem.m139a(list);
            }

            C0097b() {
                super();
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$l$a */
        class C0096a implements C0103a.AbstractC0106c {
            static {
                Covode.recordClassIndex(106);
            }

            C0096a() {
            }

            @Override // android.support.p010v4.media.C0103a.AbstractC0106c
            /* renamed from: a */
            public final void mo103a(List<?> list) {
                C0094k kVar;
                if (AbstractC0095l.this.f292c == null || (kVar = AbstractC0095l.this.f292c.get()) == null) {
                    MediaItem.m139a(list);
                    return;
                }
                List<MediaItem> a = MediaItem.m139a(list);
                List<AbstractC0095l> list2 = kVar.f288a;
                List<Bundle> list3 = kVar.f289b;
                for (int i = 0; i < list2.size(); i++) {
                    Bundle bundle = list3.get(i);
                    if (!(bundle == null || a == null)) {
                        int i2 = bundle.getInt("android.media.browse.extra.PAGE", -1);
                        int i3 = bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
                        if (i2 != -1) {
                            int i4 = i3 * i2;
                            int i5 = i4 + i3;
                            if (i2 >= 0 && i3 > 0 && i4 < a.size()) {
                                if (i5 > a.size()) {
                                    i5 = a.size();
                                }
                                a.subList(i4, i5);
                            }
                        } else if (i3 == -1) {
                        }
                        Collections.emptyList();
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.v4.media.MediaBrowserCompat$a */
    public static class HandlerC0077a extends Handler {

        /* renamed from: a */
        private final WeakReference<AbstractC0092i> f249a;

        /* renamed from: b */
        private WeakReference<Messenger> f250b;

        static {
            Covode.recordClassIndex(87);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo76a(Messenger messenger) {
            this.f250b = new WeakReference<>(messenger);
        }

        HandlerC0077a(AbstractC0092i iVar) {
            this.f249a = new WeakReference<>(iVar);
        }

        public final void handleMessage(Message message) {
            WeakReference<Messenger> weakReference = this.f250b;
            if (weakReference != null && weakReference.get() != null && this.f249a.get() != null) {
                Bundle data = message.getData();
                MediaSessionCompat.m227a(data);
                AbstractC0092i iVar = this.f249a.get();
                Messenger messenger = this.f250b.get();
                try {
                    int i = message.what;
                    if (i == 1) {
                        Bundle bundle = data.getBundle("data_root_hints");
                        MediaSessionCompat.m227a(bundle);
                        iVar.mo90a(messenger, data.getString("data_media_item_id"), (MediaSessionCompat.Token) data.getParcelable("data_media_session_token"), bundle);
                    } else if (i == 2) {
                        iVar.mo89a(messenger);
                    } else if (i != 3) {
                        int i2 = message.arg1;
                    } else {
                        Bundle bundle2 = data.getBundle("data_options");
                        MediaSessionCompat.m227a(bundle2);
                        Bundle bundle3 = data.getBundle("data_notify_children_changed_options");
                        MediaSessionCompat.m227a(bundle3);
                        iVar.mo91a(messenger, data.getString("data_media_item_id"), data.getParcelableArrayList("data_media_item_list"), bundle2, bundle3);
                    }
                } catch (BadParcelableException unused) {
                    if (message.what == 1) {
                        iVar.mo89a(messenger);
                    }
                }
            }
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$k */
    static class C0094k {

        /* renamed from: a */
        public final List<AbstractC0095l> f288a = new ArrayList();

        /* renamed from: b */
        public final List<Bundle> f289b = new ArrayList();

        static {
            Covode.recordClassIndex(104);
        }

        /* renamed from: a */
        public final AbstractC0095l mo102a(Bundle bundle) {
            for (int i = 0; i < this.f289b.size(); i++) {
                if (C1277d.m4052a(this.f289b.get(i), bundle)) {
                    return this.f288a.get(i);
                }
            }
            return null;
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$CustomActionResultReceiver */
    static class CustomActionResultReceiver extends ResultReceiver {

        /* renamed from: d */
        private final AbstractC0081c f246d;

        static {
            Covode.recordClassIndex(82);
        }

        @Override // android.support.p010v4.p011os.ResultReceiver
        /* renamed from: a */
        public final void mo70a(int i, Bundle bundle) {
            if (this.f246d != null) {
                MediaSessionCompat.m227a(bundle);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.v4.media.MediaBrowserCompat$j */
    public static class C0093j {

        /* renamed from: a */
        Bundle f286a;

        /* renamed from: b */
        private Messenger f287b;

        static {
            Covode.recordClassIndex(103);
        }

        public C0093j(IBinder iBinder, Bundle bundle) {
            this.f287b = new Messenger(iBinder);
            this.f286a = bundle;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo101a(int i, Bundle bundle, Messenger messenger) {
            Message obtain = Message.obtain();
            obtain.what = i;
            obtain.arg1 = 1;
            obtain.setData(bundle);
            obtain.replyTo = messenger;
            this.f287b.send(obtain);
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$ItemReceiver */
    static class ItemReceiver extends ResultReceiver {
        static {
            Covode.recordClassIndex(83);
        }

        @Override // android.support.p010v4.p011os.ResultReceiver
        /* renamed from: a */
        public final void mo70a(int i, Bundle bundle) {
            MediaSessionCompat.m227a(bundle);
            if (i == 0 && bundle != null && bundle.containsKey("media_item")) {
                bundle.getParcelable("media_item");
            }
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$SearchResultReceiver */
    static class SearchResultReceiver extends ResultReceiver {
        static {
            Covode.recordClassIndex(86);
        }

        @Override // android.support.p010v4.p011os.ResultReceiver
        /* renamed from: a */
        public final void mo70a(int i, Bundle bundle) {
            Parcelable[] parcelableArray;
            MediaSessionCompat.m227a(bundle);
            if (i == 0 && bundle != null && bundle.containsKey("search_results") && (parcelableArray = bundle.getParcelableArray("search_results")) != null) {
                ArrayList arrayList = new ArrayList();
                for (Parcelable parcelable : parcelableArray) {
                    arrayList.add(parcelable);
                }
            }
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$g */
    static class C0085g extends C0084f {
        static {
            Covode.recordClassIndex(95);
        }

        C0085g(Context context, ComponentName componentName, C0078b bVar) {
            super(context, componentName, bVar, null);
        }
    }

    public MediaBrowserCompat(Context context, ComponentName componentName, C0078b bVar) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f245b = new C0085g(context, componentName, bVar);
        } else if (Build.VERSION.SDK_INT >= 23) {
            this.f245b = new C0084f(context, componentName, bVar, null);
        } else if (Build.VERSION.SDK_INT >= 21) {
            this.f245b = new C0083e(context, componentName, bVar, null);
        } else {
            this.f245b = new C0086h(context, componentName, bVar);
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$f */
    static class C0084f extends C0083e {
        static {
            Covode.recordClassIndex(94);
        }

        C0084f(Context context, ComponentName componentName, C0078b bVar, Bundle bundle) {
            super(context, componentName, bVar, null);
        }
    }
}
