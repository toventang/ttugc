package com.p2082ss.android.ugc.effectmanager;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.librarian.Librarian;
import com.p2082ss.android.ugc.aweme.lancet.C58032m;

/* renamed from: com.ss.android.ugc.effectmanager.DownloadableModelSupportLibraryLoader */
public interface DownloadableModelSupportLibraryLoader {
    static {
        Covode.recordClassIndex(95361);
    }

    void loadLibrary(String str);

    /* renamed from: com.ss.android.ugc.effectmanager.DownloadableModelSupportLibraryLoader$SystemLoader */
    public static class SystemLoader implements DownloadableModelSupportLibraryLoader {
        static {
            Covode.recordClassIndex(95362);
        }

        @Override // com.p2082ss.android.ugc.effectmanager.DownloadableModelSupportLibraryLoader
        public void loadLibrary(String str) {
            m141882xd5577b1d(str);
        }

        /* renamed from: com_ss_android_ugc_effectmanager_DownloadableModelSupportLibraryLoader$SystemLoader_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary */
        public static void m141882xd5577b1d(String str) {
            long uptimeMillis = SystemClock.uptimeMillis();
            Librarian.m38964a(str, false, (Context) null);
            C58032m.m104852a(uptimeMillis, str);
        }
    }
}
