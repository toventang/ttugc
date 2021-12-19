package com.p2082ss.android.ugc.aweme.p2406bu.p2408b;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.experiment.C46796cm;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.shortvideo.C71872i;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.bu.b.a */
public final class C34944a {

    /* renamed from: a */
    public static final AbstractC89244h f82428a = C89250i.m154773a((AbstractC89171a) C34947c.f82432a);

    /* renamed from: b */
    public static final AbstractC89244h f82429b = C89250i.m154773a((AbstractC89171a) C34946b.f82431a);

    /* renamed from: c */
    public static final C34945a f82430c = new C34945a((byte) 0);

    /* renamed from: com.ss.android.ugc.aweme.bu.b.a$a */
    public static final class C34945a {
        static {
            Covode.recordClassIndex(41966);
        }

        /* renamed from: a */
        private static boolean m71333a() {
            return ((Boolean) C34944a.f82428a.getValue()).booleanValue();
        }

        /* renamed from: b */
        private static int m71335b() {
            return ((Number) C34944a.f82429b.getValue()).intValue();
        }

        private C34945a() {
        }

        public /* synthetic */ C34945a(byte b) {
            this();
        }

        /* renamed from: a */
        public static boolean m71334a(Aweme aweme) {
            boolean mvThemeRecordMode;
            int mvPlan;
            String str;
            C89219l.m154721d(aweme, "");
            if (C46796cm.f109016a) {
                mvThemeRecordMode = m71333a();
                mvPlan = m71335b();
            } else {
                mvThemeRecordMode = AVExternalServiceImpl.m113114a().configService().avsettingsConfig().getMvThemeRecordMode();
                mvPlan = AVExternalServiceImpl.m113114a().configService().avsettingsConfig().getMvPlan();
            }
            if (aweme.getUploadMiscInfoStruct() != null) {
                C71872i uploadMiscInfoStruct = aweme.getUploadMiscInfoStruct();
                if (uploadMiscInfoStruct != null) {
                    str = uploadMiscInfoStruct.mvThemeId;
                } else {
                    str = null;
                }
                if (!TextUtils.isEmpty(str) && mvThemeRecordMode) {
                    if (aweme.getUploadMiscInfoStruct().mvType != 1 || mvPlan >= 2) {
                        return true;
                    }
                    return false;
                }
            }
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bu.b.a$b */
    static final class C34946b extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C34946b f82431a = new C34946b();

        static {
            Covode.recordClassIndex(41967);
        }

        C34946b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(AVExternalServiceImpl.m113114a().configService().avsettingsConfig().getMvPlan());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bu.b.a$c */
    static final class C34947c extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C34947c f82432a = new C34947c();

        static {
            Covode.recordClassIndex(41968);
        }

        C34947c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(AVExternalServiceImpl.m113114a().configService().avsettingsConfig().getMvThemeRecordMode());
        }
    }

    static {
        Covode.recordClassIndex(41965);
    }
}
