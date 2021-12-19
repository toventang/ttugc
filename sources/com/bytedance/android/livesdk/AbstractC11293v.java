package com.bytedance.android.livesdk;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.AbstractC0976n;
import androidx.fragment.app.DialogInterface$OnCancelListenerC0944d;
import com.C1764a;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p214d.C3868c;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.livesdk.livesetting.linkmic.TTliveAnchorDeviceScoreSetting;
import com.bytedance.android.livesdk.livesetting.performance.PanelOpenCostTimesSetting;
import com.bytedance.android.livesdk.p643ui.LiveFrameLayout;
import com.bytedance.android.livesdk.utils.C11221ak;
import com.bytedance.android.livesdkapi.p700m.C11830c;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.C17846f;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.v */
public abstract class AbstractC11293v extends DialogInterface$OnCancelListenerC0944d {

    /* renamed from: s */
    public static final C11294a f27006s = new C11294a((byte) 0);

    /* renamed from: a */
    private final C11221ak.EnumC11222a f27007a = C11221ak.EnumC11222a.DEFAULT;

    /* renamed from: b */
    private HashMap f27008b;

    /* renamed from: o */
    public boolean f27009o;

    /* renamed from: p */
    public DataChannel f27010p;

    /* renamed from: q */
    protected C11295b f27011q;

    /* renamed from: r */
    public DialogInterface.OnDismissListener f27012r;

    /* renamed from: com.bytedance.android.livesdk.v$b */
    public static final class C11295b {

        /* renamed from: n */
        public static final C11296a f27013n = new C11296a((byte) 0);

        /* renamed from: a */
        public int f27014a = 1;

        /* renamed from: b */
        public int f27015b = -1;

        /* renamed from: c */
        public int f27016c = 1;

        /* renamed from: d */
        public boolean f27017d = true;

        /* renamed from: e */
        public boolean f27018e = true;

        /* renamed from: f */
        public float f27019f = 0.5f;

        /* renamed from: g */
        public int f27020g;

        /* renamed from: h */
        public int f27021h = -1;

        /* renamed from: i */
        public int f27022i = Integer.MIN_VALUE;

        /* renamed from: j */
        public int f27023j = 50;

        /* renamed from: k */
        public Drawable f27024k = new ColorDrawable(0);

        /* renamed from: l */
        public int f27025l;

        /* renamed from: m */
        public int f27026m;

        static {
            Covode.recordClassIndex(12927);
        }

        /* renamed from: com.bytedance.android.livesdk.v$b$a */
        public static final class C11296a {
            static {
                Covode.recordClassIndex(12928);
            }

            private C11296a() {
            }

            public /* synthetic */ C11296a(byte b) {
                this();
            }
        }

        /* renamed from: a */
        public final void mo18055a(Drawable drawable) {
            C89219l.m154721d(drawable, "");
            this.f27024k = drawable;
        }

        public C11295b(int i) {
            this.f27026m = i;
        }
    }

    static {
        Covode.recordClassIndex(12925);
    }

