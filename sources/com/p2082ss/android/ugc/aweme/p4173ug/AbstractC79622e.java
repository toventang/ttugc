package com.p2082ss.android.ugc.aweme.p4173ug;

import android.app.Application;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.deeplink.C41058p;

/* renamed from: com.ss.android.ugc.aweme.ug.e */
public interface AbstractC79622e {
    static {
        Covode.recordClassIndex(92834);
    }

    /* renamed from: a */
    void mo123164a();

    /* renamed from: a */
    void mo123165a(Application application, String str);

    /* renamed from: a */
    void mo123166a(Uri uri, boolean z, long j, boolean z2);

    /* renamed from: a */
    void mo123167a(Uri uri, boolean z, C41058p pVar, boolean z2, long j, boolean z3);

    /* renamed from: a */
    void mo123168a(EnumC79623a aVar, String str);

    /* renamed from: a */
    void mo123169a(boolean z);

    /* renamed from: b */
    void mo123170b();

    /* renamed from: com.ss.android.ugc.aweme.ug.e$a */
    public enum EnumC79623a {
        MAIN("enter_launch"),
        DEEP_LINK("deep_link"),
        SHORTCUT("client_shortcut"),
        WIDGET("client_widget"),
        OPEN_SHARE("open_share"),
        NONE("none");
        

        /* renamed from: b */
        private final String f178658b;

        public final String getValue() {
            return this.f178658b;
        }

        static {
            Covode.recordClassIndex(92835);
        }

        private EnumC79623a(String str) {
            this.f178658b = str;
        }
    }
}
