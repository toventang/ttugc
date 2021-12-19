package com.p2082ss.android.ugc.aweme.view.p4231c;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.google.android.material.bottomsheet.DialogC26609a;
import com.p2082ss.android.ugc.aweme.p2398bn.C34891a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.view.c.b */
public final class DialogC81187b extends DialogC26609a {

    /* renamed from: a */
    public boolean f181394a;

    /* renamed from: b */
    public final AbstractC81188a f181395b;

    /* renamed from: c */
    private final Activity f181396c;

    /* renamed from: com.ss.android.ugc.aweme.view.c.b$a */
    public interface AbstractC81188a {
        static {
            Covode.recordClassIndex(94516);
        }

        /* renamed from: n */
        void mo124639n();

        /* renamed from: o */
        void mo124640o();
    }

    static {
        Covode.recordClassIndex(94515);
    }

    public final void dismiss() {
        if (this.f181394a) {
            C34891a.m71270b("tap");
        }
        super.dismiss();
    }

    /* renamed from: com.ss.android.ugc.aweme.view.c.b$b */
    static final class View$OnClickListenerC81189b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DialogC81187b f181397a;

        static {
            Covode.recordClassIndex(94517);
        }

        View$OnClickListenerC81189b(DialogC81187b bVar) {
            this.f181397a = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C34891a.m71270b("cancel");
            this.f181397a.f181394a = false;
            this.f181397a.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.view.c.b$c */
    static final class View$OnClickListenerC81190c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DialogC81187b f181398a;

        static {
            Covode.recordClassIndex(94518);
        }

        View$OnClickListenerC81190c(DialogC81187b bVar) {
            this.f181398a = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f181398a.f181395b.mo124639n();
            this.f181398a.f181394a = false;
            this.f181398a.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.view.c.b$d */
    static final class View$OnClickListenerC81191d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DialogC81187b f181399a;

        static {
            Covode.recordClassIndex(94519);
        }

        View$OnClickListenerC81191d(DialogC81187b bVar) {
            this.f181399a = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f181399a.f181395b.mo124640o();
            this.f181399a.f181394a = false;
            this.f181399a.dismiss();
        }
    }

    @Override // com.google.android.material.bottomsheet.DialogC26609a, androidx.appcompat.app.DialogC0240h
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.aov);
        ((TuxTextView) findViewById(R.id.d8i)).setOnClickListener(new View$OnClickListenerC81189b(this));
        ((TuxTextView) findViewById(R.id.d8j)).setOnClickListener(new View$OnClickListenerC81190c(this));
        ((TuxTextView) findViewById(R.id.d8k)).setOnClickListener(new View$OnClickListenerC81191d(this));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private DialogC81187b(Activity activity, AbstractC81188a aVar) {
        super(activity, R.style.a0_);
        C89219l.m154721d(activity, "");
        C89219l.m154721d(aVar, "");
        this.f181396c = activity;
        this.f181395b = aVar;
        this.f181394a = true;
    }

    public /* synthetic */ DialogC81187b(Activity activity, AbstractC81188a aVar, byte b) {
        this(activity, aVar);
    }
}
