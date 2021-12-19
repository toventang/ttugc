package com.p2082ss.android.ugc.aweme.shortvideo.editcut.p3831b.p3832a;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.AbstractC1214u;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.p1561b.C21572a;
import com.bytedance.scene.group.AbstractC22186b;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.videoeditv2.C70563d;
import com.p2082ss.android.ugc.aweme.shortvideo.editcut.AbstractC71775m;
import com.p2082ss.android.ugc.aweme.shortvideo.editcut.EditAdjustClipsBottomViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.editcut.p3830a.C71557a;
import com.p2082ss.android.ugc.aweme.shortvideo.editcut.p3830a.C71558b;
import com.p2082ss.android.ugc.aweme.themechange.base.AVDmtCheckableImageButton;
import com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d;
import com.p2082ss.android.ugc.trill.R;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.b.a.r */
public final class C71627r extends AbstractC71586a {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f160494a = {new C89232y(C71627r.class, "adjustClipsModel", "getAdjustClipsModel()Lcom/ss/android/ugc/aweme/shortvideo/editcut/model/EditAdjustClipsModel;", 0), new C89232y(C71627r.class, "editViewModel", "getEditViewModel()Lcom/ss/android/ugc/aweme/shortvideo/cut/videoedit/VideoEditViewModel;", 0), new C89232y(C71627r.class, "bottomViewModel", "getBottomViewModel()Lcom/ss/android/ugc/aweme/shortvideo/editcut/EditAdjustClipsBottomViewModel;", 0), new C89232y(C71627r.class, "editCutInternalApi", "getEditCutInternalApi()Lcom/ss/android/ugc/aweme/shortvideo/editcut/EditCutInternalApi;", 0)};

    /* renamed from: g */
    public static final C71628a f160495g = new C71628a((byte) 0);

    /* renamed from: b */
    public TextView f160496b;

    /* renamed from: c */
    public AVDmtCheckableImageButton f160497c;

    /* renamed from: d */
    public View f160498d;

    /* renamed from: e */
    public View f160499e;

    /* renamed from: f */
    public boolean f160500f;

    /* renamed from: h */
    private final String f160501h = "EditToolbarScene";

    /* renamed from: i */
    private final AbstractC89248d f160502i = C21572a.m40504a(getDiContainer(), C71557a.class);

    /* renamed from: j */
    private final AbstractC89248d f160503j = C21572a.m40504a(getDiContainer(), VideoEditViewModel.class);

    /* renamed from: k */
    private final AbstractC89248d f160504k = C21572a.m40504a(getDiContainer(), EditAdjustClipsBottomViewModel.class);

    /* renamed from: l */
    private final AbstractC89248d f160505l = C21572a.m40504a(getDiContainer(), AbstractC71775m.class);

    static {
        Covode.recordClassIndex(84172);
    }

    /* renamed from: E */
    private final EditAdjustClipsBottomViewModel m126533E() {
        return (EditAdjustClipsBottomViewModel) this.f160504k.mo23374a(this, f160494a[2]);
    }

    /* renamed from: C */
    public final C71557a mo113351C() {
        return (C71557a) this.f160502i.mo23374a(this, f160494a[0]);
    }

