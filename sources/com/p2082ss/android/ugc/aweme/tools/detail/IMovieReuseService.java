package com.p2082ss.android.ugc.aweme.tools.detail;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a;
import com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa;

/* renamed from: com.ss.android.ugc.aweme.tools.detail.IMovieReuseService */
public interface IMovieReuseService {

    /* renamed from: a */
    public static final C78106a f175372a = C78106a.f175374b;

    /* renamed from: com.ss.android.ugc.aweme.tools.detail.IMovieReuseService$b */
    public interface AbstractC78107b {
        static {
            Covode.recordClassIndex(91208);
        }

        /* renamed from: a */
        void mo105358a(int i, Boolean bool);
    }

    static {
        Covode.recordClassIndex(91206);
    }

    /* renamed from: a */
    AbstractC41262aa mo98779a(AbstractC39100a<?, ?> aVar);

    /* renamed from: a */
    void mo98780a(Context context, Integer num, String str, Integer num2, String str2, String str3);

    /* renamed from: a */
    void mo98781a(Fragment fragment, String str);

    /* renamed from: a */
    void mo98782a(String str, Activity activity, AbstractC78107b bVar);

    /* renamed from: b */
    void mo98783b(Fragment fragment, String str);

    /* renamed from: com.ss.android.ugc.aweme.tools.detail.IMovieReuseService$a */
    public static final class C78106a {

        /* renamed from: a */
        public static final int f175373a = 2;

        /* renamed from: b */
        static final /* synthetic */ C78106a f175374b = new C78106a();

        /* renamed from: c */
        private static final int f175375c = 1;

        /* renamed from: d */
        private static final int f175376d = 3;

        private C78106a() {
        }

        static {
            Covode.recordClassIndex(91207);
        }
    }
}
