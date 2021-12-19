package com.p2082ss.android.ugc.aweme.donation.detail;

import android.content.Context;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.awemeservice.AwemeService;
import com.p2082ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p2082ss.android.ugc.aweme.common.AbstractC39085b;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c;
import com.p2082ss.android.ugc.aweme.donation.C43111a;
import com.p2082ss.android.ugc.aweme.donation.C43114d;
import com.p2082ss.android.ugc.aweme.donation.C43147e;
import com.p2082ss.android.ugc.aweme.donation.C43148f;
import com.p2082ss.android.ugc.aweme.donation.token.C43150a;
import com.p2082ss.android.ugc.aweme.donation.webpage.DonationWebPageDialogActivity;
import com.p2082ss.android.ugc.aweme.feed.C48027ac;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.metrics.C59208ac;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;
import com.p2082ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.trill.R;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.aweme.donation.detail.b */
public final class C43116b extends Fragment implements AbstractC39063h.AbstractC39067a, AbstractC39102c<C43147e> {

    /* renamed from: e */
    public static final String f100469e = "DonationFragment";

    /* renamed from: f */
    public static int f100470f = -1;

    /* renamed from: g */
    public static final C43117a f100471g = new C43117a((byte) 0);

    /* renamed from: a */
    public final C43141e f100472a = new C43141e();

    /* renamed from: b */
    public boolean f100473b;

    /* renamed from: c */
    public C43115a f100474c;

    /* renamed from: d */
    public boolean f100475d;

    /* renamed from: h */
    private final AbstractC89244h f100476h = C89250i.m154773a((AbstractC89171a) new C43122f(this));

    /* renamed from: i */
    private final AbstractC89244h f100477i = C89250i.m154773a((AbstractC89171a) new C43123g(this));

    /* renamed from: j */
    private final AbstractC89244h f100478j = C89250i.m154773a((AbstractC89171a) new C43125i(this));

    /* renamed from: k */
    private final AbstractC89244h f100479k = C89250i.m154773a((AbstractC89171a) new C43136s(this));

    /* renamed from: l */
    private final AbstractC89244h f100480l = C89250i.m154773a((AbstractC89171a) new C43118b(this));

    /* renamed from: m */
    private final AbstractC89244h f100481m = C89250i.m154773a((AbstractC89171a) new C43120d(this));

    /* renamed from: n */
    private final AbstractC89244h f100482n = C89250i.m154773a((AbstractC89171a) new C43126j(this));

    /* renamed from: o */
    private final AbstractC89244h f100483o = C89250i.m154773a((AbstractC89171a) new C43134q(this));

    /* renamed from: p */
    private final AbstractC89244h f100484p = C89250i.m154773a((AbstractC89171a) new C43121e(this));

    /* renamed from: q */
    private final AbstractC89244h f100485q = C89250i.m154773a((AbstractC89171a) new C43124h(this));

    /* renamed from: r */
    private final AbstractC89244h f100486r = C89250i.m154773a((AbstractC89171a) new C43127k(this));

    /* renamed from: s */
    private final AbstractC89244h f100487s = C89250i.m154773a((AbstractC89171a) new C43119c(this));

    /* renamed from: t */
    private SparseArray f100488t;

    /* renamed from: a */
    private View m86021a(int i) {
        if (this.f100488t == null) {
            this.f100488t = new SparseArray();
        }
        View view = (View) this.f100488t.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f100488t.put(i, findViewById);
        return findViewById;
    }

    /* renamed from: p */
    private final Integer m86024p() {
        return (Integer) this.f100482n.getValue();
    }

    /* renamed from: q */
    private final Integer m86025q() {
        return (Integer) this.f100485q.getValue();
    }

