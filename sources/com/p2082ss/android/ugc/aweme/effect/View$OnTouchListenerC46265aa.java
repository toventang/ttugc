package com.p2082ss.android.ugc.aweme.effect;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.effect.C46397z;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.effect.aa */
public final /* synthetic */ class View$OnTouchListenerC46265aa implements View.OnTouchListener {

    /* renamed from: a */
    private final C46397z.C46399b f107837a;

    static {
        Covode.recordClassIndex(54842);
    }

    View$OnTouchListenerC46265aa(C46397z.C46399b bVar) {
        this.f107837a = bVar;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C46397z.C46399b bVar = this.f107837a;
        int adapterPosition = bVar.getAdapterPosition();
        if (-1 == adapterPosition) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            bVar.f108123c.animate().scaleX(1.2f).scaleY(1.2f).setDuration(100).start();
            if (C46397z.this.f108120a != null) {
                C46397z.this.f108120a.mo78875a(0, adapterPosition, C46397z.this.f107835c.get(adapterPosition));
            }
        } else if (action == 1 || action == 3) {
            bVar.f108123c.animate().scaleX(1.0f).scaleY(1.0f).setDuration(100).start();
            if (C46397z.this.f108120a != null) {
                C46397z.this.f108120a.mo78875a(1, adapterPosition, C46397z.this.f107835c.get(adapterPosition));
            }
        }
        return true;
    }
}
