package com.p2082ss.android.ugc.aweme.discover.lynx.container;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.C42345d;
import java.util.List;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.lynx.container.f */
public interface AbstractC42208f {
    static {
        Covode.recordClassIndex(50148);
    }

    /* renamed from: a */
    void mo71400a(ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams);

    /* renamed from: a */
    void mo71402a(C42345d dVar);

    /* renamed from: a */
    void mo71404a(String str, JSONObject jSONObject);

    /* renamed from: a */
    void mo71405a(List<C42201a> list);

    /* renamed from: b */
    void mo71406b(String str);

    View getRealView();

    /* renamed from: com.ss.android.ugc.aweme.discover.lynx.container.f$a */
    public static final class C42209a {
        static {
            Covode.recordClassIndex(50149);
        }

        /* renamed from: a */
        public static void m84487a(AbstractC42208f fVar, ViewGroup viewGroup, int i, ViewGroup.LayoutParams layoutParams) {
            MethodCollector.m26663i(8539);
            C89219l.m154721d(viewGroup, "");
            C89219l.m154721d(layoutParams, "");
            View realView = fVar.getRealView();
            ViewParent parent = realView.getParent();
            if (C89219l.m154714a(parent, viewGroup)) {
                MethodCollector.m26664o(8539);
                return;
            }
            if (parent != null) {
                ((ViewGroup) parent).removeView(realView);
            }
            viewGroup.addView(realView, 0, layoutParams);
            MethodCollector.m26664o(8539);
        }
    }
}
