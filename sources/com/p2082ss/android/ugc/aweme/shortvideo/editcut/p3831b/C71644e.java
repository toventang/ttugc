package com.p2082ss.android.ugc.aweme.shortvideo.editcut.p3831b;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.core.p036g.C0692e;
import com.C1764a;
import com.bytedance.als.AbstractC2565m;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.jedi.arch.C20391d;
import com.bytedance.jedi.arch.C20526p;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.p1561b.C21572a;
import com.bytedance.scene.group.AbstractC22186b;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.shortvideo.C71812ep;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.model.C70091f;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.AbstractC70516a;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.viewmodel.C70576a;
import com.p2082ss.android.ugc.aweme.shortvideo.editcut.AbstractC71692e;
import com.p2082ss.android.ugc.aweme.shortvideo.editcut.AbstractC71775m;
import com.p2082ss.android.ugc.aweme.shortvideo.editcut.C71772l;
import com.p2082ss.android.ugc.aweme.shortvideo.editcut.EditAdjustClipsBottomViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.editcut.p3830a.C71557a;
import com.p2082ss.android.ugc.aweme.shortvideo.editcut.p3830a.C71558b;
import com.p2082ss.android.ugc.aweme.shortvideo.editcut.p3831b.p3832a.C71594d;
import com.p2082ss.android.ugc.aweme.shortvideo.editcut.p3831b.p3832a.C71610k;
import com.p2082ss.android.ugc.aweme.shortvideo.editcut.p3831b.p3832a.C71616m;
import com.p2082ss.android.ugc.aweme.shortvideo.editcut.p3831b.p3832a.C71620o;
import com.p2082ss.android.ugc.aweme.shortvideo.editcut.p3831b.p3832a.C71627r;
import com.p2082ss.android.ugc.aweme.utils.C80332db;
import com.p2082ss.android.ugc.tools.view.C84916a;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.b.e */
public final class C71644e extends AbstractC71564a {

    /* renamed from: h */
    static final /* synthetic */ AbstractC89286i[] f160520h = {new C89232y(C71644e.class, "adjustClipsModel", "getAdjustClipsModel()Lcom/ss/android/ugc/aweme/shortvideo/editcut/model/EditAdjustClipsModel;", 0), new C89232y(C71644e.class, "videoEditViewModel", "getVideoEditViewModel()Lcom/ss/android/ugc/aweme/shortvideo/cut/videoedit/VideoEditViewModel;", 0), new C89232y(C71644e.class, "editAdjustApi", "getEditAdjustApi()Lcom/ss/android/ugc/aweme/shortvideo/editcut/EditAdjustClipsApi;", 0), new C89232y(C71644e.class, "editCutInternalApi", "getEditCutInternalApi()Lcom/ss/android/ugc/aweme/shortvideo/editcut/EditCutInternalApi;", 0), new C89232y(C71644e.class, "bottomViewModel", "getBottomViewModel()Lcom/ss/android/ugc/aweme/shortvideo/editcut/EditAdjustClipsBottomViewModel;", 0)};

    /* renamed from: u */
    public static final C71645a f160521u = new C71645a((byte) 0);

    /* renamed from: A */
    private final AbstractC89244h f160522A;

    /* renamed from: B */
    private final AbstractC89244h f160523B;

    /* renamed from: C */
    private final AbstractC89248d f160524C;

    /* renamed from: D */
    private final AbstractC89248d f160525D;

    /* renamed from: E */
    private final AbstractC89248d f160526E;

    /* renamed from: F */
    private final AbstractC89248d f160527F;

    /* renamed from: G */
    private final AbstractC89248d f160528G;

    /* renamed from: H */
    private View f160529H;

    /* renamed from: i */
    public int f160530i;

    /* renamed from: j */
    public boolean f160531j;

    /* renamed from: k */
    public int f160532k;

    /* renamed from: l */
    public int f160533l;

    /* renamed from: t */
    public TextView f160534t;

    /* renamed from: v */
    private final String f160535v = "MultiClipsAdjustBottomScene";

    /* renamed from: w */
    private boolean f160536w = true;

    /* renamed from: x */
    private final AbstractC89244h f160537x;

    /* renamed from: y */
    private final AbstractC89244h f160538y;

