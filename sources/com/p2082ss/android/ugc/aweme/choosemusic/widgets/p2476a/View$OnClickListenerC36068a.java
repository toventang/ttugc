package com.p2082ss.android.ugc.aweme.choosemusic.widgets.p2476a;

import android.os.Build;
import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.base.utils.C34722h;
import com.p2082ss.android.ugc.aweme.base.utils.C34727m;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.widgets.a.a */
public final class View$OnClickListenerC36068a implements View.OnClickListener {

    /* renamed from: a */
    public boolean f85229a;

    /* renamed from: b */
    public View.OnClickListener f85230b;

    /* renamed from: c */
    private boolean f85231c;

    static {
        Covode.recordClassIndex(43321);
    }

    /* renamed from: a */
    public static View$OnClickListenerC36068a m73522a(View.OnClickListener onClickListener) {
        boolean z;
        if (Build.VERSION.SDK_INT >= 21) {
            z = true;
        } else {
            z = false;
        }
        return new View$OnClickListenerC36068a(onClickListener, z);
    }

    public final void onClick(final View view) {
        ClickAgent.onClick(view);
        if (!this.f85231c) {
            this.f85230b.onClick(view);
        } else if (!this.f85229a) {
            this.f85229a = true;
            C34727m.m70945a(new Runnable() {
                /* class com.p2082ss.android.ugc.aweme.choosemusic.widgets.p2476a.View$OnClickListenerC36068a.RunnableC360691 */

                static {
                    Covode.recordClassIndex(43322);
                }

                public final void run() {
                    View$OnClickListenerC36068a.this.f85230b.onClick(view);
                    View$OnClickListenerC36068a.this.f85229a = false;
                }
            }, (long) C34722h.m70922a(C17867d.m33078a().getResources()));
        }
    }

    private View$OnClickListenerC36068a(View.OnClickListener onClickListener, boolean z) {
        this.f85230b = onClickListener;
        this.f85231c = z;
    }
}
