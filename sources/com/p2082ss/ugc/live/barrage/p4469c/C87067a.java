package com.p2082ss.ugc.live.barrage.p4469c;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.ugc.live.barrage.c.a */
public final class C87067a {

    /* renamed from: a */
    public static final C87067a f196292a = new C87067a();

    /* renamed from: com.ss.ugc.live.barrage.c.a$a */
    public interface AbstractC87068a {
        static {
            Covode.recordClassIndex(102834);
        }

        /* renamed from: a */
        void mo140679a(View view, Bitmap bitmap);
    }

    private C87067a() {
    }

    static {
        Covode.recordClassIndex(102833);
    }

    /* renamed from: a */
    public static void m150802a(View view, AbstractC87068a aVar) {
        C89219l.m154719c(view, "");
        C89219l.m154719c(aVar, "");
        view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        view.setDrawingCacheEnabled(true);
        try {
            Bitmap drawingCache = view.getDrawingCache();
            if (drawingCache != null && !drawingCache.isRecycled()) {
                aVar.mo140679a(view, drawingCache);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m150801a(Context context, int i, AbstractC87068a aVar) {
        MethodCollector.m26663i(10232);
        C89219l.m154719c(context, "");
        C89219l.m154719c(aVar, "");
        View inflate = LayoutInflater.from(context).inflate(i, (ViewGroup) null);
        C89219l.m154709a((Object) inflate, "");
        m150802a(inflate, aVar);
        MethodCollector.m26664o(10232);
    }
}
