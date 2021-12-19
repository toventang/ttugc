package com.p2082ss.android.ugc.aweme.challenge.p2454ui;

import android.app.Activity;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.challenge.ui.p */
public final class C35650p {

    /* renamed from: a */
    public static final C35651a f84088a = new C35651a((byte) 0);

    static {
        Covode.recordClassIndex(42874);
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.p$a */
    public static final class C35651a {
        static {
            Covode.recordClassIndex(42875);
        }

        private C35651a() {
        }

        public /* synthetic */ C35651a(byte b) {
            this();
        }

        /* renamed from: b */
        public static AdPopUpWebPageView m72758b(Activity activity) {
            AdPopUpWebPageView adPopUpWebPageView;
            FrameLayout a = m72757a(activity);
            if (a != null) {
                adPopUpWebPageView = (AdPopUpWebPageView) a.findViewById(R.id.a3l);
            } else {
                adPopUpWebPageView = null;
            }
            if (!(adPopUpWebPageView instanceof AdPopUpWebPageView)) {
                return null;
            }
            return adPopUpWebPageView;
        }

        /* renamed from: a */
        public static FrameLayout m72757a(Activity activity) {
            View view;
            MethodCollector.m26663i(8403);
            if (activity != null) {
                ViewStub viewStub = (ViewStub) activity.findViewById(R.id.aji);
                if (viewStub != null && viewStub.getParent() != null) {
                    view = viewStub.inflate();
                    if (view == null) {
                        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
                        MethodCollector.m26664o(8403);
                        throw nullPointerException;
                    }
                } else if (activity != null) {
                    view = activity.findViewById(R.id.a3g);
                }
                FrameLayout frameLayout = (FrameLayout) view;
                MethodCollector.m26664o(8403);
                return frameLayout;
            }
            MethodCollector.m26664o(8403);
            return null;
        }
    }
}
