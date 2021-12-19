package com.p2082ss.videoarch.p4474a.p4476b;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.mediakit.medialoader.AVMDLDataLoader;
import com.p2082ss.mediakit.medialoader.AVMDLDataLoaderConfigure;
import com.p2082ss.mediakit.medialoader.AVMDLDataLoaderListener;
import com.p2082ss.mediakit.medialoader.AVMDLDataLoaderNotifyInfo;
import com.p2082ss.ttm.player.AbstractC86253m;
import java.net.URLEncoder;

/* renamed from: com.ss.videoarch.a.b.b */
public final class C87125b implements AVMDLDataLoaderListener {

    /* renamed from: a */
    public AVMDLDataLoaderConfigure f196871a;

    /* renamed from: b */
    public AbstractC87124a f196872b;

    /* renamed from: c */
    public AbstractC86253m f196873c;

    static {
        Covode.recordClassIndex(102926);
    }

    @Override // com.p2082ss.mediakit.medialoader.AVMDLDataLoaderListener
    public final String getCheckSumInfo(String str) {
        return null;
    }

    @Override // com.p2082ss.mediakit.medialoader.AVMDLDataLoaderListener
    public final String getStringValue(int i, long j, String str) {
        return null;
    }

    /* renamed from: com.ss.videoarch.a.b.b$a */
    public static class C87126a {

        /* renamed from: a */
        public static C87125b f196874a = new C87125b((byte) 0);

        static {
            Covode.recordClassIndex(102927);
        }
    }

    private C87125b() {
        this.f196871a = AVMDLDataLoaderConfigure.getDefaultonfigure();
    }

    /* renamed from: a */
    public static boolean m150940a() {
        if (AVMDLDataLoader.getInstance() == null) {
            return false;
        }
        return AVMDLDataLoader.getInstance().isRunning();
    }

    /* synthetic */ C87125b(byte b) {
        this();
    }

    @Override // com.p2082ss.mediakit.medialoader.AVMDLDataLoaderListener
    public final void onNotify(AVMDLDataLoaderNotifyInfo aVMDLDataLoaderNotifyInfo) {
        AbstractC87124a aVar;
        if (aVMDLDataLoaderNotifyInfo != null && this.f196872b != null) {
            int i = aVMDLDataLoaderNotifyInfo.what;
            if (i == 9) {
                AbstractC87124a aVar2 = this.f196872b;
                if (aVar2 != null) {
                    aVar2.mo140885a((int) aVMDLDataLoaderNotifyInfo.parameter, aVMDLDataLoaderNotifyInfo.logInfo);
                }
            } else if (i == 12 && (aVar = this.f196872b) != null) {
                aVar.mo140886b((int) aVMDLDataLoaderNotifyInfo.parameter, aVMDLDataLoaderNotifyInfo.logInfo);
            }
        }
    }

    /* renamed from: a */
    public static long m150937a(int i) {
        AVMDLDataLoader instance = AVMDLDataLoader.getInstance();
        if (i != 7218) {
            switch (i) {
                case 8100:
                    if (instance == null) {
                        return -1;
                    }
                    return instance.getLongValue(8100);
                case 8101:
                    if (instance == null) {
                        return -1;
                    }
                    return instance.getLongValue(8101);
                case 8102:
                    if (instance != null && instance.getLongValue(8102) == 1) {
                        return 1;
                    }
                    return 0;
                default:
                    return -1;
            }
        } else if (instance == null) {
            return -1;
        } else {
            return instance.getLongValue(7218);
        }
    }

    @Override // com.p2082ss.mediakit.medialoader.AVMDLDataLoaderListener
    public final long getInt64Value(int i, long j) {
        AbstractC87124a aVar;
        if (i == 8003) {
            AbstractC86253m mVar = this.f196873c;
            if (mVar != null) {
                return mVar.mo16684a(73, 0L);
            }
            return j;
        } else if (i == 8004 && (aVar = this.f196872b) != null) {
            return aVar.mo140884a(j);
        } else {
            return j;
        }
    }

    /* renamed from: a */
    public static String m150938a(String str, Boolean bool) {
        String str2 = null;
        if (str == null) {
            return null;
        }
        boolean z = false;
        if (!TextUtils.isEmpty(str)) {
            String lowerCase = str.toLowerCase();
            if (!lowerCase.startsWith("http://127.0.0.1") && !lowerCase.startsWith("http://localhost") && !lowerCase.startsWith("file://") && !lowerCase.startsWith("/") && !lowerCase.endsWith(".mpd") && !lowerCase.contains(".mpd?") && !lowerCase.contains(".m3u8?") && !lowerCase.endsWith(".m3u8")) {
                z = true;
            }
        }
        if (!z) {
            return str;
        }
        String localAddr = AVMDLDataLoader.getInstance().getLocalAddr();
        if (TextUtils.isEmpty(localAddr)) {
            return null;
        }
        try {
            str2 = URLEncoder.encode(str, "UTF-8");
        } catch (Throwable unused) {
        }
        String str3 = localAddr + "?rk=v02004b50000bh9ajqhdli3lfv2rgsgg&k=426161df8c5ce110209a6fc6641e049ddfrfgaf&u0=" + str2;
        if (bool.booleanValue()) {
            return "mdl://".concat(String.valueOf(str3));
        }
        return "http://".concat(String.valueOf(str3));
    }

    /* renamed from: a */
    public static void m150939a(int i, String str, int i2) {
        AVMDLDataLoader instance = AVMDLDataLoader.getInstance();
        if (instance != null) {
            if (i == 7213 || i == 7215) {
                instance.setInt64ValueByStrKey(i, str, (long) i2);
            } else {
                instance.setInt64ValueByStrKey(i, str, System.currentTimeMillis());
            }
        }
    }
}
