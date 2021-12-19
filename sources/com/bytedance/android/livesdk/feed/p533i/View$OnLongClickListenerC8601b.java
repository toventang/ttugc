package com.bytedance.android.livesdk.feed.p533i;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.feed.i.b */
final /* synthetic */ class View$OnLongClickListenerC8601b implements View.OnLongClickListener {

    /* renamed from: a */
    private final AbstractC8597a f21265a;

    static {
        Covode.recordClassIndex(9458);
    }

    View$OnLongClickListenerC8601b(AbstractC8597a aVar) {
        this.f21265a = aVar;
    }

    public final boolean onLongClick(View view) {
        MethodCollector.m26663i(4208);
        AbstractC8597a aVar = this.f21265a;
        Room room = aVar.f21253i;
        boolean z = false;
        if (!(room == null || room.getOwner() == null)) {
            int[] iArr = new int[2];
            aVar.itemView.getLocationInWindow(iArr);
            int[] iArr2 = new int[2];
            View view2 = (View) aVar.itemView.getParent();
            view2.getLocationInWindow(iArr2);
            int a = C3966y.m9653a(78.0f);
            int max = Math.max(0, iArr2[1] - iArr[1]);
            int height = (aVar.itemView.getHeight() - max) - Math.max(0, ((iArr[1] + aVar.itemView.getHeight()) - iArr2[1]) - view2.getHeight());
            float f = ((float) a) / 2.0f;
            if (((float) height) >= (((float) aVar.itemView.getHeight()) / 2.0f) + f) {
                View inflate = View.inflate(aVar.itemView.getContext(), R.layout.bci, null);
                View findViewById = inflate.findViewById(R.id.alj);
                ((FrameLayout.LayoutParams) findViewById.getLayoutParams()).topMargin = (int) (((((float) aVar.itemView.getHeight()) / 2.0f) - f) - ((float) max));
                PopupWindow popupWindow = new PopupWindow(inflate, aVar.itemView.getWidth(), height, true);
                inflate.setOnClickListener(new View$OnClickListenerC8606g(popupWindow));
                findViewById.setOnClickListener(new View$OnClickListenerC8607h(aVar, room, popupWindow));
                popupWindow.showAtLocation(aVar.itemView, 51, iArr[0], iArr[1] + max);
                z = true;
                view.getParent().requestDisallowInterceptTouchEvent(true);
            }
        }
        MethodCollector.m26664o(4208);
        return z;
    }
}
