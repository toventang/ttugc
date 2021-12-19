package com.bytedance.creativex.recorder.filter.p944c;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.filter.view.widget.CompositeFilterIndicator;
import com.bytedance.scene.AbstractC22219j;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.creativex.recorder.filter.c.c */
public final class C14241c extends AbstractC22219j {

    /* renamed from: b */
    public static final C14242a f34532b = new C14242a((byte) 0);

    /* renamed from: a */
    CompositeFilterIndicator f34533a;

    static {
        Covode.recordClassIndex(16310);
    }

    /* renamed from: com.bytedance.creativex.recorder.filter.c.c$a */
    public static final class C14242a {
        static {
            Covode.recordClassIndex(16311);
        }

        private C14242a() {
        }

        public /* synthetic */ C14242a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final View mo22702a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C89219l.m154721d(layoutInflater, "");
        C89219l.m154721d(viewGroup, "");
        Activity t = mo36486t();
        C89219l.m154716b(t, "");
        View a = C1764a.m5927a(t.getLayoutInflater(), R.layout.bhx, viewGroup, false);
        C89219l.m154716b(a, "");
        return a;
    }
}