    /* renamed from: a */
    public final String mo73349a() {
        return (String) this.f100476h.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: a */
    public final void mo59511a(Exception exc) {
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    public final void bl_() {
    }

    /* renamed from: c */
    public final String mo73351c() {
        return (String) this.f100477i.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: c */
    public final void mo59523c(List<C43147e> list, boolean z) {
    }

    /* renamed from: d */
    public final String mo73352d() {
        return (String) this.f100478j.getValue();
    }

    /* renamed from: h */
    public final String mo73353h() {
        return (String) this.f100480l.getValue();
    }

    /* renamed from: i */
    public final Aweme mo73354i() {
        return (Aweme) this.f100481m.getValue();
    }

    /* renamed from: j */
    public final String mo73355j() {
        return (String) this.f100483o.getValue();
    }

    /* renamed from: k */
    public final String mo73356k() {
        return (String) this.f100484p.getValue();
    }

    /* renamed from: m */
    public final String mo73357m() {
        return (String) this.f100486r.getValue();
    }

    /* renamed from: n */
    public final String mo73358n() {
        return (String) this.f100487s.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.donation.detail.b$a */
    public static final class C43117a {
        static {
            Covode.recordClassIndex(51289);
        }

        private C43117a() {
        }

        public /* synthetic */ C43117a(byte b) {
            this();
        }
    }

    /* renamed from: o */
    public final void mo73359o() {
        if (!this.f100475d) {
            this.f100475d = true;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    public final void aW_() {
        C43115a aVar = this.f100474c;
        if (aVar == null) {
            C89219l.m154710a("mAdapter");
        }
        aVar.ao_();
    }

    /* renamed from: com.ss.android.ugc.aweme.donation.detail.b$b */
    static final class C43118b extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ C43116b f100489a;

        static {
            Covode.recordClassIndex(51290);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43118b(C43116b bVar) {
            super(0);
            this.f100489a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            Bundle arguments = this.f100489a.getArguments();
            if (arguments != null) {
                return arguments.getString("aid");
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.donation.detail.b$d */
    static final class C43120d extends AbstractC89220m implements AbstractC89171a<Aweme> {

        /* renamed from: a */
        final /* synthetic */ C43116b f100491a;

        static {
            Covode.recordClassIndex(51292);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43120d(C43116b bVar) {
            super(0);
            this.f100491a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Aweme invoke() {
            IAwemeService b = AwemeService.m70060b();
            String h = this.f100491a.mo73353h();
            if (h == null) {
                h = "";
            }
            return b.mo60684b(h);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.donation.detail.b$e */
    static final class C43121e extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ C43116b f100492a;

        static {
            Covode.recordClassIndex(51293);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43121e(C43116b bVar) {
            super(0);
            this.f100492a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            Bundle arguments = this.f100492a.getArguments();
            if (arguments != null) {
                return arguments.getString("sticker_id");
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.donation.detail.b$f */
    static final class C43122f extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ C43116b f100493a;

        static {
            Covode.recordClassIndex(51294);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43122f(C43116b bVar) {
            super(0);
            this.f100493a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            String string;
            Bundle arguments = this.f100493a.getArguments();
            if (arguments == null || (string = arguments.getString("enter_from", "")) == null) {
                return "";
            }
            return string;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.donation.detail.b$g */
    static final class C43123g extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ C43116b f100494a;

        static {
            Covode.recordClassIndex(51295);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43123g(C43116b bVar) {
            super(0);
            this.f100494a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            String string;
            Bundle arguments = this.f100494a.getArguments();
            if (arguments == null || (string = arguments.getString("enter_method", "")) == null) {
                return "";
            }
            return string;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.donation.detail.b$h */
    static final class C43124h extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        final /* synthetic */ C43116b f100495a;

        static {
            Covode.recordClassIndex(51296);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43124h(C43116b bVar) {
            super(0);
            this.f100495a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            Bundle arguments = this.f100495a.getArguments();
            if (arguments != null) {
                return Integer.valueOf(arguments.getInt(StringSet.type, 0));
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.donation.detail.b$j */
    static final class C43126j extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        final /* synthetic */ C43116b f100497a;

        static {
            Covode.recordClassIndex(51298);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43126j(C43116b bVar) {
            super(0);
            this.f100497a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            Bundle arguments = this.f100497a.getArguments();
            if (arguments != null) {
                return Integer.valueOf(arguments.getInt("ngo_id", 0));
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.donation.detail.b$q */
    static final class C43134q extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ C43116b f100512a;

        static {
            Covode.recordClassIndex(51306);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43134q(C43116b bVar) {
            super(0);
            this.f100512a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            Bundle arguments = this.f100512a.getArguments();
            if (arguments != null) {
                return arguments.getString("profile_uid");
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.donation.detail.b$s */
    static final class C43136s extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C43116b f100516a;

        static {
            Covode.recordClassIndex(51308);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43136s(C43116b bVar) {
            super(0);
            this.f100516a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            Bundle arguments = this.f100516a.getArguments();
            boolean z = false;
            if (arguments != null) {
                z = arguments.getBoolean("should_dim_bg", false);
            }
            return Boolean.valueOf(z);
        }
    }

    static {
        Covode.recordClassIndex(51288);
    }

    /* renamed from: r */
    private final void m86026r() {
        C43115a aVar = this.f100474c;
        if (aVar == null) {
            C89219l.m154710a("mAdapter");
        }
        aVar.ap_();
        C43115a aVar2 = this.f100474c;
        if (aVar2 == null) {
            C89219l.m154710a("mAdapter");
        }
        aVar2.mo67829d(false);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: b */
    public final void mo59515b() {
        ((DmtStatusView) m86021a(R.id.e7i)).mo27384f();
        ConstraintLayout constraintLayout = (ConstraintLayout) m86021a(R.id.cyy);
        C89219l.m154716b(constraintLayout, "");
        constraintLayout.setVisibility(8);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h.AbstractC39067a
    /* renamed from: l */
    public final void mo62679l() {
        this.f100472a.mo57616a(4);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f100472a.mo67840h();
        this.f100472a.ck_();
        super.onDestroyView();
        SparseArray sparseArray = this.f100488t;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.donation.detail.b$c */
    static final class C43119c extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ C43116b f100490a;

        static {
            Covode.recordClassIndex(51291);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43119c(C43116b bVar) {
            super(0);
            this.f100490a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            String h;
            String k = this.f100490a.mo73356k();
            if ((k == null || k.length() == 0) && (h = this.f100490a.mo73353h()) != null && h.length() != 0) {
                return "donation_sticker";
            }
            String k2 = this.f100490a.mo73356k();
            if (k2 == null || k2.length() == 0) {
                return "";
            }
            return "donation_effect";
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.donation.detail.b$i */
    static final class C43125i extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ C43116b f100496a;

        static {
            Covode.recordClassIndex(51297);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43125i(C43116b bVar) {
            super(0);
            this.f100496a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            String string;
            Bundle arguments = this.f100496a.getArguments();
            if (arguments != null && (string = arguments.getString("log_pb")) != null) {
                return string;
            }
            C48027ac acVar = C48027ac.C48028a.f111257a;
            String h = this.f100496a.mo73353h();
            Bundle arguments2 = this.f100496a.getArguments();
            int i = -1;
            if (arguments2 != null) {
                i = arguments2.getInt("page_type", -1);
            }
            String a = acVar.mo80055a(C59208ac.m108760a(h, i));
            if (a == null) {
                return "";
            }
            return a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: f */
    public final void mo59525f() {
        C43115a aVar = this.f100474c;
        if (aVar == null) {
            C89219l.m154710a("mAdapter");
        }
        if (aVar.f92274v) {
            C43115a aVar2 = this.f100474c;
            if (aVar2 == null) {
                C89219l.m154710a("mAdapter");
            }
            aVar2.mo67829d(false);
            C43115a aVar3 = this.f100474c;
            if (aVar3 == null) {
                C89219l.m154710a("mAdapter");
            }
            aVar3.notifyDataSetChanged();
            m86026r();
        }
        m86023a(true);
    }

    /* renamed from: com.ss.android.ugc.aweme.donation.detail.b$k */
    static final class C43127k extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ C43116b f100498a;

        static {
            Covode.recordClassIndex(51299);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43127k(C43116b bVar) {
            super(0);
            this.f100498a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            T t;
            List<InteractStickerStruct> interactStickerStructs;
            T t2;
            Bundle arguments = this.f100498a.getArguments();
            String str = null;
            if (arguments == null || arguments.getString("ngo_name") == null) {
                Aweme i = this.f100498a.mo73354i();
                if (i == null || (interactStickerStructs = i.getInteractStickerStructs()) == null) {
                    t = null;
                } else {
                    Iterator<T> it = interactStickerStructs.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            t2 = null;
                            break;
                        }
                        t2 = it.next();
                        T t3 = t2;
                        C89219l.m154716b(t3, "");
                        if (t3.getType() == 6) {
                            break;
                        }
                    }
                    t = t2;
                    if (t != null) {
                        str = t.getAttr();
                    }
                }
                if (TextUtils.isEmpty(str)) {
                    return "";
                }
                if (t == null) {
                    C89219l.m154715b();
                }
                return new JSONObject(t.getAttr()).optString("donation_name", "");
            }
            Bundle arguments2 = this.f100498a.getArguments();
            if (arguments2 != null) {
                return arguments2.getString("ngo_name");
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.donation.detail.b$p */
    static final class View$OnClickListenerC43133p implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C43116b f100511a;

        static {
            Covode.recordClassIndex(51305);
        }

        View$OnClickListenerC43133p(C43116b bVar) {
            this.f100511a = bVar;
        }

        /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
            java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 1
            	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            	at java.base/java.util.Objects.checkIndex(Objects.java:359)
            	at java.base/java.util.ArrayList.get(ArrayList.java:427)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
            */
        public final void onClick(android.view.View r2) {
            /*
                r1 = this;
                com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent.onClick(r2)
                com.ss.android.ugc.aweme.donation.detail.b r0 = r1.f100511a
                com.bytedance.tux.sheet.sheet.C23226a.C23228b.m43788a(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.donation.detail.C43116b.View$OnClickListenerC43133p.onClick(android.view.View):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.donation.detail.b$r */
    public static final class C43135r extends ClickableSpan {

        /* renamed from: a */
        final /* synthetic */ C43116b f100513a;

        /* renamed from: b */
        final /* synthetic */ String f100514b;

        /* renamed from: c */
        final /* synthetic */ int f100515c;

        static {
            Covode.recordClassIndex(51307);
        }

        public final void updateDrawState(TextPaint textPaint) {
            C89219l.m154721d(textPaint, "");
            super.updateDrawState(textPaint);
            textPaint.setColor(this.f100515c);
        }

        public final void onClick(View view) {
            C89219l.m154721d(view, "");
            C43116b bVar = this.f100513a;
            bVar.mo73350a(this.f100514b, bVar.mo73349a());
        }

        C43135r(C43116b bVar, String str, int i) {
            this.f100513a = bVar;
            this.f100514b = str;
            this.f100515c = i;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.donation.detail.b$m */
    public static final class C43129m extends ClickableSpan {

        /* renamed from: a */
        final /* synthetic */ C43116b f100501a;

        /* renamed from: b */
        final /* synthetic */ int f100502b;

        static {
            Covode.recordClassIndex(51301);
        }

        public final void onClick(View view) {
            C89219l.m154721d(view, "");
            this.f100501a.mo73350a(C43114d.m86018a().f100463a, this.f100501a.mo73349a());
        }

        public final void updateDrawState(TextPaint textPaint) {
            C89219l.m154721d(textPaint, "");
            super.updateDrawState(textPaint);
            textPaint.setColor(this.f100502b);
            textPaint.setUnderlineText(false);
        }

        C43129m(C43116b bVar, int i) {
            this.f100501a = bVar;
            this.f100502b = i;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.donation.detail.b$n */
    static final class View$OnClickListenerC43130n implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C43116b f100503a;

        static {
            Covode.recordClassIndex(51302);
        }

        View$OnClickListenerC43130n(C43116b bVar) {
            this.f100503a = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f100503a.f100472a.mo57616a(1);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: c */
    public final void mo59522c(Exception exc) {
        C43115a aVar = this.f100474c;
        if (aVar == null) {
            C89219l.m154710a("mAdapter");
        }
        aVar.mo67812a((RecyclerView) m86021a(R.id.anr), false);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: b */
    public final void mo59516b(Exception exc) {
        C43115a aVar = this.f100474c;
        if (aVar == null) {
            C89219l.m154710a("mAdapter");
        }
        if (aVar.f92274v) {
            C43115a aVar2 = this.f100474c;
            if (aVar2 == null) {
                C89219l.m154710a("mAdapter");
            }
            aVar2.mo67829d(false);
            C43115a aVar3 = this.f100474c;
            if (aVar3 == null) {
                C89219l.m154710a("mAdapter");
            }
            aVar3.notifyDataSetChanged();
        }
        ((DmtStatusView) m86021a(R.id.e7i)).mo27387h();
        ConstraintLayout constraintLayout = (ConstraintLayout) m86021a(R.id.cyy);
        C89219l.m154716b(constraintLayout, "");
        constraintLayout.setVisibility(8);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        C33744d dVar = new C33744d();
        String h = mo73353h();
        String str2 = "";
        if (h == null) {
            h = str2;
        }
        C33744d a = dVar.mo59983a("group_id", h);
        Aweme i = mo73354i();
        if ((i == null || (str = i.getAuthorUid()) == null) && (str = mo73355j()) == null) {
            str = str2;
        }
        C33744d a2 = a.mo59983a("author_id", str);
        Integer p = m86024p();
        if (p != null) {
            str2 = p;
        }
        C39162r.m79460a("donation_panel_show", a2.mo59982a("ngo_id", (Object) str2).mo59983a("enter_from", mo73349a()).mo59983a("enter_method", mo73351c()).mo59983a("log_pb", mo73352d()).mo59983a("ngo_name", mo73357m()).mo59983a("anchor_type", mo73358n()).f79943a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.donation.detail.b$l */
    public static final class View$OnClickListenerC43128l implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C43116b f100499a;

        /* renamed from: b */
        final /* synthetic */ C43111a f100500b;

        static {
            Covode.recordClassIndex(51300);
        }

        View$OnClickListenerC43128l(C43116b bVar, C43111a aVar) {
            this.f100499a = bVar;
            this.f100500b = aVar;
        }

        public final void onClick(View view) {
            String authorUid;
            ClickAgent.onClick(view);
            this.f100499a.mo73359o();
            C33744d dVar = new C33744d();
            String h = this.f100499a.mo73353h();
            String str = "";
            if (h == null) {
                h = str;
            }
            C33744d a = dVar.mo59983a("group_id", h);
            Aweme i = this.f100499a.mo73354i();
            if (!(i == null || (authorUid = i.getAuthorUid()) == null)) {
                str = authorUid;
            }
            C39162r.m79460a("donation_h5_entrance_click", a.mo59983a("author_id", str).mo59983a("enter_from", this.f100499a.mo73349a()).mo59983a("ngo_name", this.f100499a.mo73357m()).mo59983a("enter_method", "donation_panel").mo59983a("log_pb", this.f100499a.mo73352d()).f79943a);
            C43111a aVar = this.f100500b;
            if (aVar != null && aVar.f100455a != null) {
                String str2 = this.f100500b.f100455a;
                if (str2 == null) {
                    C89219l.m154715b();
                }
                if (str2.length() > 0) {
                    this.f100499a.mo73350a(this.f100500b.f100455a, this.f100499a.mo73349a());
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.donation.detail.b$o */
    static final class View$OnClickListenerC43131o implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C43116b f100504a;

        /* renamed from: b */
        final /* synthetic */ View f100505b;

        /* renamed from: c */
        final /* synthetic */ Context f100506c;

        /* renamed from: d */
        final /* synthetic */ C89233z.C89238e f100507d;

        /* renamed from: e */
        final /* synthetic */ C89233z.C89236c f100508e;

        /* renamed from: f */
        final /* synthetic */ JSONObject f100509f;

        static {
            Covode.recordClassIndex(51303);
        }

        View$OnClickListenerC43131o(C43116b bVar, View view, Context context, C89233z.C89238e eVar, C89233z.C89236c cVar, JSONObject jSONObject) {
            this.f100504a = bVar;
            this.f100505b = view;
            this.f100506c = context;
            this.f100507d = eVar;
            this.f100508e = cVar;
            this.f100509f = jSONObject;
        }

        public final void onClick(View view) {
            String str;
            String str2;
            String str3;
            ClickAgent.onClick(view);
            if (!C58001a.m104815a(this.f100505b, 1200)) {
                T t = this.f100504a.f100472a.f92286h;
                C89219l.m154716b(t, "");
                C43148f fVar = t.mData.f100457a;
                String str4 = null;
                if (fVar != null) {
                    str = fVar.f100548b;
                } else {
                    str = null;
                }
                if (TextUtils.isEmpty(str)) {
                    new C79459a(this.f100506c).mo123052a(this.f100506c.getString(R.string.bai)).mo123053a();
                    return;
                }
                C33744d dVar = new C33744d();
                String h = this.f100504a.mo73353h();
                if (h == null) {
                    h = "";
                }
                C33744d a = dVar.mo59983a("group_id", h);
                Aweme i = this.f100504a.mo73354i();
                if (i == null || (str2 = i.getAuthorUid()) == null) {
                    str2 = this.f100504a.mo73355j();
                    if (str2 == null) {
                        str2 = "";
                    }
                    C89219l.m154716b(str2, "");
                }
                C33744d a2 = a.mo59983a("author_id", str2);
                T t2 = this.f100504a.f100472a.f92286h;
                C89219l.m154716b(t2, "");
                C43148f fVar2 = t2.mData.f100457a;
                if (fVar2 != null) {
                    str3 = fVar2.f100548b;
                } else {
                    str3 = null;
                }
                C39162r.m79460a("donation_panel_donate_click", a2.mo59983a("link", str3).mo59983a("link_type", "nonprofit").mo59983a("enter_from", this.f100504a.mo73349a()).mo59983a("enter_method", this.f100504a.mo73351c()).mo59983a("log_pb", this.f100504a.mo73352d()).mo59983a("ngo_name", this.f100504a.mo73357m()).mo59983a("anchor_type", this.f100504a.mo73358n()).f79943a);
                this.f100504a.mo73359o();
                this.f100504a.f100473b = true;
                if (this.f100507d.element != null && this.f100508e.element > 0) {
                    ActivityC0945e activity = this.f100504a.getActivity();
                    T t3 = this.f100507d.element;
                    int i2 = this.f100508e.element;
                    T t4 = this.f100504a.f100472a.f92286h;
                    C89219l.m154716b(t4, "");
                    C43148f fVar3 = t4.mData.f100457a;
                    if (fVar3 != null) {
                        str4 = fVar3.f100548b;
                    }
                    C43150a.m86050a(activity, t3, i2, str4, this.f100509f.toString(), new AbstractC89172b<String, C89391z>(this) {
                        /* class com.p2082ss.android.ugc.aweme.donation.detail.C43116b.View$OnClickListenerC43131o.C431321 */

                        /* renamed from: a */
                        final /* synthetic */ View$OnClickListenerC43131o f100510a;

                        static {
                            Covode.recordClassIndex(51304);
                        }

                        {
                            this.f100510a = r2;
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // p4600h.p4611f.p4612a.AbstractC89172b
                        public final /* synthetic */ C89391z invoke(String str) {
                            this.f100510a.f100504a.mo73350a(str, this.f100510a.f100504a.mo73349a());
                            return C89391z.f203057a;
                        }
                    });
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01bc  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0280  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x028e  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x02a3  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m86023a(boolean r14) {
        /*
        // Method dump skipped, instructions count: 762
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.donation.detail.C43116b.m86023a(boolean):void");
    }

    /* renamed from: a */
    private static View m86022a(Context context, int i) {
        TuxTextView tuxTextView = new TuxTextView(context, null, 0, 6);
        tuxTextView.setTuxFont(51);
        tuxTextView.setGravity(17);
        tuxTextView.setTextColorRes(R.attr.bj);
        tuxTextView.setText(i);
        return tuxTextView;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: b */
    public final void mo59517b(List<C43147e> list, boolean z) {
        if (list == null || list.isEmpty()) {
            z = false;
        }
        if (!z) {
            C43115a aVar = this.f100474c;
            if (aVar == null) {
                C89219l.m154710a("mAdapter");
            }
            aVar.mo67829d(false);
        } else {
            C43115a aVar2 = this.f100474c;
            if (aVar2 == null) {
                C89219l.m154710a("mAdapter");
            }
            aVar2.aq_();
        }
        C43115a aVar3 = this.f100474c;
        if (aVar3 == null) {
            C89219l.m154710a("mAdapter");
        }
        aVar3.mo62376b(list);
    }

    /* renamed from: a */
    public final void mo73350a(String str, String str2) {
        String str3;
        C89219l.m154721d(str2, "");
        if (getActivity() != null || getContext() != null) {
            Bundle bundle = new Bundle();
            bundle.putString("url", str);
            Context context = getContext();
            if (context == null || (str3 = context.getString(R.string.baa)) == null) {
                str3 = "";
            }
            bundle.putString("title", str3);
            bundle.putString("enter_from", str2);
            bundle.putString("hide_more", "false");
            Context activity = getActivity();
            if (activity == null && (activity = getContext()) == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(activity, "");
            DonationWebPageDialogActivity.C43156a.m86055a(activity, bundle);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: a */
    public final void mo59512a(List<C43147e> list, boolean z) {
        C43115a aVar = this.f100474c;
        if (aVar == null) {
            C89219l.m154710a("mAdapter");
        }
        aVar.mo67829d(true);
        if (!z) {
            m86026r();
        } else {
            C43115a aVar2 = this.f100474c;
            if (aVar2 == null) {
                C89219l.m154710a("mAdapter");
            }
            aVar2.aq_();
        }
        m86023a(false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Long l;
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        Context context = view.getContext();
        C89219l.m154716b(context, "");
        View a = m86022a(context, (int) R.string.cxh);
        a.setOnClickListener(new View$OnClickListenerC43130n(this));
        DmtStatusView.C17269a c = DmtStatusView.C17269a.m31905a(context).mo27406b(m86022a(context, (int) R.string.ba9)).mo27408c(a);
        c.f41304g = 0;
        ((DmtStatusView) m86021a(R.id.e7i)).setBuilder(c);
        C43115a aVar = new C43115a(this);
        aVar.mo67813a((AbstractC39063h.AbstractC39067a) this);
        RecyclerView recyclerView = (RecyclerView) m86021a(R.id.anr);
        C89219l.m154716b(recyclerView, "");
        recyclerView.setLayoutManager(new LinearLayoutManager());
        RecyclerView recyclerView2 = (RecyclerView) m86021a(R.id.anr);
        C89219l.m154716b(recyclerView2, "");
        recyclerView2.setAdapter(aVar);
        this.f100474c = aVar;
        C89233z.C89238e eVar = new C89233z.C89238e();
        Long l2 = null;
        eVar.element = null;
        C89233z.C89236c cVar = new C89233z.C89236c();
        cVar.element = -1;
        Integer q = m86025q();
        if (q != null && q.intValue() == 4) {
            eVar.element = (T) mo73356k();
            cVar.element = 4;
        } else {
            Integer q2 = m86025q();
            if (q2 != null && q2.intValue() == 3) {
                eVar.element = (T) mo73355j();
                cVar.element = 3;
            } else {
                Integer q3 = m86025q();
                if (q3 != null && q3.intValue() == 1) {
                    eVar.element = (T) mo73353h();
                    cVar.element = 1;
                } else {
                    String h = mo73353h();
                    if (h == null || h.length() == 0) {
                        String j = mo73355j();
                        if (j == null || j.length() == 0) {
                            String k = mo73356k();
                            if (!(k == null || k.length() == 0)) {
                                eVar.element = (T) mo73356k();
                                cVar.element = 4;
                            }
                        } else {
                            eVar.element = (T) mo73355j();
                            cVar.element = 3;
                        }
                    } else {
                        eVar.element = (T) mo73353h();
                        cVar.element = 1;
                    }
                }
            }
        }
        JSONObject jSONObject = new JSONObject();
        String k2 = mo73356k();
        if (!(k2 == null || k2.length() == 0)) {
            try {
                String k3 = mo73356k();
                if (k3 != null) {
                    l = Long.valueOf(Long.parseLong(k3));
                } else {
                    l = null;
                }
                jSONObject.put("effect_id", l);
            } catch (NumberFormatException unused) {
            }
        }
        ((TuxButton) m86021a(R.id.an5)).setOnClickListener(new View$OnClickListenerC43131o(this, view, context, eVar, cVar, jSONObject));
        ((TuxIconView) m86021a(R.id.pi)).setOnClickListener(new View$OnClickListenerC43133p(this));
        C43141e eVar2 = this.f100472a;
        long j2 = 0L;
        try {
            T t = eVar.element;
            if (t != null) {
                l2 = Long.valueOf(Long.parseLong(t));
            }
            j2 = l2;
        } catch (NumberFormatException unused2) {
        }
        eVar2.mo67838a((AbstractC39085b) new C43139d(mo73353h(), m86024p(), mo73355j(), j2, Integer.valueOf(cVar.element), jSONObject.toString()));
        eVar2.mo67839a_(this);
        eVar2.mo57616a(1);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.y1, viewGroup, false);
    }
}
