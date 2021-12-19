package com.p2082ss.android.ugc.aweme.specact.popup.p3943b;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.specact.popup.p3943b.C75153e;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.specact.popup.b.f */
public final class C75160f extends ArrayAdapter<C75153e.C75159e> {

    /* renamed from: a */
    public static final C75161a f169004a = new C75161a((byte) 0);

    /* renamed from: b */
    private final int f169005b = R.layout.b0j;

    static {
        Covode.recordClassIndex(88036);
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.popup.b.f$a */
    public static final class C75161a {
        static {
            Covode.recordClassIndex(88037);
        }

        private C75161a() {
        }

        public /* synthetic */ C75161a(byte b) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C75160f(Context context, C75153e.C75159e[] eVarArr) {
        super(context, (int) R.layout.b0j, eVarArr);
        C89219l.m154721d(context, "");
        C89219l.m154721d(eVarArr, "");
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(LayoutInflater.from(getContext()), this.f169005b, viewGroup, false);
        C75153e.C75159e eVar = (C75153e.C75159e) getItem(i);
        if (eVar == null) {
            C89219l.m154716b(a, "");
            return a;
        }
        C89219l.m154716b(eVar, "");
        TuxTextView tuxTextView = (TuxTextView) a.findViewById(R.id.c27);
        TuxTextView tuxTextView2 = (TuxTextView) a.findViewById(R.id.fb8);
        View findViewById = a.findViewById(R.id.c9i);
        C89219l.m154716b(tuxTextView, "");
        tuxTextView.setText(eVar.f169001a);
        C89219l.m154716b(tuxTextView2, "");
        tuxTextView2.setText(eVar.f169002b);
        if (i == getCount() - 1) {
            C89219l.m154716b(findViewById, "");
            findViewById.setVisibility(4);
        }
        if (eVar.f169003c) {
            tuxTextView.setTuxFont(63);
            tuxTextView2.setTuxFont(63);
            tuxTextView.setTypeface(Typeface.defaultFromStyle(1));
            tuxTextView2.setTypeface(Typeface.defaultFromStyle(1));
            tuxTextView.setTextSize(15.0f);
            tuxTextView2.setTextSize(15.0f);
        }
        C89219l.m154716b(a, "");
        return a;
    }
}
