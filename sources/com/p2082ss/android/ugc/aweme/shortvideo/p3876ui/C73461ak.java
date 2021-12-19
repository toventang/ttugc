package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.C0643b;
import androidx.fragment.app.Fragment;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.common.C17177c;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.dialog.C23013a;
import com.bytedance.tux.dialog.C23023b;
import com.bytedance.tux.dialog.C23035c;
import com.bytedance.tux.dialog.p1713b.C23025b;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.AbstractC23185a;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.navigation.p1723a.AbstractC23190d;
import com.bytedance.tux.navigation.p1723a.C23187b;
import com.bytedance.tux.navigation.p1723a.C23194g;
import com.p2082ss.android.ugc.aweme.account.model.AbstractC32846a;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.compliance.api.model.C39252m;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63253l;
import com.p2082ss.android.ugc.aweme.setting.C68028bn;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.C71073b;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.ak */
public final class C73461ak extends Fragment implements AbstractC23185a {

    /* renamed from: A */
    TextView f165016A;

    /* renamed from: B */
    Drawable f165017B;

    /* renamed from: C */
    Drawable f165018C;

    /* renamed from: D */
    TuxButton f165019D;

    /* renamed from: E */
    TuxTextView f165020E;

    /* renamed from: F */
    String f165021F;

    /* renamed from: G */
    int f165022G;

    /* renamed from: H */
    int f165023H;

    /* renamed from: I */
    String f165024I;

    /* renamed from: J */
    String f165025J;

    /* renamed from: K */
    String f165026K;

    /* renamed from: L */
    String f165027L;

    /* renamed from: M */
    String f165028M;

    /* renamed from: N */
    boolean f165029N;

    /* renamed from: O */
    String f165030O;

    /* renamed from: P */
    boolean f165031P;

    /* renamed from: Q */
    boolean f165032Q;

    /* renamed from: R */
    int f165033R;

    /* renamed from: S */
    String f165034S;

    /* renamed from: T */
    int f165035T;

    /* renamed from: U */
    AbstractC73756j f165036U;

    /* renamed from: V */
    public AbstractC89171a<C89391z> f165037V;

    /* renamed from: W */
    AbstractC73755i f165038W;

    /* renamed from: X */
    private VideoPublishEditModel f165039X;

    /* renamed from: a */
    String f165040a = "mission_requirement_toast";

    /* renamed from: b */
    String f165041b = "mission_requirement_modified";

    /* renamed from: c */
    String f165042c = "mission_id";

    /* renamed from: d */
    String f165043d = "reason";

    /* renamed from: e */
    String f165044e = "value";

    /* renamed from: f */
    int f165045f = 1;

    /* renamed from: g */
    int f165046g = 2;

    /* renamed from: h */
    int f165047h = 3;

    /* renamed from: i */
    int f165048i = 4;

    /* renamed from: j */
    int f165049j = 5;

    /* renamed from: k */
    int f165050k = 6;

    /* renamed from: l */
    int f165051l = 7;

    /* renamed from: m */
    int f165052m = 10;

    /* renamed from: n */
    String f165053n = "page_source";

    /* renamed from: o */
    String f165054o = "creator_followers";

    /* renamed from: p */
    String f165055p = "creator_type";

    /* renamed from: q */
    String f165056q = "0";

    /* renamed from: r */
    String f165057r = "1";

    /* renamed from: s */
    ImageView f165058s;

    /* renamed from: t */
    ImageView f165059t;

    /* renamed from: u */
    ImageView f165060u;

    /* renamed from: v */
    LinearLayout f165061v;

    /* renamed from: w */
    LinearLayout f165062w;

    /* renamed from: x */
    LinearLayout f165063x;

    /* renamed from: y */
    TextView f165064y;

    /* renamed from: z */
    TextView f165065z;

    static {
        Covode.recordClassIndex(86198);
    }

