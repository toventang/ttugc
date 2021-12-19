package com.p2082ss.android.ugc.aweme.utils;

import android.text.Editable;
import android.text.TextWatcher;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.DmtEditText;
import p4560f.p4561a.AbstractC88982v;
import p4560f.p4561a.AbstractC88983w;
import p4560f.p4561a.p4567d.AbstractC88428a;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.aweme.utils.hs */
public final class C80547hs {
    static {
        Covode.recordClassIndex(93820);
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.hs$a */
    public static final class C80548a implements AbstractC88428a {

        /* renamed from: a */
        final /* synthetic */ DmtEditText f180157a;

        /* renamed from: b */
        final /* synthetic */ C80550c f180158b;

        static {
            Covode.recordClassIndex(93821);
        }

        public C80548a(DmtEditText dmtEditText, C80550c cVar) {
            this.f180157a = dmtEditText;
            this.f180158b = cVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88428a
        /* renamed from: a */
        public final void mo8579a() {
            this.f180157a.removeTextChangedListener(this.f180158b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.hs$c */
    public static final class C80550c implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ C89233z.C89238e f180160a;

        static {
            Covode.recordClassIndex(93823);
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public C80550c(C89233z.C89238e eVar) {
            this.f180160a = eVar;
        }

        public final void afterTextChanged(Editable editable) {
            T t;
            if (editable != null && (t = this.f180160a.element) != null) {
                t.mo143031a(editable.toString());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.hs$b */
    public static final class C80549b<T> implements AbstractC88983w {

        /* renamed from: a */
        final /* synthetic */ C89233z.C89238e f180159a;

        static {
            Covode.recordClassIndex(93822);
        }

        public C80549b(C89233z.C89238e eVar) {
            this.f180159a = eVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: f.a.v<java.lang.String> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // p4560f.p4561a.AbstractC88983w
        public final void subscribe(AbstractC88982v<String> vVar) {
            C89219l.m154721d(vVar, "");
            this.f180159a.element = vVar;
        }
    }
}
