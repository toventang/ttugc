package com.p2082ss.android.ugc.aweme.social.widget.card.view;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1722h.C23163i;
import com.p2082ss.android.ugc.aweme.recommend.users.IRecommendUsersServiceImpl;
import com.p2082ss.android.ugc.aweme.social.widget.C74743a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.social.widget.card.view.c */
public final class C74903c extends AbstractC74890a {
    static {
        Covode.recordClassIndex(87766);
    }

    /* renamed from: com.ss.android.ugc.aweme.social.widget.card.view.c$a */
    static final class View$OnClickListenerC74904a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C74903c f168383a;

        static {
            Covode.recordClassIndex(87767);
        }

        View$OnClickListenerC74904a(C74903c cVar) {
            this.f168383a = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            Context context = this.f168383a.getContext();
            if (!(context instanceof ActivityC0945e)) {
                context = null;
            }
            ActivityC0945e eVar = (ActivityC0945e) context;
            if (eVar != null) {
                IRecommendUsersServiceImpl.m118438j().mo105654a(eVar);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C74903c(C74743a aVar) {
        super(aVar.f168002a, (byte) 0);
        C89219l.m154721d(aVar, "");
        setupView(aVar.mo117794a());
        getInfoIconView().setOnClickListener(new View$OnClickListenerC74904a(this));
    }

    private final void setupView(Context context) {
        MethodCollector.m26663i(7066);
        LayoutInflater.from(context).inflate(R.layout.b05, this);
        setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        Resources system = Resources.getSystem();
        C89219l.m154709a((Object) system, "");
        Integer valueOf = Integer.valueOf(C89241a.m154730a(TypedValue.applyDimension(1, 8.0f, system.getDisplayMetrics())));
        Resources system2 = Resources.getSystem();
        C89219l.m154709a((Object) system2, "");
        C23163i.m43668b(this, null, valueOf, null, Integer.valueOf(C89241a.m154730a(TypedValue.applyDimension(1, 4.0f, system2.getDisplayMetrics()))), false, 21);
        setGravity(16);
        View findViewById = findViewById(R.id.dfp);
        C89219l.m154716b(findViewById, "");
        setTitleTextView((TuxTextView) findViewById);
        View findViewById2 = findViewById(R.id.bn5);
        C89219l.m154716b(findViewById2, "");
        setInfoIconView((TuxIconView) findViewById2);
        MethodCollector.m26664o(7066);
    }
}
