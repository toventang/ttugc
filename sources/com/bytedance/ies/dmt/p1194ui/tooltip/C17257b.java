package com.bytedance.ies.dmt.p1194ui.tooltip;

import android.content.Context;
import android.view.View;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.dmt.ui.tooltip.b */
public final class C17257b {

    /* renamed from: c */
    public static final C17258a f41225c = new C17258a((byte) 0);

    /* renamed from: a */
    public final C17261c f41226a = new C17261c();

    /* renamed from: b */
    public final Context f41227b;

    /* renamed from: d */
    private AbstractC17256a f41228d;

    /* renamed from: com.bytedance.ies.dmt.ui.tooltip.b$b */
    public interface AbstractC17259b {
        static {
            Covode.recordClassIndex(19727);
        }

        /* renamed from: a */
        void mo27360a();
    }

    /* renamed from: com.bytedance.ies.dmt.ui.tooltip.b$c */
    public interface AbstractC17260c {
        static {
            Covode.recordClassIndex(19728);
        }

        /* renamed from: a */
        void mo27361a();
    }

    static {
        Covode.recordClassIndex(19725);
    }

    /* renamed from: com.bytedance.ies.dmt.ui.tooltip.b$a */
    public static final class C17258a {
        static {
            Covode.recordClassIndex(19726);
        }

        private C17258a() {
        }

        public /* synthetic */ C17258a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final AbstractC17256a mo27350a() {
        AbstractC17256a aVar = this.f41228d;
        if (aVar != null) {
            return aVar;
        }
        if (this.f41226a.f41237f != null) {
            return new C17265e(this.f41227b, this.f41226a);
        }
        return new ToolTipPopupWindow(this.f41227b, this.f41226a);
    }

    /* renamed from: a */
    public final C17257b mo27352a(long j) {
        this.f41226a.f41242k = j;
        return this;
    }

    /* renamed from: b */
    public final C17257b mo27358b(int i) {
        this.f41226a.f41238g = i;
        return this;
    }

    /* renamed from: c */
    public final C17257b mo27359c(int i) {
        this.f41226a.f41234c = i;
        return this;
    }

    /* renamed from: a */
    public final C17257b mo27353a(View.OnClickListener onClickListener) {
        this.f41226a.f41255x = true;
        this.f41226a.f41254w = onClickListener;
        return this;
    }

    public C17257b(Context context) {
        C89219l.m154721d(context, "");
        this.f41227b = context;
    }

    /* renamed from: a */
    public final C17257b mo27351a(int i) {
        C17261c cVar = this.f41226a;
        String string = this.f41227b.getResources().getString(i);
        C89219l.m154716b(string, "");
        cVar.mo27362a(string);
        return this;
    }

    /* renamed from: a */
    public final C17257b mo27354a(View view) {
        C89219l.m154721d(view, "");
        this.f41226a.f41236e = view;
        return this;
    }

    /* renamed from: a */
    public final C17257b mo27355a(AbstractC17259b bVar) {
        C89219l.m154721d(bVar, "");
        this.f41226a.f41256y = bVar;
        return this;
    }

    /* renamed from: a */
    public final C17257b mo27356a(CharSequence charSequence) {
        C89219l.m154721d(charSequence, "");
        this.f41226a.mo27362a(charSequence);
        return this;
    }

    /* renamed from: a */
    public final C17257b mo27357a(boolean z) {
        this.f41226a.f41253v = z;
        return this;
    }
}