    /* renamed from: z */
    private final AbstractC89244h f160539z;

    static {
        Covode.recordClassIndex(84189);
    }

    /* renamed from: T */
    private final C71627r m126548T() {
        return (C71627r) this.f160537x.getValue();
    }

    /* renamed from: U */
    private final C71620o m126549U() {
        return (C71620o) this.f160538y.getValue();
    }

    /* renamed from: V */
    private final C71594d m126550V() {
        return (C71594d) this.f160539z.getValue();
    }

    /* renamed from: W */
    private final C71610k m126551W() {
        return (C71610k) this.f160522A.getValue();
    }

    /* renamed from: X */
    private final C71616m m126552X() {
        return (C71616m) this.f160523B.getValue();
    }

    /* renamed from: Y */
    private final VideoEditViewModel m126553Y() {
        return (VideoEditViewModel) this.f160525D.mo23374a(this, f160520h[1]);
    }

    /* renamed from: Z */
    private final AbstractC71775m m126554Z() {
        return (AbstractC71775m) this.f160527F.mo23374a(this, f160520h[3]);
    }

    /* renamed from: aa */
    private final EditAdjustClipsBottomViewModel m126555aa() {
        return (EditAdjustClipsBottomViewModel) this.f160528G.mo23374a(this, f160520h[4]);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.shortvideo.editcut.p3831b.AbstractC71564a
    /* renamed from: E */
    public final int mo62771E() {
        return R.layout.d5;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.b.e$a */
    public static final class C71645a {
        static {
            Covode.recordClassIndex(84190);
        }

        private C71645a() {
        }

        public /* synthetic */ C71645a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.editcut.p3831b.AbstractC71643d
    /* renamed from: a */
    public final String mo113345a() {
        return this.f160535v;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.b.e$b */
    static final class C71646b extends AbstractC89220m implements AbstractC89171a<C71627r> {

        /* renamed from: a */
        final /* synthetic */ C71644e f160540a;

        /* renamed from: b */
        final /* synthetic */ C21582f f160541b;

        static {
            Covode.recordClassIndex(84191);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C71646b(C71644e eVar, C21582f fVar) {
            super(0);
            this.f160540a = eVar;
            this.f160541b = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C71627r invoke() {
            return new C71627r(this.f160541b, this.f160540a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.b.e$m */
    static final class C71657m extends AbstractC89220m implements AbstractC89171a<C71620o> {

        /* renamed from: a */
        final /* synthetic */ C71644e f160552a;

        /* renamed from: b */
        final /* synthetic */ C21582f f160553b;

        static {
            Covode.recordClassIndex(84202);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C71657m(C71644e eVar, C21582f fVar) {
            super(0);
            this.f160552a = eVar;
            this.f160553b = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C71620o invoke() {
            return new C71620o(this.f160553b, this.f160552a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.b.e$n */
    static final class C71658n extends AbstractC89220m implements AbstractC89171a<C71594d> {

        /* renamed from: a */
        final /* synthetic */ C71644e f160554a;

        /* renamed from: b */
        final /* synthetic */ C21582f f160555b;

        static {
            Covode.recordClassIndex(84203);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C71658n(C71644e eVar, C21582f fVar) {
            super(0);
            this.f160554a = eVar;
            this.f160555b = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C71594d invoke() {
            return new C71594d(this.f160555b, this.f160554a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.b.e$o */
    static final class C71659o extends AbstractC89220m implements AbstractC89171a<C71610k> {

        /* renamed from: a */
        final /* synthetic */ C71644e f160556a;

        /* renamed from: b */
        final /* synthetic */ C21582f f160557b;

        static {
            Covode.recordClassIndex(84204);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C71659o(C71644e eVar, C21582f fVar) {
            super(0);
            this.f160556a = eVar;
            this.f160557b = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C71610k invoke() {
            return new C71610k(this.f160557b, this.f160556a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.b.e$p */
    static final class C71660p extends AbstractC89220m implements AbstractC89171a<C71616m> {

        /* renamed from: a */
        final /* synthetic */ C71644e f160558a;

        /* renamed from: b */
        final /* synthetic */ C21582f f160559b;

        static {
            Covode.recordClassIndex(84205);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C71660p(C71644e eVar, C21582f fVar) {
            super(0);
            this.f160558a = eVar;
            this.f160559b = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C71616m invoke() {
            return new C71616m(this.f160559b, this.f160558a);
        }
    }

    /* renamed from: R */
    private final boolean m126546R() {
        if (!C71558b.m126459b((C71557a) this.f160524C.mo23374a(this, f160520h[0])) || !this.f160536w) {
            return false;
        }
        return true;
    }

    /* renamed from: S */
    private final boolean m126547S() {
        if (m126555aa().mo113264a().getCurrentTabIndex() == 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.shortvideo.editcut.p3831b.AbstractC71564a
    /* renamed from: P */
    public final void mo113327P() {
        super.mo113327P();
        View c = mo36475c(R.id.b4b);
        C89219l.m154716b(c, "");
        this.f160529H = c;
        View c2 = mo36475c(R.id.fbq);
        C89219l.m154716b(c2, "");
        mo113329a((AbstractC70516a) c2);
        View c3 = mo36475c(R.id.evi);
        C89219l.m154716b(c3, "");
        this.f160534t = (TextView) c3;
    }

    /* renamed from: Q */
    public final void mo113354Q() {
        int i = 8;
        if (!m126547S() || this.f160530i == 1) {
            View view = this.f160529H;
            if (view == null) {
                C89219l.m154710a("editViewContainer");
            }
            view.setVisibility(0);
            m126552X().mo113332d();
            if (m126546R()) {
                m126549U().mo113331b();
            } else {
                m126548T().mo113331b();
            }
            m126550V().mo113331b();
            TextView textView = this.f160534t;
            if (textView == null) {
                C89219l.m154710a("tvDurationIndicator");
            }
            if (m126546R()) {
                i = 0;
            }
            textView.setVisibility(i);
            return;
        }
        View view2 = this.f160529H;
        if (view2 == null) {
            C89219l.m154710a("editViewContainer");
        }
        view2.setVisibility(8);
        m126552X().mo113331b();
        m126550V().mo113332d();
        m126548T().mo113332d();
        if (m126546R()) {
            m126549U().mo113331b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.b.e$e */
    static final class C71649e<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C71644e f160544a;

        static {
            Covode.recordClassIndex(84194);
        }

        C71649e(C71644e eVar) {
            this.f160544a = eVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            this.f160544a.mo113357a(false, false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.b.e$f */
    static final class C71650f<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C71644e f160545a;

        static {
            Covode.recordClassIndex(84195);
        }

        C71650f(C71644e eVar) {
            this.f160545a = eVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            this.f160545a.mo113357a(true, false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.b.e$g */
    static final class C71651g<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C71644e f160546a;

        static {
            Covode.recordClassIndex(84196);
        }

        C71651g(C71644e eVar) {
            this.f160546a = eVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            this.f160546a.mo113357a(false, true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.b.e$l */
    static final class C71656l extends AbstractC89220m implements AbstractC89172b<Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C71644e f160551a;

        static {
            Covode.recordClassIndex(84201);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C71656l(C71644e eVar) {
            super(1);
            this.f160551a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Integer num) {
            num.intValue();
            this.f160551a.mo113354Q();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.b.e$d */
    static final class C71648d<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C71644e f160543a;

        static {
            Covode.recordClassIndex(84193);
        }

        C71648d(C71644e eVar) {
            this.f160543a = eVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            C0692e eVar = (C0692e) obj;
            C71644e eVar2 = this.f160543a;
            F f = eVar.f2750a;
            if (f == null) {
                C89219l.m154715b();
            }
            S s = eVar.f2751b;
            if (s == null) {
                C89219l.m154715b();
            }
            eVar2.mo113355a(C89387v.m154943a(f, s));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.b.e$i */
    static final class C71653i extends AbstractC89220m implements AbstractC89172b<C20391d<? extends List<? extends VideoSegment>>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C71644e f160548a;

        static {
            Covode.recordClassIndex(84198);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C71653i(C71644e eVar) {
            super(1);
            this.f160548a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C20391d<? extends List<? extends VideoSegment>> dVar) {
            C20391d<? extends List<? extends VideoSegment>> dVar2 = dVar;
            C89219l.m154721d(dVar2, "");
            this.f160548a.mo113318G().mo111104a(dVar2.f48283b);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.b.e$j */
    static final class C71654j extends AbstractC89220m implements AbstractC89172b<C20526p, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C71644e f160549a;

        static {
            Covode.recordClassIndex(84199);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C71654j(C71644e eVar) {
            super(1);
            this.f160549a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C20526p pVar) {
            C89219l.m154721d(pVar, "");
            this.f160549a.mo113318G().mo111108e();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.b.e$k */
    static final class C71655k extends AbstractC89220m implements AbstractC89172b<Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C71644e f160550a;

        static {
            Covode.recordClassIndex(84200);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C71655k(C71644e eVar) {
            super(1);
            this.f160550a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Integer num) {
            this.f160550a.f160530i = num.intValue();
            this.f160550a.mo113354Q();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.b.e$c */
    static final class C71647c extends AbstractC89220m implements AbstractC89172b<Float, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C71644e f160542a;

        static {
            Covode.recordClassIndex(84192);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C71647c(C71644e eVar) {
            super(1);
            this.f160542a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Float f) {
            float floatValue = f.floatValue();
            StringBuilder sb = new StringBuilder();
            String a = C1764a.m5929a(Locale.getDefault(), "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(floatValue)}, 1));
            C89219l.m154716b(a, "");
            String sb2 = sb.append(a).append("s").toString();
            TextView textView = this.f160542a.f160534t;
            if (textView == null) {
                C89219l.m154710a("tvDurationIndicator");
            }
            textView.setText(sb2);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.b.e$h */
    static final class C71652h<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C71644e f160547a;

        static {
            Covode.recordClassIndex(84197);
        }

        C71652h(C71644e eVar) {
            this.f160547a = eVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            Integer valueOf;
            C70091f fVar = (C70091f) obj;
            if (fVar != null && (valueOf = Integer.valueOf(fVar.f156760d)) != null) {
                if (valueOf.intValue() == 0) {
                    if (this.f160547a.f160531j) {
                        this.f160547a.f160532k = fVar.f156761e;
                        this.f160547a.f160533l = fVar.f156758b;
                        this.f160547a.mo113322K().mo111336a(new C70576a(2, false));
                    }
                    this.f160547a.f160531j = false;
                } else if (valueOf != null && valueOf.intValue() != 1 && valueOf.intValue() == 2) {
                    C71644e eVar = this.f160547a;
                    eVar.mo113356a(C89387v.m154943a(Integer.valueOf(eVar.f160532k), Integer.valueOf(fVar.f156762f)), C89387v.m154943a(Integer.valueOf(this.f160547a.f160533l), Integer.valueOf(fVar.f156759c)));
                    this.f160547a.f160531j = true;
                }
            }
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j, com.p2082ss.android.ugc.aweme.shortvideo.editcut.p3831b.AbstractC71564a
    /* renamed from: a */
    public final void mo22704a(Bundle bundle) {
        super.mo22704a(bundle);
        AbstractC88412b unused = m126555aa().mo33677a(this, C71661f.f160560a, new C20370ah(), new C71653i(this));
        AbstractC88412b unused2 = m126555aa().mo33677a(this, C71662g.f160561a, new C20370ah(), new C71654j(this));
        AbstractC88412b unused3 = m126555aa().mo33677a(this, C71663h.f160562a, new C20370ah(), new C71655k(this));
        AbstractC88412b unused4 = m126555aa().mo33677a(this, C71664i.f160563a, new C20370ah(), new C71656l(this));
        AbstractC88412b unused5 = m126555aa().mo33677a(this, C71665j.f160564a, new C20370ah(), new C71647c(this));
        m126553Y().f157690o.observe(this, new C71648d(this));
        m126553Y().f157691p.observe(this, new C71649e(this));
        m126553Y().f157692q.observe(this, new C71650f(this));
        m126553Y().f157693r.observe(this, new C71651g(this));
        mo113319H().f156538j.observe(this, new C71652h(this));
        mo113354Q();
    }

    /* renamed from: a */
    public final void mo113355a(C89378p<Integer, Integer> pVar) {
        String str;
        TextView textView = this.f160534t;
        if (textView == null) {
            C89219l.m154710a("tvDurationIndicator");
        }
        textView.setVisibility(8);
        VideoSegment videoSegment = m126553Y().mo111232k().get(pVar.getSecond().intValue());
        this.f160536w = false;
        m126549U().mo113332d();
        m126550V().mo113332d();
        m126548T().mo113331b();
        if (!m126547S()) {
            mo113326O().mo113350d();
        } else {
            mo113326O().mo113349C();
        }
        C71610k W = m126551W();
        W.mo113331b();
        C89219l.m154716b(videoSegment, "");
        C89219l.m154721d(videoSegment, "");
        if (TextUtils.isEmpty(videoSegment.f156716h)) {
            str = videoSegment.mo110571a(false);
        } else {
            str = videoSegment.f156716h;
        }
        C89219l.m154716b(str, "");
        SimpleDraweeView simpleDraweeView = W.f160460b;
        if (simpleDraweeView == null) {
            C89219l.m154710a("ivCover");
        }
        Drawable a = C84916a.m145947a(637534207, 637534207, 0, C71812ep.m126783a(2.0d, C63247i.f143610a));
        C89219l.m154716b(a, "");
        C71772l.m126682a(simpleDraweeView, str, a, C71812ep.m126783a(48.0d, C63247i.f143610a), (C80332db) W.f160463e.mo23374a(W, C71610k.f160458a[2]));
        m126554Z().mo113382b(pVar.getFirst().intValue(), pVar.getSecond().intValue());
    }

    /* renamed from: a */
    public final void mo113356a(C89378p<Integer, Integer> pVar, C89378p<Integer, Integer> pVar2) {
        mo113318G().mo111145c();
        m126554Z().mo113377a(pVar, pVar2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C71644e(C21582f fVar, AbstractC22186b bVar) {
        super(fVar, bVar);
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(bVar, "");
        this.f160537x = C89250i.m154773a((AbstractC89171a) new C71646b(this, fVar));
        this.f160538y = C89250i.m154773a((AbstractC89171a) new C71657m(this, fVar));
        this.f160539z = C89250i.m154773a((AbstractC89171a) new C71658n(this, fVar));
        this.f160522A = C89250i.m154773a((AbstractC89171a) new C71659o(this, fVar));
        this.f160523B = C89250i.m154773a((AbstractC89171a) new C71660p(this, fVar));
        this.f160530i = 1;
        this.f160531j = true;
        this.f160532k = -1;
        this.f160533l = -1;
        this.f160524C = C21572a.m40504a(getDiContainer(), C71557a.class);
        this.f160525D = C21572a.m40504a(getDiContainer(), VideoEditViewModel.class);
        this.f160526E = C21572a.m40504a(getDiContainer(), AbstractC71692e.class);
        this.f160527F = C21572a.m40504a(getDiContainer(), AbstractC71775m.class);
        this.f160528G = C21572a.m40504a(getDiContainer(), EditAdjustClipsBottomViewModel.class);
    }

    /* renamed from: a */
    public final void mo113357a(boolean z, boolean z2) {
        int i;
        ArrayList arrayList;
        if (z2) {
            VideoEditViewModel Y = m126553Y();
            C89219l.m154721d(Y, "");
            C89219l.m154721d(Y, "");
            List<VideoSegment> j = Y.mo111231j();
            if (j != null) {
                ArrayList arrayList2 = new ArrayList();
                for (T t : j) {
                    if (!t.f156717i) {
                        arrayList2.add(t);
                    }
                }
                arrayList = arrayList2;
            } else {
                arrayList = C89086z.INSTANCE;
            }
            if (arrayList.isEmpty()) {
                ((AbstractC71692e) this.f160526E.mo23374a(this, f160520h[2])).mo113407v();
                return;
            }
        }
        this.f160536w = true;
        mo113326O().mo113349C();
        m126551W().mo113332d();
        if (m126546R()) {
            m126548T().mo113332d();
            m126549U().mo113331b();
        }
        m126550V().mo113331b();
        m126554Z().mo113380a(z, z2);
        TextView textView = this.f160534t;
        if (textView == null) {
            C89219l.m154710a("tvDurationIndicator");
        }
        if (m126546R()) {
            i = 0;
        } else {
            i = 8;
        }
        textView.setVisibility(i);
    }
}
