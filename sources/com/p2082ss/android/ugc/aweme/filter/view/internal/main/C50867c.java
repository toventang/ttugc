package com.p2082ss.android.ugc.aweme.filter.view.internal.main;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.filter.view.internal.AbstractC50825a;
import com.p2082ss.android.ugc.aweme.filter.view.p2989a.AbstractC50823i;
import com.p2082ss.android.ugc.trill.R;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4568e.p4570b.C88446a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.c */
public final class C50867c implements AbstractC50825a {

    /* renamed from: a */
    public View.OnClickListener f117353a;

    /* renamed from: b */
    public View f117354b;

    /* renamed from: c */
    public final Object f117355c = new Object();

    /* renamed from: d */
    private final C88411a f117356d = new C88411a();

    /* renamed from: e */
    private final Context f117357e;

    /* renamed from: f */
    private final AbstractC50823i f117358f;

    static {
        Covode.recordClassIndex(60042);
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.view.internal.AbstractC50825a
    /* renamed from: a */
    public final void mo86202a() {
        MethodCollector.m26663i(1716);
        FrameLayout frameLayout = new FrameLayout(this.f117357e);
        View a = C1764a.m5927a(LayoutInflater.from(this.f117357e), R.layout.ed, this.f117358f.mo86190e(), false);
        if (a == null) {
            C89219l.m154715b();
        }
        frameLayout.addView(a, new FrameLayout.LayoutParams(-2, -2, 17));
        this.f117354b = frameLayout;
        this.f117358f.mo86186a(frameLayout, this.f117355c);
        this.f117356d.mo142945a(this.f117358f.mo86192g().mo143254a(new C50868a(this), C88446a.f200699e));
        MethodCollector.m26664o(1716);
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.view.internal.AbstractC50825a
    /* renamed from: a */
    public final void mo86203a(View.OnClickListener onClickListener) {
        C89219l.m154721d(onClickListener, "");
        this.f117353a = onClickListener;
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.c$a */
    static final class C50868a<T> implements AbstractC88433f<Object> {

        /* renamed from: a */
        final /* synthetic */ C50867c f117359a;

        static {
            Covode.recordClassIndex(60043);
        }

        C50868a(C50867c cVar) {
            this.f117359a = cVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final void accept(Object obj) {
            View.OnClickListener onClickListener;
            if (obj == this.f117359a.f117355c && (onClickListener = this.f117359a.f117353a) != null) {
                View view = this.f117359a.f117354b;
                if (view == null) {
                    C89219l.m154710a("entranceView");
                }
                onClickListener.onClick(view);
            }
        }
    }

    public C50867c(Context context, AbstractC50823i iVar) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(iVar, "");
        this.f117357e = context;
        this.f117358f = iVar;
    }
}
