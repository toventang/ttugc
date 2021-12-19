package androidx.appcompat.view;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.appcompat.view.b */
public abstract class AbstractC0274b {

    /* renamed from: c */
    public Object f892c;

    /* renamed from: d */
    public boolean f893d;

    /* renamed from: androidx.appcompat.view.b$a */
    public interface AbstractC0275a {
        static {
            Covode.recordClassIndex(309);
        }

        /* renamed from: a */
        void mo561a(AbstractC0274b bVar);

        /* renamed from: a */
        boolean mo562a(AbstractC0274b bVar, Menu menu);

        /* renamed from: a */
        boolean mo563a(AbstractC0274b bVar, MenuItem menuItem);

        /* renamed from: b */
        boolean mo564b(AbstractC0274b bVar, Menu menu);
    }

    static {
        Covode.recordClassIndex(308);
    }

    /* renamed from: a */
    public abstract MenuInflater mo613a();

    /* renamed from: a */
    public abstract void mo614a(int i);

    /* renamed from: a */
    public abstract void mo615a(View view);

    /* renamed from: a */
    public abstract void mo616a(CharSequence charSequence);

    /* renamed from: b */
    public abstract Menu mo618b();

    /* renamed from: b */
    public abstract void mo619b(int i);

    /* renamed from: b */
    public abstract void mo620b(CharSequence charSequence);

    /* renamed from: c */
    public abstract void mo621c();

    /* renamed from: d */
    public abstract void mo622d();

    /* renamed from: f */
    public abstract CharSequence mo624f();

    /* renamed from: g */
    public abstract CharSequence mo625g();

    /* renamed from: h */
    public boolean mo626h() {
        return false;
    }

    /* renamed from: i */
    public abstract View mo627i();

    /* renamed from: a */
    public void mo617a(boolean z) {
        this.f893d = z;
    }
}
