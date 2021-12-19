package android.support.p010v4.media;

import android.media.browse.MediaBrowser;
import com.bytedance.covode.number.Covode;
import java.util.List;

/* renamed from: android.support.v4.media.a */
final class C0103a {

    /* renamed from: android.support.v4.media.a$a */
    interface AbstractC0104a {
        static {
            Covode.recordClassIndex(117);
        }

        /* renamed from: a */
        void mo83a();

        /* renamed from: b */
        void mo84b();

        /* renamed from: c */
        void mo85c();
    }

    /* renamed from: android.support.v4.media.a$c */
    interface AbstractC0106c {
        static {
            Covode.recordClassIndex(119);
        }

        /* renamed from: a */
        void mo103a(List<?> list);
    }

    static {
        Covode.recordClassIndex(116);
    }

    /* renamed from: android.support.v4.media.a$b */
    static class C0105b<T extends AbstractC0104a> extends MediaBrowser.ConnectionCallback {

        /* renamed from: a */
        protected final T f322a;

        static {
            Covode.recordClassIndex(118);
        }

        public final void onConnected() {
            this.f322a.mo83a();
        }

        public final void onConnectionFailed() {
            this.f322a.mo85c();
        }

        public final void onConnectionSuspended() {
            this.f322a.mo84b();
        }

        public C0105b(T t) {
            this.f322a = t;
        }
    }

    /* renamed from: android.support.v4.media.a$d */
    static class C0107d<T extends AbstractC0106c> extends MediaBrowser.SubscriptionCallback {

        /* renamed from: a */
        protected final T f323a;

        static {
            Covode.recordClassIndex(120);
        }

        public void onError(String str) {
        }

        public C0107d(T t) {
            this.f323a = t;
        }

        @Override // android.media.browse.MediaBrowser.SubscriptionCallback
        public void onChildrenLoaded(String str, List<MediaBrowser.MediaItem> list) {
            this.f323a.mo103a(list);
        }
    }
}
