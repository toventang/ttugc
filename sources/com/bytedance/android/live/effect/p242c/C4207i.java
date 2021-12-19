package com.bytedance.android.live.effect.p242c;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.p1097d.C15401f;

/* renamed from: com.bytedance.android.live.effect.c.i */
public final class C4207i extends RecyclerView.AbstractC1361h {
    static {
        Covode.recordClassIndex(4777);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1361h
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1378s sVar) {
        boolean equals;
        super.getItemOffsets(rect, view, recyclerView, sVar);
        if (RecyclerView.m4277d(view) == 0) {
            if (C3966y.m9669e() == null) {
                equals = false;
            } else {
                equals = C15401f.f37600a.equals(C3966y.m9669e().getResources().getConfiguration().locale.getLanguage());
            }
            if (equals) {
                rect.set(0, 0, C3966y.m9653a(6.0f), 0);
            } else {
                rect.set(C3966y.m9653a(6.0f), 0, 0, 0);
            }
        } else {
            rect.set(0, 0, 0, 0);
        }
    }
}
