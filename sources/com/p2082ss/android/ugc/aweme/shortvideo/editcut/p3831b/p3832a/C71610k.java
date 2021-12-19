package com.p2082ss.android.ugc.aweme.shortvideo.editcut.p3831b.p3832a;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.p1561b.C21572a;
import com.bytedance.scene.group.AbstractC22186b;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.C70082m;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.editcut.EditAdjustClipsBottomViewModel;
import com.p2082ss.android.ugc.aweme.utils.C80332db;
import com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d;
import com.p2082ss.android.ugc.trill.R;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.b.a.k */
public final class C71610k extends AbstractC71586a {

    /* renamed from: a */
    public static final /* synthetic */ AbstractC89286i[] f160458a = {new C89232y(C71610k.class, "cutMultiVideoViewModel", "getCutMultiVideoViewModel()Lcom/ss/android/ugc/aweme/shortvideo/cut/CutMultiVideoViewModel;", 0), new C89232y(C71610k.class, "bottomViewModel", "getBottomViewModel()Lcom/ss/android/ugc/aweme/shortvideo/editcut/EditAdjustClipsBottomViewModel;", 0), new C89232y(C71610k.class, "thumbnailCache", "getThumbnailCache()Lcom/ss/android/ugc/aweme/utils/FrameCache;", 0)};

    /* renamed from: f */
    public static final C71611a f160459f = new C71611a((byte) 0);

    /* renamed from: b */
    public SimpleDraweeView f160460b;

    /* renamed from: c */
    public View f160461c;

    /* renamed from: d */
    public View f160462d;

    /* renamed from: e */
    public final AbstractC89248d f160463e = C21572a.m40504a(getDiContainer(), C80332db.class);

    /* renamed from: g */
    private final String f160464g = "SingleEditModeBottomScene";

    /* renamed from: h */
    private final AbstractC89248d f160465h = C21572a.m40504a(getDiContainer(), CutMultiVideoViewModel.class);

    /* renamed from: i */
    private final AbstractC89248d f160466i = C21572a.m40504a(getDiContainer(), EditAdjustClipsBottomViewModel.class);

    static {
        Covode.recordClassIndex(84155);
    }

    /* renamed from: C */
    public final CutMultiVideoViewModel mo113346C() {
        return (CutMultiVideoViewModel) this.f160465h.mo23374a(this, f160458a[0]);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.b.a.k$a */
    public static final class C71611a {
        static {
            Covode.recordClassIndex(84156);
        }

        private C71611a() {
        }

        public /* synthetic */ C71611a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.editcut.p3831b.AbstractC71643d
    /* renamed from: a */
    public final String mo113345a() {
        return this.f160464g;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.b.a.k$b */
    public static final class C71612b extends AbstractView$OnClickListenerC81432d {

        /* renamed from: a */
        final /* synthetic */ C71610k f160467a;

        static {
            Covode.recordClassIndex(84157);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C71612b(C71610k kVar) {
            this.f160467a = kVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d
        /* renamed from: a */
        public final void mo77200a(View view) {
            this.f160467a.mo113346C().mo110479c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.b.a.k$c */
    public static final class C71613c extends AbstractView$OnClickListenerC81432d {

        /* renamed from: a */
        final /* synthetic */ C71610k f160468a;

        static {
            Covode.recordClassIndex(84158);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C71613c(C71610k kVar) {
            this.f160468a = kVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d
        /* renamed from: a */
        public final void mo77200a(View view) {
            this.f160468a.mo113346C().mo110480d();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.b.a.k$d */
    static final class C71614d extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C71610k f160469a;

        static {
            Covode.recordClassIndex(84159);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C71614d(C71610k kVar) {
            super(1);
            this.f160469a = kVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            View view = this.f160469a.f160461c;
            if (view == null) {
                C89219l.m154710a("ivCancel");
            }
            view.setEnabled(!booleanValue);
            View view2 = this.f160469a.f160462d;
            if (view2 == null) {
                C89219l.m154710a("ivSave");
            }
            view2.setEnabled(!booleanValue);
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final void mo22704a(Bundle bundle) {
        super.mo22704a(bundle);
        View c = mo36475c(R.id.fc8);
        C89219l.m154716b(c, "");
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) c;
        this.f160460b = simpleDraweeView;
        if (simpleDraweeView == null) {
            C89219l.m154710a("ivCover");
        }
        C70082m.m123743a(simpleDraweeView);
        View c2 = mo36475c(R.id.brw);
        C89219l.m154716b(c2, "");
        this.f160461c = c2;
        if (c2 == null) {
            C89219l.m154710a("ivCancel");
        }
        c2.setOnClickListener(new C71612b(this));
        View c3 = mo36475c(R.id.bs9);
        C89219l.m154716b(c3, "");
        this.f160462d = c3;
        if (c3 == null) {
            C89219l.m154710a("ivSave");
        }
        c3.setOnClickListener(new C71613c(this));
        AbstractC88412b unused = ((EditAdjustClipsBottomViewModel) this.f160466i.mo23374a(this, f160458a[1])).mo33677a(this, C71615l.f160470a, new C20370ah(), new C71614d(this));
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final View mo22702a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C89219l.m154721d(layoutInflater, "");
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.d0, viewGroup, false);
        C89219l.m154716b(a, "");
        return a;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C71610k(C21582f fVar, AbstractC22186b bVar) {
        super(fVar, bVar, R.id.b3l);
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(bVar, "");
    }
}
