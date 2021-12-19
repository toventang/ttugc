package androidx.appcompat.view;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.AbstractC0274b;
import androidx.appcompat.view.menu.C0302h;
import androidx.appcompat.widget.ActionBarContextView;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;

/* renamed from: androidx.appcompat.view.e */
public final class C0278e extends AbstractC0274b implements C0302h.AbstractC0303a {

    /* renamed from: a */
    private Context f899a;

    /* renamed from: b */
    private ActionBarContextView f900b;

    /* renamed from: e */
    private AbstractC0274b.AbstractC0275a f901e;

    /* renamed from: f */
    private WeakReference<View> f902f;

    /* renamed from: g */
    private boolean f903g;

    /* renamed from: h */
    private boolean f904h;

    /* renamed from: i */
    private C0302h f905i;

    static {
        Covode.recordClassIndex(312);
    }

    @Override // androidx.appcompat.view.AbstractC0274b
    /* renamed from: b */
    public final Menu mo618b() {
        return this.f905i;
    }

    @Override // androidx.appcompat.view.AbstractC0274b
    /* renamed from: d */
    public final void mo622d() {
        this.f901e.mo564b(this, this.f905i);
    }

    @Override // androidx.appcompat.view.AbstractC0274b
    /* renamed from: f */
    public final CharSequence mo624f() {
        return this.f900b.getTitle();
    }

    @Override // androidx.appcompat.view.AbstractC0274b
    /* renamed from: g */
    public final CharSequence mo625g() {
        return this.f900b.getSubtitle();
    }

    @Override // androidx.appcompat.view.AbstractC0274b
    /* renamed from: h */
    public final boolean mo626h() {
        return this.f900b.f1207g;
    }

    @Override // androidx.appcompat.view.AbstractC0274b
    /* renamed from: a */
    public final MenuInflater mo613a() {
        return new C0281g(this.f900b.getContext());
    }

    @Override // androidx.appcompat.view.AbstractC0274b
    /* renamed from: i */
    public final View mo627i() {
        WeakReference<View> weakReference = this.f902f;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // androidx.appcompat.view.AbstractC0274b
    /* renamed from: c */
    public final void mo621c() {
        if (!this.f903g) {
            this.f903g = true;
            this.f900b.sendAccessibilityEvent(32);
            this.f901e.mo561a(this);
        }
    }

    @Override // androidx.appcompat.view.AbstractC0274b
    /* renamed from: a */
    public final void mo616a(CharSequence charSequence) {
        this.f900b.setSubtitle(charSequence);
    }

    @Override // androidx.appcompat.view.AbstractC0274b
    /* renamed from: b */
    public final void mo620b(CharSequence charSequence) {
        this.f900b.setTitle(charSequence);
    }

    @Override // androidx.appcompat.view.AbstractC0274b
    /* renamed from: b */
    public final void mo619b(int i) {
        mo616a(this.f899a.getString(i));
    }

    @Override // androidx.appcompat.view.AbstractC0274b
    /* renamed from: a */
    public final void mo614a(int i) {
        mo620b(this.f899a.getString(i));
    }

    @Override // androidx.appcompat.view.AbstractC0274b
    /* renamed from: a */
    public final void mo615a(View view) {
        WeakReference<View> weakReference;
        this.f900b.setCustomView(view);
        if (view != null) {
            weakReference = new WeakReference<>(view);
        } else {
            weakReference = null;
        }
        this.f902f = weakReference;
    }

    @Override // androidx.appcompat.view.menu.C0302h.AbstractC0303a
    /* renamed from: a */
    public final void mo536a(C0302h hVar) {
        mo622d();
        this.f900b.mo1202a();
    }

    @Override // androidx.appcompat.view.AbstractC0274b
    /* renamed from: a */
    public final void mo617a(boolean z) {
        super.mo617a(z);
        this.f900b.setTitleOptional(z);
    }

    @Override // androidx.appcompat.view.menu.C0302h.AbstractC0303a
    /* renamed from: a */
    public final boolean mo539a(C0302h hVar, MenuItem menuItem) {
        return this.f901e.mo563a(this, menuItem);
    }

    public C0278e(Context context, ActionBarContextView actionBarContextView, AbstractC0274b.AbstractC0275a aVar, boolean z) {
        this.f899a = context;
        this.f900b = actionBarContextView;
        this.f901e = aVar;
        C0302h hVar = new C0302h(actionBarContextView.getContext());
        hVar.f1094f = 1;
        this.f905i = hVar;
        hVar.mo953a(this);
        this.f904h = z;
    }
}
