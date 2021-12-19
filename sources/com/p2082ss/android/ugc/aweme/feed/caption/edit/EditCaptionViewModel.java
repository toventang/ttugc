package com.p2082ss.android.ugc.aweme.feed.caption.edit;

import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.C34480a;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.p2367b.C34485a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.caption.edit.EditCaptionViewModel */
public final class EditCaptionViewModel extends AbstractC1174ac {

    /* renamed from: a */
    public EditCaptionItem f113451a;

    /* renamed from: b */
    public List<String> f113452b = new ArrayList();

    /* renamed from: c */
    private final AbstractC89244h f113453c = C89250i.m154773a((AbstractC89171a) C49361a.f113458a);

    /* renamed from: d */
    private final AbstractC89244h f113454d = C89250i.m154773a((AbstractC89171a) C49367g.f113464a);

    /* renamed from: e */
    private final AbstractC89244h f113455e = C89250i.m154773a((AbstractC89171a) C49368h.f113465a);

    /* renamed from: f */
    private final AbstractC89244h f113456f = C89250i.m154773a((AbstractC89171a) C49366f.f113463a);

    /* renamed from: g */
    private final AbstractC89244h f113457g = C89250i.m154773a((AbstractC89171a) C49369i.f113466a);

    static {
        Covode.recordClassIndex(58167);
    }

    /* renamed from: a */
    public final C1213t<Aweme> mo80984a() {
        return (C1213t) this.f113453c.getValue();
    }

    /* renamed from: b */
    public final C1213t<String> mo80985b() {
        return (C1213t) this.f113455e.getValue();
    }

    /* renamed from: c */
    public final C1213t<Integer> mo80986c() {
        return (C1213t) this.f113456f.getValue();
    }

