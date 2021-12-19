package com.bytedance.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import androidx.lifecycle.C1205n;
import com.bytedance.covode.number.Covode;
import com.bytedance.widget.C23669c;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4620k.AbstractC89286i;

public class Widget implements AbstractC1204m, AbstractC33974au {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f56001a = {new C89232y(C89204ab.m154669a(Widget.class), "lifecycleRegistry", "getLifecycleRegistry()Landroidx/lifecycle/LifecycleRegistry;"), new C89232y(C89204ab.m154669a(Widget.class), "childWidgetManager", "getChildWidgetManager$widget_release()Lcom/bytedance/widget/WidgetManager;")};

    /* renamed from: b */
    public C23666b f56002b;

    /* renamed from: c */
    public boolean f56003c;

    /* renamed from: d */
    protected ViewGroup f56004d;

    /* renamed from: e */
    public View f56005e;

    /* renamed from: f */
    public boolean f56006f = true;

    /* renamed from: g */
    private final AbstractC89244h f56007g = C89250i.m154773a((AbstractC89171a) new C23664b(this));

    /* renamed from: h */
    private final AbstractC89244h f56008h = C89250i.m154773a((AbstractC89171a) new C23663a(this));

    /* renamed from: k */
    private final C1205n mo60928k() {
        return (C1205n) this.f56007g.getValue();
    }

    /* renamed from: b */
    public int mo39079b() {
        return 0;
    }

    /* renamed from: c */
    public void mo39080c() {
        this.f56003c = false;
    }

    /* renamed from: e */
    public void mo39083e() {
    }

    /* renamed from: f */
    public void mo39084f() {
    }

    /* renamed from: g */
    public void mo39085g() {
    }

    /* renamed from: h */
    public void mo39086h() {
    }

    /* renamed from: i */
    public void mo39087i() {
        this.f56003c = true;
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_CREATE) {
            create$widget_release();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_START) {
            start$widget_release();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_RESUME) {
            resume$widget_release();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_PAUSE) {
            pause$widget_release();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_STOP) {
            stop$widget_release();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            destroy$widget_release();
        }
    }

    /* renamed from: com.bytedance.widget.Widget$b */
    static final class C23664b extends AbstractC89220m implements AbstractC89171a<C1205n> {

        /* renamed from: a */
        final /* synthetic */ Widget f56010a;

        static {
            Covode.recordClassIndex(27765);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23664b(Widget widget) {
            super(0);
            this.f56010a = widget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1205n invoke() {
            return new C1205n(this.f56010a);
        }
    }

    @Override // androidx.lifecycle.AbstractC1204m
    public AbstractC1196i getLifecycle() {
        return mo60928k();
    }

    /* renamed from: a */
    public final ViewGroup mo39077a() {
        ViewGroup viewGroup = this.f56004d;
        if (viewGroup == null) {
            C89219l.m154710a("container");
        }
        return viewGroup;
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_CREATE)
    public final void create$widget_release() {
        mo39080c();
        mo60928k().mo4016a(AbstractC1196i.EnumC1198a.ON_CREATE);
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public final void destroy$widget_release() {
        mo39087i();
        mo60928k().mo4016a(AbstractC1196i.EnumC1198a.ON_DESTROY);
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_PAUSE)
    public final void pause$widget_release() {
        mo39085g();
        mo60928k().mo4016a(AbstractC1196i.EnumC1198a.ON_PAUSE);
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_RESUME)
    public final void resume$widget_release() {
        mo39084f();
        mo60928k().mo4016a(AbstractC1196i.EnumC1198a.ON_RESUME);
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_START)
    public final void start$widget_release() {
        mo39083e();
        mo60928k().mo4016a(AbstractC1196i.EnumC1198a.ON_START);
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_STOP)
    public final void stop$widget_release() {
        mo39086h();
        mo60928k().mo4016a(AbstractC1196i.EnumC1198a.ON_STOP);
    }

    /* renamed from: com.bytedance.widget.Widget$a */
    static final class C23663a extends AbstractC89220m implements AbstractC89171a<C23669c> {

        /* renamed from: a */
        final /* synthetic */ Widget f56009a;

        static {
            Covode.recordClassIndex(27764);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23663a(Widget widget) {
            super(0);
            this.f56009a = widget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C23669c invoke() {
            return C23669c.C23671a.m44764a(this.f56009a.getLifecycle(), this.f56009a.mo39088j(), this.f56009a.f56005e);
        }
    }

    /* renamed from: j */
    public final C23666b mo39088j() {
        C23666b bVar = this.f56002b;
        if (bVar != null) {
            return bVar;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    static {
        Covode.recordClassIndex(27763);
    }

    /* renamed from: a */
    public final void mo39078a(ViewGroup viewGroup) {
        C89219l.m154719c(viewGroup, "");
        this.f56004d = viewGroup;
    }
}
