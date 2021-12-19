package com.p2082ss.android.ugc.aweme.journey;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.journey.p3291a.C56834a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.journey.d */
public final class C56852d extends AbstractC56854e {

    /* renamed from: a */
    public static final C56853a f129462a = new C56853a((byte) 0);

    static {
        Covode.recordClassIndex(66737);
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.d$a */
    public static final class C56853a {
        static {
            Covode.recordClassIndex(66738);
        }

        private C56853a() {
        }

        public /* synthetic */ C56853a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C56852d m103099a(ViewGroup viewGroup, String str, String str2) {
            C89219l.m154721d(viewGroup, "");
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.abb, viewGroup, false);
            C89219l.m154716b(a, "");
            ((TuxTextView) a.findViewById(R.id.bek)).mo37697a(38.0f);
            return new C56852d(a, str, str2);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C56852d(View view, String str, String str2) {
        super(view, str);
        C89219l.m154721d(view, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        if (TextUtils.isEmpty(str)) {
            TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.bek);
            C89219l.m154716b(tuxTextView, "");
            tuxTextView.setVisibility(8);
        } else {
            TuxTextView tuxTextView2 = (TuxTextView) view.findViewById(R.id.bek);
            C89219l.m154716b(tuxTextView2, "");
            tuxTextView2.setText(str);
            TuxTextView tuxTextView3 = (TuxTextView) view.findViewById(R.id.bek);
            C89219l.m154716b(tuxTextView3, "");
            C56834a.m103085a(tuxTextView3);
        }
        if (TextUtils.isEmpty(str2)) {
            TuxTextView tuxTextView4 = (TuxTextView) view.findViewById(R.id.dtf);
            C89219l.m154716b(tuxTextView4, "");
            tuxTextView4.setVisibility(8);
            return;
        }
        TuxTextView tuxTextView5 = (TuxTextView) view.findViewById(R.id.dtf);
        C89219l.m154716b(tuxTextView5, "");
        tuxTextView5.setText(str2);
        TuxTextView tuxTextView6 = (TuxTextView) view.findViewById(R.id.dtf);
        C89219l.m154716b(tuxTextView6, "");
        C56834a.m103085a(tuxTextView6);
    }
}
