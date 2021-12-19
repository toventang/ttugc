package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.MenuItemC0308k;
import androidx.core.p028a.p029a.AbstractMenuItemC0566b;
import androidx.core.p037h.AbstractC0763b;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.view.menu.l */
public final class C0313l extends MenuItemC0308k {
    static {
        Covode.recordClassIndex(350);
    }

    /* renamed from: androidx.appcompat.view.menu.l$a */
    class ActionProvider$VisibilityListenerC0314a extends MenuItemC0308k.C0309a implements ActionProvider.VisibilityListener {

        /* renamed from: c */
        AbstractC0763b.AbstractC0765b f1156c;

        static {
            Covode.recordClassIndex(351);
        }

        @Override // androidx.core.p037h.AbstractC0763b
        /* renamed from: d */
        public final boolean mo1123d() {
            return this.f1151a.overridesItemVisibility();
        }

        @Override // androidx.core.p037h.AbstractC0763b
        /* renamed from: e */
        public final boolean mo1124e() {
            return this.f1151a.isVisible();
        }

        @Override // androidx.core.p037h.AbstractC0763b
        /* renamed from: a */
        public final View mo1121a(MenuItem menuItem) {
            return this.f1151a.onCreateActionView(menuItem);
        }

        public final void onActionProviderVisibilityChanged(boolean z) {
            AbstractC0763b.AbstractC0765b bVar = this.f1156c;
            if (bVar != null) {
                bVar.mo1058a();
            }
        }

        @Override // androidx.core.p037h.AbstractC0763b
        /* renamed from: a */
        public final void mo1122a(AbstractC0763b.AbstractC0765b bVar) {
            this.f1156c = bVar;
            this.f1151a.setVisibilityListener(this);
        }

        public ActionProvider$VisibilityListenerC0314a(Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.appcompat.view.menu.MenuItemC0308k
    /* renamed from: a */
    public final MenuItemC0308k.C0309a mo1059a(ActionProvider actionProvider) {
        return new ActionProvider$VisibilityListenerC0314a(this.f1028a, actionProvider);
    }

    C0313l(Context context, AbstractMenuItemC0566b bVar) {
        super(context, bVar);
    }
}
