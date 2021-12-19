package androidx.core.p037h;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.core.h.b */
public abstract class AbstractC0763b {

    /* renamed from: e */
    public final Context f2901e;

    /* renamed from: f */
    public AbstractC0764a f2902f;

    /* renamed from: g */
    public AbstractC0765b f2903g;

    /* renamed from: androidx.core.h.b$a */
    public interface AbstractC0764a {
        static {
            Covode.recordClassIndex(845);
        }

        /* renamed from: b */
        void mo1275b(boolean z);
    }

    /* renamed from: androidx.core.h.b$b */
    public interface AbstractC0765b {
        static {
            Covode.recordClassIndex(846);
        }

        /* renamed from: a */
        void mo1058a();
    }

    static {
        Covode.recordClassIndex(844);
    }

    /* renamed from: a */
    public abstract View mo1114a();

    /* renamed from: a */
    public void mo1115a(SubMenu subMenu) {
    }

    /* renamed from: b */
    public boolean mo1116b() {
        return false;
    }

    /* renamed from: c */
    public boolean mo1117c() {
        return false;
    }

    /* renamed from: d */
    public boolean mo1123d() {
        return false;
    }

    /* renamed from: e */
    public boolean mo1124e() {
        return true;
    }

    public AbstractC0763b(Context context) {
        this.f2901e = context;
    }

    /* renamed from: a */
    public View mo1121a(MenuItem menuItem) {
        return mo1114a();
    }

    /* renamed from: a */
    public void mo1122a(AbstractC0765b bVar) {
        if (this.f2903g != null) {
            getClass().getSimpleName();
        }
        this.f2903g = bVar;
    }

    /* renamed from: a */
    public final void mo2886a(boolean z) {
        AbstractC0764a aVar = this.f2902f;
        if (aVar != null) {
            aVar.mo1275b(z);
        }
    }
}
