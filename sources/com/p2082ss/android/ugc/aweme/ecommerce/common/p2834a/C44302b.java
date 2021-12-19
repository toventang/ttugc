package com.p2082ss.android.ugc.aweme.ecommerce.common.p2834a;

import android.app.Dialog;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.ActivityC0945e;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.bullet.p1184ui.common.BulletContainerView;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter;
import com.p2082ss.android.ugc.aweme.ecommerce.router.view.FallbackView;
import com.p2082ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.p2082ss.android.ugc.trill.R;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.common.a.b */
public final class C44302b extends C44294a {

    /* renamed from: d */
    public static final String f103316d = "url";

    /* renamed from: e */
    public static final C44303a f103317e = new C44303a((byte) 0);

    /* renamed from: a */
    public FallbackView f103318a;

    /* renamed from: b */
    public boolean f103319b;

    /* renamed from: c */
    public final IEventCenter.AbstractC45375b f103320c = new C44305c(this);

    /* renamed from: m */
    private SparseArray f103321m;

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.common.p2834a.C44310e, com.p2082ss.android.ugc.aweme.ecommerce.common.p2834a.C44294a
    /* renamed from: a */
    public final View mo74087a(int i) {
        if (this.f103321m == null) {
            this.f103321m = new SparseArray();
        }
        View view = (View) this.f103321m.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f103321m.put(i, findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.common.p2834a.C44310e, com.p2082ss.android.ugc.aweme.ecommerce.common.p2834a.C44294a
    /* renamed from: a */
    public final void mo74088a() {
        SparseArray sparseArray = this.f103321m;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.ecommerce.common.p2834a.C44310e, com.p2082ss.android.ugc.aweme.ecommerce.common.p2834a.C44294a
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo74088a();
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.common.a.b$a */
    public static final class C44303a {
        static {
            Covode.recordClassIndex(52617);
        }

        private C44303a() {
        }

        public /* synthetic */ C44303a(byte b) {
            this();
        }

        /* renamed from: a */
        public static void m87027a(Uri uri, int i, AbstractC0952i iVar, String str, boolean z) {
            C89219l.m154721d(uri, "");
            C89219l.m154721d(iVar, "");
            C89219l.m154721d(str, "");
            C44302b bVar = new C44302b();
            Bundle bundle = new Bundle();
            bundle.putParcelable(C44302b.f103316d, uri);
            bundle.putInt("height", i);
            bundle.putBoolean("use_react_id_close", z);
            bVar.setArguments(bundle);
            bVar.show(iVar, str);
        }
    }

    public C44302b() {
        super((byte) 0);
    }

    @Override // androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.ecommerce.common.p2834a.C44294a
    public final void onDestroy() {
        super.onDestroy();
        EventCenter.m87158a().mo75481b("ec_close_sheet", this.f103320c);
    }

    static {
        Covode.recordClassIndex(52616);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.common.a.b$c */
    public static final class C44305c implements IEventCenter.AbstractC45375b {

        /* renamed from: a */
        final /* synthetic */ C44302b f103323a;

        static {
            Covode.recordClassIndex(52619);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C44305c(C44302b bVar) {
            this.f103323a = bVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.ecommerce.service.IEventCenter.AbstractC45375b
        /* renamed from: a */
        public final void mo74032a(String str, String str2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            if (this.f103323a.f103319b) {
                try {
                    String optString = new JSONObject(str2).optString("react_id");
                    FallbackView fallbackView = this.f103323a.f103318a;
                    if (fallbackView != null) {
                        C89219l.m154716b(optString, "");
                        C89219l.m154721d(optString, "");
                        BulletContainerView bulletContainerView = fallbackView.f105531c;
                        if (bulletContainerView == null) {
                            C89219l.m154710a("bulletContainerView");
                        }
                        if (C89219l.m154714a((Object) optString, (Object) bulletContainerView.getReactId())) {
                            this.f103323a.dismiss();
                        }
                    }
                } catch (Throwable th) {
                    C22708a.m42802a(th);
                }
            } else {
                this.f103323a.dismiss();
            }
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.appcompat.app.C0242i, com.google.android.material.bottomsheet.C26614b, com.p2082ss.android.ugc.aweme.ecommerce.common.p2834a.C44310e
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        onCreateDialog.setOnKeyListener(new DialogInterface$OnKeyListenerC44304b(this));
        return onCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Uri uri;
        MethodCollector.m26663i(7299);
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        ActivityC0945e activity = getActivity();
        boolean z = false;
        if (activity != null) {
            FrameLayout frameLayout = (FrameLayout) mo74087a(R.id.acf);
            C89219l.m154716b(activity, "");
            FallbackView fallbackView = new FallbackView(activity);
            this.f103318a = fallbackView;
            Bundle arguments = getArguments();
            if (!(arguments == null || (uri = (Uri) arguments.getParcelable(f103316d)) == null)) {
                if (!uri.getBooleanQueryParameter("enable_draggable", true)) {
                    fallbackView.setDraggable(false);
                }
                C89219l.m154716b(uri, "");
                fallbackView.mo76362a(activity, uri, false);
            }
            fallbackView.mo76363a(this);
            frameLayout.addView(fallbackView);
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            z = arguments2.getBoolean("use_react_id_close");
        }
        this.f103319b = z;
        EventCenter.m87158a().mo75480a("ec_close_sheet", this.f103320c);
        MethodCollector.m26664o(7299);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.o8, viewGroup, false);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.common.a.b$b */
    static final class DialogInterface$OnKeyListenerC44304b implements DialogInterface.OnKeyListener {

        /* renamed from: a */
        final /* synthetic */ C44302b f103322a;

        static {
            Covode.recordClassIndex(52618);
        }

        DialogInterface$OnKeyListenerC44304b(C44302b bVar) {
            this.f103322a = bVar;
        }

        public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
            FallbackView fallbackView;
            if (i != 4) {
                return false;
            }
            C89219l.m154716b(keyEvent, "");
            if (keyEvent.getAction() == 1 && (fallbackView = this.f103322a.f103318a) != null && fallbackView.mo76364a()) {
                return true;
            }
            return false;
        }
    }
}