    /* renamed from: a */
    public void mo8165a() {
        HashMap hashMap = this.f27008b;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: a */
    public void mo12586a(Dialog dialog) {
        C89219l.m154721d(dialog, "");
    }

    /* renamed from: a_ */
    public View mo8166a_(int i) {
        if (this.f27008b == null) {
            this.f27008b = new HashMap();
        }
        View view = (View) this.f27008b.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f27008b.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: b */
    public abstract C11295b mo8355b();

    /* renamed from: i */
    public boolean mo10398i() {
        return false;
    }

    /* renamed from: com.bytedance.android.livesdk.v$a */
    public static final class C11294a {
        static {
            Covode.recordClassIndex(12926);
        }

        private C11294a() {
        }

        public /* synthetic */ C11294a(byte b) {
            this();
        }
    }

    /* renamed from: c_ */
    public C11221ak.EnumC11222a mo9928c_() {
        return this.f27007a;
    }

    /* renamed from: n */
    public final boolean mo18054n() {
        Dialog dialog = getDialog();
        if (dialog == null || !dialog.isShowing()) {
            return false;
        }
        return true;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.f27009o = false;
        super.onDestroyView();
        mo8165a();
    }

    /* renamed from: d */
    private final void mo9929d() {
        C6905bf.m14776a().mo13207b();
        C8774g.m17073a().mo15045b();
        C11830c.m20833a(this, "mDismissed", false);
        C11830c.m20833a(this, "mShownByMe", true);
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d
    public void dismiss() {
        if (getFragmentManager() == null) {
            C3854a.m9453a(3, "LiveDialogFragment", "dismiss:" + this + " not associate with a fragment manager");
        } else {
            super.dismissAllowingStateLoss();
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d
    public void dismissAllowingStateLoss() {
        if (getFragmentManager() == null) {
            C3854a.m9453a(3, "LiveDialogFragment", "dismissAllowingStateLoss:" + this + " not associate with a fragment manager");
        } else {
            super.dismissAllowingStateLoss();
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.fragment.app.Fragment
    public void onStart() {
        int i;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null) {
            C11295b bVar = this.f27011q;
            if (bVar == null) {
                C89219l.m154710a("dialogParams");
            }
            dialog.setCanceledOnTouchOutside(bVar.f27018e);
            Window window = dialog.getWindow();
            if (window != null) {
                C11295b bVar2 = this.f27011q;
                if (bVar2 == null) {
                    C89219l.m154710a("dialogParams");
                }
                window.setBackgroundDrawable(bVar2.f27024k);
                WindowManager.LayoutParams attributes = window.getAttributes();
                C11295b bVar3 = this.f27011q;
                if (bVar3 == null) {
                    C89219l.m154710a("dialogParams");
                }
                attributes.dimAmount = bVar3.f27019f;
                C11295b bVar4 = this.f27011q;
                if (bVar4 == null) {
                    C89219l.m154710a("dialogParams");
                }
                attributes.width = bVar4.f27021h;
                C11295b bVar5 = this.f27011q;
                if (bVar5 == null) {
                    C89219l.m154710a("dialogParams");
                }
                if (bVar5.f27022i == Integer.MIN_VALUE) {
                    int b = C3966y.m9662b();
                    C11295b bVar6 = this.f27011q;
                    if (bVar6 == null) {
                        C89219l.m154710a("dialogParams");
                    }
                    i = (b * bVar6.f27023j) / 100;
                } else {
                    C11295b bVar7 = this.f27011q;
                    if (bVar7 == null) {
                        C89219l.m154710a("dialogParams");
                    }
                    i = bVar7.f27022i;
                }
                attributes.height = i;
                C11295b bVar8 = this.f27011q;
                if (bVar8 == null) {
                    C89219l.m154710a("dialogParams");
                }
                attributes.gravity = bVar8.f27020g;
                C11295b bVar9 = this.f27011q;
                if (bVar9 == null) {
                    C89219l.m154710a("dialogParams");
                }
                attributes.softInputMode = bVar9.f27025l;
                window.setAttributes(attributes);
            }
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d
    public void onCancel(DialogInterface dialogInterface) {
        if (this.f27009o) {
            dismissAllowingStateLoss();
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        C89219l.m154716b(onCreateDialog, "");
        C11295b bVar = this.f27011q;
        if (bVar == null) {
            C89219l.m154710a("dialogParams");
        }
        onCreateDialog.requestWindowFeature(bVar.f27016c);
        mo12586a(onCreateDialog);
        return onCreateDialog;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d
    public void onDismiss(DialogInterface dialogInterface) {
        C6905bf.m14776a().mo13208c();
        C8774g.m17073a().mo15046c();
        super.onDismiss(dialogInterface);
        DialogInterface.OnDismissListener onDismissListener = this.f27012r;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        this.f27009o = false;
        this.f27010p = C17846f.m33055a(this);
        C11295b b = mo8355b();
        if (b.f27017d) {
            i = R.style.a28;
        } else {
            i = R.style.a29;
        }
        int i2 = b.f27014a;
        if (b.f27015b != -1) {
            i = b.f27015b;
        }
        setStyle(i2, i);
        this.f27011q = b;
    }

    /* renamed from: com.bytedance.android.livesdk.v$d */
    static final class C11298d extends AbstractC89220m implements AbstractC89172b<Map<String, Long>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC11293v f27028a;

        static {
            Covode.recordClassIndex(12930);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11298d(AbstractC11293v vVar) {
            super(1);
            this.f27028a = vVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Map<String, Long> map) {
            long j;
            Map<String, Long> map2 = map;
            C89219l.m154721d(map2, "");
            C11221ak.EnumC11222a c_ = this.f27028a.mo9928c_();
            C89219l.m154721d(c_, "");
            C89219l.m154721d(map2, "");
            if (!C11221ak.m19875b(c_)) {
                Long remove = map2.remove("traversal_end_time");
                long j2 = 0;
                if (remove != null) {
                    j = remove.longValue();
                } else {
                    j = 0;
                }
                Long l = C11221ak.f26864a.get(c_);
                if (l != null) {
                    j2 = l.longValue();
                }
                map2.put("panel_show_total_duration", Long.valueOf(j - j2));
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("panel_type", c_);
                linkedHashMap.put("device_score", Float.valueOf(TTliveAnchorDeviceScoreSetting.INSTANCE.getValue()));
                linkedHashMap.putAll(map2);
                C3868c.m9491a("ttlive_panel_open_cost_time", 0, linkedHashMap);
                C11221ak.f26864a.remove(c_);
            }
            return C89391z.f203057a;
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d
    public void show(AbstractC0952i iVar, String str) {
        C89219l.m154721d(iVar, "");
        C89219l.m154721d(str, "");
        C11221ak.m19874a(mo9928c_());
        mo9929d();
        iVar.mo3552a().mo3456a(this, str).mo3473c();
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d
    public void showNow(AbstractC0952i iVar, String str) {
        C89219l.m154721d(iVar, "");
        C89219l.m154721d(str, "");
        C11221ak.m19874a(mo9928c_());
        mo9929d();
        iVar.mo3552a().mo3456a(this, str).mo3478e();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        this.f27009o = true;
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setOnKeyListener(new DialogInterface$OnKeyListenerC11297c(this));
        }
        if (view instanceof LiveFrameLayout) {
            ((LiveFrameLayout) view).setTraversalCallBack(new C11298d(this));
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d
    public int show(AbstractC0976n nVar, String str) {
        C89219l.m154721d(nVar, "");
        C89219l.m154721d(str, "");
        C11221ak.m19874a(mo9928c_());
        mo9929d();
        nVar.mo3456a(this, str);
        C11830c.m20833a(this, "mViewDestroyed", false);
        int c = nVar.mo3473c();
        C11830c.m20833a(this, "mBackStackId", Integer.valueOf(c));
        return c;
    }

    /* renamed from: com.bytedance.android.livesdk.v$c */
    static final class DialogInterface$OnKeyListenerC11297c implements DialogInterface.OnKeyListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC11293v f27027a;

        static {
            Covode.recordClassIndex(12929);
        }

        DialogInterface$OnKeyListenerC11297c(AbstractC11293v vVar) {
            this.f27027a = vVar;
        }

        public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
            C89219l.m154721d(keyEvent, "");
            if (4 == i && 1 == keyEvent.getAction()) {
                return this.f27027a.mo10398i();
            }
            return false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        if (!PanelOpenCostTimesSetting.INSTANCE.getValue().f22808a) {
            C11295b bVar = this.f27011q;
            if (bVar == null) {
                C89219l.m154710a("dialogParams");
            }
            return C1764a.m5927a(layoutInflater, bVar.f27026m, viewGroup, false);
        }
        View a = C1764a.m5927a(layoutInflater, R.layout.bgx, viewGroup, false);
        C11295b bVar2 = this.f27011q;
        if (bVar2 == null) {
            C89219l.m154710a("dialogParams");
        }
        int i = bVar2.f27026m;
        Objects.requireNonNull(a, "null cannot be cast to non-null type com.bytedance.android.livesdk.ui.LiveFrameLayout");
        LiveFrameLayout liveFrameLayout = (LiveFrameLayout) a;
        C1764a.m5927a(layoutInflater, i, liveFrameLayout, true);
        View childAt = liveFrameLayout.getChildAt(0);
        C89219l.m154716b(childAt, "");
        ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
        layoutParams.height = -1;
        layoutParams.width = -1;
        return a;
    }
}
