package com.p2082ss.android.ugc.aweme.notice.api.p3514e;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.AbstractC16082i;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.notice.api.helper.WSHelper;
import com.p2082ss.android.ugc.aweme.notice.api.p3511c.p3512a.C61564a;
import com.p2082ss.android.ugc.aweme.utils.WSHelperImpl;

/* renamed from: com.ss.android.ugc.aweme.notice.api.e.b */
public final class C61579b {

    /* renamed from: a */
    public static final C61579b f139753a = new C61579b();

    /* renamed from: b */
    private static final AbstractC16082i f139754b;

    private C61579b() {
    }

    /* renamed from: a */
    static String m111526a() {
        String[] a = C61564a.m111474a();
        if (a.length == 0) {
            return "";
        }
        return a[0];
    }

    /* renamed from: com.ss.android.ugc.aweme.notice.api.e.b$a */
    static final class C61580a implements AbstractC16082i {

        /* renamed from: a */
        public static final C61580a f139755a = new C61580a();

        static {
            Covode.recordClassIndex(72258);
        }

        C61580a() {
        }

        @Override // com.bytedance.ies.abmock.AbstractC16082i
        /* renamed from: a */
        public final void mo25536a() {
            WSHelper e;
            String a = C61579b.m111526a();
            if (!TextUtils.isEmpty(a) && (e = WSHelperImpl.m138982e()) != null) {
                e.mo99367a(a);
            }
        }
    }

    static {
        Covode.recordClassIndex(72257);
        C61580a aVar = C61580a.f139755a;
        f139754b = aVar;
        SettingsManager.m29616a().mo25399a(aVar);
    }
}
