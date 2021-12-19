package com.p2082ss.android.ugc.aweme.upvote.publish.p4192a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.upvote.publish.a.e */
public final class C79970e extends ConstraintLayout {
    static {
        Covode.recordClassIndex(93197);
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.publish.a.e$a */
    static final class View$OnClickListenerC79971a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ String f179266a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f179267b;

        static {
            Covode.recordClassIndex(93198);
        }

        View$OnClickListenerC79971a(String str, AbstractC89171a aVar) {
            this.f179266a = str;
            this.f179267b = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AbstractC89171a aVar = this.f179267b;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.publish.a.e$b */
    static final class View$OnClickListenerC79972b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ String f179268a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f179269b;

        static {
            Covode.recordClassIndex(93199);
        }

        View$OnClickListenerC79972b(String str, AbstractC89171a aVar) {
            this.f179268a = str;
            this.f179269b = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AbstractC89171a aVar = this.f179269b;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C79970e(Context context) {
        super(context, null, 0);
        C89219l.m154721d(context, "");
        C1764a.m5927a(LayoutInflater.from(context), R.layout.bhf, this, true);
    }

    public final void setMessage(String str) {
        C89219l.m154721d(str, "");
        View findViewById = findViewById(R.id.ezc);
        C89219l.m154716b(findViewById, "");
        ((TuxTextView) findViewById).setText(str);
    }

    public final void setTitle(String str) {
        C89219l.m154721d(str, "");
        View findViewById = findViewById(R.id.f63);
        C89219l.m154716b(findViewById, "");
        ((TuxTextView) findViewById).setText(str);
    }

    public /* synthetic */ C79970e(Context context, byte b) {
        this(context);
    }
}
