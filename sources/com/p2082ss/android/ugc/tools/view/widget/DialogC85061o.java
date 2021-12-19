package com.p2082ss.android.ugc.tools.view.widget;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.tools.view.widget.p4368b.C85029d;
import com.p2082ss.android.ugc.tools.view.widget.p4368b.C85030e;
import com.p2082ss.android.ugc.tools.view.widget.p4368b.EnumC85026a;
import com.p2082ss.android.ugc.trill.R;
import java.util.Map;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.view.widget.o */
public final class DialogC85061o extends Dialog {

    /* renamed from: a */
    private C85029d f190347a;

    static {
        Covode.recordClassIndex(99082);
    }

    public final void show() {
        Activity ownerActivity = getOwnerActivity();
        if (ownerActivity != null && !ownerActivity.isFinishing()) {
            super.show();
            C85029d dVar = this.f190347a;
            if (dVar != null) {
                dVar.setState(EnumC85026a.LOADING);
            }
        }
    }

    public final void dismiss() {
        Activity ownerActivity = getOwnerActivity();
        if (ownerActivity != null && !ownerActivity.isFinishing()) {
            try {
                super.dismiss();
            } catch (Exception unused) {
            }
            C85029d dVar = this.f190347a;
            if (dVar != null) {
                dVar.setVisibility(8);
            }
            C85029d dVar2 = this.f190347a;
            if (dVar2 != null) {
                dVar2.setState(EnumC85026a.NONE);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.tools.view.widget.o$a */
    static final class C85062a extends AbstractC89220m implements AbstractC89172b<ViewGroup, View> {

        /* renamed from: a */
        public static final C85062a f190348a = new C85062a();

        static {
            Covode.recordClassIndex(99083);
        }

        C85062a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ View invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            C89219l.m154721d(viewGroup2, "");
            return C85030e.m146192a(viewGroup2);
        }
    }

    /* renamed from: com.ss.android.ugc.tools.view.widget.o$b */
    static final class C85063b extends AbstractC89220m implements AbstractC89172b<ViewGroup, View> {

        /* renamed from: a */
        public static final C85063b f190349a = new C85063b();

        static {
            Covode.recordClassIndex(99084);
        }

        C85063b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ View invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            C89219l.m154721d(viewGroup2, "");
            return C85030e.m146190a(viewGroup2, (AbstractC89183m<? super TextView, ? super TextView, C89391z>) null);
        }
    }

    /* renamed from: com.ss.android.ugc.tools.view.widget.o$c */
    static final class C85064c extends AbstractC89220m implements AbstractC89172b<ViewGroup, View> {

        /* renamed from: a */
        public static final C85064c f190350a = new C85064c();

        static {
            Covode.recordClassIndex(99085);
        }

        C85064c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ View invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            C89219l.m154721d(viewGroup2, "");
            return C85030e.m146191a(viewGroup2, (AbstractC89187q<? super TextView, ? super TextView, ? super TextView, C89391z>) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialogC85061o(Activity activity) {
        super(activity, R.style.a1p);
        C89219l.m154721d(activity, "");
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Map a = C89041ag.m154421a(C89387v.m154943a(EnumC85026a.LOADING, C85062a.f190348a), C89387v.m154943a(EnumC85026a.EMPTY, C85063b.f190349a), C89387v.m154943a(EnumC85026a.ERROR, C85064c.f190350a));
        Context context = getContext();
        C89219l.m154716b(context, "");
        C85029d dVar = new C85029d(context, a, EnumC85026a.NONE, (byte) 0);
        this.f190347a = dVar;
        setContentView(dVar);
    }
}
