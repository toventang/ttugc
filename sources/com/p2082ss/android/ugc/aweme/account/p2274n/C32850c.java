package com.p2082ss.android.ugc.aweme.account.p2274n;

import android.text.InputFilter;
import android.widget.EditText;
import com.bytedance.covode.number.Covode;
import java.util.Objects;
import p4600h.p4601a.C89064i;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4621l.C89309k;

/* renamed from: com.ss.android.ugc.aweme.account.n.c */
public final class C32850c {

    /* renamed from: a */
    public static final C32850c f78224a = new C32850c();

    private C32850c() {
    }

    static {
        Covode.recordClassIndex(39635);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.n.c$a */
    public static final class C32851a extends AbstractC89220m implements AbstractC89172b<InputFilter, Boolean> {

        /* renamed from: a */
        public static final C32851a f78225a = new C32851a();

        static {
            Covode.recordClassIndex(39636);
        }

        C32851a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(InputFilter inputFilter) {
            return Boolean.valueOf(!(inputFilter instanceof InputFilter.LengthFilter));
        }
    }

    /* renamed from: a */
    public static final void m67444a(EditText editText, int i) {
        Object[] array;
        if (editText != null && i >= 0) {
            InputFilter[] filters = editText.getFilters();
            C89219l.m154716b(filters, "");
            if (filters.length == 0) {
                array = new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(i)};
            } else {
                InputFilter[] filters2 = editText.getFilters();
                C89219l.m154716b(filters2, "");
                array = C89309k.m154813g(C89309k.m154801a(C89309k.m154799a(C89064i.m154514o(filters2), (AbstractC89172b) C32851a.f78225a), new InputFilter.LengthFilter(i))).toArray(new InputFilter[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            }
            editText.setFilters((InputFilter[]) array);
        }
    }
}
