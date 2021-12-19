package com.p2082ss.android.ugc.aweme.download.component_api.p2811c;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.socialbase.downloader.downloader.Downloader;
import com.p2082ss.android.ugc.aweme.download.component_api.AbstractC43167a;

/* renamed from: com.ss.android.ugc.aweme.download.component_api.c.c */
public final class C43179c {
    static {
        Covode.recordClassIndex(51359);
    }

    /* renamed from: a */
    public static void m86112a(Context context, AbstractC43167a aVar) {
        if (context != null && aVar != null) {
            int i = aVar.f100625b;
            if (aVar.f100600C != null) {
                Downloader.getInstance(context).removeMainThreadListener(i, aVar.f100600C);
            }
            if (aVar.f100601D != null) {
                Downloader.getInstance(context).removeSubThreadListener(i, aVar.f100601D);
            }
            if (aVar.f100602E != null) {
                Downloader.getInstance(context).removeNotificationListener(i, aVar.f100602E);
            }
        }
    }
}
