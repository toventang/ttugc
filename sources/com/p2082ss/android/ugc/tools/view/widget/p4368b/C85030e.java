package com.p2082ss.android.ugc.tools.view.widget.p4368b;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.view.widget.b.e */
public final class C85030e {
    static {
        Covode.recordClassIndex(99051);
    }

    /* renamed from: com.ss.android.ugc.tools.view.widget.b.e$a */
    public static final class C85031a extends AbstractC89220m implements AbstractC89172b<ViewGroup, C85028c> {

        /* renamed from: a */
        public static final C85031a f190237a = new C85031a();

        static {
            Covode.recordClassIndex(99052);
        }

        C85031a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C85028c invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            C89219l.m154721d(viewGroup2, "");
            Context context = viewGroup2.getContext();
            C89219l.m154716b(context, "");
            return new C85028c(context, (byte) 0);
        }
    }

    /* renamed from: a */
    public static final C85028c m146192a(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        Context context = viewGroup.getContext();
        C89219l.m154716b(context, "");
        return new C85028c(context, (byte) 0);
    }

    /* renamed from: com.ss.android.ugc.tools.view.widget.b.e$b */
    public static final class C85032b extends AbstractC89220m implements AbstractC89172b<ViewGroup, TextView> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89172b f190238a = null;

        static {
            Covode.recordClassIndex(99053);
        }

        public C85032b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ TextView invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            C89219l.m154721d(viewGroup2, "");
            AbstractC89172b bVar = this.f190238a;
            C89219l.m154721d(viewGroup2, "");
            View a = C1764a.m5927a(LayoutInflater.from(viewGroup2.getContext()), R.layout.b33, viewGroup2, false);
            Objects.requireNonNull(a, "null cannot be cast to non-null type android.widget.TextView");
            TextView textView = (TextView) a;
            textView.setGravity(17);
            if (bVar != null) {
                bVar.invoke(textView);
            }
            return textView;
        }
    }

    /* renamed from: com.ss.android.ugc.tools.view.widget.b.e$c */
    public static final class C85033c extends AbstractC89220m implements AbstractC89172b<ViewGroup, TextView> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89172b f190239a;

        static {
            Covode.recordClassIndex(99054);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C85033c(AbstractC89172b bVar) {
            super(1);
            this.f190239a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ TextView invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            C89219l.m154721d(viewGroup2, "");
            AbstractC89172b bVar = this.f190239a;
            C89219l.m154721d(viewGroup2, "");
            View a = C1764a.m5927a(LayoutInflater.from(viewGroup2.getContext()), R.layout.b34, viewGroup2, false);
            Objects.requireNonNull(a, "null cannot be cast to non-null type android.widget.TextView");
            TextView textView = (TextView) a;
            textView.setText(R.string.cxh);
            textView.setGravity(17);
            if (bVar != null) {
                bVar.invoke(textView);
            }
            return textView;
        }
    }

    /* renamed from: a */
    public static final View m146190a(ViewGroup viewGroup, AbstractC89183m<? super TextView, ? super TextView, C89391z> mVar) {
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.b31, viewGroup, false);
        View findViewById = a.findViewById(R.id.f63);
        View findViewById2 = a.findViewById(R.id.ev0);
        if (mVar != null) {
            C89219l.m154716b(findViewById, "");
            C89219l.m154716b(findViewById2, "");
            mVar.invoke(findViewById, findViewById2);
        }
        C89219l.m154716b(a, "");
        return a;
    }

    /* renamed from: a */
    public static final View m146191a(ViewGroup viewGroup, AbstractC89187q<? super TextView, ? super TextView, ? super TextView, C89391z> qVar) {
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.b32, viewGroup, false);
        View findViewById = a.findViewById(R.id.f63);
        View findViewById2 = a.findViewById(R.id.ev0);
        View findViewById3 = a.findViewById(R.id.et4);
        if (qVar != null) {
            C89219l.m154716b(findViewById, "");
            C89219l.m154716b(findViewById2, "");
            C89219l.m154716b(findViewById3, "");
            qVar.invoke(findViewById, findViewById2, findViewById3);
        }
        C89219l.m154716b(a, "");
        return a;
    }
}
