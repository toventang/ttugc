package com.p2082ss.android.ugc.aweme.i18n.language.p3063a;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.commercialize.splash.p1262f.C17975i;
import com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a;
import com.p2082ss.android.ugc.aweme.language.C58071d;
import com.p2082ss.android.ugc.aweme.main.AbstractC59102i;
import com.p2082ss.android.ugc.aweme.main.AbstractC59103j;
import com.p2082ss.android.ugc.aweme.main.AbstractC59105l;
import java.lang.ref.SoftReference;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.i18n.language.a.g */
public final class C53446g {

    /* renamed from: a */
    public boolean f122663a;

    /* renamed from: b */
    public boolean f122664b;

    /* renamed from: c */
    public boolean f122665c;

    /* renamed from: d */
    DialogC53439a f122666d;

    /* renamed from: e */
    private Context f122667e;

    /* renamed from: f */
    private String f122668f;

    /* renamed from: g */
    private SoftReference<Context> f122669g;

    static {
        Covode.recordClassIndex(63015);
    }

    /* renamed from: com.ss.android.ugc.aweme.i18n.language.a.g$a */
    public static class C53447a {

        /* renamed from: a */
        public static final C53446g f122670a = new C53446g((byte) 0);

        static {
            Covode.recordClassIndex(63016);
        }
    }

    /* renamed from: a */
    private boolean m98629a() {
        String[] strArr = {"MY"};
        int i = 0;
        do {
            String str = strArr[0];
            if (TextUtils.equals(str, C58071d.m104913g())) {
                this.f122668f = str;
                return false;
            }
            i++;
        } while (i <= 0);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003a, code lost:
        if (r0 != 1) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004b, code lost:
        if (r1 == 1) goto L_0x0031;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C53446g() {
        /*
            r4 = this;
            r4.<init>()
            android.content.Context r0 = com.bytedance.ies.ugc.appcontext.C17867d.m33078a()
            r4.f122667e = r0
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            java.util.Locale r0 = r0.locale
            java.lang.String r1 = r0.getLanguage()
            java.lang.String r0 = "en"
            boolean r3 = android.text.TextUtils.equals(r0, r1)
            r2 = 1
            r3 = r3 ^ r2
            r3 = r3 ^ r2
            r0 = 0
            if (r3 == 0) goto L_0x002a
            boolean r0 = r4.m98629a()
            if (r0 == 0) goto L_0x004e
            r3 = 0
        L_0x002a:
            r1 = 2
            if (r3 != 0) goto L_0x0034
            com.p2082ss.android.ugc.aweme.i18n.language.p3063a.C53449i.m98635a(r1)
        L_0x0030:
            r2 = 0
        L_0x0031:
            r4.f122663a = r2
            return
        L_0x0034:
            int r0 = com.p2082ss.android.ugc.aweme.i18n.language.p3063a.C53449i.m98634a()
            if (r0 == 0) goto L_0x003d
            if (r0 == r2) goto L_0x0031
            goto L_0x0030
        L_0x003d:
            java.lang.Boolean r0 = com.p2082ss.android.ugc.aweme.feed.C49907s.m93685a()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0048
            r1 = 1
        L_0x0048:
            com.p2082ss.android.ugc.aweme.i18n.language.p3063a.C53449i.m98635a(r1)
            if (r1 != r2) goto L_0x0030
            goto L_0x0031
        L_0x004e:
            com.ss.android.ugc.aweme.journey.p r0 = com.p2082ss.android.ugc.aweme.journey.AbstractC56869p.C56870a.m103133a()
            int r0 = r0.mo63252c()
            if (r0 != r2) goto L_0x002a
            r3 = 0
            goto L_0x002a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.i18n.language.p3063a.C53446g.<init>():void");
    }

    /* synthetic */ C53446g(byte b) {
        this();
    }

    /* renamed from: a */
    private static String[] m98630a(String str) {
        if (TextUtils.equals(str, "MY")) {
            return new String[]{"ms-MY", "zh-Hant-TW", "en"};
        }
        return null;
    }

    /* renamed from: c */
    private static boolean m98631c(Context context) {
        if (!(context instanceof Activity)) {
            return false;
        }
        Activity activity = (Activity) context;
        if (!(activity instanceof AbstractC59103j)) {
            return false;
        }
        Fragment curFragment = ((AbstractC59103j) activity).getCurFragment();
        if (!(curFragment instanceof AbstractC59105l)) {
            return false;
        }
        AbstractC34586a l = ((AbstractC59105l) curFragment).mo96547l();
        if (!(l instanceof AbstractC59102i) || !((AbstractC59102i) l).mo85175u().equals("FeedRecommendFragment")) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final void mo90013b(Context context) {
        SoftReference<Context> softReference;
        if (this.f122665c) {
            if (!(context == null && ((softReference = this.f122669g) == null || (context = softReference.get()) == null)) && !C17975i.f42809i) {
                String[] a = m98630a(this.f122668f);
                if (this.f122663a && m98631c(context) && this.f122664b && a != null) {
                    C1731i.m5640b(new CallableC53448h(this, context, a), C1731i.f5564c);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo90012a(Context context) {
        this.f122664b = true;
        SoftReference<Context> softReference = this.f122669g;
        if (softReference == null || softReference.get() == null) {
            this.f122669g = new SoftReference<>(context);
        }
        mo90013b(context);
    }
}
