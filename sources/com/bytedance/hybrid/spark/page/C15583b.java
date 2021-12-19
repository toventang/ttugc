package com.bytedance.hybrid.spark.page;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.appcompat.app.C0242i;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.AbstractC0976n;
import androidx.fragment.app.ActivityC0945e;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.anim.BottomSheetBehavior;
import com.bytedance.hybrid.spark.p1107a.AbstractC15509e;
import com.bytedance.hybrid.spark.p1107a.AbstractC15510f;
import com.bytedance.hybrid.spark.p1109c.DialogC15533a;
import com.bytedance.hybrid.spark.p1110d.C15537a;
import com.bytedance.hybrid.spark.p1110d.C15547b;
import com.bytedance.hybrid.spark.p1110d.C15550c;
import com.bytedance.hybrid.spark.p1110d.C15551d;
import com.bytedance.hybrid.spark.p1110d.C15552e;
import com.bytedance.hybrid.spark.p1110d.C15568q;
import com.bytedance.hybrid.spark.p1110d.C15569r;
import com.bytedance.hybrid.spark.p1110d.C15570s;
import com.bytedance.hybrid.spark.p1111e.C15573c;
import com.bytedance.hybrid.spark.p1111e.C15574d;
import com.bytedance.hybrid.spark.view.RadiusLayout;
import com.bytedance.lynx.hybrid.p1515a.AbstractC21154h;
import com.bytedance.lynx.hybrid.p1522h.C21198c;
import com.bytedance.lynx.p1507a.p1508a.p1510b.C21137b;
import com.bytedance.lynx.p1507a.p1508a.p1510b.C21138c;
import com.bytedance.lynx.p1507a.p1508a.p1514f.C21144b;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import p4600h.C89388w;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4619j.C89271h;

/* renamed from: com.bytedance.hybrid.spark.page.b */
public final class C15583b extends C0242i implements AbstractC15509e {

    /* renamed from: e */
    public static final C15584a f38001e = new C15584a((byte) 0);

    /* renamed from: a */
    public C21137b f38002a;

    /* renamed from: b */
    public SparkContext f38003b;

    /* renamed from: c */
    public C15581a f38004c;

    /* renamed from: d */
    public BottomSheetBehavior<RadiusLayout> f38005d;

    /* renamed from: f */
    private RadiusLayout f38006f;

    /* renamed from: g */
    private View f38007g;

    /* renamed from: h */
    private CoordinatorLayout f38008h;

    /* renamed from: i */
    private final List<AbstractC15510f> f38009i = new ArrayList();

    /* renamed from: j */
    private C15537a f38010j;

    /* renamed from: k */
    private HashMap f38011k;

    /* renamed from: com.bytedance.hybrid.spark.page.b$d */
    static final class View$OnClickListenerC15587d implements View.OnClickListener {

        /* renamed from: a */
        public static final View$OnClickListenerC15587d f38014a = new View$OnClickListenerC15587d();

        static {
            Covode.recordClassIndex(17851);
        }

        View$OnClickListenerC15587d() {
        }

        public final void onClick(View view) {
        }
    }

    /* renamed from: com.bytedance.hybrid.spark.page.b$f */
    static final class View$OnClickListenerC15589f implements View.OnClickListener {

        /* renamed from: a */
        public static final View$OnClickListenerC15589f f38016a = new View$OnClickListenerC15589f();

        static {
            Covode.recordClassIndex(17853);
        }

        View$OnClickListenerC15589f() {
        }

        public final void onClick(View view) {
        }
    }

    static {
        Covode.recordClassIndex(17847);
    }

    /* renamed from: com.bytedance.hybrid.spark.page.b$a */
    public static final class C15584a {
        static {
            Covode.recordClassIndex(17848);
        }

        private C15584a() {
        }

        public /* synthetic */ C15584a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.hybrid.spark.page.b$e */
    static final class C15588e extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        public static final C15588e f38015a = new C15588e();

        static {
            Covode.recordClassIndex(17852);
        }

