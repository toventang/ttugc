package com.bytedance.creativex.recorder.p940b.p941a;

import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.tools.C84401c;

/* renamed from: com.bytedance.creativex.recorder.b.a.x */
public class C14207x {

    /* renamed from: a */
    public int f34485a;

    /* renamed from: b */
    public Effect f34486b;

    /* renamed from: c */
    public boolean f34487c;

    /* renamed from: d */
    public C14200s f34488d;

    /* renamed from: e */
    public Bundle f34489e = new Bundle();

    /* renamed from: f */
    public Runnable f34490f = null;

    /* renamed from: g */
    public String f34491g;

    static {
        Covode.recordClassIndex(16276);
    }

    /* renamed from: a */
    public final C14207x mo22930a() {
        this.f34487c = true;
        return this;
    }

    public String toString() {
        return "StopRecordingCommandEvent{}";
    }

    /* renamed from: a */
    public final C14207x mo22931a(int i) {
        this.f34485a = i;
        return this;
    }

    public C14207x(String str) {
        if (!TextUtils.isEmpty(str) || !C84401c.f188718b) {
            this.f34491g = str;
            return;
        }
        throw new IllegalStateException("stop recording reason shouldn't be empty!!!");
    }
}
