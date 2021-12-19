package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.video.p3116ui;

import android.view.View;
import android.widget.CompoundButton;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxRadio;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.video.ui.c */
public final class C54226c extends RecyclerView.ViewHolder {

    /* renamed from: d */
    public static final C54227a f124230d = new C54227a((byte) 0);

    /* renamed from: a */
    public AbstractC54228b f124231a;

    /* renamed from: b */
    SmartImageView f124232b;

    /* renamed from: c */
    TuxRadio f124233c;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.video.ui.c$b */
    public interface AbstractC54228b {
        static {
            Covode.recordClassIndex(63915);
        }

        /* renamed from: a */
        void mo91302a();

        /* renamed from: a */
        void mo91303a(boolean z);
    }

    static {
        Covode.recordClassIndex(63913);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.video.ui.c$a */
    public static final class C54227a {
        static {
            Covode.recordClassIndex(63914);
        }

        private C54227a() {
        }

        public /* synthetic */ C54227a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.video.ui.c$c */
    static final class View$OnClickListenerC54229c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C54226c f124234a;

        static {
            Covode.recordClassIndex(63916);
        }

        View$OnClickListenerC54229c(C54226c cVar) {
            this.f124234a = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AbstractC54228b bVar = this.f124234a.f124231a;
            if (bVar != null) {
                bVar.mo91302a();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54226c(View view) {
        super(view);
        C89219l.m154721d(view, "");
    }

    /* renamed from: a */
    public final void mo91308a(boolean z) {
        View findViewById = this.itemView.findViewById(R.id.ddr);
        C89219l.m154716b(findViewById, "");
        TuxRadio tuxRadio = (TuxRadio) findViewById;
        this.f124233c = tuxRadio;
        if (tuxRadio == null) {
            C89219l.m154710a("radioButton");
        }
        tuxRadio.setOnCheckedChangeListener(null);
        TuxRadio tuxRadio2 = this.f124233c;
        if (tuxRadio2 == null) {
            C89219l.m154710a("radioButton");
        }
        tuxRadio2.setChecked(z);
        TuxRadio tuxRadio3 = this.f124233c;
        if (tuxRadio3 == null) {
            C89219l.m154710a("radioButton");
        }
        tuxRadio3.setOnCheckedChangeListener(new C54230d(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.video.ui.c$d */
    static final class C54230d implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ C54226c f124235a;

        static {
            Covode.recordClassIndex(63917);
        }

        C54230d(C54226c cVar) {
            this.f124235a = cVar;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            AbstractC54228b bVar = this.f124235a.f124231a;
            if (bVar != null) {
                bVar.mo91303a(z);
            }
        }
    }
}
