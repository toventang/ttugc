package androidx.appcompat.app;

import android.view.View;
import androidx.appcompat.p019b.p020a.C0269d;
import androidx.drawerlayout.widget.DrawerLayout;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.appcompat.app.b */
public final class C0214b implements DrawerLayout.AbstractC0843c {

    /* renamed from: a */
    public C0269d f638a;

    /* renamed from: b */
    public boolean f639b;

    /* renamed from: c */
    public boolean f640c;

    /* renamed from: d */
    private final AbstractC0215a f641d;

    /* renamed from: e */
    private final int f642e;

    /* renamed from: f */
    private final int f643f;

    /* renamed from: androidx.appcompat.app.b$a */
    public interface AbstractC0215a {
        static {
            Covode.recordClassIndex(249);
        }

        /* renamed from: a */
        void mo439a(int i);
    }

    static {
        Covode.recordClassIndex(248);
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.AbstractC0843c
    public final void onDrawerStateChanged(int i) {
    }

    /* renamed from: a */
    private void m659a(int i) {
        this.f641d.mo439a(i);
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.AbstractC0843c
    public final void onDrawerClosed(View view) {
        m658a(0.0f);
        if (this.f640c) {
            m659a(this.f642e);
        }
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.AbstractC0843c
    public final void onDrawerOpened(View view) {
        m658a(1.0f);
        if (this.f640c) {
            m659a(this.f643f);
        }
    }

    /* renamed from: a */
    private void m658a(float f) {
        if (f == 1.0f) {
            this.f638a.mo728a(true);
        } else if (f == 0.0f) {
            this.f638a.mo728a(false);
        }
        this.f638a.mo727a(f);
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.AbstractC0843c
    public final void onDrawerSlide(View view, float f) {
        if (this.f639b) {
            m658a(Math.min(1.0f, Math.max(0.0f, f)));
        } else {
            m658a(0.0f);
        }
    }
}
