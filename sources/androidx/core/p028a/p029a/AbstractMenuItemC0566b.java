package androidx.core.p028a.p029a;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;
import android.view.View;
import androidx.core.p037h.AbstractC0763b;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.core.a.a.b */
public interface AbstractMenuItemC0566b extends MenuItem {
    static {
        Covode.recordClassIndex(641);
    }

    /* renamed from: a */
    AbstractMenuItemC0566b mo831a(AbstractC0763b bVar);

    /* renamed from: a */
    AbstractMenuItemC0566b mo832a(CharSequence charSequence);

    /* renamed from: a */
    AbstractC0763b mo833a();

    /* renamed from: b */
    AbstractMenuItemC0566b mo834b(CharSequence charSequence);

    boolean collapseActionView();

    boolean expandActionView();

    View getActionView();

    int getAlphabeticModifiers();

    CharSequence getContentDescription();

    ColorStateList getIconTintList();

    PorterDuff.Mode getIconTintMode();

    int getNumericModifiers();

    CharSequence getTooltipText();

    boolean isActionViewExpanded();

    @Override // android.view.MenuItem
    MenuItem setActionView(int i);

    @Override // android.view.MenuItem
    MenuItem setActionView(View view);

    MenuItem setAlphabeticShortcut(char c, int i);

    MenuItem setIconTintList(ColorStateList colorStateList);

    MenuItem setIconTintMode(PorterDuff.Mode mode);

    MenuItem setNumericShortcut(char c, int i);

    MenuItem setShortcut(char c, char c2, int i, int i2);

    void setShowAsAction(int i);

    MenuItem setShowAsActionFlags(int i);
}
