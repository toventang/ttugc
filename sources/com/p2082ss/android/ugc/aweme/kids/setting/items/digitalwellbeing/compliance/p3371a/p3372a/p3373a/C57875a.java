package com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.compliance.p3371a.p3372a.p3373a;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.compliance.a.a.a.a */
public final class C57875a {
    static {
        Covode.recordClassIndex(67885);
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.compliance.a.a.a.a$a */
    public static class C57876a {

        /* renamed from: a */
        private Class<? extends Fragment> f131949a;

        /* renamed from: b */
        private Bundle f131950b;

        static {
            Covode.recordClassIndex(67886);
        }

        /* renamed from: a */
        public final Fragment mo95175a() {
            try {
                Fragment fragment = (Fragment) this.f131949a.newInstance();
                if (!this.f131950b.isEmpty()) {
                    fragment.setArguments(this.f131950b);
                }
                return fragment;
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }

        private C57876a(Class<? extends Fragment> cls) {
            this.f131949a = cls;
            this.f131950b = new Bundle();
        }

        /* synthetic */ C57876a(Class cls, byte b) {
            this(cls);
        }

        /* renamed from: a */
        public final C57876a mo95176a(String str, int i) {
            this.f131950b.putInt(str, i);
            return this;
        }

        /* renamed from: a */
        public final C57876a mo95177a(String str, boolean z) {
            this.f131950b.putBoolean(str, z);
            return this;
        }
    }

    /* renamed from: a */
    public static C57876a m104628a(Class<? extends Fragment> cls) {
        return new C57876a(cls, (byte) 0);
    }
}
