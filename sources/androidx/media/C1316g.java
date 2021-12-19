package androidx.media;

import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Parcel;
import android.service.media.MediaBrowserService;
import androidx.media.C1311f;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.media.g */
final class C1316g {

    /* renamed from: androidx.media.g$b */
    public interface AbstractC1318b extends C1311f.AbstractC1315d {
        static {
            Covode.recordClassIndex(1431);
        }

        /* renamed from: b */
        void mo4275b(String str, C1311f.C1314c<Parcel> cVar);
    }

    static {
        Covode.recordClassIndex(1429);
    }

    /* renamed from: androidx.media.g$a */
    static class C1317a extends C1311f.C1313b {
        static {
            Covode.recordClassIndex(1430);
        }

        C1317a(Context context, AbstractC1318b bVar) {
            super(context, bVar);
        }

        @Override // android.service.media.MediaBrowserService
        public void onLoadItem(String str, MediaBrowserService.Result<MediaBrowser.MediaItem> result) {
            ((AbstractC1318b) this.f4300a).mo4275b(str, new C1311f.C1314c<>(result));
        }
    }
}
