package androidx.appcompat.view.menu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.view.menu.C0302h;
import androidx.appcompat.widget.C0405al;
import com.bytedance.covode.number.Covode;

public final class ExpandedMenuView extends ListView implements AdapterView.OnItemClickListener, C0302h.AbstractC0304b, AbstractC0320p {

    /* renamed from: a */
    private static final int[] f975a = {16842964, 16843049};

    /* renamed from: b */
    private C0302h f976b;

    /* renamed from: c */
    private int f977c;

    public final int getWindowAnimations() {
        return this.f977c;
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    static {
        Covode.recordClassIndex(324);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0320p
    /* renamed from: a */
    public final void mo817a(C0302h hVar) {
        this.f976b = hVar;
    }

    @Override // androidx.appcompat.view.menu.C0302h.AbstractC0304b
    /* renamed from: a */
    public final boolean mo818a(C0306j jVar) {
        return this.f976b.mo957a(jVar, (AbstractC0318o) null, 0);
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private ExpandedMenuView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C0405al a = C0405al.m1466a(context, attributeSet, f975a, 16842868, 0);
        if (a.mo1837f(0)) {
            setBackgroundDrawable(a.mo1826a(0));
        }
        if (a.mo1837f(1)) {
            setDivider(a.mo1826a(1));
        }
        a.f1585a.recycle();
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        mo818a((C0306j) getAdapter().getItem(i));
    }
}
