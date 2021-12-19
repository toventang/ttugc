package com.bytedance.scene.p1623e;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.scene.e.b */
public final class C22177b extends C22178c {
    static {
        Covode.recordClassIndex(25981);
    }

    public C22177b(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View, android.view.ViewGroup
    public final void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View, android.view.ViewGroup
    public final void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }
}
