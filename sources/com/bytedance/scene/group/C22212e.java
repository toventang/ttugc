package com.bytedance.scene.group;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.scene.AbstractC22231l;
import com.bytedance.scene.p1622d.C22171k;

/* renamed from: com.bytedance.scene.group.e */
public final class C22212e extends View {

    /* renamed from: a */
    private String f52514a;

    /* renamed from: b */
    private String f52515b;

    /* renamed from: c */
    private Bundle f52516c;

    /* renamed from: d */
    private AbstractC22231l f52517d;

    static {
        Covode.recordClassIndex(26018);
    }

    public final Bundle getArguments() {
        return this.f52516c;
    }

    public final AbstractC22231l getSceneComponentFactory() {
        return this.f52517d;
    }

    public final String getSceneName() {
        if (!TextUtils.isEmpty(this.f52514a)) {
            return this.f52514a;
        }
        throw new IllegalArgumentException("ScenePlaceHolderView name is empty, invoke setSceneName first");
    }

    public final String getSceneTag() {
        if (!TextUtils.isEmpty(this.f52515b)) {
            return this.f52515b;
        }
        throw new IllegalArgumentException("ScenePlaceHolderView tag is empty, invoke setSceneTag first");
    }

    public final void setArguments(Bundle bundle) {
        this.f52516c = bundle;
    }

    public final void setSceneComponentFactory(AbstractC22231l lVar) {
        this.f52517d = lVar;
    }

    public final void setSceneName(String str) {
        this.f52514a = C22171k.m41658a(str, "ScenePlaceHolderView name can't be empty");
    }

    public final void setSceneTag(String str) {
        this.f52515b = C22171k.m41658a(str, "ScenePlaceHolderView tag can't be empty");
    }

    /* renamed from: a */
    private static int m41750a(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode != Integer.MIN_VALUE) {
            return mode != 1073741824 ? i : size;
        }
        return Math.min(i, size);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(m41750a(getSuggestedMinimumWidth(), i), m41750a(getSuggestedMinimumHeight(), i2));
    }
}