    /* renamed from: D */
    public final AbstractC71775m mo113352D() {
        return (AbstractC71775m) this.f160505l.mo23374a(this, f160494a[3]);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.b.a.r$a */
    public static final class C71628a {
        static {
            Covode.recordClassIndex(84173);
        }

        private C71628a() {
        }

        public /* synthetic */ C71628a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.editcut.p3831b.AbstractC71643d
    /* renamed from: a */
    public final String mo113345a() {
        return this.f160501h;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.b.a.r$g */
    public static final class C71634g extends AbstractView$OnClickListenerC81432d {

        /* renamed from: a */
        final /* synthetic */ C71627r f160511a;

        static {
            Covode.recordClassIndex(84179);
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.b.a.r$g$a */
        static final class C71635a extends AbstractC89220m implements AbstractC89171a<C89391z> {

            /* renamed from: a */
            final /* synthetic */ C71634g f160512a;

            static {
                Covode.recordClassIndex(84180);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C71635a(C71634g gVar) {
                super(0);
                this.f160512a = gVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ C89391z invoke() {
                this.f160512a.f160511a.mo113352D().mo113405t();
                return C89391z.f203057a;
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C71634g(C71627r rVar) {
            this.f160511a = rVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d
        /* renamed from: a */
        public final void mo77200a(View view) {
            C71627r rVar = this.f160511a;
            C71635a aVar = new C71635a(this);
            Activity activity = rVar.f52549m;
            if (activity != null) {
                new C17197a.C17200a(activity).mo27194b(R.string.b5o).mo27195b(R.string.d55, (DialogInterface.OnClickListener) null, false).mo27190a(R.string.b4w, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC71637i(aVar), false).mo27193a().mo27184b().show();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.b.a.r$f */
    public static final class C71633f extends AbstractView$OnClickListenerC81432d {

        /* renamed from: a */
        final /* synthetic */ C71627r f160510a;

        static {
            Covode.recordClassIndex(84178);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C71633f(C71627r rVar) {
            this.f160510a = rVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d
        /* renamed from: a */
        public final void mo77200a(View view) {
            C71627r.m126534a(this.f160510a).toggle();
            this.f160510a.mo113352D().mo113384b(C71627r.m126534a(this.f160510a).isChecked());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.b.a.r$h */
    public static final class C71636h extends AbstractView$OnClickListenerC81432d {

        /* renamed from: a */
        final /* synthetic */ C71627r f160513a;

        static {
            Covode.recordClassIndex(84181);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C71636h(C71627r rVar) {
            this.f160513a = rVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d
        /* renamed from: a */
        public final void mo77200a(View view) {
            this.f160513a.mo113352D().mo113404s();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.b.a.r$c */
    static final class C71630c extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C71627r f160507a;

        static {
            Covode.recordClassIndex(84175);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C71630c(C71627r rVar) {
            super(1);
            this.f160507a = rVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            this.f160507a.f160500f = bool.booleanValue();
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ AVDmtCheckableImageButton m126534a(C71627r rVar) {
        AVDmtCheckableImageButton aVDmtCheckableImageButton = rVar.f160497c;
        if (aVDmtCheckableImageButton == null) {
            C89219l.m154710a("ivSpeed");
        }
        return aVDmtCheckableImageButton;
    }

    /* renamed from: b */
    public static final /* synthetic */ View m126535b(C71627r rVar) {
        View view = rVar.f160499e;
        if (view == null) {
            C89219l.m154710a("ivRetake");
        }
        return view;
    }

    /* renamed from: c */
    public static final /* synthetic */ View m126536c(C71627r rVar) {
        View view = rVar.f160498d;
        if (view == null) {
            C89219l.m154710a("ivDelete");
        }
        return view;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.b.a.r$d */
    static final class C71631d extends AbstractC89220m implements AbstractC89172b<Float, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C71627r f160508a;

        static {
            Covode.recordClassIndex(84176);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C71631d(C71627r rVar) {
            super(1);
            this.f160508a = rVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Float f) {
            float floatValue = f.floatValue();
            TextView textView = this.f160508a.f160496b;
            if (textView == null) {
                C89219l.m154710a("tvSelectedTime");
            }
            Activity t = this.f160508a.mo36486t();
            C89219l.m154716b(t, "");
            textView.setText(C70563d.m124627a(t, floatValue, this.f160508a.f160500f));
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.b.a.r$e */
    static final class C71632e extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C71627r f160509a;

        static {
            Covode.recordClassIndex(84177);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C71632e(C71627r rVar) {
            super(1);
            this.f160509a = rVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            C71627r.m126534a(this.f160509a).setEnabled(!booleanValue);
            C71627r.m126536c(this.f160509a).setEnabled(!booleanValue);
            C71627r.m126535b(this.f160509a).setEnabled(!booleanValue);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.b.a.r$b */
    static final class C71629b<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C71627r f160506a;

        static {
            Covode.recordClassIndex(84174);
        }

        C71629b(C71627r rVar) {
            this.f160506a = rVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            int i;
            int i2;
            Integer num = (Integer) obj;
            View b = C71627r.m126535b(this.f160506a);
            int i3 = 0;
            if (C71558b.m126458a(this.f160506a.mo113351C()) || num == null || num.intValue() != 2) {
                i = 8;
            } else {
                i = 0;
            }
            b.setVisibility(i);
            AVDmtCheckableImageButton a = C71627r.m126534a(this.f160506a);
            if (!C71558b.m126458a(this.f160506a.mo113351C()) || ((num != null && num.intValue() == 1) || this.f160506a.f160500f)) {
                i2 = 8;
            } else {
                i2 = 0;
            }
            a.setVisibility(i2);
            View c = C71627r.m126536c(this.f160506a);
            if (num == null || num.intValue() != 2) {
                i3 = 8;
            }
            c.setVisibility(i3);
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final void mo22704a(Bundle bundle) {
        super.mo22704a(bundle);
        View c = mo36475c(R.id.f3l);
        C89219l.m154716b(c, "");
        this.f160496b = (TextView) c;
        View c2 = mo36475c(R.id.bzr);
        C89219l.m154716b(c2, "");
        this.f160497c = (AVDmtCheckableImageButton) c2;
        View c3 = mo36475c(R.id.buv);
        C89219l.m154716b(c3, "");
        this.f160498d = c3;
        View c4 = mo36475c(R.id.bz0);
        C89219l.m154716b(c4, "");
        this.f160499e = c4;
        ((VideoEditViewModel) this.f160503j.mo23374a(this, f160494a[1])).f157677b.observe(this, new C71629b(this));
        AbstractC88412b unused = m126533E().mo33677a(this, C71638s.f160515a, new C20370ah(), new C71630c(this));
        AbstractC88412b unused2 = m126533E().mo33677a(this, C71639t.f160516a, new C20370ah(), new C71631d(this));
        AbstractC88412b unused3 = m126533E().mo33677a(this, C71640u.f160517a, new C20370ah(), new C71632e(this));
        AVDmtCheckableImageButton aVDmtCheckableImageButton = this.f160497c;
        if (aVDmtCheckableImageButton == null) {
            C89219l.m154710a("ivSpeed");
        }
        aVDmtCheckableImageButton.setOnClickListener(new C71633f(this));
        View view = this.f160498d;
        if (view == null) {
            C89219l.m154710a("ivDelete");
        }
        view.setOnClickListener(new C71634g(this));
        View view2 = this.f160499e;
        if (view2 == null) {
            C89219l.m154710a("ivRetake");
        }
        view2.setOnClickListener(new C71636h(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.b.a.r$i */
    static final class DialogInterface$OnClickListenerC71637i implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f160514a;

        static {
            Covode.recordClassIndex(84182);
        }

        DialogInterface$OnClickListenerC71637i(AbstractC89171a aVar) {
            this.f160514a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f160514a.invoke();
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final View mo22702a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C89219l.m154721d(layoutInflater, "");
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.d1, viewGroup, false);
        C89219l.m154716b(a, "");
        return a;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C71627r(C21582f fVar, AbstractC22186b bVar) {
        super(fVar, bVar, R.id.b5m);
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(bVar, "");
    }
}
