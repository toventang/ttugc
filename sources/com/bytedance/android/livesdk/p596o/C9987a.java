package com.bytedance.android.livesdk.p596o;

import android.text.TextUtils;
import com.bytedance.android.live.core.p214d.C3868c;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.p2082ss.android.socialbase.downloader.downloader.Downloader;
import com.p2082ss.android.socialbase.downloader.exception.BaseException;
import com.p2082ss.android.socialbase.downloader.model.DownloadInfo;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.o.a */
public class C9987a {

    /* renamed from: c */
    private static C9987a f24263c;

    /* renamed from: a */
    public HashMap<Integer, C9990b<Long, Long>> f24264a = new HashMap<>();

    /* renamed from: b */
    public HashMap<String, AbstractC9989a> f24265b = new HashMap<>();

    /* renamed from: com.bytedance.android.livesdk.o.a$a */
    public interface AbstractC9989a {
        static {
            Covode.recordClassIndex(11543);
        }

        /* renamed from: a */
        void mo13395a(DownloadInfo downloadInfo);

        /* renamed from: b */
        void mo13396b(DownloadInfo downloadInfo);

        /* renamed from: c */
        void mo13397c(DownloadInfo downloadInfo);

        /* renamed from: d */
        void mo13398d(DownloadInfo downloadInfo);
    }

    static {
        Covode.recordClassIndex(11541);
    }

    private C9987a() {
    }

    /* renamed from: a */
    public static C9987a m18455a() {
        MethodCollector.m26663i(7967);
        if (f24263c == null) {
            synchronized (C9987a.class) {
                try {
                    if (f24263c == null) {
                        f24263c = new C9987a();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(7967);
                    throw th;
                }
            }
        }
        C9987a aVar = f24263c;
        MethodCollector.m26664o(7967);
        return aVar;
    }

    /* renamed from: a */
    public static DownloadInfo m18456a(String str) {
        List<DownloadInfo> allDownloadInfo = Downloader.getInstance(C3966y.m9669e()).getAllDownloadInfo();
        if (allDownloadInfo == null) {
            return null;
        }
        for (DownloadInfo downloadInfo : allDownloadInfo) {
            if (downloadInfo != null && TextUtils.equals(downloadInfo.getUrl(), str)) {
                return downloadInfo;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static String m18457a(byte[] bArr) {
        try {
            byte[] digest = MessageDigest.getInstance("MD5").digest(bArr);
            StringBuffer stringBuffer = new StringBuffer();
            for (byte b : digest) {
                String hexString = Integer.toHexString(b & 255);
                if (hexString.length() == 1) {
                    hexString = "0".concat(String.valueOf(hexString));
                }
                stringBuffer.append(hexString);
            }
            return stringBuffer.toString();
        } catch (NoSuchAlgorithmException e) {
            HashMap hashMap = new HashMap();
            hashMap.put("error_msg", e.getMessage());
            C3868c.m9491a("ttlive_replay_MD5_fail", 1, hashMap);
            return null;
        }
    }

    /* renamed from: a */
    public final void mo16810a(String str, AbstractC9989a aVar) {
        this.f24265b.put(str, aVar);
    }

    /* renamed from: com.bytedance.android.livesdk.o.a$b */
    public class C9990b<F, S> {

        /* renamed from: a */
        public F f24268a;

        /* renamed from: b */
        public S f24269b;

        static {
            Covode.recordClassIndex(11544);
        }

        public C9990b(F f, S s) {
            this.f24268a = f;
            this.f24269b = s;
        }
    }

    /* renamed from: a */
    public final int mo16809a(final String str, String str2, String str3) {
        return Downloader.with(C3966y.m9669e()).url(str).name(str3).savePath(str2).minProgressTimeMsInterval(1000).mainThreadListener(new AbsDownloadListener() {
            /* class com.bytedance.android.livesdk.p596o.C9987a.C99881 */

            static {
                Covode.recordClassIndex(11542);
            }

            @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener, com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener
            public final void onProgress(DownloadInfo downloadInfo) {
                super.onProgress(downloadInfo);
                if (C9987a.this.f24265b.get(str) != null) {
                    C9987a.this.f24265b.get(str).mo13395a(downloadInfo);
                }
            }

            @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener, com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener
            public final void onPause(DownloadInfo downloadInfo) {
                super.onPause(downloadInfo);
                if (C9987a.this.f24265b.get(str) != null) {
                    C9987a.this.f24265b.get(str).mo13396b(downloadInfo);
                }
                HashMap hashMap = new HashMap();
                hashMap.put("download_url", str);
                C3868c.m9491a("ttlive_live_replay_download_status_all", 2, hashMap);
            }

            @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener, com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener
            public final void onSuccessed(DownloadInfo downloadInfo) {
                C9990b<Long, Long> bVar;
                super.onSuccessed(downloadInfo);
                int id = downloadInfo.getId();
                if (C9987a.this.f24264a.containsKey(Integer.valueOf(id)) && (bVar = C9987a.this.f24264a.get(Integer.valueOf(id))) != null) {
                    bVar.f24268a = (F) Long.valueOf((bVar.f24268a.longValue() + System.currentTimeMillis()) - bVar.f24269b.longValue());
                    bVar.f24269b = (S) Long.valueOf(System.currentTimeMillis());
                    C9987a.this.f24264a.put(Integer.valueOf(id), bVar);
                }
                if (C9987a.this.f24265b.get(str) != null) {
                    C9987a.this.f24265b.get(str).mo13397c(downloadInfo);
                }
                HashMap hashMap = new HashMap();
                hashMap.put("download_url", str);
                C3868c.m9491a("ttlive_live_replay_download_status_all", 0, hashMap);
            }

            @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener, com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener
            public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
                int i;
                String str;
                super.onFailed(downloadInfo, baseException);
                if (C9987a.this.f24265b.get(str) != null) {
                    C9987a.this.f24265b.get(str).mo13398d(downloadInfo);
                }
                int id = downloadInfo.getId();
                if (C9987a.this.f24264a.containsKey(Integer.valueOf(id))) {
                    C9990b<Long, Long> bVar = C9987a.this.f24264a.get(Integer.valueOf(id));
                    if (bVar != null) {
                        bVar.f24268a = (F) Long.valueOf((bVar.f24268a.longValue() + System.currentTimeMillis()) - bVar.f24269b.longValue());
                        bVar.f24269b = (S) Long.valueOf(System.currentTimeMillis());
                        C9987a.this.f24264a.put(Integer.valueOf(id), bVar);
                    }
                } else {
                    C9987a.this.f24264a.remove(Integer.valueOf(id));
                }
                HashMap hashMap = new HashMap();
                int i2 = -1;
                if (baseException != null) {
                    i = baseException.getErrorCode();
                } else {
                    i = -1;
                }
                hashMap.put("error_code", Integer.valueOf(i));
                String str2 = "";
                if (baseException != null) {
                    str = baseException.getErrorMessage();
                } else {
                    str = str2;
                }
                hashMap.put("error_msg", str);
                C3868c.m9491a("ttlive_live_replay_download_status_all", 1, hashMap);
                C3868c.m9491a("ttlive_live_replay_download_status_error", 1, hashMap);
                C6501b a = C6501b.C6502a.m13948a("livesdk_download_replay_failed");
                if (baseException != null) {
                    i2 = baseException.getErrorCode();
                }
                C6501b a2 = a.mo12645a("error_code", i2);
                if (baseException != null) {
                    str2 = baseException.getErrorMessage();
                }
                a2.mo12651a("error_msg", str2).mo12655b();
                hashMap.put("download_url", str);
            }
        }).download();
    }
}
