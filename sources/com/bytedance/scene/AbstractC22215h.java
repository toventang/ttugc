package com.bytedance.scene;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.scene.C22268t;
import com.bytedance.scene.navigation.C22239d;
import java.util.Objects;

/* renamed from: com.bytedance.scene.h */
public abstract class AbstractC22215h extends FrameLayout {

    /* renamed from: a */
    public C22239d f52524a;

    /* renamed from: b */
    public final C22264q<C22239d> f52525b = new C22264q<>();

    /* renamed from: c */
    private AbstractC22231l f52526c;

    /* renamed from: d */
    private C22268t.AbstractC22270a f52527d = new C22268t.AbstractC22270a() {
        /* class com.bytedance.scene.AbstractC22215h.C222161 */

        static {
            Covode.recordClassIndex(26022);
        }

        @Override // com.bytedance.scene.C22268t.AbstractC22270a
        /* renamed from: a */
        public final C22268t mo36467a() {
            return C22268t.f52675a.mo36467a();
        }
    };

    static {
        Covode.recordClassIndex(26021);
    }

    public C22239d getNavigationScene() {
        return this.f52524a;
    }

    /* renamed from: a */
    public final void mo36462a() {
        Objects.requireNonNull(this.f52524a, "NavigationScene is null");
        Context context = getContext();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                break;
            } else if (context instanceof Activity) {
                Activity activity = (Activity) context;
                if (activity != null) {
                    this.f52524a.f52595a = this.f52526c;
                    this.f52525b.mo36574a(activity, this, this.f52524a, this.f52527d, false, null);
                    return;
                }
            } else {
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        throw new IllegalStateException("cant find Activity attached to this View");
    }

    public void setNavigationScene(C22239d dVar) {
        this.f52524a = dVar;
    }

    public void setRootSceneComponentFactory(AbstractC22231l lVar) {
        this.f52526c = lVar;
    }

    public void setRootScopeFactory(C22268t.AbstractC22270a aVar) {
        this.f52527d = aVar;
    }

    public AbstractC22215h(Context context, AttributeSet attributeSet, int i) {
        super(context, null, 0);
    }
}
