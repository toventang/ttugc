package com.p2082ss.android.ugc.aweme.p3452ml.p3454ab;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.p2082ss.android.ugc.aweme.setting.model.MLModel;

/* renamed from: com.ss.android.ugc.aweme.ml.ab.g */
public interface AbstractC59992g {
    static {
        Covode.recordClassIndex(70430);
    }

    /* renamed from: com.ss.android.ugc.aweme.ml.ab.g$a */
    public static class C59993a {

        /* renamed from: a */
        public static boolean f136648a;

        /* renamed from: b */
        public static MLModel f136649b;

        static {
            Covode.recordClassIndex(70431);
        }

        /* renamed from: a */
        public static MLModel m109510a() {
            if (!f136648a) {
                try {
                    f136649b = (MLModel) C16048b.m29633a().mo25415a(false, "speed_ml", MLModel.class);
                } catch (Throwable unused) {
                    f136649b = null;
                }
                f136648a = true;
            }
            return f136649b;
        }
    }
}
