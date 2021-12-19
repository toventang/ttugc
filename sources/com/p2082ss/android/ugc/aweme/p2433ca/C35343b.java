package com.p2082ss.android.ugc.aweme.p2433ca;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.p894a.p896b.C13483a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.experiment.C46732bf;
import com.p2082ss.android.ugc.aweme.logger.C58945a;

/* renamed from: com.ss.android.ugc.aweme.ca.b */
public final class C35343b {

    /* renamed from: a */
    public static final C35343b f83376a = new C35343b();

    private C35343b() {
    }

    static {
        Covode.recordClassIndex(42511);
    }

    /* renamed from: com.ss.android.ugc.aweme.ca.b$a */
    public static final class RunnableC35344a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f83377a;

        static {
            Covode.recordClassIndex(42512);
        }

        public RunnableC35344a(Context context) {
            this.f83377a = context;
        }

        public final void run() {
            String str;
            C58945a.C58947b.f134185a.mo96425a("method_class_preload_duration", false);
            C13483a.m24248a(this.f83377a, false);
            C13483a.C13485a a = C13483a.m24247a();
            a.f32833a = "creative_launch";
            a.f32834b = new StringBuilder().append(C17867d.m33083d()).toString();
            int a2 = C46732bf.m90111a();
            if (a2 == 1) {
                str = "snapboost_list_coldboot_top200.txt";
            } else if (a2 == 2) {
                str = "snapboost_list_coldboot_top400.txt";
            } else if (a2 == 3) {
                str = "snapboost_list_coldboot_top600.txt";
            } else if (a2 != 4) {
                str = "";
            } else {
                str = "snapboost_list_coldboot_top800.txt";
            }
            if (!TextUtils.isEmpty(str)) {
                a.f32839g.add(str);
            }
            a.f32835c = false;
            a.f32837e = true;
            a.mo21758a().mo21759a();
            C58945a.C58947b.f134185a.mo96429b("method_class_preload_duration", false);
        }
    }
}
