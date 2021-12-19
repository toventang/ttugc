package com.p2082ss.android.ugc.aweme.emoji.p2897b;

import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.emoji.b.d */
public class C46450d<DATA> extends RecyclerView.ViewHolder {
    static {
        Covode.recordClassIndex(55033);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo78979a() {
    }

    /* renamed from: a */
    public void mo78980a(DATA data) {
    }

    /* renamed from: a */
    public void mo78981a(DATA data, int i) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo78982b() {
        this.itemView.setOnTouchListener(new View.OnTouchListener() {
            /* class com.p2082ss.android.ugc.aweme.emoji.utils.C46651k.View$OnTouchListenerC466521 */

            /* renamed from: a */
            final /* synthetic */ float f108781a = 0.5f;

            static {
                Covode.recordClassIndex(55244);
            }

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    C46651k.m90057a(true, view, this.f108781a);
                } else if (action == 1 || action == 3) {
                    C46651k.m90057a(false, view, this.f108781a);
                }
                return false;
            }
        });
    }

    public C46450d(View view) {
        super(view);
        mo78979a();
        mo78982b();
    }
}
