package com.bytedance.android.live.liveinteract.match.p311ui.p312a;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.core.p218f.C3941k;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5703b;
import com.bytedance.android.livesdk.livesetting.linkmic.EnableBattleUiNewStyleSetting;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.match.ui.a.a */
public final class DialogC5019a extends Dialog {

    /* renamed from: a */
    public AbstractC89171a<C89391z> f13053a;

    /* renamed from: b */
    public C5703b.EnumC5705b f13054b = C5703b.EnumC5705b.PK_ICON;

    static {
        Covode.recordClassIndex(5603);
    }

    /* renamed from: a */
    public final void mo10727a(C5703b.EnumC5705b bVar) {
        C89219l.m154721d(bVar, "");
        this.f13054b = bVar;
    }

    /* renamed from: com.bytedance.android.live.liveinteract.match.ui.a.a$a */
    static final class View$OnClickListenerC5020a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DialogC5019a f13055a;

        static {
            Covode.recordClassIndex(5604);
        }

        View$OnClickListenerC5020a(DialogC5019a aVar) {
            this.f13055a = aVar;
        }

        public final void onClick(View view) {
            C5703b.m12461a(this.f13055a.f13054b, false);
            this.f13055a.dismiss();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialogC5019a(Context context) {
        super(context, R.style.a30);
        C89219l.m154721d(context, "");
    }

    /* renamed from: com.bytedance.android.live.liveinteract.match.ui.a.a$b */
    static final class View$OnClickListenerC5021b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DialogC5019a f13056a;

        static {
            Covode.recordClassIndex(5605);
        }

        View$OnClickListenerC5021b(DialogC5019a aVar) {
            this.f13056a = aVar;
        }

        public final void onClick(View view) {
            HashMap hashMap = new HashMap();
            C5703b.m12466a(hashMap);
            C5703b.m12465a("livesdk_pk_guide_popup_click", hashMap);
            C5703b.m12461a(this.f13056a.f13054b, true);
            AbstractC89171a<C89391z> aVar = this.f13056a.f13053a;
            if (aVar != null) {
                aVar.invoke();
            }
            this.f13056a.dismiss();
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.b6_);
        setCancelable(false);
        setCanceledOnTouchOutside(false);
        HashMap hashMap = new HashMap();
        C5703b.m12466a(hashMap);
        C5703b.m12465a("livesdk_pk_guide_popup_show", hashMap);
        HSImageView hSImageView = (HSImageView) findViewById(R.id.bw7);
        ViewGroup.LayoutParams layoutParams = hSImageView.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.C0547a aVar = (ConstraintLayout.C0547a) layoutParams;
        if (EnableBattleUiNewStyleSetting.INSTANCE.getValue() == 0) {
            aVar.width = C3966y.m9653a(154.0f);
            aVar.height = C3966y.m9653a(130.0f);
            C3941k.m9607a(hSImageView, "tiktok_live_interaction_resource", "ttlive_ic_interact_pk_guide.png");
        } else {
            aVar.width = C3966y.m9653a(311.5f);
            aVar.height = C3966y.m9653a(132.0f);
            C3941k.m9607a(hSImageView, "tiktok_live_interaction_resource", "ttlive_ic_interact_pk_guide_2.png");
        }
        C89219l.m154716b(hSImageView, "");
        hSImageView.setLayoutParams(aVar);
        findViewById(R.id.bu5).setOnClickListener(new View$OnClickListenerC5020a(this));
        findViewById(R.id.zb).setOnClickListener(new View$OnClickListenerC5021b(this));
    }
}
