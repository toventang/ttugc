package com.p2082ss.android.ugc.aweme.specialplus;

import android.app.Application;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.p2082ss.android.socialbase.downloader.exception.BaseException;
import com.p2082ss.android.socialbase.downloader.model.DownloadInfo;
import com.p2082ss.android.ugc.aweme.p2730de.C40982q;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.shortvideo.C69840ar;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73991bj;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import java.io.File;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.aweme.specialplus.d */
public final class C75207d {

    /* renamed from: a */
    static String f169110a;

    /* renamed from: b */
    static final String f169111b = (f169110a + File.separator + "special_plus_icon.png");

    /* renamed from: c */
    static C75205c f169112c = new C75205c();

    /* renamed from: d */
    public static final C75207d f169113d = new C75207d();

    /* renamed from: com.ss.android.ugc.aweme.specialplus.d$a */
    public static final class C75208a extends AbsDownloadListener {
        static {
            Covode.recordClassIndex(88091);
        }

        C75208a() {
        }

        @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener, com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onSuccessed(DownloadInfo downloadInfo) {
            String str;
            long j;
            super.onSuccessed(downloadInfo);
            C73991bj.m130128a("SpecialPlus, downloadSpecialPlusIconUrl onSuccess");
            C69840ar arVar = new C69840ar();
            if (downloadInfo == null || (str = downloadInfo.getUrl()) == null) {
                str = "";
            }
            C69840ar a = arVar.mo110189a("url", str);
            if (downloadInfo != null) {
                j = downloadInfo.getDownloadTime();
            } else {
                j = -1;
            }
            C40982q.m82520a("special_plus_download", 0, a.mo110188a("duration", Long.valueOf(j)).mo110189a(StringSet.type, "icon").mo110191a());
        }

        @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener, com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
            String str;
            long j;
            super.onFailed(downloadInfo, baseException);
            C73991bj.m130128a("SpecialPlus, downloadSpecialPlusIconUrl onFail");
            C69840ar arVar = new C69840ar();
            if (downloadInfo == null || (str = downloadInfo.getUrl()) == null) {
                str = "";
            }
            C69840ar a = arVar.mo110189a("url", str);
            if (downloadInfo != null) {
                j = downloadInfo.getDownloadTime();
            } else {
                j = -1;
            }
            C40982q.m82520a("special_plus_download", 1, a.mo110188a("duration", Long.valueOf(j)).mo110189a(StringSet.type, "icon").mo110191a());
        }
    }

    private C75207d() {
    }

    static {
        Covode.recordClassIndex(88090);
        StringBuilder sb = new StringBuilder();
        Application application = C63238c.f143574a;
        C89219l.m154716b(application, "");
        f169110a = sb.append(application.getFilesDir().toString()).append(File.separator).append("superentrance").toString();
    }

    /* renamed from: com.ss.android.ugc.aweme.specialplus.d$b */
    public static final class C75209b implements IFetchEffectListener {

        /* renamed from: a */
        final /* synthetic */ int f169114a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89237d f169115b;

        static {
            Covode.recordClassIndex(88092);
        }

        @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
        public final void onStart(Effect effect) {
            C89219l.m154721d(effect, "");
            this.f169115b.element = System.currentTimeMillis();
            C73991bj.m130128a("SpecialPlus, downloadSticker onStart");
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
        public final /* synthetic */ void onSuccess(Effect effect) {
            Effect effect2 = effect;
            String str = "";
            C89219l.m154721d(effect2, str);
            C75205c cVar = C75207d.f169112c;
            cVar.f169109a.storeInt("special_plus_effect_version", this.f169114a);
            C75207d.f169112c.f169109a.storeString("special_plus_effect", C63238c.f143575b.mo46674b(effect2));
            C73991bj.m130128a("SpecialPlus, downloadSticker onSuccess");
            C69840ar arVar = new C69840ar();
            String effectId = effect2.getEffectId();
            if (effectId != null) {
                str = effectId;
            }
            C40982q.m82520a("special_plus_download", 0, arVar.mo110189a("sticker_id", str).mo110188a("duration", Long.valueOf(System.currentTimeMillis() - this.f169115b.element)).mo110189a(StringSet.type, "prop").mo110191a());
        }

        C75209b(int i, C89233z.C89237d dVar) {
            this.f169114a = i;
            this.f169115b = dVar;
        }

        @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
        public final void onFail(Effect effect, ExceptionResult exceptionResult) {
            String str;
            C89219l.m154721d(exceptionResult, "");
            C73991bj.m130128a("SpecialPlus, downloadSticker onFail");
            C69840ar arVar = new C69840ar();
            if (effect != null) {
                str = effect.getEffectId();
            } else {
                str = null;
            }
            C40982q.m82520a("special_plus_download", 1, arVar.mo110189a("sticker_id", str).mo110188a("duration", Long.valueOf(System.currentTimeMillis() - this.f169115b.element)).mo110189a(StringSet.type, "prop").mo110191a());
        }
    }

    /* renamed from: a */
    static boolean m131955a(SpecialPlusConfig specialPlusConfig) {
        SpecialPlusTimePeriod[] validTime = specialPlusConfig.getValidTime();
        if (validTime.length == 0) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        for (SpecialPlusTimePeriod specialPlusTimePeriod : validTime) {
            long j = -1;
            try {
                j = Long.parseLong(specialPlusTimePeriod.getEnd());
            } catch (NumberFormatException unused) {
            }
            if (currentTimeMillis <= j) {
                return true;
            }
        }
        return false;
    }
}
