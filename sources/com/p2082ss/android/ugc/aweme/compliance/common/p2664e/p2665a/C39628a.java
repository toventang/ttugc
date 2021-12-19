package com.p2082ss.android.ugc.aweme.compliance.common.p2664e.p2665a;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.compliance.common.e.a.a */
public final class C39628a {
    static {
        Covode.recordClassIndex(47342);
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.common.e.a.a$a */
    public static class C39629a {

        /* renamed from: a */
        private Class<? extends Fragment> f93410a;

        /* renamed from: b */
        private Bundle f93411b;

        static {
            Covode.recordClassIndex(47343);
        }

        /* renamed from: a */
        public final Fragment mo69040a() {
            try {
                Fragment fragment = (Fragment) this.f93410a.newInstance();
                if (!this.f93411b.isEmpty()) {
                    fragment.setArguments(this.f93411b);
                }
                return fragment;
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }

        private C39629a(Class<? extends Fragment> cls) {
            this.f93410a = cls;
            this.f93411b = new Bundle();
        }

        /* synthetic */ C39629a(Class cls, byte b) {
            this(cls);
        }

        /* renamed from: a */
        public final C39629a mo69041a(String str, int i) {
            this.f93411b.putInt(str, i);
            return this;
        }

        /* renamed from: a */
        public final C39629a mo69042a(String str, boolean z) {
            this.f93411b.putBoolean(str, z);
            return this;
        }
    }

    /* renamed from: a */
    public static C39629a m80469a(Class<? extends Fragment> cls) {
        return new C39629a(cls, (byte) 0);
    }
}