    /* renamed from: d */
    public final C1213t<Integer> mo80987d() {
        return (C1213t) this.f113457g.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.caption.edit.EditCaptionViewModel$a */
    static final class C49361a extends AbstractC89220m implements AbstractC89171a<C1213t<Aweme>> {

        /* renamed from: a */
        public static final C49361a f113458a = new C49361a();

        static {
            Covode.recordClassIndex(58168);
        }

        C49361a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<Aweme> invoke() {
            return new C1213t();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.caption.edit.EditCaptionViewModel$f */
    static final class C49366f extends AbstractC89220m implements AbstractC89171a<C1213t<Integer>> {

        /* renamed from: a */
        public static final C49366f f113463a = new C49366f();

        static {
            Covode.recordClassIndex(58173);
        }

        C49366f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<Integer> invoke() {
            C1213t tVar = new C1213t();
            tVar.setValue(-1);
            return tVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.caption.edit.EditCaptionViewModel$g */
    static final class C49367g extends AbstractC89220m implements AbstractC89171a<C1213t<Boolean>> {

        /* renamed from: a */
        public static final C49367g f113464a = new C49367g();

        static {
            Covode.recordClassIndex(58174);
        }

        C49367g() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<Boolean> invoke() {
            C1213t tVar = new C1213t();
            tVar.setValue(false);
            return tVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.caption.edit.EditCaptionViewModel$h */
    static final class C49368h extends AbstractC89220m implements AbstractC89171a<C1213t<String>> {

        /* renamed from: a */
        public static final C49368h f113465a = new C49368h();

        static {
            Covode.recordClassIndex(58175);
        }

        C49368h() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<String> invoke() {
            C1213t tVar = new C1213t();
            tVar.setValue("");
            return tVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.caption.edit.EditCaptionViewModel$i */
    static final class C49369i extends AbstractC89220m implements AbstractC89171a<C1213t<Integer>> {

        /* renamed from: a */
        public static final C49369i f113466a = new C49369i();

        static {
            Covode.recordClassIndex(58176);
        }

        C49369i() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<Integer> invoke() {
            C1213t tVar = new C1213t();
            tVar.setValue(-1);
            return tVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.caption.edit.EditCaptionViewModel$c */
    static final class C49363c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ EditCaptionViewModel f113460a;

        static {
            Covode.recordClassIndex(58170);
        }

        C49363c(EditCaptionViewModel editCaptionViewModel) {
            this.f113460a = editCaptionViewModel;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C89219l.m154721d(obj, "");
            this.f113460a.mo80984a().setValue(null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.caption.edit.EditCaptionViewModel$j */
    static final class C49370j<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ EditCaptionViewModel f113467a;

        /* renamed from: b */
        final /* synthetic */ String f113468b;

        static {
            Covode.recordClassIndex(58177);
        }

        C49370j(EditCaptionViewModel editCaptionViewModel, String str) {
            this.f113467a = editCaptionViewModel;
            this.f113468b = str;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Integer num;
            BaseResponse baseResponse = (BaseResponse) obj;
            C1213t<Integer> d = this.f113467a.mo80987d();
            if (baseResponse != null) {
                num = Integer.valueOf(baseResponse.status_code);
            } else {
                num = null;
            }
            d.setValue(num);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.caption.edit.EditCaptionViewModel$k */
    static final class C49371k<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ EditCaptionViewModel f113469a;

        /* renamed from: b */
        final /* synthetic */ String f113470b;

        static {
            Covode.recordClassIndex(58178);
        }

        C49371k(EditCaptionViewModel editCaptionViewModel, String str) {
            this.f113469a = editCaptionViewModel;
            this.f113470b = str;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            if (th instanceof C34485a) {
                this.f113469a.mo80987d().setValue(Integer.valueOf(((C34480a) th).getErrorCode()));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.caption.edit.EditCaptionViewModel$e */
    static final class C49365e<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ EditCaptionViewModel f113462a;

        static {
            Covode.recordClassIndex(58172);
        }

        C49365e(EditCaptionViewModel editCaptionViewModel) {
            this.f113462a = editCaptionViewModel;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            C89219l.m154721d(th, "");
            this.f113462a.mo80984a().setValue(null);
            if (th instanceof C34485a) {
                this.f113462a.mo80986c().setValue(Integer.valueOf(((C34480a) th).getErrorCode()));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.caption.edit.EditCaptionViewModel$b */
    static final class C49362b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ EditCaptionViewModel f113459a;

        static {
            Covode.recordClassIndex(58169);
        }

        C49362b(EditCaptionViewModel editCaptionViewModel) {
            this.f113459a = editCaptionViewModel;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            List<CaptionData> list;
            List<CaptionData> list2;
            Aweme aweme;
            String str;
            List<CaptionData> transSubtitle;
            EdtCaptionModel edtCaptionModel = (EdtCaptionModel) obj;
            EditCaptionViewModel editCaptionViewModel = this.f113459a;
            Integer num = null;
            if (edtCaptionModel != null) {
                list = edtCaptionModel.getTransSubtitle();
                list2 = edtCaptionModel.getSrcSubtitle();
            } else {
                list = null;
                list2 = null;
            }
            editCaptionViewModel.f113451a = new EditCaptionItem(list, list2);
            if (!(edtCaptionModel == null || (transSubtitle = edtCaptionModel.getTransSubtitle()) == null)) {
                Iterator<T> it = transSubtitle.iterator();
                while (it.hasNext()) {
                    this.f113459a.f113452b.add(it.next().getText());
                }
            }
            C1213t<Aweme> a = this.f113459a.mo80984a();
            if (edtCaptionModel != null) {
                aweme = edtCaptionModel.getAweme();
            } else {
                aweme = null;
            }
            a.setValue(aweme);
            C1213t<String> b = this.f113459a.mo80985b();
            if (edtCaptionModel != null) {
                str = edtCaptionModel.getNewSubtitleId();
            } else {
                str = null;
            }
            b.setValue(str);
            C1213t<Integer> c = this.f113459a.mo80986c();
            if (edtCaptionModel != null) {
                num = Integer.valueOf(edtCaptionModel.status_code);
            }
            c.setValue(num);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.caption.edit.EditCaptionViewModel$d */
    static final class C49364d<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ EditCaptionViewModel f113461a;

        static {
            Covode.recordClassIndex(58171);
        }

        C49364d(EditCaptionViewModel editCaptionViewModel) {
            this.f113461a = editCaptionViewModel;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            List<CaptionData> list;
            List<CaptionData> list2;
            Aweme aweme;
            List<CaptionData> transSubtitle;
            EdtCaptionModel edtCaptionModel = (EdtCaptionModel) obj;
            EditCaptionViewModel editCaptionViewModel = this.f113461a;
            Integer num = null;
            if (edtCaptionModel != null) {
                list = edtCaptionModel.getTransSubtitle();
                list2 = edtCaptionModel.getSrcSubtitle();
            } else {
                list = null;
                list2 = null;
            }
            editCaptionViewModel.f113451a = new EditCaptionItem(list, list2);
            if (!(edtCaptionModel == null || (transSubtitle = edtCaptionModel.getTransSubtitle()) == null)) {
                Iterator<T> it = transSubtitle.iterator();
                while (it.hasNext()) {
                    this.f113461a.f113452b.add(it.next().getText());
                }
            }
            C1213t<Aweme> a = this.f113461a.mo80984a();
            if (edtCaptionModel != null) {
                aweme = edtCaptionModel.getAweme();
            } else {
                aweme = null;
            }
            a.setValue(aweme);
            C1213t<Integer> c = this.f113461a.mo80986c();
            if (edtCaptionModel != null) {
                num = Integer.valueOf(edtCaptionModel.status_code);
            }
            c.setValue(num);
        }
    }
}
