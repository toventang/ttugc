package com.bytedance.android.livesdk.utils;

import android.content.Context;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.util.C11120d;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.utils.j */
final class C11268j {

    /* renamed from: a */
    public Context f26954a;

    /* renamed from: b */
    ArrayList<AbstractC11269a> f26955b;

    static {
        Covode.recordClassIndex(12900);
    }

    C11268j() {
    }

    /* renamed from: com.bytedance.android.livesdk.utils.j$c */
    class C11271c extends AbstractC11269a {
        static {
            Covode.recordClassIndex(12903);
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.android.livesdk.utils.C11268j.AbstractC11269a
        /* renamed from: a */
        public final String mo18032a() {
            return C11120d.m19751a(((IHostContext) C6193a.m13435a(IHostContext.class)).currentLocale());
        }

        C11271c(String str) {
            super(C11268j.this, (byte) 0);
            this.f26956a = str;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.utils.j$d */
    class C11272d extends AbstractC11269a {
        static {
            Covode.recordClassIndex(12904);
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.android.livesdk.utils.C11268j.AbstractC11269a
        /* renamed from: a */
        public final String mo18032a() {
            return C11120d.m19751a(((IHostContext) C6193a.m13435a(IHostContext.class)).currentLocale());
        }

        C11272d(String str) {
            super(C11268j.this, (byte) 0);
            this.f26956a = str;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.utils.j$b */
    class C11270b extends AbstractC11269a {

        /* renamed from: d */
        private String f26959d;

        static {
            Covode.recordClassIndex(12902);
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.android.livesdk.utils.C11268j.AbstractC11269a
        /* renamed from: a */
        public final String mo18032a() {
            try {
                if (this.f26959d == null) {
                    this.f26959d = String.valueOf(C11268j.this.f26954a.getPackageManager().getPackageInfo(C11268j.this.f26954a.getPackageName(), 0).versionName);
                }
                return this.f26959d;
            } catch (Exception unused) {
                return "";
            }
        }

        C11270b(String str) {
            super(C11268j.this, (byte) 0);
            this.f26956a = str;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.utils.j$a */
    abstract class AbstractC11269a {

        /* renamed from: a */
        String f26956a;

        static {
            Covode.recordClassIndex(12901);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract String mo18032a();

        private AbstractC11269a() {
            this.f26956a = "";
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo18033a(Map<String, String> map) {
            map.put(this.f26956a, mo18032a());
        }

        /* synthetic */ AbstractC11269a(C11268j jVar, byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.utils.j$e */
    class C11273e extends AbstractC11269a {
        static {
            Covode.recordClassIndex(12905);
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.android.livesdk.utils.C11268j.AbstractC11269a
        /* renamed from: a */
        public final String mo18032a() {
            return "2150";
        }

        C11273e(String str) {
            super(C11268j.this, (byte) 0);
            this.f26956a = str;
        }
    }
}
