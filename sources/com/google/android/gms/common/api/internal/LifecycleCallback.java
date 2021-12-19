package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class LifecycleCallback {

    /* renamed from: a */
    protected final AbstractC25458j f60170a;

    static {
        Covode.recordClassIndex(30761);
    }

    /* renamed from: a */
    public void mo41553a(int i, int i2, Intent intent) {
    }

    /* renamed from: a */
    public void mo41554a(Bundle bundle) {
    }

    /* renamed from: a */
    public void mo41555a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    /* renamed from: b */
    public void mo41556b() {
    }

    /* renamed from: b */
    public void mo41557b(Bundle bundle) {
    }

    /* renamed from: c */
    public void mo41558c() {
    }

    /* renamed from: d */
    public void mo41559d() {
    }

    /* renamed from: a */
    public final Activity mo41552a() {
        return this.f60170a.mo41669a();
    }

    public LifecycleCallback(AbstractC25458j jVar) {
        this.f60170a = jVar;
    }

    private static AbstractC25458j getChimeraLifecycleFragmentImpl(C25457i iVar) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    /* renamed from: a */
    public static AbstractC25458j m48794a(Activity activity) {
        return m48795a(new C25457i(activity));
    }

    /* renamed from: a */
    protected static AbstractC25458j m48795a(C25457i iVar) {
        if (iVar.f60447a instanceof ActivityC0945e) {
            return C25445cz.m49065a((ActivityC0945e) iVar.f60447a);
        }
        if (iVar.f60447a instanceof Activity) {
            return FragmentC25442cw.m49061a((Activity) iVar.f60447a);
        }
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }
}
