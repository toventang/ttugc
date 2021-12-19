package androidx.appcompat.view;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.AbstractC0274b;
import androidx.appcompat.view.menu.C0322q;
import androidx.core.p028a.p029a.AbstractMenuC0565a;
import androidx.core.p028a.p029a.AbstractMenuItemC0566b;
import androidx.p025c.C0497g;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

/* renamed from: androidx.appcompat.view.f */
public final class C0279f extends ActionMode {

    /* renamed from: a */
    final Context f906a;

    /* renamed from: b */
    final AbstractC0274b f907b;

    static {
        Covode.recordClassIndex(313);
    }

    public final void finish() {
        this.f907b.mo621c();
    }

    public final View getCustomView() {
        return this.f907b.mo627i();
    }

    public final MenuInflater getMenuInflater() {
        return this.f907b.mo613a();
    }

    public final CharSequence getSubtitle() {
        return this.f907b.mo625g();
    }

    public final Object getTag() {
        return this.f907b.f892c;
    }

    public final CharSequence getTitle() {
        return this.f907b.mo624f();
    }

    public final boolean getTitleOptionalHint() {
        return this.f907b.f893d;
    }

    public final void invalidate() {
        this.f907b.mo622d();
    }

    public final boolean isTitleOptional() {
        return this.f907b.mo626h();
    }

    public final Menu getMenu() {
        return C0322q.m1211a(this.f906a, (AbstractMenuC0565a) this.f907b.mo618b());
    }

    public final void setCustomView(View view) {
        this.f907b.mo615a(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i) {
        this.f907b.mo619b(i);
    }

    public final void setTag(Object obj) {
        this.f907b.f892c = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i) {
        this.f907b.mo614a(i);
    }

    public final void setTitleOptionalHint(boolean z) {
        this.f907b.mo617a(z);
    }

    /* renamed from: androidx.appcompat.view.f$a */
    public static class C0280a implements AbstractC0274b.AbstractC0275a {

        /* renamed from: a */
        final ActionMode.Callback f908a;

        /* renamed from: b */
        final Context f909b;

        /* renamed from: c */
        final ArrayList<C0279f> f910c = new ArrayList<>();

        /* renamed from: d */
        final C0497g<Menu, Menu> f911d = new C0497g<>();

        static {
            Covode.recordClassIndex(314);
        }

        @Override // androidx.appcompat.view.AbstractC0274b.AbstractC0275a
        /* renamed from: a */
        public final void mo561a(AbstractC0274b bVar) {
            this.f908a.onDestroyActionMode(mo766b(bVar));
        }

        /* renamed from: a */
        private Menu m980a(Menu menu) {
            Menu menu2 = this.f911d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            Menu a = C0322q.m1211a(this.f909b, (AbstractMenuC0565a) menu);
            this.f911d.put(menu, a);
            return a;
        }

        /* renamed from: b */
        public final ActionMode mo766b(AbstractC0274b bVar) {
            int size = this.f910c.size();
            for (int i = 0; i < size; i++) {
                C0279f fVar = this.f910c.get(i);
                if (fVar != null && fVar.f907b == bVar) {
                    return fVar;
                }
            }
            C0279f fVar2 = new C0279f(this.f909b, bVar);
            this.f910c.add(fVar2);
            return fVar2;
        }

        @Override // androidx.appcompat.view.AbstractC0274b.AbstractC0275a
        /* renamed from: b */
        public final boolean mo564b(AbstractC0274b bVar, Menu menu) {
            return this.f908a.onPrepareActionMode(mo766b(bVar), m980a(menu));
        }

        public C0280a(Context context, ActionMode.Callback callback) {
            this.f909b = context;
            this.f908a = callback;
        }

        @Override // androidx.appcompat.view.AbstractC0274b.AbstractC0275a
        /* renamed from: a */
        public final boolean mo562a(AbstractC0274b bVar, Menu menu) {
            return this.f908a.onCreateActionMode(mo766b(bVar), m980a(menu));
        }

        @Override // androidx.appcompat.view.AbstractC0274b.AbstractC0275a
        /* renamed from: a */
        public final boolean mo563a(AbstractC0274b bVar, MenuItem menuItem) {
            return this.f908a.onActionItemClicked(mo766b(bVar), C0322q.m1212a(this.f909b, (AbstractMenuItemC0566b) menuItem));
        }
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f907b.mo616a(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f907b.mo620b(charSequence);
    }

    public C0279f(Context context, AbstractC0274b bVar) {
        this.f906a = context;
        this.f907b = bVar;
    }
}
