package com.p2082ss.android.ugc.aweme.favorites.p2927i;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.p2082ss.android.ugc.aweme.CrossPlatformLegacyServiceImpl;
import com.p2082ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeStatistics;
import java.lang.ref.WeakReference;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.favorites.i.d */
public final class C47449d implements AbstractC47448c {

    /* renamed from: a */
    public static WeakReference<CrossPlatformWebView> f110205a;

    /* renamed from: b */
    public static final C47449d f110206b = new C47449d();

    /* renamed from: c */
    private static String f110207c = "";

    /* renamed from: d */
    private static final String f110208d = "loadMoreItem";

    /* renamed from: e */
    private static final String f110209e = "itemStateChange";

    private C47449d() {
    }

    @Override // com.p2082ss.android.ugc.aweme.favorites.p2927i.AbstractC47448c
    /* renamed from: a */
    public final boolean mo79719a() {
        if (f110205a != null) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(56062);
    }

    @Override // com.p2082ss.android.ugc.aweme.favorites.p2927i.AbstractC47448c
    /* renamed from: a */
    public final void mo79718a(Aweme aweme, String str) {
        String str2;
        CrossPlatformWebView crossPlatformWebView;
        CrossPlatformWebView crossPlatformWebView2;
        CrossPlatformWebView crossPlatformWebView3;
        C89219l.m154721d(aweme, "");
        WeakReference<CrossPlatformWebView> weakReference = f110205a;
        String str3 = null;
        if (!(weakReference == null || weakReference.get() == null)) {
            try {
                JSONObject jSONObject = new JSONObject();
                WeakReference<CrossPlatformWebView> weakReference2 = f110205a;
                if (weakReference2 == null || (crossPlatformWebView3 = weakReference2.get()) == null) {
                    str2 = null;
                } else {
                    str2 = crossPlatformWebView3.getReactId();
                }
                jSONObject.put("reactId", str2);
                jSONObject.put("awemeId", aweme.getAid());
                AwemeStatistics statistics = aweme.getStatistics();
                C89219l.m154716b(statistics, "");
                jSONObject.put("star", statistics.getDiggCount());
                AwemeStatistics statistics2 = aweme.getStatistics();
                C89219l.m154716b(statistics2, "");
                jSONObject.put(UGCMonitor.EVENT_COMMENT, statistics2.getCommentCount());
                AwemeStatistics statistics3 = aweme.getStatistics();
                C89219l.m154716b(statistics3, "");
                jSONObject.put("share", statistics3.getShareCount());
                jSONObject.put("from", str);
                WeakReference<CrossPlatformWebView> weakReference3 = f110205a;
                if (!(weakReference3 == null || (crossPlatformWebView = weakReference3.get()) == null)) {
                    String str4 = f110209e;
                    WeakReference<CrossPlatformWebView> weakReference4 = f110205a;
                    if (!(weakReference4 == null || (crossPlatformWebView2 = weakReference4.get()) == null)) {
                        str3 = crossPlatformWebView2.getReactId();
                    }
                    crossPlatformWebView.mo69919a(str4, jSONObject, str3);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (TextUtils.equals(str, "exit")) {
            CrossPlatformLegacyServiceImpl.m65225f();
        }
    }
}
