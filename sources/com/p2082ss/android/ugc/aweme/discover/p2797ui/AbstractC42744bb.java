package com.p2082ss.android.ugc.aweme.discover.p2797ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.utils.C34729o;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67568r;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.bb */
public abstract class AbstractC42744bb<T> {

    /* renamed from: a */
    protected Context f99704a;

    /* renamed from: b */
    protected View f99705b;

    /* renamed from: c */
    public TextView f99706c;

    /* renamed from: d */
    protected TextView f99707d = ((TextView) this.f99705b.findViewById(R.id.dsa));

    /* renamed from: e */
    protected ViewGroup f99708e;

    /* renamed from: f */
    protected LinearLayout f99709f = ((LinearLayout) this.f99705b.findViewById(R.id.ds5));

    /* renamed from: g */
    public C67568r f99710g;

    /* renamed from: h */
    protected View f99711h;

    /* renamed from: i */
    protected AbstractC42746a f99712i;

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.bb$a */
    public interface AbstractC42746a {
        static {
            Covode.recordClassIndex(50850);
        }

        /* renamed from: a */
        void mo71596a();
    }

    static {
        Covode.recordClassIndex(50848);
    }

    /* renamed from: a */
    public final View mo73015a() {
        return this.f99705b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo73017b() {
        AbstractC42746a aVar = this.f99712i;
        if (aVar != null) {
            aVar.mo71596a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo73016a(boolean z) {
        if (z) {
            View view = this.f99711h;
            if (view != null) {
                view.setOnClickListener(new View$OnClickListenerC42747bc(this));
            }
            this.f99708e.setVisibility(0);
            return;
        }
        this.f99708e.setVisibility(8);
    }

    public AbstractC42744bb(View view, Context context, AbstractC42746a aVar) {
        this.f99705b = view;
        this.f99704a = context;
        this.f99712i = aVar;
        this.f99706c = (TextView) view.findViewById(R.id.ds8);
        ViewGroup viewGroup = (ViewGroup) this.f99705b.findViewById(R.id.ds_);
        this.f99708e = viewGroup;
        viewGroup.setOnClickListener(new View.OnClickListener() {
            /* class com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42744bb.View$OnClickListenerC427451 */

            static {
                Covode.recordClassIndex(50849);
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                if (AbstractC42744bb.this.f99712i != null) {
                    AbstractC42744bb.this.f99712i.mo71596a();
                }
            }
        });
        this.f99711h = this.f99705b.findViewById(R.id.cks);
        C34729o.m70956a(false, this.f99705b.findViewById(R.id.brk));
    }
}
