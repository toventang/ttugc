package com.p2082ss.android.ugc.aweme.crossplatform.platform.webview;

import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.utils.C34717d;
import com.p2082ss.android.ugc.aweme.settings.C68732ag;
import com.p2082ss.android.ugc.aweme.settings.C68733ah;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import p4600h.C89391z;
import p4600h.p4601a.C89064i;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.webview.q */
public final class C40714q {

    /* renamed from: b */
    public static final C40714q f95322b = new C40714q();

    /* renamed from: c */
    static final CopyOnWriteArrayList<String> f95323c = new CopyOnWriteArrayList<>();

    /* renamed from: d */
    static final CopyOnWriteArrayList<String> f95324d = new CopyOnWriteArrayList<>();

    /* renamed from: e */
    public static final C40715a f95325e = new C40715a((byte) 0);

    /* renamed from: a */
    public AbstractC89188r<? super WebView, ? super String, ? super Map<String, String>, ? super AbstractC89183m<? super String, ? super Map<String, String>, C89391z>, C89391z> f95326a;

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.webview.q$a */
    public static final class C40715a {
        static {
            Covode.recordClassIndex(48561);
        }

        private C40715a() {
        }

        public /* synthetic */ C40715a(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(48560);
    }

    private C40714q() {
        try {
            String[] a = C68733ah.m121167a();
            Collection<? extends String> collection = (a == null || (collection = C89064i.m154508i(a)) == null) ? C89086z.INSTANCE : collection;
            String[] a2 = C68732ag.m121166a();
            Collection<? extends String> collection2 = (a2 == null || (collection2 = C89064i.m154508i(a2)) == null) ? C89086z.INSTANCE : collection2;
            if (!C34717d.m70908a(collection2) && !C34717d.m70908a(collection2)) {
                f95323c.addAll(collection2);
            }
            if (!C34717d.m70908a(collection) && !C34717d.m70908a(collection)) {
                f95324d.addAll(collection);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static boolean m82129a(String str) {
        C89219l.m154721d(str, "");
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (C89361p.m154908a((CharSequence) str, (CharSequence) "https", false) || C89361p.m154908a((CharSequence) str, (CharSequence) "http", false)) {
            return true;
        }
        return false;
    }
}
