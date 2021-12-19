package com.p2082ss.android.ugc.aweme.qrcode.presenter;

import android.app.Activity;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.services.IMainService;
import com.p2082ss.android.ugc.aweme.tools.detail.IMovieReuseService;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.qrcode.presenter.QrCodeScanService */
public interface QrCodeScanService {
    static {
        Covode.recordClassIndex(77952);
    }

    /* renamed from: a */
    String mo105337a(String str);

    /* renamed from: a */
    void mo105338a();

    /* renamed from: a */
    void mo105339a(Context context, String str);

    /* renamed from: a */
    void mo105340a(Context context, String str, String str2);

    /* renamed from: a */
    void mo105341a(Context context, ArrayList<String> arrayList);

    /* renamed from: a */
    void mo105342a(String str, Activity activity, IMovieReuseService.AbstractC78107b bVar);

    /* renamed from: a */
    void mo105343a(String str, String str2, Activity activity, boolean z, IMainService.DownLoadFinishListener downLoadFinishListener);

    /* renamed from: a */
    boolean mo105344a(Activity activity, String str, String str2);

    /* renamed from: b */
    void mo105345b(Context context, String str, String str2);

    /* renamed from: c */
    void mo105346c(Context context, String str, String str2);
}
