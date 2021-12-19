package com.bytedance.android.livesdk.chatroom.p499ui;

import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.C1481r;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.SmoothLinearLayoutManager */
public class SmoothLinearLayoutManager extends LinearLayoutManager {

    /* renamed from: a */
    public float f19092a = 25.0f;

    /* renamed from: b */
    public boolean f19093b = true;

    static {
        Covode.recordClassIndex(8494);
    }

    public SmoothLinearLayoutManager() {
        super(1, false);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: a */
    public final void mo4354a(RecyclerView recyclerView, RecyclerView.C1378s sVar, int i) {
        RecyclerView.AbstractC1375r r1;
        if (i < 0) {
            i = 0;
        }
        if (this.f19093b) {
            r1 = new C1481r(recyclerView.getContext()) {
                /* class com.bytedance.android.livesdk.chatroom.p499ui.SmoothLinearLayoutManager.C77011 */

                static {
                    Covode.recordClassIndex(8495);
                }

                @Override // androidx.recyclerview.widget.C1481r
                /* renamed from: a */
                public final float mo4862a(DisplayMetrics displayMetrics) {
                    return SmoothLinearLayoutManager.this.f19092a / ((float) displayMetrics.densityDpi);
                }

                @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1375r, androidx.recyclerview.widget.C1481r
                /* renamed from: a */
                public final void mo4777a(View view, RecyclerView.C1378s sVar, RecyclerView.AbstractC1375r.C1376a aVar) {
                    int b = mo5015b(view, mo5013b());
                    int a = mo5012a(view, mo5016c());
                    int b2 = mo5014b((int) Math.sqrt((double) ((b * b) + (a * a))));
                    if (b2 > 0) {
                        aVar.mo4780a(-b, -a, b2, this.f4911a);
                    }
                }
            };
        } else {
            r1 = new C1481r(recyclerView.getContext()) {
                /* class com.bytedance.android.livesdk.chatroom.p499ui.SmoothLinearLayoutManager.C77022 */

                static {
                    Covode.recordClassIndex(8496);
                }

                @Override // androidx.recyclerview.widget.C1481r
                /* renamed from: a */
                public final float mo4862a(DisplayMetrics displayMetrics) {
                    return SmoothLinearLayoutManager.this.f19092a / ((float) displayMetrics.densityDpi);
                }
            };
        }
        r1.f4515g = i;
        mo4695a(r1);
    }

    public SmoothLinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
