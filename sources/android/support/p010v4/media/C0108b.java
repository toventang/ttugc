package android.support.p010v4.media;

import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.support.p010v4.media.C0103a;
import android.support.p010v4.media.session.MediaSessionCompat;
import com.bytedance.covode.number.Covode;
import java.util.List;

/* renamed from: android.support.v4.media.b */
final class C0108b {

    /* renamed from: android.support.v4.media.b$a */
    interface AbstractC0109a extends C0103a.AbstractC0106c {
        static {
            Covode.recordClassIndex(122);
        }

        /* renamed from: b */
        void mo104b(List<?> list);
    }

    static {
        Covode.recordClassIndex(121);
    }

    /* renamed from: android.support.v4.media.b$b */
    static class C0110b<T extends AbstractC0109a> extends C0103a.C0107d<T> {
        static {
            Covode.recordClassIndex(123);
        }

        C0110b(T t) {
            super(t);
        }

        public final void onError(String str, Bundle bundle) {
            MediaSessionCompat.m227a(bundle);
        }

        @Override // android.media.browse.MediaBrowser.SubscriptionCallback
        public final void onChildrenLoaded(String str, List<MediaBrowser.MediaItem> list, Bundle bundle) {
            MediaSessionCompat.m227a(bundle);
            ((AbstractC0109a) this.f323a).mo104b(list);
        }
    }
}
