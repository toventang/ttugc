package com.bytedance.tux.tooltip;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.tooltip.AbstractC23332b;
import com.bytedance.tux.tooltip.C23342c;
import com.bytedance.tux.tooltip.p1730b.C23336a;
import com.bytedance.tux.tooltip.popup.TuxTooltipPopupWindow;
import p4600h.C89388w;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.tux.tooltip.b */
public abstract class AbstractC23332b<T extends AbstractC23332b<T>> {

    /* renamed from: a */
    public final C23346d f55300a = new C23346d();

    /* renamed from: b */
    public final Activity f55301b;

    /* renamed from: c */
    private AbstractC23317a f55302c;

    /* renamed from: com.bytedance.tux.tooltip.b$a */
    public interface AbstractC23333a {
        static {
            Covode.recordClassIndex(27286);
        }

        /* renamed from: a */
        void mo38047a();
    }

    static {
        Covode.recordClassIndex(27285);
    }

    /* renamed from: a */
    public final T mo38036a(boolean z) {
        this.f55300a.f55343v = z;
        return this;
    }

    /* renamed from: a */
    public final T mo38037a(boolean z, View.OnClickListener onClickListener) {
        this.f55300a.f55346y = z;
        this.f55300a.f55345x = onClickListener;
        return this;
    }

    /* renamed from: com.bytedance.tux.tooltip.b$b */
    public static final class C23334b implements C23342c.AbstractC23344b {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f55303a;

        static {
            Covode.recordClassIndex(27287);
        }

        @Override // com.bytedance.tux.tooltip.C23342c.AbstractC23344b
        /* renamed from: a */
        public final void mo38048a() {
            this.f55303a.invoke();
        }

        C23334b(AbstractC89171a aVar) {
            this.f55303a = aVar;
        }
    }

    /* renamed from: com.bytedance.tux.tooltip.b$c */
    public static final class C23335c implements C23342c.AbstractC23345c {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f55304a;

        static {
            Covode.recordClassIndex(27288);
        }

        @Override // com.bytedance.tux.tooltip.C23342c.AbstractC23345c
        public final void onShow() {
            this.f55304a.invoke();
        }

        C23335c(AbstractC89171a aVar) {
            this.f55304a = aVar;
        }
    }

    /* renamed from: a */
    public final T mo38027a() {
        this.f55300a.f55332k = true;
        return this;
    }

    /* renamed from: b */
    public final T mo38038b() {
        this.f55300a.f55335n = true;
        return this;
    }

    /* renamed from: d */
    public AbstractC23317a mo38012d() {
        AbstractC23317a aVar = this.f55302c;
        if (aVar != null) {
            return aVar;
        }
        if (this.f55300a.f55325d != null) {
            return new C23336a(this.f55301b, this.f55300a);
        }
        return new TuxTooltipPopupWindow(this.f55301b, this.f55300a);
    }

    /* renamed from: c */
    public final T mo38044c() {
        C23346d dVar = this.f55300a;
        Activity activity = this.f55301b;
        if (activity != null) {
            Window window = activity.getWindow();
            C89219l.m154709a((Object) window, "");
            View decorView = window.getDecorView();
            if (decorView != null) {
                dVar.f55325d = (ViewGroup) decorView;
                return this;
            }
            throw new C89388w("null cannot be cast to non-null type");
        }
        throw new C89388w("null cannot be cast to non-null type");
    }

    /* renamed from: c */
    public final T mo38045c(int i) {
        this.f55300a.f55329h = i;
        return this;
    }

    /* renamed from: d */
    public final T mo38046d(int i) {
        this.f55300a.f55331j = i;
        return this;
    }

    /* renamed from: a */
    public final T mo38028a(int i) {
        this.f55300a.f55323b = Integer.valueOf(i);
        return this;
    }

    /* renamed from: b */
    public final T mo38039b(int i) {
        this.f55300a.f55328g = i;
        return this;
    }

    /* renamed from: b */
    public final T mo38040b(long j) {
        this.f55300a.f55333l = j;
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0019, code lost:
        if (r1 == null) goto L_0x001b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001b, code lost:
        p4600h.p4611f.p4613b.C89219l.m154707a();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AbstractC23332b(android.content.Context r3) {
        /*
            r2 = this;
            java.lang.String r0 = ""
            p4600h.p4611f.p4613b.C89219l.m154719c(r3, r0)
            r2.<init>()
            com.bytedance.tux.tooltip.d r0 = new com.bytedance.tux.tooltip.d
            r0.<init>()
            r2.f55300a = r0
        L_0x000f:
            r1 = 0
            if (r3 == 0) goto L_0x001b
            boolean r0 = r3 instanceof android.app.Activity
            if (r0 == 0) goto L_0x0021
            r1 = r3
            android.app.Activity r1 = (android.app.Activity) r1
            if (r1 != 0) goto L_0x001e
        L_0x001b:
            p4600h.p4611f.p4613b.C89219l.m154707a()
        L_0x001e:
            r2.f55301b = r1
            return
        L_0x0021:
            boolean r0 = r3 instanceof android.content.ContextWrapper
            if (r0 == 0) goto L_0x001b
            android.content.ContextWrapper r3 = (android.content.ContextWrapper) r3
            android.content.Context r3 = r3.getBaseContext()
            goto L_0x000f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.tux.tooltip.AbstractC23332b.<init>(android.content.Context):void");
    }

    /* renamed from: a */
    public final T mo38030a(long j) {
        this.f55300a.f55330i = j;
        return this;
    }

    /* renamed from: b */
    public final T mo38041b(View view) {
        C89219l.m154719c(view, "");
        this.f55300a.f55324c = view;
        return this;
    }

    /* renamed from: a */
    public final T mo38031a(View view) {
        C89219l.m154719c(view, "");
        this.f55300a.f55342u = view;
        return this;
    }

    /* renamed from: b */
    public final T mo38042b(AbstractC89171a<C89391z> aVar) {
        C89219l.m154719c(aVar, "");
        this.f55300a.f55320A = new C23335c(aVar);
        return this;
    }

    /* renamed from: a */
    public final T mo38032a(AbstractC23333a aVar) {
        C89219l.m154719c(aVar, "");
        this.f55300a.f55338q = aVar;
        return this;
    }

    /* renamed from: b */
    public final T mo38043b(boolean z) {
        this.f55300a.f55344w = z;
        return this;
    }

    /* renamed from: a */
    public final T mo38033a(C23342c.AbstractC23345c cVar) {
        C89219l.m154719c(cVar, "");
        this.f55300a.f55320A = cVar;
        return this;
    }

    /* renamed from: a */
    public final T mo38034a(EnumC23352h hVar) {
        C89219l.m154719c(hVar, "");
        this.f55300a.mo38055a(hVar);
        return this;
    }

    /* renamed from: a */
    public final T mo38035a(AbstractC89171a<C89391z> aVar) {
        C89219l.m154719c(aVar, "");
        this.f55300a.f55347z = new C23334b(aVar);
        return this;
    }

    /* renamed from: a */
    public final T mo38029a(int i, int i2) {
        this.f55300a.f55339r = i;
        this.f55300a.f55340s = i2;
        return this;
    }
}
