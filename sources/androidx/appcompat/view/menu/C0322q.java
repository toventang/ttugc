package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Build;
import android.view.Menu;
import android.view.MenuItem;
import androidx.core.p028a.p029a.AbstractMenuC0565a;
import androidx.core.p028a.p029a.AbstractMenuItemC0566b;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.appcompat.view.menu.q */
public final class C0322q {
    static {
        Covode.recordClassIndex(359);
    }

    /* renamed from: a */
    public static Menu m1211a(Context context, AbstractMenuC0565a aVar) {
        return new MenuC0323r(context, aVar);
    }

    /* renamed from: a */
    public static MenuItem m1212a(Context context, AbstractMenuItemC0566b bVar) {
        int i = Build.VERSION.SDK_INT;
        return new C0313l(context, bVar);
    }
}
