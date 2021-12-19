package com.twitter.sdk.android.core.internal;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.twitter.sdk.android.core.C87794k;

/* renamed from: com.twitter.sdk.android.core.internal.e */
final class C87726e implements AbstractC87727f {

    /* renamed from: a */
    private final Context f199245a;

    static {
        Covode.recordClassIndex(103715);
    }

    @Override // com.twitter.sdk.android.core.internal.AbstractC87727f
    /* renamed from: a */
    public final C87718b mo142174a() {
        if (m152663a(this.f199245a)) {
            return new C87718b(m152664b(), m152665c());
        }
        return null;
    }

    /* renamed from: b */
    private String m152664b() {
        try {
            return (String) Class.forName("com.google.android.gms.a.a.a$a").getMethod("getId", new Class[0]).invoke(m152666d(), new Object[0]);
        } catch (Exception unused) {
            C87794k.m152811c().mo142114c();
            return null;
        }
    }

    /* renamed from: c */
    private boolean m152665c() {
        try {
            return ((Boolean) Class.forName("com.google.android.gms.a.a.a$a").getMethod("isLimitAdTrackingEnabled", new Class[0]).invoke(m152666d(), new Object[0])).booleanValue();
        } catch (Exception unused) {
            C87794k.m152811c().mo142114c();
            return false;
        }
    }

    /* renamed from: d */
    private Object m152666d() {
        try {
            return Class.forName("com.google.android.gms.a.a.a").getMethod("a", Context.class).invoke(null, this.f199245a);
        } catch (Exception unused) {
            C87794k.m152811c().mo142114c();
            return null;
        }
    }

    C87726e(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            applicationContext = C58003a.f132199a;
        }
        this.f199245a = applicationContext;
    }

    /* renamed from: a */
    private static boolean m152663a(Context context) {
        try {
            if (((Integer) Class.forName("com.google.android.gms.common.f").getMethod("a", Context.class).invoke(null, context)).intValue() == 0) {
                return true;
            }
            return false;
        } catch (Exception unused) {
        }
    }
}
