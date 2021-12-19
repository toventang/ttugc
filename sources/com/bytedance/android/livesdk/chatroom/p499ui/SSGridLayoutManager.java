package com.bytedance.android.livesdk.chatroom.p499ui;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.SSGridLayoutManager */
public class SSGridLayoutManager extends GridLayoutManager {
    static {
        Covode.recordClassIndex(8492);
    }

    public SSGridLayoutManager(Context context, int i) {
        super(i);
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: c */
    public final void mo4337c(RecyclerView.C1372o oVar, RecyclerView.C1378s sVar) {
        try {
            super.mo4337c(oVar, sVar);
        } catch (Exception unused) {
        }
    }

    public SSGridLayoutManager(int i, int i2) {
        super(i, i2, false);
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: a */
    public final int mo4312a(int i, RecyclerView.C1372o oVar, RecyclerView.C1378s sVar) {
        try {
            return super.mo4312a(i, oVar, sVar);
        } catch (IndexOutOfBoundsException unused) {
            return 0;
        }
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: b */
    public final int mo4331b(int i, RecyclerView.C1372o oVar, RecyclerView.C1378s sVar) {
        try {
            return super.mo4331b(i, oVar, sVar);
        } catch (IndexOutOfBoundsException unused) {
            return 0;
        }
    }

    public SSGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
