package com.p2082ss.android.ugc.aweme.view.p4232d;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.icon.TuxIconView;
import com.google.android.material.bottomsheet.DialogC26609a;
import com.p2082ss.android.ugc.aweme.AbstractC34938bu;
import com.p2082ss.android.ugc.aweme.ProfileNaviServiceImpl;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39082ag;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.p2398bn.C34891a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.view.d.a */
public final class DialogC81216a extends DialogC26609a implements AbstractC34938bu {

    /* renamed from: c */
    public static final String f181502c = "profile_navi_intro_sheet_shown";

    /* renamed from: d */
    public static final C81217a f181503d = new C81217a((byte) 0);

    /* renamed from: a */
    final Activity f181504a;

    /* renamed from: b */
    public final String f181505b;

    /* renamed from: com.ss.android.ugc.aweme.view.d.a$a */
    public static final class C81217a {
        static {
            Covode.recordClassIndex(94547);
        }

        private C81217a() {
        }

        public /* synthetic */ C81217a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC34938bu
    /* renamed from: a */
    public final void mo61822a() {
        show();
    }

    static {
        Covode.recordClassIndex(94546);
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC34938bu
    /* renamed from: b */
    public final boolean mo9590b() {
        SharedPreferences preferences = this.f181504a.getPreferences(0);
        if (preferences != null) {
            return preferences.getBoolean(f181502c, false);
        }
        return false;
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        SharedPreferences preferences = this.f181504a.getPreferences(0);
        if (preferences != null) {
            SharedPreferences.Editor edit = preferences.edit();
            edit.putBoolean(f181502c, true);
            edit.apply();
        }
    }

    @Override // com.google.android.material.bottomsheet.DialogC26609a
    public final void onStart() {
        ViewGroup.LayoutParams layoutParams;
        super.onStart();
        View findViewById = findViewById(R.id.ajx);
        if (findViewById != null && (layoutParams = findViewById.getLayoutParams()) != null) {
            Context context = getContext();
            C89219l.m154716b(context, "");
            layoutParams.height = (int) C39082ag.C39083a.m79347a(context, 626.0f);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.view.d.a$b */
    static final class View$OnClickListenerC81218b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DialogC81216a f181506a;

        static {
            Covode.recordClassIndex(94548);
        }

        View$OnClickListenerC81218b(DialogC81216a aVar) {
            this.f181506a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C39162r.m79460a("exit_avatar_intro", new C33744d().f79943a);
            this.f181506a.cancel();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.view.d.a$c */
    static final class View$OnClickListenerC81219c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DialogC81216a f181507a;

        static {
            Covode.recordClassIndex(94549);
        }

        View$OnClickListenerC81219c(DialogC81216a aVar) {
            this.f181507a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C34891a.m71268a(this.f181507a.f181505b);
            this.f181507a.dismiss();
            DialogC81216a aVar = this.f181507a;
            C89219l.m154716b(view, "");
            ProfileNaviServiceImpl.m65406a().mo57245a(aVar.f181504a, view, "avatar_intro_page");
        }
    }

    @Override // com.google.android.material.bottomsheet.DialogC26609a, androidx.appcompat.app.DialogC0240h
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.aow);
        String str = this.f181505b;
        C89219l.m154721d(str, "");
        C39162r.m79460a("show_avatar_intro", new C33744d().mo59983a("enter_from", str).mo59983a("enter_method", "click").f79943a);
        ((TuxIconView) findViewById(R.id.cqk)).setOnClickListener(new View$OnClickListenerC81218b(this));
        TuxButton tuxButton = (TuxButton) findViewById(R.id.cql);
        if (tuxButton != null) {
            tuxButton.setOnClickListener(new View$OnClickListenerC81219c(this));
        }
        C20766v a = C20761r.m39057a(Uri.parse("https://p16-amd-va.tiktokcdn.com/obj/musically-maliva-obj/navi_intro_sheet_img_09282021.png"));
        SmartImageView smartImageView = (SmartImageView) findViewById(R.id.cqr);
        C89219l.m154716b(smartImageView, "");
        a.f49105b = smartImageView.getContext();
        a.f49092E = (SmartImageView) findViewById(R.id.cqr);
        a.mo34186c();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private DialogC81216a(Activity activity, String str) {
        super(activity, R.style.a0_);
        C89219l.m154721d(activity, "");
        C89219l.m154721d(str, "");
        this.f181504a = activity;
        this.f181505b = str;
    }

    public /* synthetic */ DialogC81216a(Activity activity, String str, byte b) {
        this(activity, str);
    }
}
