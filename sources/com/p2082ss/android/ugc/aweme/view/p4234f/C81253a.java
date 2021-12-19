package com.p2082ss.android.ugc.aweme.view.p4234f;

import android.graphics.Color;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.xelement.pickview.p1392b.C19386b;
import com.bytedance.jedi.arch.AbstractC20477i;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.jedi.arch.C20531t;
import com.bytedance.jedi.arch.JediViewModel;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.common.C39076ab;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.C39164t;
import com.p2082ss.android.ugc.aweme.common.C39165u;
import com.p2082ss.android.ugc.aweme.common.C39220y;
import com.p2082ss.android.ugc.aweme.model.C60141c;
import com.p2082ss.android.ugc.aweme.model.C60157q;
import com.p2082ss.android.ugc.aweme.model.C60159r;
import com.p2082ss.android.ugc.aweme.utils.C80538hl;
import com.p2082ss.android.ugc.aweme.utils.C80558hx;
import com.p2082ss.android.ugc.aweme.view.customView.AbstractC81202b;
import com.p2082ss.android.ugc.aweme.view.customView.C81200a;
import com.p2082ss.android.ugc.aweme.view.customView.NaviGLSurfaceView;
import com.p2082ss.android.ugc.aweme.view.p4234f.C81267f;
import com.p2082ss.android.ugc.aweme.viewModel.ProfileNaviCreatorState;
import com.p2082ss.android.ugc.aweme.viewModel.ProfileNaviCreatorViewModel;
import com.p2082ss.android.ugc.aweme.viewModel.ProfileNaviEditorState;
import com.p2082ss.android.ugc.trill.R;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.view.f.a */
public final class C81253a extends AbstractC81202b implements C81267f.AbstractC81268a {

    /* renamed from: d */
    public static final C81254a f181559d = new C81254a((byte) 0);

    /* renamed from: b */
    public String f181560b = "avatar_hub";

    /* renamed from: c */
    public boolean f181561c;

    /* renamed from: e */
    private final String f181562e = "ImageEditorContainer";

    /* renamed from: f */
    private final AbstractC89244h f181563f = C89250i.m154773a((AbstractC89171a) new C81255b(this));

    /* renamed from: g */
    private SparseArray f181564g;

    static {
        Covode.recordClassIndex(94583);
    }

