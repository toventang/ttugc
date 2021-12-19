package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import androidx.core.app.C0569a;
import androidx.core.p036g.C0697g;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import java.io.PrintWriter;

/* renamed from: androidx.fragment.app.h */
public abstract class AbstractC0951h<E> extends AbstractC0949f {

    /* renamed from: a */
    private final int f3381a;

    /* renamed from: b */
    public final Activity f3382b;

    /* renamed from: c */
    public final Context f3383c;

    /* renamed from: d */
    public final Handler f3384d;

    /* renamed from: e */
    public final LayoutInflater$Factory2C0956j f3385e;

    static {
        Covode.recordClassIndex(1044);
    }

    @Override // androidx.fragment.app.AbstractC0949f
    /* renamed from: a */
    public View mo3430a(int i) {
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3533a(Fragment fragment) {
    }

    /* renamed from: a */
    public void mo3536a(Fragment fragment, String[] strArr, int i) {
    }

    /* renamed from: a */
    public void mo3537a(String str, PrintWriter printWriter, String[] strArr) {
    }

    @Override // androidx.fragment.app.AbstractC0949f
    /* renamed from: a */
    public boolean mo3432a() {
        return true;
    }

    /* renamed from: a */
    public boolean mo3538a(String str) {
        return false;
    }

    /* renamed from: b */
    public boolean mo3539b() {
        return true;
    }

    /* renamed from: d */
    public void mo3541d() {
    }

    /* renamed from: e */
    public boolean mo3542e() {
        return true;
    }

    /* renamed from: g */
    public abstract E mo3544g();

    /* renamed from: f */
    public int mo3543f() {
        return this.f3381a;
    }

    /* renamed from: c */
    public LayoutInflater mo3540c() {
        return LayoutInflater.from(this.f3383c);
    }

    AbstractC0951h(ActivityC0945e eVar) {
        this(eVar, eVar, eVar.mHandler);
    }

    private AbstractC0951h(Activity activity, Context context, Handler handler) {
        this.f3385e = new LayoutInflater$Factory2C0956j();
        this.f3382b = activity;
        this.f3383c = (Context) C0697g.m2453a(context, "context == null");
        this.f3384d = (Handler) C0697g.m2453a(handler, "handler == null");
        this.f3381a = 0;
    }

    /* renamed from: a */
    public void mo3534a(Fragment fragment, Intent intent, int i, Bundle bundle) {
        if (i == -1) {
            Context context = this.f3383c;
            C84349a.m145093a(intent, context);
            context.startActivity(intent);
            return;
        }
        throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
    }

    /* renamed from: a */
    public void mo3535a(Fragment fragment, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        if (i == -1) {
            C0569a.m2181a(this.f3382b, intentSender, i, intent, i2, i3, i4, bundle);
            return;
        }
        throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
    }
}
