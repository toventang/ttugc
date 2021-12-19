package androidx.media;

import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.service.media.MediaBrowserService;
import android.support.p010v4.media.session.MediaSessionCompat;
import androidx.media.C1316g;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Field;
import java.util.List;

/* renamed from: androidx.media.h */
final class C1319h {

    /* renamed from: a */
    static Field f4302a;

    /* renamed from: androidx.media.h$c */
    public interface AbstractC1322c extends C1316g.AbstractC1318b {
        static {
            Covode.recordClassIndex(1435);
        }

        /* renamed from: a */
        void mo4276a(String str, C1321b bVar);
    }

    static {
        Covode.recordClassIndex(1432);
        try {
            Field declaredField = MediaBrowserService.Result.class.getDeclaredField("mFlags");
            f4302a = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException unused) {
        }
    }

    /* renamed from: androidx.media.h$b */
    static class C1321b {

        /* renamed from: a */
        MediaBrowserService.Result f4303a;

        static {
            Covode.recordClassIndex(1434);
        }

        C1321b(MediaBrowserService.Result result) {
            this.f4303a = result;
        }
    }

    /* renamed from: androidx.media.h$a */
    static class C1320a extends C1316g.C1317a {
        static {
            Covode.recordClassIndex(1433);
        }

        C1320a(Context context, AbstractC1322c cVar) {
            super(context, cVar);
        }

        @Override // android.service.media.MediaBrowserService
        public final void onLoadChildren(String str, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result, Bundle bundle) {
            MediaSessionCompat.m227a(bundle);
            ((AbstractC1322c) this.f4300a).mo4276a(str, new C1321b(result));
        }
    }
}
