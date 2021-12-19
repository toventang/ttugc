package androidx.media;

import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.os.Parcel;
import android.service.media.MediaBrowserService;
import android.support.p010v4.media.session.MediaSessionCompat;
import com.bytedance.covode.number.Covode;
import java.util.List;

/* renamed from: androidx.media.f */
final class C1311f {

    /* renamed from: androidx.media.f$a */
    static class C1312a {
        static {
            Covode.recordClassIndex(1425);
        }
    }

    /* renamed from: androidx.media.f$d */
    public interface AbstractC1315d {
        static {
            Covode.recordClassIndex(1428);
        }

        /* renamed from: a */
        C1312a mo4272a(String str, int i, Bundle bundle);

        /* renamed from: a */
        void mo4273a(String str, C1314c<List<Parcel>> cVar);
    }

    static {
        Covode.recordClassIndex(1424);
    }

    /* renamed from: androidx.media.f$c */
    static class C1314c<T> {

        /* renamed from: a */
        MediaBrowserService.Result f4301a;

        static {
            Covode.recordClassIndex(1427);
        }

        C1314c(MediaBrowserService.Result result) {
            this.f4301a = result;
        }

        /* renamed from: a */
        public final void mo4298a(T t) {
            this.f4301a.sendResult(null);
        }
    }

    /* renamed from: androidx.media.f$b */
    static class C1313b extends MediaBrowserService {

        /* renamed from: a */
        final AbstractC1315d f4300a;

        static {
            Covode.recordClassIndex(1426);
        }

        C1313b(Context context, AbstractC1315d dVar) {
            attachBaseContext(context);
            this.f4300a = dVar;
        }

        @Override // android.service.media.MediaBrowserService
        public void onLoadChildren(String str, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result) {
            this.f4300a.mo4273a(str, new C1314c<>(result));
        }

        public MediaBrowserService.BrowserRoot onGetRoot(String str, int i, Bundle bundle) {
            Bundle bundle2;
            MediaSessionCompat.m227a(bundle);
            AbstractC1315d dVar = this.f4300a;
            if (bundle == null) {
                bundle2 = null;
            } else {
                bundle2 = new Bundle(bundle);
            }
            dVar.mo4272a(str, i, bundle2);
            return null;
        }
    }
}