        C15588e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ C89391z invoke() {
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.hybrid.spark.page.b$g */
    static final class C15590g extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        public static final C15590g f38017a = new C15590g();

        static {
            Covode.recordClassIndex(17854);
        }

        C15590g() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ C89391z invoke() {
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.hybrid.spark.page.b$i */
    public static final class C15592i extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C15583b f38020a;

        static {
            Covode.recordClassIndex(17856);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15592i(C15583b bVar) {
            super(0);
            this.f38020a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f38020a.dismiss();
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.hybrid.spark.p1107a.AbstractC15509e
    /* renamed from: a */
    public final void mo25250a() {
        mo25366a(true);
    }

    @Override // com.bytedance.hybrid.spark.p1107a.AbstractC15511g
    /* renamed from: b */
    public final void mo25252b() {
        C15581a aVar = this.f38004c;
        if (aVar != null) {
            aVar.mo25252b();
        }
    }

    /* renamed from: com.bytedance.hybrid.spark.page.b$h */
    static final class C15591h extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C15583b f38018a;

        /* renamed from: b */
        final /* synthetic */ View f38019b;

        static {
            Covode.recordClassIndex(17855);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15591h(C15583b bVar, View view) {
            super(0);
            this.f38018a = bVar;
            this.f38019b = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f38018a.mo25366a(true);
            return C89391z.f203057a;
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f38011k;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: com.bytedance.hybrid.spark.page.b$b */
    public static final class DialogC15585b extends DialogC15533a {

        /* renamed from: a */
        final /* synthetic */ C15583b f38012a;

        static {
            Covode.recordClassIndex(17849);
        }

        public final void onBackPressed() {
            C21137b bVar = this.f38012a.f38002a;
            if (bVar == null) {
                C89219l.m154710a("schemaParam");
            }
            if (!bVar.getDisableBackPress()) {
                this.f38012a.mo25366a(true);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        DialogC15585b(C15583b bVar, Context context) {
            super(context, (byte) 0);
            this.f38012a = bVar;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        C15593c cVar;
        AbstractC21154h kitView;
        C15581a aVar = this.f38004c;
        if (!(aVar == null || (cVar = aVar.f37997a) == null || (kitView = cVar.getKitView()) == null)) {
            kitView.mo34726a("viewDisappeared", null);
        }
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        C15593c cVar;
        AbstractC21154h kitView;
        super.onResume();
        C15581a aVar = this.f38004c;
        if (aVar != null && (cVar = aVar.f37997a) != null && (kitView = cVar.getKitView()) != null) {
            kitView.mo34726a("viewAppeared", null);
        }
    }

    /* renamed from: c */
    private final boolean m28706c() {
        C21137b bVar = this.f38002a;
        if (bVar == null) {
            C89219l.m154710a("schemaParam");
        }
        if (bVar.getPullDownClose()) {
            return true;
        }
        C21137b bVar2 = this.f38002a;
        if (bVar2 == null) {
            C89219l.m154710a("schemaParam");
        }
        if (bVar2.getDragByGesture()) {
            return true;
        }
        C21137b bVar3 = this.f38002a;
        if (bVar3 == null) {
            C89219l.m154710a("schemaParam");
        }
        if (C89219l.m154714a((Object) bVar3.getGravity(), (Object) "bottom")) {
            return true;
        }
        return false;
    }

    /* renamed from: com.bytedance.hybrid.spark.page.b$c */
    public static final class C15586c extends BottomSheetBehavior.AbstractC15520a {

        /* renamed from: a */
        final /* synthetic */ C15583b f38013a;

        static {
            Covode.recordClassIndex(17850);
        }

        @Override // com.bytedance.hybrid.spark.anim.BottomSheetBehavior.AbstractC15520a
        /* renamed from: a */
        public final void mo25292a(View view) {
            C89219l.m154719c(view, "");
        }

        C15586c(C15583b bVar) {
            this.f38013a = bVar;
        }

        @Override // com.bytedance.hybrid.spark.anim.BottomSheetBehavior.AbstractC15520a
        /* renamed from: a */
        public final void mo25293a(View view, int i) {
            String str;
            C15593c cVar;
            AbstractC21154h kitView;
            C89219l.m154719c(view, "");
            if (i != 1) {
                if (i == 3) {
                    str = "enterFullScreen";
                } else if (i == 4) {
                    str = "enterHalfScreen";
                }
                C15573c.m28691a("SparkActivity", "popup state changed: ".concat(String.valueOf(str)), this.f38013a.f38003b);
                C15581a aVar = this.f38013a.f38004c;
                if (!(aVar == null || (cVar = aVar.f37997a) == null || (kitView = cVar.getKitView()) == null)) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("status", str);
                    kitView.mo34726a("popupStatusChange", C89070n.m154516a(jSONObject));
                }
            } else {
                BottomSheetBehavior<RadiusLayout> bottomSheetBehavior = this.f38013a.f38005d;
                if (bottomSheetBehavior == null) {
                    C89219l.m154710a("behavior");
                } else if (bottomSheetBehavior.f37830w == 3) {
                    str = "leaveFullScreen";
                    C15573c.m28691a("SparkActivity", "popup state changed: ".concat(String.valueOf(str)), this.f38013a.f38003b);
                    C15581a aVar2 = this.f38013a.f38004c;
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("status", str);
                    kitView.mo34726a("popupStatusChange", C89070n.m154516a(jSONObject2));
                }
                str = "leaveHalfScreen";
                C15573c.m28691a("SparkActivity", "popup state changed: ".concat(String.valueOf(str)), this.f38013a.f38003b);
                C15581a aVar22 = this.f38013a.f38004c;
                JSONObject jSONObject22 = new JSONObject();
                jSONObject22.put("status", str);
                kitView.mo34726a("popupStatusChange", C89070n.m154516a(jSONObject22));
            }
            if (i == 5) {
                this.f38013a.mo25366a(false);
            }
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.appcompat.app.C0242i
    public final Dialog onCreateDialog(Bundle bundle) {
        Context requireContext = requireContext();
        C89219l.m154709a((Object) requireContext, "");
        DialogC15585b bVar = new DialogC15585b(this, requireContext);
        ActivityC0945e activity = getActivity();
        if (activity != null) {
            bVar.setOwnerActivity(activity);
        }
        return bVar;
    }

    /* renamed from: a */
    public final void mo25366a(boolean z) {
        WindowManager windowManager;
        Display defaultDisplay;
        C15593c cVar;
        AbstractC21154h kitView;
        String str;
        C21137b bVar = this.f38002a;
        if (bVar == null) {
            C89219l.m154710a("schemaParam");
        }
        if (bVar.getBlockBackPress()) {
            C15581a aVar = this.f38004c;
            if (aVar != null && (cVar = aVar.f37997a) != null && (kitView = cVar.getKitView()) != null) {
                JSONObject jSONObject = new JSONObject();
                SparkContext sparkContext = this.f38003b;
                if (sparkContext == null || (str = sparkContext.f50280f) == null) {
                    str = "";
                }
                jSONObject.put("containerID", str);
                kitView.mo34726a("sparkOnBackPressAction", C89070n.m154516a(jSONObject));
            }
        } else if (z) {
            C15537a aVar2 = this.f38010j;
            if (aVar2 == null) {
                C89219l.m154710a("animatorParamHandler");
            }
            C15592i iVar = new C15592i(this);
            String animation = aVar2.f37887a.getAnimation();
            switch (animation.hashCode()) {
                case -1383228885:
                    if (animation.equals("bottom")) {
                        aVar2.f37888b.animate().translationY((float) aVar2.f37888b.getHeight()).setDuration(300).setListener(new C15537a.C15538a(iVar)).start();
                        return;
                    }
                    break;
                case 3005871:
                    if (animation.equals("auto")) {
                        View view = aVar2.f37888b;
                        view.setAlpha(1.0f);
                        view.animate().alpha(0.0f).setDuration(300).setListener(new C15537a.C15540c(aVar2, iVar)).start();
                        return;
                    }
                    break;
                case 3387192:
                    if (animation.equals("none")) {
                        iVar.invoke();
                        return;
                    }
                    break;
                case 108511772:
                    if (animation.equals("right")) {
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        if (aVar2.f37888b.getContext() instanceof Activity) {
                            Context context = aVar2.f37888b.getContext();
                            if (context != null) {
                                windowManager = ((Activity) context).getWindowManager();
                            } else {
                                throw new C89388w("null cannot be cast to non-null type");
                            }
                        } else {
                            Object a = C15537a.m28668a(aVar2.f37888b.getContext(), "window");
                            if (a != null) {
                                windowManager = (WindowManager) a;
                            } else {
                                throw new C89388w("null cannot be cast to non-null type");
                            }
                        }
                        if (!(windowManager == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null)) {
                            defaultDisplay.getMetrics(displayMetrics);
                        }
                        aVar2.f37888b.animate().translationX((float) displayMetrics.widthPixels).setDuration(300).setListener(new C15537a.C15539b(iVar)).start();
                        return;
                    }
                    break;
            }
            iVar.invoke();
        } else {
            dismiss();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int height;
        C89219l.m154719c(view, "");
        super.onViewCreated(view, bundle);
        List<AbstractC15510f> list = this.f38009i;
        if (m28706c()) {
            C21137b bVar = this.f38002a;
            if (bVar == null) {
                C89219l.m154710a("schemaParam");
            }
            RadiusLayout radiusLayout = this.f38006f;
            if (radiusLayout == null) {
                C89219l.m154710a("popupContainer");
            }
            list.add(new C15570s(bVar, radiusLayout));
            C21137b bVar2 = this.f38002a;
            if (bVar2 == null) {
                C89219l.m154710a("schemaParam");
            }
            RadiusLayout radiusLayout2 = this.f38006f;
            if (radiusLayout2 == null) {
                C89219l.m154710a("popupContainer");
            }
            BottomSheetBehavior<RadiusLayout> bottomSheetBehavior = this.f38005d;
            if (bottomSheetBehavior == null) {
                C89219l.m154710a("behavior");
            }
            list.add(new C15551d(bVar2, radiusLayout2, bottomSheetBehavior.f37825r));
        } else {
            C21137b bVar3 = this.f38002a;
            if (bVar3 == null) {
                C89219l.m154710a("schemaParam");
            }
            RadiusLayout radiusLayout3 = this.f38006f;
            if (radiusLayout3 == null) {
                C89219l.m154710a("popupContainer");
            }
            list.add(new C15570s(bVar3, radiusLayout3));
            C21137b bVar4 = this.f38002a;
            if (bVar4 == null) {
                C89219l.m154710a("schemaParam");
            }
            RadiusLayout radiusLayout4 = this.f38006f;
            if (radiusLayout4 == null) {
                C89219l.m154710a("popupContainer");
            }
            Context context = view.getContext();
            C89219l.m154709a((Object) context, "");
            C21137b bVar5 = this.f38002a;
            if (bVar5 == null) {
                C89219l.m154710a("schemaParam");
            }
            C89219l.m154719c(context, "");
            C89219l.m154719c(bVar5, "");
            if (bVar5.getHeight() > 0) {
                height = C89271h.m154772c(bVar5.getHeight(), C21144b.m39808a());
            } else if (bVar5.getHeight() != 0) {
                height = bVar5.getHeight();
            } else if (C89219l.m154714a((Object) bVar5.getGravity(), (Object) "center")) {
                height = C15574d.m28692a(context, 400.0d);
            } else {
                height = -1;
            }
            list.add(new C15551d(bVar4, radiusLayout4, height));
        }
        C21137b bVar6 = this.f38002a;
        if (bVar6 == null) {
            C89219l.m154710a("schemaParam");
        }
        RadiusLayout radiusLayout5 = this.f38006f;
        if (radiusLayout5 == null) {
            C89219l.m154710a("popupContainer");
        }
        list.add(new C15568q(bVar6, radiusLayout5, m28706c()));
        C21137b bVar7 = this.f38002a;
        if (bVar7 == null) {
            C89219l.m154710a("schemaParam");
        }
        View view2 = this.f38007g;
        if (view2 == null) {
            C89219l.m154710a("popupBg");
        }
        list.add(new C15569r(bVar7, view2));
        C21137b bVar8 = this.f38002a;
        if (bVar8 == null) {
            C89219l.m154710a("schemaParam");
        }
        View view3 = this.f38007g;
        if (view3 == null) {
            C89219l.m154710a("popupBg");
        }
        list.add(new C15552e(bVar8, view3));
        C21137b bVar9 = this.f38002a;
        if (bVar9 == null) {
            C89219l.m154710a("schemaParam");
        }
        View view4 = this.f38007g;
        if (view4 == null) {
            C89219l.m154710a("popupBg");
        }
        list.add(new C15547b(bVar9, view4, new C15591h(this, view)));
        Iterator<T> it = this.f38009i.iterator();
        while (it.hasNext()) {
            it.next().mo25251a();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        SparkContext sparkContext;
        C21198c cVar;
        C21137b bVar;
        int i;
        C21138c b;
        SparkContext sparkContext2;
        C89219l.m154719c(layoutInflater, "");
        Bundle arguments = getArguments();
        if (arguments != null) {
            sparkContext = (SparkContext) arguments.getParcelable("sparkContext");
        } else {
            sparkContext = null;
        }
        this.f38003b = sparkContext;
        if ((sparkContext == null || sparkContext.mo25239a() == null) && (sparkContext2 = this.f38003b) != null) {
            sparkContext2.mo25240a(this);
        }
        SparkContext sparkContext3 = this.f38003b;
        if (sparkContext3 != null) {
            cVar = sparkContext3.f37780c;
        } else {
            cVar = null;
        }
        if (cVar != null) {
            cVar.put("isPopup", (Object) 1);
        }
        SparkContext sparkContext4 = this.f38003b;
        if (sparkContext4 == null || (b = sparkContext4.mo25241b()) == null || !(b instanceof C21137b) || (bVar = (C21137b) b) == null) {
            bVar = new C21137b(null, 1, null);
        }
        this.f38002a = bVar;
        if (m28706c()) {
            View a = C1764a.m5927a(layoutInflater, R.layout.b0d, viewGroup, false);
            View findViewById = a.findViewById(R.id.d4p);
            RadiusLayout radiusLayout = (RadiusLayout) findViewById;
            AbstractC0976n a2 = getChildFragmentManager().mo3552a();
            C15581a aVar = new C15581a();
            this.f38004c = aVar;
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("sparkContext", this.f38003b);
            aVar.setArguments(bundle2);
            a2.mo3454a(R.id.d4p, aVar, "popup").mo3473c();
            radiusLayout.setOnClickListener(View$OnClickListenerC15587d.f38014a);
            C89219l.m154709a((Object) findViewById, "");
            this.f38006f = radiusLayout;
            View findViewById2 = a.findViewById(R.id.d4o);
            C89219l.m154709a((Object) findViewById2, "");
            this.f38007g = findViewById2;
            RadiusLayout radiusLayout2 = this.f38006f;
            if (radiusLayout2 == null) {
                C89219l.m154710a("popupContainer");
            }
            ViewGroup.LayoutParams layoutParams = radiusLayout2.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.C0560e) {
                CoordinatorLayout.AbstractC0557b bVar2 = ((CoordinatorLayout.C0560e) layoutParams).f2416a;
                if (bVar2 instanceof BottomSheetBehavior) {
                    BottomSheetBehavior<RadiusLayout> bottomSheetBehavior = (BottomSheetBehavior) bVar2;
                    bottomSheetBehavior.mo25274b(true);
                    C15586c cVar2 = new C15586c(this);
                    if (!bottomSheetBehavior.f37790D.contains(cVar2)) {
                        bottomSheetBehavior.f37790D.add(cVar2);
                    }
                    C89219l.m154709a((Object) bottomSheetBehavior, "");
                    this.f38005d = bottomSheetBehavior;
                    bottomSheetBehavior.mo25269a(false);
                    BottomSheetBehavior<RadiusLayout> bottomSheetBehavior2 = this.f38005d;
                    if (bottomSheetBehavior2 == null) {
                        C89219l.m154710a("behavior");
                    }
                    C21137b bVar3 = this.f38002a;
                    if (bVar3 == null) {
                        C89219l.m154710a("schemaParam");
                    }
                    bottomSheetBehavior2.mo25274b(bVar3.getPullDownClose());
                    BottomSheetBehavior<RadiusLayout> bottomSheetBehavior3 = this.f38005d;
                    if (bottomSheetBehavior3 == null) {
                        C89219l.m154710a("behavior");
                    }
                    C21137b bVar4 = this.f38002a;
                    if (bVar4 == null) {
                        C89219l.m154710a("schemaParam");
                    }
                    bottomSheetBehavior3.f37823p = bVar4.getDragByGesture();
                    C21137b bVar5 = this.f38002a;
                    if (bVar5 == null) {
                        C89219l.m154710a("schemaParam");
                    }
                    if (bVar5.getHeight() <= 0) {
                        BottomSheetBehavior<RadiusLayout> bottomSheetBehavior4 = this.f38005d;
                        if (bottomSheetBehavior4 == null) {
                            C89219l.m154710a("behavior");
                        }
                        bottomSheetBehavior4.f37825r = C21144b.m39808a();
                        BottomSheetBehavior<RadiusLayout> bottomSheetBehavior5 = this.f38005d;
                        if (bottomSheetBehavior5 == null) {
                            C89219l.m154710a("behavior");
                        }
                        bottomSheetBehavior5.mo25272b(C21144b.m39808a() - 1);
                        BottomSheetBehavior<RadiusLayout> bottomSheetBehavior6 = this.f38005d;
                        if (bottomSheetBehavior6 == null) {
                            C89219l.m154710a("behavior");
                        }
                        bottomSheetBehavior6.f37822o = true;
                        BottomSheetBehavior<RadiusLayout> bottomSheetBehavior7 = this.f38005d;
                        if (bottomSheetBehavior7 == null) {
                            C89219l.m154710a("behavior");
                        }
                        bottomSheetBehavior7.mo25275c(3);
                    } else {
                        C21137b bVar6 = this.f38002a;
                        if (bVar6 == null) {
                            C89219l.m154710a("schemaParam");
                        }
                        if (bVar6.getDragByGesture()) {
                            C21137b bVar7 = this.f38002a;
                            if (bVar7 == null) {
                                C89219l.m154710a("schemaParam");
                            }
                            int height = bVar7.getHeight();
                            C21137b bVar8 = this.f38002a;
                            if (bVar8 == null) {
                                C89219l.m154710a("schemaParam");
                            }
                            if (height < bVar8.getDragHeight()) {
                                BottomSheetBehavior<RadiusLayout> bottomSheetBehavior8 = this.f38005d;
                                if (bottomSheetBehavior8 == null) {
                                    C89219l.m154710a("behavior");
                                }
                                C21137b bVar9 = this.f38002a;
                                if (bVar9 == null) {
                                    C89219l.m154710a("schemaParam");
                                }
                                if (bVar9.getHeight() > 0) {
                                    C21137b bVar10 = this.f38002a;
                                    if (bVar10 == null) {
                                        C89219l.m154710a("schemaParam");
                                    }
                                    i = C89271h.m154772c(bVar10.getHeight(), C21144b.m39808a());
                                } else {
                                    i = 0;
                                }
                                bottomSheetBehavior8.mo25272b(i);
                                BottomSheetBehavior<RadiusLayout> bottomSheetBehavior9 = this.f38005d;
                                if (bottomSheetBehavior9 == null) {
                                    C89219l.m154710a("behavior");
                                }
                                C21137b bVar11 = this.f38002a;
                                if (bVar11 == null) {
                                    C89219l.m154710a("schemaParam");
                                }
                                bottomSheetBehavior9.f37825r = bVar11.getDragHeight();
                                BottomSheetBehavior<RadiusLayout> bottomSheetBehavior10 = this.f38005d;
                                if (bottomSheetBehavior10 == null) {
                                    C89219l.m154710a("behavior");
                                }
                                C21137b bVar12 = this.f38002a;
                                if (bVar12 == null) {
                                    C89219l.m154710a("schemaParam");
                                }
                                bottomSheetBehavior10.f37826s = bVar12.getDragUpThreshold();
                                BottomSheetBehavior<RadiusLayout> bottomSheetBehavior11 = this.f38005d;
                                if (bottomSheetBehavior11 == null) {
                                    C89219l.m154710a("behavior");
                                }
                                C21137b bVar13 = this.f38002a;
                                if (bVar13 == null) {
                                    C89219l.m154710a("schemaParam");
                                }
                                bottomSheetBehavior11.f37827t = bVar13.getDragDownThreshold();
                                BottomSheetBehavior<RadiusLayout> bottomSheetBehavior12 = this.f38005d;
                                if (bottomSheetBehavior12 == null) {
                                    C89219l.m154710a("behavior");
                                }
                                C21137b bVar14 = this.f38002a;
                                if (bVar14 == null) {
                                    C89219l.m154710a("schemaParam");
                                }
                                bottomSheetBehavior12.f37829v = bVar14.getDragDownCloseThreshold();
                                BottomSheetBehavior<RadiusLayout> bottomSheetBehavior13 = this.f38005d;
                                if (bottomSheetBehavior13 == null) {
                                    C89219l.m154710a("behavior");
                                }
                                C21137b bVar15 = this.f38002a;
                                if (bVar15 == null) {
                                    C89219l.m154710a("schemaParam");
                                }
                                bottomSheetBehavior13.f37828u = bVar15.getPeekDownCloseThreshold();
                                BottomSheetBehavior<RadiusLayout> bottomSheetBehavior14 = this.f38005d;
                                if (bottomSheetBehavior14 == null) {
                                    C89219l.m154710a("behavior");
                                }
                                bottomSheetBehavior14.mo25275c(4);
                                BottomSheetBehavior<RadiusLayout> bottomSheetBehavior15 = this.f38005d;
                                if (bottomSheetBehavior15 == null) {
                                    C89219l.m154710a("behavior");
                                }
                                C21137b bVar16 = this.f38002a;
                                if (bVar16 == null) {
                                    C89219l.m154710a("schemaParam");
                                }
                                bottomSheetBehavior15.f37822o = !bVar16.getDragBack();
                            }
                        }
                        BottomSheetBehavior<RadiusLayout> bottomSheetBehavior16 = this.f38005d;
                        if (bottomSheetBehavior16 == null) {
                            C89219l.m154710a("behavior");
                        }
                        C21137b bVar17 = this.f38002a;
                        if (bVar17 == null) {
                            C89219l.m154710a("schemaParam");
                        }
                        bottomSheetBehavior16.f37825r = bVar17.getHeight();
                        BottomSheetBehavior<RadiusLayout> bottomSheetBehavior17 = this.f38005d;
                        if (bottomSheetBehavior17 == null) {
                            C89219l.m154710a("behavior");
                        }
                        C21137b bVar18 = this.f38002a;
                        if (bVar18 == null) {
                            C89219l.m154710a("schemaParam");
                        }
                        bottomSheetBehavior17.mo25272b(bVar18.getHeight() - 1);
                        BottomSheetBehavior<RadiusLayout> bottomSheetBehavior18 = this.f38005d;
                        if (bottomSheetBehavior18 == null) {
                            C89219l.m154710a("behavior");
                        }
                        bottomSheetBehavior18.f37822o = true;
                        BottomSheetBehavior<RadiusLayout> bottomSheetBehavior19 = this.f38005d;
                        if (bottomSheetBehavior19 == null) {
                            C89219l.m154710a("behavior");
                        }
                        bottomSheetBehavior19.mo25275c(3);
                        BottomSheetBehavior<RadiusLayout> bottomSheetBehavior20 = this.f38005d;
                        if (bottomSheetBehavior20 == null) {
                            C89219l.m154710a("behavior");
                        }
                        if (bottomSheetBehavior20.f37821n) {
                            BottomSheetBehavior<RadiusLayout> bottomSheetBehavior21 = this.f38005d;
                            if (bottomSheetBehavior21 == null) {
                                C89219l.m154710a("behavior");
                            }
                            bottomSheetBehavior21.f37823p = true;
                        }
                    }
                    View findViewById3 = a.findViewById(R.id.d4q);
                    C89219l.m154709a((Object) findViewById3, "");
                    this.f38008h = (CoordinatorLayout) findViewById3;
                    List<AbstractC15510f> list = this.f38009i;
                    C21137b bVar19 = this.f38002a;
                    if (bVar19 == null) {
                        C89219l.m154710a("schemaParam");
                    }
                    CoordinatorLayout coordinatorLayout = this.f38008h;
                    if (coordinatorLayout == null) {
                        C89219l.m154710a("popupCoordinator");
                    }
                    list.add(new C15550c(bVar19, coordinatorLayout));
                    C21137b bVar20 = this.f38002a;
                    if (bVar20 == null) {
                        C89219l.m154710a("schemaParam");
                    }
                    RadiusLayout radiusLayout3 = this.f38006f;
                    if (radiusLayout3 == null) {
                        C89219l.m154710a("popupContainer");
                    }
                    C15537a aVar2 = new C15537a(bVar20, radiusLayout3);
                    this.f38010j = aVar2;
                    aVar2.mo25322a(C15588e.f38015a);
                    return a;
                }
                throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
            }
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        View a3 = C1764a.m5927a(layoutInflater, R.layout.b0c, viewGroup, false);
        View findViewById4 = a3.findViewById(R.id.d4p);
        RadiusLayout radiusLayout4 = (RadiusLayout) findViewById4;
        AbstractC0976n a4 = getChildFragmentManager().mo3552a();
        C15581a aVar3 = new C15581a();
        this.f38004c = aVar3;
        Bundle bundle3 = new Bundle();
        bundle3.putParcelable("sparkContext", this.f38003b);
        aVar3.setArguments(bundle3);
        a4.mo3454a(R.id.d4p, aVar3, "popup").mo3473c();
        radiusLayout4.setOnClickListener(View$OnClickListenerC15589f.f38016a);
        C89219l.m154709a((Object) findViewById4, "");
        this.f38006f = radiusLayout4;
        View findViewById5 = a3.findViewById(R.id.d4o);
        C89219l.m154709a((Object) findViewById5, "");
        this.f38007g = findViewById5;
        List<AbstractC15510f> list2 = this.f38009i;
        C21137b bVar21 = this.f38002a;
        if (bVar21 == null) {
            C89219l.m154710a("schemaParam");
        }
        RadiusLayout radiusLayout5 = this.f38006f;
        if (radiusLayout5 == null) {
            C89219l.m154710a("popupContainer");
        }
        list2.add(new C15550c(bVar21, radiusLayout5));
        C21137b bVar22 = this.f38002a;
        if (bVar22 == null) {
            C89219l.m154710a("schemaParam");
        }
        RadiusLayout radiusLayout6 = this.f38006f;
        if (radiusLayout6 == null) {
            C89219l.m154710a("popupContainer");
        }
        C15537a aVar4 = new C15537a(bVar22, radiusLayout6);
        this.f38010j = aVar4;
        aVar4.mo25322a(C15590g.f38017a);
        return a3;
    }
}
