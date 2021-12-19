package com.p2082ss.android.ugc.aweme.share.gif;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.share.gif.p3751ui.VideoShare2GifEditActivity;

/* renamed from: com.ss.android.ugc.aweme.share.gif.d */
final /* synthetic */ class RunnableC68938d implements Runnable {

    /* renamed from: a */
    private final C68935b f154229a;

    /* renamed from: b */
    private final Activity f154230b;

    /* renamed from: c */
    private final Aweme f154231c;

    /* renamed from: d */
    private final String f154232d;

    /* renamed from: e */
    private final String f154233e;

    /* renamed from: f */
    private final String f154234f;

    static {
        Covode.recordClassIndex(81248);
    }

    RunnableC68938d(C68935b bVar, Activity activity, Aweme aweme, String str, String str2, String str3) {
        this.f154229a = bVar;
        this.f154230b = activity;
        this.f154231c = aweme;
        this.f154232d = str;
        this.f154233e = str2;
        this.f154234f = str3;
    }

    public final void run() {
        C68935b bVar = this.f154229a;
        Activity activity = this.f154230b;
        Aweme aweme = this.f154231c;
        String str = this.f154232d;
        String str2 = this.f154233e;
        String str3 = this.f154234f;
        if (!activity.isFinishing()) {
            if (bVar.f154220b != null) {
                bVar.f154220b.dismiss();
            }
            VideoShare2GifEditActivity.m121638a(activity, aweme.getAid(), aweme.getAuthorUid(), C68935b.m121634a(aweme), str, str2, str3);
            if (bVar.f154219a != null) {
                bVar.f154219a.f155234h.setValue(false);
            }
        }
    }
}
