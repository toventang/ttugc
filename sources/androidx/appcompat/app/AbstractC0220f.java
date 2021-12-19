package androidx.appcompat.app;

import android.app.Dialog;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.C0214b;
import androidx.appcompat.view.AbstractC0274b;
import androidx.appcompat.widget.Toolbar;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.appcompat.app.f */
public abstract class AbstractC0220f {

    /* renamed from: a */
    public static int f647a = -1;

    /* renamed from: a */
    public abstract <T extends View> T mo510a(int i);

    /* renamed from: a */
    public abstract AbstractC0211a mo511a();

    /* renamed from: a */
    public abstract AbstractC0274b mo512a(AbstractC0274b.AbstractC0275a aVar);

    /* renamed from: a */
    public abstract void mo513a(Configuration configuration);

    /* renamed from: a */
    public abstract void mo514a(Bundle bundle);

    /* renamed from: a */
    public abstract void mo515a(View view);

    /* renamed from: a */
    public abstract void mo516a(View view, ViewGroup.LayoutParams layoutParams);

    /* renamed from: a */
    public abstract void mo517a(Toolbar toolbar);

    /* renamed from: a */
    public abstract void mo518a(CharSequence charSequence);

    /* renamed from: b */
    public abstract MenuInflater mo519b();

    /* renamed from: b */
    public abstract void mo520b(int i);

    /* renamed from: b */
    public abstract void mo521b(Bundle bundle);

    /* renamed from: b */
    public abstract void mo522b(View view, ViewGroup.LayoutParams layoutParams);

    /* renamed from: c */
    public abstract void mo523c();

    /* renamed from: c */
    public abstract boolean mo524c(int i);

    /* renamed from: d */
    public abstract void mo525d();

    /* renamed from: e */
    public abstract void mo526e();

    /* renamed from: f */
    public abstract void mo527f();

    /* renamed from: g */
    public abstract void mo528g();

    /* renamed from: h */
    public abstract void mo529h();

    /* renamed from: i */
    public abstract C0214b.AbstractC0215a mo530i();

    /* renamed from: j */
    public abstract void mo531j();

    /* renamed from: k */
    public abstract boolean mo532k();

    AbstractC0220f() {
    }

    static {
        Covode.recordClassIndex(254);
    }

    /* renamed from: a */
    public static AbstractC0220f m682a(Dialog dialog, AbstractC0219e eVar) {
        return new LayoutInflater$Factory2C0221g(dialog.getContext(), dialog.getWindow(), eVar);
    }
}
