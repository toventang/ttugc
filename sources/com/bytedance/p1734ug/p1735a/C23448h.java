package com.bytedance.p1734ug.p1735a;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.utils.C80567ic;

/* renamed from: com.bytedance.ug.a.h */
final class C23448h implements AbstractC23454l {

    /* renamed from: a */
    public final Context f55606a;

    /* renamed from: b */
    public final String f55607b;

    /* renamed from: c */
    private final Handler f55608c = new Handler(Looper.getMainLooper());

    static {
        Covode.recordClassIndex(27408);
    }

    @Override // com.bytedance.p1734ug.p1735a.AbstractC23454l
    /* renamed from: a */
    public final void mo38212a(final C23440a aVar) {
        if (aVar.f55592f != 0) {
            final RunnableC234491 r2 = new Runnable() {
                /* class com.bytedance.p1734ug.p1735a.C23448h.RunnableC234491 */

                static {
                    Covode.recordClassIndex(27409);
                }

                public final void run() {
                    Toast makeText = Toast.makeText(C23448h.this.f55606a, C23448h.this.f55607b + " " + aVar.f55591e, 1);
                    if (Build.VERSION.SDK_INT == 25) {
                        C80567ic.m139657a(makeText);
                    }
                    makeText.show();
                }
            };
            if (Looper.getMainLooper() == Looper.myLooper()) {
                r2.run();
            } else {
                this.f55608c.post(new Runnable() {
                    /* class com.bytedance.p1734ug.p1735a.C23448h.RunnableC234502 */

                    static {
                        Covode.recordClassIndex(27410);
                    }

                    public final void run() {
                        r2.run();
                    }
                });
            }
        }
    }

    C23448h(Context context, String str) {
        this.f55606a = context;
        this.f55607b = "[UGCloud " + str + "]";
    }
}
