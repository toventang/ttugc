package com.p2082ss.android.ugc.aweme.tools.beauty.views;

import android.app.AlertDialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4091e.p4093b.AbstractC77893a;
import com.p2082ss.android.ugc.tools.utils.C84912r;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.beauty.views.a */
public final class C78085a {
    static {
        Covode.recordClassIndex(91183);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.views.a$a */
    public static final class View$OnClickListenerC78086a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AlertDialog f175326a;

        /* renamed from: b */
        final /* synthetic */ AbstractC77893a.C77894a f175327b;

        static {
            Covode.recordClassIndex(91184);
        }

        View$OnClickListenerC78086a(AlertDialog alertDialog, AbstractC77893a.C77894a aVar) {
            this.f175326a = alertDialog;
            this.f175327b = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AbstractC77893a.AbstractC77895b bVar = this.f175327b.f174770f;
            if (bVar != null) {
                bVar.mo121547b();
            }
            this.f175326a.dismiss();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.views.a$b */
    public static final class View$OnClickListenerC78087b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AlertDialog f175328a;

        /* renamed from: b */
        final /* synthetic */ AbstractC77893a.C77894a f175329b;

        static {
            Covode.recordClassIndex(91185);
        }

        View$OnClickListenerC78087b(AlertDialog alertDialog, AbstractC77893a.C77894a aVar) {
            this.f175328a = alertDialog;
            this.f175329b = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AbstractC77893a.AbstractC77895b bVar = this.f175329b.f174770f;
            if (bVar != null) {
                bVar.mo121546a();
            }
            this.f175328a.dismiss();
        }
    }

    /* renamed from: a */
    public static void m136499a(AbstractC77893a.C77894a aVar) {
        MethodCollector.m26663i(8626);
        C89219l.m154721d(aVar, "");
        Context context = aVar.f174765a;
        if (context != null) {
            View inflate = LayoutInflater.from(context).inflate(R.layout.lw, (ViewGroup) null);
            C89219l.m154716b(inflate, "");
            View findViewById = inflate.findViewById(R.id.f63);
            C89219l.m154716b(findViewById, "");
            TextView textView = (TextView) findViewById;
            View findViewById2 = inflate.findViewById(R.id.eu6);
            C89219l.m154716b(findViewById2, "");
            TextView textView2 = (TextView) findViewById2;
            View findViewById3 = inflate.findViewById(R.id.eya);
            C89219l.m154716b(findViewById3, "");
            TextView textView3 = (TextView) findViewById3;
            View findViewById4 = inflate.findViewById(R.id.f2r);
            C89219l.m154716b(findViewById4, "");
            TextView textView4 = (TextView) findViewById4;
            AlertDialog show = new AlertDialog.Builder(context).setCancelable(false).setView(inflate).show();
            C89219l.m154716b(show, "");
            Window window = show.getWindow();
            if (window != null) {
                C89219l.m154716b(window, "");
                window.setLayout(C84912r.m145931a(context) - ((int) C84912r.m145930a(context, 80.0f)), window.getAttributes().height);
            }
            textView.setText(aVar.f174766b);
            textView2.setText(aVar.f174767c);
            textView3.setText(aVar.f174769e);
            textView4.setText(aVar.f174768d);
            textView3.setOnClickListener(new View$OnClickListenerC78086a(show, aVar));
            textView4.setOnClickListener(new View$OnClickListenerC78087b(show, aVar));
            MethodCollector.m26664o(8626);
            return;
        }
        MethodCollector.m26664o(8626);
    }
}
