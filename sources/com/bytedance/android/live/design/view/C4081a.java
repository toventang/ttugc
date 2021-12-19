package com.bytedance.android.live.design.view;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.live.design.view.C4094h;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.live.design.view.a */
public final class C4081a extends C4094h {
    static {
        Covode.recordClassIndex(4625);
    }

    /* renamed from: com.bytedance.android.live.design.view.a$a */
    public static class C4082a extends C4094h.C4095a<C4082a> {

        /* renamed from: a */
        public CharSequence f11288a;

        static {
            Covode.recordClassIndex(4626);
        }

        /* renamed from: a */
        public final C4081a mo9530b() {
            return new C4081a(this);
        }

        public C4082a(View view) {
            super(view);
        }

        /* Return type fixed from 'com.bytedance.android.live.design.view.h$a' to match base method */
        @Override // com.bytedance.android.live.design.view.C4094h.C4095a
        /* renamed from: a */
        public final /* synthetic */ C4082a mo9529a(View view) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: a */
        public final C4082a mo9527a(int i) {
            if (this.f11347b != null) {
                this.f11288a = this.f11347b.getResources().getString(i);
            }
            return this;
        }
    }

    protected C4081a(C4082a aVar) {
        super(aVar);
        MethodCollector.m26663i(9068);
        if (this.f11336a != null && !TextUtils.isEmpty(aVar.f11288a)) {
            TextView textView = (TextView) LayoutInflater.from(this.f11336a).inflate(R.layout.bbe, (ViewGroup) null);
            textView.setText(aVar.f11288a);
            this.f11338c = textView;
        }
        MethodCollector.m26664o(9068);
    }
}
