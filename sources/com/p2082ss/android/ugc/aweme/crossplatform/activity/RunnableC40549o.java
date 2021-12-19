package com.p2082ss.android.ugc.aweme.crossplatform.activity;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.commercialize.views.OpenURLHintLayout;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.crossplatform.activity.o */
public final /* synthetic */ class RunnableC40549o implements Runnable {

    /* renamed from: a */
    private final MixActivityContainer f94876a;

    static {
        Covode.recordClassIndex(48370);
    }

    RunnableC40549o(MixActivityContainer mixActivityContainer) {
        this.f94876a = mixActivityContainer;
    }

    public final void run() {
        MethodCollector.m26663i(5558);
        MixActivityContainer mixActivityContainer = this.f94876a;
        if (mixActivityContainer.f94811b.f95072e.f95195b) {
            C40555u uVar = new C40555u(mixActivityContainer.f94810a);
            OpenURLHintLayout openURLHintLayout = mixActivityContainer.f94820k;
            String string = mixActivityContainer.f94810a.getString(R.string.gg5);
            C89219l.m154721d(openURLHintLayout, "");
            C89219l.m154721d(string, "");
            TextView textView = uVar.f94891b;
            if (textView != null) {
                textView.setText(string);
            }
            if (openURLHintLayout instanceof FrameLayout) {
                uVar.f94892c = openURLHintLayout;
                View view = uVar.f94890a;
                if (view != null) {
                    view.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                    ViewGroup viewGroup = uVar.f94892c;
                    if (viewGroup != null) {
                        viewGroup.addView(view);
                        MethodCollector.m26664o(5558);
                        return;
                    }
                    MethodCollector.m26664o(5558);
                    return;
                }
            }
        }
        MethodCollector.m26664o(5558);
    }
}
