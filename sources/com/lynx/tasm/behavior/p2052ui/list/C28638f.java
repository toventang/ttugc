package com.lynx.tasm.behavior.p2052ui.list;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.Callback;
import com.lynx.tasm.base.LLog;
import java.lang.ref.WeakReference;

/* renamed from: com.lynx.tasm.behavior.ui.list.f */
public final class C28638f {

    /* renamed from: a */
    public static int f67426a = 80;

    /* renamed from: b */
    RunnableC28639a f67427b;

    /* renamed from: c */
    private final RecyclerView f67428c;

    static {
        Covode.recordClassIndex(34697);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.tasm.behavior.ui.list.f$a */
    public static class RunnableC28639a implements Runnable {

        /* renamed from: a */
        WeakReference<RecyclerView> f67429a;

        /* renamed from: b */
        Callback f67430b = null;

        /* renamed from: c */
        int f67431c;

        /* renamed from: d */
        String f67432d;

        /* renamed from: e */
        int f67433e;

        /* renamed from: f */
        View f67434f = null;

        /* renamed from: g */
        public boolean f67435g = false;

        /* renamed from: h */
        private int f67436h;

        /* renamed from: i */
        private int f67437i;

        static {
            Covode.recordClassIndex(34698);
        }

        /* JADX WARNING: Removed duplicated region for block: B:45:0x00fe  */
        /* JADX WARNING: Removed duplicated region for block: B:48:0x010a  */
        /* JADX WARNING: Removed duplicated region for block: B:58:0x0154  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
            // Method dump skipped, instructions count: 478
            */
            throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.behavior.p2052ui.list.C28638f.RunnableC28639a.run():void");
        }

        RunnableC28639a(RecyclerView recyclerView) {
            this.f67429a = new WeakReference<>(recyclerView);
        }
    }

    C28638f(Context context, RecyclerView recyclerView) {
        f67426a = context.getResources().getDisplayMetrics().densityDpi / 4;
        this.f67428c = recyclerView;
        this.f67427b = new RunnableC28639a(recyclerView);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo49576a(int i, int i2, Callback callback) {
        RunnableC28639a aVar = this.f67427b;
        if (aVar == null || !aVar.f67435g) {
            RecyclerView.AbstractC1362i layoutManager = this.f67428c.getLayoutManager();
            if (layoutManager instanceof LinearLayoutManager) {
                ((LinearLayoutManager) layoutManager).mo4347a(i, i2);
            } else if (layoutManager instanceof StaggeredGridLayoutManager) {
                ((StaggeredGridLayoutManager) layoutManager).mo4347a(i, i2);
            }
            if (callback != null) {
                callback.invoke(0);
                return;
            }
            return;
        }
        if (UIList.f67360h) {
            LLog.m56856a(6, "UIList", "ListScroller scrollToPositionSmoothly is scrolling ");
        }
        if (callback != null) {
            callback.invoke(1, "dumplicated, scrollToPositionSmoothly is working");
        }
    }
}
