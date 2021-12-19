package com.bytedance.android.livesdk.chatroom.p499ui;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.p2083a.p2084a.AbstractC29335a;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.SSLinearLayoutManager */
public class SSLinearLayoutManager extends LinearLayoutManager {
    static {
        Covode.recordClassIndex(8493);
    }

    public SSLinearLayoutManager() {
    }

    public SSLinearLayoutManager(int i) {
        super(i, false);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: c */
    public final void mo4337c(RecyclerView.C1372o oVar, RecyclerView.C1378s sVar) {
        try {
            super.mo4337c(oVar, sVar);
        } catch (Exception e) {
            AbstractC29335a.m58734b("SSLinearLayoutManager", e);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: a */
    public final int mo4312a(int i, RecyclerView.C1372o oVar, RecyclerView.C1378s sVar) {
        try {
            return super.mo4312a(i, oVar, sVar);
        } catch (Exception e) {
            AbstractC29335a.m58734b("SSLinearLayoutManager", e);
            return 0;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: b */
    public final int mo4331b(int i, RecyclerView.C1372o oVar, RecyclerView.C1378s sVar) {
        try {
            return super.mo4331b(i, oVar, sVar);
        } catch (Exception e) {
            AbstractC29335a.m58734b("SSLinearLayoutManager", e);
            return 0;
        }
    }

    public SSLinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
