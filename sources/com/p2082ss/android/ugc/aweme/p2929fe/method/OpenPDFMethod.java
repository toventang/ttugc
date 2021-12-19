package com.p2082ss.android.ugc.aweme.p2929fe.method;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.CookieManager;
import androidx.core.content.FileProvider;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.common.utility.C13607d;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.p1285a.C18288a;
import com.bytedance.ttnet.p1700a.C22898a;
import com.p2082ss.android.common.util.NetworkUtils;
import com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.p2082ss.android.socialbase.downloader.downloader.Downloader;
import com.p2082ss.android.socialbase.downloader.exception.BaseException;
import com.p2082ss.android.socialbase.downloader.model.DownloadInfo;
import com.p2082ss.android.socialbase.downloader.model.HttpHeader;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.lancet.p3385b.C58007a;
import com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.views.DialogC81438i;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import com.p2082ss.android.ugc.trill.R;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.fe.method.OpenPDFMethod */
public final class OpenPDFMethod extends BaseCommonJavaMethod implements AbstractC33974au {

    /* renamed from: a */
    public static final C47868a f110877a = new C47868a((byte) 0);

    static {
        Covode.recordClassIndex(56535);
    }

    private OpenPDFMethod(byte b) {
        this();
    }

    @Override // androidx.lifecycle.AbstractC1202k, com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.OpenPDFMethod$a */
    public static final class C47868a {
        static {
            Covode.recordClassIndex(56536);
        }

        private C47868a() {
        }

        public /* synthetic */ C47868a(byte b) {
            this();
        }
    }

    private /* synthetic */ OpenPDFMethod() {
        this((C18288a) null);
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.OpenPDFMethod$b */
    public static final class C47869b extends AbsDownloadListener {

        /* renamed from: a */
        final /* synthetic */ DialogC81438i f110878a;

        /* renamed from: b */
        final /* synthetic */ String f110879b;

        /* renamed from: c */
        final /* synthetic */ String f110880c;

        /* renamed from: d */
        final /* synthetic */ Context f110881d;

        static {
            Covode.recordClassIndex(56537);
        }

        @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener, com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onStart(DownloadInfo downloadInfo) {
            C89219l.m154721d(downloadInfo, "");
            super.onStart(downloadInfo);
            this.f110878a.show();
        }

        @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener, com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onCanceled(DownloadInfo downloadInfo) {
            C89219l.m154721d(downloadInfo, "");
            super.onCanceled(downloadInfo);
            this.f110878a.dismiss();
            new C79459a(this.f110881d).mo123050a(R.string.fz3).mo123053a();
        }

        @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener, com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onSuccessed(DownloadInfo downloadInfo) {
            C89219l.m154721d(downloadInfo, "");
            super.onSuccessed(downloadInfo);
            this.f110878a.dismiss();
            Uri uriForFile = FileProvider.getUriForFile(this.f110881d, this.f110881d.getPackageName() + ".fileprovider", new File(this.f110879b + File.separator + this.f110880c));
            String type = this.f110881d.getContentResolver().getType(uriForFile);
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.setDataAndType(uriForFile, type);
            intent.addFlags(1);
            Context context = this.f110881d;
            Intent createChooser = Intent.createChooser(intent, "");
            C84349a.m145093a(createChooser, context);
            context.startActivity(createChooser);
        }

        @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener, com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
            C89219l.m154721d(downloadInfo, "");
            C89219l.m154721d(baseException, "");
            super.onFailed(downloadInfo, baseException);
            this.f110878a.dismiss();
            new C79459a(this.f110881d).mo123050a(R.string.fz3).mo123053a();
        }

        C47869b(DialogC81438i iVar, String str, String str2, Context context) {
            this.f110878a = iVar;
            this.f110879b = str;
            this.f110880c = str2;
            this.f110881d = context;
        }
    }

    public OpenPDFMethod(C18288a aVar) {
        super(aVar);
    }

    /* renamed from: a */
    private static Context m90867a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            return C58003a.f132199a;
        }
        return applicationContext;
    }

    /* renamed from: a */
    private static boolean m90868a(String str, Context context) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Uri parse = Uri.parse(str);
        List<String> list = null;
        if (!(parse == null || parse.getHost() == null)) {
            String host = parse.getHost();
            if (host == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(host, "");
            String c = C58007a.m104835c(host);
            if (c != null) {
                try {
                    list = C22898a.m43150a(m90867a(context)).mo23739d(NetworkUtils.getShareCookieHost());
                    if (list == null) {
                        C89219l.m154715b();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if (list.contains(c)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.AbstractC47813a aVar) {
        String str;
        if (jSONObject != null) {
            str = jSONObject.optString("url");
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        Context context = (Context) this.mContextRef.get();
        if (context == null || m90867a(context) == null) {
            new C79459a(context).mo123050a(R.string.fz3).mo123053a();
            return;
        }
        StringBuilder sb = new StringBuilder();
        String b = C13607d.m24442b(str);
        C89219l.m154716b(b, "");
        Objects.requireNonNull(b, "null cannot be cast to non-null type java.lang.String");
        String substring = b.substring(8, 24);
        C89219l.m154716b(substring, "");
        String sb2 = sb.append(substring).append(".pdf").toString();
        StringBuilder sb3 = new StringBuilder();
        if (C58016d.f132222c == null || !C58016d.f132224e) {
            C58016d.f132222c = context.getFilesDir();
        }
        File file = C58016d.f132222c;
        C89219l.m154716b(file, "");
        String sb4 = sb3.append(file.getAbsolutePath()).append("jsbdownload").toString();
        DialogC81438i iVar = new DialogC81438i(context);
        ArrayList arrayList = new ArrayList();
        if (m90868a(str, context)) {
            arrayList.add(new HttpHeader("Cookie", CookieManager.getInstance().getCookie(str)));
        }
        Downloader.with(m90867a(context)).extraHeaders(arrayList).url(str).name(sb2).savePath(sb4).retryCount(0).mainThreadListener(new C47869b(iVar, sb4, sb2, context)).download();
    }
}