    /* renamed from: g */
    private boolean m129606g() {
        int i = this.f165033R;
        if (i == 5 || i == 6) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo116065b() {
        AbstractC73756j jVar = this.f165036U;
        if (jVar != null) {
            jVar.mo79539a(this.f165035T);
        }
    }

    /* renamed from: d */
    static boolean m129603d() {
        boolean publishPermissionDialogPrivate = C63244g.m114602a().mo73277e().getPublishPermissionDialogPrivate(true);
        if (publishPermissionDialogPrivate) {
            C63244g.m114602a().mo73277e().setPublishPermissionDialogPrivate(false);
        }
        return publishPermissionDialogPrivate;
    }

    /* renamed from: e */
    static boolean m129604e() {
        boolean publishPermissionDialogFriend = C63244g.m114602a().mo73277e().getPublishPermissionDialogFriend(true);
        if (publishPermissionDialogFriend) {
            C63244g.m114602a().mo73277e().setPublishPermissionDialogFriend(false);
        }
        return publishPermissionDialogFriend;
    }

    /* renamed from: f */
    private boolean m129605f() {
        int i = this.f165033R;
        if (i == 1 || i == 3 || i == 7 || i == 8) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo116069c() {
        if (this.f165031P) {
            return this.f165032Q;
        }
        VideoPublishEditModel videoPublishEditModel = this.f165039X;
        if (videoPublishEditModel == null || C71073b.m125559a(videoPublishEditModel.getMainBusinessContext()) == null) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.tux.navigation.AbstractC23185a
    /* renamed from: a */
    public final TuxNavBar.C23179a mo37737a() {
        TuxNavBar.C23179a a = new TuxNavBar.C23179a().mo37733b(new C23187b().mo37738a(R.raw.icon_x_mark_small).mo37740a((AbstractC23190d) new C73468ar(this))).mo37731a(new C23194g().mo37753a(getString(R.string.gf_)));
        a.f54919d = true;
        if (getArguments() != null && getArguments().getBoolean("extra.showTuxNavBarBack", false)) {
            a.mo37732a(new C23187b().mo37738a(R.raw.icon_chevron_left_offset_ltr).mo37740a((AbstractC23190d) new C73469as(this)));
        }
        return a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ C89391z mo116068c(int i) {
        if (i == 1) {
            mo116066b(1);
        } else if (i == 2) {
            mo116066b(2);
        }
        return C89391z.f203057a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo116061a(int i) {
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        ImageView imageView = this.f165060u;
        if (i == 0) {
            drawable = this.f165017B;
        } else {
            drawable = this.f165018C;
        }
        imageView.setImageDrawable(drawable);
        ImageView imageView2 = this.f165059t;
        if (i == 2) {
            drawable2 = this.f165017B;
        } else {
            drawable2 = this.f165018C;
        }
        imageView2.setImageDrawable(drawable2);
        ImageView imageView3 = this.f165058s;
        if (i == 1) {
            drawable3 = this.f165017B;
        } else {
            drawable3 = this.f165018C;
        }
        imageView3.setImageDrawable(drawable3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ C89391z mo116070d(int i) {
        AbstractC89171a<C89391z> aVar = this.f165037V;
        if (aVar != null) {
            aVar.invoke();
        }
        C71073b.m125571b(this.f165039X);
        if (i == 1) {
            mo116066b(1);
        } else if (i == 2) {
            mo116066b(2);
        }
        return C89391z.f203057a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo116066b(int i) {
        Object valueOf;
        if ((m129605f() || m129606g()) && (i == 2 || i == 1)) {
            AbstractC32846a e = C63238c.f143594u.mo93906e();
            C33744d a = new C33744d().mo59980a("reason", 8).mo59983a("mission_id", this.f165034S);
            String str = "0";
            if (e == null) {
                valueOf = str;
            } else {
                valueOf = Integer.valueOf(e.mo58670m());
            }
            C33744d a2 = a.mo59982a("creator_followers", valueOf);
            if (!C63253l.f143623a.mo73330z().mo93832j()) {
                str = "1";
            }
            C39162r.m79460a("mission_requirement_toast", a2.mo59983a("creator_type", str).f79943a);
        }
        this.f165035T = i;
        mo116061a(i);
        mo116065b();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f165035T = arguments.getInt("extra.PERMISSION");
            this.f165023H = arguments.getInt("extra.Private.DESCRIPTION");
            this.f165022G = arguments.getInt("extra.Friend.DESCRIPTION");
            this.f165024I = arguments.getString("extra.Private.DESCRIPTION.STRING");
            this.f165025J = arguments.getString("extra.Friend.DESCRIPTION.STRING");
            this.f165026K = arguments.getString("extra.mix.nopublic.string");
            this.f165027L = arguments.getString("extra.qna.nopublic.string");
            this.f165028M = arguments.getString("extra.qna.public.string");
            this.f165029N = arguments.getBoolean("prevent_self_see");
            this.f165030O = arguments.getString("prevent_self_see_reason");
            this.f165039X = (VideoPublishEditModel) arguments.getParcelable("extra.edit_model");
            this.f165031P = arguments.getBoolean("extra_is_from_video_permission");
            this.f165032Q = arguments.getBoolean("extra_aweme_have_duet_sticker");
            this.f165033R = arguments.getInt("extra_mission_status");
            this.f165034S = arguments.getString("extra_mission_id");
            if (this.f165035T != 0) {
                this.f165026K = "";
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo116067b(int i, int i2) {
        C23025b bVar = new C23025b(getContext());
        bVar.mo37417a(getContext().getResources().getString(R.string.mv), new C73465ao(this, i));
        bVar.mo37419b(getContext().getResources().getString(R.string.bdo), C73466ap.f165071a);
        C23035c.m43448a(getContext()).mo37411b(getContext().getResources().getString(R.string.bdq)).mo37413d(getContext().getResources().getString(i2)).mo37407a(bVar).mo37405a().mo37396b().show();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo116062a(int i, int i2) {
        C23025b bVar = new C23025b(getContext());
        bVar.mo37417a(getContext().getResources().getString(R.string.bdu), new C73473aw(this, i));
        bVar.mo37419b(getContext().getResources().getString(R.string.bdo), C73464an.f165068a);
        bVar.f54513b = true;
        C23013a a = C23035c.m43448a(getContext()).mo37413d(getContext().getResources().getString(i2)).mo37407a(bVar).mo37405a();
        a.mo37395a();
        a.mo37396b().show();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f165058s = (ImageView) view.findViewById(R.id.d0r);
        this.f165059t = (ImageView) view.findViewById(R.id.d0n);
        this.f165060u = (ImageView) view.findViewById(R.id.d0q);
        this.f165061v = (LinearLayout) view.findViewById(R.id.c59);
        this.f165062w = (LinearLayout) view.findViewById(R.id.c5_);
        this.f165063x = (LinearLayout) view.findViewById(R.id.c5a);
        this.f165064y = (TextView) view.findViewById(R.id.d70);
        this.f165065z = (TextView) view.findViewById(R.id.f0x);
        this.f165016A = (TextView) view.findViewById(R.id.fc3);
        this.f165017B = getResources().getDrawable(R.drawable.bhz);
        this.f165018C = getResources().getDrawable(R.drawable.bi1);
        this.f165019D = (TuxButton) view.findViewById(R.id.duo);
        this.f165021F = getResources().getString(R.string.eyf);
        this.f165020E = (TuxTextView) view.findViewById(R.id.ckk);
        this.f165062w.setOnClickListener(new View$OnClickListenerC73462al(this));
        this.f165061v.setOnClickListener(new View$OnClickListenerC73463am(this));
        this.f165063x.setOnClickListener(new View$OnClickListenerC73467aq(this));
        this.f165062w.setBackground(C17177c.m31711c(getContext()));
        this.f165061v.setBackground(C17177c.m31711c(getContext()));
        this.f165063x.setBackground(C17177c.m31711c(getContext()));
        mo116061a(this.f165035T);
        AbstractC32846a e = C63238c.f143594u.mo93906e();
        if (e != null && e.mo58662e()) {
            this.f165065z.setText(R.string.exz);
        }
        if (this.f165038W != null) {
            this.f165019D.setVisibility(0);
            this.f165019D.setIconTintColorRes(R.attr.bd);
            this.f165019D.setOnClickListener(new View$OnClickListenerC73470at(this));
        }
        if (this.f165029N) {
            LinearLayout linearLayout = this.f165063x;
            if (linearLayout != null) {
                linearLayout.setEnabled(false);
                this.f165063x.setClickable(false);
            }
            TextView textView = this.f165064y;
            if (textView != null) {
                textView.setTextColor(C0643b.m2378c(getContext(), R.color.c5));
            }
            if (this.f165016A != null) {
                if (!TextUtils.isEmpty(this.f165030O)) {
                    this.f165016A.setText(this.f165030O);
                }
                this.f165016A.setVisibility(0);
            }
        }
        if (m129605f() || m129606g()) {
            this.f165020E.setVisibility(0);
            if (m129605f()) {
                this.f165020E.setText(R.string.d3m);
            } else {
                this.f165020E.setText(R.string.d3n);
            }
        } else {
            this.f165020E.setVisibility(8);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo116064a(int i, String str) {
        if (getContext() != null) {
            C23025b bVar = new C23025b(getContext());
            bVar.mo37417a(getResources().getString(R.string.as0), new C73471au(this, i));
            bVar.mo37418b(R.string.a8y, C73472av.f165078a);
            int i2 = R.string.dgw;
            if (i == 2) {
                i2 = R.string.f34;
            } else if (i == 1) {
                i2 = R.string.f35;
            } else if (i == 0) {
                i2 = R.string.f36;
            }
            ((C23023b) C23013a.C23015a.m43405a(getContext()).mo37479a(i2)).mo37413d(str).mo37407a(bVar).mo37405a().mo37396b().show();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo116063a(int i, int i2, String str) {
        if (TextUtils.isEmpty(str)) {
            mo116064a(i, getContext().getString(i2));
        } else {
            mo116064a(i, str);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C39252m a = C39223a.m79605s().mo68676a("video_visibility_select");
        if (C68028bn.m120330a() == 2 && a != null && a.f92732a == 1) {
            return C1764a.m5927a(layoutInflater, R.layout.a1g, viewGroup, false);
        }
        return C1764a.m5927a(layoutInflater, R.layout.a1f, viewGroup, false);
    }

    /* renamed from: a */
    public static C73461ak m129602a(int i, int i2, boolean z, String str, int i3, int i4, String str2, String str3, String str4, String str5, String str6, String str7, boolean z2, AbstractC73756j jVar, AbstractC73755i iVar, VideoPublishEditModel videoPublishEditModel, boolean z3, boolean z4, int i5, String str8) {
        C73461ak akVar = new C73461ak();
        Bundle bundle = new Bundle();
        bundle.putInt("extra.TYPE", i);
        bundle.putInt("extra.PERMISSION", i2);
        bundle.putBoolean("prevent_self_see", z);
        bundle.putString("prevent_self_see_reason", str);
        bundle.putInt("extra.Private.DESCRIPTION", i3);
        bundle.putInt("extra.Friend.DESCRIPTION", i4);
        bundle.putString("extra.Private.DESCRIPTION.STRING", str2);
        bundle.putString("extra.Friend.DESCRIPTION.STRING", str3);
        bundle.putString("extra.mix.nopublic.string", str4);
        bundle.putString("extra.qna.nopublic.string", str5);
        bundle.putString("extra.qna.public.string", str6);
        bundle.putString("extra.getStickerID", str7);
        bundle.putBoolean("extra.showTuxNavBarBack", z2);
        bundle.putParcelable("extra.edit_model", videoPublishEditModel);
        bundle.putBoolean("extra_is_from_video_permission", z3);
        bundle.putBoolean("extra_aweme_have_duet_sticker", z4);
        bundle.putInt("extra_mission_status", i5);
        bundle.putString("extra_mission_id", str8);
        akVar.setArguments(bundle);
        akVar.f165036U = jVar;
        akVar.f165038W = iVar;
        return akVar;
    }
}
