package com.p2082ss.android.ugc.aweme.tools.beauty.p4084a;

import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.core.p037h.C0726a;
import androidx.core.p037h.p038a.C0733d;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.p3840m.C71977b;
import com.p2082ss.android.ugc.aweme.tools.beauty.views.SwitchButton;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.beauty.a.g */
public final class C77835g extends RecyclerView.ViewHolder {

    /* renamed from: g */
    public static final C77836a f174617g = new C77836a((byte) 0);

    /* renamed from: a */
    final SwitchButton f174618a;

    /* renamed from: b */
    public final TextView f174619b;

    /* renamed from: c */
    final View f174620c;

    /* renamed from: d */
    public AbstractC89183m<? super String, ? super Boolean, C89391z> f174621d;

    /* renamed from: e */
    public C77834f f174622e;

    /* renamed from: f */
    public final C77818a f174623f;

    /* renamed from: h */
    private final AbstractC89244h f174624h;

    /* renamed from: i */
    private final AbstractC89244h f174625i;

    static {
        Covode.recordClassIndex(90922);
    }

    /* renamed from: a */
    public final String mo121449a() {
        return (String) this.f174624h.getValue();
    }

    /* renamed from: b */
    public final String mo121450b() {
        return (String) this.f174625i.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.a.g$a */
    public static final class C77836a {
        static {
            Covode.recordClassIndex(90923);
        }

        private C77836a() {
        }

        public /* synthetic */ C77836a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.a.g$d */
    static final class C77839d extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ View f174628a;

        static {
            Covode.recordClassIndex(90926);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77839d(View view) {
            super(0);
            this.f174628a = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            return this.f174628a.getContext().getString(C71977b.f161298d);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.a.g$e */
    static final class C77840e extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ View f174629a;

        static {
            Covode.recordClassIndex(90927);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77840e(View view) {
            super(0);
            this.f174629a = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            return this.f174629a.getContext().getString(C71977b.f161297c);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.a.g$c */
    public static final class C77838c extends C0726a {

        /* renamed from: b */
        final /* synthetic */ C77835g f174627b;

        static {
            Covode.recordClassIndex(90925);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C77838c(C77835g gVar) {
            this.f174627b = gVar;
        }

        @Override // androidx.core.p037h.C0726a
        /* renamed from: a */
        public final void mo2808a(View view, C0733d dVar) {
            super.mo2808a(view, dVar);
            if (dVar != null) {
                StringBuilder sb = new StringBuilder();
                View view2 = this.f174627b.itemView;
                C89219l.m154716b(view2, "");
                StringBuilder append = sb.append(view2.getResources().getString(R.string.a3p));
                TextView textView = this.f174627b.f174619b;
                C89219l.m154716b(textView, "");
                dVar.mo2840b(append.append(textView.getText()).toString());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.a.g$b */
    static final class C77837b implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ C77835g f174626a;

        static {
            Covode.recordClassIndex(90924);
        }

        C77837b(C77835g gVar) {
            this.f174626a = gVar;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            AbstractC89183m<? super String, ? super Boolean, C89391z> mVar;
            if (z) {
                TextView textView = this.f174626a.f174619b;
                C89219l.m154716b(textView, "");
                textView.setText(this.f174626a.mo121449a());
            } else {
                TextView textView2 = this.f174626a.f174619b;
                C89219l.m154716b(textView2, "");
                textView2.setText(this.f174626a.mo121450b());
            }
            if (this.f174626a.f174623f.f174575f && (mVar = this.f174626a.f174621d) != null) {
                C77834f fVar = this.f174626a.f174622e;
                if (fVar == null) {
                    C89219l.m154710a("beautyListSwitch");
                }
                mVar.invoke(fVar.f174615c, Boolean.valueOf(z));
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C77835g(View view, C77818a aVar) {
        super(view);
        C89219l.m154721d(view, "");
        C89219l.m154721d(aVar, "");
        this.f174623f = aVar;
        this.f174618a = (SwitchButton) view.findViewById(R.id.dp6);
        this.f174619b = (TextView) view.findViewById(R.id.esx);
        this.f174620c = view.findViewById(R.id.b3j);
        this.f174624h = C89250i.m154773a((AbstractC89171a) new C77840e(view));
        this.f174625i = C89250i.m154773a((AbstractC89171a) new C77839d(view));
    }
}
