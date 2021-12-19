package com.bytedance.android.livesdk.feed.p533i;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.feed.i.u */
final /* synthetic */ class View$OnLongClickListenerC8626u implements View.OnLongClickListener {

    /* renamed from: a */
    private final C8620p f21342a;

    static {
        Covode.recordClassIndex(9483);
    }

    View$OnLongClickListenerC8626u(C8620p pVar) {
        this.f21342a = pVar;
    }

    public final boolean onLongClick(View view) {
        MethodCollector.m26663i(2187);
        C8620p pVar = this.f21342a;
        int[] iArr = new int[2];
        pVar.itemView.getLocationInWindow(iArr);
        int[] iArr2 = new int[2];
        View view2 = (View) pVar.itemView.getParent();
        view2.getLocationInWindow(iArr2);
        int a = C3966y.m9653a(78.0f);
        boolean z = false;
        int max = Math.max(0, iArr2[1] - iArr[1]);
        int height = (pVar.itemView.getHeight() - max) - Math.max(0, ((iArr[1] + pVar.itemView.getHeight()) - iArr2[1]) - view2.getHeight());
        float f = ((float) a) / 2.0f;
        if (((float) height) >= (((float) pVar.itemView.getHeight()) / 2.0f) + f) {
            View inflate = View.inflate(pVar.itemView.getContext(), R.layout.bci, null);
            View findViewById = inflate.findViewById(R.id.alj);
            ((FrameLayout.LayoutParams) findViewById.getLayoutParams()).topMargin = (int) (((((float) pVar.itemView.getHeight()) / 2.0f) - f) - ((float) max));
            PopupWindow popupWindow = new PopupWindow(inflate, pVar.itemView.getWidth(), height, true);
            inflate.setOnClickListener(new View$OnClickListenerC8598aa(popupWindow));
            findViewById.setOnClickListener(new View$OnClickListenerC8624s(pVar, popupWindow));
            popupWindow.showAtLocation(pVar.itemView, 51, iArr[0], iArr[1] + max);
            z = true;
            view.getParent().requestDisallowInterceptTouchEvent(true);
        }
        MethodCollector.m26664o(2187);
        return z;
    }
}
