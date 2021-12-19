package com.bytedance.common.utility.p910e;

import android.content.SharedPreferences;
import android.os.Build;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.common.utility.e.a */
public final class C13611a {

    /* renamed from: a */
    static final AbstractC13613b f33089a = new C13614c();

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.common.utility.e.a$b */
    public interface AbstractC13613b {
        static {
            Covode.recordClassIndex(15640);
        }

        /* renamed from: a */
        void mo21872a(SharedPreferences.Editor editor);
    }

    /* renamed from: com.bytedance.common.utility.e.a$a */
    static class C13612a implements AbstractC13613b {
        static {
            Covode.recordClassIndex(15639);
        }

        C13612a() {
        }

        @Override // com.bytedance.common.utility.p910e.C13611a.AbstractC13613b
        /* renamed from: a */
        public final void mo21872a(SharedPreferences.Editor editor) {
            editor.commit();
        }
    }

    /* renamed from: com.bytedance.common.utility.e.a$c */
    static class C13614c implements AbstractC13613b {
        static {
            Covode.recordClassIndex(15641);
        }

        C13614c() {
        }

        @Override // com.bytedance.common.utility.p910e.C13611a.AbstractC13613b
        /* renamed from: a */
        public final void mo21872a(SharedPreferences.Editor editor) {
            editor.apply();
        }
    }

    static {
        Covode.recordClassIndex(15638);
        int i = Build.VERSION.SDK_INT;
    }

    /* renamed from: a */
    public static void m24460a(SharedPreferences.Editor editor) {
        if (editor != null) {
            f33089a.mo21872a(editor);
        }
    }
}