    @Override // com.p2082ss.android.ugc.aweme.view.customView.AbstractC81202b
    /* renamed from: a */
    public final View mo124616a(int i) {
        if (this.f181564g == null) {
            this.f181564g = new SparseArray();
        }
        View view = (View) this.f181564g.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f181564g.put(i, findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.view.customView.AbstractC81202b
    /* renamed from: b */
    public final int mo124617b() {
        return R.layout.aoz;
    }

    @Override // com.p2082ss.android.ugc.aweme.view.customView.AbstractC81202b
    /* renamed from: d */
    public final boolean mo124690d() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.view.customView.AbstractC81202b
    /* renamed from: j */
    public final void mo124621j() {
        SparseArray sparseArray = this.f181564g;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    /* renamed from: k */
    public final ProfileNaviCreatorViewModel mo124743k() {
        return (ProfileNaviCreatorViewModel) this.f181563f.getValue();
    }

    @Override // androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.view.customView.AbstractC81202b
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo124621j();
    }

    /* renamed from: com.ss.android.ugc.aweme.view.f.a$a */
    public static final class C81254a {
        static {
            Covode.recordClassIndex(94584);
        }

        private C81254a() {
        }

        public /* synthetic */ C81254a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C81253a m141011a(String str) {
            C89219l.m154721d(str, "");
            C81253a aVar = new C81253a();
            aVar.f181560b = str;
            return aVar;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.view.p4234f.C81267f.AbstractC81268a
    /* renamed from: p */
    public final void mo124748p() {
        mo124745m();
    }

    @Override // com.p2082ss.android.ugc.aweme.view.customView.AbstractC81202b
    /* renamed from: e */
    public final NaviGLSurfaceView mo124619e() {
        return (NaviGLSurfaceView) mo124616a(R.id.d8o);
    }

    @Override // com.p2082ss.android.ugc.aweme.view.p4234f.C81267f.AbstractC81268a
    /* renamed from: n */
    public final void mo124746n() {
        NaviGLSurfaceView e = mo124619e();
        if (e != null) {
            e.setVisibility(0);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.view.p4234f.C81267f.AbstractC81268a
    /* renamed from: o */
    public final void mo124747o() {
        NaviGLSurfaceView e = mo124619e();
        if (e != null) {
            e.setVisibility(4);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.view.f.a$b */
    static final class C81255b extends AbstractC89220m implements AbstractC89171a<ProfileNaviCreatorViewModel> {

        /* renamed from: a */
        final /* synthetic */ C81253a f181565a;

        static {
            Covode.recordClassIndex(94585);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C81255b(C81253a aVar) {
            super(0);
            this.f181565a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ProfileNaviCreatorViewModel invoke() {
            JediViewModel a = C20531t.m38716a(this.f181565a.requireActivity()).mo33800a(ProfileNaviCreatorViewModel.class);
            C89219l.m154716b(a, "");
            return a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.view.customView.AbstractC81202b
    /* renamed from: c */
    public final void mo124618c() {
        AbstractC0952i supportFragmentManager;
        mo124742b(null);
        ActivityC0945e activity = getActivity();
        if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null) {
            new C81267f(this.f181560b, this).show(supportFragmentManager, this.f181562e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.view.f.a$g */
    public static final class C81261g extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C81253a f181571a;

        /* renamed from: b */
        final /* synthetic */ File f181572b;

        static {
            Covode.recordClassIndex(94591);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C81261g(C81253a aVar, File file) {
            super(0);
            this.f181571a = aVar;
            this.f181572b = file;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            ProfileNaviCreatorViewModel k = this.f181571a.mo124743k();
            File file = this.f181572b;
            C89219l.m154721d(file, "");
            C60159r.f137141d = new C60141c(file);
            C60157q qVar = C60159r.f137138a;
            if (qVar != null) {
                ProfileNaviCreatorViewModel.C81300a.m141044a(file, new ProfileNaviCreatorViewModel.C81315o(new UrlModel(), qVar));
                k.mo124802j();
                if (((ProfileNaviCreatorState) k.aB_()).getShouldSetAsProfileImage()) {
                    ProfileNaviCreatorViewModel.m141034i();
                }
                k.mo33690d(ProfileNaviCreatorViewModel.C81314n.f181652a);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.view.f.a$h */
    static final class RunnableC81262h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C81253a f181573a;

        static {
            Covode.recordClassIndex(94592);
        }

        RunnableC81262h(C81253a aVar) {
            this.f181573a = aVar;
        }

        public final void run() {
            C81200a naviManager;
            NaviGLSurfaceView e = this.f181573a.mo124619e();
            if (e != null && (naviManager = e.getNaviManager()) != null) {
                naviManager.f181457a.lock();
                naviManager.f181476t = true;
                naviManager.f181479w = new ArrayList();
                naviManager.f181457a.unlock();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.view.customView.AbstractC81202b
    /* renamed from: g */
    public final void mo124620g() {
        super.mo124620g();
        AbstractC88412b unused = selectSubscribe(mo124743k(), C81263b.f181574a, new C20370ah(), new C81256c(this));
        AbstractC88412b unused2 = selectSubscribe(mo124743k(), C81264c.f181575a, new C20370ah(), new C81257d(this));
        AbstractC88412b unused3 = selectSubscribe(mo124687a(), C81265d.f181576a, new C20370ah(), new C81259e(this));
        AbstractC88412b unused4 = selectSubscribe(mo124687a(), C81266e.f181577a, new C20370ah(), new C81260f(this));
    }

    /* renamed from: l */
    public final void mo124744l() {
        C81200a naviManager;
        C39220y a = C39220y.C39221a.m79573a(C39076ab.f92275a, 1, 66667);
        mo124742b(((ProfileNaviCreatorState) mo124743k().mo33676a(this)).getProfileImageBackgroundColor());
        NaviGLSurfaceView e = mo124619e();
        if (e != null && (naviManager = e.getNaviManager()) != null) {
            naviManager.mo124677a(a.f92641a, a.f92643c, a.f92643c, a.f92642b);
        }
    }

    /* renamed from: m */
    public final void mo124745m() {
        C81200a naviManager;
        NaviGLSurfaceView e;
        C81200a naviManager2;
        MethodCollector.m26663i(5188);
        mo124692h();
        NaviGLSurfaceView e2 = mo124619e();
        if (e2 == null || (naviManager = e2.getNaviManager()) == null) {
            MethodCollector.m26664o(5188);
            return;
        }
        if (!(!naviManager.f181476t || (e = mo124619e()) == null || (naviManager2 = e.getNaviManager()) == null)) {
            naviManager2.f181457a.lock();
            naviManager2.f181476t = false;
            List<ByteArrayOutputStream> list = naviManager2.f181479w;
            naviManager2.f181479w = null;
            naviManager2.f181457a.unlock();
            if (list != null) {
                try {
                    if (list.size() < 40) {
                        mo124743k().mo124801h();
                        MethodCollector.m26664o(5188);
                        return;
                    }
                    int i = naviManager.f181474r;
                    File a = C39165u.m79472a(getContext(), C39165u.EnumC39166a.WEBP);
                    if (a == null) {
                        MethodCollector.m26664o(5188);
                        return;
                    }
                    FileOutputStream fileOutputStream = new FileOutputStream(a);
                    C39164t tVar = new C39164t(fileOutputStream, naviManager.f181477u, naviManager.f181478v);
                    tVar.f92376a = i;
                    tVar.mo67945a(new byte[]{82, 73, 70, 70}, 4);
                    tVar.mo67946b(0);
                    tVar.mo67945a(new byte[]{87, 69, 66, 80}, 4);
                    tVar.mo67945a(new byte[]{86, 80, 56, 88}, 4);
                    tVar.mo67946b(10);
                    BitSet bitSet = new BitSet(8);
                    bitSet.set(0, false);
                    bitSet.set(1, true);
                    bitSet.set(2, false);
                    bitSet.set(3, false);
                    bitSet.set(4, true);
                    byte[] byteArray = bitSet.toByteArray();
                    C89219l.m154716b(byteArray, "");
                    tVar.mo67945a(byteArray, byteArray.length);
                    tVar.mo67943a(0);
                    tVar.mo67943a(tVar.f92379d - 1);
                    tVar.mo67943a(tVar.f92380e - 1);
                    tVar.mo67945a(new byte[]{65, 78, 73, 77}, 4);
                    tVar.mo67946b(6);
                    tVar.mo67946b(0);
                    byte[] array = ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(tVar.f92377b).array();
                    C89219l.m154716b(array, "");
                    tVar.mo67945a(array, 2);
                    for (ByteArrayOutputStream byteArrayOutputStream : list) {
                        byte[] byteArray2 = byteArrayOutputStream.toByteArray();
                        C89219l.m154716b(byteArray2, "");
                        tVar.mo67944a(byteArray2);
                        byteArrayOutputStream.close();
                    }
                    long position = tVar.f92378c.getChannel().position();
                    tVar.f92378c.getChannel().position(4L);
                    tVar.mo67946b(((int) position) - 8);
                    fileOutputStream.close();
                    C80558hx.m139642a(0, new C81261g(this, a));
                    mo124743k().mo124801h();
                    MethodCollector.m26664o(5188);
                    return;
                } catch (FileNotFoundException e3) {
                    mo124743k().mo124801h();
                    e3.printStackTrace();
                    MethodCollector.m26664o(5188);
                    return;
                } catch (IOException e4) {
                    mo124743k().mo124801h();
                    e4.printStackTrace();
                    MethodCollector.m26664o(5188);
                    return;
                }
            }
        }
        mo124743k().mo124801h();
        MethodCollector.m26664o(5188);
    }

    /* renamed from: b */
    public final void mo124742b(String str) {
        try {
            NaviGLSurfaceView e = mo124619e();
            if (!C80538hl.m139614a(str)) {
                mo124743k();
                C60157q qVar = C60159r.f137138a;
                if (qVar != null) {
                    str = qVar.f137133b;
                } else {
                    str = null;
                }
            }
            int parseColor = Color.parseColor(str);
            if (e != null) {
                C81200a naviManager = e.getNaviManager();
                if (naviManager != null) {
                    naviManager.f181467k = ((float) Color.red(parseColor)) / 256.0f;
                }
                C81200a naviManager2 = e.getNaviManager();
                if (naviManager2 != null) {
                    naviManager2.f181469m = ((float) Color.blue(parseColor)) / 256.0f;
                }
                C81200a naviManager3 = e.getNaviManager();
                if (naviManager3 != null) {
                    naviManager3.f181468l = ((float) Color.green(parseColor)) / 256.0f;
                }
                C81200a naviManager4 = e.getNaviManager();
                if (naviManager4 != null) {
                    naviManager4.f181470n = 1.0f;
                }
            }
        } catch (Exception e2) {
            e2.getMessage();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.view.f.a$c */
    static final class C81256c extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, String, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C81253a f181566a;

        static {
            Covode.recordClassIndex(94586);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C81256c(C81253a aVar) {
            super(2);
            this.f181566a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, String str) {
            String str2 = str;
            C89219l.m154721d(iVar, "");
            if (str2 != null) {
                String str3 = this.f181566a.f181560b;
                C89219l.m154721d(str2, "");
                C89219l.m154721d(str3, "");
                C39162r.m79460a("edit_set_avatar_profile", new C33744d().mo59983a("item_tab", "background").mo59983a(C19386b.f45894a, str2).mo59983a("enter_from", str3).f79943a);
                this.f181566a.mo124742b(str2);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.view.f.a$d */
    static final class C81257d extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C81253a f181567a;

        static {
            Covode.recordClassIndex(94587);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C81257d(C81253a aVar) {
            super(2);
            this.f181567a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Boolean bool) {
            AbstractC20477i iVar2 = iVar;
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(iVar2, "");
            if (booleanValue) {
                if (((ProfileNaviEditorState) this.f181567a.mo124687a().mo33676a(iVar2)).getNaviDoneLoading()) {
                    this.f181567a.mo124744l();
                } else {
                    this.f181567a.f181561c = true;
                    this.f181567a.mo124688a(new Runnable(this) {
                        /* class com.p2082ss.android.ugc.aweme.view.p4234f.C81253a.C81257d.RunnableC812581 */

                        /* renamed from: a */
                        final /* synthetic */ C81257d f181568a;

                        static {
                            Covode.recordClassIndex(94588);
                        }

                        {
                            this.f181568a = r1;
                        }

                        public final void run() {
                            this.f181568a.f181567a.mo124744l();
                        }
                    }, 3000);
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.view.f.a$e */
    static final class C81259e extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C81253a f181569a;

        static {
            Covode.recordClassIndex(94589);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C81259e(C81253a aVar) {
            super(2);
            this.f181569a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Boolean bool) {
            C81200a naviManager;
            NaviGLSurfaceView e;
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(iVar, "");
            if (booleanValue) {
                C81253a aVar = this.f181569a;
                aVar.mo124692h();
                NaviGLSurfaceView e2 = aVar.mo124619e();
                if (!(e2 == null || (naviManager = e2.getNaviManager()) == null || naviManager.f181476t || (e = aVar.mo124619e()) == null)) {
                    e.queueEvent(new RunnableC81262h(aVar));
                }
            } else {
                this.f181569a.mo124745m();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.view.f.a$f */
    static final class C81260f extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C81253a f181570a;

        static {
            Covode.recordClassIndex(94590);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C81260f(C81253a aVar) {
            super(2);
            this.f181570a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(iVar, "");
            if (booleanValue && this.f181570a.f181561c) {
                this.f181570a.f181561c = false;
                this.f181570a.mo124692h();
                this.f181570a.mo124744l();
            }
            return C89391z.f203057a;
        }
    }

    @Override // androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.view.customView.AbstractC81202b
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        String str = this.f181560b;
        C89219l.m154721d(str, "");
        C39162r.m79460a("show_set_avatar_profile", new C33744d().mo59983a("enter_from", str).f79943a);
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }
}
