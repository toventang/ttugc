package com.bytedance.ies.ugc.aweme.network.zstd;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.aweme.network.zstd.C18110b;
import com.google.gson.C27910f;
import com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.p2082ss.android.socialbase.downloader.downloader.Downloader;
import com.p2082ss.android.socialbase.downloader.exception.BaseException;
import com.p2082ss.android.socialbase.downloader.model.DownloadInfo;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.base.C34611o;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58265x;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import java.io.File;
import java.util.List;
import java.util.Map;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

public final class ZstdDictUpdateTask implements AbstractC58264w {

    /* renamed from: a */
    public static final C18104a f43096a = new C18104a((byte) 0);

    /* renamed from: b */
    private final AbstractC89244h f43097b = C89250i.m154773a((AbstractC89171a) C18107d.f43101a);

    static {
        Covode.recordClassIndex(20743);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    public final int bQ_() {
        return 1048575;
    }

    /* renamed from: c */
    public final C18110b.C18112b mo28860c() {
        return (C18110b.C18112b) this.f43097b.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: f */
    public final EnumC58150ad mo28606f() {
        return AbstractC58265x.m105221a(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: g */
    public final String mo28607g() {
        return "task_";
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: i */
    public final boolean mo28609i() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: j */
    public final List mo28610j() {
        return null;
    }

    /* renamed from: com.bytedance.ies.ugc.aweme.network.zstd.ZstdDictUpdateTask$a */
    public static final class C18104a {
        static {
            Covode.recordClassIndex(20744);
        }

        private C18104a() {
        }

        public /* synthetic */ C18104a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58264w
    /* renamed from: b */
    public final EnumC58151ae mo28601b() {
        return EnumC58151ae.BACKGROUND;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: k */
    public final EnumC58148ab mo28611k() {
        return EnumC58148ab.DEFAULT;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: h */
    public final String mo28608h() {
        return getClass().getSimpleName();
    }

    /* renamed from: com.bytedance.ies.ugc.aweme.network.zstd.ZstdDictUpdateTask$c */
    static final class C18106c extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        public static final C18106c f43100a = new C18106c();

        static {
            Covode.recordClassIndex(20746);
        }

        C18106c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            Context a = C17867d.m33078a();
            if (C58016d.f132221b == null || !C58016d.f132224e) {
                C58016d.f132221b = a.getCacheDir();
            }
            return new File(C58016d.f132221b, "zstd").getAbsolutePath();
        }
    }

    /* renamed from: com.bytedance.ies.ugc.aweme.network.zstd.ZstdDictUpdateTask$d */
    static final class C18107d extends AbstractC89220m implements AbstractC89171a<C18110b.C18112b> {

        /* renamed from: a */
        public static final C18107d f43101a = new C18107d();

        static {
            Covode.recordClassIndex(20747);
        }

        C18107d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C18110b.C18112b invoke() {
            C18110b.C18113c cVar = (C18110b.C18113c) SettingsManager.m29616a().mo25397a("tiktok_zstd_dict_cfg", C18110b.C18113c.class, C18110b.f43103a);
            if (cVar != null) {
                return cVar.f43109a;
            }
            return null;
        }
    }

    /* renamed from: com.bytedance.ies.ugc.aweme.network.zstd.ZstdDictUpdateTask$b */
    public static final class C18105b extends AbsDownloadListener {

        /* renamed from: a */
        final /* synthetic */ ZstdDictUpdateTask f43098a;

        /* renamed from: b */
        final /* synthetic */ String f43099b;

        static {
            Covode.recordClassIndex(20745);
        }

        @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener, com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onStart(DownloadInfo downloadInfo) {
            if (downloadInfo != null) {
                downloadInfo.getUrl();
            }
        }

        @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener, com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onSuccessed(DownloadInfo downloadInfo) {
            if (downloadInfo != null) {
                downloadInfo.getUrl();
                C18114c cVar = C18114c.f43110a;
                String str = this.f43099b;
                String targetFilePath = downloadInfo.getTargetFilePath();
                C89219l.m154716b(targetFilePath, "");
                cVar.mo28870a(str, targetFilePath);
            }
        }

        C18105b(ZstdDictUpdateTask zstdDictUpdateTask, String str) {
            this.f43098a = zstdDictUpdateTask;
            this.f43099b = str;
        }

        @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener, com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
            Integer num;
            if (downloadInfo != null) {
                downloadInfo.getUrl();
            }
            String.valueOf(baseException);
            C33743c a = new C33743c().mo59976a("dict_id", this.f43099b).mo59976a("params", new C27910f().mo46674b(this.f43098a.mo28860c()));
            String str = null;
            if (baseException != null) {
                num = Integer.valueOf(baseException.getErrorCode());
            } else {
                num = null;
            }
            C33743c a2 = a.mo59974a("err_code", num);
            if (baseException != null) {
                str = baseException.getErrorMessage();
            }
            C34611o.m70668a("zstd_dict_download_error", a2.mo59976a("err_msg", str).mo59977a());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: a */
    public final void mo28600a(Context context) {
        Map<String, C18110b.C18111a> map;
        C18110b.C18112b c = mo28860c();
        Map<String, String> map2 = null;
        if (c != null) {
            map2 = c.f43107a;
        }
        C18114c.f43110a.mo28871a(map2);
        C18110b.C18112b c2 = mo28860c();
        if (!(c2 == null || (map = c2.f43108b) == null)) {
            for (Map.Entry<String, C18110b.C18111a> entry : map.entrySet()) {
                String key = entry.getKey();
                C18110b.C18111a value = entry.getValue();
                if (value != null) {
                    Downloader.with(C17867d.m33078a()).url(value.f43105a).md5(value.f43106b).savePath((String) C89250i.m154773a((AbstractC89171a) C18106c.f43100a).getValue()).name(key + ".dict").monitorScene("zstd_dict_download").subThreadListener(new C18105b(this, key)).download();
                }
            }
        }
    }
}
